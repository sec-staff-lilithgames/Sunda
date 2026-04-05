package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ContextOrBuilder extends MessageOrBuilder {
    App getApp();

    AppOrBuilder getAppOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Device getDevice();

    DeviceOrBuilder getDeviceOrBuilder();

    SDK getSdk();

    SDKOrBuilder getSdkOrBuilder();

    Session getSession();

    SessionOrBuilder getSessionOrBuilder();

    User getUser();

    UserOrBuilder getUserOrBuilder();

    boolean hasApp();

    boolean hasDevice();

    boolean hasSdk();

    boolean hasSession();

    boolean hasUser();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
