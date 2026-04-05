package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.sdk.ContextualData;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ContextualDataOrBuilder extends MessageOrBuilder {
    ContextualData.ImpressionData getData();

    ContextualData.ImpressionDataOrBuilder getDataOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getMediatorName();

    ByteString getMediatorNameBytes();

    String getPlacement();

    ByteString getPlacementBytes();

    boolean hasData();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
