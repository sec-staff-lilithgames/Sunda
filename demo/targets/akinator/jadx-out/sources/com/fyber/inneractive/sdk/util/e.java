package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.ironsource.G5;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f26772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e f26773b;

    public e(com.fyber.inneractive.sdk.web.e eVar, String str) {
        this.f26773b = eVar;
        this.f26772a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.e eVar = this.f26773b;
        Object obj = this.f26772a;
        eVar.getClass();
        String str = (String) obj;
        String str2 = s.a() ? DtbConstants.HTTP : DtbConstants.HTTPS;
        if (!TextUtils.isEmpty(str) && !eVar.f26854a.isTerminated() && !eVar.f26854a.isShutdown()) {
            if (TextUtils.isEmpty(eVar.f26864k)) {
                eVar.f26865l.f26893p = str2.concat("wv.inner-active.mobi/");
            } else {
                com.fyber.inneractive.sdk.web.i iVar = eVar.f26865l;
                StringBuilder sbU = o2.u(str2);
                sbU.append(eVar.f26864k);
                iVar.f26893p = sbU.toString();
            }
            if (eVar.f26859f) {
                return;
            }
            com.fyber.inneractive.sdk.web.i iVar2 = eVar.f26865l;
            com.fyber.inneractive.sdk.web.m mVar = iVar2.f26879b;
            if (mVar != null) {
                mVar.loadDataWithBaseURL(iVar2.f26893p, str, "text/html", G5.N, null);
                eVar.f26865l.f26894q = str;
            } else {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_TO_WEBVIEW);
                com.fyber.inneractive.sdk.web.g gVar = iVar2.f26883f;
                if (gVar != null) {
                    gVar.a(iVar2, inneractiveInfrastructureError);
                }
                iVar2.b(true);
            }
        } else if (!eVar.f26854a.isTerminated() && !eVar.f26854a.isShutdown()) {
            com.fyber.inneractive.sdk.web.i iVar3 = eVar.f26865l;
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.EMPTY_FINAL_HTML);
            com.fyber.inneractive.sdk.web.g gVar2 = iVar3.f26883f;
            if (gVar2 != null) {
                gVar2.a(iVar3, inneractiveInfrastructureError2);
            }
            iVar3.b(true);
        }
        eVar.f26859f = true;
        eVar.f26854a.shutdownNow();
        Handler handler = eVar.f26855b;
        if (handler != null) {
            d dVar = eVar.f26857d;
            if (dVar != null) {
                handler.removeCallbacks(dVar);
            }
            e eVar2 = eVar.f26856c;
            if (eVar2 != null) {
                eVar.f26855b.removeCallbacks(eVar2);
            }
            eVar.f26855b = null;
        }
        eVar.f26865l.f26892o = null;
    }
}
