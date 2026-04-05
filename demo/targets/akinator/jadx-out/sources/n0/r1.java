package n0;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import g2.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final c2 f75171a;

    /* renamed from: b, reason: collision with root package name */
    public final c2 f75172b;

    /* renamed from: c, reason: collision with root package name */
    public final c2 f75173c;

    /* renamed from: d, reason: collision with root package name */
    public final c2 f75174d;

    /* renamed from: e, reason: collision with root package name */
    public final c2 f75175e;

    /* renamed from: f, reason: collision with root package name */
    public final c2 f75176f;

    /* renamed from: g, reason: collision with root package name */
    public final c2 f75177g;

    /* renamed from: h, reason: collision with root package name */
    public final c2 f75178h;

    /* renamed from: i, reason: collision with root package name */
    public final c2 f75179i;

    /* renamed from: j, reason: collision with root package name */
    public final c2 f75180j;

    /* renamed from: k, reason: collision with root package name */
    public final c2 f75181k;

    /* renamed from: l, reason: collision with root package name */
    public final c2 f75182l;

    /* renamed from: m, reason: collision with root package name */
    public final c2 f75183m;

    public r1(c2 h12, c2 h22, c2 h32, c2 h42, c2 h52, c2 h62, c2 subtitle1, c2 subtitle2, c2 body1, c2 body2, c2 button, c2 caption, c2 overline) {
        kotlin.jvm.internal.e0.checkNotNullParameter(h12, "h1");
        kotlin.jvm.internal.e0.checkNotNullParameter(h22, "h2");
        kotlin.jvm.internal.e0.checkNotNullParameter(h32, "h3");
        kotlin.jvm.internal.e0.checkNotNullParameter(h42, "h4");
        kotlin.jvm.internal.e0.checkNotNullParameter(h52, "h5");
        kotlin.jvm.internal.e0.checkNotNullParameter(h62, "h6");
        kotlin.jvm.internal.e0.checkNotNullParameter(subtitle1, "subtitle1");
        kotlin.jvm.internal.e0.checkNotNullParameter(subtitle2, "subtitle2");
        kotlin.jvm.internal.e0.checkNotNullParameter(body1, "body1");
        kotlin.jvm.internal.e0.checkNotNullParameter(body2, "body2");
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        kotlin.jvm.internal.e0.checkNotNullParameter(caption, "caption");
        kotlin.jvm.internal.e0.checkNotNullParameter(overline, "overline");
        this.f75171a = h12;
        this.f75172b = h22;
        this.f75173c = h32;
        this.f75174d = h42;
        this.f75175e = h52;
        this.f75176f = h62;
        this.f75177g = subtitle1;
        this.f75178h = subtitle2;
        this.f75179i = body1;
        this.f75180j = body2;
        this.f75181k = button;
        this.f75182l = caption;
        this.f75183m = overline;
    }

    public static /* synthetic */ r1 copy$default(r1 r1Var, c2 c2Var, c2 c2Var2, c2 c2Var3, c2 c2Var4, c2 c2Var5, c2 c2Var6, c2 c2Var7, c2 c2Var8, c2 c2Var9, c2 c2Var10, c2 c2Var11, c2 c2Var12, c2 c2Var13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2Var = r1Var.f75171a;
        }
        return r1Var.copy(c2Var, (i10 & 2) != 0 ? r1Var.f75172b : c2Var2, (i10 & 4) != 0 ? r1Var.f75173c : c2Var3, (i10 & 8) != 0 ? r1Var.f75174d : c2Var4, (i10 & 16) != 0 ? r1Var.f75175e : c2Var5, (i10 & 32) != 0 ? r1Var.f75176f : c2Var6, (i10 & 64) != 0 ? r1Var.f75177g : c2Var7, (i10 & 128) != 0 ? r1Var.f75178h : c2Var8, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? r1Var.f75179i : c2Var9, (i10 & 512) != 0 ? r1Var.f75180j : c2Var10, (i10 & 1024) != 0 ? r1Var.f75181k : c2Var11, (i10 & 2048) != 0 ? r1Var.f75182l : c2Var12, (i10 & 4096) != 0 ? r1Var.f75183m : c2Var13);
    }

    public final r1 copy(c2 h12, c2 h22, c2 h32, c2 h42, c2 h52, c2 h62, c2 subtitle1, c2 subtitle2, c2 body1, c2 body2, c2 button, c2 caption, c2 overline) {
        kotlin.jvm.internal.e0.checkNotNullParameter(h12, "h1");
        kotlin.jvm.internal.e0.checkNotNullParameter(h22, "h2");
        kotlin.jvm.internal.e0.checkNotNullParameter(h32, "h3");
        kotlin.jvm.internal.e0.checkNotNullParameter(h42, "h4");
        kotlin.jvm.internal.e0.checkNotNullParameter(h52, "h5");
        kotlin.jvm.internal.e0.checkNotNullParameter(h62, "h6");
        kotlin.jvm.internal.e0.checkNotNullParameter(subtitle1, "subtitle1");
        kotlin.jvm.internal.e0.checkNotNullParameter(subtitle2, "subtitle2");
        kotlin.jvm.internal.e0.checkNotNullParameter(body1, "body1");
        kotlin.jvm.internal.e0.checkNotNullParameter(body2, "body2");
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        kotlin.jvm.internal.e0.checkNotNullParameter(caption, "caption");
        kotlin.jvm.internal.e0.checkNotNullParameter(overline, "overline");
        return new r1(h12, h22, h32, h42, h52, h62, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f75171a, r1Var.f75171a) && kotlin.jvm.internal.e0.areEqual(this.f75172b, r1Var.f75172b) && kotlin.jvm.internal.e0.areEqual(this.f75173c, r1Var.f75173c) && kotlin.jvm.internal.e0.areEqual(this.f75174d, r1Var.f75174d) && kotlin.jvm.internal.e0.areEqual(this.f75175e, r1Var.f75175e) && kotlin.jvm.internal.e0.areEqual(this.f75176f, r1Var.f75176f) && kotlin.jvm.internal.e0.areEqual(this.f75177g, r1Var.f75177g) && kotlin.jvm.internal.e0.areEqual(this.f75178h, r1Var.f75178h) && kotlin.jvm.internal.e0.areEqual(this.f75179i, r1Var.f75179i) && kotlin.jvm.internal.e0.areEqual(this.f75180j, r1Var.f75180j) && kotlin.jvm.internal.e0.areEqual(this.f75181k, r1Var.f75181k) && kotlin.jvm.internal.e0.areEqual(this.f75182l, r1Var.f75182l) && kotlin.jvm.internal.e0.areEqual(this.f75183m, r1Var.f75183m);
    }

    public final c2 getBody1() {
        return this.f75179i;
    }

    public final c2 getBody2() {
        return this.f75180j;
    }

    public final c2 getButton() {
        return this.f75181k;
    }

    public final c2 getCaption() {
        return this.f75182l;
    }

    public final c2 getH1() {
        return this.f75171a;
    }

    public final c2 getH2() {
        return this.f75172b;
    }

    public final c2 getH3() {
        return this.f75173c;
    }

    public final c2 getH4() {
        return this.f75174d;
    }

    public final c2 getH5() {
        return this.f75175e;
    }

    public final c2 getH6() {
        return this.f75176f;
    }

    public final c2 getOverline() {
        return this.f75183m;
    }

    public final c2 getSubtitle1() {
        return this.f75177g;
    }

    public final c2 getSubtitle2() {
        return this.f75178h;
    }

    public int hashCode() {
        return this.f75183m.hashCode() + ((this.f75182l.hashCode() + ((this.f75181k.hashCode() + ((this.f75180j.hashCode() + ((this.f75179i.hashCode() + ((this.f75178h.hashCode() + ((this.f75177g.hashCode() + ((this.f75176f.hashCode() + ((this.f75175e.hashCode() + ((this.f75174d.hashCode() + ((this.f75173c.hashCode() + ((this.f75172b.hashCode() + (this.f75171a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Typography(h1=" + this.f75171a + ", h2=" + this.f75172b + ", h3=" + this.f75173c + ", h4=" + this.f75174d + ", h5=" + this.f75175e + ", h6=" + this.f75176f + ", subtitle1=" + this.f75177g + ", subtitle2=" + this.f75178h + ", body1=" + this.f75179i + ", body2=" + this.f75180j + ", button=" + this.f75181k + ", caption=" + this.f75182l + ", overline=" + this.f75183m + ')';
    }

    public /* synthetic */ r1(l2.x xVar, c2 c2Var, c2 c2Var2, c2 c2Var3, c2 c2Var4, c2 c2Var5, c2 c2Var6, c2 c2Var7, c2 c2Var8, c2 c2Var9, c2 c2Var10, c2 c2Var11, c2 c2Var12, c2 c2Var13, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? l2.x.f72386c.getDefault() : xVar, (i10 & 2) != 0 ? new c2(0L, s2.a0.getSp(96), l2.c1.f72258c.getLight(), null, null, null, null, s2.a0.getSp(-1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var, (i10 & 4) != 0 ? new c2(0L, s2.a0.getSp(60), l2.c1.f72258c.getLight(), null, null, null, null, s2.a0.getSp(-0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var2, (i10 & 8) != 0 ? new c2(0L, s2.a0.getSp(48), l2.c1.f72258c.getNormal(), null, null, null, null, s2.a0.getSp(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var3, (i10 & 16) != 0 ? new c2(0L, s2.a0.getSp(34), l2.c1.f72258c.getNormal(), null, null, null, null, s2.a0.getSp(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var4, (i10 & 32) != 0 ? new c2(0L, s2.a0.getSp(24), l2.c1.f72258c.getNormal(), null, null, null, null, s2.a0.getSp(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var5, (i10 & 64) != 0 ? new c2(0L, s2.a0.getSp(20), l2.c1.f72258c.getMedium(), null, null, null, null, s2.a0.getSp(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var6, (i10 & 128) != 0 ? new c2(0L, s2.a0.getSp(16), l2.c1.f72258c.getNormal(), null, null, null, null, s2.a0.getSp(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var7, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new c2(0L, s2.a0.getSp(14), l2.c1.f72258c.getMedium(), null, null, null, null, s2.a0.getSp(0.1d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var8, (i10 & 512) != 0 ? new c2(0L, s2.a0.getSp(16), l2.c1.f72258c.getNormal(), null, null, null, null, s2.a0.getSp(0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var9, (i10 & 1024) != 0 ? new c2(0L, s2.a0.getSp(14), l2.c1.f72258c.getNormal(), null, null, null, null, s2.a0.getSp(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var10, (i10 & 2048) != 0 ? new c2(0L, s2.a0.getSp(14), l2.c1.f72258c.getMedium(), null, null, null, null, s2.a0.getSp(1.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var11, (i10 & 4096) != 0 ? new c2(0L, s2.a0.getSp(12), l2.c1.f72258c.getNormal(), null, null, null, null, s2.a0.getSp(0.4d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var12, (i10 & Segment.SIZE) != 0 ? new c2(0L, s2.a0.getSp(10), l2.c1.f72258c.getNormal(), null, null, null, null, s2.a0.getSp(1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : c2Var13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r1(l2.x defaultFontFamily, c2 h12, c2 h22, c2 h32, c2 h42, c2 h52, c2 h62, c2 subtitle1, c2 subtitle2, c2 body1, c2 body2, c2 button, c2 caption, c2 overline) {
        this(t1.access$withDefaultFontFamily(h12, defaultFontFamily), t1.access$withDefaultFontFamily(h22, defaultFontFamily), t1.access$withDefaultFontFamily(h32, defaultFontFamily), t1.access$withDefaultFontFamily(h42, defaultFontFamily), t1.access$withDefaultFontFamily(h52, defaultFontFamily), t1.access$withDefaultFontFamily(h62, defaultFontFamily), t1.access$withDefaultFontFamily(subtitle1, defaultFontFamily), t1.access$withDefaultFontFamily(subtitle2, defaultFontFamily), t1.access$withDefaultFontFamily(body1, defaultFontFamily), t1.access$withDefaultFontFamily(body2, defaultFontFamily), t1.access$withDefaultFontFamily(button, defaultFontFamily), t1.access$withDefaultFontFamily(caption, defaultFontFamily), t1.access$withDefaultFontFamily(overline, defaultFontFamily));
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultFontFamily, "defaultFontFamily");
        kotlin.jvm.internal.e0.checkNotNullParameter(h12, "h1");
        kotlin.jvm.internal.e0.checkNotNullParameter(h22, "h2");
        kotlin.jvm.internal.e0.checkNotNullParameter(h32, "h3");
        kotlin.jvm.internal.e0.checkNotNullParameter(h42, "h4");
        kotlin.jvm.internal.e0.checkNotNullParameter(h52, "h5");
        kotlin.jvm.internal.e0.checkNotNullParameter(h62, "h6");
        kotlin.jvm.internal.e0.checkNotNullParameter(subtitle1, "subtitle1");
        kotlin.jvm.internal.e0.checkNotNullParameter(subtitle2, "subtitle2");
        kotlin.jvm.internal.e0.checkNotNullParameter(body1, "body1");
        kotlin.jvm.internal.e0.checkNotNullParameter(body2, "body2");
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        kotlin.jvm.internal.e0.checkNotNullParameter(caption, "caption");
        kotlin.jvm.internal.e0.checkNotNullParameter(overline, "overline");
    }
}
