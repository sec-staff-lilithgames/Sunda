package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.g;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.openrtb.Request;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface e extends MessageOrBuilder {
    int getAt();

    String getCdata();

    ByteString getCdataBytes();

    Any getContext();

    g getContextOrBuilder();

    String getCur(int i10);

    ByteString getCurBytes(int i10);

    int getCurCount();

    List<String> getCurList();

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

    Request.Item getItem(int i10);

    int getItemCount();

    List<Request.Item> getItemList();

    Request.ItemOrBuilder getItemOrBuilder(int i10);

    List<? extends Request.ItemOrBuilder> getItemOrBuilderList();

    int getPackage();

    String getSeat(int i10);

    ByteString getSeatBytes(int i10);

    int getSeatCount();

    List<String> getSeatList();

    Request.Source getSource();

    Request.SourceOrBuilder getSourceOrBuilder();

    boolean getTest();

    int getTmax();

    boolean getWseat();

    boolean hasContext();

    boolean hasExt();

    boolean hasSource();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
