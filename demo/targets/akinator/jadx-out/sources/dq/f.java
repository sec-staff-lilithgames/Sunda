package dq;

import android.view.View;
import android.view.ViewTreeObserver;
import br.e2;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f52466a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f52467b;

    /* renamed from: c, reason: collision with root package name */
    public final b f52468c;

    /* renamed from: d, reason: collision with root package name */
    public final d f52469d = new d(this);

    /* renamed from: e, reason: collision with root package name */
    public final e f52470e = new e(this);

    /* renamed from: f, reason: collision with root package name */
    public final Object f52471f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f52472g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f52473h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f52474i = new AtomicBoolean(false);

    public f(View view, e2 e2Var, b bVar) {
        this.f52466a = new WeakReference(view);
        this.f52467b = e2Var;
        this.f52468c = bVar;
    }

    @Override // dq.c
    public void a() {
        stop();
        this.f52466a.clear();
    }

    @Override // dq.c
    public boolean b() {
        return this.f52474i.get();
    }

    public View e() {
        return (View) this.f52466a.get();
    }

    @Override // dq.c
    public void start() {
        synchronized (this.f52471f) {
            try {
                if (this.f52472g.compareAndSet(false, true)) {
                    View viewE = e();
                    if (viewE == null) {
                        stop();
                        return;
                    }
                    d0.b("VisibilityTracker", "Start tracking - %s", viewE);
                    ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(this.f52470e);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // dq.c
    public void stop() {
        synchronized (this.f52471f) {
            try {
                this.f52472g.set(false);
                View viewE = e();
                if (viewE != null) {
                    d0.b("VisibilityTracker", "Stop tracking - %s", viewE);
                    ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this.f52470e);
                    }
                }
                cr.q.cancelOnUiThread(this.f52469d);
                this.f52473h.set(false);
                this.f52474i.set(false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
