package bi;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface d {
    default <T> T get(Class<T> cls) {
        return (T) get(b0.unqualified(cls));
    }

    <T> sj.b getDeferred(b0 b0Var);

    default <T> sj.b getDeferred(Class<T> cls) {
        return getDeferred(b0.unqualified(cls));
    }

    <T> sj.c getProvider(b0 b0Var);

    default <T> sj.c getProvider(Class<T> cls) {
        return getProvider(b0.unqualified(cls));
    }

    default <T> Set<T> setOf(Class<T> cls) {
        return setOf(b0.unqualified(cls));
    }

    <T> sj.c setOfProvider(b0 b0Var);

    default <T> sj.c setOfProvider(Class<T> cls) {
        return setOfProvider(b0.unqualified(cls));
    }

    default <T> T get(b0 b0Var) {
        sj.c provider = getProvider(b0Var);
        if (provider == null) {
            return null;
        }
        return (T) provider.get();
    }

    default <T> Set<T> setOf(b0 b0Var) {
        return (Set) setOfProvider(b0Var).get();
    }
}
