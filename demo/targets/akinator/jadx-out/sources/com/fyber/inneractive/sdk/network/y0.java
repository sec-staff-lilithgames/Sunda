package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f24338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f24339b;

    public y0(String str, long j10) {
        this.f24338a = str;
        this.f24339b = j10;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        String str = (String) obj;
        IAlog.a("Hit Request: Hitting URL finished: %s", this.f24338a);
        if (exc == null) {
            IAlog.a("Hit Request: Hitting URL response code: %s", str);
        } else {
            IAlog.a("Hit Request: Hitting URL failed: %s", exc);
        }
        IAlog.a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f24339b));
    }
}
