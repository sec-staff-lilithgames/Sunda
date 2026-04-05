package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface a6 extends Comparable {
    p7 getEnumType();

    cd getLiteJavaType();

    bd getLiteType();

    int getNumber();

    MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

    boolean isPacked();

    boolean isRepeated();
}
