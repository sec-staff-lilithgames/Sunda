package com.facebook.ads.internal.dynamicloading;

import android.app.Activity;
import android.app.Service;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface RemoteRenderingApi {
    AudienceNetworkExportedActivityApi createAudienceNetworkExportedActivityApi(Activity activity);

    AudienceNetworkRemoteServiceApi createAudienceNetworkRemoteService(Service service);
}
