package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends z implements com.fyber.inneractive.sdk.flow.storepromo.loader.b {
    public boolean A;
    public final boolean B;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f24418z;

    public g(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, boolean z11, String str) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        super(fVar, sVar, s0Var, rVar, z10, str);
        this.f24418z = false;
        this.A = false;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f24455a;
        if (fVar2 != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar2).f26228v) != null) {
            bVar.f23786e = this;
        }
        this.f24418z = false;
        this.B = z11;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final boolean A() {
        return !this.f24418z;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void E() {
        q qVar;
        super.E();
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar == null || (qVar = fVar.f26160a) == null || qVar.f24434e != com.fyber.inneractive.sdk.player.enums.b.Completed || !this.f24418z) {
            return;
        }
        this.f24458d.m();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a() throws JSONException {
        if (!this.f24462h) {
            f();
            return;
        }
        if (this.f24458d.b()) {
            return;
        }
        this.f24458d.a(false);
        Runnable runnable = this.f24464j;
        if (runnable != null) {
            this.f24458d.removeCallbacks(runnable);
            this.f24464j = null;
        }
        E();
        D();
        this.f24465k = false;
        this.f24462h = true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.controller.b
    public final void b(boolean z10) throws JSONException {
        super.b(z10);
        if (this.f24418z) {
            this.f24458d.m();
            this.f24458d.g(false);
            this.f24460f = 0;
        }
        C();
        this.f24458d.e(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[ADDED_TO_REGION] */
    @Override // com.fyber.inneractive.sdk.player.controller.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r5 = this;
            super.f()
            com.fyber.inneractive.sdk.player.f r0 = r5.f24455a
            r1 = 0
            if (r0 == 0) goto L6d
            com.fyber.inneractive.sdk.player.controller.q r0 = r0.f26160a
            if (r0 == 0) goto L6d
            boolean r0 = r5.A
            if (r0 == 0) goto L11
            goto L6d
        L11:
            r0 = 2
            com.fyber.inneractive.sdk.player.ui.s r2 = r5.f24458d     // Catch: java.lang.Throwable -> L29
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L29
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch: java.lang.Throwable -> L29
            int r3 = r2.getRingerMode()     // Catch: java.lang.Throwable -> L29
            int r2 = r2.getStreamVolume(r0)     // Catch: java.lang.Throwable -> L2a
            goto L2b
        L29:
            r3 = r1
        L2a:
            r2 = r1
        L2b:
            boolean r4 = r5.f24418z
            if (r4 != 0) goto L3e
            com.fyber.inneractive.sdk.config.s0 r4 = r5.f24456b
            com.fyber.inneractive.sdk.config.r0 r4 = (com.fyber.inneractive.sdk.config.r0) r4
            com.fyber.inneractive.sdk.config.t0 r4 = r4.f23348f
            java.lang.Boolean r4 = r4.f23402d
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3e
            goto L5e
        L3e:
            boolean r4 = r5.B
            if (r4 != 0) goto L5e
            boolean r4 = r5.p()
            if (r4 == 0) goto L49
            goto L5e
        L49:
            if (r2 <= 0) goto L61
            if (r3 != r0) goto L61
            java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.a(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "%s setting default volume. unmuting player"
            com.fyber.inneractive.sdk.util.IAlog.a(r2, r0)
            r5.i(r1)
            goto L61
        L5e:
            r5.f(r1)
        L61:
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            boolean r2 = r5.p()
            r0.setMuteButtonState(r2)
            r0 = 1
            r5.A = r0
        L6d:
            r5.h(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.g.f():void");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final int i() {
        return IAConfigManager.O.f23226u.f23394b.a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.fyber.inneractive.sdk.player.controller.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o() {
        /*
            r10 = this;
            com.fyber.inneractive.sdk.config.global.r r0 = r10.f24457c
            if (r0 == 0) goto L29
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.c> r1 = com.fyber.inneractive.sdk.config.global.features.c.class
            com.fyber.inneractive.sdk.config.global.features.h r0 = r0.a(r1)
            com.fyber.inneractive.sdk.config.global.features.c r0 = (com.fyber.inneractive.sdk.config.global.features.c) r0
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.HashMap r0 = r0.f23291c
            java.util.Collection r0 = r0.values()
            r2.<init>(r0)
            int r0 = r2.size()
            if (r0 <= 0) goto L29
            com.fyber.inneractive.sdk.config.global.r r0 = r10.f24457c
            com.fyber.inneractive.sdk.config.global.features.h r0 = r0.a(r1)
            com.fyber.inneractive.sdk.config.global.features.c r0 = (com.fyber.inneractive.sdk.config.global.features.c) r0
            goto L2a
        L29:
            r0 = 0
        L2a:
            r1 = 8
            r2 = 5
            r3 = -1
            if (r0 == 0) goto L45
            java.lang.String r4 = "skip_time_sec"
            java.lang.Integer r0 = r0.a(r4)
            if (r0 == 0) goto L3d
            int r0 = r0.intValue()
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 < 0) goto L43
            if (r0 > r1) goto L43
            goto L46
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            com.fyber.inneractive.sdk.config.IAConfigManager r4 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            com.fyber.inneractive.sdk.config.s r4 = r4.f23226u
            com.fyber.inneractive.sdk.config.o r4 = r4.f23394b
            com.fyber.inneractive.sdk.config.s0 r5 = r10.f24456b
            com.fyber.inneractive.sdk.config.enums.Skip r6 = r10.f24478x
            boolean r7 = com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()
            java.lang.String r8 = "vast_configuration"
            com.fyber.inneractive.sdk.config.l r4 = r4.a(r8)
            java.lang.String r8 = "skip_d"
            r4.getClass()
            java.util.HashMap r9 = r4.f23328a     // Catch: java.lang.Exception -> L74
            boolean r9 = r9.containsKey(r8)     // Catch: java.lang.Exception -> L74
            if (r9 == 0) goto L74
            java.util.HashMap r4 = r4.f23328a     // Catch: java.lang.Exception -> L74
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Exception -> L74
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L74
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L74
            goto L75
        L74:
            r4 = r3
        L75:
            int r4 = java.lang.Math.max(r4, r3)
            if (r6 != 0) goto L85
            if (r5 == 0) goto L85
            com.fyber.inneractive.sdk.config.r0 r5 = (com.fyber.inneractive.sdk.config.r0) r5
            com.fyber.inneractive.sdk.config.t0 r5 = r5.f23348f
            if (r5 == 0) goto L85
            com.fyber.inneractive.sdk.config.enums.Skip r6 = r5.f23406h
        L85:
            if (r7 == 0) goto La7
            if (r0 <= r3) goto L8d
            if (r0 > r1) goto L8d
            r2 = r0
            goto Lbd
        L8d:
            if (r4 <= r3) goto L92
            if (r4 > r1) goto L92
            goto Lab
        L92:
            java.lang.Integer r0 = r6.value()
            int r0 = r0.intValue()
            if (r0 <= r3) goto Lbd
            if (r0 > r1) goto Lbd
            java.lang.Integer r0 = r6.value()
            int r2 = r0.intValue()
            goto Lbd
        La7:
            if (r4 <= r3) goto Lad
            if (r4 > r2) goto Lad
        Lab:
            r2 = r4
            goto Lbd
        Lad:
            com.fyber.inneractive.sdk.config.enums.Skip r0 = com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT
            if (r6 != r0) goto Lb5
            r2 = 99999(0x1869f, float:1.40128E-40)
            goto Lbd
        Lb5:
            java.lang.Integer r0 = r6.value()
            int r2 = r0.intValue()
        Lbd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.g.o():int");
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void r() throws JSONException {
        this.f24472r = true;
        IAlog.a("%s onBufferingTimeout reached. Skipping to end card", IAlog.a(this));
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void t() {
        g0 g0Var = this.f24461g;
        if (g0Var != null) {
            g0Var.j();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void v() {
        this.f24458d.g(true);
        C();
        h();
        f();
        h(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void x() {
        super.x();
        if (this.f24418z) {
            this.f24458d.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z
    public final void b(g1 g1Var) {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        TapAction tapAction = ((r0) this.f24456b).f23348f.f23407i;
        if (tapAction == TapAction.CTR) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
            return;
        }
        if (tapAction != TapAction.FULLSCREEN && tapAction != TapAction.DO_NOTHING) {
            IAlog.a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.a(this), tapAction);
            return;
        }
        if (((com.fyber.inneractive.sdk.config.global.features.u) this.f24457c.a(com.fyber.inneractive.sdk.config.global.features.u.class)).c().equals(com.fyber.inneractive.sdk.config.global.features.t.OPEN) || ((this.f24474t != com.fyber.inneractive.sdk.ignite.m.NONE && IAConfigManager.O.E.n()) || ((sVar = this.f24458d) != null && sVar.a()))) {
            a(false, VideoClickOrigin.VIDEO, g1Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.z, com.fyber.inneractive.sdk.player.ui.n
    public final void a(boolean z10) throws JSONException {
        e(z10);
        super.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.loader.b
    public final void a(g1 g1Var) throws JSONException {
        a(11, g1Var);
    }
}
