package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.rc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3430rc implements InterfaceC3414qc {
    @Override // com.ironsource.InterfaceC3414qc
    public void a(Nc onNetworkSDKInitListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onNetworkSDKInitListener, "onNetworkSDKInitListener");
        IronSourceNetwork.addInitListener(onNetworkSDKInitListener);
    }

    @Override // com.ironsource.InterfaceC3414qc
    public void b(String controllerUrl) {
        kotlin.jvm.internal.e0.checkNotNullParameter(controllerUrl, "controllerUrl");
        SDKUtils.setControllerUrl(controllerUrl);
    }

    @Override // com.ironsource.InterfaceC3414qc
    public void a(Context applicationContext, String applicationKey, String userId, Map<String, String> initParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationContext, "applicationContext");
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationKey, "applicationKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(userId, "userId");
        kotlin.jvm.internal.e0.checkNotNullParameter(initParams, "initParams");
        IronSourceNetwork.initSDK(applicationContext, applicationKey, userId, initParams);
    }

    @Override // com.ironsource.InterfaceC3414qc
    public void a(String controllerConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(controllerConfig, "controllerConfig");
        SDKUtils.setControllerConfig(controllerConfig);
    }

    @Override // com.ironsource.InterfaceC3414qc
    public void a(int i10) {
        SDKUtils.setDebugMode(i10);
    }
}
