package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.zz.cm.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au extends ImageView {

    /* renamed from: au, reason: collision with root package name */
    private boolean f18411au;

    /* renamed from: cm, reason: collision with root package name */
    private AnimatedImageDrawable f18412cm;

    /* renamed from: if, reason: not valid java name */
    private volatile boolean f57if;

    /* renamed from: jd, reason: collision with root package name */
    private long f18413jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f18414jj;
    private Movie jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f18415ju;
    private boolean my;
    private boolean oya;

    /* renamed from: qk, reason: collision with root package name */
    private float f18416qk;
    private int wqx;
    private float xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f18417yd;
    private float zz;

    public au(Context context) {
        super(context);
        this.my = Build.VERSION.SDK_INT >= 28;
        this.f18414jj = false;
        this.f18411au = true;
        this.oya = true;
        jpo();
    }

    private void jd() {
        if (this.jpo == null || this.my || !this.f18411au) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && a.d(drawable)) {
            AnimatedImageDrawable animatedImageDrawableB = a.b(drawable);
            this.f18412cm = animatedImageDrawableB;
            if (!this.f57if) {
                animatedImageDrawableB.start();
            }
            if (!this.oya) {
                animatedImageDrawableB.setRepeatCount(0);
            }
        }
        jd();
    }

    private void wqx() {
        if (this.jpo == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f18413jd == 0) {
            this.f18413jd = jUptimeMillis;
        }
        int iDuration = this.jpo.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (this.oya || Math.abs(iDuration - this.wqx) >= 60) {
            this.wqx = (int) ((jUptimeMillis - this.f18413jd) % iDuration);
        } else {
            this.wqx = iDuration;
            this.f57if = true;
        }
    }

    public void jpo() {
        if (this.my) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.jpo == null || this.my) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.f57if) {
                jpo(canvas);
                return;
            }
            wqx();
            jpo(canvas);
            jd();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.jpo != null && !this.my) {
            this.f18416qk = (getWidth() - this.f18417yd) / 2.0f;
            this.xyk = (getHeight() - this.f18415ju) / 2.0f;
        }
        this.f18411au = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (this.my || (movie = this.jpo) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.jpo.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i10) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i10))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i11) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i11))) ? 1.0f : iHeight / size);
        this.zz = fMax;
        int i12 = (int) (iWidth * fMax);
        this.f18417yd = i12;
        int i13 = (int) (iHeight * fMax);
        this.f18415ju = i13;
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.jpo != null) {
            this.f18411au = i10 == 1;
            jd();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.jpo != null) {
            this.f18411au = i10 == 0;
            jd();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.jpo != null) {
            this.f18411au = i10 == 0;
            jd();
        }
    }

    public void setRepeatConfig(boolean z10) {
        AnimatedImageDrawable animatedImageDrawable;
        this.oya = z10;
        if (z10) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.f18412cm) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception unused) {
        }
    }

    private void jpo(Canvas canvas) {
        Movie movie = this.jpo;
        if (movie == null) {
            return;
        }
        movie.setTime(this.wqx);
        float f10 = this.zz;
        if (f10 == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.jpo.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.jpo;
            float f11 = this.f18416qk;
            float f12 = this.zz;
            movie2.draw(canvas, f11 / f12, this.xyk / f12);
        }
        canvas.restore();
    }
}
