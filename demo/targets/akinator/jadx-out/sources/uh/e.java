package uh;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface e extends MessageLiteOrBuilder {
    String getAppVersion();

    ByteString getAppVersionBytes();

    String getLanguageCode();

    ByteString getLanguageCodeBytes();

    String getPlatformVersion();

    ByteString getPlatformVersionBytes();

    String getTimeZone();

    ByteString getTimeZoneBytes();
}
