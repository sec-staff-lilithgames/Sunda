package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v3 implements n3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11647a;

    public v3() {
        this(0, 1, null);
    }

    @Override // c0.n3
    public int getDelayMillis() {
        return this.f11647a;
    }

    @Override // c0.n3
    public int getDurationMillis() {
        return 0;
    }

    @Override // c0.n3, c0.o3, c0.i3
    public /* bridge */ /* synthetic */ long getDurationNanos(v vVar, v vVar2, v vVar3) {
        return super.getDurationNanos(vVar, vVar2, vVar3);
    }

    @Override // c0.n3, c0.o3, c0.i3
    public /* bridge */ /* synthetic */ v getEndVelocity(v vVar, v vVar2, v vVar3) {
        return super.getEndVelocity(vVar, vVar2, vVar3);
    }

    @Override // c0.n3, c0.o3, c0.i3
    public v getValueFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return j10 < ((long) getDelayMillis()) * 1000000 ? initialValue : targetValue;
    }

    @Override // c0.n3, c0.o3, c0.i3
    public v getVelocityFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return initialVelocity;
    }

    @Override // c0.n3, c0.o3, c0.i3
    public /* bridge */ /* synthetic */ boolean isInfinite() {
        return super.isInfinite();
    }

    public v3(int i10) {
        this.f11647a = i10;
    }

    public /* synthetic */ v3(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
