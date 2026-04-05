package bu;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f10676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f10677c;

    public n0(p0 p0Var, Collection collection) {
        this.f10677c = p0Var;
        this.f10676b = collection;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f10677c) {
            this.f10677c.f10788o.remove(this.f10676b);
        }
        p0 p0Var = this.f10677c;
        p0Var.T(this.f10676b, p0Var.f10787n);
    }
}
