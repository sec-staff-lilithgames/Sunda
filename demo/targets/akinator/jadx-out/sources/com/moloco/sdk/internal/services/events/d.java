package com.moloco.sdk.internal.services.events;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c {

    /* renamed from: a, reason: collision with root package name */
    public f f47032a = e.f47033a;

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public void a(boolean z10, boolean z11, String appForegroundUrl, String appBackgroundUrl) {
        e0.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        e0.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.f47032a = new f(z10, z11, appForegroundUrl, appBackgroundUrl);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public boolean b() {
        return this.f47032a.h();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public boolean c() {
        return this.f47032a.g();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public String d() {
        return this.f47032a.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c
    public String a() {
        return this.f47032a.e();
    }
}
