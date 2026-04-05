package com.ironsource;

import com.unity3d.ads.beta.xyn.RnJusJ;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ue, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3483ue {

    /* renamed from: a, reason: collision with root package name */
    private final Me f39060a;

    /* renamed from: b, reason: collision with root package name */
    private final Ad f39061b;

    /* renamed from: c, reason: collision with root package name */
    private final Cd f39062c;

    /* renamed from: d, reason: collision with root package name */
    private final W3 f39063d;

    /* renamed from: e, reason: collision with root package name */
    private final Q5 f39064e;

    public final W3 a() {
        return this.f39063d;
    }

    public final Q5 b() {
        return this.f39064e;
    }

    public final Me c() {
        return this.f39060a;
    }

    public final Ad d() {
        return this.f39061b;
    }

    public final Cd e() {
        return this.f39062c;
    }

    public C3483ue(Me fullResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fullResponse, "fullResponse");
        this.f39060a = fullResponse;
        JSONObject jSONObjectOptJSONObject = fullResponse.i().optJSONObject(C3500ve.f39130a);
        this.f39061b = new Ad(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = fullResponse.i().optJSONObject(C3500ve.f39131b);
        this.f39062c = new Cd(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = fullResponse.i().optJSONObject(RnJusJ.lZwZlTE);
        this.f39063d = new W3(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = fullResponse.i().optJSONObject(C3500ve.f39133d);
        this.f39064e = new Q5(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }
}
