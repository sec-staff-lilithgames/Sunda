package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.OmSdkData;
import com.vungle.ads.internal.util.Logger;
import java.net.URL;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import sv.g;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NativeOMTracker {
    private AdEvents adEvents;
    private AdSession adSession;
    private final Json json;

    public NativeOMTracker(String omSdkData, String omSdkJS) {
        OmSdkData omSdkData2;
        e0.checkNotNullParameter(omSdkData, "omSdkData");
        e0.checkNotNullParameter(omSdkJS, "omSdkJS");
        Json jsonJson$default = JsonKt.Json$default(null, NativeOMTracker$json$1.INSTANCE, 1, null);
        this.json = jsonJson$default;
        try {
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            Partner partnerCreatePartner = Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME);
            byte[] bArrDecode = Base64.decode(omSdkData, 0);
            if (bArrDecode != null) {
                String str = new String(bArrDecode, g.f86134b);
                KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(jsonJson$default.getSerializersModule(), c1.typeOf(OmSdkData.class));
                e0.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                omSdkData2 = (OmSdkData) jsonJson$default.decodeFromString(kSerializerSerializer, str);
            } else {
                omSdkData2 = null;
            }
            VerificationScriptResource verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(omSdkData2 != null ? omSdkData2.getVendorKey() : null, new URL(omSdkData2 != null ? omSdkData2.getVendorURL() : null), omSdkData2 != null ? omSdkData2.getParams() : null);
            e0.checkNotNullExpressionValue(verificationScriptResource, "verificationScriptResource");
            this.adSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, omSdkJS, o0.listOf(verificationScriptResource), null, null));
        } catch (Exception e10) {
            Logger.Companion.e("NativeOMTracker", "error occured when create omsdk adSession:", e10);
        }
    }

    public final void impressionOccurred() {
        AdEvents adEvents = this.adEvents;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
    }

    public final void start(View view) {
        AdSession adSession;
        e0.checkNotNullParameter(view, "view");
        if (!Omid.isActive() || (adSession = this.adSession) == null) {
            return;
        }
        adSession.registerAdView(view);
        adSession.start();
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        this.adEvents = adEventsCreateAdEvents;
        if (adEventsCreateAdEvents != null) {
            adEventsCreateAdEvents.loaded();
        }
    }

    public final void stop() {
        AdSession adSession = this.adSession;
        if (adSession != null) {
            adSession.finish();
        }
        this.adSession = null;
    }
}
