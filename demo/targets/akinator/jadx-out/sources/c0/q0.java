package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f11569a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f11570b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11571c;

    public q0(f0 f0Var, y0 y0Var, long j10, kotlin.jvm.internal.u uVar) {
        this.f11569a = f0Var;
        this.f11570b = y0Var;
        this.f11571c = j10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (kotlin.jvm.internal.e0.areEqual(q0Var.f11569a, this.f11569a) && q0Var.f11570b == this.f11570b && j1.m163equalsimpl0(q0Var.f11571c, this.f11571c)) {
                return true;
            }
        }
        return false;
    }

    public final f0 getAnimation() {
        return this.f11569a;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m183getInitialStartOffsetRmkjzm4() {
        return this.f11571c;
    }

    public final y0 getRepeatMode() {
        return this.f11570b;
    }

    public int hashCode() {
        return j1.m166hashCodeimpl(this.f11571c) + ((this.f11570b.hashCode() + (this.f11569a.hashCode() * 31)) * 31);
    }

    @Override // c0.n
    public <V extends v> i3 vectorize(n2 converter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(converter, "converter");
        return new s3(this.f11569a.vectorize(converter), this.f11570b, this.f11571c, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ q0(f0 f0Var, y0 y0Var, long j10, int i10, kotlin.jvm.internal.u uVar) {
        this(f0Var, (i10 & 2) != 0 ? y0.f11678b : y0Var, (i10 & 4) != 0 ? j1.m161constructorimpl$default(0, 0, 2, null) : j10, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ q0(f0 f0Var, y0 y0Var, int i10, kotlin.jvm.internal.u uVar) {
        this(f0Var, (i10 & 2) != 0 ? y0.f11678b : y0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public /* synthetic */ q0(f0 animation, y0 repeatMode) {
        this(animation, repeatMode, j1.m161constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.u) null);
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        kotlin.jvm.internal.e0.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
