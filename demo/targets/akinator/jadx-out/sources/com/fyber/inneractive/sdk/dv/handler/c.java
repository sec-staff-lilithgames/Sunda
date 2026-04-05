package com.fyber.inneractive.sdk.dv.handler;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdFormat f23440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f23441b;

    public c(e eVar, AdFormat adFormat) {
        this.f23441b = eVar;
        this.f23440a = adFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            QueryInfo.generate(o.f26796a, this.f23440a, e.a(this.f23441b), new b(this));
        } catch (Throwable th2) {
            IAlog.a("Error in resolveDVTokens", th2, new Object[0]);
        }
    }
}
