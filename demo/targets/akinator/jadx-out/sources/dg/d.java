package dg;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.ui.g;
import sg.o;
import yg.e;
import yg.f;
import yg.j;
import yg.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: y, reason: collision with root package name */
    public static final double f52184y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f52185z;

    /* renamed from: a, reason: collision with root package name */
    public final b f52186a;

    /* renamed from: c, reason: collision with root package name */
    public final j f52188c;

    /* renamed from: d, reason: collision with root package name */
    public final j f52189d;

    /* renamed from: e, reason: collision with root package name */
    public int f52190e;

    /* renamed from: f, reason: collision with root package name */
    public int f52191f;

    /* renamed from: g, reason: collision with root package name */
    public int f52192g;

    /* renamed from: h, reason: collision with root package name */
    public int f52193h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f52194i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f52195j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f52196k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f52197l;

    /* renamed from: m, reason: collision with root package name */
    public p f52198m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f52199n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f52200o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f52201p;

    /* renamed from: q, reason: collision with root package name */
    public j f52202q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f52204s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f52205t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f52206u;

    /* renamed from: v, reason: collision with root package name */
    public final int f52207v;

    /* renamed from: w, reason: collision with root package name */
    public final int f52208w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f52187b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f52203r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f52209x = 0.0f;

    static {
        f52185z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public d(b bVar, AttributeSet attributeSet, int i10, int i11) {
        this.f52186a = bVar;
        j jVar = new j(bVar.getContext(), attributeSet, i10, i11);
        this.f52188c = jVar;
        jVar.initializeElevationOverlay(bVar.getContext());
        jVar.setShadowColor(-12303292);
        p.a builder = jVar.getShapeAppearanceModel().toBuilder();
        TypedArray typedArrayObtainStyledAttributes = bVar.getContext().obtainStyledAttributes(attributeSet, x.a.f91308a, i10, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            builder.setAllCornerSizes(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f52189d = new j();
        g(builder.build());
        this.f52206u = o.resolveThemeInterpolator(bVar.getContext(), R.attr.motionEasingLinearInterpolator, vf.a.f89240a);
        this.f52207v = o.resolveThemeDuration(bVar.getContext(), R.attr.motionDurationShort2, 300);
        this.f52208w = o.resolveThemeDuration(bVar.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(e eVar, float f10) {
        if (eVar instanceof yg.o) {
            return (float) ((1.0d - f52184y) * f10);
        }
        if (eVar instanceof f) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        e topLeftCorner = this.f52198m.getTopLeftCorner();
        j jVar = this.f52188c;
        return Math.max(Math.max(b(topLeftCorner, jVar.getTopLeftCornerResolvedSize()), b(this.f52198m.getTopRightCorner(), jVar.getTopRightCornerResolvedSize())), Math.max(b(this.f52198m.getBottomRightCorner(), jVar.getBottomRightCornerResolvedSize()), b(this.f52198m.getBottomLeftCorner(), jVar.getBottomLeftCornerResolvedSize())));
    }

    public void animateCheckedIcon(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f52209x : this.f52209x;
        ValueAnimator valueAnimator = this.f52205t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52205t = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f52209x, f10);
        this.f52205t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new g(this, 1));
        this.f52205t.setInterpolator(this.f52206u);
        this.f52205t.setDuration((long) ((z10 ? this.f52207v : this.f52208w) * f11));
        this.f52205t.start();
    }

    public final LayerDrawable c() {
        if (this.f52200o == null) {
            this.f52202q = new j(this.f52198m);
            this.f52200o = new RippleDrawable(this.f52196k, null, this.f52202q);
        }
        if (this.f52201p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f52200o, this.f52189d, this.f52195j});
            this.f52201p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f52201p;
    }

    public final c d(Drawable drawable) {
        int iCeil;
        int i10;
        if (this.f52186a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (h() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (h() ? a() : 0.0f));
            i10 = iCeil2;
        } else {
            iCeil = 0;
            i10 = 0;
        }
        return new c(drawable, iCeil, i10, iCeil, i10);
    }

    public final void e(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f52201p != null) {
            b bVar = this.f52186a;
            if (bVar.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((bVar.getMaxCardElevation() * 1.5f) + (h() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((bVar.getMaxCardElevation() + (h() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = this.f52192g;
            int i15 = (i14 & 8388613) == 8388613 ? ((i10 - this.f52190e) - this.f52191f) - iCeil2 : this.f52190e;
            int i16 = (i14 & 80) == 80 ? this.f52190e : ((i11 - this.f52190e) - this.f52191f) - iCeil;
            int i17 = (i14 & 8388613) == 8388613 ? this.f52190e : ((i10 - this.f52190e) - this.f52191f) - iCeil2;
            int i18 = (i14 & 80) == 80 ? ((i11 - this.f52190e) - this.f52191f) - iCeil : this.f52190e;
            if (bVar.getLayoutDirection() == 1) {
                i13 = i17;
                i12 = i15;
            } else {
                i12 = i17;
                i13 = i15;
            }
            this.f52201p.setLayerInset(2, i13, i18, i12, i16);
        }
    }

    public final void f(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = p3.a.wrap(drawable).mutate();
            this.f52195j = drawableMutate;
            drawableMutate.setTintList(this.f52197l);
            setChecked(this.f52186a.isChecked());
        } else {
            this.f52195j = f52185z;
        }
        LayerDrawable layerDrawable = this.f52201p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f52195j);
        }
    }

    public final void g(p pVar) {
        this.f52198m = pVar;
        j jVar = this.f52188c;
        jVar.setShapeAppearanceModel(pVar);
        jVar.setShadowBitmapDrawingEnable(!jVar.isRoundRect());
        j jVar2 = this.f52189d;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(pVar);
        }
        j jVar3 = this.f52202q;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(pVar);
        }
    }

    public final boolean h() {
        b bVar = this.f52186a;
        return bVar.getPreventCornerOverlap() && this.f52188c.isRoundRect() && bVar.getUseCompatPadding();
    }

    public final boolean i() {
        View view = this.f52186a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void j() {
        Drawable drawable = this.f52194i;
        Drawable drawableC = i() ? c() : this.f52189d;
        this.f52194i = drawableC;
        if (drawable != drawableC) {
            b bVar = this.f52186a;
            if (bVar.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) bVar.getForeground()).setDrawable(drawableC);
            } else {
                bVar.setForeground(d(drawableC));
            }
        }
    }

    public final void k() {
        b bVar = this.f52186a;
        float cardViewRadius = 0.0f;
        float fA = ((!bVar.getPreventCornerOverlap() || this.f52188c.isRoundRect()) && !h()) ? 0.0f : a();
        if (bVar.getPreventCornerOverlap() && bVar.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f52184y) * bVar.getCardViewRadius());
        }
        int i10 = (int) (fA - cardViewRadius);
        Rect rect = this.f52187b;
        bVar.e(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
    }

    public final void l() {
        boolean z10 = this.f52203r;
        b bVar = this.f52186a;
        if (!z10) {
            bVar.setBackgroundInternal(d(this.f52188c));
        }
        bVar.setForeground(d(this.f52194i));
    }

    public void setChecked(boolean z10) {
        setChecked(z10, false);
    }

    public void setChecked(boolean z10, boolean z11) {
        Drawable drawable = this.f52195j;
        if (drawable != null) {
            if (z11) {
                animateCheckedIcon(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f52209x = z10 ? 1.0f : 0.0f;
            }
        }
    }
}
