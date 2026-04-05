package ic;

import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class x extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public final transient ArrayBlockingQueue f59529b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f59530c;

    public x(int i10) {
        i10 = i10 <= 0 ? 100 : i10;
        this.f59530c = i10;
        this.f59529b = new ArrayBlockingQueue(i10);
    }

    @Override // ic.c0, ic.f0
    public /* bridge */ /* synthetic */ e0 acquireAndLinkPooled() {
        return super.acquireAndLinkPooled();
    }

    @Override // ic.c0, ic.f0
    public e0 acquirePooled() {
        e0 e0Var = (e0) this.f59529b.poll();
        return e0Var == null ? createPooled() : e0Var;
    }

    public int capacity() {
        return this.f59530c;
    }

    @Override // ic.c0, ic.f0
    public boolean clear() {
        this.f59529b.clear();
        return true;
    }

    @Override // ic.c0, ic.f0
    public int pooledCount() {
        return this.f59529b.size();
    }

    @Override // ic.c0, ic.f0
    public void releasePooled(e0 e0Var) {
        this.f59529b.offer(e0Var);
    }
}
