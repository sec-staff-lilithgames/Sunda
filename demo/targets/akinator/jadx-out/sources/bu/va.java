package bu;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class va extends ArrayDeque implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11126b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11127c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f11128e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f11129f;

    public va(mt.i0 i0Var, int i10) {
        this.f11126b = i0Var;
        this.f11127c = i10;
    }

    @Override // pt.c
    public void dispose() {
        if (this.f11129f) {
            return;
        }
        this.f11129f = true;
        this.f11128e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11129f;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        mt.i0 i0Var = this.f11126b;
        while (!this.f11129f) {
            Object objPoll = poll();
            if (objPoll == null) {
                if (this.f11129f) {
                    return;
                }
                i0Var.onComplete();
                return;
            }
            i0Var.onNext(objPoll);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11126b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f11127c == size()) {
            poll();
        }
        offer(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11128e, cVar)) {
            this.f11128e = cVar;
            this.f11126b.onSubscribe(this);
        }
    }
}
