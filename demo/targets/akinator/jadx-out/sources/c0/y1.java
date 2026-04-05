package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final i3 f11680a;

    /* renamed from: b, reason: collision with root package name */
    public final n2 f11681b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11682c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11683d;

    /* renamed from: e, reason: collision with root package name */
    public final v f11684e;

    /* renamed from: f, reason: collision with root package name */
    public final v f11685f;

    /* renamed from: g, reason: collision with root package name */
    public final v f11686g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11687h;

    /* renamed from: i, reason: collision with root package name */
    public final v f11688i;

    public y1(i3 animationSpec, n2 typeConverter, Object obj, Object obj2, v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        this.f11680a = animationSpec;
        this.f11681b = typeConverter;
        this.f11682c = obj;
        this.f11683d = obj2;
        v vVar2 = (v) getTypeConverter().getConvertToVector().invoke(obj);
        this.f11684e = vVar2;
        v vVar3 = (v) getTypeConverter().getConvertToVector().invoke(getTargetValue());
        this.f11685f = vVar3;
        v vVarNewInstance = (vVar == null || (vVarNewInstance = w.copy(vVar)) == null) ? w.newInstance((v) getTypeConverter().getConvertToVector().invoke(obj)) : vVarNewInstance;
        this.f11686g = vVarNewInstance;
        this.f11687h = animationSpec.getDurationNanos(vVar2, vVar3, vVarNewInstance);
        this.f11688i = animationSpec.getEndVelocity(vVar2, vVar3, vVarNewInstance);
    }

    public final i3 getAnimationSpec$animation_core_release() {
        return this.f11680a;
    }

    @Override // c0.g
    public long getDurationNanos() {
        return this.f11687h;
    }

    public final Object getInitialValue() {
        return this.f11682c;
    }

    @Override // c0.g
    public Object getTargetValue() {
        return this.f11683d;
    }

    @Override // c0.g
    public n2 getTypeConverter() {
        return this.f11681b;
    }

    @Override // c0.g
    public Object getValueFromNanos(long j10) {
        if (isFinishedFromNanos(j10)) {
            return getTargetValue();
        }
        return getTypeConverter().getConvertFromVector().invoke(this.f11680a.getValueFromNanos(j10, this.f11684e, this.f11685f, this.f11686g));
    }

    @Override // c0.g
    public v getVelocityVectorFromNanos(long j10) {
        if (isFinishedFromNanos(j10)) {
            return this.f11688i;
        }
        return this.f11680a.getVelocityFromNanos(j10, this.f11684e, this.f11685f, this.f11686g);
    }

    @Override // c0.g
    public /* bridge */ /* synthetic */ boolean isFinishedFromNanos(long j10) {
        return super.isFinishedFromNanos(j10);
    }

    @Override // c0.g
    public boolean isInfinite() {
        return this.f11680a.isInfinite();
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.f11682c + " -> " + getTargetValue() + ",initial velocity: " + this.f11686g + ", duration: " + k.getDurationMillis(this) + " ms";
    }

    public /* synthetic */ y1(i3 i3Var, n2 n2Var, Object obj, Object obj2, v vVar, int i10, kotlin.jvm.internal.u uVar) {
        this(i3Var, n2Var, obj, obj2, (i10 & 16) != 0 ? null : vVar);
    }

    public /* synthetic */ y1(n nVar, n2 n2Var, Object obj, Object obj2, v vVar, int i10, kotlin.jvm.internal.u uVar) {
        this(nVar, n2Var, obj, obj2, (i10 & 16) != 0 ? null : vVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y1(n animationSpec, n2 typeConverter, Object obj, Object obj2, v vVar) {
        this(animationSpec.vectorize(typeConverter), typeConverter, obj, obj2, vVar);
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
