package yg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class p {

    /* renamed from: m, reason: collision with root package name */
    public static final n f94477m = new n(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public e f94478a = new o();

    /* renamed from: b, reason: collision with root package name */
    public e f94479b = new o();

    /* renamed from: c, reason: collision with root package name */
    public e f94480c = new o();

    /* renamed from: d, reason: collision with root package name */
    public e f94481d = new o();

    /* renamed from: e, reason: collision with root package name */
    public d f94482e = new yg.a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f94483f = new yg.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f94484g = new yg.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public d f94485h = new yg.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public g f94486i = new g();

    /* renamed from: j, reason: collision with root package name */
    public g f94487j = new g();

    /* renamed from: k, reason: collision with root package name */
    public g f94488k = new g();

    /* renamed from: l, reason: collision with root package name */
    public g f94489l = new g();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public e f94490a;

        /* renamed from: b, reason: collision with root package name */
        public e f94491b;

        /* renamed from: c, reason: collision with root package name */
        public e f94492c;

        /* renamed from: d, reason: collision with root package name */
        public e f94493d;

        /* renamed from: e, reason: collision with root package name */
        public d f94494e;

        /* renamed from: f, reason: collision with root package name */
        public d f94495f;

        /* renamed from: g, reason: collision with root package name */
        public d f94496g;

        /* renamed from: h, reason: collision with root package name */
        public d f94497h;

        /* renamed from: i, reason: collision with root package name */
        public g f94498i;

        /* renamed from: j, reason: collision with root package name */
        public g f94499j;

        /* renamed from: k, reason: collision with root package name */
        public g f94500k;

        /* renamed from: l, reason: collision with root package name */
        public g f94501l;

        public a() {
            this.f94490a = new o();
            this.f94491b = new o();
            this.f94492c = new o();
            this.f94493d = new o();
            this.f94494e = new yg.a(0.0f);
            this.f94495f = new yg.a(0.0f);
            this.f94496g = new yg.a(0.0f);
            this.f94497h = new yg.a(0.0f);
            this.f94498i = new g();
            this.f94499j = new g();
            this.f94500k = new g();
            this.f94501l = new g();
        }

        public static float a(e eVar) {
            if (eVar instanceof o) {
                return ((o) eVar).f94476a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f94425a;
            }
            return -1.0f;
        }

        public p build() {
            p pVar = new p();
            pVar.f94478a = this.f94490a;
            pVar.f94479b = this.f94491b;
            pVar.f94480c = this.f94492c;
            pVar.f94481d = this.f94493d;
            pVar.f94482e = this.f94494e;
            pVar.f94483f = this.f94495f;
            pVar.f94484g = this.f94496g;
            pVar.f94485h = this.f94497h;
            pVar.f94486i = this.f94498i;
            pVar.f94487j = this.f94499j;
            pVar.f94488k = this.f94500k;
            pVar.f94489l = this.f94501l;
            return pVar;
        }

        public a setAllCornerSizes(d dVar) {
            return setTopLeftCornerSize(dVar).setTopRightCornerSize(dVar).setBottomRightCornerSize(dVar).setBottomLeftCornerSize(dVar);
        }

        public a setAllCorners(int i10, float f10) {
            return setAllCorners(m.a(i10)).setAllCornerSizes(f10);
        }

        public a setAllEdges(g gVar) {
            return setLeftEdge(gVar).setTopEdge(gVar).setRightEdge(gVar).setBottomEdge(gVar);
        }

        public a setBottomEdge(g gVar) {
            this.f94500k = gVar;
            return this;
        }

        public a setBottomLeftCorner(int i10, float f10) {
            return setBottomLeftCorner(m.a(i10)).setBottomLeftCornerSize(f10);
        }

        public a setBottomLeftCornerSize(float f10) {
            this.f94497h = new yg.a(f10);
            return this;
        }

        public a setBottomRightCorner(int i10, float f10) {
            return setBottomRightCorner(m.a(i10)).setBottomRightCornerSize(f10);
        }

        public a setBottomRightCornerSize(float f10) {
            this.f94496g = new yg.a(f10);
            return this;
        }

        public a setLeftEdge(g gVar) {
            this.f94501l = gVar;
            return this;
        }

        public a setRightEdge(g gVar) {
            this.f94499j = gVar;
            return this;
        }

        public a setTopEdge(g gVar) {
            this.f94498i = gVar;
            return this;
        }

        public a setTopLeftCorner(int i10, float f10) {
            return setTopLeftCorner(m.a(i10)).setTopLeftCornerSize(f10);
        }

        public a setTopLeftCornerSize(float f10) {
            this.f94494e = new yg.a(f10);
            return this;
        }

        public a setTopRightCorner(int i10, float f10) {
            return setTopRightCorner(m.a(i10)).setTopRightCornerSize(f10);
        }

        public a setTopRightCornerSize(float f10) {
            this.f94495f = new yg.a(f10);
            return this;
        }

        public a setBottomLeftCornerSize(d dVar) {
            this.f94497h = dVar;
            return this;
        }

        public a setBottomRightCornerSize(d dVar) {
            this.f94496g = dVar;
            return this;
        }

        public a setTopLeftCornerSize(d dVar) {
            this.f94494e = dVar;
            return this;
        }

        public a setTopRightCornerSize(d dVar) {
            this.f94495f = dVar;
            return this;
        }

        public a setAllCorners(e eVar) {
            return setTopLeftCorner(eVar).setTopRightCorner(eVar).setBottomRightCorner(eVar).setBottomLeftCorner(eVar);
        }

        public a setBottomLeftCorner(int i10, d dVar) {
            return setBottomLeftCorner(m.a(i10)).setBottomLeftCornerSize(dVar);
        }

        public a setBottomRightCorner(int i10, d dVar) {
            return setBottomRightCorner(m.a(i10)).setBottomRightCornerSize(dVar);
        }

        public a setTopLeftCorner(int i10, d dVar) {
            return setTopLeftCorner(m.a(i10)).setTopLeftCornerSize(dVar);
        }

        public a setTopRightCorner(int i10, d dVar) {
            return setTopRightCorner(m.a(i10)).setTopRightCornerSize(dVar);
        }

        public a setAllCornerSizes(float f10) {
            return setTopLeftCornerSize(f10).setTopRightCornerSize(f10).setBottomRightCornerSize(f10).setBottomLeftCornerSize(f10);
        }

        public a setBottomLeftCorner(e eVar) {
            this.f94493d = eVar;
            float fA = a(eVar);
            if (fA != -1.0f) {
                setBottomLeftCornerSize(fA);
            }
            return this;
        }

        public a setBottomRightCorner(e eVar) {
            this.f94492c = eVar;
            float fA = a(eVar);
            if (fA != -1.0f) {
                setBottomRightCornerSize(fA);
            }
            return this;
        }

        public a setTopLeftCorner(e eVar) {
            this.f94490a = eVar;
            float fA = a(eVar);
            if (fA != -1.0f) {
                setTopLeftCornerSize(fA);
            }
            return this;
        }

        public a setTopRightCorner(e eVar) {
            this.f94491b = eVar;
            float fA = a(eVar);
            if (fA != -1.0f) {
                setTopRightCornerSize(fA);
            }
            return this;
        }

        public a(p pVar) {
            this.f94490a = new o();
            this.f94491b = new o();
            this.f94492c = new o();
            this.f94493d = new o();
            this.f94494e = new yg.a(0.0f);
            this.f94495f = new yg.a(0.0f);
            this.f94496g = new yg.a(0.0f);
            this.f94497h = new yg.a(0.0f);
            this.f94498i = new g();
            this.f94499j = new g();
            this.f94500k = new g();
            this.f94501l = new g();
            this.f94490a = pVar.f94478a;
            this.f94491b = pVar.f94479b;
            this.f94492c = pVar.f94480c;
            this.f94493d = pVar.f94481d;
            this.f94494e = pVar.f94482e;
            this.f94495f = pVar.f94483f;
            this.f94496g = pVar.f94484g;
            this.f94497h = pVar.f94485h;
            this.f94498i = pVar.f94486i;
            this.f94499j = pVar.f94487j;
            this.f94500k = pVar.f94488k;
            this.f94501l = pVar.f94489l;
        }
    }

    public static a a(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(uf.a.K);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            d cornerSize = getCornerSize(typedArrayObtainStyledAttributes, 5, dVar);
            d cornerSize2 = getCornerSize(typedArrayObtainStyledAttributes, 8, cornerSize);
            d cornerSize3 = getCornerSize(typedArrayObtainStyledAttributes, 9, cornerSize);
            d cornerSize4 = getCornerSize(typedArrayObtainStyledAttributes, 7, cornerSize);
            return new a().setTopLeftCorner(i13, cornerSize2).setTopRightCorner(i14, cornerSize3).setBottomRightCorner(i15, cornerSize4).setBottomLeftCorner(i16, getCornerSize(typedArrayObtainStyledAttributes, 6, cornerSize));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static a builder() {
        return new a();
    }

    public static d getCornerSize(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new yg.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new n(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public g getBottomEdge() {
        return this.f94488k;
    }

    public e getBottomLeftCorner() {
        return this.f94481d;
    }

    public d getBottomLeftCornerSize() {
        return this.f94485h;
    }

    public e getBottomRightCorner() {
        return this.f94480c;
    }

    public d getBottomRightCornerSize() {
        return this.f94484g;
    }

    public g getLeftEdge() {
        return this.f94489l;
    }

    public g getRightEdge() {
        return this.f94487j;
    }

    public g getTopEdge() {
        return this.f94486i;
    }

    public e getTopLeftCorner() {
        return this.f94478a;
    }

    public d getTopLeftCornerSize() {
        return this.f94482e;
    }

    public e getTopRightCorner() {
        return this.f94479b;
    }

    public d getTopRightCornerSize() {
        return this.f94483f;
    }

    public boolean hasRoundedCorners() {
        return (this.f94479b instanceof o) && (this.f94478a instanceof o) && (this.f94480c instanceof o) && (this.f94481d instanceof o);
    }

    public boolean isRoundRect(RectF rectF) {
        boolean z10 = this.f94489l.getClass().equals(g.class) && this.f94487j.getClass().equals(g.class) && this.f94486i.getClass().equals(g.class) && this.f94488k.getClass().equals(g.class);
        float cornerSize = this.f94482e.getCornerSize(rectF);
        return z10 && ((this.f94483f.getCornerSize(rectF) > cornerSize ? 1 : (this.f94483f.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f94485h.getCornerSize(rectF) > cornerSize ? 1 : (this.f94485h.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f94484g.getCornerSize(rectF) > cornerSize ? 1 : (this.f94484g.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && hasRoundedCorners();
    }

    public a toBuilder() {
        return new a(this);
    }

    public String toString() {
        return C3191e4.i.f36529d + getTopLeftCornerSize() + ", " + getTopRightCornerSize() + ", " + getBottomRightCornerSize() + ", " + getBottomLeftCornerSize() + C3191e4.i.f36531e;
    }

    public p withCornerSize(float f10) {
        return toBuilder().setAllCornerSizes(f10).build();
    }

    public p withTransformedCornerSizes(q qVar) {
        h hVar = (h) qVar;
        return toBuilder().setTopLeftCornerSize(hVar.apply(getTopLeftCornerSize())).setTopRightCornerSize(hVar.apply(getTopRightCornerSize())).setBottomLeftCornerSize(hVar.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(hVar.apply(getBottomRightCornerSize())).build();
    }

    public static a builder(Context context, AttributeSet attributeSet, int i10, int i11) {
        return builder(context, attributeSet, i10, i11, 0);
    }

    public p withCornerSize(d dVar) {
        return toBuilder().setAllCornerSizes(dVar).build();
    }

    public static a builder(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return builder(context, attributeSet, i10, i11, new yg.a(i12));
    }

    public static a builder(Context context, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.B, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, dVar);
    }

    public static a builder(Context context, int i10, int i11) {
        return a(context, i10, i11, new yg.a(0));
    }
}
