package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.cache.session.e f23420a;

    /* renamed from: d, reason: collision with root package name */
    public v0 f23423d;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23421b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f23422c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f23424e = false;

    public final String a(UnitDisplayType unitDisplayType, String str) {
        Map map = (Map) this.f23421b.get(unitDisplayType);
        return (map == null || map.get(str) == null) ? "" : (String) map.get(str);
    }

    public final void a(UnitDisplayType unitDisplayType, String str, String str2) {
        Map map = (Map) this.f23421b.get(unitDisplayType);
        if (map == null) {
            map = new HashMap();
            this.f23421b.put(unitDisplayType, map);
        }
        map.put(str, str2);
        v0 v0Var = this.f23423d;
        if (v0Var == null || !this.f23424e) {
            return;
        }
        ((com.fyber.inneractive.sdk.bidder.b) v0Var).d();
    }

    public final JSONArray a(UnitDisplayType unitDisplayType) throws JSONException {
        int i10;
        com.fyber.inneractive.sdk.cache.session.e eVar = this.f23420a;
        if (eVar == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (unitDisplayType == null || cVar.a() == unitDisplayType)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", cVar.a().value());
                    jSONObject.put("subType", cVar.name().toLowerCase(Locale.US).contains("video") ? "video" : "display");
                    com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.f23149b.get(cVar);
                    try {
                        i10 = Integer.parseInt(IAConfigManager.O.f23226u.f23394b.a("number_of_sessions", Integer.toString(5)));
                    } catch (Throwable unused) {
                        i10 = 5;
                    }
                    int i11 = i10 >= 0 ? i10 : 5;
                    if (i11 > 0 && kVar != null && kVar.size() >= i11) {
                        boolean zB = cVar.b();
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList arrayList = new ArrayList(kVar);
                        Collections.sort(arrayList, new com.fyber.inneractive.sdk.cache.session.j());
                        Iterator it = arrayList.iterator();
                        int i12 = 0;
                        while (it.hasNext()) {
                            jSONArray2.put(((com.fyber.inneractive.sdk.cache.session.g) it.next()).a(false, zB));
                            i12++;
                            if (i12 >= i11) {
                                break;
                            }
                        }
                        jSONObject.put("sessionData", jSONArray2);
                        jSONArray.put(jSONObject);
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return jSONArray;
    }
}
