package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f56841a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56842b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56843c;

    /* renamed from: d, reason: collision with root package name */
    public int f56844d;

    /* renamed from: e, reason: collision with root package name */
    public int f56845e;

    /* renamed from: f, reason: collision with root package name */
    public float f56846f;

    /* renamed from: g, reason: collision with root package name */
    public float f56847g;

    public s(r paragraph, int i10, int i11, int i12, int i13, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraph, "paragraph");
        this.f56841a = paragraph;
        this.f56842b = i10;
        this.f56843c = i11;
        this.f56844d = i12;
        this.f56845e = i13;
        this.f56846f = f10;
        this.f56847g = f11;
    }

    public static /* synthetic */ s copy$default(s sVar, r rVar, int i10, int i11, int i12, int i13, float f10, float f11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            rVar = sVar.f56841a;
        }
        if ((i14 & 2) != 0) {
            i10 = sVar.f56842b;
        }
        if ((i14 & 4) != 0) {
            i11 = sVar.f56843c;
        }
        if ((i14 & 8) != 0) {
            i12 = sVar.f56844d;
        }
        if ((i14 & 16) != 0) {
            i13 = sVar.f56845e;
        }
        if ((i14 & 32) != 0) {
            f10 = sVar.f56846f;
        }
        if ((i14 & 64) != 0) {
            f11 = sVar.f56847g;
        }
        float f12 = f10;
        float f13 = f11;
        int i15 = i13;
        int i16 = i11;
        return sVar.copy(rVar, i10, i16, i12, i15, f12, f13);
    }

    public final r component1() {
        return this.f56841a;
    }

    public final int component2() {
        return this.f56842b;
    }

    public final int component3() {
        return this.f56843c;
    }

    public final int component4() {
        return this.f56844d;
    }

    public final int component5() {
        return this.f56845e;
    }

    public final float component6() {
        return this.f56846f;
    }

    public final float component7() {
        return this.f56847g;
    }

    public final s copy(r paragraph, int i10, int i11, int i12, int i13, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paragraph, "paragraph");
        return new s(paragraph, i10, i11, i12, i13, f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56841a, sVar.f56841a) && this.f56842b == sVar.f56842b && this.f56843c == sVar.f56843c && this.f56844d == sVar.f56844d && this.f56845e == sVar.f56845e && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f56846f), (Object) Float.valueOf(sVar.f56846f)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f56847g), (Object) Float.valueOf(sVar.f56847g));
    }

    public final float getBottom() {
        return this.f56847g;
    }

    public final int getEndIndex() {
        return this.f56843c;
    }

    public final int getEndLineIndex() {
        return this.f56845e;
    }

    public final int getLength() {
        return this.f56843c - this.f56842b;
    }

    public final r getParagraph() {
        return this.f56841a;
    }

    public final int getStartIndex() {
        return this.f56842b;
    }

    public final int getStartLineIndex() {
        return this.f56844d;
    }

    public final float getTop() {
        return this.f56846f;
    }

    public int hashCode() {
        return Float.hashCode(this.f56847g) + b0.e2.b(this.f56846f, e3.g.d(this.f56845e, e3.g.d(this.f56844d, e3.g.d(this.f56843c, e3.g.d(this.f56842b, this.f56841a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final void setBottom(float f10) {
        this.f56847g = f10;
    }

    public final void setEndLineIndex(int i10) {
        this.f56845e = i10;
    }

    public final void setStartLineIndex(int i10) {
        this.f56844d = i10;
    }

    public final void setTop(float f10) {
        this.f56846f = f10;
    }

    public final i1.j toGlobal(i1.j jVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jVar, "<this>");
        return jVar.m4216translatek4lQ0M(i1.i.Offset(0.0f, this.f56846f));
    }

    /* renamed from: toGlobal-GEjPoXI, reason: not valid java name */
    public final long m4021toGlobalGEjPoXI(long j10) {
        return b2.TextRange(toGlobalIndex(a2.m3960getStartimpl(j10)), toGlobalIndex(a2.m3955getEndimpl(j10)));
    }

    public final int toGlobalIndex(int i10) {
        return i10 + this.f56842b;
    }

    public final int toGlobalLineIndex(int i10) {
        return i10 + this.f56844d;
    }

    public final float toGlobalYPosition(float f10) {
        return f10 + this.f56846f;
    }

    /* renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m4022toLocalMKHz9U(long j10) {
        return i1.i.Offset(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10) - this.f56846f);
    }

    public final int toLocalIndex(int i10) {
        int i11 = this.f56843c;
        int i12 = this.f56842b;
        return qv.v.coerceIn(i10, i12, i11) - i12;
    }

    public final int toLocalLineIndex(int i10) {
        return i10 - this.f56844d;
    }

    public final float toLocalYPosition(float f10) {
        return f10 - this.f56846f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f56841a);
        sb2.append(", startIndex=");
        sb2.append(this.f56842b);
        sb2.append(", endIndex=");
        sb2.append(this.f56843c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f56844d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f56845e);
        sb2.append(", top=");
        sb2.append(this.f56846f);
        sb2.append(", bottom=");
        return a.b.n(sb2, this.f56847g, ')');
    }

    public final j1.l1 toGlobal(j1.l1 l1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l1Var, "<this>");
        l1Var.mo4809translatek4lQ0M(i1.i.Offset(0.0f, this.f56846f));
        return l1Var;
    }

    public /* synthetic */ s(r rVar, int i10, int i11, int i12, int i13, float f10, float f11, int i14, kotlin.jvm.internal.u uVar) {
        this(rVar, i10, i11, (i14 & 8) != 0 ? -1 : i12, (i14 & 16) != 0 ? -1 : i13, (i14 & 32) != 0 ? -1.0f : f10, (i14 & 64) != 0 ? -1.0f : f11);
    }
}
