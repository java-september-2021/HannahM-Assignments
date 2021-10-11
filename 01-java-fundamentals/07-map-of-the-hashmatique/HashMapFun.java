import java.util.Set;
import java.util.HashMap;

public class HashMapFun {
    public static void main(String[] args) {
        /* -------------------------------------------------------------------------- */
        /*                             Create a Track List                            */
        /* -------------------------------------------------------------------------- */
        HashMap<String, String> userMap = new HashMap<String,String>();
        /* -------------------------------------------------------------------------- */
        /*                              Create four songs                             */
        /* -------------------------------------------------------------------------- */
        userMap.put("SongTitle1", "Lyrics for song 1");
        userMap.put("SongTitle2", "Lyrics for song 2");
        userMap.put("SongTitle3", "Lyrics for song 3");
        userMap.put("SongTitle4", "Lyrics for song 4");
        /* -------------------------------------------------------------------------- */
        /*                                  Pull One                                  */
        /* -------------------------------------------------------------------------- */
        String track = userMap.get("SongTitle3");
        System.out.println("SongTitle3 : " + track);
        /* -------------------------------------------------------------------------- */
        /*                                  Pull All                                  */
        /* -------------------------------------------------------------------------- */
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key + " : " + userMap.get(key)); 
        }

    }

}