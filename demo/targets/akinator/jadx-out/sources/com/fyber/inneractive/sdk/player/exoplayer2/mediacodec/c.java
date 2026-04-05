package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c extends com.fyber.inneractive.sdk.player.exoplayer2.a {
    public static final byte[] O;
    public ByteBuffer[] A;
    public long B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public DecoderCounters N;

    /* renamed from: h, reason: collision with root package name */
    public final d f25630h;

    /* renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f25631i;

    /* renamed from: j, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f25632j;

    /* renamed from: k, reason: collision with root package name */
    public final p f25633k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f25634l;

    /* renamed from: m, reason: collision with root package name */
    public final MediaCodec.BufferInfo f25635m;

    /* renamed from: n, reason: collision with root package name */
    public o f25636n;

    /* renamed from: o, reason: collision with root package name */
    public MediaCodec f25637o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25638p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25639q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25640r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25641s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f25642t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25643u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25644v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25645w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f25646x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f25647y;

    /* renamed from: z, reason: collision with root package name */
    public ByteBuffer[] f25648z;

    static {
        int i10 = z.f26070a;
        byte[] bArr = new byte[38];
        for (int i11 = 0; i11 < 38; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12), 16) << 4));
        }
        O = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, boolean z10) {
        super(i10);
        d dVar = d.f25649a;
        if (z.f26070a < 16) {
            throw new IllegalStateException();
        }
        this.f25630h = dVar;
        this.f25631i = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f25632j = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f25633k = new p();
        this.f25634l = new ArrayList();
        this.f25635m = new MediaCodec.BufferInfo();
        this.G = 0;
        this.H = 0;
    }

    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract void a(a aVar, MediaCodec mediaCodec, o oVar);

    public abstract void a(String str, long j10, long j11);

    public abstract boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j12, boolean z10);

    public boolean a(boolean z10, o oVar, o oVar2) {
        return false;
    }

    public abstract int b(d dVar, o oVar);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean e() {
        return this.L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean f() {
        if (this.f25636n == null) {
            return false;
        }
        if ((this.f24486f ? this.f24487g : this.f24484d.isReady()) || this.D >= 0) {
            return true;
        }
        return this.B != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.B;
    }

    public final boolean k() throws MediaCodec.CryptoException, com.fyber.inneractive.sdk.player.exoplayer2.d {
        MediaCodec mediaCodec = this.f25637o;
        if (mediaCodec == null || this.H == 2 || this.K) {
            return false;
        }
        if (this.C < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.C = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar = this.f25631i;
            cVar.f24629c = this.f25648z[iDequeueInputBuffer];
            cVar.a();
        }
        if (this.H == 1) {
            if (!this.f25642t) {
                this.J = true;
                this.f25637o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                this.C = -1;
            }
            this.H = 2;
            return false;
        }
        if (this.f25646x) {
            this.f25646x = false;
            ByteBuffer byteBuffer = this.f25631i.f24629c;
            byte[] bArr = O;
            byteBuffer.put(bArr);
            this.f25637o.queueInputBuffer(this.C, 0, bArr.length, 0L, 0);
            this.C = -1;
            this.I = true;
            return true;
        }
        if (this.G == 1) {
            for (int i10 = 0; i10 < this.f25636n.f25703h.size(); i10++) {
                this.f25631i.f24629c.put((byte[]) this.f25636n.f25703h.get(i10));
            }
            this.G = 2;
        }
        int iPosition = this.f25631i.f24629c.position();
        int iA = a(this.f25633k, this.f25631i, false);
        if (iA == -3) {
            return false;
        }
        if (iA == -5) {
            if (this.G == 2) {
                this.f25631i.a();
                this.G = 1;
            }
            a(this.f25633k.f25722a);
            return true;
        }
        if (this.f25631i.b(4)) {
            if (this.G == 2) {
                this.f25631i.a();
                this.G = 1;
            }
            this.K = true;
            if (!this.I) {
                n();
                return false;
            }
            try {
                if (!this.f25642t) {
                    this.J = true;
                    this.f25637o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                    this.C = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
            }
        }
        if (this.M && !this.f25631i.b(1)) {
            this.f25631i.a();
            if (this.G == 2) {
                this.G = 1;
            }
            return true;
        }
        this.M = false;
        boolean zB = this.f25631i.b(1073741824);
        if (this.f25639q && !zB) {
            ByteBuffer byteBuffer2 = this.f25631i.f24629c;
            int iPosition2 = byteBuffer2.position();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i11 + 1;
                if (i13 >= iPosition2) {
                    byteBuffer2.clear();
                    break;
                }
                int i14 = byteBuffer2.get(i11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i12 == 3) {
                    if (i14 == 1 && (byteBuffer2.get(i13) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                        byteBufferDuplicate.position(i11 - 3);
                        byteBufferDuplicate.limit(iPosition2);
                        byteBuffer2.position(0);
                        byteBuffer2.put(byteBufferDuplicate);
                        break;
                    }
                } else if (i14 == 0) {
                    i12++;
                }
                if (i14 != 0) {
                    i12 = 0;
                }
                i11 = i13;
            }
            if (this.f25631i.f24629c.position() == 0) {
                return true;
            }
            this.f25639q = false;
        }
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar2 = this.f25631i;
            long j10 = cVar2.f24630d;
            if (cVar2.b(Integer.MIN_VALUE)) {
                this.f25634l.add(Long.valueOf(j10));
            }
            this.f25631i.f24629c.flip();
            m();
            if (zB) {
                MediaCodec.CryptoInfo cryptoInfo = this.f25631i.f24628b.f24625d;
                if (iPosition != 0) {
                    if (cryptoInfo.numBytesOfClearData == null) {
                        cryptoInfo.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = cryptoInfo.numBytesOfClearData;
                    iArr[0] = iArr[0] + iPosition;
                }
                this.f25637o.queueSecureInputBuffer(this.C, 0, cryptoInfo, j10, 0);
            } else {
                this.f25637o.queueInputBuffer(this.C, 0, this.f25631i.f24629c.limit(), j10, 0);
            }
            this.C = -1;
            this.I = true;
            this.G = 0;
            this.N.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e11) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.l():void");
    }

    public final void n() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.H == 2) {
            o();
            l();
        } else {
            this.L = true;
            p();
        }
    }

    public final void o() {
        if (this.f25637o != null) {
            this.B = C.TIME_UNSET;
            this.C = -1;
            this.D = -1;
            this.E = false;
            this.f25634l.clear();
            this.f25648z = null;
            this.A = null;
            this.F = false;
            this.I = false;
            this.f25638p = false;
            this.f25639q = false;
            this.f25640r = false;
            this.f25641s = false;
            this.f25642t = false;
            this.f25643u = false;
            this.f25645w = false;
            this.f25646x = false;
            this.f25647y = false;
            this.J = false;
            this.G = 0;
            this.H = 0;
            this.N.decoderReleaseCount++;
            this.f25631i.f24629c = null;
            try {
                this.f25637o.stop();
                try {
                    this.f25637o.release();
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    this.f25637o.release();
                    throw th2;
                } finally {
                }
            }
        }
    }

    public boolean q() {
        return this.f25637o == null && this.f25636n != null;
    }

    public a a(d dVar, o oVar) {
        String str = oVar.f25701f;
        dVar.getClass();
        return j.a(false, str);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.K = false;
        this.L = false;
        if (this.f25637o != null) {
            this.B = C.TIME_UNSET;
            this.C = -1;
            this.D = -1;
            this.M = true;
            this.E = false;
            this.f25634l.clear();
            this.f25646x = false;
            this.f25647y = false;
            if (this.f25640r || ((this.f25643u && this.J) || this.H != 0)) {
                o();
                l();
            } else {
                this.f25637o.flush();
                this.I = false;
            }
            if (!this.F || this.f25636n == null) {
                return;
            }
            this.G = 1;
        }
    }

    public void m() {
    }

    public void p() {
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0177  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r16, long r18) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.a(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.o r5) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.o r0 = r4.f25636n
            r4.f25636n = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r5 = r5.f25704i
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r1 = r0.f25704i
        Lc:
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(r5, r1)
            if (r5 != 0) goto L26
            com.fyber.inneractive.sdk.player.exoplayer2.o r5 = r4.f25636n
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r5 = r5.f25704i
            if (r5 != 0) goto L19
            goto L26
        L19:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = new com.fyber.inneractive.sdk.player.exoplayer2.d
            r0.<init>(r5)
            throw r0
        L26:
            android.media.MediaCodec r5 = r4.f25637o
            r1 = 1
            if (r5 == 0) goto L50
            boolean r5 = r4.f25638p
            com.fyber.inneractive.sdk.player.exoplayer2.o r2 = r4.f25636n
            boolean r5 = r4.a(r5, r0, r2)
            if (r5 == 0) goto L50
            r4.F = r1
            r4.G = r1
            boolean r5 = r4.f25641s
            if (r5 == 0) goto L4c
            com.fyber.inneractive.sdk.player.exoplayer2.o r5 = r4.f25636n
            int r2 = r5.f25705j
            int r3 = r0.f25705j
            if (r2 != r3) goto L4c
            int r5 = r5.f25706k
            int r0 = r0.f25706k
            if (r5 != r0) goto L4c
            goto L4d
        L4c:
            r1 = 0
        L4d:
            r4.f25646x = r1
            return
        L50:
            boolean r5 = r4.I
            if (r5 == 0) goto L57
            r4.H = r1
            return
        L57:
            r4.o()
            r4.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.a(com.fyber.inneractive.sdk.player.exoplayer2.o):void");
    }
}
