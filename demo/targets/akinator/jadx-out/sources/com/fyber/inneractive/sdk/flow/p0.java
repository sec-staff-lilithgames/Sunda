package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p0 extends b0 implements com.fyber.inneractive.sdk.interfaces.f {

    /* renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.e f23764k;

    /* renamed from: l, reason: collision with root package name */
    public Runnable f23765l;

    /* renamed from: m, reason: collision with root package name */
    public v1 f23766m;

    /* renamed from: n, reason: collision with root package name */
    public Runnable f23767n;

    /* renamed from: o, reason: collision with root package name */
    public v1 f23768o;

    /* renamed from: r, reason: collision with root package name */
    public long f23771r;

    /* renamed from: v, reason: collision with root package name */
    public m0 f23775v;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23769p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23770q = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f23772s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f23773t = false;

    /* renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.a f23774u = new com.fyber.inneractive.sdk.util.a();

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int A() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f23764k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.f23764k.getLayout().getHeight();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int B() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f23764k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.f23764k.getLayout().getWidth();
    }

    public abstract boolean K();

    public final void L() {
        if (this.f23765l == null) {
            long jO = O();
            this.f23771r = jO;
            this.f23765l = new l0(this, jO);
            IAlog.a("%senabling close with delay %d", IAlog.a(this), Long.valueOf(this.f23771r));
            x xVar = this.f23531b;
            boolean zB = xVar != null ? b(xVar) : false;
            if (zB && !K()) {
                if (zB) {
                    com.fyber.inneractive.sdk.interfaces.e eVar = this.f23764k;
                    if (eVar != null) {
                        eVar.showCloseCountdown();
                    }
                    m0 m0Var = new m0(this, this.f23771r + 100);
                    this.f23775v = m0Var;
                    m0Var.start();
                    return;
                }
                return;
            }
            if (this.f23770q) {
                return;
            }
            this.f23770q = true;
            v1 v1Var = new v1(TimeUnit.MILLISECONDS, this.f23771r);
            this.f23766m = v1Var;
            v1Var.f26828e = new n0(this);
            t1 t1Var = new t1(v1Var);
            v1Var.f26826c = t1Var;
            v1Var.f26827d = false;
            t1Var.sendEmptyMessage(1932593528);
        }
    }

    public abstract int M();

    public abstract int N();

    public abstract long O();

    public abstract boolean P();

    public abstract long a(long j10);

    public void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        if (this.f23530a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        }
        if (eVar != null) {
            this.f23764k = eVar;
        } else {
            IAlog.f("%srenderAd called with a null activity!", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void b(boolean z10) {
    }

    public abstract boolean b(x xVar);

    public final void c(boolean z10) throws JSONException {
        com.fyber.inneractive.sdk.network.w wVar;
        if (this.f23531b == null) {
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
            wVar.f24326c = uVar;
            wVar.f24324a = null;
            wVar.f24327d = null;
        } else {
            com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            x xVar = this.f23531b;
            InneractiveAdRequest inneractiveAdRequest = xVar.f23944a;
            com.fyber.inneractive.sdk.response.e eVarB = xVar.b();
            JSONArray jSONArrayB = this.f23531b.f23946c.b();
            wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f24326c = uVar2;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArrayB;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean boolValueOf = Boolean.valueOf(z10);
        try {
            jSONObject.put("fyber_close_enabled", boolValueOf);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "fyber_close_enabled", boolValueOf);
        }
        wVar.f24329f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void d(boolean z10) {
        com.fyber.inneractive.sdk.network.w wVar;
        this.f23769p = true;
        if (z10) {
            if (this.f23531b == null) {
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
                wVar.f24326c = uVar;
                wVar.f24324a = null;
                wVar.f24327d = null;
            } else {
                com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                x xVar = this.f23531b;
                InneractiveAdRequest inneractiveAdRequest = xVar.f23944a;
                com.fyber.inneractive.sdk.response.e eVarB = xVar.b();
                JSONArray jSONArrayB = this.f23531b.f23946c.b();
                wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
                wVar.f24326c = uVar2;
                wVar.f24324a = inneractiveAdRequest;
                wVar.f24327d = jSONArrayB;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean boolValueOf = Boolean.valueOf(P());
            try {
                jSONObject.put("is_endcard", boolValueOf);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "is_endcard", boolValueOf);
            }
            wVar.f24329f.put(jSONObject);
            wVar.a((String) null);
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f23764k;
        if (eVar != null) {
            eVar.showCloseButton(z10, N(), M());
            if (z10) {
                return;
            }
            com.fyber.inneractive.sdk.util.a aVar = this.f23774u;
            aVar.f26754d = 0L;
            aVar.f26755e = 0L;
            aVar.f26756f = 0L;
            aVar.f26752b = false;
            aVar.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        Runnable runnable = this.f23765l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(runnable);
            this.f23765l = null;
        }
        Runnable runnable2 = this.f23767n;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.r.f26804b.removeCallbacks(runnable2);
            this.f23767n = null;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f23764k;
        if (eVar != null) {
            eVar.destroy();
        }
        this.f23764k = null;
        m0 m0Var = this.f23775v;
        if (m0Var != null) {
            m0Var.cancel();
            this.f23775v = null;
        }
        v1 v1Var = this.f23768o;
        if (v1Var != null) {
            v1Var.f26828e = null;
            this.f23768o = null;
        }
        v1 v1Var2 = this.f23766m;
        if (v1Var2 != null) {
            v1Var2.f26828e = null;
            this.f23766m = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        this.f23774u.f26751a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void n() {
        v1 v1Var = this.f23766m;
        if (v1Var != null) {
            v1Var.f26827d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
        v1 v1Var2 = this.f23768o;
        if (v1Var2 != null) {
            v1Var2.f26827d = false;
            v1Var2.a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void s() {
        v1 v1Var = this.f23766m;
        if (v1Var != null) {
            v1Var.f26827d = true;
            t1 t1Var = v1Var.f26826c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        v1 v1Var2 = this.f23768o;
        if (v1Var2 != null) {
            v1Var2.f26827d = true;
            t1 t1Var2 = v1Var2.f26826c;
            if (t1Var2 != null) {
                t1Var2.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f23764k;
        if (eVar != null) {
            return eVar.getLayout();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public boolean b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        IAlog.f("InneractiveFullscreenAdRendererImpl : registerObserver: %s doesnt support Store Promo", getClass().getName());
        return false;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        IAlog.f("InneractiveFullscreenAdRendererImpl : unregisterObserver: %s doesnt support Store Promo", getClass().getName());
    }
}
