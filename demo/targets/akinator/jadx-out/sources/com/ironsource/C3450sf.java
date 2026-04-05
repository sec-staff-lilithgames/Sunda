package com.ironsource;

import com.ironsource.C3191e4;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3450sf {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f38861a;

    public C3450sf(JSONObject jSONObject) {
        this.f38861a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f38861a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f38861a.optBoolean(C3191e4.a.f36377o, false);
    }

    public boolean c() {
        return this.f38861a.optBoolean(C3191e4.a.f36378p, false);
    }

    public boolean d() {
        return this.f38861a.optBoolean(C3191e4.a.f36374l, false);
    }

    public boolean e() {
        return this.f38861a.optBoolean(C3191e4.a.f36376n, false);
    }
}
