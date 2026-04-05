package oa;

import kotlinx.coroutines.CancellableContinuationImpl;
import r7.e0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f78725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f78726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f78727c;

    public b(l lVar, String str, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f78725a = lVar;
        this.f78726b = str;
        this.f78727c = cancellableContinuationImpl;
    }

    @Override // r7.e0
    public final void onResult(Throwable th2) {
        Timber.Forest forest = Timber.Forest;
        l lVar = this.f78725a;
        forest.tag(l.access$getTag$p(lVar)).e("Lottie load failed: " + this.f78726b + " and error is : " + th2, new Object[0]);
        l.access$resumeCo(lVar, this.f78727c, null);
    }
}
