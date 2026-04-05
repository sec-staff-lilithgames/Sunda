package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.jb;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.AppOrBuilder;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.DeviceOrBuilder;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.protobuf.sdk.PlacementOrBuilder;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.SDKOrBuilder;
import io.bidmachine.protobuf.sdk.User;
import io.bidmachine.protobuf.sdk.UserOrBuilder;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface RequestTokenPayloadOrBuilder extends MessageOrBuilder {
    @Deprecated
    boolean containsCustomData(String str);

    @Deprecated
    String getAdType();

    @Deprecated
    ByteString getAdTypeBytes();

    App getAppData();

    AppOrBuilder getAppDataOrBuilder();

    @Deprecated
    Map<String, String> getCustomData();

    @Deprecated
    int getCustomDataCount();

    @Deprecated
    Map<String, String> getCustomDataMap();

    @Deprecated
    String getCustomDataOrDefault(String str, String str2);

    @Deprecated
    String getCustomDataOrThrow(String str);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Device getDeviceData();

    DeviceOrBuilder getDeviceDataOrBuilder();

    Struct getExt();

    jb getExtOrBuilder();

    @Deprecated
    HeaderBiddingPlacement getHbPlacement();

    @Deprecated
    HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder();

    Placement getPlacement();

    SDK getPlacementData();

    SDKOrBuilder getPlacementDataOrBuilder();

    PlacementOrBuilder getPlacementOrBuilder();

    io.bidmachine.protobuf.sdk.Session getSession();

    @Deprecated
    RequestTokenPayload.SessionData getSessionData();

    @Deprecated
    RequestTokenPayload.SessionDataOrBuilder getSessionDataOrBuilder();

    io.bidmachine.protobuf.sdk.SessionOrBuilder getSessionOrBuilder();

    String getTokenHashValue();

    ByteString getTokenHashValueBytes();

    User getUserData();

    UserOrBuilder getUserDataOrBuilder();

    boolean hasAppData();

    boolean hasDeviceData();

    boolean hasExt();

    @Deprecated
    boolean hasHbPlacement();

    boolean hasPlacement();

    boolean hasPlacementData();

    boolean hasSession();

    @Deprecated
    boolean hasSessionData();

    boolean hasUserData();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
