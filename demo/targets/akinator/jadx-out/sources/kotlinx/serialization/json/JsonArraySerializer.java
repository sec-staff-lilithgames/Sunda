package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonArraySerializer implements KSerializer<JsonArray> {
    public static final JsonArraySerializer INSTANCE = new JsonArraySerializer();
    private static final SerialDescriptor descriptor = JsonArrayDescriptor.INSTANCE;

    private JsonArraySerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public JsonArray deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        JsonElementSerializersKt.verify(decoder);
        return new JsonArray((List) BuiltinSerializersKt.ListSerializer(JsonElementSerializer.INSTANCE).deserialize(decoder));
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, JsonArray value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        JsonElementSerializersKt.verify(encoder);
        BuiltinSerializersKt.ListSerializer(JsonElementSerializer.INSTANCE).serialize(encoder, value);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class JsonArrayDescriptor implements SerialDescriptor {
        public static final JsonArrayDescriptor INSTANCE = new JsonArrayDescriptor();
        private static final String serialName = "kotlinx.serialization.json.JsonArray";
        private final /* synthetic */ SerialDescriptor $$delegate_0 = BuiltinSerializersKt.ListSerializer(JsonElementSerializer.INSTANCE).getDescriptor();

        private JsonArrayDescriptor() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> getAnnotations() {
            return this.$$delegate_0.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @ExperimentalSerializationApi
        public List<Annotation> getElementAnnotations(int i10) {
            return this.$$delegate_0.getElementAnnotations(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @ExperimentalSerializationApi
        public SerialDescriptor getElementDescriptor(int i10) {
            return this.$$delegate_0.getElementDescriptor(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @ExperimentalSerializationApi
        public int getElementIndex(String name) {
            e0.checkNotNullParameter(name, "name");
            return this.$$delegate_0.getElementIndex(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @ExperimentalSerializationApi
        public String getElementName(int i10) {
            return this.$$delegate_0.getElementName(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int getElementsCount() {
            return this.$$delegate_0.getElementsCount();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialKind getKind() {
            return this.$$delegate_0.getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String getSerialName() {
            return serialName;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        @ExperimentalSerializationApi
        public boolean isElementOptional(int i10) {
            return this.$$delegate_0.isElementOptional(i10);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isInline() {
            return this.$$delegate_0.isInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isNullable() {
            return this.$$delegate_0.isNullable();
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSerialName$annotations() {
        }
    }
}
