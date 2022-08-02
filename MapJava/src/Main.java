import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"Zero");
        map.put(1,"One");
        map.put(2,"Two");
        System.out.println(map);


        String element1 = map.get(1);
        System.out.println(element1);


        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(33,"One");
        treeMap.put(21,"Zero");
        treeMap.put(2,"Two");
        System.out.println("TreeMap ");
        System.out.println("\n"+treeMap);
        System.out.println(map.containsKey(2));
        System.out.println(map.isEmpty());
        System.out.println(map.remove(0));
        
        final Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println();
        for (Map.Entry<Integer, String> entry : entries
        ){
            System.out.println("Key: "+entry.getKey()+" Value: "+ entry.getValue());
        }
        System.out.println();

        final Set<Integer> keys = map.keySet();
        for(Integer k : keys)
        {
            System.out.println(k);
        }


        System.out.println("\n Ennum: ");
        Map<DayOfWeek, String> dayOfWeekActivityMap = new EnumMap<DayOfWeek, String>(DayOfWeek.class);
        dayOfWeekActivityMap.put(DayOfWeek.MONDAY, "Work Hard");
        dayOfWeekActivityMap.put(DayOfWeek.TUESDAY, "Work Hard");
        dayOfWeekActivityMap.put(DayOfWeek.WEDNESDAY, "Medium Work");
        dayOfWeekActivityMap.put(DayOfWeek.THURSDAY, "Chill");
        dayOfWeekActivityMap.put(DayOfWeek.FRIDAY, "Party");
        dayOfWeekActivityMap.put(DayOfWeek.SATURDAY, "Party");
        dayOfWeekActivityMap.put(DayOfWeek.SUNDAY, "Hangover");

        final Set<Map.Entry<DayOfWeek, String>> days = dayOfWeekActivityMap.entrySet();

        for (Map.Entry<DayOfWeek, String> e :
                days) {
            System.out.println("Day: "+ e.getKey() +" Activity: " + e.getValue());
        }

        System.out.println("\n LinkedHashMap: ");
        Map<Integer,String> mapLinked = new LinkedHashMap<>();
        mapLinked.put(0, "Jeden");
        mapLinked.put(2, "Osiem");
        mapLinked.put(1, "Siedem");

        System.out.println(mapLinked);

        System.out.println("\n Stream interation: ");

        dayOfWeekActivityMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().isWorkingDay())
                .forEach(entry -> System.out.println("Key: "+entry.getKey() +" Value: " +  entry.getValue()));





    }
}