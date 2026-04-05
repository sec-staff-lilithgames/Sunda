package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f8366a;

    /* renamed from: b, reason: collision with root package name */
    public final s2.e f8367b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8368c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f8369a;

        /* renamed from: b, reason: collision with root package name */
        public final float f8370b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8371c;

        public a(float f10, float f11, long j10) {
            this.f8369a = f10;
            this.f8370b = f11;
            this.f8371c = j10;
        }

        public static /* synthetic */ a copy$default(a aVar, float f10, float f11, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f8369a;
            }
            if ((i10 & 2) != 0) {
                f11 = aVar.f8370b;
            }
            if ((i10 & 4) != 0) {
                j10 = aVar.f8371c;
            }
            return aVar.copy(f10, f11, j10);
        }

        public final float component1() {
            return this.f8369a;
        }

        public final float component2() {
            return this.f8370b;
        }

        public final long component3() {
            return this.f8371c;
        }

        public final a copy(float f10, float f11, long j10) {
            return new a(f10, f11, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f8369a), (Object) Float.valueOf(aVar.f8369a)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f8370b), (Object) Float.valueOf(aVar.f8370b)) && this.f8371c == aVar.f8371c;
        }

        public final float getDistance() {
            return this.f8370b;
        }

        public final long getDuration() {
            return this.f8371c;
        }

        public final float getInitialVelocity() {
            return this.f8369a;
        }

        public int hashCode() {
            return Long.hashCode(this.f8371c) + e2.b(this.f8370b, Float.hashCode(this.f8369a) * 31, 31);
        }

        public final float position(long j10) {
            long j11 = this.f8371c;
            return b.f8331a.flingPosition(j11 > 0 ? j10 / j11 : 1.0f).getDistanceCoefficient() * Math.signum(this.f8369a) * this.f8370b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FlingInfo(initialVelocity=");
            sb2.append(this.f8369a);
            sb2.append(", distance=");
            sb2.append(this.f8370b);
            sb2.append(", duration=");
            return e3.g.n(sb2, this.f8371c, ')');
        }

        public final float velocity(long j10) {
            long j11 = this.f8371c;
            return (((Math.signum(this.f8369a) * b.f8331a.flingPosition(j11 > 0 ? j10 / j11 : 1.0f).getVelocityCoefficient()) * this.f8370b) / j11) * 1000.0f;
        }
    }

    public f2(float f10, s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        this.f8366a = f10;
        this.f8367b = density;
        this.f8368c = g2.access$computeDeceleration(0.84f, density.getDensity());
    }

    public final float flingDistance(float f10) {
        return (float) (Math.exp((g2.f8376a / (g2.f8376a - 1.0d)) * b.f8331a.deceleration(f10, this.f8366a * this.f8368c)) * r1 * r2);
    }

    public final long flingDuration(float f10) {
        return (long) (Math.exp(b.f8331a.deceleration(f10, this.f8366a * this.f8368c) / (g2.f8376a - 1.0d)) * 1000.0d);
    }

    public final a flingInfo(float f10) {
        double dDeceleration = b.f8331a.deceleration(f10, this.f8366a * this.f8368c);
        double d10 = g2.f8376a - 1.0d;
        return new a(f10, (float) (Math.exp((g2.f8376a / d10) * dDeceleration) * r1 * r2), (long) (Math.exp(dDeceleration / d10) * 1000.0d));
    }

    public final s2.e getDensity() {
        return this.f8367b;
    }
}
