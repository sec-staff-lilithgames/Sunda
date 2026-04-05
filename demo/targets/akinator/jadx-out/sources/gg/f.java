package gg;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import qg.g0;
import qg.h0;
import qg.j0;
import qg.t0;
import yg.j;
import yg.p;
import yg.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends yg.j implements Drawable.Callback, g0 {
    public static final int[] S0 = {R.attr.state_enabled};
    public static final ShapeDrawable T0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public boolean D0;
    public int E0;
    public int F0;
    public ColorFilter G0;
    public PorterDuffColorFilter H0;
    public ColorStateList I0;
    public ColorStateList J;
    public PorterDuff.Mode J0;
    public ColorStateList K;
    public int[] K0;
    public float L;
    public boolean L0;
    public float M;
    public ColorStateList M0;
    public ColorStateList N;
    public WeakReference N0;
    public float O;
    public TextUtils.TruncateAt O0;
    public ColorStateList P;
    public boolean P0;
    public CharSequence Q;
    public int Q0;
    public boolean R;
    public boolean R0;
    public Drawable S;
    public ColorStateList T;
    public float U;
    public boolean V;
    public boolean W;
    public Drawable X;
    public RippleDrawable Y;
    public ColorStateList Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f57655a0;

    /* renamed from: b0, reason: collision with root package name */
    public CharSequence f57656b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f57657c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f57658d0;

    /* renamed from: e0, reason: collision with root package name */
    public Drawable f57659e0;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f57660f0;

    /* renamed from: g0, reason: collision with root package name */
    public vf.h f57661g0;

    /* renamed from: h0, reason: collision with root package name */
    public vf.h f57662h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f57663i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f57664j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f57665k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f57666l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f57667m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f57668n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f57669o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f57670p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Context f57671q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Paint f57672r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Paint.FontMetrics f57673s0;

    /* renamed from: t0, reason: collision with root package name */
    public final RectF f57674t0;

    /* renamed from: u0, reason: collision with root package name */
    public final PointF f57675u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Path f57676v0;

    /* renamed from: w0, reason: collision with root package name */
    public final h0 f57677w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f57678x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f57679y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f57680z0;

    public f(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.M = -1.0f;
        this.f57672r0 = new Paint(1);
        this.f57673s0 = new Paint.FontMetrics();
        this.f57674t0 = new RectF();
        this.f57675u0 = new PointF();
        this.f57676v0 = new Path();
        this.F0 = 255;
        this.J0 = PorterDuff.Mode.SRC_IN;
        this.N0 = new WeakReference(null);
        initializeElevationOverlay(context);
        this.f57671q0 = context;
        h0 h0Var = new h0(this);
        this.f57677w0 = h0Var;
        this.Q = "";
        h0Var.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        int[] iArr = S0;
        setState(iArr);
        setCloseIconState(iArr);
        this.P0 = true;
        T0.setTint(-1);
    }

    public static f createFromAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        f fVar = new f(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(fVar.f57671q0, attributeSet, uf.a.f88459g, i10, i11, new int[0]);
        fVar.R0 = typedArrayObtainStyledAttributes.hasValue(37);
        Context context2 = fVar.f57671q0;
        ColorStateList colorStateList = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 24);
        if (fVar.J != colorStateList) {
            fVar.J = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        fVar.setChipBackgroundColor(ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 11));
        fVar.setChipMinHeight(typedArrayObtainStyledAttributes.getDimension(19, 0.0f));
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            fVar.setChipCornerRadius(typedArrayObtainStyledAttributes.getDimension(12, 0.0f));
        }
        fVar.setChipStrokeColor(ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 22));
        fVar.setChipStrokeWidth(typedArrayObtainStyledAttributes.getDimension(23, 0.0f));
        fVar.setRippleColor(ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 36));
        fVar.setText(typedArrayObtainStyledAttributes.getText(5));
        ug.g textAppearance = ug.d.getTextAppearance(context2, typedArrayObtainStyledAttributes, 0);
        textAppearance.setTextSize(typedArrayObtainStyledAttributes.getDimension(1, textAppearance.getTextSize()));
        fVar.setTextAppearance(textAppearance);
        int i12 = typedArrayObtainStyledAttributes.getInt(3, 0);
        if (i12 == 1) {
            fVar.setEllipsize(TextUtils.TruncateAt.START);
        } else if (i12 == 2) {
            fVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i12 == 3) {
            fVar.setEllipsize(TextUtils.TruncateAt.END);
        }
        fVar.setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(15, false));
        }
        fVar.setChipIcon(ug.d.getDrawable(context2, typedArrayObtainStyledAttributes, 14));
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            fVar.setChipIconTint(ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 17));
        }
        fVar.setChipIconSize(typedArrayObtainStyledAttributes.getDimension(16, -1.0f));
        fVar.setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(26, false));
        }
        fVar.setCloseIcon(ug.d.getDrawable(context2, typedArrayObtainStyledAttributes, 25));
        fVar.setCloseIconTint(ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 30));
        fVar.setCloseIconSize(typedArrayObtainStyledAttributes.getDimension(28, 0.0f));
        fVar.setCheckable(typedArrayObtainStyledAttributes.getBoolean(6, false));
        fVar.setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(8, false));
        }
        fVar.setCheckedIcon(ug.d.getDrawable(context2, typedArrayObtainStyledAttributes, 7));
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            fVar.setCheckedIconTint(ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 9));
        }
        fVar.setShowMotionSpec(vf.h.createFromAttribute(context2, typedArrayObtainStyledAttributes, 39));
        fVar.setHideMotionSpec(vf.h.createFromAttribute(context2, typedArrayObtainStyledAttributes, 33));
        fVar.setChipStartPadding(typedArrayObtainStyledAttributes.getDimension(21, 0.0f));
        fVar.setIconStartPadding(typedArrayObtainStyledAttributes.getDimension(35, 0.0f));
        fVar.setIconEndPadding(typedArrayObtainStyledAttributes.getDimension(34, 0.0f));
        fVar.setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(41, 0.0f));
        fVar.setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(40, 0.0f));
        fVar.setCloseIconStartPadding(typedArrayObtainStyledAttributes.getDimension(29, 0.0f));
        fVar.setCloseIconEndPadding(typedArrayObtainStyledAttributes.getDimension(27, 0.0f));
        fVar.setChipEndPadding(typedArrayObtainStyledAttributes.getDimension(13, 0.0f));
        fVar.setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
        return fVar;
    }

    public static f createFromResource(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet drawableXml = mg.c.parseDrawableXml(context, i10, "chip");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, drawableXml, com.digidust.elokence.akinator.freemium.R.attr.chipStandaloneStyle, styleAttribute);
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void z(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // yg.j, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f10;
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i11 = this.F0;
        if (i11 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = cg.a.saveLayerAlpha(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i11);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z10 = this.R0;
        Paint paint = this.f57672r0;
        RectF rectF = this.f57674t0;
        if (!z10) {
            paint.setColor(this.f57678x0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, getChipCornerRadius(), getChipCornerRadius(), paint);
        }
        if (!this.R0) {
            paint.setColor(this.f57679y0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.G0;
            if (colorFilter == null) {
                colorFilter = this.H0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, getChipCornerRadius(), getChipCornerRadius(), paint);
        }
        if (this.R0) {
            super.draw(canvas);
        }
        if (this.O > 0.0f && !this.R0) {
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.R0) {
                ColorFilter colorFilter2 = this.G0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.H0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f11 = bounds.left;
            float f12 = this.O / 2.0f;
            rectF.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
            float f13 = this.M - (this.O / 2.0f);
            canvas2.drawRoundRect(rectF, f13, f13, paint);
        }
        paint.setColor(this.B0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.R0) {
            RectF rectF2 = new RectF(bounds);
            j.a aVar = this.f94429c;
            p pVar = aVar.f94452a;
            float[] fArr = this.E;
            float f14 = aVar.f94462k;
            yg.i iVar = this.f94445t;
            t tVar = this.f94446u;
            f10 = 2.0f;
            Path path = this.f57676v0;
            tVar.calculatePath(pVar, fArr, f14, rectF2, iVar, path);
            f(canvas2, paint, path, this.f94429c.f94452a, this.E, h());
        } else {
            canvas2.drawRoundRect(rectF, getChipCornerRadius(), getChipCornerRadius(), paint);
            f10 = 2.0f;
        }
        if (x()) {
            p(bounds, rectF);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.S.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (w()) {
            p(bounds, rectF);
            float f17 = rectF.left;
            float f18 = rectF.top;
            canvas2.translate(f17, f18);
            this.f57659e0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f57659e0.draw(canvas2);
            canvas2.translate(-f17, -f18);
        }
        if (this.P0 && this.Q != null) {
            PointF pointF = this.f57675u0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.Q;
            h0 h0Var = this.f57677w0;
            if (charSequence != null) {
                float fQ = q() + this.f57663i0 + this.f57666l0;
                if (p3.a.getLayoutDirection(this) == 0) {
                    pointF.x = bounds.left + fQ;
                } else {
                    pointF.x = bounds.right - fQ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = h0Var.getTextPaint();
                Paint.FontMetrics fontMetrics = this.f57673s0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f10);
            }
            rectF.setEmpty();
            if (this.Q != null) {
                float fQ2 = q() + this.f57663i0 + this.f57666l0;
                float fR = r() + this.f57670p0 + this.f57667m0;
                if (p3.a.getLayoutDirection(this) == 0) {
                    rectF.left = bounds.left + fQ2;
                    rectF.right = bounds.right - fR;
                } else {
                    rectF.left = bounds.left + fR;
                    rectF.right = bounds.right - fQ2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            if (h0Var.getTextAppearance() != null) {
                h0Var.getTextPaint().drawableState = getState();
                h0Var.updateTextPaintDrawState(this.f57671q0);
            }
            h0Var.getTextPaint().setTextAlign(align);
            boolean z11 = Math.round(h0Var.getTextWidth(getText().toString())) > Math.round(rectF.width());
            if (z11) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i10 = iSave;
            } else {
                i10 = 0;
            }
            CharSequence charSequenceEllipsize = this.Q;
            if (z11 && this.O0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, h0Var.getTextPaint(), rectF.width(), this.O0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, h0Var.getTextPaint());
            canvas2 = canvas;
            if (z11) {
                canvas2.restoreToCount(i10);
            }
        }
        if (y()) {
            rectF.setEmpty();
            if (y()) {
                float f19 = this.f57670p0 + this.f57669o0;
                if (p3.a.getLayoutDirection(this) == 0) {
                    float f20 = bounds.right - f19;
                    rectF.right = f20;
                    rectF.left = f20 - this.f57655a0;
                } else {
                    float f21 = bounds.left + f19;
                    rectF.left = f21;
                    rectF.right = f21 + this.f57655a0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f22 = this.f57655a0;
                float f23 = fExactCenterY - (f22 / f10);
                rectF.top = f23;
                rectF.bottom = f23 + f22;
            }
            float f24 = rectF.left;
            float f25 = rectF.top;
            canvas2.translate(f24, f25);
            this.X.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Y.setBounds(this.X.getBounds());
            this.Y.jumpToCurrentState();
            this.Y.draw(canvas2);
            canvas2.translate(-f24, -f25);
        }
        if (this.F0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // yg.j, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.F0;
    }

    public Drawable getCheckedIcon() {
        return this.f57659e0;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f57660f0;
    }

    public ColorStateList getChipBackgroundColor() {
        return this.K;
    }

    public float getChipCornerRadius() {
        return this.R0 ? getTopLeftCornerResolvedSize() : this.M;
    }

    public float getChipEndPadding() {
        return this.f57670p0;
    }

    public Drawable getChipIcon() {
        Drawable drawable = this.S;
        if (drawable != null) {
            return p3.a.unwrap(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.U;
    }

    public ColorStateList getChipIconTint() {
        return this.T;
    }

    public float getChipMinHeight() {
        return this.L;
    }

    public float getChipStartPadding() {
        return this.f57663i0;
    }

    public ColorStateList getChipStrokeColor() {
        return this.N;
    }

    public float getChipStrokeWidth() {
        return this.O;
    }

    public void getChipTouchBounds(RectF rectF) {
        rectF.set(getBounds());
        if (y()) {
            float f10 = this.f57670p0 + this.f57669o0 + this.f57655a0 + this.f57668n0 + this.f57667m0;
            if (p3.a.getLayoutDirection(this) == 0) {
                rectF.right = r0.right - f10;
            } else {
                rectF.left = r0.left + f10;
            }
        }
    }

    public Drawable getCloseIcon() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return p3.a.unwrap(drawable);
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        return this.f57656b0;
    }

    public float getCloseIconEndPadding() {
        return this.f57669o0;
    }

    public float getCloseIconSize() {
        return this.f57655a0;
    }

    public float getCloseIconStartPadding() {
        return this.f57668n0;
    }

    public int[] getCloseIconState() {
        return this.K0;
    }

    public ColorStateList getCloseIconTint() {
        return this.Z;
    }

    public void getCloseIconTouchBounds(RectF rectF) {
        Rect bounds = getBounds();
        rectF.setEmpty();
        if (y()) {
            float f10 = this.f57670p0 + this.f57669o0 + this.f57655a0 + this.f57668n0 + this.f57667m0;
            if (p3.a.getLayoutDirection(this) == 0) {
                float f11 = bounds.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                float f12 = bounds.left;
                rectF.left = f12;
                rectF.right = f12 + f10;
            }
            rectF.top = bounds.top;
            rectF.bottom = bounds.bottom;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.G0;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.O0;
    }

    public vf.h getHideMotionSpec() {
        return this.f57662h0;
    }

    public float getIconEndPadding() {
        return this.f57665k0;
    }

    public float getIconStartPadding() {
        return this.f57664j0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.f57677w0.getTextWidth(getText().toString()) + q() + this.f57663i0 + this.f57666l0 + this.f57667m0 + this.f57670p0), this.Q0);
    }

    public int getMaxWidth() {
        return this.Q0;
    }

    @Override // yg.j, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // yg.j, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.R0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.M);
        } else {
            outline.setRoundRect(bounds, this.M);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public ColorStateList getRippleColor() {
        return this.P;
    }

    public vf.h getShowMotionSpec() {
        return this.f57661g0;
    }

    public CharSequence getText() {
        return this.Q;
    }

    public ug.g getTextAppearance() {
        return this.f57677w0.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.f57667m0;
    }

    public float getTextStartPadding() {
        return this.f57666l0;
    }

    public boolean getUseCompatRipple() {
        return this.L0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.f57657c0;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.f57658d0;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.R;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return t(this.X);
    }

    public boolean isCloseIconVisible() {
        return this.W;
    }

    @Override // yg.j, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (s(this.J) || s(this.K) || s(this.N)) {
            return true;
        }
        if (this.L0 && s(this.M0)) {
            return true;
        }
        ug.g textAppearance = this.f57677w0.getTextAppearance();
        if (textAppearance == null || textAppearance.getTextColor() == null || !textAppearance.getTextColor().isStateful()) {
            return (this.f57658d0 && this.f57659e0 != null && this.f57657c0) || t(this.S) || t(this.f57659e0) || s(this.I0);
        }
        return true;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        p3.a.setLayoutDirection(drawable, p3.a.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            drawable.setTintList(this.Z);
            return;
        }
        Drawable drawable2 = this.S;
        if (drawable == drawable2 && this.V) {
            drawable2.setTintList(this.T);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (x()) {
            zOnLayoutDirectionChanged |= p3.a.setLayoutDirection(this.S, i10);
        }
        if (w()) {
            zOnLayoutDirectionChanged |= p3.a.setLayoutDirection(this.f57659e0, i10);
        }
        if (y()) {
            zOnLayoutDirectionChanged |= p3.a.setLayoutDirection(this.X, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (x()) {
            zOnLevelChange |= this.S.setLevel(i10);
        }
        if (w()) {
            zOnLevelChange |= this.f57659e0.setLevel(i10);
        }
        if (y()) {
            zOnLevelChange |= this.X.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // yg.j, android.graphics.drawable.Drawable, qg.g0
    public boolean onStateChange(int[] iArr) {
        if (this.R0) {
            super.onStateChange(iArr);
        }
        return v(iArr, getCloseIconState());
    }

    @Override // qg.g0
    public void onTextSizeChange() {
        u();
        invalidateSelf();
    }

    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (x() || w()) {
            float f10 = this.f57663i0 + this.f57664j0;
            Drawable drawable = this.D0 ? this.f57659e0 : this.S;
            float intrinsicWidth = this.U;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (p3.a.getLayoutDirection(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.D0 ? this.f57659e0 : this.S;
            float fCeil = this.U;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(t0.dpToPx(this.f57671q0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float q() {
        if (!x() && !w()) {
            return 0.0f;
        }
        float f10 = this.f57664j0;
        Drawable drawable = this.D0 ? this.f57659e0 : this.S;
        float intrinsicWidth = this.U;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.f57665k0;
    }

    public final float r() {
        if (y()) {
            return this.f57668n0 + this.f57655a0 + this.f57669o0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // yg.j, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.F0 != i10) {
            this.F0 = i10;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z10) {
        if (this.f57657c0 != z10) {
            this.f57657c0 = z10;
            float fQ = q();
            if (!z10 && this.D0) {
                this.D0 = false;
            }
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public void setCheckableResource(int i10) {
        setCheckable(this.f57671q0.getResources().getBoolean(i10));
    }

    public void setCheckedIcon(Drawable drawable) {
        if (this.f57659e0 != drawable) {
            float fQ = q();
            this.f57659e0 = drawable;
            float fQ2 = q();
            z(this.f57659e0);
            o(this.f57659e0);
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(this.f57671q0.getResources().getBoolean(i10));
    }

    public void setCheckedIconResource(int i10) {
        setCheckedIcon(l.a.getDrawable(this.f57671q0, i10));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f57660f0 != colorStateList) {
            this.f57660f0 = colorStateList;
            if (this.f57658d0 && (drawable = this.f57659e0) != null && this.f57657c0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(int i10) {
        setCheckedIconTint(l.a.getColorStateList(this.f57671q0, i10));
    }

    public void setCheckedIconVisible(int i10) {
        setCheckedIconVisible(this.f57671q0.getResources().getBoolean(i10));
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        setChipBackgroundColor(l.a.getColorStateList(this.f57671q0, i10));
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        if (this.M != f10) {
            this.M = f10;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f10));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        setChipCornerRadius(this.f57671q0.getResources().getDimension(i10));
    }

    public void setChipEndPadding(float f10) {
        if (this.f57670p0 != f10) {
            this.f57670p0 = f10;
            invalidateSelf();
            u();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        setChipEndPadding(this.f57671q0.getResources().getDimension(i10));
    }

    public void setChipIcon(Drawable drawable) {
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float fQ = q();
            this.S = drawable != null ? p3.a.wrap(drawable).mutate() : null;
            float fQ2 = q();
            z(chipIcon);
            if (x()) {
                o(this.S);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        setChipIcon(l.a.getDrawable(this.f57671q0, i10));
    }

    public void setChipIconSize(float f10) {
        if (this.U != f10) {
            float fQ = q();
            this.U = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public void setChipIconSizeResource(int i10) {
        setChipIconSize(this.f57671q0.getResources().getDimension(i10));
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        this.V = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (x()) {
                this.S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(int i10) {
        setChipIconTint(l.a.getColorStateList(this.f57671q0, i10));
    }

    public void setChipIconVisible(int i10) {
        setChipIconVisible(this.f57671q0.getResources().getBoolean(i10));
    }

    public void setChipMinHeight(float f10) {
        if (this.L != f10) {
            this.L = f10;
            invalidateSelf();
            u();
        }
    }

    public void setChipMinHeightResource(int i10) {
        setChipMinHeight(this.f57671q0.getResources().getDimension(i10));
    }

    public void setChipStartPadding(float f10) {
        if (this.f57663i0 != f10) {
            this.f57663i0 = f10;
            invalidateSelf();
            u();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        setChipStartPadding(this.f57671q0.getResources().getDimension(i10));
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (this.R0) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(int i10) {
        setChipStrokeColor(l.a.getColorStateList(this.f57671q0, i10));
    }

    public void setChipStrokeWidth(float f10) {
        if (this.O != f10) {
            this.O = f10;
            this.f57672r0.setStrokeWidth(f10);
            if (this.R0) {
                super.setStrokeWidth(f10);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        setChipStrokeWidth(this.f57671q0.getResources().getDimension(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float fR = r();
            this.X = drawable != null ? p3.a.wrap(drawable).mutate() : null;
            this.Y = new RippleDrawable(vg.b.sanitizeRippleDrawableColor(getRippleColor()), this.X, T0);
            float fR2 = r();
            z(closeIcon);
            if (y()) {
                o(this.X);
            }
            invalidateSelf();
            if (fR != fR2) {
                u();
            }
        }
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        if (this.f57656b0 != charSequence) {
            this.f57656b0 = v3.c.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        if (this.f57669o0 != f10) {
            this.f57669o0 = f10;
            invalidateSelf();
            if (y()) {
                u();
            }
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        setCloseIconEndPadding(this.f57671q0.getResources().getDimension(i10));
    }

    public void setCloseIconResource(int i10) {
        setCloseIcon(l.a.getDrawable(this.f57671q0, i10));
    }

    public void setCloseIconSize(float f10) {
        if (this.f57655a0 != f10) {
            this.f57655a0 = f10;
            invalidateSelf();
            if (y()) {
                u();
            }
        }
    }

    public void setCloseIconSizeResource(int i10) {
        setCloseIconSize(this.f57671q0.getResources().getDimension(i10));
    }

    public void setCloseIconStartPadding(float f10) {
        if (this.f57668n0 != f10) {
            this.f57668n0 = f10;
            invalidateSelf();
            if (y()) {
                u();
            }
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        setCloseIconStartPadding(this.f57671q0.getResources().getDimension(i10));
    }

    public boolean setCloseIconState(int[] iArr) {
        if (Arrays.equals(this.K0, iArr)) {
            return false;
        }
        this.K0 = iArr;
        if (y()) {
            return v(getState(), iArr);
        }
        return false;
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (y()) {
                this.X.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(int i10) {
        setCloseIconTint(l.a.getColorStateList(this.f57671q0, i10));
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(this.f57671q0.getResources().getBoolean(i10));
    }

    @Override // yg.j, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.G0 != colorFilter) {
            this.G0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(e eVar) {
        this.N0 = new WeakReference(eVar);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.O0 = truncateAt;
    }

    public void setHideMotionSpec(vf.h hVar) {
        this.f57662h0 = hVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(vf.h.createFromResource(this.f57671q0, i10));
    }

    public void setIconEndPadding(float f10) {
        if (this.f57665k0 != f10) {
            float fQ = q();
            this.f57665k0 = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public void setIconEndPaddingResource(int i10) {
        setIconEndPadding(this.f57671q0.getResources().getDimension(i10));
    }

    public void setIconStartPadding(float f10) {
        if (this.f57664j0 != f10) {
            float fQ = q();
            this.f57664j0 = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                u();
            }
        }
    }

    public void setIconStartPaddingResource(int i10) {
        setIconStartPadding(this.f57671q0.getResources().getDimension(i10));
    }

    public void setMaxWidth(int i10) {
        this.Q0 = i10;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            this.M0 = this.L0 ? vg.b.sanitizeRippleDrawableColor(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(int i10) {
        setRippleColor(l.a.getColorStateList(this.f57671q0, i10));
    }

    public void setShowMotionSpec(vf.h hVar) {
        this.f57661g0 = hVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(vf.h.createFromResource(this.f57671q0, i10));
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.Q, charSequence)) {
            return;
        }
        this.Q = charSequence;
        this.f57677w0.setTextWidthDirty(true);
        invalidateSelf();
        u();
    }

    public void setTextAppearance(ug.g gVar) {
        this.f57677w0.setTextAppearance(gVar, this.f57671q0);
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(new ug.g(this.f57671q0, i10));
    }

    public void setTextColor(int i10) {
        setTextColor(ColorStateList.valueOf(i10));
    }

    public void setTextEndPadding(float f10) {
        if (this.f57667m0 != f10) {
            this.f57667m0 = f10;
            invalidateSelf();
            u();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        setTextEndPadding(this.f57671q0.getResources().getDimension(i10));
    }

    public void setTextResource(int i10) {
        setText(this.f57671q0.getResources().getString(i10));
    }

    public void setTextSize(float f10) {
        ug.g textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f10);
            this.f57677w0.getTextPaint().setTextSize(f10);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f10) {
        if (this.f57666l0 != f10) {
            this.f57666l0 = f10;
            invalidateSelf();
            u();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        setTextStartPadding(this.f57671q0.getResources().getDimension(i10));
    }

    @Override // yg.j, android.graphics.drawable.Drawable, p3.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // yg.j, android.graphics.drawable.Drawable, p3.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.J0 != mode) {
            this.J0 = mode;
            this.H0 = mg.c.updateTintFilter(this, this.I0, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z10) {
        if (this.L0 != z10) {
            this.L0 = z10;
            this.M0 = z10 ? vg.b.sanitizeRippleDrawableColor(this.P) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (x()) {
            visible |= this.S.setVisible(z10, z11);
        }
        if (w()) {
            visible |= this.f57659e0.setVisible(z10, z11);
        }
        if (y()) {
            visible |= this.X.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.N0.get();
        if (eVar != null) {
            eVar.onChipDrawableSizeChange();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean z11;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.J;
        int iD = d(colorStateList != null ? colorStateList.getColorForState(iArr, this.f57678x0) : 0);
        boolean state = true;
        if (this.f57678x0 != iD) {
            this.f57678x0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.K;
        int iD2 = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f57679y0) : 0);
        if (this.f57679y0 != iD2) {
            this.f57679y0 = iD2;
            zOnStateChange = true;
        }
        int iLayer = jg.b.layer(iD, iD2);
        if ((this.f57680z0 != iLayer) | (getFillColor() == null)) {
            this.f57680z0 = iLayer;
            setFillColor(ColorStateList.valueOf(iLayer));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.N;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.A0) : 0;
        if (this.A0 != colorForState) {
            this.A0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.M0 == null || !vg.b.shouldDrawRippleCompat(iArr)) ? 0 : this.M0.getColorForState(iArr, this.B0);
        if (this.B0 != colorForState2) {
            this.B0 = colorForState2;
            if (this.L0) {
                zOnStateChange = true;
            }
        }
        h0 h0Var = this.f57677w0;
        int colorForState3 = (h0Var.getTextAppearance() == null || h0Var.getTextAppearance().getTextColor() == null) ? 0 : h0Var.getTextAppearance().getTextColor().getColorForState(iArr, this.C0);
        if (this.C0 != colorForState3) {
            this.C0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z10 = false;
        } else {
            int length = state2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (state2[i10] != 16842912) {
                    i10++;
                } else if (this.f57657c0) {
                    z10 = true;
                }
            }
            z10 = false;
        }
        if (this.D0 == z10 || this.f57659e0 == null) {
            z11 = false;
        } else {
            float fQ = q();
            this.D0 = z10;
            if (fQ != q()) {
                zOnStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.I0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.E0) : 0;
        if (this.E0 != colorForState4) {
            this.E0 = colorForState4;
            this.H0 = mg.c.updateTintFilter(this, this.I0, this.J0);
        } else {
            state = zOnStateChange;
        }
        if (t(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (t(this.f57659e0)) {
            state |= this.f57659e0.setState(iArr);
        }
        if (t(this.X)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.X.setState(iArr3);
        }
        if (t(this.Y)) {
            state |= this.Y.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z11) {
            u();
        }
        return state;
    }

    public final boolean w() {
        return this.f57658d0 && this.f57659e0 != null && this.D0;
    }

    public final boolean x() {
        return this.R && this.S != null;
    }

    public final boolean y() {
        return this.W && this.X != null;
    }

    public void setCheckedIconVisible(boolean z10) {
        if (this.f57658d0 != z10) {
            boolean zW = w();
            this.f57658d0 = z10;
            boolean zW2 = w();
            if (zW != zW2) {
                if (zW2) {
                    o(this.f57659e0);
                } else {
                    z(this.f57659e0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public void setChipIconVisible(boolean z10) {
        if (this.R != z10) {
            boolean zX = x();
            this.R = z10;
            boolean zX2 = x();
            if (zX != zX2) {
                if (zX2) {
                    o(this.S);
                } else {
                    z(this.S);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        if (this.W != z10) {
            boolean zY = y();
            this.W = z10;
            boolean zY2 = y();
            if (zY != zY2) {
                if (zY2) {
                    o(this.X);
                } else {
                    z(this.X);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        ug.g textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
    }
}
