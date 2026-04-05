package io.odeeo.internal.d;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import b0.e2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.k0;
import io.odeeo.internal.d.f;
import io.odeeo.internal.d.h;
import io.odeeo.internal.d.j;
import io.odeeo.internal.q0.g0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements io.odeeo.internal.d.h {

    /* renamed from: a0, reason: collision with root package name */
    public static boolean f63415a0 = false;
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public io.odeeo.internal.d.f[] I;
    public ByteBuffer[] J;
    public ByteBuffer K;
    public int L;
    public ByteBuffer M;
    public byte[] N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public k V;
    public boolean W;
    public long X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.d.e f63416a;

    /* renamed from: b, reason: collision with root package name */
    public final b f63417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63418c;

    /* renamed from: d, reason: collision with root package name */
    public final m f63419d;

    /* renamed from: e, reason: collision with root package name */
    public final x f63420e;

    /* renamed from: f, reason: collision with root package name */
    public final io.odeeo.internal.d.f[] f63421f;

    /* renamed from: g, reason: collision with root package name */
    public final io.odeeo.internal.d.f[] f63422g;

    /* renamed from: h, reason: collision with root package name */
    public final ConditionVariable f63423h;

    /* renamed from: i, reason: collision with root package name */
    public final j f63424i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque<f> f63425j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f63426k;

    /* renamed from: l, reason: collision with root package name */
    public final int f63427l;

    /* renamed from: m, reason: collision with root package name */
    public i f63428m;

    /* renamed from: n, reason: collision with root package name */
    public final g<h.b> f63429n;

    /* renamed from: o, reason: collision with root package name */
    public final g<h.e> f63430o;

    /* renamed from: p, reason: collision with root package name */
    public h.c f63431p;

    /* renamed from: q, reason: collision with root package name */
    public c f63432q;

    /* renamed from: r, reason: collision with root package name */
    public c f63433r;

    /* renamed from: s, reason: collision with root package name */
    public AudioTrack f63434s;

    /* renamed from: t, reason: collision with root package name */
    public io.odeeo.internal.d.d f63435t;

    /* renamed from: u, reason: collision with root package name */
    public f f63436u;

    /* renamed from: v, reason: collision with root package name */
    public f f63437v;

    /* renamed from: w, reason: collision with root package name */
    public k0 f63438w;

    /* renamed from: x, reason: collision with root package name */
    public ByteBuffer f63439x;

    /* renamed from: y, reason: collision with root package name */
    public int f63440y;

    /* renamed from: z, reason: collision with root package name */
    public long f63441z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f63442a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f63442a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f63442a.flush();
                this.f63442a.release();
            } finally {
                n.this.f63423h.open();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        k0 applyPlaybackParameters(k0 k0Var);

        boolean applySkipSilenceEnabled(boolean z10);

        io.odeeo.internal.d.f[] getAudioProcessors();

        long getMediaDuration(long j10);

        long getSkippedOutputFrameCount();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.d.f[] f63453a;

        /* renamed from: b, reason: collision with root package name */
        public final u f63454b;

        /* renamed from: c, reason: collision with root package name */
        public final w f63455c;

        public d(io.odeeo.internal.d.f... fVarArr) {
            this(fVarArr, new u(), new w());
        }

        @Override // io.odeeo.internal.d.n.b
        public k0 applyPlaybackParameters(k0 k0Var) {
            this.f63455c.setSpeed(k0Var.f62784a);
            this.f63455c.setPitch(k0Var.f62785b);
            return k0Var;
        }

        @Override // io.odeeo.internal.d.n.b
        public boolean applySkipSilenceEnabled(boolean z10) {
            this.f63454b.setEnabled(z10);
            return z10;
        }

        @Override // io.odeeo.internal.d.n.b
        public io.odeeo.internal.d.f[] getAudioProcessors() {
            return this.f63453a;
        }

        @Override // io.odeeo.internal.d.n.b
        public long getMediaDuration(long j10) {
            return this.f63455c.getMediaDuration(j10);
        }

        @Override // io.odeeo.internal.d.n.b
        public long getSkippedOutputFrameCount() {
            return this.f63454b.getSkippedFrames();
        }

        public d(io.odeeo.internal.d.f[] fVarArr, u uVar, w wVar) {
            io.odeeo.internal.d.f[] fVarArr2 = new io.odeeo.internal.d.f[fVarArr.length + 2];
            this.f63453a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f63454b = uVar;
            this.f63455c = wVar;
            fVarArr2[fVarArr.length] = uVar;
            fVarArr2[fVarArr.length + 1] = wVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends RuntimeException {
        public /* synthetic */ e(String str, a aVar) {
            this(str);
        }

        public e(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final k0 f63456a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f63457b;

        /* renamed from: c, reason: collision with root package name */
        public final long f63458c;

        /* renamed from: d, reason: collision with root package name */
        public final long f63459d;

        public /* synthetic */ f(k0 k0Var, boolean z10, long j10, long j11, a aVar) {
            this(k0Var, z10, j10, j11);
        }

        public f(k0 k0Var, boolean z10, long j10, long j11) {
            this.f63456a = k0Var;
            this.f63457b = z10;
            this.f63458c = j10;
            this.f63459d = j11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        public final long f63460a;

        /* renamed from: b, reason: collision with root package name */
        public T f63461b;

        /* renamed from: c, reason: collision with root package name */
        public long f63462c;

        public g(long j10) {
            this.f63460a = j10;
        }

        public void clear() {
            this.f63461b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f63461b == null) {
                this.f63461b = t10;
                this.f63462c = this.f63460a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f63462c) {
                T t11 = this.f63461b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f63461b;
                clear();
                throw t12;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class h implements j.a {
        public h() {
        }

        @Override // io.odeeo.internal.d.j.a
        public void onInvalidLatency(long j10) {
            io.odeeo.internal.q0.p.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // io.odeeo.internal.d.j.a
        public void onPositionAdvancing(long j10) {
            if (n.this.f63431p != null) {
                n.this.f63431p.onPositionAdvancing(j10);
            }
        }

        @Override // io.odeeo.internal.d.j.a
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            StringBuilder sbR = e2.r(j10, "Spurious audio timestamp (frame position mismatch): ", ", ");
            sbR.append(j11);
            e2.A(sbR, ", ", j12, ", ");
            sbR.append(j13);
            sbR.append(", ");
            sbR.append(n.this.f());
            sbR.append(", ");
            sbR.append(n.this.g());
            String string = sbR.toString();
            if (n.f63415a0) {
                throw new e(string, null);
            }
            io.odeeo.internal.q0.p.w("DefaultAudioSink", string);
        }

        @Override // io.odeeo.internal.d.j.a
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            StringBuilder sbR = e2.r(j10, "Spurious audio timestamp (system clock mismatch): ", ", ");
            sbR.append(j11);
            e2.A(sbR, ", ", j12, ", ");
            sbR.append(j13);
            sbR.append(", ");
            sbR.append(n.this.f());
            sbR.append(", ");
            sbR.append(n.this.g());
            String string = sbR.toString();
            if (n.f63415a0) {
                throw new e(string, null);
            }
            io.odeeo.internal.q0.p.w("DefaultAudioSink", string);
        }

        @Override // io.odeeo.internal.d.j.a
        public void onUnderrun(int i10, long j10) {
            if (n.this.f63431p != null) {
                n.this.f63431p.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - n.this.X);
            }
        }

        public /* synthetic */ h(n nVar, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class i {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f63464a = new Handler();

        /* renamed from: b, reason: collision with root package name */
        public final AudioTrack$StreamEventCallback f63465b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n f63467a;

            public a(n nVar) {
                this.f63467a = nVar;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                io.odeeo.internal.q0.a.checkState(audioTrack == n.this.f63434s);
                if (n.this.f63431p == null || !n.this.S) {
                    return;
                }
                n.this.f63431p.onOffloadBufferEmptying();
            }

            public void onTearDown(AudioTrack audioTrack) {
                io.odeeo.internal.q0.a.checkState(audioTrack == n.this.f63434s);
                if (n.this.f63431p == null || !n.this.S) {
                    return;
                }
                n.this.f63431p.onOffloadBufferEmptying();
            }
        }

        public i() {
            this.f63465b = new a(n.this);
        }

        public void register(AudioTrack audioTrack) {
            Handler handler = this.f63464a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.browser.customtabs.i(handler, 0), this.f63465b);
        }

        public void unregister(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f63465b);
            this.f63464a.removeCallbacksAndMessages(null);
        }
    }

    public n(io.odeeo.internal.d.e eVar, io.odeeo.internal.d.f[] fVarArr) {
        this(eVar, fVarArr, false);
    }

    @Override // io.odeeo.internal.d.h
    public void configure(io.odeeo.internal.b.t tVar, int i10, int[] iArr) throws h.a {
        int i11;
        int iIntValue;
        int iIntValue2;
        int i12;
        io.odeeo.internal.d.f[] fVarArr;
        int i13;
        int i14;
        int i15;
        int pcmFrameSize;
        int[] iArr2;
        if (MimeTypes.AUDIO_RAW.equals(tVar.f62971l)) {
            io.odeeo.internal.q0.a.checkArgument(g0.isEncodingLinearPcm(tVar.A));
            int pcmFrameSize2 = g0.getPcmFrameSize(tVar.A, tVar.f62984y);
            io.odeeo.internal.d.f[] fVarArr2 = e(tVar.A) ? this.f63422g : this.f63421f;
            this.f63420e.setTrimFrameCount(tVar.B, tVar.C);
            if (g0.f65861a < 21 && tVar.f62984y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i16 = 0; i16 < 6; i16++) {
                    iArr2[i16] = i16;
                }
            } else {
                iArr2 = iArr;
            }
            this.f63419d.setChannelMap(iArr2);
            f.a aVar = new f.a(tVar.f62985z, tVar.f62984y, tVar.A);
            for (io.odeeo.internal.d.f fVar : fVarArr2) {
                try {
                    f.a aVarConfigure = fVar.configure(aVar);
                    if (fVar.isActive()) {
                        aVar = aVarConfigure;
                    }
                } catch (f.b e10) {
                    throw new h.a(e10, tVar);
                }
            }
            int i17 = aVar.f63354c;
            i11 = aVar.f63352a;
            iIntValue2 = g0.getAudioTrackChannelConfig(aVar.f63353b);
            fVarArr = fVarArr2;
            i14 = i17;
            i13 = pcmFrameSize2;
            pcmFrameSize = g0.getPcmFrameSize(i17, aVar.f63353b);
            i15 = 0;
        } else {
            io.odeeo.internal.d.f[] fVarArr3 = new io.odeeo.internal.d.f[0];
            i11 = tVar.f62985z;
            if (a(tVar, this.f63435t)) {
                iIntValue = io.odeeo.internal.q0.t.getEncoding((String) io.odeeo.internal.q0.a.checkNotNull(tVar.f62971l), tVar.f62968i);
                iIntValue2 = g0.getAudioTrackChannelConfig(tVar.f62984y);
                i12 = 1;
            } else {
                Pair<Integer, Integer> pairA = a(tVar, this.f63416a);
                if (pairA == null) {
                    throw new h.a("Unable to configure passthrough for: " + tVar, tVar);
                }
                iIntValue = ((Integer) pairA.first).intValue();
                iIntValue2 = ((Integer) pairA.second).intValue();
                i12 = 2;
            }
            fVarArr = fVarArr3;
            i13 = -1;
            i14 = iIntValue;
            i15 = i12;
            pcmFrameSize = -1;
        }
        if (i14 == 0) {
            throw new h.a("Invalid output encoding (mode=" + i15 + ") for: " + tVar, tVar);
        }
        if (iIntValue2 == 0) {
            throw new h.a("Invalid output channel config (mode=" + i15 + ") for: " + tVar, tVar);
        }
        this.Y = false;
        c cVar = new c(tVar, i13, i15, pcmFrameSize, i11, iIntValue2, i14, i10, this.f63426k, fVarArr);
        if (i()) {
            this.f63432q = cVar;
        } else {
            this.f63433r = cVar;
        }
    }

    @Override // io.odeeo.internal.d.h
    public void disableTunneling() throws IllegalStateException {
        if (this.W) {
            this.W = false;
            flush();
        }
    }

    @Override // io.odeeo.internal.d.h
    public void enableTunnelingV21() throws IllegalStateException {
        io.odeeo.internal.q0.a.checkState(g0.f65861a >= 21);
        io.odeeo.internal.q0.a.checkState(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        flush();
    }

    @Override // io.odeeo.internal.d.h
    public void experimentalFlushWithoutAudioTrackRelease() throws IllegalStateException {
        if (g0.f65861a < 25) {
            flush();
            return;
        }
        this.f63430o.clear();
        this.f63429n.clear();
        if (i()) {
            l();
            if (this.f63424i.isPlaying()) {
                this.f63434s.pause();
            }
            this.f63434s.flush();
            this.f63424i.reset();
            j jVar = this.f63424i;
            AudioTrack audioTrack = this.f63434s;
            c cVar = this.f63433r;
            jVar.setAudioTrack(audioTrack, cVar.f63446c == 2, cVar.f63450g, cVar.f63447d, cVar.f63451h);
            this.F = true;
        }
    }

    @Override // io.odeeo.internal.d.h
    public void flush() throws IllegalStateException {
        if (i()) {
            l();
            if (this.f63424i.isPlaying()) {
                this.f63434s.pause();
            }
            if (a(this.f63434s)) {
                ((i) io.odeeo.internal.q0.a.checkNotNull(this.f63428m)).unregister(this.f63434s);
            }
            AudioTrack audioTrack = this.f63434s;
            this.f63434s = null;
            if (g0.f65861a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.f63432q;
            if (cVar != null) {
                this.f63433r = cVar;
                this.f63432q = null;
            }
            this.f63424i.reset();
            this.f63423h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f63430o.clear();
        this.f63429n.clear();
    }

    @Override // io.odeeo.internal.d.h
    public long getCurrentPositionUs(boolean z10) {
        if (!i() || this.F) {
            return Long.MIN_VALUE;
        }
        return c(b(Math.min(this.f63424i.getCurrentPositionUs(z10), this.f63433r.framesToDurationUs(g()))));
    }

    @Override // io.odeeo.internal.d.h
    public int getFormatSupport(io.odeeo.internal.b.t tVar) {
        if (!MimeTypes.AUDIO_RAW.equals(tVar.f62971l)) {
            return ((this.Y || !a(tVar, this.f63435t)) && !b(tVar, this.f63416a)) ? 0 : 2;
        }
        if (g0.isEncodingLinearPcm(tVar.A)) {
            int i10 = tVar.A;
            return (i10 == 2 || (this.f63418c && i10 == 4)) ? 2 : 1;
        }
        io.odeeo.internal.q0.p.w("DefaultAudioSink", "Invalid PCM encoding: " + tVar.A);
        return 0;
    }

    @Override // io.odeeo.internal.d.h
    public k0 getPlaybackParameters() {
        return this.f63426k ? this.f63438w : d();
    }

    @Override // io.odeeo.internal.d.h
    public boolean getSkipSilenceEnabled() {
        return e().f63457b;
    }

    public final void h() throws h.b {
        this.f63423h.block();
        AudioTrack audioTrackA = a();
        this.f63434s = audioTrackA;
        if (a(audioTrackA)) {
            b(this.f63434s);
            if (this.f63427l != 3) {
                AudioTrack audioTrack = this.f63434s;
                io.odeeo.internal.b.t tVar = this.f63433r.f63444a;
                audioTrack.setOffloadDelayPadding(tVar.B, tVar.C);
            }
        }
        this.U = this.f63434s.getAudioSessionId();
        j jVar = this.f63424i;
        AudioTrack audioTrack2 = this.f63434s;
        c cVar = this.f63433r;
        jVar.setAudioTrack(audioTrack2, cVar.f63446c == 2, cVar.f63450g, cVar.f63447d, cVar.f63451h);
        m();
        int i10 = this.V.f63404a;
        if (i10 != 0) {
            this.f63434s.attachAuxEffect(i10);
            this.f63434s.setAuxEffectSendLevel(this.V.f63405b);
        }
        this.F = true;
    }

    @Override // io.odeeo.internal.d.h
    public boolean handleBuffer(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.K;
        io.odeeo.internal.q0.a.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f63432q != null) {
            if (!b()) {
                return false;
            }
            if (this.f63432q.canReuseAudioTrack(this.f63433r)) {
                this.f63433r = this.f63432q;
                this.f63432q = null;
                if (a(this.f63434s) && this.f63427l != 3) {
                    this.f63434s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f63434s;
                    io.odeeo.internal.b.t tVar = this.f63433r.f63444a;
                    audioTrack.setOffloadDelayPadding(tVar.B, tVar.C);
                    this.Z = true;
                }
            } else {
                k();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            a(j10);
        }
        if (!i()) {
            try {
                h();
            } catch (h.b e10) {
                if (e10.f63360b) {
                    throw e10;
                }
                this.f63429n.throwExceptionIfDeadlineIsReached(e10);
                return false;
            }
        }
        this.f63429n.clear();
        if (this.F) {
            this.G = Math.max(0L, j10);
            this.E = false;
            this.F = false;
            if (this.f63426k && g0.f65861a >= 23) {
                a(this.f63438w);
            }
            a(j10);
            if (this.S) {
                play();
            }
        }
        if (!this.f63424i.mayHandleBuffer(g())) {
            return false;
        }
        if (this.K == null) {
            io.odeeo.internal.q0.a.checkArgument(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.f63433r;
            if (cVar.f63446c != 0 && this.D == 0) {
                int iA = a(cVar.f63450g, byteBuffer);
                this.D = iA;
                if (iA == 0) {
                    return true;
                }
            }
            if (this.f63436u != null) {
                if (!b()) {
                    return false;
                }
                a(j10);
                this.f63436u = null;
            }
            long jInputFramesToDurationUs = this.f63433r.inputFramesToDurationUs(f() - this.f63420e.getTrimmedFrameCount()) + this.G;
            if (!this.E && Math.abs(jInputFramesToDurationUs - j10) > 200000) {
                this.f63431p.onAudioSinkError(new h.d(j10, jInputFramesToDurationUs));
                this.E = true;
            }
            if (this.E) {
                if (!b()) {
                    return false;
                }
                long j11 = j10 - jInputFramesToDurationUs;
                this.G += j11;
                this.E = false;
                a(j10);
                h.c cVar2 = this.f63431p;
                if (cVar2 != null && j11 != 0) {
                    cVar2.onPositionDiscontinuity();
                }
            }
            if (this.f63433r.f63446c == 0) {
                this.f63441z += byteBuffer.remaining();
            } else {
                this.A += this.D * i10;
            }
            this.K = byteBuffer;
            this.L = i10;
        }
        d(j10);
        if (!this.K.hasRemaining()) {
            this.K = null;
            this.L = 0;
            return true;
        }
        if (!this.f63424i.isStalled(g())) {
            return false;
        }
        io.odeeo.internal.q0.p.w("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // io.odeeo.internal.d.h
    public void handleDiscontinuity() {
        this.E = true;
    }

    @Override // io.odeeo.internal.d.h
    public boolean hasPendingData() {
        return i() && this.f63424i.hasPendingData(g());
    }

    public final boolean i() {
        return this.f63434s != null;
    }

    @Override // io.odeeo.internal.d.h
    public boolean isEnded() {
        if (i()) {
            return this.Q && !hasPendingData();
        }
        return true;
    }

    public final void j() {
        if (this.f63433r.outputModeIsOffload()) {
            this.Y = true;
        }
    }

    public final void k() throws IllegalStateException {
        if (this.R) {
            return;
        }
        this.R = true;
        this.f63424i.handleEndOfStream(g());
        this.f63434s.stop();
        this.f63440y = 0;
    }

    public final void l() {
        this.f63441z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.f63437v = new f(d(), getSkipSilenceEnabled(), 0L, 0L, null);
        this.G = 0L;
        this.f63436u = null;
        this.f63425j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.f63439x = null;
        this.f63440y = 0;
        this.f63420e.resetTrimmedFrameCount();
        c();
    }

    public final void m() {
        if (i()) {
            if (g0.f65861a >= 21) {
                a(this.f63434s, this.H);
            } else {
                b(this.f63434s, this.H);
            }
        }
    }

    public final void n() {
        io.odeeo.internal.d.f[] fVarArr = this.f63433r.f63452i;
        ArrayList arrayList = new ArrayList();
        for (io.odeeo.internal.d.f fVar : fVarArr) {
            if (fVar.isActive()) {
                arrayList.add(fVar);
            } else {
                fVar.flush();
            }
        }
        int size = arrayList.size();
        this.I = (io.odeeo.internal.d.f[]) arrayList.toArray(new io.odeeo.internal.d.f[size]);
        this.J = new ByteBuffer[size];
        c();
    }

    public final boolean o() {
        return (this.W || !MimeTypes.AUDIO_RAW.equals(this.f63433r.f63444a.f62971l) || e(this.f63433r.f63444a.A)) ? false : true;
    }

    @Override // io.odeeo.internal.d.h
    public void pause() throws IllegalStateException {
        this.S = false;
        if (i() && this.f63424i.pause()) {
            this.f63434s.pause();
        }
    }

    @Override // io.odeeo.internal.d.h
    public void play() throws IllegalStateException {
        this.S = true;
        if (i()) {
            this.f63424i.start();
            this.f63434s.play();
        }
    }

    @Override // io.odeeo.internal.d.h
    public void playToEndOfStream() throws IllegalStateException, h.e {
        if (!this.Q && i() && b()) {
            k();
            this.Q = true;
        }
    }

    @Override // io.odeeo.internal.d.h
    public void reset() throws IllegalStateException {
        flush();
        for (io.odeeo.internal.d.f fVar : this.f63421f) {
            fVar.reset();
        }
        for (io.odeeo.internal.d.f fVar2 : this.f63422g) {
            fVar2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    @Override // io.odeeo.internal.d.h
    public void setAudioAttributes(io.odeeo.internal.d.d dVar) throws IllegalStateException {
        if (this.f63435t.equals(dVar)) {
            return;
        }
        this.f63435t = dVar;
        if (this.W) {
            return;
        }
        flush();
    }

    @Override // io.odeeo.internal.d.h
    public void setAudioSessionId(int i10) throws IllegalStateException {
        if (this.U != i10) {
            this.U = i10;
            this.T = i10 != 0;
            flush();
        }
    }

    @Override // io.odeeo.internal.d.h
    public void setAuxEffectInfo(k kVar) {
        if (this.V.equals(kVar)) {
            return;
        }
        int i10 = kVar.f63404a;
        float f10 = kVar.f63405b;
        AudioTrack audioTrack = this.f63434s;
        if (audioTrack != null) {
            if (this.V.f63404a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f63434s.setAuxEffectSendLevel(f10);
            }
        }
        this.V = kVar;
    }

    @Override // io.odeeo.internal.d.h
    public void setListener(h.c cVar) {
        this.f63431p = cVar;
    }

    @Override // io.odeeo.internal.d.h
    public void setPlaybackParameters(k0 k0Var) {
        k0 k0Var2 = new k0(g0.constrainValue(k0Var.f62784a, 0.1f, 8.0f), g0.constrainValue(k0Var.f62785b, 0.1f, 8.0f));
        if (!this.f63426k || g0.f65861a < 23) {
            a(k0Var2, getSkipSilenceEnabled());
        } else {
            a(k0Var2);
        }
    }

    @Override // io.odeeo.internal.d.h
    public void setSkipSilenceEnabled(boolean z10) {
        a(d(), z10);
    }

    @Override // io.odeeo.internal.d.h
    public void setVolume(float f10) {
        if (this.H != f10) {
            this.H = f10;
            m();
        }
    }

    @Override // io.odeeo.internal.d.h
    public boolean supportsFormat(io.odeeo.internal.b.t tVar) {
        return getFormatSupport(tVar) != 0;
    }

    public n(io.odeeo.internal.d.e eVar, io.odeeo.internal.d.f[] fVarArr, boolean z10) {
        this(eVar, new d(fVarArr), z10, false, 0);
    }

    public final void b(AudioTrack audioTrack) {
        if (this.f63428m == null) {
            this.f63428m = new i();
        }
        this.f63428m.register(audioTrack);
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            io.odeeo.internal.d.f[] fVarArr = this.I;
            if (i10 >= fVarArr.length) {
                return;
            }
            io.odeeo.internal.d.f fVar = fVarArr[i10];
            fVar.flush();
            this.J[i10] = fVar.getOutput();
            i10++;
        }
    }

    public final void d(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.J[i10 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = io.odeeo.internal.d.f.f63350a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j10);
            } else {
                io.odeeo.internal.d.f fVar = this.I[i10];
                if (i10 > this.P) {
                    fVar.queueInput(byteBuffer);
                }
                ByteBuffer output = fVar.getOutput();
                this.J[i10] = output;
                if (output.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final f e() {
        f fVar = this.f63436u;
        return fVar != null ? fVar : !this.f63425j.isEmpty() ? this.f63425j.getLast() : this.f63437v;
    }

    public final long f() {
        return this.f63433r.f63446c == 0 ? this.f63441z / r0.f63445b : this.A;
    }

    public final long g() {
        return this.f63433r.f63446c == 0 ? this.B / r0.f63447d : this.C;
    }

    public n(io.odeeo.internal.d.e eVar, b bVar, boolean z10, boolean z11, int i10) {
        this.f63416a = eVar;
        this.f63417b = (b) io.odeeo.internal.q0.a.checkNotNull(bVar);
        int i11 = g0.f65861a;
        this.f63418c = i11 >= 21 && z10;
        this.f63426k = i11 >= 23 && z11;
        this.f63427l = i11 >= 29 ? i10 : 0;
        this.f63423h = new ConditionVariable(true);
        this.f63424i = new j(new h(this, null));
        m mVar = new m();
        this.f63419d = mVar;
        x xVar = new x();
        this.f63420e = xVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new t(), mVar, xVar);
        Collections.addAll(arrayList, bVar.getAudioProcessors());
        this.f63421f = (io.odeeo.internal.d.f[]) arrayList.toArray(new io.odeeo.internal.d.f[0]);
        this.f63422g = new io.odeeo.internal.d.f[]{new p()};
        this.H = 1.0f;
        this.f63435t = io.odeeo.internal.d.d.f63334f;
        this.U = 0;
        this.V = new k(0, 0.0f);
        k0 k0Var = k0.f62782d;
        this.f63437v = new f(k0Var, false, 0L, 0L, null);
        this.f63438w = k0Var;
        this.P = -1;
        this.I = new io.odeeo.internal.d.f[0];
        this.J = new ByteBuffer[0];
        this.f63425j = new ArrayDeque<>();
        this.f63429n = new g<>(100L);
        this.f63430o = new g<>(100L);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.b.t f63444a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63445b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63446c;

        /* renamed from: d, reason: collision with root package name */
        public final int f63447d;

        /* renamed from: e, reason: collision with root package name */
        public final int f63448e;

        /* renamed from: f, reason: collision with root package name */
        public final int f63449f;

        /* renamed from: g, reason: collision with root package name */
        public final int f63450g;

        /* renamed from: h, reason: collision with root package name */
        public final int f63451h;

        /* renamed from: i, reason: collision with root package name */
        public final io.odeeo.internal.d.f[] f63452i;

        public c(io.odeeo.internal.b.t tVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, io.odeeo.internal.d.f[] fVarArr) {
            this.f63444a = tVar;
            this.f63445b = i10;
            this.f63446c = i11;
            this.f63447d = i12;
            this.f63448e = i13;
            this.f63449f = i14;
            this.f63450g = i15;
            this.f63452i = fVarArr;
            this.f63451h = a(i16, z10);
        }

        public final AudioTrack a(boolean z10, io.odeeo.internal.d.d dVar, int i10) {
            int i11 = g0.f65861a;
            return i11 >= 29 ? c(z10, dVar, i10) : i11 >= 21 ? b(z10, dVar, i10) : a(dVar, i10);
        }

        public final AudioTrack b(boolean z10, io.odeeo.internal.d.d dVar, int i10) {
            return new AudioTrack(a(dVar, z10), n.b(this.f63448e, this.f63449f, this.f63450g), this.f63451h, 1, i10);
        }

        public AudioTrack buildAudioTrack(boolean z10, io.odeeo.internal.d.d dVar, int i10) throws h.b {
            try {
                AudioTrack audioTrackA = a(z10, dVar, i10);
                int state = audioTrackA.getState();
                if (state == 1) {
                    return audioTrackA;
                }
                try {
                    audioTrackA.release();
                } catch (Exception unused) {
                }
                throw new h.b(state, this.f63448e, this.f63449f, this.f63451h, this.f63444a, outputModeIsOffload(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new h.b(0, this.f63448e, this.f63449f, this.f63451h, this.f63444a, outputModeIsOffload(), e10);
            }
        }

        public final AudioTrack c(boolean z10, io.odeeo.internal.d.d dVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(a(dVar, z10)).setAudioFormat(n.b(this.f63448e, this.f63449f, this.f63450g)).setTransferMode(1).setBufferSizeInBytes(this.f63451h).setSessionId(i10).setOffloadedPlayback(this.f63446c == 1).build();
        }

        public boolean canReuseAudioTrack(c cVar) {
            return cVar.f63446c == this.f63446c && cVar.f63450g == this.f63450g && cVar.f63448e == this.f63448e && cVar.f63449f == this.f63449f && cVar.f63447d == this.f63447d;
        }

        public long durationUsToFrames(long j10) {
            return (j10 * this.f63448e) / 1000000;
        }

        public long framesToDurationUs(long j10) {
            return (j10 * 1000000) / this.f63448e;
        }

        public long inputFramesToDurationUs(long j10) {
            return (j10 * 1000000) / this.f63444a.f62985z;
        }

        public boolean outputModeIsOffload() {
            return this.f63446c == 1;
        }

        public final AudioTrack a(io.odeeo.internal.d.d dVar, int i10) {
            int streamTypeForAudioUsage = g0.getStreamTypeForAudioUsage(dVar.f63338c);
            if (i10 == 0) {
                return new AudioTrack(streamTypeForAudioUsage, this.f63448e, this.f63449f, this.f63450g, this.f63451h, 1);
            }
            return new AudioTrack(streamTypeForAudioUsage, this.f63448e, this.f63449f, this.f63450g, this.f63451h, 1, i10);
        }

        public final int a(int i10, boolean z10) {
            if (i10 != 0) {
                return i10;
            }
            int i11 = this.f63446c;
            if (i11 == 0) {
                return a(z10 ? 8.0f : 1.0f);
            }
            if (i11 == 1) {
                return a(50000000L);
            }
            if (i11 == 2) {
                return a(250000L);
            }
            throw new IllegalStateException();
        }

        public final int a(long j10) {
            int iC = n.c(this.f63450g);
            if (this.f63450g == 5) {
                iC *= 2;
            }
            return (int) ((j10 * iC) / 1000000);
        }

        public final int a(float f10) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f63448e, this.f63449f, this.f63450g);
            io.odeeo.internal.q0.a.checkState(minBufferSize != -2);
            int iConstrainValue = g0.constrainValue(minBufferSize * 4, ((int) durationUsToFrames(250000L)) * this.f63447d, Math.max(minBufferSize, ((int) durationUsToFrames(750000L)) * this.f63447d));
            return f10 != 1.0f ? Math.round(iConstrainValue * f10) : iConstrainValue;
        }

        public static AudioAttributes a(io.odeeo.internal.d.d dVar, boolean z10) {
            if (z10) {
                return a();
            }
            return dVar.getAudioAttributesV21();
        }

        public static AudioAttributes a() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
    }

    public final AudioTrack a() throws h.b {
        try {
            return ((c) io.odeeo.internal.q0.a.checkNotNull(this.f63433r)).buildAudioTrack(this.W, this.f63435t, this.U);
        } catch (h.b e10) {
            j();
            h.c cVar = this.f63431p;
            if (cVar != null) {
                cVar.onAudioSinkError(e10);
            }
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.P = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.P
            io.odeeo.internal.d.f[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.queueEndOfStream()
        L1f:
            r9.d(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.P
            int r0 = r0 + r1
            r9.P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.d.n.b():boolean");
    }

    public final long c(long j10) {
        return this.f63433r.framesToDurationUs(this.f63417b.getSkippedOutputFrameCount()) + j10;
    }

    public final boolean e(int i10) {
        return this.f63418c && g0.isEncodingHighResolutionPcm(i10);
    }

    public static int c(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    public final void a(ByteBuffer byteBuffer, long j10) throws Exception {
        n nVar;
        ByteBuffer byteBuffer2;
        int iA;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.M;
            if (byteBuffer3 != null) {
                io.odeeo.internal.q0.a.checkArgument(byteBuffer3 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (g0.f65861a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.N = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.N, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.O = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (g0.f65861a < 21) {
                int availableBufferSize = this.f63424i.getAvailableBufferSize(this.B);
                if (availableBufferSize > 0) {
                    iA = this.f63434s.write(this.N, this.O, Math.min(iRemaining2, availableBufferSize));
                    if (iA > 0) {
                        this.O += iA;
                        byteBuffer.position(byteBuffer.position() + iA);
                    }
                    nVar = this;
                    byteBuffer2 = byteBuffer;
                } else {
                    nVar = this;
                    byteBuffer2 = byteBuffer;
                    iA = 0;
                }
            } else if (this.W) {
                io.odeeo.internal.q0.a.checkState(j10 != C.TIME_UNSET);
                nVar = this;
                byteBuffer2 = byteBuffer;
                iA = nVar.a(this.f63434s, byteBuffer2, iRemaining2, j10);
            } else {
                nVar = this;
                byteBuffer2 = byteBuffer;
                iA = a(nVar.f63434s, byteBuffer2, iRemaining2);
            }
            nVar.X = SystemClock.elapsedRealtime();
            if (iA < 0) {
                boolean zD = d(iA);
                if (zD) {
                    j();
                }
                h.e eVar = new h.e(iA, nVar.f63433r.f63444a, zD);
                h.c cVar = nVar.f63431p;
                if (cVar != null) {
                    cVar.onAudioSinkError(eVar);
                }
                if (!eVar.f63365b) {
                    nVar.f63430o.throwExceptionIfDeadlineIsReached(eVar);
                    return;
                }
                throw eVar;
            }
            nVar.f63430o.clear();
            if (a(nVar.f63434s)) {
                long j11 = nVar.C;
                if (j11 > 0) {
                    nVar.Z = false;
                }
                if (nVar.S && nVar.f63431p != null && iA < iRemaining2 && !nVar.Z) {
                    nVar.f63431p.onOffloadBufferFull(nVar.f63424i.getPendingBufferDurationMs(j11));
                }
            }
            int i10 = nVar.f63433r.f63446c;
            if (i10 == 0) {
                nVar.B += iA;
            }
            if (iA == iRemaining2) {
                if (i10 != 0) {
                    io.odeeo.internal.q0.a.checkState(byteBuffer2 == nVar.K);
                    nVar.C += nVar.D * nVar.L;
                }
                nVar.M = null;
            }
        }
    }

    public static boolean d(int i10) {
        return (g0.f65861a >= 24 && i10 == -6) || i10 == -32;
    }

    public final k0 d() {
        return e().f63456a;
    }

    public final long b(long j10) {
        while (!this.f63425j.isEmpty() && j10 >= this.f63425j.getFirst().f63459d) {
            this.f63437v = this.f63425j.remove();
        }
        f fVar = this.f63437v;
        long j11 = j10 - fVar.f63459d;
        if (fVar.f63456a.equals(k0.f62782d)) {
            return this.f63437v.f63458c + j11;
        }
        if (this.f63425j.isEmpty()) {
            return this.f63437v.f63458c + this.f63417b.getMediaDuration(j11);
        }
        f first = this.f63425j.getFirst();
        return first.f63458c - g0.getMediaDurationForPlayoutDuration(first.f63459d - j10, this.f63437v.f63456a.f62784a);
    }

    public static boolean b(io.odeeo.internal.b.t tVar, io.odeeo.internal.d.e eVar) {
        return a(tVar, eVar) != null;
    }

    public static int b(int i10) {
        int i11 = g0.f65861a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(g0.f65862b) && i10 == 1) {
            i10 = 2;
        }
        return g0.getAudioTrackChannelConfig(i10);
    }

    public static void b(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    public static AudioFormat b(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public final void a(k0 k0Var) {
        if (i()) {
            try {
                this.f63434s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(k0Var.f62784a).setPitch(k0Var.f62785b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                io.odeeo.internal.q0.p.w("DefaultAudioSink", "Failed to set playback params", e10);
            }
            k0Var = new k0(this.f63434s.getPlaybackParams().getSpeed(), this.f63434s.getPlaybackParams().getPitch());
            this.f63424i.setAudioTrackPlaybackSpeed(k0Var.f62784a);
        }
        this.f63438w = k0Var;
    }

    public final void a(k0 k0Var, boolean z10) {
        f fVarE = e();
        if (k0Var.equals(fVarE.f63456a) && z10 == fVarE.f63457b) {
            return;
        }
        f fVar = new f(k0Var, z10, C.TIME_UNSET, C.TIME_UNSET, null);
        if (i()) {
            this.f63436u = fVar;
        } else {
            this.f63437v = fVar;
        }
    }

    public final void a(long j10) {
        k0 k0VarApplyPlaybackParameters;
        if (o()) {
            k0VarApplyPlaybackParameters = this.f63417b.applyPlaybackParameters(d());
        } else {
            k0VarApplyPlaybackParameters = k0.f62782d;
        }
        k0 k0Var = k0VarApplyPlaybackParameters;
        boolean zApplySkipSilenceEnabled = o() ? this.f63417b.applySkipSilenceEnabled(getSkipSilenceEnabled()) : false;
        this.f63425j.add(new f(k0Var, zApplySkipSilenceEnabled, Math.max(0L, j10), this.f63433r.framesToDurationUs(g()), null));
        n();
        h.c cVar = this.f63431p;
        if (cVar != null) {
            cVar.onSkipSilenceEnabledChanged(zApplySkipSilenceEnabled);
        }
    }

    public static Pair<Integer, Integer> a(io.odeeo.internal.b.t tVar, io.odeeo.internal.d.e eVar) {
        if (eVar == null) {
            return null;
        }
        int encoding = io.odeeo.internal.q0.t.getEncoding((String) io.odeeo.internal.q0.a.checkNotNull(tVar.f62971l), tVar.f62968i);
        int iA = 6;
        if (encoding != 5 && encoding != 6 && encoding != 18 && encoding != 17 && encoding != 7 && encoding != 8 && encoding != 14) {
            return null;
        }
        if (encoding == 18 && !eVar.supportsEncoding(18)) {
            encoding = 6;
        } else if (encoding == 8 && !eVar.supportsEncoding(8)) {
            encoding = 7;
        }
        if (!eVar.supportsEncoding(encoding)) {
            return null;
        }
        if (encoding == 18) {
            if (g0.f65861a >= 29 && (iA = a(18, tVar.f62985z)) == 0) {
                io.odeeo.internal.q0.p.w("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            iA = tVar.f62984y;
            if (iA > eVar.getMaxChannelCount()) {
                return null;
            }
        }
        int iB = b(iA);
        if (iB == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(iB));
    }

    public static int a(int i10, int i11) {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(g0.getAudioTrackChannelConfig(i12)).build(), audioAttributesBuild)) {
                return i12;
            }
        }
        return 0;
    }

    public final boolean a(io.odeeo.internal.b.t tVar, io.odeeo.internal.d.d dVar) {
        int encoding;
        int audioTrackChannelConfig;
        int iA;
        if (g0.f65861a < 29 || this.f63427l == 0 || (encoding = io.odeeo.internal.q0.t.getEncoding((String) io.odeeo.internal.q0.a.checkNotNull(tVar.f62971l), tVar.f62968i)) == 0 || (audioTrackChannelConfig = g0.getAudioTrackChannelConfig(tVar.f62984y)) == 0 || (iA = a(b(tVar.f62985z, audioTrackChannelConfig, encoding), dVar.getAudioAttributesV21())) == 0) {
            return false;
        }
        if (iA == 1) {
            return ((tVar.B != 0 || tVar.C != 0) && (this.f63427l == 1)) ? false : true;
        }
        if (iA == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    public final int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = g0.f65861a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && g0.f65864d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    public static boolean a(AudioTrack audioTrack) {
        return g0.f65861a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static int a(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return io.odeeo.internal.d.b.parseAc3SyncframeAudioSampleCount(byteBuffer);
            case 7:
            case 8:
                return o.parseDtsAudioSampleCount(byteBuffer);
            case 9:
                int mpegAudioFrameSampleCount = r.parseMpegAudioFrameSampleCount(g0.getBigEndianInt(byteBuffer, byteBuffer.position()));
                if (mpegAudioFrameSampleCount != -1) {
                    return mpegAudioFrameSampleCount;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException(a.b.e(i10, "Unexpected audio encoding: "));
            case 14:
                int iFindTrueHdSyncframeOffset = io.odeeo.internal.d.b.findTrueHdSyncframeOffset(byteBuffer);
                if (iFindTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return io.odeeo.internal.d.b.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return io.odeeo.internal.d.c.parseAc4SyncframeAudioSampleCount(byteBuffer);
        }
    }

    public static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    public final int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (g0.f65861a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f63439x == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f63439x = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f63439x.putInt(1431633921);
        }
        if (this.f63440y == 0) {
            this.f63439x.putInt(4, i10);
            this.f63439x.putLong(8, j10 * 1000);
            this.f63439x.position(0);
            this.f63440y = i10;
        }
        int iRemaining = this.f63439x.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f63439x, iRemaining, 1);
            if (iWrite < 0) {
                this.f63440y = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA = a(audioTrack, byteBuffer, i10);
        if (iA < 0) {
            this.f63440y = 0;
            return iA;
        }
        this.f63440y -= iA;
        return iA;
    }

    public static void a(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }
}
