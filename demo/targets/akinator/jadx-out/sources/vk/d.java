package vk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface d extends MessageLiteOrBuilder {
    boolean containsLabels(String str);

    String getIp();

    ByteString getIpBytes();

    @Deprecated
    Map<String, String> getLabels();

    int getLabelsCount();

    Map<String, String> getLabelsMap();

    String getLabelsOrDefault(String str, String str2);

    String getLabelsOrThrow(String str);

    long getPort();

    String getPrincipal();

    ByteString getPrincipalBytes();

    String getRegionCode();

    ByteString getRegionCodeBytes();
}
