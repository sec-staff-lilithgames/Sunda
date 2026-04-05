package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r3 implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f11594a;

    /* renamed from: b, reason: collision with root package name */
    public v f11595b;

    /* renamed from: c, reason: collision with root package name */
    public v f11596c;

    /* renamed from: d, reason: collision with root package name */
    public v f11597d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11598e;

    public r3(l0 floatDecaySpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f11594a = floatDecaySpec;
        this.f11598e = floatDecaySpec.getAbsVelocityThreshold();
    }

    @Override // c0.m3
    public float getAbsVelocityThreshold() {
        return this.f11598e;
    }

    @Override // c0.m3
    public long getDurationNanos(v initialValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f11596c == null) {
            this.f11596c = w.newInstance(initialValue);
        }
        v vVar = this.f11596c;
        if (vVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("velocityVector");
            vVar = null;
        }
        int size$animation_core_release = vVar.getSize$animation_core_release();
        long jMax = 0;
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            jMax = Math.max(jMax, this.f11594a.getDurationNanos(initialValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        return jMax;
    }

    public final l0 getFloatDecaySpec() {
        return this.f11594a;
    }

    @Override // c0.m3
    public v getTargetValue(v initialValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f11597d == null) {
            this.f11597d = w.newInstance(initialValue);
        }
        v vVar = this.f11597d;
        if (vVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("targetVector");
            vVar = null;
        }
        int size$animation_core_release = vVar.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            v vVar2 = this.f11597d;
            if (vVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("targetVector");
                vVar2 = null;
            }
            vVar2.set$animation_core_release(i10, this.f11594a.getTargetValue(initialValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        v vVar3 = this.f11597d;
        if (vVar3 != null) {
            return vVar3;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("targetVector");
        return null;
    }

    @Override // c0.m3
    public v getValueFromNanos(long j10, v initialValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f11595b == null) {
            this.f11595b = w.newInstance(initialValue);
        }
        v vVar = this.f11595b;
        if (vVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("valueVector");
            vVar = null;
        }
        int size$animation_core_release = vVar.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            v vVar2 = this.f11595b;
            if (vVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("valueVector");
                vVar2 = null;
            }
            vVar2.set$animation_core_release(i10, this.f11594a.getValueFromNanos(j10, initialValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        v vVar3 = this.f11595b;
        if (vVar3 != null) {
            return vVar3;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // c0.m3
    public v getVelocityFromNanos(long j10, v initialValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f11596c == null) {
            this.f11596c = w.newInstance(initialValue);
        }
        v vVar = this.f11596c;
        if (vVar == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("velocityVector");
            vVar = null;
        }
        int size$animation_core_release = vVar.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            v vVar2 = this.f11596c;
            if (vVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("velocityVector");
                vVar2 = null;
            }
            vVar2.set$animation_core_release(i10, this.f11594a.getVelocityFromNanos(j10, initialValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        v vVar3 = this.f11596c;
        if (vVar3 != null) {
            return vVar3;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }
}
