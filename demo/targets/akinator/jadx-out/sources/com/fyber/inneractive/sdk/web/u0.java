package com.fyber.inneractive.sdk.web;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f26956a;

    public u0(v0 v0Var) {
        this.f26956a = v0Var;
    }

    @JavascriptInterface
    public void onBackButtonPressed() {
        WeakReference weakReference = this.f26956a.f26974q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((InternalStoreWebpageActivity) this.f26956a.f26974q.get()).finish();
    }

    @JavascriptInterface
    public void onCancelButtonPressed() throws JSONException {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.ignite.m mVar2;
        v0 v0Var = this.f26956a;
        v0Var.f26961d = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        String str = v0Var.f26967j;
        if (str != null) {
            v0Var.f26979v.set(true);
            v0Var.f26978u.set(false);
            com.fyber.inneractive.sdk.ignite.h hVar = v0Var.f26959b;
            r0 r0Var = new r0(v0Var);
            if (!hVar.n() || hVar.o()) {
                Iterator it = hVar.f23985h.iterator();
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.ignite.r rVar = (com.fyber.inneractive.sdk.ignite.r) it.next();
                    if (rVar != null) {
                        rVar.c((hVar.o() ? com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED : com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED).a());
                    }
                }
            } else {
                try {
                    IIgniteServiceAPI iIgniteServiceAPI = hVar.f23979b;
                    Bundle bundle = hVar.f23980c;
                    hVar.f23981d.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new com.fyber.inneractive.sdk.ignite.a(r0Var));
                } catch (Exception unused) {
                    IAlog.a("Failed to cancel task", new Object[0]);
                    r0Var.a(false);
                }
            }
            com.fyber.inneractive.sdk.util.r.f26804b.postDelayed(new s0(v0Var), 2500L);
            com.fyber.inneractive.sdk.flow.v vVar = v0Var.f26965h;
            if (vVar != null && !v0Var.f26975r && (mVar2 = v0Var.f26961d) != null) {
                v0Var.f26975r = true;
                vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar2);
            }
        }
        v0 v0Var2 = this.f26956a;
        com.fyber.inneractive.sdk.flow.v vVar2 = v0Var2.f26965h;
        if (vVar2 == null || v0Var2.f26975r || (mVar = v0Var2.f26961d) == null) {
            return;
        }
        v0Var2.f26975r = true;
        vVar2.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onInstallButtonPressed() throws JSONException {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var = this.f26956a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        v0Var.f26961d = mVar2;
        v0Var.f26959b.a(v0Var.f26960c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f26963f, mVar2, v0Var.f26965h.f23897a));
        v0 v0Var2 = this.f26956a;
        com.fyber.inneractive.sdk.flow.v vVar = v0Var2.f26965h;
        if (vVar == null || v0Var2.f26976s || (mVar = v0Var2.f26961d) == null) {
            return;
        }
        v0Var2.f26976s = true;
        vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onNavigatedInsideStorePage() {
        this.f26956a.f26980w = true;
    }

    @JavascriptInterface
    public void onNavigatedToMainPage() {
        this.f26956a.f26980w = false;
    }

    @JavascriptInterface
    public void onOpenButtonPressed() {
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(this.f26956a.f26960c)) {
            v0 v0Var = this.f26956a;
            v0Var.getClass();
            IAlog.f("%smPackageName is null", IAlog.a(v0Var));
            return;
        }
        if (TextUtils.isEmpty(this.f26956a.f26964g)) {
            launchIntentForPackage = com.fyber.inneractive.sdk.util.o.f26796a.getPackageManager().getLaunchIntentForPackage(this.f26956a.f26960c);
        } else {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
            v0 v0Var2 = this.f26956a;
            launchIntentForPackage.setClassName(v0Var2.f26960c, v0Var2.f26964g);
        }
        if (launchIntentForPackage == null) {
            v0 v0Var3 = this.f26956a;
            v0Var3.getClass();
            IAlog.f("%sPackage %s not found", IAlog.a(v0Var3), this.f26956a.f26960c);
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        try {
            com.fyber.inneractive.sdk.util.o.f26796a.startActivity(launchIntentForPackage);
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.flow.v vVar = this.f26956a.f26965h;
            if (vVar != null) {
                String simpleName = th2.getClass().getSimpleName();
                String message = th2.getMessage();
                com.fyber.inneractive.sdk.flow.w wVar = vVar.f23897a;
                com.fyber.inneractive.sdk.network.z.a(simpleName, message, wVar.f23944a, wVar.f23945b);
            }
        }
    }

    @JavascriptInterface
    public void onTransitionEnded() {
        this.f26956a.f26981x = false;
    }

    @JavascriptInterface
    public void onTransitionStarting() {
        this.f26956a.f26981x = true;
    }
}
