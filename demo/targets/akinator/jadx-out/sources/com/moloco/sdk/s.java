package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface s extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    int getAccuracy();

    String getCity();

    ByteString getCityBytes();

    String getCountry();

    ByteString getCountryBytes();

    o getIpservice();

    int getLastfix();

    double getLat();

    double getLon();

    String getMetro();

    ByteString getMetroBytes();

    String getRegion();

    ByteString getRegionBytes();

    String getRegionfips104();

    ByteString getRegionfips104Bytes();

    r getType();

    int getUtcoffset();

    String getZip();

    ByteString getZipBytes();

    boolean hasAccuracy();

    boolean hasCity();

    boolean hasCountry();

    boolean hasIpservice();

    boolean hasLastfix();

    boolean hasLat();

    boolean hasLon();

    boolean hasMetro();

    boolean hasRegion();

    boolean hasRegionfips104();

    boolean hasType();

    boolean hasUtcoffset();

    boolean hasZip();
}
