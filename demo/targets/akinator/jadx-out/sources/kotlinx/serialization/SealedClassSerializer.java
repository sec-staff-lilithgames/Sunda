package kotlinx.serialization;

import androidx.lifecycle.x0;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g1;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import tu.o;
import tu.q;
import tu.s;
import uu.f0;
import uu.f1;
import uu.k0;
import uu.o1;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalSerializationApi
/* loaded from: classes10.dex */
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final KClass<T> baseClass;
    private final Map<KClass<? extends T>, KSerializer<? extends T>> class2Serializer;
    private final o descriptor$delegate;
    private final Map<String, KSerializer<? extends T>> serialName2Serializer;

    public SealedClassSerializer(String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(subclasses, "subclasses");
        e0.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.baseClass = baseClass;
        this._annotations = p0.emptyList();
        this.descriptor$delegate = q.lazy(s.f87404c, (kv.a) new x0(11, serialName, this));
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + getBaseClass().getSimpleName() + " should be marked @Serializable");
        }
        Map<KClass<? extends T>, KSerializer<? extends T>> map = p1.toMap(k0.zip(subclasses, subclassSerializers));
        this.class2Serializer = map;
        final Set<Map.Entry<KClass<? extends T>, KSerializer<? extends T>>> setEntrySet = map.entrySet();
        f1 f1Var = new f1() { // from class: kotlinx.serialization.SealedClassSerializer$special$$inlined$groupingBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // uu.f1
            public String keyOf(Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> entry) {
                return ((KSerializer) entry.getValue()).getDescriptor().getSerialName();
            }

            @Override // uu.f1
            public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator() {
                return setEntrySet.iterator();
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Object> itSourceIterator = f1Var.sourceIterator();
        while (itSourceIterator.hasNext()) {
            Object next = itSourceIterator.next();
            Object objKeyOf = f1Var.keyOf(next);
            Object obj = linkedHashMap.get(objKeyOf);
            if (obj == null) {
                linkedHashMap.containsKey(objKeyOf);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objKeyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + getBaseClass() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objKeyOf, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(o1.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.serialName2Serializer = linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor_delegate$lambda$3(String str, SealedClassSerializer sealedClassSerializer) {
        return SerialDescriptorsKt.buildSerialDescriptor(str, PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], new b(sealedClassSerializer, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tu.x0 descriptor_delegate$lambda$3$lambda$2(SealedClassSerializer sealedClassSerializer, ClassSerialDescriptorBuilder buildSerialDescriptor) {
        e0.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "type", BuiltinSerializersKt.serializer(g1.f71834a).getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "value", SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Sealed<" + sealedClassSerializer.getBaseClass().getSimpleName() + '>', SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], new b(sealedClassSerializer, 1)), null, false, 12, null);
        buildSerialDescriptor.setAnnotations(sealedClassSerializer._annotations);
        return tu.x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tu.x0 descriptor_delegate$lambda$3$lambda$2$lambda$1(SealedClassSerializer sealedClassSerializer, ClassSerialDescriptorBuilder buildSerialDescriptor) {
        e0.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry<String, KSerializer<? extends T>> entry : sealedClassSerializer.serialName2Serializer.entrySet()) {
            ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, entry.getKey(), entry.getValue().getDescriptor(), null, false, 12, null);
        }
        return tu.x0.f87415a;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String str) {
        e0.checkNotNullParameter(decoder, "decoder");
        KSerializer<? extends T> kSerializer = this.serialName2Serializer.get(str);
        return kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(decoder, str);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public KClass<T> getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        KSerializer<? extends T> kSerializerFindPolymorphicSerializerOrNull = this.class2Serializer.get(c1.getOrCreateKotlinClass(value.getClass()));
        if (kSerializerFindPolymorphicSerializerOrNull == null) {
            kSerializerFindPolymorphicSerializerOrNull = super.findPolymorphicSerializerOrNull(encoder, (Encoder) value);
        }
        if (kSerializerFindPolymorphicSerializerOrNull != null) {
            return kSerializerFindPolymorphicSerializerOrNull;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(String serialName, KClass<T> baseClass, KClass<? extends T>[] subclasses, KSerializer<? extends T>[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(baseClass, "baseClass");
        e0.checkNotNullParameter(subclasses, "subclasses");
        e0.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        e0.checkNotNullParameter(classAnnotations, "classAnnotations");
        this._annotations = f0.asList(classAnnotations);
    }
}
