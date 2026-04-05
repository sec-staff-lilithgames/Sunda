package sk;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface c extends MessageLiteOrBuilder {
    long getCacheFillBytes();

    boolean getCacheHit();

    boolean getCacheLookup();

    boolean getCacheValidatedWithOriginServer();

    Duration getLatency();

    String getProtocol();

    ByteString getProtocolBytes();

    String getReferer();

    ByteString getRefererBytes();

    String getRemoteIp();

    ByteString getRemoteIpBytes();

    String getRequestMethod();

    ByteString getRequestMethodBytes();

    long getRequestSize();

    String getRequestUrl();

    ByteString getRequestUrlBytes();

    long getResponseSize();

    String getServerIp();

    ByteString getServerIpBytes();

    int getStatus();

    String getUserAgent();

    ByteString getUserAgentBytes();

    boolean hasLatency();
}
