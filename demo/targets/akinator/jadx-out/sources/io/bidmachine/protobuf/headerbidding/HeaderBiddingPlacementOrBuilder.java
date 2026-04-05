package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface HeaderBiddingPlacementOrBuilder extends MessageOrBuilder {
    HeaderBiddingPlacement.AdUnit getAdUnits(int i10);

    int getAdUnitsCount();

    List<HeaderBiddingPlacement.AdUnit> getAdUnitsList();

    HeaderBiddingPlacement.AdUnitOrBuilder getAdUnitsOrBuilder(int i10);

    List<? extends HeaderBiddingPlacement.AdUnitOrBuilder> getAdUnitsOrBuilderList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
