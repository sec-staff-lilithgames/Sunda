package wt;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mt.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends CountDownLatch implements q0, mt.f, mt.v {

    /* renamed from: b, reason: collision with root package name */
    public Object f91249b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f91250c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f91251e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f91252f;

    public h() {
        super(1);
    }

    public final void a() {
        this.f91252f = true;
        pt.c cVar = this.f91251e;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public boolean blockingAwait(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                iu.f.verifyNonBlocking();
                if (!await(j10, timeUnit)) {
                    a();
                    return false;
                }
            } catch (InterruptedException e10) {
                a();
                throw iu.m.wrapOrThrow(e10);
            }
        }
        Throwable th2 = this.f91250c;
        if (th2 == null) {
            return true;
        }
        throw iu.m.wrapOrThrow(th2);
    }

    public Object blockingGet() {
        if (getCount() != 0) {
            try {
                iu.f.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                a();
                throw iu.m.wrapOrThrow(e10);
            }
        }
        Throwable th2 = this.f91250c;
        if (th2 == null) {
            return this.f91249b;
        }
        throw iu.m.wrapOrThrow(th2);
    }

    public Throwable blockingGetError() throws InterruptedException {
        if (getCount() != 0) {
            try {
                iu.f.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                a();
                return e10;
            }
        }
        return this.f91250c;
    }

    @Override // mt.f
    public void onComplete() {
        countDown();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f91250c = th2;
        countDown();
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        this.f91251e = cVar;
        if (this.f91252f) {
            cVar.dispose();
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f91249b = obj;
        countDown();
    }

    public Throwable blockingGetError(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                iu.f.verifyNonBlocking();
                if (!await(j10, timeUnit)) {
                    a();
                    throw iu.m.wrapOrThrow(new TimeoutException(iu.m.timeoutMessage(j10, timeUnit)));
                }
            } catch (InterruptedException e10) {
                a();
                throw iu.m.wrapOrThrow(e10);
            }
        }
        return this.f91250c;
    }

    public Object blockingGet(Object obj) throws InterruptedException {
        if (getCount() != 0) {
            try {
                iu.f.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                a();
                throw iu.m.wrapOrThrow(e10);
            }
        }
        Throwable th2 = this.f91250c;
        if (th2 == null) {
            Object obj2 = this.f91249b;
            return obj2 != null ? obj2 : obj;
        }
        throw iu.m.wrapOrThrow(th2);
    }
}
