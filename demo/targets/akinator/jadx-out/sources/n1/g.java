package n1;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f75375a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75376b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75377c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75378d;

        /* renamed from: e, reason: collision with root package name */
        public final float f75379e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f75380f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f75381g;

        /* renamed from: h, reason: collision with root package name */
        public final float f75382h;

        /* renamed from: i, reason: collision with root package name */
        public final float f75383i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f75377c = f10;
            this.f75378d = f11;
            this.f75379e = f12;
            this.f75380f = z10;
            this.f75381g = z11;
            this.f75382h = f13;
            this.f75383i = f14;
        }

        public static /* synthetic */ a copy$default(a aVar, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f75377c;
            }
            if ((i10 & 2) != 0) {
                f11 = aVar.f75378d;
            }
            if ((i10 & 4) != 0) {
                f12 = aVar.f75379e;
            }
            if ((i10 & 8) != 0) {
                z10 = aVar.f75380f;
            }
            if ((i10 & 16) != 0) {
                z11 = aVar.f75381g;
            }
            if ((i10 & 32) != 0) {
                f13 = aVar.f75382h;
            }
            if ((i10 & 64) != 0) {
                f14 = aVar.f75383i;
            }
            float f15 = f13;
            float f16 = f14;
            boolean z12 = z11;
            float f17 = f12;
            return aVar.copy(f10, f11, f17, z10, z12, f15, f16);
        }

        public final float component1() {
            return this.f75377c;
        }

        public final float component2() {
            return this.f75378d;
        }

        public final float component3() {
            return this.f75379e;
        }

        public final boolean component4() {
            return this.f75380f;
        }

        public final boolean component5() {
            return this.f75381g;
        }

        public final float component6() {
            return this.f75382h;
        }

        public final float component7() {
            return this.f75383i;
        }

        public final a copy(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            return new a(f10, f11, f12, z10, z11, f13, f14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75377c), (Object) Float.valueOf(aVar.f75377c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75378d), (Object) Float.valueOf(aVar.f75378d)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75379e), (Object) Float.valueOf(aVar.f75379e)) && this.f75380f == aVar.f75380f && this.f75381g == aVar.f75381g && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75382h), (Object) Float.valueOf(aVar.f75382h)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75383i), (Object) Float.valueOf(aVar.f75383i));
        }

        public final float getArcStartX() {
            return this.f75382h;
        }

        public final float getArcStartY() {
            return this.f75383i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.f75377c;
        }

        public final float getTheta() {
            return this.f75379e;
        }

        public final float getVerticalEllipseRadius() {
            return this.f75378d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iB = e2.b(this.f75379e, e2.b(this.f75378d, Float.hashCode(this.f75377c) * 31, 31), 31);
            boolean z10 = this.f75380f;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (iB + i10) * 31;
            boolean z11 = this.f75381g;
            return Float.hashCode(this.f75383i) + e2.b(this.f75382h, (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31);
        }

        public final boolean isMoreThanHalf() {
            return this.f75380f;
        }

        public final boolean isPositiveArc() {
            return this.f75381g;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb2.append(this.f75377c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f75378d);
            sb2.append(", theta=");
            sb2.append(this.f75379e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f75380f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f75381g);
            sb2.append(", arcStartX=");
            sb2.append(this.f75382h);
            sb2.append(", arcStartY=");
            return a.b.n(sb2, this.f75383i, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75384c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75385d;

        /* renamed from: e, reason: collision with root package name */
        public final float f75386e;

        /* renamed from: f, reason: collision with root package name */
        public final float f75387f;

        /* renamed from: g, reason: collision with root package name */
        public final float f75388g;

        /* renamed from: h, reason: collision with root package name */
        public final float f75389h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f75384c = f10;
            this.f75385d = f11;
            this.f75386e = f12;
            this.f75387f = f13;
            this.f75388g = f14;
            this.f75389h = f15;
        }

        public static /* synthetic */ b copy$default(b bVar, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = bVar.f75384c;
            }
            if ((i10 & 2) != 0) {
                f11 = bVar.f75385d;
            }
            if ((i10 & 4) != 0) {
                f12 = bVar.f75386e;
            }
            if ((i10 & 8) != 0) {
                f13 = bVar.f75387f;
            }
            if ((i10 & 16) != 0) {
                f14 = bVar.f75388g;
            }
            if ((i10 & 32) != 0) {
                f15 = bVar.f75389h;
            }
            float f16 = f14;
            float f17 = f15;
            return bVar.copy(f10, f11, f12, f13, f16, f17);
        }

        public final float component1() {
            return this.f75384c;
        }

        public final float component2() {
            return this.f75385d;
        }

        public final float component3() {
            return this.f75386e;
        }

        public final float component4() {
            return this.f75387f;
        }

        public final float component5() {
            return this.f75388g;
        }

        public final float component6() {
            return this.f75389h;
        }

        public final b copy(float f10, float f11, float f12, float f13, float f14, float f15) {
            return new b(f10, f11, f12, f13, f14, f15);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75384c), (Object) Float.valueOf(bVar.f75384c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75385d), (Object) Float.valueOf(bVar.f75385d)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75386e), (Object) Float.valueOf(bVar.f75386e)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75387f), (Object) Float.valueOf(bVar.f75387f)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75388g), (Object) Float.valueOf(bVar.f75388g)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75389h), (Object) Float.valueOf(bVar.f75389h));
        }

        public final float getX1() {
            return this.f75384c;
        }

        public final float getX2() {
            return this.f75386e;
        }

        public final float getX3() {
            return this.f75388g;
        }

        public final float getY1() {
            return this.f75385d;
        }

        public final float getY2() {
            return this.f75387f;
        }

        public final float getY3() {
            return this.f75389h;
        }

        public int hashCode() {
            return Float.hashCode(this.f75389h) + e2.b(this.f75388g, e2.b(this.f75387f, e2.b(this.f75386e, e2.b(this.f75385d, Float.hashCode(this.f75384c) * 31, 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
            sb2.append(this.f75384c);
            sb2.append(", y1=");
            sb2.append(this.f75385d);
            sb2.append(", x2=");
            sb2.append(this.f75386e);
            sb2.append(", y2=");
            sb2.append(this.f75387f);
            sb2.append(", x3=");
            sb2.append(this.f75388g);
            sb2.append(", y3=");
            return a.b.n(sb2, this.f75389h, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75390c;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f75390c = f10;
        }

        public static /* synthetic */ c copy$default(c cVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = cVar.f75390c;
            }
            return cVar.copy(f10);
        }

        public final float component1() {
            return this.f75390c;
        }

        public final c copy(float f10) {
            return new c(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75390c), (Object) Float.valueOf(((c) obj).f75390c));
        }

        public final float getX() {
            return this.f75390c;
        }

        public int hashCode() {
            return Float.hashCode(this.f75390c);
        }

        public String toString() {
            return a.b.n(new StringBuilder("HorizontalTo(x="), this.f75390c, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75391c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75392d;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f75391c = f10;
            this.f75392d = f11;
        }

        public static /* synthetic */ d copy$default(d dVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = dVar.f75391c;
            }
            if ((i10 & 2) != 0) {
                f11 = dVar.f75392d;
            }
            return dVar.copy(f10, f11);
        }

        public final float component1() {
            return this.f75391c;
        }

        public final float component2() {
            return this.f75392d;
        }

        public final d copy(float f10, float f11) {
            return new d(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75391c), (Object) Float.valueOf(dVar.f75391c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75392d), (Object) Float.valueOf(dVar.f75392d));
        }

        public final float getX() {
            return this.f75391c;
        }

        public final float getY() {
            return this.f75392d;
        }

        public int hashCode() {
            return Float.hashCode(this.f75392d) + (Float.hashCode(this.f75391c) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("LineTo(x=");
            sb2.append(this.f75391c);
            sb2.append(", y=");
            return a.b.n(sb2, this.f75392d, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75393c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75394d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f75393c = f10;
            this.f75394d = f11;
        }

        public static /* synthetic */ e copy$default(e eVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = eVar.f75393c;
            }
            if ((i10 & 2) != 0) {
                f11 = eVar.f75394d;
            }
            return eVar.copy(f10, f11);
        }

        public final float component1() {
            return this.f75393c;
        }

        public final float component2() {
            return this.f75394d;
        }

        public final e copy(float f10, float f11) {
            return new e(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75393c), (Object) Float.valueOf(eVar.f75393c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75394d), (Object) Float.valueOf(eVar.f75394d));
        }

        public final float getX() {
            return this.f75393c;
        }

        public final float getY() {
            return this.f75394d;
        }

        public int hashCode() {
            return Float.hashCode(this.f75394d) + (Float.hashCode(this.f75393c) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MoveTo(x=");
            sb2.append(this.f75393c);
            sb2.append(", y=");
            return a.b.n(sb2, this.f75394d, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75395c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75396d;

        /* renamed from: e, reason: collision with root package name */
        public final float f75397e;

        /* renamed from: f, reason: collision with root package name */
        public final float f75398f;

        public f(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f75395c = f10;
            this.f75396d = f11;
            this.f75397e = f12;
            this.f75398f = f13;
        }

        public static /* synthetic */ f copy$default(f fVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = fVar.f75395c;
            }
            if ((i10 & 2) != 0) {
                f11 = fVar.f75396d;
            }
            if ((i10 & 4) != 0) {
                f12 = fVar.f75397e;
            }
            if ((i10 & 8) != 0) {
                f13 = fVar.f75398f;
            }
            return fVar.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.f75395c;
        }

        public final float component2() {
            return this.f75396d;
        }

        public final float component3() {
            return this.f75397e;
        }

        public final float component4() {
            return this.f75398f;
        }

        public final f copy(float f10, float f11, float f12, float f13) {
            return new f(f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75395c), (Object) Float.valueOf(fVar.f75395c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75396d), (Object) Float.valueOf(fVar.f75396d)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75397e), (Object) Float.valueOf(fVar.f75397e)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75398f), (Object) Float.valueOf(fVar.f75398f));
        }

        public final float getX1() {
            return this.f75395c;
        }

        public final float getX2() {
            return this.f75397e;
        }

        public final float getY1() {
            return this.f75396d;
        }

        public final float getY2() {
            return this.f75398f;
        }

        public int hashCode() {
            return Float.hashCode(this.f75398f) + e2.b(this.f75397e, e2.b(this.f75396d, Float.hashCode(this.f75395c) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
            sb2.append(this.f75395c);
            sb2.append(", y1=");
            sb2.append(this.f75396d);
            sb2.append(", x2=");
            sb2.append(this.f75397e);
            sb2.append(", y2=");
            return a.b.n(sb2, this.f75398f, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: n1.g$g, reason: collision with other inner class name */
    public static final class C0751g extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75399c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75400d;

        /* renamed from: e, reason: collision with root package name */
        public final float f75401e;

        /* renamed from: f, reason: collision with root package name */
        public final float f75402f;

        public C0751g(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f75399c = f10;
            this.f75400d = f11;
            this.f75401e = f12;
            this.f75402f = f13;
        }

        public static /* synthetic */ C0751g copy$default(C0751g c0751g, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = c0751g.f75399c;
            }
            if ((i10 & 2) != 0) {
                f11 = c0751g.f75400d;
            }
            if ((i10 & 4) != 0) {
                f12 = c0751g.f75401e;
            }
            if ((i10 & 8) != 0) {
                f13 = c0751g.f75402f;
            }
            return c0751g.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.f75399c;
        }

        public final float component2() {
            return this.f75400d;
        }

        public final float component3() {
            return this.f75401e;
        }

        public final float component4() {
            return this.f75402f;
        }

        public final C0751g copy(float f10, float f11, float f12, float f13) {
            return new C0751g(f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0751g)) {
                return false;
            }
            C0751g c0751g = (C0751g) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75399c), (Object) Float.valueOf(c0751g.f75399c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75400d), (Object) Float.valueOf(c0751g.f75400d)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75401e), (Object) Float.valueOf(c0751g.f75401e)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75402f), (Object) Float.valueOf(c0751g.f75402f));
        }

        public final float getX1() {
            return this.f75399c;
        }

        public final float getX2() {
            return this.f75401e;
        }

        public final float getY1() {
            return this.f75400d;
        }

        public final float getY2() {
            return this.f75402f;
        }

        public int hashCode() {
            return Float.hashCode(this.f75402f) + e2.b(this.f75401e, e2.b(this.f75400d, Float.hashCode(this.f75399c) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
            sb2.append(this.f75399c);
            sb2.append(", y1=");
            sb2.append(this.f75400d);
            sb2.append(", x2=");
            sb2.append(this.f75401e);
            sb2.append(", y2=");
            return a.b.n(sb2, this.f75402f, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75403c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75404d;

        public h(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f75403c = f10;
            this.f75404d = f11;
        }

        public static /* synthetic */ h copy$default(h hVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = hVar.f75403c;
            }
            if ((i10 & 2) != 0) {
                f11 = hVar.f75404d;
            }
            return hVar.copy(f10, f11);
        }

        public final float component1() {
            return this.f75403c;
        }

        public final float component2() {
            return this.f75404d;
        }

        public final h copy(float f10, float f11) {
            return new h(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75403c), (Object) Float.valueOf(hVar.f75403c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75404d), (Object) Float.valueOf(hVar.f75404d));
        }

        public final float getX() {
            return this.f75403c;
        }

        public final float getY() {
            return this.f75404d;
        }

        public int hashCode() {
            return Float.hashCode(this.f75404d) + (Float.hashCode(this.f75403c) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
            sb2.append(this.f75403c);
            sb2.append(", y=");
            return a.b.n(sb2, this.f75404d, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75405c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75406d;

        /* renamed from: e, reason: collision with root package name */
        public final float f75407e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f75408f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f75409g;

        /* renamed from: h, reason: collision with root package name */
        public final float f75410h;

        /* renamed from: i, reason: collision with root package name */
        public final float f75411i;

        /* JADX WARN: Illegal instructions before constructor call */
        public i(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f75405c = f10;
            this.f75406d = f11;
            this.f75407e = f12;
            this.f75408f = z10;
            this.f75409g = z11;
            this.f75410h = f13;
            this.f75411i = f14;
        }

        public static /* synthetic */ i copy$default(i iVar, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = iVar.f75405c;
            }
            if ((i10 & 2) != 0) {
                f11 = iVar.f75406d;
            }
            if ((i10 & 4) != 0) {
                f12 = iVar.f75407e;
            }
            if ((i10 & 8) != 0) {
                z10 = iVar.f75408f;
            }
            if ((i10 & 16) != 0) {
                z11 = iVar.f75409g;
            }
            if ((i10 & 32) != 0) {
                f13 = iVar.f75410h;
            }
            if ((i10 & 64) != 0) {
                f14 = iVar.f75411i;
            }
            float f15 = f13;
            float f16 = f14;
            boolean z12 = z11;
            float f17 = f12;
            return iVar.copy(f10, f11, f17, z10, z12, f15, f16);
        }

        public final float component1() {
            return this.f75405c;
        }

        public final float component2() {
            return this.f75406d;
        }

        public final float component3() {
            return this.f75407e;
        }

        public final boolean component4() {
            return this.f75408f;
        }

        public final boolean component5() {
            return this.f75409g;
        }

        public final float component6() {
            return this.f75410h;
        }

        public final float component7() {
            return this.f75411i;
        }

        public final i copy(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            return new i(f10, f11, f12, z10, z11, f13, f14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75405c), (Object) Float.valueOf(iVar.f75405c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75406d), (Object) Float.valueOf(iVar.f75406d)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75407e), (Object) Float.valueOf(iVar.f75407e)) && this.f75408f == iVar.f75408f && this.f75409g == iVar.f75409g && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75410h), (Object) Float.valueOf(iVar.f75410h)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75411i), (Object) Float.valueOf(iVar.f75411i));
        }

        public final float getArcStartDx() {
            return this.f75410h;
        }

        public final float getArcStartDy() {
            return this.f75411i;
        }

        public final float getHorizontalEllipseRadius() {
            return this.f75405c;
        }

        public final float getTheta() {
            return this.f75407e;
        }

        public final float getVerticalEllipseRadius() {
            return this.f75406d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iB = e2.b(this.f75407e, e2.b(this.f75406d, Float.hashCode(this.f75405c) * 31, 31), 31);
            boolean z10 = this.f75408f;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (iB + i10) * 31;
            boolean z11 = this.f75409g;
            return Float.hashCode(this.f75411i) + e2.b(this.f75410h, (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31);
        }

        public final boolean isMoreThanHalf() {
            return this.f75408f;
        }

        public final boolean isPositiveArc() {
            return this.f75409g;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb2.append(this.f75405c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f75406d);
            sb2.append(", theta=");
            sb2.append(this.f75407e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f75408f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f75409g);
            sb2.append(", arcStartDx=");
            sb2.append(this.f75410h);
            sb2.append(", arcStartDy=");
            return a.b.n(sb2, this.f75411i, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75412c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75413d;

        /* renamed from: e, reason: collision with root package name */
        public final float f75414e;

        /* renamed from: f, reason: collision with root package name */
        public final float f75415f;

        /* renamed from: g, reason: collision with root package name */
        public final float f75416g;

        /* renamed from: h, reason: collision with root package name */
        public final float f75417h;

        public j(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f75412c = f10;
            this.f75413d = f11;
            this.f75414e = f12;
            this.f75415f = f13;
            this.f75416g = f14;
            this.f75417h = f15;
        }

        public static /* synthetic */ j copy$default(j jVar, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = jVar.f75412c;
            }
            if ((i10 & 2) != 0) {
                f11 = jVar.f75413d;
            }
            if ((i10 & 4) != 0) {
                f12 = jVar.f75414e;
            }
            if ((i10 & 8) != 0) {
                f13 = jVar.f75415f;
            }
            if ((i10 & 16) != 0) {
                f14 = jVar.f75416g;
            }
            if ((i10 & 32) != 0) {
                f15 = jVar.f75417h;
            }
            float f16 = f14;
            float f17 = f15;
            return jVar.copy(f10, f11, f12, f13, f16, f17);
        }

        public final float component1() {
            return this.f75412c;
        }

        public final float component2() {
            return this.f75413d;
        }

        public final float component3() {
            return this.f75414e;
        }

        public final float component4() {
            return this.f75415f;
        }

        public final float component5() {
            return this.f75416g;
        }

        public final float component6() {
            return this.f75417h;
        }

        public final j copy(float f10, float f11, float f12, float f13, float f14, float f15) {
            return new j(f10, f11, f12, f13, f14, f15);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75412c), (Object) Float.valueOf(jVar.f75412c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75413d), (Object) Float.valueOf(jVar.f75413d)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75414e), (Object) Float.valueOf(jVar.f75414e)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75415f), (Object) Float.valueOf(jVar.f75415f)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75416g), (Object) Float.valueOf(jVar.f75416g)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75417h), (Object) Float.valueOf(jVar.f75417h));
        }

        public final float getDx1() {
            return this.f75412c;
        }

        public final float getDx2() {
            return this.f75414e;
        }

        public final float getDx3() {
            return this.f75416g;
        }

        public final float getDy1() {
            return this.f75413d;
        }

        public final float getDy2() {
            return this.f75415f;
        }

        public final float getDy3() {
            return this.f75417h;
        }

        public int hashCode() {
            return Float.hashCode(this.f75417h) + e2.b(this.f75416g, e2.b(this.f75415f, e2.b(this.f75414e, e2.b(this.f75413d, Float.hashCode(this.f75412c) * 31, 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
            sb2.append(this.f75412c);
            sb2.append(", dy1=");
            sb2.append(this.f75413d);
            sb2.append(", dx2=");
            sb2.append(this.f75414e);
            sb2.append(", dy2=");
            sb2.append(this.f75415f);
            sb2.append(", dx3=");
            sb2.append(this.f75416g);
            sb2.append(", dy3=");
            return a.b.n(sb2, this.f75417h, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75418c;

        /* JADX WARN: Illegal instructions before constructor call */
        public k(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f75418c = f10;
        }

        public static /* synthetic */ k copy$default(k kVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = kVar.f75418c;
            }
            return kVar.copy(f10);
        }

        public final float component1() {
            return this.f75418c;
        }

        public final k copy(float f10) {
            return new k(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75418c), (Object) Float.valueOf(((k) obj).f75418c));
        }

        public final float getDx() {
            return this.f75418c;
        }

        public int hashCode() {
            return Float.hashCode(this.f75418c);
        }

        public String toString() {
            return a.b.n(new StringBuilder("RelativeHorizontalTo(dx="), this.f75418c, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75419c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75420d;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f75419c = f10;
            this.f75420d = f11;
        }

        public static /* synthetic */ l copy$default(l lVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = lVar.f75419c;
            }
            if ((i10 & 2) != 0) {
                f11 = lVar.f75420d;
            }
            return lVar.copy(f10, f11);
        }

        public final float component1() {
            return this.f75419c;
        }

        public final float component2() {
            return this.f75420d;
        }

        public final l copy(float f10, float f11) {
            return new l(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75419c), (Object) Float.valueOf(lVar.f75419c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75420d), (Object) Float.valueOf(lVar.f75420d));
        }

        public final float getDx() {
            return this.f75419c;
        }

        public final float getDy() {
            return this.f75420d;
        }

        public int hashCode() {
            return Float.hashCode(this.f75420d) + (Float.hashCode(this.f75419c) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
            sb2.append(this.f75419c);
            sb2.append(", dy=");
            return a.b.n(sb2, this.f75420d, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75421c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75422d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f75421c = f10;
            this.f75422d = f11;
        }

        public static /* synthetic */ m copy$default(m mVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = mVar.f75421c;
            }
            if ((i10 & 2) != 0) {
                f11 = mVar.f75422d;
            }
            return mVar.copy(f10, f11);
        }

        public final float component1() {
            return this.f75421c;
        }

        public final float component2() {
            return this.f75422d;
        }

        public final m copy(float f10, float f11) {
            return new m(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75421c), (Object) Float.valueOf(mVar.f75421c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75422d), (Object) Float.valueOf(mVar.f75422d));
        }

        public final float getDx() {
            return this.f75421c;
        }

        public final float getDy() {
            return this.f75422d;
        }

        public int hashCode() {
            return Float.hashCode(this.f75422d) + (Float.hashCode(this.f75421c) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
            sb2.append(this.f75421c);
            sb2.append(", dy=");
            return a.b.n(sb2, this.f75422d, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75423c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75424d;

        /* renamed from: e, reason: collision with root package name */
        public final float f75425e;

        /* renamed from: f, reason: collision with root package name */
        public final float f75426f;

        public n(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f75423c = f10;
            this.f75424d = f11;
            this.f75425e = f12;
            this.f75426f = f13;
        }

        public static /* synthetic */ n copy$default(n nVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = nVar.f75423c;
            }
            if ((i10 & 2) != 0) {
                f11 = nVar.f75424d;
            }
            if ((i10 & 4) != 0) {
                f12 = nVar.f75425e;
            }
            if ((i10 & 8) != 0) {
                f13 = nVar.f75426f;
            }
            return nVar.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.f75423c;
        }

        public final float component2() {
            return this.f75424d;
        }

        public final float component3() {
            return this.f75425e;
        }

        public final float component4() {
            return this.f75426f;
        }

        public final n copy(float f10, float f11, float f12, float f13) {
            return new n(f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75423c), (Object) Float.valueOf(nVar.f75423c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75424d), (Object) Float.valueOf(nVar.f75424d)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75425e), (Object) Float.valueOf(nVar.f75425e)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75426f), (Object) Float.valueOf(nVar.f75426f));
        }

        public final float getDx1() {
            return this.f75423c;
        }

        public final float getDx2() {
            return this.f75425e;
        }

        public final float getDy1() {
            return this.f75424d;
        }

        public final float getDy2() {
            return this.f75426f;
        }

        public int hashCode() {
            return Float.hashCode(this.f75426f) + e2.b(this.f75425e, e2.b(this.f75424d, Float.hashCode(this.f75423c) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
            sb2.append(this.f75423c);
            sb2.append(", dy1=");
            sb2.append(this.f75424d);
            sb2.append(", dx2=");
            sb2.append(this.f75425e);
            sb2.append(", dy2=");
            return a.b.n(sb2, this.f75426f, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75427c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75428d;

        /* renamed from: e, reason: collision with root package name */
        public final float f75429e;

        /* renamed from: f, reason: collision with root package name */
        public final float f75430f;

        public o(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f75427c = f10;
            this.f75428d = f11;
            this.f75429e = f12;
            this.f75430f = f13;
        }

        public static /* synthetic */ o copy$default(o oVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = oVar.f75427c;
            }
            if ((i10 & 2) != 0) {
                f11 = oVar.f75428d;
            }
            if ((i10 & 4) != 0) {
                f12 = oVar.f75429e;
            }
            if ((i10 & 8) != 0) {
                f13 = oVar.f75430f;
            }
            return oVar.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.f75427c;
        }

        public final float component2() {
            return this.f75428d;
        }

        public final float component3() {
            return this.f75429e;
        }

        public final float component4() {
            return this.f75430f;
        }

        public final o copy(float f10, float f11, float f12, float f13) {
            return new o(f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75427c), (Object) Float.valueOf(oVar.f75427c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75428d), (Object) Float.valueOf(oVar.f75428d)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75429e), (Object) Float.valueOf(oVar.f75429e)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75430f), (Object) Float.valueOf(oVar.f75430f));
        }

        public final float getDx1() {
            return this.f75427c;
        }

        public final float getDx2() {
            return this.f75429e;
        }

        public final float getDy1() {
            return this.f75428d;
        }

        public final float getDy2() {
            return this.f75430f;
        }

        public int hashCode() {
            return Float.hashCode(this.f75430f) + e2.b(this.f75429e, e2.b(this.f75428d, Float.hashCode(this.f75427c) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb2.append(this.f75427c);
            sb2.append(", dy1=");
            sb2.append(this.f75428d);
            sb2.append(", dx2=");
            sb2.append(this.f75429e);
            sb2.append(", dy2=");
            return a.b.n(sb2, this.f75430f, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class p extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75431c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75432d;

        public p(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f75431c = f10;
            this.f75432d = f11;
        }

        public static /* synthetic */ p copy$default(p pVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = pVar.f75431c;
            }
            if ((i10 & 2) != 0) {
                f11 = pVar.f75432d;
            }
            return pVar.copy(f10, f11);
        }

        public final float component1() {
            return this.f75431c;
        }

        public final float component2() {
            return this.f75432d;
        }

        public final p copy(float f10, float f11) {
            return new p(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75431c), (Object) Float.valueOf(pVar.f75431c)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75432d), (Object) Float.valueOf(pVar.f75432d));
        }

        public final float getDx() {
            return this.f75431c;
        }

        public final float getDy() {
            return this.f75432d;
        }

        public int hashCode() {
            return Float.hashCode(this.f75432d) + (Float.hashCode(this.f75431c) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb2.append(this.f75431c);
            sb2.append(", dy=");
            return a.b.n(sb2, this.f75432d, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class q extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75433c;

        /* JADX WARN: Illegal instructions before constructor call */
        public q(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f75433c = f10;
        }

        public static /* synthetic */ q copy$default(q qVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = qVar.f75433c;
            }
            return qVar.copy(f10);
        }

        public final float component1() {
            return this.f75433c;
        }

        public final q copy(float f10) {
            return new q(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75433c), (Object) Float.valueOf(((q) obj).f75433c));
        }

        public final float getDy() {
            return this.f75433c;
        }

        public int hashCode() {
            return Float.hashCode(this.f75433c);
        }

        public String toString() {
            return a.b.n(new StringBuilder("RelativeVerticalTo(dy="), this.f75433c, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class r extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f75434c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f75434c = f10;
        }

        public static /* synthetic */ r copy$default(r rVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = rVar.f75434c;
            }
            return rVar.copy(f10);
        }

        public final float component1() {
            return this.f75434c;
        }

        public final r copy(float f10) {
            return new r(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f75434c), (Object) Float.valueOf(((r) obj).f75434c));
        }

        public final float getY() {
            return this.f75434c;
        }

        public int hashCode() {
            return Float.hashCode(this.f75434c);
        }

        public String toString() {
            return a.b.n(new StringBuilder("VerticalTo(y="), this.f75434c, ')');
        }
    }

    public g(boolean z10, boolean z11, kotlin.jvm.internal.u uVar) {
        this.f75375a = z10;
        this.f75376b = z11;
    }

    public final boolean isCurve() {
        return this.f75375a;
    }

    public final boolean isQuad() {
        return this.f75376b;
    }

    public /* synthetic */ g(boolean z10, boolean z11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}
