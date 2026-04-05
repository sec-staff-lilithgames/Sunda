package kotlinx.serialization.modules;

import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.modules.ContextualProvider;
import kotlinx.serialization.modules.SerializersModuleCollector;
import kv.l;
import tu.f;
import uu.r1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerializersModuleBuilder implements SerializersModuleCollector {
    private boolean hasInterfaceContextualSerializers;
    private final Map<KClass<?>, ContextualProvider> class2ContextualProvider = new HashMap();
    private final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers = new HashMap();
    private final Map<KClass<?>, l> polyBase2DefaultSerializerProvider = new HashMap();
    private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers = new HashMap();
    private final Map<KClass<?>, l> polyBase2DefaultDeserializerProvider = new HashMap();

    public static /* synthetic */ void registerPolymorphicSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, KClass kClass2, KSerializer kSerializer, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        serializersModuleBuilder.registerPolymorphicSerializer(kClass, kClass2, kSerializer, z10);
    }

    public static /* synthetic */ void registerSerializer$default(SerializersModuleBuilder serializersModuleBuilder, KClass kClass, ContextualProvider contextualProvider, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        serializersModuleBuilder.registerSerializer(kClass, contextualProvider, z10);
    }

    public final SerializersModule build() {
        return new SerialModuleImpl(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider, this.hasInterfaceContextualSerializers);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(KClass<T> kClass, KSerializer<T> serializer) {
        e0.checkNotNullParameter(kClass, KGUkpTlXZlJLy.zlq);
        e0.checkNotNullParameter(serializer, "serializer");
        registerSerializer$default(this, kClass, new ContextualProvider.Argless(serializer), false, 4, null);
    }

    public final void include(SerializersModule module) {
        e0.checkNotNullParameter(module, "module");
        module.dumpTo(this);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(KClass<Base> baseClass, KClass<Sub> actualClass, KSerializer<Sub> actualSerializer) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(actualClass, "actualClass");
        e0.checkNotNullParameter(actualSerializer, "actualSerializer");
        registerPolymorphicSerializer$default(this, baseClass, actualClass, actualSerializer, false, 8, null);
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
        registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(KClass<Base> baseClass, l defaultSerializerProvider) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, false);
    }

    public final <Base> void registerDefaultPolymorphicDeserializer(KClass<Base> baseClass, l defaultDeserializerProvider, boolean z10) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        l lVar = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        if (lVar == null || e0.areEqual(lVar, defaultDeserializerProvider) || z10) {
            this.polyBase2DefaultDeserializerProvider.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + lVar);
    }

    public final <Base> void registerDefaultPolymorphicSerializer(KClass<Base> baseClass, l defaultSerializerProvider, boolean z10) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        l lVar = this.polyBase2DefaultSerializerProvider.get(baseClass);
        if (lVar == null || e0.areEqual(lVar, defaultSerializerProvider) || z10) {
            this.polyBase2DefaultSerializerProvider.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + lVar);
    }

    public final <Base, Sub extends Base> void registerPolymorphicSerializer(KClass<Base> baseClass, KClass<Sub> concreteClass, KSerializer<Sub> concreteSerializer, boolean z10) {
        Object next;
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(concreteClass, "concreteClass");
        e0.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String serialName = concreteSerializer.getDescriptor().getSerialName();
        Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> map = this.polyBase2Serializers;
        Map<KClass<?>, KSerializer<?>> map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(baseClass, map2);
        }
        Map<KClass<?>, KSerializer<?>> map3 = map2;
        KSerializer<?> kSerializer = map3.get(concreteClass);
        Map<KClass<?>, Map<String, KSerializer<?>>> map4 = this.polyBase2NamedSerializers;
        Map<String, KSerializer<?>> map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(baseClass, map5);
        }
        Map<String, KSerializer<?>> map6 = map5;
        if (z10) {
            if (kSerializer != null) {
                map6.remove(kSerializer.getDescriptor().getSerialName());
            }
            map3.put(concreteClass, concreteSerializer);
            map6.put(serialName, concreteSerializer);
            return;
        }
        if (kSerializer != null) {
            if (!e0.areEqual(kSerializer, concreteSerializer)) {
                throw new SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
            map6.remove(kSerializer.getDescriptor().getSerialName());
        }
        KSerializer<?> kSerializer2 = map6.get(serialName);
        if (kSerializer2 == null) {
            map3.put(concreteClass, concreteSerializer);
            map6.put(serialName, concreteSerializer);
            return;
        }
        Map<KClass<?>, KSerializer<?>> map7 = this.polyBase2Serializers.get(baseClass);
        e0.checkNotNull(map7);
        Iterator<Object> it = r1.asSequence(map7).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == kSerializer2) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + serialName + "': '" + concreteClass + "' and '" + ((Map.Entry) next) + '\'');
    }

    public final <T> void registerSerializer(KClass<T> forClass, ContextualProvider provider, boolean z10) {
        ContextualProvider contextualProvider;
        e0.checkNotNullParameter(forClass, "forClass");
        e0.checkNotNullParameter(provider, "provider");
        if (!z10 && (contextualProvider = this.class2ContextualProvider.get(forClass)) != null && !e0.areEqual(contextualProvider, provider)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        this.class2ContextualProvider.put(forClass, provider);
        if (PlatformKt.isInterface(forClass)) {
            this.hasInterfaceContextualSerializers = true;
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(KClass<T> kClass, l provider) {
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(provider, "provider");
        registerSerializer$default(this, kClass, new ContextualProvider.WithTypeArguments(provider), false, 4, null);
    }
}
