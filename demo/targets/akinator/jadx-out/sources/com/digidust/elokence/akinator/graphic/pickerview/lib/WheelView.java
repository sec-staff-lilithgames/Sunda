package com.digidust.elokence.akinator.graphic.pickerview.lib;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import fa.a;
import ga.b;
import ga.c;
import ga.d;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class WheelView extends View {

    /* renamed from: b, reason: collision with root package name */
    public final Context f21769b;

    /* renamed from: c, reason: collision with root package name */
    public final c f21770c;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f21771e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f21772f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f21773g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f21774h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f21775i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f21776j;

    /* renamed from: k, reason: collision with root package name */
    public int f21777k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21778l;

    /* renamed from: m, reason: collision with root package name */
    public int f21779m;

    /* renamed from: n, reason: collision with root package name */
    public int f21780n;

    /* renamed from: o, reason: collision with root package name */
    public final int f21781o;

    /* renamed from: p, reason: collision with root package name */
    public int f21782p;

    /* renamed from: q, reason: collision with root package name */
    public float f21783q;

    /* renamed from: r, reason: collision with root package name */
    public long f21784r;

    public WheelView(Context context) {
        this(context, null);
    }

    public final void a(int i10) {
        cancelFuture();
        if (i10 == 2 || i10 == 3) {
            int i11 = (int) (((this.f21779m % 0.0f) + 0.0f) % 0.0f);
            this.f21782p = i11;
            float f10 = i11;
            if (f10 > 0.0f) {
                this.f21782p = (int) (0.0f - f10);
            } else {
                this.f21782p = -i11;
            }
        }
        this.f21773g = this.f21772f.scheduleWithFixedDelay(new d(this, this.f21782p), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public void cancelFuture() {
        ScheduledFuture scheduledFuture = this.f21773g;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.f21773g.cancel(true);
        this.f21773g = null;
    }

    public final int getCurrentItem() {
        return 0;
    }

    public int getItemsCount() {
        return 0;
    }

    public int getTextWidth(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        paint.getTextWidths(str, new float[length]);
        int iCeil = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iCeil += (int) Math.ceil(r2[i10]);
        }
        return iCeil;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.f21771e.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21784r = System.currentTimeMillis();
            cancelFuture();
            this.f21783q = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.f21783q - motionEvent.getRawY();
            this.f21783q = motionEvent.getRawY();
            this.f21779m = (int) (this.f21779m + rawY);
            if (!this.f21778l) {
                throw null;
            }
        } else if (!zOnTouchEvent) {
            float f10 = 0;
            double dAcos = Math.acos((f10 - motionEvent.getY()) / f10) * 0;
            double d10 = 0.0f;
            this.f21782p = (int) (((((int) ((dAcos + d10) / d10)) - (this.f21781o / 2)) * 0.0f) - (((this.f21779m % 0.0f) + 0.0f) % 0.0f));
            if (System.currentTimeMillis() - this.f21784r > 120) {
                a(3);
            } else {
                a(1);
            }
        }
        invalidate();
        return true;
    }

    public final void setAdapter(a aVar) {
        invalidate();
    }

    public final void setCurrentItem(int i10) {
        this.f21780n = i10;
        this.f21779m = 0;
        invalidate();
    }

    public final void setCyclic(boolean z10) {
        this.f21778l = z10;
    }

    public final void setTextSize(float f10) {
        if (f10 > 0.0f) {
            int i10 = (int) (this.f21769b.getResources().getDisplayMetrics().density * f10);
            this.f21777k = i10;
            this.f21774h.setTextSize(i10);
            this.f21775i.setTextSize(this.f21777k);
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f21772f = Executors.newSingleThreadScheduledExecutor();
        this.f21781o = 11;
        this.f21782p = 0;
        this.f21783q = 0.0f;
        this.f21784r = 0L;
        int color = getResources().getColor(R.color.black_color);
        int color2 = getResources().getColor(R.color.red_color);
        int color3 = getResources().getColor(R.color.black_color);
        this.f21777k = getResources().getDimensionPixelSize(R.dimen.gen_button_text_size);
        this.f21769b = context;
        this.f21770c = new c(this);
        GestureDetector gestureDetector = new GestureDetector(context, new b(this));
        this.f21771e = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f21778l = true;
        this.f21779m = 0;
        this.f21780n = -1;
        Paint paint = new Paint();
        this.f21774h = paint;
        paint.setColor(color);
        this.f21774h.setAntiAlias(true);
        Paint paint2 = this.f21774h;
        Typeface typeface = Typeface.MONOSPACE;
        paint2.setTypeface(typeface);
        this.f21774h.setTextSize(this.f21777k);
        this.f21774h.setTypeface(AkApplication.getTypeFace());
        Paint paint3 = new Paint();
        this.f21775i = paint3;
        paint3.setColor(color2);
        this.f21775i.setAntiAlias(true);
        this.f21775i.setTextScaleX(1.1f);
        this.f21775i.setTypeface(typeface);
        this.f21775i.setTextSize(this.f21777k);
        this.f21775i.setTypeface(AkApplication.getTypeFace());
        Paint paint4 = new Paint();
        this.f21776j = paint4;
        paint4.setColor(color3);
        this.f21776j.setAntiAlias(true);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void setGravity(int i10) {
    }

    public void setLabel(String str) {
    }
}
