package com.example.TestApp;

import com.example.TestApp.domain.Data;
import com.example.TestApp.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Admin on 17.06.2017.
 */

@Component
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    public void showData() {
        System.out.println("================================================");

        for (Data data : dataRepository.findAll()) {
            System.out.println(data);
        }

        System.out.println("*********************************************************");
    }

    public Data getDataById(long id) {
        Data result = dataRepository.findOne(id);
        return result;
    }

    public void setDataValue(long id, int newValue) {
        Data data = dataRepository.findOne(id);
        data.setValue(newValue);
        dataRepository.save(data);
    }

    public void saveData(Data data) {
        dataRepository.save(data);
    }
}
