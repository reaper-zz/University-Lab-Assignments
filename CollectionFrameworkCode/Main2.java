package CollectionFrameworkCode;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static String findEmployeeDesignation(String name, Map<String, Integer> nameToId,
                                                    Map<Integer, String> idToDesignation) {
        
                Integer employeeId = nameToId.get(name);
        if (employeeId != null) {
            return idToDesignation.getOrDefault(employeeId, "Designation not found");
        }
        return "Employee not found";
    }

    public static void main(String[] args) {

        Map<String, Integer> nameToId = new HashMap<>();
        nameToId.put("J", 1);
        nameToId.put("D", 2);

        Map<Integer, String> idToDesignation = new HashMap<>();
        idToDesignation.put(1, " Software Engineer");

        System.out.println("J" + findEmployeeDesignation("J", nameToId, idToDesignation));

    }
}
