package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Cc implements Bc {
    @Override // com.ironsource.Bc
    public void a(Activity activity, M9 adInstance, Map<String, String> showParams) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.Bc
    public boolean a(M9 adInstance) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
