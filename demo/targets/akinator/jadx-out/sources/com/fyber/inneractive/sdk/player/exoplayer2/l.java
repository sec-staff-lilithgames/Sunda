package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Handler.Callback, com.fyber.inneractive.sdk.player.exoplayer2.source.r, com.fyber.inneractive.sdk.player.exoplayer2.source.t {
    public h A;
    public h B;
    public x C;

    /* renamed from: a, reason: collision with root package name */
    public final a[] f25599a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f25600b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f25601c;

    /* renamed from: d, reason: collision with root package name */
    public final c f25602d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.u f25603e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f25604f;

    /* renamed from: g, reason: collision with root package name */
    public final HandlerThread f25605g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f25606h;

    /* renamed from: i, reason: collision with root package name */
    public final w f25607i;

    /* renamed from: j, reason: collision with root package name */
    public final v f25608j;

    /* renamed from: k, reason: collision with root package name */
    public i f25609k;

    /* renamed from: l, reason: collision with root package name */
    public s f25610l;

    /* renamed from: m, reason: collision with root package name */
    public a f25611m;

    /* renamed from: n, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.h f25612n;

    /* renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u f25613o;

    /* renamed from: p, reason: collision with root package name */
    public a[] f25614p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25615q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25616r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25617s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f25618t;

    /* renamed from: u, reason: collision with root package name */
    public int f25619u = 1;

    /* renamed from: v, reason: collision with root package name */
    public long f25620v;

    /* renamed from: w, reason: collision with root package name */
    public int f25621w;

    /* renamed from: x, reason: collision with root package name */
    public j f25622x;

    /* renamed from: y, reason: collision with root package name */
    public long f25623y;

    /* renamed from: z, reason: collision with root package name */
    public h f25624z;

    public l(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar, boolean z10, f fVar, i iVar, g gVar) {
        this.f25599a = aVarArr;
        this.f25601c = dVar;
        this.f25602d = cVar;
        this.f25616r = z10;
        this.f25606h = fVar;
        this.f25609k = iVar;
        this.f25600b = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            a aVar = aVarArr[i10];
            aVar.getClass();
            this.f25600b[i10] = aVar;
        }
        this.f25603e = new com.fyber.inneractive.sdk.player.exoplayer2.util.u();
        this.f25614p = new a[0];
        this.f25607i = new w();
        this.f25608j = new v();
        this.f25610l = s.f25723d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f25605g = handlerThread;
        handlerThread.start();
        this.f25604f = new Handler(handlerThread.getLooper(), this);
    }

    public static void a(a aVar) {
        int i10 = aVar.f24483c;
        if (i10 == 2) {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            aVar.f24483c = 1;
            aVar.j();
        }
    }

    public final void b(boolean z10) {
        if (this.f25618t != z10) {
            this.f25618t = z10;
            this.f25606h.obtainMessage(2, z10 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void c(boolean z10) {
        this.f25617s = false;
        this.f25616r = z10;
        if (!z10) {
            g();
            h();
            a(false);
            return;
        }
        int i10 = this.f25619u;
        if (i10 != 3) {
            if (i10 == 2) {
                this.f25604f.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.f25617s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f25603e;
        if (!uVar.f26062a) {
            uVar.f26064c = SystemClock.elapsedRealtime();
            uVar.f26062a = true;
        }
        for (a aVar : this.f25614p) {
            if (aVar.f24483c != 1) {
                throw new IllegalStateException();
            }
            aVar.f24483c = 2;
            aVar.i();
        }
        this.f25604f.sendEmptyMessage(2);
    }

    public final synchronized void d() {
        if (this.f25615q) {
            return;
        }
        this.f25604f.sendEmptyMessage(6);
        while (!this.f25615q) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.f25605g.quit();
    }

    public final void e() {
        a(true);
        this.f25602d.a(true);
        a(1);
        synchronized (this) {
            this.f25615q = true;
            notifyAll();
        }
    }

    public final void f() throws d {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        boolean z10 = true;
        while (hVar != null && hVar.f25578i) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f25585p.a(hVar.f25584o, hVar.f25570a.a());
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f25588s;
            if (jVar != null) {
                for (int i10 = 0; i10 < jVarA.f25846b.f25842a; i10++) {
                    if (jVarA.a(jVar, i10)) {
                    }
                }
                if (hVar == this.A) {
                    z10 = false;
                }
                hVar = hVar.f25580k;
            }
            hVar.f25582m = jVarA;
            if (z10) {
                h hVar2 = this.A;
                h hVar3 = this.B;
                boolean z11 = hVar2 != hVar3;
                for (h hVar4 = hVar3.f25580k; hVar4 != null; hVar4 = hVar4.f25580k) {
                    hVar4.a();
                }
                h hVar5 = this.B;
                hVar5.f25580k = null;
                this.f25624z = hVar5;
                this.A = hVar5;
                boolean[] zArr = new boolean[this.f25599a.length];
                long jA = hVar5.a(this.f25609k.f25591c, z11, zArr);
                if (jA != this.f25609k.f25591c) {
                    this.f25609k.f25591c = jA;
                    a(jA);
                }
                boolean[] zArr2 = new boolean[this.f25599a.length];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    a[] aVarArr = this.f25599a;
                    if (i11 >= aVarArr.length) {
                        break;
                    }
                    a aVar = aVarArr[i11];
                    boolean z12 = aVar.f24483c != 0;
                    zArr2[i11] = z12;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.B.f25572c[i11];
                    if (vVar != null) {
                        i12++;
                    }
                    if (z12) {
                        if (vVar != aVar.f24484d) {
                            if (aVar == this.f25611m) {
                                if (vVar == null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f25603e;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar6 = this.f25612n;
                                    uVar.getClass();
                                    uVar.a(hVar6.b());
                                    uVar.f26065d = hVar6.a();
                                }
                                this.f25612n = null;
                                this.f25611m = null;
                            }
                            a(aVar);
                            aVar.c();
                        } else if (zArr[i11]) {
                            long j10 = this.f25623y;
                            aVar.f24487g = false;
                            aVar.f24486f = false;
                            aVar.a(false, j10);
                        }
                    }
                    i11++;
                }
                this.f25606h.obtainMessage(3, hVar.f25582m).sendToTarget();
                a(zArr2, i12);
            } else {
                this.f25624z = hVar;
                for (h hVar7 = hVar.f25580k; hVar7 != null; hVar7 = hVar7.f25580k) {
                    hVar7.a();
                }
                h hVar8 = this.f25624z;
                hVar8.f25580k = null;
                if (hVar8.f25578i) {
                    long j11 = hVar8.f25576g;
                    long jMax = Math.max(j11, Math.abs(this.f25623y - (hVar8.f25574e - j11)));
                    h hVar9 = this.f25624z;
                    hVar9.a(jMax, false, new boolean[hVar9.f25583n.length]);
                }
            }
            b();
            h();
            this.f25604f.sendEmptyMessage(2);
            return;
        }
    }

    public final void g() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f25603e;
        if (uVar.f26062a) {
            uVar.a(uVar.b());
            uVar.f26062a = false;
        }
        for (a aVar : this.f25614p) {
            a(aVar);
        }
    }

    public final void h() {
        h hVar = this.B;
        if (hVar == null) {
            return;
        }
        long jG = hVar.f25570a.g();
        if (jG != C.TIME_UNSET) {
            a(jG);
        } else {
            a aVar = this.f25611m;
            if (aVar == null || aVar.e()) {
                this.f25623y = this.f25603e.b();
            } else {
                long jB = this.f25612n.b();
                this.f25623y = jB;
                this.f25603e.a(jB);
            }
            h hVar2 = this.B;
            jG = Math.abs(this.f25623y - (hVar2.f25574e - hVar2.f25576g));
        }
        this.f25609k.f25591c = jG;
        this.f25620v = SystemClock.elapsedRealtime() * 1000;
        long jC = this.f25614p.length == 0 ? Long.MIN_VALUE : this.B.f25570a.c();
        i iVar = this.f25609k;
        if (jC == Long.MIN_VALUE) {
            long j10 = this.C.a(this.B.f25575f, this.f25608j, false).f26081d;
        }
        iVar.getClass();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.u) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    c(message.arg1 != 0);
                    return true;
                case 2:
                    a();
                    return true;
                case 3:
                    b((j) message.obj);
                    return true;
                case 4:
                    a((s) message.obj);
                    return true;
                case 5:
                    a(true);
                    this.f25602d.a(true);
                    a(1);
                    return true;
                case 6:
                    e();
                    return true;
                case 7:
                    a((Pair) message.obj);
                    return true;
                case 8:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj);
                    return true;
                case 9:
                    com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj;
                    h hVar = this.f25624z;
                    if (hVar != null && hVar.f25570a == sVar) {
                        b();
                    }
                    return true;
                case 10:
                    f();
                    return true;
                case 11:
                    a((e[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (d e10) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e10);
            this.f25606h.obtainMessage(8, e10).sendToTarget();
            a(true);
            this.f25602d.a(true);
            a(1);
            return true;
        } catch (IOException e11) {
            Log.e("ExoPlayerImplInternal", "Source error.", e11);
            this.f25606h.obtainMessage(8, new d(e11)).sendToTarget();
            a(true);
            this.f25602d.a(true);
            a(1);
            return true;
        } catch (RuntimeException e12) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e12);
            this.f25606h.obtainMessage(8, new d(e12)).sendToTarget();
            a(true);
            this.f25602d.a(true);
            a(1);
            return true;
        }
    }

    public final void b(j jVar) {
        if (this.C == null) {
            this.f25621w++;
            this.f25622x = jVar;
            return;
        }
        Pair pairA = a(jVar);
        if (pairA == null) {
            i iVar = new i(0, 0L);
            this.f25609k = iVar;
            this.f25606h.obtainMessage(4, 1, 0, iVar).sendToTarget();
            this.f25609k = new i(0, C.TIME_UNSET);
            a(4);
            a(false);
            return;
        }
        int i10 = jVar.f25594c == C.TIME_UNSET ? 1 : 0;
        int iIntValue = ((Integer) pairA.first).intValue();
        long jLongValue = ((Long) pairA.second).longValue();
        try {
            i iVar2 = this.f25609k;
            if (iIntValue == iVar2.f25589a && jLongValue / 1000 == iVar2.f25591c / 1000) {
                return;
            }
            long jA = a(iIntValue, jLongValue);
            int i11 = i10 | (jLongValue == jA ? 0 : 1);
            i iVar3 = new i(iIntValue, jA);
            this.f25609k = iVar3;
            this.f25606h.obtainMessage(4, i11, 0, iVar3).sendToTarget();
        } finally {
            i iVar4 = new i(iIntValue, jLongValue);
            this.f25609k = iVar4;
            this.f25606h.obtainMessage(4, i10, 0, iVar4).sendToTarget();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        this.f25604f.obtainMessage(7, Pair.create(xVar, gVar)).sendToTarget();
    }

    public final void a(int i10) {
        if (this.f25619u != i10) {
            this.f25619u = i10;
            this.f25606h.obtainMessage(1, i10, 0).sendToTarget();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, boolean z10) {
        this.f25606h.sendEmptyMessage(0);
        a(true);
        this.f25602d.a(false);
        if (z10) {
            this.f25609k = new i(0, C.TIME_UNSET);
        }
        this.f25613o = uVar;
        uVar.a(this);
        a(2);
        this.f25604f.sendEmptyMessage(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018a A[LOOP:3: B:75:0x018a->B:79:0x019a, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.l.a():void");
    }

    public final void c() {
        h hVar = this.f25624z;
        if (hVar == null || hVar.f25578i) {
            return;
        }
        h hVar2 = this.A;
        if (hVar2 == null || hVar2.f25580k == hVar) {
            for (a aVar : this.f25614p) {
                if (!aVar.f24486f) {
                    return;
                }
            }
            this.f25624z.f25570a.d();
        }
    }

    public final void b() {
        int i10;
        h hVar = this.f25624z;
        long jF = !hVar.f25578i ? 0L : hVar.f25570a.f();
        if (jF == Long.MIN_VALUE) {
            b(false);
            return;
        }
        h hVar2 = this.f25624z;
        long jAbs = Math.abs(this.f25623y - (hVar2.f25574e - hVar2.f25576g));
        long j10 = jF - jAbs;
        c cVar = this.f25602d;
        char c10 = j10 > cVar.f24615c ? (char) 0 : j10 < cVar.f24614b ? (char) 2 : (char) 1;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = cVar.f24613a;
        synchronized (lVar) {
            i10 = lVar.f25952c * C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        boolean z10 = c10 == 2 || (c10 == 1 && cVar.f24619g && !(i10 >= cVar.f24618f));
        cVar.f24619g = z10;
        b(z10);
        if (z10) {
            h hVar3 = this.f25624z;
            hVar3.f25581l = false;
            hVar3.f25570a.b(jAbs);
            return;
        }
        this.f25624z.f25581l = true;
    }

    public final void a(long j10, long j11) {
        this.f25604f.removeMessages(2);
        long jElapsedRealtime = (j10 + j11) - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            this.f25604f.sendEmptyMessage(2);
        } else {
            this.f25604f.sendEmptyMessageDelayed(2, jElapsedRealtime);
        }
    }

    public final long a(int i10, long j10) throws d {
        h hVar;
        g();
        this.f25617s = false;
        a(2);
        h hVar2 = this.B;
        if (hVar2 == null) {
            h hVar3 = this.f25624z;
            if (hVar3 != null) {
                hVar3.a();
            }
            hVar = null;
        } else {
            hVar = null;
            while (hVar2 != null) {
                if (hVar2.f25575f == i10 && hVar2.f25578i) {
                    hVar = hVar2;
                } else {
                    hVar2.a();
                }
                hVar2 = hVar2.f25580k;
            }
        }
        h hVar4 = this.B;
        if (hVar4 != hVar || hVar4 != this.A) {
            for (a aVar : this.f25614p) {
                aVar.c();
            }
            this.f25614p = new a[0];
            this.f25612n = null;
            this.f25611m = null;
            this.B = null;
        }
        if (hVar != null) {
            hVar.f25580k = null;
            this.f25624z = hVar;
            this.A = hVar;
            a(hVar);
            h hVar5 = this.B;
            if (hVar5.f25579j) {
                j10 = hVar5.f25570a.a(j10);
            }
            a(j10);
            b();
        } else {
            this.f25624z = null;
            this.A = null;
            this.B = null;
            a(j10);
        }
        this.f25604f.sendEmptyMessage(2);
        return j10;
    }

    public final void a(long j10) {
        h hVar = this.B;
        long j11 = hVar == null ? j10 + 60000000 : j10 + (hVar.f25574e - hVar.f25576g);
        this.f25623y = j11;
        this.f25603e.a(j11);
        for (a aVar : this.f25614p) {
            long j12 = this.f25623y;
            aVar.f24487g = false;
            aVar.f24486f = false;
            aVar.a(false, j12);
        }
    }

    public final void a(s sVar) {
        s sVarA;
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar = this.f25612n;
        if (hVar != null) {
            sVarA = hVar.a(sVar);
        } else {
            sVarA = this.f25603e.a(sVar);
        }
        this.f25610l = sVarA;
        this.f25606h.obtainMessage(7, sVarA).sendToTarget();
    }

    public final void a(boolean z10) {
        this.f25604f.removeMessages(2);
        this.f25617s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f25603e;
        if (uVar.f26062a) {
            uVar.a(uVar.b());
            uVar.f26062a = false;
        }
        this.f25612n = null;
        this.f25611m = null;
        this.f25623y = 60000000L;
        for (a aVar : this.f25614p) {
            try {
                a(aVar);
                aVar.c();
            } catch (d | RuntimeException e10) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e10);
            }
        }
        this.f25614p = new a[0];
        h hVar = this.B;
        if (hVar == null) {
            hVar = this.f25624z;
        }
        while (hVar != null) {
            hVar.a();
            hVar = hVar.f25580k;
        }
        this.f25624z = null;
        this.A = null;
        this.B = null;
        b(false);
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar2 = this.f25613o;
            if (uVar2 != null) {
                uVar2.b();
                this.f25613o = null;
            }
            this.C = null;
        }
    }

    public final void a(e[] eVarArr) {
        try {
            for (e eVar : eVarArr) {
                eVar.f24640a.a(eVar.f24641b, eVar.f24642c);
            }
            if (this.f25613o != null) {
                this.f25604f.sendEmptyMessage(2);
            }
            synchronized (this) {
                notifyAll();
            }
        } catch (Throwable th2) {
            synchronized (this) {
                notifyAll();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.util.Pair r18) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.l.a(android.util.Pair):void");
    }

    public final Pair a(j jVar) {
        x xVar = jVar.f25592a;
        if (xVar.c()) {
            xVar = this.C;
        }
        x xVar2 = xVar;
        try {
            Pair pairA = a(xVar2, jVar.f25593b, jVar.f25594c, 0L);
            x xVar3 = this.C;
            if (xVar3 == xVar2) {
                return pairA;
            }
            int iA = xVar3.a(xVar2.a(((Integer) pairA.first).intValue(), this.f25608j, true).f26079b);
            if (iA != -1) {
                return Pair.create(Integer.valueOf(iA), (Long) pairA.second);
            }
            int iIntValue = ((Integer) pairA.first).intValue();
            x xVar4 = this.C;
            int iA2 = -1;
            while (iA2 == -1 && iIntValue < xVar2.a() - 1) {
                iIntValue++;
                iA2 = xVar4.a(xVar2.a(iIntValue, this.f25608j, true).f26079b);
            }
            if (iA2 == -1) {
                return null;
            }
            int i10 = this.C.a(iA2, this.f25608j, false).f26080c;
            return a(this.C, 0, C.TIME_UNSET, 0L);
        } catch (IndexOutOfBoundsException unused) {
            throw new q();
        }
    }

    public final Pair a(x xVar, int i10, long j10, long j11) {
        int iB = xVar.b();
        if (i10 >= 0 && i10 < iB) {
            xVar.a(i10, this.f25607i, j11);
            if (j10 == C.TIME_UNSET) {
                j10 = this.f25607i.f26156e;
                if (j10 == C.TIME_UNSET) {
                    return null;
                }
            }
            w wVar = this.f25607i;
            int i11 = wVar.f26154c;
            long j12 = wVar.f26158g + j10;
            long j13 = xVar.a(i11, this.f25608j, false).f26081d;
            while (j13 != C.TIME_UNSET && j12 >= j13 && i11 < this.f25607i.f26155d) {
                j12 -= j13;
                i11++;
                j13 = xVar.a(i11, this.f25608j, false).f26081d;
            }
            return Pair.create(Integer.valueOf(i11), Long.valueOf(j12));
        }
        throw new IndexOutOfBoundsException();
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar) throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar2;
        h hVar = this.f25624z;
        if (hVar == null || (sVar2 = hVar.f25570a) != sVar) {
            return;
        }
        hVar.f25578i = true;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVarA = hVar.f25585p.a(hVar.f25584o, sVar2.a());
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.f25588s;
        if (jVar != null) {
            for (int i10 = 0; i10 < jVarA.f25846b.f25842a; i10++) {
                if (!jVarA.a(jVar, i10)) {
                    hVar.f25582m = jVarA;
                    break;
                }
            }
        } else {
            hVar.f25582m = jVarA;
            break;
        }
        hVar.f25576g = hVar.a(hVar.f25576g, false, new boolean[hVar.f25583n.length]);
        if (this.B == null) {
            h hVar2 = this.f25624z;
            this.A = hVar2;
            a(hVar2.f25576g);
            a(this.A);
        }
        b();
    }

    public final void a(h hVar) throws d {
        if (this.B == hVar) {
            return;
        }
        boolean[] zArr = new boolean[this.f25599a.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f25599a;
            if (i10 < aVarArr.length) {
                a aVar = aVarArr[i10];
                boolean z10 = aVar.f24483c != 0;
                zArr[i10] = z10;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.f25582m.f25846b.f25843b[i10];
                if (bVar != null) {
                    i11++;
                }
                if (z10 && (bVar == null || (aVar.f24487g && aVar.f24484d == this.B.f25572c[i10]))) {
                    if (aVar == this.f25611m) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.f25603e;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar2 = this.f25612n;
                        uVar.getClass();
                        uVar.a(hVar2.b());
                        uVar.f26065d = hVar2.a();
                        this.f25612n = null;
                        this.f25611m = null;
                    }
                    a(aVar);
                    aVar.c();
                }
                i10++;
            } else {
                this.B = hVar;
                this.f25606h.obtainMessage(3, hVar.f25582m).sendToTarget();
                a(zArr, i11);
                return;
            }
        }
    }

    public final void a(boolean[] zArr, int i10) throws d {
        int i11;
        this.f25614p = new a[i10];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            a[] aVarArr = this.f25599a;
            if (i12 >= aVarArr.length) {
                return;
            }
            a aVar = aVarArr[i12];
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = this.B.f25582m;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar.f25846b.f25843b[i12];
            if (bVar != null) {
                int i14 = i13 + 1;
                this.f25614p[i13] = aVar;
                if (aVar.f24483c == 0) {
                    t tVar = jVar.f25848d[i12];
                    boolean z10 = this.f25616r && this.f25619u == 3;
                    boolean z11 = !zArr[i12] && z10;
                    int length = bVar.f25835c.length;
                    o[] oVarArr = new o[length];
                    for (int i15 = 0; i15 < length; i15++) {
                        oVarArr[i15] = bVar.f25836d[i15];
                    }
                    h hVar = this.B;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = hVar.f25572c[i12];
                    long j10 = this.f25623y;
                    i11 = i12;
                    long j11 = hVar.f25574e - hVar.f25576g;
                    if (aVar.f24483c == 0) {
                        aVar.f24482b = tVar;
                        aVar.f24483c = 1;
                        aVar.h();
                        if (!aVar.f24487g) {
                            aVar.f24484d = vVar;
                            aVar.f24486f = false;
                            aVar.f24485e = j11;
                            aVar.a(oVarArr);
                            aVar.a(z11, j10);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.h hVarD = aVar.d();
                            if (hVarD != null) {
                                if (this.f25612n == null) {
                                    this.f25612n = hVarD;
                                    this.f25611m = aVar;
                                    ((MediaCodecAudioRenderer) hVarD).Q.a(this.f25610l);
                                } else {
                                    throw new d(new IllegalStateException("Multiple renderer media clocks enabled."));
                                }
                            }
                            if (z10) {
                                if (aVar.f24483c == 1) {
                                    aVar.f24483c = 2;
                                    aVar.i();
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    i11 = i12;
                }
                i13 = i14;
            } else {
                i11 = i12;
            }
            i12 = i11 + 1;
        }
    }
}
