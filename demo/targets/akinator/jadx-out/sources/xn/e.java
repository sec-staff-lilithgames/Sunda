package xn;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e implements q {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f92062g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f92063h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f92064a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f92065b;

    /* renamed from: c, reason: collision with root package name */
    public c f92066c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f92067d;

    /* renamed from: e, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.j f92068e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92069f;

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        io.bidmachine.media3.common.util.j jVar = new io.bidmachine.media3.common.util.j();
        this.f92064a = mediaCodec;
        this.f92065b = handlerThread;
        this.f92068e = jVar;
        this.f92067d = new AtomicReference();
    }

    public static d a() {
        ArrayDeque arrayDeque = f92062g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new d();
                }
                return (d) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xn.q
    public void flush() {
        if (this.f92069f) {
            try {
                ((Handler) io.bidmachine.media3.common.util.a.checkNotNull(this.f92066c)).removeCallbacksAndMessages(null);
                io.bidmachine.media3.common.util.j jVar = this.f92068e;
                jVar.close();
                ((Handler) io.bidmachine.media3.common.util.a.checkNotNull(this.f92066c)).obtainMessage(3).sendToTarget();
                jVar.block();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // xn.q
    public void maybeThrowException() {
        RuntimeException runtimeException = (RuntimeException) this.f92067d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // xn.q
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        maybeThrowException();
        d dVarA = a();
        dVarA.setQueueParams(i10, i11, i12, j10, i13);
        ((Handler) a1.castNonNull(this.f92066c)).obtainMessage(1, dVarA).sendToTarget();
    }

    @Override // xn.q
    public void queueSecureInputBuffer(int i10, int i11, nn.d dVar, long j10, int i12) {
        maybeThrowException();
        d dVarA = a();
        dVarA.setQueueParams(i10, i11, 0, j10, i12);
        MediaCodec.CryptoInfo cryptoInfo = dVarA.f92059d;
        cryptoInfo.numSubSamples = dVar.f77073f;
        int[] iArr = dVar.f77071d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = dVar.f77072e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = dVar.f77069b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        cryptoInfo.key = (byte[]) io.bidmachine.media3.common.util.a.checkNotNull(bArrCopyOf);
        byte[] bArr2 = dVar.f77068a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        cryptoInfo.iv = (byte[]) io.bidmachine.media3.common.util.a.checkNotNull(bArrCopyOf2);
        cryptoInfo.mode = dVar.f77070c;
        if (a1.f60679a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f77074g, dVar.f77075h));
        }
        ((Handler) a1.castNonNull(this.f92066c)).obtainMessage(2, dVarA).sendToTarget();
    }

    @Override // xn.q
    public void setParameters(Bundle bundle) {
        maybeThrowException();
        ((Handler) a1.castNonNull(this.f92066c)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // xn.q
    public void shutdown() {
        if (this.f92069f) {
            flush();
            this.f92065b.quit();
        }
        this.f92069f = false;
    }

    @Override // xn.q
    public void start() {
        if (this.f92069f) {
            return;
        }
        HandlerThread handlerThread = this.f92065b;
        handlerThread.start();
        this.f92066c = new c(this, handlerThread.getLooper());
        this.f92069f = true;
    }

    @Override // xn.q
    public void waitUntilQueueingComplete() throws InterruptedException {
        io.bidmachine.media3.common.util.j jVar = this.f92068e;
        jVar.close();
        ((Handler) io.bidmachine.media3.common.util.a.checkNotNull(this.f92066c)).obtainMessage(3).sendToTarget();
        jVar.block();
    }
}
