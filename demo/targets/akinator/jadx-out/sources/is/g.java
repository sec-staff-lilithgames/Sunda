package is;

import io.odeeo.internal.b.o;
import io.odeeo.internal.b.y;
import io.odeeo.internal.t0.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f68387c;

    public /* synthetic */ g(y yVar, int i10) {
        this.f68386b = i10;
        this.f68387c = yVar;
    }

    @Override // io.odeeo.internal.t0.b0
    public final Object get() {
        switch (this.f68386b) {
            case 0:
                return o.c.a(this.f68387c);
            default:
                return o.c.b(this.f68387c);
        }
    }
}
