package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class Wc extends AbstractC3186e {

    /* renamed from: i, reason: collision with root package name */
    private final String f35689i = C3307kd.f37101a;

    public Wc(int i10) {
        this.f36326g = i10;
    }

    @Override // com.ironsource.AbstractC3186e
    public String a() {
        return C3307kd.f37101a;
    }

    @Override // com.ironsource.AbstractC3186e
    public String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC3186e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            this.f36325f = new JSONObject();
        } else {
            this.f36325f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C5> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectA = a(it.next());
                if (jSONObjectA != null) {
                    jSONArray.put(jSONObjectA);
                }
            }
        }
        return a(jSONArray);
    }
}
