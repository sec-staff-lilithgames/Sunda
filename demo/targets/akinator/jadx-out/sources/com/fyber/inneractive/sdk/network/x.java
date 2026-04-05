package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f24331a = new JSONObject();

    public final x a(Object obj, String str) throws JSONException {
        try {
            this.f24331a.put(str, obj);
            return this;
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", str, obj);
            return this;
        }
    }
}
