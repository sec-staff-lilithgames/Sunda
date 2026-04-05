package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ProgressBar extends View {

    /* renamed from: a, reason: collision with root package name */
    Runnable f41229a;

    /* renamed from: b, reason: collision with root package name */
    private float f41230b;

    /* renamed from: c, reason: collision with root package name */
    private float f41231c;

    /* renamed from: d, reason: collision with root package name */
    private float f41232d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f41233e;

    /* renamed from: f, reason: collision with root package name */
    private float f41234f;

    /* renamed from: g, reason: collision with root package name */
    private long f41235g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f41236h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f41237i;

    /* renamed from: j, reason: collision with root package name */
    private int f41238j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f41239k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41240l;

    /* renamed from: m, reason: collision with root package name */
    private long f41241m;

    /* renamed from: n, reason: collision with root package name */
    private float f41242n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f41243o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f41244p;

    /* renamed from: q, reason: collision with root package name */
    private Rect f41245q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f41246r;

    /* renamed from: s, reason: collision with root package name */
    private float f41247s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f41248t;

    /* renamed from: u, reason: collision with root package name */
    private int f41249u;

    /* renamed from: v, reason: collision with root package name */
    private int f41250v;

    /* renamed from: w, reason: collision with root package name */
    private int f41251w;

    /* renamed from: x, reason: collision with root package name */
    private long f41252x;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f41229a = new a();
        this.f41235g = 25L;
        this.f41236h = new Handler(Looper.getMainLooper());
        this.f41239k = false;
        this.f41242n = 0.95f;
        this.f41243o = false;
        this.f41245q = new Rect();
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
    }

    private float getVelocity() {
        if (this.f41248t) {
            return this.f41240l ? 1.0f : 0.4f;
        }
        if (this.f41252x < 2000) {
            if (this.f41250v == 1) {
                return this.f41240l ? 1.0f : 0.4f;
            }
            if (this.f41249u == 1) {
                return this.f41240l ? 0.4f : 0.2f;
            }
            if (this.f41240l) {
                return 0.2f;
            }
        }
        return 0.05f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f41239k) {
            this.f41239k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f41243o ? 0L : jCurrentTimeMillis - this.f41241m;
        this.f41232d = Math.abs(j10 / 1000.0f);
        this.f41241m = jCurrentTimeMillis;
        this.f41252x += j10;
        float velocity = getVelocity();
        this.f41231c = velocity;
        float f10 = (velocity * this.f41232d) + this.f41230b;
        this.f41230b = f10;
        if (!this.f41248t) {
            float f11 = this.f41242n;
            if (f10 > f11) {
                this.f41230b = f11;
            }
        }
        this.f41245q.right = (int) (this.f41230b * this.f41247s);
        this.f41236h.removeCallbacksAndMessages(null);
        this.f41236h.postDelayed(this.f41229a, this.f41235g);
        super.draw(canvas);
        a(canvas, this.f41232d);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z10) {
        return null;
    }

    public float getProgress() {
        return this.f41230b;
    }

    public void initResource(boolean z10) throws Resources.NotFoundException {
        if (z10 || (this.f41237i == null && this.f41244p == null && this.f41246r == null && this.f41233e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
            this.f41237i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f41237i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
            this.f41244p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f41244p.getIntrinsicHeight());
            }
            this.f41246r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
            this.f41233e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f41247s = getMeasuredWidth();
    }

    public void onThemeChange() throws Resources.NotFoundException {
        if (this.f41239k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Drawable drawable = this.f41237i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f41244p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z10) {
        this.f41243o = z10;
        if (z10) {
            return;
        }
        this.f41241m = System.currentTimeMillis();
    }

    public void setProgress(float f10, boolean z10) {
        if (!z10 || f10 < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressState(int i10) {
        if (i10 == 5) {
            this.f41249u = 1;
            this.f41250v = 0;
            this.f41251w = 0;
            this.f41252x = 0L;
            return;
        }
        if (i10 == 6) {
            this.f41250v = 1;
            if (this.f41251w == 1) {
                startEndAnimation();
            }
            this.f41252x = 0L;
            return;
        }
        if (i10 == 7) {
            startEndAnimation();
        } else {
            if (i10 != 8) {
                return;
            }
            this.f41251w = 1;
            if (this.f41250v == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void setVisible(boolean z10) {
        if (!z10) {
            setVisibility(4);
            return;
        }
        this.f41240l = true;
        this.f41241m = System.currentTimeMillis();
        this.f41232d = 0.0f;
        this.f41252x = 0L;
        this.f41248t = false;
        this.f41234f = 0.0f;
        this.f41230b = 0.0f;
        this.f41247s = getMeasuredWidth();
        this.f41243o = false;
        this.f41249u = 0;
        this.f41250v = 0;
        this.f41251w = 0;
        Drawable drawable = this.f41237i;
        if (drawable != null) {
            this.f41238j = -drawable.getIntrinsicWidth();
        } else {
            this.f41238j = 0;
        }
        Drawable drawable2 = this.f41246r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f41233e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f41244p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f41248t) {
            return;
        }
        this.f41248t = true;
        this.f41234f = 0.0f;
    }

    private void a(Canvas canvas, float f10) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f41248t) {
            float f11 = this.f41234f;
            float f12 = this.f41247s * 0.5f;
            int i10 = (int) ((1.0f - (f11 / f12)) * 255.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (f11 > f12) {
                setVisible(false);
            }
            Drawable drawable3 = this.f41246r;
            if (drawable3 != null) {
                drawable3.setAlpha(i10);
            }
            Drawable drawable4 = this.f41233e;
            if (drawable4 != null) {
                drawable4.setAlpha(i10);
            }
            Drawable drawable5 = this.f41244p;
            if (drawable5 != null) {
                drawable5.setAlpha(i10);
            }
            canvas.save();
            canvas.translate(this.f41234f, 0.0f);
        }
        if (this.f41246r != null && this.f41244p != null) {
            Drawable drawable6 = this.f41246r;
            drawable6.setBounds(0, 0, (int) (this.f41245q.width() - (this.f41244p.getIntrinsicWidth() * 0.05f)), drawable6.getIntrinsicHeight());
            this.f41246r.draw(canvas);
        }
        if (this.f41248t && (drawable2 = this.f41233e) != null && this.f41244p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f41233e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f41233e.draw(canvas);
            canvas.restore();
        }
        if (this.f41244p != null) {
            canvas.save();
            canvas.translate(this.f41245q.width() - getWidth(), 0.0f);
            this.f41244p.draw(canvas);
            canvas.restore();
        }
        if (!this.f41248t && Math.abs(this.f41230b - this.f41242n) < 1.0E-5f && (drawable = this.f41237i) != null) {
            int i11 = (int) ((f10 * 0.2f * this.f41247s) + this.f41238j);
            this.f41238j = i11;
            if (drawable.getIntrinsicWidth() + i11 >= this.f41245q.width()) {
                this.f41238j = -this.f41237i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f41238j, 0.0f);
            this.f41237i.draw(canvas);
            canvas.restore();
        }
        if (this.f41248t) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41229a = new a();
        this.f41235g = 25L;
        this.f41236h = new Handler(Looper.getMainLooper());
        this.f41239k = false;
        this.f41242n = 0.95f;
        this.f41243o = false;
        this.f41245q = new Rect();
        a(context);
    }

    public void setProgressBarListener(c cVar) {
    }
}
