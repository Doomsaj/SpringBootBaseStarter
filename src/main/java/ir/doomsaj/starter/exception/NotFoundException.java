package ir.doomsaj.starter.exception;

public class NotFoundException extends Exception{
    public NotFoundException() {
        super("requested resource not found");
    }
}
