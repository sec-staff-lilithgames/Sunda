package oa;

import kotlinx.coroutines.CancellableContinuationImpl;
import r7.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f78728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f78729b;

    public c(l lVar, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f78728a = lVar;
        this.f78729b = cancellableContinuationImpl;
    }

    @Override // r7.e0
    public final void onResult(r7.h hVar) {
        l.access$resumeCo(this.f78728a, this.f78729b, hVar);
    }
}
