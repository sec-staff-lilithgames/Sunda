package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Cd {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C3566zc> f33925a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends kotlin.jvm.internal.f0 implements kv.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f33926a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.f33926a = jSONObject;
        }

        @Override // kv.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final tu.v invoke(String networkName) throws JSONException {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.f33926a.getJSONObject(networkName);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return tu.e0.to(networkName, new C3566zc(networkName, jSONObject));
        }
    }

    public Cd(JSONObject providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> itKeys = providerSettings.keys();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys, "providerSettings\n          .keys()");
        Map<String, C3566zc> map = uu.p1.toMap(rv.f0.map(rv.y.asSequence(itKeys), new a(providerSettings)));
        this.f33925a = map;
        for (Map.Entry<String, C3566zc> entry : map.entrySet()) {
            entry.getKey();
            C3566zc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(C3566zc c3566zc) {
        return c3566zc.o() && c3566zc.l().length() > 0;
    }

    public final Map<String, C3566zc> a() {
        return this.f33925a;
    }

    private final C3566zc a(C3566zc c3566zc) {
        return this.f33925a.get(c3566zc.h());
    }
}
