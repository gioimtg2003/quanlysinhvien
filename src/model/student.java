package model;

public class student extends person {
    private String studentId;
    private String className;
    private String address;
    private String phoneNumber;
    private String Khoa;

    public student(String name, String birthDay, String gtinh, String address, String studentId, String className,
            String Khoa, String phoneNumber) {
        super(name, birthDay, gtinh);
        this.address = address;
        this.studentId = studentId;
        this.className = className;
        this.Khoa = Khoa;
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }

    public String getKhoa() {
        return this.Khoa;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    public String[] getInfoStudent() {
        return null;
    }
}
