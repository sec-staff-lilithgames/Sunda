package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.u;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public String f23308a = "";

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23309b;

    /* renamed from: c, reason: collision with root package name */
    public JSONArray f23310c;

    public r() {
        HashMap map = new HashMap();
        map.put(u.class, new u());
        map.put(com.fyber.inneractive.sdk.config.global.features.d.class, new com.fyber.inneractive.sdk.config.global.features.d());
        map.put(com.fyber.inneractive.sdk.config.global.features.l.class, new com.fyber.inneractive.sdk.config.global.features.l());
        map.put(com.fyber.inneractive.sdk.config.global.features.f.class, new com.fyber.inneractive.sdk.config.global.features.f());
        map.put(com.fyber.inneractive.sdk.config.global.features.k.class, new com.fyber.inneractive.sdk.config.global.features.k());
        map.put(com.fyber.inneractive.sdk.config.global.features.e.class, new com.fyber.inneractive.sdk.config.global.features.e());
        map.put(com.fyber.inneractive.sdk.config.global.features.r.class, new com.fyber.inneractive.sdk.config.global.features.r());
        map.put(com.fyber.inneractive.sdk.config.global.features.i.class, new com.fyber.inneractive.sdk.config.global.features.i());
        map.put(com.fyber.inneractive.sdk.config.global.features.q.class, new com.fyber.inneractive.sdk.config.global.features.q());
        map.put(com.fyber.inneractive.sdk.config.global.features.n.class, new com.fyber.inneractive.sdk.config.global.features.n());
        map.put(com.fyber.inneractive.sdk.config.global.features.c.class, new com.fyber.inneractive.sdk.config.global.features.c());
        map.put(com.fyber.inneractive.sdk.config.global.features.m.class, new com.fyber.inneractive.sdk.config.global.features.m());
        map.put(com.fyber.inneractive.sdk.config.global.features.b.class, new com.fyber.inneractive.sdk.config.global.features.b());
        map.put(com.fyber.inneractive.sdk.config.global.features.g.class, new com.fyber.inneractive.sdk.config.global.features.g());
        map.put(com.fyber.inneractive.sdk.config.global.features.j.class, new com.fyber.inneractive.sdk.config.global.features.j());
        this.f23309b = map;
        this.f23310c = null;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((Class) entry.getKey(), ((com.fyber.inneractive.sdk.config.global.features.h) entry.getValue()).b());
        }
        this.f23309b = map2;
        IAlog.a("%s: created. Supported features: %s", "SupportedFeaturesProvider", map2);
    }

    public static r a() {
        int i10 = com.fyber.inneractive.sdk.config.k.f23321a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        boolean z10 = false;
        if (!TextUtils.isEmpty(property)) {
            try {
                IAConfigManager.O.f23231z.f23275a = l.a(new JSONObject(property));
                z10 = true;
            } catch (Exception unused) {
                IAlog.a("failed parsing local features json", new Object[0]);
            }
        }
        r rVar = new r();
        if (z10) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.M.a(true, "");
            iAConfigManager.E.a(iAConfigManager.M);
        }
        return rVar;
    }

    public final JSONArray b() {
        JSONArray jSONArray = this.f23310c;
        if (jSONArray == null || jSONArray.length() == 0) {
            JSONArray jSONArrayA = g.a(this.f23309b, false);
            this.f23310c = jSONArrayA;
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
        }
        return this.f23310c;
    }

    public final void a(e eVar) {
        for (com.fyber.inneractive.sdk.config.global.features.h hVar : this.f23309b.values()) {
            hVar.getClass();
            ArrayList arrayList = new ArrayList(hVar.f23291c.values());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                ArrayList arrayList2 = bVar.f23280d;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        d dVar = (d) it.next();
                        if (dVar.a(eVar)) {
                            hVar.f23291c.remove(bVar.f23277a);
                            hVar.f23292d.remove(bVar.f23277a);
                            this.f23310c = null;
                            IAlog.a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.f23277a, dVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    public final com.fyber.inneractive.sdk.config.global.features.h a(Class cls) {
        if (this.f23309b.containsKey(cls)) {
            com.fyber.inneractive.sdk.config.global.features.h hVar = (com.fyber.inneractive.sdk.config.global.features.h) this.f23309b.get(cls);
            if (cls.isInstance(hVar)) {
                return hVar;
            }
        }
        try {
            return (com.fyber.inneractive.sdk.config.global.features.h) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            IAlog.a("Couldn't create a feature for %s", e10, cls.getName());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r17, java.lang.String r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.global.r.a(boolean, java.lang.String):void");
    }
}
