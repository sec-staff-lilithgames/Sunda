package sv;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a0 {
    public static final t access$findNext(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new w(matcher, charSequence);
        }
        return null;
    }

    public static final t access$matchEntire(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new w(matcher, charSequence);
        }
        return null;
    }

    public static final int access$toInt(Iterable iterable) {
        Iterator it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= ((b0) ((j) it.next())).getValue();
        }
        return value;
    }
}
