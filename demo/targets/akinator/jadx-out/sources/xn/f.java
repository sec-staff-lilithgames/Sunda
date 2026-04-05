package xn;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f92071b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f92072c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f92077h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f92078i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f92079j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f92080k;

    /* renamed from: l, reason: collision with root package name */
    public long f92081l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f92082m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f92083n;

    /* renamed from: o, reason: collision with root package name */
    public n f92084o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f92070a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final z.j f92073d = new z.j();

    /* renamed from: e, reason: collision with root package name */
    public final z.j f92074e = new z.j();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f92075f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f92076g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f92071b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f92076g;
        if (!arrayDeque.isEmpty()) {
            this.f92078i = (MediaFormat) arrayDeque.getLast();
        }
        this.f92073d.clear();
        this.f92074e.clear();
        this.f92075f.clear();
        arrayDeque.clear();
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.f92070a) {
            try {
                IllegalStateException illegalStateException = this.f92083n;
                if (illegalStateException != null) {
                    this.f92083n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = this.f92079j;
                if (codecException != null) {
                    this.f92079j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = this.f92080k;
                if (cryptoException != null) {
                    this.f92080k = null;
                    throw cryptoException;
                }
                int iPopFirst = -1;
                if (this.f92081l > 0 || this.f92082m) {
                    return -1;
                }
                if (!this.f92073d.isEmpty()) {
                    iPopFirst = this.f92073d.popFirst();
                }
                return iPopFirst;
            } finally {
            }
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f92070a) {
            try {
                IllegalStateException illegalStateException = this.f92083n;
                if (illegalStateException != null) {
                    this.f92083n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = this.f92079j;
                if (codecException != null) {
                    this.f92079j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = this.f92080k;
                if (cryptoException != null) {
                    this.f92080k = null;
                    throw cryptoException;
                }
                if (this.f92081l > 0 || this.f92082m) {
                    return -1;
                }
                if (this.f92074e.isEmpty()) {
                    return -1;
                }
                int iPopFirst = this.f92074e.popFirst();
                if (iPopFirst >= 0) {
                    io.bidmachine.media3.common.util.a.checkStateNotNull(this.f92077h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f92075f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iPopFirst == -2) {
                    this.f92077h = (MediaFormat) this.f92076g.remove();
                }
                return iPopFirst;
            } finally {
            }
        }
    }

    public void flush() {
        synchronized (this.f92070a) {
            this.f92081l++;
            ((Handler) a1.castNonNull(this.f92072c)).post(new on.w(this, 24));
        }
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        synchronized (this.f92070a) {
            try {
                mediaFormat = this.f92077h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void initialize(MediaCodec mediaCodec) {
        io.bidmachine.media3.common.util.a.checkState(this.f92072c == null);
        HandlerThread handlerThread = this.f92071b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f92072c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f92070a) {
            this.f92080k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f92070a) {
            this.f92079j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f92070a) {
            this.f92073d.addLast(i10);
            n nVar = this.f92084o;
            if (nVar != null) {
                ((x) nVar).onInputBufferAvailable();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f92070a) {
            try {
                MediaFormat mediaFormat = this.f92078i;
                if (mediaFormat != null) {
                    this.f92074e.addLast(-2);
                    this.f92076g.add(mediaFormat);
                    this.f92078i = null;
                }
                this.f92074e.addLast(i10);
                this.f92075f.add(bufferInfo);
                n nVar = this.f92084o;
                if (nVar != null) {
                    ((x) nVar).onOutputBufferAvailable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f92070a) {
            this.f92074e.addLast(-2);
            this.f92076g.add(mediaFormat);
            this.f92078i = null;
        }
    }

    public void setOnBufferAvailableListener(n nVar) {
        synchronized (this.f92070a) {
            this.f92084o = nVar;
        }
    }

    public void shutdown() {
        synchronized (this.f92070a) {
            this.f92082m = true;
            this.f92071b.quit();
            a();
        }
    }
}
