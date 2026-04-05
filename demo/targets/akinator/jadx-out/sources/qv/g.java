package qv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class g {
    public static <T extends Comparable<? super T>> boolean contains(h hVar, T value) {
        e0.checkNotNullParameter(value, "value");
        return value.compareTo(hVar.getStart()) >= 0 && value.compareTo(hVar.getEndInclusive()) <= 0;
    }

    public static <T extends Comparable<? super T>> boolean isEmpty(h hVar) {
        return hVar.getStart().compareTo(hVar.getEndInclusive()) > 0;
    }
}
