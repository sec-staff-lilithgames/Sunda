package com.fyber.inneractive.sdk.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.a f26786a;

    public l(com.fyber.inneractive.sdk.cache.a aVar) {
        this.f26786a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.cache.a aVar;
        try {
            if (o.f26796a == null || (aVar = this.f26786a) == null) {
                return;
            }
            o.f26796a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.b()).apply();
        } catch (Throwable unused) {
        }
    }
}
