package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface t6 extends MessageLiteOrBuilder {
    BidToken$ClientBidTokenComponents.ImpLvlRevData.ImpCounts getImpCounts();

    long getLastImpTs();

    String getSessionId();

    ByteString getSessionIdBytes();

    long getSessionStartTs();

    boolean hasImpCounts();
}
