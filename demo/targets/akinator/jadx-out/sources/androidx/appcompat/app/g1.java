package androidx.appcompat.app;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: d, reason: collision with root package name */
    public static g1 f4740d;

    /* renamed from: a, reason: collision with root package name */
    public long f4741a;

    /* renamed from: b, reason: collision with root package name */
    public long f4742b;

    /* renamed from: c, reason: collision with root package name */
    public int f4743c;

    public void calculateTwilight(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d11) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d13 = 0.01745329238474369d * d10;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d13))) / (Math.cos(dAsin) * Math.cos(d13));
        if (dSin3 >= 1.0d) {
            this.f4743c = 1;
            this.f4741a = -1L;
            this.f4742b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f4743c = 0;
                this.f4741a = -1L;
                this.f4742b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f4741a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f4742b = jRound;
            if (jRound >= j10 || this.f4741a <= j10) {
                this.f4743c = 1;
            } else {
                this.f4743c = 0;
            }
        }
    }
}
