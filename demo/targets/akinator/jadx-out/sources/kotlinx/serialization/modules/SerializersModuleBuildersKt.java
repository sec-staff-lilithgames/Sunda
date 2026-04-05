package kotlinx.serialization.modules;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerializersModuleBuildersKt {
    public static final SerializersModule EmptySerializersModule() {
        return SerializersModuleKt.getEmptySerializersModule();
    }

    public static final SerializersModule SerializersModule(l builderAction) {
        e0.checkNotNullParameter(builderAction, "builderAction");
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        builderAction.invoke(serializersModuleBuilder);
        return serializersModuleBuilder.build();
    }

    public static final /* synthetic */ <T> void contextual(SerializersModuleBuilder serializersModuleBuilder, KSerializer<T> serializer) {
        e0.checkNotNullParameter(serializersModuleBuilder, "<this>");
        e0.checkNotNullParameter(serializer, "serializer");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        serializersModuleBuilder.contextual(c1.getOrCreateKotlinClass(Object.class), serializer);
    }

    public static final <Base> void polymorphic(SerializersModuleBuilder serializersModuleBuilder, KClass<Base> baseClass, KSerializer<Base> kSerializer, l builderAction) {
        e0.checkNotNullParameter(serializersModuleBuilder, "<this>");
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(builderAction, "builderAction");
        PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(baseClass, kSerializer);
        builderAction.invoke(polymorphicModuleBuilder);
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
    }

    public static /* synthetic */ void polymorphic$default(SerializersModuleBuilder serializersModuleBuilder, KClass baseClass, KSerializer kSerializer, l builderAction, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kSerializer = null;
        }
        if ((i10 & 4) != 0) {
            builderAction = new l() { // from class: kotlinx.serialization.modules.SerializersModuleBuildersKt.polymorphic.1
                public final void invoke(PolymorphicModuleBuilder polymorphicModuleBuilder) {
                    e0.checkNotNullParameter(polymorphicModuleBuilder, "<this>");
                }

                @Override // kv.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PolymorphicModuleBuilder) obj2);
                    return x0.f87415a;
                }
            };
        }
        e0.checkNotNullParameter(serializersModuleBuilder, "<this>");
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(builderAction, "builderAction");
        PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(baseClass, kSerializer);
        builderAction.invoke(polymorphicModuleBuilder);
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
    }

    public static final /* synthetic */ <T> SerializersModule serializersModuleOf(KSerializer<T> serializer) {
        e0.checkNotNullParameter(serializer, "serializer");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return serializersModuleOf(c1.getOrCreateKotlinClass(Object.class), serializer);
    }

    public static final <T> SerializersModule serializersModuleOf(KClass<T> kClass, KSerializer<T> serializer) {
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(serializer, "serializer");
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        serializersModuleBuilder.contextual(kClass, serializer);
        return serializersModuleBuilder.build();
    }
}
