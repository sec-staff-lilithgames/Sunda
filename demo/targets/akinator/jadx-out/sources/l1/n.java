package l1;

import b0.e2;
import j1.l2;
import j1.m1;
import j1.n2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends j {

    /* renamed from: f, reason: collision with root package name */
    public static final a f72235f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f72236g = l2.f68912b.m4802getButtKaPHkGw();

    /* renamed from: h, reason: collision with root package name */
    public static final int f72237h = n2.f68936b.m4870getMiterLxFBmk8();

    /* renamed from: a, reason: collision with root package name */
    public final float f72238a;

    /* renamed from: b, reason: collision with root package name */
    public final float f72239b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72240c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72241d;

    /* renamed from: e, reason: collision with root package name */
    public final m1 f72242e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        /* renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m5421getDefaultCapKaPHkGw() {
            return n.f72236g;
        }

        /* renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m5422getDefaultJoinLxFBmk8() {
            return n.f72237h;
        }
    }

    public /* synthetic */ n(float f10, float f11, int i10, int i11, m1 m1Var, int i12, u uVar) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? l2.f68912b.m4802getButtKaPHkGw() : i10, (i12 & 8) != 0 ? n2.f68936b.m4870getMiterLxFBmk8() : i11, (i12 & 16) != 0 ? null : m1Var, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f72238a == nVar.f72238a && this.f72239b == nVar.f72239b && l2.m4844equalsimpl0(this.f72240c, nVar.f72240c) && n2.m4881equalsimpl0(this.f72241d, nVar.f72241d) && e0.areEqual(this.f72242e, nVar.f72242e);
    }

    /* renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m5419getCapKaPHkGw() {
        return this.f72240c;
    }

    /* renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m5420getJoinLxFBmk8() {
        return this.f72241d;
    }

    public final float getMiter() {
        return this.f72239b;
    }

    public final m1 getPathEffect() {
        return this.f72242e;
    }

    public final float getWidth() {
        return this.f72238a;
    }

    public int hashCode() {
        int iM4882hashCodeimpl = (n2.m4882hashCodeimpl(this.f72241d) + ((l2.m4845hashCodeimpl(this.f72240c) + e2.b(this.f72239b, Float.hashCode(this.f72238a) * 31, 31)) * 31)) * 31;
        m1 m1Var = this.f72242e;
        return iM4882hashCodeimpl + (m1Var != null ? m1Var.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.f72238a + ", miter=" + this.f72239b + ", cap=" + ((Object) l2.m4846toStringimpl(this.f72240c)) + ", join=" + ((Object) n2.m4883toStringimpl(this.f72241d)) + ", pathEffect=" + this.f72242e + ')';
    }

    public n(float f10, float f11, int i10, int i11, m1 m1Var, u uVar) {
        super(null);
        this.f72238a = f10;
        this.f72239b = f11;
        this.f72240c = i10;
        this.f72241d = i11;
        this.f72242e = m1Var;
    }
}
