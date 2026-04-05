package xf;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.badge.BadgeState$State;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;
import qg.g0;
import qg.h0;
import qg.j0;
import yg.j;
import yg.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a extends Drawable implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f91943b;

    /* renamed from: c, reason: collision with root package name */
    public final j f91944c;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f91945e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f91946f;

    /* renamed from: g, reason: collision with root package name */
    public final c f91947g;

    /* renamed from: h, reason: collision with root package name */
    public float f91948h;

    /* renamed from: i, reason: collision with root package name */
    public float f91949i;

    /* renamed from: j, reason: collision with root package name */
    public int f91950j;

    /* renamed from: k, reason: collision with root package name */
    public float f91951k;

    /* renamed from: l, reason: collision with root package name */
    public float f91952l;

    /* renamed from: m, reason: collision with root package name */
    public float f91953m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f91954n;

    /* renamed from: o, reason: collision with root package name */
    public WeakReference f91955o;

    public a(Context context, int i10, BadgeState$State badgeState$State) {
        this.f91943b = new WeakReference(context);
        j0.checkMaterialTheme(context);
        this.f91946f = new Rect();
        h0 h0Var = new h0(this);
        this.f91945e = h0Var;
        h0Var.getTextPaint().setTextAlign(Paint.Align.CENTER);
        c cVar = new c(context, i10, badgeState$State);
        this.f91947g = cVar;
        boolean zD = d();
        BadgeState$State badgeState$State2 = cVar.f91957b;
        j jVar = new j(p.builder(context, zD ? badgeState$State2.f28895i.intValue() : badgeState$State2.f28893g.intValue(), d() ? badgeState$State2.f28896j.intValue() : badgeState$State2.f28894h.intValue()).build());
        this.f91944c = jVar;
        g();
        h();
        j();
        e();
        h0Var.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState$State2.f28890c.intValue());
        if (jVar.getFillColor() != colorStateListValueOf) {
            jVar.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
        i();
        f();
        k();
        setVisible(badgeState$State2.f28908v.booleanValue(), false);
    }

    public static a create(Context context) {
        return new a(context, 0, null);
    }

    public static a createFromResource(Context context, int i10) {
        return new a(context, i10, null);
    }

    public final void a(View view) {
        ViewParent customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            customBadgeParent = view.getParent();
        }
        if ((customBadgeParent instanceof View) && (customBadgeParent.getParent() instanceof View)) {
            b(view, (View) customBadgeParent.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float y10;
        float x10;
        View parent;
        boolean z10;
        FrameLayout customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent == null) {
            float y11 = view.getY();
            x10 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
            parent = customBadgeParent;
        }
        while (true) {
            z10 = parent instanceof View;
            if (!z10 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = parent;
            y10 += view3.getY();
            x10 += view3.getX();
            parent = parent.getParent();
        }
        if (z10) {
            float f10 = (this.f91949i - this.f91953m) + y10;
            float f11 = (this.f91948h - this.f91952l) + x10;
            View view4 = parent;
            float height = ((this.f91949i + this.f91953m) - view4.getHeight()) + y10;
            float width = ((this.f91948h + this.f91952l) - view4.getWidth()) + x10;
            if (f10 < 0.0f) {
                this.f91949i = Math.abs(f10) + this.f91949i;
            }
            if (f11 < 0.0f) {
                this.f91948h = Math.abs(f11) + this.f91948h;
            }
            if (height > 0.0f) {
                this.f91949i -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f91948h -= Math.abs(width);
            }
        }
    }

    public final String c() {
        boolean zHasText = hasText();
        WeakReference weakReference = this.f91943b;
        if (!zHasText) {
            if (!hasNumber()) {
                return null;
            }
            int i10 = this.f91950j;
            c cVar = this.f91947g;
            if (i10 == -2 || getNumber() <= this.f91950j) {
                return NumberFormat.getInstance(cVar.f91957b.f28902p).format(getNumber());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(cVar.f91957b.f28902p, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f91950j), "+");
        }
        String text = getText();
        int maxCharacterCount = getMaxCharacterCount();
        if (maxCharacterCount == -2 || text == null || text.length() <= maxCharacterCount) {
            return text;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), text.substring(0, maxCharacterCount - 1), "…");
    }

    public void clearNumber() {
        c cVar = this.f91947g;
        BadgeState$State badgeState$State = cVar.f91957b;
        if (badgeState$State.f28899m != -1) {
            cVar.f91956a.f28899m = -1;
            badgeState$State.f28899m = -1;
            if (hasText()) {
                return;
            }
            e();
        }
    }

    public void clearText() {
        c cVar = this.f91947g;
        BadgeState$State badgeState$State = cVar.f91957b;
        if (badgeState$State.f28898l != null) {
            cVar.f91956a.f28898l = null;
            badgeState$State.f28898l = null;
            e();
        }
    }

    public final boolean d() {
        return hasText() || hasNumber();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f91944c.draw(canvas);
        if (!d() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        h0 h0Var = this.f91945e;
        h0Var.getTextPaint().getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.f91949i - rect.exactCenterY();
        canvas.drawText(strC, this.f91948h, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), h0Var.getTextPaint());
    }

    public final void e() {
        this.f91945e.setTextSizeDirty(true);
        g();
        k();
        invalidateSelf();
    }

    public final void f() {
        WeakReference weakReference = this.f91954n;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f91954n.get();
        WeakReference weakReference2 = this.f91955o;
        updateBadgeCoordinates(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
    }

    public final void g() {
        Context context = (Context) this.f91943b.get();
        if (context == null) {
            return;
        }
        boolean zD = d();
        c cVar = this.f91947g;
        this.f91944c.setShapeAppearanceModel(p.builder(context, zD ? cVar.f91957b.f28895i.intValue() : cVar.f91957b.f28893g.intValue(), d() ? cVar.f91957b.f28896j.intValue() : cVar.f91957b.f28894h.intValue()).build());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f91947g.f91957b.f28897k;
    }

    public int getBackgroundColor() {
        return this.f91944c.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.f91947g.f91957b.f28907u.intValue();
    }

    public Locale getBadgeNumberLocale() {
        return this.f91947g.f91957b.f28902p;
    }

    public int getBadgeTextColor() {
        return this.f91945e.getTextPaint().getColor();
    }

    public CharSequence getContentDescription() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean zHasText = hasText();
        c cVar = this.f91947g;
        if (zHasText) {
            CharSequence charSequence = cVar.f91957b.f28903q;
            return charSequence != null ? charSequence : getText();
        }
        if (!hasNumber()) {
            return cVar.f91957b.f28904r;
        }
        BadgeState$State badgeState$State = cVar.f91957b;
        BadgeState$State badgeState$State2 = cVar.f91957b;
        if (badgeState$State.f28905s == 0 || (context = (Context) this.f91943b.get()) == null) {
            return null;
        }
        if (this.f91950j != -2) {
            int number = getNumber();
            int i10 = this.f91950j;
            if (number > i10) {
                return context.getString(badgeState$State2.f28906t, Integer.valueOf(i10));
            }
        }
        return context.getResources().getQuantityString(badgeState$State2.f28905s, getNumber(), Integer.valueOf(getNumber()));
    }

    public FrameLayout getCustomBadgeParent() {
        WeakReference weakReference = this.f91955o;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.f91947g.f91957b.f28911y.intValue();
    }

    public int getHorizontalOffsetWithText() {
        return this.f91947g.f91957b.A.intValue();
    }

    public int getHorizontalOffsetWithoutText() {
        return this.f91947g.f91957b.f28911y.intValue();
    }

    public int getHorizontalPadding() {
        return this.f91947g.f91957b.f28909w.intValue();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f91946f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f91946f.width();
    }

    public int getLargeFontVerticalOffsetAdjustment() {
        return this.f91947g.f91957b.E.intValue();
    }

    public int getMaxCharacterCount() {
        return this.f91947g.f91957b.f28900n;
    }

    public int getMaxNumber() {
        return this.f91947g.f91957b.f28901o;
    }

    public int getNumber() {
        int i10 = this.f91947g.f91957b.f28899m;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public String getText() {
        return this.f91947g.f91957b.f28898l;
    }

    public int getVerticalOffset() {
        return this.f91947g.f91957b.f28912z.intValue();
    }

    public int getVerticalOffsetWithText() {
        return this.f91947g.f91957b.B.intValue();
    }

    public int getVerticalOffsetWithoutText() {
        return this.f91947g.f91957b.f28912z.intValue();
    }

    public int getVerticalPadding() {
        return this.f91947g.f91957b.f28910x.intValue();
    }

    public final void h() {
        Context context = (Context) this.f91943b.get();
        if (context == null) {
            return;
        }
        ug.g gVar = new ug.g(context, this.f91947g.f91957b.f28892f.intValue());
        h0 h0Var = this.f91945e;
        if (h0Var.getTextAppearance() == gVar) {
            return;
        }
        h0Var.setTextAppearance(gVar, context);
        i();
        k();
        invalidateSelf();
    }

    public boolean hasNumber() {
        BadgeState$State badgeState$State = this.f91947g.f91957b;
        return badgeState$State.f28898l == null && badgeState$State.f28899m != -1;
    }

    public boolean hasText() {
        return this.f91947g.f91957b.f28898l != null;
    }

    public final void i() {
        this.f91945e.getTextPaint().setColor(this.f91947g.f91957b.f28891e.intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public final void j() {
        if (getMaxCharacterCount() != -2) {
            this.f91950j = ((int) Math.pow(10.0d, getMaxCharacterCount() - 1.0d)) - 1;
        } else {
            this.f91950j = getMaxNumber();
        }
        this.f91945e.setTextSizeDirty(true);
        k();
        invalidateSelf();
    }

    public final void k() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        WeakReference weakReference = this.f91943b;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f91954n;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f91946f;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f91955o;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zD = d();
        c cVar = this.f91947g;
        float f16 = zD ? cVar.f91959d : cVar.f91958c;
        this.f91951k = f16;
        if (f16 != -1.0f) {
            this.f91952l = f16;
            this.f91953m = f16;
        } else {
            this.f91952l = Math.round((d() ? cVar.f91962g : cVar.f91960e) / 2.0f);
            this.f91953m = Math.round((d() ? cVar.f91963h : cVar.f91961f) / 2.0f);
        }
        if (d()) {
            String strC = c();
            float f17 = this.f91952l;
            h0 h0Var = this.f91945e;
            this.f91952l = Math.max(f17, (h0Var.getTextWidth(strC) / 2.0f) + cVar.f91957b.f28909w.intValue());
            float fMax = Math.max(this.f91953m, (h0Var.getTextHeight(strC) / 2.0f) + cVar.f91957b.f28910x.intValue());
            this.f91953m = fMax;
            this.f91952l = Math.max(this.f91952l, fMax);
        }
        BadgeState$State badgeState$State = cVar.f91957b;
        BadgeState$State badgeState$State2 = cVar.f91957b;
        int iIntValue = badgeState$State.f28912z.intValue();
        int i10 = cVar.f91966k;
        if (d()) {
            iIntValue = badgeState$State2.B.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = vf.a.lerp(iIntValue, iIntValue - badgeState$State2.E.intValue(), vf.a.lerp(0.0f, 1.0f, 0.3f, 1.0f, ug.d.getFontScale(context2) - 1.0f));
            }
        }
        if (i10 == 0) {
            iIntValue -= Math.round(this.f91953m);
        }
        int iIntValue2 = badgeState$State2.D.intValue() + iIntValue;
        int iIntValue3 = badgeState$State2.f28907u.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f91949i = rect3.bottom - iIntValue2;
        } else {
            this.f91949i = rect3.top + iIntValue2;
        }
        int iIntValue4 = d() ? badgeState$State2.A.intValue() : badgeState$State2.f28911y.intValue();
        if (i10 == 1) {
            iIntValue4 += d() ? cVar.f91965j : cVar.f91964i;
        }
        int iIntValue5 = badgeState$State2.C.intValue() + iIntValue4;
        int iIntValue6 = badgeState$State2.f28907u.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            if (cVar.f91967l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f10 = rect3.left + this.f91952l;
                    f11 = (this.f91953m * 2.0f) - iIntValue5;
                    f12 = f10 - f11;
                    this.f91948h = f12;
                } else {
                    f12 = (rect3.right - this.f91952l) + ((this.f91953m * 2.0f) - iIntValue5);
                    this.f91948h = f12;
                }
            } else if (view.getLayoutDirection() == 0) {
                f12 = (rect3.left - this.f91952l) + iIntValue5;
                this.f91948h = f12;
            } else {
                f10 = rect3.right + this.f91952l;
                f11 = iIntValue5;
                f12 = f10 - f11;
                this.f91948h = f12;
            }
        } else if (cVar.f91967l == 0) {
            if (view.getLayoutDirection() == 0) {
                f13 = rect3.right + this.f91952l;
                f14 = iIntValue5;
                f15 = f13 - f14;
                this.f91948h = f15;
            } else {
                f15 = (rect3.left - this.f91952l) + iIntValue5;
                this.f91948h = f15;
            }
        } else if (view.getLayoutDirection() == 0) {
            f15 = (rect3.right - this.f91952l) + ((this.f91953m * 2.0f) - iIntValue5);
            this.f91948h = f15;
        } else {
            f13 = rect3.left + this.f91952l;
            f14 = (this.f91953m * 2.0f) - iIntValue5;
            f15 = f13 - f14;
            this.f91948h = f15;
        }
        if (badgeState$State2.F.booleanValue()) {
            a(view);
        } else {
            b(view, null);
        }
        h.updateBadgeBounds(rect2, this.f91948h, this.f91949i, this.f91952l, this.f91953m);
        float f18 = this.f91951k;
        j jVar = this.f91944c;
        if (f18 != -1.0f) {
            jVar.setCornerSize(f18);
        }
        if (rect.equals(rect2)) {
            return;
        }
        jVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, qg.g0
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // qg.g0
    public void onTextSizeChange() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28897k = i10;
        cVar.f91957b.f28897k = i10;
        this.f91945e.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    @Deprecated
    public void setAutoAdjustToWithinGrandparentBounds(boolean z10) {
        c cVar = this.f91947g;
        if (cVar.f91957b.F.booleanValue() == z10) {
            return;
        }
        cVar.f91956a.F = Boolean.valueOf(z10);
        cVar.f91957b.F = Boolean.valueOf(z10);
        WeakReference weakReference = this.f91954n;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        a((View) this.f91954n.get());
    }

    public void setBackgroundColor(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28890c = Integer.valueOf(i10);
        cVar.f91957b.f28890c = Integer.valueOf(i10);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(cVar.f91957b.f28890c.intValue());
        j jVar = this.f91944c;
        if (jVar.getFillColor() != colorStateListValueOf) {
            jVar.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public void setBadgeFixedEdge(int i10) {
        c cVar = this.f91947g;
        if (cVar.f91967l != i10) {
            cVar.f91967l = i10;
            k();
        }
    }

    public void setBadgeGravity(int i10) {
        if (i10 == 8388691 || i10 == 8388693) {
            Log.w("Badge", "Bottom badge gravities are deprecated; please use a top gravity instead.");
        }
        c cVar = this.f91947g;
        if (cVar.f91957b.f28907u.intValue() != i10) {
            cVar.f91956a.f28907u = Integer.valueOf(i10);
            cVar.f91957b.f28907u = Integer.valueOf(i10);
            f();
        }
    }

    public void setBadgeNumberLocale(Locale locale) {
        c cVar = this.f91947g;
        if (locale.equals(cVar.f91957b.f28902p)) {
            return;
        }
        cVar.f91956a.f28902p = locale;
        cVar.f91957b.f28902p = locale;
        invalidateSelf();
    }

    public void setBadgeTextColor(int i10) {
        if (this.f91945e.getTextPaint().getColor() != i10) {
            c cVar = this.f91947g;
            cVar.f91956a.f28891e = Integer.valueOf(i10);
            cVar.f91957b.f28891e = Integer.valueOf(i10);
            i();
        }
    }

    public void setBadgeWithTextShapeAppearance(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28895i = Integer.valueOf(i10);
        cVar.f91957b.f28895i = Integer.valueOf(i10);
        g();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28896j = Integer.valueOf(i10);
        cVar.f91957b.f28896j = Integer.valueOf(i10);
        g();
    }

    public void setBadgeWithoutTextShapeAppearance(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28893g = Integer.valueOf(i10);
        cVar.f91957b.f28893g = Integer.valueOf(i10);
        g();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28894h = Integer.valueOf(i10);
        cVar.f91957b.f28894h = Integer.valueOf(i10);
        g();
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28906t = i10;
        cVar.f91957b.f28906t = i10;
    }

    public void setContentDescriptionForText(CharSequence charSequence) {
        c cVar = this.f91947g;
        cVar.f91956a.f28903q = charSequence;
        cVar.f91957b.f28903q = charSequence;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        c cVar = this.f91947g;
        cVar.f91956a.f28904r = charSequence;
        cVar.f91957b.f28904r = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28905s = i10;
        cVar.f91957b.f28905s = i10;
    }

    public void setHorizontalOffset(int i10) {
        setHorizontalOffsetWithoutText(i10);
        setHorizontalOffsetWithText(i10);
    }

    public void setHorizontalOffsetWithText(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.A = Integer.valueOf(i10);
        cVar.f91957b.A = Integer.valueOf(i10);
        k();
    }

    public void setHorizontalOffsetWithoutText(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28911y = Integer.valueOf(i10);
        cVar.f91957b.f28911y = Integer.valueOf(i10);
        k();
    }

    public void setHorizontalPadding(int i10) {
        c cVar = this.f91947g;
        if (i10 != cVar.f91957b.f28909w.intValue()) {
            cVar.f91956a.f28909w = Integer.valueOf(i10);
            cVar.f91957b.f28909w = Integer.valueOf(i10);
            k();
        }
    }

    public void setLargeFontVerticalOffsetAdjustment(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.E = Integer.valueOf(i10);
        cVar.f91957b.E = Integer.valueOf(i10);
        k();
    }

    public void setMaxCharacterCount(int i10) {
        c cVar = this.f91947g;
        BadgeState$State badgeState$State = cVar.f91957b;
        if (badgeState$State.f28900n != i10) {
            cVar.f91956a.f28900n = i10;
            badgeState$State.f28900n = i10;
            j();
        }
    }

    public void setMaxNumber(int i10) {
        c cVar = this.f91947g;
        BadgeState$State badgeState$State = cVar.f91957b;
        if (badgeState$State.f28901o != i10) {
            cVar.f91956a.f28901o = i10;
            badgeState$State.f28901o = i10;
            j();
        }
    }

    public void setNumber(int i10) {
        int iMax = Math.max(0, i10);
        c cVar = this.f91947g;
        BadgeState$State badgeState$State = cVar.f91957b;
        if (badgeState$State.f28899m != iMax) {
            cVar.f91956a.f28899m = iMax;
            badgeState$State.f28899m = iMax;
            if (hasText()) {
                return;
            }
            e();
        }
    }

    public void setText(String str) {
        c cVar = this.f91947g;
        if (TextUtils.equals(cVar.f91957b.f28898l, str)) {
            return;
        }
        cVar.f91956a.f28898l = str;
        cVar.f91957b.f28898l = str;
        e();
    }

    public void setTextAppearance(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28892f = Integer.valueOf(i10);
        cVar.f91957b.f28892f = Integer.valueOf(i10);
        h();
    }

    public void setVerticalOffset(int i10) {
        setVerticalOffsetWithoutText(i10);
        setVerticalOffsetWithText(i10);
    }

    public void setVerticalOffsetWithText(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.B = Integer.valueOf(i10);
        cVar.f91957b.B = Integer.valueOf(i10);
        k();
    }

    public void setVerticalOffsetWithoutText(int i10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28912z = Integer.valueOf(i10);
        cVar.f91957b.f28912z = Integer.valueOf(i10);
        k();
    }

    public void setVerticalPadding(int i10) {
        c cVar = this.f91947g;
        if (i10 != cVar.f91957b.f28910x.intValue()) {
            cVar.f91956a.f28910x = Integer.valueOf(i10);
            cVar.f91957b.f28910x = Integer.valueOf(i10);
            k();
        }
    }

    public void setVisible(boolean z10) {
        c cVar = this.f91947g;
        cVar.f91956a.f28908v = Boolean.valueOf(z10);
        cVar.f91957b.f28908v = Boolean.valueOf(z10);
        setVisible(cVar.f91957b.f28908v.booleanValue(), false);
    }

    @Deprecated
    public void updateBadgeCoordinates(View view, ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        updateBadgeCoordinates(view, (FrameLayout) viewGroup);
    }

    public void updateBadgeCoordinates(View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    public void updateBadgeCoordinates(View view, FrameLayout frameLayout) {
        this.f91954n = new WeakReference(view);
        this.f91955o = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
