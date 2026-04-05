package io.bidmachine.media3.common.util;

import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final v f60708a;

    /* renamed from: b, reason: collision with root package name */
    public final v f60709b;

    /* renamed from: c, reason: collision with root package name */
    public final d f60710c;

    /* renamed from: d, reason: collision with root package name */
    public Object f60711d;

    /* renamed from: e, reason: collision with root package name */
    public Object f60712e;

    /* renamed from: f, reason: collision with root package name */
    public int f60713f;

    public e(Object obj, Looper looper, Looper looper2, g gVar, d dVar) {
        q0 q0Var = (q0) gVar;
        this.f60708a = q0Var.createHandler(looper, null);
        this.f60709b = q0Var.createHandler(looper2, null);
        this.f60711d = obj;
        this.f60712e = obj;
        this.f60710c = dVar;
    }

    public Object get() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f60709b.getLooper()) {
            return this.f60711d;
        }
        a.checkState(looperMyLooper == this.f60708a.getLooper());
        return this.f60712e;
    }

    public void runInBackground(Runnable runnable) {
        this.f60708a.post(runnable);
    }

    public void setStateInBackground(Object obj) {
        this.f60712e = obj;
        this.f60709b.post(new c(this, obj, 0));
    }

    public void updateStateAsync(mh.v0 v0Var, mh.v0 v0Var2) {
        a.checkState(Looper.myLooper() == this.f60709b.getLooper());
        this.f60713f++;
        this.f60708a.post(new f0(2, this, v0Var2));
        Object objApply = v0Var.apply(this.f60711d);
        Object obj = this.f60711d;
        this.f60711d = objApply;
        if (obj.equals(objApply)) {
            return;
        }
        this.f60710c.onStateChanged(obj, objApply);
    }
}
