package yt;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f96025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f96026c;

    public o0(p0 p0Var, Collection collection) {
        this.f96026c = p0Var;
        this.f96025b = collection;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f96026c) {
            this.f96026c.f96095p.remove(this.f96025b);
        }
        p0 p0Var = this.f96026c;
        p0Var.T(this.f96025b, p0Var.f96094o);
    }
}
