package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface ScarManager {
    Object getSignals(List<? extends AdFormatOuterClass.AdFormat> list, d<? super BiddingSignals> dVar);

    Object getVersion(d<? super String> dVar);

    Object loadAd(String str, String str2, String str3, String str4, String str5, int i10, d<? super x0> dVar);

    Flow<GmaEventData> loadBannerAd(Context context, BannerView bannerView, kl.d dVar, UnityBannerSize unityBannerSize, String str);

    Flow<GmaEventData> show(String str, String str2);
}
