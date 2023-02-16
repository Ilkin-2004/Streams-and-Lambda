package lambda;

import java.util.function.Consumer;

public class MyConsumer implements Consumer {
//Cosumer funksional interfeisdi yeni bir funksiyani impliment edir

    @Override
    public void accept(Object s) {
System.out.println(s);
    }
}
