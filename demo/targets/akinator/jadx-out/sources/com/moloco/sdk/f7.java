package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface f7 extends MessageLiteOrBuilder {
    BidToken$ClientBidTokenComponents.AccessibilityInfo getAccessibilityInfo();

    BidToken$ClientBidTokenComponents.AdvertisingInfo getAdInfo();

    BidToken$ClientBidTokenComponents.AudioInfo getAudioInfo();

    BidToken$ClientBidTokenComponents.BatteryInfo getBatteryInfo();

    BidToken$ClientBidTokenComponents.Device getDevice();

    BidToken$ClientBidTokenComponents.DirInfo getDirInfo();

    String getIdfv();

    ByteString getIdfvBytes();

    BidToken$ClientBidTokenComponents.ImpLvlRevData getImpLvlRevData();

    BidToken$ClientBidTokenComponents.SdkInfo getInfo();

    BidToken$ClientBidTokenComponents.MemoryInfo getMemoryInfo();

    BidToken$ClientBidTokenComponents.NetworkInfo getNetworkInfo();

    BidToken$ClientBidTokenComponents.Privacy getPrivacy();

    boolean hasAccessibilityInfo();

    boolean hasAdInfo();

    boolean hasAudioInfo();

    boolean hasBatteryInfo();

    boolean hasDevice();

    boolean hasDirInfo();

    boolean hasIdfv();

    boolean hasImpLvlRevData();

    boolean hasInfo();

    boolean hasMemoryInfo();

    boolean hasNetworkInfo();

    boolean hasPrivacy();
}
