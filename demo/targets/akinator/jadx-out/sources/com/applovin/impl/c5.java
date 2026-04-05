package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c5 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f13771a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Object f13772b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f13773c = new Handler();

    /* renamed from: d, reason: collision with root package name */
    private boolean f13774d = false;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f13775e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f13776f;

    /* renamed from: g, reason: collision with root package name */
    private a f13777g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(int i10, int i11);
    }

    public c5(View view) {
        this.f13775e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f13776f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.v8
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f16123b.b();
            }
        };
        this.f13776f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f13772b) {
            try {
                this.f13774d = false;
                int iMin = -1;
                int iMax = -1;
                for (Map.Entry entry : this.f13771a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (iMin == -1 && iMax == -1) {
                            iMin = num.intValue();
                            iMax = num.intValue();
                        } else {
                            iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                            iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f13777g;
                if (aVar != null) {
                    aVar.a(iMin, iMax);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d() {
        if (this.f13774d) {
            return;
        }
        this.f13774d = true;
        this.f13773c.postDelayed(new m9(this, 5), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f13777g = null;
        View view = (View) this.f13775e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f13776f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f13775e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f13772b) {
            this.f13771a.remove(view);
        }
    }

    public void a(a aVar) {
        this.f13777g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f13772b) {
            this.f13771a.put(view, Integer.valueOf(i10));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
