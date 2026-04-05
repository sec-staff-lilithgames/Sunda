package ks;

import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class d implements o.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.a f71962c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f71963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f71964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f71965g;

    public /* synthetic */ d(b.a aVar, String str, long j10, long j11, int i10) {
        this.f71961b = i10;
        this.f71962c = aVar;
        this.f71963e = str;
        this.f71964f = j10;
        this.f71965g = j11;
    }

    @Override // io.odeeo.internal.q0.o.a
    public final void invoke(Object obj) {
        switch (this.f71961b) {
            case 0:
                io.odeeo.internal.c.a.a(this.f71962c, this.f71963e, this.f71964f, this.f71965g, (io.odeeo.internal.c.b) obj);
                break;
            default:
                io.odeeo.internal.c.a.b(this.f71962c, this.f71963e, this.f71964f, this.f71965g, (io.odeeo.internal.c.b) obj);
                break;
        }
    }
}
