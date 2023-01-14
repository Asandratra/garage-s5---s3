import java.util.ArrayList;

import dao.*;
import model.SpecialiteModel;
import service.GenreService;
import service.SpecialiteService;

public class Main {
 public static void main(String[] args) {
    SpecialiteModel spec = new SpecialiteModel();
    SpecialiteService service = new SpecialiteService();
    ArrayList test = service.getAll();
    System.out.println(test.size());
    for (int i = 0; i < test.size(); i++) {
        System.out.println(test.get(i));
    }

 }   
}
