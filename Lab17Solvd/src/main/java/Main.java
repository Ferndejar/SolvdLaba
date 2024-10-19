import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        objectMapper.setDateFormat(df);

        //Write to json file
        Person person = new Person("Larry","Jackson",27,new Date(),new Car("Audi","A4"),new Animal("Dog","Brandon"),new Contact("Sesame 55","New York","234234123"),
        new Job("Journalist"), new Salary("7000"));


        objectMapper.writeValue(new File("larry.json"), person);

        //Read  from json file

        //List<Person> studentFromJson = objectMapper.readValue(new File("larry.json"), new TypeReference<List<Person>>(){});
        Map<String, Object> studentFromJson
                = objectMapper.readValue(new File("larry.json"), new TypeReference<Map<String,Object>>(){});
        System.out.println(studentFromJson);
    }
}
