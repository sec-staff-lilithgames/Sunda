package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface o9 extends MessageLiteOrBuilder {
    long getElapsedTimeMillis();

    String getName();

    ByteString getNameBytes();

    String getTags(int i10);

    ByteString getTagsBytes(int i10);

    int getTagsCount();

    List<String> getTagsList();
}
