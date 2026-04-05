package hj;

import android.R;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f0 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final int f58946b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58947c;

    /* renamed from: e, reason: collision with root package name */
    public final int f58948e;

    /* renamed from: f, reason: collision with root package name */
    public final long f58949f;

    /* renamed from: g, reason: collision with root package name */
    public final View f58950g;

    /* renamed from: h, reason: collision with root package name */
    public final e0 f58951h;

    /* renamed from: i, reason: collision with root package name */
    public int f58952i = 1;

    /* renamed from: j, reason: collision with root package name */
    public float f58953j;

    /* renamed from: k, reason: collision with root package name */
    public float f58954k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f58955l;

    /* renamed from: m, reason: collision with root package name */
    public int f58956m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f58957n;

    /* renamed from: o, reason: collision with root package name */
    public VelocityTracker f58958o;

    /* renamed from: p, reason: collision with root package name */
    public float f58959p;

    public f0(View view, Object obj, e0 e0Var) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f58946b = viewConfiguration.getScaledTouchSlop();
        this.f58947c = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f58948e = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f58949f = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f58950g = view;
        this.f58957n = obj;
        this.f58951h = e0Var;
    }

    public final void a(float f10, float f11, a0 a0Var) {
        float fB = b();
        float f12 = f10 - fB;
        float alpha = this.f58950g.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.f58949f);
        valueAnimatorOfFloat.addUpdateListener(new b0(this, fB, f12, alpha, f11 - alpha));
        if (a0Var != null) {
            valueAnimatorOfFloat.addListener(a0Var);
        }
        valueAnimatorOfFloat.start();
    }

    public float b() {
        return this.f58950g.getTranslationX();
    }

    public void c(float f10) {
        this.f58950g.setTranslationX(f10);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        motionEvent.offsetLocation(this.f58959p, 0.0f);
        int i10 = this.f58952i;
        View view2 = this.f58950g;
        if (i10 < 2) {
            this.f58952i = view2.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker = this.f58958o;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.f58953j;
                        float rawY = motionEvent.getRawY() - this.f58954k;
                        float fAbs = Math.abs(rawX);
                        int i11 = this.f58946b;
                        if (fAbs > i11 && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                            this.f58955l = true;
                            if (rawX <= 0.0f) {
                                i11 = -i11;
                            }
                            this.f58956m = i11;
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                            motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            view2.onTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                        }
                        if (this.f58955l) {
                            this.f58959p = rawX;
                            c(rawX - this.f58956m);
                            view2.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.f58952i))));
                            return true;
                        }
                    }
                } else if (actionMasked == 3 && this.f58958o != null) {
                    a(0.0f, 1.0f, null);
                    this.f58958o.recycle();
                    this.f58958o = null;
                    this.f58959p = 0.0f;
                    this.f58953j = 0.0f;
                    this.f58954k = 0.0f;
                    this.f58955l = false;
                    return false;
                }
            } else if (this.f58958o != null) {
                float rawX2 = motionEvent.getRawX() - this.f58953j;
                this.f58958o.addMovement(motionEvent);
                this.f58958o.computeCurrentVelocity(1000);
                float xVelocity = this.f58958o.getXVelocity();
                float fAbs2 = Math.abs(xVelocity);
                float fAbs3 = Math.abs(this.f58958o.getYVelocity());
                if (Math.abs(rawX2) > this.f58952i / 2 && this.f58955l) {
                    z10 = rawX2 > 0.0f;
                } else if (this.f58947c > fAbs2 || fAbs2 > this.f58948e || fAbs3 >= fAbs2 || fAbs3 >= fAbs2 || !this.f58955l) {
                    z10 = false;
                    z = false;
                } else {
                    z = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                    z10 = this.f58958o.getXVelocity() > 0.0f;
                }
                if (z) {
                    a(z10 ? this.f58952i : -this.f58952i, 0.0f, new a0(this));
                } else if (this.f58955l) {
                    a(0.0f, 1.0f, null);
                }
                VelocityTracker velocityTracker2 = this.f58958o;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                this.f58958o = null;
                this.f58959p = 0.0f;
                this.f58953j = 0.0f;
                this.f58954k = 0.0f;
                this.f58955l = false;
                return false;
            }
        } else {
            this.f58953j = motionEvent.getRawX();
            this.f58954k = motionEvent.getRawY();
            if (((l) this.f58951h).canDismiss(this.f58957n)) {
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.f58958o = velocityTrackerObtain;
                velocityTrackerObtain.addMovement(motionEvent);
            }
        }
        return false;
    }
}
