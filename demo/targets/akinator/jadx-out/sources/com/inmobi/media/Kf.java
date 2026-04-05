package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import bp.oM.DwaEpyvxz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Kf {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f31967a;

    /* renamed from: b, reason: collision with root package name */
    public final Ef f31968b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f31969c;

    /* renamed from: d, reason: collision with root package name */
    public final byte f31970d;

    /* renamed from: e, reason: collision with root package name */
    public final F5 f31971e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31972f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f31973g;

    /* renamed from: h, reason: collision with root package name */
    public long f31974h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f31975i;

    /* renamed from: j, reason: collision with root package name */
    public Gf f31976j;

    /* renamed from: k, reason: collision with root package name */
    public final tu.o f31977k;

    /* renamed from: l, reason: collision with root package name */
    public final tu.o f31978l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31979m;

    public Kf(Ef visibilityChecker, byte b10, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        WeakHashMap weakHashMap = new WeakHashMap(10);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f31967a = weakHashMap;
        this.f31968b = visibilityChecker;
        this.f31969c = handler;
        this.f31970d = b10;
        this.f31971e = f52;
        this.f31972f = 50;
        this.f31973g = new ArrayList(50);
        this.f31975i = new AtomicBoolean(true);
        this.f31977k = tu.q.lazy(new If(this));
        this.f31978l = tu.q.lazy(new Jf(this));
    }

    public final void a(View view, Object obj, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "rootView");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        F5 f52 = this.f31971e;
        if (f52 != null) {
            ((G5) f52).c("VisibilityTracker", "add view to tracker - minPercent - " + i10 + "  " + this);
        }
        Hf hf2 = (Hf) this.f31967a.get(view);
        if (hf2 == null) {
            hf2 = new Hf();
            this.f31967a.put(view, hf2);
            this.f31974h++;
        }
        hf2.f31856a = i10;
        long j10 = this.f31974h;
        hf2.f31857b = j10;
        hf2.f31858c = view;
        hf2.f31859d = obj;
        long j11 = this.f31972f;
        if (j10 % j11 == 0) {
            long j12 = j10 - j11;
            for (Map.Entry entry : this.f31967a.entrySet()) {
                View view2 = (View) entry.getKey();
                if (((Hf) entry.getValue()).f31857b < j12) {
                    this.f31973g.add(view2);
                }
            }
            Iterator it = this.f31973g.iterator();
            while (it.hasNext()) {
                View view3 = (View) it.next();
                kotlin.jvm.internal.e0.checkNotNull(view3);
                a(view3);
            }
            this.f31973g.clear();
        }
        if (this.f31967a.size() == 1) {
            f();
        }
    }

    public void b() {
        F5 f52 = this.f31971e;
        if (f52 != null) {
            ((G5) f52).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.f31976j = null;
        this.f31975i.set(true);
    }

    public abstract int c();

    public abstract void d();

    public void e() {
        F5 f52 = this.f31971e;
        if (f52 != null) {
            ((G5) f52).c("VisibilityTracker", "pause " + this);
        }
        ((Ff) this.f31977k.getValue()).run();
        this.f31969c.removeCallbacksAndMessages(null);
        this.f31979m = false;
        this.f31975i.set(true);
    }

    public void f() {
        F5 f52 = this.f31971e;
        if (f52 != null) {
            ((G5) f52).c("VisibilityTracker", "resume " + this);
        }
        this.f31975i.set(false);
        g();
    }

    public final void g() {
        if (this.f31979m || this.f31975i.get()) {
            return;
        }
        this.f31979m = true;
        ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).schedule((Runnable) this.f31978l.getValue(), c(), TimeUnit.MILLISECONDS);
    }

    public final void a(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        F5 f52 = this.f31971e;
        if (f52 != null) {
            ((G5) f52).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((Hf) this.f31967a.remove(view)) != null) {
            this.f31974h--;
            if (this.f31967a.isEmpty()) {
                e();
            }
        }
    }

    public final void a() {
        F5 f52 = this.f31971e;
        if (f52 != null) {
            ((G5) f52).c(DwaEpyvxz.YLWiQKrsScAP, "clear " + this);
        }
        this.f31967a.clear();
        this.f31969c.removeMessages(0);
        this.f31979m = false;
    }
}
