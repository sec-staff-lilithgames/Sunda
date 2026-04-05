package com.fyber.inneractive.sdk.external;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f23511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnFyberMarketplaceInitializedListener f23512b;

    public a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        this.f23511a = context;
        this.f23512b = onFyberMarketplaceInitializedListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
        if (this.f23511a.getApplicationContext() != null) {
            IAConfigManager.removeListener(this);
            InneractiveAdManager.f23483e = null;
            if (z10) {
                InneractiveAdManager.a(this.f23512b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            } else {
                InneractiveAdManager.a(this.f23512b, exc instanceof InvalidAppIdException ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, exc.getLocalizedMessage());
            }
            if (d.f23515a.f23484a == null || !IAConfigManager.d() || d.f23515a.f23487d) {
                return;
            }
            d.f23515a.f23487d = true;
            new w(u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED).a((String) null);
        }
    }
}
