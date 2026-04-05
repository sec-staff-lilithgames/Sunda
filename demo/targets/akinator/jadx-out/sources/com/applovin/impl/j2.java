package com.applovin.impl;

import com.applovin.impl.b6;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class j2 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f14165a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.k kVar) {
        if (f14165a) {
            return;
        }
        kVar.E().a(c2.E0, "no_ads_loaded");
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        Long l9 = (Long) kVar.a(o3.f14942d8);
        if (l9.longValue() <= 0) {
            return;
        }
        kVar.r0().a(new p6(kVar, true, "submitIntegrationErrorReport", new n9(0, kVar)), b6.b.OTHER, TimeUnit.SECONDS.toMillis(l9.longValue()));
    }

    public static void a() {
        f14165a = true;
    }
}
