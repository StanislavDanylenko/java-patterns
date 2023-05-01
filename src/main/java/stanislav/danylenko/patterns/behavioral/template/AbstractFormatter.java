package stanislav.danylenko.patterns.behavioral.template;

import lombok.Getter;

@Getter
public abstract class AbstractFormatter {

    public String format(String text) {
        String res = getHeader();
        res += text;
        res += getFooter();

        return res;
    }

    protected abstract String getHeader();
    protected abstract String getFooter();
}
