package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface n3 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    l3 getAt();

    double getBidfloor();

    String getBidfloorcur();

    ByteString getBidfloorcurBytes();

    String getId();

    ByteString getIdBytes();

    String getWadomain(int i10);

    ByteString getWadomainBytes(int i10);

    int getWadomainCount();

    List<String> getWadomainList();

    String getWseat(int i10);

    ByteString getWseatBytes(int i10);

    int getWseatCount();

    List<String> getWseatList();

    boolean hasAt();

    boolean hasBidfloor();

    boolean hasBidfloorcur();

    boolean hasId();
}
