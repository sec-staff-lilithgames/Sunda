package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface w7 extends MessageLiteOrBuilder {
    String getDeviceId();

    ByteString getDeviceIdBytes();

    IlrdRequest$ImpressionLevelRevenue getEvents(int i10);

    int getEventsCount();

    List<IlrdRequest$ImpressionLevelRevenue> getEventsList();

    String getIdfv();

    ByteString getIdfvBytes();

    String getOs();

    ByteString getOsBytes();

    String getPublisherAppId();

    ByteString getPublisherAppIdBytes();

    String getPublisherId();

    ByteString getPublisherIdBytes();
}
