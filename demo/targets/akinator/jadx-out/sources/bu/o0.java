package bu;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f10720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f10721c;

    public o0(p0 p0Var, Collection collection) {
        this.f10721c = p0Var;
        this.f10720b = collection;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f10721c) {
            this.f10721c.f10788o.remove(this.f10720b);
        }
        p0 p0Var = this.f10721c;
        p0Var.T(this.f10720b, p0Var.f10787n);
    }
}
