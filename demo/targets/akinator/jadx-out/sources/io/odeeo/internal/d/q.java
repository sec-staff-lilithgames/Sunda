package io.odeeo.internal.d;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.odeeo.internal.b.k0;
import io.odeeo.internal.b.p0;
import io.odeeo.internal.b.q0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.d.g;
import io.odeeo.internal.d.h;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.r.h;
import io.odeeo.internal.r.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q extends io.odeeo.internal.r.k implements io.odeeo.internal.q0.r {
    public final Context G0;
    public final g.a H0;
    public final h I0;
    public int J0;
    public boolean K0;
    public io.odeeo.internal.b.t L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public p0.a R0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements h.c {
        public b() {
        }

        @Override // io.odeeo.internal.d.h.c
        public void onAudioSinkError(Exception exc) {
            io.odeeo.internal.q0.p.e("MediaCodecAudioRenderer", "Audio sink error", exc);
            q.this.H0.audioSinkError(exc);
        }

        @Override // io.odeeo.internal.d.h.c
        public void onOffloadBufferEmptying() {
            if (q.this.R0 != null) {
                q.this.R0.onWakeup();
            }
        }

        @Override // io.odeeo.internal.d.h.c
        public void onOffloadBufferFull(long j10) {
            if (q.this.R0 != null) {
                q.this.R0.onSleep(j10);
            }
        }

        @Override // io.odeeo.internal.d.h.c
        public void onPositionAdvancing(long j10) {
            q.this.H0.positionAdvancing(j10);
        }

        @Override // io.odeeo.internal.d.h.c
        public void onPositionDiscontinuity() {
            q.this.N();
        }

        @Override // io.odeeo.internal.d.h.c
        public void onSkipSilenceEnabledChanged(boolean z10) {
            q.this.H0.skipSilenceEnabledChanged(z10);
        }

        @Override // io.odeeo.internal.d.h.c
        public void onUnderrun(int i10, long j10, long j11) {
            q.this.H0.underrun(i10, j10, j11);
        }
    }

    public q(Context context, io.odeeo.internal.r.l lVar) {
        this(context, lVar, null, null);
    }

    public static boolean M() {
        if (g0.f65861a != 23) {
            return false;
        }
        String str = g0.f65864d;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    @Override // io.odeeo.internal.r.k
    public void A() {
        super.A();
        this.I0.handleDiscontinuity();
    }

    @Override // io.odeeo.internal.r.k
    public void F() throws io.odeeo.internal.b.n {
        try {
            this.I0.playToEndOfStream();
        } catch (h.e e10) {
            throw a(e10, e10.f63366c, e10.f63365b, IronSourceConstants.errorCode_isReadyException);
        }
    }

    public void N() {
        this.O0 = true;
    }

    public final void O() {
        long currentPositionUs = this.I0.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.O0) {
                currentPositionUs = Math.max(this.M0, currentPositionUs);
            }
            this.M0 = currentPositionUs;
            this.O0 = false;
        }
    }

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean z10) {
        this.Q0 = z10;
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void f() {
        this.P0 = true;
        try {
            this.I0.flush();
            try {
                super.f();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.f();
                throw th2;
            } finally {
            }
        }
    }

    @Override // io.odeeo.internal.r.k
    public void g(String str) {
        this.H0.decoderReleased(str);
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0, io.odeeo.internal.b.q0
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // io.odeeo.internal.q0.r
    public k0 getPlaybackParameters() {
        return this.I0.getPlaybackParameters();
    }

    @Override // io.odeeo.internal.q0.r
    public long getPositionUs() {
        if (getState() == 2) {
            O();
        }
        return this.M0;
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void h() {
        super.h();
        this.I0.play();
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0, io.odeeo.internal.b.m0.b
    public void handleMessage(int i10, Object obj) throws io.odeeo.internal.b.n {
        if (i10 == 2) {
            this.I0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.I0.setAudioAttributes((d) obj);
            return;
        }
        if (i10 == 6) {
            this.I0.setAuxEffectInfo((k) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.I0.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.I0.setAudioSessionId(((Integer) obj).intValue());
                break;
            case 11:
                this.R0 = (p0.a) obj;
                break;
            default:
                super.handleMessage(i10, obj);
                break;
        }
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void i() {
        O();
        this.I0.pause();
        super.i();
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isEnded() {
        return super.isEnded() && this.I0.isEnded();
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isReady() {
        return this.I0.hasPendingData() || super.isReady();
    }

    @Override // io.odeeo.internal.q0.r
    public void setPlaybackParameters(k0 k0Var) {
        this.I0.setPlaybackParameters(k0Var);
    }

    public q(Context context, io.odeeo.internal.r.l lVar, Handler handler, g gVar) {
        this(context, lVar, handler, gVar, (e) null, new f[0]);
    }

    @Override // io.odeeo.internal.r.k
    public int a(io.odeeo.internal.r.l lVar, io.odeeo.internal.b.t tVar) throws m.c {
        if (!io.odeeo.internal.q0.t.isAudio(tVar.f62971l)) {
            return q0.create(0);
        }
        int i10 = g0.f65861a >= 21 ? 32 : 0;
        boolean z10 = tVar.E != 0;
        boolean zC = io.odeeo.internal.r.k.c(tVar);
        int i11 = 8;
        if (zC && this.I0.supportsFormat(tVar) && (!z10 || io.odeeo.internal.r.m.getDecryptOnlyDecoderInfo() != null)) {
            return q0.create(4, 8, i10);
        }
        if (MimeTypes.AUDIO_RAW.equals(tVar.f62971l) && !this.I0.supportsFormat(tVar)) {
            return q0.create(1);
        }
        if (!this.I0.supportsFormat(g0.getPcmFormat(2, tVar.f62984y, tVar.f62985z))) {
            return q0.create(1);
        }
        List<io.odeeo.internal.r.j> listA = a(lVar, tVar, false);
        if (listA.isEmpty()) {
            return q0.create(1);
        }
        if (!zC) {
            return q0.create(2);
        }
        io.odeeo.internal.r.j jVar = listA.get(0);
        boolean zIsFormatSupported = jVar.isFormatSupported(tVar);
        if (zIsFormatSupported && jVar.isSeamlessAdaptationSupported(tVar)) {
            i11 = 16;
        }
        return q0.create(zIsFormatSupported ? 4 : 3, i11, i10);
    }

    @Override // io.odeeo.internal.r.k
    public boolean b(io.odeeo.internal.b.t tVar) {
        return this.I0.supportsFormat(tVar);
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void g() {
        try {
            super.g();
        } finally {
            if (this.P0) {
                this.P0 = false;
                this.I0.reset();
            }
        }
    }

    public q(Context context, io.odeeo.internal.r.l lVar, Handler handler, g gVar, e eVar, f... fVarArr) {
        this(context, lVar, handler, gVar, new n(eVar, fVarArr));
    }

    public static boolean h(String str) {
        if (g0.f65861a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(g0.f65863c)) {
            return false;
        }
        String str2 = g0.f65862b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    @Override // io.odeeo.internal.r.k
    public void b(io.odeeo.internal.e.g gVar) {
        if (!this.N0 || gVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(gVar.f63707e - this.M0) > 500000) {
            this.M0 = gVar.f63707e;
        }
        this.N0 = false;
    }

    public q(Context context, io.odeeo.internal.r.l lVar, Handler handler, g gVar, h hVar) {
        this(context, h.b.f66053a, lVar, false, handler, gVar, hVar);
    }

    public q(Context context, io.odeeo.internal.r.l lVar, boolean z10, Handler handler, g gVar, h hVar) {
        this(context, h.b.f66053a, lVar, z10, handler, gVar, hVar);
    }

    public q(Context context, h.b bVar, io.odeeo.internal.r.l lVar, boolean z10, Handler handler, g gVar, h hVar) {
        super(1, bVar, lVar, z10, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = hVar;
        this.H0 = new g.a(handler, gVar);
        hVar.setListener(new b());
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public io.odeeo.internal.q0.r getMediaClock() {
        return this;
    }

    @Override // io.odeeo.internal.r.k
    public List<io.odeeo.internal.r.j> a(io.odeeo.internal.r.l lVar, io.odeeo.internal.b.t tVar, boolean z10) throws m.c {
        io.odeeo.internal.r.j decryptOnlyDecoderInfo;
        String str = tVar.f62971l;
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        if (this.I0.supportsFormat(tVar) && (decryptOnlyDecoderInfo = io.odeeo.internal.r.m.getDecryptOnlyDecoderInfo()) != null) {
            return Collections.singletonList(decryptOnlyDecoderInfo);
        }
        List<io.odeeo.internal.r.j> decoderInfosSortedByFormatSupport = io.odeeo.internal.r.m.getDecoderInfosSortedByFormatSupport(lVar.getDecoderInfos(str, z10, false), tVar);
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            ArrayList arrayList = new ArrayList(decoderInfosSortedByFormatSupport);
            arrayList.addAll(lVar.getDecoderInfos(MimeTypes.AUDIO_E_AC3, z10, false));
            decoderInfosSortedByFormatSupport = arrayList;
        }
        return Collections.unmodifiableList(decoderInfosSortedByFormatSupport);
    }

    @Override // io.odeeo.internal.r.k
    public h.a a(io.odeeo.internal.r.j jVar, io.odeeo.internal.b.t tVar, MediaCrypto mediaCrypto, float f10) {
        this.J0 = a(jVar, tVar, d());
        this.K0 = h(jVar.f66056a);
        MediaFormat mediaFormatA = a(tVar, jVar.f66058c, this.J0, f10);
        this.L0 = (!MimeTypes.AUDIO_RAW.equals(jVar.f66057b) || MimeTypes.AUDIO_RAW.equals(tVar.f62971l)) ? null : tVar;
        return h.a.createForAudioDecoding(jVar, mediaFormatA, tVar, mediaCrypto);
    }

    @Override // io.odeeo.internal.r.k
    public io.odeeo.internal.e.i a(io.odeeo.internal.r.j jVar, io.odeeo.internal.b.t tVar, io.odeeo.internal.b.t tVar2) {
        io.odeeo.internal.e.i iVarCanReuseCodec = jVar.canReuseCodec(tVar, tVar2);
        int i10 = iVarCanReuseCodec.f63719e;
        if (a(jVar, tVar2) > this.J0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new io.odeeo.internal.e.i(jVar.f66056a, tVar, tVar2, i11 != 0 ? 0 : iVarCanReuseCodec.f63718d, i11);
    }

    @Override // io.odeeo.internal.r.k
    public float a(float f10, io.odeeo.internal.b.t tVar, io.odeeo.internal.b.t[] tVarArr) {
        int iMax = -1;
        for (io.odeeo.internal.b.t tVar2 : tVarArr) {
            int i10 = tVar2.f62985z;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // io.odeeo.internal.r.k
    public void a(String str, long j10, long j11) {
        this.H0.decoderInitialized(str, j10, j11);
    }

    @Override // io.odeeo.internal.r.k
    public void a(Exception exc) {
        io.odeeo.internal.q0.p.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.H0.audioCodecError(exc);
    }

    @Override // io.odeeo.internal.r.k
    public io.odeeo.internal.e.i a(io.odeeo.internal.b.u uVar) throws io.odeeo.internal.b.n {
        io.odeeo.internal.e.i iVarA = super.a(uVar);
        this.H0.inputFormatChanged(uVar.f63020b, iVarA);
        return iVarA;
    }

    @Override // io.odeeo.internal.r.k
    public void a(io.odeeo.internal.b.t tVar, MediaFormat mediaFormat) throws io.odeeo.internal.b.n {
        int pcmEncoding;
        int i10;
        io.odeeo.internal.b.t tVar2 = this.L0;
        int[] iArr = null;
        if (tVar2 != null) {
            tVar = tVar2;
        } else if (s() != null) {
            if (MimeTypes.AUDIO_RAW.equals(tVar.f62971l)) {
                pcmEncoding = tVar.A;
            } else if (g0.f65861a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                pcmEncoding = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                pcmEncoding = g0.getPcmEncoding(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                pcmEncoding = MimeTypes.AUDIO_RAW.equals(tVar.f62971l) ? tVar.A : 2;
            }
            io.odeeo.internal.b.t tVarBuild = new t.b().setSampleMimeType(MimeTypes.AUDIO_RAW).setPcmEncoding(pcmEncoding).setEncoderDelay(tVar.B).setEncoderPadding(tVar.C).setChannelCount(mediaFormat.getInteger("channel-count")).setSampleRate(mediaFormat.getInteger("sample-rate")).build();
            if (this.K0 && tVarBuild.f62984y == 6 && (i10 = tVar.f62984y) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < tVar.f62984y; i11++) {
                    iArr[i11] = i11;
                }
            }
            tVar = tVarBuild;
        }
        try {
            this.I0.configure(tVar, 0, iArr);
        } catch (h.a e10) {
            throw a(e10, e10.f63358a, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void a(boolean z10, boolean z11) throws io.odeeo.internal.b.n {
        super.a(z10, z11);
        this.H0.enabled(this.B0);
        if (a().f62958a) {
            this.I0.enableTunnelingV21();
        } else {
            this.I0.disableTunneling();
        }
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void a(long j10, boolean z10) throws io.odeeo.internal.b.n {
        super.a(j10, z10);
        if (this.Q0) {
            this.I0.experimentalFlushWithoutAudioTrackRelease();
        } else {
            this.I0.flush();
        }
        this.M0 = j10;
        this.N0 = true;
        this.O0 = true;
    }

    @Override // io.odeeo.internal.r.k
    public boolean a(long j10, long j11, io.odeeo.internal.r.h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, io.odeeo.internal.b.t tVar) throws io.odeeo.internal.b.n {
        io.odeeo.internal.q0.a.checkNotNull(byteBuffer);
        if (this.L0 != null && (i11 & 2) != 0) {
            ((io.odeeo.internal.r.h) io.odeeo.internal.q0.a.checkNotNull(hVar)).releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            if (hVar != null) {
                hVar.releaseOutputBuffer(i10, false);
            }
            this.B0.f63698f += i12;
            this.I0.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.I0.handleBuffer(byteBuffer, j12, i12)) {
                return false;
            }
            if (hVar != null) {
                hVar.releaseOutputBuffer(i10, false);
            }
            this.B0.f63697e += i12;
            return true;
        } catch (h.b e10) {
            throw a(e10, e10.f63361c, e10.f63360b, IronSourceConstants.errorCode_biddingDataException);
        } catch (h.e e11) {
            throw a(e11, tVar, e11.f63365b, IronSourceConstants.errorCode_isReadyException);
        }
    }

    public int a(io.odeeo.internal.r.j jVar, io.odeeo.internal.b.t tVar, io.odeeo.internal.b.t[] tVarArr) {
        int iA = a(jVar, tVar);
        if (tVarArr.length == 1) {
            return iA;
        }
        for (io.odeeo.internal.b.t tVar2 : tVarArr) {
            if (jVar.canReuseCodec(tVar, tVar2).f63718d != 0) {
                iA = Math.max(iA, a(jVar, tVar2));
            }
        }
        return iA;
    }

    public final int a(io.odeeo.internal.r.j jVar, io.odeeo.internal.b.t tVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(jVar.f66056a) || (i10 = g0.f65861a) >= 24 || (i10 == 23 && g0.isTv(this.G0))) {
            return tVar.f62972m;
        }
        return -1;
    }

    public MediaFormat a(io.odeeo.internal.b.t tVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", tVar.f62984y);
        mediaFormat.setInteger("sample-rate", tVar.f62985z);
        io.odeeo.internal.q0.s.setCsdBuffers(mediaFormat, tVar.f62973n);
        io.odeeo.internal.q0.s.maybeSetInteger(mediaFormat, "max-input-size", i10);
        int i11 = g0.f65861a;
        if (i11 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f && !M()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(tVar.f62971l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.I0.getFormatSupport(g0.getPcmFormat(4, tVar.f62984y, tVar.f62985z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }
}
