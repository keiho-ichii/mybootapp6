package jp.te4a.spring.boot.myapp8.mybootapp8;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;


@Repository
public class BookRepository {

    private final ConcurrentMap<Integer,BookBean>bookMap
                                  =new ConcurrentHashMap<>();
    private int BOOK_ID = 1;
    public int getBookid() {
        return BOOK_ID++;
    }                     
public BookBean update(BookBean updateBookBean){
    BookBean bookBean = bookMap.get(updateBookBean.getId());
    BeanUtils.copyProperties(updateBookBean, bookBean);
    return bookBean;
 }

public void delete(Integer bookId) {
    bookMap.remove(bookId);
 }

public List<BookBean>findAll() {
    return new ArrayList<>(bookMap.values());
 }
public BookBean findOne(Integer id) {
    return bookMap.get(id);
 }
}