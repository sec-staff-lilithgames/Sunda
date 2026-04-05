package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface c7 extends MessageLiteOrBuilder {
    boolean getCcpa();

    boolean getCoppa();

    boolean getGdpr();

    String getTcfConsentString();

    ByteString getTcfConsentStringBytes();

    String getUsPrivacy();

    ByteString getUsPrivacyBytes();

    boolean hasCcpa();

    boolean hasCoppa();

    boolean hasGdpr();

    boolean hasTcfConsentString();

    boolean hasUsPrivacy();
}
