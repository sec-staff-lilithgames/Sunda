package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f50278a = q.lazy(new com.moloco.sdk.service_locator.b(25));

    public static final a a() {
        return c();
    }

    public static final b b() {
        return d();
    }

    public static final b c() {
        return (b) f50278a.getValue();
    }

    public static final b d() {
        e eVarB;
        try {
            eVarB = a.i.f47469a.c();
        } catch (Exception e10) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "BestAttemptHttpRequest", "Failed to create PersistentHttpRequest, invoking NonPersistendHttpRequest", e10, false, 8, null);
            eVarB = i.b();
        }
        return new b(eVarB);
    }
}
