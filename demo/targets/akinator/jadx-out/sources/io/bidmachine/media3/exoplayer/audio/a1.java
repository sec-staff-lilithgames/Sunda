package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.bidmachine.media3.exoplayer.u1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import ko.k1;
import mh.g1;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a1 extends xn.w implements io.bidmachine.media3.exoplayer.x0 {
    public final Context H0;
    public final n I0;
    public final v J0;
    public final xn.k K0;
    public int L0;
    public boolean M0;
    public boolean N0;
    public io.bidmachine.media3.common.b O0;
    public io.bidmachine.media3.common.b P0;
    public long Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public int U0;
    public boolean V0;
    public long W0;
    public boolean X0;

    public a1(Context context, xn.z zVar) {
        this(context, zVar, null, null);
    }

    @Override // xn.w
    public final long A(long j10, long j11, boolean z10) {
        if (this.W0 == C.TIME_UNSET) {
            return super.A(j10, j11, z10);
        }
        long audioTrackBufferSizeUs = ((u0) this.J0).getAudioTrackBufferSizeUs();
        if (!this.X0 && audioTrackBufferSizeUs == C.TIME_UNSET) {
            return super.A(j10, j11, z10);
        }
        long jMin = this.W0 - j10;
        if (audioTrackBufferSizeUs != C.TIME_UNSET) {
            jMin = Math.min(audioTrackBufferSizeUs, jMin);
        }
        long jMsToUs = (long) ((jMin / (getPlaybackParameters() != null ? getPlaybackParameters().f57847a : 1.0f)) / 2.0f);
        if (this.V0) {
            jMsToUs -= io.bidmachine.media3.common.util.a1.msToUs(((io.bidmachine.media3.common.util.q0) b()).elapsedRealtime()) - j11;
        }
        return Math.max(10000L, jMsToUs);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    @Override // xn.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xn.l B(xn.s r10, io.bidmachine.media3.common.b r11, android.media.MediaCrypto r12, float r13) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.audio.a1.B(xn.s, io.bidmachine.media3.common.b, android.media.MediaCrypto, float):xn.l");
    }

    @Override // xn.w
    public final void C(nn.g gVar) {
        io.bidmachine.media3.common.b bVar;
        if (io.bidmachine.media3.common.util.a1.f60679a < 29 || (bVar = gVar.f77078c) == null || !Objects.equals(bVar.f60665o, MimeTypes.AUDIO_OPUS) || !this.f92133k0) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) io.bidmachine.media3.common.util.a.checkNotNull(gVar.f77083i);
        int i10 = ((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(gVar.f77078c)).H;
        if (byteBuffer.remaining() == 8) {
            ((u0) this.J0).setOffloadDelayPadding(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
        }
    }

    @Override // xn.w
    public final void I(Exception exc) {
        io.bidmachine.media3.common.util.b0.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.I0.audioCodecError(exc);
    }

    @Override // xn.w
    public final void J(String str, long j10, long j11) {
        this.I0.decoderInitialized(str, j10, j11);
    }

    @Override // xn.w
    public final void K(String str) {
        this.I0.decoderReleased(str);
    }

    @Override // xn.w
    public final io.bidmachine.media3.exoplayer.k L(io.bidmachine.media3.exoplayer.r0 r0Var) throws io.bidmachine.media3.exoplayer.a0 {
        io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(r0Var.f61543b);
        this.O0 = bVar;
        io.bidmachine.media3.exoplayer.k kVarL = super.L(r0Var);
        this.I0.inputFormatChanged(bVar, kVarL);
        return kVarL;
    }

    @Override // xn.w
    public final void M(io.bidmachine.media3.common.b bVar, MediaFormat mediaFormat) throws io.bidmachine.media3.exoplayer.a0 {
        io.bidmachine.media3.common.b bVar2 = this.P0;
        int[] vorbisToAndroidChannelLayoutMapping = null;
        if (bVar2 != null) {
            bVar = bVar2;
        } else if (this.N != null) {
            io.bidmachine.media3.common.util.a.checkNotNull(mediaFormat);
            String str = bVar.f60665o;
            int i10 = bVar.E;
            bVar = new gn.w().setSampleMimeType(MimeTypes.AUDIO_RAW).setPcmEncoding(MimeTypes.AUDIO_RAW.equals(str) ? bVar.G : (io.bidmachine.media3.common.util.a1.f60679a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? io.bidmachine.media3.common.util.a1.getPcmEncoding(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).setEncoderDelay(bVar.H).setEncoderPadding(bVar.I).setMetadata(bVar.f60662l).setCustomData(bVar.f60663m).setId(bVar.f60651a).setLabel(bVar.f60652b).setLabels(bVar.f60653c).setLanguage(bVar.f60654d).setSelectionFlags(bVar.f60655e).setRoleFlags(bVar.f60656f).setChannelCount(mediaFormat.getInteger("channel-count")).setSampleRate(mediaFormat.getInteger("sample-rate")).build();
            if (this.M0 && bVar.E == 6 && i10 < 6) {
                vorbisToAndroidChannelLayoutMapping = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    vorbisToAndroidChannelLayoutMapping[i11] = i11;
                }
            } else if (this.N0) {
                vorbisToAndroidChannelLayoutMapping = k1.getVorbisToAndroidChannelLayoutMapping(bVar.E);
            }
        }
        try {
            int i12 = io.bidmachine.media3.common.util.a1.f60679a;
            v vVar = this.J0;
            if (i12 >= 29) {
                if (!this.f92133k0 || c().f61577a == 0) {
                    ((u0) vVar).setOffloadMode(0);
                } else {
                    ((u0) vVar).setOffloadMode(c().f61577a);
                }
            }
            ((u0) vVar).configure(bVar, 0, vorbisToAndroidChannelLayoutMapping);
        } catch (q e10) {
            throw a(e10, e10.f61006b, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // xn.w
    public final void N(long j10) {
        ((u0) this.J0).setOutputStreamOffsetUs(j10);
    }

    @Override // xn.w
    public final void P() {
        ((u0) this.J0).handleDiscontinuity();
    }

    @Override // xn.w
    public final boolean T(long j10, long j11, xn.p pVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, io.bidmachine.media3.common.b bVar) throws io.bidmachine.media3.exoplayer.a0 {
        io.bidmachine.media3.common.util.a.checkNotNull(byteBuffer);
        this.W0 = C.TIME_UNSET;
        if (this.P0 != null && (i11 & 2) != 0) {
            ((xn.p) io.bidmachine.media3.common.util.a.checkNotNull(pVar)).releaseOutputBuffer(i10, false);
            return true;
        }
        v vVar = this.J0;
        if (z10) {
            if (pVar != null) {
                pVar.releaseOutputBuffer(i10, false);
            }
            this.B0.f61281f += i12;
            ((u0) vVar).handleDiscontinuity();
            return true;
        }
        try {
            if (!((u0) vVar).handleBuffer(byteBuffer, j12, i12)) {
                this.W0 = j12;
                return false;
            }
            if (pVar != null) {
                pVar.releaseOutputBuffer(i10, false);
            }
            this.B0.f61280e += i12;
            return true;
        } catch (r e10) {
            throw a(e10, this.O0, e10.f61011c, (!this.f92133k0 || c().f61577a == 0) ? IronSourceConstants.errorCode_biddingDataException : IronSourceConstants.errorCode_showInProgress);
        } catch (u e11) {
            throw a(e11, bVar, e11.f61018c, (!this.f92133k0 || c().f61577a == 0) ? IronSourceConstants.errorCode_isReadyException : IronSourceConstants.errorCode_loadInProgress);
        }
    }

    @Override // xn.w
    public final void W() throws IllegalStateException, io.bidmachine.media3.exoplayer.a0 {
        try {
            ((u0) this.J0).playToEndOfStream();
            long j10 = this.f92147v0;
            if (j10 != C.TIME_UNSET) {
                this.W0 = j10;
            }
            this.X0 = true;
        } catch (u e10) {
            throw a(e10, e10.f61019e, e10.f61018c, this.f92133k0 ? IronSourceConstants.errorCode_loadInProgress : IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void d() {
        n nVar = this.I0;
        this.S0 = true;
        this.O0 = null;
        this.W0 = C.TIME_UNSET;
        this.X0 = false;
        try {
            ((u0) this.J0).flush();
            try {
                super.d();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.d();
                throw th2;
            } finally {
            }
        }
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void e(boolean z10, boolean z11) throws IllegalStateException {
        super.e(z10, z11);
        this.I0.enabled(this.B0);
        boolean z12 = c().f61578b;
        v vVar = this.J0;
        if (z12) {
            ((u0) vVar).enableTunnelingV21();
        } else {
            ((u0) vVar).disableTunneling();
        }
        u0 u0Var = (u0) vVar;
        u0Var.setPlayerId((on.f0) io.bidmachine.media3.common.util.a.checkNotNull(this.f61241h));
        u0Var.setClock(b());
    }

    @Override // xn.w
    public final boolean e0(io.bidmachine.media3.common.b bVar) {
        if (c().f61577a != 0) {
            int iJ0 = j0(bVar);
            if ((iJ0 & 512) != 0) {
                if (c().f61577a == 2 || (iJ0 & 1024) != 0) {
                    return true;
                }
                if (bVar.H == 0 && bVar.I == 0) {
                    return true;
                }
            }
        }
        return ((u0) this.J0).supportsFormat(bVar);
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        super.enableMayRenderStartOfStream();
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void f(long j10, boolean z10) throws IllegalStateException, io.bidmachine.media3.exoplayer.a0 {
        super.f(j10, z10);
        ((u0) this.J0).flush();
        this.Q0 = j10;
        this.W0 = C.TIME_UNSET;
        this.X0 = false;
        this.T0 = false;
        this.R0 = true;
    }

    @Override // xn.w
    public final int f0(xn.z zVar, io.bidmachine.media3.common.b bVar) throws xn.c0 {
        int iJ0;
        xn.s decryptOnlyDecoderInfo;
        boolean z10;
        String str = bVar.f60665o;
        String str2 = bVar.f60665o;
        if (!gn.x0.isAudio(str)) {
            return u1.create(0);
        }
        int i10 = bVar.N;
        boolean z11 = true;
        boolean z12 = i10 != 0;
        boolean z13 = i10 == 0 || i10 == 2;
        int i11 = 8;
        v vVar = this.J0;
        if (!z13 || (z12 && xn.h0.getDecryptOnlyDecoderInfo() == null)) {
            iJ0 = 0;
        } else {
            iJ0 = j0(bVar);
            if (((u0) vVar).supportsFormat(bVar)) {
                return u1.create(4, 8, 32, iJ0);
            }
        }
        if (MimeTypes.AUDIO_RAW.equals(str2) && !((u0) vVar).supportsFormat(bVar)) {
            return u1.create(1);
        }
        u0 u0Var = (u0) vVar;
        if (!u0Var.supportsFormat(io.bidmachine.media3.common.util.a1.getPcmFormat(2, bVar.E, bVar.F))) {
            return u1.create(1);
        }
        List listOf = str2 == null ? b5.of() : (!u0Var.supportsFormat(bVar) || (decryptOnlyDecoderInfo = xn.h0.getDecryptOnlyDecoderInfo()) == null) ? xn.h0.getDecoderInfosSoftMatch(zVar, bVar, false, false) : b5.of(decryptOnlyDecoderInfo);
        if (listOf.isEmpty()) {
            return u1.create(1);
        }
        if (!z13) {
            return u1.create(2);
        }
        xn.s sVar = (xn.s) listOf.get(0);
        boolean zIsFormatSupported = sVar.isFormatSupported(bVar);
        if (zIsFormatSupported) {
            z10 = true;
            z11 = zIsFormatSupported;
        } else {
            for (int i12 = 1; i12 < listOf.size(); i12++) {
                xn.s sVar2 = (xn.s) listOf.get(i12);
                if (sVar2.isFormatSupported(bVar)) {
                    z10 = false;
                    sVar = sVar2;
                    break;
                }
            }
            z10 = true;
            z11 = zIsFormatSupported;
        }
        int i13 = z11 ? 4 : 3;
        if (z11 && sVar.isSeamlessAdaptationSupported(bVar)) {
            i11 = 16;
        }
        return u1.create(i13, i11, 32, sVar.f92117g ? 64 : 0, z10 ? 128 : 0, iJ0);
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void g() {
        xn.k kVar;
        ((u0) this.J0).release();
        if (io.bidmachine.media3.common.util.a1.f60679a < 35 || (kVar = this.K0) == null) {
            return;
        }
        kVar.release();
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.u1
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public gn.c1 getPlaybackParameters() {
        return ((u0) this.J0).getPlaybackParameters();
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public long getPositionUs() {
        if (getState() == 2) {
            l0();
        }
        return this.Q0;
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void h() throws IllegalStateException {
        v vVar = this.J0;
        this.T0 = false;
        this.W0 = C.TIME_UNSET;
        this.X0 = false;
        try {
            super.h();
        } finally {
            if (this.S0) {
                this.S0 = false;
                ((u0) vVar).reset();
            }
        }
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.n1
    public void handleMessage(int i10, Object obj) throws IllegalStateException, io.bidmachine.media3.exoplayer.a0 {
        xn.k kVar;
        v vVar = this.J0;
        if (i10 == 2) {
            ((u0) vVar).setVolume(((Float) io.bidmachine.media3.common.util.a.checkNotNull(obj)).floatValue());
            return;
        }
        if (i10 == 3) {
            ((u0) vVar).setAudioAttributes((gn.h) io.bidmachine.media3.common.util.a.checkNotNull((gn.h) obj));
            return;
        }
        if (i10 == 6) {
            ((u0) vVar).setAuxEffectInfo((gn.i) io.bidmachine.media3.common.util.a.checkNotNull((gn.i) obj));
            return;
        }
        if (i10 == 12) {
            if (io.bidmachine.media3.common.util.a1.f60679a >= 23) {
                y0.setAudioSinkPreferredDevice(vVar, obj);
                return;
            }
            return;
        }
        if (i10 == 16) {
            this.U0 = ((Integer) io.bidmachine.media3.common.util.a.checkNotNull(obj)).intValue();
            xn.p pVar = this.N;
            if (pVar != null && io.bidmachine.media3.common.util.a1.f60679a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.U0));
                pVar.setParameters(bundle);
                return;
            }
            return;
        }
        if (i10 == 9) {
            ((u0) vVar).setSkipSilenceEnabled(((Boolean) io.bidmachine.media3.common.util.a.checkNotNull(obj)).booleanValue());
            return;
        }
        if (i10 != 10) {
            super.handleMessage(i10, obj);
            return;
        }
        int iIntValue = ((Integer) io.bidmachine.media3.common.util.a.checkNotNull(obj)).intValue();
        ((u0) vVar).setAudioSessionId(iIntValue);
        if (io.bidmachine.media3.common.util.a1.f60679a < 35 || (kVar = this.K0) == null) {
            return;
        }
        kVar.setAudioSessionId(iIntValue);
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z10 = this.T0;
        this.T0 = false;
        return z10;
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void i() throws IllegalStateException {
        ((u0) this.J0).play();
        this.V0 = true;
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isEnded() {
        return super.isEnded() && ((u0) this.J0).isEnded();
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isReady() {
        return ((u0) this.J0).hasPendingData() || super.isReady();
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void j() throws IllegalStateException {
        l0();
        this.V0 = false;
        ((u0) this.J0).pause();
    }

    public final int j0(io.bidmachine.media3.common.b bVar) {
        j formatOffloadSupport = ((u0) this.J0).getFormatOffloadSupport(bVar);
        if (!formatOffloadSupport.f60952a) {
            return 0;
        }
        int i10 = formatOffloadSupport.f60953b ? 1536 : 512;
        return formatOffloadSupport.f60954c ? i10 | 2048 : i10;
    }

    public final int k0(xn.s sVar, io.bidmachine.media3.common.b bVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(sVar.f92111a) || (i10 = io.bidmachine.media3.common.util.a1.f60679a) >= 24 || (i10 == 23 && io.bidmachine.media3.common.util.a1.isTv(this.H0))) {
            return bVar.f60666p;
        }
        return -1;
    }

    public final void l0() {
        long currentPositionUs = ((u0) this.J0).getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.R0) {
                currentPositionUs = Math.max(this.Q0, currentPositionUs);
            }
            this.Q0 = currentPositionUs;
            this.R0 = false;
        }
    }

    @Override // xn.w
    public final io.bidmachine.media3.exoplayer.k n(xn.s sVar, io.bidmachine.media3.common.b bVar, io.bidmachine.media3.common.b bVar2) {
        io.bidmachine.media3.exoplayer.k kVarCanReuseCodec = sVar.canReuseCodec(bVar, bVar2);
        int i10 = kVarCanReuseCodec.f61297e;
        if (this.H == null && e0(bVar2)) {
            i10 |= 32768;
        }
        if (k0(sVar, bVar2) > this.L0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new io.bidmachine.media3.exoplayer.k(sVar.f92111a, bVar, bVar2, i11 != 0 ? 0 : kVarCanReuseCodec.f61296d, i11);
    }

    @Override // io.bidmachine.media3.exoplayer.x0
    public void setPlaybackParameters(gn.c1 c1Var) {
        ((u0) this.J0).setPlaybackParameters(c1Var);
    }

    @Override // xn.w
    public final float y(float f10, io.bidmachine.media3.common.b[] bVarArr) {
        int iMax = -1;
        for (io.bidmachine.media3.common.b bVar : bVarArr) {
            int i10 = bVar.F;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // xn.w
    public final List z(xn.z zVar, io.bidmachine.media3.common.b bVar, boolean z10) {
        xn.s decryptOnlyDecoderInfo;
        return xn.h0.getDecoderInfosSortedByFormatSupport(bVar.f60665o == null ? b5.of() : (!((u0) this.J0).supportsFormat(bVar) || (decryptOnlyDecoderInfo = xn.h0.getDecryptOnlyDecoderInfo()) == null) ? xn.h0.getDecoderInfosSoftMatch(zVar, bVar, z10, false) : b5.of(decryptOnlyDecoderInfo), bVar);
    }

    public a1(Context context, xn.z zVar, Handler handler, o oVar) {
        this(context, zVar, handler, oVar, new k0(context).build());
    }

    @Deprecated
    public a1(Context context, xn.z zVar, Handler handler, o oVar, d dVar, hn.h... hVarArr) {
        this(context, zVar, handler, oVar, new k0().setAudioCapabilities((d) g1.firstNonNull(dVar, d.f60913c)).setAudioProcessors(hVarArr).build());
    }

    public a1(Context context, xn.z zVar, Handler handler, o oVar, v vVar) {
        this(context, xn.m.getDefault(context), zVar, false, handler, oVar, vVar);
    }

    public a1(Context context, xn.z zVar, boolean z10, Handler handler, o oVar, v vVar) {
        this(context, xn.m.getDefault(context), zVar, z10, handler, oVar, vVar);
    }

    public a1(Context context, xn.m mVar, xn.z zVar, boolean z10, Handler handler, o oVar, v vVar) {
        this(context, mVar, zVar, z10, handler, oVar, vVar, io.bidmachine.media3.common.util.a1.f60679a >= 35 ? new xn.k() : null);
    }

    public a1(Context context, xn.m mVar, xn.z zVar, boolean z10, Handler handler, o oVar, v vVar, xn.k kVar) {
        super(1, mVar, zVar, z10, 44100.0f);
        this.H0 = context.getApplicationContext();
        this.J0 = vVar;
        this.K0 = kVar;
        this.U0 = -1000;
        this.I0 = new n(handler, oVar);
        this.W0 = C.TIME_UNSET;
        ((u0) vVar).setListener(new z0(this));
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public io.bidmachine.media3.exoplayer.x0 getMediaClock() {
        return this;
    }
}
