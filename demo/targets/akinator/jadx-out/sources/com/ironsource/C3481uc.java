package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.uc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3481uc implements InterfaceC3256hf<JSONObject>, InterfaceC3220ff<C3447sc> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, C3224g1> f39059a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC3248h7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(EnumC3238gf mode) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C3224g1> entry : this.f39059a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayA = entry.getValue().a(mode);
            if (jSONArrayA.length() > 0) {
                jSONObject.put(key, jSONArrayA);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC3220ff
    public void a(C3447sc record) {
        kotlin.jvm.internal.e0.checkNotNullParameter(record, "record");
        String strC = record.c();
        Map<String, C3224g1> map = this.f39059a;
        C3224g1 c3224g1 = map.get(strC);
        if (c3224g1 == null) {
            c3224g1 = new C3224g1();
            map.put(strC, c3224g1);
        }
        c3224g1.a(record.a(new C3464tc()));
    }
}
