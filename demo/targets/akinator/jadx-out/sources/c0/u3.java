package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u3 implements o3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11636a;

    /* renamed from: b, reason: collision with root package name */
    public final n3 f11637b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f11638c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11639d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11640e;

    public u3(int i10, n3 n3Var, y0 y0Var, long j10, kotlin.jvm.internal.u uVar) {
        this.f11636a = i10;
        this.f11637b = n3Var;
        this.f11638c = y0Var;
        if (i10 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.f11639d = (n3Var.getDurationMillis() + n3Var.getDelayMillis()) * 1000000;
        this.f11640e = j10 * 1000000;
    }

    public final long a(long j10) {
        long j11 = this.f11640e;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f11639d;
        long jMin = Math.min(j12 / j13, this.f11636a - 1);
        return (this.f11638c == y0.f11678b || jMin % ((long) 2) == 0) ? j12 - (jMin * j13) : ((jMin + 1) * j13) - j12;
    }

    @Override // c0.o3, c0.i3
    public long getDurationNanos(v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (this.f11636a * this.f11639d) - this.f11640e;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.f11639d;
    }

    @Override // c0.o3, c0.i3
    public /* bridge */ /* synthetic */ v getEndVelocity(v vVar, v vVar2, v vVar3) {
        return super.getEndVelocity(vVar, vVar2, vVar3);
    }

    @Override // c0.o3, c0.i3
    public v getValueFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        long jA = a(j10);
        long j11 = this.f11640e;
        long j12 = j10 + j11;
        long j13 = this.f11639d;
        return this.f11637b.getValueFromNanos(jA, initialValue, targetValue, j12 > j13 ? getVelocityFromNanos(j13 - j11, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    @Override // c0.o3, c0.i3
    public v getVelocityFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        long jA = a(j10);
        long j11 = this.f11640e;
        long j12 = j10 + j11;
        long j13 = this.f11639d;
        return this.f11637b.getVelocityFromNanos(jA, initialValue, targetValue, j12 > j13 ? getVelocityFromNanos(j13 - j11, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    @Override // c0.o3, c0.i3
    public /* bridge */ /* synthetic */ boolean isInfinite() {
        return super.isInfinite();
    }

    public /* synthetic */ u3(int i10, n3 n3Var, y0 y0Var, long j10, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, n3Var, (i11 & 4) != 0 ? y0.f11678b : y0Var, (i11 & 8) != 0 ? j1.m161constructorimpl$default(0, 0, 2, null) : j10, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ u3(int i10, n3 n3Var, y0 y0Var, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, n3Var, (i11 & 4) != 0 ? y0.f11678b : y0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public /* synthetic */ u3(int i10, n3 animation, y0 repeatMode) {
        this(i10, animation, repeatMode, j1.m161constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.u) null);
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        kotlin.jvm.internal.e0.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
