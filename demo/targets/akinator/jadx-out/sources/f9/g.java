package f9;

import android.graphics.drawable.Drawable;
import com.ironsource.C3191e4;
import g9.m;
import g9.n;
import j1.o2;
import j9.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p8.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g implements d, h {

    /* renamed from: b, reason: collision with root package name */
    public final int f55546b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55547c;

    /* renamed from: e, reason: collision with root package name */
    public Object f55548e;

    /* renamed from: f, reason: collision with root package name */
    public e f55549f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f55550g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f55551h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f55552i;

    /* renamed from: j, reason: collision with root package name */
    public q0 f55553j;

    public g(int i10, int i11) {
        this.f55546b = i10;
        this.f55547c = i11;
    }

    public final synchronized Object a(Long l9) {
        try {
            if (!isDone()) {
                s.assertBackgroundThread();
            }
            if (this.f55550g) {
                throw new CancellationException();
            }
            if (this.f55552i) {
                throw new ExecutionException(this.f55553j);
            }
            if (this.f55551h) {
                return this.f55548e;
            }
            if (l9 == null) {
                wait(0L);
            } else if (l9.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l9.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f55552i) {
                throw new ExecutionException(this.f55553j);
            }
            if (this.f55550g) {
                throw new CancellationException();
            }
            if (!this.f55551h) {
                throw new TimeoutException();
            }
            return this.f55548e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f55550g = true;
                notifyAll();
                e eVar = null;
                if (z10) {
                    e eVar2 = this.f55549f;
                    this.f55549f = null;
                    eVar = eVar2;
                }
                if (eVar != null) {
                    eVar.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        try {
            return a(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // f9.d, g9.n
    public synchronized e getRequest() {
        return this.f55549f;
    }

    @Override // f9.d, g9.n
    public void getSize(m mVar) throws Throwable {
        ((k) mVar).onSizeReady(this.f55546b, this.f55547c);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f55550g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f55550g     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f55551h     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.f55552i     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.g.isDone():boolean");
    }

    @Override // f9.d, g9.n
    public synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // f9.d, g9.n
    public synchronized void onResourceReady(Object obj, h9.c cVar) {
    }

    @Override // f9.d, g9.n
    public synchronized void setRequest(e eVar) {
        this.f55549f = eVar;
    }

    public String toString() {
        e eVar;
        String str;
        String strO = o2.o(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                eVar = null;
                if (this.f55550g) {
                    str = "CANCELLED";
                } else if (this.f55552i) {
                    str = "FAILURE";
                } else if (this.f55551h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    eVar = this.f55549f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (eVar == null) {
            return w0.i.d(strO, str, C3191e4.i.f36531e);
        }
        return strO + str + ", request=[" + eVar + "]]";
    }

    @Override // f9.h
    public synchronized boolean onLoadFailed(q0 q0Var, Object obj, n nVar, boolean z10) {
        this.f55552i = true;
        this.f55553j = q0Var;
        notifyAll();
        return false;
    }

    @Override // f9.h
    public synchronized boolean onResourceReady(Object obj, Object obj2, n nVar, n8.a aVar, boolean z10) {
        this.f55551h = true;
        this.f55548e = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return a(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // f9.d, g9.n, com.bumptech.glide.manager.o
    public void onDestroy() {
    }

    @Override // f9.d, g9.n, com.bumptech.glide.manager.o
    public void onStart() {
    }

    @Override // f9.d, g9.n, com.bumptech.glide.manager.o
    public void onStop() {
    }

    @Override // f9.d, g9.n
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // f9.d, g9.n
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // f9.d, g9.n
    public void removeCallback(m mVar) {
    }
}
