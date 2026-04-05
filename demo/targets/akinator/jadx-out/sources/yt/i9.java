package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i9 extends AtomicReference implements Runnable, st.g {

    /* renamed from: b, reason: collision with root package name */
    public final k9 f95678b;

    /* renamed from: c, reason: collision with root package name */
    public tt.h f95679c;

    /* renamed from: e, reason: collision with root package name */
    public long f95680e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95681f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95682g;

    public i9(k9 k9Var) {
        this.f95678b = k9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f95678b.f(this);
    }

    @Override // st.g
    public void accept(pt.c cVar) throws Exception {
        tt.d.replace(this, cVar);
        synchronized (this.f95678b) {
            try {
                if (this.f95682g) {
                    ((tt.g) this.f95678b.f95814c).resetIf(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
