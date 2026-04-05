package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f85344a;

    /* renamed from: b, reason: collision with root package name */
    public final float f85345b;

    /* renamed from: c, reason: collision with root package name */
    public final float f85346c;

    /* renamed from: d, reason: collision with root package name */
    public final float f85347d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public m(float f10, float f11, float f12, float f13, kotlin.jvm.internal.u uVar) {
        this.f85344a = f10;
        this.f85345b = f11;
        this.f85346c = f12;
        this.f85347d = f13;
    }

    /* renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ m m6883copya9UjIt4$default(m mVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = mVar.f85344a;
        }
        if ((i10 & 2) != 0) {
            f11 = mVar.f85345b;
        }
        if ((i10 & 4) != 0) {
            f12 = mVar.f85346c;
        }
        if ((i10 & 8) != 0) {
            f13 = mVar.f85347d;
        }
        return mVar.m6892copya9UjIt4(f10, f11, f12, f13);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m6888component1D9Ej5fM() {
        return this.f85344a;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m6889component2D9Ej5fM() {
        return this.f85345b;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m6890component3D9Ej5fM() {
        return this.f85346c;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m6891component4D9Ej5fM() {
        return this.f85347d;
    }

    /* renamed from: copy-a9UjIt4, reason: not valid java name */
    public final m m6892copya9UjIt4(float f10, float f11, float f12, float f13) {
        return new m(f10, f11, f12, f13, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i.m6822equalsimpl0(this.f85344a, mVar.f85344a) && i.m6822equalsimpl0(this.f85345b, mVar.f85345b) && i.m6822equalsimpl0(this.f85346c, mVar.f85346c) && i.m6822equalsimpl0(this.f85347d, mVar.f85347d);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m6893getBottomD9Ej5fM() {
        return this.f85347d;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m6894getLeftD9Ej5fM() {
        return this.f85344a;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m6895getRightD9Ej5fM() {
        return this.f85346c;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m6896getTopD9Ej5fM() {
        return this.f85345b;
    }

    public int hashCode() {
        return i.m6823hashCodeimpl(this.f85347d) + ((i.m6823hashCodeimpl(this.f85346c) + ((i.m6823hashCodeimpl(this.f85345b) + (i.m6823hashCodeimpl(this.f85344a) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "DpRect(left=" + ((Object) i.m6828toStringimpl(this.f85344a)) + ", top=" + ((Object) i.m6828toStringimpl(this.f85345b)) + ", right=" + ((Object) i.m6828toStringimpl(this.f85346c)) + ", bottom=" + ((Object) i.m6828toStringimpl(this.f85347d)) + ')';
    }

    public m(long j10, long j11, kotlin.jvm.internal.u uVar) {
        this(l.m6874getXD9Ej5fM(j10), l.m6876getYD9Ej5fM(j10), i.m6817constructorimpl(o.m6911getWidthD9Ej5fM(j11) + l.m6874getXD9Ej5fM(j10)), i.m6817constructorimpl(o.m6909getHeightD9Ej5fM(j11) + l.m6876getYD9Ej5fM(j10)), null);
    }

    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6884getBottomD9Ej5fM$annotations() {
    }

    /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6885getLeftD9Ej5fM$annotations() {
    }

    /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6886getRightD9Ej5fM$annotations() {
    }

    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6887getTopD9Ej5fM$annotations() {
    }
}
