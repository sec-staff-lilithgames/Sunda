package ku;

import iu.u;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f72032b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72033c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f72034e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f72035f;

    /* renamed from: g, reason: collision with root package name */
    public iu.b f72036g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f72037h;

    public m(i0 i0Var) {
        this(i0Var, false);
    }

    @Override // pt.c
    public void dispose() {
        this.f72034e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f72034e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f72037h) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f72037h) {
                    return;
                }
                if (!this.f72035f) {
                    this.f72037h = true;
                    this.f72035f = true;
                    this.f72032b.onComplete();
                } else {
                    iu.b bVar = this.f72036g;
                    if (bVar == null) {
                        bVar = new iu.b(4);
                        this.f72036g = bVar;
                    }
                    bVar.add(u.complete());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f72037h) {
            mu.a.onError(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f72037h) {
                    if (this.f72035f) {
                        this.f72037h = true;
                        iu.b bVar = this.f72036g;
                        if (bVar == null) {
                            bVar = new iu.b(4);
                            this.f72036g = bVar;
                        }
                        Object objError = u.error(th2);
                        if (this.f72033c) {
                            bVar.add(objError);
                        } else {
                            bVar.setFirst(objError);
                        }
                        return;
                    }
                    this.f72037h = true;
                    this.f72035f = true;
                    z10 = false;
                }
                if (z10) {
                    mu.a.onError(th2);
                } else {
                    this.f72032b.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        iu.b bVar;
        if (this.f72037h) {
            return;
        }
        if (obj == null) {
            this.f72034e.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f72037h) {
                    return;
                }
                if (this.f72035f) {
                    iu.b bVar2 = this.f72036g;
                    if (bVar2 == null) {
                        bVar2 = new iu.b(4);
                        this.f72036g = bVar2;
                    }
                    bVar2.add(u.next(obj));
                    return;
                }
                this.f72035f = true;
                this.f72032b.onNext(obj);
                do {
                    synchronized (this) {
                        try {
                            bVar = this.f72036g;
                            if (bVar == null) {
                                this.f72035f = false;
                                return;
                            }
                            this.f72036g = null;
                        } finally {
                        }
                    }
                } while (!bVar.accept(this.f72032b));
            } finally {
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f72034e, cVar)) {
            this.f72034e = cVar;
            this.f72032b.onSubscribe(this);
        }
    }

    public m(i0 i0Var, boolean z10) {
        this.f72032b = i0Var;
        this.f72033c = z10;
    }
}
