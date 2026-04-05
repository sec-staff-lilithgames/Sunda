package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ia, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C3269ia extends AbstractC3186e {

    /* renamed from: i, reason: collision with root package name */
    private final String f36937i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";

    /* renamed from: j, reason: collision with root package name */
    private final String f36938j = "super.dwh.mediation_events";

    /* renamed from: k, reason: collision with root package name */
    private final String f36939k = G5.Q;

    /* renamed from: l, reason: collision with root package name */
    private final String f36940l = "data";

    public C3269ia(int i10) {
        this.f36326g = i10;
    }

    @Override // com.ironsource.AbstractC3186e
    public String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC3186e
    public String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC3186e
    public String a(ArrayList<C5> arrayList, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            this.f36325f = new JSONObject();
        } else {
            this.f36325f = jSONObject;
        }
        try {
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
            jSONObject2.put(G5.Q, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }
}
