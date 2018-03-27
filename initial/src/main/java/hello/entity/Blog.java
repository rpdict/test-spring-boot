package hello.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author zhaoruipeng
 * @ClassName Blog
 * @Package hello
 * @Description TODO(干啥了)
 * @date 2018/3/23 14:40
 */

@Data
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;
    private Integer uid;
    private String title;
    private String content;

}
