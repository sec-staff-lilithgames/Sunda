package is;

import io.odeeo.internal.b.o;
import io.odeeo.internal.b.s0;
import io.odeeo.internal.t0.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class c implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f68379c;

    public /* synthetic */ c(s0 s0Var, int i10) {
        this.f68378b = i10;
        this.f68379c = s0Var;
    }

    @Override // io.odeeo.internal.t0.b0
    public final Object get() {
        switch (this.f68378b) {
            case 0:
                return o.c.b(this.f68379c);
            case 1:
                return o.c.a(this.f68379c);
            case 2:
                return o.c.c(this.f68379c);
            default:
                return o.c.d(this.f68379c);
        }
    }
}
