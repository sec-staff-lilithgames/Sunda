package mh;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k1 implements Serializable {
    public static <T> k1 absent() {
        return a.f74581b;
    }

    public static <T> k1 fromJavaUtil(Optional<T> optional) {
        if (optional == null) {
            return null;
        }
        return fromNullable(optional.orElse(null));
    }

    public static <T> k1 fromNullable(T t10) {
        return t10 == null ? absent() : new h2(t10);
    }

    public static <T> k1 of(T t10) {
        return new h2(p1.checkNotNull(t10));
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends k1> iterable) {
        p1.checkNotNull(iterable);
        return new Iterable() { // from class: mh.i1
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new j1(iterable);
            }
        };
    }

    public static <T> Optional<T> toJavaUtil(k1 k1Var) {
        if (k1Var == null) {
            return null;
        }
        return (Optional<T>) k1Var.toJavaUtil();
    }

    public abstract Set<Object> asSet();

    public abstract boolean equals(Object obj);

    public abstract Object get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Object or(Object obj);

    public abstract Object or(v2 v2Var);

    public abstract k1 or(k1 k1Var);

    public abstract Object orNull();

    public abstract String toString();

    public abstract <V> k1 transform(v0 v0Var);

    public Optional<Object> toJavaUtil() {
        return Optional.ofNullable(orNull());
    }
}
