package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface l6 extends MessageLiteOrBuilder {
    String getBrand();

    ByteString getBrandBytes();

    String getCarrier();

    ByteString getCarrierBytes();

    long getDbt();

    int getDevicetype();

    BidToken$ClientBidTokenComponents.Geo getGeo();

    int getH();

    String getHardware();

    ByteString getHardwareBytes();

    boolean getHasGy();

    String getHwv();

    ByteString getHwvBytes();

    int getJs();

    String getKbLoc();

    ByteString getKbLocBytes();

    String getLanguage();

    ByteString getLanguageBytes();

    String getLocale();

    ByteString getLocaleBytes();

    String getMake();

    ByteString getMakeBytes();

    String getModel();

    ByteString getModelBytes();

    k6 getOrtn();

    int getOrtnValue();

    String getOs();

    ByteString getOsBytes();

    String getOsv();

    ByteString getOsvBytes();

    int getPpi();

    double getPxratio();

    int getW();

    float getXdpi();

    float getYdpi();

    boolean hasBrand();

    boolean hasCarrier();

    boolean hasDbt();

    boolean hasDevicetype();

    boolean hasGeo();

    boolean hasH();

    boolean hasHardware();

    boolean hasHasGy();

    boolean hasHwv();

    boolean hasJs();

    boolean hasKbLoc();

    boolean hasLanguage();

    boolean hasLocale();

    boolean hasMake();

    boolean hasModel();

    boolean hasOrtn();

    boolean hasOs();

    boolean hasOsv();

    boolean hasPpi();

    boolean hasPxratio();

    boolean hasW();

    boolean hasXdpi();

    boolean hasYdpi();
}
