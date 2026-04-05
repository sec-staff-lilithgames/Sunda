package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface SerializerCache<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <T> boolean isStored(SerializerCache<T> serializerCache, KClass<?> key) {
            e0.checkNotNullParameter(key, "key");
            return false;
        }
    }

    KSerializer<T> get(KClass<Object> kClass);

    boolean isStored(KClass<?> kClass);
}
