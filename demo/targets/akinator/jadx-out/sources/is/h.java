package is;

import io.odeeo.internal.b.o;
import io.odeeo.internal.t0.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class h implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.odeeo.internal.p0.d f68389c;

    public /* synthetic */ h(io.odeeo.internal.p0.d dVar, int i10) {
        this.f68388b = i10;
        this.f68389c = dVar;
    }

    @Override // io.odeeo.internal.t0.b0
    public final Object get() {
        switch (this.f68388b) {
            case 0:
                return o.c.a(this.f68389c);
            default:
                return o.c.b(this.f68389c);
        }
    }
}
