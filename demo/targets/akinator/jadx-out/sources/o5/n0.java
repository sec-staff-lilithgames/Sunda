package o5;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f77665a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final long[] f77666b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f77667c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f77668d;

    public n0(int i10) {
        this.f77666b = new long[i10];
        this.f77667c = new boolean[i10];
    }

    public final void forceNeedSync$room_runtime_release() {
        ReentrantLock reentrantLock = this.f77665a;
        reentrantLock.lock();
        try {
            this.f77668d = true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final m0[] getTablesToSync$room_runtime_release() {
        m0 m0Var;
        long[] jArr = this.f77666b;
        ReentrantLock reentrantLock = this.f77665a;
        reentrantLock.lock();
        try {
            if (!this.f77668d) {
                reentrantLock.unlock();
                return null;
            }
            this.f77668d = false;
            int length = jArr.length;
            m0[] m0VarArr = new m0[length];
            int i10 = 0;
            boolean z10 = false;
            while (i10 < length) {
                boolean z11 = true;
                boolean z12 = jArr[i10] > 0;
                boolean[] zArr = this.f77667c;
                if (z12 != zArr[i10]) {
                    zArr[i10] = z12;
                    m0Var = z12 ? m0.f77653c : m0.f77654e;
                } else {
                    z11 = z10;
                    m0Var = m0.f77652b;
                }
                m0VarArr[i10] = m0Var;
                i10++;
                z10 = z11;
            }
            m0[] m0VarArr2 = z10 ? m0VarArr : null;
            reentrantLock.unlock();
            return m0VarArr2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean onObserverAdded$room_runtime_release(int[] tableIds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f77665a;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.f77666b;
                long j10 = jArr[i10];
                jArr[i10] = 1 + j10;
                if (j10 == 0) {
                    z10 = true;
                    this.f77668d = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean onObserverRemoved$room_runtime_release(int[] tableIds) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f77665a;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.f77666b;
                long j10 = jArr[i10];
                jArr[i10] = j10 - 1;
                if (j10 == 1) {
                    z10 = true;
                    this.f77668d = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void resetTriggerState$room_runtime_release() {
        ReentrantLock reentrantLock = this.f77665a;
        reentrantLock.lock();
        try {
            uu.f0.fill$default(this.f77667c, false, 0, 0, 6, (Object) null);
            this.f77668d = true;
        } finally {
            reentrantLock.unlock();
        }
    }
}
