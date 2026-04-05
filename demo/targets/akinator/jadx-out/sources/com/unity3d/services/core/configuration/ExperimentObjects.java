package com.unity3d.services.core.configuration;

import com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ExperimentObjects extends ExperimentsBase {
    private final Map<String, ExperimentObject> _experimentObjects = new HashMap();
    private final JSONObject _experimentObjetsData;

    public ExperimentObjects(JSONObject jSONObject) {
        if (jSONObject == null) {
            this._experimentObjetsData = new JSONObject();
            return;
        }
        this._experimentObjetsData = jSONObject;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this._experimentObjects.put(next, new ExperimentObject(jSONObject.optJSONObject(next)));
        }
    }

    private String getExperimentValue(String str, String str2) {
        ExperimentObject experimentObject = getExperimentObject(str);
        return experimentObject != null ? experimentObject.getStringValue() : str2;
    }

    private boolean getExperimentValueOrDefault(String str) {
        return getExperimentValue(str, false);
    }

    private JSONObject getExperimentWithAppliedRule(ExperimentAppliedRule experimentAppliedRule) {
        HashMap map = new HashMap();
        for (Map.Entry<String, ExperimentObject> entry : this._experimentObjects.entrySet()) {
            if (entry.getValue().getAppliedRule() == experimentAppliedRule) {
                map.put(entry.getKey(), entry.getValue().getStringValue());
            }
        }
        return new JSONObject(map);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getCurrentSessionExperiments() {
        return getExperimentWithAppliedRule(ExperimentAppliedRule.IMMEDIATE);
    }

    public ExperimentObject getExperimentObject(String str) {
        return this._experimentObjects.get(str);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public Map<String, String> getExperimentTags() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ExperimentObject> entry : this._experimentObjects.entrySet()) {
            map.put(entry.getKey(), entry.getValue().getStringValue());
        }
        return map;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getExperimentsAsJson() {
        return this._experimentObjetsData;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getNextSessionExperiments() {
        return getExperimentWithAppliedRule(ExperimentAppliedRule.NEXT);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public String getScarBiddingManager() {
        return getExperimentValue("scar_bm", ScarBiddingManagerType.DISABLED.getName());
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isBoldSdkNextSessionEnabled() {
        return getExperimentValue(ExperimentsBase.EXP_TAG_IS_BOLD_NEXT_SESSION, true);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isCaptureHDRCapabilitiesEnabled() {
        return getExperimentValueOrDefault("hdrc");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isJetpackLifecycle() {
        return getExperimentValueOrDefault("gjl");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeLoadTimeoutDisabled() {
        return getExperimentValueOrDefault("nltd");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeShowTimeoutDisabled() {
        return getExperimentValueOrDefault("nstd");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isOkHttpEnabled() {
        return getExperimentValueOrDefault(OkHttp3Client.NETWORK_CLIENT_OKHTTP);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isPCCheckEnabled() {
        return getExperimentValueOrDefault("pc_check");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarBannerHbEnabled() {
        return getExperimentValueOrDefault("scar_bn");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarInitEnabled() {
        return getExperimentValueOrDefault("scar_init");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebAssetAdCaching() {
        return getExperimentValueOrDefault("wac");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebGestureNotRequired() {
        return getExperimentValueOrDefault("wgr");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebMessageEnabled() {
        return getExperimentValueOrDefault("jwm");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebViewAsyncDownloadEnabled() {
        return getExperimentValueOrDefault("wad");
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean shouldNativeTokenAwaitPrivacy() {
        return getExperimentValueOrDefault("tsi_prw");
    }

    private boolean getExperimentValue(String str, boolean z10) {
        ExperimentObject experimentObject = getExperimentObject(str);
        return experimentObject != null ? experimentObject.getBooleanValue() : z10;
    }
}
