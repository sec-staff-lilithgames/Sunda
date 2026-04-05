package io.bidmachine;

import com.android.installreferrer.api.InstallReferrerStateListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c3 implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d3 f60326a;

    public c3(d3 d3Var) {
        this.f60326a = d3Var;
    }

    public final void a(int i10) {
        if (i10 == 0) {
            e3.f60347a.set(d3.a(this.f60326a.f60340a));
        }
        this.f60326a.f60340a.endConnection();
    }

    public void onInstallReferrerSetupFinished(final int i10) {
        new Thread(new cn.a() { // from class: io.bidmachine.b3
            @Override // cn.a, pr.l
            public final void onRun() {
                this.f60320b.a(i10);
            }
        }).start();
    }

    public void onInstallReferrerServiceDisconnected() {
    }
}
