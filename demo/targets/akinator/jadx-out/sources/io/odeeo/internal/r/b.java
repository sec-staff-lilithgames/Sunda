package io.odeeo.internal.r;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import io.odeeo.internal.q0.g0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque<C0641b> f66004g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f66005h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f66006a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f66007b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f66008c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f66009d;

    /* renamed from: e, reason: collision with root package name */
    public final io.odeeo.internal.q0.g f66010e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f66011f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws MediaCodec.CryptoException {
            b.this.a(message);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.r.b$b, reason: collision with other inner class name */
    public static class C0641b {

        /* renamed from: a, reason: collision with root package name */
        public int f66013a;

        /* renamed from: b, reason: collision with root package name */
        public int f66014b;

        /* renamed from: c, reason: collision with root package name */
        public int f66015c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f66016d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f66017e;

        /* renamed from: f, reason: collision with root package name */
        public int f66018f;

        public void setQueueParams(int i10, int i11, int i12, long j10, int i13) {
            this.f66013a = i10;
            this.f66014b = i11;
            this.f66015c = i12;
            this.f66017e = j10;
            this.f66018f = i13;
        }
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new io.odeeo.internal.q0.g());
    }

    public static C0641b c() {
        ArrayDeque<C0641b> arrayDeque = f66004g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C0641b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() throws InterruptedException {
        ((Handler) io.odeeo.internal.q0.a.checkNotNull(this.f66008c)).removeCallbacksAndMessages(null);
        a();
    }

    public final void d() {
        RuntimeException andSet = this.f66009d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void flush() {
        if (this.f66011f) {
            try {
                b();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        d();
        C0641b c0641bC = c();
        c0641bC.setQueueParams(i10, i11, i12, j10, i13);
        ((Handler) g0.castNonNull(this.f66008c)).obtainMessage(0, c0641bC).sendToTarget();
    }

    public void queueSecureInputBuffer(int i10, int i11, io.odeeo.internal.e.c cVar, long j10, int i12) {
        d();
        C0641b c0641bC = c();
        c0641bC.setQueueParams(i10, i11, 0, j10, i12);
        a(cVar, c0641bC.f66016d);
        ((Handler) g0.castNonNull(this.f66008c)).obtainMessage(1, c0641bC).sendToTarget();
    }

    public void shutdown() {
        if (this.f66011f) {
            flush();
            this.f66007b.quit();
        }
        this.f66011f = false;
    }

    public void start() {
        if (this.f66011f) {
            return;
        }
        this.f66007b.start();
        this.f66008c = new a(this.f66007b.getLooper());
        this.f66011f = true;
    }

    public void waitUntilQueueingComplete() throws InterruptedException {
        a();
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, io.odeeo.internal.q0.g gVar) {
        this.f66006a = mediaCodec;
        this.f66007b = handlerThread;
        this.f66010e = gVar;
        this.f66009d = new AtomicReference<>();
    }

    public final void a() throws InterruptedException {
        this.f66010e.close();
        ((Handler) io.odeeo.internal.q0.a.checkNotNull(this.f66008c)).obtainMessage(2).sendToTarget();
        this.f66010e.block();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Message r9) throws android.media.MediaCodec.CryptoException {
        /*
            r8 = this;
            int r2 = r9.what
            if (r2 == 0) goto L41
            r3 = 1
            if (r2 == r3) goto L2c
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L26
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r2 = r8.f66009d
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r9.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
        L18:
            boolean r1 = r2.compareAndSet(r4, r3)
            if (r1 == 0) goto L1f
            goto L55
        L1f:
            java.lang.Object r1 = r2.get()
            if (r1 == 0) goto L18
            goto L55
        L26:
            io.odeeo.internal.q0.g r1 = r8.f66010e
            r1.open()
            goto L55
        L2c:
            java.lang.Object r1 = r9.obj
            r7 = r1
            io.odeeo.internal.r.b$b r7 = (io.odeeo.internal.r.b.C0641b) r7
            int r1 = r7.f66013a
            int r2 = r7.f66014b
            android.media.MediaCodec$CryptoInfo r3 = r7.f66016d
            long r4 = r7.f66017e
            int r6 = r7.f66018f
            r0 = r8
            r0.a(r1, r2, r3, r4, r6)
        L3f:
            r4 = r7
            goto L55
        L41:
            java.lang.Object r0 = r9.obj
            r7 = r0
            io.odeeo.internal.r.b$b r7 = (io.odeeo.internal.r.b.C0641b) r7
            int r1 = r7.f66013a
            int r2 = r7.f66014b
            int r3 = r7.f66015c
            long r4 = r7.f66017e
            int r6 = r7.f66018f
            r0 = r8
            r0.a(r1, r2, r3, r4, r6)
            goto L3f
        L55:
            if (r4 == 0) goto L5a
            a(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.r.b.a(android.os.Message):void");
    }

    public final void a(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        try {
            this.f66006a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            AtomicReference<RuntimeException> atomicReference = this.f66009d;
            while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
            }
        }
    }

    public final void a(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f66005h) {
                this.f66006a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            AtomicReference<RuntimeException> atomicReference = this.f66009d;
            while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
            }
        }
    }

    public static void a(C0641b c0641b) {
        ArrayDeque<C0641b> arrayDeque = f66004g;
        synchronized (arrayDeque) {
            arrayDeque.add(c0641b);
        }
    }

    public static void a(io.odeeo.internal.e.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f63686f;
        cryptoInfo.numBytesOfClearData = a(cVar.f63684d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(cVar.f63685e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) io.odeeo.internal.q0.a.checkNotNull(a(cVar.f63682b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) io.odeeo.internal.q0.a.checkNotNull(a(cVar.f63681a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f63683c;
        if (g0.f65861a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f63687g, cVar.f63688h));
        }
    }

    public static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
