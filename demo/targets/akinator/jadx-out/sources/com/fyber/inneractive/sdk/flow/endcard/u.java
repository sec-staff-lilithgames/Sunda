package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class u extends a implements ValueCallback {

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.vast.a f23625c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.d f23626d;

    /* renamed from: e, reason: collision with root package name */
    public String f23627e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23628f;

    /* renamed from: g, reason: collision with root package name */
    public ViewGroup f23629g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f23630h;

    /* renamed from: i, reason: collision with root package name */
    public final s f23631i;

    public u(b bVar) {
        super(bVar);
        this.f23628f = false;
        this.f23630h = new AtomicBoolean(false);
        this.f23631i = new s(this);
        x0 x0Var = bVar.f23557c;
        t0 t0Var = x0Var.f23951b;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f23952c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f23953d;
        this.f23625c = new com.fyber.inneractive.sdk.flow.vast.a(gVar.f26644p, inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.f26633e, gVar.f26634f, t0Var.f23947d);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
        i1 i1Var = e().f24397a;
        if (i1Var != null) {
            i1Var.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        ViewGroup viewGroup = this.f23629g;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (!this.f23628f) {
            return null;
        }
        i1 i1Var = e().f24397a;
        com.fyber.inneractive.sdk.web.m mVar = i1Var == null ? null : i1Var.f26879b;
        if (mVar == null) {
            return null;
        }
        ViewGroup viewGroupA = a.a(mVar);
        this.f23629g = viewGroupA;
        return viewGroupA;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a
    public final void c() {
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f24397a;
        if (i1Var != null) {
            UnitDisplayType unitDisplayType = dVarE.f24399c;
            if (!UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) && !UnitDisplayType.REWARDED.equals(unitDisplayType)) {
                UnitDisplayType.VERTICAL.equals(unitDisplayType);
            }
            i1Var.l();
        }
    }

    public q d() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        a();
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f24397a;
        if (i1Var != null) {
            i1Var.e();
            dVarE.f24397a = null;
        }
    }

    public final com.fyber.inneractive.sdk.player.controller.d e() {
        com.fyber.inneractive.sdk.player.controller.d dVar = this.f23626d;
        if (dVar == null) {
            b bVar = this.f23554b;
            dVar = new com.fyber.inneractive.sdk.player.controller.d(bVar.f23557c.f23950a, this.f23625c, bVar.i(), d());
            x0 x0Var = this.f23554b.f23557c;
            i1 i1Var = dVar.f24397a;
            if (i1Var != null) {
                if (i1Var.f26896s == null) {
                    i1Var.setAdContent(x0Var.f23951b);
                }
                if (i1Var.f26895r == null) {
                    i1Var.setAdRequest(x0Var.f23952c);
                }
                if (i1Var.f26897t == null) {
                    i1Var.setAdResponse(x0Var.f23953d);
                }
            }
            this.f23626d = dVar;
        }
        return dVar;
    }

    public boolean f() {
        com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.O.f23226u;
        return sVar != null && sVar.f23394b.a(false, "dt_plbl");
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            IAlog.a("%s Playable detected: %s", this.f23553a, str);
            try {
                this.f23554b.a(new JSONArray(str));
            } catch (JSONException e10) {
                IAlog.f("%s invalid playable detection method: %s", this.f23553a, e10.getMessage());
            }
        }
        this.f23554b.m();
    }

    public final void a(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        com.fyber.inneractive.sdk.web.g tVar;
        String str = this.f23627e;
        if (!TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.player.controller.d dVarE = e();
            if (aVar == null) {
                tVar = this.f23631i;
            } else {
                tVar = new t(this, aVar);
            }
            dVarE.a(str, tVar, !(this instanceof p));
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("End-Card HTML not loaded", "No template");
    }
}
