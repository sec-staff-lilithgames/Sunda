package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.beta.xyn.RnJusJ;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class MediaCodecVideoRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c {

    /* renamed from: q0, reason: collision with root package name */
    public static final int[] f26083q0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};
    public final h P;
    public final VideoRendererEventListener.EventDispatcher Q;
    public final long R;
    public final int S;
    public final boolean T;
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] U;
    public e V;
    public Surface W;
    public int X;
    public boolean Y;
    public long Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f26084a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f26085b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f26086c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f26087d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f26088e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f26089f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f26090g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f26091h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f26092i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f26093j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f26094k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f26095l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f26096m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f26097n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f26098o0;

    /* renamed from: p0, reason: collision with root package name */
    public f f26099p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecVideoRenderer(Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, false);
        boolean z10 = false;
        this.R = 5000L;
        this.S = -1;
        this.P = new h();
        this.Q = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        if (z.f26070a <= 22 && "foster".equals(z.f26071b) && "NVIDIA".equals(z.f26072c)) {
            z10 = true;
        }
        this.T = z10;
        this.Z = C.TIME_UNSET;
        this.f26089f0 = -1;
        this.f26090g0 = -1;
        this.f26092i0 = -1.0f;
        this.f26088e0 = -1.0f;
        this.X = 1;
        this.f26093j0 = -1;
        this.f26094k0 = -1;
        this.f26096m0 = -1.0f;
        this.f26095l0 = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr) {
        this.U = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        int i10;
        int i11;
        String str = oVar.f25701f;
        if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar2 = oVar.f25704i;
        if (dVar2 != null) {
            z10 = false;
            for (int i12 = 0; i12 < dVar2.f24639c; i12++) {
                z10 |= dVar2.f24637a[i12].f24636e;
            }
        } else {
            z10 = false;
        }
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(z10, str);
        if (aVarA == null) {
            return 1;
        }
        boolean zA = aVarA.a(oVar.f25698c);
        if (zA && (i10 = oVar.f25705j) > 0 && (i11 = oVar.f25706k) > 0) {
            if (z.f26070a >= 21) {
                zA = aVarA.a(i10, i11, oVar.f25707l);
            } else {
                boolean z11 = i10 * i11 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a();
                if (!z11) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + oVar.f25705j + "x" + oVar.f25706k + "] [" + z.f26074e + C3191e4.i.f36531e);
                }
                zA = z11;
            }
        }
        return (zA ? 3 : 2) | (aVarA.f25626b ? 8 : 4) | (aVarA.f25627c ? 16 : 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        if ((this.Y || super.q()) && super.f()) {
            this.Z = C.TIME_UNSET;
            return true;
        }
        if (this.Z == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Z) {
            return true;
        }
        this.Z = C.TIME_UNSET;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        this.f26089f0 = -1;
        this.f26090g0 = -1;
        this.f26092i0 = -1.0f;
        this.f26088e0 = -1.0f;
        this.f26093j0 = -1;
        this.f26094k0 = -1;
        this.f26096m0 = -1.0f;
        this.f26095l0 = -1;
        r();
        h hVar = this.P;
        if (hVar.f26122b) {
            hVar.f26121a.f26118b.sendEmptyMessage(2);
        }
        this.f26099p0 = null;
        try {
            this.f25636n = null;
            o();
        } finally {
            this.N.ensureUpdated();
            this.Q.disabled(this.N);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.N = decoderCounters;
        int i10 = this.f24482b.f25829a;
        this.f26098o0 = i10;
        this.f26097n0 = i10 != 0;
        this.Q.enabled(decoderCounters);
        h hVar = this.P;
        hVar.f26128h = false;
        if (hVar.f26122b) {
            hVar.f26121a.f26118b.sendEmptyMessage(1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.f26085b0 = 0;
        this.f26084a0 = SystemClock.elapsedRealtime();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        this.Z = C.TIME_UNSET;
        if (this.f26085b0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.Q.droppedFrames(this.f26085b0, jElapsedRealtime - this.f26084a0);
            this.f26085b0 = 0;
            this.f26084a0 = jElapsedRealtime;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void m() {
        if (z.f26070a >= 23 || !this.f26097n0 || this.Y) {
            return;
        }
        this.Y = true;
        this.Q.renderedFirstFrame(this.W);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean q() {
        Surface surface;
        return super.q() && (surface = this.W) != null && surface.isValid();
    }

    public final void r() {
        MediaCodec mediaCodec;
        this.Y = false;
        if (z.f26070a < 23 || !this.f26097n0 || (mediaCodec = this.f25637o) == null) {
            return;
        }
        this.f26099p0 = new f(this, mediaCodec);
    }

    public final void s() {
        int i10 = this.f26089f0;
        if (i10 == -1 && this.f26090g0 == -1) {
            return;
        }
        if (this.f26093j0 == i10 && this.f26094k0 == this.f26090g0 && this.f26095l0 == this.f26091h0 && this.f26096m0 == this.f26092i0) {
            return;
        }
        this.Q.videoSizeChanged(i10, this.f26090g0, this.f26091h0, this.f26092i0);
        this.f26093j0 = this.f26089f0;
        this.f26094k0 = this.f26090g0;
        this.f26095l0 = this.f26091h0;
        this.f26096m0 = this.f26092i0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(z10, j10);
        r();
        this.f26086c0 = 0;
        long jElapsedRealtime = C.TIME_UNSET;
        if (!z10) {
            this.Z = C.TIME_UNSET;
            return;
        }
        if (this.R > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + this.R;
        }
        this.Z = jElapsedRealtime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i10, Object obj) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (i10 != 1) {
            if (i10 == 4) {
                int iIntValue = ((Integer) obj).intValue();
                this.X = iIntValue;
                MediaCodec mediaCodec = this.f25637o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.W == surface) {
            if (surface != null) {
                int i11 = this.f26093j0;
                if (i11 != -1 || this.f26094k0 != -1) {
                    this.Q.videoSizeChanged(i11, this.f26094k0, this.f26095l0, this.f26096m0);
                }
                if (this.Y) {
                    this.Q.renderedFirstFrame(this.W);
                    return;
                }
                return;
            }
            return;
        }
        this.W = surface;
        int i12 = this.f24483c;
        if (i12 == 1 || i12 == 2) {
            MediaCodec mediaCodec2 = this.f25637o;
            if (z.f26070a >= 23 && mediaCodec2 != null && surface != null) {
                mediaCodec2.setOutputSurface(surface);
            } else {
                o();
                l();
            }
        }
        if (surface != null) {
            int i13 = this.f26093j0;
            if (i13 != -1 || this.f26094k0 != -1) {
                this.Q.videoSizeChanged(i13, this.f26094k0, this.f26095l0, this.f26096m0);
            }
            r();
            if (i12 == 2) {
                this.Z = this.R > 0 ? SystemClock.elapsedRealtime() + this.R : C.TIME_UNSET;
                return;
            }
            return;
        }
        this.f26093j0 = -1;
        this.f26094k0 = -1;
        this.f26096m0 = -1.0f;
        this.f26095l0 = -1;
        r();
    }

    public static boolean b(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (oVar.f25701f.equals(oVar2.f25701f)) {
            int i10 = oVar.f25708m;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = oVar2.f25708m;
            if (i11 == -1) {
                i11 = 0;
            }
            if (i10 == i11) {
                if (z10) {
                    return true;
                }
                if (oVar.f25705j == oVar2.f25705j && oVar.f25706k == oVar2.f25706k) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        e eVar;
        Point point;
        float f10;
        boolean z10;
        int i10;
        int i11;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.U;
        int iMax = oVar.f25705j;
        int iMax2 = oVar.f25706k;
        int iMax3 = oVar.f25702g;
        if (iMax3 == -1) {
            iMax3 = a(oVar.f25701f, iMax, iMax2);
        }
        if (oVarArr.length == 1) {
            eVar = new e(iMax, iMax2, iMax3);
        } else {
            boolean z11 = false;
            for (com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 : oVarArr) {
                if (b(aVar.f25626b, oVar, oVar2)) {
                    int i12 = oVar2.f25705j;
                    z11 |= i12 == -1 || oVar2.f25706k == -1;
                    iMax = Math.max(iMax, i12);
                    iMax2 = Math.max(iMax2, oVar2.f25706k);
                    int iA = oVar2.f25702g;
                    if (iA == -1) {
                        iA = a(oVar2.f25701f, oVar2.f25705j, oVar2.f25706k);
                    }
                    iMax3 = Math.max(iMax3, iA);
                }
            }
            if (z11) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i13 = oVar.f25706k;
                int i14 = oVar.f25705j;
                boolean z12 = i13 > i14;
                int i15 = z12 ? i13 : i14;
                if (z12) {
                    i13 = i14;
                }
                float f11 = i13 / i15;
                int[] iArr = f26083q0;
                int i16 = 0;
                while (i16 < 9) {
                    int i17 = iArr[i16];
                    int i18 = i16;
                    int i19 = (int) (i17 * f11);
                    if (i17 <= i15 || i19 <= i13) {
                        break;
                    }
                    int i20 = i13;
                    if (z.f26070a >= 21) {
                        point = aVar.a(z12 ? i19 : i17, z12 ? i17 : i19);
                        f10 = f11;
                        z10 = z12;
                        i10 = i15;
                        if (aVar.a(point.x, point.y, oVar.f25707l)) {
                            break;
                        }
                        i16 = i18 + 1;
                        i13 = i20;
                        f11 = f10;
                        z12 = z10;
                        i15 = i10;
                    } else {
                        f10 = f11;
                        z10 = z12;
                        i10 = i15;
                        int i21 = ((i17 + 15) / 16) * 16;
                        int i22 = ((i19 + 15) / 16) * 16;
                        if (i21 * i22 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a()) {
                            int i23 = z10 ? i22 : i21;
                            if (!z10) {
                                i21 = i22;
                            }
                            point = new Point(i23, i21);
                        } else {
                            i16 = i18 + 1;
                            i13 = i20;
                            f11 = f10;
                            z12 = z10;
                            i15 = i10;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iMax3 = Math.max(iMax3, a(oVar.f25701f, iMax, iMax2));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            eVar = new e(iMax, iMax2, iMax3);
        }
        this.V = eVar;
        boolean z13 = this.T;
        int i24 = this.f26098o0;
        MediaFormat mediaFormatA = oVar.a();
        mediaFormatA.setInteger("max-width", eVar.f26112a);
        mediaFormatA.setInteger("max-height", eVar.f26113b);
        int i25 = eVar.f26114c;
        if (i25 != -1) {
            mediaFormatA.setInteger("max-input-size", i25);
        }
        if (z13) {
            i11 = 0;
            mediaFormatA.setInteger("auto-frc", 0);
        } else {
            i11 = 0;
        }
        if (i24 != 0) {
            mediaFormatA.setFeatureEnabled("tunneled-playback", true);
            mediaFormatA.setInteger("audio-session-id", i24);
        }
        mediaCodec.configure(mediaFormatA, this.W, (MediaCrypto) null, i11);
        if (z.f26070a < 23 || !this.f26097n0) {
            return;
        }
        this.f26099p0 = new f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(String str, long j10, long j11) {
        this.Q.decoderInitialized(str, j10, j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(oVar);
        this.Q.inputFormatChanged(oVar);
        float f10 = oVar.f25709n;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.f26088e0 = f10;
        int i10 = oVar.f25708m;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f26087d0 = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean zContainsKey = mediaFormat.containsKey("crop-right");
        String str = RnJusJ.tiwCk;
        boolean z10 = zContainsKey && mediaFormat.containsKey(str) && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger(str)) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f26089f0 = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f26090g0 = integer2;
        float f10 = this.f26088e0;
        this.f26092i0 = f10;
        if (z.f26070a >= 21) {
            int i10 = this.f26087d0;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f26089f0;
                this.f26089f0 = integer2;
                this.f26090g0 = i11;
                this.f26092i0 = 1.0f / f10;
            }
        } else {
            this.f26091h0 = this.f26087d0;
        }
        mediaCodec.setVideoScalingMode(this.X);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (!b(z10, oVar, oVar2)) {
            return false;
        }
        int i10 = oVar2.f25705j;
        e eVar = this.V;
        return i10 <= eVar.f26112a && oVar2.f25706k <= eVar.f26113b && oVar2.f25702g <= eVar.f26114c;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r24, long r26, android.media.MediaCodec r28, java.nio.ByteBuffer r29, int r30, long r31, boolean r33) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, long, boolean):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L7b
            if (r7 != r0) goto L7
            goto L7b
        L7:
            r5.getClass()
            int r1 = r5.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1664118616: goto L4d;
                case -1662541442: goto L42;
                case 1187890754: goto L37;
                case 1331836730: goto L2c;
                case 1599127256: goto L21;
                case 1599127257: goto L16;
                default: goto L14;
            }
        L14:
            r5 = r0
            goto L57
        L16:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L1f
            goto L14
        L1f:
            r5 = 5
            goto L57
        L21:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L2a
            goto L14
        L2a:
            r5 = r2
            goto L57
        L2c:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L35
            goto L14
        L35:
            r5 = r3
            goto L57
        L37:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L40
            goto L14
        L40:
            r5 = r4
            goto L57
        L42:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L4b
            goto L14
        L4b:
            r5 = 1
            goto L57
        L4d:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L56
            goto L14
        L56:
            r5 = 0
        L57:
            switch(r5) {
                case 0: goto L75;
                case 1: goto L73;
                case 2: goto L75;
                case 3: goto L5b;
                case 4: goto L75;
                case 5: goto L73;
                default: goto L5a;
            }
        L5a:
            return r0
        L5b:
            java.lang.String r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26073d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L66
            return r0
        L66:
            int r6 = r6 + 15
            int r6 = r6 / 16
            int r7 = r7 + 15
            int r7 = r7 / 16
            int r7 = r7 * r6
            int r7 = r7 * 256
        L71:
            r2 = r4
            goto L77
        L73:
            int r7 = r7 * r6
            goto L77
        L75:
            int r7 = r7 * r6
            goto L71
        L77:
            int r7 = r7 * r3
            int r2 = r2 * r4
            int r7 = r7 / r2
            return r7
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.a(java.lang.String, int, int):int");
    }
}
