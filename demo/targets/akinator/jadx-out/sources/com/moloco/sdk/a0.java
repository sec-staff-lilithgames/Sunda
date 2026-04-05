package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface a0 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    String getCarrier();

    ByteString getCarrierBytes();

    h getConnectiontype();

    k getDevicetype();

    @Deprecated
    String getDidmd5();

    @Deprecated
    ByteString getDidmd5Bytes();

    @Deprecated
    String getDidsha1();

    @Deprecated
    ByteString getDidsha1Bytes();

    boolean getDnt();

    @Deprecated
    String getDpidmd5();

    @Deprecated
    ByteString getDpidmd5Bytes();

    @Deprecated
    String getDpidsha1();

    @Deprecated
    ByteString getDpidsha1Bytes();

    String getFlashver();

    ByteString getFlashverBytes();

    BidRequest$SdkBidRequest.Device.Geo getGeo();

    boolean getGeofetch();

    int getH();

    String getHwv();

    ByteString getHwvBytes();

    String getIfa();

    ByteString getIfaBytes();

    String getIp();

    ByteString getIpBytes();

    String getIpv6();

    ByteString getIpv6Bytes();

    boolean getJs();

    String getLangb();

    ByteString getLangbBytes();

    String getLanguage();

    ByteString getLanguageBytes();

    boolean getLmt();

    @Deprecated
    String getMacmd5();

    @Deprecated
    ByteString getMacmd5Bytes();

    @Deprecated
    String getMacsha1();

    @Deprecated
    ByteString getMacsha1Bytes();

    String getMake();

    ByteString getMakeBytes();

    String getMccmnc();

    ByteString getMccmncBytes();

    String getModel();

    ByteString getModelBytes();

    String getOs();

    ByteString getOsBytes();

    String getOsv();

    ByteString getOsvBytes();

    int getPpi();

    double getPxratio();

    BidRequest$SdkBidRequest.Device.UserAgent getSua();

    String getUa();

    ByteString getUaBytes();

    int getW();

    boolean hasCarrier();

    boolean hasConnectiontype();

    boolean hasDevicetype();

    @Deprecated
    boolean hasDidmd5();

    @Deprecated
    boolean hasDidsha1();

    boolean hasDnt();

    @Deprecated
    boolean hasDpidmd5();

    @Deprecated
    boolean hasDpidsha1();

    boolean hasFlashver();

    boolean hasGeo();

    boolean hasGeofetch();

    boolean hasH();

    boolean hasHwv();

    boolean hasIfa();

    boolean hasIp();

    boolean hasIpv6();

    boolean hasJs();

    boolean hasLangb();

    boolean hasLanguage();

    boolean hasLmt();

    @Deprecated
    boolean hasMacmd5();

    @Deprecated
    boolean hasMacsha1();

    boolean hasMake();

    boolean hasMccmnc();

    boolean hasModel();

    boolean hasOs();

    boolean hasOsv();

    boolean hasPpi();

    boolean hasPxratio();

    boolean hasSua();

    boolean hasUa();

    boolean hasW();
}
