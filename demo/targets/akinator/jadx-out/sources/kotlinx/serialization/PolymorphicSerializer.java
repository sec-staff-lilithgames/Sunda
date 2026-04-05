package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g1;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;
import uu.f0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PolymorphicSerializer<T> extends AbstractPolymorphicSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final KClass<T> baseClass;
    private final o descriptor$delegate;

    public PolymorphicSerializer(KClass<T> baseClass) {
        e0.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this._annotations = p0.emptyList();
        this.descriptor$delegate = q.lazy(s.f87404c, (kv.a) new g(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor_delegate$lambda$1(PolymorphicSerializer polymorphicSerializer) {
        return ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.INSTANCE, new SerialDescriptor[0], new a(polymorphicSerializer, 1)), polymorphicSerializer.getBaseClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 descriptor_delegate$lambda$1$lambda$0(PolymorphicSerializer polymorphicSerializer, ClassSerialDescriptorBuilder buildSerialDescriptor) {
        e0.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "type", BuiltinSerializersKt.serializer(g1.f71834a).getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "value", SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.getBaseClass().getSimpleName() + '>', SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.setAnnotations(polymorphicSerializer._annotations);
        return x0.f87415a;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public KClass<T> getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + getBaseClass() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolymorphicSerializer(KClass<T> baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(classAnnotations, "classAnnotations");
        this._annotations = f0.asList(classAnnotations);
    }
}
