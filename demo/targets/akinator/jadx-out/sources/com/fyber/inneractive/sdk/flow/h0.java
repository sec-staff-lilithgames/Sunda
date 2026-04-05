package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h0 implements i0, r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23646a;

    /* renamed from: b, reason: collision with root package name */
    public InneractiveAdSpot.RequestListener f23647b;

    /* renamed from: c, reason: collision with root package name */
    public InneractiveAdRequest f23648c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f23649d;

    /* renamed from: e, reason: collision with root package name */
    public x f23650e;

    /* renamed from: f, reason: collision with root package name */
    public s0 f23651f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f23652g;

    /* renamed from: h, reason: collision with root package name */
    public m f23653h;

    /* renamed from: i, reason: collision with root package name */
    public g0 f23654i;

    /* renamed from: l, reason: collision with root package name */
    public p f23657l;

    /* renamed from: j, reason: collision with root package name */
    public boolean f23655j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23656k = false;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f23658m = new AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final Object f23659n = new Object();

    public h0() {
        String string = UUID.randomUUID().toString();
        this.f23646a = string;
        this.f23652g = new HashSet();
        IAlog.a("%sInneractiveAdSpotImpl created with UID: %s", IAlog.a(this), string);
    }

    public static String a(h0 h0Var) {
        h0Var.getClass();
        return IAlog.a(h0Var);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = (s0) inneractiveUnitController;
            s0Var.setAdSpot(this);
            if (this.f23652g.size() > 0) {
                Iterator it = new HashSet(this.f23652g).iterator();
                while (it.hasNext()) {
                    InneractiveUnitController inneractiveUnitController2 = (InneractiveUnitController) it.next();
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.f23652g.add(s0Var);
            if (this.f23650e != null) {
                Iterator it2 = this.f23652g.iterator();
                while (it2.hasNext()) {
                    s0 s0Var2 = (s0) it2.next();
                    if (s0Var2.supports(this)) {
                        this.f23651f = s0Var2;
                        return;
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() throws JSONException {
        IAlog.a("%sInneractiveAdSpotImpl spot destroy: %s", IAlog.a(this), this.f23646a);
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            com.fyber.inneractive.sdk.util.r.f26804b.post(new d0(this));
            return;
        }
        this.f23658m.set(true);
        Iterator it = this.f23652g.iterator();
        while (it.hasNext()) {
            ((InneractiveUnitController) it.next()).destroy();
        }
        this.f23652g.clear();
        a((x) null);
        this.f23647b = null;
        a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final x getAdContent() {
        return this.f23650e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f23648c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.f23646a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return IAConfigManager.O.f23218m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return IAConfigManager.O.f23217l;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return IAConfigManager.O.f23219n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f23648c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.f23651f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isReady() throws org.json.JSONException {
        /*
            r13 = this;
            java.lang.String r0 = "Got exception adding param to json object: %s, %s"
            com.fyber.inneractive.sdk.flow.x r1 = r13.f23650e
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            com.fyber.inneractive.sdk.response.e r1 = r1.b()
            r3 = 1
            if (r1 == 0) goto L24
            com.fyber.inneractive.sdk.flow.x r1 = r13.f23650e
            com.fyber.inneractive.sdk.response.e r1 = r1.b()
            r1.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r1.f26629a
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L24
            r1 = r3
            goto L25
        L24:
            r1 = r2
        L25:
            if (r1 == 0) goto La0
            com.fyber.inneractive.sdk.flow.x r4 = r13.f23650e
            if (r4 == 0) goto La0
            com.fyber.inneractive.sdk.response.e r5 = r4.b()
            boolean r6 = r13.f23656k
            if (r6 != 0) goto La0
            if (r5 == 0) goto La0
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r5.f26631c
            long r7 = r7 - r9
            long r6 = r6.toMinutes(r7)
            long r8 = r5.f26630b
            long r6 = r6 - r8
            java.lang.String r10 = "Firing Event 802 - AdExpired - time passed- "
            java.lang.String r11 = ", sessionTimeOut - "
            java.lang.StringBuilder r10 = b0.e2.r(r6, r10, r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r11 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.util.IAlog.a(r10, r11)
            com.fyber.inneractive.sdk.network.w r10 = new com.fyber.inneractive.sdk.network.w
            com.fyber.inneractive.sdk.network.t r11 = com.fyber.inneractive.sdk.network.t.IA_AD_EXPIRED
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r12 = r4.f23944a
            com.fyber.inneractive.sdk.config.global.r r4 = r4.f23946c
            org.json.JSONArray r4 = r4.b()
            r10.<init>(r5)
            r10.f24325b = r11
            r10.f24324a = r12
            r10.f24327d = r4
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "time_passed"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L7d
            goto L84
        L7d:
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            com.fyber.inneractive.sdk.util.IAlog.f(r0, r5)
        L84:
            java.lang.String r5 = "timeout"
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r4.put(r5, r6)     // Catch: java.lang.Exception -> L8e
            goto L95
        L8e:
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            com.fyber.inneractive.sdk.util.IAlog.f(r0, r5)
        L95:
            org.json.JSONArray r0 = r10.f24329f
            r0.put(r4)
            r0 = 0
            r10.a(r0)
            r13.f23656k = r3
        La0:
            if (r1 != 0) goto Lab
            com.fyber.inneractive.sdk.flow.x r0 = r13.f23650e
            boolean r0 = r0.e()
            if (r0 == 0) goto Lab
            r2 = r3
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.h0.isReady():boolean");
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str) {
        if (this.f23658m.get()) {
            IAlog.a("%s : loadAd: spot is already destroyed", IAlog.a(this));
            a(this.f23650e);
            return;
        }
        IAlog.a("%s : InneractiveAdSpotImpl Start load ad process", IAlog.a(this));
        if (IAConfigManager.d()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f23647b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        if (str == null || TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f23647b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f23647b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d.f24047d.a(this.f23646a).c();
        String str2 = this.f23646a;
        this.f23657l = new p(str2);
        if (this.f23649d == null) {
            this.f23649d = new e0(this);
        }
        com.fyber.inneractive.sdk.bidder.adm.y yVar = new com.fyber.inneractive.sdk.bidder.adm.y(str, str2);
        com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
        c0 c0Var = new c0(this, yVar, rVarA, str);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.K;
        if (eVar == null || !eVar.f24004a) {
            Application application = com.fyber.inneractive.sdk.util.o.f26796a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.config.a0(iAConfigManager, application));
        }
        iAConfigManager.H.a();
        com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.bidder.adm.t(yVar, c0Var, rVarA));
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            s0 s0Var = this.f23651f;
            if (s0Var != null && s0Var.equals(inneractiveUnitController)) {
                this.f23651f.destroy();
                this.f23651f = null;
            }
            this.f23652g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        if (IAConfigManager.d()) {
            IAlog.a("%sIAB TCF purpose 1 disabled, dropping request", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f23647b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.IAB_TCF_PURPOSE_1_DISABLED);
                return;
            }
            return;
        }
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f23648c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener2 = this.f23647b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener3 = this.f23647b;
            if (requestListener3 != null) {
                requestListener3.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
                return;
            }
            return;
        }
        InneractiveAdRequest inneractiveAdRequest2 = inneractiveAdRequest != null ? inneractiveAdRequest : this.f23648c;
        String str = this.f23646a;
        inneractiveAdRequest2.f23899b = str;
        com.fyber.inneractive.sdk.metrics.d.f24047d.a(str).c();
        if (this.f23652g.isEmpty()) {
            IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
            if (this.f23647b != null) {
                if (inneractiveAdRequest == null) {
                    inneractiveAdRequest = this.f23648c;
                }
                a(inneractiveAdRequest, null);
                this.f23647b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                return;
            }
            return;
        }
        IAConfigManager.b();
        m mVar = this.f23653h;
        if (mVar != null) {
            boolean z10 = inneractiveAdRequest != null || this.f23648c == null;
            l lVar = mVar.f23678g;
            if (lVar != null) {
                IAConfigManager.removeListener(lVar);
            }
            com.fyber.inneractive.sdk.network.m mVar2 = mVar.f23759d;
            if (mVar2 != null) {
                mVar2.a();
                mVar.f23759d = null;
            }
            mVar.a(z10);
            mVar.f23757b = null;
        }
        if (inneractiveAdRequest != null) {
            InneractiveAdRequest inneractiveAdRequest3 = this.f23648c;
            if (inneractiveAdRequest3 != null) {
                inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
            }
            this.f23648c = inneractiveAdRequest;
            x xVar = this.f23650e;
            if (xVar != null) {
                xVar.destroy();
                this.f23655j = true;
            }
            Iterator it = this.f23652g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f23648c.f23898a = false;
                    break;
                } else if (((s0) it.next()) instanceof InneractiveFullscreenUnitController) {
                    break;
                }
            }
        }
        this.f23653h = new m(this.f23646a);
        if (this.f23649d == null) {
            this.f23649d = new e0(this);
        }
        IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.f23653h);
        IAlog.a("%s initOmidSdkIfNeeded", IAlog.a(this));
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.K;
        if (eVar == null || !eVar.f24004a) {
            Application application = com.fyber.inneractive.sdk.util.o.f26796a;
            IAlog.c("initOmidSdk", new Object[0]);
            com.fyber.inneractive.sdk.util.r.f26803a.execute(new com.fyber.inneractive.sdk.config.a0(iAConfigManager, application));
        }
        iAConfigManager.H.a();
        m mVar3 = this.f23653h;
        if (mVar3 != null) {
            InneractiveAdRequest inneractiveAdRequest4 = this.f23648c;
            mVar3.f23757b = this.f23649d;
            if (IAConfigManager.e()) {
                mVar3.c(inneractiveAdRequest4);
                return;
            }
            l lVar2 = new l(mVar3, inneractiveAdRequest4);
            mVar3.f23678g = lVar2;
            IAConfigManager.addListener(lVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.a("%ssetRequestListener called with: %s", IAlog.a(this), requestListener);
        this.f23647b = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    @Override // com.fyber.inneractive.sdk.flow.r0
    public final void a(g0 g0Var) {
        this.f23654i = g0Var;
        requestAd(null);
    }

    @Override // com.fyber.inneractive.sdk.flow.i0
    public final void a() throws JSONException {
        x xVar;
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar2 = this.f23650e;
        if (xVar2 != null) {
            if (xVar2.c() && (xVar = this.f23650e) != null && !xVar.f23948e) {
                String string = Arrays.toString(Thread.currentThread().getStackTrace());
                IAlog.a("Firing Event 803 - Stack trace - %s", string);
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_DESTROYED_WITHOUT_SHOW;
                x xVar3 = this.f23650e;
                InneractiveAdRequest inneractiveAdRequest = xVar3.f23944a;
                com.fyber.inneractive.sdk.response.e eVarB = xVar3.b();
                m mVar = this.f23653h;
                p pVar = this.f23657l;
                com.fyber.inneractive.sdk.config.global.r rVar2 = pVar != null ? pVar.f23758c : null;
                if (mVar != null && (rVar = mVar.f23758c) != null) {
                    jSONArrayB = rVar.b();
                } else {
                    jSONArrayB = rVar2 != null ? rVar2.b() : null;
                }
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
                wVar.f24325b = tVar;
                wVar.f24324a = inneractiveAdRequest;
                wVar.f24327d = jSONArrayB;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("stack_trace", string);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", string);
                }
                wVar.f24329f.put(jSONObject);
                wVar.a((String) null);
            }
            this.f23650e.destroy();
            this.f23650e = null;
        }
        this.f23651f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.response.e r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L33
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.l0 r1 = r1.f23345c
            if (r1 == 0) goto L1e
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.l0 r1 = r1.f23345c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f23330b
            goto L34
        L1e:
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.t0 r1 = r1.f23348f
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.s0 r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.r0 r1 = (com.fyber.inneractive.sdk.config.r0) r1
            com.fyber.inneractive.sdk.config.t0 r1 = r1.f23348f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f23408j
            goto L34
        L33:
            r1 = r0
        L34:
            com.fyber.inneractive.sdk.flow.x r2 = r9.f23650e
            if (r2 == 0) goto L3e
            com.fyber.inneractive.sdk.response.e r2 = r2.f23945b
            if (r2 == 0) goto L3e
            r4 = r2
            goto L3f
        L3e:
            r4 = r11
        L3f:
            java.lang.String r6 = r9.f23646a
            if (r1 != 0) goto L47
            if (r4 == 0) goto L47
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r4.f26644p
        L47:
            r7 = r1
            com.fyber.inneractive.sdk.metrics.c r3 = new com.fyber.inneractive.sdk.metrics.c
            com.fyber.inneractive.sdk.flow.x r11 = r9.f23650e
            if (r11 != 0) goto L51
        L4e:
            r5 = r10
            r8 = r0
            goto L58
        L51:
            com.fyber.inneractive.sdk.config.global.r r11 = r11.f23946c
            org.json.JSONArray r0 = r11.b()
            goto L4e
        L58:
            r3.<init>(r4, r5, r6, r7, r8)
            r3.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.h0.a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.response.e):void");
    }

    public final void a(x xVar) {
        synchronized (this.f23659n) {
            try {
                p pVar = this.f23657l;
                if (pVar != null) {
                    pVar.a(true);
                    pVar.f23757b = null;
                    this.f23657l = null;
                }
                m mVar = this.f23653h;
                if (mVar != null) {
                    l lVar = mVar.f23678g;
                    if (lVar != null) {
                        IAConfigManager.removeListener(lVar);
                    }
                    com.fyber.inneractive.sdk.network.m mVar2 = mVar.f23759d;
                    if (mVar2 != null) {
                        mVar2.a();
                        mVar.f23759d = null;
                    }
                    mVar.a(true);
                    mVar.f23757b = null;
                    this.f23653h = null;
                }
                if (xVar != null) {
                    xVar.destroy();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
