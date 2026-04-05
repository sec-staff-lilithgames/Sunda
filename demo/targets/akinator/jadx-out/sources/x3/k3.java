package x3;

import android.graphics.Rect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f91618a;

    /* renamed from: b, reason: collision with root package name */
    public o3.c[] f91619b;

    public k3() {
        this(new e3((e3) null));
    }

    public final void a() {
        o3.c[] cVarArr = this.f91619b;
        if (cVarArr != null) {
            o3.c insets = cVarArr[0];
            o3.c insets2 = cVarArr[1];
            e3 e3Var = this.f91618a;
            if (insets2 == null) {
                insets2 = e3Var.getInsets(2);
            }
            if (insets == null) {
                insets = e3Var.getInsets(1);
            }
            k(o3.c.max(insets, insets2));
            o3.c cVar = this.f91619b[t3.a(16)];
            if (cVar != null) {
                j(cVar);
            }
            o3.c cVar2 = this.f91619b[t3.a(32)];
            if (cVar2 != null) {
                f(cVar2);
            }
            o3.c cVar3 = this.f91619b[t3.a(64)];
            if (cVar3 != null) {
                l(cVar3);
            }
        }
    }

    public abstract e3 b();

    public void d(int i10, o3.c cVar) {
        if (this.f91619b == null) {
            this.f91619b = new o3.c[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f91619b[t3.a(i11)] = cVar;
            }
        }
    }

    public void e(int i10, o3.c cVar) {
        if (i10 == 8) {
            throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
        }
    }

    public abstract void i(o3.c cVar);

    public abstract void k(o3.c cVar);

    public k3(e3 e3Var) {
        this.f91618a = e3Var;
    }

    public void c(s sVar) {
    }

    public void f(o3.c cVar) {
    }

    public void g(Rect rect) {
    }

    public void j(o3.c cVar) {
    }

    public void l(o3.c cVar) {
    }

    public void h(int i10, v0 v0Var) {
    }

    public void m(int i10, boolean z10) {
    }
}
