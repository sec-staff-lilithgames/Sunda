package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.j;
import com.fyber.inneractive.sdk.flow.endcard.p;
import com.fyber.inneractive.sdk.flow.endcard.r;
import com.fyber.inneractive.sdk.flow.endcard.t;
import com.fyber.inneractive.sdk.flow.endcard.v;
import com.fyber.inneractive.sdk.flow.endcard.x;
import com.fyber.inneractive.sdk.flow.vast.h;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.model.vast.i;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.network.e1;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.web.i1;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a {

    /* renamed from: a, reason: collision with root package name */
    public final j f23586a;

    /* renamed from: b, reason: collision with root package name */
    public final b f23587b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final e f23588c = new e();

    /* renamed from: d, reason: collision with root package name */
    public final f f23589d = new f();

    /* renamed from: e, reason: collision with root package name */
    public final x0 f23590e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f23591f;

    /* renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.c f23592g;

    /* renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b f23593h;

    public a(j jVar, x0 x0Var, com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar) {
        this.f23586a = jVar;
        this.f23590e = x0Var;
        this.f23593h = bVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar = this.f23593h;
        com.fyber.inneractive.sdk.flow.endcard.c cVar = this.f23592g;
        bVar.getClass();
        if (cVar != null) {
            IAlog.a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", cVar.i());
            bVar.f23585d.a(cVar);
        }
    }

    public final void b() throws IOException {
        Iterator it = this.f23591f;
        if (it == null || !it.hasNext()) {
            return;
        }
        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) this.f23591f.next();
        this.f23592g = cVar;
        String str = null;
        if (cVar instanceof r) {
            r rVar = (r) cVar;
            this.f23587b.getClass();
            String str2 = rVar.f23561g.f24091f;
            x0 x0Var = rVar.f23557c;
            u uVar = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest = x0Var.f23952c;
            g gVar = x0Var.f23953d;
            JSONArray jSONArray = x0Var.f23955f;
            w wVar = new w(gVar);
            wVar.f24326c = uVar;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArray;
            wVar.a((String) null);
            com.fyber.inneractive.sdk.flow.endcard.u uVar2 = (com.fyber.inneractive.sdk.flow.endcard.u) rVar.f();
            uVar2.f23627e = str2;
            uVar2.a(this);
            return;
        }
        if (cVar instanceof v) {
            e eVar = this.f23588c;
            v vVar = (v) cVar;
            eVar.getClass();
            k kVar = vVar.f23632h;
            int i10 = c.f23594a[kVar.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                IAlog.f("%s Invalid static type: %s", "StaticCompanionEndCardLoader", kVar);
                return;
            }
            String str3 = vVar.f23561g.f24091f;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            IAlog.c("%s load Static End-Card image %s", "StaticCompanionEndCardLoader", str3);
            x0 x0Var2 = vVar.f23557c;
            u uVar3 = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest2 = x0Var2.f23952c;
            g gVar2 = x0Var2.f23953d;
            JSONArray jSONArray2 = x0Var2.f23955f;
            w wVar2 = new w(gVar2);
            wVar2.f24326c = uVar3;
            wVar2.f24324a = inneractiveAdRequest2;
            wVar2.f24327d = jSONArray2;
            wVar2.a((String) null);
            IAConfigManager.O.f23224s.a(new e1(new d(eVar, vVar, this), vVar.f23561g.f24091f, vVar.f23557c.f23951b.f23946c));
            return;
        }
        if (cVar instanceof x) {
            x xVar = (x) cVar;
            this.f23589d.getClass();
            if (xVar.f23561g.f24086a != i.Static) {
                x0 x0Var3 = xVar.f23557c;
                u uVar4 = u.VAST_COMPANION_LOAD_ATTEMPT;
                InneractiveAdRequest inneractiveAdRequest3 = x0Var3.f23952c;
                g gVar3 = x0Var3.f23953d;
                JSONArray jSONArray3 = x0Var3.f23955f;
                w wVar3 = new w(gVar3);
                wVar3.f24326c = uVar4;
                wVar3.f24324a = inneractiveAdRequest3;
                wVar3.f24327d = jSONArray3;
                wVar3.a((String) null);
                String str4 = xVar.f23561g.f24091f;
                String strB = o.b("fyb_iframe_endcard_tmpl.html");
                if (!TextUtils.isEmpty(strB)) {
                    strB = strB.replace("$__SrcIframeUrl__$", str4);
                }
                com.fyber.inneractive.sdk.flow.endcard.u uVar5 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
                uVar5.f23627e = strB;
                uVar5.a(this);
                return;
            }
            x0 x0Var4 = xVar.f23557c;
            u uVar6 = u.VAST_COMPANION_LOAD_ATTEMPT;
            InneractiveAdRequest inneractiveAdRequest4 = x0Var4.f23952c;
            g gVar4 = x0Var4.f23953d;
            JSONArray jSONArray4 = x0Var4.f23955f;
            w wVar4 = new w(gVar4);
            wVar4.f24326c = uVar6;
            wVar4.f24324a = inneractiveAdRequest4;
            wVar4.f24327d = jSONArray4;
            wVar4.a((String) null);
            com.fyber.inneractive.sdk.model.vast.c cVar2 = xVar.f23561g;
            String str5 = cVar2.f24091f;
            String str6 = cVar2.f24092g;
            if (TextUtils.isEmpty(str6)) {
                com.fyber.inneractive.sdk.model.vast.b bVar = xVar.f23557c.f23953d.O;
                if (bVar != null) {
                    str = bVar.f24071b;
                }
            } else {
                str = str6;
            }
            String strB2 = o.b("fyb_static_endcard_tmpl.html");
            if (!TextUtils.isEmpty(strB2)) {
                strB2 = strB2.replace("$__IMGSRC__$", str5);
                if (str != null) {
                    strB2 = strB2.replace("$__IMGHREF__$", str.replace("\"", "\\\""));
                }
            }
            com.fyber.inneractive.sdk.flow.endcard.u uVar7 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
            uVar7.f23627e = strB2;
            if (TextUtils.isEmpty(strB2)) {
                throw new h("End-Card HTML not loaded", "No template");
            }
            com.fyber.inneractive.sdk.player.controller.d dVarE = uVar7.e();
            dVarE.a();
            i1 i1Var = dVarE.f24397a;
            if (i1Var != null) {
                i1Var.F = false;
            }
            dVarE.a(strB2, new t(uVar7, this), !(uVar7 instanceof p));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a(String str) throws IOException {
        this.f23593h.getClass();
        IAlog.a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
        b();
    }
}
