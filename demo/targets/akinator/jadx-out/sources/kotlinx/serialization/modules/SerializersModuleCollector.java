package kotlinx.serialization.modules;

import aw.f;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@ExperimentalSerializationApi
/* loaded from: classes10.dex */
public interface SerializersModuleCollector {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <T> void contextual(SerializersModuleCollector serializersModuleCollector, KClass<T> kClass, KSerializer<T> serializer) {
            e0.checkNotNullParameter(kClass, "kClass");
            e0.checkNotNullParameter(serializer, "serializer");
            serializersModuleCollector.contextual(kClass, new f(serializer, 23));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static KSerializer contextual$lambda$0(KSerializer kSerializer, List it) {
            e0.checkNotNullParameter(it, "it");
            return kSerializer;
        }

        @tu.f
        public static <Base> void polymorphicDefault(SerializersModuleCollector serializersModuleCollector, KClass<Base> baseClass, l defaultDeserializerProvider) {
            e0.checkNotNullParameter(baseClass, "baseClass");
            e0.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
            serializersModuleCollector.polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider);
        }
    }

    <T> void contextual(KClass<T> kClass, KSerializer<T> kSerializer);

    <T> void contextual(KClass<T> kClass, l lVar);

    <Base, Sub extends Base> void polymorphic(KClass<Base> kClass, KClass<Sub> kClass2, KSerializer<Sub> kSerializer);

    @tu.f
    <Base> void polymorphicDefault(KClass<Base> kClass, l lVar);

    <Base> void polymorphicDefaultDeserializer(KClass<Base> kClass, l lVar);

    <Base> void polymorphicDefaultSerializer(KClass<Base> kClass, l lVar);
}
