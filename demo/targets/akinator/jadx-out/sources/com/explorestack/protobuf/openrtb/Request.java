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
import com.explorestack.protobuf.f8;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.g;
import com.explorestack.protobuf.g8;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.ka;
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
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class Request extends k7 implements e {
    public static final int AT_FIELD_NUMBER = 4;
    public static final int CDATA_FIELD_NUMBER = 8;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CUR_FIELD_NUMBER = 5;
    public static final int EXT_FIELD_NUMBER = 14;
    public static final int EXT_PROTO_FIELD_NUMBER = 13;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 10;
    public static final int PACKAGE_FIELD_NUMBER = 11;
    public static final int SEAT_FIELD_NUMBER = 6;
    public static final int SOURCE_FIELD_NUMBER = 9;
    public static final int TEST_FIELD_NUMBER = 2;
    public static final int TMAX_FIELD_NUMBER = 3;
    public static final int WSEAT_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private int at_;
    private volatile Object cdata_;
    private Any context_;
    private g8 cur_;
    private List<Any> extProto_;
    private Struct ext_;
    private volatile Object id_;
    private List<Item> item_;
    private byte memoizedIsInitialized;
    private int package_;
    private g8 seat_;
    private Source source_;
    private boolean test_;
    private int tmax_;
    private boolean wseat_;
    private static final Request DEFAULT_INSTANCE = new Request();
    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Request.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Request parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Request(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements e {
        private int at_;
        private int bitField0_;
        private Object cdata_;
        private xa contextBuilder_;
        private Any context_;
        private g8 cur_;
        private xa extBuilder_;
        private pa extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private pa itemBuilder_;
        private List<Item> item_;
        private int package_;
        private g8 seat_;
        private xa sourceBuilder_;
        private Source source_;
        private boolean test_;
        private int tmax_;
        private boolean wseat_;

        private Builder() {
            super(null);
            this.id_ = "";
            f8 f8Var = f8.f22138e;
            this.cur_ = f8Var;
            this.seat_ = f8Var;
            this.cdata_ = "";
            List list = Collections.EMPTY_LIST;
            this.item_ = list;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        private void ensureCurIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.cur_ = new f8(this.cur_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 8;
            }
        }

        private void ensureItemIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.item_ = new ArrayList(this.item_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureSeatIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.seat_ = new f8(this.seat_);
                this.bitField0_ |= 2;
            }
        }

        private xa getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new xa(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return d.f22445c;
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
                this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private pa getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
                this.itemBuilder_ = new pa(this.item_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                this.item_ = null;
            }
            return this.itemBuilder_;
        }

        private xa getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
                this.sourceBuilder_ = new xa(getSource(), getParentForChildren(), isClean());
                this.source_ = null;
            }
            return this.sourceBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getItemFieldBuilder();
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAllCur(Iterable<String> iterable) {
            ensureCurIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.cur_);
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

        public Builder addAllItem(Iterable<? extends Item> iterable) {
            pa paVar = this.itemBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureItemIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.item_);
            onChanged();
            return this;
        }

        public Builder addAllSeat(Iterable<String> iterable) {
            ensureSeatIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.seat_);
            onChanged();
            return this;
        }

        public Builder addCur(String str) {
            str.getClass();
            ensureCurIsMutable();
            this.cur_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addCurBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            ensureCurIsMutable();
            this.cur_.add(byteString);
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

        public Builder addItem(Item item) {
            pa paVar = this.itemBuilder_;
            if (paVar != null) {
                paVar.addMessage(item);
                return this;
            }
            item.getClass();
            ensureItemIsMutable();
            this.item_.add(item);
            onChanged();
            return this;
        }

        public Item.Builder addItemBuilder() {
            return (Item.Builder) getItemFieldBuilder().addBuilder(Item.getDefaultInstance());
        }

        public Builder addSeat(String str) {
            str.getClass();
            ensureSeatIsMutable();
            this.seat_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addSeatBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            ensureSeatIsMutable();
            this.seat_.add(byteString);
            onChanged();
            return this;
        }

        public Builder clearAt() {
            this.at_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCdata() {
            this.cdata_ = Request.getDefaultInstance().getCdata();
            onChanged();
            return this;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
                return this;
            }
            this.context_ = null;
            this.contextBuilder_ = null;
            return this;
        }

        public Builder clearCur() {
            this.cur_ = f8.f22138e;
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
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearId() {
            this.id_ = Request.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearItem() {
            pa paVar = this.itemBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.item_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearPackage() {
            this.package_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSeat() {
            this.seat_ = f8.f22138e;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearSource() {
            if (this.sourceBuilder_ == null) {
                this.source_ = null;
                onChanged();
                return this;
            }
            this.source_ = null;
            this.sourceBuilder_ = null;
            return this;
        }

        public Builder clearTest() {
            this.test_ = false;
            onChanged();
            return this;
        }

        public Builder clearTmax() {
            this.tmax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearWseat() {
            this.wseat_ = false;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public int getAt() {
            return this.at_;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public String getCdata() {
            Object obj = this.cdata_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cdata_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public ByteString getCdataBytes() {
            Object obj = this.cdata_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cdata_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public Any getContext() {
            xa xaVar = this.contextBuilder_;
            if (xaVar != null) {
                return (Any) xaVar.getMessage();
            }
            Any any = this.context_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        public Any.Builder getContextBuilder() {
            onChanged();
            return (Any.Builder) getContextFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public g getContextOrBuilder() {
            xa xaVar = this.contextBuilder_;
            if (xaVar != null) {
                return (g) xaVar.getMessageOrBuilder();
            }
            Any any = this.context_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public String getCur(int i10) {
            return (String) this.cur_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public ByteString getCurBytes(int i10) {
            return this.cur_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public int getCurCount() {
            return this.cur_.size();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return d.f22445c;
        }

        @Override // com.explorestack.protobuf.openrtb.e
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

        @Override // com.explorestack.protobuf.openrtb.e
        public jb getExtOrBuilder() {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.openrtb.e
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

        @Override // com.explorestack.protobuf.openrtb.e
        public int getExtProtoCount() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.size() : paVar.getCount();
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public List<Any> getExtProtoList() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public g getExtProtoOrBuilder(int i10) {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.get(i10) : (g) paVar.getMessageOrBuilder(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public List<? extends g> getExtProtoOrBuilderList() {
            pa paVar = this.extProtoBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public Item getItem(int i10) {
            pa paVar = this.itemBuilder_;
            return paVar == null ? this.item_.get(i10) : (Item) paVar.getMessage(i10);
        }

        public Item.Builder getItemBuilder(int i10) {
            return (Item.Builder) getItemFieldBuilder().getBuilder(i10);
        }

        public List<Item.Builder> getItemBuilderList() {
            return getItemFieldBuilder().getBuilderList();
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public int getItemCount() {
            pa paVar = this.itemBuilder_;
            return paVar == null ? this.item_.size() : paVar.getCount();
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public List<Item> getItemList() {
            pa paVar = this.itemBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.item_) : paVar.getMessageList();
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public ItemOrBuilder getItemOrBuilder(int i10) {
            pa paVar = this.itemBuilder_;
            return paVar == null ? this.item_.get(i10) : (ItemOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public List<? extends ItemOrBuilder> getItemOrBuilderList() {
            pa paVar = this.itemBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.item_);
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public int getPackage() {
            return this.package_;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public String getSeat(int i10) {
            return (String) this.seat_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public ByteString getSeatBytes(int i10) {
            return this.seat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public int getSeatCount() {
            return this.seat_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public Source getSource() {
            xa xaVar = this.sourceBuilder_;
            if (xaVar != null) {
                return (Source) xaVar.getMessage();
            }
            Source source = this.source_;
            return source == null ? Source.getDefaultInstance() : source;
        }

        public Source.Builder getSourceBuilder() {
            onChanged();
            return (Source.Builder) getSourceFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public SourceOrBuilder getSourceOrBuilder() {
            xa xaVar = this.sourceBuilder_;
            if (xaVar != null) {
                return (SourceOrBuilder) xaVar.getMessageOrBuilder();
            }
            Source source = this.source_;
            return source == null ? Source.getDefaultInstance() : source;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public boolean getTest() {
            return this.test_;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public int getTmax() {
            return this.tmax_;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public boolean getWseat() {
            return this.wseat_;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public boolean hasSource() {
            return (this.sourceBuilder_ == null && this.source_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return d.f22446d.ensureFieldAccessorsInitialized(Request.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeContext(Any any) {
            xa xaVar = this.contextBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(any);
                return this;
            }
            Any any2 = this.context_;
            if (any2 != null) {
                this.context_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
            } else {
                this.context_ = any;
            }
            onChanged();
            return this;
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

        public Builder mergeSource(Source source) {
            xa xaVar = this.sourceBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(source);
                return this;
            }
            Source source2 = this.source_;
            if (source2 != null) {
                this.source_ = Source.newBuilder(source2).mergeFrom(source).buildPartial();
            } else {
                this.source_ = source;
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

        public Builder removeItem(int i10) {
            pa paVar = this.itemBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureItemIsMutable();
            this.item_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setAt(int i10) {
            this.at_ = i10;
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

        public Builder setContext(Any any) {
            xa xaVar = this.contextBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(any);
                return this;
            }
            any.getClass();
            this.context_ = any;
            onChanged();
            return this;
        }

        public Builder setCur(int i10, String str) {
            str.getClass();
            ensureCurIsMutable();
            this.cur_.set(i10, (int) str);
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

        public Builder setItem(int i10, Item item) {
            pa paVar = this.itemBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, item);
                return this;
            }
            item.getClass();
            ensureItemIsMutable();
            this.item_.set(i10, item);
            onChanged();
            return this;
        }

        public Builder setPackage(int i10) {
            this.package_ = i10;
            onChanged();
            return this;
        }

        public Builder setSeat(int i10, String str) {
            str.getClass();
            ensureSeatIsMutable();
            this.seat_.set(i10, (int) str);
            onChanged();
            return this;
        }

        public Builder setSource(Source source) {
            xa xaVar = this.sourceBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(source);
                return this;
            }
            source.getClass();
            this.source_ = source;
            onChanged();
            return this;
        }

        public Builder setTest(boolean z10) {
            this.test_ = z10;
            onChanged();
            return this;
        }

        public Builder setTmax(int i10) {
            this.tmax_ = i10;
            onChanged();
            return this;
        }

        public Builder setWseat(boolean z10) {
            this.wseat_ = z10;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public ka getCurList() {
            return this.cur_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.openrtb.e
        public ka getSeatList() {
            return this.seat_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Request build() {
            Request requestBuildPartial = buildPartial();
            if (requestBuildPartial.isInitialized()) {
                return requestBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Request buildPartial() {
            Request request = new Request(this);
            request.id_ = this.id_;
            request.test_ = this.test_;
            request.tmax_ = this.tmax_;
            request.at_ = this.at_;
            if ((this.bitField0_ & 1) != 0) {
                this.cur_ = this.cur_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            request.cur_ = this.cur_;
            if ((this.bitField0_ & 2) != 0) {
                this.seat_ = this.seat_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            request.seat_ = this.seat_;
            request.wseat_ = this.wseat_;
            request.cdata_ = this.cdata_;
            xa xaVar = this.sourceBuilder_;
            if (xaVar == null) {
                request.source_ = this.source_;
            } else {
                request.source_ = (Source) xaVar.build();
            }
            pa paVar = this.itemBuilder_;
            if (paVar != null) {
                request.item_ = paVar.build();
            } else {
                if ((this.bitField0_ & 4) != 0) {
                    this.item_ = Collections.unmodifiableList(this.item_);
                    this.bitField0_ &= -5;
                }
                request.item_ = this.item_;
            }
            request.package_ = this.package_;
            xa xaVar2 = this.contextBuilder_;
            if (xaVar2 == null) {
                request.context_ = this.context_;
            } else {
                request.context_ = (Any) xaVar2.build();
            }
            xa xaVar3 = this.extBuilder_;
            if (xaVar3 == null) {
                request.ext_ = this.ext_;
            } else {
                request.ext_ = (Struct) xaVar3.build();
            }
            pa paVar2 = this.extProtoBuilder_;
            if (paVar2 != null) {
                request.extProto_ = paVar2.build();
            } else {
                if ((this.bitField0_ & 8) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -9;
                }
                request.extProto_ = this.extProto_;
            }
            onBuilt();
            return request;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Request getDefaultInstanceForType() {
            return Request.getDefaultInstance();
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

        public Item.Builder addItemBuilder(int i10) {
            return (Item.Builder) getItemFieldBuilder().addBuilder(i10, Item.getDefaultInstance());
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
            this.test_ = false;
            this.tmax_ = 0;
            this.at_ = 0;
            f8 f8Var = f8.f22138e;
            this.cur_ = f8Var;
            int i10 = this.bitField0_;
            this.seat_ = f8Var;
            this.bitField0_ = i10 & (-4);
            this.wseat_ = false;
            this.cdata_ = "";
            if (this.sourceBuilder_ == null) {
                this.source_ = null;
            } else {
                this.source_ = null;
                this.sourceBuilder_ = null;
            }
            pa paVar = this.itemBuilder_;
            if (paVar == null) {
                this.item_ = Collections.EMPTY_LIST;
                this.bitField0_ = i10 & (-8);
            } else {
                paVar.clear();
            }
            this.package_ = 0;
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
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
                this.bitField0_ &= -9;
                return this;
            }
            paVar2.clear();
            return this;
        }

        public Builder setContext(Any.Builder builder) {
            xa xaVar = this.contextBuilder_;
            if (xaVar == null) {
                this.context_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
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

        public Builder setSource(Source.Builder builder) {
            xa xaVar = this.sourceBuilder_;
            if (xaVar == null) {
                this.source_ = builder.build();
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

        public Builder addItem(int i10, Item item) {
            pa paVar = this.itemBuilder_;
            if (paVar == null) {
                item.getClass();
                ensureItemIsMutable();
                this.item_.add(i10, item);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, item);
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Request) {
                return mergeFrom((Request) message);
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

        public Builder setItem(int i10, Item.Builder builder) {
            pa paVar = this.itemBuilder_;
            if (paVar == null) {
                ensureItemIsMutable();
                this.item_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(Request request) {
            if (request == Request.getDefaultInstance()) {
                return this;
            }
            if (!request.getId().isEmpty()) {
                this.id_ = request.id_;
                onChanged();
            }
            if (request.getTest()) {
                setTest(request.getTest());
            }
            if (request.getTmax() != 0) {
                setTmax(request.getTmax());
            }
            if (request.getAt() != 0) {
                setAt(request.getAt());
            }
            if (!request.cur_.isEmpty()) {
                if (this.cur_.isEmpty()) {
                    this.cur_ = request.cur_;
                    this.bitField0_ &= -2;
                } else {
                    ensureCurIsMutable();
                    this.cur_.addAll(request.cur_);
                }
                onChanged();
            }
            if (!request.seat_.isEmpty()) {
                if (this.seat_.isEmpty()) {
                    this.seat_ = request.seat_;
                    this.bitField0_ &= -3;
                } else {
                    ensureSeatIsMutable();
                    this.seat_.addAll(request.seat_);
                }
                onChanged();
            }
            if (request.getWseat()) {
                setWseat(request.getWseat());
            }
            if (!request.getCdata().isEmpty()) {
                this.cdata_ = request.cdata_;
                onChanged();
            }
            if (request.hasSource()) {
                mergeSource(request.getSource());
            }
            if (this.itemBuilder_ == null) {
                if (!request.item_.isEmpty()) {
                    if (this.item_.isEmpty()) {
                        this.item_ = request.item_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureItemIsMutable();
                        this.item_.addAll(request.item_);
                    }
                    onChanged();
                }
            } else if (!request.item_.isEmpty()) {
                if (!this.itemBuilder_.isEmpty()) {
                    this.itemBuilder_.addAllMessages(request.item_);
                } else {
                    this.itemBuilder_.dispose();
                    this.itemBuilder_ = null;
                    this.item_ = request.item_;
                    this.bitField0_ &= -5;
                    this.itemBuilder_ = k7.alwaysUseFieldBuilders ? getItemFieldBuilder() : null;
                }
            }
            if (request.getPackage() != 0) {
                setPackage(request.getPackage());
            }
            if (request.hasContext()) {
                mergeContext(request.getContext());
            }
            if (request.hasExt()) {
                mergeExt(request.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!request.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = request.extProto_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(request.extProto_);
                    }
                    onChanged();
                }
            } else if (!request.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.addAllMessages(request.extProto_);
                } else {
                    this.extProtoBuilder_.dispose();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = request.extProto_;
                    this.bitField0_ &= -9;
                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) request).unknownFields);
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.id_ = "";
            f8 f8Var = f8.f22138e;
            this.cur_ = f8Var;
            this.seat_ = f8Var;
            this.cdata_ = "";
            List list = Collections.EMPTY_LIST;
            this.item_ = list;
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

        public Builder addItem(Item.Builder builder) {
            pa paVar = this.itemBuilder_;
            if (paVar == null) {
                ensureItemIsMutable();
                this.item_.add(builder.build());
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

        public Builder addItem(int i10, Item.Builder builder) {
            pa paVar = this.itemBuilder_;
            if (paVar == null) {
                ensureItemIsMutable();
                this.item_.add(i10, builder.build());
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
        public com.explorestack.protobuf.openrtb.Request.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Request.access$10400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.openrtb.Request r3 = (com.explorestack.protobuf.openrtb.Request) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.openrtb.Request r4 = (com.explorestack.protobuf.openrtb.Request) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Request$Builder");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Item extends k7 implements ItemOrBuilder {
        public static final int DEAL_FIELD_NUMBER = 11;
        public static final int DLVY_FIELD_NUMBER = 9;
        public static final int DT_FIELD_NUMBER = 8;
        public static final int EXP_FIELD_NUMBER = 7;
        public static final int EXT_FIELD_NUMBER = 15;
        public static final int EXT_PROTO_FIELD_NUMBER = 14;
        public static final int FLRCUR_FIELD_NUMBER = 6;
        public static final int FLR_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METRIC_FIELD_NUMBER = 10;
        public static final int PRIVATE_FIELD_NUMBER = 12;
        public static final int QTY_FIELD_NUMBER = 2;
        public static final int SEQ_FIELD_NUMBER = 3;
        public static final int SPEC_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private List<Deal> deal_;
        private int dlvy_;
        private volatile Object dt_;
        private int exp_;
        private List<Any> extProto_;
        private Struct ext_;
        private double flr_;
        private volatile Object flrcur_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private List<Metric> metric_;
        private boolean private_;
        private int qty_;
        private int seq_;
        private Any spec_;
        private static final Item DEFAULT_INSTANCE = new Item();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Request.Item.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Item parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Item(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Deal extends k7 implements DealOrBuilder {
            public static final int AT_FIELD_NUMBER = 4;
            public static final int EXT_FIELD_NUMBER = 8;
            public static final int EXT_PROTO_FIELD_NUMBER = 7;
            public static final int FLRCUR_FIELD_NUMBER = 3;
            public static final int FLR_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int WADOMAIN_FIELD_NUMBER = 6;
            public static final int WSEAT_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private int at_;
            private List<Any> extProto_;
            private Struct ext_;
            private double flr_;
            private volatile Object flrcur_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private g8 wadomain_;
            private g8 wseat_;
            private static final Deal DEFAULT_INSTANCE = new Deal();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Request.Item.Deal.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Deal parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Deal(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements DealOrBuilder {
                private int at_;
                private int bitField0_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private double flr_;
                private Object flrcur_;
                private Object id_;
                private g8 wadomain_;
                private g8 wseat_;

                private Builder() {
                    super(null);
                    this.id_ = "";
                    this.flrcur_ = "";
                    f8 f8Var = f8.f22138e;
                    this.wseat_ = f8Var;
                    this.wadomain_ = f8Var;
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 4;
                    }
                }

                private void ensureWadomainIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.wadomain_ = new f8(this.wadomain_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureWseatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.wseat_ = new f8(this.wseat_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return d.f22453k;
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
                        this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
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

                public Builder addAllWadomain(Iterable<String> iterable) {
                    ensureWadomainIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.wadomain_);
                    onChanged();
                    return this;
                }

                public Builder addAllWseat(Iterable<String> iterable) {
                    ensureWseatIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.wseat_);
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

                public Builder addWadomain(String str) {
                    str.getClass();
                    ensureWadomainIsMutable();
                    this.wadomain_.add((g8) str);
                    onChanged();
                    return this;
                }

                public Builder addWadomainBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    ensureWadomainIsMutable();
                    this.wadomain_.add(byteString);
                    onChanged();
                    return this;
                }

                public Builder addWseat(String str) {
                    str.getClass();
                    ensureWseatIsMutable();
                    this.wseat_.add((g8) str);
                    onChanged();
                    return this;
                }

                public Builder addWseatBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    ensureWseatIsMutable();
                    this.wseat_.add(byteString);
                    onChanged();
                    return this;
                }

                public Builder clearAt() {
                    this.at_ = 0;
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
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearFlr() {
                    this.flr_ = 0.0d;
                    onChanged();
                    return this;
                }

                public Builder clearFlrcur() {
                    this.flrcur_ = Deal.getDefaultInstance().getFlrcur();
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Deal.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearWadomain() {
                    this.wadomain_ = f8.f22138e;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearWseat() {
                    this.wseat_ = f8.f22138e;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public int getAt() {
                    return this.at_;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return d.f22453k;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
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

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
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

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public double getFlr() {
                    return this.flr_;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public String getFlrcur() {
                    Object obj = this.flrcur_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.flrcur_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ByteString getFlrcurBytes() {
                    Object obj = this.flrcur_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.flrcur_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public String getWadomain(int i10) {
                    return (String) this.wadomain_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ByteString getWadomainBytes(int i10) {
                    return this.wadomain_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public int getWadomainCount() {
                    return this.wadomain_.size();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public String getWseat(int i10) {
                    return (String) this.wseat_.get(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ByteString getWseatBytes(int i10) {
                    return this.wseat_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public int getWseatCount() {
                    return this.wseat_.size();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return d.f22454l.ensureFieldAccessorsInitialized(Deal.class, Builder.class);
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

                public Builder setAt(int i10) {
                    this.at_ = i10;
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

                public Builder setFlr(double d10) {
                    this.flr_ = d10;
                    onChanged();
                    return this;
                }

                public Builder setFlrcur(String str) {
                    str.getClass();
                    this.flrcur_ = str;
                    onChanged();
                    return this;
                }

                public Builder setFlrcurBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.flrcur_ = byteString;
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

                public Builder setWadomain(int i10, String str) {
                    str.getClass();
                    ensureWadomainIsMutable();
                    this.wadomain_.set(i10, (int) str);
                    onChanged();
                    return this;
                }

                public Builder setWseat(int i10, String str) {
                    str.getClass();
                    ensureWseatIsMutable();
                    this.wseat_.set(i10, (int) str);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ka getWadomainList() {
                    return this.wadomain_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
                public ka getWseatList() {
                    return this.wseat_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Deal build() {
                    Deal dealBuildPartial = buildPartial();
                    if (dealBuildPartial.isInitialized()) {
                        return dealBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) dealBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Deal buildPartial() {
                    Deal deal = new Deal(this);
                    deal.id_ = this.id_;
                    deal.flr_ = this.flr_;
                    deal.flrcur_ = this.flrcur_;
                    deal.at_ = this.at_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.wseat_ = this.wseat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    deal.wseat_ = this.wseat_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.wadomain_ = this.wadomain_.getUnmodifiableView();
                        this.bitField0_ &= -3;
                    }
                    deal.wadomain_ = this.wadomain_;
                    xa xaVar = this.extBuilder_;
                    if (xaVar == null) {
                        deal.ext_ = this.ext_;
                    } else {
                        deal.ext_ = (Struct) xaVar.build();
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        deal.extProto_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 4) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -5;
                        }
                        deal.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return deal;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Deal getDefaultInstanceForType() {
                    return Deal.getDefaultInstance();
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
                    this.id_ = "";
                    this.flr_ = 0.0d;
                    this.flrcur_ = "";
                    this.at_ = 0;
                    f8 f8Var = f8.f22138e;
                    this.wseat_ = f8Var;
                    int i10 = this.bitField0_;
                    this.wadomain_ = f8Var;
                    this.bitField0_ = i10 & (-4);
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar == null) {
                        this.extProto_ = Collections.EMPTY_LIST;
                        this.bitField0_ = i10 & (-8);
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
                    if (message instanceof Deal) {
                        return mergeFrom((Deal) message);
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
                    this.id_ = "";
                    this.flrcur_ = "";
                    f8 f8Var = f8.f22138e;
                    this.wseat_ = f8Var;
                    this.wadomain_ = f8Var;
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Deal deal) {
                    if (deal == Deal.getDefaultInstance()) {
                        return this;
                    }
                    if (!deal.getId().isEmpty()) {
                        this.id_ = deal.id_;
                        onChanged();
                    }
                    if (deal.getFlr() != 0.0d) {
                        setFlr(deal.getFlr());
                    }
                    if (!deal.getFlrcur().isEmpty()) {
                        this.flrcur_ = deal.flrcur_;
                        onChanged();
                    }
                    if (deal.getAt() != 0) {
                        setAt(deal.getAt());
                    }
                    if (!deal.wseat_.isEmpty()) {
                        if (this.wseat_.isEmpty()) {
                            this.wseat_ = deal.wseat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureWseatIsMutable();
                            this.wseat_.addAll(deal.wseat_);
                        }
                        onChanged();
                    }
                    if (!deal.wadomain_.isEmpty()) {
                        if (this.wadomain_.isEmpty()) {
                            this.wadomain_ = deal.wadomain_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureWadomainIsMutable();
                            this.wadomain_.addAll(deal.wadomain_);
                        }
                        onChanged();
                    }
                    if (deal.hasExt()) {
                        mergeExt(deal.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!deal.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = deal.extProto_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(deal.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!deal.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(deal.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = deal.extProto_;
                            this.bitField0_ &= -5;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) deal).unknownFields);
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
                public com.explorestack.protobuf.openrtb.Request.Item.Deal.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Request.Item.Deal.access$5000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.openrtb.Request$Item$Deal r3 = (com.explorestack.protobuf.openrtb.Request.Item.Deal) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.openrtb.Request$Item$Deal r4 = (com.explorestack.protobuf.openrtb.Request.Item.Deal) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Item.Deal.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Request$Item$Deal$Builder");
                }
            }

            public static Deal getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return d.f22453k;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Deal parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Deal) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Deal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Deal)) {
                    return super.equals(obj);
                }
                Deal deal = (Deal) obj;
                if (getId().equals(deal.getId()) && Double.doubleToLongBits(getFlr()) == Double.doubleToLongBits(deal.getFlr()) && getFlrcur().equals(deal.getFlrcur()) && getAt() == deal.getAt() && getWseatList().equals(deal.getWseatList()) && getWadomainList().equals(deal.getWadomainList()) && hasExt() == deal.hasExt()) {
                    return (!hasExt() || getExt().equals(deal.getExt())) && getExtProtoList().equals(deal.getExtProtoList()) && this.unknownFields.equals(deal.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public int getAt() {
                return this.at_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public double getFlr() {
                return this.flr_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public String getFlrcur() {
                Object obj = this.flrcur_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.flrcur_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ByteString getFlrcurBytes() {
                Object obj = this.flrcur_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.flrcur_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
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
                int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
                double d10 = this.flr_;
                if (d10 != 0.0d) {
                    iComputeStringSize += h0.computeDoubleSize(2, d10);
                }
                if (!getFlrcurBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(3, this.flrcur_);
                }
                int i11 = this.at_;
                if (i11 != 0) {
                    iComputeStringSize += h0.computeUInt32Size(4, i11);
                }
                int iE = 0;
                for (int i12 = 0; i12 < this.wseat_.size(); i12++) {
                    iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.wseat_, i12, iE);
                }
                int size = getWseatList().size() + iComputeStringSize + iE;
                int iE2 = 0;
                for (int i13 = 0; i13 < this.wadomain_.size(); i13++) {
                    iE2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.wadomain_, i13, iE2);
                }
                int size2 = getWadomainList().size() + size + iE2;
                for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                    size2 += h0.computeMessageSize(7, this.extProto_.get(i14));
                }
                if (this.ext_ != null) {
                    size2 += h0.computeMessageSize(8, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + size2;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public String getWadomain(int i10) {
                return (String) this.wadomain_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ByteString getWadomainBytes(int i10) {
                return this.wadomain_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public int getWadomainCount() {
                return this.wadomain_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public String getWseat(int i10) {
                return (String) this.wseat_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ByteString getWseatBytes(int i10) {
                return this.wseat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public int getWseatCount() {
                return this.wseat_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int at2 = getAt() + ((((getFlrcur().hashCode() + ((((x7.hashLong(Double.doubleToLongBits(getFlr())) + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53);
                if (getWseatCount() > 0) {
                    at2 = o2.B(at2, 37, 5, 53) + getWseatList().hashCode();
                }
                if (getWadomainCount() > 0) {
                    at2 = o2.B(at2, 37, 6, 53) + getWadomainList().hashCode();
                }
                if (hasExt()) {
                    at2 = o2.B(at2, 37, 8, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    at2 = o2.B(at2, 37, 7, 53) + getExtProtoList().hashCode();
                }
                int iHashCode = this.unknownFields.hashCode() + (at2 * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return d.f22454l.ensureFieldAccessorsInitialized(Deal.class, Builder.class);
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
                return new Deal();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.id_);
                }
                double d10 = this.flr_;
                if (d10 != 0.0d) {
                    h0Var.writeDouble(2, d10);
                }
                if (!getFlrcurBytes().isEmpty()) {
                    k7.writeString(h0Var, 3, this.flrcur_);
                }
                int i10 = this.at_;
                if (i10 != 0) {
                    h0Var.writeUInt32(4, i10);
                }
                int iF = 0;
                while (iF < this.wseat_.size()) {
                    iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.wseat_, iF, h0Var, 5, iF, 1);
                }
                int iF2 = 0;
                while (iF2 < this.wadomain_.size()) {
                    iF2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.wadomain_, iF2, h0Var, 6, iF2, 1);
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    h0Var.writeMessage(7, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    h0Var.writeMessage(8, getExt());
                }
                this.unknownFields.writeTo(h0Var);
            }

            public static Builder newBuilder(Deal deal) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(deal);
            }

            public static Deal parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(byteBuffer, m5Var);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ka getWadomainList() {
                return this.wadomain_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.DealOrBuilder
            public ka getWseatList() {
                return this.wseat_;
            }

            private Deal(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Deal parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Deal) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Deal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Deal getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Deal parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Deal() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.flrcur_ = "";
                f8 f8Var = f8.f22138e;
                this.wseat_ = f8Var;
                this.wadomain_ = f8Var;
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Deal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Deal parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Deal) PARSER.parseFrom(bArr, m5Var);
            }

            public static Deal parseFrom(InputStream inputStream) throws IOException {
                return (Deal) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Deal parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Deal) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Deal parseFrom(y yVar) throws IOException {
                return (Deal) k7.parseWithIOException(PARSER, yVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Deal(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                } else if (tag == 17) {
                                    this.flr_ = yVar.readDouble();
                                } else if (tag == 26) {
                                    this.flrcur_ = yVar.readStringRequireUtf8();
                                } else if (tag == 32) {
                                    this.at_ = yVar.readUInt32();
                                } else if (tag == 42) {
                                    String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                    if ((i10 & 1) == 0) {
                                        this.wseat_ = new f8();
                                        i10 |= 1;
                                    }
                                    this.wseat_.add((g8) stringRequireUtf8);
                                } else if (tag == 50) {
                                    String stringRequireUtf82 = yVar.readStringRequireUtf8();
                                    if ((i10 & 2) == 0) {
                                        this.wadomain_ = new f8();
                                        i10 |= 2;
                                    }
                                    this.wadomain_.add((g8) stringRequireUtf82);
                                } else if (tag == 58) {
                                    if ((i10 & 4) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 4;
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
                            this.wseat_ = this.wseat_.getUnmodifiableView();
                        }
                        if ((i10 & 2) != 0) {
                            this.wadomain_ = this.wadomain_.getUnmodifiableView();
                        }
                        if ((i10 & 4) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.wseat_ = this.wseat_.getUnmodifiableView();
                }
                if ((i10 & 2) != 0) {
                    this.wadomain_ = this.wadomain_.getUnmodifiableView();
                }
                if ((i10 & 4) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Deal parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Deal) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface DealOrBuilder extends MessageOrBuilder {
            int getAt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            g getExtProtoOrBuilder(int i10);

            List<? extends g> getExtProtoOrBuilderList();

            double getFlr();

            String getFlrcur();

            ByteString getFlrcurBytes();

            String getId();

            ByteString getIdBytes();

            String getWadomain(int i10);

            ByteString getWadomainBytes(int i10);

            int getWadomainCount();

            List<String> getWadomainList();

            String getWseat(int i10);

            ByteString getWseatBytes(int i10);

            int getWseatCount();

            List<String> getWseatList();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Metric extends k7 implements MetricOrBuilder {
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            public static final int VENDOR_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private List<Any> extProto_;
            private Struct ext_;
            private byte memoizedIsInitialized;
            private volatile Object type_;
            private float value_;
            private volatile Object vendor_;
            private static final Metric DEFAULT_INSTANCE = new Metric();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Request.Item.Metric.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Metric parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Metric(yVar, m5Var);
                }
            };

            public static Metric getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return d.f22451i;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Metric) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Metric)) {
                    return super.equals(obj);
                }
                Metric metric2 = (Metric) obj;
                if (getType().equals(metric2.getType()) && Float.floatToIntBits(getValue()) == Float.floatToIntBits(metric2.getValue()) && getVendor().equals(metric2.getVendor()) && hasExt() == metric2.hasExt()) {
                    return (!hasExt() || getExt().equals(metric2.getExt())) && getExtProtoList().equals(metric2.getExtProtoList()) && this.unknownFields.equals(metric2.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                return this.extProto_;
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
                int iComputeStringSize = !getTypeBytes().isEmpty() ? k7.computeStringSize(1, this.type_) : 0;
                float f10 = this.value_;
                if (f10 != 0.0f) {
                    iComputeStringSize += h0.computeFloatSize(2, f10);
                }
                if (!getVendorBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(3, this.vendor_);
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    iComputeStringSize += h0.computeMessageSize(4, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    iComputeStringSize += h0.computeMessageSize(5, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public float getValue() {
                return this.value_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public String getVendor() {
                Object obj = this.vendor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.vendor_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public ByteString getVendorBytes() {
                Object obj = this.vendor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.vendor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getVendor().hashCode() + ((((Float.floatToIntBits(getValue()) + ((((getType().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
                if (hasExt()) {
                    iHashCode = getExt().hashCode() + o2.B(iHashCode, 37, 5, 53);
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = getExtProtoList().hashCode() + o2.B(iHashCode, 37, 4, 53);
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return d.f22452j.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
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
                return new Metric();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getTypeBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.type_);
                }
                float f10 = this.value_;
                if (f10 != 0.0f) {
                    h0Var.writeFloat(2, f10);
                }
                if (!getVendorBytes().isEmpty()) {
                    k7.writeString(h0Var, 3, this.vendor_);
                }
                for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                    h0Var.writeMessage(4, this.extProto_.get(i10));
                }
                if (this.ext_ != null) {
                    h0Var.writeMessage(5, getExt());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements MetricOrBuilder {
                private int bitField0_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object type_;
                private float value_;
                private Object vendor_;

                private Builder() {
                    super(null);
                    this.type_ = "";
                    this.vendor_ = "";
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
                    return d.f22451i;
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

                public Builder clearType() {
                    this.type_ = Metric.getDefaultInstance().getType();
                    onChanged();
                    return this;
                }

                public Builder clearValue() {
                    this.value_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearVendor() {
                    this.vendor_ = Metric.getDefaultInstance().getVendor();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return d.f22451i;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
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

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
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

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public List<? extends g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public String getType() {
                    Object obj = this.type_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.type_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public ByteString getTypeBytes() {
                    Object obj = this.type_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.type_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public float getValue() {
                    return this.value_;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public String getVendor() {
                    Object obj = this.vendor_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.vendor_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public ByteString getVendorBytes() {
                    Object obj = this.vendor_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.vendor_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.openrtb.Request.Item.MetricOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return d.f22452j.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
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

                public Builder setType(String str) {
                    str.getClass();
                    this.type_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTypeBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.type_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setValue(float f10) {
                    this.value_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setVendor(String str) {
                    str.getClass();
                    this.vendor_ = str;
                    onChanged();
                    return this;
                }

                public Builder setVendorBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.vendor_ = byteString;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Metric build() {
                    Metric metricBuildPartial = buildPartial();
                    if (metricBuildPartial.isInitialized()) {
                        return metricBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) metricBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Metric buildPartial() {
                    Metric metric2 = new Metric(this);
                    metric2.type_ = this.type_;
                    metric2.value_ = this.value_;
                    metric2.vendor_ = this.vendor_;
                    xa xaVar = this.extBuilder_;
                    if (xaVar == null) {
                        metric2.ext_ = this.ext_;
                    } else {
                        metric2.ext_ = (Struct) xaVar.build();
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        metric2.extProto_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        metric2.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return metric2;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Metric getDefaultInstanceForType() {
                    return Metric.getDefaultInstance();
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
                    this.type_ = "";
                    this.value_ = 0.0f;
                    this.vendor_ = "";
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
                    if (message instanceof Metric) {
                        return mergeFrom((Metric) message);
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
                    this.type_ = "";
                    this.vendor_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Metric metric2) {
                    if (metric2 == Metric.getDefaultInstance()) {
                        return this;
                    }
                    if (!metric2.getType().isEmpty()) {
                        this.type_ = metric2.type_;
                        onChanged();
                    }
                    if (metric2.getValue() != 0.0f) {
                        setValue(metric2.getValue());
                    }
                    if (!metric2.getVendor().isEmpty()) {
                        this.vendor_ = metric2.vendor_;
                        onChanged();
                    }
                    if (metric2.hasExt()) {
                        mergeExt(metric2.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!metric2.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = metric2.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(metric2.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!metric2.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(metric2.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = metric2.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) metric2).unknownFields);
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
                public com.explorestack.protobuf.openrtb.Request.Item.Metric.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Request.Item.Metric.access$3200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.openrtb.Request$Item$Metric r3 = (com.explorestack.protobuf.openrtb.Request.Item.Metric) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.openrtb.Request$Item$Metric r4 = (com.explorestack.protobuf.openrtb.Request.Item.Metric) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Item.Metric.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Request$Item$Metric$Builder");
                }
            }

            public static Builder newBuilder(Metric metric2) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metric2);
            }

            public static Metric parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Metric(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Metric parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Metric) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Metric getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Metric parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Metric() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = "";
                this.vendor_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Metric parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Metric) PARSER.parseFrom(bArr, m5Var);
            }

            public static Metric parseFrom(InputStream inputStream) throws IOException {
                return (Metric) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Metric parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Metric) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Metric(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        try {
                            try {
                                int tag = yVar.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.type_ = yVar.readStringRequireUtf8();
                                    } else if (tag == 21) {
                                        this.value_ = yVar.readFloat();
                                    } else if (tag == 26) {
                                        this.vendor_ = yVar.readStringRequireUtf8();
                                    } else if (tag == 34) {
                                        if (!z11) {
                                            this.extProto_ = new ArrayList();
                                            z11 = true;
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

            public static Metric parseFrom(y yVar) throws IOException {
                return (Metric) k7.parseWithIOException(PARSER, yVar);
            }

            public static Metric parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Metric) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface MetricOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            g getExtProtoOrBuilder(int i10);

            List<? extends g> getExtProtoOrBuilderList();

            String getType();

            ByteString getTypeBytes();

            float getValue();

            String getVendor();

            ByteString getVendorBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Item getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return d.f22449g;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Item parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Item) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Item parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return super.equals(obj);
            }
            Item item = (Item) obj;
            if (!getId().equals(item.getId()) || getQty() != item.getQty() || getSeq() != item.getSeq() || Double.doubleToLongBits(getFlr()) != Double.doubleToLongBits(item.getFlr()) || !getFlrcur().equals(item.getFlrcur()) || getExp() != item.getExp() || !getDt().equals(item.getDt()) || getDlvy() != item.getDlvy() || !getMetricList().equals(item.getMetricList()) || !getDealList().equals(item.getDealList()) || getPrivate() != item.getPrivate() || hasSpec() != item.hasSpec()) {
                return false;
            }
            if ((!hasSpec() || getSpec().equals(item.getSpec())) && hasExt() == item.hasExt()) {
                return (!hasExt() || getExt().equals(item.getExt())) && getExtProtoList().equals(item.getExtProtoList()) && this.unknownFields.equals(item.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Deal getDeal(int i10) {
            return this.deal_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getDealCount() {
            return this.deal_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<Deal> getDealList() {
            return this.deal_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public DealOrBuilder getDealOrBuilder(int i10) {
            return this.deal_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<? extends DealOrBuilder> getDealOrBuilderList() {
            return this.deal_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getDlvy() {
            return this.dlvy_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public String getDt() {
            Object obj = this.dt_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.dt_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public ByteString getDtBytes() {
            Object obj = this.dt_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.dt_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getExp() {
            return this.exp_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public double getFlr() {
            return this.flr_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public String getFlrcur() {
            Object obj = this.flrcur_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.flrcur_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public ByteString getFlrcurBytes() {
            Object obj = this.flrcur_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.flrcur_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Metric getMetric(int i10) {
            return this.metric_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getMetricCount() {
            return this.metric_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<Metric> getMetricList() {
            return this.metric_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public MetricOrBuilder getMetricOrBuilder(int i10) {
            return this.metric_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public List<? extends MetricOrBuilder> getMetricOrBuilderList() {
            return this.metric_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public boolean getPrivate() {
            return this.private_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getQty() {
            return this.qty_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public int getSeq() {
            return this.seq_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
            int i11 = this.qty_;
            if (i11 != 0) {
                iComputeStringSize += h0.computeUInt32Size(2, i11);
            }
            int i12 = this.seq_;
            if (i12 != 0) {
                iComputeStringSize += h0.computeUInt32Size(3, i12);
            }
            double d10 = this.flr_;
            if (d10 != 0.0d) {
                iComputeStringSize += h0.computeDoubleSize(4, d10);
            }
            if (!getFlrcurBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(6, this.flrcur_);
            }
            int i13 = this.exp_;
            if (i13 != 0) {
                iComputeStringSize += h0.computeUInt32Size(7, i13);
            }
            if (!getDtBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(8, this.dt_);
            }
            int i14 = this.dlvy_;
            if (i14 != 0) {
                iComputeStringSize += h0.computeUInt32Size(9, i14);
            }
            for (int i15 = 0; i15 < this.metric_.size(); i15++) {
                iComputeStringSize += h0.computeMessageSize(10, this.metric_.get(i15));
            }
            for (int i16 = 0; i16 < this.deal_.size(); i16++) {
                iComputeStringSize += h0.computeMessageSize(11, this.deal_.get(i16));
            }
            boolean z10 = this.private_;
            if (z10) {
                iComputeStringSize += h0.computeBoolSize(12, z10);
            }
            if (this.spec_ != null) {
                iComputeStringSize += h0.computeMessageSize(13, getSpec());
            }
            for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
                iComputeStringSize += h0.computeMessageSize(14, this.extProto_.get(i17));
            }
            if (this.ext_ != null) {
                iComputeStringSize += h0.computeMessageSize(15, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public Any getSpec() {
            Any any = this.spec_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public g getSpecOrBuilder() {
            return getSpec();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
        public boolean hasSpec() {
            return this.spec_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int dlvy = getDlvy() + ((((getDt().hashCode() + ((((getExp() + ((((getFlrcur().hashCode() + ((((x7.hashLong(Double.doubleToLongBits(getFlr())) + ((((getSeq() + ((((getQty() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53);
            if (getMetricCount() > 0) {
                dlvy = o2.B(dlvy, 37, 10, 53) + getMetricList().hashCode();
            }
            if (getDealCount() > 0) {
                dlvy = o2.B(dlvy, 37, 11, 53) + getDealList().hashCode();
            }
            int iHashBoolean = x7.hashBoolean(getPrivate()) + o2.B(dlvy, 37, 12, 53);
            if (hasSpec()) {
                iHashBoolean = getSpec().hashCode() + o2.B(iHashBoolean, 37, 13, 53);
            }
            if (hasExt()) {
                iHashBoolean = getExt().hashCode() + o2.B(iHashBoolean, 37, 15, 53);
            }
            if (getExtProtoCount() > 0) {
                iHashBoolean = getExtProtoList().hashCode() + o2.B(iHashBoolean, 37, 14, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashBoolean * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return d.f22450h.ensureFieldAccessorsInitialized(Item.class, Builder.class);
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
            return new Item();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getIdBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.id_);
            }
            int i10 = this.qty_;
            if (i10 != 0) {
                h0Var.writeUInt32(2, i10);
            }
            int i11 = this.seq_;
            if (i11 != 0) {
                h0Var.writeUInt32(3, i11);
            }
            double d10 = this.flr_;
            if (d10 != 0.0d) {
                h0Var.writeDouble(4, d10);
            }
            if (!getFlrcurBytes().isEmpty()) {
                k7.writeString(h0Var, 6, this.flrcur_);
            }
            int i12 = this.exp_;
            if (i12 != 0) {
                h0Var.writeUInt32(7, i12);
            }
            if (!getDtBytes().isEmpty()) {
                k7.writeString(h0Var, 8, this.dt_);
            }
            int i13 = this.dlvy_;
            if (i13 != 0) {
                h0Var.writeUInt32(9, i13);
            }
            for (int i14 = 0; i14 < this.metric_.size(); i14++) {
                h0Var.writeMessage(10, this.metric_.get(i14));
            }
            for (int i15 = 0; i15 < this.deal_.size(); i15++) {
                h0Var.writeMessage(11, this.deal_.get(i15));
            }
            boolean z10 = this.private_;
            if (z10) {
                h0Var.writeBool(12, z10);
            }
            if (this.spec_ != null) {
                h0Var.writeMessage(13, getSpec());
            }
            for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
                h0Var.writeMessage(14, this.extProto_.get(i16));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(15, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements ItemOrBuilder {
            private int bitField0_;
            private pa dealBuilder_;
            private List<Deal> deal_;
            private int dlvy_;
            private Object dt_;
            private int exp_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private double flr_;
            private Object flrcur_;
            private Object id_;
            private pa metricBuilder_;
            private List<Metric> metric_;
            private boolean private_;
            private int qty_;
            private int seq_;
            private xa specBuilder_;
            private Any spec_;

            private Builder() {
                super(null);
                this.id_ = "";
                this.flrcur_ = "";
                this.dt_ = "";
                List list = Collections.EMPTY_LIST;
                this.metric_ = list;
                this.deal_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureDealIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.deal_ = new ArrayList(this.deal_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureMetricIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.metric_ = new ArrayList(this.metric_);
                    this.bitField0_ |= 1;
                }
            }

            private pa getDealFieldBuilder() {
                if (this.dealBuilder_ == null) {
                    this.dealBuilder_ = new pa(this.deal_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.deal_ = null;
                }
                return this.dealBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return d.f22449g;
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
                    this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private pa getMetricFieldBuilder() {
                if (this.metricBuilder_ == null) {
                    this.metricBuilder_ = new pa(this.metric_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.metric_ = null;
                }
                return this.metricBuilder_;
            }

            private xa getSpecFieldBuilder() {
                if (this.specBuilder_ == null) {
                    this.specBuilder_ = new xa(getSpec(), getParentForChildren(), isClean());
                    this.spec_ = null;
                }
                return this.specBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getMetricFieldBuilder();
                    getDealFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllDeal(Iterable<? extends Deal> iterable) {
                pa paVar = this.dealBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureDealIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.deal_);
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

            public Builder addAllMetric(Iterable<? extends Metric> iterable) {
                pa paVar = this.metricBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureMetricIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.metric_);
                onChanged();
                return this;
            }

            public Builder addDeal(Deal deal) {
                pa paVar = this.dealBuilder_;
                if (paVar != null) {
                    paVar.addMessage(deal);
                    return this;
                }
                deal.getClass();
                ensureDealIsMutable();
                this.deal_.add(deal);
                onChanged();
                return this;
            }

            public Deal.Builder addDealBuilder() {
                return (Deal.Builder) getDealFieldBuilder().addBuilder(Deal.getDefaultInstance());
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

            public Builder addMetric(Metric metric2) {
                pa paVar = this.metricBuilder_;
                if (paVar != null) {
                    paVar.addMessage(metric2);
                    return this;
                }
                metric2.getClass();
                ensureMetricIsMutable();
                this.metric_.add(metric2);
                onChanged();
                return this;
            }

            public Metric.Builder addMetricBuilder() {
                return (Metric.Builder) getMetricFieldBuilder().addBuilder(Metric.getDefaultInstance());
            }

            public Builder clearDeal() {
                pa paVar = this.dealBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.deal_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearDlvy() {
                this.dlvy_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDt() {
                this.dt_ = Item.getDefaultInstance().getDt();
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
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearFlr() {
                this.flr_ = 0.0d;
                onChanged();
                return this;
            }

            public Builder clearFlrcur() {
                this.flrcur_ = Item.getDefaultInstance().getFlrcur();
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.id_ = Item.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearMetric() {
                pa paVar = this.metricBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.metric_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearPrivate() {
                this.private_ = false;
                onChanged();
                return this;
            }

            public Builder clearQty() {
                this.qty_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSeq() {
                this.seq_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSpec() {
                if (this.specBuilder_ == null) {
                    this.spec_ = null;
                    onChanged();
                    return this;
                }
                this.spec_ = null;
                this.specBuilder_ = null;
                return this;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public Deal getDeal(int i10) {
                pa paVar = this.dealBuilder_;
                return paVar == null ? this.deal_.get(i10) : (Deal) paVar.getMessage(i10);
            }

            public Deal.Builder getDealBuilder(int i10) {
                return (Deal.Builder) getDealFieldBuilder().getBuilder(i10);
            }

            public List<Deal.Builder> getDealBuilderList() {
                return getDealFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getDealCount() {
                pa paVar = this.dealBuilder_;
                return paVar == null ? this.deal_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<Deal> getDealList() {
                pa paVar = this.dealBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.deal_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public DealOrBuilder getDealOrBuilder(int i10) {
                pa paVar = this.dealBuilder_;
                return paVar == null ? this.deal_.get(i10) : (DealOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<? extends DealOrBuilder> getDealOrBuilderList() {
                pa paVar = this.dealBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.deal_);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return d.f22449g;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getDlvy() {
                return this.dlvy_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public String getDt() {
                Object obj = this.dt_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.dt_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public ByteString getDtBytes() {
                Object obj = this.dt_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.dt_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getExp() {
                return this.exp_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
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

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
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

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public double getFlr() {
                return this.flr_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public String getFlrcur() {
                Object obj = this.flrcur_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.flrcur_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public ByteString getFlrcurBytes() {
                Object obj = this.flrcur_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.flrcur_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public Metric getMetric(int i10) {
                pa paVar = this.metricBuilder_;
                return paVar == null ? this.metric_.get(i10) : (Metric) paVar.getMessage(i10);
            }

            public Metric.Builder getMetricBuilder(int i10) {
                return (Metric.Builder) getMetricFieldBuilder().getBuilder(i10);
            }

            public List<Metric.Builder> getMetricBuilderList() {
                return getMetricFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getMetricCount() {
                pa paVar = this.metricBuilder_;
                return paVar == null ? this.metric_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<Metric> getMetricList() {
                pa paVar = this.metricBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.metric_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public MetricOrBuilder getMetricOrBuilder(int i10) {
                pa paVar = this.metricBuilder_;
                return paVar == null ? this.metric_.get(i10) : (MetricOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public List<? extends MetricOrBuilder> getMetricOrBuilderList() {
                pa paVar = this.metricBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.metric_);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public boolean getPrivate() {
                return this.private_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getQty() {
                return this.qty_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public int getSeq() {
                return this.seq_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public Any getSpec() {
                xa xaVar = this.specBuilder_;
                if (xaVar != null) {
                    return (Any) xaVar.getMessage();
                }
                Any any = this.spec_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public Any.Builder getSpecBuilder() {
                onChanged();
                return (Any.Builder) getSpecFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public g getSpecOrBuilder() {
                xa xaVar = this.specBuilder_;
                if (xaVar != null) {
                    return (g) xaVar.getMessageOrBuilder();
                }
                Any any = this.spec_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.ItemOrBuilder
            public boolean hasSpec() {
                return (this.specBuilder_ == null && this.spec_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return d.f22450h.ensureFieldAccessorsInitialized(Item.class, Builder.class);
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

            public Builder mergeSpec(Any any) {
                xa xaVar = this.specBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(any);
                    return this;
                }
                Any any2 = this.spec_;
                if (any2 != null) {
                    this.spec_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                } else {
                    this.spec_ = any;
                }
                onChanged();
                return this;
            }

            public Builder removeDeal(int i10) {
                pa paVar = this.dealBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureDealIsMutable();
                this.deal_.remove(i10);
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

            public Builder removeMetric(int i10) {
                pa paVar = this.metricBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureMetricIsMutable();
                this.metric_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setDeal(int i10, Deal deal) {
                pa paVar = this.dealBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, deal);
                    return this;
                }
                deal.getClass();
                ensureDealIsMutable();
                this.deal_.set(i10, deal);
                onChanged();
                return this;
            }

            public Builder setDlvy(int i10) {
                this.dlvy_ = i10;
                onChanged();
                return this;
            }

            public Builder setDt(String str) {
                str.getClass();
                this.dt_ = str;
                onChanged();
                return this;
            }

            public Builder setDtBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.dt_ = byteString;
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

            public Builder setFlr(double d10) {
                this.flr_ = d10;
                onChanged();
                return this;
            }

            public Builder setFlrcur(String str) {
                str.getClass();
                this.flrcur_ = str;
                onChanged();
                return this;
            }

            public Builder setFlrcurBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.flrcur_ = byteString;
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

            public Builder setMetric(int i10, Metric metric2) {
                pa paVar = this.metricBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, metric2);
                    return this;
                }
                metric2.getClass();
                ensureMetricIsMutable();
                this.metric_.set(i10, metric2);
                onChanged();
                return this;
            }

            public Builder setPrivate(boolean z10) {
                this.private_ = z10;
                onChanged();
                return this;
            }

            public Builder setQty(int i10) {
                this.qty_ = i10;
                onChanged();
                return this;
            }

            public Builder setSeq(int i10) {
                this.seq_ = i10;
                onChanged();
                return this;
            }

            public Builder setSpec(Any any) {
                xa xaVar = this.specBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(any);
                    return this;
                }
                any.getClass();
                this.spec_ = any;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Item build() {
                Item itemBuildPartial = buildPartial();
                if (itemBuildPartial.isInitialized()) {
                    return itemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Item buildPartial() {
                Item item = new Item(this);
                item.id_ = this.id_;
                item.qty_ = this.qty_;
                item.seq_ = this.seq_;
                item.flr_ = this.flr_;
                item.flrcur_ = this.flrcur_;
                item.exp_ = this.exp_;
                item.dt_ = this.dt_;
                item.dlvy_ = this.dlvy_;
                pa paVar = this.metricBuilder_;
                if (paVar != null) {
                    item.metric_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.metric_ = Collections.unmodifiableList(this.metric_);
                        this.bitField0_ &= -2;
                    }
                    item.metric_ = this.metric_;
                }
                pa paVar2 = this.dealBuilder_;
                if (paVar2 != null) {
                    item.deal_ = paVar2.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.deal_ = Collections.unmodifiableList(this.deal_);
                        this.bitField0_ &= -3;
                    }
                    item.deal_ = this.deal_;
                }
                item.private_ = this.private_;
                xa xaVar = this.specBuilder_;
                if (xaVar == null) {
                    item.spec_ = this.spec_;
                } else {
                    item.spec_ = (Any) xaVar.build();
                }
                xa xaVar2 = this.extBuilder_;
                if (xaVar2 == null) {
                    item.ext_ = this.ext_;
                } else {
                    item.ext_ = (Struct) xaVar2.build();
                }
                pa paVar3 = this.extProtoBuilder_;
                if (paVar3 != null) {
                    item.extProto_ = paVar3.build();
                } else {
                    if ((this.bitField0_ & 4) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -5;
                    }
                    item.extProto_ = this.extProto_;
                }
                onBuilt();
                return item;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Item getDefaultInstanceForType() {
                return Item.getDefaultInstance();
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

            public Deal.Builder addDealBuilder(int i10) {
                return (Deal.Builder) getDealFieldBuilder().addBuilder(i10, Deal.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().addBuilder(i10, Any.getDefaultInstance());
            }

            public Metric.Builder addMetricBuilder(int i10) {
                return (Metric.Builder) getMetricFieldBuilder().addBuilder(i10, Metric.getDefaultInstance());
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
                this.qty_ = 0;
                this.seq_ = 0;
                this.flr_ = 0.0d;
                this.flrcur_ = "";
                this.exp_ = 0;
                this.dt_ = "";
                this.dlvy_ = 0;
                pa paVar = this.metricBuilder_;
                if (paVar == null) {
                    this.metric_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                } else {
                    paVar.clear();
                }
                pa paVar2 = this.dealBuilder_;
                if (paVar2 == null) {
                    this.deal_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                } else {
                    paVar2.clear();
                }
                this.private_ = false;
                if (this.specBuilder_ == null) {
                    this.spec_ = null;
                } else {
                    this.spec_ = null;
                    this.specBuilder_ = null;
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                pa paVar3 = this.extProtoBuilder_;
                if (paVar3 == null) {
                    this.extProto_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -5;
                    return this;
                }
                paVar3.clear();
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

            public Builder setSpec(Any.Builder builder) {
                xa xaVar = this.specBuilder_;
                if (xaVar == null) {
                    this.spec_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder addDeal(int i10, Deal deal) {
                pa paVar = this.dealBuilder_;
                if (paVar == null) {
                    deal.getClass();
                    ensureDealIsMutable();
                    this.deal_.add(i10, deal);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, deal);
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

            public Builder addMetric(int i10, Metric metric2) {
                pa paVar = this.metricBuilder_;
                if (paVar == null) {
                    metric2.getClass();
                    ensureMetricIsMutable();
                    this.metric_.add(i10, metric2);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, metric2);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Item) {
                    return mergeFrom((Item) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDeal(int i10, Deal.Builder builder) {
                pa paVar = this.dealBuilder_;
                if (paVar == null) {
                    ensureDealIsMutable();
                    this.deal_.set(i10, builder.build());
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

            public Builder setMetric(int i10, Metric.Builder builder) {
                pa paVar = this.metricBuilder_;
                if (paVar == null) {
                    ensureMetricIsMutable();
                    this.metric_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Item item) {
                if (item == Item.getDefaultInstance()) {
                    return this;
                }
                if (!item.getId().isEmpty()) {
                    this.id_ = item.id_;
                    onChanged();
                }
                if (item.getQty() != 0) {
                    setQty(item.getQty());
                }
                if (item.getSeq() != 0) {
                    setSeq(item.getSeq());
                }
                if (item.getFlr() != 0.0d) {
                    setFlr(item.getFlr());
                }
                if (!item.getFlrcur().isEmpty()) {
                    this.flrcur_ = item.flrcur_;
                    onChanged();
                }
                if (item.getExp() != 0) {
                    setExp(item.getExp());
                }
                if (!item.getDt().isEmpty()) {
                    this.dt_ = item.dt_;
                    onChanged();
                }
                if (item.getDlvy() != 0) {
                    setDlvy(item.getDlvy());
                }
                if (this.metricBuilder_ == null) {
                    if (!item.metric_.isEmpty()) {
                        if (this.metric_.isEmpty()) {
                            this.metric_ = item.metric_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMetricIsMutable();
                            this.metric_.addAll(item.metric_);
                        }
                        onChanged();
                    }
                } else if (!item.metric_.isEmpty()) {
                    if (!this.metricBuilder_.isEmpty()) {
                        this.metricBuilder_.addAllMessages(item.metric_);
                    } else {
                        this.metricBuilder_.dispose();
                        this.metricBuilder_ = null;
                        this.metric_ = item.metric_;
                        this.bitField0_ &= -2;
                        this.metricBuilder_ = k7.alwaysUseFieldBuilders ? getMetricFieldBuilder() : null;
                    }
                }
                if (this.dealBuilder_ == null) {
                    if (!item.deal_.isEmpty()) {
                        if (this.deal_.isEmpty()) {
                            this.deal_ = item.deal_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureDealIsMutable();
                            this.deal_.addAll(item.deal_);
                        }
                        onChanged();
                    }
                } else if (!item.deal_.isEmpty()) {
                    if (!this.dealBuilder_.isEmpty()) {
                        this.dealBuilder_.addAllMessages(item.deal_);
                    } else {
                        this.dealBuilder_.dispose();
                        this.dealBuilder_ = null;
                        this.deal_ = item.deal_;
                        this.bitField0_ &= -3;
                        this.dealBuilder_ = k7.alwaysUseFieldBuilders ? getDealFieldBuilder() : null;
                    }
                }
                if (item.getPrivate()) {
                    setPrivate(item.getPrivate());
                }
                if (item.hasSpec()) {
                    mergeSpec(item.getSpec());
                }
                if (item.hasExt()) {
                    mergeExt(item.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!item.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = item.extProto_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(item.extProto_);
                        }
                        onChanged();
                    }
                } else if (!item.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(item.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = item.extProto_;
                        this.bitField0_ &= -5;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) item).unknownFields);
                onChanged();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                String str = GalEuEfxjome.HeLthaykpu;
                this.id_ = str;
                this.flrcur_ = str;
                this.dt_ = str;
                List list = Collections.EMPTY_LIST;
                this.metric_ = list;
                this.deal_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addDeal(Deal.Builder builder) {
                pa paVar = this.dealBuilder_;
                if (paVar == null) {
                    ensureDealIsMutable();
                    this.deal_.add(builder.build());
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

            public Builder addMetric(Metric.Builder builder) {
                pa paVar = this.metricBuilder_;
                if (paVar == null) {
                    ensureMetricIsMutable();
                    this.metric_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addDeal(int i10, Deal.Builder builder) {
                pa paVar = this.dealBuilder_;
                if (paVar == null) {
                    ensureDealIsMutable();
                    this.deal_.add(i10, builder.build());
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

            public Builder addMetric(int i10, Metric.Builder builder) {
                pa paVar = this.metricBuilder_;
                if (paVar == null) {
                    ensureMetricIsMutable();
                    this.metric_.add(i10, builder.build());
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
            public com.explorestack.protobuf.openrtb.Request.Item.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Request.Item.access$7800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.openrtb.Request$Item r3 = (com.explorestack.protobuf.openrtb.Request.Item) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.openrtb.Request$Item r4 = (com.explorestack.protobuf.openrtb.Request.Item) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Item.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Request$Item$Builder");
            }
        }

        public static Builder newBuilder(Item item) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(item);
        }

        public static Item parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Item(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Item parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Item) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Item parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Item getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Item parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Item() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.flrcur_ = "";
            this.dt_ = "";
            List list = Collections.EMPTY_LIST;
            this.metric_ = list;
            this.deal_ = list;
            this.extProto_ = list;
        }

        public static Item parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Item parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Item) PARSER.parseFrom(bArr, m5Var);
        }

        public static Item parseFrom(InputStream inputStream) throws IOException {
            return (Item) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Item parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Item) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Item parseFrom(y yVar) throws IOException {
            return (Item) k7.parseWithIOException(PARSER, yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        private Item(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            case 16:
                                this.qty_ = yVar.readUInt32();
                            case 24:
                                this.seq_ = yVar.readUInt32();
                            case 33:
                                this.flr_ = yVar.readDouble();
                            case 50:
                                this.flrcur_ = yVar.readStringRequireUtf8();
                            case 56:
                                this.exp_ = yVar.readUInt32();
                            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                this.dt_ = yVar.readStringRequireUtf8();
                            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                                this.dlvy_ = yVar.readUInt32();
                            case 82:
                                int i10 = (c10 == true ? 1 : 0) & 1;
                                c10 = c10;
                                if (i10 == 0) {
                                    this.metric_ = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 1;
                                }
                                this.metric_.add(yVar.readMessage(Metric.parser(), m5Var));
                            case 90:
                                int i11 = (c10 == true ? 1 : 0) & 2;
                                c10 = c10;
                                if (i11 == 0) {
                                    this.deal_ = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 2;
                                }
                                this.deal_.add(yVar.readMessage(Deal.parser(), m5Var));
                            case 96:
                                this.private_ = yVar.readBool();
                            case 106:
                                Any any = this.spec_;
                                Any.Builder builder = any != null ? any.toBuilder() : null;
                                Any any2 = (Any) yVar.readMessage(Any.parser(), m5Var);
                                this.spec_ = any2;
                                if (builder != null) {
                                    builder.mergeFrom(any2);
                                    this.spec_ = builder.buildPartial();
                                }
                            case 114:
                                int i12 = (c10 == true ? 1 : 0) & 4;
                                c10 = c10;
                                if (i12 == 0) {
                                    this.extProto_ = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 4;
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
                        this.metric_ = Collections.unmodifiableList(this.metric_);
                    }
                    if (((c10 == true ? 1 : 0) & 2) != 0) {
                        this.deal_ = Collections.unmodifiableList(this.deal_);
                    }
                    if (((c10 == true ? 1 : 0) & 4) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((c10 == true ? 1 : 0) & 1) != 0) {
                this.metric_ = Collections.unmodifiableList(this.metric_);
            }
            if (((c10 == true ? 1 : 0) & 2) != 0) {
                this.deal_ = Collections.unmodifiableList(this.deal_);
            }
            if (((c10 == true ? 1 : 0) & 4) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Item parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Item) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ItemOrBuilder extends MessageOrBuilder {
        Item.Deal getDeal(int i10);

        int getDealCount();

        List<Item.Deal> getDealList();

        Item.DealOrBuilder getDealOrBuilder(int i10);

        List<? extends Item.DealOrBuilder> getDealOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getDlvy();

        String getDt();

        ByteString getDtBytes();

        int getExp();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        g getExtProtoOrBuilder(int i10);

        List<? extends g> getExtProtoOrBuilderList();

        double getFlr();

        String getFlrcur();

        ByteString getFlrcurBytes();

        String getId();

        ByteString getIdBytes();

        Item.Metric getMetric(int i10);

        int getMetricCount();

        List<Item.Metric> getMetricList();

        Item.MetricOrBuilder getMetricOrBuilder(int i10);

        List<? extends Item.MetricOrBuilder> getMetricOrBuilderList();

        boolean getPrivate();

        int getQty();

        int getSeq();

        Any getSpec();

        g getSpecOrBuilder();

        boolean hasExt();

        boolean hasSpec();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Source extends k7 implements SourceOrBuilder {
        public static final int CERT_FIELD_NUMBER = 5;
        public static final int DIGEST_FIELD_NUMBER = 4;
        public static final int DSGVER_FIELD_NUMBER = 3;
        public static final int DS_FIELD_NUMBER = 2;
        public static final int EXT_FIELD_NUMBER = 8;
        public static final int EXT_PROTO_FIELD_NUMBER = 7;
        public static final int PCHAIN_FIELD_NUMBER = 6;
        public static final int TID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object cert_;
        private volatile Object digest_;
        private volatile Object ds_;
        private int dsgver_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private volatile Object pchain_;
        private volatile Object tid_;
        private static final Source DEFAULT_INSTANCE = new Source();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.openrtb.Request.Source.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Source parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Source(yVar, m5Var);
            }
        };

        public static Source getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return d.f22447e;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Source parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Source) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Source parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Source)) {
                return super.equals(obj);
            }
            Source source = (Source) obj;
            if (getTid().equals(source.getTid()) && getDs().equals(source.getDs()) && getDsgver() == source.getDsgver() && getDigest().equals(source.getDigest()) && getCert().equals(source.getCert()) && getPchain().equals(source.getPchain()) && hasExt() == source.hasExt()) {
                return (!hasExt() || getExt().equals(source.getExt())) && getExtProtoList().equals(source.getExtProtoList()) && this.unknownFields.equals(source.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getCert() {
            Object obj = this.cert_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cert_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getCertBytes() {
            Object obj = this.cert_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cert_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getDigest() {
            Object obj = this.digest_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.digest_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getDigestBytes() {
            Object obj = this.digest_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.digest_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getDs() {
            Object obj = this.ds_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ds_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getDsBytes() {
            Object obj = this.ds_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ds_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public int getDsgver() {
            return this.dsgver_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public List<? extends g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getPchain() {
            Object obj = this.pchain_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.pchain_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getPchainBytes() {
            Object obj = this.pchain_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pchain_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getTidBytes().isEmpty() ? k7.computeStringSize(1, this.tid_) : 0;
            if (!getDsBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(2, this.ds_);
            }
            int i11 = this.dsgver_;
            if (i11 != 0) {
                iComputeStringSize += h0.computeUInt32Size(3, i11);
            }
            if (!getDigestBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(4, this.digest_);
            }
            if (!getCertBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(5, this.cert_);
            }
            if (!getPchainBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(6, this.pchain_);
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

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public String getTid() {
            Object obj = this.tid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public ByteString getTidBytes() {
            Object obj = this.tid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getPchain().hashCode() + ((((getCert().hashCode() + ((((getDigest().hashCode() + ((((getDsgver() + ((((getDs().hashCode() + ((((getTid().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53);
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
            return d.f22448f.ensureFieldAccessorsInitialized(Source.class, Builder.class);
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
            return new Source();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getTidBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.tid_);
            }
            if (!getDsBytes().isEmpty()) {
                k7.writeString(h0Var, 2, this.ds_);
            }
            int i10 = this.dsgver_;
            if (i10 != 0) {
                h0Var.writeUInt32(3, i10);
            }
            if (!getDigestBytes().isEmpty()) {
                k7.writeString(h0Var, 4, this.digest_);
            }
            if (!getCertBytes().isEmpty()) {
                k7.writeString(h0Var, 5, this.cert_);
            }
            if (!getPchainBytes().isEmpty()) {
                k7.writeString(h0Var, 6, this.pchain_);
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
        public static final class Builder extends o6 implements SourceOrBuilder {
            private int bitField0_;
            private Object cert_;
            private Object digest_;
            private Object ds_;
            private int dsgver_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object pchain_;
            private Object tid_;

            private Builder() {
                super(null);
                this.tid_ = "";
                this.ds_ = "";
                this.digest_ = "";
                this.cert_ = "";
                this.pchain_ = "";
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
                return d.f22447e;
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

            public Builder clearCert() {
                this.cert_ = Source.getDefaultInstance().getCert();
                onChanged();
                return this;
            }

            public Builder clearDigest() {
                this.digest_ = Source.getDefaultInstance().getDigest();
                onChanged();
                return this;
            }

            public Builder clearDs() {
                this.ds_ = Source.getDefaultInstance().getDs();
                onChanged();
                return this;
            }

            public Builder clearDsgver() {
                this.dsgver_ = 0;
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
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearPchain() {
                this.pchain_ = Source.getDefaultInstance().getPchain();
                onChanged();
                return this;
            }

            public Builder clearTid() {
                this.tid_ = Source.getDefaultInstance().getTid();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getCert() {
                Object obj = this.cert_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cert_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getCertBytes() {
                Object obj = this.cert_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cert_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return d.f22447e;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getDigest() {
                Object obj = this.digest_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.digest_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getDigestBytes() {
                Object obj = this.digest_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.digest_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getDs() {
                Object obj = this.ds_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ds_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getDsBytes() {
                Object obj = this.ds_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ds_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public int getDsgver() {
                return this.dsgver_;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
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

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
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

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public List<? extends g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getPchain() {
                Object obj = this.pchain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.pchain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getPchainBytes() {
                Object obj = this.pchain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.pchain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public String getTid() {
                Object obj = this.tid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public ByteString getTidBytes() {
                Object obj = this.tid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.openrtb.Request.SourceOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return d.f22448f.ensureFieldAccessorsInitialized(Source.class, Builder.class);
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

            public Builder setCert(String str) {
                str.getClass();
                this.cert_ = str;
                onChanged();
                return this;
            }

            public Builder setCertBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.cert_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDigest(String str) {
                str.getClass();
                this.digest_ = str;
                onChanged();
                return this;
            }

            public Builder setDigestBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.digest_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDs(String str) {
                str.getClass();
                this.ds_ = str;
                onChanged();
                return this;
            }

            public Builder setDsBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.ds_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDsgver(int i10) {
                this.dsgver_ = i10;
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

            public Builder setPchain(String str) {
                str.getClass();
                this.pchain_ = str;
                onChanged();
                return this;
            }

            public Builder setPchainBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.pchain_ = byteString;
                onChanged();
                return this;
            }

            public Builder setTid(String str) {
                str.getClass();
                this.tid_ = str;
                onChanged();
                return this;
            }

            public Builder setTidBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.tid_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Source build() {
                Source sourceBuildPartial = buildPartial();
                if (sourceBuildPartial.isInitialized()) {
                    return sourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sourceBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Source buildPartial() {
                Source source = new Source(this);
                source.tid_ = this.tid_;
                source.ds_ = this.ds_;
                source.dsgver_ = this.dsgver_;
                source.digest_ = this.digest_;
                source.cert_ = this.cert_;
                source.pchain_ = this.pchain_;
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    source.ext_ = this.ext_;
                } else {
                    source.ext_ = (Struct) xaVar.build();
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    source.extProto_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    source.extProto_ = this.extProto_;
                }
                onBuilt();
                return source;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Source getDefaultInstanceForType() {
                return Source.getDefaultInstance();
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
                this.tid_ = "";
                this.ds_ = "";
                this.dsgver_ = 0;
                this.digest_ = "";
                this.cert_ = "";
                this.pchain_ = "";
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
                if (message instanceof Source) {
                    return mergeFrom((Source) message);
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

            public Builder mergeFrom(Source source) {
                if (source == Source.getDefaultInstance()) {
                    return this;
                }
                if (!source.getTid().isEmpty()) {
                    this.tid_ = source.tid_;
                    onChanged();
                }
                if (!source.getDs().isEmpty()) {
                    this.ds_ = source.ds_;
                    onChanged();
                }
                if (source.getDsgver() != 0) {
                    setDsgver(source.getDsgver());
                }
                if (!source.getDigest().isEmpty()) {
                    this.digest_ = source.digest_;
                    onChanged();
                }
                if (!source.getCert().isEmpty()) {
                    this.cert_ = source.cert_;
                    onChanged();
                }
                if (!source.getPchain().isEmpty()) {
                    this.pchain_ = source.pchain_;
                    onChanged();
                }
                if (source.hasExt()) {
                    mergeExt(source.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!source.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = source.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(source.extProto_);
                        }
                        onChanged();
                    }
                } else if (!source.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(source.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = source.extProto_;
                        this.bitField0_ &= -2;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) source).unknownFields);
                onChanged();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.tid_ = "";
                this.ds_ = "";
                this.digest_ = "";
                this.cert_ = "";
                this.pchain_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
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
            public com.explorestack.protobuf.openrtb.Request.Source.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.openrtb.Request.Source.access$1400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.openrtb.Request$Source r3 = (com.explorestack.protobuf.openrtb.Request.Source) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.openrtb.Request$Source r4 = (com.explorestack.protobuf.openrtb.Request.Source) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Source.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.openrtb.Request$Source$Builder");
            }
        }

        public static Builder newBuilder(Source source) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(source);
        }

        public static Source parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Source(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Source parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Source) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Source parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Source getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Source parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Source() {
            this.memoizedIsInitialized = (byte) -1;
            this.tid_ = "";
            this.ds_ = "";
            this.digest_ = "";
            this.cert_ = "";
            this.pchain_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Source parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Source parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Source) PARSER.parseFrom(bArr, m5Var);
        }

        public static Source parseFrom(InputStream inputStream) throws IOException {
            return (Source) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Source parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Source) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Source parseFrom(y yVar) throws IOException {
            return (Source) k7.parseWithIOException(PARSER, yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Source(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.tid_ = yVar.readStringRequireUtf8();
                            } else if (tag == 18) {
                                this.ds_ = yVar.readStringRequireUtf8();
                            } else if (tag == 24) {
                                this.dsgver_ = yVar.readUInt32();
                            } else if (tag == 34) {
                                this.digest_ = yVar.readStringRequireUtf8();
                            } else if (tag == 42) {
                                this.cert_ = yVar.readStringRequireUtf8();
                            } else if (tag == 50) {
                                this.pchain_ = yVar.readStringRequireUtf8();
                            } else if (tag == 58) {
                                if (!z11) {
                                    this.extProto_ = new ArrayList();
                                    z11 = true;
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

        public static Source parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Source) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SourceOrBuilder extends MessageOrBuilder {
        String getCert();

        ByteString getCertBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getDigest();

        ByteString getDigestBytes();

        String getDs();

        ByteString getDsBytes();

        int getDsgver();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        g getExtProtoOrBuilder(int i10);

        List<? extends g> getExtProtoOrBuilderList();

        String getPchain();

        ByteString getPchainBytes();

        String getTid();

        ByteString getTidBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Request getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return d.f22445c;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Request) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return super.equals(obj);
        }
        Request request = (Request) obj;
        if (!getId().equals(request.getId()) || getTest() != request.getTest() || getTmax() != request.getTmax() || getAt() != request.getAt() || !getCurList().equals(request.getCurList()) || !getSeatList().equals(request.getSeatList()) || getWseat() != request.getWseat() || !getCdata().equals(request.getCdata()) || hasSource() != request.hasSource()) {
            return false;
        }
        if ((hasSource() && !getSource().equals(request.getSource())) || !getItemList().equals(request.getItemList()) || getPackage() != request.getPackage() || hasContext() != request.hasContext()) {
            return false;
        }
        if ((!hasContext() || getContext().equals(request.getContext())) && hasExt() == request.hasExt()) {
            return (!hasExt() || getExt().equals(request.getExt())) && getExtProtoList().equals(request.getExtProtoList()) && this.unknownFields.equals(request.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public int getAt() {
        return this.at_;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public String getCdata() {
        Object obj = this.cdata_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cdata_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public ByteString getCdataBytes() {
        Object obj = this.cdata_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cdata_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public Any getContext() {
        Any any = this.context_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public g getContextOrBuilder() {
        return getContext();
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public String getCur(int i10) {
        return (String) this.cur_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public ByteString getCurBytes(int i10) {
        return this.cur_.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public int getCurCount() {
        return this.cur_.size();
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public jb getExtOrBuilder() {
        return getExt();
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public Any getExtProto(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public g getExtProtoOrBuilder(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public List<? extends g> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public Item getItem(int i10) {
        return this.item_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public int getItemCount() {
        return this.item_.size();
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public List<Item> getItemList() {
        return this.item_;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public ItemOrBuilder getItemOrBuilder(int i10) {
        return this.item_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public List<? extends ItemOrBuilder> getItemOrBuilderList() {
        return this.item_;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public int getPackage() {
        return this.package_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public String getSeat(int i10) {
        return (String) this.seat_.get(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public ByteString getSeatBytes(int i10) {
        return this.seat_.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public int getSeatCount() {
        return this.seat_.size();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
        boolean z10 = this.test_;
        if (z10) {
            iComputeStringSize += h0.computeBoolSize(2, z10);
        }
        int i11 = this.tmax_;
        if (i11 != 0) {
            iComputeStringSize += h0.computeUInt32Size(3, i11);
        }
        int i12 = this.at_;
        if (i12 != 0) {
            iComputeStringSize += h0.computeUInt32Size(4, i12);
        }
        int iE = 0;
        for (int i13 = 0; i13 < this.cur_.size(); i13++) {
            iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.cur_, i13, iE);
        }
        int size = getCurList().size() + iComputeStringSize + iE;
        int iE2 = 0;
        for (int i14 = 0; i14 < this.seat_.size(); i14++) {
            iE2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.seat_, i14, iE2);
        }
        int size2 = getSeatList().size() + size + iE2;
        boolean z11 = this.wseat_;
        if (z11) {
            size2 += h0.computeBoolSize(7, z11);
        }
        if (!getCdataBytes().isEmpty()) {
            size2 += k7.computeStringSize(8, this.cdata_);
        }
        if (this.source_ != null) {
            size2 += h0.computeMessageSize(9, getSource());
        }
        for (int i15 = 0; i15 < this.item_.size(); i15++) {
            size2 += h0.computeMessageSize(10, this.item_.get(i15));
        }
        int i16 = this.package_;
        if (i16 != 0) {
            size2 += h0.computeUInt32Size(11, i16);
        }
        if (this.context_ != null) {
            size2 += h0.computeMessageSize(12, getContext());
        }
        for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
            size2 += h0.computeMessageSize(13, this.extProto_.get(i17));
        }
        if (this.ext_ != null) {
            size2 += h0.computeMessageSize(14, getExt());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public Source getSource() {
        Source source = this.source_;
        return source == null ? Source.getDefaultInstance() : source;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public SourceOrBuilder getSourceOrBuilder() {
        return getSource();
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public boolean getTest() {
        return this.test_;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public int getTmax() {
        return this.tmax_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public boolean getWseat() {
        return this.wseat_;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public boolean hasSource() {
        return this.source_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int at2 = getAt() + ((((getTmax() + ((((x7.hashBoolean(getTest()) + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53);
        if (getCurCount() > 0) {
            at2 = o2.B(at2, 37, 5, 53) + getCurList().hashCode();
        }
        if (getSeatCount() > 0) {
            at2 = o2.B(at2, 37, 6, 53) + getSeatList().hashCode();
        }
        int iHashCode = getCdata().hashCode() + ((((x7.hashBoolean(getWseat()) + o2.B(at2, 37, 7, 53)) * 37) + 8) * 53);
        if (hasSource()) {
            iHashCode = o2.B(iHashCode, 37, 9, 53) + getSource().hashCode();
        }
        if (getItemCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 10, 53) + getItemList().hashCode();
        }
        int iHashCode2 = getPackage() + o2.B(iHashCode, 37, 11, 53);
        if (hasContext()) {
            iHashCode2 = getContext().hashCode() + o2.B(iHashCode2, 37, 12, 53);
        }
        if (hasExt()) {
            iHashCode2 = getExt().hashCode() + o2.B(iHashCode2, 37, 14, 53);
        }
        if (getExtProtoCount() > 0) {
            iHashCode2 = getExtProtoList().hashCode() + o2.B(iHashCode2, 37, 13, 53);
        }
        int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return d.f22446d.ensureFieldAccessorsInitialized(Request.class, Builder.class);
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
        return new Request();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getIdBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.id_);
        }
        boolean z10 = this.test_;
        if (z10) {
            h0Var.writeBool(2, z10);
        }
        int i10 = this.tmax_;
        if (i10 != 0) {
            h0Var.writeUInt32(3, i10);
        }
        int i11 = this.at_;
        if (i11 != 0) {
            h0Var.writeUInt32(4, i11);
        }
        int iF = 0;
        while (iF < this.cur_.size()) {
            iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.cur_, iF, h0Var, 5, iF, 1);
        }
        int iF2 = 0;
        while (iF2 < this.seat_.size()) {
            iF2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.seat_, iF2, h0Var, 6, iF2, 1);
        }
        boolean z11 = this.wseat_;
        if (z11) {
            h0Var.writeBool(7, z11);
        }
        if (!getCdataBytes().isEmpty()) {
            k7.writeString(h0Var, 8, this.cdata_);
        }
        if (this.source_ != null) {
            h0Var.writeMessage(9, getSource());
        }
        for (int i12 = 0; i12 < this.item_.size(); i12++) {
            h0Var.writeMessage(10, this.item_.get(i12));
        }
        int i13 = this.package_;
        if (i13 != 0) {
            h0Var.writeUInt32(11, i13);
        }
        if (this.context_ != null) {
            h0Var.writeMessage(12, getContext());
        }
        for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
            h0Var.writeMessage(13, this.extProto_.get(i14));
        }
        if (this.ext_ != null) {
            h0Var.writeMessage(14, getExt());
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static Builder newBuilder(Request request) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(request);
    }

    public static Request parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(byteBuffer, m5Var);
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public ka getCurList() {
        return this.cur_;
    }

    @Override // com.explorestack.protobuf.openrtb.e
    public ka getSeatList() {
        return this.seat_;
    }

    private Request(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Request parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Request) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Request getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Request parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Request() {
        this.memoizedIsInitialized = (byte) -1;
        this.id_ = "";
        f8 f8Var = f8.f22138e;
        this.cur_ = f8Var;
        this.seat_ = f8Var;
        this.cdata_ = "";
        List list = Collections.EMPTY_LIST;
        this.item_ = list;
        this.extProto_ = list;
    }

    public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Request parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Request) PARSER.parseFrom(bArr, m5Var);
    }

    public static Request parseFrom(InputStream inputStream) throws IOException {
        return (Request) k7.parseWithIOException(PARSER, inputStream);
    }

    public static Request parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Request) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Request parseFrom(y yVar) throws IOException {
        return (Request) k7.parseWithIOException(PARSER, yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    private Request(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                        case 16:
                            this.test_ = yVar.readBool();
                        case 24:
                            this.tmax_ = yVar.readUInt32();
                        case 32:
                            this.at_ = yVar.readUInt32();
                        case 42:
                            String stringRequireUtf8 = yVar.readStringRequireUtf8();
                            int i10 = (c10 == true ? 1 : 0) & 1;
                            c10 = c10;
                            if (i10 == 0) {
                                this.cur_ = new f8();
                                c10 = (c10 == true ? 1 : 0) | 1;
                            }
                            this.cur_.add((g8) stringRequireUtf8);
                        case 50:
                            String stringRequireUtf82 = yVar.readStringRequireUtf8();
                            int i11 = (c10 == true ? 1 : 0) & 2;
                            c10 = c10;
                            if (i11 == 0) {
                                this.seat_ = new f8();
                                c10 = (c10 == true ? 1 : 0) | 2;
                            }
                            this.seat_.add((g8) stringRequireUtf82);
                        case 56:
                            this.wseat_ = yVar.readBool();
                        case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                            this.cdata_ = yVar.readStringRequireUtf8();
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            Source source = this.source_;
                            Source.Builder builder = source != null ? source.toBuilder() : null;
                            Source source2 = (Source) yVar.readMessage(Source.parser(), m5Var);
                            this.source_ = source2;
                            if (builder != null) {
                                builder.mergeFrom(source2);
                                this.source_ = builder.buildPartial();
                            }
                        case 82:
                            int i12 = (c10 == true ? 1 : 0) & 4;
                            c10 = c10;
                            if (i12 == 0) {
                                this.item_ = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 4;
                            }
                            this.item_.add(yVar.readMessage(Item.parser(), m5Var));
                        case 88:
                            this.package_ = yVar.readUInt32();
                        case 98:
                            Any any = this.context_;
                            Any.Builder builder2 = any != null ? any.toBuilder() : null;
                            Any any2 = (Any) yVar.readMessage(Any.parser(), m5Var);
                            this.context_ = any2;
                            if (builder2 != null) {
                                builder2.mergeFrom(any2);
                                this.context_ = builder2.buildPartial();
                            }
                        case 106:
                            int i13 = (c10 == true ? 1 : 0) & 8;
                            c10 = c10;
                            if (i13 == 0) {
                                this.extProto_ = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | '\b';
                            }
                            this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                        case 114:
                            Struct struct = this.ext_;
                            Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                            this.ext_ = struct2;
                            if (builder3 != null) {
                                builder3.mergeFrom(struct2);
                                this.ext_ = builder3.buildPartial();
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
                    this.cur_ = this.cur_.getUnmodifiableView();
                }
                if (((c10 == true ? 1 : 0) & 2) != 0) {
                    this.seat_ = this.seat_.getUnmodifiableView();
                }
                if (((c10 == true ? 1 : 0) & 4) != 0) {
                    this.item_ = Collections.unmodifiableList(this.item_);
                }
                if (((c10 == true ? 1 : 0) & 8) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (((c10 == true ? 1 : 0) & 1) != 0) {
            this.cur_ = this.cur_.getUnmodifiableView();
        }
        if (((c10 == true ? 1 : 0) & 2) != 0) {
            this.seat_ = this.seat_.getUnmodifiableView();
        }
        if (((c10 == true ? 1 : 0) & 4) != 0) {
            this.item_ = Collections.unmodifiableList(this.item_);
        }
        if (((c10 == true ? 1 : 0) & 8) != 0) {
            this.extProto_ = Collections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static Request parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Request) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
