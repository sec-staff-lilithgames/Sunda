package com.amazon.aps.ads;

import com.amazon.aps.ads.listeners.ApsAdRequestListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdNetworkInfo;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBLoadException;
import com.amazon.device.ads.DtbConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsAdRequest extends DTBAdRequest {
    private ApsAdFormat apsAdFormat;
    private ApsAdFormatProperties apsAdFormatProperties;
    private ApsAdRequestListener apsAdRequestListener;
    private final DTBAdCallback dtbAdCallback;
    private String slotUuid;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.amazon.aps.ads.ApsAdRequest$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat;

        static {
            int[] iArr = new int[ApsAdFormat.values().length];
            $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat = iArr;
            try {
                iArr[ApsAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.LEADERBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.MREC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.BANNER_SMART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.INTERSTITIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.REWARDED_VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.INSTREAM_VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ApsAdRequest(String str, ApsAdNetworkInfo apsAdNetworkInfo) {
        super(apsAdNetworkInfo);
        this.dtbAdCallback = new DTBAdCallback() { // from class: com.amazon.aps.ads.ApsAdRequest.1
            @Override // com.amazon.device.ads.DTBAdCallback
            public void onFailure(AdError adError) {
                if (ApsAdRequest.this.apsAdRequestListener != null) {
                    ApsAdRequest.this.apsAdRequestListener.onFailure(new ApsAdError(adError, ApsAdRequest.this.slotUuid, ApsAdRequest.this.apsAdFormat));
                }
            }

            @Override // com.amazon.device.ads.DTBAdCallback
            public void onSuccess(DTBAdResponse dTBAdResponse) {
                if (ApsAdRequest.this.apsAdRequestListener != null) {
                    ApsAd apsAd = new ApsAd(dTBAdResponse, ApsAdRequest.this.apsAdFormat);
                    apsAd.setSlotUuid(ApsAdRequest.this.slotUuid);
                    ApsAdRequest.this.apsAdRequestListener.onSuccess(apsAd);
                }
            }
        };
        ApsAdUtils.checkNullAndLogInvalidArg(str);
        this.slotUuid = str;
    }

    private void loadPrivacyStrings() {
        try {
            HashMap<String, String> privacyHashmap = Aps.getPrivacyHashmap();
            if (privacyHashmap.size() > 0) {
                for (Map.Entry<String, String> entry : privacyHashmap.entrySet()) {
                    putCustomTarget(entry.getKey(), entry.getValue());
                }
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error in ApsAdRequest - loadPrivacySettings", e10);
        }
    }

    private void setAdSize() throws IllegalArgumentException {
        DTBAdSize dTBAdSize;
        DTBAdSize dTBInterstitialAdSize;
        int width = ApsAdFormatUtils.getWidth(this.apsAdFormat);
        int height = ApsAdFormatUtils.getHeight(this.apsAdFormat);
        switch (AnonymousClass2.$SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[this.apsAdFormat.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                dTBAdSize = new DTBAdSize(width, height, this.slotUuid);
                dTBInterstitialAdSize = dTBAdSize;
                break;
            case 5:
            case 6:
                dTBInterstitialAdSize = new DTBAdSize.DTBInterstitialAdSize(this.slotUuid);
                break;
            case 7:
                ApsAdFormatProperties apsAdFormatProperties = this.apsAdFormatProperties;
                int playerWidth = apsAdFormatProperties != null ? apsAdFormatProperties.getPlayerWidth() : 320;
                ApsAdFormatProperties apsAdFormatProperties2 = this.apsAdFormatProperties;
                dTBAdSize = new DTBAdSize.DTBVideo(playerWidth, apsAdFormatProperties2 != null ? apsAdFormatProperties2.getPlayerHeight() : DtbConstants.DEFAULT_PLAYER_HEIGHT, this.slotUuid);
                dTBInterstitialAdSize = dTBAdSize;
                break;
            default:
                dTBInterstitialAdSize = null;
                break;
        }
        if (dTBInterstitialAdSize != null) {
            ApsAdFormatProperties apsAdFormatProperties3 = this.apsAdFormatProperties;
            if (apsAdFormatProperties3 != null && apsAdFormatProperties3.getSlotInfoExtra() != null) {
                dTBInterstitialAdSize.setSlotInfoExtra(this.apsAdFormatProperties.getSlotInfoExtra());
            }
            setSizes(dTBInterstitialAdSize);
        }
    }

    public String getSlotUuid() {
        return this.slotUuid;
    }

    public void loadAd(ApsAdRequestListener apsAdRequestListener) throws JSONException {
        ApsAdUtils.checkNullAndLogInvalidArg(apsAdRequestListener);
        try {
            loadPrivacyStrings();
            this.apsAdRequestListener = apsAdRequestListener;
            super.loadAd(this.dtbAdCallback);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdRequest - loadAd", e10);
        }
    }

    public void loadSmartBanner(ApsAdRequestListener apsAdRequestListener) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsAdRequestListener);
        this.apsAdRequestListener = apsAdRequestListener;
        try {
            loadPrivacyStrings();
            super.loadSmartBanner(this.dtbAdCallback);
        } catch (DTBLoadException | RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdRequest - loadSmartBanner", e10);
        }
    }

    public void setApsAdFormat(ApsAdFormat apsAdFormat) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsAdFormat);
        try {
            this.apsAdFormat = apsAdFormat;
            this.apsAdFormatProperties = null;
            setAdSize();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdRequest - setApsAdFormat", e10);
        }
    }

    public void setNetworkInfo(ApsAdNetworkInfo apsAdNetworkInfo) {
        try {
            super.setNetworkInfo((DTBAdNetworkInfo) apsAdNetworkInfo);
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdRequest - setNetworkInfo", e10);
        }
    }

    public ApsAdRequest(String str, ApsAdFormat apsAdFormat, ApsAdNetworkInfo apsAdNetworkInfo) {
        this(str, apsAdNetworkInfo);
        ApsAdUtils.checkNullAndLogInvalidArg(apsAdFormat);
        setApsAdFormat(apsAdFormat);
    }

    public void setApsAdFormat(ApsAdFormat apsAdFormat, ApsAdFormatProperties apsAdFormatProperties) {
        ApsAdUtils.checkNullAndLogInvalidArg(apsAdFormat);
        try {
            this.apsAdFormat = apsAdFormat;
            this.apsAdFormatProperties = apsAdFormatProperties;
            setAdSize();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "API failure:ApsAdRequest - setApsAdFormat", e10);
        }
    }

    public ApsAdRequest(String str, ApsAdFormat apsAdFormat, ApsAdFormatProperties apsAdFormatProperties, ApsAdNetworkInfo apsAdNetworkInfo) {
        this(str, apsAdNetworkInfo);
        ApsAdUtils.checkNullAndLogInvalidArg(apsAdFormat);
        setApsAdFormat(apsAdFormat, apsAdFormatProperties);
    }

    public ApsAdRequest(DTBAdRequest dTBAdRequest, String str, ApsAdFormat apsAdFormat) {
        super(dTBAdRequest, str);
        this.dtbAdCallback = new DTBAdCallback() { // from class: com.amazon.aps.ads.ApsAdRequest.1
            @Override // com.amazon.device.ads.DTBAdCallback
            public void onFailure(AdError adError) {
                if (ApsAdRequest.this.apsAdRequestListener != null) {
                    ApsAdRequest.this.apsAdRequestListener.onFailure(new ApsAdError(adError, ApsAdRequest.this.slotUuid, ApsAdRequest.this.apsAdFormat));
                }
            }

            @Override // com.amazon.device.ads.DTBAdCallback
            public void onSuccess(DTBAdResponse dTBAdResponse) {
                if (ApsAdRequest.this.apsAdRequestListener != null) {
                    ApsAd apsAd = new ApsAd(dTBAdResponse, ApsAdRequest.this.apsAdFormat);
                    apsAd.setSlotUuid(ApsAdRequest.this.slotUuid);
                    ApsAdRequest.this.apsAdRequestListener.onSuccess(apsAd);
                }
            }
        };
        this.slotUuid = str;
        setApsAdFormat(apsAdFormat);
    }

    public ApsAdRequest(DTBAdRequest dTBAdRequest) {
        DTBAdSize dTBAdSize;
        super(dTBAdRequest);
        this.dtbAdCallback = new DTBAdCallback() { // from class: com.amazon.aps.ads.ApsAdRequest.1
            @Override // com.amazon.device.ads.DTBAdCallback
            public void onFailure(AdError adError) {
                if (ApsAdRequest.this.apsAdRequestListener != null) {
                    ApsAdRequest.this.apsAdRequestListener.onFailure(new ApsAdError(adError, ApsAdRequest.this.slotUuid, ApsAdRequest.this.apsAdFormat));
                }
            }

            @Override // com.amazon.device.ads.DTBAdCallback
            public void onSuccess(DTBAdResponse dTBAdResponse) {
                if (ApsAdRequest.this.apsAdRequestListener != null) {
                    ApsAd apsAd = new ApsAd(dTBAdResponse, ApsAdRequest.this.apsAdFormat);
                    apsAd.setSlotUuid(ApsAdRequest.this.slotUuid);
                    ApsAdRequest.this.apsAdRequestListener.onSuccess(apsAd);
                }
            }
        };
        if (dTBAdRequest == null || dTBAdRequest.getAdSizes() == null || dTBAdRequest.getAdSizes().size() <= 0 || (dTBAdSize = dTBAdRequest.getAdSizes().get(0)) == null) {
            return;
        }
        String slotUUID = dTBAdSize.getSlotUUID();
        ApsAdFormat adFormat = ApsAdFormatUtils.getAdFormat(dTBAdSize.getDTBAdType(), dTBAdSize.getHeight(), dTBAdSize.getWidth());
        this.slotUuid = slotUUID;
        setApsAdFormat(adFormat);
    }
}
