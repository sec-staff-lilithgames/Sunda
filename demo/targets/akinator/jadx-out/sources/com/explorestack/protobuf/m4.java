package com.explorestack.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface m4 extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getLeadingComments();

    ByteString getLeadingCommentsBytes();

    String getLeadingDetachedComments(int i10);

    ByteString getLeadingDetachedCommentsBytes(int i10);

    int getLeadingDetachedCommentsCount();

    List<String> getLeadingDetachedCommentsList();

    int getPath(int i10);

    int getPathCount();

    List<Integer> getPathList();

    int getSpan(int i10);

    int getSpanCount();

    List<Integer> getSpanList();

    String getTrailingComments();

    ByteString getTrailingCommentsBytes();

    boolean hasLeadingComments();

    boolean hasTrailingComments();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
