package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import j1.o2;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements com.fyber.inneractive.sdk.click.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f23964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f23965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.click.o f23966c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f23967d;

    public z(b0 b0Var, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        this.f23967d = b0Var;
        this.f23964a = g1Var;
        this.f23965b = gVar;
        this.f23966c = oVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) throws JSONException {
        b0 b0Var = this.f23967d;
        b0Var.getClass();
        IAlog.a("%s super click result: %s", IAlog.a(b0Var), bVar);
        b0 b0Var2 = this.f23967d;
        if (b0Var2.f23537h == null) {
            IAlog.a("%s click handler is null. Probably cancelled", IAlog.a(b0Var2));
            return;
        }
        b0Var2.f23537h = null;
        b0Var2.f23538i = null;
        b0Var2.I();
        b0 b0Var3 = this.f23967d;
        g1 g1Var = this.f23964a;
        com.fyber.inneractive.sdk.util.g gVar = this.f23965b;
        b0Var3.getClass();
        com.fyber.inneractive.sdk.click.q qVar = bVar.f23160a;
        if (qVar == com.fyber.inneractive.sdk.click.q.OPEN_IN_EXTERNAL_APPLICATION || qVar == com.fyber.inneractive.sdk.click.q.OPEN_GOOGLE_STORE) {
            IAlog.a("InneractiveAdRendererImpl: handleOpenResult - opened in external application", new Object[0]);
            com.fyber.inneractive.sdk.click.j jVar = (com.fyber.inneractive.sdk.click.j) o2.e(1, bVar.f23165f);
            com.fyber.inneractive.sdk.click.q qVar2 = jVar.f23184c;
            if (qVar2 == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) {
                b0Var3.a(jVar.f23182a, qVar2);
            }
            if (b0Var3.f23532c != null) {
                b0Var3.H();
            }
        } else if (qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_INTERNAL_BROWSER) {
            IAlog.a("InneractiveAdRendererImpl: handleOpenResult - opened in internal browser", new Object[0]);
            b0Var3.f23533d = true;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(b0Var3);
        } else if (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) {
            IAlog.a("InneractiveAdRendererImpl: handleOpenResult - opened in external browser", new Object[0]);
            b0Var3.a(bVar.f23163d, bVar.f23160a);
            if (b0Var3.f23532c != null) {
                b0Var3.H();
            }
        }
        if (b0Var3.p() == com.fyber.inneractive.sdk.ignite.m.NONE || (!TextUtils.isEmpty(bVar.f23162c) && !bVar.f23162c.equals("IgniteGooglePlay"))) {
            b0Var3.b(bVar, g1Var, gVar);
        }
        com.fyber.inneractive.sdk.click.o oVar = this.f23966c;
        if (oVar != null) {
            oVar.a(bVar);
        }
    }
}
