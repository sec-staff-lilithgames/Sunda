package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kv.a;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonElementSerializersKt {
    public static final JsonDecoder asJsonDecoder(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "<this>");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + c1.getOrCreateKotlinClass(decoder.getClass()));
    }

    public static final JsonEncoder asJsonEncoder(Encoder encoder) {
        e0.checkNotNullParameter(encoder, "<this>");
        JsonEncoder jsonEncoder = encoder instanceof JsonEncoder ? (JsonEncoder) encoder : null;
        if (jsonEncoder != null) {
            return jsonEncoder;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + c1.getOrCreateKotlinClass(encoder.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor defer(a aVar) {
        return new SerialDescriptor(aVar) { // from class: kotlinx.serialization.json.JsonElementSerializersKt.defer.1
            private final o original$delegate;

            {
                this.original$delegate = q.lazy(aVar);
            }

            private final SerialDescriptor getOriginal() {
                return (SerialDescriptor) this.original$delegate.getValue();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public List<Annotation> getAnnotations() {
                return SerialDescriptor.DefaultImpls.getAnnotations(this);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public List<Annotation> getElementAnnotations(int i10) {
                return getOriginal().getElementAnnotations(i10);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public SerialDescriptor getElementDescriptor(int i10) {
                return getOriginal().getElementDescriptor(i10);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementIndex(String name) {
                e0.checkNotNullParameter(name, "name");
                return getOriginal().getElementIndex(name);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public String getElementName(int i10) {
                return getOriginal().getElementName(i10);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementsCount() {
                return getOriginal().getElementsCount();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public SerialKind getKind() {
                return getOriginal().getKind();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public String getSerialName() {
                return getOriginal().getSerialName();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isElementOptional(int i10) {
                return getOriginal().isElementOptional(i10);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isInline() {
                return SerialDescriptor.DefaultImpls.isInline(this);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isNullable() {
                return SerialDescriptor.DefaultImpls.isNullable(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(Encoder encoder) {
        asJsonEncoder(encoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(Decoder decoder) {
        asJsonDecoder(decoder);
    }
}
