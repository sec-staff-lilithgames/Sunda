package hs;

import io.odeeo.internal.a0.j;
import io.odeeo.internal.b.o;
import io.odeeo.internal.b.q;
import io.odeeo.internal.t0.b0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class d implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59151c;

    public /* synthetic */ d(Object obj, int i10) {
        this.f59150b = i10;
        this.f59151c = obj;
    }

    @Override // io.odeeo.internal.t0.b0
    public final Object get() {
        switch (this.f59150b) {
            case 0:
                return ((j.b) this.f59151c).b();
            case 1:
                return j.b((Class) this.f59151c);
            case 2:
                return ((o.c) this.f59151c).b();
            case 3:
                return Boolean.valueOf(((AtomicBoolean) this.f59151c).get());
            default:
                return ((q) this.f59151c).j();
        }
    }
}
