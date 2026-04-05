package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.jb;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface a extends MessageOrBuilder {
    String getAdomain(int i10);

    ByteString getAdomainBytes(int i10);

    int getAdomainCount();

    List<String> getAdomainList();

    Ad.Audit getAudit();

    Ad.AuditOrBuilder getAuditOrBuilder();

    String getBundle(int i10);

    ByteString getBundleBytes(int i10);

    int getBundleCount();

    List<String> getBundleList();

    String getCat(int i10);

    ByteString getCatBytes(int i10);

    int getCatCount();

    List<String> getCatList();

    CategoryTaxonomy getCattax();

    int getCattaxValue();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    Ad.Display getDisplay();

    Ad.DisplayOrBuilder getDisplayOrBuilder();

    Struct getExt();

    jb getExtOrBuilder();

    Any getExtProto(int i10);

    int getExtProtoCount();

    List<Any> getExtProtoList();

    com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

    List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

    String getId();

    ByteString getIdBytes();

    String getInit();

    ByteString getInitBytes();

    String getIurl();

    ByteString getIurlBytes();

    String getLang();

    ByteString getLangBytes();

    String getLastmod();

    ByteString getLastmodBytes();

    MediaRating getMrating();

    int getMratingValue();

    boolean getSecure();

    Ad.Video getVideo();

    Ad.VideoOrBuilder getVideoOrBuilder();

    boolean hasAudit();

    boolean hasDisplay();

    boolean hasExt();

    boolean hasVideo();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
