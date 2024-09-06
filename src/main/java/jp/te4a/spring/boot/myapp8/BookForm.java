package jp.te4a.spring.boot.myapp8;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookForm {
    private Integer id;
    private String title;
    private String writter;
    private String publiher;
    private Integer price;
}