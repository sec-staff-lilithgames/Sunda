package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface HeaderBiddingAdOrBuilder extends MessageOrBuilder {
    boolean containsClientParams(String str);

    boolean containsServerParams(String str);

    String getBidder();

    ByteString getBidderBytes();

    @Deprecated
    Map<String, String> getClientParams();

    int getClientParamsCount();

    Map<String, String> getClientParamsMap();

    String getClientParamsOrDefault(String str, String str2);

    String getClientParamsOrThrow(String str);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Deprecated
    Map<String, String> getServerParams();

    int getServerParamsCount();

    Map<String, String> getServerParamsMap();

    String getServerParamsOrDefault(String str, String str2);

    String getServerParamsOrThrow(String str);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
