package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r7 extends AtomicReference implements Runnable, st.g {

    /* renamed from: b, reason: collision with root package name */
    public final t7 f10909b;

    /* renamed from: c, reason: collision with root package name */
    public tt.h f10910c;

    /* renamed from: e, reason: collision with root package name */
    public long f10911e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10912f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10913g;

    public r7(t7 t7Var) {
        this.f10909b = t7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10909b.e(this);
    }

    @Override // st.g
    public void accept(pt.c cVar) throws Exception {
        tt.d.replace(this, cVar);
        synchronized (this.f10909b) {
            try {
                if (this.f10913g) {
                    ((tt.g) this.f10909b.f11039b).resetIf(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
