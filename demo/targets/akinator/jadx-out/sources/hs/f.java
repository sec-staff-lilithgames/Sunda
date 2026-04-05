package hs;

import io.odeeo.internal.a0.n;
import io.odeeo.internal.a0.q;
import io.odeeo.internal.a0.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u.a f59156c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f59157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f59158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f59159g;

    public /* synthetic */ f(u.a aVar, u uVar, n nVar, q qVar, int i10) {
        this.f59155b = i10;
        this.f59156c = aVar;
        this.f59157e = uVar;
        this.f59158f = nVar;
        this.f59159g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59155b) {
            case 0:
                this.f59156c.a(this.f59157e, this.f59158f, this.f59159g);
                break;
            case 1:
                this.f59156c.b(this.f59157e, this.f59158f, this.f59159g);
                break;
            default:
                this.f59156c.c(this.f59157e, this.f59158f, this.f59159g);
                break;
        }
    }
}
