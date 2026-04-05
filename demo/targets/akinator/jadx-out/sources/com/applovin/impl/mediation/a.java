package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.k7;
import com.applovin.impl.z2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a extends com.applovin.impl.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.c f14514a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f14515b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14516c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0033a f14517d;

    /* renamed from: e, reason: collision with root package name */
    private z2 f14518e;

    /* renamed from: f, reason: collision with root package name */
    private String f14519f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.applovin.impl.mediation.a$a, reason: collision with other inner class name */
    public interface InterfaceC0033a {
        void b(z2 z2Var);
    }

    public a(com.applovin.impl.sdk.k kVar) {
        this.f14515b = kVar.O();
        this.f14514a = kVar.e();
        this.f14516c = k7.a(com.applovin.impl.sdk.k.o(), "AdActivityObserver", kVar);
    }

    public void a(z2 z2Var, InterfaceC0033a interfaceC0033a) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14515b.a("AdActivityObserver", "Starting for ad " + z2Var.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        a();
        this.f14517d = interfaceC0033a;
        this.f14518e = z2Var;
        this.f14514a.a(this);
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass().getName().equals(this.f14516c) && this.f14518e.s0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14515b.a("AdActivityObserver", "App relaunched via launcher without an ad hidden callback, manually invoking ad hidden");
            }
            if (this.f14517d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14515b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f14517d.b(this.f14518e);
            }
            a();
            return;
        }
        if (this.f14519f == null) {
            this.f14519f = activity.getClass().getName();
            if (com.applovin.impl.sdk.o.a()) {
                e2.B(new StringBuilder("Started tracking ad Activity: "), this.f14519f, this.f14515b, "AdActivityObserver");
            }
        }
    }

    @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.getClass().getName().equals(this.f14519f)) {
            if (com.applovin.impl.sdk.o.a()) {
                e2.B(new StringBuilder("Ad Activity destroyed: "), this.f14519f, this.f14515b, "AdActivityObserver");
            }
            if (this.f14517d != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14515b.a("AdActivityObserver", "Invoking callback...");
                }
                this.f14517d.b(this.f14518e);
            }
            a();
        }
    }

    public void a() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14515b.a("AdActivityObserver", "Cancelling...");
        }
        this.f14514a.b(this);
        this.f14517d = null;
        this.f14518e = null;
        this.f14519f = null;
    }
}
