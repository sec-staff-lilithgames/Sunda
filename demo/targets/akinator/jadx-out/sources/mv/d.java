package mv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d extends c {
    public static final double acosh(double d10) {
        if (d10 < 1.0d) {
            return Double.NaN;
        }
        if (d10 > a.f74959d) {
            return Math.log(d10) + a.f74956a;
        }
        double d11 = 1;
        double d12 = d10 - d11;
        if (d12 >= a.f74958c) {
            return Math.log(Math.sqrt((d10 * d10) - d11) + d10);
        }
        double dSqrt = Math.sqrt(d12);
        if (dSqrt >= a.f74957b) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / 12;
        }
        return Math.sqrt(2.0d) * dSqrt;
    }

    public static final double asinh(double d10) {
        double d11 = a.f74958c;
        if (d10 < d11) {
            return d10 <= (-d11) ? -asinh(-d10) : Math.abs(d10) >= a.f74957b ? d10 - (((d10 * d10) * d10) / 6) : d10;
        }
        if (d10 <= a.f74960e) {
            return Math.log(Math.sqrt((d10 * d10) + 1) + d10);
        }
        if (d10 > a.f74959d) {
            return Math.log(d10) + a.f74956a;
        }
        double d12 = d10 * 2;
        return Math.log((1 / d12) + d12);
    }

    public static final double atanh(double d10) {
        if (Math.abs(d10) < a.f74958c) {
            return Math.abs(d10) > a.f74957b ? (((d10 * d10) * d10) / 3) + d10 : d10;
        }
        double d11 = 1;
        return Math.log((d11 + d10) / (d11 - d10)) / 2;
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(double d10) {
    }

    public static int getSign(int i10) {
        return Integer.signum(i10);
    }

    public static /* synthetic */ void getSign$annotations(double d10) {
    }

    public static /* synthetic */ void getUlp$annotations(double d10) {
    }

    public static final double log(double d10, double d11) {
        if (d11 <= 0.0d || d11 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d10) / Math.log(d11);
    }

    public static final double log2(double d10) {
        return Math.log(d10) / a.f74956a;
    }

    public static int roundToInt(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    public static long roundToLong(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    public static final double truncate(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10)) ? d10 : d10 > 0.0d ? Math.floor(d10) : Math.ceil(d10);
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(float f10) {
    }

    public static int getSign(long j10) {
        return Long.signum(j10);
    }

    public static /* synthetic */ void getSign$annotations(float f10) {
    }

    public static /* synthetic */ void getUlp$annotations(float f10) {
    }

    public static final float log(float f10, float f11) {
        if (f11 <= 0.0f || f11 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f10) / Math.log(f11));
    }

    public static final float log2(float f10) {
        return (float) (Math.log(f10) / a.f74956a);
    }

    public static final long roundToLong(float f10) {
        return roundToLong(f10);
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(int i10) {
    }

    public static /* synthetic */ void getSign$annotations(int i10) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(long j10) {
    }

    public static /* synthetic */ void getSign$annotations(long j10) {
    }

    public static int roundToInt(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static final float truncate(float f10) {
        double dCeil;
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            return f10;
        }
        if (f10 > 0.0f) {
            dCeil = Math.floor(f10);
        } else {
            dCeil = Math.ceil(f10);
        }
        return (float) dCeil;
    }
}
