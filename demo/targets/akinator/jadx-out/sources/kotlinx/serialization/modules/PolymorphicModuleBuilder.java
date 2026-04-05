package kotlinx.serialization.modules;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kv.l;
import tu.f;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PolymorphicModuleBuilder<Base> {
    private final KClass<Base> baseClass;
    private final KSerializer<Base> baseSerializer;
    private l defaultDeserializerProvider;
    private l defaultSerializerProvider;
    private final List<v> subclasses;

    public PolymorphicModuleBuilder(KClass<Base> baseClass, KSerializer<Base> kSerializer) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.baseSerializer = kSerializer;
        this.subclasses = new ArrayList();
    }

    public final void buildTo(SerializersModuleBuilder builder) {
        e0.checkNotNullParameter(builder, "builder");
        KSerializer<Base> kSerializer = this.baseSerializer;
        if (kSerializer != null) {
            KClass<Base> kClass = this.baseClass;
            SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, kClass, kClass, kSerializer, false, 8, null);
        }
        for (v vVar : this.subclasses) {
            KClass kClass2 = (KClass) vVar.component1();
            KSerializer kSerializer2 = (KSerializer) vVar.component2();
            KClass<Base> kClass3 = this.baseClass;
            e0.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            e0.checkNotNull(kSerializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            SerializersModuleBuilder.registerPolymorphicSerializer$default(builder, kClass3, kClass2, kSerializer2, false, 8, null);
        }
        l lVar = this.defaultSerializerProvider;
        if (lVar != null) {
            builder.registerDefaultPolymorphicSerializer(this.baseClass, lVar, false);
        }
        l lVar2 = this.defaultDeserializerProvider;
        if (lVar2 != null) {
            builder.registerDefaultPolymorphicDeserializer(this.baseClass, lVar2, false);
        }
    }

    @f
    /* renamed from: default, reason: not valid java name */
    public final void m5253default(l defaultSerializerProvider) {
        e0.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        defaultDeserializer(defaultSerializerProvider);
    }

    public final void defaultDeserializer(l defaultDeserializerProvider) {
        e0.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        if (this.defaultDeserializerProvider == null) {
            this.defaultDeserializerProvider = defaultDeserializerProvider;
            return;
        }
        throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.baseClass + ": " + this.defaultDeserializerProvider).toString());
    }

    public final <T extends Base> void subclass(KClass<T> subclass, KSerializer<T> serializer) {
        e0.checkNotNullParameter(subclass, "subclass");
        e0.checkNotNullParameter(serializer, "serializer");
        this.subclasses.add(tu.e0.to(subclass, serializer));
    }

    public /* synthetic */ PolymorphicModuleBuilder(KClass kClass, KSerializer kSerializer, int i10, u uVar) {
        this(kClass, (i10 & 2) != 0 ? null : kSerializer);
    }
}
