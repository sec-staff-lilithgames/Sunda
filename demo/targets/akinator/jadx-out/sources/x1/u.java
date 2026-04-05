package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u implements r {

    /* renamed from: b, reason: collision with root package name */
    public final float f91441b;

    public u(float f10) {
        this.f91441b = f10;
    }

    public static /* synthetic */ u copy$default(u uVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = uVar.f91441b;
        }
        return uVar.copy(f10);
    }

    public final float component1() {
        return this.f91441b;
    }

    @Override // x1.r
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo7834computeScaleFactorH7hwNQA(long j10, long j11) {
        float f10 = this.f91441b;
        return a2.ScaleFactor(f10, f10);
    }

    public final u copy(float f10) {
        return new u(f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f91441b), (Object) Float.valueOf(((u) obj).f91441b));
    }

    public final float getValue() {
        return this.f91441b;
    }

    public int hashCode() {
        return Float.hashCode(this.f91441b);
    }

    public String toString() {
        return a.b.n(new StringBuilder("FixedScale(value="), this.f91441b, ')');
    }
}
