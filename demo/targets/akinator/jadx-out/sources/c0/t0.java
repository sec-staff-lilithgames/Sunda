package c0;

import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0.j2 f11617a;

    /* renamed from: b, reason: collision with root package name */
    public final p0.j2 f11618b;

    /* renamed from: c, reason: collision with root package name */
    public final p0.j2 f11619c = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public t0(Object obj) {
        this.f11617a = o5.mutableStateOf$default(obj, null, 2, null);
        this.f11618b = o5.mutableStateOf$default(obj, null, 2, null);
    }

    public final Object getCurrentState() {
        return this.f11617a.getValue();
    }

    public final Object getTargetState() {
        return this.f11618b.getValue();
    }

    public final boolean isIdle() {
        return kotlin.jvm.internal.e0.areEqual(getCurrentState(), getTargetState()) && !isRunning$animation_core_release();
    }

    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.f11619c.getValue()).booleanValue();
    }

    public final void setCurrentState$animation_core_release(Object obj) {
        this.f11617a.setValue(obj);
    }

    public final void setRunning$animation_core_release(boolean z10) {
        this.f11619c.setValue(Boolean.valueOf(z10));
    }

    public final void setTargetState(Object obj) {
        this.f11618b.setValue(obj);
    }
}
