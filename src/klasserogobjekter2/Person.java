package klasserogobjekter2;

import javax.swing.*;

public class Person {
    private String firstname;
    private String lastname;
    private String adress;
    private String phone;

    public Person(String fornavn, String lastname, String adress, String telefonnr) {
        this.firstname = fornavn;
        this.lastname = lastname;
        this.adress = adress;
        this.phone = telefonnr;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setEtternavn(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = this.adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void toSwing(){
        JOptionPane.showMessageDialog(null, "Name: " + firstname + " " + lastname + "\n adress: " +adress + "\n phone: " + getPhone());
    }
}
