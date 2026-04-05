package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s3 implements i3 {

    /* renamed from: a, reason: collision with root package name */
    public final n3 f11609a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f11610b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11611c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11612d;

    public s3(n3 n3Var, y0 y0Var, long j10, kotlin.jvm.internal.u uVar) {
        this.f11609a = n3Var;
        this.f11610b = y0Var;
        this.f11611c = (n3Var.getDurationMillis() + n3Var.getDelayMillis()) * 1000000;
        this.f11612d = j10 * 1000000;
    }

    public final long a(long j10) {
        long j11 = this.f11612d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f11611c;
        long j14 = j12 / j13;
        return (this.f11610b == y0.f11678b || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    @Override // c0.i3
    public long getDurationNanos(v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return Long.MAX_VALUE;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.f11611c;
    }

    @Override // c0.i3
    public /* bridge */ /* synthetic */ v getEndVelocity(v vVar, v vVar2, v vVar3) {
        return super.getEndVelocity(vVar, vVar2, vVar3);
    }

    @Override // c0.i3
    public v getValueFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        long jA = a(j10);
        long j11 = this.f11612d;
        long j12 = j10 + j11;
        long j13 = this.f11611c;
        return this.f11609a.getValueFromNanos(jA, initialValue, targetValue, j12 > j13 ? getVelocityFromNanos(j13 - j11, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    @Override // c0.i3
    public v getVelocityFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        long jA = a(j10);
        long j11 = this.f11612d;
        long j12 = j10 + j11;
        long j13 = this.f11611c;
        return this.f11609a.getVelocityFromNanos(jA, initialValue, targetValue, j12 > j13 ? getVelocityFromNanos(j13 - j11, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    @Override // c0.i3
    public boolean isInfinite() {
        return true;
    }

    public /* synthetic */ s3(n3 n3Var, y0 y0Var, long j10, int i10, kotlin.jvm.internal.u uVar) {
        this(n3Var, (i10 & 2) != 0 ? y0.f11678b : y0Var, (i10 & 4) != 0 ? j1.m161constructorimpl$default(0, 0, 2, null) : j10, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ s3(n3 n3Var, y0 y0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(n3Var, (i10 & 2) != 0 ? y0.f11678b : y0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public /* synthetic */ s3(n3 animation, y0 repeatMode) {
        this(animation, repeatMode, j1.m161constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.u) null);
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        kotlin.jvm.internal.e0.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
