package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f24266a;

    public q(s sVar) {
        this.f24266a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        com.fyber.inneractive.sdk.flow.o oVar;
        com.fyber.inneractive.sdk.response.e eVar = (com.fyber.inneractive.sdk.response.e) obj;
        if (exc == null) {
            s sVar = this.f24266a;
            sVar.a(sVar.f24276e, eVar);
            return;
        }
        this.f24266a.getClass();
        InneractiveErrorCode inneractiveErrorCode = exc instanceof k1 ? ((k1) exc).f24236a == 204 ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.SERVER_INTERNAL_ERROR : (!(exc instanceof FileNotFoundException) && (exc instanceof n0)) ? InneractiveErrorCode.SERVER_INVALID_RESPONSE : InneractiveErrorCode.CONNECTION_ERROR;
        s sVar2 = this.f24266a;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i.NETWORK_ERROR, exc);
        InneractiveAdRequest inneractiveAdRequest = sVar2.f24276e;
        if (sVar2.f24252a == null) {
            return;
        }
        if (sVar2.f24253b) {
            IAlog.e("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
        } else {
            if (sVar2.f24253b || (oVar = sVar2.f24252a) == null) {
                return;
            }
            oVar.a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }
}
