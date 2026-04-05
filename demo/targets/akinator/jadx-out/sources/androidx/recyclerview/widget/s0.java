package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.InterfaceC3129ae;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends RecyclerView.e implements j2 {
    public static final int[] D = {R.attr.state_pressed};
    public static final int[] E = new int[0];
    public int A;
    public final o0 B;
    public final p0 C;

    /* renamed from: a, reason: collision with root package name */
    public final int f7240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7241b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f7242c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f7243d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7244e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7245f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f7246g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f7247h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7248i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7249j;

    /* renamed from: k, reason: collision with root package name */
    public int f7250k;

    /* renamed from: l, reason: collision with root package name */
    public int f7251l;

    /* renamed from: m, reason: collision with root package name */
    public float f7252m;

    /* renamed from: n, reason: collision with root package name */
    public int f7253n;

    /* renamed from: o, reason: collision with root package name */
    public int f7254o;

    /* renamed from: p, reason: collision with root package name */
    public float f7255p;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f7258s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f7265z;

    /* renamed from: q, reason: collision with root package name */
    public int f7256q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f7257r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7259t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7260u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f7261v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f7262w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f7263x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f7264y = new int[2];

    public s0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7265z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new o0(this);
        this.C = new p0(this);
        this.f7242c = stateListDrawable;
        this.f7243d = drawable;
        this.f7246g = stateListDrawable2;
        this.f7247h = drawable2;
        this.f7244e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f7245f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f7248i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f7249j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f7240a = i11;
        this.f7241b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new q0(this));
        valueAnimatorOfFloat.addUpdateListener(new r0(this));
        attachToRecyclerView(recyclerView);
    }

    public static int c(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f11 - f10) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    public final boolean a(float f10, float f11) {
        if (f11 < this.f7257r - this.f7248i) {
            return false;
        }
        int i10 = this.f7254o;
        int i11 = this.f7253n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7258s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        p0 p0Var = this.C;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f7258s.removeOnItemTouchListener(this);
            this.f7258s.removeOnScrollListener(p0Var);
            this.f7258s.removeCallbacks(this.B);
        }
        this.f7258s = recyclerView;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(this);
            this.f7258s.addOnItemTouchListener(this);
            this.f7258s.addOnScrollListener(p0Var);
        }
    }

    public final boolean b(float f10, float f11) {
        int layoutDirection = this.f7258s.getLayoutDirection();
        int i10 = this.f7244e;
        if (layoutDirection == 1) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f7256q - i10) {
            return false;
        }
        int i11 = this.f7251l;
        int i12 = this.f7250k / 2;
        return f11 >= ((float) (i11 - i12)) && f11 <= ((float) (i12 + i11));
    }

    public final void d(int i10) {
        o0 o0Var = this.B;
        StateListDrawable stateListDrawable = this.f7242c;
        if (i10 == 2 && this.f7261v != 2) {
            stateListDrawable.setState(D);
            this.f7258s.removeCallbacks(o0Var);
        }
        if (i10 == 0) {
            this.f7258s.invalidate();
        } else {
            show();
        }
        if (this.f7261v == 2 && i10 != 2) {
            stateListDrawable.setState(E);
            this.f7258s.removeCallbacks(o0Var);
            this.f7258s.postDelayed(o0Var, InterfaceC3129ae.c.f35991d);
        } else if (i10 == 1) {
            this.f7258s.removeCallbacks(o0Var);
            this.f7258s.postDelayed(o0Var, 1500);
        }
        this.f7261v = i10;
    }

    public boolean isDragging() {
        return this.f7261v == 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.l lVar) {
        if (this.f7256q != this.f7258s.getWidth() || this.f7257r != this.f7258s.getHeight()) {
            this.f7256q = this.f7258s.getWidth();
            this.f7257r = this.f7258s.getHeight();
            d(0);
            return;
        }
        if (this.A != 0) {
            if (this.f7259t) {
                int i10 = this.f7256q;
                int i11 = this.f7244e;
                int i12 = i10 - i11;
                int i13 = this.f7251l;
                int i14 = this.f7250k;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable = this.f7242c;
                stateListDrawable.setBounds(0, 0, i11, i14);
                int i16 = this.f7245f;
                int i17 = this.f7257r;
                Drawable drawable = this.f7243d;
                drawable.setBounds(0, 0, i16, i17);
                if (this.f7258s.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i11, i15);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i11, -i15);
                } else {
                    canvas.translate(i12, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i15);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i12, -i15);
                }
            }
            if (this.f7260u) {
                int i18 = this.f7257r;
                int i19 = this.f7248i;
                int i20 = i18 - i19;
                int i21 = this.f7254o;
                int i22 = this.f7253n;
                int i23 = i21 - (i22 / 2);
                StateListDrawable stateListDrawable2 = this.f7246g;
                stateListDrawable2.setBounds(0, 0, i22, i19);
                int i24 = this.f7256q;
                int i25 = this.f7249j;
                Drawable drawable2 = this.f7247h;
                drawable2.setBounds(0, 0, i24, i25);
                canvas.translate(0.0f, i20);
                drawable2.draw(canvas);
                canvas.translate(i23, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i23, -i20);
            }
        }
    }

    @Override // androidx.recyclerview.widget.j2
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.f7261v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zB = b(motionEvent.getX(), motionEvent.getY());
        boolean zA = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zB && !zA) {
            return false;
        }
        if (zA) {
            this.f7262w = 1;
            this.f7255p = (int) motionEvent.getX();
        } else if (zB) {
            this.f7262w = 2;
            this.f7252m = (int) motionEvent.getY();
        }
        d(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.j2
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f7261v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            boolean zA = a(motionEvent.getX(), motionEvent.getY());
            if (zB || zA) {
                if (zA) {
                    this.f7262w = 1;
                    this.f7255p = (int) motionEvent.getX();
                } else if (zB) {
                    this.f7262w = 2;
                    this.f7252m = (int) motionEvent.getY();
                }
                d(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f7261v == 2) {
            this.f7252m = 0.0f;
            this.f7255p = 0.0f;
            d(1);
            this.f7262w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f7261v == 2) {
            show();
            int i10 = this.f7262w;
            int i11 = this.f7241b;
            if (i10 == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.f7264y;
                iArr[0] = i11;
                int i12 = this.f7256q - i11;
                iArr[1] = i12;
                float fMax = Math.max(i11, Math.min(i12, x10));
                if (Math.abs(this.f7254o - fMax) >= 2.0f) {
                    int iC = c(this.f7255p, fMax, iArr, this.f7258s.computeHorizontalScrollRange(), this.f7258s.computeHorizontalScrollOffset(), this.f7256q);
                    if (iC != 0) {
                        this.f7258s.scrollBy(iC, 0);
                    }
                    this.f7255p = fMax;
                }
            }
            if (this.f7262w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f7263x;
                iArr2[0] = i11;
                int i13 = this.f7257r - i11;
                iArr2[1] = i13;
                float fMax2 = Math.max(i11, Math.min(i13, y10));
                if (Math.abs(this.f7251l - fMax2) < 2.0f) {
                    return;
                }
                int iC2 = c(this.f7252m, fMax2, iArr2, this.f7258s.computeVerticalScrollRange(), this.f7258s.computeVerticalScrollOffset(), this.f7257r);
                if (iC2 != 0) {
                    this.f7258s.scrollBy(0, iC2);
                }
                this.f7252m = fMax2;
            }
        }
    }

    public void show() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f7265z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.j2
    public void onRequestDisallowInterceptTouchEvent(boolean z10) {
    }
}
