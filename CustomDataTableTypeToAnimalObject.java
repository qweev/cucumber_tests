package wojtek.com.models;

import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTableTypeToAnimalObject {

    @DataTableType
    public Animal convertToAnimal(Map<String, String> entry) {
        return new Animal(
                entry.get("name"),
                entry.get("surname"),
                entry.get("comment"),
                entry.get("anything")
        );
    }
}
