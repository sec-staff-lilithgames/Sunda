package kh;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface y extends MessageLiteOrBuilder {
    String getAddress();

    ByteString getAddressBytes();

    t getAuthenticationCase();

    double getDeadline();

    boolean getDisableAuth();

    String getJwtAudience();

    ByteString getJwtAudienceBytes();

    double getMinDeadline();

    double getOperationDeadline();

    x getPathTranslation();

    int getPathTranslationValue();

    String getProtocol();

    ByteString getProtocolBytes();

    String getSelector();

    ByteString getSelectorBytes();

    boolean hasDisableAuth();

    boolean hasJwtAudience();
}
