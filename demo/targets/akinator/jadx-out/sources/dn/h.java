package dn;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import nm.j;
import nm.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f52396a;

    /* renamed from: b, reason: collision with root package name */
    public final l f52397b;

    /* renamed from: c, reason: collision with root package name */
    public final i f52398c;

    /* renamed from: d, reason: collision with root package name */
    public final g f52399d = new g(this);

    /* renamed from: e, reason: collision with root package name */
    public final e f52400e = new e(this);

    /* renamed from: f, reason: collision with root package name */
    public final f f52401f = new f(this);

    /* renamed from: g, reason: collision with root package name */
    public final Object f52402g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f52403h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f52404i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public boolean f52405j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f52406k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f52407l;

    /* renamed from: m, reason: collision with root package name */
    public long f52408m;

    public h(View view, l lVar, i iVar) {
        this.f52396a = new WeakReference(view);
        this.f52397b = lVar;
        this.f52398c = iVar;
    }

    public static float a(Rect rect, Rect rect2) {
        int iHeight = rect.height() * rect.width();
        if (iHeight == 0) {
            return 0.0f;
        }
        int iMin = Math.min(rect.right, rect2.right);
        int iMax = Math.max(rect.left, rect2.left);
        int iMin2 = Math.min(rect.bottom, rect2.bottom);
        int iMax2 = Math.max(rect.top, rect2.top);
        return (iHeight - (Math.max(0, iMin2 - iMax2) * Math.max(0, iMin - iMax))) / iHeight;
    }

    @Override // dn.a
    public void start() {
        synchronized (this.f52402g) {
            try {
                if (this.f52403h.compareAndSet(false, true)) {
                    View view = (View) this.f52396a.get();
                    if (view == null) {
                        stop();
                    } else {
                        nm.a.d(new c4.d(view, 1));
                        view.getViewTreeObserver().addOnPreDrawListener(this.f52399d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // dn.a
    public void stop() {
        synchronized (this.f52402g) {
            try {
                this.f52403h.set(false);
                View view = (View) this.f52396a.get();
                if (view != null) {
                    nm.a.d(new c4.d(view, 2));
                    long timeThresholdMs = this.f52397b.getTimeThresholdMs();
                    if (this.f52405j && !this.f52406k && timeThresholdMs > -1 && this.f52408m > 0 && System.currentTimeMillis() - this.f52408m >= timeThresholdMs) {
                        this.f52406k = true;
                        this.f52398c.onViewTrackingFinished();
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this.f52399d);
                    }
                }
                j.cancelUiThreadTask(this.f52400e);
                j.cancelUiThreadTask(this.f52401f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
