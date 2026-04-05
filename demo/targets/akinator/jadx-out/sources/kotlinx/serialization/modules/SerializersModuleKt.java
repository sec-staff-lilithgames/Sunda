package kotlinx.serialization.modules;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.ContextualProvider;
import kotlinx.serialization.modules.SerializersModuleCollector;
import kv.l;
import tu.f;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerializersModuleKt {
    private static final SerializersModule EmptySerializersModule = new SerialModuleImpl(p1.emptyMap(), p1.emptyMap(), p1.emptyMap(), p1.emptyMap(), p1.emptyMap(), false);

    public static final SerializersModule getEmptySerializersModule() {
        return EmptySerializersModule;
    }

    public static final SerializersModule overwriteWith(SerializersModule serializersModule, SerializersModule other) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(other, "other");
        final SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.include(serializersModule);
        other.dumpTo(new SerializersModuleCollector() { // from class: kotlinx.serialization.modules.SerializersModuleKt$overwriteWith$1$1
            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <T> void contextual(KClass<T> kClass, KSerializer<T> serializer) {
                e0.checkNotNullParameter(kClass, "kClass");
                e0.checkNotNullParameter(serializer, "serializer");
                serializersModuleBuilder.registerSerializer(kClass, new ContextualProvider.Argless(serializer), true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base, Sub extends Base> void polymorphic(KClass<Base> baseClass, KClass<Sub> actualClass, KSerializer<Sub> actualSerializer) {
                e0.checkNotNullParameter(baseClass, "baseClass");
                e0.checkNotNullParameter(actualClass, "actualClass");
                e0.checkNotNullParameter(actualSerializer, "actualSerializer");
                serializersModuleBuilder.registerPolymorphicSerializer(baseClass, actualClass, actualSerializer, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            @f
            public <Base> void polymorphicDefault(KClass<Base> kClass, l lVar) {
                SerializersModuleCollector.DefaultImpls.polymorphicDefault(this, kClass, lVar);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base> void polymorphicDefaultDeserializer(KClass<Base> baseClass, l defaultDeserializerProvider) {
                e0.checkNotNullParameter(baseClass, "baseClass");
                e0.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
                serializersModuleBuilder.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base> void polymorphicDefaultSerializer(KClass<Base> baseClass, l defaultSerializerProvider) {
                e0.checkNotNullParameter(baseClass, "baseClass");
                e0.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
                serializersModuleBuilder.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <T> void contextual(KClass<T> kClass, l lVar) {
                e0.checkNotNullParameter(kClass, "kClass");
                e0.checkNotNullParameter(lVar, OIPXcgrVyyxoLF.AILO);
                serializersModuleBuilder.registerSerializer(kClass, new ContextualProvider.WithTypeArguments(lVar), true);
            }
        });
        return serializersModuleBuilder.build();
    }

    public static final SerializersModule plus(SerializersModule serializersModule, SerializersModule other) {
        e0.checkNotNullParameter(serializersModule, "<this>");
        e0.checkNotNullParameter(other, "other");
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.include(serializersModule);
        serializersModuleBuilder.include(other);
        return serializersModuleBuilder.build();
    }

    @f
    public static /* synthetic */ void getEmptySerializersModule$annotations() {
    }
}
