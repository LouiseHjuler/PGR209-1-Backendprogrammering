import org.example.Words;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    public ArrayList<String> dictionaryArray = new ArrayList<String>(Arrays.asList("atom", "bomb" , "meals" , "males" , "saint" , "satin" , "avenge" , "Geneva" , "meals" , "Salem" , "sales" , "seals" , "balm" , "lamb" , "mean" , "mane" , "salts" , "lasts" , "blot" , "bolt" , "melon" , "lemon" , "salvages" , "blow" , "bowl" , "moist" , "omits" , "sharp" , "harps" , "brag" , "grab" , "more" , "Rome" , "shrub" , "brush" , "chum" , "much" , "needs" , "dense" , "siren" , "rinse" , "coal" , "cola" , "nerved" , "Denver" , "skids" , "disks" , "counts" , "Tucson" , "none" , "neon" , "skill" , "kills" , "diagnose" , "nude" , "dune" , "snail" , "nails" , "diary" , "dairy" , "ocean" , "canoe" , "sober" , "robes" , "domains" , "Madison" , "pace" , "cape" , "soils" , "oils" , "dottier" , "Detroit" , "pairs" , "Paris" , "solo" , "Oslo" , "fired" , "fried" , "pale" , "leap" , "spray" , "prays" , "fringe" , "finger" , "panels" , "Naples" , "stack" , "tacks" , "hasten" , "Athens" , "parks" , "spark" , "stick" , "ticks" , "iced" , "dice" , "pools" , "spool" , "strip" , "trips" , "inch" , "chin" , "ports" , "sport" , "study" , "dusty" , "keen" , "knee" , "posts" , "stops" , "team" , "meat" , "lamp" , "palm" , "races" , "cares" , "tooled" , "Toledo" , "last" , "salt" , "reap" , "pear" , "votes" , "stove" , "limped" , "dimple" , "reef" , "free" , "waits" , "waist" , "lion" , "loin" , "robed" , "bored" , "wasps" , "swaps" , "looted" , "Toledo" , "rock" , "cork" , "wells" , "swell" , "lump" , "plum" , "room" , "moor" , "west" , "stew" , "march" , "charm" , "ropes" , "pores" , "what" , "thaw" , "mash" , "hams"));

    @Test
    public void testFindAnagram(){
        Words anagramChecker = new Words();
        var anagrams = anagramChecker.findAnagrams("meals", dictionaryArray);
        assertEquals(1, anagrams.size());
    }
}