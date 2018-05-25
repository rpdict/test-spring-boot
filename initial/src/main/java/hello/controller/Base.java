package hello.controller;

import lombok.NoArgsConstructor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@NoArgsConstructor
public class Base {

    /**
     * @Fields jsonString : TODO(通用json字符串)
     */
    public String jsonString;

    /**
     * @Fields SUCCESS_JSON : TODO(ajax 成功返回值)
     */
	public static final String SUCCESS_JSON = "{\"result\":\"success\"}";

    /**
     * @Fields ERROR_JSON : TODO(ajax 失败返回值)
     */
    public static final String ERROR_JSON = "{\"result\":\"error\",\"msg\":\"操作失败！\"}";

    /**
     * @Fields TIMEOUT : TODO(SESSION过期)
     */
    public static final String TIMEOUT = "sessionTimeOut";

    /**
     * @Fields LOGIN : TODO(返回登录页)
     */
    public static final String LOGIN = "login";

    /**
     * @Fields _404 : TODO(404  返回值)
     */
    public static final String _404 = "_404";

    /**
     * @Fields _505 : TODO(505 返回值)
     */
    public static final String _505 = "_505";

}
