package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.Value;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b0 {
    public static final Timestamp a(long j10) {
        long j11 = 1000;
        return Timestamp.newBuilder().setSeconds(j10 / j11).setNanos((int) ((j10 % j11) * 1000000)).build();
    }

    public static final StringValue a(String str) {
        return StringValue.newBuilder().setValue(str).build();
    }

    public static final Struct a(Map map) {
        Value.Builder numberValue;
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                int i10 = tu.z.f87419c;
                String strValueOf = String.valueOf(key);
                if (value instanceof List) {
                    numberValue = Value.newBuilder().setListValue(a((List) value));
                } else if (value instanceof Map) {
                    numberValue = Value.newBuilder().setStructValue(a((Map) value));
                } else if (value instanceof Boolean) {
                    numberValue = Value.newBuilder().setBoolValue(((Boolean) value).booleanValue());
                } else {
                    numberValue = value instanceof Number ? Value.newBuilder().setNumberValue(((Number) value).doubleValue()) : Value.newBuilder().setStringValue(String.valueOf(value));
                }
                tu.z.m7131constructorimpl(builderNewBuilder.putFields(strValueOf, numberValue.build()));
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
        return builderNewBuilder.build();
    }

    public static final ListValue a(List list) {
        Value.Builder numberValue;
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        for (Object obj : list) {
            try {
                int i10 = tu.z.f87419c;
                if (obj instanceof List) {
                    numberValue = Value.newBuilder().setListValue(a((List) obj));
                } else if (obj instanceof Map) {
                    numberValue = Value.newBuilder().setStructValue(a((Map) obj));
                } else if (obj instanceof Boolean) {
                    numberValue = Value.newBuilder().setBoolValue(((Boolean) obj).booleanValue());
                } else {
                    numberValue = obj instanceof Number ? Value.newBuilder().setNumberValue(((Number) obj).doubleValue()) : Value.newBuilder().setStringValue(String.valueOf(obj));
                }
                tu.z.m7131constructorimpl(builderNewBuilder.addValues(numberValue.build()));
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
        }
        return builderNewBuilder.build();
    }
}
