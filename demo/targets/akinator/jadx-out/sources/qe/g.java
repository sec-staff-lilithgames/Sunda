package qe;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.util.n1;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f82818b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f82819c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f82824h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f82825i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f82826j;

    /* renamed from: k, reason: collision with root package name */
    public long f82827k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f82828l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f82829m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f82817a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final k f82820d = new k();

    /* renamed from: e, reason: collision with root package name */
    public final k f82821e = new k();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f82822f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f82823g = new ArrayDeque();

    public g(HandlerThread handlerThread) {
        this.f82818b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f82823g;
        if (!arrayDeque.isEmpty()) {
            this.f82825i = (MediaFormat) arrayDeque.getLast();
        }
        this.f82820d.clear();
        this.f82821e.clear();
        this.f82822f.clear();
        arrayDeque.clear();
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.f82817a) {
            try {
                IllegalStateException illegalStateException = this.f82829m;
                if (illegalStateException != null) {
                    this.f82829m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = this.f82826j;
                if (codecException != null) {
                    this.f82826j = null;
                    throw codecException;
                }
                int iRemove = -1;
                if (this.f82827k > 0 || this.f82828l) {
                    return -1;
                }
                if (!this.f82820d.isEmpty()) {
                    iRemove = this.f82820d.remove();
                }
                return iRemove;
            } finally {
            }
        }
    }

    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f82817a) {
            try {
                IllegalStateException illegalStateException = this.f82829m;
                if (illegalStateException != null) {
                    this.f82829m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = this.f82826j;
                if (codecException != null) {
                    this.f82826j = null;
                    throw codecException;
                }
                if (this.f82827k > 0 || this.f82828l) {
                    return -1;
                }
                if (this.f82821e.isEmpty()) {
                    return -1;
                }
                int iRemove = this.f82821e.remove();
                if (iRemove >= 0) {
                    com.google.android.exoplayer2.util.a.checkStateNotNull(this.f82824h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f82822f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iRemove == -2) {
                    this.f82824h = (MediaFormat) this.f82823g.remove();
                }
                return iRemove;
            } finally {
            }
        }
    }

    public void flush() {
        synchronized (this.f82817a) {
            this.f82827k++;
            ((Handler) n1.castNonNull(this.f82819c)).post(new on.w(this, 4));
        }
    }

    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        synchronized (this.f82817a) {
            try {
                mediaFormat = this.f82824h;
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
        com.google.android.exoplayer2.util.a.checkState(this.f82819c == null);
        HandlerThread handlerThread = this.f82818b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f82819c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f82817a) {
            this.f82826j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f82817a) {
            this.f82820d.add(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f82817a) {
            try {
                MediaFormat mediaFormat = this.f82825i;
                if (mediaFormat != null) {
                    this.f82821e.add(-2);
                    this.f82823g.add(mediaFormat);
                    this.f82825i = null;
                }
                this.f82821e.add(i10);
                this.f82822f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f82817a) {
            this.f82821e.add(-2);
            this.f82823g.add(mediaFormat);
            this.f82825i = null;
        }
    }

    public void shutdown() {
        synchronized (this.f82817a) {
            this.f82828l = true;
            this.f82818b.quit();
            a();
        }
    }
}
