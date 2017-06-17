package com.example.TestApp;


import com.example.TestApp.domain.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 17.06.2017.
 */

@RestController
@RequestMapping("/value")
public class DataRestController {
    private static final int ID = 1;

    @Autowired
    private DataController dataController;

    @RequestMapping(method = RequestMethod.GET)
    public int getValue() {
        Data data = dataController.getDataById(ID);
        return data.getValue();
    }

    @RequestMapping(method = RequestMethod.POST)
    public int incValue() {
        Data data = dataController.getDataById(ID);
        int newValue = data.getValue() + 1;
        data.setValue(newValue);
        dataController.saveData(data);

        return data.getValue();
    }

    @RequestMapping(value = "{req-method}", method = RequestMethod.GET)
    public int decValueAlt() {
        return decValue();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public int decValue() {
        Data data = dataController.getDataById(ID);
        int newValue = data.getValue() - 1;
        data.setValue(newValue);
        dataController.saveData(data);

        return data.getValue();
    }
}
