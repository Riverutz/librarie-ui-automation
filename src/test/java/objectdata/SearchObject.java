package objectdata;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchObject extends GeneralObject {
    private List<String> searchQueries;

    public SearchObject(String filepath) {
        fromJsonToObject(filepath);
    }
}



