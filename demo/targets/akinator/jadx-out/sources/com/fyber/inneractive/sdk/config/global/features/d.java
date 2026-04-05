package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends h {

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.a f23289e;

    public d() {
        super("cta_locale");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.h
    public final h b() {
        d dVar = new d();
        a(dVar);
        return dVar;
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str) || this.f23289e != null) {
            return;
        }
        this.f23289e = new com.fyber.inneractive.sdk.model.vast.a(a("install_" + str, null), a("skip_ad_" + str, null), a("skip_in_" + str, null));
    }
}
