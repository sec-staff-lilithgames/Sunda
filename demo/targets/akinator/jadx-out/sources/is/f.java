package is;

import io.odeeo.internal.a0.v;
import io.odeeo.internal.b.o;
import io.odeeo.internal.t0.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class f implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f68385c;

    public /* synthetic */ f(v vVar, int i10) {
        this.f68384b = i10;
        this.f68385c = vVar;
    }

    @Override // io.odeeo.internal.t0.b0
    public final Object get() {
        switch (this.f68384b) {
            case 0:
                return o.c.a(this.f68385c);
            case 1:
                return o.c.d(this.f68385c);
            case 2:
                return o.c.c(this.f68385c);
            default:
                return o.c.b(this.f68385c);
        }
    }
}
