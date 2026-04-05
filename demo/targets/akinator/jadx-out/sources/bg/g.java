package bg;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.button.MaterialButton;
import r4.f0;
import yg.b0;
import yg.j;
import yg.k;
import yg.p;
import yg.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f9509a;

    /* renamed from: b, reason: collision with root package name */
    public p f9510b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f9511c;

    /* renamed from: d, reason: collision with root package name */
    public f0 f9512d;

    /* renamed from: e, reason: collision with root package name */
    public k f9513e;

    /* renamed from: f, reason: collision with root package name */
    public int f9514f;

    /* renamed from: g, reason: collision with root package name */
    public int f9515g;

    /* renamed from: h, reason: collision with root package name */
    public int f9516h;

    /* renamed from: i, reason: collision with root package name */
    public int f9517i;

    /* renamed from: j, reason: collision with root package name */
    public int f9518j;

    /* renamed from: k, reason: collision with root package name */
    public int f9519k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f9520l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f9521m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f9522n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f9523o;

    /* renamed from: p, reason: collision with root package name */
    public j f9524p;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9528t;

    /* renamed from: v, reason: collision with root package name */
    public RippleDrawable f9530v;

    /* renamed from: w, reason: collision with root package name */
    public int f9531w;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9525q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9526r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9527s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9529u = true;

    public g(MaterialButton materialButton, p pVar) {
        this.f9509a = materialButton;
        this.f9510b = pVar;
    }

    public final j a(boolean z10) {
        RippleDrawable rippleDrawable = this.f9530v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.f9530v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public final void b(int i10, int i11) {
        MaterialButton materialButton = this.f9509a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f9516h;
        int i13 = this.f9517i;
        this.f9517i = i11;
        this.f9516h = i10;
        if (!this.f9526r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void c() {
        j jVar = new j(this.f9510b);
        b0 b0Var = this.f9511c;
        if (b0Var != null) {
            jVar.setStateListShapeAppearanceModel(b0Var);
        }
        f0 f0Var = this.f9512d;
        if (f0Var != null) {
            jVar.setCornerSpringForce(f0Var);
        }
        k kVar = this.f9513e;
        if (kVar != null) {
            jVar.setOnCornerSizeChangeListener(kVar);
        }
        MaterialButton materialButton = this.f9509a;
        jVar.initializeElevationOverlay(materialButton.getContext());
        jVar.setTintList(this.f9521m);
        PorterDuff.Mode mode = this.f9520l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        jVar.setStroke(this.f9519k, this.f9522n);
        j jVar2 = new j(this.f9510b);
        b0 b0Var2 = this.f9511c;
        if (b0Var2 != null) {
            jVar2.setStateListShapeAppearanceModel(b0Var2);
        }
        f0 f0Var2 = this.f9512d;
        if (f0Var2 != null) {
            jVar2.setCornerSpringForce(f0Var2);
        }
        jVar2.setTint(0);
        jVar2.setStroke(this.f9519k, this.f9525q ? jg.b.getColor(materialButton, R.attr.colorSurface) : 0);
        j jVar3 = new j(this.f9510b);
        this.f9524p = jVar3;
        b0 b0Var3 = this.f9511c;
        if (b0Var3 != null) {
            jVar3.setStateListShapeAppearanceModel(b0Var3);
        }
        f0 f0Var3 = this.f9512d;
        if (f0Var3 != null) {
            this.f9524p.setCornerSpringForce(f0Var3);
        }
        this.f9524p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(vg.b.sanitizeRippleDrawableColor(this.f9523o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f9514f, this.f9516h, this.f9515g, this.f9517i), this.f9524p);
        this.f9530v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        j jVarA = a(false);
        if (jVarA != null) {
            jVarA.setElevation(this.f9531w);
            jVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        j jVarA = a(false);
        if (jVarA != null) {
            b0 b0Var = this.f9511c;
            if (b0Var != null) {
                jVarA.setStateListShapeAppearanceModel(b0Var);
            } else {
                jVarA.setShapeAppearanceModel(this.f9510b);
            }
            f0 f0Var = this.f9512d;
            if (f0Var != null) {
                jVarA.setCornerSpringForce(f0Var);
            }
        }
        j jVarA2 = a(true);
        if (jVarA2 != null) {
            b0 b0Var2 = this.f9511c;
            if (b0Var2 != null) {
                jVarA2.setStateListShapeAppearanceModel(b0Var2);
            } else {
                jVarA2.setShapeAppearanceModel(this.f9510b);
            }
            f0 f0Var2 = this.f9512d;
            if (f0Var2 != null) {
                jVarA2.setCornerSpringForce(f0Var2);
            }
        }
        y maskDrawable = getMaskDrawable();
        if (maskDrawable != null) {
            maskDrawable.setShapeAppearanceModel(this.f9510b);
            if (maskDrawable instanceof j) {
                j jVar = (j) maskDrawable;
                b0 b0Var3 = this.f9511c;
                if (b0Var3 != null) {
                    jVar.setStateListShapeAppearanceModel(b0Var3);
                }
                f0 f0Var3 = this.f9512d;
                if (f0Var3 != null) {
                    jVar.setCornerSpringForce(f0Var3);
                }
            }
        }
    }

    public final void e() {
        j jVarA = a(false);
        j jVarA2 = a(true);
        if (jVarA != null) {
            jVarA.setStroke(this.f9519k, this.f9522n);
            if (jVarA2 != null) {
                jVarA2.setStroke(this.f9519k, this.f9525q ? jg.b.getColor(this.f9509a, R.attr.colorSurface) : 0);
            }
        }
    }

    public int getInsetBottom() {
        return this.f9517i;
    }

    public int getInsetTop() {
        return this.f9516h;
    }

    public y getMaskDrawable() {
        RippleDrawable rippleDrawable = this.f9530v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f9530v.getNumberOfLayers() > 2 ? (y) this.f9530v.getDrawable(2) : (y) this.f9530v.getDrawable(1);
    }

    public void setInsetBottom(int i10) {
        b(this.f9516h, i10);
    }

    public void setInsetTop(int i10) {
        b(i10, this.f9517i);
    }
}
