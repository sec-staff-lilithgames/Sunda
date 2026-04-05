package f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f55242a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f55243b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f55244c;

    /* renamed from: d, reason: collision with root package name */
    public int f55245d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f55246e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f55247f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f55248g;

    /* renamed from: h, reason: collision with root package name */
    public final com.unity3d.services.banners.view.a f55249h;

    public v(Executor executor, kv.a reportFullyDrawn) {
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.e0.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f55242a = executor;
        this.f55243b = reportFullyDrawn;
        this.f55244c = new Object();
        this.f55248g = new ArrayList();
        this.f55249h = new com.unity3d.services.banners.view.a(this, 15);
    }

    public final void addOnReportDrawnListener(kv.a callback) {
        boolean z10;
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        synchronized (this.f55244c) {
            if (this.f55247f) {
                z10 = true;
            } else {
                this.f55248g.add(callback);
                z10 = false;
            }
        }
        if (z10) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.f55244c) {
            if (!this.f55247f) {
                this.f55245d++;
            }
        }
    }

    public final void fullyDrawnReported() {
        synchronized (this.f55244c) {
            try {
                this.f55247f = true;
                Iterator it = this.f55248g.iterator();
                while (it.hasNext()) {
                    ((kv.a) it.next()).invoke();
                }
                this.f55248g.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z10;
        synchronized (this.f55244c) {
            z10 = this.f55247f;
        }
        return z10;
    }

    public final void removeOnReportDrawnListener(kv.a callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        synchronized (this.f55244c) {
            this.f55248g.remove(callback);
        }
    }

    public final void removeReporter() {
        int i10;
        synchronized (this.f55244c) {
            if (!this.f55247f && (i10 = this.f55245d) > 0) {
                int i11 = i10 - 1;
                this.f55245d = i11;
                if (!this.f55246e && i11 == 0) {
                    this.f55246e = true;
                    this.f55242a.execute(this.f55249h);
                }
            }
        }
    }
}
