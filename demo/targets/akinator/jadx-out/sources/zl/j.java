package zl;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f98241a;

    public j(CountDownLatch countDownLatch) {
        this.f98241a = countDownLatch;
    }

    @Override // zl.e0
    public void onAdLoadFailed(t tVar, pr.a aVar) {
        this.f98241a.countDown();
    }

    @Override // zl.e0
    public void onAdLoaded(t tVar) {
        this.f98241a.countDown();
    }
}
