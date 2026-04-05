package kotlinx.serialization.json;

import a.b;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.g1;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOpsKt;
import kv.a;
import sv.i0;
import tu.k;
import tu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonElementKt {
    private static final SerialDescriptor jsonUnquotedLiteralDescriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.serializer(g1.f71834a));

    public static final JsonPrimitive JsonPrimitive(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new JsonLiteral(bool, false, null, 4, null);
    }

    @ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-7apg3OU, reason: not valid java name */
    public static final JsonPrimitive m5248JsonPrimitive7apg3OU(byte b10) {
        return m5249JsonPrimitiveVKZWuLQ(o0.m7081constructorimpl(b10 & 255));
    }

    @ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-VKZWuLQ, reason: not valid java name */
    public static final JsonPrimitive m5249JsonPrimitiveVKZWuLQ(long j10) {
        String str;
        if (j10 == 0) {
            str = "0";
        } else if (j10 > 0) {
            str = Long.toString(j10, 10);
        } else {
            char[] cArr = new char[64];
            long j11 = (j10 >>> 1) / 5;
            long j12 = 10;
            int i10 = 63;
            cArr[63] = Character.forDigit((int) (j10 - (j11 * j12)), 10);
            while (j11 > 0) {
                i10--;
                cArr[i10] = Character.forDigit((int) (j11 % j12), 10);
                j11 /= j12;
            }
            str = new String(cArr, i10, 64 - i10);
        }
        return JsonUnquotedLiteral(str);
    }

    @ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-WZ4Q5Ns, reason: not valid java name */
    public static final JsonPrimitive m5250JsonPrimitiveWZ4Q5Ns(int i10) {
        return m5249JsonPrimitiveVKZWuLQ(o0.m7081constructorimpl(i10 & 4294967295L));
    }

    @ExperimentalSerializationApi
    /* renamed from: JsonPrimitive-xj2QHRw, reason: not valid java name */
    public static final JsonPrimitive m5251JsonPrimitivexj2QHRw(short s10) {
        return m5249JsonPrimitiveVKZWuLQ(o0.m7081constructorimpl(s10 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @ExperimentalSerializationApi
    public static final JsonPrimitive JsonUnquotedLiteral(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        if (e0.areEqual(str, JsonNull.INSTANCE.getContent())) {
            throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new JsonLiteral(str, false, jsonUnquotedLiteralDescriptor);
    }

    private static final Void error(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + c1.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    public static final boolean getBoolean(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        Boolean booleanStrictOrNull = StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    public static final Boolean getBooleanOrNull(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
    }

    public static final String getContentOrNull(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    public static final double getDouble(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.getContent());
    }

    public static final Double getDoubleOrNull(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        return i0.toDoubleOrNull(jsonPrimitive.getContent());
    }

    public static final float getFloat(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.getContent());
    }

    public static final Float getFloatOrNull(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        return i0.toFloatOrNull(jsonPrimitive.getContent());
    }

    public static final int getInt(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            long jConsumeNumericLiteral = new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteral();
            if (-2147483648L <= jConsumeNumericLiteral && jConsumeNumericLiteral <= 2147483647L) {
                return (int) jConsumeNumericLiteral;
            }
            throw new NumberFormatException(jsonPrimitive.getContent() + " is not an Int");
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final Integer getIntOrNull(JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            lValueOf = Long.valueOf(new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteral());
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final JsonArray getJsonArray(JsonElement jsonElement) {
        e0.checkNotNullParameter(jsonElement, "<this>");
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        error(jsonElement, "JsonArray");
        throw new k();
    }

    public static final JsonNull getJsonNull(JsonElement jsonElement) {
        e0.checkNotNullParameter(jsonElement, "<this>");
        JsonNull jsonNull = jsonElement instanceof JsonNull ? (JsonNull) jsonElement : null;
        if (jsonNull != null) {
            return jsonNull;
        }
        error(jsonElement, "JsonNull");
        throw new k();
    }

    public static final JsonObject getJsonObject(JsonElement jsonElement) {
        e0.checkNotNullParameter(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        error(jsonElement, "JsonObject");
        throw new k();
    }

    public static final JsonPrimitive getJsonPrimitive(JsonElement jsonElement) {
        e0.checkNotNullParameter(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        error(jsonElement, "JsonPrimitive");
        throw new k();
    }

    public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
        return jsonUnquotedLiteralDescriptor;
    }

    public static final long getLong(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteral();
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    public static final Long getLongOrNull(JsonPrimitive jsonPrimitive) {
        e0.checkNotNullParameter(jsonPrimitive, "<this>");
        try {
            return Long.valueOf(new StringJsonLexer(jsonPrimitive.getContent()).consumeNumericLiteral());
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    private static final <T> T mapExceptions(a aVar) {
        try {
            return (T) aVar.invoke();
        } catch (JsonDecodingException e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    private static final <T> T mapExceptionsToNull(a aVar) {
        try {
            return (T) aVar.invoke();
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    public static final Void unexpectedJson(String key, String expected) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(expected, "expected");
        throw new IllegalArgumentException(b.m("Element ", key, " is not a ", expected));
    }

    public static final JsonPrimitive JsonPrimitive(Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(number, false, null, 4, null);
    }

    public static final JsonPrimitive JsonPrimitive(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(str, true, null, 4, null);
    }

    @ExperimentalSerializationApi
    public static final JsonNull JsonPrimitive(Void r02) {
        return JsonNull.INSTANCE;
    }
}
