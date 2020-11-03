package ru.geekbrains.Lesson;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException() {
        super();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
