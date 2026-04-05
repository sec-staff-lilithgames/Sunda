package p8;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final n8.q f80737a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f80738b;

    /* renamed from: c, reason: collision with root package name */
    public v0 f80739c;

    public d(n8.q qVar, o0 o0Var, ReferenceQueue referenceQueue, boolean z10) {
        super(o0Var, referenceQueue);
        this.f80737a = (n8.q) j9.q.checkNotNull(qVar);
        boolean z11 = o0Var.f80832b;
        this.f80739c = (z11 && z10) ? (v0) j9.q.checkNotNull(o0Var.f80834e) : null;
        this.f80738b = z11;
    }
}
