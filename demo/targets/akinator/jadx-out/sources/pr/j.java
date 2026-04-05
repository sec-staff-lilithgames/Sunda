package pr;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import ir.s;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class j {
    public static final ListValue.Builder addValue(ListValue.Builder builder, String value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    public static final String encodeToStringBase64Safely(MessageLite messageLite) {
        e0.checkNotNullParameter(messageLite, "<this>");
        try {
            byte[] byteArray = messageLite.toByteArray();
            e0.checkNotNullExpressionValue(byteArray, "toByteArray()");
            return s.encodeToStringBase64$default(byteArray, 0, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Boolean getBoolean(Struct struct, String key) {
        e0.checkNotNullParameter(struct, "<this>");
        e0.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return Boolean.valueOf(value.getBoolValue());
        }
        return null;
    }

    public static final Double getDouble(Struct struct, String key) {
        e0.checkNotNullParameter(struct, "<this>");
        e0.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return Double.valueOf(value.getNumberValue());
        }
        return null;
    }

    public static final ListValue getListValue(Struct struct, String key) {
        e0.checkNotNullParameter(struct, "<this>");
        e0.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return value.getListValue();
        }
        return null;
    }

    public static final Struct getStruct(Struct struct, String key) {
        e0.checkNotNullParameter(struct, "<this>");
        e0.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return value.getStructValue();
        }
        return null;
    }

    public static final Value getValue(Struct struct, String key) {
        e0.checkNotNullParameter(struct, "<this>");
        e0.checkNotNullParameter(key, "key");
        return struct.getFieldsMap().get(key);
    }

    public static final <T> ListValue mapNotNullToProtoListValue(List<? extends T> list, kv.l transform) {
        e0.checkNotNullParameter(list, "<this>");
        e0.checkNotNullParameter(transform, "transform");
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Value value = (Value) transform.invoke(it.next());
            if (value != null) {
                builderNewBuilder.addValues(value);
            }
        }
        ListValue listValueBuild = builderNewBuilder.build();
        e0.checkNotNullExpressionValue(listValueBuild, "listValueBuilder.build()");
        return listValueBuild;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String key, String value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    public static final Value toProtoValue(String str) {
        e0.checkNotNullParameter(str, "<this>");
        Value valueBuild = Value.newBuilder().setStringValue(str).build();
        e0.checkNotNullExpressionValue(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final ListValue.Builder addValue(ListValue.Builder builder, boolean z10) {
        e0.checkNotNullParameter(builder, "<this>");
        builder.addValues(toProtoValue(z10));
        return builder;
    }

    public static final String encodeToStringBase64Safely(MessageLite.Builder builder) {
        e0.checkNotNullParameter(builder, "<this>");
        try {
            MessageLite messageLiteBuild = builder.build();
            e0.checkNotNullExpressionValue(messageLiteBuild, "build()");
            return encodeToStringBase64Safely(messageLiteBuild);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String getString(Struct struct, String key) {
        e0.checkNotNullParameter(struct, PtLatqAYjEFT.wgUWFIo);
        e0.checkNotNullParameter(key, "key");
        Value value = getValue(struct, key);
        if (value != null) {
            return value.getStringValue();
        }
        return null;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String key, boolean z10) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(key, "key");
        builder.putFields(key, toProtoValue(z10));
        return builder;
    }

    public static final ListValue.Builder addValue(ListValue.Builder builder, Number value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String key, Number value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    public static final ListValue.Builder addValue(ListValue.Builder builder, Struct.Builder value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String key, Struct.Builder value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    public static final Value toProtoValue(boolean z10) {
        Value valueBuild = Value.newBuilder().setBoolValue(z10).build();
        e0.checkNotNullExpressionValue(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final ListValue.Builder addValue(ListValue.Builder builder, Struct value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String key, Struct value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    public static final ListValue.Builder addValue(ListValue.Builder builder, ListValue.Builder value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String key, ListValue.Builder value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    public static final ListValue.Builder addValue(ListValue.Builder builder, ListValue value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(value, "value");
        builder.addValues(toProtoValue(value));
        return builder;
    }

    public static final Struct.Builder putField(Struct.Builder builder, String key, ListValue value) {
        e0.checkNotNullParameter(builder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        builder.putFields(key, toProtoValue(value));
        return builder;
    }

    public static final Value toProtoValue(Number number) {
        e0.checkNotNullParameter(number, "<this>");
        Value.Builder builderNewBuilder = Value.newBuilder();
        Double doubleOrDefault$default = s.toDoubleOrDefault$default(number, null, 1, null);
        Value valueBuild = builderNewBuilder.setNumberValue(doubleOrDefault$default != null ? doubleOrDefault$default.doubleValue() : number.doubleValue()).build();
        e0.checkNotNullExpressionValue(valueBuild, "newBuilder()\n        .se…ouble())\n        .build()");
        return valueBuild;
    }

    public static final Value toProtoValue(Struct struct) {
        e0.checkNotNullParameter(struct, "<this>");
        Value valueBuild = Value.newBuilder().setStructValue(struct).build();
        e0.checkNotNullExpressionValue(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final Value toProtoValue(Struct.Builder builder) {
        e0.checkNotNullParameter(builder, "<this>");
        Struct structBuild = builder.build();
        e0.checkNotNullExpressionValue(structBuild, "build()");
        return toProtoValue(structBuild);
    }

    public static final Value toProtoValue(ListValue listValue) {
        e0.checkNotNullParameter(listValue, "<this>");
        Value valueBuild = Value.newBuilder().setListValue(listValue).build();
        e0.checkNotNullExpressionValue(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    public static final Value toProtoValue(ListValue.Builder builder) {
        e0.checkNotNullParameter(builder, "<this>");
        ListValue listValueBuild = builder.build();
        e0.checkNotNullExpressionValue(listValueBuild, "build()");
        return toProtoValue(listValueBuild);
    }
}
