package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CachingKt {
    private static final boolean useClassValue;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        useClassValue = z10;
    }

    public static final <T> SerializerCache<T> createCache(l factory) {
        e0.checkNotNullParameter(factory, "factory");
        return useClassValue ? new ClassValueCache(factory) : new ConcurrentHashMapCache(factory);
    }

    public static final <T> ParametrizedSerializerCache<T> createParametrizedCache(p factory) {
        e0.checkNotNullParameter(factory, "factory");
        return useClassValue ? new ClassValueParametrizedCache(factory) : new ConcurrentHashMapParametrizedCache(factory);
    }
}
