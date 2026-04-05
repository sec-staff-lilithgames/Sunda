package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBCusRoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private int f39922a;

    /* renamed from: b, reason: collision with root package name */
    private int f39923b;

    /* renamed from: c, reason: collision with root package name */
    private int f39924c;

    /* renamed from: d, reason: collision with root package name */
    private int f39925d;

    /* renamed from: e, reason: collision with root package name */
    private Xfermode f39926e;

    /* renamed from: f, reason: collision with root package name */
    private int f39927f;

    /* renamed from: g, reason: collision with root package name */
    private int f39928g;

    /* renamed from: h, reason: collision with root package name */
    private int f39929h;

    /* renamed from: i, reason: collision with root package name */
    private int f39930i;

    /* renamed from: j, reason: collision with root package name */
    private int f39931j;

    /* renamed from: k, reason: collision with root package name */
    private int f39932k;

    /* renamed from: l, reason: collision with root package name */
    private int f39933l;

    /* renamed from: m, reason: collision with root package name */
    private int f39934m;

    /* renamed from: n, reason: collision with root package name */
    private int f39935n;

    /* renamed from: o, reason: collision with root package name */
    private float[] f39936o;

    /* renamed from: p, reason: collision with root package name */
    private float[] f39937p;

    /* renamed from: q, reason: collision with root package name */
    private RectF f39938q;

    /* renamed from: r, reason: collision with root package name */
    private RectF f39939r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f39940s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f39941t;

    /* renamed from: u, reason: collision with root package name */
    private Path f39942u;

    /* renamed from: v, reason: collision with root package name */
    private Paint f39943v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39944a;

        static {
            int[] iArr = new int[c.values().length];
            f39944a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39944a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39944a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39944a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39944a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39944a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39944a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39944a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39944a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39944a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39944a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39944a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f39944a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f39944a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f39944a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f39944a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f39934m, this.f39935n, this.f39939r, this.f39936o);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f39936o == null || this.f39937p == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f39936o;
                float f10 = this.f39930i;
                fArr[i13] = f10;
                this.f39937p[i13] = f10 - (this.f39934m / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f39936o;
                float f11 = this.f39931j;
                fArr2[i10] = f11;
                this.f39937p[i10] = f11 - (this.f39934m / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f39936o;
                float f12 = this.f39932k;
                fArr3[i11] = f12;
                this.f39937p[i11] = f12 - (this.f39934m / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f39936o;
                float f13 = this.f39933l;
                fArr4[i12] = f13;
                this.f39937p[i12] = f13 - (this.f39934m / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f39939r;
        if (rectF != null) {
            float f10 = this.f39934m / 2.0f;
            rectF.set(f10, f10, this.f39927f - f10, this.f39928g - f10);
        }
    }

    private void d() {
        RectF rectF = this.f39938q;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f39927f, this.f39928g);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f39944a[cVar.ordinal()];
                if (i11 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i11 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue2);
                    }
                } else if (i11 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (attributeValue3.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue3.startsWith("m")) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f39938q, null, 31);
            int i10 = this.f39927f;
            int i11 = this.f39934m * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            float f12 = this.f39928g;
            canvas.scale(f10 / f11, ((r5 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f39943v;
            if (paint != null) {
                paint.reset();
                this.f39943v.setAntiAlias(true);
                this.f39943v.setStyle(Paint.Style.FILL);
                this.f39943v.setXfermode(this.f39926e);
            }
            Path path = this.f39942u;
            if (path != null) {
                path.reset();
                this.f39942u.addRoundRect(this.f39938q, this.f39937p, Path.Direction.CCW);
            }
            canvas.drawPath(this.f39942u, this.f39943v);
            Paint paint2 = this.f39943v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f39940s) {
                a(canvas);
            }
        } catch (Exception e10) {
            p0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        try {
            this.f39927f = i10;
            this.f39928g = i11;
            if (this.f39941t) {
                b();
            } else {
                a();
            }
            c();
            d();
        } catch (Exception e10) {
            p0.b("MBridgeImageView", e10.getMessage());
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) throws NumberFormatException {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f39944a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i10), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArrSplit = null;
                            }
                            if (strArrSplit == null || strArrSplit.length > 2) {
                                if (strArrSplit == null || strArrSplit.length != 3) {
                                    setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                    break;
                                } else {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                        setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                        break;
                                    }
                                }
                            } else {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                break;
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                            break;
                        }
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.f40270a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            String str = com.mbridge.msdk.dycreator.utils.b.f40270a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                break;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            break;
                        } else if (attributeValue5.equals("invisible")) {
                            setVisibility(4);
                            break;
                        } else if (attributeValue5.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue6)) {
                            break;
                        } else if (attributeValue6.equals("fitXY")) {
                            setScaleType(ImageView.ScaleType.FIT_XY);
                            break;
                        } else if (attributeValue6.equals("centerInside")) {
                            setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            break;
                        } else if (attributeValue6.equals("centerCrop")) {
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f39925d = iA;
                        this.f39924c = iA;
                        this.f39923b = iA;
                        this.f39922a = iA;
                        setPadding(iA, iA, iA, iA);
                        break;
                    case 9:
                        int iA2 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f39923b = iA2;
                        setPadding(this.f39922a, iA2, this.f39924c, this.f39925d);
                        break;
                    case 10:
                        int iA3 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f39925d = iA3;
                        setPadding(this.f39922a, this.f39923b, this.f39924c, iA3);
                        break;
                    case 11:
                        int iA4 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f39922a = iA4;
                        setPadding(iA4, this.f39923b, this.f39924c, this.f39925d);
                        break;
                    case 12:
                        int iA5 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f39924c = iA5;
                        setPadding(this.f39922a, this.f39923b, iA5, this.f39925d);
                        break;
                }
            }
        }
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f39940s = true;
        this.f39934m = i11;
        this.f39935n = i12;
        this.f39929h = i10;
    }

    public void setCornerRadius(int i10) {
        this.f39929h = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f39940s = true;
        this.f39941t = true;
        this.f39934m = i14;
        this.f39935n = i15;
        this.f39930i = i10;
        this.f39932k = i12;
        this.f39931j = i11;
        this.f39933l = i13;
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f39942u;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f39942u, this.f39943v);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39942u = new Path();
        this.f39943v = new Paint();
        this.f39936o = new float[8];
        this.f39937p = new float[8];
        this.f39939r = new RectF();
        this.f39938q = new RectF();
        this.f39926e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f39942u;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f39943v;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f39943v.setColor(i11);
            this.f39943v.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f39936o == null || this.f39937p == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f39936o;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f39929h;
                fArr[i10] = f10;
                this.f39937p[i10] = f10 - (this.f39934m / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
