package vk;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface f extends MessageLiteOrBuilder {
    boolean containsHeaders(String str);

    long getCode();

    @Deprecated
    Map<String, String> getHeaders();

    int getHeadersCount();

    Map<String, String> getHeadersMap();

    String getHeadersOrDefault(String str, String str2);

    String getHeadersOrThrow(String str);

    long getSize();

    Timestamp getTime();

    boolean hasTime();
}
