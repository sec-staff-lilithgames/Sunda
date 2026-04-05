package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11692a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f11693b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f11694c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11695d;

    public z0(int i10, f0 f0Var, y0 y0Var, long j10, kotlin.jvm.internal.u uVar) {
        this.f11692a = i10;
        this.f11693b = f0Var;
        this.f11694c = y0Var;
        this.f11695d = j10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (z0Var.f11692a == this.f11692a && kotlin.jvm.internal.e0.areEqual(z0Var.f11693b, this.f11693b) && z0Var.f11694c == this.f11694c && j1.m163equalsimpl0(z0Var.f11695d, this.f11695d)) {
                return true;
            }
        }
        return false;
    }

    public final f0 getAnimation() {
        return this.f11693b;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m203getInitialStartOffsetRmkjzm4() {
        return this.f11695d;
    }

    public final int getIterations() {
        return this.f11692a;
    }

    public final y0 getRepeatMode() {
        return this.f11694c;
    }

    public int hashCode() {
        return j1.m166hashCodeimpl(this.f11695d) + ((this.f11694c.hashCode() + ((this.f11693b.hashCode() + (this.f11692a * 31)) * 31)) * 31);
    }

    @Override // c0.j0, c0.n
    public <V extends v> o3 vectorize(n2 converter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(converter, "converter");
        return new u3(this.f11692a, this.f11693b.vectorize(converter), this.f11694c, this.f11695d, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ z0(int i10, f0 f0Var, y0 y0Var, long j10, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, f0Var, (i11 & 4) != 0 ? y0.f11678b : y0Var, (i11 & 8) != 0 ? j1.m161constructorimpl$default(0, 0, 2, null) : j10, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ z0(int i10, f0 f0Var, y0 y0Var, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, f0Var, (i11 & 4) != 0 ? y0.f11678b : y0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public /* synthetic */ z0(int i10, f0 animation, y0 repeatMode) {
        this(i10, animation, repeatMode, j1.m161constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.u) null);
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        kotlin.jvm.internal.e0.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
