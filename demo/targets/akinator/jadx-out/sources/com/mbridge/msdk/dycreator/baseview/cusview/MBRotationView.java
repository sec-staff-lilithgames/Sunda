package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MBRotationView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private Camera f39945a;

    /* renamed from: b, reason: collision with root package name */
    private Matrix f39946b;

    /* renamed from: c, reason: collision with root package name */
    private int f39947c;

    /* renamed from: d, reason: collision with root package name */
    private int f39948d;

    /* renamed from: e, reason: collision with root package name */
    private int f39949e;

    /* renamed from: f, reason: collision with root package name */
    private int f39950f;

    /* renamed from: g, reason: collision with root package name */
    private int f39951g;

    /* renamed from: h, reason: collision with root package name */
    private int f39952h;

    /* renamed from: i, reason: collision with root package name */
    private int f39953i;

    /* renamed from: j, reason: collision with root package name */
    private int f39954j;

    /* renamed from: k, reason: collision with root package name */
    private float f39955k;

    /* renamed from: l, reason: collision with root package name */
    private float f39956l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f39957m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f39958n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f39959o;

    /* renamed from: p, reason: collision with root package name */
    Runnable f39960p;

    public MBRotationView(Context context) {
        super(context);
        this.f39949e = 40;
        this.f39950f = 20;
        this.f39951g = 0;
        this.f39952h = 0;
        this.f39954j = 0;
        this.f39955k = 0.5f;
        this.f39956l = 0.9f;
        this.f39957m = true;
        this.f39958n = false;
        this.f39959o = false;
        this.f39960p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas) {
        int height = getHeight() / 2;
        int i10 = ((this.f39951g * this.f39947c) / 2) / this.f39949e;
        a(canvas, i10, height, 0);
        a(canvas, i10, height, 1);
        if (Math.abs(this.f39951g) > this.f39949e / 2) {
            a(canvas, i10, height, 3);
            a(canvas, i10, height, 2);
        } else {
            a(canvas, i10, height, 2);
            a(canvas, i10, height, 3);
        }
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 == 0) {
            i11 = this.f39959o ? this.f39952h - 2 : this.f39952h + 2;
        } else if (i10 != 1) {
            if (i10 != 2) {
                i11 = i10 != 3 ? 0 : this.f39952h;
            } else if (this.f39959o) {
                i12 = this.f39952h;
                i11 = i12 - 1;
            } else {
                i13 = this.f39952h;
                i11 = i13 + 1;
            }
        } else if (this.f39959o) {
            i13 = this.f39952h;
            i11 = i13 + 1;
        } else {
            i12 = this.f39952h;
            i11 = i12 - 1;
        }
        int childCount = i11 % getChildCount();
        return childCount >= 0 ? childCount : getChildCount() + childCount;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f39958n) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        float f10 = i14;
        float f11 = this.f39955k;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        int i16 = i13 - i11;
        float f12 = i16;
        float f13 = this.f39956l;
        int i17 = (int) (((1.0f - f13) * f12) / 2.0f);
        this.f39947c = (int) (f12 * f13);
        this.f39948d = (int) (f10 * f11);
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            childAt.layout(i15, i17, i14 - i15, i16 - i17);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i19 = layoutParams.width;
            int i20 = this.f39948d;
            if (i19 != i20) {
                layoutParams.width = i20;
                layoutParams.height = this.f39947c;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z10) {
        if (z10) {
            postDelayed(this.f39960p, 1000 / this.f39950f);
        }
        this.f39957m = z10;
    }

    public void setHeightRatio(float f10) {
        this.f39956l = f10;
    }

    public void setRotateV(boolean z10) {
        this.f39958n = z10;
        invalidate();
    }

    public void setWidthRatio(float f10) {
        this.f39955k = f10;
    }

    private void a() {
        this.f39945a = new Camera();
        this.f39946b = new Matrix();
        setWillNotDraw(false);
    }

    private void a(Canvas canvas) {
        int width = getWidth() / 2;
        int i10 = ((this.f39951g * this.f39948d) / 2) / this.f39949e;
        b(canvas, i10, width, 0);
        b(canvas, i10, width, 1);
        if (Math.abs(this.f39951g) > this.f39949e / 2) {
            b(canvas, i10, width, 3);
            b(canvas, i10, width, 2);
        } else {
            b(canvas, i10, width, 2);
            b(canvas, i10, width, 3);
        }
    }

    private void b(int i10, int i11, int i12) {
        float f10 = (-i10) / 2.0f;
        if (i12 == 0) {
            this.f39945a.translate(0.0f, f10, 0.0f);
            float f11 = -i11;
            this.f39945a.rotateX(f11);
            this.f39945a.translate(0.0f, f10, 0.0f);
            this.f39945a.translate(0.0f, f10, 0.0f);
            this.f39945a.rotateX(f11);
            this.f39945a.translate(0.0f, f10, 0.0f);
            return;
        }
        if (i12 == 1) {
            this.f39945a.translate(0.0f, f10, 0.0f);
            this.f39945a.rotateX(i11);
            this.f39945a.translate(0.0f, f10, 0.0f);
        } else if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f39945a.rotateX(0.0f);
        } else {
            this.f39945a.translate(0.0f, f10, 0.0f);
            this.f39945a.rotateX(-i11);
            this.f39945a.translate(0.0f, f10, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39949e = 40;
        this.f39950f = 20;
        this.f39951g = 0;
        this.f39952h = 0;
        this.f39954j = 0;
        this.f39955k = 0.5f;
        this.f39956l = 0.9f;
        this.f39957m = true;
        this.f39958n = false;
        this.f39959o = false;
        this.f39960p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void a(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f39945a.save();
        this.f39946b.reset();
        float f10 = i10;
        this.f39945a.translate(0.0f, f10, 0.0f);
        this.f39945a.rotateX(this.f39951g);
        this.f39945a.translate(0.0f, f10, 0.0f);
        if (i10 == 0) {
            if (this.f39959o) {
                b(this.f39947c, this.f39949e, i12);
            } else {
                b(-this.f39947c, -this.f39949e, i12);
            }
        } else if (i10 > 0) {
            b(this.f39947c, this.f39949e, i12);
        } else if (i10 < 0) {
            b(-this.f39947c, -this.f39949e, i12);
        }
        this.f39945a.getMatrix(this.f39946b);
        this.f39945a.restore();
        this.f39946b.preTranslate((-getWidth()) / 2, -i11);
        this.f39946b.postTranslate(getWidth() / 2, i11);
        canvas.concat(this.f39946b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (getChildCount() == 0) {
            return;
        }
        int i10 = this.f39951g - 1;
        this.f39951g = i10;
        this.f39953i = this.f39952h;
        a(i10);
        if (this.f39957m) {
            postDelayed(this.f39960p, 1000 / this.f39950f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f39949e = 40;
        this.f39950f = 20;
        this.f39951g = 0;
        this.f39952h = 0;
        this.f39954j = 0;
        this.f39955k = 0.5f;
        this.f39956l = 0.9f;
        this.f39957m = true;
        this.f39958n = false;
        this.f39959o = false;
        this.f39960p = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.this.b();
            }
        };
        a();
    }

    private void b(Canvas canvas, int i10, int i11, int i12) {
        canvas.save();
        this.f39945a.save();
        this.f39946b.reset();
        float f10 = i10;
        this.f39945a.translate(f10, 0.0f, 0.0f);
        this.f39945a.rotateY(this.f39951g);
        this.f39945a.translate(f10, 0.0f, 0.0f);
        if (i10 == 0) {
            if (this.f39959o) {
                a(this.f39948d, this.f39949e, i12);
            } else {
                a(-this.f39948d, -this.f39949e, i12);
            }
        } else if (i10 > 0) {
            a(this.f39948d, this.f39949e, i12);
        } else if (i10 < 0) {
            a(-this.f39948d, -this.f39949e, i12);
        }
        this.f39945a.getMatrix(this.f39946b);
        this.f39945a.restore();
        this.f39946b.preTranslate(-i11, (-getHeight()) / 2);
        this.f39946b.postTranslate(i11, getHeight() / 2);
        canvas.concat(this.f39946b);
        View childAt = getChildAt(c(i12));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(int i10) {
        int i11 = this.f39949e;
        int i12 = this.f39953i - (i10 / i11);
        this.f39951g = i10 % i11;
        b(i12);
        invalidate();
    }

    private void a(int i10, int i11, int i12) {
        if (i12 == 0) {
            float f10 = (-i10) / 2;
            this.f39945a.translate(f10, 0.0f, 0.0f);
            float f11 = -i11;
            this.f39945a.rotateY(f11);
            this.f39945a.translate(f10, 0.0f, 0.0f);
            this.f39945a.translate(f10, 0.0f, 0.0f);
            this.f39945a.rotateY(f11);
            this.f39945a.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i12 == 1) {
            float f12 = i10 / 2;
            this.f39945a.translate(f12, 0.0f, 0.0f);
            this.f39945a.rotateY(i11);
            this.f39945a.translate(f12, 0.0f, 0.0f);
            return;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            this.f39945a.rotateY(0.0f);
        } else {
            float f13 = (-i10) / 2;
            this.f39945a.translate(f13, 0.0f, 0.0f);
            this.f39945a.rotateY(-i11);
            this.f39945a.translate(f13, 0.0f, 0.0f);
        }
    }

    private void b(int i10) {
        int iC;
        this.f39952h = i10;
        if (Math.abs(this.f39951g) > this.f39949e / 2) {
            iC = c(2);
        } else {
            iC = c(3);
        }
        if (this.f39954j != iC) {
            this.f39954j = iC;
        }
    }
}
