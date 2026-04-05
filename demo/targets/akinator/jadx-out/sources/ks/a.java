package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71952c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.a0.n f71953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.a0.q f71954f;

    public /* synthetic */ a(b.a aVar, io.odeeo.internal.a0.n nVar, io.odeeo.internal.a0.q qVar, int i10) {
        this.f71951b = i10;
        this.f71952c = aVar;
        this.f71953e = nVar;
        this.f71954f = qVar;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71951b) {
            case 0:
                ((io.odeeo.internal.c.b) obj).onLoadCanceled(this.f71952c, this.f71953e, this.f71954f);
                break;
            case 1:
                ((io.odeeo.internal.c.b) obj).onLoadStarted(this.f71952c, this.f71953e, this.f71954f);
                break;
            default:
                ((io.odeeo.internal.c.b) obj).onLoadCompleted(this.f71952c, this.f71953e, this.f71954f);
                break;
        }
    }
}
