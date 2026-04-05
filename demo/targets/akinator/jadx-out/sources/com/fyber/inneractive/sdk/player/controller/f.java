package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends q {
    public final boolean A;
    public final CopyOnWriteArrayList B;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u C;
    public boolean D;
    public int E;

    /* renamed from: p, reason: collision with root package name */
    public final int f24405p;

    /* renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f24406q;

    /* renamed from: r, reason: collision with root package name */
    public final int f24407r;

    /* renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.g f24408s;

    /* renamed from: t, reason: collision with root package name */
    public int f24409t;

    /* renamed from: u, reason: collision with root package name */
    public int f24410u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24411v;

    /* renamed from: w, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.a[] f24412w;

    /* renamed from: x, reason: collision with root package name */
    public Handler f24413x;

    /* renamed from: y, reason: collision with root package name */
    public b0 f24414y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f24415z;

    public f(Context context, boolean z10, com.fyber.inneractive.sdk.config.global.r rVar) {
        Integer numA;
        super(context);
        this.f24409t = 0;
        this.f24410u = 0;
        this.f24411v = false;
        this.f24415z = false;
        this.B = new CopyOnWriteArrayList();
        this.C = null;
        this.E = 0;
        this.A = z10;
        this.f24406q = rVar;
        this.f24407r = IAConfigManager.O.f23226u.f23394b.a("extractor_source_retry_count", 6, 3);
        com.fyber.inneractive.sdk.config.global.features.u uVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class) : null;
        this.f24405p = (uVar == null || (numA = uVar.a("max_tries")) == null) ? 0 : numA.intValue();
        IAlog.a("Creating IAExoPlayer2Controller", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        if (this.f24408s != null) {
            if (!this.f24415z) {
                this.f24415z = true;
                com.fyber.inneractive.sdk.util.r.f26803a.execute(new e(this));
            }
            b0 b0Var = this.f24414y;
            if (b0Var != null) {
                b0Var.f24393a.clear();
            }
            this.f24414y = null;
        }
        Iterator it = this.B.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        this.B.clear();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        this.f24443n = z10;
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f24412w;
        if (aVarArr == null || (gVar = this.f24408s) == null || this.f24415z || aVarArr.length < 2) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(0.0f)));
        this.f24411v = true;
        c(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f24408s;
        if (gVar == null || this.f24415z) {
            return 0;
        }
        return (int) (gVar.f25563m.c() ? C.TIME_UNSET : com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f25563m.a(gVar.a(), gVar.f25556f).f26157f));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z10) {
        this.f24443n = z10;
        if (this.f24408s == null || this.f24415z) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f24430a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = streamVolume / streamMaxVolume;
        IAlog.a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f10));
        if (streamVolume == 0) {
            IAlog.a("Avoided unmute - Device is muted", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f24412w;
        if (aVarArr != null && aVarArr.length >= 2) {
            this.f24408s.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, Float.valueOf(f10)));
        }
        this.f24411v = false;
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        return this.f24410u;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        return this.f24409t;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        return this.f24411v;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean h() {
        return (this.f24408s == null || this.f24415z || this.f24434e != com.fyber.inneractive.sdk.player.enums.b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.enums.b bVar;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f24434e;
        if (bVar2 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar2 == (bVar = com.fyber.inneractive.sdk.player.enums.b.Paused) || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            IAlog.a("%s paused called when player is in mState: %s ignoring", IAlog.a(this), bVar2);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f24408s;
        if (gVar != null && !this.f24415z) {
            gVar.a(false);
        }
        k();
        a(bVar);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        IAlog.a("%sstart called", IAlog.a(this));
        if (h()) {
            return;
        }
        a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
        this.f24408s.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        long jA;
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f24408s;
        if (gVar == null || this.f24415z) {
            return 0;
        }
        if (!gVar.f25563m.c() && gVar.f25561k <= 0) {
            gVar.f25563m.a(gVar.f25567q.f25589a, gVar.f25557g, false);
            jA = com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f25567q.f25591c) + com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.f25557g.f26082e);
        } else {
            jA = gVar.f25569s;
        }
        return (int) jA;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final String d() {
        return this.A ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10, boolean z10) {
        IAlog.a("%sseekTo called with %d playAfterSeek = %s", IAlog.a(this), Integer.valueOf(i10), Boolean.valueOf(z10));
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f24408s;
        if (gVar == null || this.f24415z) {
            return;
        }
        gVar.a(z10);
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.f24408s;
        gVar2.a(gVar2.a(), i10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%ssetSurface called with %s", IAlog.a(this), surface);
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f24412w;
        if (aVarArr == null || (gVar = this.f24408s) == null || this.f24415z) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[0], 1, surface));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z10) {
        if (this.f24408s != null || this.f24415z) {
            return;
        }
        this.D = z10;
        IAlog.a("%sMediaPlayerController: creating media player", IAlog.a(this));
        b0 b0Var = this.f24414y;
        if (b0Var != null) {
            b0Var.f24393a.clear();
        }
        this.f24414y = new b0(this);
        this.f24413x = new Handler(Looper.getMainLooper());
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.a[z10 ? 2 : 1];
        this.f24412w = aVarArr;
        aVarArr[0] = new MediaCodecVideoRenderer(this.f24413x, this.f24414y);
        if (z10) {
            this.f24412w[1] = new MediaCodecAudioRenderer();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.g(this.f24412w, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d(), new com.fyber.inneractive.sdk.player.exoplayer2.c());
        this.f24408s = gVar;
        gVar.f25555e.add(this.f24414y);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    @Override // com.fyber.inneractive.sdk.player.controller.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r10, int r11) {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.g r0 = r9.f24408s
            if (r0 == 0) goto Ld0
            boolean r0 = r9.f24415z
            if (r0 != 0) goto Ld0
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.a(r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r10}
            java.lang.String r1 = "%sloadMediaPlayerUri called with %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r0)
            android.net.Uri r3 = android.net.Uri.parse(r10)
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a
            java.lang.String r10 = r3.getPath()
            r0 = 2
            if (r10 != 0) goto L23
            goto L5d
        L23:
            java.lang.String r10 = r10.toLowerCase()
            java.lang.String r1 = ".mpd"
            boolean r1 = r10.endsWith(r1)
            if (r1 == 0) goto L31
            r10 = 0
            goto L60
        L31:
            java.lang.String r1 = ".m3u8"
            boolean r1 = r10.endsWith(r1)
            if (r1 == 0) goto L3b
            r10 = r0
            goto L60
        L3b:
            java.lang.String r1 = ".ism"
            boolean r1 = r10.endsWith(r1)
            if (r1 != 0) goto L5f
            java.lang.String r1 = ".isml"
            boolean r1 = r10.endsWith(r1)
            if (r1 != 0) goto L5f
            r1 = 0
            java.lang.String r1 = com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ.cxU
            boolean r1 = r10.endsWith(r1)
            if (r1 != 0) goto L5f
            java.lang.String r1 = ".isml/manifest"
            boolean r10 = r10.endsWith(r1)
            if (r10 == 0) goto L5d
            goto L5f
        L5d:
            r10 = 3
            goto L60
        L5f:
            r10 = 1
        L60:
            boolean r1 = r9.A
            if (r1 == 0) goto L7b
            com.fyber.inneractive.sdk.player.cache.n r1 = com.fyber.inneractive.sdk.player.cache.n.f24382f
            boolean r1 = r1.f24385c
            if (r1 == 0) goto L7b
            boolean r1 = com.fyber.inneractive.sdk.util.s.a()
            if (r1 == 0) goto L7b
            if (r10 == r0) goto L7b
            com.fyber.inneractive.sdk.player.cache.i r1 = new com.fyber.inneractive.sdk.player.cache.i
            com.fyber.inneractive.sdk.config.global.r r2 = r9.f24406q
            r1.<init>(r9, r11, r2)
        L79:
            r4 = r1
            goto Laf
        L7b:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m r11 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.m
            r11.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.q r1 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.q
            com.fyber.inneractive.sdk.config.IAConfigManager r2 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.util.s1 r2 = r2.f23230y
            java.lang.String r2 = r2.a()
            r1.<init>(r2, r11)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.o r2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.o
            android.content.Context r4 = r9.f24430a
            r2.<init>(r4, r11, r1)
            android.content.Context r11 = r9.f24430a
            java.lang.String r1 = "ia-vid-cache-ex2"
            java.io.File r11 = com.fyber.inneractive.sdk.player.cache.n.a(r11, r1)
            if (r11 == 0) goto Lae
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j r1 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j
            r1.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l r4 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l
            r4.<init>(r11, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.f r1 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.f
            r1.<init>(r4, r2)
            goto L79
        Lae:
            r4 = r2
        Laf:
            if (r10 == r0) goto Lc2
            com.fyber.inneractive.sdk.player.exoplayer2.source.q r2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.q
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.c r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.c
            r5.<init>()
            int r6 = r9.f24407r
            android.os.Handler r7 = r9.f24413x
            com.fyber.inneractive.sdk.player.controller.b0 r8 = r9.f24414y
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto Lcb
        Lc2:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j r2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j
            android.os.Handler r10 = r9.f24413x
            com.fyber.inneractive.sdk.player.controller.b0 r11 = r9.f24414y
            r2.<init>(r3, r4, r10, r11)
        Lcb:
            r9.C = r2
            r9.a(r2)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.f.a(java.lang.String, int):void");
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.f24408s;
        if (gVar == null || uVar == null) {
            return;
        }
        if (!gVar.f25563m.c() || gVar.f25564n != null) {
            gVar.f25563m = com.fyber.inneractive.sdk.player.exoplayer2.x.f26159a;
            gVar.f25564n = null;
            Iterator it = gVar.f25555e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
        }
        if (gVar.f25558h) {
            gVar.f25558h = false;
            int i10 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f25824d;
            gVar.f25565o = gVar.f25552b;
            ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) gVar.f25551a).getClass();
            Iterator it2 = gVar.f25555e.iterator();
            while (it2.hasNext()) {
                ((b0) it2.next()).getClass();
            }
        }
        gVar.f25562l++;
        gVar.f25554d.f25604f.obtainMessage(0, 1, 0, uVar).sendToTarget();
        a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
    }
}
