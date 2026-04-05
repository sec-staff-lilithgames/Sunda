package g2;

import androidx.core.app.NotificationCompat;
import g2.b;
import j1.o2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final b f56862a;

    /* renamed from: b, reason: collision with root package name */
    public final c2 f56863b;

    /* renamed from: c, reason: collision with root package name */
    public final List f56864c;

    /* renamed from: d, reason: collision with root package name */
    public final int f56865d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56866e;

    /* renamed from: f, reason: collision with root package name */
    public final int f56867f;

    /* renamed from: g, reason: collision with root package name */
    public final s2.e f56868g;

    /* renamed from: h, reason: collision with root package name */
    public final s2.x f56869h;

    /* renamed from: i, reason: collision with root package name */
    public final l2.y f56870i;

    /* renamed from: j, reason: collision with root package name */
    public final long f56871j;

    /* renamed from: k, reason: collision with root package name */
    public final l2.v f56872k;

    public w1(b bVar, c2 c2Var, List list, int i10, boolean z10, int i11, s2.e eVar, s2.x xVar, l2.v vVar, l2.y yVar, long j10) {
        this.f56862a = bVar;
        this.f56863b = c2Var;
        this.f56864c = list;
        this.f56865d = i10;
        this.f56866e = z10;
        this.f56867f = i11;
        this.f56868g = eVar;
        this.f56869h = xVar;
        this.f56870i = yVar;
        this.f56871j = j10;
        this.f56872k = vVar;
    }

    /* renamed from: copy-hu-1Yfo$default, reason: not valid java name */
    public static /* synthetic */ w1 m4029copyhu1Yfo$default(w1 w1Var, b bVar, c2 c2Var, List list, int i10, boolean z10, int i11, s2.e eVar, s2.x xVar, l2.v vVar, long j10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bVar = w1Var.f56862a;
        }
        if ((i12 & 2) != 0) {
            c2Var = w1Var.f56863b;
        }
        if ((i12 & 4) != 0) {
            list = w1Var.f56864c;
        }
        if ((i12 & 8) != 0) {
            i10 = w1Var.f56865d;
        }
        if ((i12 & 16) != 0) {
            z10 = w1Var.f56866e;
        }
        if ((i12 & 32) != 0) {
            i11 = w1Var.f56867f;
        }
        if ((i12 & 64) != 0) {
            eVar = w1Var.f56868g;
        }
        if ((i12 & 128) != 0) {
            xVar = w1Var.f56869h;
        }
        if ((i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            vVar = w1Var.getResourceLoader();
        }
        if ((i12 & 512) != 0) {
            j10 = w1Var.f56871j;
        }
        long j11 = j10;
        s2.x xVar2 = xVar;
        l2.v vVar2 = vVar;
        int i13 = i11;
        s2.e eVar2 = eVar;
        boolean z11 = z10;
        List list2 = list;
        return w1Var.m4030copyhu1Yfo(bVar, c2Var, list2, i10, z11, i13, eVar2, xVar2, vVar2, j11);
    }

    @tu.f
    /* renamed from: copy-hu-1Yfo, reason: not valid java name */
    public final w1 m4030copyhu1Yfo(b text, c2 style, List<b.C0570b> placeholders, int i10, boolean z10, int i11, s2.e density, s2.x layoutDirection, l2.v resourceLoader, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        kotlin.jvm.internal.e0.checkNotNullParameter(placeholders, "placeholders");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(resourceLoader, "resourceLoader");
        return new w1(text, style, placeholders, i10, z10, i11, density, layoutDirection, resourceLoader, this.f56870i, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56862a, w1Var.f56862a) && kotlin.jvm.internal.e0.areEqual(this.f56863b, w1Var.f56863b) && kotlin.jvm.internal.e0.areEqual(this.f56864c, w1Var.f56864c) && this.f56865d == w1Var.f56865d && this.f56866e == w1Var.f56866e && r2.a0.m6027equalsimpl0(this.f56867f, w1Var.f56867f) && kotlin.jvm.internal.e0.areEqual(this.f56868g, w1Var.f56868g) && this.f56869h == w1Var.f56869h && kotlin.jvm.internal.e0.areEqual(this.f56870i, w1Var.f56870i) && s2.c.m6749equalsimpl0(this.f56871j, w1Var.f56871j);
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m4031getConstraintsmsEJaDk() {
        return this.f56871j;
    }

    public final s2.e getDensity() {
        return this.f56868g;
    }

    public final l2.y getFontFamilyResolver() {
        return this.f56870i;
    }

    public final s2.x getLayoutDirection() {
        return this.f56869h;
    }

    public final int getMaxLines() {
        return this.f56865d;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m4032getOverflowgIe3tQ8() {
        return this.f56867f;
    }

    public final List<b.C0570b> getPlaceholders() {
        return this.f56864c;
    }

    public final l2.v getResourceLoader() {
        l2.v vVar = this.f56872k;
        return vVar == null ? i.f56767b.from(this.f56870i) : vVar;
    }

    public final boolean getSoftWrap() {
        return this.f56866e;
    }

    public final c2 getStyle() {
        return this.f56863b;
    }

    public final b getText() {
        return this.f56862a;
    }

    public int hashCode() {
        return s2.c.m6758hashCodeimpl(this.f56871j) + ((this.f56870i.hashCode() + ((this.f56869h.hashCode() + ((this.f56868g.hashCode() + ((r2.a0.m6028hashCodeimpl(this.f56867f) + com.google.android.gms.internal.play_billing.a.c((o2.c((this.f56863b.hashCode() + (this.f56862a.hashCode() * 31)) * 31, 31, this.f56864c) + this.f56865d) * 31, 31, this.f56866e)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f56862a) + ", style=" + this.f56863b + ", placeholders=" + this.f56864c + ", maxLines=" + this.f56865d + ", softWrap=" + this.f56866e + ", overflow=" + ((Object) r2.a0.m6029toStringimpl(this.f56867f)) + ", density=" + this.f56868g + ", layoutDirection=" + this.f56869h + ", fontFamilyResolver=" + this.f56870i + ", constraints=" + ((Object) s2.c.m6760toStringimpl(this.f56871j)) + ')';
    }

    @tu.f
    public w1(b bVar, c2 c2Var, List list, int i10, boolean z10, int i11, s2.e eVar, s2.x xVar, l2.v vVar, long j10, kotlin.jvm.internal.u uVar) {
        this(bVar, c2Var, list, i10, z10, i11, eVar, xVar, vVar, l2.t.createFontFamilyResolver(vVar), j10);
    }

    public w1(b bVar, c2 c2Var, List list, int i10, boolean z10, int i11, s2.e eVar, s2.x xVar, l2.y yVar, long j10, kotlin.jvm.internal.u uVar) {
        this(bVar, c2Var, list, i10, z10, i11, eVar, xVar, (l2.v) null, yVar, j10);
    }

    @tu.f
    public static /* synthetic */ void getResourceLoader$annotations() {
    }
}
