package com.applovin.impl.sdk;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.exoplayer2.l0;
import com.ironsource.AbstractC3553z;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Objects;
import md.d0;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15709c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15712g;

    public /* synthetic */ y(int i10, int i11, Object obj, Object obj2, Object obj3) {
        this.f15708b = i11;
        this.f15711f = obj;
        this.f15710e = obj2;
        this.f15709c = i10;
        this.f15712g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15708b) {
            case 0:
                ((l) this.f15711f).a((String) this.f15710e, this.f15709c, (String) this.f15712g);
                return;
            case 1:
                AbstractC3553z.a((AbstractC3553z) this.f15711f, (AdapterErrorType) this.f15712g, this.f15709c, (String) this.f15710e);
                return;
            default:
                ud.h hVar = (ud.h) this.f15711f;
                d0 d0Var = (d0) this.f15710e;
                int i10 = this.f15709c;
                Runnable runnable = (Runnable) this.f15712g;
                wd.c cVar = hVar.f88432f;
                try {
                    try {
                        vd.d dVar = hVar.f88429c;
                        Objects.requireNonNull(dVar);
                        ((vd.p) cVar).runCriticalSection(new b3(dVar, 19));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) hVar.f88427a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((vd.p) cVar).runCriticalSection(new l0(hVar, d0Var, i10, 5));
                        } else {
                            hVar.logAndUpdateState(d0Var, i10);
                        }
                    } catch (wd.a unused) {
                        hVar.f88430d.schedule(d0Var, i10 + 1);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th2) {
                    runnable.run();
                    throw th2;
                }
        }
    }

    public /* synthetic */ y(AbstractC3553z abstractC3553z, AdapterErrorType adapterErrorType, int i10, String str) {
        this.f15708b = 1;
        this.f15711f = abstractC3553z;
        this.f15712g = adapterErrorType;
        this.f15709c = i10;
        this.f15710e = str;
    }
}
