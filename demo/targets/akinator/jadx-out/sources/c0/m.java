package c0;

import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f11527a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11528b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11529c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.a f11530d;

    /* renamed from: e, reason: collision with root package name */
    public final p0.j2 f11531e;

    /* renamed from: f, reason: collision with root package name */
    public v f11532f;

    /* renamed from: g, reason: collision with root package name */
    public long f11533g;

    /* renamed from: h, reason: collision with root package name */
    public long f11534h;

    /* renamed from: i, reason: collision with root package name */
    public final p0.j2 f11535i;

    public m(Object obj, n2 typeConverter, v initialVelocityVector, long j10, Object obj2, long j11, boolean z10, kv.a onCancel) {
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        kotlin.jvm.internal.e0.checkNotNullParameter(onCancel, "onCancel");
        this.f11527a = typeConverter;
        this.f11528b = obj2;
        this.f11529c = j11;
        this.f11530d = onCancel;
        this.f11531e = o5.mutableStateOf$default(obj, null, 2, null);
        this.f11532f = w.copy(initialVelocityVector);
        this.f11533g = j10;
        this.f11534h = Long.MIN_VALUE;
        this.f11535i = o5.mutableStateOf$default(Boolean.valueOf(z10), null, 2, null);
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.f11530d.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.f11534h;
    }

    public final long getLastFrameTimeNanos() {
        return this.f11533g;
    }

    public final long getStartTimeNanos() {
        return this.f11529c;
    }

    public final Object getTargetValue() {
        return this.f11528b;
    }

    public final n2 getTypeConverter() {
        return this.f11527a;
    }

    public final Object getValue() {
        return this.f11531e.getValue();
    }

    public final Object getVelocity() {
        return this.f11527a.getConvertFromVector().invoke(this.f11532f);
    }

    public final v getVelocityVector() {
        return this.f11532f;
    }

    public final boolean isRunning() {
        return ((Boolean) this.f11535i.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core_release(long j10) {
        this.f11534h = j10;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j10) {
        this.f11533g = j10;
    }

    public final void setRunning$animation_core_release(boolean z10) {
        this.f11535i.setValue(Boolean.valueOf(z10));
    }

    public final void setValue$animation_core_release(Object obj) {
        this.f11531e.setValue(obj);
    }

    public final void setVelocityVector$animation_core_release(v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<set-?>");
        this.f11532f = vVar;
    }

    public final p toAnimationState() {
        return new p(this.f11527a, getValue(), this.f11532f, this.f11533g, this.f11534h, isRunning());
    }
}
