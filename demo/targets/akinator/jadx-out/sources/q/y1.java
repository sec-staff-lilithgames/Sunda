package q;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final float f82305b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82306c;

    /* renamed from: e, reason: collision with root package name */
    public final int f82307e;

    /* renamed from: f, reason: collision with root package name */
    public final View f82308f;

    /* renamed from: g, reason: collision with root package name */
    public w1 f82309g;

    /* renamed from: h, reason: collision with root package name */
    public x1 f82310h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82311i;

    /* renamed from: j, reason: collision with root package name */
    public int f82312j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f82313k = new int[2];

    public y1(View view) {
        this.f82308f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f82305b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f82306c = tapTimeout;
        this.f82307e = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        x1 x1Var = this.f82310h;
        View view = this.f82308f;
        if (x1Var != null) {
            view.removeCallbacks(x1Var);
        }
        w1 w1Var = this.f82309g;
        if (w1Var != null) {
            view.removeCallbacks(w1Var);
        }
    }

    public abstract p.e0 getPopup();

    public boolean onForwardingStarted() {
        p.e0 popup = getPopup();
        if (popup == null || popup.isShowing()) {
            return true;
        }
        popup.show();
        return true;
    }

    public boolean onForwardingStopped() {
        p.e0 popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.y1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f82311i = false;
        this.f82312j = -1;
        w1 w1Var = this.f82309g;
        if (w1Var != null) {
            this.f82308f.removeCallbacks(w1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
