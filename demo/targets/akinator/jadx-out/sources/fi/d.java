package fi;

import android.os.Bundle;
import hi.w;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d implements b, gi.b {

    /* renamed from: b, reason: collision with root package name */
    public gi.a f55714b;

    public static String a(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // fi.b
    public void onEvent(String str, Bundle bundle) {
        gi.a aVar = this.f55714b;
        if (aVar != null) {
            try {
                ((w) aVar).handleBreadcrumb("$A$:" + a(bundle, str));
            } catch (JSONException unused) {
                ei.f.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // gi.b
    public void registerBreadcrumbHandler(gi.a aVar) {
        this.f55714b = aVar;
        ei.f.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
