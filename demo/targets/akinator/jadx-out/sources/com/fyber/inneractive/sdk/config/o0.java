package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public Set f23338a = null;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Set set = this.f23338a;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jSONArray.put((Track) it.next());
            }
        }
        c1.a(jSONObject, "track", jSONArray);
        return jSONObject;
    }
}
