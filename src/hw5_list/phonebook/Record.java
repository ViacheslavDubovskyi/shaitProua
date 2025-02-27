package hw5_list.phonebook;

public class Record {

    private String name;
    private Long phoneNumber;

    public Record(String name, Long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Long getPhone() {
        return phoneNumber;
    }

    public void setPhone(Long phone) {
        this.phoneNumber = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
