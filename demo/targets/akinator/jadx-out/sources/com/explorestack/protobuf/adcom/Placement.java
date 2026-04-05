package com.explorestack.protobuf.adcom;

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
import com.explorestack.protobuf.t7;
import com.explorestack.protobuf.u7;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class Placement extends k7 implements s {
    public static final int ADMX_FIELD_NUMBER = 14;
    public static final int BADV_FIELD_NUMBER = 9;
    public static final int BAPP_FIELD_NUMBER = 10;
    public static final int BATTR_FIELD_NUMBER = 11;
    public static final int BCAT_FIELD_NUMBER = 6;
    public static final int CATTAX_FIELD_NUMBER = 7;
    public static final int CURLX_FIELD_NUMBER = 15;
    public static final int DISPLAY_FIELD_NUMBER = 16;
    public static final int EXT_FIELD_NUMBER = 20;
    public static final int EXT_PROTO_FIELD_NUMBER = 19;
    public static final int REWARD_FIELD_NUMBER = 5;
    public static final int SDKVER_FIELD_NUMBER = 4;
    public static final int SDK_FIELD_NUMBER = 3;
    public static final int SECURE_FIELD_NUMBER = 13;
    public static final int SSAI_FIELD_NUMBER = 2;
    public static final int TAGID_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 17;
    public static final int WLANG_FIELD_NUMBER = 12;
    private static final long serialVersionUID = 0;
    private boolean admx_;
    private g8 badv_;
    private g8 bapp_;
    private int battrMemoizedSerializedSize;
    private List<Integer> battr_;
    private g8 bcat_;
    private int cattax_;
    private boolean curlx_;
    private DisplayPlacement display_;
    private List<Any> extProto_;
    private Struct ext_;
    private byte memoizedIsInitialized;
    private boolean reward_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private boolean secure_;
    private int ssai_;
    private volatile Object tagid_;
    private VideoPlacement video_;
    private g8 wlang_;
    private static final t7 battr_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.1
        @Override // com.explorestack.protobuf.t7
        public CreativeAttribute convert(Integer num) {
            CreativeAttribute creativeAttributeValueOf = CreativeAttribute.valueOf(num.intValue());
            return creativeAttributeValueOf == null ? CreativeAttribute.UNRECOGNIZED : creativeAttributeValueOf;
        }
    };
    private static final Placement DEFAULT_INSTANCE = new Placement();
    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.2
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Placement parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Placement(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements s {
        private boolean admx_;
        private g8 badv_;
        private g8 bapp_;
        private List<Integer> battr_;
        private g8 bcat_;
        private int bitField0_;
        private int cattax_;
        private boolean curlx_;
        private xa displayBuilder_;
        private DisplayPlacement display_;
        private xa extBuilder_;
        private pa extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private boolean reward_;
        private Object sdk_;
        private Object sdkver_;
        private boolean secure_;
        private int ssai_;
        private Object tagid_;
        private xa videoBuilder_;
        private VideoPlacement video_;
        private g8 wlang_;

        private Builder() {
            super(null);
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            f8 f8Var = f8.f22138e;
            this.bcat_ = f8Var;
            this.cattax_ = 0;
            this.badv_ = f8Var;
            this.bapp_ = f8Var;
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.wlang_ = f8Var;
            this.extProto_ = list;
            maybeForceBuilderInitialization();
        }

        private void ensureBadvIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.badv_ = new f8(this.badv_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureBappIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.bapp_ = new f8(this.bapp_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureBattrIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.battr_ = new ArrayList(this.battr_);
                this.bitField0_ |= 8;
            }
        }

        private void ensureBcatIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.bcat_ = new f8(this.bcat_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 32;
            }
        }

        private void ensureWlangIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.wlang_ = new f8(this.wlang_);
                this.bitField0_ |= 16;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.E;
        }

        private xa getDisplayFieldBuilder() {
            if (this.displayBuilder_ == null) {
                this.displayBuilder_ = new xa(getDisplay(), getParentForChildren(), isClean());
                this.display_ = null;
            }
            return this.displayBuilder_;
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
                this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private xa getVideoFieldBuilder() {
            if (this.videoBuilder_ == null) {
                this.videoBuilder_ = new xa(getVideo(), getParentForChildren(), isClean());
                this.video_ = null;
            }
            return this.videoBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAllBadv(Iterable<String> iterable) {
            ensureBadvIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.badv_);
            onChanged();
            return this;
        }

        public Builder addAllBapp(Iterable<String> iterable) {
            ensureBappIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.bapp_);
            onChanged();
            return this;
        }

        public Builder addAllBattr(Iterable<? extends CreativeAttribute> iterable) {
            ensureBattrIsMutable();
            Iterator<? extends CreativeAttribute> it = iterable.iterator();
            while (it.hasNext()) {
                this.battr_.add(Integer.valueOf(it.next().getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder addAllBattrValue(Iterable<Integer> iterable) {
            ensureBattrIsMutable();
            for (Integer num : iterable) {
                num.intValue();
                this.battr_.add(num);
            }
            onChanged();
            return this;
        }

        public Builder addAllBcat(Iterable<String> iterable) {
            ensureBcatIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.bcat_);
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

        public Builder addAllWlang(Iterable<String> iterable) {
            ensureWlangIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.wlang_);
            onChanged();
            return this;
        }

        public Builder addBadv(String str) {
            str.getClass();
            ensureBadvIsMutable();
            this.badv_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addBadvBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            ensureBadvIsMutable();
            this.badv_.add(byteString);
            onChanged();
            return this;
        }

        public Builder addBapp(String str) {
            str.getClass();
            ensureBappIsMutable();
            this.bapp_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addBappBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            ensureBappIsMutable();
            this.bapp_.add(byteString);
            onChanged();
            return this;
        }

        public Builder addBattr(CreativeAttribute creativeAttribute) {
            creativeAttribute.getClass();
            ensureBattrIsMutable();
            this.battr_.add(Integer.valueOf(creativeAttribute.getNumber()));
            onChanged();
            return this;
        }

        public Builder addBattrValue(int i10) {
            ensureBattrIsMutable();
            this.battr_.add(Integer.valueOf(i10));
            onChanged();
            return this;
        }

        public Builder addBcat(String str) {
            str.getClass();
            ensureBcatIsMutable();
            this.bcat_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addBcatBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            ensureBcatIsMutable();
            this.bcat_.add(byteString);
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

        public Builder addWlang(String str) {
            str.getClass();
            ensureWlangIsMutable();
            this.wlang_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addWlangBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            ensureWlangIsMutable();
            this.wlang_.add(byteString);
            onChanged();
            return this;
        }

        public Builder clearAdmx() {
            this.admx_ = false;
            onChanged();
            return this;
        }

        public Builder clearBadv() {
            this.badv_ = f8.f22138e;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearBapp() {
            this.bapp_ = f8.f22138e;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearBattr() {
            this.battr_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearBcat() {
            this.bcat_ = f8.f22138e;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearCattax() {
            this.cattax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCurlx() {
            this.curlx_ = false;
            onChanged();
            return this;
        }

        public Builder clearDisplay() {
            if (this.displayBuilder_ == null) {
                this.display_ = null;
                onChanged();
                return this;
            }
            this.display_ = null;
            this.displayBuilder_ = null;
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
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearReward() {
            this.reward_ = false;
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = Placement.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = Placement.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder clearSecure() {
            this.secure_ = false;
            onChanged();
            return this;
        }

        public Builder clearSsai() {
            this.ssai_ = 0;
            onChanged();
            return this;
        }

        public Builder clearTagid() {
            this.tagid_ = Placement.getDefaultInstance().getTagid();
            onChanged();
            return this;
        }

        public Builder clearVideo() {
            if (this.videoBuilder_ == null) {
                this.video_ = null;
                onChanged();
                return this;
            }
            this.video_ = null;
            this.videoBuilder_ = null;
            return this;
        }

        public Builder clearWlang() {
            this.wlang_ = f8.f22138e;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public boolean getAdmx() {
            return this.admx_;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public String getBadv(int i10) {
            return (String) this.badv_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ByteString getBadvBytes(int i10) {
            return this.badv_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public int getBadvCount() {
            return this.badv_.size();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public String getBapp(int i10) {
            return (String) this.bapp_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ByteString getBappBytes(int i10) {
            return this.bapp_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public int getBappCount() {
            return this.bapp_.size();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public CreativeAttribute getBattr(int i10) {
            return (CreativeAttribute) Placement.battr_converter_.convert(this.battr_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.s
        public int getBattrCount() {
            return this.battr_.size();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public List<CreativeAttribute> getBattrList() {
            return new u7(this.battr_, Placement.battr_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public int getBattrValue(int i10) {
            return this.battr_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public List<Integer> getBattrValueList() {
            return Collections.unmodifiableList(this.battr_);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public String getBcat(int i10) {
            return (String) this.bcat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ByteString getBcatBytes(int i10) {
            return this.bcat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public int getBcatCount() {
            return this.bcat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public boolean getCurlx() {
            return this.curlx_;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.E;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public DisplayPlacement getDisplay() {
            xa xaVar = this.displayBuilder_;
            if (xaVar != null) {
                return (DisplayPlacement) xaVar.getMessage();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
        }

        public DisplayPlacement.Builder getDisplayBuilder() {
            onChanged();
            return (DisplayPlacement.Builder) getDisplayFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public DisplayPlacementOrBuilder getDisplayOrBuilder() {
            xa xaVar = this.displayBuilder_;
            if (xaVar != null) {
                return (DisplayPlacementOrBuilder) xaVar.getMessageOrBuilder();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
        }

        @Override // com.explorestack.protobuf.adcom.s
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

        @Override // com.explorestack.protobuf.adcom.s
        public jb getExtOrBuilder() {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.s
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

        @Override // com.explorestack.protobuf.adcom.s
        public int getExtProtoCount() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.size() : paVar.getCount();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public List<Any> getExtProtoList() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            pa paVar = this.extProtoBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public boolean getReward() {
            return this.reward_;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public boolean getSecure() {
            return this.secure_;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public int getSsai() {
            return this.ssai_;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public String getTagid() {
            Object obj = this.tagid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tagid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ByteString getTagidBytes() {
            Object obj = this.tagid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tagid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public VideoPlacement getVideo() {
            xa xaVar = this.videoBuilder_;
            if (xaVar != null) {
                return (VideoPlacement) xaVar.getMessage();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        public VideoPlacement.Builder getVideoBuilder() {
            onChanged();
            return (VideoPlacement.Builder) getVideoFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public VideoPlacementOrBuilder getVideoOrBuilder() {
            xa xaVar = this.videoBuilder_;
            if (xaVar != null) {
                return (VideoPlacementOrBuilder) xaVar.getMessageOrBuilder();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public String getWlang(int i10) {
            return (String) this.wlang_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ByteString getWlangBytes(int i10) {
            return this.wlang_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.s
        public int getWlangCount() {
            return this.wlang_.size();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public boolean hasDisplay() {
            return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public boolean hasVideo() {
            return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return b.F.ensureFieldAccessorsInitialized(Placement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeDisplay(DisplayPlacement displayPlacement) {
            xa xaVar = this.displayBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(displayPlacement);
                return this;
            }
            DisplayPlacement displayPlacement2 = this.display_;
            if (displayPlacement2 != null) {
                this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
            } else {
                this.display_ = displayPlacement;
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

        public Builder mergeVideo(VideoPlacement videoPlacement) {
            xa xaVar = this.videoBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(videoPlacement);
                return this;
            }
            VideoPlacement videoPlacement2 = this.video_;
            if (videoPlacement2 != null) {
                this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
            } else {
                this.video_ = videoPlacement;
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

        public Builder setAdmx(boolean z10) {
            this.admx_ = z10;
            onChanged();
            return this;
        }

        public Builder setBadv(int i10, String str) {
            str.getClass();
            ensureBadvIsMutable();
            this.badv_.set(i10, (int) str);
            onChanged();
            return this;
        }

        public Builder setBapp(int i10, String str) {
            str.getClass();
            ensureBappIsMutable();
            this.bapp_.set(i10, (int) str);
            onChanged();
            return this;
        }

        public Builder setBattr(int i10, CreativeAttribute creativeAttribute) {
            creativeAttribute.getClass();
            ensureBattrIsMutable();
            this.battr_.set(i10, Integer.valueOf(creativeAttribute.getNumber()));
            onChanged();
            return this;
        }

        public Builder setBattrValue(int i10, int i11) {
            ensureBattrIsMutable();
            this.battr_.set(i10, Integer.valueOf(i11));
            onChanged();
            return this;
        }

        public Builder setBcat(int i10, String str) {
            str.getClass();
            ensureBcatIsMutable();
            this.bcat_.set(i10, (int) str);
            onChanged();
            return this;
        }

        public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
            categoryTaxonomy.getClass();
            this.cattax_ = categoryTaxonomy.getNumber();
            onChanged();
            return this;
        }

        public Builder setCattaxValue(int i10) {
            this.cattax_ = i10;
            onChanged();
            return this;
        }

        public Builder setCurlx(boolean z10) {
            this.curlx_ = z10;
            onChanged();
            return this;
        }

        public Builder setDisplay(DisplayPlacement displayPlacement) {
            xa xaVar = this.displayBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(displayPlacement);
                return this;
            }
            displayPlacement.getClass();
            this.display_ = displayPlacement;
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

        public Builder setReward(boolean z10) {
            this.reward_ = z10;
            onChanged();
            return this;
        }

        public Builder setSdk(String str) {
            str.getClass();
            this.sdk_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.sdk_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdkver(String str) {
            str.getClass();
            this.sdkver_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSecure(boolean z10) {
            this.secure_ = z10;
            onChanged();
            return this;
        }

        public Builder setSsai(int i10) {
            this.ssai_ = i10;
            onChanged();
            return this;
        }

        public Builder setTagid(String str) {
            str.getClass();
            this.tagid_ = str;
            onChanged();
            return this;
        }

        public Builder setTagidBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.tagid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setVideo(VideoPlacement videoPlacement) {
            xa xaVar = this.videoBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(videoPlacement);
                return this;
            }
            videoPlacement.getClass();
            this.video_ = videoPlacement;
            onChanged();
            return this;
        }

        public Builder setWlang(int i10, String str) {
            str.getClass();
            ensureWlangIsMutable();
            this.wlang_.set(i10, (int) str);
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ka getBadvList() {
            return this.badv_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ka getBappList() {
            return this.bapp_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ka getBcatList() {
            return this.bcat_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.adcom.s
        public ka getWlangList() {
            return this.wlang_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement build() {
            Placement placementBuildPartial = buildPartial();
            if (placementBuildPartial.isInitialized()) {
                return placementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) placementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement buildPartial() {
            Placement placement = new Placement(this);
            placement.tagid_ = this.tagid_;
            placement.ssai_ = this.ssai_;
            placement.sdk_ = this.sdk_;
            placement.sdkver_ = this.sdkver_;
            placement.reward_ = this.reward_;
            if ((this.bitField0_ & 1) != 0) {
                this.bcat_ = this.bcat_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            placement.bcat_ = this.bcat_;
            placement.cattax_ = this.cattax_;
            if ((this.bitField0_ & 2) != 0) {
                this.badv_ = this.badv_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            placement.badv_ = this.badv_;
            if ((this.bitField0_ & 4) != 0) {
                this.bapp_ = this.bapp_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            placement.bapp_ = this.bapp_;
            if ((this.bitField0_ & 8) != 0) {
                this.battr_ = Collections.unmodifiableList(this.battr_);
                this.bitField0_ &= -9;
            }
            placement.battr_ = this.battr_;
            if ((this.bitField0_ & 16) != 0) {
                this.wlang_ = this.wlang_.getUnmodifiableView();
                this.bitField0_ &= -17;
            }
            placement.wlang_ = this.wlang_;
            placement.secure_ = this.secure_;
            placement.admx_ = this.admx_;
            placement.curlx_ = this.curlx_;
            xa xaVar = this.displayBuilder_;
            if (xaVar == null) {
                placement.display_ = this.display_;
            } else {
                placement.display_ = (DisplayPlacement) xaVar.build();
            }
            xa xaVar2 = this.videoBuilder_;
            if (xaVar2 == null) {
                placement.video_ = this.video_;
            } else {
                placement.video_ = (VideoPlacement) xaVar2.build();
            }
            xa xaVar3 = this.extBuilder_;
            if (xaVar3 == null) {
                placement.ext_ = this.ext_;
            } else {
                placement.ext_ = (Struct) xaVar3.build();
            }
            pa paVar = this.extProtoBuilder_;
            if (paVar != null) {
                placement.extProto_ = paVar.build();
            } else {
                if ((this.bitField0_ & 32) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -33;
                }
                placement.extProto_ = this.extProto_;
            }
            onBuilt();
            return placement;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Placement getDefaultInstanceForType() {
            return Placement.getDefaultInstance();
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
            this.tagid_ = "";
            this.ssai_ = 0;
            this.sdk_ = "";
            this.sdkver_ = "";
            this.reward_ = false;
            f8 f8Var = f8.f22138e;
            this.bcat_ = f8Var;
            int i10 = this.bitField0_;
            this.cattax_ = 0;
            this.badv_ = f8Var;
            this.bapp_ = f8Var;
            this.bitField0_ = i10 & (-8);
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.wlang_ = f8Var;
            this.bitField0_ = i10 & (-32);
            this.secure_ = false;
            this.admx_ = false;
            this.curlx_ = false;
            if (this.displayBuilder_ == null) {
                this.display_ = null;
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
            }
            if (this.videoBuilder_ == null) {
                this.video_ = null;
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            pa paVar = this.extProtoBuilder_;
            if (paVar == null) {
                this.extProto_ = list;
                this.bitField0_ = i10 & (-64);
                return this;
            }
            paVar.clear();
            return this;
        }

        public Builder setDisplay(DisplayPlacement.Builder builder) {
            xa xaVar = this.displayBuilder_;
            if (xaVar == null) {
                this.display_ = builder.build();
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

        public Builder setVideo(VideoPlacement.Builder builder) {
            xa xaVar = this.videoBuilder_;
            if (xaVar == null) {
                this.video_ = builder.build();
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
            if (message instanceof Placement) {
                return mergeFrom((Placement) message);
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

        public Builder mergeFrom(Placement placement) {
            if (placement == Placement.getDefaultInstance()) {
                return this;
            }
            if (!placement.getTagid().isEmpty()) {
                this.tagid_ = placement.tagid_;
                onChanged();
            }
            if (placement.getSsai() != 0) {
                setSsai(placement.getSsai());
            }
            if (!placement.getSdk().isEmpty()) {
                this.sdk_ = placement.sdk_;
                onChanged();
            }
            if (!placement.getSdkver().isEmpty()) {
                this.sdkver_ = placement.sdkver_;
                onChanged();
            }
            if (placement.getReward()) {
                setReward(placement.getReward());
            }
            if (!placement.bcat_.isEmpty()) {
                if (this.bcat_.isEmpty()) {
                    this.bcat_ = placement.bcat_;
                    this.bitField0_ &= -2;
                } else {
                    ensureBcatIsMutable();
                    this.bcat_.addAll(placement.bcat_);
                }
                onChanged();
            }
            if (placement.cattax_ != 0) {
                setCattaxValue(placement.getCattaxValue());
            }
            if (!placement.badv_.isEmpty()) {
                if (this.badv_.isEmpty()) {
                    this.badv_ = placement.badv_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBadvIsMutable();
                    this.badv_.addAll(placement.badv_);
                }
                onChanged();
            }
            if (!placement.bapp_.isEmpty()) {
                if (this.bapp_.isEmpty()) {
                    this.bapp_ = placement.bapp_;
                    this.bitField0_ &= -5;
                } else {
                    ensureBappIsMutable();
                    this.bapp_.addAll(placement.bapp_);
                }
                onChanged();
            }
            if (!placement.battr_.isEmpty()) {
                if (this.battr_.isEmpty()) {
                    this.battr_ = placement.battr_;
                    this.bitField0_ &= -9;
                } else {
                    ensureBattrIsMutable();
                    this.battr_.addAll(placement.battr_);
                }
                onChanged();
            }
            if (!placement.wlang_.isEmpty()) {
                if (this.wlang_.isEmpty()) {
                    this.wlang_ = placement.wlang_;
                    this.bitField0_ &= -17;
                } else {
                    ensureWlangIsMutable();
                    this.wlang_.addAll(placement.wlang_);
                }
                onChanged();
            }
            if (placement.getSecure()) {
                setSecure(placement.getSecure());
            }
            if (placement.getAdmx()) {
                setAdmx(placement.getAdmx());
            }
            if (placement.getCurlx()) {
                setCurlx(placement.getCurlx());
            }
            if (placement.hasDisplay()) {
                mergeDisplay(placement.getDisplay());
            }
            if (placement.hasVideo()) {
                mergeVideo(placement.getVideo());
            }
            if (placement.hasExt()) {
                mergeExt(placement.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!placement.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = placement.extProto_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(placement.extProto_);
                    }
                    onChanged();
                }
            } else if (!placement.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.addAllMessages(placement.extProto_);
                } else {
                    this.extProtoBuilder_.dispose();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = placement.extProto_;
                    this.bitField0_ &= -33;
                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) placement).unknownFields);
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

        private Builder(p6 p6Var) {
            super(p6Var);
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            f8 f8Var = f8.f22138e;
            this.bcat_ = f8Var;
            this.cattax_ = 0;
            this.badv_ = f8Var;
            this.bapp_ = f8Var;
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.wlang_ = f8Var;
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

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.explorestack.protobuf.adcom.Placement.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.access$22100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.adcom.Placement r3 = (com.explorestack.protobuf.adcom.Placement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.adcom.Placement r4 = (com.explorestack.protobuf.adcom.Placement) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$Builder");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DisplayPlacement extends k7 implements DisplayPlacementOrBuilder {
        public static final int AMPREN_FIELD_NUMBER = 6;
        public static final int API_FIELD_NUMBER = 10;
        public static final int CLKTYPE_FIELD_NUMBER = 5;
        public static final int CONTEXT_FIELD_NUMBER = 8;
        public static final int CTYPE_FIELD_NUMBER = 11;
        public static final int DISPLAYFMT_FIELD_NUMBER = 16;
        public static final int EVENT_FIELD_NUMBER = 18;
        public static final int EXT_FIELD_NUMBER = 20;
        public static final int EXT_PROTO_FIELD_NUMBER = 19;
        public static final int H_FIELD_NUMBER = 13;
        public static final int IFRBUST_FIELD_NUMBER = 4;
        public static final int INSTL_FIELD_NUMBER = 2;
        public static final int MIME_FIELD_NUMBER = 9;
        public static final int NATIVEFMT_FIELD_NUMBER = 17;
        public static final int POS_FIELD_NUMBER = 1;
        public static final int PRIV_FIELD_NUMBER = 15;
        public static final int PTYPE_FIELD_NUMBER = 7;
        public static final int TOPFRAME_FIELD_NUMBER = 3;
        public static final int UNIT_FIELD_NUMBER = 14;
        public static final int W_FIELD_NUMBER = 12;
        private static final long serialVersionUID = 0;
        private int ampren_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private int clktype_;
        private int context_;
        private int ctypeMemoizedSerializedSize;
        private List<Integer> ctype_;
        private List<DisplayFormat> displayfmt_;
        private List<EventSpec> event_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private g8 ifrbust_;
        private boolean instl_;
        private byte memoizedIsInitialized;
        private g8 mime_;
        private NativeFormat nativefmt_;
        private int pos_;
        private boolean priv_;
        private int ptype_;
        private boolean topframe_;
        private int unit_;
        private int w_;
        private static final t7 api_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.1
            @Override // com.explorestack.protobuf.t7
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final t7 ctype_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.2
            @Override // com.explorestack.protobuf.t7
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType displayCreativeTypeValueOf = DisplayCreativeType.valueOf(num.intValue());
                return displayCreativeTypeValueOf == null ? DisplayCreativeType.UNRECOGNIZED : displayCreativeTypeValueOf;
            }
        };
        private static final DisplayPlacement DEFAULT_INSTANCE = new DisplayPlacement();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.3
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public DisplayPlacement parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new DisplayPlacement(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements DisplayPlacementOrBuilder {
            private int ampren_;
            private List<Integer> api_;
            private int bitField0_;
            private int clktype_;
            private int context_;
            private List<Integer> ctype_;
            private pa displayfmtBuilder_;
            private List<DisplayFormat> displayfmt_;
            private pa eventBuilder_;
            private List<EventSpec> event_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private g8 ifrbust_;
            private boolean instl_;
            private g8 mime_;
            private xa nativefmtBuilder_;
            private NativeFormat nativefmt_;
            private int pos_;
            private boolean priv_;
            private int ptype_;
            private boolean topframe_;
            private int unit_;
            private int w_;

            private Builder() {
                super(null);
                this.pos_ = 0;
                f8 f8Var = f8.f22138e;
                this.ifrbust_ = f8Var;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = f8Var;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.displayfmt_ = list;
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureDisplayfmtIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.displayfmt_ = new ArrayList(this.displayfmt_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureIfrbustIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.ifrbust_ = new f8(this.ifrbust_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.mime_ = new f8(this.mime_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.G;
            }

            private pa getDisplayfmtFieldBuilder() {
                if (this.displayfmtBuilder_ == null) {
                    this.displayfmtBuilder_ = new pa(this.displayfmt_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.displayfmt_ = null;
                }
                return this.displayfmtBuilder_;
            }

            private pa getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    this.eventBuilder_ = new pa(this.event_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                    this.event_ = null;
                }
                return this.eventBuilder_;
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
                    this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private xa getNativefmtFieldBuilder() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmtBuilder_ = new xa(getNativefmt(), getParentForChildren(), isClean());
                    this.nativefmt_ = null;
                }
                return this.nativefmtBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getDisplayfmtFieldBuilder();
                    getEventFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.api_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllCtype(Iterable<? extends DisplayCreativeType> iterable) {
                ensureCtypeIsMutable();
                Iterator<? extends DisplayCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.ctype_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllDisplayfmt(Iterable<? extends DisplayFormat> iterable) {
                pa paVar = this.displayfmtBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureDisplayfmtIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.displayfmt_);
                onChanged();
                return this;
            }

            public Builder addAllEvent(Iterable<? extends EventSpec> iterable) {
                pa paVar = this.eventBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureEventIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.event_);
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

            public Builder addAllIfrbust(Iterable<String> iterable) {
                ensureIfrbustIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.ifrbust_);
                onChanged();
                return this;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addCtype(DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i10) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat displayFormat) {
                pa paVar = this.displayfmtBuilder_;
                if (paVar != null) {
                    paVar.addMessage(displayFormat);
                    return this;
                }
                displayFormat.getClass();
                ensureDisplayfmtIsMutable();
                this.displayfmt_.add(displayFormat);
                onChanged();
                return this;
            }

            public DisplayFormat.Builder addDisplayfmtBuilder() {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().addBuilder(DisplayFormat.getDefaultInstance());
            }

            public Builder addEvent(EventSpec eventSpec) {
                pa paVar = this.eventBuilder_;
                if (paVar != null) {
                    paVar.addMessage(eventSpec);
                    return this;
                }
                eventSpec.getClass();
                ensureEventIsMutable();
                this.event_.add(eventSpec);
                onChanged();
                return this;
            }

            public EventSpec.Builder addEventBuilder() {
                return (EventSpec.Builder) getEventFieldBuilder().addBuilder(EventSpec.getDefaultInstance());
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

            public Builder addIfrbust(String str) {
                str.getClass();
                ensureIfrbustIsMutable();
                this.ifrbust_.add((g8) str);
                onChanged();
                return this;
            }

            public Builder addIfrbustBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                ensureIfrbustIsMutable();
                this.ifrbust_.add(byteString);
                onChanged();
                return this;
            }

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add((g8) str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.add(byteString);
                onChanged();
                return this;
            }

            public Builder clearAmpren() {
                this.ampren_ = 0;
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearContext() {
                this.context_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearDisplayfmt() {
                pa paVar = this.displayfmtBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.displayfmt_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearEvent() {
                pa paVar = this.eventBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.event_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -33;
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
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIfrbust() {
                this.ifrbust_ = f8.f22138e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearInstl() {
                this.instl_ = false;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = f8.f22138e;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearNativefmt() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                    onChanged();
                    return this;
                }
                this.nativefmt_ = null;
                this.nativefmtBuilder_ = null;
                return this;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPriv() {
                this.priv_ = false;
                onChanged();
                return this;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTopframe() {
                this.topframe_ = false;
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getAmpren() {
                return this.ampren_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) DisplayPlacement.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<ApiFramework> getApiList() {
                return new u7(this.api_, DisplayPlacement.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ClickType getClktype() {
                ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
                return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getClktypeValue() {
                return this.clktype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayContextType getContext() {
                DisplayContextType displayContextTypeValueOf = DisplayContextType.valueOf(this.context_);
                return displayContextTypeValueOf == null ? DisplayContextType.UNRECOGNIZED : displayContextTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getContextValue() {
                return this.context_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayCreativeType getCtype(int i10) {
                return (DisplayCreativeType) DisplayPlacement.ctype_converter_.convert(this.ctype_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getCtypeCount() {
                return this.ctype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<DisplayCreativeType> getCtypeList() {
                return new u7(this.ctype_, DisplayPlacement.ctype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getCtypeValue(int i10) {
                return this.ctype_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Integer> getCtypeValueList() {
                return Collections.unmodifiableList(this.ctype_);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.G;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayFormat getDisplayfmt(int i10) {
                pa paVar = this.displayfmtBuilder_;
                return paVar == null ? this.displayfmt_.get(i10) : (DisplayFormat) paVar.getMessage(i10);
            }

            public DisplayFormat.Builder getDisplayfmtBuilder(int i10) {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().getBuilder(i10);
            }

            public List<DisplayFormat.Builder> getDisplayfmtBuilderList() {
                return getDisplayfmtFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getDisplayfmtCount() {
                pa paVar = this.displayfmtBuilder_;
                return paVar == null ? this.displayfmt_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<DisplayFormat> getDisplayfmtList() {
                pa paVar = this.displayfmtBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.displayfmt_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i10) {
                pa paVar = this.displayfmtBuilder_;
                return paVar == null ? this.displayfmt_.get(i10) : (DisplayFormatOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
                pa paVar = this.displayfmtBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.displayfmt_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public EventSpec getEvent(int i10) {
                pa paVar = this.eventBuilder_;
                return paVar == null ? this.event_.get(i10) : (EventSpec) paVar.getMessage(i10);
            }

            public EventSpec.Builder getEventBuilder(int i10) {
                return (EventSpec.Builder) getEventFieldBuilder().getBuilder(i10);
            }

            public List<EventSpec.Builder> getEventBuilderList() {
                return getEventFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getEventCount() {
                pa paVar = this.eventBuilder_;
                return paVar == null ? this.event_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<EventSpec> getEventList() {
                pa paVar = this.eventBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.event_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public EventSpecOrBuilder getEventOrBuilder(int i10) {
                pa paVar = this.eventBuilder_;
                return paVar == null ? this.event_.get(i10) : (EventSpecOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
                pa paVar = this.eventBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.event_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public String getIfrbust(int i10) {
                return (String) this.ifrbust_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ByteString getIfrbustBytes(int i10) {
                return this.ifrbust_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getIfrbustCount() {
                return this.ifrbust_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getInstl() {
                return this.instl_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public String getMime(int i10) {
                return (String) this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public NativeFormat getNativefmt() {
                xa xaVar = this.nativefmtBuilder_;
                if (xaVar != null) {
                    return (NativeFormat) xaVar.getMessage();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            public NativeFormat.Builder getNativefmtBuilder() {
                onChanged();
                return (NativeFormat.Builder) getNativefmtFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public NativeFormatOrBuilder getNativefmtOrBuilder() {
                xa xaVar = this.nativefmtBuilder_;
                if (xaVar != null) {
                    return (NativeFormatOrBuilder) xaVar.getMessageOrBuilder();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public PlacementPosition getPos() {
                PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
                return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getPosValue() {
                return this.pos_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getPriv() {
                return this.priv_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayPlacementType getPtype() {
                DisplayPlacementType displayPlacementTypeValueOf = DisplayPlacementType.valueOf(this.ptype_);
                return displayPlacementTypeValueOf == null ? DisplayPlacementType.UNRECOGNIZED : displayPlacementTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getPtypeValue() {
                return this.ptype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getTopframe() {
                return this.topframe_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public SizeUnit getUnit() {
                SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
                return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getUnitValue() {
                return this.unit_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean hasNativefmt() {
                return (this.nativefmtBuilder_ == null && this.nativefmt_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.H.ensureFieldAccessorsInitialized(DisplayPlacement.class, Builder.class);
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

            public Builder mergeNativefmt(NativeFormat nativeFormat) {
                xa xaVar = this.nativefmtBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(nativeFormat);
                    return this;
                }
                NativeFormat nativeFormat2 = this.nativefmt_;
                if (nativeFormat2 != null) {
                    this.nativefmt_ = NativeFormat.newBuilder(nativeFormat2).mergeFrom(nativeFormat).buildPartial();
                } else {
                    this.nativefmt_ = nativeFormat;
                }
                onChanged();
                return this;
            }

            public Builder removeDisplayfmt(int i10) {
                pa paVar = this.displayfmtBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureDisplayfmtIsMutable();
                this.displayfmt_.remove(i10);
                onChanged();
                return this;
            }

            public Builder removeEvent(int i10) {
                pa paVar = this.eventBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureEventIsMutable();
                this.event_.remove(i10);
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

            public Builder setAmpren(int i10) {
                this.ampren_ = i10;
                onChanged();
                return this;
            }

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setClktype(ClickType clickType) {
                clickType.getClass();
                this.clktype_ = clickType.getNumber();
                onChanged();
                return this;
            }

            public Builder setClktypeValue(int i10) {
                this.clktype_ = i10;
                onChanged();
                return this;
            }

            public Builder setContext(DisplayContextType displayContextType) {
                displayContextType.getClass();
                this.context_ = displayContextType.getNumber();
                onChanged();
                return this;
            }

            public Builder setContextValue(int i10) {
                this.context_ = i10;
                onChanged();
                return this;
            }

            public Builder setCtype(int i10, DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setCtypeValue(int i10, int i11) {
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setDisplayfmt(int i10, DisplayFormat displayFormat) {
                pa paVar = this.displayfmtBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, displayFormat);
                    return this;
                }
                displayFormat.getClass();
                ensureDisplayfmtIsMutable();
                this.displayfmt_.set(i10, displayFormat);
                onChanged();
                return this;
            }

            public Builder setEvent(int i10, EventSpec eventSpec) {
                pa paVar = this.eventBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, eventSpec);
                    return this;
                }
                eventSpec.getClass();
                ensureEventIsMutable();
                this.event_.set(i10, eventSpec);
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

            public Builder setH(int i10) {
                this.h_ = i10;
                onChanged();
                return this;
            }

            public Builder setIfrbust(int i10, String str) {
                str.getClass();
                ensureIfrbustIsMutable();
                this.ifrbust_.set(i10, (int) str);
                onChanged();
                return this;
            }

            public Builder setInstl(boolean z10) {
                this.instl_ = z10;
                onChanged();
                return this;
            }

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, (int) str);
                onChanged();
                return this;
            }

            public Builder setNativefmt(NativeFormat nativeFormat) {
                xa xaVar = this.nativefmtBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(nativeFormat);
                    return this;
                }
                nativeFormat.getClass();
                this.nativefmt_ = nativeFormat;
                onChanged();
                return this;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                placementPosition.getClass();
                this.pos_ = placementPosition.getNumber();
                onChanged();
                return this;
            }

            public Builder setPosValue(int i10) {
                this.pos_ = i10;
                onChanged();
                return this;
            }

            public Builder setPriv(boolean z10) {
                this.priv_ = z10;
                onChanged();
                return this;
            }

            public Builder setPtype(DisplayPlacementType displayPlacementType) {
                displayPlacementType.getClass();
                this.ptype_ = displayPlacementType.getNumber();
                onChanged();
                return this;
            }

            public Builder setPtypeValue(int i10) {
                this.ptype_ = i10;
                onChanged();
                return this;
            }

            public Builder setTopframe(boolean z10) {
                this.topframe_ = z10;
                onChanged();
                return this;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                sizeUnit.getClass();
                this.unit_ = sizeUnit.getNumber();
                onChanged();
                return this;
            }

            public Builder setUnitValue(int i10) {
                this.unit_ = i10;
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ka getIfrbustList() {
                return this.ifrbust_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ka getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DisplayPlacement build() {
                DisplayPlacement displayPlacementBuildPartial = buildPartial();
                if (displayPlacementBuildPartial.isInitialized()) {
                    return displayPlacementBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayPlacementBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DisplayPlacement buildPartial() {
                DisplayPlacement displayPlacement = new DisplayPlacement(this);
                displayPlacement.pos_ = this.pos_;
                displayPlacement.instl_ = this.instl_;
                displayPlacement.topframe_ = this.topframe_;
                if ((this.bitField0_ & 1) != 0) {
                    this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                displayPlacement.ifrbust_ = this.ifrbust_;
                displayPlacement.clktype_ = this.clktype_;
                displayPlacement.ampren_ = this.ampren_;
                displayPlacement.ptype_ = this.ptype_;
                displayPlacement.context_ = this.context_;
                if ((this.bitField0_ & 2) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                displayPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 4) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -5;
                }
                displayPlacement.api_ = this.api_;
                if ((this.bitField0_ & 8) != 0) {
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -9;
                }
                displayPlacement.ctype_ = this.ctype_;
                displayPlacement.w_ = this.w_;
                displayPlacement.h_ = this.h_;
                displayPlacement.unit_ = this.unit_;
                displayPlacement.priv_ = this.priv_;
                pa paVar = this.displayfmtBuilder_;
                if (paVar != null) {
                    displayPlacement.displayfmt_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
                        this.bitField0_ &= -17;
                    }
                    displayPlacement.displayfmt_ = this.displayfmt_;
                }
                xa xaVar = this.nativefmtBuilder_;
                if (xaVar == null) {
                    displayPlacement.nativefmt_ = this.nativefmt_;
                } else {
                    displayPlacement.nativefmt_ = (NativeFormat) xaVar.build();
                }
                pa paVar2 = this.eventBuilder_;
                if (paVar2 != null) {
                    displayPlacement.event_ = paVar2.build();
                } else {
                    if ((this.bitField0_ & 32) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                        this.bitField0_ &= -33;
                    }
                    displayPlacement.event_ = this.event_;
                }
                xa xaVar2 = this.extBuilder_;
                if (xaVar2 == null) {
                    displayPlacement.ext_ = this.ext_;
                } else {
                    displayPlacement.ext_ = (Struct) xaVar2.build();
                }
                pa paVar3 = this.extProtoBuilder_;
                if (paVar3 != null) {
                    displayPlacement.extProto_ = paVar3.build();
                } else {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    displayPlacement.extProto_ = this.extProto_;
                }
                onBuilt();
                return displayPlacement;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public DisplayPlacement getDefaultInstanceForType() {
                return DisplayPlacement.getDefaultInstance();
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

            public DisplayFormat.Builder addDisplayfmtBuilder(int i10) {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().addBuilder(i10, DisplayFormat.getDefaultInstance());
            }

            public EventSpec.Builder addEventBuilder(int i10) {
                return (EventSpec.Builder) getEventFieldBuilder().addBuilder(i10, EventSpec.getDefaultInstance());
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
                this.pos_ = 0;
                this.instl_ = false;
                this.topframe_ = false;
                f8 f8Var = f8.f22138e;
                this.ifrbust_ = f8Var;
                int i10 = this.bitField0_;
                this.clktype_ = 0;
                this.ampren_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = f8Var;
                this.bitField0_ = i10 & (-4);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.bitField0_ = i10 & (-16);
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.priv_ = false;
                pa paVar = this.displayfmtBuilder_;
                if (paVar == null) {
                    this.displayfmt_ = list;
                    this.bitField0_ = i10 & (-32);
                } else {
                    paVar.clear();
                }
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                } else {
                    this.nativefmt_ = null;
                    this.nativefmtBuilder_ = null;
                }
                pa paVar2 = this.eventBuilder_;
                if (paVar2 == null) {
                    this.event_ = list;
                    this.bitField0_ &= -33;
                } else {
                    paVar2.clear();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                pa paVar3 = this.extProtoBuilder_;
                if (paVar3 == null) {
                    this.extProto_ = list;
                    this.bitField0_ &= -65;
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

            public Builder setNativefmt(NativeFormat.Builder builder) {
                xa xaVar = this.nativefmtBuilder_;
                if (xaVar == null) {
                    this.nativefmt_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder addDisplayfmt(int i10, DisplayFormat displayFormat) {
                pa paVar = this.displayfmtBuilder_;
                if (paVar == null) {
                    displayFormat.getClass();
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i10, displayFormat);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, displayFormat);
                return this;
            }

            public Builder addEvent(int i10, EventSpec eventSpec) {
                pa paVar = this.eventBuilder_;
                if (paVar == null) {
                    eventSpec.getClass();
                    ensureEventIsMutable();
                    this.event_.add(i10, eventSpec);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, eventSpec);
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
                if (message instanceof DisplayPlacement) {
                    return mergeFrom((DisplayPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDisplayfmt(int i10, DisplayFormat.Builder builder) {
                pa paVar = this.displayfmtBuilder_;
                if (paVar == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            public Builder setEvent(int i10, EventSpec.Builder builder) {
                pa paVar = this.eventBuilder_;
                if (paVar == null) {
                    ensureEventIsMutable();
                    this.event_.set(i10, builder.build());
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

            public Builder mergeFrom(DisplayPlacement displayPlacement) {
                if (displayPlacement == DisplayPlacement.getDefaultInstance()) {
                    return this;
                }
                if (displayPlacement.pos_ != 0) {
                    setPosValue(displayPlacement.getPosValue());
                }
                if (displayPlacement.getInstl()) {
                    setInstl(displayPlacement.getInstl());
                }
                if (displayPlacement.getTopframe()) {
                    setTopframe(displayPlacement.getTopframe());
                }
                if (!displayPlacement.ifrbust_.isEmpty()) {
                    if (this.ifrbust_.isEmpty()) {
                        this.ifrbust_ = displayPlacement.ifrbust_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureIfrbustIsMutable();
                        this.ifrbust_.addAll(displayPlacement.ifrbust_);
                    }
                    onChanged();
                }
                if (displayPlacement.clktype_ != 0) {
                    setClktypeValue(displayPlacement.getClktypeValue());
                }
                if (displayPlacement.getAmpren() != 0) {
                    setAmpren(displayPlacement.getAmpren());
                }
                if (displayPlacement.ptype_ != 0) {
                    setPtypeValue(displayPlacement.getPtypeValue());
                }
                if (displayPlacement.context_ != 0) {
                    setContextValue(displayPlacement.getContextValue());
                }
                if (!displayPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = displayPlacement.mime_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(displayPlacement.mime_);
                    }
                    onChanged();
                }
                if (!displayPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = displayPlacement.api_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(displayPlacement.api_);
                    }
                    onChanged();
                }
                if (!displayPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = displayPlacement.ctype_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(displayPlacement.ctype_);
                    }
                    onChanged();
                }
                if (displayPlacement.getW() != 0) {
                    setW(displayPlacement.getW());
                }
                if (displayPlacement.getH() != 0) {
                    setH(displayPlacement.getH());
                }
                if (displayPlacement.unit_ != 0) {
                    setUnitValue(displayPlacement.getUnitValue());
                }
                if (displayPlacement.getPriv()) {
                    setPriv(displayPlacement.getPriv());
                }
                if (this.displayfmtBuilder_ == null) {
                    if (!displayPlacement.displayfmt_.isEmpty()) {
                        if (this.displayfmt_.isEmpty()) {
                            this.displayfmt_ = displayPlacement.displayfmt_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureDisplayfmtIsMutable();
                            this.displayfmt_.addAll(displayPlacement.displayfmt_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.displayfmt_.isEmpty()) {
                    if (!this.displayfmtBuilder_.isEmpty()) {
                        this.displayfmtBuilder_.addAllMessages(displayPlacement.displayfmt_);
                    } else {
                        this.displayfmtBuilder_.dispose();
                        this.displayfmtBuilder_ = null;
                        this.displayfmt_ = displayPlacement.displayfmt_;
                        this.bitField0_ &= -17;
                        this.displayfmtBuilder_ = k7.alwaysUseFieldBuilders ? getDisplayfmtFieldBuilder() : null;
                    }
                }
                if (displayPlacement.hasNativefmt()) {
                    mergeNativefmt(displayPlacement.getNativefmt());
                }
                if (this.eventBuilder_ == null) {
                    if (!displayPlacement.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = displayPlacement.event_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(displayPlacement.event_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.event_.isEmpty()) {
                    if (!this.eventBuilder_.isEmpty()) {
                        this.eventBuilder_.addAllMessages(displayPlacement.event_);
                    } else {
                        this.eventBuilder_.dispose();
                        this.eventBuilder_ = null;
                        this.event_ = displayPlacement.event_;
                        this.bitField0_ &= -33;
                        this.eventBuilder_ = k7.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                    }
                }
                if (displayPlacement.hasExt()) {
                    mergeExt(displayPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!displayPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = displayPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(displayPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(displayPlacement.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = displayPlacement.extProto_;
                        this.bitField0_ &= -65;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) displayPlacement).unknownFields);
                onChanged();
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat.Builder builder) {
                pa paVar = this.displayfmtBuilder_;
                if (paVar == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(builder.build());
                return this;
            }

            public Builder addEvent(EventSpec.Builder builder) {
                pa paVar = this.eventBuilder_;
                if (paVar == null) {
                    ensureEventIsMutable();
                    this.event_.add(builder.build());
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

            private Builder(p6 p6Var) {
                super(p6Var);
                this.pos_ = 0;
                f8 f8Var = f8.f22138e;
                this.ifrbust_ = f8Var;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = f8Var;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.displayfmt_ = list;
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addDisplayfmt(int i10, DisplayFormat.Builder builder) {
                pa paVar = this.displayfmtBuilder_;
                if (paVar == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, builder.build());
                return this;
            }

            public Builder addEvent(int i10, EventSpec.Builder builder) {
                pa paVar = this.eventBuilder_;
                if (paVar == null) {
                    ensureEventIsMutable();
                    this.event_.add(i10, builder.build());
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
            public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.access$13500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Placement$DisplayPlacement r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Placement$DisplayPlacement r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$Builder");
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DisplayFormat extends k7 implements DisplayFormatOrBuilder {
            public static final int EXPDIR_FIELD_NUMBER = 5;
            public static final int EXT_FIELD_NUMBER = 7;
            public static final int EXT_PROTO_FIELD_NUMBER = 6;
            public static final int HRATIO_FIELD_NUMBER = 4;
            public static final int H_FIELD_NUMBER = 2;
            public static final int WRATIO_FIELD_NUMBER = 3;
            public static final int W_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int expdirMemoizedSerializedSize;
            private List<Integer> expdir_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int hratio_;
            private byte memoizedIsInitialized;
            private int w_;
            private int wratio_;
            private static final t7 expdir_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.1
                @Override // com.explorestack.protobuf.t7
                public ExpandableDirection convert(Integer num) {
                    ExpandableDirection expandableDirectionValueOf = ExpandableDirection.valueOf(num.intValue());
                    return expandableDirectionValueOf == null ? ExpandableDirection.UNRECOGNIZED : expandableDirectionValueOf;
                }
            };
            private static final DisplayFormat DEFAULT_INSTANCE = new DisplayFormat();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.2
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public DisplayFormat parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new DisplayFormat(yVar, m5Var);
                }
            };

            public static DisplayFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.I;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DisplayFormat)) {
                    return super.equals(obj);
                }
                DisplayFormat displayFormat = (DisplayFormat) obj;
                if (getW() == displayFormat.getW() && getH() == displayFormat.getH() && getWratio() == displayFormat.getWratio() && getHratio() == displayFormat.getHratio() && this.expdir_.equals(displayFormat.expdir_) && hasExt() == displayFormat.hasExt()) {
                    return (!hasExt() || getExt().equals(displayFormat.getExt())) && getExtProtoList().equals(displayFormat.getExtProtoList()) && this.unknownFields.equals(displayFormat.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public ExpandableDirection getExpdir(int i10) {
                return (ExpandableDirection) expdir_converter_.convert(this.expdir_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExpdirCount() {
                return this.expdir_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<ExpandableDirection> getExpdirList() {
                return new u7(this.expdir_, expdir_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExpdirValue(int i10) {
                return this.expdir_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<Integer> getExpdirValueList() {
                return this.expdir_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getHratio() {
                return this.hratio_;
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
                int i11 = this.w_;
                int iComputeUInt32Size = i11 != 0 ? h0.computeUInt32Size(1, i11) : 0;
                int i12 = this.h_;
                if (i12 != 0) {
                    iComputeUInt32Size += h0.computeUInt32Size(2, i12);
                }
                int i13 = this.wratio_;
                if (i13 != 0) {
                    iComputeUInt32Size += h0.computeUInt32Size(3, i13);
                }
                int i14 = this.hratio_;
                if (i14 != 0) {
                    iComputeUInt32Size += h0.computeUInt32Size(4, i14);
                }
                int iComputeEnumSizeNoTag = 0;
                for (int i15 = 0; i15 < this.expdir_.size(); i15++) {
                    iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(this.expdir_.get(i15).intValue());
                }
                int iComputeMessageSize = iComputeUInt32Size + iComputeEnumSizeNoTag;
                if (!getExpdirList().isEmpty()) {
                    iComputeMessageSize = iComputeMessageSize + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
                }
                this.expdirMemoizedSerializedSize = iComputeEnumSizeNoTag;
                for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
                    iComputeMessageSize += h0.computeMessageSize(6, this.extProto_.get(i16));
                }
                if (this.ext_ != null) {
                    iComputeMessageSize += h0.computeMessageSize(7, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getWratio() {
                return this.wratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int hratio = getHratio() + ((((getWratio() + ((((getH() + ((((getW() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53);
                if (getExpdirCount() > 0) {
                    hratio = o2.B(hratio, 37, 5, 53) + this.expdir_.hashCode();
                }
                if (hasExt()) {
                    hratio = o2.B(hratio, 37, 7, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hratio = o2.B(hratio, 37, 6, 53) + getExtProtoList().hashCode();
                }
                int iHashCode = this.unknownFields.hashCode() + (hratio * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return b.J.ensureFieldAccessorsInitialized(DisplayFormat.class, Builder.class);
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
                return new DisplayFormat();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                getSerializedSize();
                int i10 = this.w_;
                if (i10 != 0) {
                    h0Var.writeUInt32(1, i10);
                }
                int i11 = this.h_;
                if (i11 != 0) {
                    h0Var.writeUInt32(2, i11);
                }
                int i12 = this.wratio_;
                if (i12 != 0) {
                    h0Var.writeUInt32(3, i12);
                }
                int i13 = this.hratio_;
                if (i13 != 0) {
                    h0Var.writeUInt32(4, i13);
                }
                if (getExpdirList().size() > 0) {
                    h0Var.writeUInt32NoTag(42);
                    h0Var.writeUInt32NoTag(this.expdirMemoizedSerializedSize);
                }
                for (int i14 = 0; i14 < this.expdir_.size(); i14++) {
                    h0Var.writeEnumNoTag(this.expdir_.get(i14).intValue());
                }
                for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                    h0Var.writeMessage(6, this.extProto_.get(i15));
                }
                if (this.ext_ != null) {
                    h0Var.writeMessage(7, getExt());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements DisplayFormatOrBuilder {
                private int bitField0_;
                private List<Integer> expdir_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private int h_;
                private int hratio_;
                private int w_;
                private int wratio_;

                private Builder() {
                    super(null);
                    List list = Collections.EMPTY_LIST;
                    this.expdir_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                private void ensureExpdirIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.expdir_ = new ArrayList(this.expdir_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.I;
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
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllExpdir(Iterable<? extends ExpandableDirection> iterable) {
                    ensureExpdirIsMutable();
                    Iterator<? extends ExpandableDirection> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.expdir_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllExpdirValue(Iterable<Integer> iterable) {
                    ensureExpdirIsMutable();
                    for (Integer num : iterable) {
                        num.intValue();
                        this.expdir_.add(num);
                    }
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

                public Builder addExpdir(ExpandableDirection expandableDirection) {
                    expandableDirection.getClass();
                    ensureExpdirIsMutable();
                    this.expdir_.add(Integer.valueOf(expandableDirection.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addExpdirValue(int i10) {
                    ensureExpdirIsMutable();
                    this.expdir_.add(Integer.valueOf(i10));
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

                public Builder clearExpdir() {
                    this.expdir_ = Collections.EMPTY_LIST;
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

                public Builder clearH() {
                    this.h_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearHratio() {
                    this.hratio_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearW() {
                    this.w_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWratio() {
                    this.wratio_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.I;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public ExpandableDirection getExpdir(int i10) {
                    return (ExpandableDirection) DisplayFormat.expdir_converter_.convert(this.expdir_.get(i10));
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExpdirCount() {
                    return this.expdir_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<ExpandableDirection> getExpdirList() {
                    return new u7(this.expdir_, DisplayFormat.expdir_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExpdirValue(int i10) {
                    return this.expdir_.get(i10).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<Integer> getExpdirValueList() {
                    return Collections.unmodifiableList(this.expdir_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getH() {
                    return this.h_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getHratio() {
                    return this.hratio_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getW() {
                    return this.w_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getWratio() {
                    return this.wratio_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.J.ensureFieldAccessorsInitialized(DisplayFormat.class, Builder.class);
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

                public Builder setExpdir(int i10, ExpandableDirection expandableDirection) {
                    expandableDirection.getClass();
                    ensureExpdirIsMutable();
                    this.expdir_.set(i10, Integer.valueOf(expandableDirection.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setExpdirValue(int i10, int i11) {
                    ensureExpdirIsMutable();
                    this.expdir_.set(i10, Integer.valueOf(i11));
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

                public Builder setH(int i10) {
                    this.h_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setHratio(int i10) {
                    this.hratio_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setW(int i10) {
                    this.w_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setWratio(int i10) {
                    this.wratio_ = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DisplayFormat build() {
                    DisplayFormat displayFormatBuildPartial = buildPartial();
                    if (displayFormatBuildPartial.isInitialized()) {
                        return displayFormatBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayFormatBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DisplayFormat buildPartial() {
                    DisplayFormat displayFormat = new DisplayFormat(this);
                    displayFormat.w_ = this.w_;
                    displayFormat.h_ = this.h_;
                    displayFormat.wratio_ = this.wratio_;
                    displayFormat.hratio_ = this.hratio_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.expdir_ = Collections.unmodifiableList(this.expdir_);
                        this.bitField0_ &= -2;
                    }
                    displayFormat.expdir_ = this.expdir_;
                    xa xaVar = this.extBuilder_;
                    if (xaVar == null) {
                        displayFormat.ext_ = this.ext_;
                    } else {
                        displayFormat.ext_ = (Struct) xaVar.build();
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        displayFormat.extProto_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        displayFormat.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return displayFormat;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public DisplayFormat getDefaultInstanceForType() {
                    return DisplayFormat.getDefaultInstance();
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
                    this.w_ = 0;
                    this.h_ = 0;
                    this.wratio_ = 0;
                    this.hratio_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.expdir_ = list;
                    int i10 = this.bitField0_;
                    this.bitField0_ = i10 & (-2);
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar == null) {
                        this.extProto_ = list;
                        this.bitField0_ = i10 & (-4);
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

                private Builder(p6 p6Var) {
                    super(p6Var);
                    List list = Collections.EMPTY_LIST;
                    this.expdir_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
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
                    if (message instanceof DisplayFormat) {
                        return mergeFrom((DisplayFormat) message);
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

                public Builder mergeFrom(DisplayFormat displayFormat) {
                    if (displayFormat == DisplayFormat.getDefaultInstance()) {
                        return this;
                    }
                    if (displayFormat.getW() != 0) {
                        setW(displayFormat.getW());
                    }
                    if (displayFormat.getH() != 0) {
                        setH(displayFormat.getH());
                    }
                    if (displayFormat.getWratio() != 0) {
                        setWratio(displayFormat.getWratio());
                    }
                    if (displayFormat.getHratio() != 0) {
                        setHratio(displayFormat.getHratio());
                    }
                    if (!displayFormat.expdir_.isEmpty()) {
                        if (this.expdir_.isEmpty()) {
                            this.expdir_ = displayFormat.expdir_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExpdirIsMutable();
                            this.expdir_.addAll(displayFormat.expdir_);
                        }
                        onChanged();
                    }
                    if (displayFormat.hasExt()) {
                        mergeExt(displayFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!displayFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = displayFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(displayFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!displayFormat.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(displayFormat.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = displayFormat.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) displayFormat).unknownFields);
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
                public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$DisplayFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$DisplayFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$DisplayFormat$Builder");
                }
            }

            public static Builder newBuilder(DisplayFormat displayFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayFormat);
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private DisplayFormat(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (DisplayFormat) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static DisplayFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public DisplayFormat getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static DisplayFormat parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DisplayFormat() {
                this.memoizedIsInitialized = (byte) -1;
                List list = Collections.EMPTY_LIST;
                this.expdir_ = list;
                this.extProto_ = list;
            }

            public static DisplayFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static DisplayFormat parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (DisplayFormat) PARSER.parseFrom(bArr, m5Var);
            }

            public static DisplayFormat parseFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) k7.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private DisplayFormat(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                if (tag == 8) {
                                    this.w_ = yVar.readUInt32();
                                } else if (tag == 16) {
                                    this.h_ = yVar.readUInt32();
                                } else if (tag == 24) {
                                    this.wratio_ = yVar.readUInt32();
                                } else if (tag == 32) {
                                    this.hratio_ = yVar.readUInt32();
                                } else if (tag == 40) {
                                    int i11 = yVar.readEnum();
                                    if ((i10 & 1) == 0) {
                                        this.expdir_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.expdir_.add(Integer.valueOf(i11));
                                } else if (tag == 42) {
                                    int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                    while (yVar.getBytesUntilLimit() > 0) {
                                        int i12 = yVar.readEnum();
                                        if ((i10 & 1) == 0) {
                                            this.expdir_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.expdir_.add(Integer.valueOf(i12));
                                    }
                                    yVar.popLimit(iPushLimit);
                                } else if (tag == 50) {
                                    if ((i10 & 2) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                } else if (tag != 58) {
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
                            this.expdir_ = Collections.unmodifiableList(this.expdir_);
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
                    this.expdir_ = Collections.unmodifiableList(this.expdir_);
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static DisplayFormat parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (DisplayFormat) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static DisplayFormat parseFrom(y yVar) throws IOException {
                return (DisplayFormat) k7.parseWithIOException(PARSER, yVar);
            }

            public static DisplayFormat parseFrom(y yVar, m5 m5Var) throws IOException {
                return (DisplayFormat) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface DisplayFormatOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            ExpandableDirection getExpdir(int i10);

            int getExpdirCount();

            List<ExpandableDirection> getExpdirList();

            int getExpdirValue(int i10);

            List<Integer> getExpdirValueList();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

            List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

            int getH();

            int getHratio();

            int getW();

            int getWratio();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class EventSpec extends k7 implements EventSpecOrBuilder {
            public static final int API_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 9;
            public static final int EXT_PROTO_FIELD_NUMBER = 8;
            public static final int JSTRK_FIELD_NUMBER = 4;
            public static final int METHOD_FIELD_NUMBER = 2;
            public static final int PXTRK_FIELD_NUMBER = 6;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int WJS_FIELD_NUMBER = 5;
            public static final int WPX_FIELD_NUMBER = 7;
            private static final long serialVersionUID = 0;
            private int apiMemoizedSerializedSize;
            private List<Integer> api_;
            private List<Any> extProto_;
            private Struct ext_;
            private g8 jstrk_;
            private byte memoizedIsInitialized;
            private int methodMemoizedSerializedSize;
            private List<Integer> method_;
            private g8 pxtrk_;
            private int type_;
            private boolean wjs_;
            private boolean wpx_;
            private static final t7 method_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.1
                @Override // com.explorestack.protobuf.t7
                public EventTrackingMethod convert(Integer num) {
                    EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(num.intValue());
                    return eventTrackingMethodValueOf == null ? EventTrackingMethod.UNRECOGNIZED : eventTrackingMethodValueOf;
                }
            };
            private static final t7 api_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.2
                @Override // com.explorestack.protobuf.t7
                public ApiFramework convert(Integer num) {
                    ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                    return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
                }
            };
            private static final EventSpec DEFAULT_INSTANCE = new EventSpec();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.3
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public EventSpec parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new EventSpec(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements EventSpecOrBuilder {
                private List<Integer> api_;
                private int bitField0_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private g8 jstrk_;
                private List<Integer> method_;
                private g8 pxtrk_;
                private int type_;
                private boolean wjs_;
                private boolean wpx_;

                private Builder() {
                    super(null);
                    this.type_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.method_ = list;
                    this.api_ = list;
                    f8 f8Var = f8.f22138e;
                    this.jstrk_ = f8Var;
                    this.pxtrk_ = f8Var;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                private void ensureApiIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.api_ = new ArrayList(this.api_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 16) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 16;
                    }
                }

                private void ensureJstrkIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.jstrk_ = new f8(this.jstrk_);
                        this.bitField0_ |= 4;
                    }
                }

                private void ensureMethodIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.method_ = new ArrayList(this.method_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensurePxtrkIsMutable() {
                    if ((this.bitField0_ & 8) == 0) {
                        this.pxtrk_ = new f8(this.pxtrk_);
                        this.bitField0_ |= 8;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.U;
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
                        this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (k7.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                    ensureApiIsMutable();
                    Iterator<? extends ApiFramework> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.api_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllApiValue(Iterable<Integer> iterable) {
                    ensureApiIsMutable();
                    for (Integer num : iterable) {
                        num.intValue();
                        this.api_.add(num);
                    }
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

                public Builder addAllJstrk(Iterable<String> iterable) {
                    ensureJstrkIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.jstrk_);
                    onChanged();
                    return this;
                }

                public Builder addAllMethod(Iterable<? extends EventTrackingMethod> iterable) {
                    ensureMethodIsMutable();
                    Iterator<? extends EventTrackingMethod> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.method_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllMethodValue(Iterable<Integer> iterable) {
                    ensureMethodIsMutable();
                    for (Integer num : iterable) {
                        num.intValue();
                        this.method_.add(num);
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllPxtrk(Iterable<String> iterable) {
                    ensurePxtrkIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.pxtrk_);
                    onChanged();
                    return this;
                }

                public Builder addApi(ApiFramework apiFramework) {
                    apiFramework.getClass();
                    ensureApiIsMutable();
                    this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addApiValue(int i10) {
                    ensureApiIsMutable();
                    this.api_.add(Integer.valueOf(i10));
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

                public Builder addJstrk(String str) {
                    str.getClass();
                    ensureJstrkIsMutable();
                    this.jstrk_.add((g8) str);
                    onChanged();
                    return this;
                }

                public Builder addJstrkBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    ensureJstrkIsMutable();
                    this.jstrk_.add(byteString);
                    onChanged();
                    return this;
                }

                public Builder addMethod(EventTrackingMethod eventTrackingMethod) {
                    eventTrackingMethod.getClass();
                    ensureMethodIsMutable();
                    this.method_.add(Integer.valueOf(eventTrackingMethod.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addMethodValue(int i10) {
                    ensureMethodIsMutable();
                    this.method_.add(Integer.valueOf(i10));
                    onChanged();
                    return this;
                }

                public Builder addPxtrk(String str) {
                    str.getClass();
                    ensurePxtrkIsMutable();
                    this.pxtrk_.add((g8) str);
                    onChanged();
                    return this;
                }

                public Builder addPxtrkBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    ensurePxtrkIsMutable();
                    this.pxtrk_.add(byteString);
                    onChanged();
                    return this;
                }

                public Builder clearApi() {
                    this.api_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
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
                    this.bitField0_ &= -17;
                    onChanged();
                    return this;
                }

                public Builder clearJstrk() {
                    this.jstrk_ = f8.f22138e;
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearMethod() {
                    this.method_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearPxtrk() {
                    this.pxtrk_ = f8.f22138e;
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.type_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWjs() {
                    this.wjs_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearWpx() {
                    this.wpx_ = false;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ApiFramework getApi(int i10) {
                    return (ApiFramework) EventSpec.api_converter_.convert(this.api_.get(i10));
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getApiCount() {
                    return this.api_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<ApiFramework> getApiList() {
                    return new u7(this.api_, EventSpec.api_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getApiValue(int i10) {
                    return this.api_.get(i10).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Integer> getApiValueList() {
                    return Collections.unmodifiableList(this.api_);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.U;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public String getJstrk(int i10) {
                    return (String) this.jstrk_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ByteString getJstrkBytes(int i10) {
                    return this.jstrk_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getJstrkCount() {
                    return this.jstrk_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public EventTrackingMethod getMethod(int i10) {
                    return (EventTrackingMethod) EventSpec.method_converter_.convert(this.method_.get(i10));
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getMethodCount() {
                    return this.method_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<EventTrackingMethod> getMethodList() {
                    return new u7(this.method_, EventSpec.method_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getMethodValue(int i10) {
                    return this.method_.get(i10).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Integer> getMethodValueList() {
                    return Collections.unmodifiableList(this.method_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public String getPxtrk(int i10) {
                    return (String) this.pxtrk_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ByteString getPxtrkBytes(int i10) {
                    return this.pxtrk_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getPxtrkCount() {
                    return this.pxtrk_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public EventType getType() {
                    EventType eventTypeValueOf = EventType.valueOf(this.type_);
                    return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getTypeValue() {
                    return this.type_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean getWjs() {
                    return this.wjs_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean getWpx() {
                    return this.wpx_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.V.ensureFieldAccessorsInitialized(EventSpec.class, Builder.class);
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

                public Builder setApi(int i10, ApiFramework apiFramework) {
                    apiFramework.getClass();
                    ensureApiIsMutable();
                    this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setApiValue(int i10, int i11) {
                    ensureApiIsMutable();
                    this.api_.set(i10, Integer.valueOf(i11));
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

                public Builder setJstrk(int i10, String str) {
                    str.getClass();
                    ensureJstrkIsMutable();
                    this.jstrk_.set(i10, (int) str);
                    onChanged();
                    return this;
                }

                public Builder setMethod(int i10, EventTrackingMethod eventTrackingMethod) {
                    eventTrackingMethod.getClass();
                    ensureMethodIsMutable();
                    this.method_.set(i10, Integer.valueOf(eventTrackingMethod.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setMethodValue(int i10, int i11) {
                    ensureMethodIsMutable();
                    this.method_.set(i10, Integer.valueOf(i11));
                    onChanged();
                    return this;
                }

                public Builder setPxtrk(int i10, String str) {
                    str.getClass();
                    ensurePxtrkIsMutable();
                    this.pxtrk_.set(i10, (int) str);
                    onChanged();
                    return this;
                }

                public Builder setType(EventType eventType) {
                    eventType.getClass();
                    this.type_ = eventType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setTypeValue(int i10) {
                    this.type_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setWjs(boolean z10) {
                    this.wjs_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setWpx(boolean z10) {
                    this.wpx_ = z10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ka getJstrkList() {
                    return this.jstrk_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ka getPxtrkList() {
                    return this.pxtrk_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EventSpec build() {
                    EventSpec eventSpecBuildPartial = buildPartial();
                    if (eventSpecBuildPartial.isInitialized()) {
                        return eventSpecBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventSpecBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EventSpec buildPartial() {
                    EventSpec eventSpec = new EventSpec(this);
                    eventSpec.type_ = this.type_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.method_ = Collections.unmodifiableList(this.method_);
                        this.bitField0_ &= -2;
                    }
                    eventSpec.method_ = this.method_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                        this.bitField0_ &= -3;
                    }
                    eventSpec.api_ = this.api_;
                    if ((this.bitField0_ & 4) != 0) {
                        this.jstrk_ = this.jstrk_.getUnmodifiableView();
                        this.bitField0_ &= -5;
                    }
                    eventSpec.jstrk_ = this.jstrk_;
                    eventSpec.wjs_ = this.wjs_;
                    if ((this.bitField0_ & 8) != 0) {
                        this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                        this.bitField0_ &= -9;
                    }
                    eventSpec.pxtrk_ = this.pxtrk_;
                    eventSpec.wpx_ = this.wpx_;
                    xa xaVar = this.extBuilder_;
                    if (xaVar == null) {
                        eventSpec.ext_ = this.ext_;
                    } else {
                        eventSpec.ext_ = (Struct) xaVar.build();
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        eventSpec.extProto_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 16) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -17;
                        }
                        eventSpec.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return eventSpec;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public EventSpec getDefaultInstanceForType() {
                    return EventSpec.getDefaultInstance();
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
                    this.type_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.method_ = list;
                    int i10 = this.bitField0_;
                    this.api_ = list;
                    this.bitField0_ = i10 & (-4);
                    f8 f8Var = f8.f22138e;
                    this.jstrk_ = f8Var;
                    this.wjs_ = false;
                    this.pxtrk_ = f8Var;
                    this.bitField0_ = i10 & (-16);
                    this.wpx_ = false;
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar == null) {
                        this.extProto_ = list;
                        this.bitField0_ = i10 & (-32);
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
                    if (message instanceof EventSpec) {
                        return mergeFrom((EventSpec) message);
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

                public Builder mergeFrom(EventSpec eventSpec) {
                    if (eventSpec == EventSpec.getDefaultInstance()) {
                        return this;
                    }
                    if (eventSpec.type_ != 0) {
                        setTypeValue(eventSpec.getTypeValue());
                    }
                    if (!eventSpec.method_.isEmpty()) {
                        if (this.method_.isEmpty()) {
                            this.method_ = eventSpec.method_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMethodIsMutable();
                            this.method_.addAll(eventSpec.method_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.api_.isEmpty()) {
                        if (this.api_.isEmpty()) {
                            this.api_ = eventSpec.api_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureApiIsMutable();
                            this.api_.addAll(eventSpec.api_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.jstrk_.isEmpty()) {
                        if (this.jstrk_.isEmpty()) {
                            this.jstrk_ = eventSpec.jstrk_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureJstrkIsMutable();
                            this.jstrk_.addAll(eventSpec.jstrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWjs()) {
                        setWjs(eventSpec.getWjs());
                    }
                    if (!eventSpec.pxtrk_.isEmpty()) {
                        if (this.pxtrk_.isEmpty()) {
                            this.pxtrk_ = eventSpec.pxtrk_;
                            this.bitField0_ &= -9;
                        } else {
                            ensurePxtrkIsMutable();
                            this.pxtrk_.addAll(eventSpec.pxtrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWpx()) {
                        setWpx(eventSpec.getWpx());
                    }
                    if (eventSpec.hasExt()) {
                        mergeExt(eventSpec.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!eventSpec.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = eventSpec.extProto_;
                                this.bitField0_ &= -17;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(eventSpec.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!eventSpec.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(eventSpec.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = eventSpec.extProto_;
                            this.bitField0_ &= -17;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) eventSpec).unknownFields);
                    onChanged();
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.type_ = 0;
                    List list = Collections.EMPTY_LIST;
                    this.method_ = list;
                    this.api_ = list;
                    f8 f8Var = f8.f22138e;
                    this.jstrk_ = f8Var;
                    this.pxtrk_ = f8Var;
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
                public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.access$10100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$EventSpec r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$EventSpec r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$EventSpec$Builder");
                }
            }

            public static EventSpec getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.U;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EventSpec) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EventSpec)) {
                    return super.equals(obj);
                }
                EventSpec eventSpec = (EventSpec) obj;
                if (this.type_ == eventSpec.type_ && this.method_.equals(eventSpec.method_) && this.api_.equals(eventSpec.api_) && getJstrkList().equals(eventSpec.getJstrkList()) && getWjs() == eventSpec.getWjs() && getPxtrkList().equals(eventSpec.getPxtrkList()) && getWpx() == eventSpec.getWpx() && hasExt() == eventSpec.hasExt()) {
                    return (!hasExt() || getExt().equals(eventSpec.getExt())) && getExtProtoList().equals(eventSpec.getExtProtoList()) && this.unknownFields.equals(eventSpec.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<ApiFramework> getApiList() {
                return new u7(this.api_, api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Integer> getApiValueList() {
                return this.api_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public String getJstrk(int i10) {
                return (String) this.jstrk_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ByteString getJstrkBytes(int i10) {
                return this.jstrk_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getJstrkCount() {
                return this.jstrk_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public EventTrackingMethod getMethod(int i10) {
                return (EventTrackingMethod) method_converter_.convert(this.method_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getMethodCount() {
                return this.method_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<EventTrackingMethod> getMethodList() {
                return new u7(this.method_, method_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getMethodValue(int i10) {
                return this.method_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Integer> getMethodValueList() {
                return this.method_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public String getPxtrk(int i10) {
                return (String) this.pxtrk_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ByteString getPxtrkBytes(int i10) {
                return this.pxtrk_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getPxtrkCount() {
                return this.pxtrk_.size();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeEnumSize = this.type_ != EventType.EVENT_TYPE_INVALID.getNumber() ? h0.computeEnumSize(1, this.type_) : 0;
                int iComputeEnumSizeNoTag = 0;
                for (int i11 = 0; i11 < this.method_.size(); i11++) {
                    iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(this.method_.get(i11).intValue());
                }
                int iComputeUInt32SizeNoTag = iComputeEnumSize + iComputeEnumSizeNoTag;
                if (!getMethodList().isEmpty()) {
                    iComputeUInt32SizeNoTag = iComputeUInt32SizeNoTag + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
                }
                this.methodMemoizedSerializedSize = iComputeEnumSizeNoTag;
                int iComputeEnumSizeNoTag2 = 0;
                for (int i12 = 0; i12 < this.api_.size(); i12++) {
                    iComputeEnumSizeNoTag2 += h0.computeEnumSizeNoTag(this.api_.get(i12).intValue());
                }
                int iComputeUInt32SizeNoTag2 = iComputeUInt32SizeNoTag + iComputeEnumSizeNoTag2;
                if (!getApiList().isEmpty()) {
                    iComputeUInt32SizeNoTag2 = iComputeUInt32SizeNoTag2 + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag2);
                }
                this.apiMemoizedSerializedSize = iComputeEnumSizeNoTag2;
                int iE = 0;
                for (int i13 = 0; i13 < this.jstrk_.size(); i13++) {
                    iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.jstrk_, i13, iE);
                }
                int size = getJstrkList().size() + iComputeUInt32SizeNoTag2 + iE;
                boolean z10 = this.wjs_;
                if (z10) {
                    size += h0.computeBoolSize(5, z10);
                }
                int iE2 = 0;
                for (int i14 = 0; i14 < this.pxtrk_.size(); i14++) {
                    iE2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.pxtrk_, i14, iE2);
                }
                int size2 = getPxtrkList().size() + size + iE2;
                boolean z11 = this.wpx_;
                if (z11) {
                    size2 += h0.computeBoolSize(7, z11);
                }
                for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                    size2 += h0.computeMessageSize(8, this.extProto_.get(i15));
                }
                if (this.ext_ != null) {
                    size2 += h0.computeMessageSize(9, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + size2;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public EventType getType() {
                EventType eventTypeValueOf = EventType.valueOf(this.type_);
                return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean getWjs() {
                return this.wjs_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean getWpx() {
                return this.wpx_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.type_;
                if (getMethodCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 2, 53) + this.method_.hashCode();
                }
                if (getApiCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 3, 53) + this.api_.hashCode();
                }
                if (getJstrkCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 4, 53) + getJstrkList().hashCode();
                }
                int iHashBoolean = x7.hashBoolean(getWjs()) + o2.B(iHashCode, 37, 5, 53);
                if (getPxtrkCount() > 0) {
                    iHashBoolean = getPxtrkList().hashCode() + o2.B(iHashBoolean, 37, 6, 53);
                }
                int iHashBoolean2 = x7.hashBoolean(getWpx()) + o2.B(iHashBoolean, 37, 7, 53);
                if (hasExt()) {
                    iHashBoolean2 = getExt().hashCode() + o2.B(iHashBoolean2, 37, 9, 53);
                }
                if (getExtProtoCount() > 0) {
                    iHashBoolean2 = getExtProtoList().hashCode() + o2.B(iHashBoolean2, 37, 8, 53);
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashBoolean2 * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return b.V.ensureFieldAccessorsInitialized(EventSpec.class, Builder.class);
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
                return new EventSpec();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                getSerializedSize();
                if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                    h0Var.writeEnum(1, this.type_);
                }
                if (getMethodList().size() > 0) {
                    h0Var.writeUInt32NoTag(18);
                    h0Var.writeUInt32NoTag(this.methodMemoizedSerializedSize);
                }
                for (int i10 = 0; i10 < this.method_.size(); i10++) {
                    h0Var.writeEnumNoTag(this.method_.get(i10).intValue());
                }
                if (getApiList().size() > 0) {
                    h0Var.writeUInt32NoTag(26);
                    h0Var.writeUInt32NoTag(this.apiMemoizedSerializedSize);
                }
                for (int i11 = 0; i11 < this.api_.size(); i11++) {
                    h0Var.writeEnumNoTag(this.api_.get(i11).intValue());
                }
                int iF = 0;
                while (iF < this.jstrk_.size()) {
                    iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.jstrk_, iF, h0Var, 4, iF, 1);
                }
                boolean z10 = this.wjs_;
                if (z10) {
                    h0Var.writeBool(5, z10);
                }
                int iF2 = 0;
                while (iF2 < this.pxtrk_.size()) {
                    iF2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.pxtrk_, iF2, h0Var, 6, iF2, 1);
                }
                boolean z11 = this.wpx_;
                if (z11) {
                    h0Var.writeBool(7, z11);
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    h0Var.writeMessage(8, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    h0Var.writeMessage(9, getExt());
                }
                this.unknownFields.writeTo(h0Var);
            }

            public static Builder newBuilder(EventSpec eventSpec) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventSpec);
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteBuffer, m5Var);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ka getJstrkList() {
                return this.jstrk_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ka getPxtrkList() {
                return this.pxtrk_;
            }

            private EventSpec(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (EventSpec) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static EventSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public EventSpec getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static EventSpec parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private EventSpec() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = 0;
                List list = Collections.EMPTY_LIST;
                this.method_ = list;
                this.api_ = list;
                f8 f8Var = f8.f22138e;
                this.jstrk_ = f8Var;
                this.pxtrk_ = f8Var;
                this.extProto_ = list;
            }

            public static EventSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static EventSpec parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (EventSpec) PARSER.parseFrom(bArr, m5Var);
            }

            public static EventSpec parseFrom(InputStream inputStream) throws IOException {
                return (EventSpec) k7.parseWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (EventSpec) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static EventSpec parseFrom(y yVar) throws IOException {
                return (EventSpec) k7.parseWithIOException(PARSER, yVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private EventSpec(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int tag = yVar.readTag();
                            switch (tag) {
                                case 0:
                                    z10 = true;
                                case 8:
                                    this.type_ = yVar.readEnum();
                                case 16:
                                    int i11 = yVar.readEnum();
                                    if ((i10 & 1) == 0) {
                                        this.method_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.method_.add(Integer.valueOf(i11));
                                case 18:
                                    int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                    while (yVar.getBytesUntilLimit() > 0) {
                                        int i12 = yVar.readEnum();
                                        if ((i10 & 1) == 0) {
                                            this.method_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.method_.add(Integer.valueOf(i12));
                                    }
                                    yVar.popLimit(iPushLimit);
                                case 24:
                                    int i13 = yVar.readEnum();
                                    if ((i10 & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.api_.add(Integer.valueOf(i13));
                                case 26:
                                    int iPushLimit2 = yVar.pushLimit(yVar.readRawVarint32());
                                    while (yVar.getBytesUntilLimit() > 0) {
                                        int i14 = yVar.readEnum();
                                        if ((i10 & 2) == 0) {
                                            this.api_ = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.api_.add(Integer.valueOf(i14));
                                    }
                                    yVar.popLimit(iPushLimit2);
                                case 34:
                                    String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                    if ((i10 & 4) == 0) {
                                        this.jstrk_ = new f8();
                                        i10 |= 4;
                                    }
                                    this.jstrk_.add((g8) stringRequireUtf8);
                                case 40:
                                    this.wjs_ = yVar.readBool();
                                case 50:
                                    String stringRequireUtf82 = yVar.readStringRequireUtf8();
                                    if ((i10 & 8) == 0) {
                                        this.pxtrk_ = new f8();
                                        i10 |= 8;
                                    }
                                    this.pxtrk_.add((g8) stringRequireUtf82);
                                case 56:
                                    this.wpx_ = yVar.readBool();
                                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                    if ((i10 & 16) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                    Struct struct = this.ext_;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
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
                        if ((i10 & 1) != 0) {
                            this.method_ = Collections.unmodifiableList(this.method_);
                        }
                        if ((i10 & 2) != 0) {
                            this.api_ = Collections.unmodifiableList(this.api_);
                        }
                        if ((i10 & 4) != 0) {
                            this.jstrk_ = this.jstrk_.getUnmodifiableView();
                        }
                        if ((i10 & 8) != 0) {
                            this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                        }
                        if ((i10 & 16) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.method_ = Collections.unmodifiableList(this.method_);
                }
                if ((i10 & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                }
                if ((i10 & 4) != 0) {
                    this.jstrk_ = this.jstrk_.getUnmodifiableView();
                }
                if ((i10 & 8) != 0) {
                    this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                }
                if ((i10 & 16) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static EventSpec parseFrom(y yVar, m5 m5Var) throws IOException {
                return (EventSpec) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface EventSpecOrBuilder extends MessageOrBuilder {
            ApiFramework getApi(int i10);

            int getApiCount();

            List<ApiFramework> getApiList();

            int getApiValue(int i10);

            List<Integer> getApiValueList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

            List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

            String getJstrk(int i10);

            ByteString getJstrkBytes(int i10);

            int getJstrkCount();

            List<String> getJstrkList();

            EventTrackingMethod getMethod(int i10);

            int getMethodCount();

            List<EventTrackingMethod> getMethodList();

            int getMethodValue(int i10);

            List<Integer> getMethodValueList();

            String getPxtrk(int i10);

            ByteString getPxtrkBytes(int i10);

            int getPxtrkCount();

            List<String> getPxtrkList();

            EventType getType();

            int getTypeValue();

            boolean getWjs();

            boolean getWpx();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class NativeFormat extends k7 implements NativeFormatOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 1;
            public static final int EXT_FIELD_NUMBER = 3;
            public static final int EXT_PROTO_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<AssetFormat> asset_;
            private List<Any> extProto_;
            private Struct ext_;
            private byte memoizedIsInitialized;
            private static final NativeFormat DEFAULT_INSTANCE = new NativeFormat();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public NativeFormat parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new NativeFormat(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class AssetFormat extends k7 implements AssetFormatOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                public static final int EXT_FIELD_NUMBER = 8;
                public static final int EXT_PROTO_FIELD_NUMBER = 7;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMG_FIELD_NUMBER = 4;
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                private DataAssetFormat data_;
                private List<Any> extProto_;
                private Struct ext_;
                private int id_;
                private ImageAssetFormat img_;
                private byte memoizedIsInitialized;
                private boolean req_;
                private TitleAssetFormat title_;
                private VideoPlacement video_;
                private static final AssetFormat DEFAULT_INSTANCE = new AssetFormat();
                private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.1
                    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                    public AssetFormat parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        return new AssetFormat(yVar, m5Var);
                    }
                };

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class DataAssetFormat extends k7 implements DataAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private static final DataAssetFormat DEFAULT_INSTANCE = new DataAssetFormat();
                    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.1
                        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                        public DataAssetFormat parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                            return new DataAssetFormat(yVar, m5Var);
                        }
                    };

                    public static DataAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.S;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) k7.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteBuffer);
                    }

                    public static fa parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DataAssetFormat)) {
                            return super.equals(obj);
                        }
                        DataAssetFormat dataAssetFormat = (DataAssetFormat) obj;
                        if (this.type_ == dataAssetFormat.type_ && getLen() == dataAssetFormat.getLen() && hasExt() == dataAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(dataAssetFormat.getExt())) && getExtProtoList().equals(dataAssetFormat.getExtProtoList()) && this.unknownFields.equals(dataAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public jb getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getLen() {
                        return this.len_;
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
                        int iComputeEnumSize = this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber() ? h0.computeEnumSize(1, this.type_) : 0;
                        int i11 = this.len_;
                        if (i11 != 0) {
                            iComputeEnumSize += h0.computeUInt32Size(2, i11);
                        }
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            iComputeEnumSize += h0.computeMessageSize(3, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            iComputeEnumSize += h0.computeMessageSize(4, getExt());
                        }
                        int serializedSize = this.unknownFields.getSerializedSize() + iComputeEnumSize;
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public NativeDataAssetType getType() {
                        NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                        return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                    public final gc getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int len = getLen() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53);
                        if (hasExt()) {
                            len = getExt().hashCode() + o2.B(len, 37, 4, 53);
                        }
                        if (getExtProtoCount() > 0) {
                            len = getExtProtoList().hashCode() + o2.B(len, 37, 3, 53);
                        }
                        int iHashCode = this.unknownFields.hashCode() + (len * 29);
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.k7
                    public i7 internalGetFieldAccessorTable() {
                        return b.T.ensureFieldAccessorsInitialized(DataAssetFormat.class, Builder.class);
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
                        return new DataAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(h0 h0Var) throws IOException {
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            h0Var.writeEnum(1, this.type_);
                        }
                        int i10 = this.len_;
                        if (i10 != 0) {
                            h0Var.writeUInt32(2, i10);
                        }
                        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                            h0Var.writeMessage(3, this.extProto_.get(i11));
                        }
                        if (this.ext_ != null) {
                            h0Var.writeMessage(4, getExt());
                        }
                        this.unknownFields.writeTo(h0Var);
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    public static final class Builder extends o6 implements DataAssetFormatOrBuilder {
                        private int bitField0_;
                        private xa extBuilder_;
                        private pa extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;

                        private Builder() {
                            super(null);
                            this.type_ = 0;
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
                            return b.S;
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

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.S;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public jb getExtOrBuilder() {
                            xa xaVar = this.extBuilder_;
                            if (xaVar != null) {
                                return (jb) xaVar.getMessageOrBuilder();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.size() : paVar.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public NativeDataAssetType getType() {
                            NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                            return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.o6
                        public i7 internalGetFieldAccessorTable() {
                            return b.T.ensureFieldAccessorsInitialized(DataAssetFormat.class, Builder.class);
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

                        public Builder setLen(int i10) {
                            this.len_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeDataAssetType nativeDataAssetType) {
                            nativeDataAssetType.getClass();
                            this.type_ = nativeDataAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i10) {
                            this.type_ = i10;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAssetFormat build() {
                            DataAssetFormat dataAssetFormatBuildPartial = buildPartial();
                            if (dataAssetFormatBuildPartial.isInitialized()) {
                                return dataAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAssetFormat buildPartial() {
                            DataAssetFormat dataAssetFormat = new DataAssetFormat(this);
                            dataAssetFormat.type_ = this.type_;
                            dataAssetFormat.len_ = this.len_;
                            xa xaVar = this.extBuilder_;
                            if (xaVar == null) {
                                dataAssetFormat.ext_ = this.ext_;
                            } else {
                                dataAssetFormat.ext_ = (Struct) xaVar.build();
                            }
                            pa paVar = this.extProtoBuilder_;
                            if (paVar != null) {
                                dataAssetFormat.extProto_ = paVar.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                dataAssetFormat.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return dataAssetFormat;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                        public DataAssetFormat getDefaultInstanceForType() {
                            return DataAssetFormat.getDefaultInstance();
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
                            this.type_ = 0;
                            this.len_ = 0;
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

                        private Builder(p6 p6Var) {
                            super(p6Var);
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
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
                            if (message instanceof DataAssetFormat) {
                                return mergeFrom((DataAssetFormat) message);
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

                        public Builder mergeFrom(DataAssetFormat dataAssetFormat) {
                            if (dataAssetFormat == DataAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (dataAssetFormat.type_ != 0) {
                                setTypeValue(dataAssetFormat.getTypeValue());
                            }
                            if (dataAssetFormat.getLen() != 0) {
                                setLen(dataAssetFormat.getLen());
                            }
                            if (dataAssetFormat.hasExt()) {
                                mergeExt(dataAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAssetFormat.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(dataAssetFormat.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((k7) dataAssetFormat).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.access$5600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$DataAssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$DataAssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$DataAssetFormat$Builder");
                        }
                    }

                    public static Builder newBuilder(DataAssetFormat dataAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAssetFormat);
                    }

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteBuffer, m5Var);
                    }

                    private DataAssetFormat(o6 o6Var) {
                        super(o6Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (DataAssetFormat) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public DataAssetFormat getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(byteString, m5Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private DataAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.type_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(bArr);
                    }

                    @Override // com.explorestack.protobuf.k7
                    public Builder newBuilderForType(p6 p6Var) {
                        return new Builder(p6Var);
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                        return (DataAssetFormat) PARSER.parseFrom(bArr, m5Var);
                    }

                    public static DataAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) k7.parseWithIOException(PARSER, inputStream);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private DataAssetFormat(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                        if (tag == 8) {
                                            this.type_ = yVar.readEnum();
                                        } else if (tag == 16) {
                                            this.len_ = yVar.readUInt32();
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

                    public static DataAssetFormat parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (DataAssetFormat) k7.parseWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static DataAssetFormat parseFrom(y yVar) throws IOException {
                        return (DataAssetFormat) k7.parseWithIOException(PARSER, yVar);
                    }

                    public static DataAssetFormat parseFrom(y yVar, m5 m5Var) throws IOException {
                        return (DataAssetFormat) k7.parseWithIOException(PARSER, yVar, m5Var);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public interface DataAssetFormatOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ MessageLite getDefaultInstanceForType();

                    Struct getExt();

                    jb getExtOrBuilder();

                    Any getExtProto(int i10);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

                    List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

                    int getLen();

                    NativeDataAssetType getType();

                    int getTypeValue();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class ImageAssetFormat extends k7 implements ImageAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 10;
                    public static final int EXT_PROTO_FIELD_NUMBER = 9;
                    public static final int HMIN_FIELD_NUMBER = 6;
                    public static final int HRATIO_FIELD_NUMBER = 8;
                    public static final int H_FIELD_NUMBER = 4;
                    public static final int MIME_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 1;
                    public static final int WMIN_FIELD_NUMBER = 5;
                    public static final int WRATIO_FIELD_NUMBER = 7;
                    public static final int W_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int h_;
                    private int hmin_;
                    private int hratio_;
                    private byte memoizedIsInitialized;
                    private g8 mime_;
                    private int type_;
                    private int w_;
                    private int wmin_;
                    private int wratio_;
                    private static final ImageAssetFormat DEFAULT_INSTANCE = new ImageAssetFormat();
                    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.1
                        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                        public ImageAssetFormat parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                            return new ImageAssetFormat(yVar, m5Var);
                        }
                    };

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    public static final class Builder extends o6 implements ImageAssetFormatOrBuilder {
                        private int bitField0_;
                        private xa extBuilder_;
                        private pa extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int h_;
                        private int hmin_;
                        private int hratio_;
                        private g8 mime_;
                        private int type_;
                        private int w_;
                        private int wmin_;
                        private int wratio_;

                        private Builder() {
                            super(null);
                            this.type_ = 0;
                            this.mime_ = f8.f22138e;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 2) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 2;
                            }
                        }

                        private void ensureMimeIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.mime_ = new f8(this.mime_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.Q;
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

                        public Builder addAllMime(Iterable<String> iterable) {
                            ensureMimeIsMutable();
                            b.a.addAll((Iterable) iterable, (List) this.mime_);
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

                        public Builder addMime(String str) {
                            str.getClass();
                            ensureMimeIsMutable();
                            this.mime_.add((g8) str);
                            onChanged();
                            return this;
                        }

                        public Builder addMimeBytes(ByteString byteString) throws IllegalArgumentException {
                            byteString.getClass();
                            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                            ensureMimeIsMutable();
                            this.mime_.add(byteString);
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

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearHmin() {
                            this.hmin_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearHratio() {
                            this.hratio_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearMime() {
                            this.mime_ = f8.f22138e;
                            this.bitField0_ &= -2;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearWmin() {
                            this.wmin_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearWratio() {
                            this.wratio_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.Q;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public jb getExtOrBuilder() {
                            xa xaVar = this.extBuilder_;
                            if (xaVar != null) {
                                return (jb) xaVar.getMessageOrBuilder();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.size() : paVar.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getHmin() {
                            return this.hmin_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getHratio() {
                            return this.hratio_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public String getMime(int i10) {
                            return (String) this.mime_.get(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public ByteString getMimeBytes(int i10) {
                            return this.mime_.getByteString(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getMimeCount() {
                            return this.mime_.size();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public NativeImageAssetType getType() {
                            NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                            return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getWmin() {
                            return this.wmin_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getWratio() {
                            return this.wratio_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.o6
                        public i7 internalGetFieldAccessorTable() {
                            return b.R.ensureFieldAccessorsInitialized(ImageAssetFormat.class, Builder.class);
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

                        public Builder setH(int i10) {
                            this.h_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setHmin(int i10) {
                            this.hmin_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setHratio(int i10) {
                            this.hratio_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setMime(int i10, String str) {
                            str.getClass();
                            ensureMimeIsMutable();
                            this.mime_.set(i10, (int) str);
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeImageAssetType nativeImageAssetType) {
                            nativeImageAssetType.getClass();
                            this.type_ = nativeImageAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i10) {
                            this.type_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setW(int i10) {
                            this.w_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setWmin(int i10) {
                            this.wmin_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setWratio(int i10) {
                            this.wratio_ = i10;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public ka getMimeList() {
                            return this.mime_.getUnmodifiableView();
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAssetFormat build() {
                            ImageAssetFormat imageAssetFormatBuildPartial = buildPartial();
                            if (imageAssetFormatBuildPartial.isInitialized()) {
                                return imageAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) imageAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAssetFormat buildPartial() {
                            ImageAssetFormat imageAssetFormat = new ImageAssetFormat(this);
                            imageAssetFormat.type_ = this.type_;
                            if ((this.bitField0_ & 1) != 0) {
                                this.mime_ = this.mime_.getUnmodifiableView();
                                this.bitField0_ &= -2;
                            }
                            imageAssetFormat.mime_ = this.mime_;
                            imageAssetFormat.w_ = this.w_;
                            imageAssetFormat.h_ = this.h_;
                            imageAssetFormat.wmin_ = this.wmin_;
                            imageAssetFormat.hmin_ = this.hmin_;
                            imageAssetFormat.wratio_ = this.wratio_;
                            imageAssetFormat.hratio_ = this.hratio_;
                            xa xaVar = this.extBuilder_;
                            if (xaVar == null) {
                                imageAssetFormat.ext_ = this.ext_;
                            } else {
                                imageAssetFormat.ext_ = (Struct) xaVar.build();
                            }
                            pa paVar = this.extProtoBuilder_;
                            if (paVar != null) {
                                imageAssetFormat.extProto_ = paVar.build();
                            } else {
                                if ((this.bitField0_ & 2) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -3;
                                }
                                imageAssetFormat.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return imageAssetFormat;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                        public ImageAssetFormat getDefaultInstanceForType() {
                            return ImageAssetFormat.getDefaultInstance();
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
                            this.type_ = 0;
                            this.mime_ = f8.f22138e;
                            int i10 = this.bitField0_;
                            this.bitField0_ = i10 & (-2);
                            this.w_ = 0;
                            this.h_ = 0;
                            this.wmin_ = 0;
                            this.hmin_ = 0;
                            this.wratio_ = 0;
                            this.hratio_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            pa paVar = this.extProtoBuilder_;
                            if (paVar == null) {
                                this.extProto_ = Collections.EMPTY_LIST;
                                this.bitField0_ = i10 & (-4);
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
                            if (message instanceof ImageAssetFormat) {
                                return mergeFrom((ImageAssetFormat) message);
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
                            this.type_ = 0;
                            this.mime_ = f8.f22138e;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(ImageAssetFormat imageAssetFormat) {
                            if (imageAssetFormat == ImageAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (imageAssetFormat.type_ != 0) {
                                setTypeValue(imageAssetFormat.getTypeValue());
                            }
                            if (!imageAssetFormat.mime_.isEmpty()) {
                                if (this.mime_.isEmpty()) {
                                    this.mime_ = imageAssetFormat.mime_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureMimeIsMutable();
                                    this.mime_.addAll(imageAssetFormat.mime_);
                                }
                                onChanged();
                            }
                            if (imageAssetFormat.getW() != 0) {
                                setW(imageAssetFormat.getW());
                            }
                            if (imageAssetFormat.getH() != 0) {
                                setH(imageAssetFormat.getH());
                            }
                            if (imageAssetFormat.getWmin() != 0) {
                                setWmin(imageAssetFormat.getWmin());
                            }
                            if (imageAssetFormat.getHmin() != 0) {
                                setHmin(imageAssetFormat.getHmin());
                            }
                            if (imageAssetFormat.getWratio() != 0) {
                                setWratio(imageAssetFormat.getWratio());
                            }
                            if (imageAssetFormat.getHratio() != 0) {
                                setHratio(imageAssetFormat.getHratio());
                            }
                            if (imageAssetFormat.hasExt()) {
                                mergeExt(imageAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAssetFormat.extProto_;
                                        this.bitField0_ &= -3;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAssetFormat.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(imageAssetFormat.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAssetFormat.extProto_;
                                    this.bitField0_ &= -3;
                                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((k7) imageAssetFormat).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.access$4300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$ImageAssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$ImageAssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$ImageAssetFormat$Builder");
                        }
                    }

                    public static ImageAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.Q;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) k7.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteBuffer);
                    }

                    public static fa parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ImageAssetFormat)) {
                            return super.equals(obj);
                        }
                        ImageAssetFormat imageAssetFormat = (ImageAssetFormat) obj;
                        if (this.type_ == imageAssetFormat.type_ && getMimeList().equals(imageAssetFormat.getMimeList()) && getW() == imageAssetFormat.getW() && getH() == imageAssetFormat.getH() && getWmin() == imageAssetFormat.getWmin() && getHmin() == imageAssetFormat.getHmin() && getWratio() == imageAssetFormat.getWratio() && getHratio() == imageAssetFormat.getHratio() && hasExt() == imageAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(imageAssetFormat.getExt())) && getExtProtoList().equals(imageAssetFormat.getExtProtoList()) && this.unknownFields.equals(imageAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public jb getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getH() {
                        return this.h_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getHmin() {
                        return this.hmin_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getHratio() {
                        return this.hratio_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public String getMime(int i10) {
                        return (String) this.mime_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public ByteString getMimeBytes(int i10) {
                        return this.mime_.getByteString(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getMimeCount() {
                        return this.mime_.size();
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
                        int iComputeEnumSize = this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber() ? h0.computeEnumSize(1, this.type_) : 0;
                        int iE = 0;
                        for (int i11 = 0; i11 < this.mime_.size(); i11++) {
                            iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.mime_, i11, iE);
                        }
                        int size = getMimeList().size() + iComputeEnumSize + iE;
                        int i12 = this.w_;
                        if (i12 != 0) {
                            size += h0.computeUInt32Size(3, i12);
                        }
                        int i13 = this.h_;
                        if (i13 != 0) {
                            size += h0.computeUInt32Size(4, i13);
                        }
                        int i14 = this.wmin_;
                        if (i14 != 0) {
                            size += h0.computeUInt32Size(5, i14);
                        }
                        int i15 = this.hmin_;
                        if (i15 != 0) {
                            size += h0.computeUInt32Size(6, i15);
                        }
                        int i16 = this.wratio_;
                        if (i16 != 0) {
                            size += h0.computeUInt32Size(7, i16);
                        }
                        int i17 = this.hratio_;
                        if (i17 != 0) {
                            size += h0.computeUInt32Size(8, i17);
                        }
                        for (int i18 = 0; i18 < this.extProto_.size(); i18++) {
                            size += h0.computeMessageSize(9, this.extProto_.get(i18));
                        }
                        if (this.ext_ != null) {
                            size += h0.computeMessageSize(10, getExt());
                        }
                        int serializedSize = this.unknownFields.getSerializedSize() + size;
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public NativeImageAssetType getType() {
                        NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                        return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                    public final gc getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getWmin() {
                        return this.wmin_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getWratio() {
                        return this.wratio_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.type_;
                        if (getMimeCount() > 0) {
                            iHashCode = o2.B(iHashCode, 37, 2, 53) + getMimeList().hashCode();
                        }
                        int hratio = getHratio() + ((((getWratio() + ((((getHmin() + ((((getWmin() + ((((getH() + ((((getW() + o2.B(iHashCode, 37, 3, 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53);
                        if (hasExt()) {
                            hratio = o2.B(hratio, 37, 10, 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hratio = o2.B(hratio, 37, 9, 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode2 = this.unknownFields.hashCode() + (hratio * 29);
                        this.memoizedHashCode = iHashCode2;
                        return iHashCode2;
                    }

                    @Override // com.explorestack.protobuf.k7
                    public i7 internalGetFieldAccessorTable() {
                        return b.R.ensureFieldAccessorsInitialized(ImageAssetFormat.class, Builder.class);
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
                        return new ImageAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(h0 h0Var) throws IOException {
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            h0Var.writeEnum(1, this.type_);
                        }
                        int iF = 0;
                        while (iF < this.mime_.size()) {
                            iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.mime_, iF, h0Var, 2, iF, 1);
                        }
                        int i10 = this.w_;
                        if (i10 != 0) {
                            h0Var.writeUInt32(3, i10);
                        }
                        int i11 = this.h_;
                        if (i11 != 0) {
                            h0Var.writeUInt32(4, i11);
                        }
                        int i12 = this.wmin_;
                        if (i12 != 0) {
                            h0Var.writeUInt32(5, i12);
                        }
                        int i13 = this.hmin_;
                        if (i13 != 0) {
                            h0Var.writeUInt32(6, i13);
                        }
                        int i14 = this.wratio_;
                        if (i14 != 0) {
                            h0Var.writeUInt32(7, i14);
                        }
                        int i15 = this.hratio_;
                        if (i15 != 0) {
                            h0Var.writeUInt32(8, i15);
                        }
                        for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
                            h0Var.writeMessage(9, this.extProto_.get(i16));
                        }
                        if (this.ext_ != null) {
                            h0Var.writeMessage(10, getExt());
                        }
                        this.unknownFields.writeTo(h0Var);
                    }

                    public static Builder newBuilder(ImageAssetFormat imageAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAssetFormat);
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteBuffer, m5Var);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public ka getMimeList() {
                        return this.mime_;
                    }

                    private ImageAssetFormat(o6 o6Var) {
                        super(o6Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (ImageAssetFormat) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public ImageAssetFormat getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(byteString, m5Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private ImageAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.type_ = 0;
                        this.mime_ = f8.f22138e;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(bArr);
                    }

                    @Override // com.explorestack.protobuf.k7
                    public Builder newBuilderForType(p6 p6Var) {
                        return new Builder(p6Var);
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                        return (ImageAssetFormat) PARSER.parseFrom(bArr, m5Var);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) k7.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (ImageAssetFormat) k7.parseWithIOException(PARSER, inputStream, m5Var);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private ImageAssetFormat(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        this();
                        m5Var.getClass();
                        cc ccVarNewBuilder = gc.newBuilder();
                        boolean z10 = false;
                        int i10 = 0;
                        while (!z10) {
                            try {
                                try {
                                    int tag = yVar.readTag();
                                    switch (tag) {
                                        case 0:
                                            z10 = true;
                                        case 8:
                                            this.type_ = yVar.readEnum();
                                        case 18:
                                            String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                            if ((i10 & 1) == 0) {
                                                this.mime_ = new f8();
                                                i10 |= 1;
                                            }
                                            this.mime_.add((g8) stringRequireUtf8);
                                        case 24:
                                            this.w_ = yVar.readUInt32();
                                        case 32:
                                            this.h_ = yVar.readUInt32();
                                        case 40:
                                            this.wmin_ = yVar.readUInt32();
                                        case 48:
                                            this.hmin_ = yVar.readUInt32();
                                        case 56:
                                            this.wratio_ = yVar.readUInt32();
                                        case 64:
                                            this.hratio_ = yVar.readUInt32();
                                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                            if ((i10 & 2) == 0) {
                                                this.extProto_ = new ArrayList();
                                                i10 |= 2;
                                            }
                                            this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                        case 82:
                                            Struct struct = this.ext_;
                                            Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                            Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                            this.ext_ = struct2;
                                            if (builder != null) {
                                                builder.mergeFrom(struct2);
                                                this.ext_ = builder.buildPartial();
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
                                if ((i10 & 1) != 0) {
                                    this.mime_ = this.mime_.getUnmodifiableView();
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
                            this.mime_ = this.mime_.getUnmodifiableView();
                        }
                        if ((i10 & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                    }

                    public static ImageAssetFormat parseFrom(y yVar) throws IOException {
                        return (ImageAssetFormat) k7.parseWithIOException(PARSER, yVar);
                    }

                    public static ImageAssetFormat parseFrom(y yVar, m5 m5Var) throws IOException {
                        return (ImageAssetFormat) k7.parseWithIOException(PARSER, yVar, m5Var);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public interface ImageAssetFormatOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ MessageLite getDefaultInstanceForType();

                    Struct getExt();

                    jb getExtOrBuilder();

                    Any getExtProto(int i10);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

                    List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

                    int getH();

                    int getHmin();

                    int getHratio();

                    String getMime(int i10);

                    ByteString getMimeBytes(int i10);

                    int getMimeCount();

                    List<String> getMimeList();

                    NativeImageAssetType getType();

                    int getTypeValue();

                    int getW();

                    int getWmin();

                    int getWratio();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class TitleAssetFormat extends k7 implements TitleAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 3;
                    public static final int EXT_PROTO_FIELD_NUMBER = 2;
                    public static final int LEN_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private static final TitleAssetFormat DEFAULT_INSTANCE = new TitleAssetFormat();
                    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.1
                        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                        public TitleAssetFormat parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                            return new TitleAssetFormat(yVar, m5Var);
                        }
                    };

                    public static TitleAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.O;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) k7.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteBuffer);
                    }

                    public static fa parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof TitleAssetFormat)) {
                            return super.equals(obj);
                        }
                        TitleAssetFormat titleAssetFormat = (TitleAssetFormat) obj;
                        if (getLen() == titleAssetFormat.getLen() && hasExt() == titleAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(titleAssetFormat.getExt())) && getExtProtoList().equals(titleAssetFormat.getExtProtoList()) && this.unknownFields.equals(titleAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public jb getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public int getLen() {
                        return this.len_;
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
                        int i11 = this.len_;
                        int iComputeUInt32Size = i11 != 0 ? h0.computeUInt32Size(1, i11) : 0;
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            iComputeUInt32Size += h0.computeMessageSize(2, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            iComputeUInt32Size += h0.computeMessageSize(3, getExt());
                        }
                        int serializedSize = this.unknownFields.getSerializedSize() + iComputeUInt32Size;
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                    public final gc getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int len = getLen() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
                        if (hasExt()) {
                            len = getExt().hashCode() + o2.B(len, 37, 3, 53);
                        }
                        if (getExtProtoCount() > 0) {
                            len = getExtProtoList().hashCode() + o2.B(len, 37, 2, 53);
                        }
                        int iHashCode = this.unknownFields.hashCode() + (len * 29);
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.k7
                    public i7 internalGetFieldAccessorTable() {
                        return b.P.ensureFieldAccessorsInitialized(TitleAssetFormat.class, Builder.class);
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
                        return new TitleAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(h0 h0Var) throws IOException {
                        int i10 = this.len_;
                        if (i10 != 0) {
                            h0Var.writeUInt32(1, i10);
                        }
                        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                            h0Var.writeMessage(2, this.extProto_.get(i11));
                        }
                        if (this.ext_ != null) {
                            h0Var.writeMessage(3, getExt());
                        }
                        this.unknownFields.writeTo(h0Var);
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    public static final class Builder extends o6 implements TitleAssetFormatOrBuilder {
                        private int bitField0_;
                        private xa extBuilder_;
                        private pa extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;

                        private Builder() {
                            super(null);
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
                            return b.O;
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

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.O;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public jb getExtOrBuilder() {
                            xa xaVar = this.extBuilder_;
                            if (xaVar != null) {
                                return (jb) xaVar.getMessageOrBuilder();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.size() : paVar.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.o6
                        public i7 internalGetFieldAccessorTable() {
                            return b.P.ensureFieldAccessorsInitialized(TitleAssetFormat.class, Builder.class);
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

                        public Builder setLen(int i10) {
                            this.len_ = i10;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAssetFormat build() {
                            TitleAssetFormat titleAssetFormatBuildPartial = buildPartial();
                            if (titleAssetFormatBuildPartial.isInitialized()) {
                                return titleAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) titleAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAssetFormat buildPartial() {
                            TitleAssetFormat titleAssetFormat = new TitleAssetFormat(this);
                            titleAssetFormat.len_ = this.len_;
                            xa xaVar = this.extBuilder_;
                            if (xaVar == null) {
                                titleAssetFormat.ext_ = this.ext_;
                            } else {
                                titleAssetFormat.ext_ = (Struct) xaVar.build();
                            }
                            pa paVar = this.extProtoBuilder_;
                            if (paVar != null) {
                                titleAssetFormat.extProto_ = paVar.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                titleAssetFormat.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return titleAssetFormat;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                        public TitleAssetFormat getDefaultInstanceForType() {
                            return TitleAssetFormat.getDefaultInstance();
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
                            this.len_ = 0;
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

                        private Builder(p6 p6Var) {
                            super(p6Var);
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
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
                            if (message instanceof TitleAssetFormat) {
                                return mergeFrom((TitleAssetFormat) message);
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

                        public Builder mergeFrom(TitleAssetFormat titleAssetFormat) {
                            if (titleAssetFormat == TitleAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (titleAssetFormat.getLen() != 0) {
                                setLen(titleAssetFormat.getLen());
                            }
                            if (titleAssetFormat.hasExt()) {
                                mergeExt(titleAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAssetFormat.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(titleAssetFormat.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((k7) titleAssetFormat).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.access$2500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$TitleAssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$TitleAssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$TitleAssetFormat$Builder");
                        }
                    }

                    public static Builder newBuilder(TitleAssetFormat titleAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAssetFormat);
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteBuffer, m5Var);
                    }

                    private TitleAssetFormat(o6 o6Var) {
                        super(o6Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (TitleAssetFormat) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public TitleAssetFormat getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(byteString, m5Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private TitleAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(bArr);
                    }

                    @Override // com.explorestack.protobuf.k7
                    public Builder newBuilderForType(p6 p6Var) {
                        return new Builder(p6Var);
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                        return (TitleAssetFormat) PARSER.parseFrom(bArr, m5Var);
                    }

                    public static TitleAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) k7.parseWithIOException(PARSER, inputStream);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private TitleAssetFormat(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                            if (tag == 8) {
                                                this.len_ = yVar.readUInt32();
                                            } else if (tag == 18) {
                                                if (!z11) {
                                                    this.extProto_ = new ArrayList();
                                                    z11 = true;
                                                }
                                                this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                            } else if (tag != 26) {
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

                    public static TitleAssetFormat parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (TitleAssetFormat) k7.parseWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static TitleAssetFormat parseFrom(y yVar) throws IOException {
                        return (TitleAssetFormat) k7.parseWithIOException(PARSER, yVar);
                    }

                    public static TitleAssetFormat parseFrom(y yVar, m5 m5Var) throws IOException {
                        return (TitleAssetFormat) k7.parseWithIOException(PARSER, yVar, m5Var);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public interface TitleAssetFormatOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ MessageLite getDefaultInstanceForType();

                    Struct getExt();

                    jb getExtOrBuilder();

                    Any getExtProto(int i10);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

                    List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

                    int getLen();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static AssetFormat getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.M;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) k7.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static AssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteBuffer);
                }

                public static fa parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof AssetFormat)) {
                        return super.equals(obj);
                    }
                    AssetFormat assetFormat = (AssetFormat) obj;
                    if (getId() != assetFormat.getId() || getReq() != assetFormat.getReq() || hasTitle() != assetFormat.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(assetFormat.getTitle())) || hasImg() != assetFormat.hasImg()) {
                        return false;
                    }
                    if ((hasImg() && !getImg().equals(assetFormat.getImg())) || hasVideo() != assetFormat.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(assetFormat.getVideo())) || hasData() != assetFormat.hasData()) {
                        return false;
                    }
                    if ((!hasData() || getData().equals(assetFormat.getData())) && hasExt() == assetFormat.hasExt()) {
                        return (!hasExt() || getExt().equals(assetFormat.getExt())) && getExtProtoList().equals(assetFormat.getExtProtoList()) && this.unknownFields.equals(assetFormat.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public DataAssetFormat getData() {
                    DataAssetFormat dataAssetFormat = this.data_;
                    return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public DataAssetFormatOrBuilder getDataOrBuilder() {
                    return getData();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public jb getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public int getId() {
                    return this.id_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public ImageAssetFormat getImg() {
                    ImageAssetFormat imageAssetFormat = this.img_;
                    return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public ImageAssetFormatOrBuilder getImgOrBuilder() {
                    return getImg();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public fa getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean getReq() {
                    return this.req_;
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int i11 = this.id_;
                    int iComputeUInt32Size = i11 != 0 ? h0.computeUInt32Size(1, i11) : 0;
                    boolean z10 = this.req_;
                    if (z10) {
                        iComputeUInt32Size += h0.computeBoolSize(2, z10);
                    }
                    if (this.title_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(3, getTitle());
                    }
                    if (this.img_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(4, getImg());
                    }
                    if (this.video_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(5, getVideo());
                    }
                    if (this.data_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(6, getData());
                    }
                    for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                        iComputeUInt32Size += h0.computeMessageSize(7, this.extProto_.get(i12));
                    }
                    if (this.ext_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(8, getExt());
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + iComputeUInt32Size;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public TitleAssetFormat getTitle() {
                    TitleAssetFormat titleAssetFormat = this.title_;
                    return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                public final gc getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public VideoPlacement getVideo() {
                    VideoPlacement videoPlacement = this.video_;
                    return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public VideoPlacementOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasData() {
                    return this.data_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasImg() {
                    return this.img_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasTitle() {
                    return this.title_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasVideo() {
                    return this.video_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashBoolean = x7.hashBoolean(getReq()) + ((((getId() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                    if (hasTitle()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 3, 53) + getTitle().hashCode();
                    }
                    if (hasImg()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 4, 53) + getImg().hashCode();
                    }
                    if (hasVideo()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 5, 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 6, 53) + getData().hashCode();
                    }
                    if (hasExt()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 8, 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 7, 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode = this.unknownFields.hashCode() + (iHashBoolean * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.k7
                public i7 internalGetFieldAccessorTable() {
                    return b.N.ensureFieldAccessorsInitialized(AssetFormat.class, Builder.class);
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
                    return new AssetFormat();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(h0 h0Var) throws IOException {
                    int i10 = this.id_;
                    if (i10 != 0) {
                        h0Var.writeUInt32(1, i10);
                    }
                    boolean z10 = this.req_;
                    if (z10) {
                        h0Var.writeBool(2, z10);
                    }
                    if (this.title_ != null) {
                        h0Var.writeMessage(3, getTitle());
                    }
                    if (this.img_ != null) {
                        h0Var.writeMessage(4, getImg());
                    }
                    if (this.video_ != null) {
                        h0Var.writeMessage(5, getVideo());
                    }
                    if (this.data_ != null) {
                        h0Var.writeMessage(6, getData());
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
                public static final class Builder extends o6 implements AssetFormatOrBuilder {
                    private int bitField0_;
                    private xa dataBuilder_;
                    private DataAssetFormat data_;
                    private xa extBuilder_;
                    private pa extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private xa imgBuilder_;
                    private ImageAssetFormat img_;
                    private boolean req_;
                    private xa titleBuilder_;
                    private TitleAssetFormat title_;
                    private xa videoBuilder_;
                    private VideoPlacement video_;

                    private Builder() {
                        super(null);
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    private xa getDataFieldBuilder() {
                        if (this.dataBuilder_ == null) {
                            this.dataBuilder_ = new xa(getData(), getParentForChildren(), isClean());
                            this.data_ = null;
                        }
                        return this.dataBuilder_;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.M;
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

                    private xa getImgFieldBuilder() {
                        if (this.imgBuilder_ == null) {
                            this.imgBuilder_ = new xa(getImg(), getParentForChildren(), isClean());
                            this.img_ = null;
                        }
                        return this.imgBuilder_;
                    }

                    private xa getTitleFieldBuilder() {
                        if (this.titleBuilder_ == null) {
                            this.titleBuilder_ = new xa(getTitle(), getParentForChildren(), isClean());
                            this.title_ = null;
                        }
                        return this.titleBuilder_;
                    }

                    private xa getVideoFieldBuilder() {
                        if (this.videoBuilder_ == null) {
                            this.videoBuilder_ = new xa(getVideo(), getParentForChildren(), isClean());
                            this.video_ = null;
                        }
                        return this.videoBuilder_;
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

                    public Builder clearData() {
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                            onChanged();
                            return this;
                        }
                        this.data_ = null;
                        this.dataBuilder_ = null;
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

                    public Builder clearId() {
                        this.id_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearImg() {
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                            onChanged();
                            return this;
                        }
                        this.img_ = null;
                        this.imgBuilder_ = null;
                        return this;
                    }

                    public Builder clearReq() {
                        this.req_ = false;
                        onChanged();
                        return this;
                    }

                    public Builder clearTitle() {
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                            onChanged();
                            return this;
                        }
                        this.title_ = null;
                        this.titleBuilder_ = null;
                        return this;
                    }

                    public Builder clearVideo() {
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                            onChanged();
                            return this;
                        }
                        this.video_ = null;
                        this.videoBuilder_ = null;
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public DataAssetFormat getData() {
                        xa xaVar = this.dataBuilder_;
                        if (xaVar != null) {
                            return (DataAssetFormat) xaVar.getMessage();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    public DataAssetFormat.Builder getDataBuilder() {
                        onChanged();
                        return (DataAssetFormat.Builder) getDataFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public DataAssetFormatOrBuilder getDataOrBuilder() {
                        xa xaVar = this.dataBuilder_;
                        if (xaVar != null) {
                            return (DataAssetFormatOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.M;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public jb getExtOrBuilder() {
                        xa xaVar = this.extBuilder_;
                        if (xaVar != null) {
                            return (jb) xaVar.getMessageOrBuilder();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public int getExtProtoCount() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.size() : paVar.getCount();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public ImageAssetFormat getImg() {
                        xa xaVar = this.imgBuilder_;
                        if (xaVar != null) {
                            return (ImageAssetFormat) xaVar.getMessage();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    public ImageAssetFormat.Builder getImgBuilder() {
                        onChanged();
                        return (ImageAssetFormat.Builder) getImgFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public ImageAssetFormatOrBuilder getImgOrBuilder() {
                        xa xaVar = this.imgBuilder_;
                        if (xaVar != null) {
                            return (ImageAssetFormatOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean getReq() {
                        return this.req_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public TitleAssetFormat getTitle() {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar != null) {
                            return (TitleAssetFormat) xaVar.getMessage();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    public TitleAssetFormat.Builder getTitleBuilder() {
                        onChanged();
                        return (TitleAssetFormat.Builder) getTitleFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar != null) {
                            return (TitleAssetFormatOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public VideoPlacement getVideo() {
                        xa xaVar = this.videoBuilder_;
                        if (xaVar != null) {
                            return (VideoPlacement) xaVar.getMessage();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    public VideoPlacement.Builder getVideoBuilder() {
                        onChanged();
                        return (VideoPlacement.Builder) getVideoFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public VideoPlacementOrBuilder getVideoOrBuilder() {
                        xa xaVar = this.videoBuilder_;
                        if (xaVar != null) {
                            return (VideoPlacementOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasData() {
                        return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasImg() {
                        return (this.imgBuilder_ == null && this.img_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasTitle() {
                        return (this.titleBuilder_ == null && this.title_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasVideo() {
                        return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.o6
                    public i7 internalGetFieldAccessorTable() {
                        return b.N.ensureFieldAccessorsInitialized(AssetFormat.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeData(DataAssetFormat dataAssetFormat) {
                        xa xaVar = this.dataBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(dataAssetFormat);
                            return this;
                        }
                        DataAssetFormat dataAssetFormat2 = this.data_;
                        if (dataAssetFormat2 != null) {
                            this.data_ = DataAssetFormat.newBuilder(dataAssetFormat2).mergeFrom(dataAssetFormat).buildPartial();
                        } else {
                            this.data_ = dataAssetFormat;
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

                    public Builder mergeImg(ImageAssetFormat imageAssetFormat) {
                        xa xaVar = this.imgBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(imageAssetFormat);
                            return this;
                        }
                        ImageAssetFormat imageAssetFormat2 = this.img_;
                        if (imageAssetFormat2 != null) {
                            this.img_ = ImageAssetFormat.newBuilder(imageAssetFormat2).mergeFrom(imageAssetFormat).buildPartial();
                        } else {
                            this.img_ = imageAssetFormat;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeTitle(TitleAssetFormat titleAssetFormat) {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(titleAssetFormat);
                            return this;
                        }
                        TitleAssetFormat titleAssetFormat2 = this.title_;
                        if (titleAssetFormat2 != null) {
                            this.title_ = TitleAssetFormat.newBuilder(titleAssetFormat2).mergeFrom(titleAssetFormat).buildPartial();
                        } else {
                            this.title_ = titleAssetFormat;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeVideo(VideoPlacement videoPlacement) {
                        xa xaVar = this.videoBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(videoPlacement);
                            return this;
                        }
                        VideoPlacement videoPlacement2 = this.video_;
                        if (videoPlacement2 != null) {
                            this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
                        } else {
                            this.video_ = videoPlacement;
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

                    public Builder setData(DataAssetFormat dataAssetFormat) {
                        xa xaVar = this.dataBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(dataAssetFormat);
                            return this;
                        }
                        dataAssetFormat.getClass();
                        this.data_ = dataAssetFormat;
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

                    public Builder setId(int i10) {
                        this.id_ = i10;
                        onChanged();
                        return this;
                    }

                    public Builder setImg(ImageAssetFormat imageAssetFormat) {
                        xa xaVar = this.imgBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(imageAssetFormat);
                            return this;
                        }
                        imageAssetFormat.getClass();
                        this.img_ = imageAssetFormat;
                        onChanged();
                        return this;
                    }

                    public Builder setReq(boolean z10) {
                        this.req_ = z10;
                        onChanged();
                        return this;
                    }

                    public Builder setTitle(TitleAssetFormat titleAssetFormat) {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(titleAssetFormat);
                            return this;
                        }
                        titleAssetFormat.getClass();
                        this.title_ = titleAssetFormat;
                        onChanged();
                        return this;
                    }

                    public Builder setVideo(VideoPlacement videoPlacement) {
                        xa xaVar = this.videoBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(videoPlacement);
                            return this;
                        }
                        videoPlacement.getClass();
                        this.video_ = videoPlacement;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public AssetFormat build() {
                        AssetFormat assetFormatBuildPartial = buildPartial();
                        if (assetFormatBuildPartial.isInitialized()) {
                            return assetFormatBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetFormatBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public AssetFormat buildPartial() {
                        AssetFormat assetFormat = new AssetFormat(this);
                        assetFormat.id_ = this.id_;
                        assetFormat.req_ = this.req_;
                        xa xaVar = this.titleBuilder_;
                        if (xaVar == null) {
                            assetFormat.title_ = this.title_;
                        } else {
                            assetFormat.title_ = (TitleAssetFormat) xaVar.build();
                        }
                        xa xaVar2 = this.imgBuilder_;
                        if (xaVar2 == null) {
                            assetFormat.img_ = this.img_;
                        } else {
                            assetFormat.img_ = (ImageAssetFormat) xaVar2.build();
                        }
                        xa xaVar3 = this.videoBuilder_;
                        if (xaVar3 == null) {
                            assetFormat.video_ = this.video_;
                        } else {
                            assetFormat.video_ = (VideoPlacement) xaVar3.build();
                        }
                        xa xaVar4 = this.dataBuilder_;
                        if (xaVar4 == null) {
                            assetFormat.data_ = this.data_;
                        } else {
                            assetFormat.data_ = (DataAssetFormat) xaVar4.build();
                        }
                        xa xaVar5 = this.extBuilder_;
                        if (xaVar5 == null) {
                            assetFormat.ext_ = this.ext_;
                        } else {
                            assetFormat.ext_ = (Struct) xaVar5.build();
                        }
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            assetFormat.extProto_ = paVar.build();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            assetFormat.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return assetFormat;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public AssetFormat getDefaultInstanceForType() {
                        return AssetFormat.getDefaultInstance();
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
                        this.id_ = 0;
                        this.req_ = false;
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                        } else {
                            this.img_ = null;
                            this.imgBuilder_ = null;
                        }
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
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

                    private Builder(p6 p6Var) {
                        super(p6Var);
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    public Builder setData(DataAssetFormat.Builder builder) {
                        xa xaVar = this.dataBuilder_;
                        if (xaVar == null) {
                            this.data_ = builder.build();
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

                    public Builder setImg(ImageAssetFormat.Builder builder) {
                        xa xaVar = this.imgBuilder_;
                        if (xaVar == null) {
                            this.img_ = builder.build();
                            onChanged();
                            return this;
                        }
                        xaVar.setMessage(builder.build());
                        return this;
                    }

                    public Builder setTitle(TitleAssetFormat.Builder builder) {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar == null) {
                            this.title_ = builder.build();
                            onChanged();
                            return this;
                        }
                        xaVar.setMessage(builder.build());
                        return this;
                    }

                    public Builder setVideo(VideoPlacement.Builder builder) {
                        xa xaVar = this.videoBuilder_;
                        if (xaVar == null) {
                            this.video_ = builder.build();
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
                        if (message instanceof AssetFormat) {
                            return mergeFrom((AssetFormat) message);
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

                    public Builder mergeFrom(AssetFormat assetFormat) {
                        if (assetFormat == AssetFormat.getDefaultInstance()) {
                            return this;
                        }
                        if (assetFormat.getId() != 0) {
                            setId(assetFormat.getId());
                        }
                        if (assetFormat.getReq()) {
                            setReq(assetFormat.getReq());
                        }
                        if (assetFormat.hasTitle()) {
                            mergeTitle(assetFormat.getTitle());
                        }
                        if (assetFormat.hasImg()) {
                            mergeImg(assetFormat.getImg());
                        }
                        if (assetFormat.hasVideo()) {
                            mergeVideo(assetFormat.getVideo());
                        }
                        if (assetFormat.hasData()) {
                            mergeData(assetFormat.getData());
                        }
                        if (assetFormat.hasExt()) {
                            mergeExt(assetFormat.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!assetFormat.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = assetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(assetFormat.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!assetFormat.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.addAllMessages(assetFormat.extProto_);
                            } else {
                                this.extProtoBuilder_.dispose();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = assetFormat.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((k7) assetFormat).unknownFields);
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
                    public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.access$7200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$Builder");
                    }
                }

                public static Builder newBuilder(AssetFormat assetFormat) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetFormat);
                }

                public static AssetFormat parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteBuffer, m5Var);
                }

                private AssetFormat(o6 o6Var) {
                    super(o6Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (AssetFormat) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                }

                public static AssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public AssetFormat getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static AssetFormat parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(byteString, m5Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private AssetFormat() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static AssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(bArr);
                }

                @Override // com.explorestack.protobuf.k7
                public Builder newBuilderForType(p6 p6Var) {
                    return new Builder(p6Var);
                }

                public static AssetFormat parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                    return (AssetFormat) PARSER.parseFrom(bArr, m5Var);
                }

                public static AssetFormat parseFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) k7.parseWithIOException(PARSER, inputStream);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private AssetFormat(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    this();
                    m5Var.getClass();
                    cc ccVarNewBuilder = gc.newBuilder();
                    boolean z10 = false;
                    Object[] objArr = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = yVar.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.id_ = yVar.readUInt32();
                                    } else if (tag != 16) {
                                        if (tag == 26) {
                                            TitleAssetFormat titleAssetFormat = this.title_;
                                            TitleAssetFormat.Builder builder = titleAssetFormat != null ? titleAssetFormat.toBuilder() : null;
                                            TitleAssetFormat titleAssetFormat2 = (TitleAssetFormat) yVar.readMessage(TitleAssetFormat.parser(), m5Var);
                                            this.title_ = titleAssetFormat2;
                                            if (builder != null) {
                                                builder.mergeFrom(titleAssetFormat2);
                                                this.title_ = builder.buildPartial();
                                            }
                                        } else if (tag == 34) {
                                            ImageAssetFormat imageAssetFormat = this.img_;
                                            ImageAssetFormat.Builder builder2 = imageAssetFormat != null ? imageAssetFormat.toBuilder() : null;
                                            ImageAssetFormat imageAssetFormat2 = (ImageAssetFormat) yVar.readMessage(ImageAssetFormat.parser(), m5Var);
                                            this.img_ = imageAssetFormat2;
                                            if (builder2 != null) {
                                                builder2.mergeFrom(imageAssetFormat2);
                                                this.img_ = builder2.buildPartial();
                                            }
                                        } else if (tag == 42) {
                                            VideoPlacement videoPlacement = this.video_;
                                            VideoPlacement.Builder builder3 = videoPlacement != null ? videoPlacement.toBuilder() : null;
                                            VideoPlacement videoPlacement2 = (VideoPlacement) yVar.readMessage(VideoPlacement.parser(), m5Var);
                                            this.video_ = videoPlacement2;
                                            if (builder3 != null) {
                                                builder3.mergeFrom(videoPlacement2);
                                                this.video_ = builder3.buildPartial();
                                            }
                                        } else if (tag == 50) {
                                            DataAssetFormat dataAssetFormat = this.data_;
                                            DataAssetFormat.Builder builder4 = dataAssetFormat != null ? dataAssetFormat.toBuilder() : null;
                                            DataAssetFormat dataAssetFormat2 = (DataAssetFormat) yVar.readMessage(DataAssetFormat.parser(), m5Var);
                                            this.data_ = dataAssetFormat2;
                                            if (builder4 != null) {
                                                builder4.mergeFrom(dataAssetFormat2);
                                                this.data_ = builder4.buildPartial();
                                            }
                                        } else if (tag == 58) {
                                            if (objArr == false) {
                                                this.extProto_ = new ArrayList();
                                                objArr = true;
                                            }
                                            this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                        } else if (tag != 66) {
                                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                            }
                                        } else {
                                            Struct struct = this.ext_;
                                            Struct.Builder builder5 = struct != null ? struct.toBuilder() : null;
                                            Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                            this.ext_ = struct2;
                                            if (builder5 != null) {
                                                builder5.mergeFrom(struct2);
                                                this.ext_ = builder5.buildPartial();
                                            }
                                        }
                                    } else {
                                        this.req_ = yVar.readBool();
                                    }
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.setUnfinishedMessage(this);
                            } catch (IOException e11) {
                                throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                            }
                        } catch (Throwable th2) {
                            if (objArr != false) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = ccVarNewBuilder.build();
                            makeExtensionsImmutable();
                            throw th2;
                        }
                    }
                    if (objArr != false) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                }

                public static AssetFormat parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (AssetFormat) k7.parseWithIOException(PARSER, inputStream, m5Var);
                }

                public static AssetFormat parseFrom(y yVar) throws IOException {
                    return (AssetFormat) k7.parseWithIOException(PARSER, yVar);
                }

                public static AssetFormat parseFrom(y yVar, m5 m5Var) throws IOException {
                    return (AssetFormat) k7.parseWithIOException(PARSER, yVar, m5Var);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public interface AssetFormatOrBuilder extends MessageOrBuilder {
                AssetFormat.DataAssetFormat getData();

                AssetFormat.DataAssetFormatOrBuilder getDataOrBuilder();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ MessageLite getDefaultInstanceForType();

                Struct getExt();

                jb getExtOrBuilder();

                Any getExtProto(int i10);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

                List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

                int getId();

                AssetFormat.ImageAssetFormat getImg();

                AssetFormat.ImageAssetFormatOrBuilder getImgOrBuilder();

                boolean getReq();

                AssetFormat.TitleAssetFormat getTitle();

                AssetFormat.TitleAssetFormatOrBuilder getTitleOrBuilder();

                VideoPlacement getVideo();

                VideoPlacementOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasExt();

                boolean hasImg();

                boolean hasTitle();

                boolean hasVideo();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static NativeFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.K;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NativeFormat)) {
                    return super.equals(obj);
                }
                NativeFormat nativeFormat = (NativeFormat) obj;
                if (getAssetList().equals(nativeFormat.getAssetList()) && hasExt() == nativeFormat.hasExt()) {
                    return (!hasExt() || getExt().equals(nativeFormat.getExt())) && getExtProtoList().equals(nativeFormat.getExtProtoList()) && this.unknownFields.equals(nativeFormat.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public AssetFormat getAsset(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public int getAssetCount() {
                return this.asset_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<AssetFormat> getAssetList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public AssetFormatOrBuilder getAssetOrBuilder(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
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
                int iComputeMessageSize = 0;
                for (int i11 = 0; i11 < this.asset_.size(); i11++) {
                    iComputeMessageSize += h0.computeMessageSize(1, this.asset_.get(i11));
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    iComputeMessageSize += h0.computeMessageSize(2, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    iComputeMessageSize += h0.computeMessageSize(3, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (getAssetCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 1, 53) + getAssetList().hashCode();
                }
                if (hasExt()) {
                    iHashCode = o2.B(iHashCode, 37, 3, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 2, 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return b.L.ensureFieldAccessorsInitialized(NativeFormat.class, Builder.class);
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
                return new NativeFormat();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                for (int i10 = 0; i10 < this.asset_.size(); i10++) {
                    h0Var.writeMessage(1, this.asset_.get(i10));
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    h0Var.writeMessage(2, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    h0Var.writeMessage(3, getExt());
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements NativeFormatOrBuilder {
                private pa assetBuilder_;
                private List<AssetFormat> asset_;
                private int bitField0_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;

                private Builder() {
                    super(null);
                    List list = Collections.EMPTY_LIST;
                    this.asset_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                private void ensureAssetIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.asset_ = new ArrayList(this.asset_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                private pa getAssetFieldBuilder() {
                    if (this.assetBuilder_ == null) {
                        this.assetBuilder_ = new pa(this.asset_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.asset_ = null;
                    }
                    return this.assetBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.K;
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
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllAsset(Iterable<? extends AssetFormat> iterable) {
                    pa paVar = this.assetBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureAssetIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.asset_);
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

                public Builder addAsset(AssetFormat assetFormat) {
                    pa paVar = this.assetBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(assetFormat);
                        return this;
                    }
                    assetFormat.getClass();
                    ensureAssetIsMutable();
                    this.asset_.add(assetFormat);
                    onChanged();
                    return this;
                }

                public AssetFormat.Builder addAssetBuilder() {
                    return (AssetFormat.Builder) getAssetFieldBuilder().addBuilder(AssetFormat.getDefaultInstance());
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

                public Builder clearAsset() {
                    pa paVar = this.assetBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.asset_ = Collections.EMPTY_LIST;
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public AssetFormat getAsset(int i10) {
                    pa paVar = this.assetBuilder_;
                    return paVar == null ? this.asset_.get(i10) : (AssetFormat) paVar.getMessage(i10);
                }

                public AssetFormat.Builder getAssetBuilder(int i10) {
                    return (AssetFormat.Builder) getAssetFieldBuilder().getBuilder(i10);
                }

                public List<AssetFormat.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().getBuilderList();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public int getAssetCount() {
                    pa paVar = this.assetBuilder_;
                    return paVar == null ? this.asset_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<AssetFormat> getAssetList() {
                    pa paVar = this.assetBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.asset_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public AssetFormatOrBuilder getAssetOrBuilder(int i10) {
                    pa paVar = this.assetBuilder_;
                    return paVar == null ? this.asset_.get(i10) : (AssetFormatOrBuilder) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                    pa paVar = this.assetBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.asset_);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.K;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.L.ensureFieldAccessorsInitialized(NativeFormat.class, Builder.class);
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

                public Builder removeAsset(int i10) {
                    pa paVar = this.assetBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureAssetIsMutable();
                    this.asset_.remove(i10);
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

                public Builder setAsset(int i10, AssetFormat assetFormat) {
                    pa paVar = this.assetBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, assetFormat);
                        return this;
                    }
                    assetFormat.getClass();
                    ensureAssetIsMutable();
                    this.asset_.set(i10, assetFormat);
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

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public NativeFormat build() {
                    NativeFormat nativeFormatBuildPartial = buildPartial();
                    if (nativeFormatBuildPartial.isInitialized()) {
                        return nativeFormatBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) nativeFormatBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public NativeFormat buildPartial() {
                    NativeFormat nativeFormat = new NativeFormat(this);
                    int i10 = this.bitField0_;
                    pa paVar = this.assetBuilder_;
                    if (paVar == null) {
                        if ((i10 & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        nativeFormat.asset_ = this.asset_;
                    } else {
                        nativeFormat.asset_ = paVar.build();
                    }
                    xa xaVar = this.extBuilder_;
                    if (xaVar == null) {
                        nativeFormat.ext_ = this.ext_;
                    } else {
                        nativeFormat.ext_ = (Struct) xaVar.build();
                    }
                    pa paVar2 = this.extProtoBuilder_;
                    if (paVar2 != null) {
                        nativeFormat.extProto_ = paVar2.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        nativeFormat.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return nativeFormat;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public NativeFormat getDefaultInstanceForType() {
                    return NativeFormat.getDefaultInstance();
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

                public AssetFormat.Builder addAssetBuilder(int i10) {
                    return (AssetFormat.Builder) getAssetFieldBuilder().addBuilder(i10, AssetFormat.getDefaultInstance());
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
                    pa paVar = this.assetBuilder_;
                    if (paVar == null) {
                        this.asset_ = Collections.EMPTY_LIST;
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

                private Builder(p6 p6Var) {
                    super(p6Var);
                    List list = Collections.EMPTY_LIST;
                    this.asset_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                public Builder addAsset(int i10, AssetFormat assetFormat) {
                    pa paVar = this.assetBuilder_;
                    if (paVar == null) {
                        assetFormat.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(i10, assetFormat);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, assetFormat);
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
                    if (message instanceof NativeFormat) {
                        return mergeFrom((NativeFormat) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAsset(int i10, AssetFormat.Builder builder) {
                    pa paVar = this.assetBuilder_;
                    if (paVar == null) {
                        ensureAssetIsMutable();
                        this.asset_.set(i10, builder.build());
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

                public Builder mergeFrom(NativeFormat nativeFormat) {
                    if (nativeFormat == NativeFormat.getDefaultInstance()) {
                        return this;
                    }
                    if (this.assetBuilder_ == null) {
                        if (!nativeFormat.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = nativeFormat.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(nativeFormat.asset_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.asset_.isEmpty()) {
                        if (!this.assetBuilder_.isEmpty()) {
                            this.assetBuilder_.addAllMessages(nativeFormat.asset_);
                        } else {
                            this.assetBuilder_.dispose();
                            this.assetBuilder_ = null;
                            this.asset_ = nativeFormat.asset_;
                            this.bitField0_ &= -2;
                            this.assetBuilder_ = k7.alwaysUseFieldBuilders ? getAssetFieldBuilder() : null;
                        }
                    }
                    if (nativeFormat.hasExt()) {
                        mergeExt(nativeFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!nativeFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = nativeFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(nativeFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(nativeFormat.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = nativeFormat.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) nativeFormat).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAsset(AssetFormat.Builder builder) {
                    pa paVar = this.assetBuilder_;
                    if (paVar == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(builder.build());
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

                public Builder addAsset(int i10, AssetFormat.Builder builder) {
                    pa paVar = this.assetBuilder_;
                    if (paVar == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i10, builder.build());
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
                public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.access$8400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$Builder");
                }
            }

            public static Builder newBuilder(NativeFormat nativeFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(nativeFormat);
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private NativeFormat(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (NativeFormat) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static NativeFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public NativeFormat getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static NativeFormat parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private NativeFormat() {
                this.memoizedIsInitialized = (byte) -1;
                List list = Collections.EMPTY_LIST;
                this.asset_ = list;
                this.extProto_ = list;
            }

            public static NativeFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static NativeFormat parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (NativeFormat) PARSER.parseFrom(bArr, m5Var);
            }

            public static NativeFormat parseFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) k7.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private NativeFormat(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                        if ((i10 & 1) == 0) {
                                            this.asset_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.asset_.add(yVar.readMessage(AssetFormat.parser(), m5Var));
                                    } else if (tag == 18) {
                                        if ((i10 & 2) == 0) {
                                            this.extProto_ = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                    } else if (tag != 26) {
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
                            this.asset_ = Collections.unmodifiableList(this.asset_);
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
                    this.asset_ = Collections.unmodifiableList(this.asset_);
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static NativeFormat parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (NativeFormat) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static NativeFormat parseFrom(y yVar) throws IOException {
                return (NativeFormat) k7.parseWithIOException(PARSER, yVar);
            }

            public static NativeFormat parseFrom(y yVar, m5 m5Var) throws IOException {
                return (NativeFormat) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface NativeFormatOrBuilder extends MessageOrBuilder {
            NativeFormat.AssetFormat getAsset(int i10);

            int getAssetCount();

            List<NativeFormat.AssetFormat> getAssetList();

            NativeFormat.AssetFormatOrBuilder getAssetOrBuilder(int i10);

            List<? extends NativeFormat.AssetFormatOrBuilder> getAssetOrBuilderList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

            List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static DisplayPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.G;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayPlacement)) {
                return super.equals(obj);
            }
            DisplayPlacement displayPlacement = (DisplayPlacement) obj;
            if (this.pos_ != displayPlacement.pos_ || getInstl() != displayPlacement.getInstl() || getTopframe() != displayPlacement.getTopframe() || !getIfrbustList().equals(displayPlacement.getIfrbustList()) || this.clktype_ != displayPlacement.clktype_ || getAmpren() != displayPlacement.getAmpren() || this.ptype_ != displayPlacement.ptype_ || this.context_ != displayPlacement.context_ || !getMimeList().equals(displayPlacement.getMimeList()) || !this.api_.equals(displayPlacement.api_) || !this.ctype_.equals(displayPlacement.ctype_) || getW() != displayPlacement.getW() || getH() != displayPlacement.getH() || this.unit_ != displayPlacement.unit_ || getPriv() != displayPlacement.getPriv() || !getDisplayfmtList().equals(displayPlacement.getDisplayfmtList()) || hasNativefmt() != displayPlacement.hasNativefmt()) {
                return false;
            }
            if ((!hasNativefmt() || getNativefmt().equals(displayPlacement.getNativefmt())) && getEventList().equals(displayPlacement.getEventList()) && hasExt() == displayPlacement.hasExt()) {
                return (!hasExt() || getExt().equals(displayPlacement.getExt())) && getExtProtoList().equals(displayPlacement.getExtProtoList()) && this.unknownFields.equals(displayPlacement.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getAmpren() {
            return this.ampren_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<ApiFramework> getApiList() {
            return new u7(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ClickType getClktype() {
            ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
            return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getClktypeValue() {
            return this.clktype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayContextType getContext() {
            DisplayContextType displayContextTypeValueOf = DisplayContextType.valueOf(this.context_);
            return displayContextTypeValueOf == null ? DisplayContextType.UNRECOGNIZED : displayContextTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getContextValue() {
            return this.context_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayCreativeType getCtype(int i10) {
            return (DisplayCreativeType) ctype_converter_.convert(this.ctype_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getCtypeCount() {
            return this.ctype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<DisplayCreativeType> getCtypeList() {
            return new u7(this.ctype_, ctype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getCtypeValue(int i10) {
            return this.ctype_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayFormat getDisplayfmt(int i10) {
            return this.displayfmt_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getDisplayfmtCount() {
            return this.displayfmt_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<DisplayFormat> getDisplayfmtList() {
            return this.displayfmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i10) {
            return this.displayfmt_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
            return this.displayfmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public EventSpec getEvent(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getEventCount() {
            return this.event_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<EventSpec> getEventList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public EventSpecOrBuilder getEventOrBuilder(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public String getIfrbust(int i10) {
            return (String) this.ifrbust_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ByteString getIfrbustBytes(int i10) {
            return this.ifrbust_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getIfrbustCount() {
            return this.ifrbust_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getInstl() {
            return this.instl_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public String getMime(int i10) {
            return (String) this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public NativeFormat getNativefmt() {
            NativeFormat nativeFormat = this.nativefmt_;
            return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public NativeFormatOrBuilder getNativefmtOrBuilder() {
            return getNativefmt();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public PlacementPosition getPos() {
            PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
            return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getPosValue() {
            return this.pos_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getPriv() {
            return this.priv_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayPlacementType getPtype() {
            DisplayPlacementType displayPlacementTypeValueOf = DisplayPlacementType.valueOf(this.ptype_);
            return displayPlacementTypeValueOf == null ? DisplayPlacementType.UNRECOGNIZED : displayPlacementTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getPtypeValue() {
            return this.ptype_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber() ? h0.computeEnumSize(1, this.pos_) : 0;
            boolean z10 = this.instl_;
            if (z10) {
                iComputeEnumSize += h0.computeBoolSize(2, z10);
            }
            boolean z11 = this.topframe_;
            if (z11) {
                iComputeEnumSize += h0.computeBoolSize(3, z11);
            }
            int iE = 0;
            for (int i11 = 0; i11 < this.ifrbust_.size(); i11++) {
                iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.ifrbust_, i11, iE);
            }
            int size = getIfrbustList().size() + iComputeEnumSize + iE;
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                size += h0.computeEnumSize(5, this.clktype_);
            }
            int i12 = this.ampren_;
            if (i12 != 0) {
                size += h0.computeUInt32Size(6, i12);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                size += h0.computeEnumSize(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                size += h0.computeEnumSize(8, this.context_);
            }
            int iE2 = 0;
            for (int i13 = 0; i13 < this.mime_.size(); i13++) {
                iE2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.mime_, i13, iE2);
            }
            int size2 = getMimeList().size() + size + iE2;
            int iComputeEnumSizeNoTag = 0;
            for (int i14 = 0; i14 < this.api_.size(); i14++) {
                iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(this.api_.get(i14).intValue());
            }
            int iComputeUInt32SizeNoTag = size2 + iComputeEnumSizeNoTag;
            if (!getApiList().isEmpty()) {
                iComputeUInt32SizeNoTag = iComputeUInt32SizeNoTag + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
            }
            this.apiMemoizedSerializedSize = iComputeEnumSizeNoTag;
            int iComputeEnumSizeNoTag2 = 0;
            for (int i15 = 0; i15 < this.ctype_.size(); i15++) {
                iComputeEnumSizeNoTag2 += h0.computeEnumSizeNoTag(this.ctype_.get(i15).intValue());
            }
            int iComputeMessageSize = iComputeUInt32SizeNoTag + iComputeEnumSizeNoTag2;
            if (!getCtypeList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag2);
            }
            this.ctypeMemoizedSerializedSize = iComputeEnumSizeNoTag2;
            int i16 = this.w_;
            if (i16 != 0) {
                iComputeMessageSize += h0.computeUInt32Size(12, i16);
            }
            int i17 = this.h_;
            if (i17 != 0) {
                iComputeMessageSize += h0.computeUInt32Size(13, i17);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                iComputeMessageSize += h0.computeEnumSize(14, this.unit_);
            }
            boolean z12 = this.priv_;
            if (z12) {
                iComputeMessageSize += h0.computeBoolSize(15, z12);
            }
            for (int i18 = 0; i18 < this.displayfmt_.size(); i18++) {
                iComputeMessageSize += h0.computeMessageSize(16, this.displayfmt_.get(i18));
            }
            if (this.nativefmt_ != null) {
                iComputeMessageSize += h0.computeMessageSize(17, getNativefmt());
            }
            for (int i19 = 0; i19 < this.event_.size(); i19++) {
                iComputeMessageSize += h0.computeMessageSize(18, this.event_.get(i19));
            }
            for (int i20 = 0; i20 < this.extProto_.size(); i20++) {
                iComputeMessageSize += h0.computeMessageSize(19, this.extProto_.get(i20));
            }
            if (this.ext_ != null) {
                iComputeMessageSize += h0.computeMessageSize(20, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getTopframe() {
            return this.topframe_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public SizeUnit getUnit() {
            SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
            return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getUnitValue() {
            return this.unit_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean hasNativefmt() {
            return this.nativefmt_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashBoolean = x7.hashBoolean(getTopframe()) + ((((x7.hashBoolean(getInstl()) + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.pos_, 37, 2, 53)) * 37) + 3) * 53);
            if (getIfrbustCount() > 0) {
                iHashBoolean = o2.B(iHashBoolean, 37, 4, 53) + getIfrbustList().hashCode();
            }
            int iD = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getAmpren() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(o2.B(iHashBoolean, 37, 5, 53), this.clktype_, 37, 6, 53)) * 37) + 7) * 53, this.ptype_, 37, 8, 53) + this.context_;
            if (getMimeCount() > 0) {
                iD = o2.B(iD, 37, 9, 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iD = o2.B(iD, 37, 10, 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                iD = o2.B(iD, 37, 11, 53) + this.ctype_.hashCode();
            }
            int iHashBoolean2 = x7.hashBoolean(getPriv()) + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getH() + ((((getW() + o2.B(iD, 37, 12, 53)) * 37) + 13) * 53)) * 37) + 14) * 53, this.unit_, 37, 15, 53);
            if (getDisplayfmtCount() > 0) {
                iHashBoolean2 = getDisplayfmtList().hashCode() + o2.B(iHashBoolean2, 37, 16, 53);
            }
            if (hasNativefmt()) {
                iHashBoolean2 = getNativefmt().hashCode() + o2.B(iHashBoolean2, 37, 17, 53);
            }
            if (getEventCount() > 0) {
                iHashBoolean2 = getEventList().hashCode() + o2.B(iHashBoolean2, 37, 18, 53);
            }
            if (hasExt()) {
                iHashBoolean2 = getExt().hashCode() + o2.B(iHashBoolean2, 37, 20, 53);
            }
            if (getExtProtoCount() > 0) {
                iHashBoolean2 = getExtProtoList().hashCode() + o2.B(iHashBoolean2, 37, 19, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashBoolean2 * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.H.ensureFieldAccessorsInitialized(DisplayPlacement.class, Builder.class);
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
            return new DisplayPlacement();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            getSerializedSize();
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                h0Var.writeEnum(1, this.pos_);
            }
            boolean z10 = this.instl_;
            if (z10) {
                h0Var.writeBool(2, z10);
            }
            boolean z11 = this.topframe_;
            if (z11) {
                h0Var.writeBool(3, z11);
            }
            int iF = 0;
            while (iF < this.ifrbust_.size()) {
                iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.ifrbust_, iF, h0Var, 4, iF, 1);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                h0Var.writeEnum(5, this.clktype_);
            }
            int i10 = this.ampren_;
            if (i10 != 0) {
                h0Var.writeUInt32(6, i10);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                h0Var.writeEnum(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                h0Var.writeEnum(8, this.context_);
            }
            int iF2 = 0;
            while (iF2 < this.mime_.size()) {
                iF2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.mime_, iF2, h0Var, 9, iF2, 1);
            }
            if (getApiList().size() > 0) {
                h0Var.writeUInt32NoTag(82);
                h0Var.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.api_.size(); i11++) {
                h0Var.writeEnumNoTag(this.api_.get(i11).intValue());
            }
            if (getCtypeList().size() > 0) {
                h0Var.writeUInt32NoTag(90);
                h0Var.writeUInt32NoTag(this.ctypeMemoizedSerializedSize);
            }
            for (int i12 = 0; i12 < this.ctype_.size(); i12++) {
                h0Var.writeEnumNoTag(this.ctype_.get(i12).intValue());
            }
            int i13 = this.w_;
            if (i13 != 0) {
                h0Var.writeUInt32(12, i13);
            }
            int i14 = this.h_;
            if (i14 != 0) {
                h0Var.writeUInt32(13, i14);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                h0Var.writeEnum(14, this.unit_);
            }
            boolean z12 = this.priv_;
            if (z12) {
                h0Var.writeBool(15, z12);
            }
            for (int i15 = 0; i15 < this.displayfmt_.size(); i15++) {
                h0Var.writeMessage(16, this.displayfmt_.get(i15));
            }
            if (this.nativefmt_ != null) {
                h0Var.writeMessage(17, getNativefmt());
            }
            for (int i16 = 0; i16 < this.event_.size(); i16++) {
                h0Var.writeMessage(18, this.event_.get(i16));
            }
            for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
                h0Var.writeMessage(19, this.extProto_.get(i17));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(20, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        public static Builder newBuilder(DisplayPlacement displayPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayPlacement);
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteBuffer, m5Var);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ka getIfrbustList() {
            return this.ifrbust_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ka getMimeList() {
            return this.mime_;
        }

        private DisplayPlacement(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (DisplayPlacement) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static DisplayPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public DisplayPlacement getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DisplayPlacement parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DisplayPlacement() {
            this.memoizedIsInitialized = (byte) -1;
            this.pos_ = 0;
            f8 f8Var = f8.f22138e;
            this.ifrbust_ = f8Var;
            this.clktype_ = 0;
            this.ptype_ = 0;
            this.context_ = 0;
            this.mime_ = f8Var;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.ctype_ = list;
            this.unit_ = 0;
            this.displayfmt_ = list;
            this.event_ = list;
            this.extProto_ = list;
        }

        public static DisplayPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static DisplayPlacement parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (DisplayPlacement) PARSER.parseFrom(bArr, m5Var);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) k7.parseWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (DisplayPlacement) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static DisplayPlacement parseFrom(y yVar) throws IOException {
            return (DisplayPlacement) k7.parseWithIOException(PARSER, yVar);
        }

        public static DisplayPlacement parseFrom(y yVar, m5 m5Var) throws IOException {
            return (DisplayPlacement) k7.parseWithIOException(PARSER, yVar, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private DisplayPlacement(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            this();
            m5Var.getClass();
            cc ccVarNewBuilder = gc.newBuilder();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = yVar.readTag();
                        switch (tag) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.pos_ = yVar.readEnum();
                            case 16:
                                this.instl_ = yVar.readBool();
                            case 24:
                                this.topframe_ = yVar.readBool();
                            case 34:
                                String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.ifrbust_ = new f8();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.ifrbust_.add((g8) stringRequireUtf8);
                            case 40:
                                this.clktype_ = yVar.readEnum();
                            case 48:
                                this.ampren_ = yVar.readUInt32();
                            case 56:
                                this.ptype_ = yVar.readEnum();
                            case 64:
                                this.context_ = yVar.readEnum();
                            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                String stringRequireUtf82 = yVar.readStringRequireUtf8();
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.mime_ = new f8();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.mime_.add((g8) stringRequireUtf82);
                            case 80:
                                int i13 = yVar.readEnum();
                                int i14 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i14 == 0) {
                                    this.api_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4;
                                }
                                this.api_.add(Integer.valueOf(i13));
                            case 82:
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                i10 = i10;
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i15 = yVar.readEnum();
                                    if (((i10 == true ? 1 : 0) & 4) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.api_.add(Integer.valueOf(i15));
                                    i10 = i10;
                                }
                                yVar.popLimit(iPushLimit);
                            case 88:
                                int i16 = yVar.readEnum();
                                int i17 = (i10 == true ? 1 : 0) & 8;
                                i10 = i10;
                                if (i17 == 0) {
                                    this.ctype_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.ctype_.add(Integer.valueOf(i16));
                            case 90:
                                int iPushLimit2 = yVar.pushLimit(yVar.readRawVarint32());
                                i10 = i10;
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i18 = yVar.readEnum();
                                    if (((i10 == true ? 1 : 0) & 8) == 0) {
                                        this.ctype_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8;
                                    }
                                    this.ctype_.add(Integer.valueOf(i18));
                                    i10 = i10;
                                }
                                yVar.popLimit(iPushLimit2);
                            case 96:
                                this.w_ = yVar.readUInt32();
                            case 104:
                                this.h_ = yVar.readUInt32();
                            case 112:
                                this.unit_ = yVar.readEnum();
                            case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                                this.priv_ = yVar.readBool();
                            case 130:
                                int i19 = (i10 == true ? 1 : 0) & 16;
                                i10 = i10;
                                if (i19 == 0) {
                                    this.displayfmt_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 16;
                                }
                                this.displayfmt_.add(yVar.readMessage(DisplayFormat.parser(), m5Var));
                            case 138:
                                NativeFormat nativeFormat = this.nativefmt_;
                                NativeFormat.Builder builder = nativeFormat != null ? nativeFormat.toBuilder() : null;
                                NativeFormat nativeFormat2 = (NativeFormat) yVar.readMessage(NativeFormat.parser(), m5Var);
                                this.nativefmt_ = nativeFormat2;
                                if (builder != null) {
                                    builder.mergeFrom(nativeFormat2);
                                    this.nativefmt_ = builder.buildPartial();
                                }
                            case 146:
                                int i20 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i20 == 0) {
                                    this.event_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.event_.add(yVar.readMessage(EventSpec.parser(), m5Var));
                            case 154:
                                int i21 = (i10 == true ? 1 : 0) & 64;
                                i10 = i10;
                                if (i21 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 64;
                                }
                                this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                            case 162:
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
                    if (((i10 == true ? 1 : 0) & 1) != 0) {
                        this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 4) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if (((i10 == true ? 1 : 0) & 8) != 0) {
                        this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    }
                    if (((i10 == true ? 1 : 0) & 16) != 0) {
                        this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
                    }
                    if (((i10 == true ? 1 : 0) & 32) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                    }
                    if (((i10 == true ? 1 : 0) & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) != 0) {
                this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 4) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if (((i10 == true ? 1 : 0) & 8) != 0) {
                this.ctype_ = Collections.unmodifiableList(this.ctype_);
            }
            if (((i10 == true ? 1 : 0) & 16) != 0) {
                this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
            }
            if (((i10 == true ? 1 : 0) & 32) != 0) {
                this.event_ = Collections.unmodifiableList(this.event_);
            }
            if (((i10 == true ? 1 : 0) & 64) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DisplayPlacementOrBuilder extends MessageOrBuilder {
        int getAmpren();

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        ClickType getClktype();

        int getClktypeValue();

        DisplayContextType getContext();

        int getContextValue();

        DisplayCreativeType getCtype(int i10);

        int getCtypeCount();

        List<DisplayCreativeType> getCtypeList();

        int getCtypeValue(int i10);

        List<Integer> getCtypeValueList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        DisplayPlacement.DisplayFormat getDisplayfmt(int i10);

        int getDisplayfmtCount();

        List<DisplayPlacement.DisplayFormat> getDisplayfmtList();

        DisplayPlacement.DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i10);

        List<? extends DisplayPlacement.DisplayFormatOrBuilder> getDisplayfmtOrBuilderList();

        DisplayPlacement.EventSpec getEvent(int i10);

        int getEventCount();

        List<DisplayPlacement.EventSpec> getEventList();

        DisplayPlacement.EventSpecOrBuilder getEventOrBuilder(int i10);

        List<? extends DisplayPlacement.EventSpecOrBuilder> getEventOrBuilderList();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        int getH();

        String getIfrbust(int i10);

        ByteString getIfrbustBytes(int i10);

        int getIfrbustCount();

        List<String> getIfrbustList();

        boolean getInstl();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        DisplayPlacement.NativeFormat getNativefmt();

        DisplayPlacement.NativeFormatOrBuilder getNativefmtOrBuilder();

        PlacementPosition getPos();

        int getPosValue();

        boolean getPriv();

        DisplayPlacementType getPtype();

        int getPtypeValue();

        boolean getTopframe();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();

        boolean hasNativefmt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class VideoPlacement extends k7 implements VideoPlacementOrBuilder {
        public static final int API_FIELD_NUMBER = 11;
        public static final int BOXING_FIELD_NUMBER = 24;
        public static final int CLKTYPE_FIELD_NUMBER = 9;
        public static final int COMPTYPE_FIELD_NUMBER = 26;
        public static final int COMP_FIELD_NUMBER = 25;
        public static final int CTYPE_FIELD_NUMBER = 12;
        public static final int DELAY_FIELD_NUMBER = 3;
        public static final int DELIVERY_FIELD_NUMBER = 21;
        public static final int EXT_FIELD_NUMBER = 28;
        public static final int EXT_PROTO_FIELD_NUMBER = 27;
        public static final int H_FIELD_NUMBER = 14;
        public static final int LINEAR_FIELD_NUMBER = 23;
        public static final int MAXBITR_FIELD_NUMBER = 20;
        public static final int MAXDUR_FIELD_NUMBER = 17;
        public static final int MAXEXT_FIELD_NUMBER = 18;
        public static final int MAXSEQ_FIELD_NUMBER = 22;
        public static final int MIME_FIELD_NUMBER = 10;
        public static final int MINBITR_FIELD_NUMBER = 19;
        public static final int MINDUR_FIELD_NUMBER = 16;
        public static final int PLAYEND_FIELD_NUMBER = 8;
        public static final int PLAYMETHOD_FIELD_NUMBER = 7;
        public static final int POS_FIELD_NUMBER = 2;
        public static final int PTYPE_FIELD_NUMBER = 1;
        public static final int SKIPAFTER_FIELD_NUMBER = 6;
        public static final int SKIPMIN_FIELD_NUMBER = 5;
        public static final int SKIP_FIELD_NUMBER = 4;
        public static final int UNIT_FIELD_NUMBER = 15;
        public static final int W_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private boolean boxing_;
        private int clktype_;
        private List<Companion> comp_;
        private int comptypeMemoizedSerializedSize;
        private List<Integer> comptype_;
        private int ctypeMemoizedSerializedSize;
        private List<Integer> ctype_;
        private int delay_;
        private int deliveryMemoizedSerializedSize;
        private List<Integer> delivery_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private int linear_;
        private int maxbitr_;
        private int maxdur_;
        private int maxext_;
        private int maxseq_;
        private byte memoizedIsInitialized;
        private g8 mime_;
        private int minbitr_;
        private int mindur_;
        private int playend_;
        private int playmethod_;
        private int pos_;
        private int ptype_;
        private boolean skip_;
        private int skipafter_;
        private int skipmin_;
        private int unit_;
        private int w_;
        private static final t7 api_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.1
            @Override // com.explorestack.protobuf.t7
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final t7 ctype_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.2
            @Override // com.explorestack.protobuf.t7
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType videoCreativeTypeValueOf = VideoCreativeType.valueOf(num.intValue());
                return videoCreativeTypeValueOf == null ? VideoCreativeType.UNRECOGNIZED : videoCreativeTypeValueOf;
            }
        };
        private static final t7 delivery_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.3
            @Override // com.explorestack.protobuf.t7
            public DeliveryMethod convert(Integer num) {
                DeliveryMethod deliveryMethodValueOf = DeliveryMethod.valueOf(num.intValue());
                return deliveryMethodValueOf == null ? DeliveryMethod.UNRECOGNIZED : deliveryMethodValueOf;
            }
        };
        private static final t7 comptype_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.4
            @Override // com.explorestack.protobuf.t7
            public CompanionType convert(Integer num) {
                CompanionType companionTypeValueOf = CompanionType.valueOf(num.intValue());
                return companionTypeValueOf == null ? CompanionType.UNRECOGNIZED : companionTypeValueOf;
            }
        };
        private static final VideoPlacement DEFAULT_INSTANCE = new VideoPlacement();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.5
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public VideoPlacement parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new VideoPlacement(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements VideoPlacementOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private boolean boxing_;
            private int clktype_;
            private pa compBuilder_;
            private List<Companion> comp_;
            private List<Integer> comptype_;
            private List<Integer> ctype_;
            private int delay_;
            private List<Integer> delivery_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int linear_;
            private int maxbitr_;
            private int maxdur_;
            private int maxext_;
            private int maxseq_;
            private g8 mime_;
            private int minbitr_;
            private int mindur_;
            private int playend_;
            private int playmethod_;
            private int pos_;
            private int ptype_;
            private boolean skip_;
            private int skipafter_;
            private int skipmin_;
            private int unit_;
            private int w_;

            private Builder() {
                super(null);
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = f8.f22138e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.delivery_ = list;
                this.linear_ = 0;
                this.comp_ = list;
                this.comptype_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureCompIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.comp_ = new ArrayList(this.comp_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureComptypeIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.comptype_ = new ArrayList(this.comptype_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureDeliveryIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.delivery_ = new ArrayList(this.delivery_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new f8(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private pa getCompFieldBuilder() {
                if (this.compBuilder_ == null) {
                    this.compBuilder_ = new pa(this.comp_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.comp_ = null;
                }
                return this.compBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.W;
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
                    this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getCompFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.api_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllComp(Iterable<? extends Companion> iterable) {
                pa paVar = this.compBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureCompIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.comp_);
                onChanged();
                return this;
            }

            public Builder addAllComptype(Iterable<? extends CompanionType> iterable) {
                ensureComptypeIsMutable();
                Iterator<? extends CompanionType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.comptype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllComptypeValue(Iterable<Integer> iterable) {
                ensureComptypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.comptype_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllCtype(Iterable<? extends VideoCreativeType> iterable) {
                ensureCtypeIsMutable();
                Iterator<? extends VideoCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.ctype_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllDelivery(Iterable<? extends DeliveryMethod> iterable) {
                ensureDeliveryIsMutable();
                Iterator<? extends DeliveryMethod> it = iterable.iterator();
                while (it.hasNext()) {
                    this.delivery_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllDeliveryValue(Iterable<Integer> iterable) {
                ensureDeliveryIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.delivery_.add(num);
                }
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

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addComp(Companion companion) {
                pa paVar = this.compBuilder_;
                if (paVar != null) {
                    paVar.addMessage(companion);
                    return this;
                }
                companion.getClass();
                ensureCompIsMutable();
                this.comp_.add(companion);
                onChanged();
                return this;
            }

            public Companion.Builder addCompBuilder() {
                return (Companion.Builder) getCompFieldBuilder().addBuilder(Companion.getDefaultInstance());
            }

            public Builder addComptype(CompanionType companionType) {
                companionType.getClass();
                ensureComptypeIsMutable();
                this.comptype_.add(Integer.valueOf(companionType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addComptypeValue(int i10) {
                ensureComptypeIsMutable();
                this.comptype_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addCtype(VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i10) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addDelivery(DeliveryMethod deliveryMethod) {
                deliveryMethod.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.add(Integer.valueOf(deliveryMethod.getNumber()));
                onChanged();
                return this;
            }

            public Builder addDeliveryValue(int i10) {
                ensureDeliveryIsMutable();
                this.delivery_.add(Integer.valueOf(i10));
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

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add((g8) str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.add(byteString);
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearBoxing() {
                this.boxing_ = false;
                onChanged();
                return this;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearComp() {
                pa paVar = this.compBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.comp_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearComptype() {
                this.comptype_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearDelay() {
                this.delay_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDelivery() {
                this.delivery_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
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
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLinear() {
                this.linear_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxbitr() {
                this.maxbitr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxdur() {
                this.maxdur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxext() {
                this.maxext_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxseq() {
                this.maxseq_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = f8.f22138e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearMinbitr() {
                this.minbitr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMindur() {
                this.mindur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlayend() {
                this.playend_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlaymethod() {
                this.playmethod_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSkip() {
                this.skip_ = false;
                onChanged();
                return this;
            }

            public Builder clearSkipafter() {
                this.skipafter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSkipmin() {
                this.skipmin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) VideoPlacement.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<ApiFramework> getApiList() {
                return new u7(this.api_, VideoPlacement.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean getBoxing() {
                return this.boxing_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ClickType getClktype() {
                ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
                return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getClktypeValue() {
                return this.clktype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public Companion getComp(int i10) {
                pa paVar = this.compBuilder_;
                return paVar == null ? this.comp_.get(i10) : (Companion) paVar.getMessage(i10);
            }

            public Companion.Builder getCompBuilder(int i10) {
                return (Companion.Builder) getCompFieldBuilder().getBuilder(i10);
            }

            public List<Companion.Builder> getCompBuilderList() {
                return getCompFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCompCount() {
                pa paVar = this.compBuilder_;
                return paVar == null ? this.comp_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Companion> getCompList() {
                pa paVar = this.compBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.comp_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public CompanionOrBuilder getCompOrBuilder(int i10) {
                pa paVar = this.compBuilder_;
                return paVar == null ? this.comp_.get(i10) : (CompanionOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
                pa paVar = this.compBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.comp_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public CompanionType getComptype(int i10) {
                return (CompanionType) VideoPlacement.comptype_converter_.convert(this.comptype_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getComptypeCount() {
                return this.comptype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<CompanionType> getComptypeList() {
                return new u7(this.comptype_, VideoPlacement.comptype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getComptypeValue(int i10) {
                return this.comptype_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getComptypeValueList() {
                return Collections.unmodifiableList(this.comptype_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public VideoCreativeType getCtype(int i10) {
                return (VideoCreativeType) VideoPlacement.ctype_converter_.convert(this.ctype_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCtypeCount() {
                return this.ctype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<VideoCreativeType> getCtypeList() {
                return new u7(this.ctype_, VideoPlacement.ctype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCtypeValue(int i10) {
                return this.ctype_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getCtypeValueList() {
                return Collections.unmodifiableList(this.ctype_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDelay() {
                return this.delay_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public DeliveryMethod getDelivery(int i10) {
                return (DeliveryMethod) VideoPlacement.delivery_converter_.convert(this.delivery_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDeliveryCount() {
                return this.delivery_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<DeliveryMethod> getDeliveryList() {
                return new u7(this.delivery_, VideoPlacement.delivery_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDeliveryValue(int i10) {
                return this.delivery_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getDeliveryValueList() {
                return Collections.unmodifiableList(this.delivery_);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.W;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public LinearityMode getLinear() {
                LinearityMode linearityModeValueOf = LinearityMode.valueOf(this.linear_);
                return linearityModeValueOf == null ? LinearityMode.UNRECOGNIZED : linearityModeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getLinearValue() {
                return this.linear_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxbitr() {
                return this.maxbitr_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxdur() {
                return this.maxdur_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxext() {
                return this.maxext_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxseq() {
                return this.maxseq_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public String getMime(int i10) {
                return (String) this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMinbitr() {
                return this.minbitr_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMindur() {
                return this.mindur_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlaybackCessationMode getPlayend() {
                PlaybackCessationMode playbackCessationModeValueOf = PlaybackCessationMode.valueOf(this.playend_);
                return playbackCessationModeValueOf == null ? PlaybackCessationMode.UNRECOGNIZED : playbackCessationModeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPlayendValue() {
                return this.playend_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlaybackMethod getPlaymethod() {
                PlaybackMethod playbackMethodValueOf = PlaybackMethod.valueOf(this.playmethod_);
                return playbackMethodValueOf == null ? PlaybackMethod.UNRECOGNIZED : playbackMethodValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPlaymethodValue() {
                return this.playmethod_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlacementPosition getPos() {
                PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
                return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPosValue() {
                return this.pos_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public VideoPlacementType getPtype() {
                VideoPlacementType videoPlacementTypeValueOf = VideoPlacementType.valueOf(this.ptype_);
                return videoPlacementTypeValueOf == null ? VideoPlacementType.UNRECOGNIZED : videoPlacementTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPtypeValue() {
                return this.ptype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean getSkip() {
                return this.skip_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getSkipafter() {
                return this.skipafter_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getSkipmin() {
                return this.skipmin_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public SizeUnit getUnit() {
                SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
                return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getUnitValue() {
                return this.unit_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.X.ensureFieldAccessorsInitialized(VideoPlacement.class, Builder.class);
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

            public Builder removeComp(int i10) {
                pa paVar = this.compBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureCompIsMutable();
                this.comp_.remove(i10);
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

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setBoxing(boolean z10) {
                this.boxing_ = z10;
                onChanged();
                return this;
            }

            public Builder setClktype(ClickType clickType) {
                clickType.getClass();
                this.clktype_ = clickType.getNumber();
                onChanged();
                return this;
            }

            public Builder setClktypeValue(int i10) {
                this.clktype_ = i10;
                onChanged();
                return this;
            }

            public Builder setComp(int i10, Companion companion) {
                pa paVar = this.compBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, companion);
                    return this;
                }
                companion.getClass();
                ensureCompIsMutable();
                this.comp_.set(i10, companion);
                onChanged();
                return this;
            }

            public Builder setComptype(int i10, CompanionType companionType) {
                companionType.getClass();
                ensureComptypeIsMutable();
                this.comptype_.set(i10, Integer.valueOf(companionType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setComptypeValue(int i10, int i11) {
                ensureComptypeIsMutable();
                this.comptype_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setCtype(int i10, VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setCtypeValue(int i10, int i11) {
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setDelay(int i10) {
                this.delay_ = i10;
                onChanged();
                return this;
            }

            public Builder setDelivery(int i10, DeliveryMethod deliveryMethod) {
                deliveryMethod.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.set(i10, Integer.valueOf(deliveryMethod.getNumber()));
                onChanged();
                return this;
            }

            public Builder setDeliveryValue(int i10, int i11) {
                ensureDeliveryIsMutable();
                this.delivery_.set(i10, Integer.valueOf(i11));
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

            public Builder setH(int i10) {
                this.h_ = i10;
                onChanged();
                return this;
            }

            public Builder setLinear(LinearityMode linearityMode) {
                linearityMode.getClass();
                this.linear_ = linearityMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setLinearValue(int i10) {
                this.linear_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxbitr(int i10) {
                this.maxbitr_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxdur(int i10) {
                this.maxdur_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxext(int i10) {
                this.maxext_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxseq(int i10) {
                this.maxseq_ = i10;
                onChanged();
                return this;
            }

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, (int) str);
                onChanged();
                return this;
            }

            public Builder setMinbitr(int i10) {
                this.minbitr_ = i10;
                onChanged();
                return this;
            }

            public Builder setMindur(int i10) {
                this.mindur_ = i10;
                onChanged();
                return this;
            }

            public Builder setPlayend(PlaybackCessationMode playbackCessationMode) {
                playbackCessationMode.getClass();
                this.playend_ = playbackCessationMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setPlayendValue(int i10) {
                this.playend_ = i10;
                onChanged();
                return this;
            }

            public Builder setPlaymethod(PlaybackMethod playbackMethod) {
                playbackMethod.getClass();
                this.playmethod_ = playbackMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setPlaymethodValue(int i10) {
                this.playmethod_ = i10;
                onChanged();
                return this;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                placementPosition.getClass();
                this.pos_ = placementPosition.getNumber();
                onChanged();
                return this;
            }

            public Builder setPosValue(int i10) {
                this.pos_ = i10;
                onChanged();
                return this;
            }

            public Builder setPtype(VideoPlacementType videoPlacementType) {
                videoPlacementType.getClass();
                this.ptype_ = videoPlacementType.getNumber();
                onChanged();
                return this;
            }

            public Builder setPtypeValue(int i10) {
                this.ptype_ = i10;
                onChanged();
                return this;
            }

            public Builder setSkip(boolean z10) {
                this.skip_ = z10;
                onChanged();
                return this;
            }

            public Builder setSkipafter(int i10) {
                this.skipafter_ = i10;
                onChanged();
                return this;
            }

            public Builder setSkipmin(int i10) {
                this.skipmin_ = i10;
                onChanged();
                return this;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                sizeUnit.getClass();
                this.unit_ = sizeUnit.getNumber();
                onChanged();
                return this;
            }

            public Builder setUnitValue(int i10) {
                this.unit_ = i10;
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ka getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public VideoPlacement build() {
                VideoPlacement videoPlacementBuildPartial = buildPartial();
                if (videoPlacementBuildPartial.isInitialized()) {
                    return videoPlacementBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoPlacementBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public VideoPlacement buildPartial() {
                VideoPlacement videoPlacement = new VideoPlacement(this);
                videoPlacement.ptype_ = this.ptype_;
                videoPlacement.pos_ = this.pos_;
                videoPlacement.delay_ = this.delay_;
                videoPlacement.skip_ = this.skip_;
                videoPlacement.skipmin_ = this.skipmin_;
                videoPlacement.skipafter_ = this.skipafter_;
                videoPlacement.playmethod_ = this.playmethod_;
                videoPlacement.playend_ = this.playend_;
                videoPlacement.clktype_ = this.clktype_;
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                videoPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                videoPlacement.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -5;
                }
                videoPlacement.ctype_ = this.ctype_;
                videoPlacement.w_ = this.w_;
                videoPlacement.h_ = this.h_;
                videoPlacement.unit_ = this.unit_;
                videoPlacement.mindur_ = this.mindur_;
                videoPlacement.maxdur_ = this.maxdur_;
                videoPlacement.maxext_ = this.maxext_;
                videoPlacement.minbitr_ = this.minbitr_;
                videoPlacement.maxbitr_ = this.maxbitr_;
                if ((this.bitField0_ & 8) != 0) {
                    this.delivery_ = Collections.unmodifiableList(this.delivery_);
                    this.bitField0_ &= -9;
                }
                videoPlacement.delivery_ = this.delivery_;
                videoPlacement.maxseq_ = this.maxseq_;
                videoPlacement.linear_ = this.linear_;
                videoPlacement.boxing_ = this.boxing_;
                pa paVar = this.compBuilder_;
                if (paVar != null) {
                    videoPlacement.comp_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.comp_ = Collections.unmodifiableList(this.comp_);
                        this.bitField0_ &= -17;
                    }
                    videoPlacement.comp_ = this.comp_;
                }
                if ((this.bitField0_ & 32) != 0) {
                    this.comptype_ = Collections.unmodifiableList(this.comptype_);
                    this.bitField0_ &= -33;
                }
                videoPlacement.comptype_ = this.comptype_;
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    videoPlacement.ext_ = this.ext_;
                } else {
                    videoPlacement.ext_ = (Struct) xaVar.build();
                }
                pa paVar2 = this.extProtoBuilder_;
                if (paVar2 != null) {
                    videoPlacement.extProto_ = paVar2.build();
                } else {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    videoPlacement.extProto_ = this.extProto_;
                }
                onBuilt();
                return videoPlacement;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public VideoPlacement getDefaultInstanceForType() {
                return VideoPlacement.getDefaultInstance();
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

            public Companion.Builder addCompBuilder(int i10) {
                return (Companion.Builder) getCompFieldBuilder().addBuilder(i10, Companion.getDefaultInstance());
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
                this.ptype_ = 0;
                this.pos_ = 0;
                this.delay_ = 0;
                this.skip_ = false;
                this.skipmin_ = 0;
                this.skipafter_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = f8.f22138e;
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.mindur_ = 0;
                this.maxdur_ = 0;
                this.maxext_ = 0;
                this.minbitr_ = 0;
                this.maxbitr_ = 0;
                this.delivery_ = list;
                this.bitField0_ = i10 & (-16);
                this.maxseq_ = 0;
                this.linear_ = 0;
                this.boxing_ = false;
                pa paVar = this.compBuilder_;
                if (paVar == null) {
                    this.comp_ = list;
                    this.bitField0_ = i10 & (-32);
                } else {
                    paVar.clear();
                }
                this.comptype_ = list;
                int i11 = this.bitField0_;
                this.bitField0_ = i11 & (-33);
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                pa paVar2 = this.extProtoBuilder_;
                if (paVar2 == null) {
                    this.extProto_ = list;
                    this.bitField0_ = i11 & (-97);
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

            public Builder addComp(int i10, Companion companion) {
                pa paVar = this.compBuilder_;
                if (paVar == null) {
                    companion.getClass();
                    ensureCompIsMutable();
                    this.comp_.add(i10, companion);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, companion);
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
                if (message instanceof VideoPlacement) {
                    return mergeFrom((VideoPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setComp(int i10, Companion.Builder builder) {
                pa paVar = this.compBuilder_;
                if (paVar == null) {
                    ensureCompIsMutable();
                    this.comp_.set(i10, builder.build());
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

            public Builder mergeFrom(VideoPlacement videoPlacement) {
                if (videoPlacement == VideoPlacement.getDefaultInstance()) {
                    return this;
                }
                if (videoPlacement.ptype_ != 0) {
                    setPtypeValue(videoPlacement.getPtypeValue());
                }
                if (videoPlacement.pos_ != 0) {
                    setPosValue(videoPlacement.getPosValue());
                }
                if (videoPlacement.getDelay() != 0) {
                    setDelay(videoPlacement.getDelay());
                }
                if (videoPlacement.getSkip()) {
                    setSkip(videoPlacement.getSkip());
                }
                if (videoPlacement.getSkipmin() != 0) {
                    setSkipmin(videoPlacement.getSkipmin());
                }
                if (videoPlacement.getSkipafter() != 0) {
                    setSkipafter(videoPlacement.getSkipafter());
                }
                if (videoPlacement.playmethod_ != 0) {
                    setPlaymethodValue(videoPlacement.getPlaymethodValue());
                }
                if (videoPlacement.playend_ != 0) {
                    setPlayendValue(videoPlacement.getPlayendValue());
                }
                if (videoPlacement.clktype_ != 0) {
                    setClktypeValue(videoPlacement.getClktypeValue());
                }
                if (!videoPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = videoPlacement.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(videoPlacement.mime_);
                    }
                    onChanged();
                }
                if (!videoPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = videoPlacement.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(videoPlacement.api_);
                    }
                    onChanged();
                }
                if (!videoPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = videoPlacement.ctype_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(videoPlacement.ctype_);
                    }
                    onChanged();
                }
                if (videoPlacement.getW() != 0) {
                    setW(videoPlacement.getW());
                }
                if (videoPlacement.getH() != 0) {
                    setH(videoPlacement.getH());
                }
                if (videoPlacement.unit_ != 0) {
                    setUnitValue(videoPlacement.getUnitValue());
                }
                if (videoPlacement.getMindur() != 0) {
                    setMindur(videoPlacement.getMindur());
                }
                if (videoPlacement.getMaxdur() != 0) {
                    setMaxdur(videoPlacement.getMaxdur());
                }
                if (videoPlacement.getMaxext() != 0) {
                    setMaxext(videoPlacement.getMaxext());
                }
                if (videoPlacement.getMinbitr() != 0) {
                    setMinbitr(videoPlacement.getMinbitr());
                }
                if (videoPlacement.getMaxbitr() != 0) {
                    setMaxbitr(videoPlacement.getMaxbitr());
                }
                if (!videoPlacement.delivery_.isEmpty()) {
                    if (this.delivery_.isEmpty()) {
                        this.delivery_ = videoPlacement.delivery_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureDeliveryIsMutable();
                        this.delivery_.addAll(videoPlacement.delivery_);
                    }
                    onChanged();
                }
                if (videoPlacement.getMaxseq() != 0) {
                    setMaxseq(videoPlacement.getMaxseq());
                }
                if (videoPlacement.linear_ != 0) {
                    setLinearValue(videoPlacement.getLinearValue());
                }
                if (videoPlacement.getBoxing()) {
                    setBoxing(videoPlacement.getBoxing());
                }
                if (this.compBuilder_ == null) {
                    if (!videoPlacement.comp_.isEmpty()) {
                        if (this.comp_.isEmpty()) {
                            this.comp_ = videoPlacement.comp_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureCompIsMutable();
                            this.comp_.addAll(videoPlacement.comp_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.comp_.isEmpty()) {
                    if (!this.compBuilder_.isEmpty()) {
                        this.compBuilder_.addAllMessages(videoPlacement.comp_);
                    } else {
                        this.compBuilder_.dispose();
                        this.compBuilder_ = null;
                        this.comp_ = videoPlacement.comp_;
                        this.bitField0_ &= -17;
                        this.compBuilder_ = k7.alwaysUseFieldBuilders ? getCompFieldBuilder() : null;
                    }
                }
                if (!videoPlacement.comptype_.isEmpty()) {
                    if (this.comptype_.isEmpty()) {
                        this.comptype_ = videoPlacement.comptype_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureComptypeIsMutable();
                        this.comptype_.addAll(videoPlacement.comptype_);
                    }
                    onChanged();
                }
                if (videoPlacement.hasExt()) {
                    mergeExt(videoPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!videoPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = videoPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(videoPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(videoPlacement.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = videoPlacement.extProto_;
                        this.bitField0_ &= -65;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) videoPlacement).unknownFields);
                onChanged();
                return this;
            }

            public Builder addComp(Companion.Builder builder) {
                pa paVar = this.compBuilder_;
                if (paVar == null) {
                    ensureCompIsMutable();
                    this.comp_.add(builder.build());
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

            public Builder addComp(int i10, Companion.Builder builder) {
                pa paVar = this.compBuilder_;
                if (paVar == null) {
                    ensureCompIsMutable();
                    this.comp_.add(i10, builder.build());
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

            private Builder(p6 p6Var) {
                super(p6Var);
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = f8.f22138e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.ctype_ = list;
                this.unit_ = 0;
                this.delivery_ = list;
                this.linear_ = 0;
                this.comp_ = list;
                this.comptype_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.explorestack.protobuf.adcom.Placement.VideoPlacement.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.VideoPlacement.access$19000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Placement$VideoPlacement r3 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Placement$VideoPlacement r4 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$VideoPlacement$Builder");
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion extends k7 implements CompanionOrBuilder {
            public static final int DISPLAY_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int VCM_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private DisplayPlacement display_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private int vcm_;
            private static final Companion DEFAULT_INSTANCE = new Companion();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Companion parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Companion(yVar, m5Var);
                }
            };

            public static Companion getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.Y;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Companion parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Companion) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Companion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Companion)) {
                    return super.equals(obj);
                }
                Companion companion = (Companion) obj;
                if (!getId().equals(companion.getId()) || getVcm() != companion.getVcm() || hasDisplay() != companion.hasDisplay()) {
                    return false;
                }
                if ((!hasDisplay() || getDisplay().equals(companion.getDisplay())) && hasExt() == companion.hasExt()) {
                    return (!hasExt() || getExt().equals(companion.getExt())) && getExtProtoList().equals(companion.getExtProtoList()) && this.unknownFields.equals(companion.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public DisplayPlacement getDisplay() {
                DisplayPlacement displayPlacement = this.display_;
                return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                return getDisplay();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
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
                int i11 = this.vcm_;
                if (i11 != 0) {
                    iComputeStringSize += h0.computeUInt32Size(2, i11);
                }
                if (this.display_ != null) {
                    iComputeStringSize += h0.computeMessageSize(3, getDisplay());
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

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public int getVcm() {
                return this.vcm_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public boolean hasDisplay() {
                return this.display_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int vcm = getVcm() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                if (hasDisplay()) {
                    vcm = o2.B(vcm, 37, 3, 53) + getDisplay().hashCode();
                }
                if (hasExt()) {
                    vcm = o2.B(vcm, 37, 5, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    vcm = o2.B(vcm, 37, 4, 53) + getExtProtoList().hashCode();
                }
                int iHashCode = this.unknownFields.hashCode() + (vcm * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return b.Z.ensureFieldAccessorsInitialized(Companion.class, Builder.class);
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
                return new Companion();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.id_);
                }
                int i10 = this.vcm_;
                if (i10 != 0) {
                    h0Var.writeUInt32(2, i10);
                }
                if (this.display_ != null) {
                    h0Var.writeMessage(3, getDisplay());
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
            public static final class Builder extends o6 implements CompanionOrBuilder {
                private int bitField0_;
                private xa displayBuilder_;
                private DisplayPlacement display_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private int vcm_;

                private Builder() {
                    super(null);
                    this.id_ = "";
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
                    return b.Y;
                }

                private xa getDisplayFieldBuilder() {
                    if (this.displayBuilder_ == null) {
                        this.displayBuilder_ = new xa(getDisplay(), getParentForChildren(), isClean());
                        this.display_ = null;
                    }
                    return this.displayBuilder_;
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

                public Builder clearDisplay() {
                    if (this.displayBuilder_ == null) {
                        this.display_ = null;
                        onChanged();
                        return this;
                    }
                    this.display_ = null;
                    this.displayBuilder_ = null;
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

                public Builder clearId() {
                    this.id_ = Companion.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearVcm() {
                    this.vcm_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.Y;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public DisplayPlacement getDisplay() {
                    xa xaVar = this.displayBuilder_;
                    if (xaVar != null) {
                        return (DisplayPlacement) xaVar.getMessage();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                public DisplayPlacement.Builder getDisplayBuilder() {
                    onChanged();
                    return (DisplayPlacement.Builder) getDisplayFieldBuilder().getBuilder();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                    xa xaVar = this.displayBuilder_;
                    if (xaVar != null) {
                        return (DisplayPlacementOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public int getVcm() {
                    return this.vcm_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public boolean hasDisplay() {
                    return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.Z.ensureFieldAccessorsInitialized(Companion.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeDisplay(DisplayPlacement displayPlacement) {
                    xa xaVar = this.displayBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(displayPlacement);
                        return this;
                    }
                    DisplayPlacement displayPlacement2 = this.display_;
                    if (displayPlacement2 != null) {
                        this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
                    } else {
                        this.display_ = displayPlacement;
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

                public Builder setDisplay(DisplayPlacement displayPlacement) {
                    xa xaVar = this.displayBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(displayPlacement);
                        return this;
                    }
                    displayPlacement.getClass();
                    this.display_ = displayPlacement;
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

                public Builder setVcm(int i10) {
                    this.vcm_ = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Companion build() {
                    Companion companionBuildPartial = buildPartial();
                    if (companionBuildPartial.isInitialized()) {
                        return companionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) companionBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Companion buildPartial() {
                    Companion companion = new Companion(this);
                    companion.id_ = this.id_;
                    companion.vcm_ = this.vcm_;
                    xa xaVar = this.displayBuilder_;
                    if (xaVar == null) {
                        companion.display_ = this.display_;
                    } else {
                        companion.display_ = (DisplayPlacement) xaVar.build();
                    }
                    xa xaVar2 = this.extBuilder_;
                    if (xaVar2 == null) {
                        companion.ext_ = this.ext_;
                    } else {
                        companion.ext_ = (Struct) xaVar2.build();
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        companion.extProto_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        companion.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return companion;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Companion getDefaultInstanceForType() {
                    return Companion.getDefaultInstance();
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
                    this.vcm_ = 0;
                    if (this.displayBuilder_ == null) {
                        this.display_ = null;
                    } else {
                        this.display_ = null;
                        this.displayBuilder_ = null;
                    }
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

                public Builder setDisplay(DisplayPlacement.Builder builder) {
                    xa xaVar = this.displayBuilder_;
                    if (xaVar == null) {
                        this.display_ = builder.build();
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

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.id_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
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
                    if (message instanceof Companion) {
                        return mergeFrom((Companion) message);
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

                public Builder mergeFrom(Companion companion) {
                    if (companion == Companion.getDefaultInstance()) {
                        return this;
                    }
                    if (!companion.getId().isEmpty()) {
                        this.id_ = companion.id_;
                        onChanged();
                    }
                    if (companion.getVcm() != 0) {
                        setVcm(companion.getVcm());
                    }
                    if (companion.hasDisplay()) {
                        mergeDisplay(companion.getDisplay());
                    }
                    if (companion.hasExt()) {
                        mergeExt(companion.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!companion.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = companion.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(companion.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!companion.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(companion.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = companion.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) companion).unknownFields);
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
                public com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.access$15200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Placement$VideoPlacement$Companion r3 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Placement$VideoPlacement$Companion r4 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Placement$VideoPlacement$Companion$Builder");
                }
            }

            public static Builder newBuilder(Companion companion) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(companion);
            }

            public static Companion parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Companion(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Companion parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Companion) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Companion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Companion getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Companion parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Companion() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Companion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Companion parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Companion) PARSER.parseFrom(bArr, m5Var);
            }

            public static Companion parseFrom(InputStream inputStream) throws IOException {
                return (Companion) k7.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Companion(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                Object[] objArr = false;
                while (!z10) {
                    try {
                        try {
                            int tag = yVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.id_ = yVar.readStringRequireUtf8();
                                } else if (tag != 16) {
                                    if (tag == 26) {
                                        DisplayPlacement displayPlacement = this.display_;
                                        DisplayPlacement.Builder builder = displayPlacement != null ? displayPlacement.toBuilder() : null;
                                        DisplayPlacement displayPlacement2 = (DisplayPlacement) yVar.readMessage(DisplayPlacement.parser(), m5Var);
                                        this.display_ = displayPlacement2;
                                        if (builder != null) {
                                            builder.mergeFrom(displayPlacement2);
                                            this.display_ = builder.buildPartial();
                                        }
                                    } else if (tag == 34) {
                                        if (objArr == false) {
                                            this.extProto_ = new ArrayList();
                                            objArr = true;
                                        }
                                        this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                    } else if (tag != 42) {
                                        if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                        }
                                    } else {
                                        Struct struct = this.ext_;
                                        Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                        this.ext_ = struct2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(struct2);
                                            this.ext_ = builder2.buildPartial();
                                        }
                                    }
                                } else {
                                    this.vcm_ = yVar.readUInt32();
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if (objArr != false) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = ccVarNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if (objArr != false) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Companion parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Companion) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Companion parseFrom(y yVar) throws IOException {
                return (Companion) k7.parseWithIOException(PARSER, yVar);
            }

            public static Companion parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Companion) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface CompanionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            DisplayPlacement getDisplay();

            DisplayPlacementOrBuilder getDisplayOrBuilder();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

            List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            int getVcm();

            boolean hasDisplay();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static VideoPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.W;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VideoPlacement)) {
                return super.equals(obj);
            }
            VideoPlacement videoPlacement = (VideoPlacement) obj;
            if (this.ptype_ == videoPlacement.ptype_ && this.pos_ == videoPlacement.pos_ && getDelay() == videoPlacement.getDelay() && getSkip() == videoPlacement.getSkip() && getSkipmin() == videoPlacement.getSkipmin() && getSkipafter() == videoPlacement.getSkipafter() && this.playmethod_ == videoPlacement.playmethod_ && this.playend_ == videoPlacement.playend_ && this.clktype_ == videoPlacement.clktype_ && getMimeList().equals(videoPlacement.getMimeList()) && this.api_.equals(videoPlacement.api_) && this.ctype_.equals(videoPlacement.ctype_) && getW() == videoPlacement.getW() && getH() == videoPlacement.getH() && this.unit_ == videoPlacement.unit_ && getMindur() == videoPlacement.getMindur() && getMaxdur() == videoPlacement.getMaxdur() && getMaxext() == videoPlacement.getMaxext() && getMinbitr() == videoPlacement.getMinbitr() && getMaxbitr() == videoPlacement.getMaxbitr() && this.delivery_.equals(videoPlacement.delivery_) && getMaxseq() == videoPlacement.getMaxseq() && this.linear_ == videoPlacement.linear_ && getBoxing() == videoPlacement.getBoxing() && getCompList().equals(videoPlacement.getCompList()) && this.comptype_.equals(videoPlacement.comptype_) && hasExt() == videoPlacement.hasExt()) {
                return (!hasExt() || getExt().equals(videoPlacement.getExt())) && getExtProtoList().equals(videoPlacement.getExtProtoList()) && this.unknownFields.equals(videoPlacement.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<ApiFramework> getApiList() {
            return new u7(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean getBoxing() {
            return this.boxing_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ClickType getClktype() {
            ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
            return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getClktypeValue() {
            return this.clktype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Companion getComp(int i10) {
            return this.comp_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCompCount() {
            return this.comp_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Companion> getCompList() {
            return this.comp_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public CompanionOrBuilder getCompOrBuilder(int i10) {
            return this.comp_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
            return this.comp_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public CompanionType getComptype(int i10) {
            return (CompanionType) comptype_converter_.convert(this.comptype_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getComptypeCount() {
            return this.comptype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<CompanionType> getComptypeList() {
            return new u7(this.comptype_, comptype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getComptypeValue(int i10) {
            return this.comptype_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getComptypeValueList() {
            return this.comptype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public VideoCreativeType getCtype(int i10) {
            return (VideoCreativeType) ctype_converter_.convert(this.ctype_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCtypeCount() {
            return this.ctype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<VideoCreativeType> getCtypeList() {
            return new u7(this.ctype_, ctype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCtypeValue(int i10) {
            return this.ctype_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDelay() {
            return this.delay_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public DeliveryMethod getDelivery(int i10) {
            return (DeliveryMethod) delivery_converter_.convert(this.delivery_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDeliveryCount() {
            return this.delivery_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<DeliveryMethod> getDeliveryList() {
            return new u7(this.delivery_, delivery_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDeliveryValue(int i10) {
            return this.delivery_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getDeliveryValueList() {
            return this.delivery_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public LinearityMode getLinear() {
            LinearityMode linearityModeValueOf = LinearityMode.valueOf(this.linear_);
            return linearityModeValueOf == null ? LinearityMode.UNRECOGNIZED : linearityModeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getLinearValue() {
            return this.linear_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxbitr() {
            return this.maxbitr_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxdur() {
            return this.maxdur_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxext() {
            return this.maxext_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxseq() {
            return this.maxseq_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public String getMime(int i10) {
            return (String) this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMinbitr() {
            return this.minbitr_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMindur() {
            return this.mindur_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlaybackCessationMode getPlayend() {
            PlaybackCessationMode playbackCessationModeValueOf = PlaybackCessationMode.valueOf(this.playend_);
            return playbackCessationModeValueOf == null ? PlaybackCessationMode.UNRECOGNIZED : playbackCessationModeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPlayendValue() {
            return this.playend_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlaybackMethod getPlaymethod() {
            PlaybackMethod playbackMethodValueOf = PlaybackMethod.valueOf(this.playmethod_);
            return playbackMethodValueOf == null ? PlaybackMethod.UNRECOGNIZED : playbackMethodValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPlaymethodValue() {
            return this.playmethod_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlacementPosition getPos() {
            PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
            return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPosValue() {
            return this.pos_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public VideoPlacementType getPtype() {
            VideoPlacementType videoPlacementTypeValueOf = VideoPlacementType.valueOf(this.ptype_);
            return videoPlacementTypeValueOf == null ? VideoPlacementType.UNRECOGNIZED : videoPlacementTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPtypeValue() {
            return this.ptype_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber() ? h0.computeEnumSize(1, this.ptype_) : 0;
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                iComputeEnumSize += h0.computeEnumSize(2, this.pos_);
            }
            int i11 = this.delay_;
            if (i11 != 0) {
                iComputeEnumSize += h0.computeInt32Size(3, i11);
            }
            boolean z10 = this.skip_;
            if (z10) {
                iComputeEnumSize += h0.computeBoolSize(4, z10);
            }
            int i12 = this.skipmin_;
            if (i12 != 0) {
                iComputeEnumSize += h0.computeUInt32Size(5, i12);
            }
            int i13 = this.skipafter_;
            if (i13 != 0) {
                iComputeEnumSize += h0.computeUInt32Size(6, i13);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                iComputeEnumSize += h0.computeEnumSize(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                iComputeEnumSize += h0.computeEnumSize(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                iComputeEnumSize += h0.computeEnumSize(9, this.clktype_);
            }
            int iE = 0;
            for (int i14 = 0; i14 < this.mime_.size(); i14++) {
                iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.mime_, i14, iE);
            }
            int size = getMimeList().size() + iComputeEnumSize + iE;
            int iComputeEnumSizeNoTag = 0;
            for (int i15 = 0; i15 < this.api_.size(); i15++) {
                iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(this.api_.get(i15).intValue());
            }
            int iComputeUInt32SizeNoTag = size + iComputeEnumSizeNoTag;
            if (!getApiList().isEmpty()) {
                iComputeUInt32SizeNoTag = iComputeUInt32SizeNoTag + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
            }
            this.apiMemoizedSerializedSize = iComputeEnumSizeNoTag;
            int iComputeEnumSizeNoTag2 = 0;
            for (int i16 = 0; i16 < this.ctype_.size(); i16++) {
                iComputeEnumSizeNoTag2 += h0.computeEnumSizeNoTag(this.ctype_.get(i16).intValue());
            }
            int iComputeUInt32Size = iComputeUInt32SizeNoTag + iComputeEnumSizeNoTag2;
            if (!getCtypeList().isEmpty()) {
                iComputeUInt32Size = iComputeUInt32Size + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag2);
            }
            this.ctypeMemoizedSerializedSize = iComputeEnumSizeNoTag2;
            int i17 = this.w_;
            if (i17 != 0) {
                iComputeUInt32Size += h0.computeUInt32Size(13, i17);
            }
            int i18 = this.h_;
            if (i18 != 0) {
                iComputeUInt32Size += h0.computeUInt32Size(14, i18);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                iComputeUInt32Size += h0.computeEnumSize(15, this.unit_);
            }
            int i19 = this.mindur_;
            if (i19 != 0) {
                iComputeUInt32Size += h0.computeUInt32Size(16, i19);
            }
            int i20 = this.maxdur_;
            if (i20 != 0) {
                iComputeUInt32Size += h0.computeUInt32Size(17, i20);
            }
            int i21 = this.maxext_;
            if (i21 != 0) {
                iComputeUInt32Size += h0.computeInt32Size(18, i21);
            }
            int i22 = this.minbitr_;
            if (i22 != 0) {
                iComputeUInt32Size += h0.computeUInt32Size(19, i22);
            }
            int i23 = this.maxbitr_;
            if (i23 != 0) {
                iComputeUInt32Size += h0.computeUInt32Size(20, i23);
            }
            int iComputeEnumSizeNoTag3 = 0;
            for (int i24 = 0; i24 < this.delivery_.size(); i24++) {
                iComputeEnumSizeNoTag3 += h0.computeEnumSizeNoTag(this.delivery_.get(i24).intValue());
            }
            int iComputeMessageSize = iComputeUInt32Size + iComputeEnumSizeNoTag3;
            if (!getDeliveryList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 2 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag3);
            }
            this.deliveryMemoizedSerializedSize = iComputeEnumSizeNoTag3;
            int i25 = this.maxseq_;
            if (i25 != 0) {
                iComputeMessageSize += h0.computeUInt32Size(22, i25);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                iComputeMessageSize += h0.computeEnumSize(23, this.linear_);
            }
            boolean z11 = this.boxing_;
            if (z11) {
                iComputeMessageSize += h0.computeBoolSize(24, z11);
            }
            for (int i26 = 0; i26 < this.comp_.size(); i26++) {
                iComputeMessageSize += h0.computeMessageSize(25, this.comp_.get(i26));
            }
            int iComputeEnumSizeNoTag4 = 0;
            for (int i27 = 0; i27 < this.comptype_.size(); i27++) {
                iComputeEnumSizeNoTag4 += h0.computeEnumSizeNoTag(this.comptype_.get(i27).intValue());
            }
            int iComputeMessageSize2 = iComputeMessageSize + iComputeEnumSizeNoTag4;
            if (!getComptypeList().isEmpty()) {
                iComputeMessageSize2 = iComputeMessageSize2 + 2 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag4);
            }
            this.comptypeMemoizedSerializedSize = iComputeEnumSizeNoTag4;
            for (int i28 = 0; i28 < this.extProto_.size(); i28++) {
                iComputeMessageSize2 += h0.computeMessageSize(27, this.extProto_.get(i28));
            }
            if (this.ext_ != null) {
                iComputeMessageSize2 += h0.computeMessageSize(28, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean getSkip() {
            return this.skip_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getSkipafter() {
            return this.skipafter_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getSkipmin() {
            return this.skipmin_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public SizeUnit getUnit() {
            SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
            return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getUnitValue() {
            return this.unit_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iD = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getSkipafter() + ((((getSkipmin() + ((((x7.hashBoolean(getSkip()) + ((((getDelay() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.ptype_, 37, 2, 53), this.pos_, 37, 3, 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53, this.playmethod_, 37, 8, 53), this.playend_, 37, 9, 53) + this.clktype_;
            if (getMimeCount() > 0) {
                iD = o2.B(iD, 37, 10, 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iD = o2.B(iD, 37, 11, 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                iD = o2.B(iD, 37, 12, 53) + this.ctype_.hashCode();
            }
            int maxbitr = getMaxbitr() + ((((getMinbitr() + ((((getMaxext() + ((((getMaxdur() + ((((getMindur() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getH() + ((((getW() + o2.B(iD, 37, 13, 53)) * 37) + 14) * 53)) * 37) + 15) * 53, this.unit_, 37, 16, 53)) * 37) + 17) * 53)) * 37) + 18) * 53)) * 37) + 19) * 53)) * 37) + 20) * 53);
            if (getDeliveryCount() > 0) {
                maxbitr = this.delivery_.hashCode() + o2.B(maxbitr, 37, 21, 53);
            }
            int iHashBoolean = x7.hashBoolean(getBoxing()) + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getMaxseq() + o2.B(maxbitr, 37, 22, 53)) * 37) + 23) * 53, this.linear_, 37, 24, 53);
            if (getCompCount() > 0) {
                iHashBoolean = getCompList().hashCode() + o2.B(iHashBoolean, 37, 25, 53);
            }
            if (getComptypeCount() > 0) {
                iHashBoolean = this.comptype_.hashCode() + o2.B(iHashBoolean, 37, 26, 53);
            }
            if (hasExt()) {
                iHashBoolean = getExt().hashCode() + o2.B(iHashBoolean, 37, 28, 53);
            }
            if (getExtProtoCount() > 0) {
                iHashBoolean = getExtProtoList().hashCode() + o2.B(iHashBoolean, 37, 27, 53);
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashBoolean * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.X.ensureFieldAccessorsInitialized(VideoPlacement.class, Builder.class);
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
            return new VideoPlacement();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            getSerializedSize();
            if (this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber()) {
                h0Var.writeEnum(1, this.ptype_);
            }
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                h0Var.writeEnum(2, this.pos_);
            }
            int i10 = this.delay_;
            if (i10 != 0) {
                h0Var.writeInt32(3, i10);
            }
            boolean z10 = this.skip_;
            if (z10) {
                h0Var.writeBool(4, z10);
            }
            int i11 = this.skipmin_;
            if (i11 != 0) {
                h0Var.writeUInt32(5, i11);
            }
            int i12 = this.skipafter_;
            if (i12 != 0) {
                h0Var.writeUInt32(6, i12);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                h0Var.writeEnum(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                h0Var.writeEnum(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                h0Var.writeEnum(9, this.clktype_);
            }
            int iF = 0;
            while (iF < this.mime_.size()) {
                iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.mime_, iF, h0Var, 10, iF, 1);
            }
            if (getApiList().size() > 0) {
                h0Var.writeUInt32NoTag(90);
                h0Var.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i13 = 0; i13 < this.api_.size(); i13++) {
                h0Var.writeEnumNoTag(this.api_.get(i13).intValue());
            }
            if (getCtypeList().size() > 0) {
                h0Var.writeUInt32NoTag(98);
                h0Var.writeUInt32NoTag(this.ctypeMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.ctype_.size(); i14++) {
                h0Var.writeEnumNoTag(this.ctype_.get(i14).intValue());
            }
            int i15 = this.w_;
            if (i15 != 0) {
                h0Var.writeUInt32(13, i15);
            }
            int i16 = this.h_;
            if (i16 != 0) {
                h0Var.writeUInt32(14, i16);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                h0Var.writeEnum(15, this.unit_);
            }
            int i17 = this.mindur_;
            if (i17 != 0) {
                h0Var.writeUInt32(16, i17);
            }
            int i18 = this.maxdur_;
            if (i18 != 0) {
                h0Var.writeUInt32(17, i18);
            }
            int i19 = this.maxext_;
            if (i19 != 0) {
                h0Var.writeInt32(18, i19);
            }
            int i20 = this.minbitr_;
            if (i20 != 0) {
                h0Var.writeUInt32(19, i20);
            }
            int i21 = this.maxbitr_;
            if (i21 != 0) {
                h0Var.writeUInt32(20, i21);
            }
            if (getDeliveryList().size() > 0) {
                h0Var.writeUInt32NoTag(170);
                h0Var.writeUInt32NoTag(this.deliveryMemoizedSerializedSize);
            }
            for (int i22 = 0; i22 < this.delivery_.size(); i22++) {
                h0Var.writeEnumNoTag(this.delivery_.get(i22).intValue());
            }
            int i23 = this.maxseq_;
            if (i23 != 0) {
                h0Var.writeUInt32(22, i23);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                h0Var.writeEnum(23, this.linear_);
            }
            boolean z11 = this.boxing_;
            if (z11) {
                h0Var.writeBool(24, z11);
            }
            for (int i24 = 0; i24 < this.comp_.size(); i24++) {
                h0Var.writeMessage(25, this.comp_.get(i24));
            }
            if (getComptypeList().size() > 0) {
                h0Var.writeUInt32NoTag(210);
                h0Var.writeUInt32NoTag(this.comptypeMemoizedSerializedSize);
            }
            for (int i25 = 0; i25 < this.comptype_.size(); i25++) {
                h0Var.writeEnumNoTag(this.comptype_.get(i25).intValue());
            }
            for (int i26 = 0; i26 < this.extProto_.size(); i26++) {
                h0Var.writeMessage(27, this.extProto_.get(i26));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(28, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        public static Builder newBuilder(VideoPlacement videoPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoPlacement);
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteBuffer, m5Var);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ka getMimeList() {
            return this.mime_;
        }

        private VideoPlacement(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (VideoPlacement) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static VideoPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public VideoPlacement getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static VideoPlacement parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private VideoPlacement() {
            this.memoizedIsInitialized = (byte) -1;
            this.ptype_ = 0;
            this.pos_ = 0;
            this.playmethod_ = 0;
            this.playend_ = 0;
            this.clktype_ = 0;
            this.mime_ = f8.f22138e;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.ctype_ = list;
            this.unit_ = 0;
            this.delivery_ = list;
            this.linear_ = 0;
            this.comp_ = list;
            this.comptype_ = list;
            this.extProto_ = list;
        }

        public static VideoPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static VideoPlacement parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (VideoPlacement) PARSER.parseFrom(bArr, m5Var);
        }

        public static VideoPlacement parseFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) k7.parseWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (VideoPlacement) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static VideoPlacement parseFrom(y yVar) throws IOException {
            return (VideoPlacement) k7.parseWithIOException(PARSER, yVar);
        }

        public static VideoPlacement parseFrom(y yVar, m5 m5Var) throws IOException {
            return (VideoPlacement) k7.parseWithIOException(PARSER, yVar, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private VideoPlacement(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            this();
            m5Var.getClass();
            cc ccVarNewBuilder = gc.newBuilder();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = yVar.readTag();
                        switch (tag) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.ptype_ = yVar.readEnum();
                            case 16:
                                this.pos_ = yVar.readEnum();
                            case 24:
                                this.delay_ = yVar.readInt32();
                            case 32:
                                this.skip_ = yVar.readBool();
                            case 40:
                                this.skipmin_ = yVar.readUInt32();
                            case 48:
                                this.skipafter_ = yVar.readUInt32();
                            case 56:
                                this.playmethod_ = yVar.readEnum();
                            case 64:
                                this.playend_ = yVar.readEnum();
                            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                                this.clktype_ = yVar.readEnum();
                            case 82:
                                String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                if ((i10 & 1) == 0) {
                                    this.mime_ = new f8();
                                    i10 |= 1;
                                }
                                this.mime_.add((g8) stringRequireUtf8);
                            case 88:
                                int i11 = yVar.readEnum();
                                if ((i10 & 2) == 0) {
                                    this.api_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.api_.add(Integer.valueOf(i11));
                            case 90:
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i12 = yVar.readEnum();
                                    if ((i10 & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.api_.add(Integer.valueOf(i12));
                                }
                                yVar.popLimit(iPushLimit);
                            case 96:
                                int i13 = yVar.readEnum();
                                if ((i10 & 4) == 0) {
                                    this.ctype_ = new ArrayList();
                                    i10 |= 4;
                                }
                                this.ctype_.add(Integer.valueOf(i13));
                            case 98:
                                int iPushLimit2 = yVar.pushLimit(yVar.readRawVarint32());
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i14 = yVar.readEnum();
                                    if ((i10 & 4) == 0) {
                                        this.ctype_ = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.ctype_.add(Integer.valueOf(i14));
                                }
                                yVar.popLimit(iPushLimit2);
                            case 104:
                                this.w_ = yVar.readUInt32();
                            case 112:
                                this.h_ = yVar.readUInt32();
                            case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                                this.unit_ = yVar.readEnum();
                            case 128:
                                this.mindur_ = yVar.readUInt32();
                            case PRIVACY_URL_ERROR_VALUE:
                                this.maxdur_ = yVar.readUInt32();
                            case 144:
                                this.maxext_ = yVar.readInt32();
                            case 152:
                                this.minbitr_ = yVar.readUInt32();
                            case 160:
                                this.maxbitr_ = yVar.readUInt32();
                            case 168:
                                int i15 = yVar.readEnum();
                                if ((i10 & 8) == 0) {
                                    this.delivery_ = new ArrayList();
                                    i10 |= 8;
                                }
                                this.delivery_.add(Integer.valueOf(i15));
                            case 170:
                                int iPushLimit3 = yVar.pushLimit(yVar.readRawVarint32());
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i16 = yVar.readEnum();
                                    if ((i10 & 8) == 0) {
                                        this.delivery_ = new ArrayList();
                                        i10 |= 8;
                                    }
                                    this.delivery_.add(Integer.valueOf(i16));
                                }
                                yVar.popLimit(iPushLimit3);
                            case 176:
                                this.maxseq_ = yVar.readUInt32();
                            case 184:
                                this.linear_ = yVar.readEnum();
                            case PsExtractor.AUDIO_STREAM /* 192 */:
                                this.boxing_ = yVar.readBool();
                            case 202:
                                if ((i10 & 16) == 0) {
                                    this.comp_ = new ArrayList();
                                    i10 |= 16;
                                }
                                this.comp_.add(yVar.readMessage(Companion.parser(), m5Var));
                            case 208:
                                int i17 = yVar.readEnum();
                                if ((i10 & 32) == 0) {
                                    this.comptype_ = new ArrayList();
                                    i10 |= 32;
                                }
                                this.comptype_.add(Integer.valueOf(i17));
                            case 210:
                                int iPushLimit4 = yVar.pushLimit(yVar.readRawVarint32());
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i18 = yVar.readEnum();
                                    if ((i10 & 32) == 0) {
                                        this.comptype_ = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.comptype_.add(Integer.valueOf(i18));
                                }
                                yVar.popLimit(iPushLimit4);
                            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                if ((i10 & 64) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 64;
                                }
                                this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                Struct struct = this.ext_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
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
                    if ((i10 & 1) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if ((i10 & 4) != 0) {
                        this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    }
                    if ((i10 & 8) != 0) {
                        this.delivery_ = Collections.unmodifiableList(this.delivery_);
                    }
                    if ((i10 & 16) != 0) {
                        this.comp_ = Collections.unmodifiableList(this.comp_);
                    }
                    if ((i10 & 32) != 0) {
                        this.comptype_ = Collections.unmodifiableList(this.comptype_);
                    }
                    if ((i10 & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if ((i10 & 2) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if ((i10 & 4) != 0) {
                this.ctype_ = Collections.unmodifiableList(this.ctype_);
            }
            if ((i10 & 8) != 0) {
                this.delivery_ = Collections.unmodifiableList(this.delivery_);
            }
            if ((i10 & 16) != 0) {
                this.comp_ = Collections.unmodifiableList(this.comp_);
            }
            if ((i10 & 32) != 0) {
                this.comptype_ = Collections.unmodifiableList(this.comptype_);
            }
            if ((i10 & 64) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface VideoPlacementOrBuilder extends MessageOrBuilder {
        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        boolean getBoxing();

        ClickType getClktype();

        int getClktypeValue();

        VideoPlacement.Companion getComp(int i10);

        int getCompCount();

        List<VideoPlacement.Companion> getCompList();

        VideoPlacement.CompanionOrBuilder getCompOrBuilder(int i10);

        List<? extends VideoPlacement.CompanionOrBuilder> getCompOrBuilderList();

        CompanionType getComptype(int i10);

        int getComptypeCount();

        List<CompanionType> getComptypeList();

        int getComptypeValue(int i10);

        List<Integer> getComptypeValueList();

        VideoCreativeType getCtype(int i10);

        int getCtypeCount();

        List<VideoCreativeType> getCtypeList();

        int getCtypeValue(int i10);

        List<Integer> getCtypeValueList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getDelay();

        DeliveryMethod getDelivery(int i10);

        int getDeliveryCount();

        List<DeliveryMethod> getDeliveryList();

        int getDeliveryValue(int i10);

        List<Integer> getDeliveryValueList();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        int getH();

        LinearityMode getLinear();

        int getLinearValue();

        int getMaxbitr();

        int getMaxdur();

        int getMaxext();

        int getMaxseq();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        int getMinbitr();

        int getMindur();

        PlaybackCessationMode getPlayend();

        int getPlayendValue();

        PlaybackMethod getPlaymethod();

        int getPlaymethodValue();

        PlacementPosition getPos();

        int getPosValue();

        VideoPlacementType getPtype();

        int getPtypeValue();

        boolean getSkip();

        int getSkipafter();

        int getSkipmin();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Placement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.E;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Placement) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return super.equals(obj);
        }
        Placement placement = (Placement) obj;
        if (!getTagid().equals(placement.getTagid()) || getSsai() != placement.getSsai() || !getSdk().equals(placement.getSdk()) || !getSdkver().equals(placement.getSdkver()) || getReward() != placement.getReward() || !getBcatList().equals(placement.getBcatList()) || this.cattax_ != placement.cattax_ || !getBadvList().equals(placement.getBadvList()) || !getBappList().equals(placement.getBappList()) || !this.battr_.equals(placement.battr_) || !getWlangList().equals(placement.getWlangList()) || getSecure() != placement.getSecure() || getAdmx() != placement.getAdmx() || getCurlx() != placement.getCurlx() || hasDisplay() != placement.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(placement.getDisplay())) || hasVideo() != placement.hasVideo()) {
            return false;
        }
        if ((!hasVideo() || getVideo().equals(placement.getVideo())) && hasExt() == placement.hasExt()) {
            return (!hasExt() || getExt().equals(placement.getExt())) && getExtProtoList().equals(placement.getExtProtoList()) && this.unknownFields.equals(placement.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public boolean getAdmx() {
        return this.admx_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public String getBadv(int i10) {
        return (String) this.badv_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ByteString getBadvBytes(int i10) {
        return this.badv_.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public int getBadvCount() {
        return this.badv_.size();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public String getBapp(int i10) {
        return (String) this.bapp_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ByteString getBappBytes(int i10) {
        return this.bapp_.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public int getBappCount() {
        return this.bapp_.size();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public CreativeAttribute getBattr(int i10) {
        return (CreativeAttribute) battr_converter_.convert(this.battr_.get(i10));
    }

    @Override // com.explorestack.protobuf.adcom.s
    public int getBattrCount() {
        return this.battr_.size();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public List<CreativeAttribute> getBattrList() {
        return new u7(this.battr_, battr_converter_);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public int getBattrValue(int i10) {
        return this.battr_.get(i10).intValue();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public List<Integer> getBattrValueList() {
        return this.battr_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public String getBcat(int i10) {
        return (String) this.bcat_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ByteString getBcatBytes(int i10) {
        return this.bcat_.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public int getBcatCount() {
        return this.bcat_.size();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public int getCattaxValue() {
        return this.cattax_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public boolean getCurlx() {
        return this.curlx_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public DisplayPlacement getDisplay() {
        DisplayPlacement displayPlacement = this.display_;
        return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public DisplayPlacementOrBuilder getDisplayOrBuilder() {
        return getDisplay();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public jb getExtOrBuilder() {
        return getExt();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public Any getExtProto(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public boolean getReward() {
        return this.reward_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public boolean getSecure() {
        return this.secure_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getTagidBytes().isEmpty() ? k7.computeStringSize(1, this.tagid_) : 0;
        int i11 = this.ssai_;
        if (i11 != 0) {
            iComputeStringSize += h0.computeUInt32Size(2, i11);
        }
        if (!getSdkBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(4, this.sdkver_);
        }
        boolean z10 = this.reward_;
        if (z10) {
            iComputeStringSize += h0.computeBoolSize(5, z10);
        }
        int iE = 0;
        for (int i12 = 0; i12 < this.bcat_.size(); i12++) {
            iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.bcat_, i12, iE);
        }
        int size = getBcatList().size() + iComputeStringSize + iE;
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size += h0.computeEnumSize(7, this.cattax_);
        }
        int iE2 = 0;
        for (int i13 = 0; i13 < this.badv_.size(); i13++) {
            iE2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.badv_, i13, iE2);
        }
        int size2 = getBadvList().size() + size + iE2;
        int iE3 = 0;
        for (int i14 = 0; i14 < this.bapp_.size(); i14++) {
            iE3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.bapp_, i14, iE3);
        }
        int size3 = getBappList().size() + size2 + iE3;
        int iComputeEnumSizeNoTag = 0;
        for (int i15 = 0; i15 < this.battr_.size(); i15++) {
            iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(this.battr_.get(i15).intValue());
        }
        int iComputeUInt32SizeNoTag = size3 + iComputeEnumSizeNoTag;
        if (!getBattrList().isEmpty()) {
            iComputeUInt32SizeNoTag = iComputeUInt32SizeNoTag + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
        }
        this.battrMemoizedSerializedSize = iComputeEnumSizeNoTag;
        int iE4 = 0;
        for (int i16 = 0; i16 < this.wlang_.size(); i16++) {
            iE4 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.wlang_, i16, iE4);
        }
        int size4 = getWlangList().size() + iComputeUInt32SizeNoTag + iE4;
        boolean z11 = this.secure_;
        if (z11) {
            size4 += h0.computeBoolSize(13, z11);
        }
        boolean z12 = this.admx_;
        if (z12) {
            size4 += h0.computeBoolSize(14, z12);
        }
        boolean z13 = this.curlx_;
        if (z13) {
            size4 += h0.computeBoolSize(15, z13);
        }
        if (this.display_ != null) {
            size4 += h0.computeMessageSize(16, getDisplay());
        }
        if (this.video_ != null) {
            size4 += h0.computeMessageSize(17, getVideo());
        }
        for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
            size4 += h0.computeMessageSize(19, this.extProto_.get(i17));
        }
        if (this.ext_ != null) {
            size4 += h0.computeMessageSize(20, getExt());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size4;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public int getSsai() {
        return this.ssai_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public String getTagid() {
        Object obj = this.tagid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.tagid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ByteString getTagidBytes() {
        Object obj = this.tagid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.tagid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public VideoPlacement getVideo() {
        VideoPlacement videoPlacement = this.video_;
        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public VideoPlacementOrBuilder getVideoOrBuilder() {
        return getVideo();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public String getWlang(int i10) {
        return (String) this.wlang_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ByteString getWlangBytes(int i10) {
        return this.wlang_.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public int getWlangCount() {
        return this.wlang_.size();
    }

    @Override // com.explorestack.protobuf.adcom.s
    public boolean hasDisplay() {
        return this.display_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public boolean hasVideo() {
        return this.video_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashBoolean = x7.hashBoolean(getReward()) + ((((getSdkver().hashCode() + ((((getSdk().hashCode() + ((((getSsai() + ((((getTagid().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
        if (getBcatCount() > 0) {
            iHashBoolean = getBcatList().hashCode() + o2.B(iHashBoolean, 37, 6, 53);
        }
        int iB = o2.B(iHashBoolean, 37, 7, 53) + this.cattax_;
        if (getBadvCount() > 0) {
            iB = o2.B(iB, 37, 9, 53) + getBadvList().hashCode();
        }
        if (getBappCount() > 0) {
            iB = o2.B(iB, 37, 10, 53) + getBappList().hashCode();
        }
        if (getBattrCount() > 0) {
            iB = o2.B(iB, 37, 11, 53) + this.battr_.hashCode();
        }
        if (getWlangCount() > 0) {
            iB = o2.B(iB, 37, 12, 53) + getWlangList().hashCode();
        }
        int iHashBoolean2 = x7.hashBoolean(getCurlx()) + ((((x7.hashBoolean(getAdmx()) + ((((x7.hashBoolean(getSecure()) + o2.B(iB, 37, 13, 53)) * 37) + 14) * 53)) * 37) + 15) * 53);
        if (hasDisplay()) {
            iHashBoolean2 = getDisplay().hashCode() + o2.B(iHashBoolean2, 37, 16, 53);
        }
        if (hasVideo()) {
            iHashBoolean2 = getVideo().hashCode() + o2.B(iHashBoolean2, 37, 17, 53);
        }
        if (hasExt()) {
            iHashBoolean2 = getExt().hashCode() + o2.B(iHashBoolean2, 37, 20, 53);
        }
        if (getExtProtoCount() > 0) {
            iHashBoolean2 = getExtProtoList().hashCode() + o2.B(iHashBoolean2, 37, 19, 53);
        }
        int iHashCode = this.unknownFields.hashCode() + (iHashBoolean2 * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return b.F.ensureFieldAccessorsInitialized(Placement.class, Builder.class);
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
        return new Placement();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        getSerializedSize();
        if (!getTagidBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.tagid_);
        }
        int i10 = this.ssai_;
        if (i10 != 0) {
            h0Var.writeUInt32(2, i10);
        }
        if (!getSdkBytes().isEmpty()) {
            k7.writeString(h0Var, 3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            k7.writeString(h0Var, 4, this.sdkver_);
        }
        boolean z10 = this.reward_;
        if (z10) {
            h0Var.writeBool(5, z10);
        }
        int iF = 0;
        while (iF < this.bcat_.size()) {
            iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.bcat_, iF, h0Var, 6, iF, 1);
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            h0Var.writeEnum(7, this.cattax_);
        }
        int iF2 = 0;
        while (iF2 < this.badv_.size()) {
            iF2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.badv_, iF2, h0Var, 9, iF2, 1);
        }
        int iF3 = 0;
        while (iF3 < this.bapp_.size()) {
            iF3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.bapp_, iF3, h0Var, 10, iF3, 1);
        }
        if (getBattrList().size() > 0) {
            h0Var.writeUInt32NoTag(90);
            h0Var.writeUInt32NoTag(this.battrMemoizedSerializedSize);
        }
        for (int i11 = 0; i11 < this.battr_.size(); i11++) {
            h0Var.writeEnumNoTag(this.battr_.get(i11).intValue());
        }
        int iF4 = 0;
        while (iF4 < this.wlang_.size()) {
            iF4 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.wlang_, iF4, h0Var, 12, iF4, 1);
        }
        boolean z11 = this.secure_;
        if (z11) {
            h0Var.writeBool(13, z11);
        }
        boolean z12 = this.admx_;
        if (z12) {
            h0Var.writeBool(14, z12);
        }
        boolean z13 = this.curlx_;
        if (z13) {
            h0Var.writeBool(15, z13);
        }
        if (this.display_ != null) {
            h0Var.writeMessage(16, getDisplay());
        }
        if (this.video_ != null) {
            h0Var.writeMessage(17, getVideo());
        }
        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
            h0Var.writeMessage(19, this.extProto_.get(i12));
        }
        if (this.ext_ != null) {
            h0Var.writeMessage(20, getExt());
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static Builder newBuilder(Placement placement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(placement);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteBuffer, m5Var);
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ka getBadvList() {
        return this.badv_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ka getBappList() {
        return this.bapp_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ka getBcatList() {
        return this.bcat_;
    }

    @Override // com.explorestack.protobuf.adcom.s
    public ka getWlangList() {
        return this.wlang_;
    }

    private Placement(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Placement parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Placement) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Placement getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Placement parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Placement() {
        this.memoizedIsInitialized = (byte) -1;
        this.tagid_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        f8 f8Var = f8.f22138e;
        this.bcat_ = f8Var;
        this.cattax_ = 0;
        this.badv_ = f8Var;
        this.bapp_ = f8Var;
        List list = Collections.EMPTY_LIST;
        this.battr_ = list;
        this.wlang_ = f8Var;
        this.extProto_ = list;
    }

    public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Placement parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Placement) PARSER.parseFrom(bArr, m5Var);
    }

    public static Placement parseFrom(InputStream inputStream) throws IOException {
        return (Placement) k7.parseWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Placement) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Placement parseFrom(y yVar) throws IOException {
        return (Placement) k7.parseWithIOException(PARSER, yVar);
    }

    public static Placement parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Placement) k7.parseWithIOException(PARSER, yVar, m5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Placement(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        this();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    switch (tag) {
                        case 0:
                            z10 = true;
                        case 10:
                            this.tagid_ = yVar.readStringRequireUtf8();
                        case 16:
                            this.ssai_ = yVar.readUInt32();
                        case 26:
                            this.sdk_ = yVar.readStringRequireUtf8();
                        case 34:
                            this.sdkver_ = yVar.readStringRequireUtf8();
                        case 40:
                            this.reward_ = yVar.readBool();
                        case 50:
                            String stringRequireUtf8 = yVar.readStringRequireUtf8();
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 == 0) {
                                this.bcat_ = new f8();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.bcat_.add((g8) stringRequireUtf8);
                        case 56:
                            this.cattax_ = yVar.readEnum();
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            String stringRequireUtf82 = yVar.readStringRequireUtf8();
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 == 0) {
                                this.badv_ = new f8();
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            this.badv_.add((g8) stringRequireUtf82);
                        case 82:
                            String stringRequireUtf83 = yVar.readStringRequireUtf8();
                            int i13 = (i10 == true ? 1 : 0) & 4;
                            i10 = i10;
                            if (i13 == 0) {
                                this.bapp_ = new f8();
                                i10 = (i10 == true ? 1 : 0) | 4;
                            }
                            this.bapp_.add((g8) stringRequireUtf83);
                        case 88:
                            int i14 = yVar.readEnum();
                            int i15 = (i10 == true ? 1 : 0) & 8;
                            i10 = i10;
                            if (i15 == 0) {
                                this.battr_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 8;
                            }
                            this.battr_.add(Integer.valueOf(i14));
                        case 90:
                            int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                            i10 = i10;
                            while (yVar.getBytesUntilLimit() > 0) {
                                int i16 = yVar.readEnum();
                                if (((i10 == true ? 1 : 0) & 8) == 0) {
                                    this.battr_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.battr_.add(Integer.valueOf(i16));
                                i10 = i10;
                            }
                            yVar.popLimit(iPushLimit);
                        case 98:
                            String stringRequireUtf84 = yVar.readStringRequireUtf8();
                            int i17 = (i10 == true ? 1 : 0) & 16;
                            i10 = i10;
                            if (i17 == 0) {
                                this.wlang_ = new f8();
                                i10 = (i10 == true ? 1 : 0) | 16;
                            }
                            this.wlang_.add((g8) stringRequireUtf84);
                        case 104:
                            this.secure_ = yVar.readBool();
                        case 112:
                            this.admx_ = yVar.readBool();
                        case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                            this.curlx_ = yVar.readBool();
                        case 130:
                            DisplayPlacement displayPlacement = this.display_;
                            DisplayPlacement.Builder builder = displayPlacement != null ? displayPlacement.toBuilder() : null;
                            DisplayPlacement displayPlacement2 = (DisplayPlacement) yVar.readMessage(DisplayPlacement.parser(), m5Var);
                            this.display_ = displayPlacement2;
                            if (builder != null) {
                                builder.mergeFrom(displayPlacement2);
                                this.display_ = builder.buildPartial();
                            }
                        case 138:
                            VideoPlacement videoPlacement = this.video_;
                            VideoPlacement.Builder builder2 = videoPlacement != null ? videoPlacement.toBuilder() : null;
                            VideoPlacement videoPlacement2 = (VideoPlacement) yVar.readMessage(VideoPlacement.parser(), m5Var);
                            this.video_ = videoPlacement2;
                            if (builder2 != null) {
                                builder2.mergeFrom(videoPlacement2);
                                this.video_ = builder2.buildPartial();
                            }
                        case 154:
                            int i18 = (i10 == true ? 1 : 0) & 32;
                            i10 = i10;
                            if (i18 == 0) {
                                this.extProto_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 32;
                            }
                            this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                        case 162:
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
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.bcat_ = this.bcat_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.badv_ = this.badv_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 4) != 0) {
                    this.bapp_ = this.bapp_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 8) != 0) {
                    this.battr_ = Collections.unmodifiableList(this.battr_);
                }
                if (((i10 == true ? 1 : 0) & 16) != 0) {
                    this.wlang_ = this.wlang_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 32) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.bcat_ = this.bcat_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 2) != 0) {
            this.badv_ = this.badv_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 4) != 0) {
            this.bapp_ = this.bapp_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 8) != 0) {
            this.battr_ = Collections.unmodifiableList(this.battr_);
        }
        if (((i10 == true ? 1 : 0) & 16) != 0) {
            this.wlang_ = this.wlang_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 32) != 0) {
            this.extProto_ = Collections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }
}
