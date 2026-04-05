package kotlinx.serialization.json.internal;

import b3.h;
import e3.g;
import j1.o2;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PolymorphicKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void checkKind(SerialKind kind) {
        e0.checkNotNullParameter(kind, "kind");
        if (kind instanceof SerialKind.ENUM) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof PrimitiveKind) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof PolymorphicKind) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String classDiscriminator(SerialDescriptor serialDescriptor, Json json) {
        e0.checkNotNullParameter(serialDescriptor, "<this>");
        e0.checkNotNullParameter(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    public static final <T> T decodeSerializableValuePolymorphic(JsonDecoder jsonDecoder, DeserializationStrategy<? extends T> deserializer, kv.a path) {
        JsonPrimitive jsonPrimitive;
        e0.checkNotNullParameter(jsonDecoder, "<this>");
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(path, "path");
        if (!(deserializer instanceof AbstractPolymorphicSerializer) || jsonDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(jsonDecoder);
        }
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) deserializer;
        String strClassDiscriminator = classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), jsonDecoder.getJson());
        JsonElement jsonElementDecodeJsonElement = jsonDecoder.decodeJsonElement();
        String serialName = abstractPolymorphicSerializer.getDescriptor().getSerialName();
        if (!(jsonElementDecodeJsonElement instanceof JsonObject)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            o2.y(JsonObject.class, sb2, ", but had ", jsonElementDecodeJsonElement, " as the serialized body of ");
            sb2.append(serialName);
            sb2.append(" at element: ");
            sb2.append((String) path.invoke());
            throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), jsonElementDecodeJsonElement.toString());
        }
        JsonObject jsonObject = (JsonObject) jsonElementDecodeJsonElement;
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) strClassDiscriminator);
        try {
            DeserializationStrategy deserializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializer, jsonDecoder, (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getContentOrNull(jsonPrimitive));
            e0.checkNotNull(deserializationStrategyFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return (T) TreeJsonDecoderKt.readPolymorphicJson(jsonDecoder.getJson(), strClassDiscriminator, jsonObject, deserializationStrategyFindPolymorphicSerializer);
        } catch (SerializationException e10) {
            String message = e10.getMessage();
            e0.checkNotNull(message);
            throw JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void encodePolymorphically(kotlinx.serialization.json.JsonEncoder r3, kotlinx.serialization.SerializationStrategy<? super T> r4, T r5, kv.p r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "ifPolymorphic"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
            kotlinx.serialization.json.Json r0 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r0 = r0.getConfiguration()
            boolean r0 = r0.getUseArrayPolymorphism()
            if (r0 == 0) goto L21
            r4.serialize(r3, r5)
            return
        L21:
            boolean r0 = r4 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer
            if (r0 == 0) goto L36
            kotlinx.serialization.json.Json r1 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.getConfiguration()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.getClassDiscriminatorMode()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L7e
            goto L6b
        L36:
            kotlinx.serialization.json.Json r1 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.getConfiguration()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.getClassDiscriminatorMode()
            int[] r2 = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L7e
            r2 = 2
            if (r1 == r2) goto L7e
            r2 = 3
            if (r1 != r2) goto L78
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kotlinx.serialization.descriptors.SerialKind r1 = r1.getKind()
            kotlinx.serialization.descriptors.StructureKind$CLASS r2 = kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE
            boolean r2 = kotlin.jvm.internal.e0.areEqual(r1, r2)
            if (r2 != 0) goto L6b
            kotlinx.serialization.descriptors.StructureKind$OBJECT r2 = kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r1, r2)
            if (r1 == 0) goto L7e
        L6b:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kotlinx.serialization.json.Json r2 = r3.getJson()
            java.lang.String r1 = classDiscriminator(r1, r2)
            goto L7f
        L78:
            tu.t r3 = new tu.t
            r3.<init>()
            throw r3
        L7e:
            r1 = 0
        L7f:
            if (r0 == 0) goto Lc2
            r0 = r4
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r0 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r0
            if (r5 == 0) goto La1
            kotlinx.serialization.SerializationStrategy r0 = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(r0, r3, r5)
            if (r1 == 0) goto L8f
            access$validateIfSealed(r4, r0, r1)
        L8f:
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r0.getDescriptor()
            kotlinx.serialization.descriptors.SerialKind r4 = r4.getKind()
            checkKind(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.e0.checkNotNull(r0, r4)
            r4 = r0
            goto Lc2
        La1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Value for serializer "
            r3.<init>(r4)
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r0.getDescriptor()
            r3.append(r4)
            java.lang.String r4 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        Lc2:
            if (r1 == 0) goto Lcf
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getDescriptor()
            java.lang.String r0 = r0.getSerialName()
            r6.invoke(r1, r0)
        Lcf:
            r4.serialize(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically(kotlinx.serialization.json.JsonEncoder, kotlinx.serialization.SerializationStrategy, java.lang.Object, kv.p):void");
    }

    public static final Void throwJsonElementPolymorphicException(String str, JsonElement element) {
        e0.checkNotNullParameter(element, "element");
        StringBuilder sbO = g.o("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbO.append(c1.getOrCreateKotlinClass(element.getClass()).getSimpleName());
        sbO.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new JsonEncodingException(sbO.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateIfSealed(SerializationStrategy<?> serializationStrategy, SerializationStrategy<?> serializationStrategy2, String str) {
        if ((serializationStrategy instanceof SealedClassSerializer) && JsonInternalDependenciesKt.jsonCachedSerialNames(serializationStrategy2.getDescriptor()).contains(str)) {
            StringBuilder sbB = h.b("Sealed class '", serializationStrategy2.getDescriptor().getSerialName(), "' cannot be serialized as base class '", ((SealedClassSerializer) serializationStrategy).getDescriptor().getSerialName(), "' because it has property name that conflicts with JSON class discriminator '");
            sbB.append(str);
            sbB.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            throw new IllegalStateException(sbB.toString().toString());
        }
    }
}
