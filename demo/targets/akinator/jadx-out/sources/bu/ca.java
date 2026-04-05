package bu;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ca extends ArrayDeque implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10180c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10181e;

    public ca(mt.i0 i0Var, int i10) {
        super(i10);
        this.f10179b = i0Var;
        this.f10180c = i10;
    }

    @Override // pt.c
    public void dispose() {
        this.f10181e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10181e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10179b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10179b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10180c == size()) {
            this.f10179b.onNext(poll());
        }
        offer(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10181e, cVar)) {
            this.f10181e = cVar;
            this.f10179b.onSubscribe(this);
        }
    }
}
