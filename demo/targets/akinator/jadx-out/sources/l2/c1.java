package l2;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f72258c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final c1 f72259e;

    /* renamed from: f, reason: collision with root package name */
    public static final c1 f72260f;

    /* renamed from: g, reason: collision with root package name */
    public static final c1 f72261g;

    /* renamed from: h, reason: collision with root package name */
    public static final c1 f72262h;

    /* renamed from: i, reason: collision with root package name */
    public static final c1 f72263i;

    /* renamed from: j, reason: collision with root package name */
    public static final c1 f72264j;

    /* renamed from: k, reason: collision with root package name */
    public static final c1 f72265k;

    /* renamed from: l, reason: collision with root package name */
    public static final c1 f72266l;

    /* renamed from: m, reason: collision with root package name */
    public static final c1 f72267m;

    /* renamed from: n, reason: collision with root package name */
    public static final c1 f72268n;

    /* renamed from: o, reason: collision with root package name */
    public static final c1 f72269o;

    /* renamed from: p, reason: collision with root package name */
    public static final c1 f72270p;

    /* renamed from: q, reason: collision with root package name */
    public static final c1 f72271q;

    /* renamed from: r, reason: collision with root package name */
    public static final c1 f72272r;

    /* renamed from: s, reason: collision with root package name */
    public static final c1 f72273s;

    /* renamed from: t, reason: collision with root package name */
    public static final c1 f72274t;

    /* renamed from: u, reason: collision with root package name */
    public static final c1 f72275u;

    /* renamed from: v, reason: collision with root package name */
    public static final c1 f72276v;

    /* renamed from: w, reason: collision with root package name */
    public static final List f72277w;

    /* renamed from: b, reason: collision with root package name */
    public final int f72278b;

    static {
        c1 c1Var = new c1(100);
        f72259e = c1Var;
        c1 c1Var2 = new c1(200);
        f72260f = c1Var2;
        c1 c1Var3 = new c1(300);
        f72261g = c1Var3;
        c1 c1Var4 = new c1(400);
        f72262h = c1Var4;
        c1 c1Var5 = new c1(500);
        f72263i = c1Var5;
        c1 c1Var6 = new c1(600);
        f72264j = c1Var6;
        c1 c1Var7 = new c1(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
        f72265k = c1Var7;
        c1 c1Var8 = new c1(800);
        f72266l = c1Var8;
        c1 c1Var9 = new c1(900);
        f72267m = c1Var9;
        f72268n = c1Var;
        f72269o = c1Var2;
        f72270p = c1Var3;
        f72271q = c1Var4;
        f72272r = c1Var5;
        f72273s = c1Var6;
        f72274t = c1Var7;
        f72275u = c1Var8;
        f72276v = c1Var9;
        f72277w = uu.p0.listOf((Object[]) new c1[]{c1Var, c1Var2, c1Var3, c1Var4, c1Var5, c1Var6, c1Var7, c1Var8, c1Var9});
    }

    public c1(int i10) {
        this.f72278b = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(a.b.e(i10, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            return this.f72278b == ((c1) obj).f72278b;
        }
        return false;
    }

    public final int getWeight() {
        return this.f72278b;
    }

    public int hashCode() {
        return this.f72278b;
    }

    public String toString() {
        return e3.g.m(new StringBuilder("FontWeight(weight="), this.f72278b, ')');
    }

    @Override // java.lang.Comparable
    public int compareTo(c1 other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return kotlin.jvm.internal.e0.compare(this.f72278b, other.f72278b);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final c1 getBlack() {
            return c1.f72276v;
        }

        public final c1 getBold() {
            return c1.f72274t;
        }

        public final c1 getExtraBold() {
            return c1.f72275u;
        }

        public final c1 getExtraLight() {
            return c1.f72269o;
        }

        public final c1 getLight() {
            return c1.f72270p;
        }

        public final c1 getMedium() {
            return c1.f72272r;
        }

        public final c1 getNormal() {
            return c1.f72271q;
        }

        public final c1 getSemiBold() {
            return c1.f72273s;
        }

        public final c1 getThin() {
            return c1.f72268n;
        }

        public final List<c1> getValues$ui_text_release() {
            return c1.f72277w;
        }

        public final c1 getW100() {
            return c1.f72259e;
        }

        public final c1 getW200() {
            return c1.f72260f;
        }

        public final c1 getW300() {
            return c1.f72261g;
        }

        public final c1 getW400() {
            return c1.f72262h;
        }

        public final c1 getW500() {
            return c1.f72263i;
        }

        public final c1 getW600() {
            return c1.f72264j;
        }

        public final c1 getW700() {
            return c1.f72265k;
        }

        public final c1 getW800() {
            return c1.f72266l;
        }

        public final c1 getW900() {
            return c1.f72267m;
        }

        public static /* synthetic */ void getBlack$annotations() {
        }

        public static /* synthetic */ void getBold$annotations() {
        }

        public static /* synthetic */ void getExtraBold$annotations() {
        }

        public static /* synthetic */ void getExtraLight$annotations() {
        }

        public static /* synthetic */ void getLight$annotations() {
        }

        public static /* synthetic */ void getMedium$annotations() {
        }

        public static /* synthetic */ void getNormal$annotations() {
        }

        public static /* synthetic */ void getSemiBold$annotations() {
        }

        public static /* synthetic */ void getThin$annotations() {
        }

        public static /* synthetic */ void getW100$annotations() {
        }

        public static /* synthetic */ void getW200$annotations() {
        }

        public static /* synthetic */ void getW300$annotations() {
        }

        public static /* synthetic */ void getW400$annotations() {
        }

        public static /* synthetic */ void getW500$annotations() {
        }

        public static /* synthetic */ void getW600$annotations() {
        }

        public static /* synthetic */ void getW700$annotations() {
        }

        public static /* synthetic */ void getW800$annotations() {
        }

        public static /* synthetic */ void getW900$annotations() {
        }
    }
}
