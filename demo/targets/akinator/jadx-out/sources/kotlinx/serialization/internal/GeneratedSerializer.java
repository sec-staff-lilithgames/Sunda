package kotlinx.serialization.internal;

import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalSerializationApi
/* loaded from: classes10.dex */
public interface GeneratedSerializer<T> extends KSerializer<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <T> KSerializer<?>[] typeParametersSerializers(GeneratedSerializer<T> generatedSerializer) {
            return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
        }
    }

    KSerializer<?>[] childSerializers();

    KSerializer<?>[] typeParametersSerializers();
}
