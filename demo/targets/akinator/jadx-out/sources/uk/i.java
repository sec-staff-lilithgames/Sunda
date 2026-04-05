package uk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface i extends MessageLiteOrBuilder {
    boolean containsMetadata(String str);

    String getDomain();

    ByteString getDomainBytes();

    @Deprecated
    Map<String, String> getMetadata();

    int getMetadataCount();

    Map<String, String> getMetadataMap();

    String getMetadataOrDefault(String str, String str2);

    String getMetadataOrThrow(String str);

    String getReason();

    ByteString getReasonBytes();
}
