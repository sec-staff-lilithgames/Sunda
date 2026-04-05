package v4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f89036a;

    /* renamed from: b, reason: collision with root package name */
    public final long f89037b;

    public f(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }

    public double calculate() {
        return this.f89036a / this.f89037b;
    }

    public String toString() {
        return this.f89036a + "/" + this.f89037b;
    }

    public f(long j10, long j11) {
        if (j11 == 0) {
            this.f89036a = 0L;
            this.f89037b = 1L;
        } else {
            this.f89036a = j10;
            this.f89037b = j11;
        }
    }
}
