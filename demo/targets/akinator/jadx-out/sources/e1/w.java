package e1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {
    public static <R> R fold(y yVar, R r10, kv.p operation) {
        e0.checkNotNullParameter(operation, "operation");
        return (R) zu.j.fold(yVar, r10, operation);
    }

    public static <E extends zu.k> E get(y yVar, zu.l key) {
        e0.checkNotNullParameter(key, "key");
        return (E) zu.j.get(yVar, key);
    }

    public static zu.m minusKey(y yVar, zu.l key) {
        e0.checkNotNullParameter(key, "key");
        return zu.j.minusKey(yVar, key);
    }

    public static zu.m plus(y yVar, zu.m context) {
        e0.checkNotNullParameter(context, "context");
        return zu.j.plus(yVar, context);
    }
}
