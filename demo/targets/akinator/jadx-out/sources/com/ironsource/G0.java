package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G0 implements InterfaceC3256hf<JSONObject>, InterfaceC3220ff<E0> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C3481uc> f34395a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC3248h7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC3238gf mode) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C3481uc> entry : this.f34395a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(mode);
            if (jSONObjectA.length() > 0) {
                jSONObject.put(sv.n0.substringAfterLast$default(key, "_", (String) null, 2, (Object) null), jSONObjectA);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC3220ff
    public void a(E0 record) {
        kotlin.jvm.internal.e0.checkNotNullParameter(record, "record");
        String strD = record.d();
        Map<String, C3481uc> map = this.f34395a;
        C3481uc c3481uc = map.get(strD);
        if (c3481uc == null) {
            c3481uc = new C3481uc();
            map.put(strD, c3481uc);
        }
        c3481uc.a(record.a(new F0()));
    }
}
