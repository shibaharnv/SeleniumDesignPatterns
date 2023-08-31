package org.test.dataload;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class DataReaderClass {


    public List<HashMap<String, String>> getJsonData(String jsonPath) throws IOException {
    //Convert json file to Json String
        File file= new File(jsonPath);
        String jsonContent=FileUtils.readFileToString(file, StandardCharsets.UTF_8);


        //Object mapper will map the input object to required data type
        ObjectMapper objectMapper= new ObjectMapper();
        List<HashMap<String,String>> data=objectMapper.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>(){});

        return data;
    }
}
