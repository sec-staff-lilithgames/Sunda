package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final m3 f11405a;

    /* renamed from: b, reason: collision with root package name */
    public final n2 f11406b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11407c;

    /* renamed from: d, reason: collision with root package name */
    public final v f11408d;

    /* renamed from: e, reason: collision with root package name */
    public final v f11409e;

    /* renamed from: f, reason: collision with root package name */
    public final v f11410f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f11411g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11412h;

    public b0(m3 animationSpec, n2 typeConverter, Object obj, v initialVelocityVector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        this.f11405a = animationSpec;
        this.f11406b = typeConverter;
        this.f11407c = obj;
        v vVar = (v) getTypeConverter().getConvertToVector().invoke(obj);
        this.f11408d = vVar;
        this.f11409e = w.copy(initialVelocityVector);
        this.f11411g = getTypeConverter().getConvertFromVector().invoke(animationSpec.getTargetValue(vVar, initialVelocityVector));
        this.f11412h = animationSpec.getDurationNanos(vVar, initialVelocityVector);
        v vVarCopy = w.copy(animationSpec.getVelocityFromNanos(getDurationNanos(), vVar, initialVelocityVector));
        this.f11410f = vVarCopy;
        int size$animation_core_release = vVarCopy.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            v vVar2 = this.f11410f;
            vVar2.set$animation_core_release(i10, qv.v.coerceIn(vVar2.get$animation_core_release(i10), -this.f11405a.getAbsVelocityThreshold(), this.f11405a.getAbsVelocityThreshold()));
        }
    }

    @Override // c0.g
    public long getDurationNanos() {
        return this.f11412h;
    }

    public final Object getInitialValue() {
        return this.f11407c;
    }

    public final v getInitialVelocityVector() {
        return this.f11409e;
    }

    @Override // c0.g
    public Object getTargetValue() {
        return this.f11411g;
    }

    @Override // c0.g
    public n2 getTypeConverter() {
        return this.f11406b;
    }

    @Override // c0.g
    public Object getValueFromNanos(long j10) {
        if (isFinishedFromNanos(j10)) {
            return getTargetValue();
        }
        return getTypeConverter().getConvertFromVector().invoke(this.f11405a.getValueFromNanos(j10, this.f11408d, this.f11409e));
    }

    @Override // c0.g
    public v getVelocityVectorFromNanos(long j10) {
        if (isFinishedFromNanos(j10)) {
            return this.f11410f;
        }
        return this.f11405a.getVelocityFromNanos(j10, this.f11408d, this.f11409e);
    }

    @Override // c0.g
    public /* bridge */ /* synthetic */ boolean isFinishedFromNanos(long j10) {
        return super.isFinishedFromNanos(j10);
    }

    @Override // c0.g
    public boolean isInfinite() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(c0 animationSpec, n2 typeConverter, Object obj, v initialVelocityVector) {
        this(animationSpec.vectorize(typeConverter), typeConverter, obj, initialVelocityVector);
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(c0 animationSpec, n2 typeConverter, Object obj, Object obj2) {
        this(animationSpec.vectorize(typeConverter), typeConverter, obj, (v) typeConverter.getConvertToVector().invoke(obj2));
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
