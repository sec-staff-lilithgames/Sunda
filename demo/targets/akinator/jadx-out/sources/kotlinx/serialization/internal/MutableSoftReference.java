package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class MutableSoftReference<T> {
    public volatile SoftReference<T> reference = new SoftReference<>(null);

    public final synchronized T getOrSetWithLock(kv.a factory) {
        e0.checkNotNullParameter(factory, "factory");
        T t10 = this.reference.get();
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) factory.invoke();
        this.reference = new SoftReference<>(t11);
        return t11;
    }
}
