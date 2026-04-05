package c0;

import p0.o5;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements v5 {

    /* renamed from: b, reason: collision with root package name */
    public final n2 f11559b;

    /* renamed from: c, reason: collision with root package name */
    public final p0.j2 f11560c;

    /* renamed from: e, reason: collision with root package name */
    public v f11561e;

    /* renamed from: f, reason: collision with root package name */
    public long f11562f;

    /* renamed from: g, reason: collision with root package name */
    public long f11563g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11564h;

    public p(n2 typeConverter, Object obj, v vVar, long j10, long j11, boolean z10) {
        v vVarCopy;
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        this.f11559b = typeConverter;
        this.f11560c = o5.mutableStateOf$default(obj, null, 2, null);
        this.f11561e = (vVar == null || (vVarCopy = w.copy(vVar)) == null) ? q.createZeroVectorFrom(typeConverter, obj) : vVarCopy;
        this.f11562f = j10;
        this.f11563g = j11;
        this.f11564h = z10;
    }

    public final long getFinishedTimeNanos() {
        return this.f11563g;
    }

    public final long getLastFrameTimeNanos() {
        return this.f11562f;
    }

    public final n2 getTypeConverter() {
        return this.f11559b;
    }

    @Override // p0.v5
    public Object getValue() {
        return this.f11560c.getValue();
    }

    public final Object getVelocity() {
        return this.f11559b.getConvertFromVector().invoke(this.f11561e);
    }

    public final v getVelocityVector() {
        return this.f11561e;
    }

    public final boolean isRunning() {
        return this.f11564h;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j10) {
        this.f11563g = j10;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j10) {
        this.f11562f = j10;
    }

    public final void setRunning$animation_core_release(boolean z10) {
        this.f11564h = z10;
    }

    public void setValue$animation_core_release(Object obj) {
        this.f11560c.setValue(obj);
    }

    public final void setVelocityVector$animation_core_release(v vVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<set-?>");
        this.f11561e = vVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationState(value=");
        sb2.append(getValue());
        sb2.append(", velocity=");
        sb2.append(getVelocity());
        sb2.append(", isRunning=");
        sb2.append(this.f11564h);
        sb2.append(", lastFrameTimeNanos=");
        sb2.append(this.f11562f);
        sb2.append(", finishedTimeNanos=");
        return e3.g.n(sb2, this.f11563g, ')');
    }

    public /* synthetic */ p(n2 n2Var, Object obj, v vVar, long j10, long j11, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(n2Var, obj, (i10 & 4) != 0 ? null : vVar, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
