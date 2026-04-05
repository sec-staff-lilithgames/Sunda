package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.h;
import com.explorestack.protobuf.adcom.s;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AuctionContext extends k7 implements AuctionContextOrBuilder {
    public static final int AT_FIELD_NUMBER = 4;
    public static final int CONTEXT_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 6;
    public static final int PLACEMENT_FIELD_NUMBER = 7;
    public static final int PLACEMENT_TAG_FIELD_NUMBER = 5;
    public static final int TEST_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int at_;
    private Context context_;
    private volatile Object id_;
    private Request.Item item_;
    private byte memoizedIsInitialized;
    private int placementTag_;
    private Placement placement_;
    private boolean test_;
    private volatile Object timestamp_;
    private static final AuctionContext DEFAULT_INSTANCE = new AuctionContext();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.AuctionContext.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public AuctionContext parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new AuctionContext(yVar, m5Var);
        }
    };

    public static AuctionContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AuctionContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuctionContext) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AuctionContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuctionContext) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuctionContext)) {
            return super.equals(obj);
        }
        AuctionContext auctionContext = (AuctionContext) obj;
        if (!getTimestamp().equals(auctionContext.getTimestamp()) || !getId().equals(auctionContext.getId()) || getTest() != auctionContext.getTest() || getAt() != auctionContext.getAt() || this.placementTag_ != auctionContext.placementTag_ || hasItem() != auctionContext.hasItem()) {
            return false;
        }
        if ((hasItem() && !getItem().equals(auctionContext.getItem())) || hasPlacement() != auctionContext.hasPlacement()) {
            return false;
        }
        if ((!hasPlacement() || getPlacement().equals(auctionContext.getPlacement())) && hasContext() == auctionContext.hasContext()) {
            return (!hasContext() || getContext().equals(auctionContext.getContext())) && this.unknownFields.equals(auctionContext.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public int getAt() {
        return this.at_;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public h getContextOrBuilder() {
        return getContext();
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public Request.Item getItem() {
        Request.Item item = this.item_;
        return item == null ? Request.Item.getDefaultInstance() : item;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public Request.ItemOrBuilder getItemOrBuilder() {
        return getItem();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public Placement getPlacement() {
        Placement placement = this.placement_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public s getPlacementOrBuilder() {
        return getPlacement();
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public PlacementTag getPlacementTag() {
        PlacementTag placementTagValueOf = PlacementTag.valueOf(this.placementTag_);
        return placementTagValueOf == null ? PlacementTag.UNRECOGNIZED : placementTagValueOf;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public int getPlacementTagValue() {
        return this.placementTag_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getTimestampBytes().isEmpty() ? k7.computeStringSize(1, this.timestamp_) : 0;
        if (!getIdBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.id_);
        }
        boolean z10 = this.test_;
        if (z10) {
            iComputeStringSize += h0.computeBoolSize(3, z10);
        }
        int i11 = this.at_;
        if (i11 != 0) {
            iComputeStringSize += h0.computeUInt32Size(4, i11);
        }
        if (this.placementTag_ != PlacementTag.PLACEMENT_TAG_INVALID.getNumber()) {
            iComputeStringSize += h0.computeEnumSize(5, this.placementTag_);
        }
        if (this.item_ != null) {
            iComputeStringSize += h0.computeMessageSize(6, getItem());
        }
        if (this.placement_ != null) {
            iComputeStringSize += h0.computeMessageSize(7, getPlacement());
        }
        if (this.context_ != null) {
            iComputeStringSize += h0.computeMessageSize(8, getContext());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public boolean getTest() {
        return this.test_;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public String getTimestamp() {
        Object obj = this.timestamp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timestamp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public ByteString getTimestampBytes() {
        Object obj = this.timestamp_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.timestamp_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public boolean hasItem() {
        return this.item_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public boolean hasPlacement() {
        return this.placement_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int at2 = ((((getAt() + ((((x7.hashBoolean(getTest()) + ((((getId().hashCode() + ((((getTimestamp().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53) + this.placementTag_;
        if (hasItem()) {
            at2 = o2.B(at2, 37, 6, 53) + getItem().hashCode();
        }
        if (hasPlacement()) {
            at2 = o2.B(at2, 37, 7, 53) + getPlacement().hashCode();
        }
        if (hasContext()) {
            at2 = o2.B(at2, 37, 8, 53) + getContext().hashCode();
        }
        int iHashCode = this.unknownFields.hashCode() + (at2 * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_fieldAccessorTable.ensureFieldAccessorsInitialized(AuctionContext.class, Builder.class);
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
        return new AuctionContext();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getTimestampBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.timestamp_);
        }
        if (!getIdBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.id_);
        }
        boolean z10 = this.test_;
        if (z10) {
            h0Var.writeBool(3, z10);
        }
        int i10 = this.at_;
        if (i10 != 0) {
            h0Var.writeUInt32(4, i10);
        }
        if (this.placementTag_ != PlacementTag.PLACEMENT_TAG_INVALID.getNumber()) {
            h0Var.writeEnum(5, this.placementTag_);
        }
        if (this.item_ != null) {
            h0Var.writeMessage(6, getItem());
        }
        if (this.placement_ != null) {
            h0Var.writeMessage(7, getPlacement());
        }
        if (this.context_ != null) {
            h0Var.writeMessage(8, getContext());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements AuctionContextOrBuilder {
        private int at_;
        private xa contextBuilder_;
        private Context context_;
        private Object id_;
        private xa itemBuilder_;
        private Request.Item item_;
        private xa placementBuilder_;
        private int placementTag_;
        private Placement placement_;
        private boolean test_;
        private Object timestamp_;

        private Builder() {
            super(null);
            this.timestamp_ = "";
            this.id_ = "";
            this.placementTag_ = 0;
            maybeForceBuilderInitialization();
        }

        private xa getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new xa(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_descriptor;
        }

        private xa getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
                this.itemBuilder_ = new xa(getItem(), getParentForChildren(), isClean());
                this.item_ = null;
            }
            return this.itemBuilder_;
        }

        private xa getPlacementFieldBuilder() {
            if (this.placementBuilder_ == null) {
                this.placementBuilder_ = new xa(getPlacement(), getParentForChildren(), isClean());
                this.placement_ = null;
            }
            return this.placementBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearAt() {
            this.at_ = 0;
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

        public Builder clearId() {
            this.id_ = AuctionContext.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearItem() {
            if (this.itemBuilder_ == null) {
                this.item_ = null;
                onChanged();
                return this;
            }
            this.item_ = null;
            this.itemBuilder_ = null;
            return this;
        }

        public Builder clearPlacement() {
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
                onChanged();
                return this;
            }
            this.placement_ = null;
            this.placementBuilder_ = null;
            return this;
        }

        public Builder clearPlacementTag() {
            this.placementTag_ = 0;
            onChanged();
            return this;
        }

        public Builder clearTest() {
            this.test_ = false;
            onChanged();
            return this;
        }

        public Builder clearTimestamp() {
            this.timestamp_ = AuctionContext.getDefaultInstance().getTimestamp();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public int getAt() {
            return this.at_;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public Context getContext() {
            xa xaVar = this.contextBuilder_;
            if (xaVar != null) {
                return (Context) xaVar.getMessage();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        public Context.Builder getContextBuilder() {
            onChanged();
            return (Context.Builder) getContextFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public h getContextOrBuilder() {
            xa xaVar = this.contextBuilder_;
            if (xaVar != null) {
                return (h) xaVar.getMessageOrBuilder();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public Request.Item getItem() {
            xa xaVar = this.itemBuilder_;
            if (xaVar != null) {
                return (Request.Item) xaVar.getMessage();
            }
            Request.Item item = this.item_;
            return item == null ? Request.Item.getDefaultInstance() : item;
        }

        public Request.Item.Builder getItemBuilder() {
            onChanged();
            return (Request.Item.Builder) getItemFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public Request.ItemOrBuilder getItemOrBuilder() {
            xa xaVar = this.itemBuilder_;
            if (xaVar != null) {
                return (Request.ItemOrBuilder) xaVar.getMessageOrBuilder();
            }
            Request.Item item = this.item_;
            return item == null ? Request.Item.getDefaultInstance() : item;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public Placement getPlacement() {
            xa xaVar = this.placementBuilder_;
            if (xaVar != null) {
                return (Placement) xaVar.getMessage();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        public Placement.Builder getPlacementBuilder() {
            onChanged();
            return (Placement.Builder) getPlacementFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public s getPlacementOrBuilder() {
            xa xaVar = this.placementBuilder_;
            if (xaVar != null) {
                return (s) xaVar.getMessageOrBuilder();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public PlacementTag getPlacementTag() {
            PlacementTag placementTagValueOf = PlacementTag.valueOf(this.placementTag_);
            return placementTagValueOf == null ? PlacementTag.UNRECOGNIZED : placementTagValueOf;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public int getPlacementTagValue() {
            return this.placementTag_;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public boolean getTest() {
            return this.test_;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public String getTimestamp() {
            Object obj = this.timestamp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timestamp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public ByteString getTimestampBytes() {
            Object obj = this.timestamp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timestamp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public boolean hasItem() {
            return (this.itemBuilder_ == null && this.item_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public boolean hasPlacement() {
            return (this.placementBuilder_ == null && this.placement_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_fieldAccessorTable.ensureFieldAccessorsInitialized(AuctionContext.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeContext(Context context) {
            xa xaVar = this.contextBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(context);
                return this;
            }
            Context context2 = this.context_;
            if (context2 != null) {
                this.context_ = Context.newBuilder(context2).mergeFrom(context).buildPartial();
            } else {
                this.context_ = context;
            }
            onChanged();
            return this;
        }

        public Builder mergeItem(Request.Item item) {
            xa xaVar = this.itemBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(item);
                return this;
            }
            Request.Item item2 = this.item_;
            if (item2 != null) {
                this.item_ = Request.Item.newBuilder(item2).mergeFrom(item).buildPartial();
            } else {
                this.item_ = item;
            }
            onChanged();
            return this;
        }

        public Builder mergePlacement(Placement placement) {
            xa xaVar = this.placementBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(placement);
                return this;
            }
            Placement placement2 = this.placement_;
            if (placement2 != null) {
                this.placement_ = Placement.newBuilder(placement2).mergeFrom(placement).buildPartial();
            } else {
                this.placement_ = placement;
            }
            onChanged();
            return this;
        }

        public Builder setAt(int i10) {
            this.at_ = i10;
            onChanged();
            return this;
        }

        public Builder setContext(Context context) {
            xa xaVar = this.contextBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(context);
                return this;
            }
            context.getClass();
            this.context_ = context;
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
            b.checkByteStringIsUtf8(byteString);
            this.id_ = byteString;
            onChanged();
            return this;
        }

        public Builder setItem(Request.Item item) {
            xa xaVar = this.itemBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(item);
                return this;
            }
            item.getClass();
            this.item_ = item;
            onChanged();
            return this;
        }

        public Builder setPlacement(Placement placement) {
            xa xaVar = this.placementBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(placement);
                return this;
            }
            placement.getClass();
            this.placement_ = placement;
            onChanged();
            return this;
        }

        public Builder setPlacementTag(PlacementTag placementTag) {
            placementTag.getClass();
            this.placementTag_ = placementTag.getNumber();
            onChanged();
            return this;
        }

        public Builder setPlacementTagValue(int i10) {
            this.placementTag_ = i10;
            onChanged();
            return this;
        }

        public Builder setTest(boolean z10) {
            this.test_ = z10;
            onChanged();
            return this;
        }

        public Builder setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
            onChanged();
            return this;
        }

        public Builder setTimestampBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AuctionContext build() {
            AuctionContext auctionContextBuildPartial = buildPartial();
            if (auctionContextBuildPartial.isInitialized()) {
                return auctionContextBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) auctionContextBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AuctionContext buildPartial() {
            AuctionContext auctionContext = new AuctionContext(this);
            auctionContext.timestamp_ = this.timestamp_;
            auctionContext.id_ = this.id_;
            auctionContext.test_ = this.test_;
            auctionContext.at_ = this.at_;
            auctionContext.placementTag_ = this.placementTag_;
            xa xaVar = this.itemBuilder_;
            if (xaVar == null) {
                auctionContext.item_ = this.item_;
            } else {
                auctionContext.item_ = (Request.Item) xaVar.build();
            }
            xa xaVar2 = this.placementBuilder_;
            if (xaVar2 == null) {
                auctionContext.placement_ = this.placement_;
            } else {
                auctionContext.placement_ = (Placement) xaVar2.build();
            }
            xa xaVar3 = this.contextBuilder_;
            if (xaVar3 == null) {
                auctionContext.context_ = this.context_;
            } else {
                auctionContext.context_ = (Context) xaVar3.build();
            }
            onBuilt();
            return auctionContext;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AuctionContext getDefaultInstanceForType() {
            return AuctionContext.getDefaultInstance();
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
            this.timestamp_ = "";
            this.id_ = "";
            this.test_ = false;
            this.at_ = 0;
            this.placementTag_ = 0;
            if (this.itemBuilder_ == null) {
                this.item_ = null;
            } else {
                this.item_ = null;
                this.itemBuilder_ = null;
            }
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
            } else {
                this.placement_ = null;
                this.placementBuilder_ = null;
            }
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                return this;
            }
            this.context_ = null;
            this.contextBuilder_ = null;
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            xa xaVar = this.contextBuilder_;
            if (xaVar == null) {
                this.context_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setItem(Request.Item.Builder builder) {
            xa xaVar = this.itemBuilder_;
            if (xaVar == null) {
                this.item_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setPlacement(Placement.Builder builder) {
            xa xaVar = this.placementBuilder_;
            if (xaVar == null) {
                this.placement_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AuctionContext) {
                return mergeFrom((AuctionContext) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.timestamp_ = "";
            this.id_ = "";
            this.placementTag_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(AuctionContext auctionContext) {
            if (auctionContext == AuctionContext.getDefaultInstance()) {
                return this;
            }
            if (!auctionContext.getTimestamp().isEmpty()) {
                this.timestamp_ = auctionContext.timestamp_;
                onChanged();
            }
            if (!auctionContext.getId().isEmpty()) {
                this.id_ = auctionContext.id_;
                onChanged();
            }
            if (auctionContext.getTest()) {
                setTest(auctionContext.getTest());
            }
            if (auctionContext.getAt() != 0) {
                setAt(auctionContext.getAt());
            }
            if (auctionContext.placementTag_ != 0) {
                setPlacementTagValue(auctionContext.getPlacementTagValue());
            }
            if (auctionContext.hasItem()) {
                mergeItem(auctionContext.getItem());
            }
            if (auctionContext.hasPlacement()) {
                mergePlacement(auctionContext.getPlacement());
            }
            if (auctionContext.hasContext()) {
                mergeContext(auctionContext.getContext());
            }
            mergeUnknownFields(((k7) auctionContext).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.analytics.AuctionContext.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.analytics.AuctionContext.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.analytics.AuctionContext r3 = (io.bidmachine.protobuf.analytics.AuctionContext) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.analytics.AuctionContext r4 = (io.bidmachine.protobuf.analytics.AuctionContext) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.AuctionContext.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.analytics.AuctionContext$Builder");
        }
    }

    public static Builder newBuilder(AuctionContext auctionContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(auctionContext);
    }

    public static AuctionContext parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (AuctionContext) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private AuctionContext(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AuctionContext parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (AuctionContext) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static AuctionContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuctionContext) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public AuctionContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AuctionContext parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (AuctionContext) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AuctionContext() {
        this.memoizedIsInitialized = (byte) -1;
        this.timestamp_ = "";
        this.id_ = "";
        this.placementTag_ = 0;
    }

    public static AuctionContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AuctionContext) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static AuctionContext parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (AuctionContext) PARSER.parseFrom(bArr, m5Var);
    }

    public static AuctionContext parseFrom(InputStream inputStream) throws IOException {
        return (AuctionContext) k7.parseWithIOException(PARSER, inputStream);
    }

    public static AuctionContext parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (AuctionContext) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    private AuctionContext(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            this.timestamp_ = yVar.readStringRequireUtf8();
                        } else if (tag == 18) {
                            this.id_ = yVar.readStringRequireUtf8();
                        } else if (tag == 24) {
                            this.test_ = yVar.readBool();
                        } else if (tag == 32) {
                            this.at_ = yVar.readUInt32();
                        } else if (tag != 40) {
                            if (tag == 50) {
                                Request.Item item = this.item_;
                                Request.Item.Builder builder = item != null ? item.toBuilder() : null;
                                Request.Item item2 = (Request.Item) yVar.readMessage(Request.Item.parser(), m5Var);
                                this.item_ = item2;
                                if (builder != null) {
                                    builder.mergeFrom(item2);
                                    this.item_ = builder.buildPartial();
                                }
                            } else if (tag == 58) {
                                Placement placement = this.placement_;
                                Placement.Builder builder2 = placement != null ? placement.toBuilder() : null;
                                Placement placement2 = (Placement) yVar.readMessage(Placement.parser(), m5Var);
                                this.placement_ = placement2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(placement2);
                                    this.placement_ = builder2.buildPartial();
                                }
                            } else if (tag != 66) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                Context context = this.context_;
                                Context.Builder builder3 = context != null ? context.toBuilder() : null;
                                Context context2 = (Context) yVar.readMessage(Context.parser(), m5Var);
                                this.context_ = context2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(context2);
                                    this.context_ = builder3.buildPartial();
                                }
                            }
                        } else {
                            this.placementTag_ = yVar.readEnum();
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static AuctionContext parseFrom(y yVar) throws IOException {
        return (AuctionContext) k7.parseWithIOException(PARSER, yVar);
    }

    public static AuctionContext parseFrom(y yVar, m5 m5Var) throws IOException {
        return (AuctionContext) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
