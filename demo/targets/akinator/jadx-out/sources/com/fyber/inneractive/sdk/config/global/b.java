package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f23277a;

    /* renamed from: b, reason: collision with root package name */
    public int f23278b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23279c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23280d = new ArrayList();

    public static void a(b bVar, JSONObject jSONObject, boolean z10) {
        String next;
        d cVar;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                next = itKeys.next();
                next.getClass();
                switch (next) {
                    case "demand":
                        cVar = new c(jSONObject.getJSONArray(next), z10);
                        break;
                    case "pub_id":
                        cVar = new i(jSONObject.getJSONArray(next), z10);
                        break;
                    case "placement_type":
                        cVar = new h(jSONObject.getJSONArray(next), z10);
                        break;
                    case "os":
                        cVar = new f(z10, jSONObject.getString(next));
                        break;
                    case "sdk":
                        cVar = new j(z10, jSONObject.getString(next));
                        break;
                    default:
                        cVar = null;
                        break;
                }
                if (cVar != null) {
                    bVar.f23280d.add(cVar);
                } else {
                    IAlog.a("b: Unsupported filter type: ".concat(next), new Object[0]);
                }
            }
        }
    }

    public final String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", this.f23277a, this.f23279c, this.f23280d);
    }
}
