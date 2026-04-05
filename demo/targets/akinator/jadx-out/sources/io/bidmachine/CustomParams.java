package io.bidmachine;

import com.explorestack.protobuf.Struct;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class CustomParams implements up.h {
    private final Map<String, Object> customMap = new LinkedHashMap();

    @Override // up.h
    public /* bridge */ /* synthetic */ Object addParams(Map map) {
        return addParams((Map<String, String>) map);
    }

    public final void fillStructBuilder(Struct.Builder builder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        pr.i.fillStructWithPrimitiveValues(builder, this.customMap);
    }

    @Override // up.h
    public CustomParams addParams(Map<String, String> params) {
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        this.customMap.putAll(params);
        return this;
    }

    @Override // up.h
    public CustomParams addParam(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.customMap.put(key, value);
        return this;
    }

    @Override // up.h
    public CustomParams addParam(String key, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        this.customMap.put(key, Integer.valueOf(i10));
        return this;
    }

    @Override // up.h
    public CustomParams addParam(String key, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        this.customMap.put(key, Float.valueOf(f10));
        return this;
    }

    @Override // up.h
    public CustomParams addParam(String key, double d10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        this.customMap.put(key, Double.valueOf(d10));
        return this;
    }

    @Override // up.h
    public CustomParams addParam(String key, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        this.customMap.put(key, Boolean.valueOf(z10));
        return this;
    }
}
