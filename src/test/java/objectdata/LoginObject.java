package objectdata;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginObject extends GeneralObject{
    private String email;
    private String password;

    public LoginObject(String filepath) {
        fromJsonToObject(filepath);
    }
  }
