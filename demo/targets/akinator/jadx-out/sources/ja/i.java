package ja;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import com.digidust.elokence.akinator.graphic.vote.SwipeDeck;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public float f69210b;

    /* renamed from: c, reason: collision with root package name */
    public float f69211c;

    /* renamed from: e, reason: collision with root package name */
    public float f69212e;

    /* renamed from: f, reason: collision with root package name */
    public float f69213f;

    /* renamed from: g, reason: collision with root package name */
    public int f69214g;

    /* renamed from: h, reason: collision with root package name */
    public float f69215h;

    /* renamed from: i, reason: collision with root package name */
    public float f69216i;

    /* renamed from: j, reason: collision with root package name */
    public ViewGroup f69217j;

    /* renamed from: k, reason: collision with root package name */
    public int f69218k;

    /* renamed from: l, reason: collision with root package name */
    public View f69219l;

    /* renamed from: m, reason: collision with root package name */
    public b f69220m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f69221n;

    /* renamed from: o, reason: collision with root package name */
    public View f69222o;

    /* renamed from: p, reason: collision with root package name */
    public View f69223p;

    /* renamed from: q, reason: collision with root package name */
    public View f69224q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f69225r;

    public final ViewPropertyAnimator a(int i10) {
        return this.f69219l.animate().setDuration(i10).x(-(this.f69217j.getWidth() * 2)).y(0.0f).rotation(-30.0f);
    }

    public final ViewPropertyAnimator b(int i10) {
        return this.f69219l.animate().setDuration(i10).x(this.f69217j.getWidth() * 2).y(0.0f).rotation(30.0f);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f10 = this.f69211c;
        float f11 = this.f69212e;
        b bVar = this.f69220m;
        ViewGroup viewGroup = this.f69217j;
        View view2 = this.f69219l;
        if (!this.f69221n) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f69225r = true;
                view.clearAnimation();
                this.f69214g = motionEvent.getPointerId(0);
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (motionEvent.findPointerIndex(this.f69214g) == 0) {
                    bVar.cardActionDown();
                }
                this.f69215h = x10;
                this.f69216i = y10;
                return true;
            }
            if (action == 1) {
                if (view2.getX() + (view2.getWidth() / 2) < viewGroup.getWidth() / 4.0f) {
                    int i10 = SwipeDeck.f21797t;
                    a(300).setListener(new f(this));
                    bVar.cardSwipedLeft();
                    this.f69221n = true;
                } else if (view2.getX() + (view2.getWidth() / 2) > (viewGroup.getWidth() / 4.0f) * 3.0f) {
                    int i11 = SwipeDeck.f21797t;
                    b(300).setListener(new g(this));
                    bVar.cardSwipedRight();
                    this.f69221n = true;
                } else {
                    View view3 = this.f69222o;
                    if (view3 != null) {
                        view3.setAlpha(0.0f);
                    }
                    View view4 = this.f69223p;
                    if (view4 != null) {
                        view4.setAlpha(0.0f);
                    }
                    View view5 = this.f69224q;
                    if (view5 != null) {
                        view5.setAlpha(0.0f);
                    }
                    view2.animate().setDuration(200L).setInterpolator(new OvershootInterpolator(1.5f)).x(f11).y(this.f69213f).rotation(0.0f);
                }
                if (motionEvent.findPointerIndex(this.f69214g) == 0) {
                    bVar.cardActionUp();
                }
                if (this.f69225r) {
                    view.performClick();
                }
            } else if (action == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f69214g);
                if (iFindPointerIndex >= 0 && iFindPointerIndex <= 0) {
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float f12 = this.f69215h;
                    float f13 = x11 - f12;
                    float f14 = this.f69216i;
                    float f15 = y11 - f14;
                    if (((int) f12) != 0 || ((int) f14) != 0) {
                        float x12 = view2.getX() + f13;
                        float y12 = view2.getY() + f15;
                        if (Math.abs(f13 + f15) > 5.0f) {
                            this.f69225r = false;
                        }
                        if (bVar.isDragEnabled()) {
                            view2.setX(x12);
                            view2.setY(y12);
                            view2.setRotation(((this.f69210b * 2.0f) * (x12 - f11)) / viewGroup.getWidth());
                            if (this.f69222o != null && this.f69223p != null) {
                                float width = (x12 - this.f69218k) / (viewGroup.getWidth() * f10);
                                this.f69222o.setAlpha(width);
                                this.f69223p.setAlpha(-width);
                            }
                            if (this.f69224q != null) {
                                this.f69224q.setAlpha((y12 - viewGroup.getPaddingTop()) / (viewGroup.getHeight() * f10));
                                return true;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
