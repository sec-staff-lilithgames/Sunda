package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ue {

    /* renamed from: a, reason: collision with root package name */
    private Ve f35570a;

    public Ue(JSONObject config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        this.f35570a = Ve.f35647b.a(config.optInt("mode", Ve.CurrentlyLoadedAds.b()));
    }

    public final Ve a() {
        return this.f35570a;
    }
}
