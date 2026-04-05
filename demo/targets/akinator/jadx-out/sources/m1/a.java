package m1;

import i1.o;
import j1.n0;
import j1.r0;
import j1.y0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import l1.i;
import s2.q;
import s2.v;
import s2.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: h, reason: collision with root package name */
    public final y0 f73871h;

    /* renamed from: i, reason: collision with root package name */
    public final long f73872i;

    /* renamed from: j, reason: collision with root package name */
    public final long f73873j;

    /* renamed from: k, reason: collision with root package name */
    public int f73874k;

    /* renamed from: l, reason: collision with root package name */
    public final long f73875l;

    /* renamed from: m, reason: collision with root package name */
    public float f73876m;

    /* renamed from: n, reason: collision with root package name */
    public n0 f73877n;

    public /* synthetic */ a(y0 y0Var, long j10, long j11, int i10, u uVar) {
        this(y0Var, (i10 & 2) != 0 ? q.f85352b.m6920getZeronOccac() : j10, (i10 & 4) != 0 ? w.IntSize(y0Var.getWidth(), y0Var.getHeight()) : j11, null);
    }

    @Override // m1.e
    public final boolean a(float f10) {
        this.f73876m = f10;
        return true;
    }

    @Override // m1.e
    public final boolean b(n0 n0Var) {
        this.f73877n = n0Var;
        return true;
    }

    @Override // m1.e
    public final void d(i iVar) {
        e0.checkNotNullParameter(iVar, "<this>");
        i.m5400drawImageAZ2fEMs$default(iVar, this.f73871h, this.f73872i, this.f73873j, 0L, w.IntSize(mv.d.roundToInt(o.m4252getWidthimpl(iVar.mo5314getSizeNHjbRc())), mv.d.roundToInt(o.m4249getHeightimpl(iVar.mo5314getSizeNHjbRc()))), this.f73876m, null, this.f73877n, 0, this.f73874k, 328, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e0.areEqual(this.f73871h, aVar.f73871h) && q.m6929equalsimpl0(this.f73872i, aVar.f73872i) && v.m6970equalsimpl0(this.f73873j, aVar.f73873j) && r0.m4922equalsimpl0(this.f73874k, aVar.f73874k);
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name */
    public final int m5576getFilterQualityfv9h1I$ui_graphics_release() {
        return this.f73874k;
    }

    @Override // m1.e
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo138getIntrinsicSizeNHjbRc() {
        return w.m6981toSizeozmzZPI(this.f73875l);
    }

    public int hashCode() {
        return r0.m4923hashCodeimpl(this.f73874k) + ((v.m6973hashCodeimpl(this.f73873j) + ((q.m6932hashCodeimpl(this.f73872i) + (this.f73871h.hashCode() * 31)) * 31)) * 31);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m5577setFilterQualityvDHp3xo$ui_graphics_release(int i10) {
        this.f73874k = i10;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f73871h + ", srcOffset=" + ((Object) q.m6937toStringimpl(this.f73872i)) + ", srcSize=" + ((Object) v.m6975toStringimpl(this.f73873j)) + ", filterQuality=" + ((Object) r0.m4924toStringimpl(this.f73874k)) + ')';
    }

    public a(y0 y0Var, long j10, long j11, u uVar) {
        this.f73871h = y0Var;
        this.f73872i = j10;
        this.f73873j = j11;
        this.f73874k = r0.f68948b.m4907getLowfv9h1I();
        if (q.m6930getXimpl(j10) >= 0 && q.m6931getYimpl(j10) >= 0 && v.m6972getWidthimpl(j11) >= 0 && v.m6971getHeightimpl(j11) >= 0 && v.m6972getWidthimpl(j11) <= y0Var.getWidth() && v.m6971getHeightimpl(j11) <= y0Var.getHeight()) {
            this.f73875l = j11;
            this.f73876m = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
