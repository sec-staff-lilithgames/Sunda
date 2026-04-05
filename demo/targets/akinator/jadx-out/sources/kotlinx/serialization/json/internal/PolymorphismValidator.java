package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.modules.SerializersModuleCollector;
import kv.l;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PolymorphismValidator implements SerializersModuleCollector {
    private final String discriminator;
    private final boolean useArrayPolymorphism;

    public PolymorphismValidator(boolean z10, String discriminator) {
        e0.checkNotNullParameter(discriminator, "discriminator");
        this.useArrayPolymorphism = z10;
        this.discriminator = discriminator;
    }

    private final void checkDiscriminatorCollisions(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        int elementsCount = serialDescriptor.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            String elementName = serialDescriptor.getElementName(i10);
            if (e0.areEqual(elementName, this.discriminator)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + elementName + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void checkKind(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        SerialKind kind = serialDescriptor.getKind();
        if ((kind instanceof PolymorphicKind) || e0.areEqual(kind, SerialKind.CONTEXTUAL.INSTANCE)) {
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.useArrayPolymorphism) {
            return;
        }
        if (e0.areEqual(kind, StructureKind.LIST.INSTANCE) || e0.areEqual(kind, StructureKind.MAP.INSTANCE) || (kind instanceof PrimitiveKind) || (kind instanceof SerialKind.ENUM)) {
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(KClass<T> kClass, l provider) {
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(provider, "provider");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(KClass<Base> baseClass, KClass<Sub> actualClass, KSerializer<Sub> actualSerializer) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(actualClass, "actualClass");
        e0.checkNotNullParameter(actualSerializer, "actualSerializer");
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        checkKind(descriptor, actualClass);
        if (this.useArrayPolymorphism) {
            return;
        }
        checkDiscriminatorCollisions(descriptor, actualClass);
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
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(KClass<Base> baseClass, l defaultSerializerProvider) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(KClass<T> kClass, KSerializer<T> kSerializer) {
        SerializersModuleCollector.DefaultImpls.contextual(this, kClass, kSerializer);
    }
}
