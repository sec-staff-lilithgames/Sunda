package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AndroidOmInteraction implements OmInteraction {
    private final CreativeType getCreativeType(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("creativeType");
        if (iOptInt == 1) {
            return CreativeType.DEFINED_BY_JAVASCRIPT;
        }
        if (iOptInt == 2) {
            return CreativeType.HTML_DISPLAY;
        }
        if (iOptInt == 3) {
            return CreativeType.NATIVE_DISPLAY;
        }
        if (iOptInt == 4) {
            return CreativeType.VIDEO;
        }
        if (iOptInt == 5) {
            return CreativeType.AUDIO;
        }
        throw new IllegalArgumentException("Invalid creativeType");
    }

    private final ImpressionType getImpressionType(JSONObject jSONObject) {
        switch (jSONObject.optInt("impressionType")) {
            case 1:
                return ImpressionType.DEFINED_BY_JAVASCRIPT;
            case 2:
                return ImpressionType.UNSPECIFIED;
            case 3:
                return ImpressionType.LOADED;
            case 4:
                return ImpressionType.BEGIN_TO_RENDER;
            case 5:
                return ImpressionType.ONE_PIXEL;
            case 6:
                return ImpressionType.VIEWABLE;
            case 7:
                return ImpressionType.AUDIBLE;
            case 8:
                return ImpressionType.OTHER;
            default:
                throw new IllegalArgumentException("Invalid impressionType");
        }
    }

    private final Owner getImpressionsOwner(JSONObject jSONObject) {
        try {
            int iOptInt = jSONObject.optInt("impressionOwner");
            if (iOptInt == 1) {
                return Owner.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return Owner.NATIVE;
            }
            if (iOptInt == 3) {
                return Owner.NONE;
            }
            throw new IllegalArgumentException("Invalid impressionOwner");
        } catch (IllegalArgumentException unused) {
            return Owner.NONE;
        }
    }

    private final Owner getMediaEventsOwner(JSONObject jSONObject) {
        try {
            int iOptInt = jSONObject.optInt("mediaEventsOwner");
            if (iOptInt == 1) {
                return Owner.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return Owner.NATIVE;
            }
            if (iOptInt == 3) {
                return Owner.NONE;
            }
            throw new IllegalArgumentException("Invalid mediaEventsOwner");
        } catch (IllegalArgumentException unused) {
            return Owner.NONE;
        }
    }

    private final Owner getVideoEventsOwner(JSONObject jSONObject) {
        try {
            int iOptInt = jSONObject.optInt("videoEventsOwner");
            if (iOptInt == 1) {
                return Owner.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return Owner.NATIVE;
            }
            if (iOptInt == 3) {
                return Owner.NONE;
            }
            throw new IllegalArgumentException("Invalid videoEventsOwner");
        } catch (IllegalArgumentException unused) {
            return Owner.NONE;
        }
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public OmidOptions getOMidOptions(JSONObject options) {
        e0.checkNotNullParameter(options, "options");
        return new OmidOptions(options.optBoolean("isolateVerificationScripts"), getImpressionsOwner(options), getVideoEventsOwner(options), options.optString("customReferenceData"), getImpressionType(options), getCreativeType(options), getMediaEventsOwner(options));
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public WebView getWebview(AdObject adObject) {
        e0.checkNotNullParameter(adObject, "adObject");
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer instanceof AndroidFullscreenWebViewAdPlayer) {
            return ((AndroidFullscreenWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        if (adPlayer instanceof AndroidEmbeddableWebViewAdPlayer) {
            return ((AndroidEmbeddableWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        return null;
    }
}
