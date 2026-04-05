package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.g;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class Response extends k7 implements f {
    public static final int BIDID_FIELD_NUMBER = 2;
    public static final int CDATA_FIELD_NUMBER = 5;
    public static final int CUR_FIELD_NUMBER = 4;
    public static final int EXT_FIELD_NUMBER = 8;
    public static final int EXT_PROTO_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NBR_FIELD_NUMBER = 3;
    public static final int SEATBID_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private volatile Object bidid_;
    private volatile Object cdata_;
    private volatile Object cur_;
    private List<Any> extProto_;
    private Struct ext_;
    private volatile Object id_;
    private byte memoizedIsInitialized;
    private int nbr_;
    private List<Seatbid> seatbid_;
    private static final Response DEFAULT_INSTANCE = new Response();
    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Response.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Response parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Response(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Seatbid extends k7 implements SeatbidOrBuilder {
        public static final int BID_FIELD_NUMBER = 3;
        public static final int EXT_FIELD_NUMBER = 5;
        public static final int EXT_PROTO_FIELD_NUMBER = 4;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        public static final int SEAT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Bid> bid_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private boolean package_;
        private volatile Object seat_;
        private static final Seatbid DEFAULT_INSTANCE = new Seatbid();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Response.Seatbid.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Seatbid parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Seatbid(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Bid extends k7 implements BidOrBuilder {
            public static final int BURL_FIELD_NUMBER = 8;
            public static final int CID_FIELD_NUMBER = 5;
            public static final int DEAL_FIELD_NUMBER = 4;
            public static final int EXP_FIELD_NUMBER = 10;
            public static final int EXT_FIELD_NUMBER = 15;
            public static final int EXT_PROTO_FIELD_NUMBER = 14;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int ITEM_FIELD_NUMBER = 2;
            public static final int LURL_FIELD_NUMBER = 9;
            public static final int MACRO_FIELD_NUMBER = 12;
            public static final int MEDIA_FIELD_NUMBER = 13;
            public static final int MID_FIELD_NUMBER = 11;
            public static final int PRICE_FIELD_NUMBER = 3;
            public static final int PURL_FIELD_NUMBER = 7;
            public static final int TACTIC_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private volatile Object burl_;
            private volatile Object cid_;
            private volatile Object deal_;
            private int exp_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private volatile Object item_;
            private volatile Object lurl_;
            private List<Macro> macro_;
            private Any media_;
            private byte memoizedIsInitialized;
            private volatile Object mid_;
            private double price_;
            private volatile Object purl_;
            private volatile Object tactic_;
            private static final Bid DEFAULT_INSTANCE = new Bid();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Bid parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Bid(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Macro extends k7 implements MacroOrBuilder {
                public static final int EXT_FIELD_NUMBER = 4;
                public static final int EXT_PROTO_FIELD_NUMBER = 3;
                public static final int KEY_FIELD_NUMBER = 1;
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private List<Any> extProto_;
                private Struct ext_;
                private volatile Object key_;
                private byte memoizedIsInitialized;
                private volatile Object value_;
                private static final Macro DEFAULT_INSTANCE = new Macro();
                private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.1
                    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                    public Macro parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        return new Macro(yVar, m5Var);
                    }
                };

                public static Macro getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return d.f22461s;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Macro parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Macro) k7.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Macro parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(byteBuffer);
                }

                public static fa parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Macro)) {
                        return super.equals(obj);
                    }
                    Macro macro = (Macro) obj;
                    if (getKey().equals(macro.getKey()) && getValue().equals(macro.getValue()) && hasExt() == macro.hasExt()) {
                        return (!hasExt() || getExt().equals(macro.getExt())) && getExtProtoList().equals(macro.getExtProtoList()) && this.unknownFields.equals(macro.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public jb getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public g getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public String getKey() {
                    Object obj = this.key_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.key_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public ByteString getKeyBytes() {
                    Object obj = this.key_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.key_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public fa getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !getKeyBytes().isEmpty() ? k7.computeStringSize(1, this.key_) : 0;
                    if (!getValueBytes().isEmpty()) {
                        iComputeStringSize += k7.computeStringSize(2, this.value_);
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        iComputeStringSize += h0.computeMessageSize(3, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        iComputeStringSize += h0.computeMessageSize(4, getExt());
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                public final gc getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = getValue().hashCode() + ((((getKey().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                    if (hasExt()) {
                        iHashCode = o2.B(iHashCode, 37, 4, 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iHashCode = o2.B(iHashCode, 37, 3, 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.explorestack.protobuf.k7
                public i7 internalGetFieldAccessorTable() {
                    return d.f22462t.ensureFieldAccessorsInitialized(Macro.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.memoizedIsInitialized;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.memoizedIsInitialized = (byte) 1;
                    return true;
                }

                @Override // com.explorestack.protobuf.k7
                public Object newInstance(j7 j7Var) {
                    return new Macro();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(h0 h0Var) throws IOException {
                    if (!getKeyBytes().isEmpty()) {
                        k7.writeString(h0Var, 1, this.key_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        k7.writeString(h0Var, 2, this.value_);
                    }
                    for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                        h0Var.writeMessage(3, this.extProto_.get(i10));
                    }
                    if (this.ext_ != null) {
                        h0Var.writeMessage(4, getExt());
                    }
                    this.unknownFields.writeTo(h0Var);
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends o6 implements MacroOrBuilder {
                    private int bitField0_;
                    private xa extBuilder_;
                    private pa extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private Object key_;
                    private Object value_;

                    private Builder() {
                        super(null);
                        this.key_ = "";
                        this.value_ = "";
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return d.f22461s;
                    }

                    private xa getExtFieldBuilder() {
                        if (this.extBuilder_ == null) {
                            this.extBuilder_ = new xa(getExt(), getParentForChildren(), isClean());
                            this.ext_ = null;
                        }
                        return this.extBuilder_;
                    }

                    private pa getExtProtoFieldBuilder() {
                        if (this.extProtoBuilder_ == null) {
                            this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                            this.extProto_ = null;
                        }
                        return this.extProtoBuilder_;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (k7.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            paVar.addAllMessages(iterable);
                            return this;
                        }
                        ensureExtProtoIsMutable();
                        b.a.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any any) {
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            paVar.addMessage(any);
                            return this;
                        }
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                        return this;
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return (Any.Builder) getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                    }

                    public Builder clearExt() {
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                            onChanged();
                            return this;
                        }
                        this.ext_ = null;
                        this.extBuilder_ = null;
                        return this;
                    }

                    public Builder clearExtProto() {
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            paVar.clear();
                            return this;
                        }
                        this.extProto_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearKey() {
                        this.key_ = Macro.getDefaultInstance().getKey();
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = Macro.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return d.f22461s;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public Struct getExt() {
                        xa xaVar = this.extBuilder_;
                        if (xaVar != null) {
                            return (Struct) xaVar.getMessage();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    public Struct.Builder getExtBuilder() {
                        onChanged();
                        return (Struct.Builder) getExtFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public jb getExtOrBuilder() {
                        xa xaVar = this.extBuilder_;
                        if (xaVar != null) {
                            return (jb) xaVar.getMessageOrBuilder();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public Any getExtProto(int i10) {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.get(i10) : (Any) paVar.getMessage(i10);
                    }

                    public Any.Builder getExtProtoBuilder(int i10) {
                        return (Any.Builder) getExtProtoFieldBuilder().getBuilder(i10);
                    }

                    public List<Any.Builder> getExtProtoBuilderList() {
                        return getExtProtoFieldBuilder().getBuilderList();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public int getExtProtoCount() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.size() : paVar.getCount();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public List<Any> getExtProtoList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public g getExtProtoOrBuilder(int i10) {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.get(i10) : (g) paVar.getMessageOrBuilder(i10);
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public List<? extends g> getExtProtoOrBuilderList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public String getKey() {
                        Object obj = this.key_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.key_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public ByteString getKeyBytes() {
                        Object obj = this.key_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.key_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.MacroOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.o6
                    public i7 internalGetFieldAccessorTable() {
                        return d.f22462t.ensureFieldAccessorsInitialized(Macro.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeExt(Struct struct) {
                        xa xaVar = this.extBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(struct);
                            return this;
                        }
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.i(struct2, struct);
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder removeExtProto(int i10) {
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            paVar.remove(i10);
                            return this;
                        }
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i10);
                        onChanged();
                        return this;
                    }

                    public Builder setExt(Struct struct) {
                        xa xaVar = this.extBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(struct);
                            return this;
                        }
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                        return this;
                    }

                    public Builder setExtProto(int i10, Any any) {
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            paVar.setMessage(i10, any);
                            return this;
                        }
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, any);
                        onChanged();
                        return this;
                    }

                    public Builder setKey(String str) {
                        str.getClass();
                        this.key_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setKeyBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                        this.key_ = byteString;
                        onChanged();
                        return this;
                    }

                    public Builder setValue(String str) {
                        str.getClass();
                        this.value_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                        this.value_ = byteString;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Macro build() {
                        Macro macroBuildPartial = buildPartial();
                        if (macroBuildPartial.isInitialized()) {
                            return macroBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) macroBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Macro buildPartial() {
                        Macro macro = new Macro(this);
                        macro.key_ = this.key_;
                        macro.value_ = this.value_;
                        xa xaVar = this.extBuilder_;
                        if (xaVar == null) {
                            macro.ext_ = this.ext_;
                        } else {
                            macro.ext_ = (Struct) xaVar.build();
                        }
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            macro.extProto_ = paVar.build();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            macro.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return macro;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public Macro getDefaultInstanceForType() {
                        return Macro.getDefaultInstance();
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public final Builder setUnknownFields(gc gcVar) {
                        return (Builder) super.setUnknownFields(gcVar);
                    }

                    public Any.Builder addExtProtoBuilder(int i10) {
                        return (Any.Builder) getExtProtoFieldBuilder().addBuilder(i10, Any.getDefaultInstance());
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (Builder) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public final Builder mergeUnknownFields(gc gcVar) {
                        return (Builder) super.mergeUnknownFields(gcVar);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder clear() {
                        super.clear();
                        this.key_ = "";
                        this.value_ = "";
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        pa paVar = this.extProtoBuilder_;
                        if (paVar == null) {
                            this.extProto_ = Collections.EMPTY_LIST;
                            this.bitField0_ &= -2;
                            return this;
                        }
                        paVar.clear();
                        return this;
                    }

                    public Builder setExt(Struct.Builder builder) {
                        xa xaVar = this.extBuilder_;
                        if (xaVar == null) {
                            this.ext_ = builder.build();
                            onChanged();
                            return this;
                        }
                        xaVar.setMessage(builder.build());
                        return this;
                    }

                    public Builder addExtProto(int i10, Any any) {
                        pa paVar = this.extProtoBuilder_;
                        if (paVar == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i10, any);
                            onChanged();
                            return this;
                        }
                        paVar.addMessage(i10, any);
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                    /* renamed from: clone */
                    public Builder mo500clone() {
                        return (Builder) super.mo500clone();
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(Message message) {
                        if (message instanceof Macro) {
                            return mergeFrom((Macro) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder setExtProto(int i10, Any.Builder builder) {
                        pa paVar = this.extProtoBuilder_;
                        if (paVar == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i10, builder.build());
                            onChanged();
                            return this;
                        }
                        paVar.setMessage(i10, builder.build());
                        return this;
                    }

                    private Builder(p6 p6Var) {
                        super(p6Var);
                        this.key_ = "";
                        this.value_ = "";
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    public Builder mergeFrom(Macro macro) {
                        if (macro == Macro.getDefaultInstance()) {
                            return this;
                        }
                        if (!macro.getKey().isEmpty()) {
                            this.key_ = macro.key_;
                            onChanged();
                        }
                        if (!macro.getValue().isEmpty()) {
                            this.value_ = macro.value_;
                            onChanged();
                        }
                        if (macro.hasExt()) {
                            mergeExt(macro.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!macro.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = macro.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(macro.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!macro.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.addAllMessages(macro.extProto_);
                            } else {
                                this.extProtoBuilder_.dispose();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = macro.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((k7) macro).unknownFields);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any.Builder builder) {
                        pa paVar = this.extProtoBuilder_;
                        if (paVar == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                            return this;
                        }
                        paVar.addMessage(builder.build());
                        return this;
                    }

                    public Builder addExtProto(int i10, Any.Builder builder) {
                        pa paVar = this.extProtoBuilder_;
                        if (paVar == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i10, builder.build());
                            onChanged();
                            return this;
                        }
                        paVar.addMessage(i10, builder.build());
                        return this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Macro r3 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            if (r3 == 0) goto L10
                            r2.mergeFrom(r3)
                        L10:
                            return r2
                        L11:
                            r3 = move-exception
                            goto L21
                        L13:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                            com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Macro r4 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro) r4     // Catch: java.lang.Throwable -> L11
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                            throw r3     // Catch: java.lang.Throwable -> L1f
                        L1f:
                            r3 = move-exception
                            r0 = r4
                        L21:
                            if (r0 == 0) goto L26
                            r2.mergeFrom(r0)
                        L26:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Macro$Builder");
                    }
                }

                public static Builder newBuilder(Macro macro) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(macro);
                }

                public static Macro parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(byteBuffer, m5Var);
                }

                private Macro(o6 o6Var) {
                    super(o6Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Macro parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Macro) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                }

                public static Macro parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Macro getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Macro parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(byteString, m5Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Macro() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.key_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static Macro parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(bArr);
                }

                @Override // com.explorestack.protobuf.k7
                public Builder newBuilderForType(p6 p6Var) {
                    return new Builder(p6Var);
                }

                public static Macro parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Macro) PARSER.parseFrom(bArr, m5Var);
                }

                public static Macro parseFrom(InputStream inputStream) throws IOException {
                    return (Macro) k7.parseWithIOException(PARSER, inputStream);
                }

                public static Macro parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Macro) k7.parseWithIOException(PARSER, inputStream, m5Var);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private Macro(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    this();
                    m5Var.getClass();
                    cc ccVarNewBuilder = gc.newBuilder();
                    boolean z10 = false;
                    boolean z11 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = yVar.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.key_ = yVar.readStringRequireUtf8();
                                    } else if (tag == 18) {
                                        this.value_ = yVar.readStringRequireUtf8();
                                    } else if (tag == 26) {
                                        if (!z11) {
                                            this.extProto_ = new ArrayList();
                                            z11 = true;
                                        }
                                        this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                    } else if (tag != 34) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        Struct struct = this.ext_;
                                        Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                        this.ext_ = struct2;
                                        if (builder != null) {
                                            builder.mergeFrom(struct2);
                                            this.ext_ = builder.buildPartial();
                                        }
                                    }
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.setUnfinishedMessage(this);
                            } catch (IOException e11) {
                                throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                            }
                        } catch (Throwable th2) {
                            if (z11) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = ccVarNewBuilder.build();
                            makeExtensionsImmutable();
                            throw th2;
                        }
                    }
                    if (z11) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                }

                public static Macro parseFrom(y yVar) throws IOException {
                    return (Macro) k7.parseWithIOException(PARSER, yVar);
                }

                public static Macro parseFrom(y yVar, m5 m5Var) throws IOException {
                    return (Macro) k7.parseWithIOException(PARSER, yVar, m5Var);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public interface MacroOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ MessageLite getDefaultInstanceForType();

                Struct getExt();

                jb getExtOrBuilder();

                Any getExtProto(int i10);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                g getExtProtoOrBuilder(int i10);

                List<? extends g> getExtProtoOrBuilderList();

                String getKey();

                ByteString getKeyBytes();

                String getValue();

                ByteString getValueBytes();

                boolean hasExt();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static Bid getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return d.f22459q;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Bid parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Bid) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Bid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Bid)) {
                    return super.equals(obj);
                }
                Bid bid = (Bid) obj;
                if (!getId().equals(bid.getId()) || !getItem().equals(bid.getItem()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(bid.getPrice()) || !getDeal().equals(bid.getDeal()) || !getCid().equals(bid.getCid()) || !getTactic().equals(bid.getTactic()) || !getPurl().equals(bid.getPurl()) || !getBurl().equals(bid.getBurl()) || !getLurl().equals(bid.getLurl()) || getExp() != bid.getExp() || !getMid().equals(bid.getMid()) || !getMacroList().equals(bid.getMacroList()) || hasMedia() != bid.hasMedia()) {
                    return false;
                }
                if ((!hasMedia() || getMedia().equals(bid.getMedia())) && hasExt() == bid.hasExt()) {
                    return (!hasExt() || getExt().equals(bid.getExt())) && getExtProtoList().equals(bid.getExtProtoList()) && this.unknownFields.equals(bid.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getBurl() {
                Object obj = this.burl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.burl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getBurlBytes() {
                Object obj = this.burl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.burl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getCid() {
                Object obj = this.cid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getCidBytes() {
                Object obj = this.cid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getDeal() {
                Object obj = this.deal_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.deal_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getDealBytes() {
                Object obj = this.deal_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deal_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public int getExp() {
                return this.exp_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getItem() {
                Object obj = this.item_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.item_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getItemBytes() {
                Object obj = this.item_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.item_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getLurl() {
                Object obj = this.lurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lurl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getLurlBytes() {
                Object obj = this.lurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lurl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Macro getMacro(int i10) {
                return this.macro_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public int getMacroCount() {
                return this.macro_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<Macro> getMacroList() {
                return this.macro_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public MacroOrBuilder getMacroOrBuilder(int i10) {
                return this.macro_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public List<? extends MacroOrBuilder> getMacroOrBuilderList() {
                return this.macro_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public Any getMedia() {
                Any any = this.media_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public g getMediaOrBuilder() {
                return getMedia();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getMid() {
                Object obj = this.mid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getMidBytes() {
                Object obj = this.mid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public double getPrice() {
                return this.price_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getPurl() {
                Object obj = this.purl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.purl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getPurlBytes() {
                Object obj = this.purl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.purl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
                if (!getItemBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(2, this.item_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    iComputeStringSize += h0.computeDoubleSize(3, d10);
                }
                if (!getDealBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(4, this.deal_);
                }
                if (!getCidBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(5, this.cid_);
                }
                if (!getTacticBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(6, this.tactic_);
                }
                if (!getPurlBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(7, this.purl_);
                }
                if (!getBurlBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(8, this.burl_);
                }
                if (!getLurlBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(9, this.lurl_);
                }
                int i11 = this.exp_;
                if (i11 != 0) {
                    iComputeStringSize += h0.computeUInt32Size(10, i11);
                }
                if (!getMidBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(11, this.mid_);
                }
                for (int i12 = 0; i12 < this.macro_.size(); i12++) {
                    iComputeStringSize += h0.computeMessageSize(12, this.macro_.get(i12));
                }
                if (this.media_ != null) {
                    iComputeStringSize += h0.computeMessageSize(13, getMedia());
                }
                for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                    iComputeStringSize += h0.computeMessageSize(14, this.extProto_.get(i13));
                }
                if (this.ext_ != null) {
                    iComputeStringSize += h0.computeMessageSize(15, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public String getTactic() {
                Object obj = this.tactic_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tactic_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public ByteString getTacticBytes() {
                Object obj = this.tactic_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tactic_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
            public boolean hasMedia() {
                return this.media_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getMid().hashCode() + ((((getExp() + ((((getLurl().hashCode() + ((((getBurl().hashCode() + ((((getPurl().hashCode() + ((((getTactic().hashCode() + ((((getCid().hashCode() + ((((getDeal().hashCode() + ((((x7.hashLong(Double.doubleToLongBits(getPrice())) + ((((getItem().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53);
                if (getMacroCount() > 0) {
                    iHashCode = getMacroList().hashCode() + o2.B(iHashCode, 37, 12, 53);
                }
                if (hasMedia()) {
                    iHashCode = getMedia().hashCode() + o2.B(iHashCode, 37, 13, 53);
                }
                if (hasExt()) {
                    iHashCode = getExt().hashCode() + o2.B(iHashCode, 37, 15, 53);
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = getExtProtoList().hashCode() + o2.B(iHashCode, 37, 14, 53);
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return d.f22460r.ensureFieldAccessorsInitialized(Bid.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.memoizedIsInitialized;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.explorestack.protobuf.k7
            public Object newInstance(j7 j7Var) {
                return new Bid();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.id_);
                }
                if (!getItemBytes().isEmpty()) {
                    k7.writeString(h0Var, 2, this.item_);
                }
                double d10 = this.price_;
                if (d10 != 0.0d) {
                    h0Var.writeDouble(3, d10);
                }
                if (!getDealBytes().isEmpty()) {
                    k7.writeString(h0Var, 4, this.deal_);
                }
                if (!getCidBytes().isEmpty()) {
                    k7.writeString(h0Var, 5, this.cid_);
                }
                if (!getTacticBytes().isEmpty()) {
                    k7.writeString(h0Var, 6, this.tactic_);
                }
                if (!getPurlBytes().isEmpty()) {
                    k7.writeString(h0Var, 7, this.purl_);
                }
                if (!getBurlBytes().isEmpty()) {
                    k7.writeString(h0Var, 8, this.burl_);
                }
                if (!getLurlBytes().isEmpty()) {
                    k7.writeString(h0Var, 9, this.lurl_);
                }
                int i10 = this.exp_;
                if (i10 != 0) {
                    h0Var.writeUInt32(10, i10);
                }
                if (!getMidBytes().isEmpty()) {
                    k7.writeString(h0Var, 11, this.mid_);
                }
                for (int i11 = 0; i11 < this.macro_.size(); i11++) {
                    h0Var.writeMessage(12, this.macro_.get(i11));
                }
                if (this.media_ != null) {
                    h0Var.writeMessage(13, getMedia());
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    h0Var.writeMessage(14, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    h0Var.writeMessage(15, getExt());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements BidOrBuilder {
                private int bitField0_;
                private Object burl_;
                private Object cid_;
                private Object deal_;
                private int exp_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object item_;
                private Object lurl_;
                private pa macroBuilder_;
                private List<Macro> macro_;
                private xa mediaBuilder_;
                private Any media_;
                private Object mid_;
                private double price_;
                private Object purl_;
                private Object tactic_;

                private Builder() {
                    super(null);
                    this.id_ = "";
                    this.item_ = "";
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.mid_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.macro_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureMacroIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.macro_ = new ArrayList(this.macro_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return d.f22459q;
                }

                private xa getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new xa(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private pa getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private pa getMacroFieldBuilder() {
                    if (this.macroBuilder_ == null) {
                        this.macroBuilder_ = new pa(this.macro_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.macro_ = null;
                    }
                    return this.macroBuilder_;
                }

                private xa getMediaFieldBuilder() {
                    if (this.mediaBuilder_ == null) {
                        this.mediaBuilder_ = new xa(getMedia(), getParentForChildren(), isClean());
                        this.media_ = null;
                    }
                    return this.mediaBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (k7.alwaysUseFieldBuilders) {
                        getMacroFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                    return this;
                }

                public Builder addAllMacro(Iterable<? extends Macro> iterable) {
                    pa paVar = this.macroBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureMacroIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.macro_);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any any) {
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(any);
                        return this;
                    }
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                }

                public Builder addMacro(Macro macro) {
                    pa paVar = this.macroBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(macro);
                        return this;
                    }
                    macro.getClass();
                    ensureMacroIsMutable();
                    this.macro_.add(macro);
                    onChanged();
                    return this;
                }

                public Macro.Builder addMacroBuilder() {
                    return (Macro.Builder) getMacroFieldBuilder().addBuilder(Macro.getDefaultInstance());
                }

                public Builder clearBurl() {
                    this.burl_ = Bid.getDefaultInstance().getBurl();
                    onChanged();
                    return this;
                }

                public Builder clearCid() {
                    this.cid_ = Bid.getDefaultInstance().getCid();
                    onChanged();
                    return this;
                }

                public Builder clearDeal() {
                    this.deal_ = Bid.getDefaultInstance().getDeal();
                    onChanged();
                    return this;
                }

                public Builder clearExp() {
                    this.exp_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                        return this;
                    }
                    this.ext_ = null;
                    this.extBuilder_ = null;
                    return this;
                }

                public Builder clearExtProto() {
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Bid.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearItem() {
                    this.item_ = Bid.getDefaultInstance().getItem();
                    onChanged();
                    return this;
                }

                public Builder clearLurl() {
                    this.lurl_ = Bid.getDefaultInstance().getLurl();
                    onChanged();
                    return this;
                }

                public Builder clearMacro() {
                    pa paVar = this.macroBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.macro_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearMedia() {
                    if (this.mediaBuilder_ == null) {
                        this.media_ = null;
                        onChanged();
                        return this;
                    }
                    this.media_ = null;
                    this.mediaBuilder_ = null;
                    return this;
                }

                public Builder clearMid() {
                    this.mid_ = Bid.getDefaultInstance().getMid();
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearPurl() {
                    this.purl_ = Bid.getDefaultInstance().getPurl();
                    onChanged();
                    return this;
                }

                public Builder clearTactic() {
                    this.tactic_ = Bid.getDefaultInstance().getTactic();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getBurl() {
                    Object obj = this.burl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.burl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getBurlBytes() {
                    Object obj = this.burl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.burl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getCid() {
                    Object obj = this.cid_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.cid_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getCidBytes() {
                    Object obj = this.cid_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.cid_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getDeal() {
                    Object obj = this.deal_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.deal_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getDealBytes() {
                    Object obj = this.deal_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.deal_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return d.f22459q;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public int getExp() {
                    return this.exp_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Struct getExt() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (Struct) xaVar.getMessage();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().getBuilder();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Any getExtProto(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (Any) paVar.getMessage(i10);
                }

                public Any.Builder getExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().getBuilder(i10);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().getBuilderList();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getItem() {
                    Object obj = this.item_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.item_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getItemBytes() {
                    Object obj = this.item_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.item_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getLurl() {
                    Object obj = this.lurl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lurl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getLurlBytes() {
                    Object obj = this.lurl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lurl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Macro getMacro(int i10) {
                    pa paVar = this.macroBuilder_;
                    return paVar == null ? this.macro_.get(i10) : (Macro) paVar.getMessage(i10);
                }

                public Macro.Builder getMacroBuilder(int i10) {
                    return (Macro.Builder) getMacroFieldBuilder().getBuilder(i10);
                }

                public List<Macro.Builder> getMacroBuilderList() {
                    return getMacroFieldBuilder().getBuilderList();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public int getMacroCount() {
                    pa paVar = this.macroBuilder_;
                    return paVar == null ? this.macro_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<Macro> getMacroList() {
                    pa paVar = this.macroBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.macro_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public MacroOrBuilder getMacroOrBuilder(int i10) {
                    pa paVar = this.macroBuilder_;
                    return paVar == null ? this.macro_.get(i10) : (MacroOrBuilder) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public List<? extends MacroOrBuilder> getMacroOrBuilderList() {
                    pa paVar = this.macroBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.macro_);
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public Any getMedia() {
                    xa xaVar = this.mediaBuilder_;
                    if (xaVar != null) {
                        return (Any) xaVar.getMessage();
                    }
                    Any any = this.media_;
                    return any == null ? Any.getDefaultInstance() : any;
                }

                public Any.Builder getMediaBuilder() {
                    onChanged();
                    return (Any.Builder) getMediaFieldBuilder().getBuilder();
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public g getMediaOrBuilder() {
                    xa xaVar = this.mediaBuilder_;
                    if (xaVar != null) {
                        return (g) xaVar.getMessageOrBuilder();
                    }
                    Any any = this.media_;
                    return any == null ? Any.getDefaultInstance() : any;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getMid() {
                    Object obj = this.mid_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.mid_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getMidBytes() {
                    Object obj = this.mid_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.mid_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public double getPrice() {
                    return this.price_;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getPurl() {
                    Object obj = this.purl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.purl_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getPurlBytes() {
                    Object obj = this.purl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.purl_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public String getTactic() {
                    Object obj = this.tactic_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.tactic_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public ByteString getTacticBytes() {
                    Object obj = this.tactic_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.tactic_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.openrtb.Response.Seatbid.BidOrBuilder
                public boolean hasMedia() {
                    return (this.mediaBuilder_ == null && this.media_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return d.f22460r.ensureFieldAccessorsInitialized(Bid.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeExt(Struct struct) {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(struct);
                        return this;
                    }
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.i(struct2, struct);
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                    return this;
                }

                public Builder mergeMedia(Any any) {
                    xa xaVar = this.mediaBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(any);
                        return this;
                    }
                    Any any2 = this.media_;
                    if (any2 != null) {
                        this.media_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                    } else {
                        this.media_ = any;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeExtProto(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder removeMacro(int i10) {
                    pa paVar = this.macroBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureMacroIsMutable();
                    this.macro_.remove(i10);
                    onChanged();
                    return this;
                }

                public Builder setBurl(String str) {
                    str.getClass();
                    this.burl_ = str;
                    onChanged();
                    return this;
                }

                public Builder setBurlBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.burl_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setCid(String str) {
                    str.getClass();
                    this.cid_ = str;
                    onChanged();
                    return this;
                }

                public Builder setCidBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.cid_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setDeal(String str) {
                    str.getClass();
                    this.deal_ = str;
                    onChanged();
                    return this;
                }

                public Builder setDealBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.deal_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setExp(int i10) {
                    this.exp_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setExt(Struct struct) {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(struct);
                        return this;
                    }
                    struct.getClass();
                    this.ext_ = struct;
                    onChanged();
                    return this;
                }

                public Builder setExtProto(int i10, Any any) {
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, any);
                        return this;
                    }
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, any);
                    onChanged();
                    return this;
                }

                public Builder setId(String str) {
                    str.getClass();
                    this.id_ = str;
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setItem(String str) {
                    str.getClass();
                    this.item_ = str;
                    onChanged();
                    return this;
                }

                public Builder setItemBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.item_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLurl(String str) {
                    str.getClass();
                    this.lurl_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLurlBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.lurl_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setMacro(int i10, Macro macro) {
                    pa paVar = this.macroBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, macro);
                        return this;
                    }
                    macro.getClass();
                    ensureMacroIsMutable();
                    this.macro_.set(i10, macro);
                    onChanged();
                    return this;
                }

                public Builder setMedia(Any any) {
                    xa xaVar = this.mediaBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(any);
                        return this;
                    }
                    any.getClass();
                    this.media_ = any;
                    onChanged();
                    return this;
                }

                public Builder setMid(String str) {
                    str.getClass();
                    this.mid_ = str;
                    onChanged();
                    return this;
                }

                public Builder setMidBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.mid_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setPrice(double d10) {
                    this.price_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setPurl(String str) {
                    str.getClass();
                    this.purl_ = str;
                    onChanged();
                    return this;
                }

                public Builder setPurlBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.purl_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setTactic(String str) {
                    str.getClass();
                    this.tactic_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTacticBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.tactic_ = byteString;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Bid build() {
                    Bid bidBuildPartial = buildPartial();
                    if (bidBuildPartial.isInitialized()) {
                        return bidBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) bidBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Bid buildPartial() {
                    Bid bid = new Bid(this);
                    bid.id_ = this.id_;
                    bid.item_ = this.item_;
                    bid.price_ = this.price_;
                    bid.deal_ = this.deal_;
                    bid.cid_ = this.cid_;
                    bid.tactic_ = this.tactic_;
                    bid.purl_ = this.purl_;
                    bid.burl_ = this.burl_;
                    bid.lurl_ = this.lurl_;
                    bid.exp_ = this.exp_;
                    bid.mid_ = this.mid_;
                    pa paVar = this.macroBuilder_;
                    if (paVar != null) {
                        bid.macro_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.macro_ = Collections.unmodifiableList(this.macro_);
                            this.bitField0_ &= -2;
                        }
                        bid.macro_ = this.macro_;
                    }
                    xa xaVar = this.mediaBuilder_;
                    if (xaVar == null) {
                        bid.media_ = this.media_;
                    } else {
                        bid.media_ = (Any) xaVar.build();
                    }
                    xa xaVar2 = this.extBuilder_;
                    if (xaVar2 == null) {
                        bid.ext_ = this.ext_;
                    } else {
                        bid.ext_ = (Struct) xaVar2.build();
                    }
                    pa paVar2 = this.extProtoBuilder_;
                    if (paVar2 != null) {
                        bid.extProto_ = paVar2.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        bid.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return bid;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Bid getDefaultInstanceForType() {
                    return Bid.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public final Builder setUnknownFields(gc gcVar) {
                    return (Builder) super.setUnknownFields(gcVar);
                }

                public Any.Builder addExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().addBuilder(i10, Any.getDefaultInstance());
                }

                public Macro.Builder addMacroBuilder(int i10) {
                    return (Macro.Builder) getMacroFieldBuilder().addBuilder(i10, Macro.getDefaultInstance());
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public final Builder mergeUnknownFields(gc gcVar) {
                    return (Builder) super.mergeUnknownFields(gcVar);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.item_ = "";
                    this.price_ = 0.0d;
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.exp_ = 0;
                    this.mid_ = "";
                    pa paVar = this.macroBuilder_;
                    if (paVar == null) {
                        this.macro_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -2;
                    } else {
                        paVar.clear();
                    }
                    if (this.mediaBuilder_ == null) {
                        this.media_ = null;
                    } else {
                        this.media_ = null;
                        this.mediaBuilder_ = null;
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    pa paVar2 = this.extProtoBuilder_;
                    if (paVar2 == null) {
                        this.extProto_ = Collections.EMPTY_LIST;
                        this.bitField0_ &= -3;
                        return this;
                    }
                    paVar2.clear();
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    xa xaVar = this.extBuilder_;
                    if (xaVar == null) {
                        this.ext_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder setMedia(Any.Builder builder) {
                    xa xaVar = this.mediaBuilder_;
                    if (xaVar == null) {
                        this.media_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder addExtProto(int i10, Any any) {
                    pa paVar = this.extProtoBuilder_;
                    if (paVar == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, any);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, any);
                    return this;
                }

                public Builder addMacro(int i10, Macro macro) {
                    pa paVar = this.macroBuilder_;
                    if (paVar == null) {
                        macro.getClass();
                        ensureMacroIsMutable();
                        this.macro_.add(i10, macro);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, macro);
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Bid) {
                        return mergeFrom((Bid) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setExtProto(int i10, Any.Builder builder) {
                    pa paVar = this.extProtoBuilder_;
                    if (paVar == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.setMessage(i10, builder.build());
                    return this;
                }

                public Builder setMacro(int i10, Macro.Builder builder) {
                    pa paVar = this.macroBuilder_;
                    if (paVar == null) {
                        ensureMacroIsMutable();
                        this.macro_.set(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.setMessage(i10, builder.build());
                    return this;
                }

                public Builder mergeFrom(Bid bid) {
                    if (bid == Bid.getDefaultInstance()) {
                        return this;
                    }
                    if (!bid.getId().isEmpty()) {
                        this.id_ = bid.id_;
                        onChanged();
                    }
                    if (!bid.getItem().isEmpty()) {
                        this.item_ = bid.item_;
                        onChanged();
                    }
                    if (bid.getPrice() != 0.0d) {
                        setPrice(bid.getPrice());
                    }
                    if (!bid.getDeal().isEmpty()) {
                        this.deal_ = bid.deal_;
                        onChanged();
                    }
                    if (!bid.getCid().isEmpty()) {
                        this.cid_ = bid.cid_;
                        onChanged();
                    }
                    if (!bid.getTactic().isEmpty()) {
                        this.tactic_ = bid.tactic_;
                        onChanged();
                    }
                    if (!bid.getPurl().isEmpty()) {
                        this.purl_ = bid.purl_;
                        onChanged();
                    }
                    if (!bid.getBurl().isEmpty()) {
                        this.burl_ = bid.burl_;
                        onChanged();
                    }
                    if (!bid.getLurl().isEmpty()) {
                        this.lurl_ = bid.lurl_;
                        onChanged();
                    }
                    if (bid.getExp() != 0) {
                        setExp(bid.getExp());
                    }
                    if (!bid.getMid().isEmpty()) {
                        this.mid_ = bid.mid_;
                        onChanged();
                    }
                    if (this.macroBuilder_ == null) {
                        if (!bid.macro_.isEmpty()) {
                            if (this.macro_.isEmpty()) {
                                this.macro_ = bid.macro_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureMacroIsMutable();
                                this.macro_.addAll(bid.macro_);
                            }
                            onChanged();
                        }
                    } else if (!bid.macro_.isEmpty()) {
                        if (!this.macroBuilder_.isEmpty()) {
                            this.macroBuilder_.addAllMessages(bid.macro_);
                        } else {
                            this.macroBuilder_.dispose();
                            this.macroBuilder_ = null;
                            this.macro_ = bid.macro_;
                            this.bitField0_ &= -2;
                            this.macroBuilder_ = k7.alwaysUseFieldBuilders ? getMacroFieldBuilder() : null;
                        }
                    }
                    if (bid.hasMedia()) {
                        mergeMedia(bid.getMedia());
                    }
                    if (bid.hasExt()) {
                        mergeExt(bid.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!bid.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = bid.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(bid.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!bid.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(bid.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = bid.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) bid).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    pa paVar = this.extProtoBuilder_;
                    if (paVar == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(builder.build());
                    return this;
                }

                public Builder addMacro(Macro.Builder builder) {
                    pa paVar = this.macroBuilder_;
                    if (paVar == null) {
                        ensureMacroIsMutable();
                        this.macro_.add(builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(builder.build());
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.id_ = "";
                    this.item_ = "";
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.mid_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.macro_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder addExtProto(int i10, Any.Builder builder) {
                    pa paVar = this.extProtoBuilder_;
                    if (paVar == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, builder.build());
                    return this;
                }

                public Builder addMacro(int i10, Macro.Builder builder) {
                    pa paVar = this.macroBuilder_;
                    if (paVar == null) {
                        ensureMacroIsMutable();
                        this.macro_.add(i10, builder.build());
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, builder.build());
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.access$3600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.openrtb.Response$Seatbid$Bid r3 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        if (r3 == 0) goto L10
                        r2.mergeFrom(r3)
                    L10:
                        return r2
                    L11:
                        r3 = move-exception
                        goto L21
                    L13:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                        com.explorestack.protobuf.openrtb.Response$Seatbid$Bid r4 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid) r4     // Catch: java.lang.Throwable -> L11
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                        throw r3     // Catch: java.lang.Throwable -> L1f
                    L1f:
                        r3 = move-exception
                        r0 = r4
                    L21:
                        if (r0 == 0) goto L26
                        r2.mergeFrom(r0)
                    L26:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Builder");
                }
            }

            public static Builder newBuilder(Bid bid) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(bid);
            }

            public static Bid parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Bid(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Bid parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Bid) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Bid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Bid getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Bid parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Bid() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.item_ = "";
                this.deal_ = "";
                this.cid_ = "";
                this.tactic_ = "";
                this.purl_ = "";
                this.burl_ = "";
                this.lurl_ = "";
                this.mid_ = "";
                List list = Collections.EMPTY_LIST;
                this.macro_ = list;
                this.extProto_ = list;
            }

            public static Bid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Bid parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Bid) PARSER.parseFrom(bArr, m5Var);
            }

            public static Bid parseFrom(InputStream inputStream) throws IOException {
                return (Bid) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Bid parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Bid) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Bid parseFrom(y yVar) throws IOException {
                return (Bid) k7.parseWithIOException(PARSER, yVar);
            }

            public static Bid parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Bid) k7.parseWithIOException(PARSER, yVar, m5Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v5 */
            private Bid(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                char c10 = 0;
                while (!z10) {
                    try {
                        try {
                            int tag = yVar.readTag();
                            switch (tag) {
                                case 0:
                                    z10 = true;
                                case 10:
                                    this.id_ = yVar.readStringRequireUtf8();
                                case 18:
                                    this.item_ = yVar.readStringRequireUtf8();
                                case 25:
                                    this.price_ = yVar.readDouble();
                                case 34:
                                    this.deal_ = yVar.readStringRequireUtf8();
                                case 42:
                                    this.cid_ = yVar.readStringRequireUtf8();
                                case 50:
                                    this.tactic_ = yVar.readStringRequireUtf8();
                                case 58:
                                    this.purl_ = yVar.readStringRequireUtf8();
                                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                    this.burl_ = yVar.readStringRequireUtf8();
                                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                    this.lurl_ = yVar.readStringRequireUtf8();
                                case 80:
                                    this.exp_ = yVar.readUInt32();
                                case 90:
                                    this.mid_ = yVar.readStringRequireUtf8();
                                case 98:
                                    int i10 = (c10 == true ? 1 : 0) & 1;
                                    c10 = c10;
                                    if (i10 == 0) {
                                        this.macro_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 1;
                                    }
                                    this.macro_.add(yVar.readMessage(Macro.parser(), m5Var));
                                case 106:
                                    Any any = this.media_;
                                    Any.Builder builder = any != null ? any.toBuilder() : null;
                                    Any any2 = (Any) yVar.readMessage(Any.parser(), m5Var);
                                    this.media_ = any2;
                                    if (builder != null) {
                                        builder.mergeFrom(any2);
                                        this.media_ = builder.buildPartial();
                                    }
                                case 114:
                                    int i11 = (c10 == true ? 1 : 0) & 2;
                                    c10 = c10;
                                    if (i11 == 0) {
                                        this.extProto_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 2;
                                    }
                                    this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                case INVALID_ADS_ENDPOINT_VALUE:
                                    Struct struct = this.ext_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                    this.ext_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.ext_ = builder2.buildPartial();
                                    }
                                default:
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        z10 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if (((c10 == true ? 1 : 0) & 1) != 0) {
                            this.macro_ = Collections.unmodifiableList(this.macro_);
                        }
                        if (((c10 == true ? 1 : 0) & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (((c10 == true ? 1 : 0) & 1) != 0) {
                    this.macro_ = Collections.unmodifiableList(this.macro_);
                }
                if (((c10 == true ? 1 : 0) & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface BidOrBuilder extends MessageOrBuilder {
            String getBurl();

            ByteString getBurlBytes();

            String getCid();

            ByteString getCidBytes();

            String getDeal();

            ByteString getDealBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            int getExp();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            g getExtProtoOrBuilder(int i10);

            List<? extends g> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getItem();

            ByteString getItemBytes();

            String getLurl();

            ByteString getLurlBytes();

            Bid.Macro getMacro(int i10);

            int getMacroCount();

            List<Bid.Macro> getMacroList();

            Bid.MacroOrBuilder getMacroOrBuilder(int i10);

            List<? extends Bid.MacroOrBuilder> getMacroOrBuilderList();

            Any getMedia();

            g getMediaOrBuilder();

            String getMid();

            ByteString getMidBytes();

            double getPrice();

            String getPurl();

            ByteString getPurlBytes();

            String getTactic();

            ByteString getTacticBytes();

            boolean hasExt();

            boolean hasMedia();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Seatbid getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return d.f22457o;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Seatbid parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Seatbid) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Seatbid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Seatbid)) {
                return super.equals(obj);
            }
            Seatbid seatbid = (Seatbid) obj;
            if (getSeat().equals(seatbid.getSeat()) && getPackage() == seatbid.getPackage() && getBidList().equals(seatbid.getBidList()) && hasExt() == seatbid.hasExt()) {
                return (!hasExt() || getExt().equals(seatbid.getExt())) && getExtProtoList().equals(seatbid.getExtProtoList()) && this.unknownFields.equals(seatbid.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public Bid getBid(int i10) {
            return this.bid_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public int getBidCount() {
            return this.bid_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<Bid> getBidList() {
            return this.bid_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public BidOrBuilder getBidOrBuilder(int i10) {
            return this.bid_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<? extends BidOrBuilder> getBidOrBuilderList() {
            return this.bid_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public boolean getPackage() {
            return this.package_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public String getSeat() {
            Object obj = this.seat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.seat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public ByteString getSeatBytes() {
            Object obj = this.seat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.seat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getSeatBytes().isEmpty() ? k7.computeStringSize(1, this.seat_) : 0;
            boolean z10 = this.package_;
            if (z10) {
                iComputeStringSize += h0.computeBoolSize(2, z10);
            }
            for (int i11 = 0; i11 < this.bid_.size(); i11++) {
                iComputeStringSize += h0.computeMessageSize(3, this.bid_.get(i11));
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                iComputeStringSize += h0.computeMessageSize(4, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                iComputeStringSize += h0.computeMessageSize(5, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashBoolean = x7.hashBoolean(getPackage()) + ((((getSeat().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
            if (getBidCount() > 0) {
                iHashBoolean = o2.B(iHashBoolean, 37, 3, 53) + getBidList().hashCode();
            }
            if (hasExt()) {
                iHashBoolean = o2.B(iHashBoolean, 37, 5, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashBoolean = o2.B(iHashBoolean, 37, 4, 53) + getExtProtoList().hashCode();
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashBoolean * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return d.f22458p.ensureFieldAccessorsInitialized(Seatbid.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.k7
        public Object newInstance(j7 j7Var) {
            return new Seatbid();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getSeatBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.seat_);
            }
            boolean z10 = this.package_;
            if (z10) {
                h0Var.writeBool(2, z10);
            }
            for (int i10 = 0; i10 < this.bid_.size(); i10++) {
                h0Var.writeMessage(3, this.bid_.get(i10));
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                h0Var.writeMessage(4, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(5, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements SeatbidOrBuilder {
            private pa bidBuilder_;
            private List<Bid> bid_;
            private int bitField0_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private boolean package_;
            private Object seat_;

            private Builder() {
                super(null);
                this.seat_ = "";
                List list = Collections.EMPTY_LIST;
                this.bid_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureBidIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.bid_ = new ArrayList(this.bid_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private pa getBidFieldBuilder() {
                if (this.bidBuilder_ == null) {
                    this.bidBuilder_ = new pa(this.bid_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.bid_ = null;
                }
                return this.bidBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return d.f22457o;
            }

            private xa getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new xa(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private pa getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getBidFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllBid(Iterable<? extends Bid> iterable) {
                pa paVar = this.bidBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureBidIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.bid_);
                onChanged();
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureExtProtoIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.extProto_);
                onChanged();
                return this;
            }

            public Builder addBid(Bid bid) {
                pa paVar = this.bidBuilder_;
                if (paVar != null) {
                    paVar.addMessage(bid);
                    return this;
                }
                bid.getClass();
                ensureBidIsMutable();
                this.bid_.add(bid);
                onChanged();
                return this;
            }

            public Bid.Builder addBidBuilder() {
                return (Bid.Builder) getBidFieldBuilder().addBuilder(Bid.getDefaultInstance());
            }

            public Builder addExtProto(Any any) {
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    paVar.addMessage(any);
                    return this;
                }
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(any);
                onChanged();
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Builder clearBid() {
                pa paVar = this.bidBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.bid_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                    return this;
                }
                this.ext_ = null;
                this.extBuilder_ = null;
                return this;
            }

            public Builder clearExtProto() {
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.extProto_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearPackage() {
                this.package_ = false;
                onChanged();
                return this;
            }

            public Builder clearSeat() {
                this.seat_ = Seatbid.getDefaultInstance().getSeat();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public Bid getBid(int i10) {
                pa paVar = this.bidBuilder_;
                return paVar == null ? this.bid_.get(i10) : (Bid) paVar.getMessage(i10);
            }

            public Bid.Builder getBidBuilder(int i10) {
                return (Bid.Builder) getBidFieldBuilder().getBuilder(i10);
            }

            public List<Bid.Builder> getBidBuilderList() {
                return getBidFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public int getBidCount() {
                pa paVar = this.bidBuilder_;
                return paVar == null ? this.bid_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<Bid> getBidList() {
                pa paVar = this.bidBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.bid_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public BidOrBuilder getBidOrBuilder(int i10) {
                pa paVar = this.bidBuilder_;
                return paVar == null ? this.bid_.get(i10) : (BidOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<? extends BidOrBuilder> getBidOrBuilderList() {
                pa paVar = this.bidBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.bid_);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return d.f22457o;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public Struct getExt() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (Struct) xaVar.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return (Struct.Builder) getExtFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public Any getExtProto(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (Any) paVar.getMessage(i10);
            }

            public Any.Builder getExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().getBuilder(i10);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public boolean getPackage() {
                return this.package_;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public String getSeat() {
                Object obj = this.seat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.seat_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public ByteString getSeatBytes() {
                Object obj = this.seat_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.seat_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Response.SeatbidOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return d.f22458p.ensureFieldAccessorsInitialized(Seatbid.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeExt(Struct struct) {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(struct);
                    return this;
                }
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.i(struct2, struct);
                } else {
                    this.ext_ = struct;
                }
                onChanged();
                return this;
            }

            public Builder removeBid(int i10) {
                pa paVar = this.bidBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureBidIsMutable();
                this.bid_.remove(i10);
                onChanged();
                return this;
            }

            public Builder removeExtProto(int i10) {
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureExtProtoIsMutable();
                this.extProto_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setBid(int i10, Bid bid) {
                pa paVar = this.bidBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, bid);
                    return this;
                }
                bid.getClass();
                ensureBidIsMutable();
                this.bid_.set(i10, bid);
                onChanged();
                return this;
            }

            public Builder setExt(Struct struct) {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(struct);
                    return this;
                }
                struct.getClass();
                this.ext_ = struct;
                onChanged();
                return this;
            }

            public Builder setExtProto(int i10, Any any) {
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, any);
                    return this;
                }
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.set(i10, any);
                onChanged();
                return this;
            }

            public Builder setPackage(boolean z10) {
                this.package_ = z10;
                onChanged();
                return this;
            }

            public Builder setSeat(String str) {
                str.getClass();
                this.seat_ = str;
                onChanged();
                return this;
            }

            public Builder setSeatBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.seat_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Seatbid build() {
                Seatbid seatbidBuildPartial = buildPartial();
                if (seatbidBuildPartial.isInitialized()) {
                    return seatbidBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) seatbidBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Seatbid buildPartial() {
                Seatbid seatbid = new Seatbid(this);
                seatbid.seat_ = this.seat_;
                seatbid.package_ = this.package_;
                pa paVar = this.bidBuilder_;
                if (paVar != null) {
                    seatbid.bid_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.bid_ = Collections.unmodifiableList(this.bid_);
                        this.bitField0_ &= -2;
                    }
                    seatbid.bid_ = this.bid_;
                }
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    seatbid.ext_ = this.ext_;
                } else {
                    seatbid.ext_ = (Struct) xaVar.build();
                }
                pa paVar2 = this.extProtoBuilder_;
                if (paVar2 != null) {
                    seatbid.extProto_ = paVar2.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    seatbid.extProto_ = this.extProto_;
                }
                onBuilt();
                return seatbid;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Seatbid getDefaultInstanceForType() {
                return Seatbid.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(gc gcVar) {
                return (Builder) super.setUnknownFields(gcVar);
            }

            public Bid.Builder addBidBuilder(int i10) {
                return (Bid.Builder) getBidFieldBuilder().addBuilder(i10, Bid.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().addBuilder(i10, Any.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(gc gcVar) {
                return (Builder) super.mergeUnknownFields(gcVar);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.seat_ = "";
                this.package_ = false;
                pa paVar = this.bidBuilder_;
                if (paVar == null) {
                    this.bid_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    paVar.clear();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                pa paVar2 = this.extProtoBuilder_;
                if (paVar2 == null) {
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    return this;
                }
                paVar2.clear();
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    this.ext_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder addBid(int i10, Bid bid) {
                pa paVar = this.bidBuilder_;
                if (paVar == null) {
                    bid.getClass();
                    ensureBidIsMutable();
                    this.bid_.add(i10, bid);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, bid);
                return this;
            }

            public Builder addExtProto(int i10, Any any) {
                pa paVar = this.extProtoBuilder_;
                if (paVar == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, any);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, any);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Seatbid) {
                    return mergeFrom((Seatbid) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setBid(int i10, Bid.Builder builder) {
                pa paVar = this.bidBuilder_;
                if (paVar == null) {
                    ensureBidIsMutable();
                    this.bid_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder setExtProto(int i10, Any.Builder builder) {
                pa paVar = this.extProtoBuilder_;
                if (paVar == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.seat_ = "";
                List list = Collections.EMPTY_LIST;
                this.bid_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Seatbid seatbid) {
                if (seatbid == Seatbid.getDefaultInstance()) {
                    return this;
                }
                if (!seatbid.getSeat().isEmpty()) {
                    this.seat_ = seatbid.seat_;
                    onChanged();
                }
                if (seatbid.getPackage()) {
                    setPackage(seatbid.getPackage());
                }
                if (this.bidBuilder_ == null) {
                    if (!seatbid.bid_.isEmpty()) {
                        if (this.bid_.isEmpty()) {
                            this.bid_ = seatbid.bid_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureBidIsMutable();
                            this.bid_.addAll(seatbid.bid_);
                        }
                        onChanged();
                    }
                } else if (!seatbid.bid_.isEmpty()) {
                    if (!this.bidBuilder_.isEmpty()) {
                        this.bidBuilder_.addAllMessages(seatbid.bid_);
                    } else {
                        this.bidBuilder_.dispose();
                        this.bidBuilder_ = null;
                        this.bid_ = seatbid.bid_;
                        this.bitField0_ &= -2;
                        this.bidBuilder_ = k7.alwaysUseFieldBuilders ? getBidFieldBuilder() : null;
                    }
                }
                if (seatbid.hasExt()) {
                    mergeExt(seatbid.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!seatbid.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = seatbid.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(seatbid.extProto_);
                        }
                        onChanged();
                    }
                } else if (!seatbid.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(seatbid.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = seatbid.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) seatbid).unknownFields);
                onChanged();
                return this;
            }

            public Builder addBid(Bid.Builder builder) {
                pa paVar = this.bidBuilder_;
                if (paVar == null) {
                    ensureBidIsMutable();
                    this.bid_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                pa paVar = this.extProtoBuilder_;
                if (paVar == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addBid(int i10, Bid.Builder builder) {
                pa paVar = this.bidBuilder_;
                if (paVar == null) {
                    ensureBidIsMutable();
                    this.bid_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, builder.build());
                return this;
            }

            public Builder addExtProto(int i10, Any.Builder builder) {
                pa paVar = this.extProtoBuilder_;
                if (paVar == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, builder.build());
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.explorestack.protobuf.openrtb.Response.Seatbid.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Response.Seatbid.access$5900()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.openrtb.Response$Seatbid r3 = (com.explorestack.protobuf.openrtb.Response.Seatbid) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    com.explorestack.protobuf.openrtb.Response$Seatbid r4 = (com.explorestack.protobuf.openrtb.Response.Seatbid) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Seatbid.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Response$Seatbid$Builder");
            }
        }

        public static Builder newBuilder(Seatbid seatbid) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(seatbid);
        }

        public static Seatbid parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Seatbid(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Seatbid parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Seatbid) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Seatbid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Seatbid getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Seatbid parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Seatbid() {
            this.memoizedIsInitialized = (byte) -1;
            this.seat_ = "";
            List list = Collections.EMPTY_LIST;
            this.bid_ = list;
            this.extProto_ = list;
        }

        public static Seatbid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Seatbid parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Seatbid) PARSER.parseFrom(bArr, m5Var);
        }

        public static Seatbid parseFrom(InputStream inputStream) throws IOException {
            return (Seatbid) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Seatbid parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Seatbid) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Seatbid(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            this();
            m5Var.getClass();
            cc ccVarNewBuilder = gc.newBuilder();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int tag = yVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.seat_ = yVar.readStringRequireUtf8();
                                } else if (tag == 16) {
                                    this.package_ = yVar.readBool();
                                } else if (tag == 26) {
                                    if ((i10 & 1) == 0) {
                                        this.bid_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.bid_.add(yVar.readMessage(Bid.parser(), m5Var));
                                } else if (tag == 34) {
                                    if ((i10 & 2) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                } else if (tag != 42) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
                                    }
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) != 0) {
                        this.bid_ = Collections.unmodifiableList(this.bid_);
                    }
                    if ((i10 & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.bid_ = Collections.unmodifiableList(this.bid_);
            }
            if ((i10 & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Seatbid parseFrom(y yVar) throws IOException {
            return (Seatbid) k7.parseWithIOException(PARSER, yVar);
        }

        public static Seatbid parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Seatbid) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SeatbidOrBuilder extends MessageOrBuilder {
        Seatbid.Bid getBid(int i10);

        int getBidCount();

        List<Seatbid.Bid> getBidList();

        Seatbid.BidOrBuilder getBidOrBuilder(int i10);

        List<? extends Seatbid.BidOrBuilder> getBidOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        g getExtProtoOrBuilder(int i10);

        List<? extends g> getExtProtoOrBuilderList();

        boolean getPackage();

        String getSeat();

        ByteString getSeatBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Response getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return d.f22455m;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Response) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return super.equals(obj);
        }
        Response response = (Response) obj;
        if (getId().equals(response.getId()) && getBidid().equals(response.getBidid()) && this.nbr_ == response.nbr_ && getCur().equals(response.getCur()) && getCdata().equals(response.getCdata()) && getSeatbidList().equals(response.getSeatbidList()) && hasExt() == response.hasExt()) {
            return (!hasExt() || getExt().equals(response.getExt())) && getExtProtoList().equals(response.getExtProtoList()) && this.unknownFields.equals(response.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public String getBidid() {
        Object obj = this.bidid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public ByteString getBididBytes() {
        Object obj = this.bidid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public String getCdata() {
        Object obj = this.cdata_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cdata_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public ByteString getCdataBytes() {
        Object obj = this.cdata_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cdata_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public String getCur() {
        Object obj = this.cur_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cur_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public ByteString getCurBytes() {
        Object obj = this.cur_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cur_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public jb getExtOrBuilder() {
        return getExt();
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public Any getExtProto(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public g getExtProtoOrBuilder(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public List<? extends g> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public NoBidReason getNbr() {
        NoBidReason noBidReasonValueOf = NoBidReason.valueOf(this.nbr_);
        return noBidReasonValueOf == null ? NoBidReason.UNRECOGNIZED : noBidReasonValueOf;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public int getNbrValue() {
        return this.nbr_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public Seatbid getSeatbid(int i10) {
        return this.seatbid_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public int getSeatbidCount() {
        return this.seatbid_.size();
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public List<Seatbid> getSeatbidList() {
        return this.seatbid_;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public SeatbidOrBuilder getSeatbidOrBuilder(int i10) {
        return this.seatbid_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public List<? extends SeatbidOrBuilder> getSeatbidOrBuilderList() {
        return this.seatbid_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
        if (!getBididBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.bidid_);
        }
        if (this.nbr_ != NoBidReason.NO_BID_REASON_INVALID.getNumber()) {
            iComputeStringSize += h0.computeEnumSize(3, this.nbr_);
        }
        if (!getCurBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(4, this.cur_);
        }
        if (!getCdataBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(5, this.cdata_);
        }
        for (int i11 = 0; i11 < this.seatbid_.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(6, this.seatbid_.get(i11));
        }
        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
            iComputeStringSize += h0.computeMessageSize(7, this.extProto_.get(i12));
        }
        if (this.ext_ != null) {
            iComputeStringSize += h0.computeMessageSize(8, getExt());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.openrtb.f
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getCdata().hashCode() + ((((getCur().hashCode() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getBidid().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53, this.nbr_, 37, 4, 53)) * 37) + 5) * 53);
        if (getSeatbidCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 6, 53) + getSeatbidList().hashCode();
        }
        if (hasExt()) {
            iHashCode = o2.B(iHashCode, 37, 8, 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 7, 53) + getExtProtoList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return d.f22456n.ensureFieldAccessorsInitialized(Response.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public Object newInstance(j7 j7Var) {
        return new Response();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getIdBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.id_);
        }
        if (!getBididBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.bidid_);
        }
        if (this.nbr_ != NoBidReason.NO_BID_REASON_INVALID.getNumber()) {
            h0Var.writeEnum(3, this.nbr_);
        }
        if (!getCurBytes().isEmpty()) {
            k7.writeString(h0Var, 4, this.cur_);
        }
        if (!getCdataBytes().isEmpty()) {
            k7.writeString(h0Var, 5, this.cdata_);
        }
        for (int i10 = 0; i10 < this.seatbid_.size(); i10++) {
            h0Var.writeMessage(6, this.seatbid_.get(i10));
        }
        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
            h0Var.writeMessage(7, this.extProto_.get(i11));
        }
        if (this.ext_ != null) {
            h0Var.writeMessage(8, getExt());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements f {
        private Object bidid_;
        private int bitField0_;
        private Object cdata_;
        private Object cur_;
        private xa extBuilder_;
        private pa extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private int nbr_;
        private pa seatbidBuilder_;
        private List<Seatbid> seatbid_;

        private Builder() {
            super(null);
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            List list = Collections.EMPTY_LIST;
            this.seatbid_ = list;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureSeatbidIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.seatbid_ = new ArrayList(this.seatbid_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return d.f22455m;
        }

        private xa getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new xa(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private pa getExtProtoFieldBuilder() {
            if (this.extProtoBuilder_ == null) {
                this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private pa getSeatbidFieldBuilder() {
            if (this.seatbidBuilder_ == null) {
                this.seatbidBuilder_ = new pa(this.seatbid_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.seatbid_ = null;
            }
            return this.seatbidBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getSeatbidFieldBuilder();
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
            pa paVar = this.extProtoBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureExtProtoIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.extProto_);
            onChanged();
            return this;
        }

        public Builder addAllSeatbid(Iterable<? extends Seatbid> iterable) {
            pa paVar = this.seatbidBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureSeatbidIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.seatbid_);
            onChanged();
            return this;
        }

        public Builder addExtProto(Any any) {
            pa paVar = this.extProtoBuilder_;
            if (paVar != null) {
                paVar.addMessage(any);
                return this;
            }
            any.getClass();
            ensureExtProtoIsMutable();
            this.extProto_.add(any);
            onChanged();
            return this;
        }

        public Any.Builder addExtProtoBuilder() {
            return (Any.Builder) getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
        }

        public Builder addSeatbid(Seatbid seatbid) {
            pa paVar = this.seatbidBuilder_;
            if (paVar != null) {
                paVar.addMessage(seatbid);
                return this;
            }
            seatbid.getClass();
            ensureSeatbidIsMutable();
            this.seatbid_.add(seatbid);
            onChanged();
            return this;
        }

        public Seatbid.Builder addSeatbidBuilder() {
            return (Seatbid.Builder) getSeatbidFieldBuilder().addBuilder(Seatbid.getDefaultInstance());
        }

        public Builder clearBidid() {
            this.bidid_ = Response.getDefaultInstance().getBidid();
            onChanged();
            return this;
        }

        public Builder clearCdata() {
            this.cdata_ = Response.getDefaultInstance().getCdata();
            onChanged();
            return this;
        }

        public Builder clearCur() {
            this.cur_ = Response.getDefaultInstance().getCur();
            onChanged();
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
                return this;
            }
            this.ext_ = null;
            this.extBuilder_ = null;
            return this;
        }

        public Builder clearExtProto() {
            pa paVar = this.extProtoBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.extProto_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearId() {
            this.id_ = Response.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearNbr() {
            this.nbr_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSeatbid() {
            pa paVar = this.seatbidBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.seatbid_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public String getBidid() {
            Object obj = this.bidid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public ByteString getBididBytes() {
            Object obj = this.bidid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public String getCdata() {
            Object obj = this.cdata_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cdata_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public ByteString getCdataBytes() {
            Object obj = this.cdata_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cdata_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public String getCur() {
            Object obj = this.cur_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cur_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public ByteString getCurBytes() {
            Object obj = this.cur_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cur_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return d.f22455m;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public Struct getExt() {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                return (Struct) xaVar.getMessage();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return (Struct.Builder) getExtFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public jb getExtOrBuilder() {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public Any getExtProto(int i10) {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.get(i10) : (Any) paVar.getMessage(i10);
        }

        public Any.Builder getExtProtoBuilder(int i10) {
            return (Any.Builder) getExtProtoFieldBuilder().getBuilder(i10);
        }

        public List<Any.Builder> getExtProtoBuilderList() {
            return getExtProtoFieldBuilder().getBuilderList();
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public int getExtProtoCount() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.size() : paVar.getCount();
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public List<Any> getExtProtoList() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public g getExtProtoOrBuilder(int i10) {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.get(i10) : (g) paVar.getMessageOrBuilder(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public List<? extends g> getExtProtoOrBuilderList() {
            pa paVar = this.extProtoBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public NoBidReason getNbr() {
            NoBidReason noBidReasonValueOf = NoBidReason.valueOf(this.nbr_);
            return noBidReasonValueOf == null ? NoBidReason.UNRECOGNIZED : noBidReasonValueOf;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public int getNbrValue() {
            return this.nbr_;
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public Seatbid getSeatbid(int i10) {
            pa paVar = this.seatbidBuilder_;
            return paVar == null ? this.seatbid_.get(i10) : (Seatbid) paVar.getMessage(i10);
        }

        public Seatbid.Builder getSeatbidBuilder(int i10) {
            return (Seatbid.Builder) getSeatbidFieldBuilder().getBuilder(i10);
        }

        public List<Seatbid.Builder> getSeatbidBuilderList() {
            return getSeatbidFieldBuilder().getBuilderList();
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public int getSeatbidCount() {
            pa paVar = this.seatbidBuilder_;
            return paVar == null ? this.seatbid_.size() : paVar.getCount();
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public List<Seatbid> getSeatbidList() {
            pa paVar = this.seatbidBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.seatbid_) : paVar.getMessageList();
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public SeatbidOrBuilder getSeatbidOrBuilder(int i10) {
            pa paVar = this.seatbidBuilder_;
            return paVar == null ? this.seatbid_.get(i10) : (SeatbidOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public List<? extends SeatbidOrBuilder> getSeatbidOrBuilderList() {
            pa paVar = this.seatbidBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.seatbid_);
        }

        @Override // com.explorestack.protobuf.openrtb.f
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return d.f22456n.ensureFieldAccessorsInitialized(Response.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeExt(Struct struct) {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(struct);
                return this;
            }
            Struct struct2 = this.ext_;
            if (struct2 != null) {
                this.ext_ = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.i(struct2, struct);
            } else {
                this.ext_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder removeExtProto(int i10) {
            pa paVar = this.extProtoBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureExtProtoIsMutable();
            this.extProto_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeSeatbid(int i10) {
            pa paVar = this.seatbidBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureSeatbidIsMutable();
            this.seatbid_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setBidid(String str) {
            str.getClass();
            this.bidid_ = str;
            onChanged();
            return this;
        }

        public Builder setBididBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.bidid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCdata(String str) {
            str.getClass();
            this.cdata_ = str;
            onChanged();
            return this;
        }

        public Builder setCdataBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.cdata_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCur(String str) {
            str.getClass();
            this.cur_ = str;
            onChanged();
            return this;
        }

        public Builder setCurBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.cur_ = byteString;
            onChanged();
            return this;
        }

        public Builder setExt(Struct struct) {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(struct);
                return this;
            }
            struct.getClass();
            this.ext_ = struct;
            onChanged();
            return this;
        }

        public Builder setExtProto(int i10, Any any) {
            pa paVar = this.extProtoBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, any);
                return this;
            }
            any.getClass();
            ensureExtProtoIsMutable();
            this.extProto_.set(i10, any);
            onChanged();
            return this;
        }

        public Builder setId(String str) {
            str.getClass();
            this.id_ = str;
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.id_ = byteString;
            onChanged();
            return this;
        }

        public Builder setNbr(NoBidReason noBidReason) {
            noBidReason.getClass();
            this.nbr_ = noBidReason.getNumber();
            onChanged();
            return this;
        }

        public Builder setNbrValue(int i10) {
            this.nbr_ = i10;
            onChanged();
            return this;
        }

        public Builder setSeatbid(int i10, Seatbid seatbid) {
            pa paVar = this.seatbidBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, seatbid);
                return this;
            }
            seatbid.getClass();
            ensureSeatbidIsMutable();
            this.seatbid_.set(i10, seatbid);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Response build() {
            Response responseBuildPartial = buildPartial();
            if (responseBuildPartial.isInitialized()) {
                return responseBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) responseBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Response buildPartial() {
            Response response = new Response(this);
            response.id_ = this.id_;
            response.bidid_ = this.bidid_;
            response.nbr_ = this.nbr_;
            response.cur_ = this.cur_;
            response.cdata_ = this.cdata_;
            pa paVar = this.seatbidBuilder_;
            if (paVar != null) {
                response.seatbid_ = paVar.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.seatbid_ = Collections.unmodifiableList(this.seatbid_);
                    this.bitField0_ &= -2;
                }
                response.seatbid_ = this.seatbid_;
            }
            xa xaVar = this.extBuilder_;
            if (xaVar == null) {
                response.ext_ = this.ext_;
            } else {
                response.ext_ = (Struct) xaVar.build();
            }
            pa paVar2 = this.extProtoBuilder_;
            if (paVar2 != null) {
                response.extProto_ = paVar2.build();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -3;
                }
                response.extProto_ = this.extProto_;
            }
            onBuilt();
            return response;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Response getDefaultInstanceForType() {
            return Response.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(gc gcVar) {
            return (Builder) super.setUnknownFields(gcVar);
        }

        public Any.Builder addExtProtoBuilder(int i10) {
            return (Any.Builder) getExtProtoFieldBuilder().addBuilder(i10, Any.getDefaultInstance());
        }

        public Seatbid.Builder addSeatbidBuilder(int i10) {
            return (Seatbid.Builder) getSeatbidFieldBuilder().addBuilder(i10, Seatbid.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(gc gcVar) {
            return (Builder) super.mergeUnknownFields(gcVar);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            pa paVar = this.seatbidBuilder_;
            if (paVar == null) {
                this.seatbid_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
            } else {
                paVar.clear();
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            pa paVar2 = this.extProtoBuilder_;
            if (paVar2 == null) {
                this.extProto_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                return this;
            }
            paVar2.clear();
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            xa xaVar = this.extBuilder_;
            if (xaVar == null) {
                this.ext_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder addExtProto(int i10, Any any) {
            pa paVar = this.extProtoBuilder_;
            if (paVar == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(i10, any);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, any);
            return this;
        }

        public Builder addSeatbid(int i10, Seatbid seatbid) {
            pa paVar = this.seatbidBuilder_;
            if (paVar == null) {
                seatbid.getClass();
                ensureSeatbidIsMutable();
                this.seatbid_.add(i10, seatbid);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, seatbid);
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Response) {
                return mergeFrom((Response) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setExtProto(int i10, Any.Builder builder) {
            pa paVar = this.extProtoBuilder_;
            if (paVar == null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder setSeatbid(int i10, Seatbid.Builder builder) {
            pa paVar = this.seatbidBuilder_;
            if (paVar == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(Response response) {
            if (response == Response.getDefaultInstance()) {
                return this;
            }
            if (!response.getId().isEmpty()) {
                this.id_ = response.id_;
                onChanged();
            }
            if (!response.getBidid().isEmpty()) {
                this.bidid_ = response.bidid_;
                onChanged();
            }
            if (response.nbr_ != 0) {
                setNbrValue(response.getNbrValue());
            }
            if (!response.getCur().isEmpty()) {
                this.cur_ = response.cur_;
                onChanged();
            }
            if (!response.getCdata().isEmpty()) {
                this.cdata_ = response.cdata_;
                onChanged();
            }
            if (this.seatbidBuilder_ == null) {
                if (!response.seatbid_.isEmpty()) {
                    if (this.seatbid_.isEmpty()) {
                        this.seatbid_ = response.seatbid_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSeatbidIsMutable();
                        this.seatbid_.addAll(response.seatbid_);
                    }
                    onChanged();
                }
            } else if (!response.seatbid_.isEmpty()) {
                if (!this.seatbidBuilder_.isEmpty()) {
                    this.seatbidBuilder_.addAllMessages(response.seatbid_);
                } else {
                    this.seatbidBuilder_.dispose();
                    this.seatbidBuilder_ = null;
                    this.seatbid_ = response.seatbid_;
                    this.bitField0_ &= -2;
                    this.seatbidBuilder_ = k7.alwaysUseFieldBuilders ? getSeatbidFieldBuilder() : null;
                }
            }
            if (response.hasExt()) {
                mergeExt(response.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!response.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = response.extProto_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(response.extProto_);
                    }
                    onChanged();
                }
            } else if (!response.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.addAllMessages(response.extProto_);
                } else {
                    this.extProtoBuilder_.dispose();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = response.extProto_;
                    this.bitField0_ &= -3;
                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) response).unknownFields);
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            List list = Collections.EMPTY_LIST;
            this.seatbid_ = list;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        public Builder addExtProto(Any.Builder builder) {
            pa paVar = this.extProtoBuilder_;
            if (paVar == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addSeatbid(Seatbid.Builder builder) {
            pa paVar = this.seatbidBuilder_;
            if (paVar == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addExtProto(int i10, Any.Builder builder) {
            pa paVar = this.extProtoBuilder_;
            if (paVar == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(i10, builder.build());
            return this;
        }

        public Builder addSeatbid(int i10, Seatbid.Builder builder) {
            pa paVar = this.seatbidBuilder_;
            if (paVar == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(i10, builder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.explorestack.protobuf.openrtb.Response.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Response.access$7700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.openrtb.Response r3 = (com.explorestack.protobuf.openrtb.Response) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                com.explorestack.protobuf.openrtb.Response r4 = (com.explorestack.protobuf.openrtb.Response) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Response$Builder");
        }
    }

    public static Builder newBuilder(Response response) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(response);
    }

    public static Response parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Response(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Response parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Response) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Response getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Response parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Response() {
        this.memoizedIsInitialized = (byte) -1;
        this.id_ = "";
        this.bidid_ = "";
        this.nbr_ = 0;
        this.cur_ = "";
        this.cdata_ = "";
        List list = Collections.EMPTY_LIST;
        this.seatbid_ = list;
        this.extProto_ = list;
    }

    public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Response parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Response) PARSER.parseFrom(bArr, m5Var);
    }

    public static Response parseFrom(InputStream inputStream) throws IOException {
        return (Response) k7.parseWithIOException(PARSER, inputStream);
    }

    public static Response parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Response) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Response parseFrom(y yVar) throws IOException {
        return (Response) k7.parseWithIOException(PARSER, yVar);
    }

    public static Response parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Response) k7.parseWithIOException(PARSER, yVar, m5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Response(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            this.id_ = yVar.readStringRequireUtf8();
                        } else if (tag == 18) {
                            this.bidid_ = yVar.readStringRequireUtf8();
                        } else if (tag == 24) {
                            this.nbr_ = yVar.readEnum();
                        } else if (tag == 34) {
                            this.cur_ = yVar.readStringRequireUtf8();
                        } else if (tag == 42) {
                            this.cdata_ = yVar.readStringRequireUtf8();
                        } else if (tag == 50) {
                            if ((i10 & 1) == 0) {
                                this.seatbid_ = new ArrayList();
                                i10 |= 1;
                            }
                            this.seatbid_.add(yVar.readMessage(Seatbid.parser(), m5Var));
                        } else if (tag == 58) {
                            if ((i10 & 2) == 0) {
                                this.extProto_ = new ArrayList();
                                i10 |= 2;
                            }
                            this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                        } else if (tag != 66) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            Struct struct = this.ext_;
                            Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                            this.ext_ = struct2;
                            if (builder != null) {
                                builder.mergeFrom(struct2);
                                this.ext_ = builder.buildPartial();
                            }
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 1) != 0) {
                    this.seatbid_ = Collections.unmodifiableList(this.seatbid_);
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            this.seatbid_ = Collections.unmodifiableList(this.seatbid_);
        }
        if ((i10 & 2) != 0) {
            this.extProto_ = Collections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }
}
