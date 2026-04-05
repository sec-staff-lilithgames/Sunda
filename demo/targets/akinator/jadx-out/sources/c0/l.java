package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final p f11519a;

    /* renamed from: b, reason: collision with root package name */
    public final h f11520b;

    public l(p endState, h endReason) {
        kotlin.jvm.internal.e0.checkNotNullParameter(endState, "endState");
        kotlin.jvm.internal.e0.checkNotNullParameter(endReason, "endReason");
        this.f11519a = endState;
        this.f11520b = endReason;
    }

    public final h getEndReason() {
        return this.f11520b;
    }

    public final p getEndState() {
        return this.f11519a;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.f11520b + ", endState=" + this.f11519a + ')';
    }
}
