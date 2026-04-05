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
import com.explorestack.protobuf.b9;
import com.explorestack.protobuf.bd;
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
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.t7;
import com.explorestack.protobuf.u7;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.xc;
import com.explorestack.protobuf.y;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class Ad extends k7 implements a {
    public static final int ADOMAIN_FIELD_NUMBER = 2;
    public static final int AUDIT_FIELD_NUMBER = 16;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    public static final int CATTAX_FIELD_NUMBER = 6;
    public static final int CAT_FIELD_NUMBER = 5;
    public static final int DISPLAY_FIELD_NUMBER = 13;
    public static final int EXT_FIELD_NUMBER = 18;
    public static final int EXT_PROTO_FIELD_NUMBER = 17;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INIT_FIELD_NUMBER = 11;
    public static final int IURL_FIELD_NUMBER = 4;
    public static final int LANG_FIELD_NUMBER = 7;
    public static final int LASTMOD_FIELD_NUMBER = 12;
    public static final int MRATING_FIELD_NUMBER = 10;
    public static final int SECURE_FIELD_NUMBER = 9;
    public static final int VIDEO_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    private g8 adomain_;
    private Audit audit_;
    private g8 bundle_;
    private g8 cat_;
    private int cattax_;
    private Display display_;
    private List<Any> extProto_;
    private Struct ext_;
    private volatile Object id_;
    private volatile Object init_;
    private volatile Object iurl_;
    private volatile Object lang_;
    private volatile Object lastmod_;
    private byte memoizedIsInitialized;
    private int mrating_;
    private boolean secure_;
    private Video video_;
    private static final Ad DEFAULT_INSTANCE = new Ad();
    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Ad parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Ad(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Audit extends k7 implements AuditOrBuilder {
        public static final int CORR_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int FEEDBACK_FIELD_NUMBER = 2;
        public static final int INIT_FIELD_NUMBER = 3;
        public static final int LASTMOD_FIELD_NUMBER = 4;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private Ad corr_;
        private List<Any> extProto_;
        private Struct ext_;
        private g8 feedback_;
        private volatile Object init_;
        private volatile Object lastmod_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final Audit DEFAULT_INSTANCE = new Audit();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Audit.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Audit parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Audit(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements AuditOrBuilder {
            private int bitField0_;
            private xa corrBuilder_;
            private Ad corr_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private g8 feedback_;
            private Object init_;
            private Object lastmod_;
            private int status_;

            private Builder() {
                super(null);
                this.status_ = 0;
                this.feedback_ = f8.f22138e;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureFeedbackIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.feedback_ = new f8(this.feedback_);
                    this.bitField0_ |= 1;
                }
            }

            private xa getCorrFieldBuilder() {
                if (this.corrBuilder_ == null) {
                    this.corrBuilder_ = new xa(getCorr(), getParentForChildren(), isClean());
                    this.corr_ = null;
                }
                return this.corrBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.B0;
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

            public Builder addAllFeedback(Iterable<String> iterable) {
                ensureFeedbackIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.feedback_);
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

            public Builder addFeedback(String str) {
                str.getClass();
                ensureFeedbackIsMutable();
                this.feedback_.add((g8) str);
                onChanged();
                return this;
            }

            public Builder addFeedbackBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                ensureFeedbackIsMutable();
                this.feedback_.add(byteString);
                onChanged();
                return this;
            }

            public Builder clearCorr() {
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                    onChanged();
                    return this;
                }
                this.corr_ = null;
                this.corrBuilder_ = null;
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

            public Builder clearFeedback() {
                this.feedback_ = f8.f22138e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearInit() {
                this.init_ = Audit.getDefaultInstance().getInit();
                onChanged();
                return this;
            }

            public Builder clearLastmod() {
                this.lastmod_ = Audit.getDefaultInstance().getLastmod();
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public Ad getCorr() {
                xa xaVar = this.corrBuilder_;
                if (xaVar != null) {
                    return (Ad) xaVar.getMessage();
                }
                Ad ad2 = this.corr_;
                return ad2 == null ? Ad.getDefaultInstance() : ad2;
            }

            public Builder getCorrBuilder() {
                onChanged();
                return (Builder) getCorrFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public a getCorrOrBuilder() {
                xa xaVar = this.corrBuilder_;
                if (xaVar != null) {
                    return (a) xaVar.getMessageOrBuilder();
                }
                Ad ad2 = this.corr_;
                return ad2 == null ? Ad.getDefaultInstance() : ad2;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.B0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public String getFeedback(int i10) {
                return (String) this.feedback_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ByteString getFeedbackBytes(int i10) {
                return this.feedback_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public int getFeedbackCount() {
                return this.feedback_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public String getInit() {
                Object obj = this.init_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.init_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ByteString getInitBytes() {
                Object obj = this.init_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.init_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public String getLastmod() {
                Object obj = this.lastmod_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastmod_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ByteString getLastmodBytes() {
                Object obj = this.lastmod_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastmod_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public AuditStatusCode getStatus() {
                AuditStatusCode auditStatusCodeValueOf = AuditStatusCode.valueOf(this.status_);
                return auditStatusCodeValueOf == null ? AuditStatusCode.UNRECOGNIZED : auditStatusCodeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public int getStatusValue() {
                return this.status_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public boolean hasCorr() {
                return (this.corrBuilder_ == null && this.corr_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.C0.ensureFieldAccessorsInitialized(Audit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCorr(Ad ad2) {
                xa xaVar = this.corrBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(ad2);
                    return this;
                }
                Ad ad3 = this.corr_;
                if (ad3 != null) {
                    this.corr_ = Ad.newBuilder(ad3).mergeFrom(ad2).buildPartial();
                } else {
                    this.corr_ = ad2;
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

            public Builder setCorr(Ad ad2) {
                xa xaVar = this.corrBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(ad2);
                    return this;
                }
                ad2.getClass();
                this.corr_ = ad2;
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

            public Builder setFeedback(int i10, String str) {
                str.getClass();
                ensureFeedbackIsMutable();
                this.feedback_.set(i10, (int) str);
                onChanged();
                return this;
            }

            public Builder setInit(String str) {
                str.getClass();
                this.init_ = str;
                onChanged();
                return this;
            }

            public Builder setInitBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.init_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLastmod(String str) {
                str.getClass();
                this.lastmod_ = str;
                onChanged();
                return this;
            }

            public Builder setLastmodBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.lastmod_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStatus(AuditStatusCode auditStatusCode) {
                auditStatusCode.getClass();
                this.status_ = auditStatusCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatusValue(int i10) {
                this.status_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
            public ka getFeedbackList() {
                return this.feedback_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Audit build() {
                Audit auditBuildPartial = buildPartial();
                if (auditBuildPartial.isInitialized()) {
                    return auditBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) auditBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Audit buildPartial() {
                Audit audit = new Audit(this);
                audit.status_ = this.status_;
                if ((this.bitField0_ & 1) != 0) {
                    this.feedback_ = this.feedback_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                audit.feedback_ = this.feedback_;
                audit.init_ = this.init_;
                audit.lastmod_ = this.lastmod_;
                xa xaVar = this.corrBuilder_;
                if (xaVar == null) {
                    audit.corr_ = this.corr_;
                } else {
                    audit.corr_ = (Ad) xaVar.build();
                }
                xa xaVar2 = this.extBuilder_;
                if (xaVar2 == null) {
                    audit.ext_ = this.ext_;
                } else {
                    audit.ext_ = (Struct) xaVar2.build();
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    audit.extProto_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    audit.extProto_ = this.extProto_;
                }
                onBuilt();
                return audit;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Audit getDefaultInstanceForType() {
                return Audit.getDefaultInstance();
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
                this.status_ = 0;
                this.feedback_ = f8.f22138e;
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                this.init_ = "";
                this.lastmod_ = "";
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                } else {
                    this.corr_ = null;
                    this.corrBuilder_ = null;
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
                    this.bitField0_ = i10 & (-4);
                    return this;
                }
                paVar.clear();
                return this;
            }

            public Builder setCorr(Builder builder) {
                xa xaVar = this.corrBuilder_;
                if (xaVar == null) {
                    this.corr_ = builder.build();
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
                if (message instanceof Audit) {
                    return mergeFrom((Audit) message);
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
                this.status_ = 0;
                this.feedback_ = f8.f22138e;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Audit audit) {
                if (audit == Audit.getDefaultInstance()) {
                    return this;
                }
                if (audit.status_ != 0) {
                    setStatusValue(audit.getStatusValue());
                }
                if (!audit.feedback_.isEmpty()) {
                    if (this.feedback_.isEmpty()) {
                        this.feedback_ = audit.feedback_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFeedbackIsMutable();
                        this.feedback_.addAll(audit.feedback_);
                    }
                    onChanged();
                }
                if (!audit.getInit().isEmpty()) {
                    this.init_ = audit.init_;
                    onChanged();
                }
                if (!audit.getLastmod().isEmpty()) {
                    this.lastmod_ = audit.lastmod_;
                    onChanged();
                }
                if (audit.hasCorr()) {
                    mergeCorr(audit.getCorr());
                }
                if (audit.hasExt()) {
                    mergeExt(audit.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!audit.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = audit.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(audit.extProto_);
                        }
                        onChanged();
                    }
                } else if (!audit.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(audit.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = audit.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) audit).unknownFields);
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
            public com.explorestack.protobuf.adcom.Ad.Audit.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Audit.access$20800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Audit r3 = (com.explorestack.protobuf.adcom.Ad.Audit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Audit r4 = (com.explorestack.protobuf.adcom.Ad.Audit) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Audit.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Audit$Builder");
            }
        }

        public static Audit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.B0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Audit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Audit) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Audit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Audit)) {
                return super.equals(obj);
            }
            Audit audit = (Audit) obj;
            if (this.status_ != audit.status_ || !getFeedbackList().equals(audit.getFeedbackList()) || !getInit().equals(audit.getInit()) || !getLastmod().equals(audit.getLastmod()) || hasCorr() != audit.hasCorr()) {
                return false;
            }
            if ((!hasCorr() || getCorr().equals(audit.getCorr())) && hasExt() == audit.hasExt()) {
                return (!hasExt() || getExt().equals(audit.getExt())) && getExtProtoList().equals(audit.getExtProtoList()) && this.unknownFields.equals(audit.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public Ad getCorr() {
            Ad ad2 = this.corr_;
            return ad2 == null ? Ad.getDefaultInstance() : ad2;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public a getCorrOrBuilder() {
            return getCorr();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public String getFeedback(int i10) {
            return (String) this.feedback_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ByteString getFeedbackBytes(int i10) {
            return this.feedback_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public int getFeedbackCount() {
            return this.feedback_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public String getInit() {
            Object obj = this.init_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.init_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.init_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public String getLastmod() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastmod_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastmod_ = byteStringCopyFromUtf8;
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
            int iComputeEnumSize = this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber() ? h0.computeEnumSize(1, this.status_) : 0;
            int iE = 0;
            for (int i11 = 0; i11 < this.feedback_.size(); i11++) {
                iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.feedback_, i11, iE);
            }
            int size = getFeedbackList().size() + iComputeEnumSize + iE;
            if (!getInitBytes().isEmpty()) {
                size += k7.computeStringSize(3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                size += k7.computeStringSize(4, this.lastmod_);
            }
            if (this.corr_ != null) {
                size += h0.computeMessageSize(5, getCorr());
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                size += h0.computeMessageSize(6, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                size += h0.computeMessageSize(7, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public AuditStatusCode getStatus() {
            AuditStatusCode auditStatusCodeValueOf = AuditStatusCode.valueOf(this.status_);
            return auditStatusCodeValueOf == null ? AuditStatusCode.UNRECOGNIZED : auditStatusCodeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public boolean hasCorr() {
            return this.corr_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.status_;
            if (getFeedbackCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + getFeedbackList().hashCode();
            }
            int iHashCode2 = getLastmod().hashCode() + ((((getInit().hashCode() + o2.B(iHashCode, 37, 3, 53)) * 37) + 4) * 53);
            if (hasCorr()) {
                iHashCode2 = o2.B(iHashCode2, 37, 5, 53) + getCorr().hashCode();
            }
            if (hasExt()) {
                iHashCode2 = o2.B(iHashCode2, 37, 7, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode2 = o2.B(iHashCode2, 37, 6, 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.C0.ensureFieldAccessorsInitialized(Audit.class, Builder.class);
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
            return new Audit();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber()) {
                h0Var.writeEnum(1, this.status_);
            }
            int iF = 0;
            while (iF < this.feedback_.size()) {
                iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.feedback_, iF, h0Var, 2, iF, 1);
            }
            if (!getInitBytes().isEmpty()) {
                k7.writeString(h0Var, 3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                k7.writeString(h0Var, 4, this.lastmod_);
            }
            if (this.corr_ != null) {
                h0Var.writeMessage(5, getCorr());
            }
            for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                h0Var.writeMessage(6, this.extProto_.get(i10));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        public static Builder newBuilder(Audit audit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audit);
        }

        public static Audit parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(byteBuffer, m5Var);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.AuditOrBuilder
        public ka getFeedbackList() {
            return this.feedback_;
        }

        private Audit(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Audit parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Audit) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Audit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Audit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Audit parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Audit() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.feedback_ = f8.f22138e;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Audit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Audit parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Audit) PARSER.parseFrom(bArr, m5Var);
        }

        public static Audit parseFrom(InputStream inputStream) throws IOException {
            return (Audit) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Audit parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Audit) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Audit parseFrom(y yVar) throws IOException {
            return (Audit) k7.parseWithIOException(PARSER, yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v6 */
        private Audit(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            this();
            m5Var.getClass();
            cc ccVarNewBuilder = gc.newBuilder();
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.status_ = yVar.readEnum();
                            } else if (tag == 18) {
                                String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                int i10 = (c10 == true ? 1 : 0) & 1;
                                c10 = c10;
                                if (i10 == 0) {
                                    this.feedback_ = new f8();
                                    c10 = (c10 == true ? 1 : 0) | 1;
                                }
                                this.feedback_.add((g8) stringRequireUtf8);
                            } else if (tag == 26) {
                                this.init_ = yVar.readStringRequireUtf8();
                            } else if (tag != 34) {
                                if (tag == 42) {
                                    Ad ad2 = this.corr_;
                                    Builder builder = ad2 != null ? ad2.toBuilder() : null;
                                    Ad ad3 = (Ad) yVar.readMessage(Ad.parser(), m5Var);
                                    this.corr_ = ad3;
                                    if (builder != null) {
                                        builder.mergeFrom(ad3);
                                        this.corr_ = builder.buildPartial();
                                    }
                                } else if (tag == 50) {
                                    int i11 = (c10 == true ? 1 : 0) & 2;
                                    c10 = c10;
                                    if (i11 == 0) {
                                        this.extProto_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 2;
                                    }
                                    this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                } else if (tag != 58) {
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
                                this.lastmod_ = yVar.readStringRequireUtf8();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (((c10 == true ? 1 : 0) & 1) != 0) {
                        this.feedback_ = this.feedback_.getUnmodifiableView();
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
                this.feedback_ = this.feedback_.getUnmodifiableView();
            }
            if (((c10 == true ? 1 : 0) & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Audit parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Audit) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AuditOrBuilder extends MessageOrBuilder {
        Ad getCorr();

        a getCorrOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        String getFeedback(int i10);

        ByteString getFeedbackBytes(int i10);

        int getFeedbackCount();

        List<String> getFeedbackList();

        String getInit();

        ByteString getInitBytes();

        String getLastmod();

        ByteString getLastmodBytes();

        AuditStatusCode getStatus();

        int getStatusValue();

        boolean hasCorr();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements a {
        private g8 adomain_;
        private xa auditBuilder_;
        private Audit audit_;
        private int bitField0_;
        private g8 bundle_;
        private g8 cat_;
        private int cattax_;
        private xa displayBuilder_;
        private Display display_;
        private xa extBuilder_;
        private pa extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private Object init_;
        private Object iurl_;
        private Object lang_;
        private Object lastmod_;
        private int mrating_;
        private boolean secure_;
        private xa videoBuilder_;
        private Video video_;

        private Builder() {
            super(null);
            this.id_ = "";
            f8 f8Var = f8.f22138e;
            this.adomain_ = f8Var;
            this.bundle_ = f8Var;
            this.iurl_ = "";
            this.cat_ = f8Var;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void ensureAdomainIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adomain_ = new f8(this.adomain_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureBundleIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.bundle_ = new f8(this.bundle_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureCatIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.cat_ = new f8(this.cat_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 8;
            }
        }

        private xa getAuditFieldBuilder() {
            if (this.auditBuilder_ == null) {
                this.auditBuilder_ = new xa(getAudit(), getParentForChildren(), isClean());
                this.audit_ = null;
            }
            return this.auditBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21859a0;
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
                this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
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

        public Builder addAdomain(String str) {
            str.getClass();
            ensureAdomainIsMutable();
            this.adomain_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addAdomainBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            ensureAdomainIsMutable();
            this.adomain_.add(byteString);
            onChanged();
            return this;
        }

        public Builder addAllAdomain(Iterable<String> iterable) {
            ensureAdomainIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.adomain_);
            onChanged();
            return this;
        }

        public Builder addAllBundle(Iterable<String> iterable) {
            ensureBundleIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.bundle_);
            onChanged();
            return this;
        }

        public Builder addAllCat(Iterable<String> iterable) {
            ensureCatIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.cat_);
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

        public Builder addBundle(String str) {
            str.getClass();
            ensureBundleIsMutable();
            this.bundle_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addBundleBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            ensureBundleIsMutable();
            this.bundle_.add(byteString);
            onChanged();
            return this;
        }

        public Builder addCat(String str) {
            str.getClass();
            ensureCatIsMutable();
            this.cat_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addCatBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            ensureCatIsMutable();
            this.cat_.add(byteString);
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

        public Builder clearAdomain() {
            this.adomain_ = f8.f22138e;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearAudit() {
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
                onChanged();
                return this;
            }
            this.audit_ = null;
            this.auditBuilder_ = null;
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = f8.f22138e;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearCat() {
            this.cat_ = f8.f22138e;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearCattax() {
            this.cattax_ = 0;
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
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearId() {
            this.id_ = Ad.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearInit() {
            this.init_ = Ad.getDefaultInstance().getInit();
            onChanged();
            return this;
        }

        public Builder clearIurl() {
            this.iurl_ = Ad.getDefaultInstance().getIurl();
            onChanged();
            return this;
        }

        public Builder clearLang() {
            this.lang_ = Ad.getDefaultInstance().getLang();
            onChanged();
            return this;
        }

        public Builder clearLastmod() {
            this.lastmod_ = Ad.getDefaultInstance().getLastmod();
            onChanged();
            return this;
        }

        public Builder clearMrating() {
            this.mrating_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSecure() {
            this.secure_ = false;
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

        @Override // com.explorestack.protobuf.adcom.a
        public String getAdomain(int i10) {
            return (String) this.adomain_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ByteString getAdomainBytes(int i10) {
            return this.adomain_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.a
        public int getAdomainCount() {
            return this.adomain_.size();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public Audit getAudit() {
            xa xaVar = this.auditBuilder_;
            if (xaVar != null) {
                return (Audit) xaVar.getMessage();
            }
            Audit audit = this.audit_;
            return audit == null ? Audit.getDefaultInstance() : audit;
        }

        public Audit.Builder getAuditBuilder() {
            onChanged();
            return (Audit.Builder) getAuditFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public AuditOrBuilder getAuditOrBuilder() {
            xa xaVar = this.auditBuilder_;
            if (xaVar != null) {
                return (AuditOrBuilder) xaVar.getMessageOrBuilder();
            }
            Audit audit = this.audit_;
            return audit == null ? Audit.getDefaultInstance() : audit;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public String getBundle(int i10) {
            return (String) this.bundle_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ByteString getBundleBytes(int i10) {
            return this.bundle_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.a
        public int getBundleCount() {
            return this.bundle_.size();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public String getCat(int i10) {
            return (String) this.cat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ByteString getCatBytes(int i10) {
            return this.cat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.a
        public int getCatCount() {
            return this.cat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f21859a0;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public Display getDisplay() {
            xa xaVar = this.displayBuilder_;
            if (xaVar != null) {
                return (Display) xaVar.getMessage();
            }
            Display display = this.display_;
            return display == null ? Display.getDefaultInstance() : display;
        }

        public Display.Builder getDisplayBuilder() {
            onChanged();
            return (Display.Builder) getDisplayFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public DisplayOrBuilder getDisplayOrBuilder() {
            xa xaVar = this.displayBuilder_;
            if (xaVar != null) {
                return (DisplayOrBuilder) xaVar.getMessageOrBuilder();
            }
            Display display = this.display_;
            return display == null ? Display.getDefaultInstance() : display;
        }

        @Override // com.explorestack.protobuf.adcom.a
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

        @Override // com.explorestack.protobuf.adcom.a
        public jb getExtOrBuilder() {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.a
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

        @Override // com.explorestack.protobuf.adcom.a
        public int getExtProtoCount() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.size() : paVar.getCount();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public List<Any> getExtProtoList() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
        }

        @Override // com.explorestack.protobuf.adcom.a
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            pa paVar = this.extProtoBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
        }

        @Override // com.explorestack.protobuf.adcom.a
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public String getInit() {
            Object obj = this.init_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.init_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.init_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public String getIurl() {
            Object obj = this.iurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.iurl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ByteString getIurlBytes() {
            Object obj = this.iurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iurl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public String getLang() {
            Object obj = this.lang_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lang_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ByteString getLangBytes() {
            Object obj = this.lang_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lang_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public String getLastmod() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastmod_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastmod_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public MediaRating getMrating() {
            MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
            return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public int getMratingValue() {
            return this.mrating_;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public boolean getSecure() {
            return this.secure_;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public Video getVideo() {
            xa xaVar = this.videoBuilder_;
            if (xaVar != null) {
                return (Video) xaVar.getMessage();
            }
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        public Video.Builder getVideoBuilder() {
            onChanged();
            return (Video.Builder) getVideoFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public VideoOrBuilder getVideoOrBuilder() {
            xa xaVar = this.videoBuilder_;
            if (xaVar != null) {
                return (VideoOrBuilder) xaVar.getMessageOrBuilder();
            }
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public boolean hasAudit() {
            return (this.auditBuilder_ == null && this.audit_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public boolean hasDisplay() {
            return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public boolean hasVideo() {
            return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return b.f21861b0.ensureFieldAccessorsInitialized(Ad.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAudit(Audit audit) {
            xa xaVar = this.auditBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(audit);
                return this;
            }
            Audit audit2 = this.audit_;
            if (audit2 != null) {
                this.audit_ = Audit.newBuilder(audit2).mergeFrom(audit).buildPartial();
            } else {
                this.audit_ = audit;
            }
            onChanged();
            return this;
        }

        public Builder mergeDisplay(Display display) {
            xa xaVar = this.displayBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(display);
                return this;
            }
            Display display2 = this.display_;
            if (display2 != null) {
                this.display_ = Display.newBuilder(display2).mergeFrom(display).buildPartial();
            } else {
                this.display_ = display;
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

        public Builder mergeVideo(Video video) {
            xa xaVar = this.videoBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(video);
                return this;
            }
            Video video2 = this.video_;
            if (video2 != null) {
                this.video_ = Video.newBuilder(video2).mergeFrom(video).buildPartial();
            } else {
                this.video_ = video;
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

        public Builder setAdomain(int i10, String str) {
            str.getClass();
            ensureAdomainIsMutable();
            this.adomain_.set(i10, (int) str);
            onChanged();
            return this;
        }

        public Builder setAudit(Audit audit) {
            xa xaVar = this.auditBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(audit);
                return this;
            }
            audit.getClass();
            this.audit_ = audit;
            onChanged();
            return this;
        }

        public Builder setBundle(int i10, String str) {
            str.getClass();
            ensureBundleIsMutable();
            this.bundle_.set(i10, (int) str);
            onChanged();
            return this;
        }

        public Builder setCat(int i10, String str) {
            str.getClass();
            ensureCatIsMutable();
            this.cat_.set(i10, (int) str);
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

        public Builder setDisplay(Display display) {
            xa xaVar = this.displayBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(display);
                return this;
            }
            display.getClass();
            this.display_ = display;
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

        public Builder setInit(String str) {
            str.getClass();
            this.init_ = str;
            onChanged();
            return this;
        }

        public Builder setInitBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.init_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIurl(String str) {
            str.getClass();
            this.iurl_ = str;
            onChanged();
            return this;
        }

        public Builder setIurlBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.iurl_ = byteString;
            onChanged();
            return this;
        }

        public Builder setLang(String str) {
            str.getClass();
            this.lang_ = str;
            onChanged();
            return this;
        }

        public Builder setLangBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.lang_ = byteString;
            onChanged();
            return this;
        }

        public Builder setLastmod(String str) {
            str.getClass();
            this.lastmod_ = str;
            onChanged();
            return this;
        }

        public Builder setLastmodBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.lastmod_ = byteString;
            onChanged();
            return this;
        }

        public Builder setMrating(MediaRating mediaRating) {
            mediaRating.getClass();
            this.mrating_ = mediaRating.getNumber();
            onChanged();
            return this;
        }

        public Builder setMratingValue(int i10) {
            this.mrating_ = i10;
            onChanged();
            return this;
        }

        public Builder setSecure(boolean z10) {
            this.secure_ = z10;
            onChanged();
            return this;
        }

        public Builder setVideo(Video video) {
            xa xaVar = this.videoBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(video);
                return this;
            }
            video.getClass();
            this.video_ = video;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ka getAdomainList() {
            return this.adomain_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ka getBundleList() {
            return this.bundle_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.adcom.a
        public ka getCatList() {
            return this.cat_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Ad build() {
            Ad adBuildPartial = buildPartial();
            if (adBuildPartial.isInitialized()) {
                return adBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Ad buildPartial() {
            Ad ad2 = new Ad(this);
            ad2.id_ = this.id_;
            if ((this.bitField0_ & 1) != 0) {
                this.adomain_ = this.adomain_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            ad2.adomain_ = this.adomain_;
            if ((this.bitField0_ & 2) != 0) {
                this.bundle_ = this.bundle_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            ad2.bundle_ = this.bundle_;
            ad2.iurl_ = this.iurl_;
            if ((this.bitField0_ & 4) != 0) {
                this.cat_ = this.cat_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            ad2.cat_ = this.cat_;
            ad2.cattax_ = this.cattax_;
            ad2.lang_ = this.lang_;
            ad2.secure_ = this.secure_;
            ad2.mrating_ = this.mrating_;
            ad2.init_ = this.init_;
            ad2.lastmod_ = this.lastmod_;
            xa xaVar = this.displayBuilder_;
            if (xaVar == null) {
                ad2.display_ = this.display_;
            } else {
                ad2.display_ = (Display) xaVar.build();
            }
            xa xaVar2 = this.videoBuilder_;
            if (xaVar2 == null) {
                ad2.video_ = this.video_;
            } else {
                ad2.video_ = (Video) xaVar2.build();
            }
            xa xaVar3 = this.auditBuilder_;
            if (xaVar3 == null) {
                ad2.audit_ = this.audit_;
            } else {
                ad2.audit_ = (Audit) xaVar3.build();
            }
            xa xaVar4 = this.extBuilder_;
            if (xaVar4 == null) {
                ad2.ext_ = this.ext_;
            } else {
                ad2.ext_ = (Struct) xaVar4.build();
            }
            pa paVar = this.extProtoBuilder_;
            if (paVar != null) {
                ad2.extProto_ = paVar.build();
            } else {
                if ((this.bitField0_ & 8) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -9;
                }
                ad2.extProto_ = this.extProto_;
            }
            onBuilt();
            return ad2;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Ad getDefaultInstanceForType() {
            return Ad.getDefaultInstance();
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
            f8 f8Var = f8.f22138e;
            this.adomain_ = f8Var;
            int i10 = this.bitField0_;
            this.bundle_ = f8Var;
            this.iurl_ = "";
            this.cat_ = f8Var;
            this.bitField0_ = i10 & (-8);
            this.cattax_ = 0;
            this.lang_ = "";
            this.secure_ = false;
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
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
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
            } else {
                this.audit_ = null;
                this.auditBuilder_ = null;
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
                this.bitField0_ = i10 & (-16);
                return this;
            }
            paVar.clear();
            return this;
        }

        public Builder setAudit(Audit.Builder builder) {
            xa xaVar = this.auditBuilder_;
            if (xaVar == null) {
                this.audit_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setDisplay(Display.Builder builder) {
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

        public Builder setVideo(Video.Builder builder) {
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
            if (message instanceof Ad) {
                return mergeFrom((Ad) message);
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

        public Builder mergeFrom(Ad ad2) {
            if (ad2 == Ad.getDefaultInstance()) {
                return this;
            }
            if (!ad2.getId().isEmpty()) {
                this.id_ = ad2.id_;
                onChanged();
            }
            if (!ad2.adomain_.isEmpty()) {
                if (this.adomain_.isEmpty()) {
                    this.adomain_ = ad2.adomain_;
                    this.bitField0_ &= -2;
                } else {
                    ensureAdomainIsMutable();
                    this.adomain_.addAll(ad2.adomain_);
                }
                onChanged();
            }
            if (!ad2.bundle_.isEmpty()) {
                if (this.bundle_.isEmpty()) {
                    this.bundle_ = ad2.bundle_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBundleIsMutable();
                    this.bundle_.addAll(ad2.bundle_);
                }
                onChanged();
            }
            if (!ad2.getIurl().isEmpty()) {
                this.iurl_ = ad2.iurl_;
                onChanged();
            }
            if (!ad2.cat_.isEmpty()) {
                if (this.cat_.isEmpty()) {
                    this.cat_ = ad2.cat_;
                    this.bitField0_ &= -5;
                } else {
                    ensureCatIsMutable();
                    this.cat_.addAll(ad2.cat_);
                }
                onChanged();
            }
            if (ad2.cattax_ != 0) {
                setCattaxValue(ad2.getCattaxValue());
            }
            if (!ad2.getLang().isEmpty()) {
                this.lang_ = ad2.lang_;
                onChanged();
            }
            if (ad2.getSecure()) {
                setSecure(ad2.getSecure());
            }
            if (ad2.mrating_ != 0) {
                setMratingValue(ad2.getMratingValue());
            }
            if (!ad2.getInit().isEmpty()) {
                this.init_ = ad2.init_;
                onChanged();
            }
            if (!ad2.getLastmod().isEmpty()) {
                this.lastmod_ = ad2.lastmod_;
                onChanged();
            }
            if (ad2.hasDisplay()) {
                mergeDisplay(ad2.getDisplay());
            }
            if (ad2.hasVideo()) {
                mergeVideo(ad2.getVideo());
            }
            if (ad2.hasAudit()) {
                mergeAudit(ad2.getAudit());
            }
            if (ad2.hasExt()) {
                mergeExt(ad2.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!ad2.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = ad2.extProto_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(ad2.extProto_);
                    }
                    onChanged();
                }
            } else if (!ad2.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.addAllMessages(ad2.extProto_);
                } else {
                    this.extProtoBuilder_.dispose();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = ad2.extProto_;
                    this.bitField0_ &= -9;
                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) ad2).unknownFields);
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
            this.id_ = "";
            f8 f8Var = f8.f22138e;
            this.adomain_ = f8Var;
            this.bundle_ = f8Var;
            this.iurl_ = "";
            this.cat_ = f8Var;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
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
        public com.explorestack.protobuf.adcom.Ad.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.access$23500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.adcom.Ad r3 = (com.explorestack.protobuf.adcom.Ad) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.adcom.Ad r4 = (com.explorestack.protobuf.adcom.Ad) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Builder");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Display extends k7 implements DisplayOrBuilder {
        public static final int ADM_FIELD_NUMBER = 8;
        public static final int API_FIELD_NUMBER = 2;
        public static final int BANNER_FIELD_NUMBER = 10;
        public static final int CURL_FIELD_NUMBER = 9;
        public static final int EVENT_FIELD_NUMBER = 12;
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int EXT_PROTO_FIELD_NUMBER = 13;
        public static final int HRATIO_FIELD_NUMBER = 7;
        public static final int H_FIELD_NUMBER = 5;
        public static final int MIME_FIELD_NUMBER = 1;
        public static final int NATIVE_FIELD_NUMBER = 11;
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int WRATIO_FIELD_NUMBER = 6;
        public static final int W_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object adm_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private Banner banner_;
        private volatile Object curl_;
        private List<Event> event_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private int hratio_;
        private byte memoizedIsInitialized;
        private g8 mime_;
        private Native native_;
        private int typeMemoizedSerializedSize;
        private List<Integer> type_;
        private int w_;
        private int wratio_;
        private static final t7 api_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Ad.Display.1
            @Override // com.explorestack.protobuf.t7
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final t7 type_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Ad.Display.2
            @Override // com.explorestack.protobuf.t7
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType displayCreativeTypeValueOf = DisplayCreativeType.valueOf(num.intValue());
                return displayCreativeTypeValueOf == null ? DisplayCreativeType.UNRECOGNIZED : displayCreativeTypeValueOf;
            }
        };
        private static final Display DEFAULT_INSTANCE = new Display();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.3
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Display parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Display(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Banner extends k7 implements BannerOrBuilder {
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int IMG_FIELD_NUMBER = 1;
            public static final int LINK_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object img_;
            private volatile Object link_;
            private byte memoizedIsInitialized;
            private static final Banner DEFAULT_INSTANCE = new Banner();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Banner.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Banner parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Banner(yVar, m5Var);
                }
            };

            public static Banner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21873h0;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Banner) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Banner)) {
                    return super.equals(obj);
                }
                Banner banner = (Banner) obj;
                if (getImg().equals(banner.getImg()) && getLink().equals(banner.getLink()) && hasExt() == banner.hasExt()) {
                    return (!hasExt() || getExt().equals(banner.getExt())) && getExtProtoList().equals(banner.getExtProtoList()) && this.unknownFields.equals(banner.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public String getImg() {
                Object obj = this.img_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.img_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public ByteString getImgBytes() {
                Object obj = this.img_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.img_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public String getLink() {
                Object obj = this.link_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.link_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public ByteString getLinkBytes() {
                Object obj = this.link_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.link_ = byteStringCopyFromUtf8;
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
                int iComputeStringSize = !getImgBytes().isEmpty() ? k7.computeStringSize(1, this.img_) : 0;
                if (!getLinkBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(2, this.link_);
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

            @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getLink().hashCode() + ((((getImg().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
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
                return b.f21875i0.ensureFieldAccessorsInitialized(Banner.class, Builder.class);
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
                return new Banner();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getImgBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.img_);
                }
                if (!getLinkBytes().isEmpty()) {
                    k7.writeString(h0Var, 2, this.link_);
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
            public static final class Builder extends o6 implements BannerOrBuilder {
                private int bitField0_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object img_;
                private Object link_;

                private Builder() {
                    super(null);
                    this.img_ = "";
                    this.link_ = "";
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
                    return b.f21873h0;
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

                public Builder clearImg() {
                    this.img_ = Banner.getDefaultInstance().getImg();
                    onChanged();
                    return this;
                }

                public Builder clearLink() {
                    this.link_ = Banner.getDefaultInstance().getLink();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f21873h0;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public String getImg() {
                    Object obj = this.img_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.img_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public ByteString getImgBytes() {
                    Object obj = this.img_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.img_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public String getLink() {
                    Object obj = this.link_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.link_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public ByteString getLinkBytes() {
                    Object obj = this.link_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.link_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.BannerOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.f21875i0.ensureFieldAccessorsInitialized(Banner.class, Builder.class);
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

                public Builder setImg(String str) {
                    str.getClass();
                    this.img_ = str;
                    onChanged();
                    return this;
                }

                public Builder setImgBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.img_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLink(String str) {
                    str.getClass();
                    this.link_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLinkBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.link_ = byteString;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Banner build() {
                    Banner bannerBuildPartial = buildPartial();
                    if (bannerBuildPartial.isInitialized()) {
                        return bannerBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) bannerBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Banner buildPartial() {
                    Banner banner = new Banner(this);
                    banner.img_ = this.img_;
                    banner.link_ = this.link_;
                    xa xaVar = this.extBuilder_;
                    if (xaVar == null) {
                        banner.ext_ = this.ext_;
                    } else {
                        banner.ext_ = (Struct) xaVar.build();
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        banner.extProto_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        banner.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return banner;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Banner getDefaultInstanceForType() {
                    return Banner.getDefaultInstance();
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
                    this.img_ = "";
                    this.link_ = "";
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
                    if (message instanceof Banner) {
                        return mergeFrom((Banner) message);
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
                    this.img_ = "";
                    this.link_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Banner banner) {
                    if (banner == Banner.getDefaultInstance()) {
                        return this;
                    }
                    if (!banner.getImg().isEmpty()) {
                        this.img_ = banner.img_;
                        onChanged();
                    }
                    if (!banner.getLink().isEmpty()) {
                        this.link_ = banner.link_;
                        onChanged();
                    }
                    if (banner.hasExt()) {
                        mergeExt(banner.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!banner.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = banner.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(banner.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!banner.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(banner.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = banner.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) banner).unknownFields);
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
                public com.explorestack.protobuf.adcom.Ad.Display.Banner.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.Banner.access$2800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Ad$Display$Banner r3 = (com.explorestack.protobuf.adcom.Ad.Display.Banner) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Ad$Display$Banner r4 = (com.explorestack.protobuf.adcom.Ad.Display.Banner) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Banner.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Banner$Builder");
                }
            }

            public static Builder newBuilder(Banner banner) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(banner);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Banner(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Banner parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Banner) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Banner getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Banner parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Banner() {
                this.memoizedIsInitialized = (byte) -1;
                this.img_ = "";
                this.link_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Banner parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Banner) PARSER.parseFrom(bArr, m5Var);
            }

            public static Banner parseFrom(InputStream inputStream) throws IOException {
                return (Banner) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Banner parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Banner) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Banner(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.img_ = yVar.readStringRequireUtf8();
                                } else if (tag == 18) {
                                    this.link_ = yVar.readStringRequireUtf8();
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

            public static Banner parseFrom(y yVar) throws IOException {
                return (Banner) k7.parseWithIOException(PARSER, yVar);
            }

            public static Banner parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Banner) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface BannerOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

            List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

            String getImg();

            ByteString getImgBytes();

            String getLink();

            ByteString getLinkBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements DisplayOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private xa bannerBuilder_;
            private Banner banner_;
            private int bitField0_;
            private Object curl_;
            private pa eventBuilder_;
            private List<Event> event_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int hratio_;
            private g8 mime_;
            private xa nativeBuilder_;
            private Native native_;
            private List<Integer> type_;
            private int w_;
            private int wratio_;

            private Builder() {
                super(null);
                this.mime_ = f8.f22138e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new f8(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            private xa getBannerFieldBuilder() {
                if (this.bannerBuilder_ == null) {
                    this.bannerBuilder_ = new xa(getBanner(), getParentForChildren(), isClean());
                    this.banner_ = null;
                }
                return this.bannerBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21869f0;
            }

            private pa getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    this.eventBuilder_ = new pa(this.event_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
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
                    this.extProtoBuilder_ = new pa(this.extProto_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private xa getNativeFieldBuilder() {
                if (this.nativeBuilder_ == null) {
                    this.nativeBuilder_ = new xa(getNative(), getParentForChildren(), isClean());
                    this.native_ = null;
                }
                return this.nativeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
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

            public Builder addAllEvent(Iterable<? extends Event> iterable) {
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

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addAllType(Iterable<? extends DisplayCreativeType> iterable) {
                ensureTypeIsMutable();
                Iterator<? extends DisplayCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.type_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.type_.add(num);
                }
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

            public Builder addEvent(Event event) {
                pa paVar = this.eventBuilder_;
                if (paVar != null) {
                    paVar.addMessage(event);
                    return this;
                }
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(event);
                onChanged();
                return this;
            }

            public Event.Builder addEventBuilder() {
                return (Event.Builder) getEventFieldBuilder().addBuilder(Event.getDefaultInstance());
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

            public Builder addType(DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i10) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder clearAdm() {
                this.adm_ = Display.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearBanner() {
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                    onChanged();
                    return this;
                }
                this.banner_ = null;
                this.bannerBuilder_ = null;
                return this;
            }

            public Builder clearCurl() {
                this.curl_ = Display.getDefaultInstance().getCurl();
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
                this.bitField0_ &= -17;
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

            public Builder clearMime() {
                this.mime_ = f8.f22138e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearNative() {
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                    onChanged();
                    return this;
                }
                this.native_ = null;
                this.nativeBuilder_ = null;
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
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

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public String getAdm() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adm_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) Display.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<ApiFramework> getApiList() {
                return new u7(this.api_, Display.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public Banner getBanner() {
                xa xaVar = this.bannerBuilder_;
                if (xaVar != null) {
                    return (Banner) xaVar.getMessage();
                }
                Banner banner = this.banner_;
                return banner == null ? Banner.getDefaultInstance() : banner;
            }

            public Banner.Builder getBannerBuilder() {
                onChanged();
                return (Banner.Builder) getBannerFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public BannerOrBuilder getBannerOrBuilder() {
                xa xaVar = this.bannerBuilder_;
                if (xaVar != null) {
                    return (BannerOrBuilder) xaVar.getMessageOrBuilder();
                }
                Banner banner = this.banner_;
                return banner == null ? Banner.getDefaultInstance() : banner;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public String getCurl() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.curl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f21869f0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public Event getEvent(int i10) {
                pa paVar = this.eventBuilder_;
                return paVar == null ? this.event_.get(i10) : (Event) paVar.getMessage(i10);
            }

            public Event.Builder getEventBuilder(int i10) {
                return (Event.Builder) getEventFieldBuilder().getBuilder(i10);
            }

            public List<Event.Builder> getEventBuilderList() {
                return getEventFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getEventCount() {
                pa paVar = this.eventBuilder_;
                return paVar == null ? this.event_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Event> getEventList() {
                pa paVar = this.eventBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.event_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public EventOrBuilder getEventOrBuilder(int i10) {
                pa paVar = this.eventBuilder_;
                return paVar == null ? this.event_.get(i10) : (EventOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<? extends EventOrBuilder> getEventOrBuilderList() {
                pa paVar = this.eventBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.event_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getHratio() {
                return this.hratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public String getMime(int i10) {
                return (String) this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public Native getNative() {
                xa xaVar = this.nativeBuilder_;
                if (xaVar != null) {
                    return (Native) xaVar.getMessage();
                }
                Native r02 = this.native_;
                return r02 == null ? Native.getDefaultInstance() : r02;
            }

            public Native.Builder getNativeBuilder() {
                onChanged();
                return (Native.Builder) getNativeFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public NativeOrBuilder getNativeOrBuilder() {
                xa xaVar = this.nativeBuilder_;
                if (xaVar != null) {
                    return (NativeOrBuilder) xaVar.getMessageOrBuilder();
                }
                Native r02 = this.native_;
                return r02 == null ? Native.getDefaultInstance() : r02;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public DisplayCreativeType getType(int i10) {
                return (DisplayCreativeType) Display.type_converter_.convert(this.type_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<DisplayCreativeType> getTypeList() {
                return new u7(this.type_, Display.type_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getTypeValue(int i10) {
                return this.type_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public List<Integer> getTypeValueList() {
                return Collections.unmodifiableList(this.type_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public int getWratio() {
                return this.wratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public boolean hasBanner() {
                return (this.bannerBuilder_ == null && this.banner_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public boolean hasNative() {
                return (this.nativeBuilder_ == null && this.native_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.f21871g0.ensureFieldAccessorsInitialized(Display.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBanner(Banner banner) {
                xa xaVar = this.bannerBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(banner);
                    return this;
                }
                Banner banner2 = this.banner_;
                if (banner2 != null) {
                    this.banner_ = Banner.newBuilder(banner2).mergeFrom(banner).buildPartial();
                } else {
                    this.banner_ = banner;
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

            public Builder mergeNative(Native r22) {
                xa xaVar = this.nativeBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(r22);
                    return this;
                }
                Native r02 = this.native_;
                if (r02 != null) {
                    this.native_ = Native.newBuilder(r02).mergeFrom(r22).buildPartial();
                } else {
                    this.native_ = r22;
                }
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

            public Builder setAdm(String str) {
                str.getClass();
                this.adm_ = str;
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.adm_ = byteString;
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

            public Builder setBanner(Banner banner) {
                xa xaVar = this.bannerBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(banner);
                    return this;
                }
                banner.getClass();
                this.banner_ = banner;
                onChanged();
                return this;
            }

            public Builder setCurl(String str) {
                str.getClass();
                this.curl_ = str;
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.curl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEvent(int i10, Event event) {
                pa paVar = this.eventBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, event);
                    return this;
                }
                event.getClass();
                ensureEventIsMutable();
                this.event_.set(i10, event);
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

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, (int) str);
                onChanged();
                return this;
            }

            public Builder setNative(Native r22) {
                xa xaVar = this.nativeBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(r22);
                    return this;
                }
                r22.getClass();
                this.native_ = r22;
                onChanged();
                return this;
            }

            public Builder setType(int i10, DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10, int i11) {
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(i11));
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

            @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
            public ka getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Display build() {
                Display displayBuildPartial = buildPartial();
                if (displayBuildPartial.isInitialized()) {
                    return displayBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Display buildPartial() {
                Display display = new Display(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                display.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                display.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                display.type_ = this.type_;
                display.w_ = this.w_;
                display.h_ = this.h_;
                display.wratio_ = this.wratio_;
                display.hratio_ = this.hratio_;
                display.adm_ = this.adm_;
                display.curl_ = this.curl_;
                xa xaVar = this.bannerBuilder_;
                if (xaVar == null) {
                    display.banner_ = this.banner_;
                } else {
                    display.banner_ = (Banner) xaVar.build();
                }
                xa xaVar2 = this.nativeBuilder_;
                if (xaVar2 == null) {
                    display.native_ = this.native_;
                } else {
                    display.native_ = (Native) xaVar2.build();
                }
                pa paVar = this.eventBuilder_;
                if (paVar != null) {
                    display.event_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                        this.bitField0_ &= -9;
                    }
                    display.event_ = this.event_;
                }
                xa xaVar3 = this.extBuilder_;
                if (xaVar3 == null) {
                    display.ext_ = this.ext_;
                } else {
                    display.ext_ = (Struct) xaVar3.build();
                }
                pa paVar2 = this.extProtoBuilder_;
                if (paVar2 != null) {
                    display.extProto_ = paVar2.build();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -17;
                    }
                    display.extProto_ = this.extProto_;
                }
                onBuilt();
                return display;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Display getDefaultInstanceForType() {
                return Display.getDefaultInstance();
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

            public Event.Builder addEventBuilder(int i10) {
                return (Event.Builder) getEventFieldBuilder().addBuilder(i10, Event.getDefaultInstance());
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
                this.mime_ = f8.f22138e;
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.bitField0_ = i10 & (-8);
                this.w_ = 0;
                this.h_ = 0;
                this.wratio_ = 0;
                this.hratio_ = 0;
                this.adm_ = "";
                this.curl_ = "";
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                } else {
                    this.banner_ = null;
                    this.bannerBuilder_ = null;
                }
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                } else {
                    this.native_ = null;
                    this.nativeBuilder_ = null;
                }
                pa paVar = this.eventBuilder_;
                if (paVar == null) {
                    this.event_ = list;
                    this.bitField0_ = i10 & (-16);
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
                    this.extProto_ = list;
                    this.bitField0_ &= -17;
                    return this;
                }
                paVar2.clear();
                return this;
            }

            public Builder setBanner(Banner.Builder builder) {
                xa xaVar = this.bannerBuilder_;
                if (xaVar == null) {
                    this.banner_ = builder.build();
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

            public Builder setNative(Native.Builder builder) {
                xa xaVar = this.nativeBuilder_;
                if (xaVar == null) {
                    this.native_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder addEvent(int i10, Event event) {
                pa paVar = this.eventBuilder_;
                if (paVar == null) {
                    event.getClass();
                    ensureEventIsMutable();
                    this.event_.add(i10, event);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, event);
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
                if (message instanceof Display) {
                    return mergeFrom((Display) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEvent(int i10, Event.Builder builder) {
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

            public Builder mergeFrom(Display display) {
                if (display == Display.getDefaultInstance()) {
                    return this;
                }
                if (!display.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = display.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(display.mime_);
                    }
                    onChanged();
                }
                if (!display.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = display.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(display.api_);
                    }
                    onChanged();
                }
                if (!display.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = display.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(display.type_);
                    }
                    onChanged();
                }
                if (display.getW() != 0) {
                    setW(display.getW());
                }
                if (display.getH() != 0) {
                    setH(display.getH());
                }
                if (display.getWratio() != 0) {
                    setWratio(display.getWratio());
                }
                if (display.getHratio() != 0) {
                    setHratio(display.getHratio());
                }
                if (!display.getAdm().isEmpty()) {
                    this.adm_ = display.adm_;
                    onChanged();
                }
                if (!display.getCurl().isEmpty()) {
                    this.curl_ = display.curl_;
                    onChanged();
                }
                if (display.hasBanner()) {
                    mergeBanner(display.getBanner());
                }
                if (display.hasNative()) {
                    mergeNative(display.getNative());
                }
                if (this.eventBuilder_ == null) {
                    if (!display.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = display.event_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(display.event_);
                        }
                        onChanged();
                    }
                } else if (!display.event_.isEmpty()) {
                    if (!this.eventBuilder_.isEmpty()) {
                        this.eventBuilder_.addAllMessages(display.event_);
                    } else {
                        this.eventBuilder_.dispose();
                        this.eventBuilder_ = null;
                        this.event_ = display.event_;
                        this.bitField0_ &= -9;
                        this.eventBuilder_ = k7.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                    }
                }
                if (display.hasExt()) {
                    mergeExt(display.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!display.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = display.extProto_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(display.extProto_);
                        }
                        onChanged();
                    }
                } else if (!display.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(display.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = display.extProto_;
                        this.bitField0_ &= -17;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) display).unknownFields);
                onChanged();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.mime_ = f8.f22138e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addEvent(Event.Builder builder) {
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

            public Builder addEvent(int i10, Event.Builder builder) {
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
            public com.explorestack.protobuf.adcom.Ad.Display.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.access$16800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Display r3 = (com.explorestack.protobuf.adcom.Ad.Display) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Display r4 = (com.explorestack.protobuf.adcom.Ad.Display) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Builder");
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Native extends k7 implements NativeOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 2;
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int LINK_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private List<Asset> asset_;
            private List<Any> extProto_;
            private Struct ext_;
            private LinkAsset link_;
            private byte memoizedIsInitialized;
            private static final Native DEFAULT_INSTANCE = new Native();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Native parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Native(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Asset extends k7 implements AssetOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                public static final int EXT_FIELD_NUMBER = 9;
                public static final int EXT_PROTO_FIELD_NUMBER = 8;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMAGE_FIELD_NUMBER = 4;
                public static final int LABEL_FIELD_NUMBER = 10;
                public static final int LINK_FIELD_NUMBER = 7;
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                private DataAsset data_;
                private List<Any> extProto_;
                private Struct ext_;
                private int id_;
                private ImageAsset image_;
                private LabelAsset label_;
                private LinkAsset link_;
                private byte memoizedIsInitialized;
                private boolean req_;
                private TitleAsset title_;
                private VideoAsset video_;
                private static final Asset DEFAULT_INSTANCE = new Asset();
                private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.1
                    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                    public Asset parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        return new Asset(yVar, m5Var);
                    }
                };

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class DataAsset extends k7 implements DataAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 5;
                    public static final int EXT_PROTO_FIELD_NUMBER = 4;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 3;
                    public static final int VALUE_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private volatile Object value_;
                    private static final DataAsset DEFAULT_INSTANCE = new DataAsset();
                    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.1
                        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                        public DataAsset parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                            return new DataAsset(yVar, m5Var);
                        }
                    };

                    public static DataAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f21901v0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) k7.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static fa parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DataAsset)) {
                            return super.equals(obj);
                        }
                        DataAsset dataAsset = (DataAsset) obj;
                        if (getValue().equals(dataAsset.getValue()) && getLen() == dataAsset.getLen() && this.type_ == dataAsset.type_ && hasExt() == dataAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(dataAsset.getExt())) && getExtProtoList().equals(dataAsset.getExtProtoList()) && this.unknownFields.equals(dataAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public jb getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
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
                        int iComputeStringSize = !getValueBytes().isEmpty() ? k7.computeStringSize(1, this.value_) : 0;
                        int i11 = this.len_;
                        if (i11 != 0) {
                            iComputeStringSize += h0.computeUInt32Size(2, i11);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            iComputeStringSize += h0.computeEnumSize(3, this.type_);
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public NativeDataAssetType getType() {
                        NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                        return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                    public final gc getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int len = ((((getLen() + ((((getValue().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53) + this.type_;
                        if (hasExt()) {
                            len = o2.B(len, 37, 5, 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            len = o2.B(len, 37, 4, 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode = this.unknownFields.hashCode() + (len * 29);
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.k7
                    public i7 internalGetFieldAccessorTable() {
                        return b.f21903w0.ensureFieldAccessorsInitialized(DataAsset.class, Builder.class);
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
                        return new DataAsset();
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(h0 h0Var) throws IOException {
                        if (!getValueBytes().isEmpty()) {
                            k7.writeString(h0Var, 1, this.value_);
                        }
                        int i10 = this.len_;
                        if (i10 != 0) {
                            h0Var.writeUInt32(2, i10);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            h0Var.writeEnum(3, this.type_);
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
                    public static final class Builder extends o6 implements DataAssetOrBuilder {
                        private int bitField0_;
                        private xa extBuilder_;
                        private pa extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;
                        private Object value_;

                        private Builder() {
                            super(null);
                            this.value_ = "";
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
                            return b.f21901v0;
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

                        public Builder clearValue() {
                            this.value_ = DataAsset.getDefaultInstance().getValue();
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f21901v0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public jb getExtOrBuilder() {
                            xa xaVar = this.extBuilder_;
                            if (xaVar != null) {
                                return (jb) xaVar.getMessageOrBuilder();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getExtProtoCount() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.size() : paVar.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public NativeDataAssetType getType() {
                            NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                            return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public String getValue() {
                            Object obj = this.value_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.value_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public ByteString getValueBytes() {
                            Object obj = this.value_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.value_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.o6
                        public i7 internalGetFieldAccessorTable() {
                            return b.f21903w0.ensureFieldAccessorsInitialized(DataAsset.class, Builder.class);
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
                        public DataAsset build() {
                            DataAsset dataAssetBuildPartial = buildPartial();
                            if (dataAssetBuildPartial.isInitialized()) {
                                return dataAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAsset buildPartial() {
                            DataAsset dataAsset = new DataAsset(this);
                            dataAsset.value_ = this.value_;
                            dataAsset.len_ = this.len_;
                            dataAsset.type_ = this.type_;
                            xa xaVar = this.extBuilder_;
                            if (xaVar == null) {
                                dataAsset.ext_ = this.ext_;
                            } else {
                                dataAsset.ext_ = (Struct) xaVar.build();
                            }
                            pa paVar = this.extProtoBuilder_;
                            if (paVar != null) {
                                dataAsset.extProto_ = paVar.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                dataAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return dataAsset;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                        public DataAsset getDefaultInstanceForType() {
                            return DataAsset.getDefaultInstance();
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
                            this.value_ = "";
                            this.len_ = 0;
                            this.type_ = 0;
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
                            if (message instanceof DataAsset) {
                                return mergeFrom((DataAsset) message);
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
                            this.value_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(DataAsset dataAsset) {
                            if (dataAsset == DataAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!dataAsset.getValue().isEmpty()) {
                                this.value_ = dataAsset.value_;
                                onChanged();
                            }
                            if (dataAsset.getLen() != 0) {
                                setLen(dataAsset.getLen());
                            }
                            if (dataAsset.type_ != 0) {
                                setTypeValue(dataAsset.getTypeValue());
                            }
                            if (dataAsset.hasExt()) {
                                mergeExt(dataAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(dataAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((k7) dataAsset).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.access$10100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(DataAsset dataAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAsset);
                    }

                    public static DataAsset parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(byteBuffer, m5Var);
                    }

                    private DataAsset(o6 o6Var) {
                        super(o6Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (DataAsset) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static DataAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public DataAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static DataAsset parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(byteString, m5Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private DataAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.value_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static DataAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(bArr);
                    }

                    @Override // com.explorestack.protobuf.k7
                    public Builder newBuilderForType(p6 p6Var) {
                        return new Builder(p6Var);
                    }

                    public static DataAsset parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                        return (DataAsset) PARSER.parseFrom(bArr, m5Var);
                    }

                    public static DataAsset parseFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) k7.parseWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (DataAsset) k7.parseWithIOException(PARSER, inputStream, m5Var);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private DataAsset(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                                this.value_ = yVar.readStringRequireUtf8();
                                            } else if (tag == 16) {
                                                this.len_ = yVar.readUInt32();
                                            } else if (tag == 24) {
                                                this.type_ = yVar.readEnum();
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

                    public static DataAsset parseFrom(y yVar) throws IOException {
                        return (DataAsset) k7.parseWithIOException(PARSER, yVar);
                    }

                    public static DataAsset parseFrom(y yVar, m5 m5Var) throws IOException {
                        return (DataAsset) k7.parseWithIOException(PARSER, yVar, m5Var);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public interface DataAssetOrBuilder extends MessageOrBuilder {
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

                    String getValue();

                    ByteString getValueBytes();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class ImageAsset extends k7 implements ImageAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 6;
                    public static final int EXT_PROTO_FIELD_NUMBER = 5;
                    public static final int H_FIELD_NUMBER = 3;
                    public static final int TYPE_FIELD_NUMBER = 4;
                    public static final int URL_FIELD_NUMBER = 1;
                    public static final int W_FIELD_NUMBER = 2;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int h_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private volatile Object url_;
                    private int w_;
                    private static final ImageAsset DEFAULT_INSTANCE = new ImageAsset();
                    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.1
                        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                        public ImageAsset parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                            return new ImageAsset(yVar, m5Var);
                        }
                    };

                    public static ImageAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f21893r0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) k7.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static fa parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ImageAsset)) {
                            return super.equals(obj);
                        }
                        ImageAsset imageAsset = (ImageAsset) obj;
                        if (getUrl().equals(imageAsset.getUrl()) && getW() == imageAsset.getW() && getH() == imageAsset.getH() && this.type_ == imageAsset.type_ && hasExt() == imageAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(imageAsset.getExt())) && getExtProtoList().equals(imageAsset.getExtProtoList()) && this.unknownFields.equals(imageAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public jb getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getH() {
                        return this.h_;
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
                        int iComputeStringSize = !getUrlBytes().isEmpty() ? k7.computeStringSize(1, this.url_) : 0;
                        int i11 = this.w_;
                        if (i11 != 0) {
                            iComputeStringSize += h0.computeUInt32Size(2, i11);
                        }
                        int i12 = this.h_;
                        if (i12 != 0) {
                            iComputeStringSize += h0.computeUInt32Size(3, i12);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            iComputeStringSize += h0.computeEnumSize(4, this.type_);
                        }
                        for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                            iComputeStringSize += h0.computeMessageSize(5, this.extProto_.get(i13));
                        }
                        if (this.ext_ != null) {
                            iComputeStringSize += h0.computeMessageSize(6, getExt());
                        }
                        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public NativeImageAssetType getType() {
                        NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                        return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                    public final gc getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public String getUrl() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.url_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public ByteString getUrlBytes() {
                        Object obj = this.url_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.url_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int h10 = ((((getH() + ((((getW() + ((((getUrl().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53) + this.type_;
                        if (hasExt()) {
                            h10 = getExt().hashCode() + o2.B(h10, 37, 6, 53);
                        }
                        if (getExtProtoCount() > 0) {
                            h10 = getExtProtoList().hashCode() + o2.B(h10, 37, 5, 53);
                        }
                        int iHashCode = this.unknownFields.hashCode() + (h10 * 29);
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.k7
                    public i7 internalGetFieldAccessorTable() {
                        return b.f21895s0.ensureFieldAccessorsInitialized(ImageAsset.class, Builder.class);
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
                        return new ImageAsset();
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(h0 h0Var) throws IOException {
                        if (!getUrlBytes().isEmpty()) {
                            k7.writeString(h0Var, 1, this.url_);
                        }
                        int i10 = this.w_;
                        if (i10 != 0) {
                            h0Var.writeUInt32(2, i10);
                        }
                        int i11 = this.h_;
                        if (i11 != 0) {
                            h0Var.writeUInt32(3, i11);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            h0Var.writeEnum(4, this.type_);
                        }
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            h0Var.writeMessage(5, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            h0Var.writeMessage(6, getExt());
                        }
                        this.unknownFields.writeTo(h0Var);
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    public static final class Builder extends o6 implements ImageAssetOrBuilder {
                        private int bitField0_;
                        private xa extBuilder_;
                        private pa extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int h_;
                        private int type_;
                        private Object url_;
                        private int w_;

                        private Builder() {
                            super(null);
                            this.url_ = "";
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
                            return b.f21893r0;
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

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearUrl() {
                            this.url_ = ImageAsset.getDefaultInstance().getUrl();
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f21893r0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public jb getExtOrBuilder() {
                            xa xaVar = this.extBuilder_;
                            if (xaVar != null) {
                                return (jb) xaVar.getMessageOrBuilder();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getExtProtoCount() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.size() : paVar.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public NativeImageAssetType getType() {
                            NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                            return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public String getUrl() {
                            Object obj = this.url_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.url_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public ByteString getUrlBytes() {
                            Object obj = this.url_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.url_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.o6
                        public i7 internalGetFieldAccessorTable() {
                            return b.f21895s0.ensureFieldAccessorsInitialized(ImageAsset.class, Builder.class);
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

                        public Builder setUrl(String str) {
                            str.getClass();
                            this.url_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setUrlBytes(ByteString byteString) throws IllegalArgumentException {
                            byteString.getClass();
                            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                            this.url_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setW(int i10) {
                            this.w_ = i10;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAsset build() {
                            ImageAsset imageAssetBuildPartial = buildPartial();
                            if (imageAssetBuildPartial.isInitialized()) {
                                return imageAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) imageAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAsset buildPartial() {
                            ImageAsset imageAsset = new ImageAsset(this);
                            imageAsset.url_ = this.url_;
                            imageAsset.w_ = this.w_;
                            imageAsset.h_ = this.h_;
                            imageAsset.type_ = this.type_;
                            xa xaVar = this.extBuilder_;
                            if (xaVar == null) {
                                imageAsset.ext_ = this.ext_;
                            } else {
                                imageAsset.ext_ = (Struct) xaVar.build();
                            }
                            pa paVar = this.extProtoBuilder_;
                            if (paVar != null) {
                                imageAsset.extProto_ = paVar.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                imageAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return imageAsset;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                        public ImageAsset getDefaultInstanceForType() {
                            return ImageAsset.getDefaultInstance();
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
                            this.url_ = "";
                            this.w_ = 0;
                            this.h_ = 0;
                            this.type_ = 0;
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
                            if (message instanceof ImageAsset) {
                                return mergeFrom((ImageAsset) message);
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
                            this.url_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(ImageAsset imageAsset) {
                            if (imageAsset == ImageAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!imageAsset.getUrl().isEmpty()) {
                                this.url_ = imageAsset.url_;
                                onChanged();
                            }
                            if (imageAsset.getW() != 0) {
                                setW(imageAsset.getW());
                            }
                            if (imageAsset.getH() != 0) {
                                setH(imageAsset.getH());
                            }
                            if (imageAsset.type_ != 0) {
                                setTypeValue(imageAsset.getTypeValue());
                            }
                            if (imageAsset.hasExt()) {
                                mergeExt(imageAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(imageAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((k7) imageAsset).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.access$7300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(ImageAsset imageAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAsset);
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(byteBuffer, m5Var);
                    }

                    private ImageAsset(o6 o6Var) {
                        super(o6Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (ImageAsset) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static ImageAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public ImageAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static ImageAsset parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(byteString, m5Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private ImageAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.url_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static ImageAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(bArr);
                    }

                    @Override // com.explorestack.protobuf.k7
                    public Builder newBuilderForType(p6 p6Var) {
                        return new Builder(p6Var);
                    }

                    public static ImageAsset parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                        return (ImageAsset) PARSER.parseFrom(bArr, m5Var);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) k7.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (ImageAsset) k7.parseWithIOException(PARSER, inputStream, m5Var);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private ImageAsset(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                            this.url_ = yVar.readStringRequireUtf8();
                                        } else if (tag == 16) {
                                            this.w_ = yVar.readUInt32();
                                        } else if (tag == 24) {
                                            this.h_ = yVar.readUInt32();
                                        } else if (tag == 32) {
                                            this.type_ = yVar.readEnum();
                                        } else if (tag == 42) {
                                            if (!z11) {
                                                this.extProto_ = new ArrayList();
                                                z11 = true;
                                            }
                                            this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                        } else if (tag != 50) {
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

                    public static ImageAsset parseFrom(y yVar) throws IOException {
                        return (ImageAsset) k7.parseWithIOException(PARSER, yVar);
                    }

                    public static ImageAsset parseFrom(y yVar, m5 m5Var) throws IOException {
                        return (ImageAsset) k7.parseWithIOException(PARSER, yVar, m5Var);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public interface ImageAssetOrBuilder extends MessageOrBuilder {
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

                    NativeImageAssetType getType();

                    int getTypeValue();

                    String getUrl();

                    ByteString getUrlBytes();

                    int getW();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class LabelAsset extends k7 implements LabelAssetOrBuilder {
                    public static final int CONTENT_FIELD_NUMBER = 1;
                    public static final int H_FIELD_NUMBER = 3;
                    public static final int POS_FIELD_NUMBER = 4;
                    public static final int W_FIELD_NUMBER = 2;
                    private static final long serialVersionUID = 0;
                    private volatile Object content_;
                    private int h_;
                    private byte memoizedIsInitialized;
                    private int pos_;
                    private int w_;
                    private static final LabelAsset DEFAULT_INSTANCE = new LabelAsset();
                    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset.1
                        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                        public LabelAsset parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                            return new LabelAsset(yVar, m5Var);
                        }
                    };

                    public static LabelAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f21905x0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static LabelAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (LabelAsset) k7.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static LabelAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static fa parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof LabelAsset)) {
                            return super.equals(obj);
                        }
                        LabelAsset labelAsset = (LabelAsset) obj;
                        return getContent().equals(labelAsset.getContent()) && getW() == labelAsset.getW() && getH() == labelAsset.getH() && this.pos_ == labelAsset.pos_ && this.unknownFields.equals(labelAsset.unknownFields);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public String getContent() {
                        Object obj = this.content_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.content_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public ByteString getContentBytes() {
                        Object obj = this.content_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.content_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public int getH() {
                        return this.h_;
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public fa getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public NativeAssetPosition getPos() {
                        NativeAssetPosition nativeAssetPositionValueOf = NativeAssetPosition.valueOf(this.pos_);
                        return nativeAssetPositionValueOf == null ? NativeAssetPosition.UNRECOGNIZED : nativeAssetPositionValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public int getPosValue() {
                        return this.pos_;
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iComputeStringSize = !getContentBytes().isEmpty() ? k7.computeStringSize(1, this.content_) : 0;
                        int i11 = this.w_;
                        if (i11 != 0) {
                            iComputeStringSize += h0.computeUInt32Size(2, i11);
                        }
                        int i12 = this.h_;
                        if (i12 != 0) {
                            iComputeStringSize += h0.computeUInt32Size(3, i12);
                        }
                        if (this.pos_ != NativeAssetPosition.ASSET_POSITION_TOP_LEFT.getNumber()) {
                            iComputeStringSize += h0.computeEnumSize(4, this.pos_);
                        }
                        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                    public final gc getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = this.unknownFields.hashCode() + ((((((getH() + ((((getW() + ((((getContent().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53) + this.pos_) * 29);
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.k7
                    public i7 internalGetFieldAccessorTable() {
                        return b.f21907y0.ensureFieldAccessorsInitialized(LabelAsset.class, Builder.class);
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
                        return new LabelAsset();
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(h0 h0Var) throws IOException {
                        if (!getContentBytes().isEmpty()) {
                            k7.writeString(h0Var, 1, this.content_);
                        }
                        int i10 = this.w_;
                        if (i10 != 0) {
                            h0Var.writeUInt32(2, i10);
                        }
                        int i11 = this.h_;
                        if (i11 != 0) {
                            h0Var.writeUInt32(3, i11);
                        }
                        if (this.pos_ != NativeAssetPosition.ASSET_POSITION_TOP_LEFT.getNumber()) {
                            h0Var.writeEnum(4, this.pos_);
                        }
                        this.unknownFields.writeTo(h0Var);
                    }

                    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                    public static final class Builder extends o6 implements LabelAssetOrBuilder {
                        private Object content_;
                        private int h_;
                        private int pos_;
                        private int w_;

                        private Builder() {
                            super(null);
                            this.content_ = "";
                            this.pos_ = 0;
                            maybeForceBuilderInitialization();
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.f21905x0;
                        }

                        private void maybeForceBuilderInitialization() {
                            boolean unused = k7.alwaysUseFieldBuilders;
                        }

                        public Builder clearContent() {
                            this.content_ = LabelAsset.getDefaultInstance().getContent();
                            onChanged();
                            return this;
                        }

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearPos() {
                            this.pos_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public String getContent() {
                            Object obj = this.content_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.content_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public ByteString getContentBytes() {
                            Object obj = this.content_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.content_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f21905x0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public NativeAssetPosition getPos() {
                            NativeAssetPosition nativeAssetPositionValueOf = NativeAssetPosition.valueOf(this.pos_);
                            return nativeAssetPositionValueOf == null ? NativeAssetPosition.UNRECOGNIZED : nativeAssetPositionValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public int getPosValue() {
                            return this.pos_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAssetOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.o6
                        public i7 internalGetFieldAccessorTable() {
                            return b.f21907y0.ensureFieldAccessorsInitialized(LabelAsset.class, Builder.class);
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        public Builder setContent(String str) {
                            str.getClass();
                            this.content_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setContentBytes(ByteString byteString) throws IllegalArgumentException {
                            byteString.getClass();
                            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                            this.content_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setH(int i10) {
                            this.h_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setPos(NativeAssetPosition nativeAssetPosition) {
                            nativeAssetPosition.getClass();
                            this.pos_ = nativeAssetPosition.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setPosValue(int i10) {
                            this.pos_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setW(int i10) {
                            this.w_ = i10;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public LabelAsset build() {
                            LabelAsset labelAssetBuildPartial = buildPartial();
                            if (labelAssetBuildPartial.isInitialized()) {
                                return labelAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) labelAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public LabelAsset buildPartial() {
                            LabelAsset labelAsset = new LabelAsset(this);
                            labelAsset.content_ = this.content_;
                            labelAsset.w_ = this.w_;
                            labelAsset.h_ = this.h_;
                            labelAsset.pos_ = this.pos_;
                            onBuilt();
                            return labelAsset;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                        public LabelAsset getDefaultInstanceForType() {
                            return LabelAsset.getDefaultInstance();
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
                            this.content_ = "";
                            this.w_ = 0;
                            this.h_ = 0;
                            this.pos_ = 0;
                            return this;
                        }

                        private Builder(p6 p6Var) {
                            super(p6Var);
                            this.content_ = "";
                            this.pos_ = 0;
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                        /* renamed from: clone */
                        public Builder mo500clone() {
                            return (Builder) super.mo500clone();
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(Message message) {
                            if (message instanceof LabelAsset) {
                                return mergeFrom((LabelAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(LabelAsset labelAsset) {
                            if (labelAsset == LabelAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!labelAsset.getContent().isEmpty()) {
                                this.content_ = labelAsset.content_;
                                onChanged();
                            }
                            if (labelAsset.getW() != 0) {
                                setW(labelAsset.getW());
                            }
                            if (labelAsset.getH() != 0) {
                                setH(labelAsset.getH());
                            }
                            if (labelAsset.pos_ != 0) {
                                setPosValue(labelAsset.getPosValue());
                            }
                            mergeUnknownFields(((k7) labelAsset).unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset.access$11300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$LabelAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$LabelAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.LabelAsset.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$LabelAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(LabelAsset labelAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(labelAsset);
                    }

                    public static LabelAsset parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(byteBuffer, m5Var);
                    }

                    private LabelAsset(o6 o6Var) {
                        super(o6Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static LabelAsset parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (LabelAsset) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static LabelAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public LabelAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static LabelAsset parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(byteString, m5Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private LabelAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.content_ = "";
                        this.pos_ = 0;
                    }

                    public static LabelAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(bArr);
                    }

                    @Override // com.explorestack.protobuf.k7
                    public Builder newBuilderForType(p6 p6Var) {
                        return new Builder(p6Var);
                    }

                    public static LabelAsset parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                        return (LabelAsset) PARSER.parseFrom(bArr, m5Var);
                    }

                    public static LabelAsset parseFrom(InputStream inputStream) throws IOException {
                        return (LabelAsset) k7.parseWithIOException(PARSER, inputStream);
                    }

                    private LabelAsset(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                            this.content_ = yVar.readStringRequireUtf8();
                                        } else if (tag == 16) {
                                            this.w_ = yVar.readUInt32();
                                        } else if (tag == 24) {
                                            this.h_ = yVar.readUInt32();
                                        } else if (tag != 32) {
                                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                            }
                                        } else {
                                            this.pos_ = yVar.readEnum();
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

                    public static LabelAsset parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (LabelAsset) k7.parseWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static LabelAsset parseFrom(y yVar) throws IOException {
                        return (LabelAsset) k7.parseWithIOException(PARSER, yVar);
                    }

                    public static LabelAsset parseFrom(y yVar, m5 m5Var) throws IOException {
                        return (LabelAsset) k7.parseWithIOException(PARSER, yVar, m5Var);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public interface LabelAssetOrBuilder extends MessageOrBuilder {
                    String getContent();

                    ByteString getContentBytes();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ MessageLite getDefaultInstanceForType();

                    int getH();

                    NativeAssetPosition getPos();

                    int getPosValue();

                    int getW();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class TitleAsset extends k7 implements TitleAssetOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TEXT_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private volatile Object text_;
                    private static final TitleAsset DEFAULT_INSTANCE = new TitleAsset();
                    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.1
                        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                        public TitleAsset parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                            return new TitleAsset(yVar, m5Var);
                        }
                    };

                    public static TitleAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f21889p0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) k7.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static fa parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof TitleAsset)) {
                            return super.equals(obj);
                        }
                        TitleAsset titleAsset = (TitleAsset) obj;
                        if (getText().equals(titleAsset.getText()) && getLen() == titleAsset.getLen() && hasExt() == titleAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(titleAsset.getExt())) && getExtProtoList().equals(titleAsset.getExtProtoList()) && this.unknownFields.equals(titleAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public jb getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
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
                        int iComputeStringSize = !getTextBytes().isEmpty() ? k7.computeStringSize(1, this.text_) : 0;
                        int i11 = this.len_;
                        if (i11 != 0) {
                            iComputeStringSize += h0.computeUInt32Size(2, i11);
                        }
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            iComputeStringSize += h0.computeMessageSize(3, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            iComputeStringSize += h0.computeMessageSize(4, getExt());
                        }
                        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public String getText() {
                        Object obj = this.text_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.text_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public ByteString getTextBytes() {
                        Object obj = this.text_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.text_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                    public final gc getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int len = getLen() + ((((getText().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                        if (hasExt()) {
                            len = o2.B(len, 37, 4, 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            len = o2.B(len, 37, 3, 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode = this.unknownFields.hashCode() + (len * 29);
                        this.memoizedHashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.explorestack.protobuf.k7
                    public i7 internalGetFieldAccessorTable() {
                        return b.f21891q0.ensureFieldAccessorsInitialized(TitleAsset.class, Builder.class);
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
                        return new TitleAsset();
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(h0 h0Var) throws IOException {
                        if (!getTextBytes().isEmpty()) {
                            k7.writeString(h0Var, 1, this.text_);
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
                    public static final class Builder extends o6 implements TitleAssetOrBuilder {
                        private int bitField0_;
                        private xa extBuilder_;
                        private pa extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private Object text_;

                        private Builder() {
                            super(null);
                            this.text_ = "";
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
                            return b.f21889p0;
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

                        public Builder clearText() {
                            this.text_ = TitleAsset.getDefaultInstance().getText();
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f21889p0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public jb getExtOrBuilder() {
                            xa xaVar = this.extBuilder_;
                            if (xaVar != null) {
                                return (jb) xaVar.getMessageOrBuilder();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public int getExtProtoCount() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.size() : paVar.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public String getText() {
                            Object obj = this.text_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.text_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public ByteString getTextBytes() {
                            Object obj = this.text_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.text_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.o6
                        public i7 internalGetFieldAccessorTable() {
                            return b.f21891q0.ensureFieldAccessorsInitialized(TitleAsset.class, Builder.class);
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

                        public Builder setText(String str) {
                            str.getClass();
                            this.text_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setTextBytes(ByteString byteString) throws IllegalArgumentException {
                            byteString.getClass();
                            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                            this.text_ = byteString;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAsset build() {
                            TitleAsset titleAssetBuildPartial = buildPartial();
                            if (titleAssetBuildPartial.isInitialized()) {
                                return titleAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) titleAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAsset buildPartial() {
                            TitleAsset titleAsset = new TitleAsset(this);
                            titleAsset.text_ = this.text_;
                            titleAsset.len_ = this.len_;
                            xa xaVar = this.extBuilder_;
                            if (xaVar == null) {
                                titleAsset.ext_ = this.ext_;
                            } else {
                                titleAsset.ext_ = (Struct) xaVar.build();
                            }
                            pa paVar = this.extProtoBuilder_;
                            if (paVar != null) {
                                titleAsset.extProto_ = paVar.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                titleAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return titleAsset;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                        public TitleAsset getDefaultInstanceForType() {
                            return TitleAsset.getDefaultInstance();
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
                            this.text_ = "";
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
                            this.text_ = "";
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
                            if (message instanceof TitleAsset) {
                                return mergeFrom((TitleAsset) message);
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

                        public Builder mergeFrom(TitleAsset titleAsset) {
                            if (titleAsset == TitleAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!titleAsset.getText().isEmpty()) {
                                this.text_ = titleAsset.text_;
                                onChanged();
                            }
                            if (titleAsset.getLen() != 0) {
                                setLen(titleAsset.getLen());
                            }
                            if (titleAsset.hasExt()) {
                                mergeExt(titleAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(titleAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((k7) titleAsset).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.access$5800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(TitleAsset titleAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAsset);
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(byteBuffer, m5Var);
                    }

                    private TitleAsset(o6 o6Var) {
                        super(o6Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (TitleAsset) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static TitleAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public TitleAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static TitleAsset parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(byteString, m5Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private TitleAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.text_ = "";
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static TitleAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(bArr);
                    }

                    @Override // com.explorestack.protobuf.k7
                    public Builder newBuilderForType(p6 p6Var) {
                        return new Builder(p6Var);
                    }

                    public static TitleAsset parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                        return (TitleAsset) PARSER.parseFrom(bArr, m5Var);
                    }

                    public static TitleAsset parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) k7.parseWithIOException(PARSER, inputStream);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private TitleAsset(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                            this.text_ = yVar.readStringRequireUtf8();
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

                    public static TitleAsset parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (TitleAsset) k7.parseWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static TitleAsset parseFrom(y yVar) throws IOException {
                        return (TitleAsset) k7.parseWithIOException(PARSER, yVar);
                    }

                    public static TitleAsset parseFrom(y yVar, m5 m5Var) throws IOException {
                        return (TitleAsset) k7.parseWithIOException(PARSER, yVar, m5Var);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public interface TitleAssetOrBuilder extends MessageOrBuilder {
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

                    String getText();

                    ByteString getTextBytes();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class VideoAsset extends k7 implements VideoAssetOrBuilder {
                    public static final int ADM_FIELD_NUMBER = 1;
                    public static final int CURL_FIELD_NUMBER = 2;
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    private volatile Object adm_;
                    private volatile Object curl_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private byte memoizedIsInitialized;
                    private static final VideoAsset DEFAULT_INSTANCE = new VideoAsset();
                    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.1
                        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                        public VideoAsset parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                            return new VideoAsset(yVar, m5Var);
                        }
                    };

                    public static VideoAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f21897t0;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) k7.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(byteBuffer);
                    }

                    public static fa parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof VideoAsset)) {
                            return super.equals(obj);
                        }
                        VideoAsset videoAsset = (VideoAsset) obj;
                        if (getAdm().equals(videoAsset.getAdm()) && getCurl().equals(videoAsset.getCurl()) && hasExt() == videoAsset.hasExt()) {
                            return (!hasExt() || getExt().equals(videoAsset.getExt())) && getExtProtoList().equals(videoAsset.getExtProtoList()) && this.unknownFields.equals(videoAsset.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public String getAdm() {
                        Object obj = this.adm_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.adm_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public ByteString getAdmBytes() {
                        Object obj = this.adm_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.adm_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public String getCurl() {
                        Object obj = this.curl_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.curl_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public ByteString getCurlBytes() {
                        Object obj = this.curl_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.curl_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public jb getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
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
                        int iComputeStringSize = !getAdmBytes().isEmpty() ? k7.computeStringSize(1, this.adm_) : 0;
                        if (!getCurlBytes().isEmpty()) {
                            iComputeStringSize += k7.computeStringSize(2, this.curl_);
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = getCurl().hashCode() + ((((getAdm().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
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
                        return b.f21899u0.ensureFieldAccessorsInitialized(VideoAsset.class, Builder.class);
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
                        return new VideoAsset();
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(h0 h0Var) throws IOException {
                        if (!getAdmBytes().isEmpty()) {
                            k7.writeString(h0Var, 1, this.adm_);
                        }
                        if (!getCurlBytes().isEmpty()) {
                            k7.writeString(h0Var, 2, this.curl_);
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
                    public static final class Builder extends o6 implements VideoAssetOrBuilder {
                        private Object adm_;
                        private int bitField0_;
                        private Object curl_;
                        private xa extBuilder_;
                        private pa extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;

                        private Builder() {
                            super(null);
                            this.adm_ = "";
                            this.curl_ = "";
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
                            return b.f21897t0;
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

                        public Builder clearAdm() {
                            this.adm_ = VideoAsset.getDefaultInstance().getAdm();
                            onChanged();
                            return this;
                        }

                        public Builder clearCurl() {
                            this.curl_ = VideoAsset.getDefaultInstance().getCurl();
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public String getAdm() {
                            Object obj = this.adm_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.adm_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public ByteString getAdmBytes() {
                            Object obj = this.adm_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.adm_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public String getCurl() {
                            Object obj = this.curl_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.curl_ = stringUtf8;
                            return stringUtf8;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public ByteString getCurlBytes() {
                            Object obj = this.curl_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.curl_ = byteStringCopyFromUtf8;
                            return byteStringCopyFromUtf8;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.f21897t0;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public jb getExtOrBuilder() {
                            xa xaVar = this.extBuilder_;
                            if (xaVar != null) {
                                return (jb) xaVar.getMessageOrBuilder();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
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

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public int getExtProtoCount() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.size() : paVar.getCount();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public List<Any> getExtProtoList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                            pa paVar = this.extProtoBuilder_;
                            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                            pa paVar = this.extProtoBuilder_;
                            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAssetOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.o6
                        public i7 internalGetFieldAccessorTable() {
                            return b.f21899u0.ensureFieldAccessorsInitialized(VideoAsset.class, Builder.class);
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

                        public Builder setAdm(String str) {
                            str.getClass();
                            this.adm_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setAdmBytes(ByteString byteString) throws IllegalArgumentException {
                            byteString.getClass();
                            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                            this.adm_ = byteString;
                            onChanged();
                            return this;
                        }

                        public Builder setCurl(String str) {
                            str.getClass();
                            this.curl_ = str;
                            onChanged();
                            return this;
                        }

                        public Builder setCurlBytes(ByteString byteString) throws IllegalArgumentException {
                            byteString.getClass();
                            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                            this.curl_ = byteString;
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
                        public VideoAsset build() {
                            VideoAsset videoAssetBuildPartial = buildPartial();
                            if (videoAssetBuildPartial.isInitialized()) {
                                return videoAssetBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoAssetBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public VideoAsset buildPartial() {
                            VideoAsset videoAsset = new VideoAsset(this);
                            videoAsset.adm_ = this.adm_;
                            videoAsset.curl_ = this.curl_;
                            xa xaVar = this.extBuilder_;
                            if (xaVar == null) {
                                videoAsset.ext_ = this.ext_;
                            } else {
                                videoAsset.ext_ = (Struct) xaVar.build();
                            }
                            pa paVar = this.extProtoBuilder_;
                            if (paVar != null) {
                                videoAsset.extProto_ = paVar.build();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                videoAsset.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return videoAsset;
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                        public VideoAsset getDefaultInstanceForType() {
                            return VideoAsset.getDefaultInstance();
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
                            this.adm_ = "";
                            this.curl_ = "";
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
                            if (message instanceof VideoAsset) {
                                return mergeFrom((VideoAsset) message);
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
                            this.adm_ = "";
                            this.curl_ = "";
                            this.extProto_ = Collections.EMPTY_LIST;
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(VideoAsset videoAsset) {
                            if (videoAsset == VideoAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!videoAsset.getAdm().isEmpty()) {
                                this.adm_ = videoAsset.adm_;
                                onChanged();
                            }
                            if (!videoAsset.getCurl().isEmpty()) {
                                this.curl_ = videoAsset.curl_;
                                onChanged();
                            }
                            if (videoAsset.hasExt()) {
                                mergeExt(videoAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!videoAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = videoAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(videoAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!videoAsset.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.addAllMessages(videoAsset.extProto_);
                                } else {
                                    this.extProtoBuilder_.dispose();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = videoAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((k7) videoAsset).unknownFields);
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
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.access$8600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset) r4     // Catch: java.lang.Throwable -> L11
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
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset$Builder");
                        }
                    }

                    public static Builder newBuilder(VideoAsset videoAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoAsset);
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(byteBuffer, m5Var);
                    }

                    private VideoAsset(o6 o6Var) {
                        super(o6Var);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (VideoAsset) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                    }

                    public static VideoAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public VideoAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static VideoAsset parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(byteString, m5Var);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private VideoAsset() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.adm_ = "";
                        this.curl_ = "";
                        this.extProto_ = Collections.EMPTY_LIST;
                    }

                    public static VideoAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(bArr);
                    }

                    @Override // com.explorestack.protobuf.k7
                    public Builder newBuilderForType(p6 p6Var) {
                        return new Builder(p6Var);
                    }

                    public static VideoAsset parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                        return (VideoAsset) PARSER.parseFrom(bArr, m5Var);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) k7.parseWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                        return (VideoAsset) k7.parseWithIOException(PARSER, inputStream, m5Var);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    private VideoAsset(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                            this.adm_ = yVar.readStringRequireUtf8();
                                        } else if (tag == 18) {
                                            this.curl_ = yVar.readStringRequireUtf8();
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

                    public static VideoAsset parseFrom(y yVar) throws IOException {
                        return (VideoAsset) k7.parseWithIOException(PARSER, yVar);
                    }

                    public static VideoAsset parseFrom(y yVar, m5 m5Var) throws IOException {
                        return (VideoAsset) k7.parseWithIOException(PARSER, yVar, m5Var);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public interface VideoAssetOrBuilder extends MessageOrBuilder {
                    String getAdm();

                    ByteString getAdmBytes();

                    String getCurl();

                    ByteString getCurlBytes();

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

                public static Asset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f21885n0;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Asset) k7.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(byteBuffer);
                }

                public static fa parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Asset)) {
                        return super.equals(obj);
                    }
                    Asset asset = (Asset) obj;
                    if (getId() != asset.getId() || getReq() != asset.getReq() || hasTitle() != asset.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(asset.getTitle())) || hasImage() != asset.hasImage()) {
                        return false;
                    }
                    if ((hasImage() && !getImage().equals(asset.getImage())) || hasVideo() != asset.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(asset.getVideo())) || hasData() != asset.hasData()) {
                        return false;
                    }
                    if ((hasData() && !getData().equals(asset.getData())) || hasLink() != asset.hasLink()) {
                        return false;
                    }
                    if ((hasLink() && !getLink().equals(asset.getLink())) || hasLabel() != asset.hasLabel()) {
                        return false;
                    }
                    if ((!hasLabel() || getLabel().equals(asset.getLabel())) && hasExt() == asset.hasExt()) {
                        return (!hasExt() || getExt().equals(asset.getExt())) && getExtProtoList().equals(asset.getExtProtoList()) && this.unknownFields.equals(asset.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public DataAsset getData() {
                    DataAsset dataAsset = this.data_;
                    return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public DataAssetOrBuilder getDataOrBuilder() {
                    return getData();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public jb getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public int getId() {
                    return this.id_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public ImageAsset getImage() {
                    ImageAsset imageAsset = this.image_;
                    return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public ImageAssetOrBuilder getImageOrBuilder() {
                    return getImage();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LabelAsset getLabel() {
                    LabelAsset labelAsset = this.label_;
                    return labelAsset == null ? LabelAsset.getDefaultInstance() : labelAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LabelAssetOrBuilder getLabelOrBuilder() {
                    return getLabel();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LinkAsset getLink() {
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public LinkAssetOrBuilder getLinkOrBuilder() {
                    return getLink();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public fa getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
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
                    if (this.image_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(4, getImage());
                    }
                    if (this.video_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(5, getVideo());
                    }
                    if (this.data_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(6, getData());
                    }
                    if (this.link_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(7, getLink());
                    }
                    for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                        iComputeUInt32Size += h0.computeMessageSize(8, this.extProto_.get(i12));
                    }
                    if (this.ext_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(9, getExt());
                    }
                    if (this.label_ != null) {
                        iComputeUInt32Size += h0.computeMessageSize(10, getLabel());
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + iComputeUInt32Size;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public TitleAsset getTitle() {
                    TitleAsset titleAsset = this.title_;
                    return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public TitleAssetOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                public final gc getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public VideoAsset getVideo() {
                    VideoAsset videoAsset = this.video_;
                    return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public VideoAssetOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasData() {
                    return this.data_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasImage() {
                    return this.image_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasLabel() {
                    return this.label_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasLink() {
                    return this.link_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                public boolean hasTitle() {
                    return this.title_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
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
                    if (hasImage()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 4, 53) + getImage().hashCode();
                    }
                    if (hasVideo()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 5, 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 6, 53) + getData().hashCode();
                    }
                    if (hasLink()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 7, 53) + getLink().hashCode();
                    }
                    if (hasLabel()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 10, 53) + getLabel().hashCode();
                    }
                    if (hasExt()) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 9, 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iHashBoolean = o2.B(iHashBoolean, 37, 8, 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode = this.unknownFields.hashCode() + (iHashBoolean * 29);
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.explorestack.protobuf.k7
                public i7 internalGetFieldAccessorTable() {
                    return b.f21887o0.ensureFieldAccessorsInitialized(Asset.class, Builder.class);
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
                    return new Asset();
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
                    if (this.image_ != null) {
                        h0Var.writeMessage(4, getImage());
                    }
                    if (this.video_ != null) {
                        h0Var.writeMessage(5, getVideo());
                    }
                    if (this.data_ != null) {
                        h0Var.writeMessage(6, getData());
                    }
                    if (this.link_ != null) {
                        h0Var.writeMessage(7, getLink());
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        h0Var.writeMessage(8, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        h0Var.writeMessage(9, getExt());
                    }
                    if (this.label_ != null) {
                        h0Var.writeMessage(10, getLabel());
                    }
                    this.unknownFields.writeTo(h0Var);
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends o6 implements AssetOrBuilder {
                    private int bitField0_;
                    private xa dataBuilder_;
                    private DataAsset data_;
                    private xa extBuilder_;
                    private pa extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private xa imageBuilder_;
                    private ImageAsset image_;
                    private xa labelBuilder_;
                    private LabelAsset label_;
                    private xa linkBuilder_;
                    private LinkAsset link_;
                    private boolean req_;
                    private xa titleBuilder_;
                    private TitleAsset title_;
                    private xa videoBuilder_;
                    private VideoAsset video_;

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
                        return b.f21885n0;
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

                    private xa getImageFieldBuilder() {
                        if (this.imageBuilder_ == null) {
                            this.imageBuilder_ = new xa(getImage(), getParentForChildren(), isClean());
                            this.image_ = null;
                        }
                        return this.imageBuilder_;
                    }

                    private xa getLabelFieldBuilder() {
                        if (this.labelBuilder_ == null) {
                            this.labelBuilder_ = new xa(getLabel(), getParentForChildren(), isClean());
                            this.label_ = null;
                        }
                        return this.labelBuilder_;
                    }

                    private xa getLinkFieldBuilder() {
                        if (this.linkBuilder_ == null) {
                            this.linkBuilder_ = new xa(getLink(), getParentForChildren(), isClean());
                            this.link_ = null;
                        }
                        return this.linkBuilder_;
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

                    public Builder clearImage() {
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                            onChanged();
                            return this;
                        }
                        this.image_ = null;
                        this.imageBuilder_ = null;
                        return this;
                    }

                    public Builder clearLabel() {
                        if (this.labelBuilder_ == null) {
                            this.label_ = null;
                            onChanged();
                            return this;
                        }
                        this.label_ = null;
                        this.labelBuilder_ = null;
                        return this;
                    }

                    public Builder clearLink() {
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                            onChanged();
                            return this;
                        }
                        this.link_ = null;
                        this.linkBuilder_ = null;
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public DataAsset getData() {
                        xa xaVar = this.dataBuilder_;
                        if (xaVar != null) {
                            return (DataAsset) xaVar.getMessage();
                        }
                        DataAsset dataAsset = this.data_;
                        return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                    }

                    public DataAsset.Builder getDataBuilder() {
                        onChanged();
                        return (DataAsset.Builder) getDataFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public DataAssetOrBuilder getDataOrBuilder() {
                        xa xaVar = this.dataBuilder_;
                        if (xaVar != null) {
                            return (DataAssetOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        DataAsset dataAsset = this.data_;
                        return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f21885n0;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public jb getExtOrBuilder() {
                        xa xaVar = this.extBuilder_;
                        if (xaVar != null) {
                            return (jb) xaVar.getMessageOrBuilder();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public int getExtProtoCount() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.size() : paVar.getCount();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public List<Any> getExtProtoList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public ImageAsset getImage() {
                        xa xaVar = this.imageBuilder_;
                        if (xaVar != null) {
                            return (ImageAsset) xaVar.getMessage();
                        }
                        ImageAsset imageAsset = this.image_;
                        return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                    }

                    public ImageAsset.Builder getImageBuilder() {
                        onChanged();
                        return (ImageAsset.Builder) getImageFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public ImageAssetOrBuilder getImageOrBuilder() {
                        xa xaVar = this.imageBuilder_;
                        if (xaVar != null) {
                            return (ImageAssetOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        ImageAsset imageAsset = this.image_;
                        return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LabelAsset getLabel() {
                        xa xaVar = this.labelBuilder_;
                        if (xaVar != null) {
                            return (LabelAsset) xaVar.getMessage();
                        }
                        LabelAsset labelAsset = this.label_;
                        return labelAsset == null ? LabelAsset.getDefaultInstance() : labelAsset;
                    }

                    public LabelAsset.Builder getLabelBuilder() {
                        onChanged();
                        return (LabelAsset.Builder) getLabelFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LabelAssetOrBuilder getLabelOrBuilder() {
                        xa xaVar = this.labelBuilder_;
                        if (xaVar != null) {
                            return (LabelAssetOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        LabelAsset labelAsset = this.label_;
                        return labelAsset == null ? LabelAsset.getDefaultInstance() : labelAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LinkAsset getLink() {
                        xa xaVar = this.linkBuilder_;
                        if (xaVar != null) {
                            return (LinkAsset) xaVar.getMessage();
                        }
                        LinkAsset linkAsset = this.link_;
                        return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                    }

                    public LinkAsset.Builder getLinkBuilder() {
                        onChanged();
                        return (LinkAsset.Builder) getLinkFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public LinkAssetOrBuilder getLinkOrBuilder() {
                        xa xaVar = this.linkBuilder_;
                        if (xaVar != null) {
                            return (LinkAssetOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        LinkAsset linkAsset = this.link_;
                        return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean getReq() {
                        return this.req_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public TitleAsset getTitle() {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar != null) {
                            return (TitleAsset) xaVar.getMessage();
                        }
                        TitleAsset titleAsset = this.title_;
                        return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                    }

                    public TitleAsset.Builder getTitleBuilder() {
                        onChanged();
                        return (TitleAsset.Builder) getTitleFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public TitleAssetOrBuilder getTitleOrBuilder() {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar != null) {
                            return (TitleAssetOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        TitleAsset titleAsset = this.title_;
                        return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public VideoAsset getVideo() {
                        xa xaVar = this.videoBuilder_;
                        if (xaVar != null) {
                            return (VideoAsset) xaVar.getMessage();
                        }
                        VideoAsset videoAsset = this.video_;
                        return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                    }

                    public VideoAsset.Builder getVideoBuilder() {
                        onChanged();
                        return (VideoAsset.Builder) getVideoFieldBuilder().getBuilder();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public VideoAssetOrBuilder getVideoOrBuilder() {
                        xa xaVar = this.videoBuilder_;
                        if (xaVar != null) {
                            return (VideoAssetOrBuilder) xaVar.getMessageOrBuilder();
                        }
                        VideoAsset videoAsset = this.video_;
                        return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasData() {
                        return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasImage() {
                        return (this.imageBuilder_ == null && this.image_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasLabel() {
                        return (this.labelBuilder_ == null && this.label_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasLink() {
                        return (this.linkBuilder_ == null && this.link_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasTitle() {
                        return (this.titleBuilder_ == null && this.title_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.AssetOrBuilder
                    public boolean hasVideo() {
                        return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.o6
                    public i7 internalGetFieldAccessorTable() {
                        return b.f21887o0.ensureFieldAccessorsInitialized(Asset.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeData(DataAsset dataAsset) {
                        xa xaVar = this.dataBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(dataAsset);
                            return this;
                        }
                        DataAsset dataAsset2 = this.data_;
                        if (dataAsset2 != null) {
                            this.data_ = DataAsset.newBuilder(dataAsset2).mergeFrom(dataAsset).buildPartial();
                        } else {
                            this.data_ = dataAsset;
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

                    public Builder mergeImage(ImageAsset imageAsset) {
                        xa xaVar = this.imageBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(imageAsset);
                            return this;
                        }
                        ImageAsset imageAsset2 = this.image_;
                        if (imageAsset2 != null) {
                            this.image_ = ImageAsset.newBuilder(imageAsset2).mergeFrom(imageAsset).buildPartial();
                        } else {
                            this.image_ = imageAsset;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeLabel(LabelAsset labelAsset) {
                        xa xaVar = this.labelBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(labelAsset);
                            return this;
                        }
                        LabelAsset labelAsset2 = this.label_;
                        if (labelAsset2 != null) {
                            this.label_ = LabelAsset.newBuilder(labelAsset2).mergeFrom(labelAsset).buildPartial();
                        } else {
                            this.label_ = labelAsset;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeLink(LinkAsset linkAsset) {
                        xa xaVar = this.linkBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(linkAsset);
                            return this;
                        }
                        LinkAsset linkAsset2 = this.link_;
                        if (linkAsset2 != null) {
                            this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                        } else {
                            this.link_ = linkAsset;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeTitle(TitleAsset titleAsset) {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(titleAsset);
                            return this;
                        }
                        TitleAsset titleAsset2 = this.title_;
                        if (titleAsset2 != null) {
                            this.title_ = TitleAsset.newBuilder(titleAsset2).mergeFrom(titleAsset).buildPartial();
                        } else {
                            this.title_ = titleAsset;
                        }
                        onChanged();
                        return this;
                    }

                    public Builder mergeVideo(VideoAsset videoAsset) {
                        xa xaVar = this.videoBuilder_;
                        if (xaVar != null) {
                            xaVar.mergeFrom(videoAsset);
                            return this;
                        }
                        VideoAsset videoAsset2 = this.video_;
                        if (videoAsset2 != null) {
                            this.video_ = VideoAsset.newBuilder(videoAsset2).mergeFrom(videoAsset).buildPartial();
                        } else {
                            this.video_ = videoAsset;
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

                    public Builder setData(DataAsset dataAsset) {
                        xa xaVar = this.dataBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(dataAsset);
                            return this;
                        }
                        dataAsset.getClass();
                        this.data_ = dataAsset;
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

                    public Builder setImage(ImageAsset imageAsset) {
                        xa xaVar = this.imageBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(imageAsset);
                            return this;
                        }
                        imageAsset.getClass();
                        this.image_ = imageAsset;
                        onChanged();
                        return this;
                    }

                    public Builder setLabel(LabelAsset labelAsset) {
                        xa xaVar = this.labelBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(labelAsset);
                            return this;
                        }
                        labelAsset.getClass();
                        this.label_ = labelAsset;
                        onChanged();
                        return this;
                    }

                    public Builder setLink(LinkAsset linkAsset) {
                        xa xaVar = this.linkBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(linkAsset);
                            return this;
                        }
                        linkAsset.getClass();
                        this.link_ = linkAsset;
                        onChanged();
                        return this;
                    }

                    public Builder setReq(boolean z10) {
                        this.req_ = z10;
                        onChanged();
                        return this;
                    }

                    public Builder setTitle(TitleAsset titleAsset) {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(titleAsset);
                            return this;
                        }
                        titleAsset.getClass();
                        this.title_ = titleAsset;
                        onChanged();
                        return this;
                    }

                    public Builder setVideo(VideoAsset videoAsset) {
                        xa xaVar = this.videoBuilder_;
                        if (xaVar != null) {
                            xaVar.setMessage(videoAsset);
                            return this;
                        }
                        videoAsset.getClass();
                        this.video_ = videoAsset;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Asset build() {
                        Asset assetBuildPartial = buildPartial();
                        if (assetBuildPartial.isInitialized()) {
                            return assetBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Asset buildPartial() {
                        Asset asset = new Asset(this);
                        asset.id_ = this.id_;
                        asset.req_ = this.req_;
                        xa xaVar = this.titleBuilder_;
                        if (xaVar == null) {
                            asset.title_ = this.title_;
                        } else {
                            asset.title_ = (TitleAsset) xaVar.build();
                        }
                        xa xaVar2 = this.imageBuilder_;
                        if (xaVar2 == null) {
                            asset.image_ = this.image_;
                        } else {
                            asset.image_ = (ImageAsset) xaVar2.build();
                        }
                        xa xaVar3 = this.videoBuilder_;
                        if (xaVar3 == null) {
                            asset.video_ = this.video_;
                        } else {
                            asset.video_ = (VideoAsset) xaVar3.build();
                        }
                        xa xaVar4 = this.dataBuilder_;
                        if (xaVar4 == null) {
                            asset.data_ = this.data_;
                        } else {
                            asset.data_ = (DataAsset) xaVar4.build();
                        }
                        xa xaVar5 = this.linkBuilder_;
                        if (xaVar5 == null) {
                            asset.link_ = this.link_;
                        } else {
                            asset.link_ = (LinkAsset) xaVar5.build();
                        }
                        xa xaVar6 = this.labelBuilder_;
                        if (xaVar6 == null) {
                            asset.label_ = this.label_;
                        } else {
                            asset.label_ = (LabelAsset) xaVar6.build();
                        }
                        xa xaVar7 = this.extBuilder_;
                        if (xaVar7 == null) {
                            asset.ext_ = this.ext_;
                        } else {
                            asset.ext_ = (Struct) xaVar7.build();
                        }
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            asset.extProto_ = paVar.build();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            asset.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return asset;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public Asset getDefaultInstanceForType() {
                        return Asset.getDefaultInstance();
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
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                        } else {
                            this.image_ = null;
                            this.imageBuilder_ = null;
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
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                        } else {
                            this.link_ = null;
                            this.linkBuilder_ = null;
                        }
                        if (this.labelBuilder_ == null) {
                            this.label_ = null;
                        } else {
                            this.label_ = null;
                            this.labelBuilder_ = null;
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

                    public Builder setData(DataAsset.Builder builder) {
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

                    public Builder setImage(ImageAsset.Builder builder) {
                        xa xaVar = this.imageBuilder_;
                        if (xaVar == null) {
                            this.image_ = builder.build();
                            onChanged();
                            return this;
                        }
                        xaVar.setMessage(builder.build());
                        return this;
                    }

                    public Builder setLabel(LabelAsset.Builder builder) {
                        xa xaVar = this.labelBuilder_;
                        if (xaVar == null) {
                            this.label_ = builder.build();
                            onChanged();
                            return this;
                        }
                        xaVar.setMessage(builder.build());
                        return this;
                    }

                    public Builder setLink(LinkAsset.Builder builder) {
                        xa xaVar = this.linkBuilder_;
                        if (xaVar == null) {
                            this.link_ = builder.build();
                            onChanged();
                            return this;
                        }
                        xaVar.setMessage(builder.build());
                        return this;
                    }

                    public Builder setTitle(TitleAsset.Builder builder) {
                        xa xaVar = this.titleBuilder_;
                        if (xaVar == null) {
                            this.title_ = builder.build();
                            onChanged();
                            return this;
                        }
                        xaVar.setMessage(builder.build());
                        return this;
                    }

                    public Builder setVideo(VideoAsset.Builder builder) {
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
                        if (message instanceof Asset) {
                            return mergeFrom((Asset) message);
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

                    public Builder mergeFrom(Asset asset) {
                        if (asset == Asset.getDefaultInstance()) {
                            return this;
                        }
                        if (asset.getId() != 0) {
                            setId(asset.getId());
                        }
                        if (asset.getReq()) {
                            setReq(asset.getReq());
                        }
                        if (asset.hasTitle()) {
                            mergeTitle(asset.getTitle());
                        }
                        if (asset.hasImage()) {
                            mergeImage(asset.getImage());
                        }
                        if (asset.hasVideo()) {
                            mergeVideo(asset.getVideo());
                        }
                        if (asset.hasData()) {
                            mergeData(asset.getData());
                        }
                        if (asset.hasLink()) {
                            mergeLink(asset.getLink());
                        }
                        if (asset.hasLabel()) {
                            mergeLabel(asset.getLabel());
                        }
                        if (asset.hasExt()) {
                            mergeExt(asset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!asset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = asset.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(asset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!asset.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.addAllMessages(asset.extProto_);
                            } else {
                                this.extProtoBuilder_.dispose();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = asset.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((k7) asset).unknownFields);
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
                    public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.access$13200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Ad$Display$Native$Asset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Ad$Display$Native$Asset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$Builder");
                    }
                }

                public static Builder newBuilder(Asset asset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(asset);
                }

                public static Asset parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(byteBuffer, m5Var);
                }

                private Asset(o6 o6Var) {
                    super(o6Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Asset parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Asset) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                }

                public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Asset getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Asset parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(byteString, m5Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Asset() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(bArr);
                }

                @Override // com.explorestack.protobuf.k7
                public Builder newBuilderForType(p6 p6Var) {
                    return new Builder(p6Var);
                }

                public static Asset parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Asset) PARSER.parseFrom(bArr, m5Var);
                }

                public static Asset parseFrom(InputStream inputStream) throws IOException {
                    return (Asset) k7.parseWithIOException(PARSER, inputStream);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private Asset(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    this();
                    m5Var.getClass();
                    cc ccVarNewBuilder = gc.newBuilder();
                    boolean z10 = false;
                    Object[] objArr = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = yVar.readTag();
                                switch (tag) {
                                    case 0:
                                        z10 = true;
                                    case 8:
                                        this.id_ = yVar.readUInt32();
                                    case 16:
                                        this.req_ = yVar.readBool();
                                    case 26:
                                        TitleAsset titleAsset = this.title_;
                                        TitleAsset.Builder builder = titleAsset != null ? titleAsset.toBuilder() : null;
                                        TitleAsset titleAsset2 = (TitleAsset) yVar.readMessage(TitleAsset.parser(), m5Var);
                                        this.title_ = titleAsset2;
                                        if (builder != null) {
                                            builder.mergeFrom(titleAsset2);
                                            this.title_ = builder.buildPartial();
                                        }
                                    case 34:
                                        ImageAsset imageAsset = this.image_;
                                        ImageAsset.Builder builder2 = imageAsset != null ? imageAsset.toBuilder() : null;
                                        ImageAsset imageAsset2 = (ImageAsset) yVar.readMessage(ImageAsset.parser(), m5Var);
                                        this.image_ = imageAsset2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(imageAsset2);
                                            this.image_ = builder2.buildPartial();
                                        }
                                    case 42:
                                        VideoAsset videoAsset = this.video_;
                                        VideoAsset.Builder builder3 = videoAsset != null ? videoAsset.toBuilder() : null;
                                        VideoAsset videoAsset2 = (VideoAsset) yVar.readMessage(VideoAsset.parser(), m5Var);
                                        this.video_ = videoAsset2;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(videoAsset2);
                                            this.video_ = builder3.buildPartial();
                                        }
                                    case 50:
                                        DataAsset dataAsset = this.data_;
                                        DataAsset.Builder builder4 = dataAsset != null ? dataAsset.toBuilder() : null;
                                        DataAsset dataAsset2 = (DataAsset) yVar.readMessage(DataAsset.parser(), m5Var);
                                        this.data_ = dataAsset2;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(dataAsset2);
                                            this.data_ = builder4.buildPartial();
                                        }
                                    case 58:
                                        LinkAsset linkAsset = this.link_;
                                        LinkAsset.Builder builder5 = linkAsset != null ? linkAsset.toBuilder() : null;
                                        LinkAsset linkAsset2 = (LinkAsset) yVar.readMessage(LinkAsset.parser(), m5Var);
                                        this.link_ = linkAsset2;
                                        if (builder5 != null) {
                                            builder5.mergeFrom(linkAsset2);
                                            this.link_ = builder5.buildPartial();
                                        }
                                    case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                        if (objArr == false) {
                                            this.extProto_ = new ArrayList();
                                            objArr = true;
                                        }
                                        this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                    case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                        Struct struct = this.ext_;
                                        Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                        this.ext_ = struct2;
                                        if (builder6 != null) {
                                            builder6.mergeFrom(struct2);
                                            this.ext_ = builder6.buildPartial();
                                        }
                                    case 82:
                                        LabelAsset labelAsset = this.label_;
                                        LabelAsset.Builder builder7 = labelAsset != null ? labelAsset.toBuilder() : null;
                                        LabelAsset labelAsset2 = (LabelAsset) yVar.readMessage(LabelAsset.parser(), m5Var);
                                        this.label_ = labelAsset2;
                                        if (builder7 != null) {
                                            builder7.mergeFrom(labelAsset2);
                                            this.label_ = builder7.buildPartial();
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

                public static Asset parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Asset) k7.parseWithIOException(PARSER, inputStream, m5Var);
                }

                public static Asset parseFrom(y yVar) throws IOException {
                    return (Asset) k7.parseWithIOException(PARSER, yVar);
                }

                public static Asset parseFrom(y yVar, m5 m5Var) throws IOException {
                    return (Asset) k7.parseWithIOException(PARSER, yVar, m5Var);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public interface AssetOrBuilder extends MessageOrBuilder {
                Asset.DataAsset getData();

                Asset.DataAssetOrBuilder getDataOrBuilder();

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

                Asset.ImageAsset getImage();

                Asset.ImageAssetOrBuilder getImageOrBuilder();

                Asset.LabelAsset getLabel();

                Asset.LabelAssetOrBuilder getLabelOrBuilder();

                LinkAsset getLink();

                LinkAssetOrBuilder getLinkOrBuilder();

                boolean getReq();

                Asset.TitleAsset getTitle();

                Asset.TitleAssetOrBuilder getTitleOrBuilder();

                Asset.VideoAsset getVideo();

                Asset.VideoAssetOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasExt();

                boolean hasImage();

                boolean hasLabel();

                boolean hasLink();

                boolean hasTitle();

                boolean hasVideo();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class LinkAsset extends k7 implements LinkAssetOrBuilder {
                public static final int EXT_FIELD_NUMBER = 5;
                public static final int EXT_PROTO_FIELD_NUMBER = 4;
                public static final int TRKR_FIELD_NUMBER = 3;
                public static final int URLFB_FIELD_NUMBER = 2;
                public static final int URL_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                private List<Any> extProto_;
                private Struct ext_;
                private byte memoizedIsInitialized;
                private g8 trkr_;
                private volatile Object url_;
                private volatile Object urlfb_;
                private static final LinkAsset DEFAULT_INSTANCE = new LinkAsset();
                private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.1
                    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                    public LinkAsset parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        return new LinkAsset(yVar, m5Var);
                    }
                };

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends o6 implements LinkAssetOrBuilder {
                    private int bitField0_;
                    private xa extBuilder_;
                    private pa extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private g8 trkr_;
                    private Object url_;
                    private Object urlfb_;

                    private Builder() {
                        super(null);
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = f8.f22138e;
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 2) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 2;
                        }
                    }

                    private void ensureTrkrIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.trkr_ = new f8(this.trkr_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.f21881l0;
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

                    public Builder addAllTrkr(Iterable<String> iterable) {
                        ensureTrkrIsMutable();
                        b.a.addAll((Iterable) iterable, (List) this.trkr_);
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

                    public Builder addTrkr(String str) {
                        str.getClass();
                        ensureTrkrIsMutable();
                        this.trkr_.add((g8) str);
                        onChanged();
                        return this;
                    }

                    public Builder addTrkrBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                        ensureTrkrIsMutable();
                        this.trkr_.add(byteString);
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

                    public Builder clearTrkr() {
                        this.trkr_ = f8.f22138e;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearUrl() {
                        this.url_ = LinkAsset.getDefaultInstance().getUrl();
                        onChanged();
                        return this;
                    }

                    public Builder clearUrlfb() {
                        this.urlfb_ = LinkAsset.getDefaultInstance().getUrlfb();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f21881l0;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public jb getExtOrBuilder() {
                        xa xaVar = this.extBuilder_;
                        if (xaVar != null) {
                            return (jb) xaVar.getMessageOrBuilder();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public int getExtProtoCount() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.size() : paVar.getCount();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public List<Any> getExtProtoList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public String getTrkr(int i10) {
                        return (String) this.trkr_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getTrkrBytes(int i10) {
                        return this.trkr_.getByteString(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public int getTrkrCount() {
                        return this.trkr_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public String getUrl() {
                        Object obj = this.url_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.url_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getUrlBytes() {
                        Object obj = this.url_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.url_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public String getUrlfb() {
                        Object obj = this.urlfb_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.urlfb_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ByteString getUrlfbBytes() {
                        Object obj = this.urlfb_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.urlfb_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.o6
                    public i7 internalGetFieldAccessorTable() {
                        return b.f21883m0.ensureFieldAccessorsInitialized(LinkAsset.class, Builder.class);
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

                    public Builder setTrkr(int i10, String str) {
                        str.getClass();
                        ensureTrkrIsMutable();
                        this.trkr_.set(i10, (int) str);
                        onChanged();
                        return this;
                    }

                    public Builder setUrl(String str) {
                        str.getClass();
                        this.url_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                        this.url_ = byteString;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlfb(String str) {
                        str.getClass();
                        this.urlfb_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setUrlfbBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                        this.urlfb_ = byteString;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                    public ka getTrkrList() {
                        return this.trkr_.getUnmodifiableView();
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public LinkAsset build() {
                        LinkAsset linkAssetBuildPartial = buildPartial();
                        if (linkAssetBuildPartial.isInitialized()) {
                            return linkAssetBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) linkAssetBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public LinkAsset buildPartial() {
                        LinkAsset linkAsset = new LinkAsset(this);
                        linkAsset.url_ = this.url_;
                        linkAsset.urlfb_ = this.urlfb_;
                        if ((this.bitField0_ & 1) != 0) {
                            this.trkr_ = this.trkr_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        linkAsset.trkr_ = this.trkr_;
                        xa xaVar = this.extBuilder_;
                        if (xaVar == null) {
                            linkAsset.ext_ = this.ext_;
                        } else {
                            linkAsset.ext_ = (Struct) xaVar.build();
                        }
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            linkAsset.extProto_ = paVar.build();
                        } else {
                            if ((this.bitField0_ & 2) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -3;
                            }
                            linkAsset.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return linkAsset;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public LinkAsset getDefaultInstanceForType() {
                        return LinkAsset.getDefaultInstance();
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
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = f8.f22138e;
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
                        if (message instanceof LinkAsset) {
                            return mergeFrom((LinkAsset) message);
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
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = f8.f22138e;
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    public Builder mergeFrom(LinkAsset linkAsset) {
                        if (linkAsset == LinkAsset.getDefaultInstance()) {
                            return this;
                        }
                        if (!linkAsset.getUrl().isEmpty()) {
                            this.url_ = linkAsset.url_;
                            onChanged();
                        }
                        if (!linkAsset.getUrlfb().isEmpty()) {
                            this.urlfb_ = linkAsset.urlfb_;
                            onChanged();
                        }
                        if (!linkAsset.trkr_.isEmpty()) {
                            if (this.trkr_.isEmpty()) {
                                this.trkr_ = linkAsset.trkr_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureTrkrIsMutable();
                                this.trkr_.addAll(linkAsset.trkr_);
                            }
                            onChanged();
                        }
                        if (linkAsset.hasExt()) {
                            mergeExt(linkAsset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!linkAsset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = linkAsset.extProto_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(linkAsset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!linkAsset.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.addAllMessages(linkAsset.extProto_);
                            } else {
                                this.extProtoBuilder_.dispose();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = linkAsset.extProto_;
                                this.bitField0_ &= -3;
                                this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((k7) linkAsset).unknownFields);
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
                    public com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.access$4300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset$Builder");
                    }
                }

                public static LinkAsset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f21881l0;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) k7.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(byteBuffer);
                }

                public static fa parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof LinkAsset)) {
                        return super.equals(obj);
                    }
                    LinkAsset linkAsset = (LinkAsset) obj;
                    if (getUrl().equals(linkAsset.getUrl()) && getUrlfb().equals(linkAsset.getUrlfb()) && getTrkrList().equals(linkAsset.getTrkrList()) && hasExt() == linkAsset.hasExt()) {
                        return (!hasExt() || getExt().equals(linkAsset.getExt())) && getExtProtoList().equals(linkAsset.getExtProtoList()) && this.unknownFields.equals(linkAsset.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public jb getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
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
                    int iComputeStringSize = !getUrlBytes().isEmpty() ? k7.computeStringSize(1, this.url_) : 0;
                    if (!getUrlfbBytes().isEmpty()) {
                        iComputeStringSize += k7.computeStringSize(2, this.urlfb_);
                    }
                    int iE = 0;
                    for (int i11 = 0; i11 < this.trkr_.size(); i11++) {
                        iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.trkr_, i11, iE);
                    }
                    int size = getTrkrList().size() + iComputeStringSize + iE;
                    for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                        size += h0.computeMessageSize(4, this.extProto_.get(i12));
                    }
                    if (this.ext_ != null) {
                        size += h0.computeMessageSize(5, getExt());
                    }
                    int serializedSize = this.unknownFields.getSerializedSize() + size;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public String getTrkr(int i10) {
                    return (String) this.trkr_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getTrkrBytes(int i10) {
                    return this.trkr_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public int getTrkrCount() {
                    return this.trkr_.size();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                public final gc getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getUrlBytes() {
                    Object obj = this.url_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.url_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public String getUrlfb() {
                    Object obj = this.urlfb_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.urlfb_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ByteString getUrlfbBytes() {
                    Object obj = this.urlfb_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.urlfb_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = getUrlfb().hashCode() + ((((getUrl().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
                    if (getTrkrCount() > 0) {
                        iHashCode = o2.B(iHashCode, 37, 3, 53) + getTrkrList().hashCode();
                    }
                    if (hasExt()) {
                        iHashCode = o2.B(iHashCode, 37, 5, 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iHashCode = o2.B(iHashCode, 37, 4, 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.explorestack.protobuf.k7
                public i7 internalGetFieldAccessorTable() {
                    return b.f21883m0.ensureFieldAccessorsInitialized(LinkAsset.class, Builder.class);
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
                    return new LinkAsset();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(h0 h0Var) throws IOException {
                    if (!getUrlBytes().isEmpty()) {
                        k7.writeString(h0Var, 1, this.url_);
                    }
                    if (!getUrlfbBytes().isEmpty()) {
                        k7.writeString(h0Var, 2, this.urlfb_);
                    }
                    int iF = 0;
                    while (iF < this.trkr_.size()) {
                        iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.trkr_, iF, h0Var, 3, iF, 1);
                    }
                    for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                        h0Var.writeMessage(4, this.extProto_.get(i10));
                    }
                    if (this.ext_ != null) {
                        h0Var.writeMessage(5, getExt());
                    }
                    this.unknownFields.writeTo(h0Var);
                }

                public static Builder newBuilder(LinkAsset linkAsset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(linkAsset);
                }

                public static LinkAsset parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(byteBuffer, m5Var);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAssetOrBuilder
                public ka getTrkrList() {
                    return this.trkr_;
                }

                private LinkAsset(o6 o6Var) {
                    super(o6Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (LinkAsset) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                }

                public static LinkAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public LinkAsset getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static LinkAsset parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(byteString, m5Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private LinkAsset() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.url_ = "";
                    this.urlfb_ = "";
                    this.trkr_ = f8.f22138e;
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static LinkAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(bArr);
                }

                @Override // com.explorestack.protobuf.k7
                public Builder newBuilderForType(p6 p6Var) {
                    return new Builder(p6Var);
                }

                public static LinkAsset parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                    return (LinkAsset) PARSER.parseFrom(bArr, m5Var);
                }

                public static LinkAsset parseFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) k7.parseWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (LinkAsset) k7.parseWithIOException(PARSER, inputStream, m5Var);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private LinkAsset(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                            this.url_ = yVar.readStringRequireUtf8();
                                        } else if (tag == 18) {
                                            this.urlfb_ = yVar.readStringRequireUtf8();
                                        } else if (tag == 26) {
                                            String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                            if ((i10 & 1) == 0) {
                                                this.trkr_ = new f8();
                                                i10 |= 1;
                                            }
                                            this.trkr_.add((g8) stringRequireUtf8);
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
                                this.trkr_ = this.trkr_.getUnmodifiableView();
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
                        this.trkr_ = this.trkr_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                }

                public static LinkAsset parseFrom(y yVar) throws IOException {
                    return (LinkAsset) k7.parseWithIOException(PARSER, yVar);
                }

                public static LinkAsset parseFrom(y yVar, m5 m5Var) throws IOException {
                    return (LinkAsset) k7.parseWithIOException(PARSER, yVar, m5Var);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public interface LinkAssetOrBuilder extends MessageOrBuilder {
                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ MessageLite getDefaultInstanceForType();

                Struct getExt();

                jb getExtOrBuilder();

                Any getExtProto(int i10);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

                List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

                String getTrkr(int i10);

                ByteString getTrkrBytes(int i10);

                int getTrkrCount();

                List<String> getTrkrList();

                String getUrl();

                ByteString getUrlBytes();

                String getUrlfb();

                ByteString getUrlfbBytes();

                boolean hasExt();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static Native getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21877j0;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Native) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Native)) {
                    return super.equals(obj);
                }
                Native r52 = (Native) obj;
                if (hasLink() != r52.hasLink()) {
                    return false;
                }
                if ((!hasLink() || getLink().equals(r52.getLink())) && getAssetList().equals(r52.getAssetList()) && hasExt() == r52.hasExt()) {
                    return (!hasExt() || getExt().equals(r52.getExt())) && getExtProtoList().equals(r52.getExtProtoList()) && this.unknownFields.equals(r52.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public Asset getAsset(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public int getAssetCount() {
                return this.asset_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<Asset> getAssetList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public AssetOrBuilder getAssetOrBuilder(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public LinkAsset getLink() {
                LinkAsset linkAsset = this.link_;
                return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public LinkAssetOrBuilder getLinkOrBuilder() {
                return getLink();
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
                int iComputeMessageSize = this.link_ != null ? h0.computeMessageSize(1, getLink()) : 0;
                for (int i11 = 0; i11 < this.asset_.size(); i11++) {
                    iComputeMessageSize += h0.computeMessageSize(2, this.asset_.get(i11));
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    iComputeMessageSize += h0.computeMessageSize(3, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    iComputeMessageSize += h0.computeMessageSize(4, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
            public boolean hasLink() {
                return this.link_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasLink()) {
                    iHashCode = o2.B(iHashCode, 37, 1, 53) + getLink().hashCode();
                }
                if (getAssetCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 2, 53) + getAssetList().hashCode();
                }
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
                return b.f21879k0.ensureFieldAccessorsInitialized(Native.class, Builder.class);
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
                return new Native();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (this.link_ != null) {
                    h0Var.writeMessage(1, getLink());
                }
                for (int i10 = 0; i10 < this.asset_.size(); i10++) {
                    h0Var.writeMessage(2, this.asset_.get(i10));
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
            public static final class Builder extends o6 implements NativeOrBuilder {
                private pa assetBuilder_;
                private List<Asset> asset_;
                private int bitField0_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private xa linkBuilder_;
                private LinkAsset link_;

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
                    return b.f21877j0;
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

                private xa getLinkFieldBuilder() {
                    if (this.linkBuilder_ == null) {
                        this.linkBuilder_ = new xa(getLink(), getParentForChildren(), isClean());
                        this.link_ = null;
                    }
                    return this.linkBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (k7.alwaysUseFieldBuilders) {
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllAsset(Iterable<? extends Asset> iterable) {
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

                public Builder addAsset(Asset asset) {
                    pa paVar = this.assetBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(asset);
                        return this;
                    }
                    asset.getClass();
                    ensureAssetIsMutable();
                    this.asset_.add(asset);
                    onChanged();
                    return this;
                }

                public Asset.Builder addAssetBuilder() {
                    return (Asset.Builder) getAssetFieldBuilder().addBuilder(Asset.getDefaultInstance());
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

                public Builder clearLink() {
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                        onChanged();
                        return this;
                    }
                    this.link_ = null;
                    this.linkBuilder_ = null;
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public Asset getAsset(int i10) {
                    pa paVar = this.assetBuilder_;
                    return paVar == null ? this.asset_.get(i10) : (Asset) paVar.getMessage(i10);
                }

                public Asset.Builder getAssetBuilder(int i10) {
                    return (Asset.Builder) getAssetFieldBuilder().getBuilder(i10);
                }

                public List<Asset.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().getBuilderList();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public int getAssetCount() {
                    pa paVar = this.assetBuilder_;
                    return paVar == null ? this.asset_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<Asset> getAssetList() {
                    pa paVar = this.assetBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.asset_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public AssetOrBuilder getAssetOrBuilder(int i10) {
                    pa paVar = this.assetBuilder_;
                    return paVar == null ? this.asset_.get(i10) : (AssetOrBuilder) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                    pa paVar = this.assetBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.asset_);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f21877j0;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public LinkAsset getLink() {
                    xa xaVar = this.linkBuilder_;
                    if (xaVar != null) {
                        return (LinkAsset) xaVar.getMessage();
                    }
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                public LinkAsset.Builder getLinkBuilder() {
                    onChanged();
                    return (LinkAsset.Builder) getLinkFieldBuilder().getBuilder();
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public LinkAssetOrBuilder getLinkOrBuilder() {
                    xa xaVar = this.linkBuilder_;
                    if (xaVar != null) {
                        return (LinkAssetOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Ad.Display.NativeOrBuilder
                public boolean hasLink() {
                    return (this.linkBuilder_ == null && this.link_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.f21879k0.ensureFieldAccessorsInitialized(Native.class, Builder.class);
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

                public Builder mergeLink(LinkAsset linkAsset) {
                    xa xaVar = this.linkBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(linkAsset);
                        return this;
                    }
                    LinkAsset linkAsset2 = this.link_;
                    if (linkAsset2 != null) {
                        this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                    } else {
                        this.link_ = linkAsset;
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

                public Builder setAsset(int i10, Asset asset) {
                    pa paVar = this.assetBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, asset);
                        return this;
                    }
                    asset.getClass();
                    ensureAssetIsMutable();
                    this.asset_.set(i10, asset);
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

                public Builder setLink(LinkAsset linkAsset) {
                    xa xaVar = this.linkBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(linkAsset);
                        return this;
                    }
                    linkAsset.getClass();
                    this.link_ = linkAsset;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Native build() {
                    Native nativeBuildPartial = buildPartial();
                    if (nativeBuildPartial.isInitialized()) {
                        return nativeBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) nativeBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Native buildPartial() {
                    Native r02 = new Native(this);
                    xa xaVar = this.linkBuilder_;
                    if (xaVar == null) {
                        r02.link_ = this.link_;
                    } else {
                        r02.link_ = (LinkAsset) xaVar.build();
                    }
                    pa paVar = this.assetBuilder_;
                    if (paVar != null) {
                        r02.asset_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        r02.asset_ = this.asset_;
                    }
                    xa xaVar2 = this.extBuilder_;
                    if (xaVar2 == null) {
                        r02.ext_ = this.ext_;
                    } else {
                        r02.ext_ = (Struct) xaVar2.build();
                    }
                    pa paVar2 = this.extProtoBuilder_;
                    if (paVar2 != null) {
                        r02.extProto_ = paVar2.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        r02.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return r02;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Native getDefaultInstanceForType() {
                    return Native.getDefaultInstance();
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

                public Asset.Builder addAssetBuilder(int i10) {
                    return (Asset.Builder) getAssetFieldBuilder().addBuilder(i10, Asset.getDefaultInstance());
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
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                    } else {
                        this.link_ = null;
                        this.linkBuilder_ = null;
                    }
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

                public Builder setLink(LinkAsset.Builder builder) {
                    xa xaVar = this.linkBuilder_;
                    if (xaVar == null) {
                        this.link_ = builder.build();
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

                public Builder addAsset(int i10, Asset asset) {
                    pa paVar = this.assetBuilder_;
                    if (paVar == null) {
                        asset.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(i10, asset);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, asset);
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
                    if (message instanceof Native) {
                        return mergeFrom((Native) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAsset(int i10, Asset.Builder builder) {
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

                public Builder mergeFrom(Native r42) {
                    if (r42 == Native.getDefaultInstance()) {
                        return this;
                    }
                    if (r42.hasLink()) {
                        mergeLink(r42.getLink());
                    }
                    if (this.assetBuilder_ == null) {
                        if (!r42.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = r42.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(r42.asset_);
                            }
                            onChanged();
                        }
                    } else if (!r42.asset_.isEmpty()) {
                        if (!this.assetBuilder_.isEmpty()) {
                            this.assetBuilder_.addAllMessages(r42.asset_);
                        } else {
                            this.assetBuilder_.dispose();
                            this.assetBuilder_ = null;
                            this.asset_ = r42.asset_;
                            this.bitField0_ &= -2;
                            this.assetBuilder_ = k7.alwaysUseFieldBuilders ? getAssetFieldBuilder() : null;
                        }
                    }
                    if (r42.hasExt()) {
                        mergeExt(r42.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!r42.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = r42.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(r42.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!r42.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(r42.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = r42.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) r42).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAsset(Asset.Builder builder) {
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

                public Builder addAsset(int i10, Asset.Builder builder) {
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
                public com.explorestack.protobuf.adcom.Ad.Display.Native.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.access$14500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Ad$Display$Native r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Ad$Display$Native r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Display$Native$Builder");
                }
            }

            public static Builder newBuilder(Native r12) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(r12);
            }

            public static Native parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Native(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Native parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Native) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Native getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Native parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Native() {
                this.memoizedIsInitialized = (byte) -1;
                List list = Collections.EMPTY_LIST;
                this.asset_ = list;
                this.extProto_ = list;
            }

            public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Native parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Native) PARSER.parseFrom(bArr, m5Var);
            }

            public static Native parseFrom(InputStream inputStream) throws IOException {
                return (Native) k7.parseWithIOException(PARSER, inputStream);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r2v6 */
            private Native(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                char c10 = 0;
                while (!z10) {
                    try {
                        try {
                            int tag = yVar.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    LinkAsset linkAsset = this.link_;
                                    LinkAsset.Builder builder = linkAsset != null ? linkAsset.toBuilder() : null;
                                    LinkAsset linkAsset2 = (LinkAsset) yVar.readMessage(LinkAsset.parser(), m5Var);
                                    this.link_ = linkAsset2;
                                    if (builder != null) {
                                        builder.mergeFrom(linkAsset2);
                                        this.link_ = builder.buildPartial();
                                    }
                                } else if (tag == 18) {
                                    int i10 = (c10 == true ? 1 : 0) & 1;
                                    c10 = c10;
                                    if (i10 == 0) {
                                        this.asset_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 1;
                                    }
                                    this.asset_.add(yVar.readMessage(Asset.parser(), m5Var));
                                } else if (tag == 26) {
                                    int i11 = (c10 == true ? 1 : 0) & 2;
                                    c10 = c10;
                                    if (i11 == 0) {
                                        this.extProto_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 2;
                                    }
                                    this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                } else if (tag != 34) {
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
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if (((c10 == true ? 1 : 0) & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
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
                    this.asset_ = Collections.unmodifiableList(this.asset_);
                }
                if (((c10 == true ? 1 : 0) & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Native parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Native) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Native parseFrom(y yVar) throws IOException {
                return (Native) k7.parseWithIOException(PARSER, yVar);
            }

            public static Native parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Native) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface NativeOrBuilder extends MessageOrBuilder {
            Native.Asset getAsset(int i10);

            int getAssetCount();

            List<Native.Asset> getAssetList();

            Native.AssetOrBuilder getAssetOrBuilder(int i10);

            List<? extends Native.AssetOrBuilder> getAssetOrBuilderList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

            List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

            Native.LinkAsset getLink();

            Native.LinkAssetOrBuilder getLinkOrBuilder();

            boolean hasExt();

            boolean hasLink();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Display getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21869f0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Display parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Display) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Display parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Display)) {
                return super.equals(obj);
            }
            Display display = (Display) obj;
            if (!getMimeList().equals(display.getMimeList()) || !this.api_.equals(display.api_) || !this.type_.equals(display.type_) || getW() != display.getW() || getH() != display.getH() || getWratio() != display.getWratio() || getHratio() != display.getHratio() || !getAdm().equals(display.getAdm()) || !getCurl().equals(display.getCurl()) || hasBanner() != display.hasBanner()) {
                return false;
            }
            if ((hasBanner() && !getBanner().equals(display.getBanner())) || hasNative() != display.hasNative()) {
                return false;
            }
            if ((!hasNative() || getNative().equals(display.getNative())) && getEventList().equals(display.getEventList()) && hasExt() == display.hasExt()) {
                return (!hasExt() || getExt().equals(display.getExt())) && getExtProtoList().equals(display.getExtProtoList()) && this.unknownFields.equals(display.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adm_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<ApiFramework> getApiList() {
            return new u7(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Banner getBanner() {
            Banner banner = this.banner_;
            return banner == null ? Banner.getDefaultInstance() : banner;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public BannerOrBuilder getBannerOrBuilder() {
            return getBanner();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.curl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Event getEvent(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getEventCount() {
            return this.event_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Event> getEventList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public EventOrBuilder getEventOrBuilder(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<? extends EventOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getHratio() {
            return this.hratio_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public String getMime(int i10) {
            return (String) this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public Native getNative() {
            Native r02 = this.native_;
            return r02 == null ? Native.getDefaultInstance() : r02;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public NativeOrBuilder getNativeOrBuilder() {
            return getNative();
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
            int iE = 0;
            for (int i11 = 0; i11 < this.mime_.size(); i11++) {
                iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.mime_, i11, iE);
            }
            int size = getMimeList().size() + iE;
            int iComputeEnumSizeNoTag = 0;
            for (int i12 = 0; i12 < this.api_.size(); i12++) {
                iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(this.api_.get(i12).intValue());
            }
            int iComputeUInt32SizeNoTag = size + iComputeEnumSizeNoTag;
            if (!getApiList().isEmpty()) {
                iComputeUInt32SizeNoTag = iComputeUInt32SizeNoTag + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
            }
            this.apiMemoizedSerializedSize = iComputeEnumSizeNoTag;
            int iComputeEnumSizeNoTag2 = 0;
            for (int i13 = 0; i13 < this.type_.size(); i13++) {
                iComputeEnumSizeNoTag2 += h0.computeEnumSizeNoTag(this.type_.get(i13).intValue());
            }
            int iComputeMessageSize = iComputeUInt32SizeNoTag + iComputeEnumSizeNoTag2;
            if (!getTypeList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag2);
            }
            this.typeMemoizedSerializedSize = iComputeEnumSizeNoTag2;
            int i14 = this.w_;
            if (i14 != 0) {
                iComputeMessageSize += h0.computeUInt32Size(4, i14);
            }
            int i15 = this.h_;
            if (i15 != 0) {
                iComputeMessageSize += h0.computeUInt32Size(5, i15);
            }
            int i16 = this.wratio_;
            if (i16 != 0) {
                iComputeMessageSize += h0.computeUInt32Size(6, i16);
            }
            int i17 = this.hratio_;
            if (i17 != 0) {
                iComputeMessageSize += h0.computeUInt32Size(7, i17);
            }
            if (!getAdmBytes().isEmpty()) {
                iComputeMessageSize += k7.computeStringSize(8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                iComputeMessageSize += k7.computeStringSize(9, this.curl_);
            }
            if (this.banner_ != null) {
                iComputeMessageSize += h0.computeMessageSize(10, getBanner());
            }
            if (this.native_ != null) {
                iComputeMessageSize += h0.computeMessageSize(11, getNative());
            }
            for (int i18 = 0; i18 < this.event_.size(); i18++) {
                iComputeMessageSize += h0.computeMessageSize(12, this.event_.get(i18));
            }
            for (int i19 = 0; i19 < this.extProto_.size(); i19++) {
                iComputeMessageSize += h0.computeMessageSize(13, this.extProto_.get(i19));
            }
            if (this.ext_ != null) {
                iComputeMessageSize += h0.computeMessageSize(14, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public DisplayCreativeType getType(int i10) {
            return (DisplayCreativeType) type_converter_.convert(this.type_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<DisplayCreativeType> getTypeList() {
            return new u7(this.type_, type_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getTypeValue(int i10) {
            return this.type_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public int getWratio() {
            return this.wratio_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public boolean hasBanner() {
            return this.banner_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public boolean hasNative() {
            return this.native_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getMimeCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 1, 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + this.type_.hashCode();
            }
            int iHashCode2 = getCurl().hashCode() + ((((getAdm().hashCode() + ((((getHratio() + ((((getWratio() + ((((getH() + ((((getW() + o2.B(iHashCode, 37, 4, 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53);
            if (hasBanner()) {
                iHashCode2 = o2.B(iHashCode2, 37, 10, 53) + getBanner().hashCode();
            }
            if (hasNative()) {
                iHashCode2 = o2.B(iHashCode2, 37, 11, 53) + getNative().hashCode();
            }
            if (getEventCount() > 0) {
                iHashCode2 = o2.B(iHashCode2, 37, 12, 53) + getEventList().hashCode();
            }
            if (hasExt()) {
                iHashCode2 = o2.B(iHashCode2, 37, 14, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode2 = o2.B(iHashCode2, 37, 13, 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.f21871g0.ensureFieldAccessorsInitialized(Display.class, Builder.class);
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
            return new Display();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            getSerializedSize();
            int iF = 0;
            while (iF < this.mime_.size()) {
                iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.mime_, iF, h0Var, 1, iF, 1);
            }
            if (getApiList().size() > 0) {
                h0Var.writeUInt32NoTag(18);
                h0Var.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.api_.size(); i10++) {
                h0Var.writeEnumNoTag(this.api_.get(i10).intValue());
            }
            if (getTypeList().size() > 0) {
                h0Var.writeUInt32NoTag(26);
                h0Var.writeUInt32NoTag(this.typeMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.type_.size(); i11++) {
                h0Var.writeEnumNoTag(this.type_.get(i11).intValue());
            }
            int i12 = this.w_;
            if (i12 != 0) {
                h0Var.writeUInt32(4, i12);
            }
            int i13 = this.h_;
            if (i13 != 0) {
                h0Var.writeUInt32(5, i13);
            }
            int i14 = this.wratio_;
            if (i14 != 0) {
                h0Var.writeUInt32(6, i14);
            }
            int i15 = this.hratio_;
            if (i15 != 0) {
                h0Var.writeUInt32(7, i15);
            }
            if (!getAdmBytes().isEmpty()) {
                k7.writeString(h0Var, 8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                k7.writeString(h0Var, 9, this.curl_);
            }
            if (this.banner_ != null) {
                h0Var.writeMessage(10, getBanner());
            }
            if (this.native_ != null) {
                h0Var.writeMessage(11, getNative());
            }
            for (int i16 = 0; i16 < this.event_.size(); i16++) {
                h0Var.writeMessage(12, this.event_.get(i16));
            }
            for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
                h0Var.writeMessage(13, this.extProto_.get(i17));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(14, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        public static Builder newBuilder(Display display) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(display);
        }

        public static Display parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(byteBuffer, m5Var);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.DisplayOrBuilder
        public ka getMimeList() {
            return this.mime_;
        }

        private Display(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Display parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Display) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Display parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Display getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Display parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Display() {
            this.memoizedIsInitialized = (byte) -1;
            this.mime_ = f8.f22138e;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.type_ = list;
            this.adm_ = "";
            this.curl_ = "";
            this.event_ = list;
            this.extProto_ = list;
        }

        public static Display parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Display parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Display) PARSER.parseFrom(bArr, m5Var);
        }

        public static Display parseFrom(InputStream inputStream) throws IOException {
            return (Display) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Display parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Display) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Display parseFrom(y yVar) throws IOException {
            return (Display) k7.parseWithIOException(PARSER, yVar);
        }

        public static Display parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Display) k7.parseWithIOException(PARSER, yVar, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Display(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.mime_ = new f8();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.mime_.add((g8) stringRequireUtf8);
                            case 16:
                                int i12 = yVar.readEnum();
                                int i13 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i13 == 0) {
                                    this.api_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.api_.add(Integer.valueOf(i12));
                            case 18:
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                i10 = i10;
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i14 = yVar.readEnum();
                                    if (((i10 == true ? 1 : 0) & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.api_.add(Integer.valueOf(i14));
                                    i10 = i10;
                                }
                                yVar.popLimit(iPushLimit);
                            case 24:
                                int i15 = yVar.readEnum();
                                int i16 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i16 == 0) {
                                    this.type_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4;
                                }
                                this.type_.add(Integer.valueOf(i15));
                            case 26:
                                int iPushLimit2 = yVar.pushLimit(yVar.readRawVarint32());
                                i10 = i10;
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i17 = yVar.readEnum();
                                    if (((i10 == true ? 1 : 0) & 4) == 0) {
                                        this.type_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.type_.add(Integer.valueOf(i17));
                                    i10 = i10;
                                }
                                yVar.popLimit(iPushLimit2);
                            case 32:
                                this.w_ = yVar.readUInt32();
                            case 40:
                                this.h_ = yVar.readUInt32();
                            case 48:
                                this.wratio_ = yVar.readUInt32();
                            case 56:
                                this.hratio_ = yVar.readUInt32();
                            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                this.adm_ = yVar.readStringRequireUtf8();
                            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                this.curl_ = yVar.readStringRequireUtf8();
                            case 82:
                                Banner banner = this.banner_;
                                Banner.Builder builder = banner != null ? banner.toBuilder() : null;
                                Banner banner2 = (Banner) yVar.readMessage(Banner.parser(), m5Var);
                                this.banner_ = banner2;
                                if (builder != null) {
                                    builder.mergeFrom(banner2);
                                    this.banner_ = builder.buildPartial();
                                }
                            case 90:
                                Native r32 = this.native_;
                                Native.Builder builder2 = r32 != null ? r32.toBuilder() : null;
                                Native r33 = (Native) yVar.readMessage(Native.parser(), m5Var);
                                this.native_ = r33;
                                if (builder2 != null) {
                                    builder2.mergeFrom(r33);
                                    this.native_ = builder2.buildPartial();
                                }
                            case 98:
                                int i18 = (i10 == true ? 1 : 0) & 8;
                                i10 = i10;
                                if (i18 == 0) {
                                    this.event_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.event_.add(yVar.readMessage(Event.parser(), m5Var));
                            case 106:
                                int i19 = (i10 == true ? 1 : 0) & 16;
                                i10 = i10;
                                if (i19 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 16;
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
                    if (((i10 == true ? 1 : 0) & 1) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if (((i10 == true ? 1 : 0) & 4) != 0) {
                        this.type_ = Collections.unmodifiableList(this.type_);
                    }
                    if (((i10 == true ? 1 : 0) & 8) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                    }
                    if (((i10 == true ? 1 : 0) & 16) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if (((i10 == true ? 1 : 0) & 4) != 0) {
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            if (((i10 == true ? 1 : 0) & 8) != 0) {
                this.event_ = Collections.unmodifiableList(this.event_);
            }
            if (((i10 == true ? 1 : 0) & 16) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DisplayOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        Display.Banner getBanner();

        Display.BannerOrBuilder getBannerOrBuilder();

        String getCurl();

        ByteString getCurlBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Event getEvent(int i10);

        int getEventCount();

        List<Event> getEventList();

        EventOrBuilder getEventOrBuilder(int i10);

        List<? extends EventOrBuilder> getEventOrBuilderList();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        int getH();

        int getHratio();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        Display.Native getNative();

        Display.NativeOrBuilder getNativeOrBuilder();

        DisplayCreativeType getType(int i10);

        int getTypeCount();

        List<DisplayCreativeType> getTypeList();

        int getTypeValue(int i10);

        List<Integer> getTypeValueList();

        int getW();

        int getWratio();

        boolean hasBanner();

        boolean hasExt();

        boolean hasNative();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Event extends k7 implements EventOrBuilder {
        public static final int API_FIELD_NUMBER = 3;
        public static final int CDATA_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private b9 cdata_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private int method_;
        private int type_;
        private volatile Object url_;
        private static final t7 api_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Ad.Event.1
            @Override // com.explorestack.protobuf.t7
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final Event DEFAULT_INSTANCE = new Event();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Event.2
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Event parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Event(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class CdataDefaultEntryHolder {
            static final s8 defaultEntry;

            static {
                Descriptors.Descriptor descriptor = b.f21867e0;
                xc xcVar = bd.f21956f;
                defaultEntry = s8.newDefaultInstance(descriptor, xcVar, "", xcVar, "");
            }

            private CdataDefaultEntryHolder() {
            }
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21863c0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b9 internalGetCdata() {
            b9 b9Var = this.cdata_;
            return b9Var == null ? b9.emptyMapField(CdataDefaultEntryHolder.defaultEntry) : b9Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Event) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public boolean containsCdata(String str) {
            str.getClass();
            return internalGetCdata().getMap().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return super.equals(obj);
            }
            Event event = (Event) obj;
            if (this.type_ == event.type_ && this.method_ == event.method_ && this.api_.equals(event.api_) && getUrl().equals(event.getUrl()) && internalGetCdata().equals(event.internalGetCdata()) && hasExt() == event.hasExt()) {
                return (!hasExt() || getExt().equals(event.getExt())) && getExtProtoList().equals(event.getExtProtoList()) && this.unknownFields.equals(event.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<ApiFramework> getApiList() {
            return new u7(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        @Deprecated
        public Map<String, String> getCdata() {
            return getCdataMap();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getCdataCount() {
            return internalGetCdata().getMap().size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public Map<String, String> getCdataMap() {
            return internalGetCdata().getMap();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public String getCdataOrDefault(String str, String str2) {
            str.getClass();
            Map<Object, Object> map = internalGetCdata().getMap();
            return map.containsKey(str) ? (String) map.get(str) : str2;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public String getCdataOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetCdata().getMap();
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public EventTrackingMethod getMethod() {
            EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(this.method_);
            return eventTrackingMethodValueOf == null ? EventTrackingMethod.UNRECOGNIZED : eventTrackingMethodValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getMethodValue() {
            return this.method_;
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
            int iComputeEnumSize = this.type_ != EventType.EVENT_TYPE_INVALID.getNumber() ? h0.computeEnumSize(1, this.type_) : 0;
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                iComputeEnumSize += h0.computeEnumSize(2, this.method_);
            }
            int iComputeEnumSizeNoTag = 0;
            for (int i11 = 0; i11 < this.api_.size(); i11++) {
                iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(this.api_.get(i11).intValue());
            }
            int iComputeMessageSize = iComputeEnumSize + iComputeEnumSizeNoTag;
            if (!getApiList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
            }
            this.apiMemoizedSerializedSize = iComputeEnumSizeNoTag;
            if (!getUrlBytes().isEmpty()) {
                iComputeMessageSize += k7.computeStringSize(4, this.url_);
            }
            Iterator itN = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.n(internalGetCdata());
            while (itN.hasNext()) {
                Map.Entry entry = (Map.Entry) itN.next();
                iComputeMessageSize = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.g(entry, CdataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 5, iComputeMessageSize);
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                iComputeMessageSize += h0.computeMessageSize(6, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                iComputeMessageSize += h0.computeMessageSize(7, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public EventType getType() {
            EventType eventTypeValueOf = EventType.valueOf(this.type_);
            return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iD = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53) + this.method_;
            if (getApiCount() > 0) {
                iD = o2.B(iD, 37, 3, 53) + this.api_.hashCode();
            }
            int iHashCode = getUrl().hashCode() + o2.B(iD, 37, 4, 53);
            if (!internalGetCdata().getMap().isEmpty()) {
                iHashCode = internalGetCdata().hashCode() + o2.B(iHashCode, 37, 5, 53);
            }
            if (hasExt()) {
                iHashCode = getExt().hashCode() + o2.B(iHashCode, 37, 7, 53);
            }
            if (getExtProtoCount() > 0) {
                iHashCode = getExtProtoList().hashCode() + o2.B(iHashCode, 37, 6, 53);
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.f21865d0.ensureFieldAccessorsInitialized(Event.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.k7
        public b9 internalGetMapField(int i10) {
            if (i10 == 5) {
                return internalGetCdata();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
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
            return new Event();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            getSerializedSize();
            if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                h0Var.writeEnum(1, this.type_);
            }
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                h0Var.writeEnum(2, this.method_);
            }
            if (getApiList().size() > 0) {
                h0Var.writeUInt32NoTag(26);
                h0Var.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.api_.size(); i10++) {
                h0Var.writeEnumNoTag(this.api_.get(i10).intValue());
            }
            if (!getUrlBytes().isEmpty()) {
                k7.writeString(h0Var, 4, this.url_);
            }
            k7.serializeStringMapTo(h0Var, internalGetCdata(), CdataDefaultEntryHolder.defaultEntry, 5);
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                h0Var.writeMessage(6, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements EventOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private b9 cdata_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int method_;
            private int type_;
            private Object url_;

            private Builder() {
                super(null);
                this.type_ = 0;
                this.method_ = 0;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.url_ = "";
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21863c0;
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

            private b9 internalGetCdata() {
                b9 b9Var = this.cdata_;
                return b9Var == null ? b9.emptyMapField(CdataDefaultEntryHolder.defaultEntry) : b9Var;
            }

            private b9 internalGetMutableCdata() {
                onChanged();
                if (this.cdata_ == null) {
                    this.cdata_ = b9.newMapField(CdataDefaultEntryHolder.defaultEntry);
                }
                if (!this.cdata_.isMutable()) {
                    this.cdata_ = this.cdata_.copy();
                }
                return this.cdata_;
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

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCdata() {
                internalGetMutableCdata().getMutableMap().clear();
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

            public Builder clearMethod() {
                this.method_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = Event.getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public boolean containsCdata(String str) {
                str.getClass();
                return internalGetCdata().getMap().containsKey(str);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) Event.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<ApiFramework> getApiList() {
                return new u7(this.api_, Event.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            @Deprecated
            public Map<String, String> getCdata() {
                return getCdataMap();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getCdataCount() {
                return internalGetCdata().getMap().size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public Map<String, String> getCdataMap() {
                return internalGetCdata().getMap();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public String getCdataOrDefault(String str, String str2) {
                str.getClass();
                Map<Object, Object> map = internalGetCdata().getMap();
                return map.containsKey(str) ? (String) map.get(str) : str2;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public String getCdataOrThrow(String str) {
                str.getClass();
                Map<Object, Object> map = internalGetCdata().getMap();
                if (map.containsKey(str)) {
                    return (String) map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f21863c0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public EventTrackingMethod getMethod() {
                EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(this.method_);
                return eventTrackingMethodValueOf == null ? EventTrackingMethod.UNRECOGNIZED : eventTrackingMethodValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getMethodValue() {
                return this.method_;
            }

            @Deprecated
            public Map<String, String> getMutableCdata() {
                return internalGetMutableCdata().getMutableMap();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public EventType getType() {
                EventType eventTypeValueOf = EventType.valueOf(this.type_);
                return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.EventOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.f21865d0.ensureFieldAccessorsInitialized(Event.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMapField(int i10) {
                if (i10 == 5) {
                    return internalGetCdata();
                }
                throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMutableMapField(int i10) {
                if (i10 == 5) {
                    return internalGetMutableCdata();
                }
                throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
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

            public Builder putAllCdata(Map<String, String> map) {
                internalGetMutableCdata().getMutableMap().putAll(map);
                return this;
            }

            public Builder putCdata(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableCdata().getMutableMap().put(str, str2);
                return this;
            }

            public Builder removeCdata(String str) {
                str.getClass();
                internalGetMutableCdata().getMutableMap().remove(str);
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

            public Builder setMethod(EventTrackingMethod eventTrackingMethod) {
                eventTrackingMethod.getClass();
                this.method_ = eventTrackingMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setMethodValue(int i10) {
                this.method_ = i10;
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

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.url_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Event build() {
                Event eventBuildPartial = buildPartial();
                if (eventBuildPartial.isInitialized()) {
                    return eventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Event buildPartial() {
                Event event = new Event(this);
                event.type_ = this.type_;
                event.method_ = this.method_;
                if ((this.bitField0_ & 1) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -2;
                }
                event.api_ = this.api_;
                event.url_ = this.url_;
                event.cdata_ = internalGetCdata();
                event.cdata_.makeImmutable();
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    event.ext_ = this.ext_;
                } else {
                    event.ext_ = (Struct) xaVar.build();
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    event.extProto_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 4) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -5;
                    }
                    event.extProto_ = this.extProto_;
                }
                onBuilt();
                return event;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Event getDefaultInstanceForType() {
                return Event.getDefaultInstance();
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
                this.method_ = 0;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.bitField0_ &= -2;
                this.url_ = "";
                internalGetMutableCdata().clear();
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar == null) {
                    this.extProto_ = list;
                    this.bitField0_ &= -5;
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
                if (message instanceof Event) {
                    return mergeFrom((Event) message);
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
                this.method_ = 0;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.url_ = "";
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Event event) {
                if (event == Event.getDefaultInstance()) {
                    return this;
                }
                if (event.type_ != 0) {
                    setTypeValue(event.getTypeValue());
                }
                if (event.method_ != 0) {
                    setMethodValue(event.getMethodValue());
                }
                if (!event.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = event.api_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(event.api_);
                    }
                    onChanged();
                }
                if (!event.getUrl().isEmpty()) {
                    this.url_ = event.url_;
                    onChanged();
                }
                internalGetMutableCdata().mergeFrom(event.internalGetCdata());
                if (event.hasExt()) {
                    mergeExt(event.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!event.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = event.extProto_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(event.extProto_);
                        }
                        onChanged();
                    }
                } else if (!event.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(event.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = event.extProto_;
                        this.bitField0_ &= -5;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) event).unknownFields);
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
            public com.explorestack.protobuf.adcom.Ad.Event.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Event.access$1400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Event r3 = (com.explorestack.protobuf.adcom.Ad.Event) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Event r4 = (com.explorestack.protobuf.adcom.Ad.Event) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Event.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Event$Builder");
            }
        }

        public static Builder newBuilder(Event event) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Event(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Event parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Event) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Event getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Event parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Event() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.method_ = 0;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.url_ = "";
            this.extProto_ = list;
        }

        public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Event parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Event) PARSER.parseFrom(bArr, m5Var);
        }

        public static Event parseFrom(InputStream inputStream) throws IOException {
            return (Event) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Event) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Event parseFrom(y yVar) throws IOException {
            return (Event) k7.parseWithIOException(PARSER, yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Event(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.type_ = yVar.readEnum();
                            } else if (tag == 16) {
                                this.method_ = yVar.readEnum();
                            } else if (tag == 24) {
                                int i11 = yVar.readEnum();
                                if ((i10 & 1) == 0) {
                                    this.api_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.api_.add(Integer.valueOf(i11));
                            } else if (tag == 26) {
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i12 = yVar.readEnum();
                                    if ((i10 & 1) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.api_.add(Integer.valueOf(i12));
                                }
                                yVar.popLimit(iPushLimit);
                            } else if (tag == 34) {
                                this.url_ = yVar.readStringRequireUtf8();
                            } else if (tag == 42) {
                                if ((i10 & 2) == 0) {
                                    this.cdata_ = b9.newMapField(CdataDefaultEntryHolder.defaultEntry);
                                    i10 |= 2;
                                }
                                s8 s8Var = (s8) yVar.readMessage(CdataDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                this.cdata_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
                            } else if (tag == 50) {
                                if ((i10 & 4) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 4;
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
                        this.api_ = Collections.unmodifiableList(this.api_);
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
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if ((i10 & 4) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Event parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Event) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface EventOrBuilder extends MessageOrBuilder {
        boolean containsCdata(String str);

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        @Deprecated
        Map<String, String> getCdata();

        int getCdataCount();

        Map<String, String> getCdataMap();

        String getCdataOrDefault(String str, String str2);

        String getCdataOrThrow(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        EventTrackingMethod getMethod();

        int getMethodValue();

        EventType getType();

        int getTypeValue();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Video extends k7 implements VideoOrBuilder {
        public static final int ADM_FIELD_NUMBER = 4;
        public static final int API_FIELD_NUMBER = 2;
        public static final int CURL_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int MIME_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object adm_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private volatile Object curl_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private g8 mime_;
        private int typeMemoizedSerializedSize;
        private List<Integer> type_;
        private static final t7 api_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Ad.Video.1
            @Override // com.explorestack.protobuf.t7
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final t7 type_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Ad.Video.2
            @Override // com.explorestack.protobuf.t7
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType videoCreativeTypeValueOf = VideoCreativeType.valueOf(num.intValue());
                return videoCreativeTypeValueOf == null ? VideoCreativeType.UNRECOGNIZED : videoCreativeTypeValueOf;
            }
        };
        private static final Video DEFAULT_INSTANCE = new Video();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Ad.Video.3
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Video parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Video(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements VideoOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private int bitField0_;
            private Object curl_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private g8 mime_;
            private List<Integer> type_;

            private Builder() {
                super(null);
                this.mime_ = f8.f22138e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.adm_ = "";
                this.curl_ = "";
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
                if ((this.bitField0_ & 8) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new f8(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21909z0;
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

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addAllType(Iterable<? extends VideoCreativeType> iterable) {
                ensureTypeIsMutable();
                Iterator<? extends VideoCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.type_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.type_.add(num);
                }
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

            public Builder addType(VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i10) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder clearAdm() {
                this.adm_ = Video.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearCurl() {
                this.curl_ = Video.getDefaultInstance().getCurl();
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

            public Builder clearMime() {
                this.mime_ = f8.f22138e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public String getAdm() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adm_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) Video.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<ApiFramework> getApiList() {
                return new u7(this.api_, Video.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public String getCurl() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.curl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f21909z0;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public String getMime(int i10) {
                return (String) this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public VideoCreativeType getType(int i10) {
                return (VideoCreativeType) Video.type_converter_.convert(this.type_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<VideoCreativeType> getTypeList() {
                return new u7(this.type_, Video.type_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public int getTypeValue(int i10) {
                return this.type_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public List<Integer> getTypeValueList() {
                return Collections.unmodifiableList(this.type_);
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.A0.ensureFieldAccessorsInitialized(Video.class, Builder.class);
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

            public Builder setAdm(String str) {
                str.getClass();
                this.adm_ = str;
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.adm_ = byteString;
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

            public Builder setCurl(String str) {
                str.getClass();
                this.curl_ = str;
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.curl_ = byteString;
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

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, (int) str);
                onChanged();
                return this;
            }

            public Builder setType(int i10, VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10, int i11) {
                ensureTypeIsMutable();
                this.type_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
            public ka getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Video build() {
                Video videoBuildPartial = buildPartial();
                if (videoBuildPartial.isInitialized()) {
                    return videoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Video buildPartial() {
                Video video = new Video(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                video.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                video.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                video.type_ = this.type_;
                video.adm_ = this.adm_;
                video.curl_ = this.curl_;
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    video.ext_ = this.ext_;
                } else {
                    video.ext_ = (Struct) xaVar.build();
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    video.extProto_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -9;
                    }
                    video.extProto_ = this.extProto_;
                }
                onBuilt();
                return video;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Video getDefaultInstanceForType() {
                return Video.getDefaultInstance();
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
                this.mime_ = f8.f22138e;
                int i10 = this.bitField0_;
                this.bitField0_ = i10 & (-2);
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.bitField0_ = i10 & (-8);
                this.adm_ = "";
                this.curl_ = "";
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar == null) {
                    this.extProto_ = list;
                    this.bitField0_ = i10 & (-16);
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
                if (message instanceof Video) {
                    return mergeFrom((Video) message);
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

            public Builder mergeFrom(Video video) {
                if (video == Video.getDefaultInstance()) {
                    return this;
                }
                if (!video.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = video.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(video.mime_);
                    }
                    onChanged();
                }
                if (!video.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = video.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(video.api_);
                    }
                    onChanged();
                }
                if (!video.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = video.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(video.type_);
                    }
                    onChanged();
                }
                if (!video.getAdm().isEmpty()) {
                    this.adm_ = video.adm_;
                    onChanged();
                }
                if (!video.getCurl().isEmpty()) {
                    this.curl_ = video.curl_;
                    onChanged();
                }
                if (video.hasExt()) {
                    mergeExt(video.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!video.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = video.extProto_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(video.extProto_);
                        }
                        onChanged();
                    }
                } else if (!video.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(video.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = video.extProto_;
                        this.bitField0_ &= -9;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) video).unknownFields);
                onChanged();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.mime_ = f8.f22138e;
                List list = Collections.EMPTY_LIST;
                this.api_ = list;
                this.type_ = list;
                this.adm_ = "";
                this.curl_ = "";
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
            public com.explorestack.protobuf.adcom.Ad.Video.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Ad.Video.access$18800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Ad$Video r3 = (com.explorestack.protobuf.adcom.Ad.Video) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Ad$Video r4 = (com.explorestack.protobuf.adcom.Ad.Video) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Video.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Ad$Video$Builder");
            }
        }

        public static Video getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21909z0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Video parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Video) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Video parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return super.equals(obj);
            }
            Video video = (Video) obj;
            if (getMimeList().equals(video.getMimeList()) && this.api_.equals(video.api_) && this.type_.equals(video.type_) && getAdm().equals(video.getAdm()) && getCurl().equals(video.getCurl()) && hasExt() == video.hasExt()) {
                return (!hasExt() || getExt().equals(video.getExt())) && getExtProtoList().equals(video.getExtProtoList()) && this.unknownFields.equals(video.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adm_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ApiFramework getApi(int i10) {
            return (ApiFramework) api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<ApiFramework> getApiList() {
            return new u7(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.curl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public String getMime(int i10) {
            return (String) this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
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
            int iE = 0;
            for (int i11 = 0; i11 < this.mime_.size(); i11++) {
                iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.mime_, i11, iE);
            }
            int size = getMimeList().size() + iE;
            int iComputeEnumSizeNoTag = 0;
            for (int i12 = 0; i12 < this.api_.size(); i12++) {
                iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(this.api_.get(i12).intValue());
            }
            int iComputeUInt32SizeNoTag = size + iComputeEnumSizeNoTag;
            if (!getApiList().isEmpty()) {
                iComputeUInt32SizeNoTag = iComputeUInt32SizeNoTag + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
            }
            this.apiMemoizedSerializedSize = iComputeEnumSizeNoTag;
            int iComputeEnumSizeNoTag2 = 0;
            for (int i13 = 0; i13 < this.type_.size(); i13++) {
                iComputeEnumSizeNoTag2 += h0.computeEnumSizeNoTag(this.type_.get(i13).intValue());
            }
            int iComputeMessageSize = iComputeUInt32SizeNoTag + iComputeEnumSizeNoTag2;
            if (!getTypeList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag2);
            }
            this.typeMemoizedSerializedSize = iComputeEnumSizeNoTag2;
            if (!getAdmBytes().isEmpty()) {
                iComputeMessageSize += k7.computeStringSize(4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                iComputeMessageSize += k7.computeStringSize(5, this.curl_);
            }
            for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                iComputeMessageSize += h0.computeMessageSize(6, this.extProto_.get(i14));
            }
            if (this.ext_ != null) {
                iComputeMessageSize += h0.computeMessageSize(7, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public VideoCreativeType getType(int i10) {
            return (VideoCreativeType) type_converter_.convert(this.type_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<VideoCreativeType> getTypeList() {
            return new u7(this.type_, type_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public int getTypeValue(int i10) {
            return this.type_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
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
            if (getMimeCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 1, 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 2, 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + this.type_.hashCode();
            }
            int iHashCode2 = getCurl().hashCode() + ((((getAdm().hashCode() + o2.B(iHashCode, 37, 4, 53)) * 37) + 5) * 53);
            if (hasExt()) {
                iHashCode2 = o2.B(iHashCode2, 37, 7, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode2 = o2.B(iHashCode2, 37, 6, 53) + getExtProtoList().hashCode();
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashCode2 * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.A0.ensureFieldAccessorsInitialized(Video.class, Builder.class);
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
            return new Video();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            getSerializedSize();
            int iF = 0;
            while (iF < this.mime_.size()) {
                iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.mime_, iF, h0Var, 1, iF, 1);
            }
            if (getApiList().size() > 0) {
                h0Var.writeUInt32NoTag(18);
                h0Var.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.api_.size(); i10++) {
                h0Var.writeEnumNoTag(this.api_.get(i10).intValue());
            }
            if (getTypeList().size() > 0) {
                h0Var.writeUInt32NoTag(26);
                h0Var.writeUInt32NoTag(this.typeMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.type_.size(); i11++) {
                h0Var.writeEnumNoTag(this.type_.get(i11).intValue());
            }
            if (!getAdmBytes().isEmpty()) {
                k7.writeString(h0Var, 4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                k7.writeString(h0Var, 5, this.curl_);
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                h0Var.writeMessage(6, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        public static Builder newBuilder(Video video) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(video);
        }

        public static Video parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(byteBuffer, m5Var);
        }

        @Override // com.explorestack.protobuf.adcom.Ad.VideoOrBuilder
        public ka getMimeList() {
            return this.mime_;
        }

        private Video(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Video parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Video) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Video parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Video getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Video parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Video() {
            this.memoizedIsInitialized = (byte) -1;
            this.mime_ = f8.f22138e;
            List list = Collections.EMPTY_LIST;
            this.api_ = list;
            this.type_ = list;
            this.adm_ = "";
            this.curl_ = "";
            this.extProto_ = list;
        }

        public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Video parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Video) PARSER.parseFrom(bArr, m5Var);
        }

        public static Video parseFrom(InputStream inputStream) throws IOException {
            return (Video) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Video parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Video) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Video parseFrom(y yVar) throws IOException {
            return (Video) k7.parseWithIOException(PARSER, yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Video(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                if ((i10 & 1) == 0) {
                                    this.mime_ = new f8();
                                    i10 |= 1;
                                }
                                this.mime_.add((g8) stringRequireUtf8);
                            } else if (tag == 16) {
                                int i11 = yVar.readEnum();
                                if ((i10 & 2) == 0) {
                                    this.api_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.api_.add(Integer.valueOf(i11));
                            } else if (tag == 18) {
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
                            } else if (tag == 24) {
                                int i13 = yVar.readEnum();
                                if ((i10 & 4) == 0) {
                                    this.type_ = new ArrayList();
                                    i10 |= 4;
                                }
                                this.type_.add(Integer.valueOf(i13));
                            } else if (tag == 26) {
                                int iPushLimit2 = yVar.pushLimit(yVar.readRawVarint32());
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i14 = yVar.readEnum();
                                    if ((i10 & 4) == 0) {
                                        this.type_ = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.type_.add(Integer.valueOf(i14));
                                }
                                yVar.popLimit(iPushLimit2);
                            } else if (tag == 34) {
                                this.adm_ = yVar.readStringRequireUtf8();
                            } else if (tag == 42) {
                                this.curl_ = yVar.readStringRequireUtf8();
                            } else if (tag == 50) {
                                if ((i10 & 8) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 8;
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
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if ((i10 & 4) != 0) {
                        this.type_ = Collections.unmodifiableList(this.type_);
                    }
                    if ((i10 & 8) != 0) {
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
                this.type_ = Collections.unmodifiableList(this.type_);
            }
            if ((i10 & 8) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Video parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Video) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface VideoOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        String getCurl();

        ByteString getCurlBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        VideoCreativeType getType(int i10);

        int getTypeCount();

        List<VideoCreativeType> getTypeList();

        int getTypeValue(int i10);

        List<Integer> getTypeValueList();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f21859a0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Ad parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ad) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Ad parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return super.equals(obj);
        }
        Ad ad2 = (Ad) obj;
        if (!getId().equals(ad2.getId()) || !getAdomainList().equals(ad2.getAdomainList()) || !getBundleList().equals(ad2.getBundleList()) || !getIurl().equals(ad2.getIurl()) || !getCatList().equals(ad2.getCatList()) || this.cattax_ != ad2.cattax_ || !getLang().equals(ad2.getLang()) || getSecure() != ad2.getSecure() || this.mrating_ != ad2.mrating_ || !getInit().equals(ad2.getInit()) || !getLastmod().equals(ad2.getLastmod()) || hasDisplay() != ad2.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(ad2.getDisplay())) || hasVideo() != ad2.hasVideo()) {
            return false;
        }
        if ((hasVideo() && !getVideo().equals(ad2.getVideo())) || hasAudit() != ad2.hasAudit()) {
            return false;
        }
        if ((!hasAudit() || getAudit().equals(ad2.getAudit())) && hasExt() == ad2.hasExt()) {
            return (!hasExt() || getExt().equals(ad2.getExt())) && getExtProtoList().equals(ad2.getExtProtoList()) && this.unknownFields.equals(ad2.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public String getAdomain(int i10) {
        return (String) this.adomain_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ByteString getAdomainBytes(int i10) {
        return this.adomain_.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.adcom.a
    public int getAdomainCount() {
        return this.adomain_.size();
    }

    @Override // com.explorestack.protobuf.adcom.a
    public Audit getAudit() {
        Audit audit = this.audit_;
        return audit == null ? Audit.getDefaultInstance() : audit;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public AuditOrBuilder getAuditOrBuilder() {
        return getAudit();
    }

    @Override // com.explorestack.protobuf.adcom.a
    public String getBundle(int i10) {
        return (String) this.bundle_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ByteString getBundleBytes(int i10) {
        return this.bundle_.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.adcom.a
    public int getBundleCount() {
        return this.bundle_.size();
    }

    @Override // com.explorestack.protobuf.adcom.a
    public String getCat(int i10) {
        return (String) this.cat_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ByteString getCatBytes(int i10) {
        return this.cat_.getByteString(i10);
    }

    @Override // com.explorestack.protobuf.adcom.a
    public int getCatCount() {
        return this.cat_.size();
    }

    @Override // com.explorestack.protobuf.adcom.a
    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public int getCattaxValue() {
        return this.cattax_;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public Display getDisplay() {
        Display display = this.display_;
        return display == null ? Display.getDefaultInstance() : display;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public DisplayOrBuilder getDisplayOrBuilder() {
        return getDisplay();
    }

    @Override // com.explorestack.protobuf.adcom.a
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public jb getExtOrBuilder() {
        return getExt();
    }

    @Override // com.explorestack.protobuf.adcom.a
    public Any getExtProto(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.a
    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    @Override // com.explorestack.protobuf.adcom.a
    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.a
    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public String getInit() {
        Object obj = this.init_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.init_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ByteString getInitBytes() {
        Object obj = this.init_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.init_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public String getIurl() {
        Object obj = this.iurl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.iurl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ByteString getIurlBytes() {
        Object obj = this.iurl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.iurl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public String getLang() {
        Object obj = this.lang_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lang_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ByteString getLangBytes() {
        Object obj = this.lang_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.lang_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public String getLastmod() {
        Object obj = this.lastmod_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lastmod_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ByteString getLastmodBytes() {
        Object obj = this.lastmod_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.lastmod_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public MediaRating getMrating() {
        MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
        return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public int getMratingValue() {
        return this.mrating_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public boolean getSecure() {
        return this.secure_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
        int iE = 0;
        for (int i11 = 0; i11 < this.adomain_.size(); i11++) {
            iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.adomain_, i11, iE);
        }
        int size = getAdomainList().size() + iComputeStringSize + iE;
        int iE2 = 0;
        for (int i12 = 0; i12 < this.bundle_.size(); i12++) {
            iE2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.bundle_, i12, iE2);
        }
        int size2 = getBundleList().size() + size + iE2;
        if (!getIurlBytes().isEmpty()) {
            size2 += k7.computeStringSize(4, this.iurl_);
        }
        int iE3 = 0;
        for (int i13 = 0; i13 < this.cat_.size(); i13++) {
            iE3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.cat_, i13, iE3);
        }
        int size3 = getCatList().size() + size2 + iE3;
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size3 += h0.computeEnumSize(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            size3 += k7.computeStringSize(7, this.lang_);
        }
        boolean z10 = this.secure_;
        if (z10) {
            size3 += h0.computeBoolSize(9, z10);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            size3 += h0.computeEnumSize(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            size3 += k7.computeStringSize(11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            size3 += k7.computeStringSize(12, this.lastmod_);
        }
        if (this.display_ != null) {
            size3 += h0.computeMessageSize(13, getDisplay());
        }
        if (this.video_ != null) {
            size3 += h0.computeMessageSize(14, getVideo());
        }
        if (this.audit_ != null) {
            size3 += h0.computeMessageSize(16, getAudit());
        }
        for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
            size3 += h0.computeMessageSize(17, this.extProto_.get(i14));
        }
        if (this.ext_ != null) {
            size3 += h0.computeMessageSize(18, getExt());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size3;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public Video getVideo() {
        Video video = this.video_;
        return video == null ? Video.getDefaultInstance() : video;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public VideoOrBuilder getVideoOrBuilder() {
        return getVideo();
    }

    @Override // com.explorestack.protobuf.adcom.a
    public boolean hasAudit() {
        return this.audit_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public boolean hasDisplay() {
        return this.display_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public boolean hasVideo() {
        return this.video_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (getAdomainCount() > 0) {
            iHashCode = getAdomainList().hashCode() + o2.B(iHashCode, 37, 2, 53);
        }
        if (getBundleCount() > 0) {
            iHashCode = getBundleList().hashCode() + o2.B(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = getIurl().hashCode() + o2.B(iHashCode, 37, 4, 53);
        if (getCatCount() > 0) {
            iHashCode2 = getCatList().hashCode() + o2.B(iHashCode2, 37, 5, 53);
        }
        int iHashCode3 = getLastmod().hashCode() + ((((getInit().hashCode() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((x7.hashBoolean(getSecure()) + ((((getLang().hashCode() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(o2.B(iHashCode2, 37, 6, 53), this.cattax_, 37, 7, 53)) * 37) + 9) * 53)) * 37) + 10) * 53, this.mrating_, 37, 11, 53)) * 37) + 12) * 53);
        if (hasDisplay()) {
            iHashCode3 = o2.B(iHashCode3, 37, 13, 53) + getDisplay().hashCode();
        }
        if (hasVideo()) {
            iHashCode3 = o2.B(iHashCode3, 37, 14, 53) + getVideo().hashCode();
        }
        if (hasAudit()) {
            iHashCode3 = o2.B(iHashCode3, 37, 16, 53) + getAudit().hashCode();
        }
        if (hasExt()) {
            iHashCode3 = o2.B(iHashCode3, 37, 18, 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode3 = o2.B(iHashCode3, 37, 17, 53) + getExtProtoList().hashCode();
        }
        int iHashCode4 = this.unknownFields.hashCode() + (iHashCode3 * 29);
        this.memoizedHashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return b.f21861b0.ensureFieldAccessorsInitialized(Ad.class, Builder.class);
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
        return new Ad();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getIdBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.id_);
        }
        int iF = 0;
        while (iF < this.adomain_.size()) {
            iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.adomain_, iF, h0Var, 2, iF, 1);
        }
        int iF2 = 0;
        while (iF2 < this.bundle_.size()) {
            iF2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.bundle_, iF2, h0Var, 3, iF2, 1);
        }
        if (!getIurlBytes().isEmpty()) {
            k7.writeString(h0Var, 4, this.iurl_);
        }
        int iF3 = 0;
        while (iF3 < this.cat_.size()) {
            iF3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.cat_, iF3, h0Var, 5, iF3, 1);
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            h0Var.writeEnum(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            k7.writeString(h0Var, 7, this.lang_);
        }
        boolean z10 = this.secure_;
        if (z10) {
            h0Var.writeBool(9, z10);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            h0Var.writeEnum(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            k7.writeString(h0Var, 11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            k7.writeString(h0Var, 12, this.lastmod_);
        }
        if (this.display_ != null) {
            h0Var.writeMessage(13, getDisplay());
        }
        if (this.video_ != null) {
            h0Var.writeMessage(14, getVideo());
        }
        if (this.audit_ != null) {
            h0Var.writeMessage(16, getAudit());
        }
        for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
            h0Var.writeMessage(17, this.extProto_.get(i10));
        }
        if (this.ext_ != null) {
            h0Var.writeMessage(18, getExt());
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static Builder newBuilder(Ad ad2) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(ad2);
    }

    public static Ad parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(byteBuffer, m5Var);
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ka getAdomainList() {
        return this.adomain_;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ka getBundleList() {
        return this.bundle_;
    }

    @Override // com.explorestack.protobuf.adcom.a
    public ka getCatList() {
        return this.cat_;
    }

    private Ad(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Ad parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Ad) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Ad parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Ad getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Ad parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Ad() {
        this.memoizedIsInitialized = (byte) -1;
        this.id_ = "";
        f8 f8Var = f8.f22138e;
        this.adomain_ = f8Var;
        this.bundle_ = f8Var;
        this.iurl_ = "";
        this.cat_ = f8Var;
        this.cattax_ = 0;
        this.lang_ = "";
        this.mrating_ = 0;
        this.init_ = "";
        this.lastmod_ = "";
        this.extProto_ = Collections.EMPTY_LIST;
    }

    public static Ad parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Ad parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Ad) PARSER.parseFrom(bArr, m5Var);
    }

    public static Ad parseFrom(InputStream inputStream) throws IOException {
        return (Ad) k7.parseWithIOException(PARSER, inputStream);
    }

    public static Ad parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Ad) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Ad parseFrom(y yVar) throws IOException {
        return (Ad) k7.parseWithIOException(PARSER, yVar);
    }

    public static Ad parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Ad) k7.parseWithIOException(PARSER, yVar, m5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    private Ad(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            String stringRequireUtf8 = yVar.readStringRequireUtf8();
                            int i10 = (c10 == true ? 1 : 0) & 1;
                            c10 = c10;
                            if (i10 == 0) {
                                this.adomain_ = new f8();
                                c10 = (c10 == true ? 1 : 0) | 1;
                            }
                            this.adomain_.add((g8) stringRequireUtf8);
                        case 26:
                            String stringRequireUtf82 = yVar.readStringRequireUtf8();
                            int i11 = (c10 == true ? 1 : 0) & 2;
                            c10 = c10;
                            if (i11 == 0) {
                                this.bundle_ = new f8();
                                c10 = (c10 == true ? 1 : 0) | 2;
                            }
                            this.bundle_.add((g8) stringRequireUtf82);
                        case 34:
                            this.iurl_ = yVar.readStringRequireUtf8();
                        case 42:
                            String stringRequireUtf83 = yVar.readStringRequireUtf8();
                            int i12 = (c10 == true ? 1 : 0) & 4;
                            c10 = c10;
                            if (i12 == 0) {
                                this.cat_ = new f8();
                                c10 = (c10 == true ? 1 : 0) | 4;
                            }
                            this.cat_.add((g8) stringRequireUtf83);
                        case 48:
                            this.cattax_ = yVar.readEnum();
                        case 58:
                            this.lang_ = yVar.readStringRequireUtf8();
                        case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                            this.secure_ = yVar.readBool();
                        case 80:
                            this.mrating_ = yVar.readEnum();
                        case 90:
                            this.init_ = yVar.readStringRequireUtf8();
                        case 98:
                            this.lastmod_ = yVar.readStringRequireUtf8();
                        case 106:
                            Display display = this.display_;
                            Display.Builder builder = display != null ? display.toBuilder() : null;
                            Display display2 = (Display) yVar.readMessage(Display.parser(), m5Var);
                            this.display_ = display2;
                            if (builder != null) {
                                builder.mergeFrom(display2);
                                this.display_ = builder.buildPartial();
                            }
                        case 114:
                            Video video = this.video_;
                            Video.Builder builder2 = video != null ? video.toBuilder() : null;
                            Video video2 = (Video) yVar.readMessage(Video.parser(), m5Var);
                            this.video_ = video2;
                            if (builder2 != null) {
                                builder2.mergeFrom(video2);
                                this.video_ = builder2.buildPartial();
                            }
                        case 130:
                            Audit audit = this.audit_;
                            Audit.Builder builder3 = audit != null ? audit.toBuilder() : null;
                            Audit audit2 = (Audit) yVar.readMessage(Audit.parser(), m5Var);
                            this.audit_ = audit2;
                            if (builder3 != null) {
                                builder3.mergeFrom(audit2);
                                this.audit_ = builder3.buildPartial();
                            }
                        case 138:
                            int i13 = (c10 == true ? 1 : 0) & 8;
                            c10 = c10;
                            if (i13 == 0) {
                                this.extProto_ = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | '\b';
                            }
                            this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                        case 146:
                            Struct struct = this.ext_;
                            Struct.Builder builder4 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                            this.ext_ = struct2;
                            if (builder4 != null) {
                                builder4.mergeFrom(struct2);
                                this.ext_ = builder4.buildPartial();
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
                    this.adomain_ = this.adomain_.getUnmodifiableView();
                }
                if (((c10 == true ? 1 : 0) & 2) != 0) {
                    this.bundle_ = this.bundle_.getUnmodifiableView();
                }
                if (((c10 == true ? 1 : 0) & 4) != 0) {
                    this.cat_ = this.cat_.getUnmodifiableView();
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
            this.adomain_ = this.adomain_.getUnmodifiableView();
        }
        if (((c10 == true ? 1 : 0) & 2) != 0) {
            this.bundle_ = this.bundle_.getUnmodifiableView();
        }
        if (((c10 == true ? 1 : 0) & 4) != 0) {
            this.cat_ = this.cat_.getUnmodifiableView();
        }
        if (((c10 == true ? 1 : 0) & 8) != 0) {
            this.extProto_ = Collections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }
}
