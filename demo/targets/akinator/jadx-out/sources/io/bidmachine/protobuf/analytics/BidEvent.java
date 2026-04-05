package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.a;
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
import com.explorestack.protobuf.openrtb.Response;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import io.bidmachine.protobuf.analytics.AuctionContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class BidEvent extends k7 implements BidEventOrBuilder {
    public static final int AD_FIELD_NUMBER = 6;
    public static final int AUCTION_CONTEXT_FIELD_NUMBER = 4;
    public static final int BIDID_FIELD_NUMBER = 2;
    public static final int BID_FIELD_NUMBER = 5;
    private static final BidEvent DEFAULT_INSTANCE = new BidEvent();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.analytics.BidEvent.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public BidEvent parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new BidEvent(yVar, m5Var);
        }
    };
    public static final int SEAT_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private Ad ad_;
    private AuctionContext auctionContext_;
    private Response.Seatbid.Bid bid_;
    private volatile Object bidid_;
    private byte memoizedIsInitialized;
    private volatile Object seat_;
    private volatile Object timestamp_;

    public static BidEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static BidEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidEvent) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BidEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BidEvent)) {
            return super.equals(obj);
        }
        BidEvent bidEvent = (BidEvent) obj;
        if (!getTimestamp().equals(bidEvent.getTimestamp()) || !getBidid().equals(bidEvent.getBidid()) || !getSeat().equals(bidEvent.getSeat()) || hasAuctionContext() != bidEvent.hasAuctionContext()) {
            return false;
        }
        if ((hasAuctionContext() && !getAuctionContext().equals(bidEvent.getAuctionContext())) || hasBid() != bidEvent.hasBid()) {
            return false;
        }
        if ((!hasBid() || getBid().equals(bidEvent.getBid())) && hasAd() == bidEvent.hasAd()) {
            return (!hasAd() || getAd().equals(bidEvent.getAd())) && this.unknownFields.equals(bidEvent.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public Ad getAd() {
        Ad ad2 = this.ad_;
        return ad2 == null ? Ad.getDefaultInstance() : ad2;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public a getAdOrBuilder() {
        return getAd();
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public AuctionContext getAuctionContext() {
        AuctionContext auctionContext = this.auctionContext_;
        return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public AuctionContextOrBuilder getAuctionContextOrBuilder() {
        return getAuctionContext();
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public Response.Seatbid.Bid getBid() {
        Response.Seatbid.Bid bid = this.bid_;
        return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public Response.Seatbid.BidOrBuilder getBidOrBuilder() {
        return getBid();
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public String getBidid() {
        Object obj = this.bidid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public ByteString getBididBytes() {
        Object obj = this.bidid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public String getSeat() {
        Object obj = this.seat_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.seat_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
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
        int iComputeStringSize = !getTimestampBytes().isEmpty() ? k7.computeStringSize(1, this.timestamp_) : 0;
        if (!getBididBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.bidid_);
        }
        if (!getSeatBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(3, this.seat_);
        }
        if (this.auctionContext_ != null) {
            iComputeStringSize += h0.computeMessageSize(4, getAuctionContext());
        }
        if (this.bid_ != null) {
            iComputeStringSize += h0.computeMessageSize(5, getBid());
        }
        if (this.ad_ != null) {
            iComputeStringSize += h0.computeMessageSize(6, getAd());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public String getTimestamp() {
        Object obj = this.timestamp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timestamp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
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

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public boolean hasAd() {
        return this.ad_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public boolean hasAuctionContext() {
        return this.auctionContext_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public boolean hasBid() {
        return this.bid_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getSeat().hashCode() + ((((getBidid().hashCode() + ((((getTimestamp().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
        if (hasAuctionContext()) {
            iHashCode = getAuctionContext().hashCode() + o2.B(iHashCode, 37, 4, 53);
        }
        if (hasBid()) {
            iHashCode = getBid().hashCode() + o2.B(iHashCode, 37, 5, 53);
        }
        if (hasAd()) {
            iHashCode = getAd().hashCode() + o2.B(iHashCode, 37, 6, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(BidEvent.class, Builder.class);
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
        return new BidEvent();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getTimestampBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.timestamp_);
        }
        if (!getBididBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.bidid_);
        }
        if (!getSeatBytes().isEmpty()) {
            k7.writeString(h0Var, 3, this.seat_);
        }
        if (this.auctionContext_ != null) {
            h0Var.writeMessage(4, getAuctionContext());
        }
        if (this.bid_ != null) {
            h0Var.writeMessage(5, getBid());
        }
        if (this.ad_ != null) {
            h0Var.writeMessage(6, getAd());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements BidEventOrBuilder {
        private xa adBuilder_;
        private Ad ad_;
        private xa auctionContextBuilder_;
        private AuctionContext auctionContext_;
        private xa bidBuilder_;
        private Response.Seatbid.Bid bid_;
        private Object bidid_;
        private Object seat_;
        private Object timestamp_;

        private Builder() {
            super(null);
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            maybeForceBuilderInitialization();
        }

        private xa getAdFieldBuilder() {
            if (this.adBuilder_ == null) {
                this.adBuilder_ = new xa(getAd(), getParentForChildren(), isClean());
                this.ad_ = null;
            }
            return this.adBuilder_;
        }

        private xa getAuctionContextFieldBuilder() {
            if (this.auctionContextBuilder_ == null) {
                this.auctionContextBuilder_ = new xa(getAuctionContext(), getParentForChildren(), isClean());
                this.auctionContext_ = null;
            }
            return this.auctionContextBuilder_;
        }

        private xa getBidFieldBuilder() {
            if (this.bidBuilder_ == null) {
                this.bidBuilder_ = new xa(getBid(), getParentForChildren(), isClean());
                this.bid_ = null;
            }
            return this.bidBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder clearAd() {
            if (this.adBuilder_ == null) {
                this.ad_ = null;
                onChanged();
                return this;
            }
            this.ad_ = null;
            this.adBuilder_ = null;
            return this;
        }

        public Builder clearAuctionContext() {
            if (this.auctionContextBuilder_ == null) {
                this.auctionContext_ = null;
                onChanged();
                return this;
            }
            this.auctionContext_ = null;
            this.auctionContextBuilder_ = null;
            return this;
        }

        public Builder clearBid() {
            if (this.bidBuilder_ == null) {
                this.bid_ = null;
                onChanged();
                return this;
            }
            this.bid_ = null;
            this.bidBuilder_ = null;
            return this;
        }

        public Builder clearBidid() {
            this.bidid_ = BidEvent.getDefaultInstance().getBidid();
            onChanged();
            return this;
        }

        public Builder clearSeat() {
            this.seat_ = BidEvent.getDefaultInstance().getSeat();
            onChanged();
            return this;
        }

        public Builder clearTimestamp() {
            this.timestamp_ = BidEvent.getDefaultInstance().getTimestamp();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public Ad getAd() {
            xa xaVar = this.adBuilder_;
            if (xaVar != null) {
                return (Ad) xaVar.getMessage();
            }
            Ad ad2 = this.ad_;
            return ad2 == null ? Ad.getDefaultInstance() : ad2;
        }

        public Ad.Builder getAdBuilder() {
            onChanged();
            return (Ad.Builder) getAdFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public a getAdOrBuilder() {
            xa xaVar = this.adBuilder_;
            if (xaVar != null) {
                return (a) xaVar.getMessageOrBuilder();
            }
            Ad ad2 = this.ad_;
            return ad2 == null ? Ad.getDefaultInstance() : ad2;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public AuctionContext getAuctionContext() {
            xa xaVar = this.auctionContextBuilder_;
            if (xaVar != null) {
                return (AuctionContext) xaVar.getMessage();
            }
            AuctionContext auctionContext = this.auctionContext_;
            return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
        }

        public AuctionContext.Builder getAuctionContextBuilder() {
            onChanged();
            return (AuctionContext.Builder) getAuctionContextFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public AuctionContextOrBuilder getAuctionContextOrBuilder() {
            xa xaVar = this.auctionContextBuilder_;
            if (xaVar != null) {
                return (AuctionContextOrBuilder) xaVar.getMessageOrBuilder();
            }
            AuctionContext auctionContext = this.auctionContext_;
            return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public Response.Seatbid.Bid getBid() {
            xa xaVar = this.bidBuilder_;
            if (xaVar != null) {
                return (Response.Seatbid.Bid) xaVar.getMessage();
            }
            Response.Seatbid.Bid bid = this.bid_;
            return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
        }

        public Response.Seatbid.Bid.Builder getBidBuilder() {
            onChanged();
            return (Response.Seatbid.Bid.Builder) getBidFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public Response.Seatbid.BidOrBuilder getBidOrBuilder() {
            xa xaVar = this.bidBuilder_;
            if (xaVar != null) {
                return (Response.Seatbid.BidOrBuilder) xaVar.getMessageOrBuilder();
            }
            Response.Seatbid.Bid bid = this.bid_;
            return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public String getBidid() {
            Object obj = this.bidid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public ByteString getBididBytes() {
            Object obj = this.bidid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public String getSeat() {
            Object obj = this.seat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.seat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public ByteString getSeatBytes() {
            Object obj = this.seat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.seat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public String getTimestamp() {
            Object obj = this.timestamp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timestamp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public ByteString getTimestampBytes() {
            Object obj = this.timestamp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timestamp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public boolean hasAd() {
            return (this.adBuilder_ == null && this.ad_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public boolean hasAuctionContext() {
            return (this.auctionContextBuilder_ == null && this.auctionContext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public boolean hasBid() {
            return (this.bidBuilder_ == null && this.bid_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(BidEvent.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAd(Ad ad2) {
            xa xaVar = this.adBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(ad2);
                return this;
            }
            Ad ad3 = this.ad_;
            if (ad3 != null) {
                this.ad_ = Ad.newBuilder(ad3).mergeFrom(ad2).buildPartial();
            } else {
                this.ad_ = ad2;
            }
            onChanged();
            return this;
        }

        public Builder mergeAuctionContext(AuctionContext auctionContext) {
            xa xaVar = this.auctionContextBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(auctionContext);
                return this;
            }
            AuctionContext auctionContext2 = this.auctionContext_;
            if (auctionContext2 != null) {
                this.auctionContext_ = AuctionContext.newBuilder(auctionContext2).mergeFrom(auctionContext).buildPartial();
            } else {
                this.auctionContext_ = auctionContext;
            }
            onChanged();
            return this;
        }

        public Builder mergeBid(Response.Seatbid.Bid bid) {
            xa xaVar = this.bidBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(bid);
                return this;
            }
            Response.Seatbid.Bid bid2 = this.bid_;
            if (bid2 != null) {
                this.bid_ = Response.Seatbid.Bid.newBuilder(bid2).mergeFrom(bid).buildPartial();
            } else {
                this.bid_ = bid;
            }
            onChanged();
            return this;
        }

        public Builder setAd(Ad ad2) {
            xa xaVar = this.adBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(ad2);
                return this;
            }
            ad2.getClass();
            this.ad_ = ad2;
            onChanged();
            return this;
        }

        public Builder setAuctionContext(AuctionContext auctionContext) {
            xa xaVar = this.auctionContextBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(auctionContext);
                return this;
            }
            auctionContext.getClass();
            this.auctionContext_ = auctionContext;
            onChanged();
            return this;
        }

        public Builder setBid(Response.Seatbid.Bid bid) {
            xa xaVar = this.bidBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(bid);
                return this;
            }
            bid.getClass();
            this.bid_ = bid;
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
            b.checkByteStringIsUtf8(byteString);
            this.bidid_ = byteString;
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
            b.checkByteStringIsUtf8(byteString);
            this.seat_ = byteString;
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
        public BidEvent build() {
            BidEvent bidEventBuildPartial = buildPartial();
            if (bidEventBuildPartial.isInitialized()) {
                return bidEventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) bidEventBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BidEvent buildPartial() {
            BidEvent bidEvent = new BidEvent(this);
            bidEvent.timestamp_ = this.timestamp_;
            bidEvent.bidid_ = this.bidid_;
            bidEvent.seat_ = this.seat_;
            xa xaVar = this.auctionContextBuilder_;
            if (xaVar == null) {
                bidEvent.auctionContext_ = this.auctionContext_;
            } else {
                bidEvent.auctionContext_ = (AuctionContext) xaVar.build();
            }
            xa xaVar2 = this.bidBuilder_;
            if (xaVar2 == null) {
                bidEvent.bid_ = this.bid_;
            } else {
                bidEvent.bid_ = (Response.Seatbid.Bid) xaVar2.build();
            }
            xa xaVar3 = this.adBuilder_;
            if (xaVar3 == null) {
                bidEvent.ad_ = this.ad_;
            } else {
                bidEvent.ad_ = (Ad) xaVar3.build();
            }
            onBuilt();
            return bidEvent;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public BidEvent getDefaultInstanceForType() {
            return BidEvent.getDefaultInstance();
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
            this.bidid_ = "";
            this.seat_ = "";
            if (this.auctionContextBuilder_ == null) {
                this.auctionContext_ = null;
            } else {
                this.auctionContext_ = null;
                this.auctionContextBuilder_ = null;
            }
            if (this.bidBuilder_ == null) {
                this.bid_ = null;
            } else {
                this.bid_ = null;
                this.bidBuilder_ = null;
            }
            if (this.adBuilder_ == null) {
                this.ad_ = null;
                return this;
            }
            this.ad_ = null;
            this.adBuilder_ = null;
            return this;
        }

        public Builder setAd(Ad.Builder builder) {
            xa xaVar = this.adBuilder_;
            if (xaVar == null) {
                this.ad_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setAuctionContext(AuctionContext.Builder builder) {
            xa xaVar = this.auctionContextBuilder_;
            if (xaVar == null) {
                this.auctionContext_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setBid(Response.Seatbid.Bid.Builder builder) {
            xa xaVar = this.bidBuilder_;
            if (xaVar == null) {
                this.bid_ = builder.build();
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
            if (message instanceof BidEvent) {
                return mergeFrom((BidEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(BidEvent bidEvent) {
            if (bidEvent == BidEvent.getDefaultInstance()) {
                return this;
            }
            if (!bidEvent.getTimestamp().isEmpty()) {
                this.timestamp_ = bidEvent.timestamp_;
                onChanged();
            }
            if (!bidEvent.getBidid().isEmpty()) {
                this.bidid_ = bidEvent.bidid_;
                onChanged();
            }
            if (!bidEvent.getSeat().isEmpty()) {
                this.seat_ = bidEvent.seat_;
                onChanged();
            }
            if (bidEvent.hasAuctionContext()) {
                mergeAuctionContext(bidEvent.getAuctionContext());
            }
            if (bidEvent.hasBid()) {
                mergeBid(bidEvent.getBid());
            }
            if (bidEvent.hasAd()) {
                mergeAd(bidEvent.getAd());
            }
            mergeUnknownFields(((k7) bidEvent).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.analytics.BidEvent.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.analytics.BidEvent.access$1100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.analytics.BidEvent r3 = (io.bidmachine.protobuf.analytics.BidEvent) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.analytics.BidEvent r4 = (io.bidmachine.protobuf.analytics.BidEvent) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.BidEvent.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.analytics.BidEvent$Builder");
        }
    }

    public static Builder newBuilder(BidEvent bidEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bidEvent);
    }

    public static BidEvent parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private BidEvent(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BidEvent parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (BidEvent) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static BidEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public BidEvent getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static BidEvent parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private BidEvent() {
        this.memoizedIsInitialized = (byte) -1;
        this.timestamp_ = "";
        this.bidid_ = "";
        this.seat_ = "";
    }

    public static BidEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static BidEvent parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (BidEvent) PARSER.parseFrom(bArr, m5Var);
    }

    public static BidEvent parseFrom(InputStream inputStream) throws IOException {
        return (BidEvent) k7.parseWithIOException(PARSER, inputStream);
    }

    public static BidEvent parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (BidEvent) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    private BidEvent(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            this.bidid_ = yVar.readStringRequireUtf8();
                        } else if (tag != 26) {
                            if (tag == 34) {
                                AuctionContext auctionContext = this.auctionContext_;
                                AuctionContext.Builder builder = auctionContext != null ? auctionContext.toBuilder() : null;
                                AuctionContext auctionContext2 = (AuctionContext) yVar.readMessage(AuctionContext.parser(), m5Var);
                                this.auctionContext_ = auctionContext2;
                                if (builder != null) {
                                    builder.mergeFrom(auctionContext2);
                                    this.auctionContext_ = builder.buildPartial();
                                }
                            } else if (tag == 42) {
                                Response.Seatbid.Bid bid = this.bid_;
                                Response.Seatbid.Bid.Builder builder2 = bid != null ? bid.toBuilder() : null;
                                Response.Seatbid.Bid bid2 = (Response.Seatbid.Bid) yVar.readMessage(Response.Seatbid.Bid.parser(), m5Var);
                                this.bid_ = bid2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(bid2);
                                    this.bid_ = builder2.buildPartial();
                                }
                            } else if (tag != 50) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                Ad ad2 = this.ad_;
                                Ad.Builder builder3 = ad2 != null ? ad2.toBuilder() : null;
                                Ad ad3 = (Ad) yVar.readMessage(Ad.parser(), m5Var);
                                this.ad_ = ad3;
                                if (builder3 != null) {
                                    builder3.mergeFrom(ad3);
                                    this.ad_ = builder3.buildPartial();
                                }
                            }
                        } else {
                            this.seat_ = yVar.readStringRequireUtf8();
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

    public static BidEvent parseFrom(y yVar) throws IOException {
        return (BidEvent) k7.parseWithIOException(PARSER, yVar);
    }

    public static BidEvent parseFrom(y yVar, m5 m5Var) throws IOException {
        return (BidEvent) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
