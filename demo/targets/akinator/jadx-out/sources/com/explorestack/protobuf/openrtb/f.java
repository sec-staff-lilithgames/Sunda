package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.g;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.openrtb.Response;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface f extends MessageOrBuilder {
    String getBidid();

    ByteString getBididBytes();

    String getCdata();

    ByteString getCdataBytes();

    String getCur();

    ByteString getCurBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Struct getExt();

    jb getExtOrBuilder();

    Any getExtProto(int i10);

    int getExtProtoCount();

    List<Any> getExtProtoList();

    g getExtProtoOrBuilder(int i10);

    List<? extends g> getExtProtoOrBuilderList();

    String getId();

    ByteString getIdBytes();

    NoBidReason getNbr();

    int getNbrValue();

    Response.Seatbid getSeatbid(int i10);

    int getSeatbidCount();

    List<Response.Seatbid> getSeatbidList();

    Response.SeatbidOrBuilder getSeatbidOrBuilder(int i10);

    List<? extends Response.SeatbidOrBuilder> getSeatbidOrBuilderList();

    boolean hasExt();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
