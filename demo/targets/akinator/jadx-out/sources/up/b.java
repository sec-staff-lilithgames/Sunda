package up;

import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.rendering.Rendering;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final nm.l f88652a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumMap f88653b;

    /* renamed from: c, reason: collision with root package name */
    public final hr.a f88654c;

    public b(Ad ad2) {
        nm.l lVar = new nm.l();
        this.f88652a = lVar;
        EnumMap enumMap = new EnumMap(TrackEventType.class);
        this.f88653b = enumMap;
        this.f88654c = new hr.a();
        AdExtension adExtensionFindFirstAdExtension = pr.i.findFirstAdExtension(ad2);
        if (adExtensionFindFirstAdExtension != null) {
            lVar.setTimeThresholdSec(nm.j.getOrDefault(adExtensionFindFirstAdExtension.getViewabilityTimeThreshold(), AdExtension.getDefaultInstance().getViewabilityTimeThreshold(), 1L));
            lVar.setPixelThreshold(nm.j.getOrDefault(adExtensionFindFirstAdExtension.getViewabilityPixelThreshold(), AdExtension.getDefaultInstance().getViewabilityPixelThreshold(), 1.0f));
            lVar.setIgnoreWindowFocus(adExtensionFindFirstAdExtension.getViewabilityIgnoreWindowFocus());
            lVar.setIgnoreOverlap(adExtensionFindFirstAdExtension.getViewabilityIgnoreOverlap());
            pr.i.prepareEvents(enumMap, adExtensionFindFirstAdExtension.getEventList());
            getData().put("viewability_time_threshold_sec", Integer.valueOf(adExtensionFindFirstAdExtension.getViewabilityTimeThreshold()));
            getData().put("viewability_pixel_threshold", Float.valueOf(adExtensionFindFirstAdExtension.getViewabilityPixelThreshold()));
            getData().put("viewability_ignore_window_focus", Boolean.valueOf(adExtensionFindFirstAdExtension.getViewabilityIgnoreWindowFocus()));
            getData().put("viewability_ignore_overlap", Boolean.valueOf(adExtensionFindFirstAdExtension.getViewabilityIgnoreOverlap()));
            getData().put("useNativeClose", Boolean.valueOf(adExtensionFindFirstAdExtension.getUseNativeClose()));
            getData().put("cacheControl", adExtensionFindFirstAdExtension.getCreativeLoadingMethod());
            getData().put("placeholderTimeoutSec", Float.valueOf(adExtensionFindFirstAdExtension.getPlaceholderTimeout()));
            getData().put("skipOffset", Integer.valueOf(adExtensionFindFirstAdExtension.getSkipoffset()));
            getData().put("companionSkipOffset", Integer.valueOf(adExtensionFindFirstAdExtension.getCompanionSkipoffset()));
            getData().put("r1", Boolean.valueOf(adExtensionFindFirstAdExtension.getR1()));
            getData().put("r2", Boolean.valueOf(adExtensionFindFirstAdExtension.getR2()));
            getData().put("store_url", adExtensionFindFirstAdExtension.getStoreUrl());
            getData().put("progress_duration", Integer.valueOf(adExtensionFindFirstAdExtension.getProgressDuration()));
            AdExtension.ControlAsset closeButton = adExtensionFindFirstAdExtension.getCloseButton();
            if (closeButton != null && closeButton != AdExtension.ControlAsset.getDefaultInstance()) {
                getData().put("close_button_control_asset", closeButton);
            }
            AdExtension.ControlAsset countdown = adExtensionFindFirstAdExtension.getCountdown();
            if (countdown != null && countdown != AdExtension.ControlAsset.getDefaultInstance()) {
                getData().put("countdown_control_asset", countdown);
            }
            AdExtension.ControlAsset progress = adExtensionFindFirstAdExtension.getProgress();
            if (progress != null && progress != AdExtension.ControlAsset.getDefaultInstance()) {
                getData().put("progress_control_asset", progress);
            }
            Rendering renderingConfiguration = adExtensionFindFirstAdExtension.getRenderingConfiguration();
            if (renderingConfiguration != null && renderingConfiguration != Rendering.getDefaultInstance()) {
                getData().put("rendering_configuration", renderingConfiguration);
            }
        }
        Value value = ad2.getExt().getFieldsMap().get("omsdk_enabled");
        if (value != null) {
            getData().put("omsdk_enabled", Boolean.valueOf(value.getBoolValue()));
        }
    }

    public Map<String, Object> getData() {
        return this.f88654c.getParams();
    }

    public hr.k getMediationParams() {
        return this.f88654c;
    }

    public List<String> getTrackUrls(TrackEventType trackEventType) {
        return (List) this.f88653b.get(trackEventType);
    }

    public nm.l getVisibilityParams() {
        return this.f88652a;
    }

    public abstract boolean isValid();
}
