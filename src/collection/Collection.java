package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 * Collection which stores images from 
 * Image class.
 * Uses Hashmap to store images and TreeSet to
 * add only unique pictures.
 * @author Александр
 */
public class Collection {

    Iterator<Map.Entry<String, Image>> i;
    public Map<String, Image> hashmap;
    TreeSet a = new TreeSet();

    public Map<String, Image> getHashmap() {
        return this.hashmap;
    }

    public Collection() {
        this.hashmap = new HashMap<>(5);
    }

    /**
     * @param img add when the name is unique
     */
    public void addToCollection(Image img) {
       if(a.add(img.getName())){
           this.hashmap.put(img.getName(), img);
       }
       else {
           System.out.println("Already excists");
       }
        
    }
/**
 * show all pictures
 */
    public void getPictures() {
        i = this.getHashmap().entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry pair = (Map.Entry) i.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());

        }
    }
    /**
     * @param st gets picture by its name
     */

    public void getByName(String st) {
        i = this.getHashmap().entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry pair = (Map.Entry) i.next();
            if (pair.getKey().equals(st)) {
                System.out.println("Image found:" + st);
                System.out.println(pair.getValue());
                return;
            }

        }
        System.out.println("Image:" + st + ".Not found");
    }

    public static void main(String[] args) {
        Image imagONE = new Image("acer", 2, 4, 123);
        Image imagTWO = new Image("acert", 2, 4, 123);
        Image imagTHREE = new Image("acer", 2, 4, 123);

        Collection collect = new Collection();
        collect.addToCollection(imagONE);
        collect.addToCollection(imagTWO);
        collect.addToCollection(imagTHREE);
        collect.getPictures();
        collect.getByName("acer");
        collect.addToCollection(imagONE);

    }

}
