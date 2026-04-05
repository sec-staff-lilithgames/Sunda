package com.unity3d.services.ads.configuration;

import com.ironsource.C3191e4;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.adunit.AdUnitOpen;
import com.unity3d.services.ads.adunit.VideoPlayerHandler;
import com.unity3d.services.ads.adunit.WebPlayerHandler;
import com.unity3d.services.ads.adunit.WebViewHandler;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.ads.api.GMAScar;
import com.unity3d.services.ads.api.Load;
import com.unity3d.services.ads.api.Measurements;
import com.unity3d.services.ads.api.Show;
import com.unity3d.services.ads.api.Token;
import com.unity3d.services.ads.api.Topics;
import com.unity3d.services.ads.api.VideoPlayer;
import com.unity3d.services.ads.api.WebPlayer;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.misc.Utilities;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class AdsModuleConfiguration implements IAdsModuleConfiguration {
    private InetAddress _address;
    private final TokenStorage tokenStorage = (TokenStorage) Utilities.getService(TokenStorage.class);
    private final AsyncTokenStorage asyncTokenStorage = (AsyncTokenStorage) Utilities.getService(AsyncTokenStorage.class);

    @Override // com.unity3d.services.ads.configuration.IAdsModuleConfiguration
    public Map<String, Class> getAdUnitViewHandlers() {
        HashMap map = new HashMap();
        map.put("videoplayer", VideoPlayerHandler.class);
        map.put("webplayer", WebPlayerHandler.class);
        map.put(C3191e4.h.K, WebViewHandler.class);
        return map;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public Class[] getWebAppApiClassList() {
        return new Class[]{AdUnit.class, VideoPlayer.class, WebPlayer.class, Load.class, Show.class, Token.class, GMAScar.class, Measurements.class, Topics.class};
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(Configuration configuration) {
        AdUnitOpen.setConfiguration(configuration);
        UnityAdsImplementation.setConfiguration(configuration);
        this.asyncTokenStorage.setConfiguration(configuration);
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        this.tokenStorage.setInitToken(null);
        this.tokenStorage.deleteTokens();
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(Configuration configuration) {
        AdUnitOpen.setConfiguration(configuration);
        UnityAdsImplementation.setConfiguration(configuration);
        this.tokenStorage.deleteTokens();
        this.asyncTokenStorage.setConfiguration(configuration);
        return true;
    }
}
