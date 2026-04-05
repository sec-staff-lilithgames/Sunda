package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface lb extends MessageLiteOrBuilder {
    String getAdvertisingId();

    ByteString getAdvertisingIdBytes();

    UserIntent$UserAdInteractionExt.App getApp();

    UserIntent$UserAdInteractionExt.AppBackgroundingInteraction getAppBackgroundingInteraction();

    UserIntent$UserAdInteractionExt.AppForegroundingInteraction getAppForegroundingInteraction();

    UserIntent$UserAdInteractionExt.ClickInteraction getClickInteraction();

    long getClientTimestamp();

    UserIntent$UserAdInteractionExt.Device getDevice();

    UserIntent$UserAdInteractionExt.ImpressionInteraction getImpInteraction();

    za getInfoExtCase();

    String getMref();

    ByteString getMrefBytes();

    UserIntent$UserAdInteractionExt.Network getNetwork();

    UserIntent$UserAdInteractionExt.MolocoSDK getSdk();

    boolean hasApp();

    boolean hasAppBackgroundingInteraction();

    boolean hasAppForegroundingInteraction();

    boolean hasClickInteraction();

    boolean hasDevice();

    boolean hasImpInteraction();

    boolean hasNetwork();

    boolean hasSdk();
}
