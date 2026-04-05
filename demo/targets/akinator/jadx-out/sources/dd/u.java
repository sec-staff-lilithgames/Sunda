package dd;

import java.util.function.BiConsumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface u {
    void clear();

    default void contents(BiConsumer<Object, Object> biConsumer) {
        throw new UnsupportedOperationException();
    }

    default u emptyCopy() {
        throw new UnsupportedOperationException("LookupCache implementation " + getClass().getName() + " does not implement `emptyCopy()`");
    }

    Object get(Object obj);

    Object put(Object obj, Object obj2);

    Object putIfAbsent(Object obj, Object obj2);

    int size();
}
