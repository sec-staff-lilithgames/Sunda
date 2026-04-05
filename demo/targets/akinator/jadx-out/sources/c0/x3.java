package c0;

import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class x3 implements n3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11672a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11673b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f11674c;

    /* renamed from: d, reason: collision with root package name */
    public final q3 f11675d;

    public x3() {
        this(0, 0, null, 7, null);
    }

    @Override // c0.n3
    public int getDelayMillis() {
        return this.f11673b;
    }

    @Override // c0.n3
    public int getDurationMillis() {
        return this.f11672a;
    }

    @Override // c0.n3, c0.o3, c0.i3
    public /* bridge */ /* synthetic */ long getDurationNanos(v vVar, v vVar2, v vVar3) {
        return super.getDurationNanos(vVar, vVar2, vVar3);
    }

    public final g0 getEasing() {
        return this.f11674c;
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
        return this.f11675d.getValueFromNanos(j10, initialValue, targetValue, initialVelocity);
    }

    @Override // c0.n3, c0.o3, c0.i3
    public /* bridge */ /* synthetic */ boolean isInfinite() {
        return super.isInfinite();
    }

    public x3(int i10, int i11, g0 easing) {
        kotlin.jvm.internal.e0.checkNotNullParameter(easing, "easing");
        this.f11672a = i10;
        this.f11673b = i11;
        this.f11674c = easing;
        this.f11675d = new q3(new o0(getDurationMillis(), getDelayMillis(), easing));
    }

    @Override // c0.n3, c0.o3, c0.i3
    public v getVelocityFromNanos(long j10, v initialValue, v vVar, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, VPCjETNfjxu.tqQIf);
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f11675d.getVelocityFromNanos(j10, initialValue, vVar, initialVelocity);
    }

    public /* synthetic */ x3(int i10, int i11, g0 g0Var, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? i0.getFastOutSlowInEasing() : g0Var);
    }
}
