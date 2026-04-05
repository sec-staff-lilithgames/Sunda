package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public double f11676a;

    /* renamed from: b, reason: collision with root package name */
    public double f11677b;

    public y(double d10, double d11) {
        this.f11676a = d10;
        this.f11677b = d11;
    }

    public static /* synthetic */ y copy$default(y yVar, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = yVar.f11676a;
        }
        if ((i10 & 2) != 0) {
            d11 = yVar.f11677b;
        }
        return yVar.copy(d10, d11);
    }

    public final y copy(double d10, double d11) {
        return new y(d10, d11);
    }

    public final y div(double d10) {
        this.f11676a /= d10;
        this.f11677b /= d10;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.e0.areEqual((Object) Double.valueOf(this.f11676a), (Object) Double.valueOf(yVar.f11676a)) && kotlin.jvm.internal.e0.areEqual((Object) Double.valueOf(this.f11677b), (Object) Double.valueOf(yVar.f11677b));
    }

    public final double getImaginary() {
        return this.f11677b;
    }

    public final double getReal() {
        return this.f11676a;
    }

    public int hashCode() {
        return Double.hashCode(this.f11677b) + (Double.hashCode(this.f11676a) * 31);
    }

    public final y minus(double d10) {
        this.f11676a += -d10;
        return this;
    }

    public final y plus(double d10) {
        this.f11676a += d10;
        return this;
    }

    public final y times(double d10) {
        this.f11676a *= d10;
        this.f11677b *= d10;
        return this;
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f11676a + ", _imaginary=" + this.f11677b + ')';
    }

    public final y unaryMinus() {
        double d10 = -1;
        this.f11676a *= d10;
        this.f11677b *= d10;
        return this;
    }

    public final y minus(y other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        double d10 = -1;
        other.f11676a *= d10;
        other.f11677b *= d10;
        this.f11676a = other.getReal() + this.f11676a;
        this.f11677b = other.getImaginary() + this.f11677b;
        return this;
    }

    public final y plus(y other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        this.f11676a = other.getReal() + this.f11676a;
        this.f11677b = other.getImaginary() + this.f11677b;
        return this;
    }

    public final y times(y other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        this.f11676a = (other.getReal() * getReal()) - (other.getImaginary() * getImaginary());
        this.f11677b = (getImaginary() * other.getReal()) + (other.getImaginary() * getReal());
        return this;
    }
}
