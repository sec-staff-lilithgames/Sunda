package bu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class qd extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.b0 f10876b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable f10877c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f10878e;

    public qd(mt.b0 b0Var, Iterable<Object> iterable, st.c cVar) {
        this.f10876b = b0Var;
        this.f10877c = iterable;
        this.f10878e = cVar;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        try {
            Iterator it = (Iterator) ut.o0.requireNonNull(this.f10877c.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    tt.e.complete(i0Var);
                } else {
                    this.f10876b.subscribe(new pd(i0Var, it, this.f10878e));
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                tt.e.error(th2, i0Var);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            tt.e.error(th3, i0Var);
        }
    }
}
