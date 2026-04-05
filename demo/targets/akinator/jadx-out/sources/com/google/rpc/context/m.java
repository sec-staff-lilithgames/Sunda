package com.google.rpc.context;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.context.AttributeContext;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface m extends MessageLiteOrBuilder {
    AttributeContext.Api getApi();

    AttributeContext.Peer getDestination();

    AttributeContext.Peer getOrigin();

    AttributeContext.Request getRequest();

    AttributeContext.Resource getResource();

    AttributeContext.Response getResponse();

    AttributeContext.Peer getSource();

    boolean hasApi();

    boolean hasDestination();

    boolean hasOrigin();

    boolean hasRequest();

    boolean hasResource();

    boolean hasResponse();

    boolean hasSource();
}
