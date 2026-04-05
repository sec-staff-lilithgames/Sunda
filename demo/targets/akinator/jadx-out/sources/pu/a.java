package pu;

import iu.u;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements pt.c, iu.a {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f81823b;

    /* renamed from: c, reason: collision with root package name */
    public final b f81824c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f81825e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f81826f;

    /* renamed from: g, reason: collision with root package name */
    public iu.b f81827g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f81828h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f81829i;

    /* renamed from: j, reason: collision with root package name */
    public long f81830j;

    public a(i0 i0Var, b bVar) {
        this.f81823b = i0Var;
        this.f81824c = bVar;
    }

    public final void a(long j10, Object obj) {
        if (this.f81829i) {
            return;
        }
        if (!this.f81828h) {
            synchronized (this) {
                try {
                    if (this.f81829i) {
                        return;
                    }
                    if (this.f81830j == j10) {
                        return;
                    }
                    if (this.f81826f) {
                        iu.b bVar = this.f81827g;
                        if (bVar == null) {
                            bVar = new iu.b(4);
                            this.f81827g = bVar;
                        }
                        bVar.add(obj);
                        return;
                    }
                    this.f81825e = true;
                    this.f81828h = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        test(obj);
    }

    @Override // pt.c
    public void dispose() {
        if (this.f81829i) {
            return;
        }
        this.f81829i = true;
        this.f81824c.d(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f81829i;
    }

    @Override // iu.a, st.q
    public boolean test(Object obj) {
        return this.f81829i || u.accept(obj, this.f81823b);
    }
}
