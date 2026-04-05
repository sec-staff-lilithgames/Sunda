package qv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class s {
    public static <T extends Comparable<? super T>> boolean contains(t tVar, T value) {
        e0.checkNotNullParameter(value, "value");
        return value.compareTo(tVar.getStart()) >= 0 && value.compareTo(tVar.getEndExclusive()) < 0;
    }

    public static <T extends Comparable<? super T>> boolean isEmpty(t tVar) {
        return tVar.getStart().compareTo(tVar.getEndExclusive()) >= 0;
    }
}
