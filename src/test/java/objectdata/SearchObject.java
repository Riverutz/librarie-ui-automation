package objectdata;

import java.util.List;

public class SearchObject extends GeneralObject {
    private List<String> searchQueries;

    public SearchObject(String filepath) {
        fromJsonToObject(filepath);
    }

    public List<String> getSearchQueries() {
        return searchQueries;
    }

    public void setSearchQueries(List<String> searchQueries) {
        this.searchQueries = searchQueries;
    }
}



