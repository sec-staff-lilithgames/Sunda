package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface i2 extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    int getH();

    int getHmin();

    String getMimes(int i10);

    ByteString getMimesBytes(int i10);

    int getMimesCount();

    List<String> getMimesList();

    h2 getType();

    int getW();

    int getWmin();

    boolean hasH();

    boolean hasHmin();

    boolean hasType();

    boolean hasW();

    boolean hasWmin();
}
