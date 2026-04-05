package io.odeeo.internal.r;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import io.odeeo.internal.q0.g0;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f66020b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f66021c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f66026h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f66027i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f66028j;

    /* renamed from: k, reason: collision with root package name */
    public long f66029k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f66030l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f66031m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f66019a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final g f66022d = new g();

    /* renamed from: e, reason: collision with root package name */
    public final g f66023e = new g();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f66024f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f66025g = new ArrayDeque<>();

    public c(HandlerThread handlerThread) {
        this.f66020b = handlerThread;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(MediaCodec mediaCodec) {
        synchronized (this.f66019a) {
            try {
                if (this.f66030l) {
                    return;
                }
                long j10 = this.f66029k - 1;
                this.f66029k = j10;
                if (j10 > 0) {
                    return;
                }
                if (j10 < 0) {
                    a(new IllegalStateException());
                    return;
                }
                a();
                if (mediaCodec != null) {
                    try {
                        mediaCodec.start();
                    } catch (IllegalStateException e10) {
                        a(e10);
                    } catch (Exception e11) {
                        a(new IllegalStateException(e11));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        d();
        e();
    }

    public final void d() {
        IllegalStateException illegalStateException = this.f66031m;
        if (illegalStateException == null) {
            return;
        }
        this.f66031m = null;
        throw illegalStateException;
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.f66019a) {
            try {
                int iRemove = -1;
                if (b()) {
                    return -1;
                }
                c();
                if (!this.f66022d.isEmpty()) {
                    iRemove = this.f66022d.remove();
                }
                return iRemove;
            } finally {
            }
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f66019a) {
            try {
                if (b()) {
                    return -1;
                }
                c();
                if (this.f66023e.isEmpty()) {
                    return -1;
                }
                int iRemove = this.f66023e.remove();
                if (iRemove >= 0) {
                    io.odeeo.internal.q0.a.checkStateNotNull(this.f66026h);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f66024f.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iRemove == -2) {
                    this.f66026h = this.f66025g.remove();
                }
                return iRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        MediaCodec.CodecException codecException = this.f66028j;
        if (codecException == null) {
            return;
        }
        this.f66028j = null;
        throw codecException;
    }

    public void flush(MediaCodec mediaCodec) {
        synchronized (this.f66019a) {
            this.f66029k++;
            ((Handler) g0.castNonNull(this.f66021c)).post(new com.ironsource.environment.thread.a(22, this, mediaCodec));
        }
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        synchronized (this.f66019a) {
            try {
                mediaFormat = this.f66026h;
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
        io.odeeo.internal.q0.a.checkState(this.f66021c == null);
        this.f66020b.start();
        Handler handler = new Handler(this.f66020b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f66021c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f66019a) {
            this.f66028j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f66019a) {
            this.f66022d.add(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f66019a) {
            try {
                MediaFormat mediaFormat = this.f66027i;
                if (mediaFormat != null) {
                    a(mediaFormat);
                    this.f66027i = null;
                }
                this.f66023e.add(i10);
                this.f66024f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f66019a) {
            a(mediaFormat);
            this.f66027i = null;
        }
    }

    public void shutdown() {
        synchronized (this.f66019a) {
            this.f66030l = true;
            this.f66020b.quit();
            a();
        }
    }

    public final void a() {
        if (!this.f66025g.isEmpty()) {
            this.f66027i = this.f66025g.getLast();
        }
        this.f66022d.clear();
        this.f66023e.clear();
        this.f66024f.clear();
        this.f66025g.clear();
        this.f66028j = null;
    }

    public final void a(MediaFormat mediaFormat) {
        this.f66023e.add(-2);
        this.f66025g.add(mediaFormat);
    }

    public final void a(IllegalStateException illegalStateException) {
        synchronized (this.f66019a) {
            this.f66031m = illegalStateException;
        }
    }

    public final boolean b() {
        return this.f66029k > 0 || this.f66030l;
    }
}
