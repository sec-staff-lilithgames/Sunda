package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f53537d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final k f53538e = new k(0.0f, qv.u.rangeTo(0.0f, 0.0f), 0, 4, null);

    /* renamed from: a, reason: collision with root package name */
    public final float f53539a;

    /* renamed from: b, reason: collision with root package name */
    public final qv.f f53540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f53541c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final k getIndeterminate() {
            return k.f53538e;
        }
    }

    public k(float f10, qv.f range, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(range, "range");
        this.f53539a = f10;
        this.f53540b = range;
        this.f53541c = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f53539a == kVar.f53539a && kotlin.jvm.internal.e0.areEqual(this.f53540b, kVar.f53540b) && this.f53541c == kVar.f53541c;
    }

    public final float getCurrent() {
        return this.f53539a;
    }

    public final qv.f getRange() {
        return this.f53540b;
    }

    public final int getSteps() {
        return this.f53541c;
    }

    public int hashCode() {
        return ((this.f53540b.hashCode() + (Float.hashCode(this.f53539a) * 31)) * 31) + this.f53541c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f53539a);
        sb2.append(", range=");
        sb2.append(this.f53540b);
        sb2.append(", steps=");
        return e3.g.m(sb2, this.f53541c, ')');
    }

    public /* synthetic */ k(float f10, qv.f fVar, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(f10, fVar, (i11 & 4) != 0 ? 0 : i10);
    }
}
