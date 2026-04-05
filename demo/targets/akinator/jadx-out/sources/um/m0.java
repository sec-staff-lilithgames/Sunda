package um;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88602a;

    /* renamed from: b, reason: collision with root package name */
    public final View f88603b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f88604c;

    /* renamed from: d, reason: collision with root package name */
    public final float f88605d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f88606e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f88607f;

    /* renamed from: g, reason: collision with root package name */
    public final j0 f88608g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f88609h;

    /* renamed from: i, reason: collision with root package name */
    public l0 f88610i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f88611j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f88612k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f88613l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f88614m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f88615n;

    public m0(Context context, View view, i0 i0Var) {
        this(context, view, i0Var, 0.1f);
    }

    public final void a() {
        Rect rect = this.f88607f;
        Rect rect2 = this.f88606e;
        View view = this.f88603b;
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (view.getVisibility() != 0) {
            b("Visibility != View.VISIBLE");
            return;
        }
        if (view.getParent() == null) {
            b("No parent");
            return;
        }
        if (!view.getGlobalVisibleRect(rect2)) {
            b("Can't get global visible rect");
            return;
        }
        if (h0.isViewTransparent(view)) {
            b("View is transparent (alpha = 0)");
            return;
        }
        float width = view.getWidth() * view.getHeight();
        if (width <= 0.0f) {
            b("Ad View width or height is zero, show wasn't tracked");
            return;
        }
        float fWidth = (rect2.width() * rect2.height()) / width;
        if (fWidth < this.f88605d) {
            b("Ad View is not completely visible (" + fWidth + "), show wasn't tracked");
            return;
        }
        View topmostView = tm.d0.getTopmostView(this.f88602a, view);
        if (topmostView == null) {
            b("Can't obtain root view");
            return;
        }
        topmostView.getGlobalVisibleRect(rect);
        if (!Rect.intersects(rect2, rect)) {
            b("Ad View is out of current window, show wasn't tracked");
            return;
        }
        this.f88612k = false;
        if (!this.f88611j) {
            this.f88611j = true;
            ((b3) this.f88604c).onVisibilityChanged(true);
        }
    }

    public final void b(String str) {
        if (!this.f88612k) {
            this.f88612k = true;
            tm.t.d("VisibilityTracker", str, new Object[0]);
        }
        if (this.f88611j) {
            this.f88611j = false;
            ((b3) this.f88604c).onVisibilityChanged(false);
        }
    }

    public boolean isVisible() {
        return this.f88611j;
    }

    public void release() {
        this.f88615n = true;
        this.f88614m = false;
        this.f88613l = false;
        View view = this.f88603b;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f88609h);
        view.removeOnAttachStateChangeListener(this.f88610i);
        h0.cancelOnUiThread(this.f88608g);
    }

    public void start() {
        if (this.f88615n || this.f88614m) {
            return;
        }
        this.f88614m = true;
        if (this.f88609h == null) {
            this.f88609h = new k0(this);
        }
        if (this.f88610i == null) {
            this.f88610i = new l0(this);
        }
        View view = this.f88603b;
        view.getViewTreeObserver().addOnPreDrawListener(this.f88609h);
        view.addOnAttachStateChangeListener(this.f88610i);
        a();
    }

    public m0(Context context, View view, i0 i0Var, float f10) {
        this.f88611j = false;
        this.f88612k = false;
        this.f88613l = false;
        this.f88614m = false;
        this.f88615n = false;
        this.f88602a = context;
        this.f88603b = view;
        this.f88604c = i0Var;
        this.f88605d = f10;
        this.f88606e = new Rect();
        this.f88607f = new Rect();
        this.f88608g = new j0(this);
    }
}
