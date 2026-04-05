package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.l2;
import com.google.android.exoplayer2.y2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i1 extends qe.t implements com.google.android.exoplayer2.util.h0 {
    public final Context H0;
    public final a0 I0;
    public final h0 J0;
    public int K0;
    public boolean L0;
    public com.google.android.exoplayer2.z0 M0;
    public com.google.android.exoplayer2.z0 N0;
    public long O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public y2 T0;

    public i1(Context context, qe.v vVar) {
        this(context, vVar, null, null);
    }

    @Override // qe.t
    public final void C(Exception exc) {
        com.google.android.exoplayer2.util.f0.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.I0.audioCodecError(exc);
    }

    @Override // qe.t
    public final void D(String str, long j10, long j11) {
        this.I0.decoderInitialized(str, j10, j11);
    }

    @Override // qe.t
    public final void E(String str) {
        this.I0.decoderReleased(str);
    }

    @Override // qe.t
    public final ce.k F(com.google.android.exoplayer2.a1 a1Var) throws Exception {
        this.M0 = (com.google.android.exoplayer2.z0) com.google.android.exoplayer2.util.a.checkNotNull(a1Var.f27030b);
        ce.k kVarF = super.F(a1Var);
        this.I0.inputFormatChanged(this.M0, kVarF);
        return kVarF;
    }

    @Override // qe.t
    public final void G(com.google.android.exoplayer2.z0 z0Var, MediaFormat mediaFormat) throws com.google.android.exoplayer2.r {
        com.google.android.exoplayer2.z0 z0Var2 = this.N0;
        int[] iArr = null;
        if (z0Var2 != null) {
            z0Var = z0Var2;
        } else if (this.L != null) {
            String str = z0Var.f28802n;
            int i10 = z0Var.A;
            z0Var = new com.google.android.exoplayer2.y0().setSampleMimeType(MimeTypes.AUDIO_RAW).setPcmEncoding(MimeTypes.AUDIO_RAW.equals(str) ? z0Var.C : (com.google.android.exoplayer2.util.n1.f28506a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? com.google.android.exoplayer2.util.n1.getPcmEncoding(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).setEncoderDelay(z0Var.D).setEncoderPadding(z0Var.E).setChannelCount(mediaFormat.getInteger("channel-count")).setSampleRate(mediaFormat.getInteger("sample-rate")).build();
            if (this.L0 && z0Var.A == 6 && i10 < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            }
        }
        try {
            ((c1) this.J0).configure(z0Var, 0, iArr);
        } catch (c0 e10) {
            throw a(e10, e10.f27060b, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    @Override // qe.t
    public final void H(long j10) {
        ((c1) this.J0).setOutputStreamOffsetUs(j10);
    }

    @Override // qe.t
    public final void J() {
        ((c1) this.J0).handleDiscontinuity();
    }

    @Override // qe.t
    public final void K(ce.h hVar) {
        if (!this.P0 || hVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(hVar.f12239g - this.O0) > 500000) {
            this.O0 = hVar.f12239g;
        }
        this.P0 = false;
    }

    @Override // qe.t
    public final boolean N(long j10, long j11, qe.o oVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, com.google.android.exoplayer2.z0 z0Var) throws com.google.android.exoplayer2.r {
        com.google.android.exoplayer2.util.a.checkNotNull(byteBuffer);
        if (this.N0 != null && (i11 & 2) != 0) {
            ((qe.o) com.google.android.exoplayer2.util.a.checkNotNull(oVar)).releaseOutputBuffer(i10, false);
            return true;
        }
        h0 h0Var = this.J0;
        if (z10) {
            if (oVar != null) {
                oVar.releaseOutputBuffer(i10, false);
            }
            this.C0.f12229f += i12;
            ((c1) h0Var).handleDiscontinuity();
            return true;
        }
        try {
            if (!((c1) h0Var).handleBuffer(byteBuffer, j12, i12)) {
                return false;
            }
            if (oVar != null) {
                oVar.releaseOutputBuffer(i10, false);
            }
            this.C0.f12228e += i12;
            return true;
        } catch (d0 e10) {
            throw a(e10, this.M0, e10.f27104c, IronSourceConstants.errorCode_biddingDataException);
        } catch (g0 e11) {
            throw a(e11, z0Var, e11.f27125c, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // qe.t
    public final void Q() throws IllegalStateException, com.google.android.exoplayer2.r {
        try {
            ((c1) this.J0).playToEndOfStream();
        } catch (g0 e10) {
            throw a(e10, e10.f27126e, e10.f27125c, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // qe.t
    public final boolean W(com.google.android.exoplayer2.z0 z0Var) {
        return ((c1) this.J0).supportsFormat(z0Var);
    }

    @Override // qe.t
    public final int X(qe.v vVar, com.google.android.exoplayer2.z0 z0Var) throws qe.x {
        qe.r decryptOnlyDecoderInfo;
        boolean z10;
        String str = z0Var.f28802n;
        String str2 = z0Var.f28802n;
        if (!com.google.android.exoplayer2.util.l0.isAudio(str)) {
            return b3.create(0);
        }
        int i10 = com.google.android.exoplayer2.util.n1.f28506a >= 21 ? 32 : 0;
        int i11 = z0Var.I;
        boolean z11 = true;
        boolean z12 = i11 != 0;
        boolean z13 = i11 == 0 || i11 == 2;
        int i12 = 8;
        h0 h0Var = this.J0;
        if (z13 && ((c1) h0Var).supportsFormat(z0Var) && (!z12 || qe.c0.getDecryptOnlyDecoderInfo() != null)) {
            return b3.create(4, 8, i10);
        }
        if (MimeTypes.AUDIO_RAW.equals(str2) && !((c1) h0Var).supportsFormat(z0Var)) {
            return b3.create(1);
        }
        c1 c1Var = (c1) h0Var;
        if (!c1Var.supportsFormat(com.google.android.exoplayer2.util.n1.getPcmFormat(2, z0Var.A, z0Var.B))) {
            return b3.create(1);
        }
        List listOf = str2 == null ? b5.of() : (!c1Var.supportsFormat(z0Var) || (decryptOnlyDecoderInfo = qe.c0.getDecryptOnlyDecoderInfo()) == null) ? qe.c0.getDecoderInfosSoftMatch(vVar, z0Var, false, false) : b5.of(decryptOnlyDecoderInfo);
        if (listOf.isEmpty()) {
            return b3.create(1);
        }
        if (!z13) {
            return b3.create(2);
        }
        qe.r rVar = (qe.r) listOf.get(0);
        boolean zIsFormatSupported = rVar.isFormatSupported(z0Var);
        if (zIsFormatSupported) {
            z10 = true;
            z11 = zIsFormatSupported;
        } else {
            for (int i13 = 1; i13 < listOf.size(); i13++) {
                qe.r rVar2 = (qe.r) listOf.get(i13);
                if (rVar2.isFormatSupported(z0Var)) {
                    z10 = false;
                    rVar = rVar2;
                    break;
                }
            }
            z10 = true;
            z11 = zIsFormatSupported;
        }
        int i14 = z11 ? 4 : 3;
        if (z11 && rVar.isSeamlessAdaptationSupported(z0Var)) {
            i12 = 16;
        }
        return b3.create(i14, i12, i10, rVar.f82856g ? 64 : 0, z10 ? 128 : 0);
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void b() {
        a0 a0Var = this.I0;
        this.R0 = true;
        this.M0 = null;
        try {
            ((c1) this.J0).flush();
            try {
                super.b();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.b();
                throw th2;
            } finally {
            }
        }
    }

    public final int b0(qe.r rVar, com.google.android.exoplayer2.z0 z0Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(rVar.f82850a) || (i10 = com.google.android.exoplayer2.util.n1.f28506a) >= 24 || (i10 == 23 && com.google.android.exoplayer2.util.n1.isTv(this.H0))) {
            return z0Var.f28803o;
        }
        return -1;
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void c(boolean z10, boolean z11) throws IllegalStateException {
        super.c(z10, z11);
        this.I0.enabled(this.C0);
        boolean z12 = ((c3) com.google.android.exoplayer2.util.a.checkNotNull(this.f27450f)).f27356a;
        h0 h0Var = this.J0;
        if (z12) {
            ((c1) h0Var).enableTunnelingV21();
        } else {
            ((c1) h0Var).disableTunneling();
        }
        ((c1) h0Var).setPlayerId((zd.c0) com.google.android.exoplayer2.util.a.checkNotNull(this.f27452h));
    }

    public final void c0() {
        long currentPositionUs = ((c1) this.J0).getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.Q0) {
                currentPositionUs = Math.max(this.O0, currentPositionUs);
            }
            this.O0 = currentPositionUs;
            this.Q0 = false;
        }
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void d(long j10, boolean z10) throws Exception {
        super.d(j10, z10);
        boolean z11 = this.S0;
        h0 h0Var = this.J0;
        if (z11) {
            ((c1) h0Var).experimentalFlushWithoutAudioTrackRelease();
        } else {
            ((c1) h0Var).flush();
        }
        this.O0 = j10;
        this.P0 = true;
        this.Q0 = true;
    }

    @Override // com.google.android.exoplayer2.f
    public final void e() {
        ((c1) this.J0).release();
    }

    public void experimentalSetEnableKeepAudioTrackOnSeek(boolean z10) {
        this.S0 = z10;
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void f() throws IllegalStateException {
        h0 h0Var = this.J0;
        try {
            super.f();
        } finally {
            if (this.R0) {
                this.R0 = false;
                ((c1) h0Var).reset();
            }
        }
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void g() throws IllegalStateException {
        ((c1) this.J0).play();
    }

    @Override // qe.t, com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2, com.google.android.exoplayer2.b3
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.util.h0
    public l2 getPlaybackParameters() {
        return ((c1) this.J0).getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.util.h0
    public long getPositionUs() {
        if (getState() == 2) {
            c0();
        }
        return this.O0;
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void h() throws IllegalStateException {
        c0();
        ((c1) this.J0).pause();
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2, com.google.android.exoplayer2.t2
    public void handleMessage(int i10, Object obj) throws IllegalStateException, com.google.android.exoplayer2.r {
        h0 h0Var = this.J0;
        if (i10 == 2) {
            ((c1) h0Var).setVolume(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            ((c1) h0Var).setAudioAttributes((k) obj);
            return;
        }
        if (i10 == 6) {
            ((c1) h0Var).setAuxEffectInfo((l0) obj);
            return;
        }
        switch (i10) {
            case 9:
                ((c1) h0Var).setSkipSilenceEnabled(((Boolean) obj).booleanValue());
                break;
            case 10:
                ((c1) h0Var).setAudioSessionId(((Integer) obj).intValue());
                break;
            case 11:
                this.T0 = (y2) obj;
                break;
            case 12:
                if (com.google.android.exoplayer2.util.n1.f28506a >= 23) {
                    g1.setAudioSinkPreferredDevice(h0Var, obj);
                    break;
                }
                break;
            default:
                super.handleMessage(i10, obj);
                break;
        }
    }

    @Override // qe.t, com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isEnded() {
        return super.isEnded() && ((c1) this.J0).isEnded();
    }

    @Override // qe.t, com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isReady() {
        return ((c1) this.J0).hasPendingData() || super.isReady();
    }

    @Override // qe.t
    public final ce.k l(qe.r rVar, com.google.android.exoplayer2.z0 z0Var, com.google.android.exoplayer2.z0 z0Var2) {
        ce.k kVarCanReuseCodec = rVar.canReuseCodec(z0Var, z0Var2);
        int i10 = kVarCanReuseCodec.f12248e;
        if (this.F == null && W(z0Var2)) {
            i10 |= 32768;
        }
        if (b0(rVar, z0Var2) > this.K0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new ce.k(rVar.f82850a, z0Var, z0Var2, i11 != 0 ? 0 : kVarCanReuseCodec.f12247d, i11);
    }

    @Override // com.google.android.exoplayer2.util.h0
    public void setPlaybackParameters(l2 l2Var) {
        ((c1) this.J0).setPlaybackParameters(l2Var);
    }

    @Override // qe.t
    public final float v(float f10, com.google.android.exoplayer2.z0[] z0VarArr) {
        int iMax = -1;
        for (com.google.android.exoplayer2.z0 z0Var : z0VarArr) {
            int i10 = z0Var.B;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // qe.t
    public final List w(qe.v vVar, com.google.android.exoplayer2.z0 z0Var, boolean z10) {
        qe.r decryptOnlyDecoderInfo;
        return qe.c0.getDecoderInfosSortedByFormatSupport(z0Var.f28802n == null ? b5.of() : (!((c1) this.J0).supportsFormat(z0Var) || (decryptOnlyDecoderInfo = qe.c0.getDecryptOnlyDecoderInfo()) == null) ? qe.c0.getDecoderInfosSoftMatch(vVar, z0Var, z10, false) : b5.of(decryptOnlyDecoderInfo), z0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    @Override // qe.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qe.l x(qe.r r10, com.google.android.exoplayer2.z0 r11, android.media.MediaCrypto r12, float r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.i1.x(qe.r, com.google.android.exoplayer2.z0, android.media.MediaCrypto, float):qe.l");
    }

    public i1(Context context, qe.v vVar, Handler handler, b0 b0Var) {
        this(context, vVar, handler, b0Var, n.f27212c, new u[0]);
    }

    public i1(Context context, qe.v vVar, Handler handler, b0 b0Var, n nVar, u... uVarArr) {
        this(context, vVar, handler, b0Var, new u0().setAudioCapabilities((n) mh.g1.firstNonNull(nVar, n.f27212c)).setAudioProcessors(uVarArr).build());
    }

    public i1(Context context, qe.v vVar, Handler handler, b0 b0Var, h0 h0Var) {
        this(context, qe.m.f82848a, vVar, false, handler, b0Var, h0Var);
    }

    public i1(Context context, qe.v vVar, boolean z10, Handler handler, b0 b0Var, h0 h0Var) {
        this(context, qe.m.f82848a, vVar, z10, handler, b0Var, h0Var);
    }

    public i1(Context context, qe.m mVar, qe.v vVar, boolean z10, Handler handler, b0 b0Var, h0 h0Var) {
        super(1, mVar, vVar, z10, 44100.0f);
        this.H0 = context.getApplicationContext();
        this.J0 = h0Var;
        this.I0 = new a0(handler, b0Var);
        ((c1) h0Var).setListener(new h1(this));
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public com.google.android.exoplayer2.util.h0 getMediaClock() {
        return this;
    }
}
