package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.AdNetwork;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface AdNetworkOrBuilder extends MessageOrBuilder {
    boolean containsCustomParams(String str);

    AdNetwork.AdUnit getAdUnits(int i10);

    int getAdUnitsCount();

    List<AdNetwork.AdUnit> getAdUnitsList();

    AdNetwork.AdUnitOrBuilder getAdUnitsOrBuilder(int i10);

    List<? extends AdNetwork.AdUnitOrBuilder> getAdUnitsOrBuilderList();

    String getClassName();

    ByteString getClassNameBytes();

    @Deprecated
    Map<String, String> getCustomParams();

    int getCustomParamsCount();

    Map<String, String> getCustomParamsMap();

    String getCustomParamsOrDefault(String str, String str2);

    String getCustomParamsOrThrow(String str);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getName();

    ByteString getNameBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
