package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final u f56850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56851b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56852c;

    public t(u intrinsics, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsics, "intrinsics");
        this.f56850a = intrinsics;
        this.f56851b = i10;
        this.f56852c = i11;
    }

    public static /* synthetic */ t copy$default(t tVar, u uVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uVar = tVar.f56850a;
        }
        if ((i12 & 2) != 0) {
            i10 = tVar.f56851b;
        }
        if ((i12 & 4) != 0) {
            i11 = tVar.f56852c;
        }
        return tVar.copy(uVar, i10, i11);
    }

    public final u component1() {
        return this.f56850a;
    }

    public final int component2() {
        return this.f56851b;
    }

    public final int component3() {
        return this.f56852c;
    }

    public final t copy(u intrinsics, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(intrinsics, "intrinsics");
        return new t(intrinsics, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56850a, tVar.f56850a) && this.f56851b == tVar.f56851b && this.f56852c == tVar.f56852c;
    }

    public final int getEndIndex() {
        return this.f56852c;
    }

    public final u getIntrinsics() {
        return this.f56850a;
    }

    public final int getStartIndex() {
        return this.f56851b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f56852c) + e3.g.d(this.f56851b, this.f56850a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f56850a);
        sb2.append(", startIndex=");
        sb2.append(this.f56851b);
        sb2.append(", endIndex=");
        return e3.g.m(sb2, this.f56852c, ')');
    }
}
