package bu;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class pd implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10817b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f10818c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f10819e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f10820f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10821g;

    public pd(mt.i0 i0Var, Iterator it, st.c cVar) {
        this.f10817b = i0Var;
        this.f10818c = it;
        this.f10819e = cVar;
    }

    @Override // pt.c
    public void dispose() {
        this.f10820f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10820f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10821g) {
            return;
        }
        this.f10821g = true;
        this.f10817b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10821g) {
            mu.a.onError(th2);
        } else {
            this.f10821g = true;
            this.f10817b.onError(th2);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        mt.i0 i0Var = this.f10817b;
        Iterator it = this.f10818c;
        if (this.f10821g) {
            return;
        }
        try {
            try {
                i0Var.onNext(ut.o0.requireNonNull(this.f10819e.apply(obj, ut.o0.requireNonNull(it.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                try {
                    if (it.hasNext()) {
                        return;
                    }
                    this.f10821g = true;
                    this.f10820f.dispose();
                    i0Var.onComplete();
                } catch (Throwable th2) {
                    qt.d.throwIfFatal(th2);
                    this.f10821g = true;
                    this.f10820f.dispose();
                    i0Var.onError(th2);
                }
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                this.f10821g = true;
                this.f10820f.dispose();
                i0Var.onError(th3);
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            this.f10821g = true;
            this.f10820f.dispose();
            i0Var.onError(th4);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10820f, cVar)) {
            this.f10820f = cVar;
            this.f10817b.onSubscribe(this);
        }
    }
}
