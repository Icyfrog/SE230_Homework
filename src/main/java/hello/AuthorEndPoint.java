package hello;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

import java.util.LinkedHashMap;
import java.util.Map;


@Endpoint(id="author")
public class AuthorEndPoint {
    @ReadOperation

    public Map<String, String> hello() {
        Map<String, String> result = new LinkedHashMap<>();
        result.put("Outline","This is a user-defined endpoint");
        result.put("author", "Icyfrog");
        result.put("email", "sjtu-yqc@sjtu.edu.cn");
        return result;
    }
}
