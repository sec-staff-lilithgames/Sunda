package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f13894a;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f13898e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f13899f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f13900g;

    /* renamed from: h, reason: collision with root package name */
    private final long f13901h;

    /* renamed from: k, reason: collision with root package name */
    private int f13904k;

    /* renamed from: l, reason: collision with root package name */
    private float f13905l;

    /* renamed from: m, reason: collision with root package name */
    private float f13906m;

    /* renamed from: n, reason: collision with root package name */
    private long f13907n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f13895b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f13896c = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private WeakReference f13902i = new WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f13903j = new WeakReference(null);

    /* renamed from: o, reason: collision with root package name */
    private long f13908o = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f13897d = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onLogVisibilityImpression();
    }

    public d8(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f13894a = kVar.O();
        this.f13901h = ((Long) kVar.a(v4.f16057w1)).longValue();
        this.f13900g = new WeakReference(view);
        this.f13898e = new s8(6, this, new WeakReference(aVar));
        this.f13899f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.b9
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f13680b.a(view);
            }
        };
    }

    private void c(View view) {
        View viewB = b8.b((View) this.f13900g.get());
        if (viewB == null) {
            viewB = b8.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13894a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f13902i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f13899f);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f13894a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f13900g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f13903j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f13894a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f13895b) {
            this.f13897d.removeMessages(0);
            b((View) this.f13900g.get());
            this.f13908o = Long.MIN_VALUE;
            this.f13903j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f13896c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f13896c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f13896c.width());
        if (jPxToDp < this.f13904k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.f13905l) {
            return false;
        }
        return (((float) ((long) (this.f13896c.height() * this.f13896c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f13906m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(e3 e3Var) {
        View viewM0;
        if (e3Var instanceof y2) {
            viewM0 = e3Var.y();
        } else if (!(e3Var instanceof a3)) {
            return;
        } else {
            viewM0 = ((a3) e3Var).m0();
        }
        a(e3Var.e0(), e3Var.g0(), e3Var.h0(), e3Var.i0(), viewM0);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f13902i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f13899f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f13899f);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f13894a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f13894a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f13902i.clear();
    }

    public void a(int i10, float f10, float f11, long j10, View view) {
        synchronized (this.f13895b) {
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f13894a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.f13903j = weakReference;
                this.f13904k = i10;
                this.f13905l = f10;
                this.f13906m = f11;
                this.f13907n = j10;
                c((View) weakReference.get());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        this.f13897d.postDelayed(this.f13898e, this.f13901h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.f13908o == Long.MIN_VALUE) {
                this.f13908o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f13908o >= this.f13907n) {
                return true;
            }
        }
        return false;
    }
}
