package io.bidmachine.protobuf.analytics.events;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.ib;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.sb;
import io.bidmachine.protobuf.sdk.Error;
import io.bidmachine.protobuf.sdk.ErrorOrBuilder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface SDKEventOrBuilder extends MessageOrBuilder {
    int getAction();

    StringValue getAdType();

    ib getAdTypeOrBuilder();

    String getContext();

    ByteString getContextBytes();

    Struct getCustomParams();

    jb getCustomParamsOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Error getError();

    ErrorOrBuilder getErrorOrBuilder();

    Timestamp getFinishTime();

    sb getFinishTimeOrBuilder();

    StringValue getNetwork();

    ib getNetworkOrBuilder();

    double getPrice();

    Timestamp getStartTime();

    sb getStartTimeOrBuilder();

    boolean hasAdType();

    boolean hasCustomParams();

    boolean hasError();

    boolean hasFinishTime();

    boolean hasNetwork();

    boolean hasStartTime();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
