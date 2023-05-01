package stanislav.danylenko.patterns.behavioral.visitor;

public interface LengthInfo {

    int getLength();
    void accept(Visitor v);

}
