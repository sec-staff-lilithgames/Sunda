package io.odeeo.internal.e;

import io.odeeo.internal.e.f;
import io.odeeo.internal.e.g;
import io.odeeo.internal.e.h;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f63720a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f63721b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<I> f63722c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<O> f63723d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    public final I[] f63724e;

    /* renamed from: f, reason: collision with root package name */
    public final O[] f63725f;

    /* renamed from: g, reason: collision with root package name */
    public int f63726g;

    /* renamed from: h, reason: collision with root package name */
    public int f63727h;

    /* renamed from: i, reason: collision with root package name */
    public I f63728i;

    /* renamed from: j, reason: collision with root package name */
    public E f63729j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f63730k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f63731l;

    /* renamed from: m, reason: collision with root package name */
    public int f63732m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.g();
        }
    }

    public j(I[] iArr, O[] oArr) {
        this.f63724e = iArr;
        this.f63726g = iArr.length;
        for (int i10 = 0; i10 < this.f63726g; i10++) {
            ((I[]) this.f63724e)[i10] = b();
        }
        this.f63725f = oArr;
        this.f63727h = oArr.length;
        for (int i11 = 0; i11 < this.f63727h; i11++) {
            ((O[]) this.f63725f)[i11] = c();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f63720a = aVar;
        aVar.start();
    }

    public abstract E a(I i10, O o10, boolean z10);

    public abstract E a(Throwable th2);

    public abstract I b();

    public final void b(O o10) {
        o10.clear();
        O[] oArr = this.f63725f;
        int i10 = this.f63727h;
        this.f63727h = i10 + 1;
        oArr[i10] = o10;
    }

    public abstract O c();

    public final boolean d() throws InterruptedException {
        E e10;
        synchronized (this.f63721b) {
            while (!this.f63731l && !a()) {
                try {
                    this.f63721b.wait();
                } finally {
                }
            }
            if (this.f63731l) {
                return false;
            }
            I iRemoveFirst = this.f63722c.removeFirst();
            O[] oArr = this.f63725f;
            int i10 = this.f63727h - 1;
            this.f63727h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f63730k;
            this.f63730k = false;
            if (iRemoveFirst.isEndOfStream()) {
                o10.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o10.addFlag(Integer.MIN_VALUE);
                }
                try {
                    e10 = (E) a(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) a(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) a(e12);
                }
                if (e10 != null) {
                    synchronized (this.f63721b) {
                        this.f63729j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f63721b) {
                try {
                    if (this.f63730k) {
                        o10.release();
                    } else if (o10.isDecodeOnly()) {
                        this.f63732m++;
                        o10.release();
                    } else {
                        o10.f63714c = this.f63732m;
                        this.f63732m = 0;
                        this.f63723d.addLast(o10);
                    }
                    a((j<I, O, E>) iRemoveFirst);
                } finally {
                }
            }
            return true;
        }
    }

    public final void e() {
        if (a()) {
            this.f63721b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends io.odeeo.internal.e.f */
    public final void f() throws E, f {
        E e10 = this.f63729j;
        if (e10 != null) {
            throw e10;
        }
    }

    @Override // io.odeeo.internal.e.d
    public final void flush() {
        synchronized (this.f63721b) {
            try {
                this.f63730k = true;
                this.f63732m = 0;
                I i10 = this.f63728i;
                if (i10 != null) {
                    a((j<I, O, E>) i10);
                    this.f63728i = null;
                }
                while (!this.f63722c.isEmpty()) {
                    a((j<I, O, E>) this.f63722c.removeFirst());
                }
                while (!this.f63723d.isEmpty()) {
                    this.f63723d.removeFirst().release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (d());
    }

    @Override // io.odeeo.internal.e.d
    public abstract /* synthetic */ String getName();

    @Override // io.odeeo.internal.e.d
    public void release() throws InterruptedException {
        synchronized (this.f63721b) {
            this.f63731l = true;
            this.f63721b.notify();
        }
        try {
            this.f63720a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void a(int i10) {
        io.odeeo.internal.q0.a.checkState(this.f63726g == this.f63724e.length);
        for (I i11 : this.f63724e) {
            i11.ensureSpaceForWrite(i10);
        }
    }

    @Override // io.odeeo.internal.e.d
    public final I dequeueInputBuffer() throws f {
        I i10;
        synchronized (this.f63721b) {
            f();
            io.odeeo.internal.q0.a.checkState(this.f63728i == null);
            int i11 = this.f63726g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f63724e;
                int i12 = i11 - 1;
                this.f63726g = i12;
                i10 = iArr[i12];
            }
            this.f63728i = i10;
        }
        return i10;
    }

    @Override // io.odeeo.internal.e.d
    public final O dequeueOutputBuffer() throws f {
        synchronized (this.f63721b) {
            try {
                f();
                if (this.f63723d.isEmpty()) {
                    return null;
                }
                return this.f63723d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.odeeo.internal.e.d
    public final void queueInputBuffer(I i10) throws f {
        synchronized (this.f63721b) {
            f();
            io.odeeo.internal.q0.a.checkArgument(i10 == this.f63728i);
            this.f63722c.addLast(i10);
            e();
            this.f63728i = null;
        }
    }

    public void a(O o10) {
        synchronized (this.f63721b) {
            b(o10);
            e();
        }
    }

    public final boolean a() {
        return !this.f63722c.isEmpty() && this.f63727h > 0;
    }

    public final void a(I i10) {
        i10.clear();
        I[] iArr = this.f63724e;
        int i11 = this.f63726g;
        this.f63726g = i11 + 1;
        iArr[i11] = i10;
    }
}
