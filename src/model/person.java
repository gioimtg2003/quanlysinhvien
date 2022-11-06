package model;

public abstract class person {
    private String name;
    private String birthDay;
    private String gtinh;
    public person(String name, String birthDay, String gtinh){
        this.name = name;
        this.birthDay = birthDay;
        this.gtinh = gtinh;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }
    public String getBirthDay(){
        return this.birthDay;
    }
    public void setGtinh(String gtinh){
        this.gtinh = gtinh;
    }
    public String getGtinh(){
        return this.gtinh;
    }
}   
