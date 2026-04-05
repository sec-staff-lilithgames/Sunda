package du;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class t1 {
    public static <T> Callable<NoSuchElementException> emptyThrower() {
        return o1.f52806b;
    }

    public static <T> Iterable<? extends mt.l> iterableToFlowable(Iterable<? extends mt.t0> iterable) {
        return new q1(iterable);
    }

    public static <T> st.o toFlowable() {
        return p1.f52814b;
    }

    public static <T> st.o toObservable() {
        return s1.f52840b;
    }
}
