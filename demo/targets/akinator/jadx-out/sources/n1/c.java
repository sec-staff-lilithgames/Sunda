package n1;

import androidx.core.app.NotificationCompat;
import b0.e2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f75304a;

    /* renamed from: b, reason: collision with root package name */
    public final float f75305b;

    /* renamed from: c, reason: collision with root package name */
    public final float f75306c;

    /* renamed from: d, reason: collision with root package name */
    public final float f75307d;

    /* renamed from: e, reason: collision with root package name */
    public final float f75308e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f75309f;

    /* renamed from: g, reason: collision with root package name */
    public final long f75310g;

    /* renamed from: h, reason: collision with root package name */
    public final int f75311h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f75312i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new b(null);
    }

    public c(String str, float f10, float f11, float f12, float f13, v0 v0Var, long j10, int i10, boolean z10, kotlin.jvm.internal.u uVar) {
        this.f75304a = str;
        this.f75305b = f10;
        this.f75306c = f11;
        this.f75307d = f12;
        this.f75308e = f13;
        this.f75309f = v0Var;
        this.f75310g = j10;
        this.f75311h = i10;
        this.f75312i = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f75304a, cVar.f75304a) && s2.i.m6822equalsimpl0(this.f75305b, cVar.f75305b) && s2.i.m6822equalsimpl0(this.f75306c, cVar.f75306c) && this.f75307d == cVar.f75307d && this.f75308e == cVar.f75308e && kotlin.jvm.internal.e0.areEqual(this.f75309f, cVar.f75309f) && j1.m0.m4859equalsimpl0(this.f75310g, cVar.f75310g) && j1.x.m5070equalsimpl0(this.f75311h, cVar.f75311h) && this.f75312i == cVar.f75312i;
    }

    public final boolean getAutoMirror() {
        return this.f75312i;
    }

    /* renamed from: getDefaultHeight-D9Ej5fM, reason: not valid java name */
    public final float m5709getDefaultHeightD9Ej5fM() {
        return this.f75306c;
    }

    /* renamed from: getDefaultWidth-D9Ej5fM, reason: not valid java name */
    public final float m5710getDefaultWidthD9Ej5fM() {
        return this.f75305b;
    }

    public final String getName() {
        return this.f75304a;
    }

    public final v0 getRoot() {
        return this.f75309f;
    }

    /* renamed from: getTintBlendMode-0nO6VwU, reason: not valid java name */
    public final int m5711getTintBlendMode0nO6VwU() {
        return this.f75311h;
    }

    /* renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m5712getTintColor0d7_KjU() {
        return this.f75310g;
    }

    public final float getViewportHeight() {
        return this.f75308e;
    }

    public final float getViewportWidth() {
        return this.f75307d;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f75312i) + ((j1.x.m5071hashCodeimpl(this.f75311h) + ((j1.m0.m4865hashCodeimpl(this.f75310g) + ((this.f75309f.hashCode() + e2.b(this.f75308e, e2.b(this.f75307d, (s2.i.m6823hashCodeimpl(this.f75306c) + ((s2.i.m6823hashCodeimpl(this.f75305b) + (this.f75304a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f75313a;

        /* renamed from: b, reason: collision with root package name */
        public final float f75314b;

        /* renamed from: c, reason: collision with root package name */
        public final float f75315c;

        /* renamed from: d, reason: collision with root package name */
        public final float f75316d;

        /* renamed from: e, reason: collision with root package name */
        public final float f75317e;

        /* renamed from: f, reason: collision with root package name */
        public final long f75318f;

        /* renamed from: g, reason: collision with root package name */
        public final int f75319g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f75320h;

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList f75321i;

        /* renamed from: j, reason: collision with root package name */
        public final C0750a f75322j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f75323k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: n1.c$a$a, reason: collision with other inner class name */
        public static final class C0750a {

            /* renamed from: a, reason: collision with root package name */
            public String f75324a;

            /* renamed from: b, reason: collision with root package name */
            public float f75325b;

            /* renamed from: c, reason: collision with root package name */
            public float f75326c;

            /* renamed from: d, reason: collision with root package name */
            public float f75327d;

            /* renamed from: e, reason: collision with root package name */
            public float f75328e;

            /* renamed from: f, reason: collision with root package name */
            public float f75329f;

            /* renamed from: g, reason: collision with root package name */
            public float f75330g;

            /* renamed from: h, reason: collision with root package name */
            public float f75331h;

            /* renamed from: i, reason: collision with root package name */
            public List f75332i;

            /* renamed from: j, reason: collision with root package name */
            public List f75333j;

            public C0750a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
            }

            public final List<x0> getChildren() {
                return this.f75333j;
            }

            public final List<g> getClipPathData() {
                return this.f75332i;
            }

            public final String getName() {
                return this.f75324a;
            }

            public final float getPivotX() {
                return this.f75326c;
            }

            public final float getPivotY() {
                return this.f75327d;
            }

            public final float getRotate() {
                return this.f75325b;
            }

            public final float getScaleX() {
                return this.f75328e;
            }

            public final float getScaleY() {
                return this.f75329f;
            }

            public final float getTranslationX() {
                return this.f75330g;
            }

            public final float getTranslationY() {
                return this.f75331h;
            }

            public final void setChildren(List<x0> list) {
                kotlin.jvm.internal.e0.checkNotNullParameter(list, "<set-?>");
                this.f75333j = list;
            }

            public final void setClipPathData(List<? extends g> list) {
                kotlin.jvm.internal.e0.checkNotNullParameter(list, "<set-?>");
                this.f75332i = list;
            }

            public final void setName(String str) {
                kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
                this.f75324a = str;
            }

            public final void setPivotX(float f10) {
                this.f75326c = f10;
            }

            public final void setPivotY(float f10) {
                this.f75327d = f10;
            }

            public final void setRotate(float f10) {
                this.f75325b = f10;
            }

            public final void setScaleX(float f10) {
                this.f75328e = f10;
            }

            public final void setScaleY(float f10) {
                this.f75329f = f10;
            }

            public final void setTranslationX(float f10) {
                this.f75330g = f10;
            }

            public final void setTranslationY(float f10) {
                this.f75331h = f10;
            }

            public C0750a(String name, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends g> clipPathData, List<x0> children) {
                kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
                kotlin.jvm.internal.e0.checkNotNullParameter(clipPathData, "clipPathData");
                kotlin.jvm.internal.e0.checkNotNullParameter(children, "children");
                this.f75324a = name;
                this.f75325b = f10;
                this.f75326c = f11;
                this.f75327d = f12;
                this.f75328e = f13;
                this.f75329f = f14;
                this.f75330g = f15;
                this.f75331h = f16;
                this.f75332i = clipPathData;
                this.f75333j = children;
            }

            public /* synthetic */ C0750a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, kotlin.jvm.internal.u uVar) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? w0.getEmptyPath() : list, (i10 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, kotlin.jvm.internal.u uVar) {
            this.f75313a = str;
            this.f75314b = f10;
            this.f75315c = f11;
            this.f75316d = f12;
            this.f75317e = f13;
            this.f75318f = j10;
            this.f75319g = i10;
            this.f75320h = z10;
            ArrayList arrayListM5731constructorimpl$default = k.m5731constructorimpl$default(null, 1, null);
            this.f75321i = arrayListM5731constructorimpl$default;
            C0750a c0750a = new C0750a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
            this.f75322j = c0750a;
            k.m5738pushimpl(arrayListM5731constructorimpl$default, c0750a);
        }

        public static v0 a(C0750a c0750a) {
            return new v0(c0750a.getName(), c0750a.getRotate(), c0750a.getPivotX(), c0750a.getPivotY(), c0750a.getScaleX(), c0750a.getScaleY(), c0750a.getTranslationX(), c0750a.getTranslationY(), c0750a.getClipPathData(), c0750a.getChildren());
        }

        public static /* synthetic */ a addGroup$default(a aVar, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "";
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i10 & 4) != 0) {
                f11 = 0.0f;
            }
            if ((i10 & 8) != 0) {
                f12 = 0.0f;
            }
            if ((i10 & 16) != 0) {
                f13 = 1.0f;
            }
            if ((i10 & 32) != 0) {
                f14 = 1.0f;
            }
            if ((i10 & 64) != 0) {
                f15 = 0.0f;
            }
            if ((i10 & 128) != 0) {
                f16 = 0.0f;
            }
            if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                list = w0.getEmptyPath();
            }
            float f17 = f16;
            List list2 = list;
            float f18 = f15;
            float f19 = f13;
            return aVar.addGroup(str, f10, f11, f12, f19, f14, f18, f17, list2);
        }

        public final a addGroup(String name, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends g> clipPathData) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(clipPathData, "clipPathData");
            b();
            k.m5738pushimpl(this.f75321i, new C0750a(name, f10, f11, f12, f13, f14, f15, f16, clipPathData, null, 512, null));
            return this;
        }

        /* renamed from: addPath-oIyEayM, reason: not valid java name */
        public final a m5714addPathoIyEayM(List<? extends g> pathData, int i10, String name, j1.b0 b0Var, float f10, j1.b0 b0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pathData, "pathData");
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            b();
            ((C0750a) k.m5736peekimpl(this.f75321i)).getChildren().add(new j1(name, pathData, i10, b0Var, f10, b0Var2, f11, f12, i11, i12, f13, f14, f15, f16, null));
            return this;
        }

        public final void b() {
            if (this.f75323k) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        public final c build() {
            b();
            while (k.m5734getSizeimpl(this.f75321i) > 1) {
                clearGroup();
            }
            c cVar = new c(this.f75313a, this.f75314b, this.f75315c, this.f75316d, this.f75317e, a(this.f75322j), this.f75318f, this.f75319g, this.f75320h, null);
            this.f75323k = true;
            return cVar;
        }

        public final a clearGroup() {
            b();
            ArrayList arrayList = this.f75321i;
            ((C0750a) k.m5736peekimpl(arrayList)).getChildren().add(a((C0750a) k.m5737popimpl(arrayList)));
            return this;
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j10, (i11 & 64) != 0 ? j1.x.f69020b.m5060getSrcIn0nO6VwU() : i10, (i11 & 128) != 0 ? false : z10, (kotlin.jvm.internal.u) null);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, int i11, kotlin.jvm.internal.u uVar) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? j1.m0.f68918b.m4835getUnspecified0d7_KjU() : j10, (i11 & 64) != 0 ? j1.x.f69020b.m5060getSrcIn0nO6VwU() : i10, null);
        }

        @tu.f
        public a(String str, float f10, float f11, float f12, float f13, long j10, int i10, kotlin.jvm.internal.u uVar) {
            this(str, f10, f11, f12, f13, j10, i10, false, (kotlin.jvm.internal.u) null);
        }
    }
}
