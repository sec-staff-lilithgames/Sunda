package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.b0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3133b0 implements InterfaceC3115a0 {

    /* renamed from: a, reason: collision with root package name */
    private final Bc f36011a;

    public C3133b0(Bc networkShowApi) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.f36011a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC3115a0
    public void a(Activity activity, M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.f36011a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC3115a0
    public boolean a(M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        return this.f36011a.a(adInstance);
    }
}
