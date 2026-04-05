package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class MediaCodecAudioRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c implements com.fyber.inneractive.sdk.player.exoplayer2.util.h {
    public final AudioRendererEventListener.EventDispatcher P;
    public final r Q;
    public boolean R;
    public int S;
    public int T;
    public long U;
    public boolean V;

    public MediaCodecAudioRenderer() {
        super(1, true);
        this.Q = new r(new c[0], new u(this));
        this.P = new AudioRendererEventListener.EventDispatcher(null, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        String str = oVar.f25701f;
        this.Q.getClass();
        String str2 = oVar.f25701f;
        dVar.getClass();
        return com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(false, str2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i10;
        int i11;
        String str = oVar.f25701f;
        if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        int i12 = z.f26070a;
        int i13 = i12 >= 21 ? 16 : 0;
        this.Q.getClass();
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(false, str);
        if (aVarA == null) {
            return 1;
        }
        return ((i12 < 21 || (((i10 = oVar.f25714s) == -1 || aVarA.b(i10)) && ((i11 = oVar.f25713r) == -1 || aVarA.a(i11)))) ? 3 : 2) | i13 | 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean e() {
        if (!this.L) {
            return false;
        }
        r rVar = this.Q;
        if (rVar.d()) {
            return rVar.X && !rVar.c();
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        return this.Q.c() || super.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        try {
            r rVar = this.Q;
            rVar.g();
            for (c cVar : rVar.f24533c) {
                cVar.f();
            }
            rVar.Z = 0;
            rVar.Y = false;
            try {
                this.f25636n = null;
                o();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.f25636n = null;
                o();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() throws IllegalStateException {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.N = decoderCounters;
        this.P.enabled(decoderCounters);
        int i10 = this.f24482b.f25829a;
        if (i10 == 0) {
            r rVar = this.Q;
            if (rVar.f24530a0) {
                rVar.f24530a0 = false;
                rVar.Z = 0;
                rVar.g();
                return;
            }
            return;
        }
        r rVar2 = this.Q;
        rVar2.getClass();
        if (z.f26070a < 21) {
            throw new IllegalStateException();
        }
        if (rVar2.f24530a0 && rVar2.Z == i10) {
            return;
        }
        rVar2.f24530a0 = true;
        rVar2.Z = i10;
        rVar2.g();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() throws IllegalStateException {
        this.Q.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() throws IllegalStateException {
        r rVar = this.Q;
        rVar.Y = false;
        if (rVar.d()) {
            rVar.f24557z = 0L;
            rVar.f24556y = 0;
            rVar.f24555x = 0;
            rVar.A = 0L;
            rVar.B = false;
            rVar.C = 0L;
            rVar.f24538g.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void p() throws IllegalStateException, com.fyber.inneractive.sdk.player.exoplayer2.d {
        try {
            r rVar = this.Q;
            if (!rVar.X && rVar.d() && rVar.a()) {
                rVar.f24538g.a(rVar.b());
                rVar.f24554w = 0;
                rVar.X = true;
            }
        } catch (q e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r4, android.media.MediaCodec r5, com.fyber.inneractive.sdk.player.exoplayer2.o r6) {
        /*
            r3 = this;
            java.lang.String r4 = r4.f25625a
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a
            r1 = 24
            r2 = 0
            if (r0 >= r1) goto L37
            java.lang.String r0 = "OMX.SEC.aac.dec"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26072c
            java.lang.String r0 = "samsung"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26071b
            java.lang.String r0 = "zeroflte"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = "herolte"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L35
            java.lang.String r0 = "heroqlte"
            boolean r4 = r4.startsWith(r0)
            if (r4 == 0) goto L37
        L35:
            r4 = 1
            goto L38
        L37:
            r4 = r2
        L38:
            r3.R = r4
            android.media.MediaFormat r4 = r6.a()
            r6 = 0
            r5.configure(r4, r6, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer.a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a, android.media.MediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long jA = this.Q.a(e());
        if (jA != Long.MIN_VALUE) {
            if (!this.V) {
                jA = Math.max(this.U, jA);
            }
            this.U = jA;
            this.V = false;
        }
        return this.U;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(String str, long j10, long j11) {
        this.P.decoderInitialized(str, j10, j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(oVar);
        this.P.inputFormatChanged(oVar);
        this.S = MimeTypes.AUDIO_RAW.equals(oVar.f25701f) ? oVar.f25715t : 2;
        this.T = oVar.f25713r;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws IllegalStateException, com.fyber.inneractive.sdk.player.exoplayer2.d {
        int[] iArr;
        int i10;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.R && integer == 6 && (i10 = this.T) < 6) {
            iArr = new int[i10];
            for (int i11 = 0; i11 < this.T; i11++) {
                iArr[i11] = i11;
            }
        } else {
            iArr = null;
        }
        try {
            this.Q.a(integer, integer2, this.S, iArr);
        } catch (m e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z10, long j10) throws IllegalStateException, com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(z10, j10);
        this.Q.g();
        this.U = j10;
        this.V = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        return this.Q.a(sVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.Q.f24550s;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j12, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.N.skippedOutputBufferCount++;
            r rVar = this.Q;
            if (rVar.L == 1) {
                rVar.L = 2;
            }
            return true;
        }
        try {
            if (!this.Q.a(byteBuffer, j12)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            this.N.renderedOutputBufferCount++;
            return true;
        } catch (n | q e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i10, Object obj) throws IllegalStateException {
        if (i10 == 2) {
            r rVar = this.Q;
            float fFloatValue = ((Float) obj).floatValue();
            if (rVar.P != fFloatValue) {
                rVar.P = fFloatValue;
                rVar.i();
                return;
            }
            return;
        }
        if (i10 != 3) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        r rVar2 = this.Q;
        if (rVar2.f24545n == iIntValue) {
            return;
        }
        rVar2.f24545n = iIntValue;
        if (rVar2.f24530a0) {
            return;
        }
        rVar2.g();
        rVar2.Z = 0;
    }
}
