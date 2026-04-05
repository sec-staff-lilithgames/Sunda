package com.fyber.inneractive.sdk.config;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f23252a;

    public d0(IAConfigManager iAConfigManager) {
        this.f23252a = iAConfigManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAConfigManager iAConfigManager = this.f23252a;
        if (iAConfigManager.f23221p == null) {
            iAConfigManager.f23221p = j.a(iAConfigManager.f23211f);
        }
        com.fyber.inneractive.sdk.util.r.f26804b.post(new c0(this));
    }
}
