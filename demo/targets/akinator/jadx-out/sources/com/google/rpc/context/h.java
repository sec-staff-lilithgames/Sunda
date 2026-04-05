package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.rpc.context.AttributeContext;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface h extends MessageLiteOrBuilder {
    boolean containsHeaders(String str);

    AttributeContext.Auth getAuth();

    @Deprecated
    Map<String, String> getHeaders();

    int getHeadersCount();

    Map<String, String> getHeadersMap();

    String getHeadersOrDefault(String str, String str2);

    String getHeadersOrThrow(String str);

    String getHost();

    ByteString getHostBytes();

    String getId();

    ByteString getIdBytes();

    String getMethod();

    ByteString getMethodBytes();

    String getPath();

    ByteString getPathBytes();

    String getProtocol();

    ByteString getProtocolBytes();

    String getQuery();

    ByteString getQueryBytes();

    String getReason();

    ByteString getReasonBytes();

    String getScheme();

    ByteString getSchemeBytes();

    long getSize();

    Timestamp getTime();

    boolean hasAuth();

    boolean hasTime();
}
