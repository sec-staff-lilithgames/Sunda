package e1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public final float f53470b;

    /* renamed from: c, reason: collision with root package name */
    public final float f53471c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements e1.b {

        /* renamed from: a, reason: collision with root package name */
        public final float f53472a;

        public a(float f10) {
            this.f53472a = f10;
        }

        public static /* synthetic */ a copy$default(a aVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f53472a;
            }
            return aVar.copy(f10);
        }

        @Override // e1.b
        public int align(int i10, int i11, s2.x layoutDirection) {
            e0.checkNotNullParameter(layoutDirection, "layoutDirection");
            float f10 = (i11 - i10) / 2.0f;
            s2.x xVar = s2.x.f85363b;
            float f11 = this.f53472a;
            if (layoutDirection != xVar) {
                f11 *= -1;
            }
            return mv.d.roundToInt((1 + f11) * f10);
        }

        public final a copy(float f10) {
            return new a(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && e0.areEqual((Object) Float.valueOf(this.f53472a), (Object) Float.valueOf(((a) obj).f53472a));
        }

        public int hashCode() {
            return Float.hashCode(this.f53472a);
        }

        public String toString() {
            return a.b.n(new StringBuilder("Horizontal(bias="), this.f53472a, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final float f53473a;

        public b(float f10) {
            this.f53473a = f10;
        }

        public static /* synthetic */ b copy$default(b bVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = bVar.f53473a;
            }
            return bVar.copy(f10);
        }

        @Override // e1.c
        public int align(int i10, int i11) {
            return mv.d.roundToInt((1 + this.f53473a) * ((i11 - i10) / 2.0f));
        }

        public final b copy(float f10) {
            return new b(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && e0.areEqual((Object) Float.valueOf(this.f53473a), (Object) Float.valueOf(((b) obj).f53473a));
        }

        public int hashCode() {
            return Float.hashCode(this.f53473a);
        }

        public String toString() {
            return a.b.n(new StringBuilder("Vertical(bias="), this.f53473a, ')');
        }
    }

    public e(float f10, float f11) {
        this.f53470b = f10;
        this.f53471c = f11;
    }

    public static /* synthetic */ e copy$default(e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = eVar.f53470b;
        }
        if ((i10 & 2) != 0) {
            f11 = eVar.f53471c;
        }
        return eVar.copy(f10, f11);
    }

    @Override // e1.d
    /* renamed from: align-KFBX0sM */
    public long mo3802alignKFBX0sM(long j10, long j11, s2.x layoutDirection) {
        e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        float fM6972getWidthimpl = (s2.v.m6972getWidthimpl(j11) - s2.v.m6972getWidthimpl(j10)) / 2.0f;
        float fM6971getHeightimpl = (s2.v.m6971getHeightimpl(j11) - s2.v.m6971getHeightimpl(j10)) / 2.0f;
        s2.x xVar = s2.x.f85363b;
        float f10 = this.f53470b;
        if (layoutDirection != xVar) {
            f10 *= -1;
        }
        float f11 = 1;
        return s2.r.IntOffset(mv.d.roundToInt((f10 + f11) * fM6972getWidthimpl), mv.d.roundToInt((f11 + this.f53471c) * fM6971getHeightimpl));
    }

    public final float component1() {
        return this.f53470b;
    }

    public final float component2() {
        return this.f53471c;
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
        return e0.areEqual((Object) Float.valueOf(this.f53470b), (Object) Float.valueOf(eVar.f53470b)) && e0.areEqual((Object) Float.valueOf(this.f53471c), (Object) Float.valueOf(eVar.f53471c));
    }

    public final float getHorizontalBias() {
        return this.f53470b;
    }

    public final float getVerticalBias() {
        return this.f53471c;
    }

    public int hashCode() {
        return Float.hashCode(this.f53471c) + (Float.hashCode(this.f53470b) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f53470b);
        sb2.append(", verticalBias=");
        return a.b.n(sb2, this.f53471c, ')');
    }
}
