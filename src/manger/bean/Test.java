package manger.bean;

public class Test {
    public Test(String message){
       this.message=message;
    }
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
