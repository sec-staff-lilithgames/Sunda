package com.bytedance.adsdk.ugeno.zz.cm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.cm;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.jpo.qk;
import com.bytedance.adsdk.ugeno.jpo.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends ImageView implements IAnimation, qk {

    /* renamed from: jd, reason: collision with root package name */
    static final /* synthetic */ boolean f18070jd = true;

    /* renamed from: au, reason: collision with root package name */
    private boolean f18071au;
    private int hna;

    /* renamed from: if, reason: not valid java name */
    private boolean f47if;

    /* renamed from: jj, reason: collision with root package name */
    private Drawable f18072jj;

    /* renamed from: jr, reason: collision with root package name */
    private Shader.TileMode f18073jr;

    /* renamed from: ju, reason: collision with root package name */
    private Drawable f18074ju;
    private final float[] my;
    private cm nmd;
    private Shader.TileMode opi;
    private boolean oya;
    private int prr;

    /* renamed from: qk, reason: collision with root package name */
    private ColorStateList f18075qk;

    /* renamed from: rq, reason: collision with root package name */
    private xyk f18076rq;

    /* renamed from: sq, reason: collision with root package name */
    private ImageView.ScaleType f18077sq;
    private float wqx;
    private float xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f18078yd;
    private ColorFilter zz;
    public static final Shader.TileMode jpo = Shader.TileMode.CLAMP;

    /* renamed from: cm, reason: collision with root package name */
    private static final ImageView.ScaleType[] f18069cm = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.ugeno.zz.cm.jpo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            jpo = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jpo[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                jpo[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                jpo[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                jpo[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                jpo[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public jpo(Context context) {
        super(context);
        this.my = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f18075qk = ColorStateList.valueOf(-16777216);
        this.xyk = 0.0f;
        this.zz = null;
        this.f18078yd = false;
        this.f47if = false;
        this.f18071au = false;
        this.oya = false;
        Shader.TileMode tileMode = jpo;
        this.opi = tileMode;
        this.f18073jr = tileMode;
        this.f18076rq = new xyk(this);
    }

    private void cm() {
        Drawable drawable = this.f18074ju;
        if (drawable == null || !this.f18078yd) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f18074ju = drawableMutate;
        if (this.f47if) {
            drawableMutate.setColorFilter(this.zz);
        }
    }

    private Drawable jd() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.hna;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.hna, e10);
                this.hna = 0;
            }
        }
        return jd.jpo(drawable);
    }

    private Drawable jpo() throws Resources.NotFoundException {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.prr;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.prr, e10);
                this.prr = 0;
            }
        }
        return jd.jpo(drawable);
    }

    private void wqx() {
        jpo(this.f18074ju, this.f18077sq);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cm cmVar = this.nmd;
        if (cmVar != null) {
            cmVar.jd(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.f18075qk.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f18075qk;
    }

    public float getBorderRadius() {
        return this.f18076rq.jpo();
    }

    public float getBorderWidth() {
        return this.xyk;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f10 : this.my) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.jpo.qk
    public float getRipple() {
        return this.wqx;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getRubIn() {
        return this.f18076rq.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f18077sq;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getShine() {
        return this.f18076rq.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getStretch() {
        return this.f18076rq.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.opi;
    }

    public Shader.TileMode getTileModeY() {
        return this.f18073jr;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cm cmVar = this.nmd;
        if (cmVar != null) {
            cmVar.qk();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cm cmVar = this.nmd;
        if (cmVar != null) {
            cmVar.xyk();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cm cmVar = this.nmd;
        if (cmVar != null) {
            cmVar.jpo(canvas, this);
            this.nmd.jpo(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        cm cmVar = this.nmd;
        if (cmVar != null) {
            cmVar.jpo(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        cm cmVar = this.nmd;
        if (cmVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrJpo = cmVar.jpo(i10, i11);
            super.onMeasure(iArrJpo[0], iArrJpo[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        cm cmVar = this.nmd;
        if (cmVar != null) {
            cmVar.jd(i10, i11, i12, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.f18072jj = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f18072jj = drawable;
        jpo(true);
        super.setBackgroundDrawable(this.f18072jj);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) throws Resources.NotFoundException {
        if (this.hna != i10) {
            this.hna = i10;
            Drawable drawableJd = jd();
            this.f18072jj = drawableJd;
            setBackgroundDrawable(drawableJd);
        }
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        xyk xykVar = this.f18076rq;
        if (xykVar != null) {
            xykVar.jpo(f10);
        }
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.zz != colorFilter) {
            this.zz = colorFilter;
            this.f47if = true;
            this.f18078yd = true;
            cm();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        jpo(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(i10);
        jpo(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.prr = 0;
        this.f18074ju = jd.jpo(bitmap);
        wqx();
        super.setImageDrawable(this.f18074ju);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.prr = 0;
        this.f18074ju = jd.jpo(drawable);
        wqx();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.prr != i10) {
            this.prr = i10;
            this.f18074ju = jpo();
            wqx();
            super.setImageDrawable(this.f18074ju);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z10) {
        this.f18071au = z10;
        wqx();
        jpo(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.wqx = f10;
        xyk xykVar = this.f18076rq;
        if (xykVar != null) {
            xykVar.jd(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        xyk xykVar = this.f18076rq;
        if (xykVar != null) {
            xykVar.my(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!f18070jd && scaleType == null) {
            throw new AssertionError();
        }
        if (this.f18077sq != scaleType) {
            this.f18077sq = scaleType;
            int i10 = AnonymousClass1.jpo[scaleType.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            wqx();
            jpo(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        xyk xykVar = this.f18076rq;
        if (xykVar != null) {
            xykVar.wqx(f10);
        }
    }

    public void setStretch(float f10) {
        xyk xykVar = this.f18076rq;
        if (xykVar != null) {
            xykVar.cm(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.opi == tileMode) {
            return;
        }
        this.opi = tileMode;
        wqx();
        jpo(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f18073jr == tileMode) {
            return;
        }
        this.f18073jr = tileMode;
        wqx();
        jpo(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f18075qk.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f18075qk = colorStateList;
        wqx();
        jpo(false);
        if (this.xyk > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.xyk == f10) {
            return;
        }
        this.xyk = f10;
        wqx();
        jpo(false);
        invalidate();
    }

    private void jpo(boolean z10) {
        if (this.oya) {
            if (z10) {
                this.f18072jj = jd.jpo(this.f18072jj);
            }
            jpo(this.f18072jj, ImageView.ScaleType.FIT_XY);
        }
    }

    private void jpo(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof jd) {
            jd jdVar = (jd) drawable;
            jdVar.jpo(scaleType).jpo(this.xyk).jpo(this.f18075qk).jpo(this.f18071au).jpo(this.opi).jd(this.f18073jr);
            float[] fArr = this.my;
            if (fArr != null) {
                jdVar.jpo(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            cm();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                jpo(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public void jpo(float f10, float f11, float f12, float f13) {
        float[] fArr = this.my;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        wqx();
        jpo(false);
        invalidate();
    }

    public void jpo(cm cmVar) {
        this.nmd = cmVar;
    }
}
