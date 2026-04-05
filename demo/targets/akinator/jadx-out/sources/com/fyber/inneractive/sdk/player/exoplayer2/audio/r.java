package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import b0.e2;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3191e4;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {
    public long A;
    public boolean B;
    public long C;
    public Method D;
    public int E;
    public long F;
    public long G;
    public int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public float P;
    public c[] Q;
    public ByteBuffer[] R;
    public ByteBuffer S;
    public ByteBuffer T;
    public byte[] U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final s f24529a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f24530a0;

    /* renamed from: b, reason: collision with root package name */
    public final x f24531b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f24532b0;

    /* renamed from: c, reason: collision with root package name */
    public final c[] f24533c;

    /* renamed from: c0, reason: collision with root package name */
    public long f24534c0;

    /* renamed from: d, reason: collision with root package name */
    public final o f24535d;

    /* renamed from: e, reason: collision with root package name */
    public final ConditionVariable f24536e = new ConditionVariable(true);

    /* renamed from: f, reason: collision with root package name */
    public final long[] f24537f;

    /* renamed from: g, reason: collision with root package name */
    public final k f24538g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedList f24539h;

    /* renamed from: i, reason: collision with root package name */
    public AudioTrack f24540i;

    /* renamed from: j, reason: collision with root package name */
    public int f24541j;

    /* renamed from: k, reason: collision with root package name */
    public int f24542k;

    /* renamed from: l, reason: collision with root package name */
    public int f24543l;

    /* renamed from: m, reason: collision with root package name */
    public int f24544m;

    /* renamed from: n, reason: collision with root package name */
    public int f24545n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24546o;

    /* renamed from: p, reason: collision with root package name */
    public int f24547p;

    /* renamed from: q, reason: collision with root package name */
    public long f24548q;

    /* renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f24549r;

    /* renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f24550s;

    /* renamed from: t, reason: collision with root package name */
    public long f24551t;

    /* renamed from: u, reason: collision with root package name */
    public long f24552u;

    /* renamed from: v, reason: collision with root package name */
    public ByteBuffer f24553v;

    /* renamed from: w, reason: collision with root package name */
    public int f24554w;

    /* renamed from: x, reason: collision with root package name */
    public int f24555x;

    /* renamed from: y, reason: collision with root package name */
    public int f24556y;

    /* renamed from: z, reason: collision with root package name */
    public long f24557z;

    public r(c[] cVarArr, u uVar) {
        this.f24535d = uVar;
        if (z.f26070a >= 18) {
            try {
                this.D = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (z.f26070a >= 19) {
            this.f24538g = new l();
        } else {
            this.f24538g = new k();
        }
        s sVar = new s();
        this.f24529a = sVar;
        x xVar = new x();
        this.f24531b = xVar;
        c[] cVarArr2 = new c[cVarArr.length + 3];
        this.f24533c = cVarArr2;
        cVarArr2[0] = new v();
        cVarArr2[1] = sVar;
        System.arraycopy(cVarArr, 0, cVarArr2, 2, cVarArr.length);
        cVarArr2[cVarArr.length + 2] = xVar;
        this.f24537f = new long[10];
        this.P = 1.0f;
        this.L = 0;
        this.f24545n = 3;
        this.Z = 0;
        this.f24550s = com.fyber.inneractive.sdk.player.exoplayer2.s.f25723d;
        this.W = -1;
        this.Q = new c[0];
        this.R = new ByteBuffer[0];
        this.f24539h = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, int r10, int r11, int[] r12) throws java.lang.IllegalStateException, com.fyber.inneractive.sdk.player.exoplayer2.audio.m {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a(int, int, int, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.nio.ByteBuffer r8, long r9) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.q {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.b(java.nio.ByteBuffer, long):void");
    }

    public final boolean c() {
        if (!d()) {
            return false;
        }
        if (b() <= this.f24538g.a()) {
            return e() && this.f24540i.getPlayState() == 2 && this.f24540i.getPlaybackHeadPosition() == 0;
        }
        return true;
    }

    public final boolean d() {
        return this.f24540i != null;
    }

    public final boolean e() {
        if (z.f26070a >= 23) {
            return false;
        }
        int i10 = this.f24544m;
        return i10 == 5 || i10 == 6;
    }

    public final void f() throws IllegalStateException {
        this.Y = true;
        if (d()) {
            this.N = System.nanoTime() / 1000;
            this.f24540i.play();
        }
    }

    public final void g() throws IllegalStateException {
        if (d()) {
            this.F = 0L;
            this.G = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f24549r;
            if (sVar != null) {
                this.f24550s = sVar;
                this.f24549r = null;
            } else if (!this.f24539h.isEmpty()) {
                this.f24550s = ((p) this.f24539h.getLast()).f24526a;
            }
            this.f24539h.clear();
            this.f24551t = 0L;
            this.f24552u = 0L;
            this.S = null;
            this.T = null;
            int i10 = 0;
            while (true) {
                c[] cVarArr = this.Q;
                if (i10 >= cVarArr.length) {
                    break;
                }
                c cVar = cVarArr[i10];
                cVar.flush();
                this.R[i10] = cVar.a();
                i10++;
            }
            this.X = false;
            this.W = -1;
            this.f24553v = null;
            this.f24554w = 0;
            this.L = 0;
            this.O = 0L;
            this.f24557z = 0L;
            this.f24556y = 0;
            this.f24555x = 0;
            this.A = 0L;
            this.B = false;
            this.C = 0L;
            if (this.f24540i.getPlayState() == 3) {
                this.f24540i.pause();
            }
            AudioTrack audioTrack = this.f24540i;
            this.f24540i = null;
            this.f24538g.a(null, false);
            this.f24536e.close();
            new j(this, audioTrack).start();
        }
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.f24533c) {
            if (cVar.d()) {
                arrayList.add(cVar);
            } else {
                cVar.flush();
            }
        }
        int size = arrayList.size();
        this.Q = (c[]) arrayList.toArray(new c[size]);
        this.R = new ByteBuffer[size];
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = this.Q[i10];
            cVar2.flush();
            this.R[i10] = cVar2.a();
        }
    }

    public final void i() {
        if (d()) {
            if (z.f26070a >= 21) {
                this.f24540i.setVolume(this.P);
                return;
            }
            AudioTrack audioTrack = this.f24540i;
            float f10 = this.P;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final boolean a(ByteBuffer byteBuffer, long j10) throws IllegalStateException, q, n {
        long j11;
        int i10;
        ByteBuffer byteBuffer2 = this.S;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new IllegalArgumentException();
        }
        if (!d()) {
            this.f24536e.block();
            if (this.f24530a0) {
                this.f24540i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f24542k).setEncoding(this.f24544m).setSampleRate(this.f24541j).build(), this.f24547p, 1, this.Z);
            } else if (this.Z == 0) {
                this.f24540i = new AudioTrack(this.f24545n, this.f24541j, this.f24542k, this.f24544m, this.f24547p, 1);
            } else {
                this.f24540i = new AudioTrack(this.f24545n, this.f24541j, this.f24542k, this.f24544m, this.f24547p, 1, this.Z);
            }
            int state = this.f24540i.getState();
            if (state == 1) {
                int audioSessionId = this.f24540i.getAudioSessionId();
                if (this.Z != audioSessionId) {
                    this.Z = audioSessionId;
                    u uVar = (u) this.f24535d;
                    uVar.f24569a.P.audioSessionId(audioSessionId);
                    uVar.f24569a.getClass();
                }
                this.f24538g.a(this.f24540i, e());
                i();
                this.f24532b0 = false;
                if (this.Y) {
                    f();
                }
            } else {
                try {
                    this.f24540i.release();
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    this.f24540i = null;
                    throw th2;
                }
                this.f24540i = null;
                throw new n(state, this.f24541j, this.f24542k, this.f24547p);
            }
        }
        if (e()) {
            if (this.f24540i.getPlayState() == 2) {
                this.f24532b0 = false;
                return false;
            }
            if (this.f24540i.getPlayState() == 1 && this.f24538g.a() != 0) {
                return false;
            }
        }
        boolean z10 = this.f24532b0;
        boolean zC = c();
        this.f24532b0 = zC;
        if (z10 && !zC && this.f24540i.getPlayState() != 1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f24534c0;
            u uVar2 = (u) this.f24535d;
            uVar2.f24569a.P.audioTrackUnderrun(this.f24547p, com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f24548q), jElapsedRealtime);
            uVar2.f24569a.getClass();
        }
        if (this.S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f24546o && this.K == 0) {
                int i11 = this.f24544m;
                if (i11 == 7 || i11 == 8) {
                    int iPosition = byteBuffer.position();
                    i10 = ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) * 32;
                } else if (i11 == 5) {
                    i10 = 1536;
                } else if (i11 == 6) {
                    i10 = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a.f24488a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * NotificationCompat.FLAG_LOCAL_ONLY;
                } else {
                    throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected audio encoding: ", i11));
                }
                this.K = i10;
            }
            if (this.f24549r == null) {
                j11 = 1000000;
            } else {
                if (!a()) {
                    return false;
                }
                j11 = 1000000;
                this.f24539h.add(new p(this.f24549r, Math.max(0L, j10), (b() * 1000000) / this.f24541j));
                this.f24549r = null;
                h();
            }
            int i12 = this.L;
            if (i12 == 0) {
                this.M = Math.max(0L, j10);
                this.L = 1;
            } else {
                long j12 = (((this.f24546o ? this.G : this.F / this.E) * j11) / this.f24541j) + this.M;
                if (i12 == 1 && Math.abs(j12 - j10) > 200000) {
                    StringBuilder sbR = e2.r(j12, "Discontinuity detected [expected ", ", got ");
                    sbR.append(j10);
                    sbR.append(C3191e4.i.f36531e);
                    Log.e("AudioTrack", sbR.toString());
                    this.L = 2;
                }
                if (this.L == 2) {
                    this.M = (j10 - j12) + this.M;
                    this.L = 1;
                    u uVar3 = (u) this.f24535d;
                    uVar3.f24569a.getClass();
                    uVar3.f24569a.V = true;
                }
            }
            if (this.f24546o) {
                this.G += this.K;
            } else {
                this.F += byteBuffer.remaining();
            }
            this.S = byteBuffer;
        }
        if (this.f24546o) {
            b(this.S, j10);
        } else {
            a(j10);
        }
        if (this.S.hasRemaining()) {
            return false;
        }
        this.S = null;
        return true;
    }

    public final long b() {
        return this.f24546o ? this.J : this.I / this.H;
    }

    public final void a(long j10) throws q {
        ByteBuffer byteBuffer;
        int length = this.Q.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.R[i10 - 1];
            } else {
                byteBuffer = this.S;
                if (byteBuffer == null) {
                    byteBuffer = c.f24494a;
                }
            }
            if (i10 == length) {
                b(byteBuffer, j10);
            } else {
                c cVar = this.Q[i10];
                cVar.a(byteBuffer);
                ByteBuffer byteBufferA = cVar.a();
                this.R[i10] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() throws com.fyber.inneractive.sdk.player.exoplayer2.audio.q {
        /*
            r9 = this;
            int r0 = r9.W
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L14
            boolean r0 = r9.f24546o
            if (r0 == 0) goto Lf
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r0 = r9.Q
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r2
        L10:
            r9.W = r0
        L12:
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            int r4 = r9.W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] r5 = r9.Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.b()
        L28:
            r9.a(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L32
            return r2
        L32:
            int r0 = r9.W
            int r0 = r0 + r1
            r9.W = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.T
            if (r0 == 0) goto L44
            return r2
        L44:
            r9.W = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a():boolean");
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f24546o) {
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar2 = com.fyber.inneractive.sdk.player.exoplayer2.s.f25723d;
            this.f24550s = sVar2;
            return sVar2;
        }
        x xVar = this.f24531b;
        float f10 = sVar.f25724a;
        xVar.getClass();
        int i10 = z.f26070a;
        float fMax = Math.max(0.1f, Math.min(f10, 8.0f));
        xVar.f24603e = fMax;
        x xVar2 = this.f24531b;
        float f11 = sVar.f25725b;
        xVar2.getClass();
        xVar2.f24604f = Math.max(0.1f, Math.min(f11, 8.0f));
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.s(fMax, f11);
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar4 = this.f24549r;
        if (sVar4 == null) {
            if (!this.f24539h.isEmpty()) {
                sVar4 = ((p) this.f24539h.getLast()).f24526a;
            } else {
                sVar4 = this.f24550s;
            }
        }
        if (!sVar3.equals(sVar4)) {
            if (d()) {
                this.f24549r = sVar3;
            } else {
                this.f24550s = sVar3;
            }
        }
        return this.f24550s;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r27) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.r.a(boolean):long");
    }
}
