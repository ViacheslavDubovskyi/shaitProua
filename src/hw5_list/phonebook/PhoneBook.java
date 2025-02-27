package hw5_list.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String targetName) {
        for (Record record : records) {
            if (record.getName().equals(targetName)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String targetName) {
        List<Record> result = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(targetName)) {
                result.add(record);
            }
        }
        if (!result.isEmpty()) {
            return result;
        }
        return null;
    }
}


