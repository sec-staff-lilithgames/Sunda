package com.fyber.inneractive.sdk.model.vast;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a, reason: collision with root package name */
    public final i f24086a;

    /* renamed from: b, reason: collision with root package name */
    public k f24087b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24088c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24089d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24090e;

    /* renamed from: f, reason: collision with root package name */
    public String f24091f;

    /* renamed from: g, reason: collision with root package name */
    public String f24092g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24093h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f24094i = new HashMap();

    public c(i iVar, int i10, int i11, String str, int i12) {
        this.f24086a = iVar;
        this.f24088c = i10;
        this.f24089d = i11;
        this.f24090e = str;
        this.f24093h = i12;
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f24094i.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f24094i.put(xVar, arrayList);
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f24088c);
        sb2.append(" h:");
        sb2.append(this.f24089d);
        sb2.append(" type:");
        sb2.append(this.f24086a.toString());
        sb2.append(" creativeType: ");
        k kVar = this.f24087b;
        sb2.append(kVar != null ? kVar.mimeType : "none");
        sb2.append(" ctr:");
        sb2.append(this.f24092g);
        sb2.append(" events:");
        sb2.append(this.f24094i);
        return sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f24094i.isEmpty()) {
            return null;
        }
        return (List) this.f24094i.get(xVar);
    }

    public final JSONObject a() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f24088c);
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME, this.f24089d);
            jSONObject.put("type", this.f24086a.toString());
            k kVar = this.f24087b;
            if (kVar != null) {
                str = kVar.mimeType;
            } else {
                str = "none";
            }
            jSONObject.put("creativeType", str);
            jSONObject.put("content", this.f24091f);
            return jSONObject;
        } catch (JSONException e10) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e10.getMessage());
            return jSONObject;
        }
    }
}
