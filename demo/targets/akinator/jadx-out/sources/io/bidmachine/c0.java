package io.bidmachine;

import android.content.Context;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 extends a0 {
    @Override // io.bidmachine.a0
    public final AdvertisingDataManager$AdvertisingData a(Context context) {
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        if (advertisingIdInfo != null) {
            return new AdvertisingDataManager$AdvertisingData(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        }
        return null;
    }
}
