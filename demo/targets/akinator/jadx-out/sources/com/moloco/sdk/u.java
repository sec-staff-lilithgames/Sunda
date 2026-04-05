package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface u extends MessageLiteOrBuilder {
    String getBrand();

    ByteString getBrandBytes();

    String getVersion(int i10);

    ByteString getVersionBytes(int i10);

    int getVersionCount();

    List<String> getVersionList();

    boolean hasBrand();
}
