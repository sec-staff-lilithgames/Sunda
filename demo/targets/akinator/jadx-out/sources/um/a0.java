package um;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f88537a;

    /* renamed from: b, reason: collision with root package name */
    public final x f88538b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88539c;

    /* renamed from: d, reason: collision with root package name */
    public float f88540d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public long f88541e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f88542f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final y f88543g;

    /* renamed from: h, reason: collision with root package name */
    public final z f88544h;

    public a0(View view, x xVar) {
        this.f88539c = false;
        y yVar = new y(this);
        this.f88543g = yVar;
        this.f88544h = new z(this);
        this.f88537a = view;
        this.f88538b = xVar;
        view.getViewTreeObserver().addOnGlobalLayoutListener(yVar);
        boolean zIsShown = view.isShown();
        if (this.f88539c == zIsShown) {
            return;
        }
        this.f88539c = zIsShown;
        if (!zIsShown) {
            stop();
        } else if (isTicking()) {
            start();
        }
    }

    public void detach() {
        stop();
        this.f88537a.getViewTreeObserver().removeGlobalOnLayoutListener(this.f88543g);
    }

    public boolean isTicking() {
        long j10 = this.f88541e;
        return j10 != 0 && this.f88542f < j10;
    }

    public void setTime(float f10) {
        if (this.f88540d == f10) {
            return;
        }
        this.f88540d = f10;
        this.f88541e = (long) (f10 * 1000.0f);
        start();
    }

    public void start() {
        View view = this.f88537a;
        if (!view.isShown() || this.f88541e == 0) {
            return;
        }
        view.postDelayed(this.f88544h, 16L);
    }

    public void stop() {
        this.f88537a.removeCallbacks(this.f88544h);
    }
}
