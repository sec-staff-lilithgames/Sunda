package com.fyber.inneractive.sdk.player.controller;

import android.app.Application;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.media.InteractionType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z implements b, p, o, com.fyber.inneractive.sdk.player.ui.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.f f24455a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f24456b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f24457c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.ui.s f24458d;

    /* renamed from: e, reason: collision with root package name */
    public x f24459e;

    /* renamed from: g, reason: collision with root package name */
    public g0 f24461g;

    /* renamed from: j, reason: collision with root package name */
    public Runnable f24464j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24465k;

    /* renamed from: m, reason: collision with root package name */
    public u f24467m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f24468n;

    /* renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.g f24475u;

    /* renamed from: v, reason: collision with root package name */
    public final String f24476v;

    /* renamed from: f, reason: collision with root package name */
    public int f24460f = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24462h = false;

    /* renamed from: i, reason: collision with root package name */
    public float f24463i = -0.1f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24466l = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24469o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24470p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f24471q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24472r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24473s = false;

    /* renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f24474t = com.fyber.inneractive.sdk.ignite.m.NONE;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24477w = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24479y = false;

    /* renamed from: x, reason: collision with root package name */
    public final Skip f24478x = null;

    public z(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z10, String str) {
        q qVar;
        this.f24455a = fVar;
        this.f24456b = s0Var;
        this.f24457c = rVar;
        this.f24458d = sVar;
        this.f24468n = z10;
        this.f24476v = str;
        sVar.setListener(this);
        if (fVar == null || (qVar = fVar.f26160a) == null) {
            return;
        }
        if (!qVar.f24431b.contains(this)) {
            qVar.f24431b.add(this);
        }
        q qVar2 = fVar.f26160a;
        if (qVar2.f24432c.contains(this)) {
            return;
        }
        qVar2.f24432c.add(this);
    }

    public static int l() {
        int i10;
        try {
            i10 = Integer.parseInt(IAConfigManager.O.f23226u.f23394b.a("max_rv_tsec", Integer.toString(30)));
        } catch (Throwable unused) {
            i10 = 30;
        }
        if (i10 < 1) {
            return 30;
        }
        return i10;
    }

    public abstract boolean A();

    public boolean B() {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        t0 t0Var;
        s0 s0Var = this.f24456b;
        boolean z10 = (s0Var == null || (t0Var = ((r0) s0Var).f23348f) == null || t0Var.f23408j != UnitDisplayType.REWARDED) ? false : true;
        if (!InneractiveAdManager.isCurrentUserAChild() || !z10 || this.f24458d == null || (fVar = this.f24455a) == null || (qVar = fVar.f26160a) == null) {
            return false;
        }
        int iB = qVar.b() / 1000;
        return (this.f24455a.f26160a.c() / 1000) - iB <= 0 || iB < l();
    }

    public void C() {
        Boolean boolC;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f24457c;
        com.fyber.inneractive.sdk.config.global.features.u uVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class) : null;
        boolean zBooleanValue = (uVar == null || (boolC = uVar.c("show_cta")) == null) ? true : boolC.booleanValue();
        g0 g0Var = this.f24461g;
        if (g0Var != null) {
            this.f24474t = g0Var.p();
        }
        com.fyber.inneractive.sdk.ignite.m mVar = this.f24474t;
        this.f24458d.a(mVar == com.fyber.inneractive.sdk.ignite.m.NONE ? zBooleanValue : true, mVar);
    }

    public final void D() throws JSONException {
        com.fyber.inneractive.sdk.flow.endcard.b bVarA;
        g0 g0Var;
        com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar;
        boolean z10;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar3;
        View view;
        View view2;
        com.fyber.inneractive.sdk.flow.endcard.b bVar;
        com.fyber.inneractive.sdk.model.vast.o oVar;
        this.f24458d.h();
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ != null) {
            bVarA = kVarJ.a();
            com.fyber.inneractive.sdk.flow.endcard.h hVar = kVarJ.f23577e;
            com.fyber.inneractive.sdk.flow.endcard.m mVar = kVarJ.f23574b;
            hVar.getClass();
            if (mVar.f23609a.size() >= 1) {
                com.fyber.inneractive.sdk.flow.endcard.b bVarA2 = mVar.a();
                com.fyber.inneractive.sdk.model.vast.i iVar = com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
                Iterator it = mVar.f23609a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar = null;
                        break;
                    } else {
                        bVar = (com.fyber.inneractive.sdk.flow.endcard.b) it.next();
                        if (bVar.i() == iVar) {
                            break;
                        }
                    }
                }
                if (bVarA2 != null && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card && bVarA2.i() != com.fyber.inneractive.sdk.model.vast.i.Default_End_Card && bVarA2.l() && (oVar = bVarA2.f23557c.f23954e.f24075f) != null && oVar.f24129d && bVar != null && bVar.l()) {
                    hVar.a(bVarA2, bVar.l());
                    hVar.a(bVar, true, bVarA2.k());
                } else if (bVarA2 == bVar || bVarA2 == null || bVarA2.g() == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD) {
                    hVar.a(bVarA2, false, false);
                } else {
                    hVar.a(bVarA2, false);
                }
            }
        } else {
            bVarA = null;
        }
        if (bVarA == null) {
            if (e() || (g0Var = this.f24461g) == null) {
                return;
            }
            g0Var.j();
            return;
        }
        a(bVarA);
        if (n() != null) {
            com.fyber.inneractive.sdk.flow.storepromo.b bVarN = n();
            com.fyber.inneractive.sdk.player.ui.s sVar = this.f24458d;
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = bVarN.f23785d;
            if (bVar2 == null || (cVar = bVar2.f23794c) == null || !(z10 = cVar.f23805e)) {
                bVarN.f23782a.a();
                bVarN.a();
                bVarN.a((bVarN.f23785d == null ? com.fyber.inneractive.sdk.flow.storepromo.events.a.CONTROLLER_NOT_INITIALIZED : com.fyber.inneractive.sdk.flow.storepromo.events.a.TEMPLATE_NOT_LOADED).name(), (String) null, (String) null);
                return;
            }
            bVar2.f23800i = kVarJ;
            if (!z10 || (cVar2 = bVar2.f23795d) == null || bVar2.f23798g) {
                return;
            }
            if (cVar2.f23883b == null || (view2 = cVar2.f23882a) == null || view2.getParent() == null || cVar2.f23883b.getVisibility() != 0) {
                com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar4 = bVar2.f23795d;
                if (cVar4.f23883b == null || cVar4.f23882a == null) {
                    IAlog.f("StorePromoView: show: missing container or content", new Object[0]);
                    return;
                }
                cVar4.a();
                com.fyber.inneractive.sdk.util.v.a(cVar4.f23883b);
                sVar.addView(cVar4.f23883b);
                cVar4.f23882a.setAnimation(cVar4.f23884c);
                cVar4.f23883b.setVisibility(0);
                com.fyber.inneractive.sdk.flow.storepromo.b bVar3 = cVar4.f23887f;
                if (bVar3 != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar4 = bVar3.f23785d;
                    com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar5 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar4 == null || (cVar3 = bVar4.f23795d) == null || cVar3.f23883b == null || (view = cVar3.f23882a) == null || view.getParent() == null || cVar3.f23883b.getVisibility() != 0) ? false : true, bVar3.f23790i);
                    Iterator it2 = bVar3.f23789h.iterator();
                    while (it2.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it2.next()).a(bVar5);
                    }
                    JSONObject jSONObject = new JSONObject();
                    Integer numValueOf = Integer.valueOf(bVar3.f23788g);
                    try {
                        jSONObject.put("screenshots", numValueOf);
                    } catch (Exception unused) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "screenshots", numValueOf);
                    }
                    com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_SP_IMPRESSION;
                    InneractiveAdRequest inneractiveAdRequest = bVar3.f23784c;
                    com.fyber.inneractive.sdk.response.e eVar = bVar3.f23783b;
                    String str = bVar3.f23787f;
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, eVar);
                    try {
                        jSONObject.put("templateURL", str);
                    } catch (Exception unused2) {
                        IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
                    }
                    wVar.f24329f.put(jSONObject);
                    wVar.a((String) null);
                }
            }
        }
    }

    public void E() {
        boolean z10;
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null && (((qVar2 = fVar.f26160a) != null && qVar2.f24434e == com.fyber.inneractive.sdk.player.enums.b.Completed) || this.f24471q)) {
            fVar.a();
        }
        boolean zA = IAConfigManager.O.f23226u.f23394b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a();
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f24458d;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f24455a;
        sVar.e((fVar2 == null || (qVar = fVar2.f26160a) == null || qVar.f24434e != com.fyber.inneractive.sdk.player.enums.b.Completed) && !(((z10 = this.f24471q) && !zA) || this.f24472r || (z10 && zA)));
    }

    public void a() {
    }

    public abstract void b(g1 g1Var);

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar == null) {
            return false;
        }
        if (this.f24462h || fVar.f26160a == null) {
            return true;
        }
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f24458d;
        if (sVar != null && sVar.i()) {
            return true;
        }
        int iC = this.f24455a.f26160a.c();
        com.fyber.inneractive.sdk.player.f fVar2 = this.f24455a;
        return com.fyber.inneractive.sdk.player.f.a(iC, com.fyber.inneractive.sdk.player.f.a(fVar2), ((com.fyber.inneractive.sdk.player.n) fVar2).f26225s) && !this.f24462h && this.f24460f == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
        if (this.f24469o && !this.f24466l) {
            this.f24466l = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void destroy() {
        q qVar;
        Application application;
        u uVar = this.f24467m;
        if (uVar != null && (application = com.fyber.inneractive.sdk.util.o.f26796a) != null) {
            application.unregisterActivityLifecycleCallbacks(uVar);
        }
        IAlog.a("%sdestroy called", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null && (qVar = fVar.f26160a) != null) {
            qVar.f24431b.remove(this);
            this.f24455a.f26160a.f24432c.remove(this);
        }
        g();
        Runnable runnable = this.f24464j;
        if (runnable != null) {
            this.f24458d.removeCallbacks(runnable);
            this.f24464j = null;
        }
        this.f24461g = null;
    }

    public boolean e() {
        String str;
        com.fyber.inneractive.sdk.flow.endcard.k kVarJ = j();
        if (kVarJ != null) {
            com.fyber.inneractive.sdk.response.g gVar = kVarJ.f23573a.f23953d;
            if (!((gVar == null || (str = gVar.E) == null || !TextUtils.equals(str, "1")) ? false : true)) {
                return true;
            }
        }
        return false;
    }

    public final void f(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null && (qVar = fVar.f26160a) != null) {
            qVar.b(z10);
        }
        this.f24458d.setMuteButtonState(true);
    }

    public void g() {
        if (this.f24475u != null) {
            IAlog.a("%sdestroyTextureView", IAlog.a(this));
        }
    }

    public void h(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null) {
            if (!fVar.f26166g) {
                E();
                return;
            }
            if (z10 && (qVar = fVar.f26160a) != null) {
                qVar.a(0, true);
                return;
            }
            q qVar2 = fVar.f26160a;
            if (qVar2 != null) {
                com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.f24434e;
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                    qVar2.a(1, true);
                } else {
                    qVar2.j();
                }
            }
        }
    }

    public abstract int i();

    public final void i(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null && (qVar = fVar.f26160a) != null) {
            qVar.d(z10);
        }
        this.f24458d.setMuteButtonState(false);
    }

    public final com.fyber.inneractive.sdk.flow.endcard.k j() {
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f26226t;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.web.b0 k() {
        return new w(this);
    }

    public final float m() {
        try {
            return ((AudioManager) this.f24458d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    public com.fyber.inneractive.sdk.flow.storepromo.b n() {
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).f26228v;
        }
        return null;
    }

    public abstract int o();

    public final boolean p() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        return (fVar == null || (qVar = fVar.f26160a) == null || (!qVar.g() && ((double) m()) != 0.0d)) ? false : true;
    }

    public final void q() {
        this.f24458d.a(true);
        this.f24458d.e(false);
        Runnable runnable = this.f24464j;
        if (runnable == null) {
            if (runnable == null) {
                this.f24464j = new t(this);
            }
            int i10 = i();
            IAlog.a("%s Starting buffering timeout with %d", IAlog.a(this), Integer.valueOf(i10));
            this.f24458d.postDelayed(this.f24464j, i10);
        }
    }

    public abstract void r();

    public void s() throws JSONException {
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    public abstract void t();

    public void u() {
        Runnable runnable = this.f24464j;
        if (runnable != null) {
            this.f24458d.removeCallbacks(runnable);
            this.f24464j = null;
        }
        this.f24458d.a(false);
        E();
    }

    public abstract void v();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r1 = 0
            r0.a(r1)
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r0.e(r1)
            java.lang.Runnable r0 = r5.f24464j
            if (r0 == 0) goto L17
            com.fyber.inneractive.sdk.player.ui.s r2 = r5.f24458d
            r2.removeCallbacks(r0)
            r0 = 0
            r5.f24464j = r0
        L17:
            com.fyber.inneractive.sdk.player.f r0 = r5.f24455a
            r2 = 1
            if (r0 == 0) goto L74
            boolean r0 = r5.A()
            if (r0 == 0) goto L74
            boolean r0 = r5.f24462h
            if (r0 != 0) goto L74
            com.fyber.inneractive.sdk.player.f r0 = r5.f24455a
            com.fyber.inneractive.sdk.player.controller.q r0 = r0.f26160a
            int r0 = r0.c()
            com.fyber.inneractive.sdk.player.f r3 = r5.f24455a
            r4 = r3
            com.fyber.inneractive.sdk.player.n r4 = (com.fyber.inneractive.sdk.player.n) r4
            com.fyber.inneractive.sdk.config.s0 r4 = r4.f26225s
            int r3 = com.fyber.inneractive.sdk.player.f.a(r3)
            boolean r0 = com.fyber.inneractive.sdk.player.f.a(r0, r3, r4)
            if (r0 == 0) goto L74
            int r0 = r5.f24460f
            if (r0 > 0) goto L4c
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r0.g(r2)
            r5.h()
            goto L74
        L4c:
            com.fyber.inneractive.sdk.player.f r0 = r5.f24455a
            if (r0 == 0) goto L64
            com.fyber.inneractive.sdk.player.controller.q r0 = r0.f26160a
            if (r0 == 0) goto L64
            int r0 = r0.c()
            int r0 = r0 / 1000
            int r3 = r5.f24460f
            if (r3 < r0) goto L64
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r0.g(r1)
            goto L74
        L64:
            boolean r0 = r5.f24470p
            if (r0 != 0) goto L74
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r0.g(r2)
            int r0 = r5.f24460f
            r5.b(r0)
            r5.f24470p = r2
        L74:
            com.fyber.inneractive.sdk.player.controller.g0 r0 = r5.f24461g
            if (r0 == 0) goto L81
            boolean r3 = r5.f24465k
            if (r3 != 0) goto L81
            r5.f24465k = r2
            r0.k()
        L81:
            r5.f24471q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.x():void");
    }

    public final void y() {
        com.fyber.inneractive.sdk.player.ui.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f24458d;
        if (sVar != null) {
            sVar.o();
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null && fVar.f26160a != null && (gVar = this.f24475u) != null) {
            gVar.invalidate();
            this.f24475u.requestLayout();
        }
        com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f24458d;
        if (sVar2 != null) {
            sVar2.invalidate();
            this.f24458d.requestLayout();
        }
    }

    public void z() {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar == null || (qVar = fVar.f26160a) == null) {
            return;
        }
        if (qVar.f24434e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            IAlog.a("%spauseVideo called in bad state! %s", IAlog.a(this), qVar.f24434e);
            return;
        }
        IAlog.a("%spauseVideo %s", IAlog.a(this), this.f24458d);
        TextureView textureView = qVar.f24439j;
        if (textureView == null || textureView.getParent() == null || textureView.getParent() != this.f24458d.getTextureHost()) {
            return;
        }
        qVar.i();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.ui.n
    public void c() {
        IAlog.a("%sonVideoViewDetachedFromWindow", IAlog.a(this));
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    @Override // com.fyber.inneractive.sdk.player.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.fyber.inneractive.sdk.flow.endcard.b r6) {
        /*
            r5 = this;
            int r0 = r6.f23560f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "IAVideoUIControllerBase: showEndCard: dismiss time: %d sec."
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r0)
            boolean r0 = r6 instanceof com.fyber.inneractive.sdk.flow.endcard.c
            r1 = 0
            if (r0 == 0) goto L57
            com.fyber.inneractive.sdk.flow.endcard.c r6 = (com.fyber.inneractive.sdk.flow.endcard.c) r6
            com.fyber.inneractive.sdk.player.ui.c r0 = r6.d()
            com.fyber.inneractive.sdk.player.ui.c r0 = r5.a(r0)
            com.fyber.inneractive.sdk.player.ui.b r2 = new com.fyber.inneractive.sdk.player.ui.b
            r2.<init>(r0)
            boolean r0 = r2.f26244a
            if (r0 == 0) goto Ld0
            com.fyber.inneractive.sdk.web.b0 r0 = r5.k()
            com.fyber.inneractive.sdk.flow.endcard.n r3 = r6.f()
            com.fyber.inneractive.sdk.flow.endcard.a r3 = (com.fyber.inneractive.sdk.flow.endcard.a) r3
            boolean r4 = r3 instanceof com.fyber.inneractive.sdk.flow.endcard.u
            if (r4 == 0) goto L42
            com.fyber.inneractive.sdk.flow.endcard.u r3 = (com.fyber.inneractive.sdk.flow.endcard.u) r3
            com.fyber.inneractive.sdk.player.controller.d r3 = r3.e()
            com.fyber.inneractive.sdk.web.i1 r3 = r3.f24397a
            if (r3 == 0) goto L42
            r3.setListener(r0)
        L42:
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r0.e(r1)
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r0.a(r6, r2)
            com.fyber.inneractive.sdk.player.ui.s r6 = r5.f24458d
            android.view.ViewGroup r6 = r6.f26320l
            if (r6 == 0) goto Ld0
            r0 = 4
            r6.setVisibility(r0)
            return
        L57:
            boolean r0 = r6 instanceof com.fyber.inneractive.sdk.flow.endcard.o
            if (r0 == 0) goto L89
            com.fyber.inneractive.sdk.flow.endcard.o r6 = (com.fyber.inneractive.sdk.flow.endcard.o) r6
            com.fyber.inneractive.sdk.player.ui.c r0 = r6.d()
            com.fyber.inneractive.sdk.player.ui.c r0 = r5.a(r0)
            com.fyber.inneractive.sdk.player.ui.b r1 = new com.fyber.inneractive.sdk.player.ui.b
            r1.<init>(r0)
            boolean r0 = r1.f26244a
            if (r0 == 0) goto Ld0
            com.fyber.inneractive.sdk.web.b0 r0 = r5.k()
            com.fyber.inneractive.sdk.flow.endcard.n r2 = r6.f()
            com.fyber.inneractive.sdk.flow.endcard.p r2 = (com.fyber.inneractive.sdk.flow.endcard.p) r2
            com.fyber.inneractive.sdk.player.controller.d r2 = r2.e()
            com.fyber.inneractive.sdk.web.i1 r2 = r2.f24397a
            if (r2 == 0) goto L83
            r2.setListener(r0)
        L83:
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r0.a(r6, r1)
            return
        L89:
            boolean r0 = r6 instanceof com.fyber.inneractive.sdk.flow.endcard.d
            if (r0 == 0) goto Ld0
            com.fyber.inneractive.sdk.flow.endcard.d r6 = (com.fyber.inneractive.sdk.flow.endcard.d) r6
            com.fyber.inneractive.sdk.player.ui.c r0 = r6.d()
            java.lang.String r2 = r5.f24476v
            if (r2 == 0) goto L98
            goto Lb7
        L98:
            com.fyber.inneractive.sdk.config.global.r r2 = r5.f24457c
            if (r2 == 0) goto Lb6
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.d> r3 = com.fyber.inneractive.sdk.config.global.features.d.class
            com.fyber.inneractive.sdk.config.global.features.h r2 = r2.a(r3)
            com.fyber.inneractive.sdk.config.global.features.d r2 = (com.fyber.inneractive.sdk.config.global.features.d) r2
            com.fyber.inneractive.sdk.config.IAConfigManager r3 = com.fyber.inneractive.sdk.config.IAConfigManager.O
            java.lang.String r3 = r3.f23220o
            r2.d(r3)
            com.fyber.inneractive.sdk.model.vast.a r2 = r2.f23289e
            if (r2 == 0) goto Lb6
            boolean r3 = r2.f24068d
            if (r3 == 0) goto Lb6
            java.lang.String r2 = r2.f24065a
            goto Lb7
        Lb6:
            r2 = 0
        Lb7:
            r0.f26255c = r2
            com.fyber.inneractive.sdk.player.ui.c r0 = r5.a(r0)
            com.fyber.inneractive.sdk.player.ui.b r2 = new com.fyber.inneractive.sdk.player.ui.b
            r2.<init>(r0)
            boolean r0 = r2.f26244a
            if (r0 == 0) goto Ld0
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r0.e(r1)
            com.fyber.inneractive.sdk.player.ui.s r0 = r5.f24458d
            r0.a(r6, r2)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.a(com.fyber.inneractive.sdk.flow.endcard.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r6) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.d(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(boolean r6) {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.controller.f0 r0 = new com.fyber.inneractive.sdk.player.controller.f0
            com.fyber.inneractive.sdk.player.ui.s r1 = r5.f24458d
            android.content.Context r1 = r1.getContext()
            com.fyber.inneractive.sdk.config.global.r r2 = r5.f24457c
            if (r2 == 0) goto L31
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.c> r3 = com.fyber.inneractive.sdk.config.global.features.c.class
            com.fyber.inneractive.sdk.config.global.features.h r2 = r2.a(r3)
            com.fyber.inneractive.sdk.config.global.features.c r2 = (com.fyber.inneractive.sdk.config.global.features.c) r2
            r2.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.HashMap r2 = r2.f23291c
            java.util.Collection r2 = r2.values()
            r4.<init>(r2)
            int r2 = r4.size()
            if (r2 <= 0) goto L31
            com.fyber.inneractive.sdk.config.global.r r2 = r5.f24457c
            com.fyber.inneractive.sdk.config.global.features.h r2 = r2.a(r3)
            com.fyber.inneractive.sdk.config.global.features.c r2 = (com.fyber.inneractive.sdk.config.global.features.c) r2
            goto L32
        L31:
            r2 = 0
        L32:
            com.fyber.inneractive.sdk.player.controller.v r3 = new com.fyber.inneractive.sdk.player.controller.v
            r3.<init>(r5, r6)
            r0.<init>(r1, r2, r3)
            android.app.Dialog r6 = r0.f24417b
            r6.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.g(boolean):void");
    }

    public final void e(boolean z10) {
        q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar == null || (qVar = fVar.f26160a) == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar.f24434e;
        if (z10 && bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.f24458d.b()) {
            h(false);
            return;
        }
        if (!z10 && bVar == com.fyber.inneractive.sdk.player.enums.b.Paused && this.f24458d.b()) {
            int iB = qVar.b();
            int iC = qVar.c();
            if (iB <= 0 || iB > iC) {
                return;
            }
            qVar.a(iB - 1, false);
            qVar.a(iB, false);
        }
    }

    public void f() {
        q qVar;
        q qVar2;
        com.fyber.inneractive.sdk.measurement.f fVar;
        if (this.f24475u == null) {
            com.fyber.inneractive.sdk.player.ui.g gVar = new com.fyber.inneractive.sdk.player.ui.g(this.f24458d);
            this.f24475u = gVar;
            gVar.setId(R.id.ia_inn_texture_view);
            com.fyber.inneractive.sdk.player.f fVar2 = this.f24455a;
            if (fVar2 != null && (fVar = fVar2.f26164e) != null) {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f24458d;
                View[] trackingFriendlyView = sVar.getTrackingFriendlyView();
                AdSession adSession = fVar.f24013a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(sVar);
                    } catch (Throwable th2) {
                        fVar.a(th2);
                    }
                }
                if (fVar.f24013a != null && trackingFriendlyView != null) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                fVar.f24013a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                            } catch (Throwable th3) {
                                fVar.a(th3);
                            }
                        }
                    }
                }
                View[] trackingFriendlyViewObstructionPurposeOther = this.f24458d.getTrackingFriendlyViewObstructionPurposeOther();
                if (fVar.f24013a != null) {
                    for (View view2 : trackingFriendlyViewObstructionPurposeOther) {
                        if (view2 != null) {
                            try {
                                fVar.f24013a.addFriendlyObstruction(view2, FriendlyObstructionPurpose.OTHER, null);
                            } catch (Throwable th4) {
                                fVar.a(th4);
                            }
                        }
                    }
                }
            }
        }
        IAlog.a("%sconnectToTextureView called %s", IAlog.a(this), this.f24458d.getTextureHost());
        if (this.f24475u != null && this.f24458d.getTextureHost().equals(this.f24475u.getParent())) {
            IAlog.a("%sconnectToTextureView called but already connected", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f24455a;
        if (fVar3 != null && (qVar2 = fVar3.f26160a) != null) {
            qVar2.a(this.f24475u);
        }
        com.fyber.inneractive.sdk.player.ui.g gVar2 = this.f24475u;
        if (gVar2 != null && gVar2.getParent() == null) {
            IAlog.a("%supdateView adding texture to parent", IAlog.a(this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.f24458d.getTextureHost().addView(this.f24475u, layoutParams);
        }
        this.f24466l = false;
        x xVar = new x(this);
        this.f24459e = xVar;
        com.fyber.inneractive.sdk.player.f fVar4 = this.f24455a;
        if (fVar4 == null || (qVar = fVar4.f26160a) == null) {
            return;
        }
        qVar.f24433d = xVar;
    }

    public void h() {
        if (A()) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f24457c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.O.f23220o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f23289e;
                if (aVar != null && aVar.f24068d) {
                    str = aVar.f24066b;
                }
            }
            if (TextUtils.isEmpty(this.f24476v) && str != null) {
                this.f24458d.setSkipText(str);
            } else {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f24458d;
                sVar.setSkipText(sVar.getContext().getString(R.string.ia_video_skip_text));
            }
            this.f24458d.g();
            this.f24460f = 0;
            g0 g0Var = this.f24461g;
            if (g0Var != null) {
                g0Var.d();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void b(boolean z10) throws JSONException {
        IAlog.a("%sinitUI", IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar == null || fVar.f26160a == null) {
            return;
        }
        this.f24458d.setUnitConfig(this.f24456b);
        this.f24458d.a(this.f24468n, this.f24455a.f26160a.f(), this.f24455a.f26160a.e());
        if (A()) {
            this.f24460f = o();
        } else {
            this.f24458d.g(false);
        }
        if (!z10) {
            a(this.f24455a.f26160a.b());
            a(this.f24455a.f26160a.f24434e, false);
        }
        this.f24458d.setMuteButtonState(p());
    }

    public void w() {
    }

    public final void b(int i10) {
        if (this.f24458d != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.f24457c;
            String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(IAConfigManager.O.f23220o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.f23289e;
                if (aVar != null && aVar.f24068d) {
                    str = aVar.f24067c;
                }
            }
            if (TextUtils.isEmpty(this.f24476v) && str != null) {
                this.f24458d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i10)));
            } else {
                this.f24458d.setSkipText(String.valueOf(i10));
            }
        }
    }

    public final void b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f26228v) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f23781k) {
                bVar.f23789h.remove(aVar);
            }
            return;
        }
        IAlog.f("Unable to remove store promo observer, promo manager is unavailable", new Object[0]);
    }

    public final com.fyber.inneractive.sdk.player.ui.c a(com.fyber.inneractive.sdk.player.ui.c cVar) {
        String string;
        cVar.f26260h = this.f24455a != null && com.fyber.inneractive.sdk.player.f.a(this.f24457c, this.f24474t);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f24457c;
        com.fyber.inneractive.sdk.config.global.features.n nVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.n) rVar.a(com.fyber.inneractive.sdk.config.global.features.n.class) : null;
        if (nVar != null) {
            string = nVar.a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        } else {
            string = this.f24458d.getContext().getString(R.string.ia_video_app_info_text);
        }
        cVar.f26261i = string;
        cVar.f26259g = this.f24474t;
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) throws JSONException {
        IAlog.a("%sonPlayerStateChanged with %s", IAlog.a(this), bVar);
        a(bVar, true);
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z10) throws JSONException {
        g0 g0Var;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        switch (y.f24453a[bVar.ordinal()]) {
            case 1:
                boolean z11 = this.f24477w;
                if (z11) {
                    IAlog.a("IAVideoUIControllerBase playerStateUpdated=%s mBuffering=%s", bVar, String.valueOf(z11));
                    q();
                    break;
                }
                break;
            case 2:
                if (this.f24469o) {
                    E();
                    w();
                    break;
                }
                break;
            case 3:
                if (this.f24469o) {
                    this.f24477w = true;
                    q();
                    break;
                }
                break;
            case 4:
                if (this.f24477w) {
                    this.f24477w = false;
                }
                if (this.f24469o) {
                    x();
                    break;
                }
                break;
            case 5:
                u();
                break;
            case 6:
                if (this.f24469o || (!e() && !this.f24473s)) {
                    this.f24473s = true;
                    if (!this.f24458d.b()) {
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
                    if (z10 && (g0Var = this.f24461g) != null) {
                        g0Var.onCompleted();
                        break;
                    }
                }
                break;
            case 7:
                if (this.f24469o || ((sVar = this.f24458d) != null && sVar.isShown())) {
                    s();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    @Override // com.fyber.inneractive.sdk.player.controller.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.z.a(int):void");
    }

    public final void a(String str) {
        t0 t0Var;
        x0 x0Var = IAConfigManager.O.f23229x;
        s0 s0Var = this.f24456b;
        if (s0Var == null || (t0Var = ((r0) s0Var).f23348f) == null) {
            return;
        }
        x0Var.a(t0Var.f23408j, "LAST_VAST_CLICKED_TYPE", str);
    }

    public void a(boolean z10) throws JSONException {
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        Application application;
        if (this.f24469o == z10 || (fVar = this.f24455a) == null || fVar.f26160a == null) {
            return;
        }
        IAlog.a("%sonVisibilityChanged: %s my video view is%s", IAlog.a(this), Boolean.valueOf(z10), this.f24458d);
        if (z10) {
            this.f24469o = true;
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f24455a.f26160a.f24434e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.f24458d.b()) {
                if (bVar != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
                        this.f24455a.getClass();
                    } else {
                        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                            x();
                        }
                        com.fyber.inneractive.sdk.player.f fVar2 = this.f24455a;
                        if (!fVar2.f26169j) {
                            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar2;
                            nVar.a(nVar.f26222p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
                            fVar2.f26169j = true;
                        }
                        f();
                        if (this.f24467m != null || (application = com.fyber.inneractive.sdk.util.o.f26796a) == null) {
                            return;
                        }
                        u uVar = new u(this);
                        this.f24467m = uVar;
                        application.registerActivityLifecycleCallbacks(uVar);
                        return;
                    }
                }
                s();
                return;
            }
            if (!this.f24473s) {
                this.f24473s = true;
                if (!this.f24479y) {
                    if (!this.f24458d.b()) {
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
                    g0 g0Var = this.f24461g;
                    if (g0Var != null) {
                        g0Var.onCompleted();
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.s sVar2 = this.f24458d;
            if (sVar2 != null) {
                sVar2.k();
                return;
            }
            return;
        }
        this.f24469o = false;
        com.fyber.inneractive.sdk.player.f fVar3 = this.f24455a;
        if (fVar3 != null && (qVar = fVar3.f26160a) != null && (xVar = qVar.f24433d) != null && xVar.equals(this.f24459e)) {
            IAlog.a("%sonVisibilityChanged pausing video", IAlog.a(this));
            z();
            if (this.f24455a.f26160a.f24434e == com.fyber.inneractive.sdk.player.enums.b.Completed || ((sVar = this.f24458d) != null && sVar.b())) {
                this.f24458d.j();
            }
        }
        com.fyber.inneractive.sdk.player.ui.s sVar3 = this.f24458d;
        if (sVar3 == null || !sVar3.f26271h) {
            g();
        }
    }

    public final void a(int i10, g1 g1Var) throws JSONException {
        IAlog.a("onClicked called with %d", Integer.valueOf(i10));
        switch (i10) {
            case 1:
                if (p()) {
                    i(true);
                    com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
                    if (fVar != null) {
                        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                        nVar.a(nVar.f26222p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_UNMUTE);
                    }
                } else {
                    f(true);
                    com.fyber.inneractive.sdk.player.f fVar2 = this.f24455a;
                    if (fVar2 != null) {
                        com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                        nVar2.a(nVar2.f26222p, VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_MUTE);
                    }
                }
                this.f24458d.setMuteButtonState(p());
                break;
            case 2:
                v();
                break;
            case 3:
                a(w0.CTA_BUTTON.a());
                a(false, VideoClickOrigin.CTA, g1Var);
                break;
            case 4:
                a(w0.COMPANION.a());
                com.fyber.inneractive.sdk.player.f fVar3 = this.f24455a;
                String str = null;
                if (fVar3 != null) {
                    com.fyber.inneractive.sdk.player.n nVar3 = (com.fyber.inneractive.sdk.player.n) fVar3;
                    com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar3.f26226t.f23574b.a();
                    if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) bVarA;
                        String str2 = cVar.f23561g.f24092g;
                        if (TextUtils.isEmpty(str2)) {
                            com.fyber.inneractive.sdk.model.vast.b bVar = nVar3.f26222p;
                            if (bVar != null) {
                                str = bVar.f24071b;
                            }
                        } else {
                            str = str2;
                        }
                        fVar3.a(cVar, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    }
                }
                com.fyber.inneractive.sdk.player.ui.s sVar = this.f24458d;
                if (sVar != null) {
                    sVar.f();
                }
                g0 g0Var = this.f24461g;
                if (g0Var != null) {
                    g0Var.a(str, g1Var, false);
                    break;
                }
                break;
            case 5:
                t();
                break;
            case 6:
                if (B()) {
                    g(true);
                    break;
                } else {
                    d(true);
                    break;
                }
            case 7:
                b(g1Var);
                break;
            case 8:
                a(w0.COMPANION.a());
                a(true, VideoClickOrigin.COMPANION, g1Var);
                break;
            case 9:
                com.fyber.inneractive.sdk.player.f fVar4 = this.f24455a;
                if (fVar4 != null && !this.f24458d.f26271h) {
                    fVar4.f26166g = true;
                    h(false);
                    break;
                }
                break;
            case 10:
                a(w0.APP_INFO.a());
                a(false, VideoClickOrigin.APP_INFO, g1Var);
                break;
            case 11:
                a(w0.STORE_PROMO.a());
                a(false, VideoClickOrigin.STORE_PROMO, g1Var);
                break;
        }
    }

    public final boolean a(boolean z10, VideoClickOrigin videoClickOrigin, g1 g1Var) {
        com.fyber.inneractive.sdk.util.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f24458d;
        if (sVar != null) {
            sVar.f();
        }
        g0 g0Var = this.f24461g;
        boolean z11 = false;
        if (g0Var != null) {
            if (z10) {
                com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f26222p;
                    g0Var.a(bVar != null ? bVar.f24071b : null, g1Var, true);
                    com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) this.f24455a;
                    nVar.a(nVar.f26222p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            } else {
                int i10 = y.f24454b[videoClickOrigin.ordinal()];
                if (i10 == 1) {
                    gVar = com.fyber.inneractive.sdk.util.g.STORE_PROMO_CTA;
                } else if (i10 == 2) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CLICK;
                } else if (i10 != 3) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
                } else {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_APP_INFO;
                }
                com.fyber.inneractive.sdk.util.d0 d0VarA = this.f24461g.a(g1Var, gVar);
                com.fyber.inneractive.sdk.player.f fVar2 = this.f24455a;
                if (fVar2 != null) {
                    com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                    nVar2.a(nVar2.f26222p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    com.fyber.inneractive.sdk.measurement.f fVar3 = this.f24455a.f26164e;
                    if (fVar3 != null && fVar3.f24015c != null) {
                        IAlog.a("%s click", "OMVideo");
                        try {
                            fVar3.f24015c.adUserInteraction(InteractionType.CLICK);
                        } catch (Throwable th2) {
                            fVar3.a(th2);
                        }
                    }
                }
                if (d0VarA.f26769a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                    z11 = true;
                }
            }
        }
        if (videoClickOrigin == VideoClickOrigin.VIDEO) {
            a(w0.VIDEO.a());
        }
        return z11;
    }

    public final boolean a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.flow.storepromo.b bVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f24455a;
        if (fVar != null && (bVar = ((com.fyber.inneractive.sdk.player.n) fVar).f26228v) != null) {
            bVar.getClass();
            synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.f23781k) {
                bVar.f23789h.add(aVar);
            }
            return true;
        }
        IAlog.f("Unable to add store promo observer, promo manager is unavailable", new Object[0]);
        return false;
    }
}
