package gr;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f58398a;

    /* renamed from: b, reason: collision with root package name */
    public Double f58399b;

    /* renamed from: c, reason: collision with root package name */
    public Struct.Builder f58400c;

    public final Struct.Builder a() {
        Struct.Builder builder = this.f58400c;
        if (builder != null) {
            return builder;
        }
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        this.f58400c = builderNewBuilder;
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder().also {\n    …amsBuilder = it\n        }");
        return builderNewBuilder;
    }

    public final a addCustomParams(Map<String, ? extends Object> map) {
        Struct.Builder builderA = a();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                Value valueOrNull = pr.i.toValueOrNull(entry.getValue());
                if (valueOrNull != null) {
                    builderA.putFields(entry.getKey(), valueOrNull);
                }
            }
        }
        return this;
    }

    public final Struct getCustomParams() {
        Struct.Builder builder = this.f58400c;
        if (builder != null) {
            return builder.build();
        }
        return null;
    }

    public final String getNetworkName() {
        return this.f58398a;
    }

    public final Double getPrice() {
        return this.f58399b;
    }

    public final a setCustomParam(String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        a().putFields(key, Value.newBuilder().setStringValue(value).build());
        return this;
    }

    public final a setCustomParams(Map<String, ? extends Object> map) {
        this.f58400c = pr.i.toStructBuilderOrNull(map);
        return this;
    }

    public final a setNetworkName(String str) {
        this.f58398a = str;
        return this;
    }

    public final a setPrice(Double d10) {
        this.f58399b = d10;
        return this;
    }

    public final a setCustomParam(String key, double d10) {
        e0.checkNotNullParameter(key, "key");
        a().putFields(key, Value.newBuilder().setNumberValue(d10).build());
        return this;
    }

    public final a setCustomParam(String key, boolean z10) {
        e0.checkNotNullParameter(key, "key");
        a().putFields(key, Value.newBuilder().setBoolValue(z10).build());
        return this;
    }
}
