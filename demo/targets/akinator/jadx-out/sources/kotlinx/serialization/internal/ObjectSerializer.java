package kotlinx.serialization.internal;

import androidx.lifecycle.x0;
import aw.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import tu.o;
import tu.q;
import tu.s;
import uu.f0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ObjectSerializer<T> implements KSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final o descriptor$delegate;
    private final T objectInstance;

    public ObjectSerializer(String serialName, T objectInstance) {
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(objectInstance, "objectInstance");
        this.objectInstance = objectInstance;
        this._annotations = p0.emptyList();
        this.descriptor$delegate = q.lazy(s.f87404c, (kv.a) new x0(13, serialName, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor_delegate$lambda$1(String str, ObjectSerializer objectSerializer) {
        return SerialDescriptorsKt.buildSerialDescriptor(str, StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], new f(objectSerializer, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tu.x0 descriptor_delegate$lambda$1$lambda$0(ObjectSerializer objectSerializer, ClassSerialDescriptorBuilder buildSerialDescriptor) {
        e0.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.setAnnotations(objectSerializer._annotations);
        return tu.x0.f87415a;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        int iDecodeElementIndex;
        e0.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (!compositeDecoderBeginStructure.decodeSequentially() && (iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor())) != -1) {
            throw new SerializationException(a.b.e(iDecodeElementIndex, "Unexpected index "));
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return this.objectInstance;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, T value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectSerializer(String serialName, T objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        e0.checkNotNullParameter(serialName, "serialName");
        e0.checkNotNullParameter(objectInstance, "objectInstance");
        e0.checkNotNullParameter(classAnnotations, "classAnnotations");
        this._annotations = f0.asList(classAnnotations);
    }
}
