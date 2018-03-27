package hello.entity;

/**
 * @author zhaoruipeng
 * @ClassName Greeting
 * @Package hello
 * @Description TODO(干啥了)
 * @date 2018/2/27 15:23
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
