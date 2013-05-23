package pl.lrozek.szkolenia.prymitywy.overloading;

public class Money {

    private float value;

    private String currencyType;

    public Money( float value ) {
        this.value = value;
    }

    public void add( Money money ) {
        this.value = this.value + money.getValue();
    }

    public float getValue() {
        return value;
    };

}
