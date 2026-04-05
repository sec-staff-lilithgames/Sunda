package com.google.android.material.timepicker;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.Iterator;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class ClockHandView extends View {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f29541s = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f29542b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f29543c;

    /* renamed from: e, reason: collision with root package name */
    public final ValueAnimator f29544e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29545f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29546g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f29547h;

    /* renamed from: i, reason: collision with root package name */
    public final int f29548i;

    /* renamed from: j, reason: collision with root package name */
    public final float f29549j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f29550k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f29551l;

    /* renamed from: m, reason: collision with root package name */
    public final int f29552m;

    /* renamed from: n, reason: collision with root package name */
    public float f29553n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29554o;

    /* renamed from: p, reason: collision with root package name */
    public double f29555p;

    /* renamed from: q, reason: collision with root package name */
    public int f29556q;

    /* renamed from: r, reason: collision with root package name */
    public int f29557r;

    public ClockHandView(Context context) {
        this(context, null);
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(this.f29556q * 0.66f) : this.f29556q;
    }

    public void addOnRotateListener(g gVar) {
        this.f29547h.add(gVar);
    }

    public final void b(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f29553n = f11;
        this.f29555p = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f29557r);
        float fCos = (((float) Math.cos(this.f29555p)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f29555p))) + height;
        float f12 = this.f29548i;
        this.f29551l.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        Iterator it = this.f29547h.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onRotate(f11, z10);
        }
        invalidate();
    }

    public RectF getCurrentSelectorBox() {
        return this.f29551l;
    }

    public float getHandRotation() {
        return this.f29553n;
    }

    public int getSelectorRadius() {
        return this.f29548i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fA = a(this.f29557r);
        float fCos = (((float) Math.cos(this.f29555p)) * fA) + f10;
        float f11 = height;
        float fSin = (fA * ((float) Math.sin(this.f29555p))) + f11;
        Paint paint = this.f29550k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f29548i, paint);
        double dSin = Math.sin(this.f29555p);
        paint.setStrokeWidth(this.f29552m);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f29555p) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f10, f11, this.f29549j, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f29544e.isRunning()) {
            return;
        }
        setHandRotation(getHandRotation());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked == 0) {
            this.f29554o = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z12 = this.f29554o;
            z11 = actionMasked == 1;
            if (this.f29546g) {
                this.f29557r = rg.a.dist((float) (getWidth() / 2), (float) (getHeight() / 2), x10, y10) <= ((float) a(2)) + t0.dpToPx(getContext(), 12) ? 2 : 1;
            }
            z10 = false;
        } else {
            z11 = false;
            z12 = false;
            z10 = false;
        }
        boolean z14 = this.f29554o;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f10 = i10;
        boolean z15 = getHandRotation() != f10;
        if (z10 && z15) {
            z13 = true;
        } else if (z15 || z12) {
            if (z11 && this.f29545f) {
                z13 = true;
            }
            setHandRotation(f10, z13);
            z13 = true;
        }
        this.f29554o = z14 | z13;
        return true;
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.f29545f = z10;
    }

    public void setCircleRadius(int i10) {
        this.f29556q = i10;
        invalidate();
    }

    public void setHandRotation(float f10) {
        setHandRotation(f10, false);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public void setHandRotation(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f29544e;
        valueAnimator.cancel();
        if (!z10) {
            b(f10, false);
            return;
        }
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f10) > 180.0f) {
            if (handRotation > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (handRotation < 180.0f && f10 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(handRotation), Float.valueOf(f10));
        valueAnimator.setFloatValues(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        valueAnimator.setDuration(this.f29542b);
        valueAnimator.setInterpolator(this.f29543c);
        valueAnimator.start();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f29544e = valueAnimator;
        this.f29547h = new ArrayList();
        Paint paint = new Paint();
        this.f29550k = paint;
        this.f29551l = new RectF();
        this.f29557r = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.f88462j, i10, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f29542b = sg.o.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.f29543c = sg.o.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, vf.a.f89241b);
        this.f29556q = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f29548i = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f29552m = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f29549j = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i11 = ClockHandView.f29541s;
                ClockHandView clockHandView = this.f29574a;
                clockHandView.getClass();
                clockHandView.b(((Float) valueAnimator2.getAnimatedValue()).floatValue(), true);
            }
        });
        valueAnimator.addListener(new e());
    }

    public void setOnActionUpListener(f fVar) {
    }
}
