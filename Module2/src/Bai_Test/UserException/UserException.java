package Bai_Test.UserException;

public class UserException extends Exception {

    private String massageUser;

    public UserException(String massageUser) {
        super(massageUser);
        this.massageUser = massageUser;
    }

    @Override
    public String getMessage() {
        return this.massageUser;
    }
}
