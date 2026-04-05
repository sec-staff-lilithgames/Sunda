package com.vungle.ads;

import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50752b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VungleThreadPoolExecutor f50753c;

    public /* synthetic */ a(VungleThreadPoolExecutor vungleThreadPoolExecutor, int i10) {
        this.f50752b = i10;
        this.f50753c = vungleThreadPoolExecutor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50752b) {
            case 0:
                AnalyticsClient.m3532initOrUpdate$lambda1(this.f50753c);
                break;
            case 1:
                VungleThreadPoolExecutor.m3607submit$lambda2(this.f50753c);
                break;
            case 2:
                VungleThreadPoolExecutor.m3605execute$lambda0(this.f50753c);
                break;
            default:
                VungleThreadPoolExecutor.m3606submit$lambda1(this.f50753c);
                break;
        }
    }
}
