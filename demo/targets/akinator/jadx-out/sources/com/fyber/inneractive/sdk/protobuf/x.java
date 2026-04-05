package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final w f26524a;

    /* renamed from: b, reason: collision with root package name */
    public int f26525b;

    /* renamed from: c, reason: collision with root package name */
    public int f26526c;

    /* renamed from: d, reason: collision with root package name */
    public int f26527d = 0;

    public x(w wVar) {
        Charset charset = l1.f26429a;
        if (wVar == null) {
            throw new NullPointerException("input");
        }
        this.f26524a = wVar;
        wVar.f26513d = this;
    }

    public static void c(int i10) throws n1 {
        if ((i10 & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) throws m1 {
        b(3);
        return c(p2.f26452c.a(cls), h0Var);
    }

    public final void b(int i10) throws m1 {
        if ((this.f26525b & 7) == i10) {
            return;
        }
        int i11 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() throws m1 {
        b(0);
        return this.f26524a.k();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.f26525b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() throws m1 {
        b(0);
        return this.f26524a.v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() throws m1 {
        b(1);
        return this.f26524a.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() throws m1 {
        b(1);
        return this.f26524a.f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean i() {
        int i10;
        if (this.f26524a.c() || (i10 = this.f26525b) == this.f26526c) {
            return false;
        }
        return this.f26524a.e(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() throws m1 {
        b(0);
        return this.f26524a.p();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() throws m1 {
        b(5);
        return this.f26524a.j();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() throws m1 {
        b(0);
        return this.f26524a.q();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() throws m1 {
        b(5);
        return this.f26524a.n();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() throws m1 {
        b(2);
        return this.f26524a.r();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() throws m1 {
        b(0);
        return this.f26524a.l();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() throws m1 {
        b(2);
        return this.f26524a.s();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() throws m1 {
        b(5);
        return this.f26524a.h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() throws m1 {
        b(0);
        return this.f26524a.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() {
        int i10 = this.f26527d;
        if (i10 != 0) {
            this.f26525b = i10;
            this.f26527d = 0;
        } else {
            this.f26525b = this.f26524a.t();
        }
        int i11 = this.f26525b;
        if (i11 == 0 || i11 == this.f26526c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() throws m1 {
        b(1);
        return this.f26524a.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) throws n1 {
        int iT;
        int iT2;
        if (!(list instanceof a1)) {
            int i10 = this.f26525b & 7;
            if (i10 == 2) {
                int iU = this.f26524a.u();
                c(iU);
                int iB = this.f26524a.b() + iU;
                do {
                    list.add(Integer.valueOf(this.f26524a.h()));
                } while (this.f26524a.b() < iB);
                return;
            }
            if (i10 != 5) {
                int i11 = n1.f26441a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(this.f26524a.h()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        a1 a1Var = (a1) list;
        int i12 = this.f26525b & 7;
        if (i12 == 2) {
            int iU2 = this.f26524a.u();
            c(iU2);
            int iB2 = this.f26524a.b() + iU2;
            do {
                a1Var.c(this.f26524a.h());
            } while (this.f26524a.b() < iB2);
            return;
        }
        if (i12 != 5) {
            int i13 = n1.f26441a;
            throw new m1();
        }
        do {
            a1Var.c(this.f26524a.h());
            if (this.f26524a.c()) {
                return;
            } else {
                iT2 = this.f26524a.t();
            }
        } while (iT2 == this.f26525b);
        this.f26527d = iT2;
    }

    public static void d(int i10) throws n1 {
        if ((i10 & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i10 = this.f26526c;
        this.f26526c = ((this.f26525b >>> 3) << 3) | 4;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f26525b == this.f26526c) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f26526c = i10;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 2) {
                int iU = this.f26524a.u();
                c(iU);
                int iB = this.f26524a.b() + iU;
                do {
                    a1Var.c(this.f26524a.n());
                } while (this.f26524a.b() < iB);
                return;
            }
            if (i10 == 5) {
                do {
                    a1Var.c(this.f26524a.n());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 2) {
            int iU2 = this.f26524a.u();
            c(iU2);
            int iB2 = this.f26524a.b() + iU2;
            do {
                list.add(Integer.valueOf(this.f26524a.n()));
            } while (this.f26524a.b() < iB2);
            return;
        }
        if (i12 == 5) {
            do {
                list.add(Integer.valueOf(this.f26524a.n()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 0) {
                do {
                    u1Var.a(this.f26524a.q());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f26524a.b() + this.f26524a.u();
                do {
                    u1Var.a(this.f26524a.q());
                } while (this.f26524a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 0) {
            do {
                list.add(Long.valueOf(this.f26524a.q()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f26524a.b() + this.f26524a.u();
            do {
                list.add(Long.valueOf(this.f26524a.q()));
            } while (this.f26524a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) throws m1 {
        int iT;
        if ((this.f26525b & 7) == 2) {
            do {
                b(2);
                list.add(this.f26524a.e());
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        int i10 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 0) {
                do {
                    a1Var.c(this.f26524a.u());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f26524a.b() + this.f26524a.u();
                do {
                    a1Var.c(this.f26524a.u());
                } while (this.f26524a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.f26524a.u()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f26524a.b() + this.f26524a.u();
            do {
                list.add(Integer.valueOf(this.f26524a.u()));
            } while (this.f26524a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int i10 = this.f26525b & 7;
            if (i10 == 1) {
                do {
                    d0Var.a(this.f26524a.f());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iU = this.f26524a.u();
                d(iU);
                int iB = this.f26524a.b() + iU;
                do {
                    d0Var.a(this.f26524a.f());
                } while (this.f26524a.b() < iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 1) {
            do {
                list.add(Double.valueOf(this.f26524a.f()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iU2 = this.f26524a.u();
            d(iU2);
            int iB2 = this.f26524a.b() + iU2;
            do {
                list.add(Double.valueOf(this.f26524a.f()));
            } while (this.f26524a.b() < iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 0) {
                do {
                    u1Var.a(this.f26524a.l());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f26524a.b() + this.f26524a.u();
                do {
                    u1Var.a(this.f26524a.l());
                } while (this.f26524a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 0) {
            do {
                list.add(Long.valueOf(this.f26524a.l()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f26524a.b() + this.f26524a.u();
            do {
                list.add(Long.valueOf(this.f26524a.l()));
            } while (this.f26524a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof j) {
            j jVar = (j) list;
            int i10 = this.f26525b & 7;
            if (i10 == 0) {
                do {
                    jVar.a(this.f26524a.d());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f26524a.b() + this.f26524a.u();
                do {
                    jVar.a(this.f26524a.d());
                } while (this.f26524a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 0) {
            do {
                list.add(Boolean.valueOf(this.f26524a.d()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f26524a.b() + this.f26524a.u();
            do {
                list.add(Boolean.valueOf(this.f26524a.d()));
            } while (this.f26524a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 1) {
                do {
                    u1Var.a(this.f26524a.o());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iU = this.f26524a.u();
                d(iU);
                int iB = this.f26524a.b() + iU;
                do {
                    u1Var.a(this.f26524a.o());
                } while (this.f26524a.b() < iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 1) {
            do {
                list.add(Long.valueOf(this.f26524a.o()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iU2 = this.f26524a.u();
            d(iU2);
            int iB2 = this.f26524a.b() + iU2;
            do {
                list.add(Long.valueOf(this.f26524a.o()));
            } while (this.f26524a.b() < iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 1) {
                do {
                    u1Var.a(this.f26524a.i());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iU = this.f26524a.u();
                d(iU);
                int iB = this.f26524a.b() + iU;
                do {
                    u1Var.a(this.f26524a.i());
                } while (this.f26524a.b() < iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 1) {
            do {
                list.add(Long.valueOf(this.f26524a.i()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iU2 = this.f26524a.u();
            d(iU2);
            int iB2 = this.f26524a.b() + iU2;
            do {
                list.add(Long.valueOf(this.f26524a.i()));
            } while (this.f26524a.b() < iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 0) {
                do {
                    a1Var.c(this.f26524a.k());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f26524a.b() + this.f26524a.u();
                do {
                    a1Var.c(this.f26524a.k());
                } while (this.f26524a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.f26524a.k()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f26524a.b() + this.f26524a.u();
            do {
                list.add(Integer.valueOf(this.f26524a.k()));
            } while (this.f26524a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 0) {
                do {
                    a1Var.c(this.f26524a.g());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f26524a.b() + this.f26524a.u();
                do {
                    a1Var.c(this.f26524a.g());
                } while (this.f26524a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.f26524a.g()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f26524a.b() + this.f26524a.u();
            do {
                list.add(Integer.valueOf(this.f26524a.g()));
            } while (this.f26524a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) throws m1 {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) throws m1 {
        b(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) throws m1 {
        b(2);
        return d(p2.f26452c.a(cls), h0Var);
    }

    public final Object d(t2 t2Var, h0 h0Var) throws n1 {
        int iU = this.f26524a.u();
        w wVar = this.f26524a;
        if (wVar.f26510a < wVar.f26511b) {
            int iD = wVar.d(iU);
            Object objA = t2Var.a();
            this.f26524a.f26510a++;
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            this.f26524a.a(0);
            r5.f26510a--;
            this.f26524a.c(iD);
            return objA;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() throws m1 {
        b(2);
        return this.f26524a.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 0) {
                do {
                    u1Var.a(this.f26524a.v());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f26524a.b() + this.f26524a.u();
                do {
                    u1Var.a(this.f26524a.v());
                } while (this.f26524a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 0) {
            do {
                list.add(Long.valueOf(this.f26524a.v()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f26524a.b() + this.f26524a.u();
            do {
                list.add(Long.valueOf(this.f26524a.v()));
            } while (this.f26524a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) throws m1 {
        b(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() throws m1 {
        b(0);
        return this.f26524a.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) throws m1 {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) throws m1 {
        int iT;
        int i10 = this.f26525b;
        if ((i10 & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (this.f26524a.c() || this.f26527d != 0) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == i10);
            this.f26527d = iT;
            return;
        }
        int i11 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() throws m1 {
        b(0);
        return this.f26524a.u();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i10 = this.f26525b & 7;
            if (i10 == 0) {
                do {
                    a1Var.c(this.f26524a.p());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            if (i10 == 2) {
                int iB = this.f26524a.b() + this.f26524a.u();
                do {
                    a1Var.c(this.f26524a.p());
                } while (this.f26524a.b() < iB);
                a(iB);
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 0) {
            do {
                list.add(Integer.valueOf(this.f26524a.p()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        if (i12 == 2) {
            int iB2 = this.f26524a.b() + this.f26524a.u();
            do {
                list.add(Integer.valueOf(this.f26524a.p()));
            } while (this.f26524a.b() < iB2);
            a(iB2);
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) throws n1 {
        int iT;
        int iT2;
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            int i10 = this.f26525b & 7;
            if (i10 == 2) {
                int iU = this.f26524a.u();
                c(iU);
                int iB = this.f26524a.b() + iU;
                do {
                    q0Var.a(this.f26524a.j());
                } while (this.f26524a.b() < iB);
                return;
            }
            if (i10 == 5) {
                do {
                    q0Var.a(this.f26524a.j());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            int i11 = n1.f26441a;
            throw new m1();
        }
        int i12 = this.f26525b & 7;
        if (i12 == 2) {
            int iU2 = this.f26524a.u();
            c(iU2);
            int iB2 = this.f26524a.b() + iU2;
            do {
                list.add(Float.valueOf(this.f26524a.j()));
            } while (this.f26524a.b() < iB2);
            return;
        }
        if (i12 == 5) {
            do {
                list.add(Float.valueOf(this.f26524a.j()));
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        int i13 = n1.f26441a;
        throw new m1();
    }

    public final void a(List list, boolean z10) throws m1 {
        String strR;
        int iT;
        int iT2;
        if ((this.f26525b & 7) == 2) {
            if ((list instanceof q1) && !z10) {
                q1 q1Var = (q1) list;
                do {
                    b(2);
                    q1Var.a(this.f26524a.e());
                    if (this.f26524a.c()) {
                        return;
                    } else {
                        iT2 = this.f26524a.t();
                    }
                } while (iT2 == this.f26525b);
                this.f26527d = iT2;
                return;
            }
            do {
                if (z10) {
                    b(2);
                    strR = this.f26524a.s();
                } else {
                    b(2);
                    strR = this.f26524a.r();
                }
                list.add(strR);
                if (this.f26524a.c()) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == this.f26525b);
            this.f26527d = iT;
            return;
        }
        int i10 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) throws m1 {
        int iT;
        int i10 = this.f26525b;
        if ((i10 & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (this.f26524a.c() || this.f26527d != 0) {
                    return;
                } else {
                    iT = this.f26524a.t();
                }
            } while (iT == i10);
            this.f26527d = iT;
            return;
        }
        int i11 = n1.f26441a;
        throw new m1();
    }

    public final void a(int i10) throws n1 {
        if (this.f26524a.b() != i10) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
