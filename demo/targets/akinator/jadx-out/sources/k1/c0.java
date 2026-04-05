package k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final double f70014a;

    /* renamed from: b, reason: collision with root package name */
    public final double f70015b;

    /* renamed from: c, reason: collision with root package name */
    public final double f70016c;

    /* renamed from: d, reason: collision with root package name */
    public final double f70017d;

    /* renamed from: e, reason: collision with root package name */
    public final double f70018e;

    /* renamed from: f, reason: collision with root package name */
    public final double f70019f;

    /* renamed from: g, reason: collision with root package name */
    public final double f70020g;

    public c0(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f70014a = d10;
        this.f70015b = d11;
        this.f70016c = d12;
        this.f70017d = d13;
        this.f70018e = d14;
        this.f70019f = d15;
        this.f70020g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double component1() {
        return this.f70014a;
    }

    public final double component2() {
        return this.f70015b;
    }

    public final double component3() {
        return this.f70016c;
    }

    public final double component4() {
        return this.f70017d;
    }

    public final double component5() {
        return this.f70018e;
    }

    public final double component6() {
        return this.f70019f;
    }

    public final double component7() {
        return this.f70020g;
    }

    public final c0 copy(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        return new c0(d10, d11, d12, d13, d14, d15, d16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.e0.areEqual((Object) Double.valueOf(this.f70014a), (Object) Double.valueOf(c0Var.f70014a)) && kotlin.jvm.internal.e0.areEqual((Object) Double.valueOf(this.f70015b), (Object) Double.valueOf(c0Var.f70015b)) && kotlin.jvm.internal.e0.areEqual((Object) Double.valueOf(this.f70016c), (Object) Double.valueOf(c0Var.f70016c)) && kotlin.jvm.internal.e0.areEqual((Object) Double.valueOf(this.f70017d), (Object) Double.valueOf(c0Var.f70017d)) && kotlin.jvm.internal.e0.areEqual((Object) Double.valueOf(this.f70018e), (Object) Double.valueOf(c0Var.f70018e)) && kotlin.jvm.internal.e0.areEqual((Object) Double.valueOf(this.f70019f), (Object) Double.valueOf(c0Var.f70019f)) && kotlin.jvm.internal.e0.areEqual((Object) Double.valueOf(this.f70020g), (Object) Double.valueOf(c0Var.f70020g));
    }

    public final double getA() {
        return this.f70015b;
    }

    public final double getB() {
        return this.f70016c;
    }

    public final double getC() {
        return this.f70017d;
    }

    public final double getD() {
        return this.f70018e;
    }

    public final double getE() {
        return this.f70019f;
    }

    public final double getF() {
        return this.f70020g;
    }

    public final double getGamma() {
        return this.f70014a;
    }

    public int hashCode() {
        return Double.hashCode(this.f70020g) + ((Double.hashCode(this.f70019f) + ((Double.hashCode(this.f70018e) + ((Double.hashCode(this.f70017d) + ((Double.hashCode(this.f70016c) + ((Double.hashCode(this.f70015b) + (Double.hashCode(this.f70014a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f70014a + ", a=" + this.f70015b + ", b=" + this.f70016c + ", c=" + this.f70017d + ", d=" + this.f70018e + ", e=" + this.f70019f + ", f=" + this.f70020g + ')';
    }

    public /* synthetic */ c0(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, kotlin.jvm.internal.u uVar) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
