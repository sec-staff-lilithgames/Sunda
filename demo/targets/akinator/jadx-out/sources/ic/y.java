package ic;

import java.util.concurrent.ConcurrentLinkedDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final transient ConcurrentLinkedDeque f59531b = new ConcurrentLinkedDeque();

    @Override // ic.c0, ic.f0
    public /* bridge */ /* synthetic */ e0 acquireAndLinkPooled() {
        return super.acquireAndLinkPooled();
    }

    @Override // ic.c0, ic.f0
    public e0 acquirePooled() {
        e0 e0Var = (e0) this.f59531b.pollFirst();
        return e0Var == null ? createPooled() : e0Var;
    }

    @Override // ic.c0, ic.f0
    public boolean clear() {
        this.f59531b.clear();
        return true;
    }

    @Override // ic.c0, ic.f0
    public int pooledCount() {
        return this.f59531b.size();
    }

    @Override // ic.c0, ic.f0
    public void releasePooled(e0 e0Var) {
        this.f59531b.offerLast(e0Var);
    }
}
