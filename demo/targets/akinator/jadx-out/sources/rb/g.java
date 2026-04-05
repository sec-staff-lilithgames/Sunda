package rb;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.c3;
import com.explorestack.protobuf.d3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface g extends MessageOrBuilder {
    String getContent();

    ByteString getContentBytes();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    c3 getGeneratedCodeInfo();

    d3 getGeneratedCodeInfoOrBuilder();

    String getInsertionPoint();

    ByteString getInsertionPointBytes();

    String getName();

    ByteString getNameBytes();

    boolean hasContent();

    boolean hasGeneratedCodeInfo();

    boolean hasInsertionPoint();

    boolean hasName();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
