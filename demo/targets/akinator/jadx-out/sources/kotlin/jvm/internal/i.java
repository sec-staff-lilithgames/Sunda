package kotlin.jvm.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class i {
    public static final <T> Iterator<T> iterator(T[] array) {
        e0.checkNotNullParameter(array, "array");
        return new h(array);
    }
}
