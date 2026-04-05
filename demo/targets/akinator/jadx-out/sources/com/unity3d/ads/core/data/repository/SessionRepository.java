package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int i10);

    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    String getGameId();

    Object getGatewayCache(d<? super ByteString> dVar);

    ByteString getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationState getInitializationState();

    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    Flow<InitializationState> getObserveInitializationState();

    SharedFlow<SessionChange> getOnChange();

    Object getPrivacy(d<? super ByteString> dVar);

    Object getPrivacyFsm(d<? super ByteString> dVar);

    List<AdFormatOuterClass.AdFormat> getScarEligibleFormats();

    SessionCountersOuterClass.SessionCounters getSessionCounters();

    ByteString getSessionId();

    ByteString getSessionToken();

    boolean getShouldInitialize();

    TokenCounters getTokenCounters();

    String getUnityInstallationId();

    String getUnityMegaSessionId();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    Object persistNativeConfiguration(d<? super x0> dVar);

    void resetTokenCounters();

    void setGameId(String str);

    Object setGatewayCache(ByteString byteString, d<? super x0> dVar);

    void setGatewayState(ByteString byteString);

    void setGatewayUrl(String str);

    void setInitializationState(InitializationState initializationState);

    void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    Object setPrivacy(ByteString byteString, d<? super x0> dVar);

    Object setPrivacyFsm(ByteString byteString, d<? super x0> dVar);

    void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(ByteString byteString);

    void setShouldInitialize(boolean z10);

    void setTokenCounters(TokenCounters tokenCounters);
}
