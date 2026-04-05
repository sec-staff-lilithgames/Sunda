package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z {
    public static final tu.v complexQuadraticFormula(double d10, double d11, double d12) {
        double d13 = -d11;
        double d14 = (d11 * d11) - ((4.0d * d10) * d12);
        y yVarComplexSqrt = complexSqrt(d14);
        yVarComplexSqrt.f11676a += d13;
        double d15 = d10 * 2.0d;
        yVarComplexSqrt.f11676a /= d15;
        yVarComplexSqrt.f11677b /= d15;
        y yVarComplexSqrt2 = complexSqrt(d14);
        double d16 = -1;
        yVarComplexSqrt2.f11676a *= d16;
        yVarComplexSqrt2.f11677b *= d16;
        yVarComplexSqrt2.f11676a += d13;
        yVarComplexSqrt2.f11676a /= d15;
        yVarComplexSqrt2.f11677b /= d15;
        return tu.e0.to(yVarComplexSqrt, yVarComplexSqrt2);
    }

    public static final y complexSqrt(double d10) {
        return d10 < 0.0d ? new y(0.0d, Math.sqrt(Math.abs(d10))) : new y(Math.sqrt(d10), 0.0d);
    }

    public static final y minus(double d10, y other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        double d11 = -1;
        other.f11676a *= d11;
        other.f11677b *= d11;
        other.f11676a += d10;
        return other;
    }

    public static final y plus(double d10, y other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        other.f11676a += d10;
        return other;
    }

    public static final y times(double d10, y other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        other.f11676a *= d10;
        other.f11677b *= d10;
        return other;
    }
}
