package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveAdRequest f23674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f23675b;

    public l(m mVar, InneractiveAdRequest inneractiveAdRequest) {
        this.f23675b = mVar;
        this.f23674a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        IAConfigManager.removeListener(this);
        if (z10) {
            this.f23675b.c(this.f23674a);
            return;
        }
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(exc instanceof com.fyber.inneractive.sdk.network.b ? InneractiveErrorCode.CONNECTION_ERROR : InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR, i.NO_APP_CONFIG_AVAILABLE, exc);
        m mVar = this.f23675b;
        mVar.a(this.f23674a, mVar.c(), inneractiveInfrastructureError);
    }
}
