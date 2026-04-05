package com.applovin.impl;

import android.content.Context;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.inmobi.media.C3100z2;
import com.inmobi.media.Ec;
import com.inmobi.media.F5;
import com.inmobi.media.Fc;
import com.inmobi.media.J7;
import com.inmobi.media.L7;
import com.inmobi.media.Wc;
import com.ironsource.Da;
import com.ironsource.sdk.controller.v;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13910c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13912f;

    public /* synthetic */ d9(Object obj, Object obj2, boolean z10, int i10) {
        this.f13909b = i10;
        this.f13911e = obj;
        this.f13912f = obj2;
        this.f13910c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13909b) {
            case 0:
                ((g0) this.f13911e).a(this.f13910c, (Runnable) this.f13912f);
                break;
            case 1:
                q2.a(this.f13910c, (MaxAdRequestListener) this.f13911e, (String) this.f13912f);
                break;
            case 2:
                q2.a(this.f13910c, (MaxAdRevenueListener) this.f13911e, (MaxAd) this.f13912f);
                break;
            case 3:
                com.google.firebase.messaging.b0.a((Context) this.f13911e, this.f13910c, (TaskCompletionSource) this.f13912f);
                break;
            case 4:
                Da.a(this.f13910c, (LevelPlayAdInfo) this.f13911e, (Da) this.f13912f);
                break;
            case 5:
                ((v.r) this.f13911e).a(this.f13910c, (String) this.f13912f);
                break;
            case 6:
                Ec.a((Fc) this.f13911e, (Wc) this.f13912f, this.f13910c);
                break;
            case 7:
                J7.a((J7) this.f13911e, (L7) this.f13912f, this.f13910c);
                break;
            default:
                C3100z2.c((String) this.f13911e, this.f13910c, (F5) this.f13912f);
                break;
        }
    }

    public /* synthetic */ d9(Object obj, boolean z10, Object obj2, int i10) {
        this.f13909b = i10;
        this.f13911e = obj;
        this.f13910c = z10;
        this.f13912f = obj2;
    }

    public /* synthetic */ d9(boolean z10, Object obj, Object obj2, int i10) {
        this.f13909b = i10;
        this.f13910c = z10;
        this.f13911e = obj;
        this.f13912f = obj2;
    }
}
