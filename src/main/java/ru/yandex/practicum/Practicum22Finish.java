package ru.yandex.practicum;

public class Practicum22Finish {
    // Дополните базовый класс для всех правил валидации

}
abstract class ValidationRule <T> {
    protected final T value;
    private final String errorMessage;

    protected ValidationRule(T value, String errorMessage) {
        this.value = value;
        this.errorMessage = errorMessage;
    }

    public abstract boolean isValid();

    public String getErrorMessage() {
        return errorMessage;
    }
}
class AgeValidationRule extends ValidationRule <Byte> {

    public AgeValidationRule(Byte age) {
        super(age, "Возраст для подачи на ипотеку должен быть старше 18 лет");
    }

    @Override
    public boolean isValid() {
        return value >= 18;
    }

}
class BoundedBox<T extends Number> {
    public T number; // Переменная number всегда будет иметь тип одного из наследников класса Number

    public BoundedBox(T number) {
        this.number = number;
    }
}
