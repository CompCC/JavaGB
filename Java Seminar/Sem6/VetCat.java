// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники

import java.time.LocalDate;

public class VetCat {
    private String name;
    private String breed;
    private String color;
    private String ownerName;
    private LocalDate dateOfBrith;
    private String phone;
    // private List<Diagnosis> diagnosis;
    private char sex; // M,F
    
    
    public VetCat(String name, String breed, String color, String ownerName, LocalDate dateOfBrith, String phone,
            char sex) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.ownerName = ownerName;
        this.dateOfBrith = dateOfBrith;
        this.phone = phone;
        this.sex = sex;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name == null){
            throw new IllegalStateException("Имя не может быть null");
        }
        this.name = name;
    }


    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getOwnerName() {
        return ownerName;
    }


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }


    public void setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public char getSex() {
        return sex;
    }


    public void setSex(char sex) {
        this.sex = sex;
    }


    @Override
    public String toString() {
        return "VetCat [name=" + name + ", breed=" + breed + ", color=" + color + ", ownerName=" + ownerName
                + ", dateOfBrith=" + dateOfBrith + ", phone=" + phone + ", sex=" + sex + "]";
    }

    
}
