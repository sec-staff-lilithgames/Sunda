package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBridgeImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private Xfermode f39986a;

    /* renamed from: b, reason: collision with root package name */
    private int f39987b;

    /* renamed from: c, reason: collision with root package name */
    private int f39988c;

    /* renamed from: d, reason: collision with root package name */
    private int f39989d;

    /* renamed from: e, reason: collision with root package name */
    private int f39990e;

    /* renamed from: f, reason: collision with root package name */
    private int f39991f;

    /* renamed from: g, reason: collision with root package name */
    private int f39992g;

    /* renamed from: h, reason: collision with root package name */
    private int f39993h;

    /* renamed from: i, reason: collision with root package name */
    private int f39994i;

    /* renamed from: j, reason: collision with root package name */
    private int f39995j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f39996k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f39997l;

    /* renamed from: m, reason: collision with root package name */
    private RectF f39998m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f39999n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f40000o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f40001p;

    /* renamed from: q, reason: collision with root package name */
    private Path f40002q;

    /* renamed from: r, reason: collision with root package name */
    private Paint f40003r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f39994i, this.f39995j, this.f39999n, this.f39996k);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f39996k == null || this.f39997l == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f39996k;
                float f10 = this.f39990e;
                fArr[i13] = f10;
                this.f39997l[i13] = f10 - (this.f39994i / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f39996k;
                float f11 = this.f39991f;
                fArr2[i10] = f11;
                this.f39997l[i10] = f11 - (this.f39994i / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f39996k;
                float f12 = this.f39992g;
                fArr3[i11] = f12;
                this.f39997l[i11] = f12 - (this.f39994i / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f39996k;
                float f13 = this.f39993h;
                fArr4[i12] = f13;
                this.f39997l[i12] = f13 - (this.f39994i / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f39999n;
        if (rectF != null) {
            float f10 = this.f39994i / 2.0f;
            rectF.set(f10, f10, this.f39987b - f10, this.f39988c - f10);
        }
    }

    private void d() {
        RectF rectF = this.f39998m;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f39987b, this.f39988c);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f39998m, null, 31);
            int i10 = this.f39987b;
            int i11 = this.f39994i * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            float f12 = this.f39988c;
            canvas.scale(f10 / f11, ((r5 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f40003r;
            if (paint != null) {
                paint.reset();
                this.f40003r.setAntiAlias(true);
                this.f40003r.setStyle(Paint.Style.FILL);
                this.f40003r.setXfermode(this.f39986a);
            }
            Path path = this.f40002q;
            if (path != null) {
                path.reset();
                this.f40002q.addRoundRect(this.f39998m, this.f39997l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f40002q, this.f40003r);
            Paint paint2 = this.f40003r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f40000o) {
                a(canvas);
            }
        } catch (Exception e10) {
            p0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f39987b = i10;
        this.f39988c = i11;
        if (this.f40001p) {
            b();
        } else {
            a();
        }
        c();
        d();
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f40000o = true;
        this.f39994i = i11;
        this.f39995j = i12;
        this.f39989d = i10;
    }

    public void setCornerRadius(int i10) {
        this.f39989d = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f40000o = true;
        this.f40001p = true;
        this.f39994i = i14;
        this.f39995j = i15;
        this.f39990e = i10;
        this.f39992g = i12;
        this.f39991f = i11;
        this.f39993h = i13;
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f40002q;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f40002q, this.f40003r);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f40002q = new Path();
        this.f40003r = new Paint();
        this.f39996k = new float[8];
        this.f39997l = new float[8];
        this.f39999n = new RectF();
        this.f39998m = new RectF();
        this.f39986a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f40002q;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f40003r;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f40003r.setColor(i11);
            this.f40003r.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f39996k == null || this.f39997l == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f39996k;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f39989d;
                fArr[i10] = f10;
                this.f39997l[i10] = f10 - (this.f39994i / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
