package com.explorestack.protobuf.adcom;

import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import bp.oM.DwaEpyvxz;
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
import com.explorestack.protobuf.l7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.s7;
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
public final class Context extends k7 implements h {
    public static final int APP_FIELD_NUMBER = 1;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int EXT_FIELD_NUMBER = 7;
    public static final int EXT_PROTO_FIELD_NUMBER = 6;
    public static final int REGS_FIELD_NUMBER = 3;
    public static final int RESTRICTIONS_FIELD_NUMBER = 4;
    public static final int USER_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private App app_;
    private Device device_;
    private List<Any> extProto_;
    private Struct ext_;
    private byte memoizedIsInitialized;
    private Regs regs_;
    private Restrictions restrictions_;
    private User user_;
    private static final Context DEFAULT_INSTANCE = new Context();
    private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Context parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Context(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class App extends k7 implements AppOrBuilder {
        public static final int BUNDLE_FIELD_NUMBER = 12;
        public static final int CATTAX_FIELD_NUMBER = 9;
        public static final int CAT_FIELD_NUMBER = 6;
        public static final int CONTENT_FIELD_NUMBER = 4;
        public static final int DOMAIN_FIELD_NUMBER = 5;
        public static final int EXT_FIELD_NUMBER = 18;
        public static final int EXT_PROTO_FIELD_NUMBER = 17;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int KEYWORDS_FIELD_NUMBER = 11;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int PAGECAT_FIELD_NUMBER = 8;
        public static final int PAID_FIELD_NUMBER = 16;
        public static final int PRIVPOLICY_FIELD_NUMBER = 10;
        public static final int PUB_FIELD_NUMBER = 3;
        public static final int RELEASE_FIELD_NUMBER = 19;
        public static final int SECTCAT_FIELD_NUMBER = 7;
        public static final int STOREID_FIELD_NUMBER = 13;
        public static final int STOREURL_FIELD_NUMBER = 14;
        public static final int VER_FIELD_NUMBER = 15;
        private static final long serialVersionUID = 0;
        private volatile Object bundle_;
        private g8 cat_;
        private int cattax_;
        private Content content_;
        private volatile Object domain_;
        private List<Any> extProto_;
        private Struct ext_;
        private volatile Object id_;
        private volatile Object keywords_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private g8 pagecat_;
        private boolean paid_;
        private boolean privpolicy_;
        private Publisher pub_;
        private Release release_;
        private g8 sectcat_;
        private volatile Object storeid_;
        private volatile Object storeurl_;
        private volatile Object ver_;
        private static final App DEFAULT_INSTANCE = new App();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public App parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new App(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements AppOrBuilder {
            private int bitField0_;
            private Object bundle_;
            private g8 cat_;
            private int cattax_;
            private xa contentBuilder_;
            private Content content_;
            private Object domain_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object id_;
            private Object keywords_;
            private Object name_;
            private g8 pagecat_;
            private boolean paid_;
            private boolean privpolicy_;
            private xa pubBuilder_;
            private Publisher pub_;
            private xa releaseBuilder_;
            private Release release_;
            private g8 sectcat_;
            private Object storeid_;
            private Object storeurl_;
            private Object ver_;

            private Builder() {
                super(null);
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                f8 f8Var = f8.f22138e;
                this.cat_ = f8Var;
                this.sectcat_ = f8Var;
                this.pagecat_ = f8Var;
                this.cattax_ = 0;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureCatIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.cat_ = new f8(this.cat_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensurePagecatIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.pagecat_ = new f8(this.pagecat_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureSectcatIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.sectcat_ = new f8(this.sectcat_);
                    this.bitField0_ |= 2;
                }
            }

            private xa getContentFieldBuilder() {
                if (this.contentBuilder_ == null) {
                    this.contentBuilder_ = new xa(getContent(), getParentForChildren(), isClean());
                    this.content_ = null;
                }
                return this.contentBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21862c;
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

            private xa getPubFieldBuilder() {
                if (this.pubBuilder_ == null) {
                    this.pubBuilder_ = new xa(getPub(), getParentForChildren(), isClean());
                    this.pub_ = null;
                }
                return this.pubBuilder_;
            }

            private xa getReleaseFieldBuilder() {
                if (this.releaseBuilder_ == null) {
                    this.releaseBuilder_ = new xa(getRelease(), getParentForChildren(), isClean());
                    this.release_ = null;
                }
                return this.releaseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
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

            public Builder addAllPagecat(Iterable<String> iterable) {
                ensurePagecatIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.pagecat_);
                onChanged();
                return this;
            }

            public Builder addAllSectcat(Iterable<String> iterable) {
                ensureSectcatIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.sectcat_);
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

            public Builder addPagecat(String str) {
                str.getClass();
                ensurePagecatIsMutable();
                this.pagecat_.add((g8) str);
                onChanged();
                return this;
            }

            public Builder addPagecatBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                ensurePagecatIsMutable();
                this.pagecat_.add(byteString);
                onChanged();
                return this;
            }

            public Builder addSectcat(String str) {
                str.getClass();
                ensureSectcatIsMutable();
                this.sectcat_.add((g8) str);
                onChanged();
                return this;
            }

            public Builder addSectcatBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                ensureSectcatIsMutable();
                this.sectcat_.add(byteString);
                onChanged();
                return this;
            }

            public Builder clearBundle() {
                this.bundle_ = App.getDefaultInstance().getBundle();
                onChanged();
                return this;
            }

            public Builder clearCat() {
                this.cat_ = f8.f22138e;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCattax() {
                this.cattax_ = 0;
                onChanged();
                return this;
            }

            public Builder clearContent() {
                if (this.contentBuilder_ == null) {
                    this.content_ = null;
                    onChanged();
                    return this;
                }
                this.content_ = null;
                this.contentBuilder_ = null;
                return this;
            }

            public Builder clearDomain() {
                this.domain_ = App.getDefaultInstance().getDomain();
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
                this.id_ = App.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearKeywords() {
                this.keywords_ = App.getDefaultInstance().getKeywords();
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = App.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearPagecat() {
                this.pagecat_ = f8.f22138e;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPaid() {
                this.paid_ = false;
                onChanged();
                return this;
            }

            public Builder clearPrivpolicy() {
                this.privpolicy_ = false;
                onChanged();
                return this;
            }

            public Builder clearPub() {
                if (this.pubBuilder_ == null) {
                    this.pub_ = null;
                    onChanged();
                    return this;
                }
                this.pub_ = null;
                this.pubBuilder_ = null;
                return this;
            }

            public Builder clearRelease() {
                if (this.releaseBuilder_ == null) {
                    this.release_ = null;
                    onChanged();
                    return this;
                }
                this.release_ = null;
                this.releaseBuilder_ = null;
                return this;
            }

            public Builder clearSectcat() {
                this.sectcat_ = f8.f22138e;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearStoreid() {
                this.storeid_ = App.getDefaultInstance().getStoreid();
                onChanged();
                return this;
            }

            public Builder clearStoreurl() {
                this.storeurl_ = App.getDefaultInstance().getStoreurl();
                onChanged();
                return this;
            }

            public Builder clearVer() {
                this.ver_ = App.getDefaultInstance().getVer();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getBundle() {
                Object obj = this.bundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getBundleBytes() {
                Object obj = this.bundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getCat(int i10) {
                return (String) this.cat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getCatBytes(int i10) {
                return this.cat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getCatCount() {
                return this.cat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Content getContent() {
                xa xaVar = this.contentBuilder_;
                if (xaVar != null) {
                    return (Content) xaVar.getMessage();
                }
                Content content = this.content_;
                return content == null ? Content.getDefaultInstance() : content;
            }

            public Content.Builder getContentBuilder() {
                onChanged();
                return (Content.Builder) getContentFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ContentOrBuilder getContentOrBuilder() {
                xa xaVar = this.contentBuilder_;
                if (xaVar != null) {
                    return (ContentOrBuilder) xaVar.getMessageOrBuilder();
                }
                Content content = this.content_;
                return content == null ? Content.getDefaultInstance() : content;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f21862c;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getPagecat(int i10) {
                return (String) this.pagecat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getPagecatBytes(int i10) {
                return this.pagecat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getPagecatCount() {
                return this.pagecat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean getPaid() {
                return this.paid_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean getPrivpolicy() {
                return this.privpolicy_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Publisher getPub() {
                xa xaVar = this.pubBuilder_;
                if (xaVar != null) {
                    return (Publisher) xaVar.getMessage();
                }
                Publisher publisher = this.pub_;
                return publisher == null ? Publisher.getDefaultInstance() : publisher;
            }

            public Publisher.Builder getPubBuilder() {
                onChanged();
                return (Publisher.Builder) getPubFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public PublisherOrBuilder getPubOrBuilder() {
                xa xaVar = this.pubBuilder_;
                if (xaVar != null) {
                    return (PublisherOrBuilder) xaVar.getMessageOrBuilder();
                }
                Publisher publisher = this.pub_;
                return publisher == null ? Publisher.getDefaultInstance() : publisher;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public Release getRelease() {
                xa xaVar = this.releaseBuilder_;
                if (xaVar != null) {
                    return (Release) xaVar.getMessage();
                }
                Release release = this.release_;
                return release == null ? Release.getDefaultInstance() : release;
            }

            public Release.Builder getReleaseBuilder() {
                onChanged();
                return (Release.Builder) getReleaseFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ReleaseOrBuilder getReleaseOrBuilder() {
                xa xaVar = this.releaseBuilder_;
                if (xaVar != null) {
                    return (ReleaseOrBuilder) xaVar.getMessageOrBuilder();
                }
                Release release = this.release_;
                return release == null ? Release.getDefaultInstance() : release;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getSectcat(int i10) {
                return (String) this.sectcat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getSectcatBytes(int i10) {
                return this.sectcat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public int getSectcatCount() {
                return this.sectcat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getStoreid() {
                Object obj = this.storeid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.storeid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getStoreidBytes() {
                Object obj = this.storeid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.storeid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getStoreurl() {
                Object obj = this.storeurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.storeurl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getStoreurlBytes() {
                Object obj = this.storeurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.storeurl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public String getVer() {
                Object obj = this.ver_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ver_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ByteString getVerBytes() {
                Object obj = this.ver_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ver_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasContent() {
                return (this.contentBuilder_ == null && this.content_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasPub() {
                return (this.pubBuilder_ == null && this.pub_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public boolean hasRelease() {
                return (this.releaseBuilder_ == null && this.release_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.f21864d.ensureFieldAccessorsInitialized(App.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeContent(Content content) {
                xa xaVar = this.contentBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(content);
                    return this;
                }
                Content content2 = this.content_;
                if (content2 != null) {
                    this.content_ = Content.newBuilder(content2).mergeFrom(content).buildPartial();
                } else {
                    this.content_ = content;
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

            public Builder mergePub(Publisher publisher) {
                xa xaVar = this.pubBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(publisher);
                    return this;
                }
                Publisher publisher2 = this.pub_;
                if (publisher2 != null) {
                    this.pub_ = Publisher.newBuilder(publisher2).mergeFrom(publisher).buildPartial();
                } else {
                    this.pub_ = publisher;
                }
                onChanged();
                return this;
            }

            public Builder mergeRelease(Release release) {
                xa xaVar = this.releaseBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(release);
                    return this;
                }
                Release release2 = this.release_;
                if (release2 != null) {
                    this.release_ = Release.newBuilder(release2).mergeFrom(release).buildPartial();
                } else {
                    this.release_ = release;
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

            public Builder setBundle(String str) {
                str.getClass();
                this.bundle_ = str;
                onChanged();
                return this;
            }

            public Builder setBundleBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.bundle_ = byteString;
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

            public Builder setContent(Content content) {
                xa xaVar = this.contentBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(content);
                    return this;
                }
                content.getClass();
                this.content_ = content;
                onChanged();
                return this;
            }

            public Builder setDomain(String str) {
                str.getClass();
                this.domain_ = str;
                onChanged();
                return this;
            }

            public Builder setDomainBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.domain_ = byteString;
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

            public Builder setKeywords(String str) {
                str.getClass();
                this.keywords_ = str;
                onChanged();
                return this;
            }

            public Builder setKeywordsBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.keywords_ = byteString;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPagecat(int i10, String str) {
                str.getClass();
                ensurePagecatIsMutable();
                this.pagecat_.set(i10, (int) str);
                onChanged();
                return this;
            }

            public Builder setPaid(boolean z10) {
                this.paid_ = z10;
                onChanged();
                return this;
            }

            public Builder setPrivpolicy(boolean z10) {
                this.privpolicy_ = z10;
                onChanged();
                return this;
            }

            public Builder setPub(Publisher publisher) {
                xa xaVar = this.pubBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(publisher);
                    return this;
                }
                publisher.getClass();
                this.pub_ = publisher;
                onChanged();
                return this;
            }

            public Builder setRelease(Release release) {
                xa xaVar = this.releaseBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(release);
                    return this;
                }
                release.getClass();
                this.release_ = release;
                onChanged();
                return this;
            }

            public Builder setSectcat(int i10, String str) {
                str.getClass();
                ensureSectcatIsMutable();
                this.sectcat_.set(i10, (int) str);
                onChanged();
                return this;
            }

            public Builder setStoreid(String str) {
                str.getClass();
                this.storeid_ = str;
                onChanged();
                return this;
            }

            public Builder setStoreidBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.storeid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStoreurl(String str) {
                str.getClass();
                this.storeurl_ = str;
                onChanged();
                return this;
            }

            public Builder setStoreurlBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.storeurl_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVer(String str) {
                str.getClass();
                this.ver_ = str;
                onChanged();
                return this;
            }

            public Builder setVerBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.ver_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ka getCatList() {
                return this.cat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ka getPagecatList() {
                return this.pagecat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
            public ka getSectcatList() {
                return this.sectcat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public App build() {
                App appBuildPartial = buildPartial();
                if (appBuildPartial.isInitialized()) {
                    return appBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public App buildPartial() {
                App app = new App(this);
                app.id_ = this.id_;
                app.name_ = this.name_;
                xa xaVar = this.pubBuilder_;
                if (xaVar == null) {
                    app.pub_ = this.pub_;
                } else {
                    app.pub_ = (Publisher) xaVar.build();
                }
                xa xaVar2 = this.contentBuilder_;
                if (xaVar2 == null) {
                    app.content_ = this.content_;
                } else {
                    app.content_ = (Content) xaVar2.build();
                }
                app.domain_ = this.domain_;
                if ((this.bitField0_ & 1) != 0) {
                    this.cat_ = this.cat_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                app.cat_ = this.cat_;
                if ((this.bitField0_ & 2) != 0) {
                    this.sectcat_ = this.sectcat_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                app.sectcat_ = this.sectcat_;
                if ((this.bitField0_ & 4) != 0) {
                    this.pagecat_ = this.pagecat_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                app.pagecat_ = this.pagecat_;
                app.cattax_ = this.cattax_;
                app.privpolicy_ = this.privpolicy_;
                app.keywords_ = this.keywords_;
                app.bundle_ = this.bundle_;
                app.storeid_ = this.storeid_;
                app.storeurl_ = this.storeurl_;
                app.ver_ = this.ver_;
                app.paid_ = this.paid_;
                xa xaVar3 = this.releaseBuilder_;
                if (xaVar3 == null) {
                    app.release_ = this.release_;
                } else {
                    app.release_ = (Release) xaVar3.build();
                }
                xa xaVar4 = this.extBuilder_;
                if (xaVar4 == null) {
                    app.ext_ = this.ext_;
                } else {
                    app.ext_ = (Struct) xaVar4.build();
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    app.extProto_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 8) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -9;
                    }
                    app.extProto_ = this.extProto_;
                }
                onBuilt();
                return app;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public App getDefaultInstanceForType() {
                return App.getDefaultInstance();
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
                this.name_ = "";
                if (this.pubBuilder_ == null) {
                    this.pub_ = null;
                } else {
                    this.pub_ = null;
                    this.pubBuilder_ = null;
                }
                if (this.contentBuilder_ == null) {
                    this.content_ = null;
                } else {
                    this.content_ = null;
                    this.contentBuilder_ = null;
                }
                this.domain_ = "";
                f8 f8Var = f8.f22138e;
                this.cat_ = f8Var;
                int i10 = this.bitField0_;
                this.sectcat_ = f8Var;
                this.pagecat_ = f8Var;
                this.bitField0_ = i10 & (-8);
                this.cattax_ = 0;
                this.privpolicy_ = false;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
                this.paid_ = false;
                if (this.releaseBuilder_ == null) {
                    this.release_ = null;
                } else {
                    this.release_ = null;
                    this.releaseBuilder_ = null;
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

            public Builder setContent(Content.Builder builder) {
                xa xaVar = this.contentBuilder_;
                if (xaVar == null) {
                    this.content_ = builder.build();
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

            public Builder setPub(Publisher.Builder builder) {
                xa xaVar = this.pubBuilder_;
                if (xaVar == null) {
                    this.pub_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setRelease(Release.Builder builder) {
                xa xaVar = this.releaseBuilder_;
                if (xaVar == null) {
                    this.release_ = builder.build();
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
                if (message instanceof App) {
                    return mergeFrom((App) message);
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

            public Builder mergeFrom(App app) {
                if (app == App.getDefaultInstance()) {
                    return this;
                }
                if (!app.getId().isEmpty()) {
                    this.id_ = app.id_;
                    onChanged();
                }
                if (!app.getName().isEmpty()) {
                    this.name_ = app.name_;
                    onChanged();
                }
                if (app.hasPub()) {
                    mergePub(app.getPub());
                }
                if (app.hasContent()) {
                    mergeContent(app.getContent());
                }
                if (!app.getDomain().isEmpty()) {
                    this.domain_ = app.domain_;
                    onChanged();
                }
                if (!app.cat_.isEmpty()) {
                    if (this.cat_.isEmpty()) {
                        this.cat_ = app.cat_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureCatIsMutable();
                        this.cat_.addAll(app.cat_);
                    }
                    onChanged();
                }
                if (!app.sectcat_.isEmpty()) {
                    if (this.sectcat_.isEmpty()) {
                        this.sectcat_ = app.sectcat_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureSectcatIsMutable();
                        this.sectcat_.addAll(app.sectcat_);
                    }
                    onChanged();
                }
                if (!app.pagecat_.isEmpty()) {
                    if (this.pagecat_.isEmpty()) {
                        this.pagecat_ = app.pagecat_;
                        this.bitField0_ &= -5;
                    } else {
                        ensurePagecatIsMutable();
                        this.pagecat_.addAll(app.pagecat_);
                    }
                    onChanged();
                }
                if (app.cattax_ != 0) {
                    setCattaxValue(app.getCattaxValue());
                }
                if (app.getPrivpolicy()) {
                    setPrivpolicy(app.getPrivpolicy());
                }
                if (!app.getKeywords().isEmpty()) {
                    this.keywords_ = app.keywords_;
                    onChanged();
                }
                if (!app.getBundle().isEmpty()) {
                    this.bundle_ = app.bundle_;
                    onChanged();
                }
                if (!app.getStoreid().isEmpty()) {
                    this.storeid_ = app.storeid_;
                    onChanged();
                }
                if (!app.getStoreurl().isEmpty()) {
                    this.storeurl_ = app.storeurl_;
                    onChanged();
                }
                if (!app.getVer().isEmpty()) {
                    this.ver_ = app.ver_;
                    onChanged();
                }
                if (app.getPaid()) {
                    setPaid(app.getPaid());
                }
                if (app.hasRelease()) {
                    mergeRelease(app.getRelease());
                }
                if (app.hasExt()) {
                    mergeExt(app.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!app.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = app.extProto_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(app.extProto_);
                        }
                        onChanged();
                    }
                } else if (!app.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(app.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = app.extProto_;
                        this.bitField0_ &= -9;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) app).unknownFields);
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
                this.name_ = "";
                this.domain_ = "";
                f8 f8Var = f8.f22138e;
                this.cat_ = f8Var;
                this.sectcat_ = f8Var;
                this.pagecat_ = f8Var;
                this.cattax_ = 0;
                this.keywords_ = "";
                this.bundle_ = "";
                this.storeid_ = "";
                this.storeurl_ = "";
                this.ver_ = "";
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
            public com.explorestack.protobuf.adcom.Context.App.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.App.access$12600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$App r3 = (com.explorestack.protobuf.adcom.Context.App) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$App r4 = (com.explorestack.protobuf.adcom.Context.App) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$App$Builder");
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Content extends k7 implements ContentOrBuilder {
            public static final int ALBUM_FIELD_NUMBER = 8;
            public static final int ARTIST_FIELD_NUMBER = 6;
            public static final int CATTAX_FIELD_NUMBER = 12;
            public static final int CAT_FIELD_NUMBER = 11;
            public static final int CONTEXT_FIELD_NUMBER = 14;
            public static final int DATA_FIELD_NUMBER = 25;
            public static final int EMBED_FIELD_NUMBER = 23;
            public static final int EPISODE_FIELD_NUMBER = 2;
            public static final int EXT_FIELD_NUMBER = 27;
            public static final int EXT_PROTO_FIELD_NUMBER = 26;
            public static final int GENRE_FIELD_NUMBER = 7;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int ISRC_FIELD_NUMBER = 9;
            public static final int KEYWORDS_FIELD_NUMBER = 18;
            public static final int LANG_FIELD_NUMBER = 22;
            public static final int LEN_FIELD_NUMBER = 21;
            public static final int LIVE_FIELD_NUMBER = 19;
            public static final int MRATING_FIELD_NUMBER = 17;
            public static final int PRODQ_FIELD_NUMBER = 13;
            public static final int PRODUCER_FIELD_NUMBER = 24;
            public static final int RATING_FIELD_NUMBER = 15;
            public static final int SEASON_FIELD_NUMBER = 5;
            public static final int SERIES_FIELD_NUMBER = 4;
            public static final int SRCREL_FIELD_NUMBER = 20;
            public static final int TITLE_FIELD_NUMBER = 3;
            public static final int URATING_FIELD_NUMBER = 16;
            public static final int URL_FIELD_NUMBER = 10;
            private static final long serialVersionUID = 0;
            private volatile Object album_;
            private volatile Object artist_;
            private g8 cat_;
            private int cattax_;
            private int context_;
            private List<Data> data_;
            private boolean embed_;
            private int episode_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object genre_;
            private volatile Object id_;
            private volatile Object isrc_;
            private volatile Object keywords_;
            private volatile Object lang_;
            private int len_;
            private boolean live_;
            private byte memoizedIsInitialized;
            private int mrating_;
            private int prodq_;
            private Producer producer_;
            private volatile Object rating_;
            private volatile Object season_;
            private volatile Object series_;
            private int srcrel_;
            private volatile Object title_;
            private volatile Object urating_;
            private volatile Object url_;
            private static final Content DEFAULT_INSTANCE = new Content();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.Content.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Content parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Content(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements ContentOrBuilder {
                private Object album_;
                private Object artist_;
                private int bitField0_;
                private g8 cat_;
                private int cattax_;
                private int context_;
                private pa dataBuilder_;
                private List<Data> data_;
                private boolean embed_;
                private int episode_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object genre_;
                private Object id_;
                private Object isrc_;
                private Object keywords_;
                private Object lang_;
                private int len_;
                private boolean live_;
                private int mrating_;
                private int prodq_;
                private xa producerBuilder_;
                private Producer producer_;
                private Object rating_;
                private Object season_;
                private Object series_;
                private int srcrel_;
                private Object title_;
                private Object urating_;
                private Object url_;

                private Builder() {
                    super(null);
                    this.id_ = "";
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = f8.f22138e;
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.lang_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.data_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                private void ensureCatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.cat_ = new f8(this.cat_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureDataIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.data_ = new ArrayList(this.data_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 4;
                    }
                }

                private pa getDataFieldBuilder() {
                    if (this.dataBuilder_ == null) {
                        this.dataBuilder_ = new pa(this.data_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.data_ = null;
                    }
                    return this.dataBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f21870g;
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

                private xa getProducerFieldBuilder() {
                    if (this.producerBuilder_ == null) {
                        this.producerBuilder_ = new xa(getProducer(), getParentForChildren(), isClean());
                        this.producer_ = null;
                    }
                    return this.producerBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (k7.alwaysUseFieldBuilders) {
                        getDataFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllCat(Iterable<String> iterable) {
                    ensureCatIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.cat_);
                    onChanged();
                    return this;
                }

                public Builder addAllData(Iterable<? extends Data> iterable) {
                    pa paVar = this.dataBuilder_;
                    if (paVar != null) {
                        paVar.addAllMessages(iterable);
                        return this;
                    }
                    ensureDataIsMutable();
                    b.a.addAll((Iterable) iterable, (List) this.data_);
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

                public Builder addData(Data data) {
                    pa paVar = this.dataBuilder_;
                    if (paVar != null) {
                        paVar.addMessage(data);
                        return this;
                    }
                    data.getClass();
                    ensureDataIsMutable();
                    this.data_.add(data);
                    onChanged();
                    return this;
                }

                public Data.Builder addDataBuilder() {
                    return (Data.Builder) getDataFieldBuilder().addBuilder(Data.getDefaultInstance());
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

                public Builder clearAlbum() {
                    this.album_ = Content.getDefaultInstance().getAlbum();
                    onChanged();
                    return this;
                }

                public Builder clearArtist() {
                    this.artist_ = Content.getDefaultInstance().getArtist();
                    onChanged();
                    return this;
                }

                public Builder clearCat() {
                    this.cat_ = f8.f22138e;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearCattax() {
                    this.cattax_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearContext() {
                    this.context_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearData() {
                    pa paVar = this.dataBuilder_;
                    if (paVar != null) {
                        paVar.clear();
                        return this;
                    }
                    this.data_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearEmbed() {
                    this.embed_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearEpisode() {
                    this.episode_ = 0;
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

                public Builder clearGenre() {
                    this.genre_ = Content.getDefaultInstance().getGenre();
                    onChanged();
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Content.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearIsrc() {
                    this.isrc_ = Content.getDefaultInstance().getIsrc();
                    onChanged();
                    return this;
                }

                public Builder clearKeywords() {
                    this.keywords_ = Content.getDefaultInstance().getKeywords();
                    onChanged();
                    return this;
                }

                public Builder clearLang() {
                    this.lang_ = Content.getDefaultInstance().getLang();
                    onChanged();
                    return this;
                }

                public Builder clearLen() {
                    this.len_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLive() {
                    this.live_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearMrating() {
                    this.mrating_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearProdq() {
                    this.prodq_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearProducer() {
                    if (this.producerBuilder_ == null) {
                        this.producer_ = null;
                        onChanged();
                        return this;
                    }
                    this.producer_ = null;
                    this.producerBuilder_ = null;
                    return this;
                }

                public Builder clearRating() {
                    this.rating_ = Content.getDefaultInstance().getRating();
                    onChanged();
                    return this;
                }

                public Builder clearSeason() {
                    this.season_ = Content.getDefaultInstance().getSeason();
                    onChanged();
                    return this;
                }

                public Builder clearSeries() {
                    this.series_ = Content.getDefaultInstance().getSeries();
                    onChanged();
                    return this;
                }

                public Builder clearSrcrel() {
                    this.srcrel_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearTitle() {
                    this.title_ = Content.getDefaultInstance().getTitle();
                    onChanged();
                    return this;
                }

                public Builder clearUrating() {
                    this.urating_ = Content.getDefaultInstance().getUrating();
                    onChanged();
                    return this;
                }

                public Builder clearUrl() {
                    this.url_ = Content.getDefaultInstance().getUrl();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getAlbum() {
                    Object obj = this.album_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.album_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getAlbumBytes() {
                    Object obj = this.album_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.album_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getArtist() {
                    Object obj = this.artist_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.artist_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getArtistBytes() {
                    Object obj = this.artist_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.artist_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getCat(int i10) {
                    return (String) this.cat_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getCatBytes(int i10) {
                    return this.cat_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getCatCount() {
                    return this.cat_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getCattaxValue() {
                    return this.cattax_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ContentContext getContext() {
                    ContentContext contentContextValueOf = ContentContext.valueOf(this.context_);
                    return contentContextValueOf == null ? ContentContext.UNRECOGNIZED : contentContextValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getContextValue() {
                    return this.context_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public Data getData(int i10) {
                    pa paVar = this.dataBuilder_;
                    return paVar == null ? this.data_.get(i10) : (Data) paVar.getMessage(i10);
                }

                public Data.Builder getDataBuilder(int i10) {
                    return (Data.Builder) getDataFieldBuilder().getBuilder(i10);
                }

                public List<Data.Builder> getDataBuilderList() {
                    return getDataFieldBuilder().getBuilderList();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getDataCount() {
                    pa paVar = this.dataBuilder_;
                    return paVar == null ? this.data_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<Data> getDataList() {
                    pa paVar = this.dataBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.data_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public DataOrBuilder getDataOrBuilder(int i10) {
                    pa paVar = this.dataBuilder_;
                    return paVar == null ? this.data_.get(i10) : (DataOrBuilder) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<? extends DataOrBuilder> getDataOrBuilderList() {
                    pa paVar = this.dataBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f21870g;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean getEmbed() {
                    return this.embed_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getEpisode() {
                    return this.episode_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getGenre() {
                    Object obj = this.genre_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.genre_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getGenreBytes() {
                    Object obj = this.genre_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.genre_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getIsrc() {
                    Object obj = this.isrc_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.isrc_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getIsrcBytes() {
                    Object obj = this.isrc_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.isrc_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getKeywords() {
                    Object obj = this.keywords_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.keywords_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getKeywordsBytes() {
                    Object obj = this.keywords_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.keywords_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getLang() {
                    Object obj = this.lang_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lang_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getLangBytes() {
                    Object obj = this.lang_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lang_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getLen() {
                    return this.len_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean getLive() {
                    return this.live_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public MediaRating getMrating() {
                    MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
                    return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getMratingValue() {
                    return this.mrating_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ProductionQuality getProdq() {
                    ProductionQuality productionQualityValueOf = ProductionQuality.valueOf(this.prodq_);
                    return productionQualityValueOf == null ? ProductionQuality.UNRECOGNIZED : productionQualityValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getProdqValue() {
                    return this.prodq_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public Producer getProducer() {
                    xa xaVar = this.producerBuilder_;
                    if (xaVar != null) {
                        return (Producer) xaVar.getMessage();
                    }
                    Producer producer = this.producer_;
                    return producer == null ? Producer.getDefaultInstance() : producer;
                }

                public Producer.Builder getProducerBuilder() {
                    onChanged();
                    return (Producer.Builder) getProducerFieldBuilder().getBuilder();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ProducerOrBuilder getProducerOrBuilder() {
                    xa xaVar = this.producerBuilder_;
                    if (xaVar != null) {
                        return (ProducerOrBuilder) xaVar.getMessageOrBuilder();
                    }
                    Producer producer = this.producer_;
                    return producer == null ? Producer.getDefaultInstance() : producer;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getRating() {
                    Object obj = this.rating_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.rating_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getRatingBytes() {
                    Object obj = this.rating_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.rating_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getSeason() {
                    Object obj = this.season_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.season_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getSeasonBytes() {
                    Object obj = this.season_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.season_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getSeries() {
                    Object obj = this.series_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.series_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getSeriesBytes() {
                    Object obj = this.series_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.series_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public int getSrcrel() {
                    return this.srcrel_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getTitle() {
                    Object obj = this.title_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.title_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getTitleBytes() {
                    Object obj = this.title_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.title_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getUrating() {
                    Object obj = this.urating_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.urating_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getUratingBytes() {
                    Object obj = this.urating_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.urating_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public String getUrl() {
                    Object obj = this.url_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.url_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ByteString getUrlBytes() {
                    Object obj = this.url_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.url_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public boolean hasProducer() {
                    return (this.producerBuilder_ == null && this.producer_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.f21872h.ensureFieldAccessorsInitialized(Content.class, Builder.class);
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

                public Builder mergeProducer(Producer producer) {
                    xa xaVar = this.producerBuilder_;
                    if (xaVar != null) {
                        xaVar.mergeFrom(producer);
                        return this;
                    }
                    Producer producer2 = this.producer_;
                    if (producer2 != null) {
                        this.producer_ = Producer.newBuilder(producer2).mergeFrom(producer).buildPartial();
                    } else {
                        this.producer_ = producer;
                    }
                    onChanged();
                    return this;
                }

                public Builder removeData(int i10) {
                    pa paVar = this.dataBuilder_;
                    if (paVar != null) {
                        paVar.remove(i10);
                        return this;
                    }
                    ensureDataIsMutable();
                    this.data_.remove(i10);
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

                public Builder setAlbum(String str) {
                    str.getClass();
                    this.album_ = str;
                    onChanged();
                    return this;
                }

                public Builder setAlbumBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.album_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setArtist(String str) {
                    str.getClass();
                    this.artist_ = str;
                    onChanged();
                    return this;
                }

                public Builder setArtistBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.artist_ = byteString;
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

                public Builder setContext(ContentContext contentContext) {
                    contentContext.getClass();
                    this.context_ = contentContext.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setContextValue(int i10) {
                    this.context_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setData(int i10, Data data) {
                    pa paVar = this.dataBuilder_;
                    if (paVar != null) {
                        paVar.setMessage(i10, data);
                        return this;
                    }
                    data.getClass();
                    ensureDataIsMutable();
                    this.data_.set(i10, data);
                    onChanged();
                    return this;
                }

                public Builder setEmbed(boolean z10) {
                    this.embed_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setEpisode(int i10) {
                    this.episode_ = i10;
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

                public Builder setGenre(String str) {
                    str.getClass();
                    this.genre_ = str;
                    onChanged();
                    return this;
                }

                public Builder setGenreBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.genre_ = byteString;
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

                public Builder setIsrc(String str) {
                    str.getClass();
                    this.isrc_ = str;
                    onChanged();
                    return this;
                }

                public Builder setIsrcBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.isrc_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setKeywords(String str) {
                    str.getClass();
                    this.keywords_ = str;
                    onChanged();
                    return this;
                }

                public Builder setKeywordsBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.keywords_ = byteString;
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

                public Builder setLen(int i10) {
                    this.len_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLive(boolean z10) {
                    this.live_ = z10;
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

                public Builder setProdq(ProductionQuality productionQuality) {
                    productionQuality.getClass();
                    this.prodq_ = productionQuality.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setProdqValue(int i10) {
                    this.prodq_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setProducer(Producer producer) {
                    xa xaVar = this.producerBuilder_;
                    if (xaVar != null) {
                        xaVar.setMessage(producer);
                        return this;
                    }
                    producer.getClass();
                    this.producer_ = producer;
                    onChanged();
                    return this;
                }

                public Builder setRating(String str) {
                    str.getClass();
                    this.rating_ = str;
                    onChanged();
                    return this;
                }

                public Builder setRatingBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.rating_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSeason(String str) {
                    str.getClass();
                    this.season_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSeasonBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.season_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSeries(String str) {
                    str.getClass();
                    this.series_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSeriesBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.series_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSrcrel(int i10) {
                    this.srcrel_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setTitle(String str) {
                    str.getClass();
                    this.title_ = str;
                    onChanged();
                    return this;
                }

                public Builder setTitleBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.title_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setUrating(String str) {
                    str.getClass();
                    this.urating_ = str;
                    onChanged();
                    return this;
                }

                public Builder setUratingBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.urating_ = byteString;
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

                @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
                public ka getCatList() {
                    return this.cat_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Content build() {
                    Content contentBuildPartial = buildPartial();
                    if (contentBuildPartial.isInitialized()) {
                        return contentBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) contentBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Content buildPartial() {
                    Content content = new Content(this);
                    content.id_ = this.id_;
                    content.episode_ = this.episode_;
                    content.title_ = this.title_;
                    content.series_ = this.series_;
                    content.season_ = this.season_;
                    content.artist_ = this.artist_;
                    content.genre_ = this.genre_;
                    content.album_ = this.album_;
                    content.isrc_ = this.isrc_;
                    content.url_ = this.url_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    content.cat_ = this.cat_;
                    content.cattax_ = this.cattax_;
                    content.prodq_ = this.prodq_;
                    content.context_ = this.context_;
                    content.rating_ = this.rating_;
                    content.urating_ = this.urating_;
                    content.mrating_ = this.mrating_;
                    content.keywords_ = this.keywords_;
                    content.live_ = this.live_;
                    content.srcrel_ = this.srcrel_;
                    content.len_ = this.len_;
                    content.lang_ = this.lang_;
                    content.embed_ = this.embed_;
                    xa xaVar = this.producerBuilder_;
                    if (xaVar == null) {
                        content.producer_ = this.producer_;
                    } else {
                        content.producer_ = (Producer) xaVar.build();
                    }
                    pa paVar = this.dataBuilder_;
                    if (paVar != null) {
                        content.data_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.data_ = Collections.unmodifiableList(this.data_);
                            this.bitField0_ &= -3;
                        }
                        content.data_ = this.data_;
                    }
                    xa xaVar2 = this.extBuilder_;
                    if (xaVar2 == null) {
                        content.ext_ = this.ext_;
                    } else {
                        content.ext_ = (Struct) xaVar2.build();
                    }
                    pa paVar2 = this.extProtoBuilder_;
                    if (paVar2 != null) {
                        content.extProto_ = paVar2.build();
                    } else {
                        if ((this.bitField0_ & 4) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -5;
                        }
                        content.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return content;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Content getDefaultInstanceForType() {
                    return Content.getDefaultInstance();
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

                public Data.Builder addDataBuilder(int i10) {
                    return (Data.Builder) getDataFieldBuilder().addBuilder(i10, Data.getDefaultInstance());
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
                    this.episode_ = 0;
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = f8.f22138e;
                    int i10 = this.bitField0_;
                    this.bitField0_ = i10 & (-2);
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.live_ = false;
                    this.srcrel_ = 0;
                    this.len_ = 0;
                    this.lang_ = "";
                    this.embed_ = false;
                    if (this.producerBuilder_ == null) {
                        this.producer_ = null;
                    } else {
                        this.producer_ = null;
                        this.producerBuilder_ = null;
                    }
                    pa paVar = this.dataBuilder_;
                    if (paVar == null) {
                        this.data_ = Collections.EMPTY_LIST;
                        this.bitField0_ = i10 & (-4);
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
                        this.bitField0_ &= -5;
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

                public Builder setProducer(Producer.Builder builder) {
                    xa xaVar = this.producerBuilder_;
                    if (xaVar == null) {
                        this.producer_ = builder.build();
                        onChanged();
                        return this;
                    }
                    xaVar.setMessage(builder.build());
                    return this;
                }

                public Builder addData(int i10, Data data) {
                    pa paVar = this.dataBuilder_;
                    if (paVar == null) {
                        data.getClass();
                        ensureDataIsMutable();
                        this.data_.add(i10, data);
                        onChanged();
                        return this;
                    }
                    paVar.addMessage(i10, data);
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
                    if (message instanceof Content) {
                        return mergeFrom((Content) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setData(int i10, Data.Builder builder) {
                    pa paVar = this.dataBuilder_;
                    if (paVar == null) {
                        ensureDataIsMutable();
                        this.data_.set(i10, builder.build());
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

                public Builder mergeFrom(Content content) {
                    if (content == Content.getDefaultInstance()) {
                        return this;
                    }
                    if (!content.getId().isEmpty()) {
                        this.id_ = content.id_;
                        onChanged();
                    }
                    if (content.getEpisode() != 0) {
                        setEpisode(content.getEpisode());
                    }
                    if (!content.getTitle().isEmpty()) {
                        this.title_ = content.title_;
                        onChanged();
                    }
                    if (!content.getSeries().isEmpty()) {
                        this.series_ = content.series_;
                        onChanged();
                    }
                    if (!content.getSeason().isEmpty()) {
                        this.season_ = content.season_;
                        onChanged();
                    }
                    if (!content.getArtist().isEmpty()) {
                        this.artist_ = content.artist_;
                        onChanged();
                    }
                    if (!content.getGenre().isEmpty()) {
                        this.genre_ = content.genre_;
                        onChanged();
                    }
                    if (!content.getAlbum().isEmpty()) {
                        this.album_ = content.album_;
                        onChanged();
                    }
                    if (!content.getIsrc().isEmpty()) {
                        this.isrc_ = content.isrc_;
                        onChanged();
                    }
                    if (!content.getUrl().isEmpty()) {
                        this.url_ = content.url_;
                        onChanged();
                    }
                    if (!content.cat_.isEmpty()) {
                        if (this.cat_.isEmpty()) {
                            this.cat_ = content.cat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCatIsMutable();
                            this.cat_.addAll(content.cat_);
                        }
                        onChanged();
                    }
                    if (content.cattax_ != 0) {
                        setCattaxValue(content.getCattaxValue());
                    }
                    if (content.prodq_ != 0) {
                        setProdqValue(content.getProdqValue());
                    }
                    if (content.context_ != 0) {
                        setContextValue(content.getContextValue());
                    }
                    if (!content.getRating().isEmpty()) {
                        this.rating_ = content.rating_;
                        onChanged();
                    }
                    if (!content.getUrating().isEmpty()) {
                        this.urating_ = content.urating_;
                        onChanged();
                    }
                    if (content.mrating_ != 0) {
                        setMratingValue(content.getMratingValue());
                    }
                    if (!content.getKeywords().isEmpty()) {
                        this.keywords_ = content.keywords_;
                        onChanged();
                    }
                    if (content.getLive()) {
                        setLive(content.getLive());
                    }
                    if (content.getSrcrel() != 0) {
                        setSrcrel(content.getSrcrel());
                    }
                    if (content.getLen() != 0) {
                        setLen(content.getLen());
                    }
                    if (!content.getLang().isEmpty()) {
                        this.lang_ = content.lang_;
                        onChanged();
                    }
                    if (content.getEmbed()) {
                        setEmbed(content.getEmbed());
                    }
                    if (content.hasProducer()) {
                        mergeProducer(content.getProducer());
                    }
                    if (this.dataBuilder_ == null) {
                        if (!content.data_.isEmpty()) {
                            if (this.data_.isEmpty()) {
                                this.data_ = content.data_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureDataIsMutable();
                                this.data_.addAll(content.data_);
                            }
                            onChanged();
                        }
                    } else if (!content.data_.isEmpty()) {
                        if (!this.dataBuilder_.isEmpty()) {
                            this.dataBuilder_.addAllMessages(content.data_);
                        } else {
                            this.dataBuilder_.dispose();
                            this.dataBuilder_ = null;
                            this.data_ = content.data_;
                            this.bitField0_ &= -3;
                            this.dataBuilder_ = k7.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                        }
                    }
                    if (content.hasExt()) {
                        mergeExt(content.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!content.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = content.extProto_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(content.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!content.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(content.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = content.extProto_;
                            this.bitField0_ &= -5;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) content).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addData(Data.Builder builder) {
                    pa paVar = this.dataBuilder_;
                    if (paVar == null) {
                        ensureDataIsMutable();
                        this.data_.add(builder.build());
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

                public Builder addData(int i10, Data.Builder builder) {
                    pa paVar = this.dataBuilder_;
                    if (paVar == null) {
                        ensureDataIsMutable();
                        this.data_.add(i10, builder.build());
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
                    this.id_ = "";
                    this.title_ = "";
                    this.series_ = "";
                    this.season_ = "";
                    this.artist_ = "";
                    this.genre_ = "";
                    this.album_ = "";
                    this.isrc_ = "";
                    this.url_ = "";
                    this.cat_ = f8.f22138e;
                    this.cattax_ = 0;
                    this.prodq_ = 0;
                    this.context_ = 0;
                    this.rating_ = "";
                    this.urating_ = "";
                    this.mrating_ = 0;
                    this.keywords_ = "";
                    this.lang_ = "";
                    List list = Collections.EMPTY_LIST;
                    this.data_ = list;
                    this.extProto_ = list;
                    maybeForceBuilderInitialization();
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.explorestack.protobuf.adcom.Context.App.Content.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.App.Content.access$7200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$App$Content r3 = (com.explorestack.protobuf.adcom.Context.App.Content) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$App$Content r4 = (com.explorestack.protobuf.adcom.Context.App.Content) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Content.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$App$Content$Builder");
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Producer extends k7 implements ProducerOrBuilder {
                public static final int CATTAX_FIELD_NUMBER = 5;
                public static final int CAT_FIELD_NUMBER = 4;
                public static final int DOMAIN_FIELD_NUMBER = 3;
                public static final int EXT_FIELD_NUMBER = 7;
                public static final int EXT_PROTO_FIELD_NUMBER = 6;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int NAME_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private g8 cat_;
                private int cattax_;
                private volatile Object domain_;
                private List<Any> extProto_;
                private Struct ext_;
                private volatile Object id_;
                private byte memoizedIsInitialized;
                private volatile Object name_;
                private static final Producer DEFAULT_INSTANCE = new Producer();
                private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.Content.Producer.1
                    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                    public Producer parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                        return new Producer(yVar, m5Var);
                    }
                };

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends o6 implements ProducerOrBuilder {
                    private int bitField0_;
                    private g8 cat_;
                    private int cattax_;
                    private Object domain_;
                    private xa extBuilder_;
                    private pa extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private Object id_;
                    private Object name_;

                    private Builder() {
                        super(null);
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = f8.f22138e;
                        this.cattax_ = 0;
                        this.extProto_ = Collections.EMPTY_LIST;
                        maybeForceBuilderInitialization();
                    }

                    private void ensureCatIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.cat_ = new f8(this.cat_);
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
                        return b.f21874i;
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

                    public Builder clearCat() {
                        this.cat_ = f8.f22138e;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder clearCattax() {
                        this.cattax_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearDomain() {
                        this.domain_ = Producer.getDefaultInstance().getDomain();
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
                        this.id_ = Producer.getDefaultInstance().getId();
                        onChanged();
                        return this;
                    }

                    public Builder clearName() {
                        this.name_ = Producer.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getCat(int i10) {
                        return (String) this.cat_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getCatBytes(int i10) {
                        return this.cat_.getByteString(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public int getCatCount() {
                        return this.cat_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public CategoryTaxonomy getCattax() {
                        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public int getCattaxValue() {
                        return this.cattax_;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.f21874i;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getDomain() {
                        Object obj = this.domain_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.domain_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getDomainBytes() {
                        Object obj = this.domain_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.domain_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public jb getExtOrBuilder() {
                        xa xaVar = this.extBuilder_;
                        if (xaVar != null) {
                            return (jb) xaVar.getMessageOrBuilder();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
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

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public int getExtProtoCount() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.size() : paVar.getCount();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public List<Any> getExtProtoList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                        pa paVar = this.extProtoBuilder_;
                        return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                        pa paVar = this.extProtoBuilder_;
                        return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getId() {
                        Object obj = this.id_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.id_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getIdBytes() {
                        Object obj = this.id_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.id_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public String getName() {
                        Object obj = this.name_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.name_ = stringUtf8;
                        return stringUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ByteString getNameBytes() {
                        Object obj = this.name_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.name_ = byteStringCopyFromUtf8;
                        return byteStringCopyFromUtf8;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.o6
                    public i7 internalGetFieldAccessorTable() {
                        return b.f21876j.ensureFieldAccessorsInitialized(Producer.class, Builder.class);
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

                    public Builder setDomain(String str) {
                        str.getClass();
                        this.domain_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setDomainBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                        this.domain_ = byteString;
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

                    public Builder setName(String str) {
                        str.getClass();
                        this.name_ = str;
                        onChanged();
                        return this;
                    }

                    public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
                        byteString.getClass();
                        com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                        this.name_ = byteString;
                        onChanged();
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                    public ka getCatList() {
                        return this.cat_.getUnmodifiableView();
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Producer build() {
                        Producer producerBuildPartial = buildPartial();
                        if (producerBuildPartial.isInitialized()) {
                            return producerBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) producerBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Producer buildPartial() {
                        Producer producer = new Producer(this);
                        producer.id_ = this.id_;
                        producer.name_ = this.name_;
                        producer.domain_ = this.domain_;
                        if ((this.bitField0_ & 1) != 0) {
                            this.cat_ = this.cat_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        producer.cat_ = this.cat_;
                        producer.cattax_ = this.cattax_;
                        xa xaVar = this.extBuilder_;
                        if (xaVar == null) {
                            producer.ext_ = this.ext_;
                        } else {
                            producer.ext_ = (Struct) xaVar.build();
                        }
                        pa paVar = this.extProtoBuilder_;
                        if (paVar != null) {
                            producer.extProto_ = paVar.build();
                        } else {
                            if ((this.bitField0_ & 2) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -3;
                            }
                            producer.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return producer;
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    public Producer getDefaultInstanceForType() {
                        return Producer.getDefaultInstance();
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
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = f8.f22138e;
                        int i10 = this.bitField0_;
                        this.bitField0_ = i10 & (-2);
                        this.cattax_ = 0;
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
                        if (message instanceof Producer) {
                            return mergeFrom((Producer) message);
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

                    public Builder mergeFrom(Producer producer) {
                        if (producer == Producer.getDefaultInstance()) {
                            return this;
                        }
                        if (!producer.getId().isEmpty()) {
                            this.id_ = producer.id_;
                            onChanged();
                        }
                        if (!producer.getName().isEmpty()) {
                            this.name_ = producer.name_;
                            onChanged();
                        }
                        if (!producer.getDomain().isEmpty()) {
                            this.domain_ = producer.domain_;
                            onChanged();
                        }
                        if (!producer.cat_.isEmpty()) {
                            if (this.cat_.isEmpty()) {
                                this.cat_ = producer.cat_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureCatIsMutable();
                                this.cat_.addAll(producer.cat_);
                            }
                            onChanged();
                        }
                        if (producer.cattax_ != 0) {
                            setCattaxValue(producer.getCattaxValue());
                        }
                        if (producer.hasExt()) {
                            mergeExt(producer.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!producer.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = producer.extProto_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(producer.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!producer.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.addAllMessages(producer.extProto_);
                            } else {
                                this.extProtoBuilder_.dispose();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = producer.extProto_;
                                this.bitField0_ &= -3;
                                this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((k7) producer).unknownFields);
                        onChanged();
                        return this;
                    }

                    private Builder(p6 p6Var) {
                        super(p6Var);
                        this.id_ = "";
                        this.name_ = "";
                        this.domain_ = "";
                        this.cat_ = f8.f22138e;
                        this.cattax_ = 0;
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
                    public com.explorestack.protobuf.adcom.Context.App.Content.Producer.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.App.Content.Producer.access$3200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                            com.explorestack.protobuf.adcom.Context$App$Content$Producer r3 = (com.explorestack.protobuf.adcom.Context.App.Content.Producer) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                            com.explorestack.protobuf.adcom.Context$App$Content$Producer r4 = (com.explorestack.protobuf.adcom.Context.App.Content.Producer) r4     // Catch: java.lang.Throwable -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Content.Producer.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$App$Content$Producer$Builder");
                    }
                }

                public static Producer getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f21874i;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Producer parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Producer) k7.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Producer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteBuffer);
                }

                public static fa parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Producer)) {
                        return super.equals(obj);
                    }
                    Producer producer = (Producer) obj;
                    if (getId().equals(producer.getId()) && getName().equals(producer.getName()) && getDomain().equals(producer.getDomain()) && getCatList().equals(producer.getCatList()) && this.cattax_ == producer.cattax_ && hasExt() == producer.hasExt()) {
                        return (!hasExt() || getExt().equals(producer.getExt())) && getExtProtoList().equals(producer.getExtProtoList()) && this.unknownFields.equals(producer.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getCat(int i10) {
                    return (String) this.cat_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getCatBytes(int i10) {
                    return this.cat_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public int getCatCount() {
                    return this.cat_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public int getCattaxValue() {
                    return this.cattax_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public jb getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
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
                    if (!getNameBytes().isEmpty()) {
                        iComputeStringSize += k7.computeStringSize(2, this.name_);
                    }
                    if (!getDomainBytes().isEmpty()) {
                        iComputeStringSize += k7.computeStringSize(3, this.domain_);
                    }
                    int iE = 0;
                    for (int i11 = 0; i11 < this.cat_.size(); i11++) {
                        iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.cat_, i11, iE);
                    }
                    int size = getCatList().size() + iComputeStringSize + iE;
                    if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                        size += h0.computeEnumSize(5, this.cattax_);
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

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
                public final gc getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = getDomain().hashCode() + ((((getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
                    if (getCatCount() > 0) {
                        iHashCode = getCatList().hashCode() + o2.B(iHashCode, 37, 4, 53);
                    }
                    int iB = o2.B(iHashCode, 37, 5, 53) + this.cattax_;
                    if (hasExt()) {
                        iB = o2.B(iB, 37, 7, 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iB = o2.B(iB, 37, 6, 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode2 = this.unknownFields.hashCode() + (iB * 29);
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.explorestack.protobuf.k7
                public i7 internalGetFieldAccessorTable() {
                    return b.f21876j.ensureFieldAccessorsInitialized(Producer.class, Builder.class);
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
                    return new Producer();
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(h0 h0Var) throws IOException {
                    if (!getIdBytes().isEmpty()) {
                        k7.writeString(h0Var, 1, this.id_);
                    }
                    if (!getNameBytes().isEmpty()) {
                        k7.writeString(h0Var, 2, this.name_);
                    }
                    if (!getDomainBytes().isEmpty()) {
                        k7.writeString(h0Var, 3, this.domain_);
                    }
                    int iF = 0;
                    while (iF < this.cat_.size()) {
                        iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.cat_, iF, h0Var, 4, iF, 1);
                    }
                    if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                        h0Var.writeEnum(5, this.cattax_);
                    }
                    for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                        h0Var.writeMessage(6, this.extProto_.get(i10));
                    }
                    if (this.ext_ != null) {
                        h0Var.writeMessage(7, getExt());
                    }
                    this.unknownFields.writeTo(h0Var);
                }

                public static Builder newBuilder(Producer producer) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(producer);
                }

                public static Producer parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteBuffer, m5Var);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.Content.ProducerOrBuilder
                public ka getCatList() {
                    return this.cat_;
                }

                private Producer(o6 o6Var) {
                    super(o6Var);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static Producer parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Producer) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
                }

                public static Producer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Producer getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static Producer parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(byteString, m5Var);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private Producer() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = f8.f22138e;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.EMPTY_LIST;
                }

                public static Producer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(bArr);
                }

                @Override // com.explorestack.protobuf.k7
                public Builder newBuilderForType(p6 p6Var) {
                    return new Builder(p6Var);
                }

                public static Producer parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                    return (Producer) PARSER.parseFrom(bArr, m5Var);
                }

                public static Producer parseFrom(InputStream inputStream) throws IOException {
                    return (Producer) k7.parseWithIOException(PARSER, inputStream);
                }

                public static Producer parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                    return (Producer) k7.parseWithIOException(PARSER, inputStream, m5Var);
                }

                public static Producer parseFrom(y yVar) throws IOException {
                    return (Producer) k7.parseWithIOException(PARSER, yVar);
                }

                /* JADX WARN: Multi-variable type inference failed */
                private Producer(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                        this.name_ = yVar.readStringRequireUtf8();
                                    } else if (tag == 26) {
                                        this.domain_ = yVar.readStringRequireUtf8();
                                    } else if (tag == 34) {
                                        String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                        if ((i10 & 1) == 0) {
                                            this.cat_ = new f8();
                                            i10 |= 1;
                                        }
                                        this.cat_.add((g8) stringRequireUtf8);
                                    } else if (tag == 40) {
                                        this.cattax_ = yVar.readEnum();
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
                                this.cat_ = this.cat_.getUnmodifiableView();
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
                        this.cat_ = this.cat_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                }

                public static Producer parseFrom(y yVar, m5 m5Var) throws IOException {
                    return (Producer) k7.parseWithIOException(PARSER, yVar, m5Var);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public interface ProducerOrBuilder extends MessageOrBuilder {
                String getCat(int i10);

                ByteString getCatBytes(int i10);

                int getCatCount();

                List<String> getCatList();

                CategoryTaxonomy getCattax();

                int getCattaxValue();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ MessageLite getDefaultInstanceForType();

                String getDomain();

                ByteString getDomainBytes();

                Struct getExt();

                jb getExtOrBuilder();

                Any getExtProto(int i10);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

                List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

                String getId();

                ByteString getIdBytes();

                String getName();

                ByteString getNameBytes();

                boolean hasExt();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static Content getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21870g;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Content parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Content) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return super.equals(obj);
                }
                Content content = (Content) obj;
                if (!getId().equals(content.getId()) || getEpisode() != content.getEpisode() || !getTitle().equals(content.getTitle()) || !getSeries().equals(content.getSeries()) || !getSeason().equals(content.getSeason()) || !getArtist().equals(content.getArtist()) || !getGenre().equals(content.getGenre()) || !getAlbum().equals(content.getAlbum()) || !getIsrc().equals(content.getIsrc()) || !getUrl().equals(content.getUrl()) || !getCatList().equals(content.getCatList()) || this.cattax_ != content.cattax_ || this.prodq_ != content.prodq_ || this.context_ != content.context_ || !getRating().equals(content.getRating()) || !getUrating().equals(content.getUrating()) || this.mrating_ != content.mrating_ || !getKeywords().equals(content.getKeywords()) || getLive() != content.getLive() || getSrcrel() != content.getSrcrel() || getLen() != content.getLen() || !getLang().equals(content.getLang()) || getEmbed() != content.getEmbed() || hasProducer() != content.hasProducer()) {
                    return false;
                }
                if ((!hasProducer() || getProducer().equals(content.getProducer())) && getDataList().equals(content.getDataList()) && hasExt() == content.hasExt()) {
                    return (!hasExt() || getExt().equals(content.getExt())) && getExtProtoList().equals(content.getExtProtoList()) && this.unknownFields.equals(content.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getAlbum() {
                Object obj = this.album_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.album_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getAlbumBytes() {
                Object obj = this.album_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.album_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getArtist() {
                Object obj = this.artist_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.artist_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getArtistBytes() {
                Object obj = this.artist_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.artist_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getCat(int i10) {
                return (String) this.cat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getCatBytes(int i10) {
                return this.cat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getCatCount() {
                return this.cat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ContentContext getContext() {
                ContentContext contentContextValueOf = ContentContext.valueOf(this.context_);
                return contentContextValueOf == null ? ContentContext.UNRECOGNIZED : contentContextValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getContextValue() {
                return this.context_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Data getData(int i10) {
                return this.data_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getDataCount() {
                return this.data_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<Data> getDataList() {
                return this.data_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public DataOrBuilder getDataOrBuilder(int i10) {
                return this.data_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<? extends DataOrBuilder> getDataOrBuilderList() {
                return this.data_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean getEmbed() {
                return this.embed_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getEpisode() {
                return this.episode_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getGenre() {
                Object obj = this.genre_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.genre_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getGenreBytes() {
                Object obj = this.genre_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.genre_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getIsrc() {
                Object obj = this.isrc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.isrc_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getIsrcBytes() {
                Object obj = this.isrc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.isrc_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getLang() {
                Object obj = this.lang_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lang_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getLangBytes() {
                Object obj = this.lang_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lang_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getLen() {
                return this.len_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean getLive() {
                return this.live_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public MediaRating getMrating() {
                MediaRating mediaRatingValueOf = MediaRating.valueOf(this.mrating_);
                return mediaRatingValueOf == null ? MediaRating.UNRECOGNIZED : mediaRatingValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getMratingValue() {
                return this.mrating_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ProductionQuality getProdq() {
                ProductionQuality productionQualityValueOf = ProductionQuality.valueOf(this.prodq_);
                return productionQualityValueOf == null ? ProductionQuality.UNRECOGNIZED : productionQualityValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getProdqValue() {
                return this.prodq_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public Producer getProducer() {
                Producer producer = this.producer_;
                return producer == null ? Producer.getDefaultInstance() : producer;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ProducerOrBuilder getProducerOrBuilder() {
                return getProducer();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getRating() {
                Object obj = this.rating_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.rating_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getRatingBytes() {
                Object obj = this.rating_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.rating_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getSeason() {
                Object obj = this.season_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.season_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getSeasonBytes() {
                Object obj = this.season_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.season_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
                int i11 = this.episode_;
                if (i11 != 0) {
                    iComputeStringSize += h0.computeUInt32Size(2, i11);
                }
                if (!getTitleBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(3, this.title_);
                }
                if (!getSeriesBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(4, this.series_);
                }
                if (!getSeasonBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(5, this.season_);
                }
                if (!getArtistBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(6, this.artist_);
                }
                if (!getGenreBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(7, this.genre_);
                }
                if (!getAlbumBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(8, this.album_);
                }
                if (!getIsrcBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(9, this.isrc_);
                }
                if (!getUrlBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(10, this.url_);
                }
                int iE = 0;
                for (int i12 = 0; i12 < this.cat_.size(); i12++) {
                    iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.cat_, i12, iE);
                }
                int size = getCatList().size() + iComputeStringSize + iE;
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    size += h0.computeEnumSize(12, this.cattax_);
                }
                if (this.prodq_ != ProductionQuality.PRODUCTION_QUALITY_INVALID.getNumber()) {
                    size += h0.computeEnumSize(13, this.prodq_);
                }
                if (this.context_ != ContentContext.CONTENT_CONTEXT_INVALID.getNumber()) {
                    size += h0.computeEnumSize(14, this.context_);
                }
                if (!getRatingBytes().isEmpty()) {
                    size += k7.computeStringSize(15, this.rating_);
                }
                if (!getUratingBytes().isEmpty()) {
                    size += k7.computeStringSize(16, this.urating_);
                }
                if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
                    size += h0.computeEnumSize(17, this.mrating_);
                }
                if (!getKeywordsBytes().isEmpty()) {
                    size += k7.computeStringSize(18, this.keywords_);
                }
                boolean z10 = this.live_;
                if (z10) {
                    size += h0.computeBoolSize(19, z10);
                }
                int i13 = this.srcrel_;
                if (i13 != 0) {
                    size += h0.computeUInt32Size(20, i13);
                }
                int i14 = this.len_;
                if (i14 != 0) {
                    size += h0.computeUInt32Size(21, i14);
                }
                if (!getLangBytes().isEmpty()) {
                    size += k7.computeStringSize(22, this.lang_);
                }
                boolean z11 = this.embed_;
                if (z11) {
                    size += h0.computeBoolSize(23, z11);
                }
                if (this.producer_ != null) {
                    size += h0.computeMessageSize(24, getProducer());
                }
                for (int i15 = 0; i15 < this.data_.size(); i15++) {
                    size += h0.computeMessageSize(25, this.data_.get(i15));
                }
                for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
                    size += h0.computeMessageSize(26, this.extProto_.get(i16));
                }
                if (this.ext_ != null) {
                    size += h0.computeMessageSize(27, getExt());
                }
                int serializedSize = this.unknownFields.getSerializedSize() + size;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getSeries() {
                Object obj = this.series_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.series_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getSeriesBytes() {
                Object obj = this.series_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.series_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public int getSrcrel() {
                return this.srcrel_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getUrating() {
                Object obj = this.urating_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.urating_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getUratingBytes() {
                Object obj = this.urating_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.urating_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public boolean hasProducer() {
                return this.producer_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getUrl().hashCode() + ((((getIsrc().hashCode() + ((((getAlbum().hashCode() + ((((getGenre().hashCode() + ((((getArtist().hashCode() + ((((getSeason().hashCode() + ((((getSeries().hashCode() + ((((getTitle().hashCode() + ((((getEpisode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53);
                if (getCatCount() > 0) {
                    iHashCode = o2.B(iHashCode, 37, 11, 53) + getCatList().hashCode();
                }
                int iHashBoolean = x7.hashBoolean(getEmbed()) + ((((getLang().hashCode() + ((((getLen() + ((((getSrcrel() + ((((x7.hashBoolean(getLive()) + ((((getKeywords().hashCode() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getUrating().hashCode() + ((((getRating().hashCode() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(o2.B(iHashCode, 37, 12, 53), this.cattax_, 37, 13, 53), this.prodq_, 37, 14, 53), this.context_, 37, 15, 53)) * 37) + 16) * 53)) * 37) + 17) * 53, this.mrating_, 37, 18, 53)) * 37) + 19) * 53)) * 37) + 20) * 53)) * 37) + 21) * 53)) * 37) + 22) * 53)) * 37) + 23) * 53);
                if (hasProducer()) {
                    iHashBoolean = o2.B(iHashBoolean, 37, 24, 53) + getProducer().hashCode();
                }
                if (getDataCount() > 0) {
                    iHashBoolean = o2.B(iHashBoolean, 37, 25, 53) + getDataList().hashCode();
                }
                if (hasExt()) {
                    iHashBoolean = o2.B(iHashBoolean, 37, 27, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashBoolean = o2.B(iHashBoolean, 37, 26, 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iHashBoolean * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return b.f21872h.ensureFieldAccessorsInitialized(Content.class, Builder.class);
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
                return new Content();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.id_);
                }
                int i10 = this.episode_;
                if (i10 != 0) {
                    h0Var.writeUInt32(2, i10);
                }
                if (!getTitleBytes().isEmpty()) {
                    k7.writeString(h0Var, 3, this.title_);
                }
                if (!getSeriesBytes().isEmpty()) {
                    k7.writeString(h0Var, 4, this.series_);
                }
                if (!getSeasonBytes().isEmpty()) {
                    k7.writeString(h0Var, 5, this.season_);
                }
                if (!getArtistBytes().isEmpty()) {
                    k7.writeString(h0Var, 6, this.artist_);
                }
                if (!getGenreBytes().isEmpty()) {
                    k7.writeString(h0Var, 7, this.genre_);
                }
                if (!getAlbumBytes().isEmpty()) {
                    k7.writeString(h0Var, 8, this.album_);
                }
                if (!getIsrcBytes().isEmpty()) {
                    k7.writeString(h0Var, 9, this.isrc_);
                }
                if (!getUrlBytes().isEmpty()) {
                    k7.writeString(h0Var, 10, this.url_);
                }
                int iF = 0;
                while (iF < this.cat_.size()) {
                    iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.cat_, iF, h0Var, 11, iF, 1);
                }
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    h0Var.writeEnum(12, this.cattax_);
                }
                if (this.prodq_ != ProductionQuality.PRODUCTION_QUALITY_INVALID.getNumber()) {
                    h0Var.writeEnum(13, this.prodq_);
                }
                if (this.context_ != ContentContext.CONTENT_CONTEXT_INVALID.getNumber()) {
                    h0Var.writeEnum(14, this.context_);
                }
                if (!getRatingBytes().isEmpty()) {
                    k7.writeString(h0Var, 15, this.rating_);
                }
                if (!getUratingBytes().isEmpty()) {
                    k7.writeString(h0Var, 16, this.urating_);
                }
                if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
                    h0Var.writeEnum(17, this.mrating_);
                }
                if (!getKeywordsBytes().isEmpty()) {
                    k7.writeString(h0Var, 18, this.keywords_);
                }
                boolean z10 = this.live_;
                if (z10) {
                    h0Var.writeBool(19, z10);
                }
                int i11 = this.srcrel_;
                if (i11 != 0) {
                    h0Var.writeUInt32(20, i11);
                }
                int i12 = this.len_;
                if (i12 != 0) {
                    h0Var.writeUInt32(21, i12);
                }
                if (!getLangBytes().isEmpty()) {
                    k7.writeString(h0Var, 22, this.lang_);
                }
                boolean z11 = this.embed_;
                if (z11) {
                    h0Var.writeBool(23, z11);
                }
                if (this.producer_ != null) {
                    h0Var.writeMessage(24, getProducer());
                }
                for (int i13 = 0; i13 < this.data_.size(); i13++) {
                    h0Var.writeMessage(25, this.data_.get(i13));
                }
                for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                    h0Var.writeMessage(26, this.extProto_.get(i14));
                }
                if (this.ext_ != null) {
                    h0Var.writeMessage(27, getExt());
                }
                this.unknownFields.writeTo(h0Var);
            }

            public static Builder newBuilder(Content content) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(content);
            }

            public static Content parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteBuffer, m5Var);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ContentOrBuilder
            public ka getCatList() {
                return this.cat_;
            }

            private Content(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Content parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Content) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Content getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Content parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Content() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.title_ = "";
                this.series_ = "";
                this.season_ = "";
                this.artist_ = "";
                this.genre_ = "";
                this.album_ = "";
                this.isrc_ = "";
                this.url_ = "";
                this.cat_ = f8.f22138e;
                this.cattax_ = 0;
                this.prodq_ = 0;
                this.context_ = 0;
                this.rating_ = "";
                this.urating_ = "";
                this.mrating_ = 0;
                this.keywords_ = "";
                this.lang_ = "";
                List list = Collections.EMPTY_LIST;
                this.data_ = list;
                this.extProto_ = list;
            }

            public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Content parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Content) PARSER.parseFrom(bArr, m5Var);
            }

            public static Content parseFrom(InputStream inputStream) throws IOException {
                return (Content) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Content parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Content) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Content parseFrom(y yVar) throws IOException {
                return (Content) k7.parseWithIOException(PARSER, yVar);
            }

            public static Content parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Content) k7.parseWithIOException(PARSER, yVar, m5Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v5 */
            /* JADX WARN: Type inference failed for: r2v7 */
            private Content(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.episode_ = yVar.readUInt32();
                                case 26:
                                    this.title_ = yVar.readStringRequireUtf8();
                                case 34:
                                    this.series_ = yVar.readStringRequireUtf8();
                                case 42:
                                    this.season_ = yVar.readStringRequireUtf8();
                                case 50:
                                    this.artist_ = yVar.readStringRequireUtf8();
                                case 58:
                                    this.genre_ = yVar.readStringRequireUtf8();
                                case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                    this.album_ = yVar.readStringRequireUtf8();
                                case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                    this.isrc_ = yVar.readStringRequireUtf8();
                                case 82:
                                    this.url_ = yVar.readStringRequireUtf8();
                                case 90:
                                    String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                    int i10 = (c10 == true ? 1 : 0) & 1;
                                    c10 = c10;
                                    if (i10 == 0) {
                                        this.cat_ = new f8();
                                        c10 = (c10 == true ? 1 : 0) | 1;
                                    }
                                    this.cat_.add((g8) stringRequireUtf8);
                                case 96:
                                    this.cattax_ = yVar.readEnum();
                                case 104:
                                    this.prodq_ = yVar.readEnum();
                                case 112:
                                    this.context_ = yVar.readEnum();
                                case INVALID_ADS_ENDPOINT_VALUE:
                                    this.rating_ = yVar.readStringRequireUtf8();
                                case 130:
                                    this.urating_ = yVar.readStringRequireUtf8();
                                case PRIVACY_URL_ERROR_VALUE:
                                    this.mrating_ = yVar.readEnum();
                                case 146:
                                    this.keywords_ = yVar.readStringRequireUtf8();
                                case 152:
                                    this.live_ = yVar.readBool();
                                case 160:
                                    this.srcrel_ = yVar.readUInt32();
                                case 168:
                                    this.len_ = yVar.readUInt32();
                                case 178:
                                    this.lang_ = yVar.readStringRequireUtf8();
                                case 184:
                                    this.embed_ = yVar.readBool();
                                case 194:
                                    Producer producer = this.producer_;
                                    Producer.Builder builder = producer != null ? producer.toBuilder() : null;
                                    Producer producer2 = (Producer) yVar.readMessage(Producer.parser(), m5Var);
                                    this.producer_ = producer2;
                                    if (builder != null) {
                                        builder.mergeFrom(producer2);
                                        this.producer_ = builder.buildPartial();
                                    }
                                case 202:
                                    int i11 = (c10 == true ? 1 : 0) & 2;
                                    c10 = c10;
                                    if (i11 == 0) {
                                        this.data_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 2;
                                    }
                                    this.data_.add(yVar.readMessage(Data.parser(), m5Var));
                                case 210:
                                    int i12 = (c10 == true ? 1 : 0) & 4;
                                    c10 = c10;
                                    if (i12 == 0) {
                                        this.extProto_ = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 4;
                                    }
                                    this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                                case MRAID_JS_DOES_NOT_EXIST_VALUE:
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
                            this.cat_ = this.cat_.getUnmodifiableView();
                        }
                        if (((c10 == true ? 1 : 0) & 2) != 0) {
                            this.data_ = Collections.unmodifiableList(this.data_);
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
                    this.cat_ = this.cat_.getUnmodifiableView();
                }
                if (((c10 == true ? 1 : 0) & 2) != 0) {
                    this.data_ = Collections.unmodifiableList(this.data_);
                }
                if (((c10 == true ? 1 : 0) & 4) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface ContentOrBuilder extends MessageOrBuilder {
            String getAlbum();

            ByteString getAlbumBytes();

            String getArtist();

            ByteString getArtistBytes();

            String getCat(int i10);

            ByteString getCatBytes(int i10);

            int getCatCount();

            List<String> getCatList();

            CategoryTaxonomy getCattax();

            int getCattaxValue();

            ContentContext getContext();

            int getContextValue();

            Data getData(int i10);

            int getDataCount();

            List<Data> getDataList();

            DataOrBuilder getDataOrBuilder(int i10);

            List<? extends DataOrBuilder> getDataOrBuilderList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            boolean getEmbed();

            int getEpisode();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

            List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

            String getGenre();

            ByteString getGenreBytes();

            String getId();

            ByteString getIdBytes();

            String getIsrc();

            ByteString getIsrcBytes();

            String getKeywords();

            ByteString getKeywordsBytes();

            String getLang();

            ByteString getLangBytes();

            int getLen();

            boolean getLive();

            MediaRating getMrating();

            int getMratingValue();

            ProductionQuality getProdq();

            int getProdqValue();

            Content.Producer getProducer();

            Content.ProducerOrBuilder getProducerOrBuilder();

            String getRating();

            ByteString getRatingBytes();

            String getSeason();

            ByteString getSeasonBytes();

            String getSeries();

            ByteString getSeriesBytes();

            int getSrcrel();

            String getTitle();

            ByteString getTitleBytes();

            String getUrating();

            ByteString getUratingBytes();

            String getUrl();

            ByteString getUrlBytes();

            boolean hasExt();

            boolean hasProducer();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Publisher extends k7 implements PublisherOrBuilder {
            public static final int CATTAX_FIELD_NUMBER = 5;
            public static final int CAT_FIELD_NUMBER = 4;
            public static final int DOMAIN_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 7;
            public static final int EXT_PROTO_FIELD_NUMBER = 6;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private g8 cat_;
            private int cattax_;
            private volatile Object domain_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private static final Publisher DEFAULT_INSTANCE = new Publisher();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.Publisher.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Publisher parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Publisher(yVar, m5Var);
                }
            };

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements PublisherOrBuilder {
                private int bitField0_;
                private g8 cat_;
                private int cattax_;
                private Object domain_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object name_;

                private Builder() {
                    super(null);
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = f8.f22138e;
                    this.cattax_ = 0;
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                private void ensureCatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.cat_ = new f8(this.cat_);
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
                    return b.f21866e;
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

                public Builder clearCat() {
                    this.cat_ = f8.f22138e;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearCattax() {
                    this.cattax_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearDomain() {
                    this.domain_ = Publisher.getDefaultInstance().getDomain();
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
                    this.id_ = Publisher.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = Publisher.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getCat(int i10) {
                    return (String) this.cat_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getCatBytes(int i10) {
                    return this.cat_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public int getCatCount() {
                    return this.cat_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public CategoryTaxonomy getCattax() {
                    CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                    return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public int getCattaxValue() {
                    return this.cattax_;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f21866e;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.f21868f.ensureFieldAccessorsInitialized(Publisher.class, Builder.class);
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

                public Builder setDomain(String str) {
                    str.getClass();
                    this.domain_ = str;
                    onChanged();
                    return this;
                }

                public Builder setDomainBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.domain_ = byteString;
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

                public Builder setName(String str) {
                    str.getClass();
                    this.name_ = str;
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
                public ka getCatList() {
                    return this.cat_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Publisher build() {
                    Publisher publisherBuildPartial = buildPartial();
                    if (publisherBuildPartial.isInitialized()) {
                        return publisherBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) publisherBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Publisher buildPartial() {
                    Publisher publisher = new Publisher(this);
                    publisher.id_ = this.id_;
                    publisher.name_ = this.name_;
                    publisher.domain_ = this.domain_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.cat_ = this.cat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    publisher.cat_ = this.cat_;
                    publisher.cattax_ = this.cattax_;
                    xa xaVar = this.extBuilder_;
                    if (xaVar == null) {
                        publisher.ext_ = this.ext_;
                    } else {
                        publisher.ext_ = (Struct) xaVar.build();
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        publisher.extProto_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        publisher.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return publisher;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Publisher getDefaultInstanceForType() {
                    return Publisher.getDefaultInstance();
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
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = f8.f22138e;
                    int i10 = this.bitField0_;
                    this.bitField0_ = i10 & (-2);
                    this.cattax_ = 0;
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
                    if (message instanceof Publisher) {
                        return mergeFrom((Publisher) message);
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

                public Builder mergeFrom(Publisher publisher) {
                    if (publisher == Publisher.getDefaultInstance()) {
                        return this;
                    }
                    if (!publisher.getId().isEmpty()) {
                        this.id_ = publisher.id_;
                        onChanged();
                    }
                    if (!publisher.getName().isEmpty()) {
                        this.name_ = publisher.name_;
                        onChanged();
                    }
                    if (!publisher.getDomain().isEmpty()) {
                        this.domain_ = publisher.domain_;
                        onChanged();
                    }
                    if (!publisher.cat_.isEmpty()) {
                        if (this.cat_.isEmpty()) {
                            this.cat_ = publisher.cat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureCatIsMutable();
                            this.cat_.addAll(publisher.cat_);
                        }
                        onChanged();
                    }
                    if (publisher.cattax_ != 0) {
                        setCattaxValue(publisher.getCattaxValue());
                    }
                    if (publisher.hasExt()) {
                        mergeExt(publisher.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!publisher.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = publisher.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(publisher.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!publisher.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(publisher.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = publisher.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) publisher).unknownFields);
                    onChanged();
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.id_ = "";
                    this.name_ = "";
                    this.domain_ = "";
                    this.cat_ = f8.f22138e;
                    this.cattax_ = 0;
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
                public com.explorestack.protobuf.adcom.Context.App.Publisher.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.App.Publisher.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$App$Publisher r3 = (com.explorestack.protobuf.adcom.Context.App.Publisher) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$App$Publisher r4 = (com.explorestack.protobuf.adcom.Context.App.Publisher) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Publisher.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$App$Publisher$Builder");
                }
            }

            public static Publisher getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21866e;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Publisher parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Publisher) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Publisher parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Publisher)) {
                    return super.equals(obj);
                }
                Publisher publisher = (Publisher) obj;
                if (getId().equals(publisher.getId()) && getName().equals(publisher.getName()) && getDomain().equals(publisher.getDomain()) && getCatList().equals(publisher.getCatList()) && this.cattax_ == publisher.cattax_ && hasExt() == publisher.hasExt()) {
                    return (!hasExt() || getExt().equals(publisher.getExt())) && getExtProtoList().equals(publisher.getExtProtoList()) && this.unknownFields.equals(publisher.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getCat(int i10) {
                return (String) this.cat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getCatBytes(int i10) {
                return this.cat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public int getCatCount() {
                return this.cat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
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
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(2, this.name_);
                }
                if (!getDomainBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(3, this.domain_);
                }
                int iE = 0;
                for (int i11 = 0; i11 < this.cat_.size(); i11++) {
                    iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.cat_, i11, iE);
                }
                int size = getCatList().size() + iComputeStringSize + iE;
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    size += h0.computeEnumSize(5, this.cattax_);
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

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getDomain().hashCode() + ((((getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
                if (getCatCount() > 0) {
                    iHashCode = getCatList().hashCode() + o2.B(iHashCode, 37, 4, 53);
                }
                int iB = o2.B(iHashCode, 37, 5, 53) + this.cattax_;
                if (hasExt()) {
                    iB = o2.B(iB, 37, 7, 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iB = o2.B(iB, 37, 6, 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = this.unknownFields.hashCode() + (iB * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return b.f21868f.ensureFieldAccessorsInitialized(Publisher.class, Builder.class);
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
                return new Publisher();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.id_);
                }
                if (!getNameBytes().isEmpty()) {
                    k7.writeString(h0Var, 2, this.name_);
                }
                if (!getDomainBytes().isEmpty()) {
                    k7.writeString(h0Var, 3, this.domain_);
                }
                int iF = 0;
                while (iF < this.cat_.size()) {
                    iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.cat_, iF, h0Var, 4, iF, 1);
                }
                if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                    h0Var.writeEnum(5, this.cattax_);
                }
                for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                    h0Var.writeMessage(6, this.extProto_.get(i10));
                }
                if (this.ext_ != null) {
                    h0Var.writeMessage(7, getExt());
                }
                this.unknownFields.writeTo(h0Var);
            }

            public static Builder newBuilder(Publisher publisher) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(publisher);
            }

            public static Publisher parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteBuffer, m5Var);
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.PublisherOrBuilder
            public ka getCatList() {
                return this.cat_;
            }

            private Publisher(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Publisher parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Publisher) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Publisher parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Publisher getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Publisher parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Publisher() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.name_ = "";
                this.domain_ = "";
                this.cat_ = f8.f22138e;
                this.cattax_ = 0;
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Publisher parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Publisher parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Publisher) PARSER.parseFrom(bArr, m5Var);
            }

            public static Publisher parseFrom(InputStream inputStream) throws IOException {
                return (Publisher) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Publisher parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Publisher) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static Publisher parseFrom(y yVar) throws IOException {
                return (Publisher) k7.parseWithIOException(PARSER, yVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Publisher(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.name_ = yVar.readStringRequireUtf8();
                                } else if (tag == 26) {
                                    this.domain_ = yVar.readStringRequireUtf8();
                                } else if (tag == 34) {
                                    String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                    if ((i10 & 1) == 0) {
                                        this.cat_ = new f8();
                                        i10 |= 1;
                                    }
                                    this.cat_.add((g8) stringRequireUtf8);
                                } else if (tag == 40) {
                                    this.cattax_ = yVar.readEnum();
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
                            this.cat_ = this.cat_.getUnmodifiableView();
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
                    this.cat_ = this.cat_.getUnmodifiableView();
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Publisher parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Publisher) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface PublisherOrBuilder extends MessageOrBuilder {
            String getCat(int i10);

            ByteString getCatBytes(int i10);

            int getCatCount();

            List<String> getCatList();

            CategoryTaxonomy getCattax();

            int getCattaxValue();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            String getDomain();

            ByteString getDomainBytes();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

            List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getName();

            ByteString getNameBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Release extends k7 implements ReleaseOrBuilder {
            private static final Release DEFAULT_INSTANCE = new Release();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.App.Release.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Release parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Release(yVar, m5Var);
                }
            };
            public static final int SIGNATURESHA1_FIELD_NUMBER = 2;
            public static final int SIGNATURESHA256_FIELD_NUMBER = 3;
            public static final int TYPE_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private volatile Object signatureSHA1_;
            private volatile Object signatureSHA256_;
            private volatile Object type_;

            public static Release getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21878k;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Release parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Release) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Release parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Release)) {
                    return super.equals(obj);
                }
                Release release = (Release) obj;
                return getType().equals(release.getType()) && getSignatureSHA1().equals(release.getSignatureSHA1()) && getSignatureSHA256().equals(release.getSignatureSHA256()) && this.unknownFields.equals(release.unknownFields);
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
                if (!getSignatureSHA1Bytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(2, this.signatureSHA1_);
                }
                if (!getSignatureSHA256Bytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(3, this.signatureSHA256_);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public String getSignatureSHA1() {
                Object obj = this.signatureSHA1_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signatureSHA1_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public ByteString getSignatureSHA1Bytes() {
                Object obj = this.signatureSHA1_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signatureSHA1_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public String getSignatureSHA256() {
                Object obj = this.signatureSHA256_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.signatureSHA256_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public ByteString getSignatureSHA256Bytes() {
                Object obj = this.signatureSHA256_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.signatureSHA256_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
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

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = this.unknownFields.hashCode() + ((getSignatureSHA256().hashCode() + ((((getSignatureSHA1().hashCode() + ((((getType().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return b.f21880l.ensureFieldAccessorsInitialized(Release.class, Builder.class);
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
                return new Release();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getTypeBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.type_);
                }
                if (!getSignatureSHA1Bytes().isEmpty()) {
                    k7.writeString(h0Var, 2, this.signatureSHA1_);
                }
                if (!getSignatureSHA256Bytes().isEmpty()) {
                    k7.writeString(h0Var, 3, this.signatureSHA256_);
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements ReleaseOrBuilder {
                private Object signatureSHA1_;
                private Object signatureSHA256_;
                private Object type_;

                private Builder() {
                    super(null);
                    this.type_ = "";
                    this.signatureSHA1_ = "";
                    this.signatureSHA256_ = "";
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f21878k;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearSignatureSHA1() {
                    this.signatureSHA1_ = Release.getDefaultInstance().getSignatureSHA1();
                    onChanged();
                    return this;
                }

                public Builder clearSignatureSHA256() {
                    this.signatureSHA256_ = Release.getDefaultInstance().getSignatureSHA256();
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.type_ = Release.getDefaultInstance().getType();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f21878k;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public String getSignatureSHA1() {
                    Object obj = this.signatureSHA1_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.signatureSHA1_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public ByteString getSignatureSHA1Bytes() {
                    Object obj = this.signatureSHA1_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.signatureSHA1_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public String getSignatureSHA256() {
                    Object obj = this.signatureSHA256_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.signatureSHA256_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public ByteString getSignatureSHA256Bytes() {
                    Object obj = this.signatureSHA256_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.signatureSHA256_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public String getType() {
                    Object obj = this.type_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.type_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.App.ReleaseOrBuilder
                public ByteString getTypeBytes() {
                    Object obj = this.type_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.type_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.f21880l.ensureFieldAccessorsInitialized(Release.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setSignatureSHA1(String str) {
                    str.getClass();
                    this.signatureSHA1_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSignatureSHA1Bytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.signatureSHA1_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setSignatureSHA256(String str) {
                    str.getClass();
                    this.signatureSHA256_ = str;
                    onChanged();
                    return this;
                }

                public Builder setSignatureSHA256Bytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.signatureSHA256_ = byteString;
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

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Release build() {
                    Release releaseBuildPartial = buildPartial();
                    if (releaseBuildPartial.isInitialized()) {
                        return releaseBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) releaseBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Release buildPartial() {
                    Release release = new Release(this);
                    release.type_ = this.type_;
                    release.signatureSHA1_ = this.signatureSHA1_;
                    release.signatureSHA256_ = this.signatureSHA256_;
                    onBuilt();
                    return release;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Release getDefaultInstanceForType() {
                    return Release.getDefaultInstance();
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
                    this.type_ = "";
                    this.signatureSHA1_ = "";
                    this.signatureSHA256_ = "";
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Release) {
                        return mergeFrom((Release) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.type_ = "";
                    this.signatureSHA1_ = "";
                    this.signatureSHA256_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Release release) {
                    if (release == Release.getDefaultInstance()) {
                        return this;
                    }
                    if (!release.getType().isEmpty()) {
                        this.type_ = release.type_;
                        onChanged();
                    }
                    if (!release.getSignatureSHA1().isEmpty()) {
                        this.signatureSHA1_ = release.signatureSHA1_;
                        onChanged();
                    }
                    if (!release.getSignatureSHA256().isEmpty()) {
                        this.signatureSHA256_ = release.signatureSHA256_;
                        onChanged();
                    }
                    mergeUnknownFields(((k7) release).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.explorestack.protobuf.adcom.Context.App.Release.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.App.Release.access$9600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$App$Release r3 = (com.explorestack.protobuf.adcom.Context.App.Release) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$App$Release r4 = (com.explorestack.protobuf.adcom.Context.App.Release) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.App.Release.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$App$Release$Builder");
                }
            }

            public static Builder newBuilder(Release release) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(release);
            }

            public static Release parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Release(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Release parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Release) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Release parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Release getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Release parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Release() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = "";
                this.signatureSHA1_ = "";
                this.signatureSHA256_ = "";
            }

            public static Release parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Release parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Release) PARSER.parseFrom(bArr, m5Var);
            }

            public static Release parseFrom(InputStream inputStream) throws IOException {
                return (Release) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Release parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Release) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            private Release(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.type_ = yVar.readStringRequireUtf8();
                                } else if (tag == 18) {
                                    this.signatureSHA1_ = yVar.readStringRequireUtf8();
                                } else if (tag != 26) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    this.signatureSHA256_ = yVar.readStringRequireUtf8();
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

            public static Release parseFrom(y yVar) throws IOException {
                return (Release) k7.parseWithIOException(PARSER, yVar);
            }

            public static Release parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Release) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface ReleaseOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            String getSignatureSHA1();

            ByteString getSignatureSHA1Bytes();

            String getSignatureSHA256();

            ByteString getSignatureSHA256Bytes();

            String getType();

            ByteString getTypeBytes();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static App getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21862c;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (App) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof App)) {
                return super.equals(obj);
            }
            App app = (App) obj;
            if (!getId().equals(app.getId()) || !getName().equals(app.getName()) || hasPub() != app.hasPub()) {
                return false;
            }
            if ((hasPub() && !getPub().equals(app.getPub())) || hasContent() != app.hasContent()) {
                return false;
            }
            if ((hasContent() && !getContent().equals(app.getContent())) || !getDomain().equals(app.getDomain()) || !getCatList().equals(app.getCatList()) || !getSectcatList().equals(app.getSectcatList()) || !getPagecatList().equals(app.getPagecatList()) || this.cattax_ != app.cattax_ || getPrivpolicy() != app.getPrivpolicy() || !getKeywords().equals(app.getKeywords()) || !getBundle().equals(app.getBundle()) || !getStoreid().equals(app.getStoreid()) || !getStoreurl().equals(app.getStoreurl()) || !getVer().equals(app.getVer()) || getPaid() != app.getPaid() || hasRelease() != app.hasRelease()) {
                return false;
            }
            if ((!hasRelease() || getRelease().equals(app.getRelease())) && hasExt() == app.hasExt()) {
                return (!hasExt() || getExt().equals(app.getExt())) && getExtProtoList().equals(app.getExtProtoList()) && this.unknownFields.equals(app.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getCat(int i10) {
            return (String) this.cat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getCatBytes(int i10) {
            return this.cat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getCatCount() {
            return this.cat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Content getContent() {
            Content content = this.content_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ContentOrBuilder getContentOrBuilder() {
            return getContent();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getDomain() {
            Object obj = this.domain_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.domain_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getDomainBytes() {
            Object obj = this.domain_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.domain_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getKeywords() {
            Object obj = this.keywords_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.keywords_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getKeywordsBytes() {
            Object obj = this.keywords_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.keywords_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getPagecat(int i10) {
            return (String) this.pagecat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getPagecatBytes(int i10) {
            return this.pagecat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getPagecatCount() {
            return this.pagecat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean getPaid() {
            return this.paid_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean getPrivpolicy() {
            return this.privpolicy_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Publisher getPub() {
            Publisher publisher = this.pub_;
            return publisher == null ? Publisher.getDefaultInstance() : publisher;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public PublisherOrBuilder getPubOrBuilder() {
            return getPub();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public Release getRelease() {
            Release release = this.release_;
            return release == null ? Release.getDefaultInstance() : release;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ReleaseOrBuilder getReleaseOrBuilder() {
            return getRelease();
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getSectcat(int i10) {
            return (String) this.sectcat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getSectcatBytes(int i10) {
            return this.sectcat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public int getSectcatCount() {
            return this.sectcat_.size();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
            if (!getNameBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(2, this.name_);
            }
            if (this.pub_ != null) {
                iComputeStringSize += h0.computeMessageSize(3, getPub());
            }
            if (this.content_ != null) {
                iComputeStringSize += h0.computeMessageSize(4, getContent());
            }
            if (!getDomainBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(5, this.domain_);
            }
            int iE = 0;
            for (int i11 = 0; i11 < this.cat_.size(); i11++) {
                iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.cat_, i11, iE);
            }
            int size = getCatList().size() + iComputeStringSize + iE;
            int iE2 = 0;
            for (int i12 = 0; i12 < this.sectcat_.size(); i12++) {
                iE2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.sectcat_, i12, iE2);
            }
            int size2 = getSectcatList().size() + size + iE2;
            int iE3 = 0;
            for (int i13 = 0; i13 < this.pagecat_.size(); i13++) {
                iE3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.pagecat_, i13, iE3);
            }
            int size3 = getPagecatList().size() + size2 + iE3;
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                size3 += h0.computeEnumSize(9, this.cattax_);
            }
            boolean z10 = this.privpolicy_;
            if (z10) {
                size3 += h0.computeBoolSize(10, z10);
            }
            if (!getKeywordsBytes().isEmpty()) {
                size3 += k7.computeStringSize(11, this.keywords_);
            }
            if (!getBundleBytes().isEmpty()) {
                size3 += k7.computeStringSize(12, this.bundle_);
            }
            if (!getStoreidBytes().isEmpty()) {
                size3 += k7.computeStringSize(13, this.storeid_);
            }
            if (!getStoreurlBytes().isEmpty()) {
                size3 += k7.computeStringSize(14, this.storeurl_);
            }
            if (!getVerBytes().isEmpty()) {
                size3 += k7.computeStringSize(15, this.ver_);
            }
            boolean z11 = this.paid_;
            if (z11) {
                size3 += h0.computeBoolSize(16, z11);
            }
            for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                size3 += h0.computeMessageSize(17, this.extProto_.get(i14));
            }
            if (this.ext_ != null) {
                size3 += h0.computeMessageSize(18, getExt());
            }
            if (this.release_ != null) {
                size3 += h0.computeMessageSize(19, getRelease());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + size3;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getStoreid() {
            Object obj = this.storeid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getStoreidBytes() {
            Object obj = this.storeid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getStoreurl() {
            Object obj = this.storeurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeurl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getStoreurlBytes() {
            Object obj = this.storeurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeurl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public String getVer() {
            Object obj = this.ver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ByteString getVerBytes() {
            Object obj = this.ver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasContent() {
            return this.content_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasPub() {
            return this.pub_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public boolean hasRelease() {
            return this.release_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
            if (hasPub()) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + getPub().hashCode();
            }
            if (hasContent()) {
                iHashCode = o2.B(iHashCode, 37, 4, 53) + getContent().hashCode();
            }
            int iHashCode2 = getDomain().hashCode() + o2.B(iHashCode, 37, 5, 53);
            if (getCatCount() > 0) {
                iHashCode2 = getCatList().hashCode() + o2.B(iHashCode2, 37, 6, 53);
            }
            if (getSectcatCount() > 0) {
                iHashCode2 = getSectcatList().hashCode() + o2.B(iHashCode2, 37, 7, 53);
            }
            if (getPagecatCount() > 0) {
                iHashCode2 = getPagecatList().hashCode() + o2.B(iHashCode2, 37, 8, 53);
            }
            int iHashBoolean = x7.hashBoolean(getPaid()) + ((((getVer().hashCode() + ((((getStoreurl().hashCode() + ((((getStoreid().hashCode() + ((((getBundle().hashCode() + ((((getKeywords().hashCode() + ((((x7.hashBoolean(getPrivpolicy()) + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(o2.B(iHashCode2, 37, 9, 53), this.cattax_, 37, 10, 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53);
            if (hasRelease()) {
                iHashBoolean = getRelease().hashCode() + o2.B(iHashBoolean, 37, 19, 53);
            }
            if (hasExt()) {
                iHashBoolean = getExt().hashCode() + o2.B(iHashBoolean, 37, 18, 53);
            }
            if (getExtProtoCount() > 0) {
                iHashBoolean = getExtProtoList().hashCode() + o2.B(iHashBoolean, 37, 17, 53);
            }
            int iHashCode3 = this.unknownFields.hashCode() + (iHashBoolean * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.f21864d.ensureFieldAccessorsInitialized(App.class, Builder.class);
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
            return new App();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getIdBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.id_);
            }
            if (!getNameBytes().isEmpty()) {
                k7.writeString(h0Var, 2, this.name_);
            }
            if (this.pub_ != null) {
                h0Var.writeMessage(3, getPub());
            }
            if (this.content_ != null) {
                h0Var.writeMessage(4, getContent());
            }
            if (!getDomainBytes().isEmpty()) {
                k7.writeString(h0Var, 5, this.domain_);
            }
            int iF = 0;
            while (iF < this.cat_.size()) {
                iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.cat_, iF, h0Var, 6, iF, 1);
            }
            int iF2 = 0;
            while (iF2 < this.sectcat_.size()) {
                iF2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.sectcat_, iF2, h0Var, 7, iF2, 1);
            }
            int iF3 = 0;
            while (iF3 < this.pagecat_.size()) {
                iF3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.pagecat_, iF3, h0Var, 8, iF3, 1);
            }
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                h0Var.writeEnum(9, this.cattax_);
            }
            boolean z10 = this.privpolicy_;
            if (z10) {
                h0Var.writeBool(10, z10);
            }
            if (!getKeywordsBytes().isEmpty()) {
                k7.writeString(h0Var, 11, this.keywords_);
            }
            if (!getBundleBytes().isEmpty()) {
                k7.writeString(h0Var, 12, this.bundle_);
            }
            if (!getStoreidBytes().isEmpty()) {
                k7.writeString(h0Var, 13, this.storeid_);
            }
            if (!getStoreurlBytes().isEmpty()) {
                k7.writeString(h0Var, 14, this.storeurl_);
            }
            if (!getVerBytes().isEmpty()) {
                k7.writeString(h0Var, 15, this.ver_);
            }
            boolean z11 = this.paid_;
            if (z11) {
                h0Var.writeBool(16, z11);
            }
            for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                h0Var.writeMessage(17, this.extProto_.get(i10));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(18, getExt());
            }
            if (this.release_ != null) {
                h0Var.writeMessage(19, getRelease());
            }
            this.unknownFields.writeTo(h0Var);
        }

        public static Builder newBuilder(App app) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(app);
        }

        public static App parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteBuffer, m5Var);
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ka getCatList() {
            return this.cat_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ka getPagecatList() {
            return this.pagecat_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.AppOrBuilder
        public ka getSectcatList() {
            return this.sectcat_;
        }

        private App(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static App parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (App) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static App parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public App getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static App parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private App() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.name_ = "";
            this.domain_ = "";
            f8 f8Var = f8.f22138e;
            this.cat_ = f8Var;
            this.sectcat_ = f8Var;
            this.pagecat_ = f8Var;
            this.cattax_ = 0;
            this.keywords_ = "";
            this.bundle_ = "";
            this.storeid_ = "";
            this.storeurl_ = "";
            this.ver_ = "";
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static App parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (App) PARSER.parseFrom(bArr, m5Var);
        }

        public static App parseFrom(InputStream inputStream) throws IOException {
            return (App) k7.parseWithIOException(PARSER, inputStream);
        }

        public static App parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (App) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static App parseFrom(y yVar) throws IOException {
            return (App) k7.parseWithIOException(PARSER, yVar);
        }

        public static App parseFrom(y yVar, m5 m5Var) throws IOException {
            return (App) k7.parseWithIOException(PARSER, yVar, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9 */
        private App(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.name_ = yVar.readStringRequireUtf8();
                            case 26:
                                Publisher publisher = this.pub_;
                                Publisher.Builder builder = publisher != null ? publisher.toBuilder() : null;
                                Publisher publisher2 = (Publisher) yVar.readMessage(Publisher.parser(), m5Var);
                                this.pub_ = publisher2;
                                if (builder != null) {
                                    builder.mergeFrom(publisher2);
                                    this.pub_ = builder.buildPartial();
                                }
                            case 34:
                                Content content = this.content_;
                                Content.Builder builder2 = content != null ? content.toBuilder() : null;
                                Content content2 = (Content) yVar.readMessage(Content.parser(), m5Var);
                                this.content_ = content2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(content2);
                                    this.content_ = builder2.buildPartial();
                                }
                            case 42:
                                this.domain_ = yVar.readStringRequireUtf8();
                            case 50:
                                String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                int i10 = (c10 == true ? 1 : 0) & 1;
                                c10 = c10;
                                if (i10 == 0) {
                                    this.cat_ = new f8();
                                    c10 = (c10 == true ? 1 : 0) | 1;
                                }
                                this.cat_.add((g8) stringRequireUtf8);
                            case 58:
                                String stringRequireUtf82 = yVar.readStringRequireUtf8();
                                int i11 = (c10 == true ? 1 : 0) & 2;
                                c10 = c10;
                                if (i11 == 0) {
                                    this.sectcat_ = new f8();
                                    c10 = (c10 == true ? 1 : 0) | 2;
                                }
                                this.sectcat_.add((g8) stringRequireUtf82);
                            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                String stringRequireUtf83 = yVar.readStringRequireUtf8();
                                int i12 = (c10 == true ? 1 : 0) & 4;
                                c10 = c10;
                                if (i12 == 0) {
                                    this.pagecat_ = new f8();
                                    c10 = (c10 == true ? 1 : 0) | 4;
                                }
                                this.pagecat_.add((g8) stringRequireUtf83);
                            case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                                this.cattax_ = yVar.readEnum();
                            case 80:
                                this.privpolicy_ = yVar.readBool();
                            case 90:
                                this.keywords_ = yVar.readStringRequireUtf8();
                            case 98:
                                this.bundle_ = yVar.readStringRequireUtf8();
                            case 106:
                                this.storeid_ = yVar.readStringRequireUtf8();
                            case 114:
                                this.storeurl_ = yVar.readStringRequireUtf8();
                            case INVALID_ADS_ENDPOINT_VALUE:
                                this.ver_ = yVar.readStringRequireUtf8();
                            case 128:
                                this.paid_ = yVar.readBool();
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
                                Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                this.ext_ = struct2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(struct2);
                                    this.ext_ = builder3.buildPartial();
                                }
                            case 154:
                                Release release = this.release_;
                                Release.Builder builder4 = release != null ? release.toBuilder() : null;
                                Release release2 = (Release) yVar.readMessage(Release.parser(), m5Var);
                                this.release_ = release2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(release2);
                                    this.release_ = builder4.buildPartial();
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
                        this.cat_ = this.cat_.getUnmodifiableView();
                    }
                    if (((c10 == true ? 1 : 0) & 2) != 0) {
                        this.sectcat_ = this.sectcat_.getUnmodifiableView();
                    }
                    if (((c10 == true ? 1 : 0) & 4) != 0) {
                        this.pagecat_ = this.pagecat_.getUnmodifiableView();
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
                this.cat_ = this.cat_.getUnmodifiableView();
            }
            if (((c10 == true ? 1 : 0) & 2) != 0) {
                this.sectcat_ = this.sectcat_.getUnmodifiableView();
            }
            if (((c10 == true ? 1 : 0) & 4) != 0) {
                this.pagecat_ = this.pagecat_.getUnmodifiableView();
            }
            if (((c10 == true ? 1 : 0) & 8) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AppOrBuilder extends MessageOrBuilder {
        String getBundle();

        ByteString getBundleBytes();

        String getCat(int i10);

        ByteString getCatBytes(int i10);

        int getCatCount();

        List<String> getCatList();

        CategoryTaxonomy getCattax();

        int getCattaxValue();

        App.Content getContent();

        App.ContentOrBuilder getContentOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getDomain();

        ByteString getDomainBytes();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        String getId();

        ByteString getIdBytes();

        String getKeywords();

        ByteString getKeywordsBytes();

        String getName();

        ByteString getNameBytes();

        String getPagecat(int i10);

        ByteString getPagecatBytes(int i10);

        int getPagecatCount();

        List<String> getPagecatList();

        boolean getPaid();

        boolean getPrivpolicy();

        App.Publisher getPub();

        App.PublisherOrBuilder getPubOrBuilder();

        App.Release getRelease();

        App.ReleaseOrBuilder getReleaseOrBuilder();

        String getSectcat(int i10);

        ByteString getSectcatBytes(int i10);

        int getSectcatCount();

        List<String> getSectcatList();

        String getStoreid();

        ByteString getStoreidBytes();

        String getStoreurl();

        ByteString getStoreurlBytes();

        String getVer();

        ByteString getVerBytes();

        boolean hasContent();

        boolean hasExt();

        boolean hasPub();

        boolean hasRelease();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Data extends k7 implements DataOrBuilder {
        public static final int EXT_FIELD_NUMBER = 5;
        public static final int EXT_PROTO_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int SEGMENT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private List<Any> extProto_;
        private Struct ext_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private List<Segment> segment_;
        private static final Data DEFAULT_INSTANCE = new Data();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Data.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Data parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Data(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Segment extends k7 implements SegmentOrBuilder {
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int VALUE_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private volatile Object value_;
            private static final Segment DEFAULT_INSTANCE = new Segment();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Data.Segment.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Segment parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Segment(yVar, m5Var);
                }
            };

            public static Segment getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21886o;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Segment parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Segment) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Segment parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Segment)) {
                    return super.equals(obj);
                }
                Segment segment = (Segment) obj;
                if (getId().equals(segment.getId()) && getName().equals(segment.getName()) && getValue().equals(segment.getValue()) && hasExt() == segment.hasExt()) {
                    return (!hasExt() || getExt().equals(segment.getExt())) && getExtProtoList().equals(segment.getExtProtoList()) && this.unknownFields.equals(segment.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public jb getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
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
                if (!getNameBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(2, this.name_);
                }
                if (!getValueBytes().isEmpty()) {
                    iComputeStringSize += k7.computeStringSize(3, this.value_);
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

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = getValue().hashCode() + ((((getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
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
                return b.f21888p.ensureFieldAccessorsInitialized(Segment.class, Builder.class);
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
                return new Segment();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    k7.writeString(h0Var, 1, this.id_);
                }
                if (!getNameBytes().isEmpty()) {
                    k7.writeString(h0Var, 2, this.name_);
                }
                if (!getValueBytes().isEmpty()) {
                    k7.writeString(h0Var, 3, this.value_);
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
            public static final class Builder extends o6 implements SegmentOrBuilder {
                private int bitField0_;
                private xa extBuilder_;
                private pa extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object name_;
                private Object value_;

                private Builder() {
                    super(null);
                    this.id_ = "";
                    this.name_ = "";
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
                    return b.f21886o;
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

                public Builder clearId() {
                    this.id_ = Segment.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = Segment.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder clearValue() {
                    this.value_ = Segment.getDefaultInstance().getValue();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f21886o;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public jb getExtOrBuilder() {
                    xa xaVar = this.extBuilder_;
                    if (xaVar != null) {
                        return (jb) xaVar.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
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

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public int getExtProtoCount() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.size() : paVar.getCount();
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public List<Any> getExtProtoList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                    pa paVar = this.extProtoBuilder_;
                    return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                    pa paVar = this.extProtoBuilder_;
                    return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public String getName() {
                    Object obj = this.name_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.name_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Data.SegmentOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.f21888p.ensureFieldAccessorsInitialized(Segment.class, Builder.class);
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

                public Builder setName(String str) {
                    str.getClass();
                    this.name_ = str;
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
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
                public Segment build() {
                    Segment segmentBuildPartial = buildPartial();
                    if (segmentBuildPartial.isInitialized()) {
                        return segmentBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) segmentBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Segment buildPartial() {
                    Segment segment = new Segment(this);
                    segment.id_ = this.id_;
                    segment.name_ = this.name_;
                    segment.value_ = this.value_;
                    xa xaVar = this.extBuilder_;
                    if (xaVar == null) {
                        segment.ext_ = this.ext_;
                    } else {
                        segment.ext_ = (Struct) xaVar.build();
                    }
                    pa paVar = this.extProtoBuilder_;
                    if (paVar != null) {
                        segment.extProto_ = paVar.build();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        segment.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return segment;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Segment getDefaultInstanceForType() {
                    return Segment.getDefaultInstance();
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
                    this.name_ = "";
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
                    if (message instanceof Segment) {
                        return mergeFrom((Segment) message);
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
                    this.name_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Segment segment) {
                    if (segment == Segment.getDefaultInstance()) {
                        return this;
                    }
                    if (!segment.getId().isEmpty()) {
                        this.id_ = segment.id_;
                        onChanged();
                    }
                    if (!segment.getName().isEmpty()) {
                        this.name_ = segment.name_;
                        onChanged();
                    }
                    if (!segment.getValue().isEmpty()) {
                        this.value_ = segment.value_;
                        onChanged();
                    }
                    if (segment.hasExt()) {
                        mergeExt(segment.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!segment.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = segment.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(segment.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!segment.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.addAllMessages(segment.extProto_);
                        } else {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = segment.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((k7) segment).unknownFields);
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
                public com.explorestack.protobuf.adcom.Context.Data.Segment.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.Data.Segment.access$15000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$Data$Segment r3 = (com.explorestack.protobuf.adcom.Context.Data.Segment) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$Data$Segment r4 = (com.explorestack.protobuf.adcom.Context.Data.Segment) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Data.Segment.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$Data$Segment$Builder");
                }
            }

            public static Builder newBuilder(Segment segment) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(segment);
            }

            public static Segment parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Segment(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Segment parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Segment) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Segment parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Segment getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Segment parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Segment() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.name_ = "";
                this.value_ = "";
                this.extProto_ = Collections.EMPTY_LIST;
            }

            public static Segment parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Segment parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Segment) PARSER.parseFrom(bArr, m5Var);
            }

            public static Segment parseFrom(InputStream inputStream) throws IOException {
                return (Segment) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Segment parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Segment) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Segment(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                        this.id_ = yVar.readStringRequireUtf8();
                                    } else if (tag == 18) {
                                        this.name_ = yVar.readStringRequireUtf8();
                                    } else if (tag == 26) {
                                        this.value_ = yVar.readStringRequireUtf8();
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

            public static Segment parseFrom(y yVar) throws IOException {
                return (Segment) k7.parseWithIOException(PARSER, yVar);
            }

            public static Segment parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Segment) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface SegmentOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            Struct getExt();

            jb getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

            List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getName();

            ByteString getNameBytes();

            String getValue();

            ByteString getValueBytes();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21882m;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Data parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Data) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return super.equals(obj);
            }
            Data data = (Data) obj;
            if (getId().equals(data.getId()) && getName().equals(data.getName()) && getSegmentList().equals(data.getSegmentList()) && hasExt() == data.hasExt()) {
                return (!hasExt() || getExt().equals(data.getExt())) && getExtProtoList().equals(data.getExtProtoList()) && this.unknownFields.equals(data.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public Segment getSegment(int i10) {
            return this.segment_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public int getSegmentCount() {
            return this.segment_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<Segment> getSegmentList() {
            return this.segment_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public SegmentOrBuilder getSegmentOrBuilder(int i10) {
            return this.segment_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public List<? extends SegmentOrBuilder> getSegmentOrBuilderList() {
            return this.segment_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getIdBytes().isEmpty() ? k7.computeStringSize(1, this.id_) : 0;
            if (!getNameBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(2, this.name_);
            }
            for (int i11 = 0; i11 < this.segment_.size(); i11++) {
                iComputeStringSize += h0.computeMessageSize(3, this.segment_.get(i11));
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

        @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getName().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
            if (getSegmentCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 3, 53) + getSegmentList().hashCode();
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
            return b.f21884n.ensureFieldAccessorsInitialized(Data.class, Builder.class);
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
            return new Data();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getIdBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.id_);
            }
            if (!getNameBytes().isEmpty()) {
                k7.writeString(h0Var, 2, this.name_);
            }
            for (int i10 = 0; i10 < this.segment_.size(); i10++) {
                h0Var.writeMessage(3, this.segment_.get(i10));
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
        public static final class Builder extends o6 implements DataOrBuilder {
            private int bitField0_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object id_;
            private Object name_;
            private pa segmentBuilder_;
            private List<Segment> segment_;

            private Builder() {
                super(null);
                String str = OIPXcgrVyyxoLF.gUK;
                this.id_ = str;
                this.name_ = str;
                List list = Collections.EMPTY_LIST;
                this.segment_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureSegmentIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.segment_ = new ArrayList(this.segment_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21882m;
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

            private pa getSegmentFieldBuilder() {
                if (this.segmentBuilder_ == null) {
                    this.segmentBuilder_ = new pa(this.segment_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.segment_ = null;
                }
                return this.segmentBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getSegmentFieldBuilder();
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

            public Builder addAllSegment(Iterable<? extends Segment> iterable) {
                pa paVar = this.segmentBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureSegmentIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.segment_);
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

            public Builder addSegment(Segment segment) {
                pa paVar = this.segmentBuilder_;
                if (paVar != null) {
                    paVar.addMessage(segment);
                    return this;
                }
                segment.getClass();
                ensureSegmentIsMutable();
                this.segment_.add(segment);
                onChanged();
                return this;
            }

            public Segment.Builder addSegmentBuilder() {
                return (Segment.Builder) getSegmentFieldBuilder().addBuilder(Segment.getDefaultInstance());
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
                this.id_ = Data.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = Data.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearSegment() {
                pa paVar = this.segmentBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.segment_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f21882m;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public Segment getSegment(int i10) {
                pa paVar = this.segmentBuilder_;
                return paVar == null ? this.segment_.get(i10) : (Segment) paVar.getMessage(i10);
            }

            public Segment.Builder getSegmentBuilder(int i10) {
                return (Segment.Builder) getSegmentFieldBuilder().getBuilder(i10);
            }

            public List<Segment.Builder> getSegmentBuilderList() {
                return getSegmentFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public int getSegmentCount() {
                pa paVar = this.segmentBuilder_;
                return paVar == null ? this.segment_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<Segment> getSegmentList() {
                pa paVar = this.segmentBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.segment_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public SegmentOrBuilder getSegmentOrBuilder(int i10) {
                pa paVar = this.segmentBuilder_;
                return paVar == null ? this.segment_.get(i10) : (SegmentOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public List<? extends SegmentOrBuilder> getSegmentOrBuilderList() {
                pa paVar = this.segmentBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.segment_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DataOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.f21884n.ensureFieldAccessorsInitialized(Data.class, Builder.class);
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

            public Builder removeSegment(int i10) {
                pa paVar = this.segmentBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureSegmentIsMutable();
                this.segment_.remove(i10);
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

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSegment(int i10, Segment segment) {
                pa paVar = this.segmentBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, segment);
                    return this;
                }
                segment.getClass();
                ensureSegmentIsMutable();
                this.segment_.set(i10, segment);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data build() {
                Data dataBuildPartial = buildPartial();
                if (dataBuildPartial.isInitialized()) {
                    return dataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Data buildPartial() {
                Data data = new Data(this);
                data.id_ = this.id_;
                data.name_ = this.name_;
                pa paVar = this.segmentBuilder_;
                if (paVar != null) {
                    data.segment_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.segment_ = Collections.unmodifiableList(this.segment_);
                        this.bitField0_ &= -2;
                    }
                    data.segment_ = this.segment_;
                }
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    data.ext_ = this.ext_;
                } else {
                    data.ext_ = (Struct) xaVar.build();
                }
                pa paVar2 = this.extProtoBuilder_;
                if (paVar2 != null) {
                    data.extProto_ = paVar2.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    data.extProto_ = this.extProto_;
                }
                onBuilt();
                return data;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Data getDefaultInstanceForType() {
                return Data.getDefaultInstance();
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

            public Segment.Builder addSegmentBuilder(int i10) {
                return (Segment.Builder) getSegmentFieldBuilder().addBuilder(i10, Segment.getDefaultInstance());
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
                this.name_ = "";
                pa paVar = this.segmentBuilder_;
                if (paVar == null) {
                    this.segment_ = Collections.EMPTY_LIST;
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

            public Builder addSegment(int i10, Segment segment) {
                pa paVar = this.segmentBuilder_;
                if (paVar == null) {
                    segment.getClass();
                    ensureSegmentIsMutable();
                    this.segment_.add(i10, segment);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, segment);
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Data) {
                    return mergeFrom((Data) message);
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

            public Builder setSegment(int i10, Segment.Builder builder) {
                pa paVar = this.segmentBuilder_;
                if (paVar == null) {
                    ensureSegmentIsMutable();
                    this.segment_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                paVar.setMessage(i10, builder.build());
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.id_ = "";
                this.name_ = "";
                List list = Collections.EMPTY_LIST;
                this.segment_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Data data) {
                if (data == Data.getDefaultInstance()) {
                    return this;
                }
                if (!data.getId().isEmpty()) {
                    this.id_ = data.id_;
                    onChanged();
                }
                if (!data.getName().isEmpty()) {
                    this.name_ = data.name_;
                    onChanged();
                }
                if (this.segmentBuilder_ == null) {
                    if (!data.segment_.isEmpty()) {
                        if (this.segment_.isEmpty()) {
                            this.segment_ = data.segment_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureSegmentIsMutable();
                            this.segment_.addAll(data.segment_);
                        }
                        onChanged();
                    }
                } else if (!data.segment_.isEmpty()) {
                    if (!this.segmentBuilder_.isEmpty()) {
                        this.segmentBuilder_.addAllMessages(data.segment_);
                    } else {
                        this.segmentBuilder_.dispose();
                        this.segmentBuilder_ = null;
                        this.segment_ = data.segment_;
                        this.bitField0_ &= -2;
                        this.segmentBuilder_ = k7.alwaysUseFieldBuilders ? getSegmentFieldBuilder() : null;
                    }
                }
                if (data.hasExt()) {
                    mergeExt(data.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!data.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = data.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(data.extProto_);
                        }
                        onChanged();
                    }
                } else if (!data.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(data.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = data.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) data).unknownFields);
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

            public Builder addSegment(Segment.Builder builder) {
                pa paVar = this.segmentBuilder_;
                if (paVar == null) {
                    ensureSegmentIsMutable();
                    this.segment_.add(builder.build());
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

            public Builder addSegment(int i10, Segment.Builder builder) {
                pa paVar = this.segmentBuilder_;
                if (paVar == null) {
                    ensureSegmentIsMutable();
                    this.segment_.add(i10, builder.build());
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
            public com.explorestack.protobuf.adcom.Context.Data.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.Data.access$16700()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Data r3 = (com.explorestack.protobuf.adcom.Context.Data) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Data r4 = (com.explorestack.protobuf.adcom.Context.Data) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Data.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$Data$Builder");
            }
        }

        public static Builder newBuilder(Data data) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(data);
        }

        public static Data parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Data(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Data parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Data) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Data getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Data parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Data() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.segment_ = list;
            this.extProto_ = list;
        }

        public static Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Data parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Data) PARSER.parseFrom(bArr, m5Var);
        }

        public static Data parseFrom(InputStream inputStream) throws IOException {
            return (Data) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Data parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Data) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Data(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.id_ = yVar.readStringRequireUtf8();
                                } else if (tag == 18) {
                                    this.name_ = yVar.readStringRequireUtf8();
                                } else if (tag == 26) {
                                    if ((i10 & 1) == 0) {
                                        this.segment_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.segment_.add(yVar.readMessage(Segment.parser(), m5Var));
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
                        this.segment_ = Collections.unmodifiableList(this.segment_);
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
                this.segment_ = Collections.unmodifiableList(this.segment_);
            }
            if ((i10 & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Data parseFrom(y yVar) throws IOException {
            return (Data) k7.parseWithIOException(PARSER, yVar);
        }

        public static Data parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Data) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DataOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        Data.Segment getSegment(int i10);

        int getSegmentCount();

        List<Data.Segment> getSegmentList();

        Data.SegmentOrBuilder getSegmentOrBuilder(int i10);

        List<? extends Data.SegmentOrBuilder> getSegmentOrBuilderList();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Device extends k7 implements DeviceOrBuilder {
        public static final int AUDIOCONTEXT_FIELD_NUMBER = 30;
        public static final int CARRIER_FIELD_NUMBER = 21;
        public static final int CONNECTION_FIELD_NUMBER = 29;
        public static final int CONTYPE_FIELD_NUMBER = 24;
        public static final int DNT_FIELD_NUMBER = 4;
        public static final int EXT_FIELD_NUMBER = 28;
        public static final int EXT_PROTO_FIELD_NUMBER = 27;
        public static final int GEOFETCH_FIELD_NUMBER = 25;
        public static final int GEO_FIELD_NUMBER = 26;
        public static final int HWV_FIELD_NUMBER = 10;
        public static final int H_FIELD_NUMBER = 11;
        public static final int IFA_FIELD_NUMBER = 3;
        public static final int IPTR_FIELD_NUMBER = 20;
        public static final int IPV6_FIELD_NUMBER = 18;
        public static final int IP_FIELD_NUMBER = 17;
        public static final int JS_FIELD_NUMBER = 15;
        public static final int LANG_FIELD_NUMBER = 16;
        public static final int LMT_FIELD_NUMBER = 5;
        public static final int MAKE_FIELD_NUMBER = 6;
        public static final int MCCMNCSIM_FIELD_NUMBER = 23;
        public static final int MCCMNC_FIELD_NUMBER = 22;
        public static final int MODEL_FIELD_NUMBER = 7;
        public static final int OSV_FIELD_NUMBER = 9;
        public static final int OS_FIELD_NUMBER = 8;
        public static final int PPI_FIELD_NUMBER = 13;
        public static final int PXRATIO_FIELD_NUMBER = 14;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UA_FIELD_NUMBER = 2;
        public static final int W_FIELD_NUMBER = 12;
        public static final int XFF_FIELD_NUMBER = 19;
        private static final long serialVersionUID = 0;
        private AudioContext audioContext_;
        private volatile Object carrier_;
        private Connection connection_;
        private int contype_;
        private boolean dnt_;
        private List<Any> extProto_;
        private Struct ext_;
        private Geo geo_;
        private boolean geofetch_;
        private int h_;
        private volatile Object hwv_;
        private volatile Object ifa_;
        private volatile Object ip_;
        private boolean iptr_;
        private volatile Object ipv6_;
        private boolean js_;
        private volatile Object lang_;
        private boolean lmt_;
        private volatile Object make_;
        private volatile Object mccmnc_;
        private volatile Object mccmncsim_;
        private byte memoizedIsInitialized;
        private volatile Object model_;
        private int os_;
        private volatile Object osv_;
        private int ppi_;
        private float pxratio_;
        private int type_;
        private volatile Object ua_;
        private int w_;
        private volatile Object xff_;
        private static final Device DEFAULT_INSTANCE = new Device();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Device.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Device parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Device(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AudioContext extends k7 implements AudioContextOrBuilder {
            public static final int ISAUDIOPLAYING_FIELD_NUMBER = 1;
            public static final int VOLUMELEVEL_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private boolean isAudioPlaying_;
            private byte memoizedIsInitialized;
            private float volumelevel_;
            private static final AudioContext DEFAULT_INSTANCE = new AudioContext();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Device.AudioContext.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public AudioContext parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new AudioContext(yVar, m5Var);
                }
            };

            public static AudioContext getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21902w;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AudioContext parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AudioContext) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AudioContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AudioContext)) {
                    return super.equals(obj);
                }
                AudioContext audioContext = (AudioContext) obj;
                return getIsAudioPlaying() == audioContext.getIsAudioPlaying() && Float.floatToIntBits(getVolumelevel()) == Float.floatToIntBits(audioContext.getVolumelevel()) && this.unknownFields.equals(audioContext.unknownFields);
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
            public boolean getIsAudioPlaying() {
                return this.isAudioPlaying_;
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
                boolean z10 = this.isAudioPlaying_;
                int iComputeBoolSize = z10 ? h0.computeBoolSize(1, z10) : 0;
                float f10 = this.volumelevel_;
                if (f10 != 0.0f) {
                    iComputeBoolSize += h0.computeFloatSize(2, f10);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeBoolSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
            public float getVolumelevel() {
                return this.volumelevel_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = this.unknownFields.hashCode() + ((Float.floatToIntBits(getVolumelevel()) + ((((x7.hashBoolean(getIsAudioPlaying()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return b.f21904x.ensureFieldAccessorsInitialized(AudioContext.class, Builder.class);
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
                return new AudioContext();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                boolean z10 = this.isAudioPlaying_;
                if (z10) {
                    h0Var.writeBool(1, z10);
                }
                float f10 = this.volumelevel_;
                if (f10 != 0.0f) {
                    h0Var.writeFloat(2, f10);
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements AudioContextOrBuilder {
                private boolean isAudioPlaying_;
                private float volumelevel_;

                private Builder() {
                    super(null);
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f21902w;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearIsAudioPlaying() {
                    this.isAudioPlaying_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearVolumelevel() {
                    this.volumelevel_ = 0.0f;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f21902w;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
                public boolean getIsAudioPlaying() {
                    return this.isAudioPlaying_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.AudioContextOrBuilder
                public float getVolumelevel() {
                    return this.volumelevel_;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.f21904x.ensureFieldAccessorsInitialized(AudioContext.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setIsAudioPlaying(boolean z10) {
                    this.isAudioPlaying_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setVolumelevel(float f10) {
                    this.volumelevel_ = f10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AudioContext build() {
                    AudioContext audioContextBuildPartial = buildPartial();
                    if (audioContextBuildPartial.isInitialized()) {
                        return audioContextBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioContextBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AudioContext buildPartial() {
                    AudioContext audioContext = new AudioContext(this);
                    audioContext.isAudioPlaying_ = this.isAudioPlaying_;
                    audioContext.volumelevel_ = this.volumelevel_;
                    onBuilt();
                    return audioContext;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public AudioContext getDefaultInstanceForType() {
                    return AudioContext.getDefaultInstance();
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

                private Builder(p6 p6Var) {
                    super(p6Var);
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.isAudioPlaying_ = false;
                    this.volumelevel_ = 0.0f;
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof AudioContext) {
                        return mergeFrom((AudioContext) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AudioContext audioContext) {
                    if (audioContext == AudioContext.getDefaultInstance()) {
                        return this;
                    }
                    if (audioContext.getIsAudioPlaying()) {
                        setIsAudioPlaying(audioContext.getIsAudioPlaying());
                    }
                    if (audioContext.getVolumelevel() != 0.0f) {
                        setVolumelevel(audioContext.getVolumelevel());
                    }
                    mergeUnknownFields(((k7) audioContext).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.Device.AudioContext.access$21500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$Device$AudioContext r3 = (com.explorestack.protobuf.adcom.Context.Device.AudioContext) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$Device$AudioContext r4 = (com.explorestack.protobuf.adcom.Context.Device.AudioContext) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Device.AudioContext.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$Device$AudioContext$Builder");
                }
            }

            public static Builder newBuilder(AudioContext audioContext) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioContext);
            }

            public static AudioContext parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private AudioContext(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AudioContext parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AudioContext) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static AudioContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AudioContext getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AudioContext parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AudioContext() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static AudioContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static AudioContext parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (AudioContext) PARSER.parseFrom(bArr, m5Var);
            }

            private AudioContext(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = yVar.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.isAudioPlaying_ = yVar.readBool();
                                } else if (tag != 21) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    this.volumelevel_ = yVar.readFloat();
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

            public static AudioContext parseFrom(InputStream inputStream) throws IOException {
                return (AudioContext) k7.parseWithIOException(PARSER, inputStream);
            }

            public static AudioContext parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (AudioContext) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static AudioContext parseFrom(y yVar) throws IOException {
                return (AudioContext) k7.parseWithIOException(PARSER, yVar);
            }

            public static AudioContext parseFrom(y yVar, m5 m5Var) throws IOException {
                return (AudioContext) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface AudioContextOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            boolean getIsAudioPlaying();

            float getVolumelevel();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Connection extends k7 implements ConnectionOrBuilder {
            private static final Connection DEFAULT_INSTANCE = new Connection();
            private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Device.Connection.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public Connection parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new Connection(yVar, m5Var);
                }
            };
            public static final int PROXY_FIELD_NUMBER = 2;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int VPN_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private int proxy_;
            private int type_;
            private int vpn_;

            public static Connection getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21898u;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Connection parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Connection) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Connection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Connection)) {
                    return super.equals(obj);
                }
                Connection connection = (Connection) obj;
                return this.type_ == connection.type_ && this.proxy_ == connection.proxy_ && this.vpn_ == connection.vpn_ && this.unknownFields.equals(connection.unknownFields);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public fa getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public ConnectionStatus getProxy() {
                ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.proxy_);
                return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public int getProxyValue() {
                return this.proxy_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeEnumSize = this.type_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber() ? h0.computeEnumSize(1, this.type_) : 0;
                int i11 = this.proxy_;
                ConnectionStatus connectionStatus = ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
                if (i11 != connectionStatus.getNumber()) {
                    iComputeEnumSize += h0.computeEnumSize(2, this.proxy_);
                }
                if (this.vpn_ != connectionStatus.getNumber()) {
                    iComputeEnumSize += h0.computeEnumSize(3, this.vpn_);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeEnumSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public ConnectionType getType() {
                ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.type_);
                return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
            public final gc getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public ConnectionStatus getVpn() {
                ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.vpn_);
                return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
            public int getVpnValue() {
                return this.vpn_;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = this.unknownFields.hashCode() + ((com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53), this.proxy_, 37, 3, 53) + this.vpn_) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return b.f21900v.ensureFieldAccessorsInitialized(Connection.class, Builder.class);
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
                return new Connection();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                if (this.type_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                    h0Var.writeEnum(1, this.type_);
                }
                int i10 = this.proxy_;
                ConnectionStatus connectionStatus = ConnectionStatus.CONNECTION_STATUS_UNDEFINED;
                if (i10 != connectionStatus.getNumber()) {
                    h0Var.writeEnum(2, this.proxy_);
                }
                if (this.vpn_ != connectionStatus.getNumber()) {
                    h0Var.writeEnum(3, this.vpn_);
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements ConnectionOrBuilder {
                private int proxy_;
                private int type_;
                private int vpn_;

                private Builder() {
                    super(null);
                    this.type_ = 0;
                    this.proxy_ = 0;
                    this.vpn_ = 0;
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.f21898u;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearProxy() {
                    this.proxy_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.type_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearVpn() {
                    this.vpn_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.f21898u;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public ConnectionStatus getProxy() {
                    ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.proxy_);
                    return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public int getProxyValue() {
                    return this.proxy_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public ConnectionType getType() {
                    ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.type_);
                    return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public int getTypeValue() {
                    return this.type_;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public ConnectionStatus getVpn() {
                    ConnectionStatus connectionStatusValueOf = ConnectionStatus.valueOf(this.vpn_);
                    return connectionStatusValueOf == null ? ConnectionStatus.UNRECOGNIZED : connectionStatusValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Context.Device.ConnectionOrBuilder
                public int getVpnValue() {
                    return this.vpn_;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return b.f21900v.ensureFieldAccessorsInitialized(Connection.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setProxy(ConnectionStatus connectionStatus) {
                    connectionStatus.getClass();
                    this.proxy_ = connectionStatus.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setProxyValue(int i10) {
                    this.proxy_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setType(ConnectionType connectionType) {
                    connectionType.getClass();
                    this.type_ = connectionType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setTypeValue(int i10) {
                    this.type_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setVpn(ConnectionStatus connectionStatus) {
                    connectionStatus.getClass();
                    this.vpn_ = connectionStatus.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setVpnValue(int i10) {
                    this.vpn_ = i10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Connection build() {
                    Connection connectionBuildPartial = buildPartial();
                    if (connectionBuildPartial.isInitialized()) {
                        return connectionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Connection buildPartial() {
                    Connection connection = new Connection(this);
                    connection.type_ = this.type_;
                    connection.proxy_ = this.proxy_;
                    connection.vpn_ = this.vpn_;
                    onBuilt();
                    return connection;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public Connection getDefaultInstanceForType() {
                    return Connection.getDefaultInstance();
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
                    this.type_ = 0;
                    this.proxy_ = 0;
                    this.vpn_ = 0;
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Connection) {
                        return mergeFrom((Connection) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.type_ = 0;
                    this.proxy_ = 0;
                    this.vpn_ = 0;
                    maybeForceBuilderInitialization();
                }

                public Builder mergeFrom(Connection connection) {
                    if (connection == Connection.getDefaultInstance()) {
                        return this;
                    }
                    if (connection.type_ != 0) {
                        setTypeValue(connection.getTypeValue());
                    }
                    if (connection.proxy_ != 0) {
                        setProxyValue(connection.getProxyValue());
                    }
                    if (connection.vpn_ != 0) {
                        setVpnValue(connection.getVpnValue());
                    }
                    mergeUnknownFields(((k7) connection).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public com.explorestack.protobuf.adcom.Context.Device.Connection.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.Device.Connection.access$20600()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        com.explorestack.protobuf.adcom.Context$Device$Connection r3 = (com.explorestack.protobuf.adcom.Context.Device.Connection) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        com.explorestack.protobuf.adcom.Context$Device$Connection r4 = (com.explorestack.protobuf.adcom.Context.Device.Connection) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Device.Connection.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$Device$Connection$Builder");
                }
            }

            public static Builder newBuilder(Connection connection) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(connection);
            }

            public static Connection parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private Connection(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Connection parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Connection) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static Connection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Connection getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Connection parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Connection() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = 0;
                this.proxy_ = 0;
                this.vpn_ = 0;
            }

            public static Connection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static Connection parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (Connection) PARSER.parseFrom(bArr, m5Var);
            }

            public static Connection parseFrom(InputStream inputStream) throws IOException {
                return (Connection) k7.parseWithIOException(PARSER, inputStream);
            }

            public static Connection parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (Connection) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            private Connection(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                this();
                m5Var.getClass();
                cc ccVarNewBuilder = gc.newBuilder();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = yVar.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.type_ = yVar.readEnum();
                                } else if (tag == 16) {
                                    this.proxy_ = yVar.readEnum();
                                } else if (tag != 24) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    this.vpn_ = yVar.readEnum();
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

            public static Connection parseFrom(y yVar) throws IOException {
                return (Connection) k7.parseWithIOException(PARSER, yVar);
            }

            public static Connection parseFrom(y yVar, m5 m5Var) throws IOException {
                return (Connection) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface ConnectionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            ConnectionStatus getProxy();

            int getProxyValue();

            ConnectionType getType();

            int getTypeValue();

            ConnectionStatus getVpn();

            int getVpnValue();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21894s;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Device parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Device) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return super.equals(obj);
            }
            Device device = (Device) obj;
            if (this.type_ != device.type_ || !getUa().equals(device.getUa()) || !getIfa().equals(device.getIfa()) || getDnt() != device.getDnt() || getLmt() != device.getLmt() || !getMake().equals(device.getMake()) || !getModel().equals(device.getModel()) || this.os_ != device.os_ || !getOsv().equals(device.getOsv()) || !getHwv().equals(device.getHwv()) || getH() != device.getH() || getW() != device.getW() || getPpi() != device.getPpi() || Float.floatToIntBits(getPxratio()) != Float.floatToIntBits(device.getPxratio()) || getJs() != device.getJs() || !getLang().equals(device.getLang()) || !getIp().equals(device.getIp()) || !getIpv6().equals(device.getIpv6()) || !getXff().equals(device.getXff()) || getIptr() != device.getIptr() || !getCarrier().equals(device.getCarrier()) || !getMccmnc().equals(device.getMccmnc()) || !getMccmncsim().equals(device.getMccmncsim()) || this.contype_ != device.contype_ || getGeofetch() != device.getGeofetch() || hasGeo() != device.hasGeo()) {
                return false;
            }
            if ((hasGeo() && !getGeo().equals(device.getGeo())) || hasConnection() != device.hasConnection()) {
                return false;
            }
            if ((hasConnection() && !getConnection().equals(device.getConnection())) || hasAudioContext() != device.hasAudioContext()) {
                return false;
            }
            if ((!hasAudioContext() || getAudioContext().equals(device.getAudioContext())) && hasExt() == device.hasExt()) {
                return (!hasExt() || getExt().equals(device.getExt())) && getExtProtoList().equals(device.getExtProtoList()) && this.unknownFields.equals(device.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public AudioContext getAudioContext() {
            AudioContext audioContext = this.audioContext_;
            return audioContext == null ? AudioContext.getDefaultInstance() : audioContext;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public AudioContextOrBuilder getAudioContextOrBuilder() {
            return getAudioContext();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getCarrier() {
            Object obj = this.carrier_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.carrier_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getCarrierBytes() {
            Object obj = this.carrier_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.carrier_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Connection getConnection() {
            Connection connection = this.connection_;
            return connection == null ? Connection.getDefaultInstance() : connection;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ConnectionOrBuilder getConnectionOrBuilder() {
            return getConnection();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ConnectionType getContype() {
            ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
            return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getContypeValue() {
            return this.contype_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getDnt() {
            return this.dnt_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public GeoOrBuilder getGeoOrBuilder() {
            return getGeo();
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getGeofetch() {
            return this.geofetch_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getHwv() {
            Object obj = this.hwv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.hwv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getHwvBytes() {
            Object obj = this.hwv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hwv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getIfa() {
            Object obj = this.ifa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifa_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getIfaBytes() {
            Object obj = this.ifa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifa_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getIp() {
            Object obj = this.ip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ip_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getIpBytes() {
            Object obj = this.ip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ip_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getIptr() {
            return this.iptr_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getIpv6() {
            Object obj = this.ipv6_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ipv6_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getIpv6Bytes() {
            Object obj = this.ipv6_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ipv6_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getJs() {
            return this.js_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getLang() {
            Object obj = this.lang_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lang_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getLangBytes() {
            Object obj = this.lang_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lang_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean getLmt() {
            return this.lmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getMake() {
            Object obj = this.make_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.make_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getMakeBytes() {
            Object obj = this.make_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.make_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getMccmnc() {
            Object obj = this.mccmnc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mccmnc_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getMccmncBytes() {
            Object obj = this.mccmnc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mccmnc_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getMccmncsim() {
            Object obj = this.mccmncsim_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.mccmncsim_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getMccmncsimBytes() {
            Object obj = this.mccmncsim_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mccmncsim_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.model_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public OS getOs() {
            OS osValueOf = OS.valueOf(this.os_);
            return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getOsValue() {
            return this.os_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getOsv() {
            Object obj = this.osv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getOsvBytes() {
            Object obj = this.osv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getPpi() {
            return this.ppi_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public float getPxratio() {
            return this.pxratio_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = this.type_ != DeviceType.DEVICE_TYPE_INVALID.getNumber() ? h0.computeEnumSize(1, this.type_) : 0;
            if (!getUaBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(2, this.ua_);
            }
            if (!getIfaBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(3, this.ifa_);
            }
            boolean z10 = this.dnt_;
            if (z10) {
                iComputeEnumSize += h0.computeBoolSize(4, z10);
            }
            boolean z11 = this.lmt_;
            if (z11) {
                iComputeEnumSize += h0.computeBoolSize(5, z11);
            }
            if (!getMakeBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(6, this.make_);
            }
            if (!getModelBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(7, this.model_);
            }
            if (this.os_ != OS.OS_INVALID.getNumber()) {
                iComputeEnumSize += h0.computeEnumSize(8, this.os_);
            }
            if (!getOsvBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(9, this.osv_);
            }
            if (!getHwvBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(10, this.hwv_);
            }
            int i11 = this.h_;
            if (i11 != 0) {
                iComputeEnumSize += h0.computeUInt32Size(11, i11);
            }
            int i12 = this.w_;
            if (i12 != 0) {
                iComputeEnumSize += h0.computeUInt32Size(12, i12);
            }
            int i13 = this.ppi_;
            if (i13 != 0) {
                iComputeEnumSize += h0.computeUInt32Size(13, i13);
            }
            float f10 = this.pxratio_;
            if (f10 != 0.0f) {
                iComputeEnumSize += h0.computeFloatSize(14, f10);
            }
            boolean z12 = this.js_;
            if (z12) {
                iComputeEnumSize += h0.computeBoolSize(15, z12);
            }
            if (!getLangBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(16, this.lang_);
            }
            if (!getIpBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(17, this.ip_);
            }
            if (!getIpv6Bytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(18, this.ipv6_);
            }
            if (!getXffBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(19, this.xff_);
            }
            boolean z13 = this.iptr_;
            if (z13) {
                iComputeEnumSize += h0.computeBoolSize(20, z13);
            }
            if (!getCarrierBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(21, this.carrier_);
            }
            if (!getMccmncBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(22, this.mccmnc_);
            }
            if (!getMccmncsimBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(23, this.mccmncsim_);
            }
            if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                iComputeEnumSize += h0.computeEnumSize(24, this.contype_);
            }
            boolean z14 = this.geofetch_;
            if (z14) {
                iComputeEnumSize += h0.computeBoolSize(25, z14);
            }
            if (this.geo_ != null) {
                iComputeEnumSize += h0.computeMessageSize(26, getGeo());
            }
            for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                iComputeEnumSize += h0.computeMessageSize(27, this.extProto_.get(i14));
            }
            if (this.ext_ != null) {
                iComputeEnumSize += h0.computeMessageSize(28, getExt());
            }
            if (this.connection_ != null) {
                iComputeEnumSize += h0.computeMessageSize(29, getConnection());
            }
            if (this.audioContext_ != null) {
                iComputeEnumSize += h0.computeMessageSize(30, getAudioContext());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public DeviceType getType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.type_);
            return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getUa() {
            Object obj = this.ua_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ua_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getUaBytes() {
            Object obj = this.ua_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ua_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public String getXff() {
            Object obj = this.xff_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.xff_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public ByteString getXffBytes() {
            Object obj = this.xff_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.xff_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasAudioContext() {
            return this.audioContext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasConnection() {
            return this.connection_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
        public boolean hasGeo() {
            return this.geo_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashBoolean = x7.hashBoolean(getGeofetch()) + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getMccmncsim().hashCode() + ((((getMccmnc().hashCode() + ((((getCarrier().hashCode() + ((((x7.hashBoolean(getIptr()) + ((((getXff().hashCode() + ((((getIpv6().hashCode() + ((((getIp().hashCode() + ((((getLang().hashCode() + ((((x7.hashBoolean(getJs()) + ((((Float.floatToIntBits(getPxratio()) + ((((getPpi() + ((((getW() + ((((getH() + ((((getHwv().hashCode() + ((((getOsv().hashCode() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getModel().hashCode() + ((((getMake().hashCode() + ((((x7.hashBoolean(getLmt()) + ((((x7.hashBoolean(getDnt()) + ((((getIfa().hashCode() + ((((getUa().hashCode() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53, this.os_, 37, 9, 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53)) * 37) + 17) * 53)) * 37) + 18) * 53)) * 37) + 19) * 53)) * 37) + 20) * 53)) * 37) + 21) * 53)) * 37) + 22) * 53)) * 37) + 23) * 53)) * 37) + 24) * 53, this.contype_, 37, 25, 53);
            if (hasGeo()) {
                iHashBoolean = getGeo().hashCode() + o2.B(iHashBoolean, 37, 26, 53);
            }
            if (hasConnection()) {
                iHashBoolean = getConnection().hashCode() + o2.B(iHashBoolean, 37, 29, 53);
            }
            if (hasAudioContext()) {
                iHashBoolean = getAudioContext().hashCode() + o2.B(iHashBoolean, 37, 30, 53);
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
            return b.f21896t.ensureFieldAccessorsInitialized(Device.class, Builder.class);
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
            return new Device();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (this.type_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
                h0Var.writeEnum(1, this.type_);
            }
            if (!getUaBytes().isEmpty()) {
                k7.writeString(h0Var, 2, this.ua_);
            }
            if (!getIfaBytes().isEmpty()) {
                k7.writeString(h0Var, 3, this.ifa_);
            }
            boolean z10 = this.dnt_;
            if (z10) {
                h0Var.writeBool(4, z10);
            }
            boolean z11 = this.lmt_;
            if (z11) {
                h0Var.writeBool(5, z11);
            }
            if (!getMakeBytes().isEmpty()) {
                k7.writeString(h0Var, 6, this.make_);
            }
            if (!getModelBytes().isEmpty()) {
                k7.writeString(h0Var, 7, this.model_);
            }
            if (this.os_ != OS.OS_INVALID.getNumber()) {
                h0Var.writeEnum(8, this.os_);
            }
            if (!getOsvBytes().isEmpty()) {
                k7.writeString(h0Var, 9, this.osv_);
            }
            if (!getHwvBytes().isEmpty()) {
                k7.writeString(h0Var, 10, this.hwv_);
            }
            int i10 = this.h_;
            if (i10 != 0) {
                h0Var.writeUInt32(11, i10);
            }
            int i11 = this.w_;
            if (i11 != 0) {
                h0Var.writeUInt32(12, i11);
            }
            int i12 = this.ppi_;
            if (i12 != 0) {
                h0Var.writeUInt32(13, i12);
            }
            float f10 = this.pxratio_;
            if (f10 != 0.0f) {
                h0Var.writeFloat(14, f10);
            }
            boolean z12 = this.js_;
            if (z12) {
                h0Var.writeBool(15, z12);
            }
            if (!getLangBytes().isEmpty()) {
                k7.writeString(h0Var, 16, this.lang_);
            }
            if (!getIpBytes().isEmpty()) {
                k7.writeString(h0Var, 17, this.ip_);
            }
            if (!getIpv6Bytes().isEmpty()) {
                k7.writeString(h0Var, 18, this.ipv6_);
            }
            if (!getXffBytes().isEmpty()) {
                k7.writeString(h0Var, 19, this.xff_);
            }
            boolean z13 = this.iptr_;
            if (z13) {
                h0Var.writeBool(20, z13);
            }
            if (!getCarrierBytes().isEmpty()) {
                k7.writeString(h0Var, 21, this.carrier_);
            }
            if (!getMccmncBytes().isEmpty()) {
                k7.writeString(h0Var, 22, this.mccmnc_);
            }
            if (!getMccmncsimBytes().isEmpty()) {
                k7.writeString(h0Var, 23, this.mccmncsim_);
            }
            if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
                h0Var.writeEnum(24, this.contype_);
            }
            boolean z14 = this.geofetch_;
            if (z14) {
                h0Var.writeBool(25, z14);
            }
            if (this.geo_ != null) {
                h0Var.writeMessage(26, getGeo());
            }
            for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                h0Var.writeMessage(27, this.extProto_.get(i13));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(28, getExt());
            }
            if (this.connection_ != null) {
                h0Var.writeMessage(29, getConnection());
            }
            if (this.audioContext_ != null) {
                h0Var.writeMessage(30, getAudioContext());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements DeviceOrBuilder {
            private xa audioContextBuilder_;
            private AudioContext audioContext_;
            private int bitField0_;
            private Object carrier_;
            private xa connectionBuilder_;
            private Connection connection_;
            private int contype_;
            private boolean dnt_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private xa geoBuilder_;
            private Geo geo_;
            private boolean geofetch_;
            private int h_;
            private Object hwv_;
            private Object ifa_;
            private Object ip_;
            private boolean iptr_;
            private Object ipv6_;
            private boolean js_;
            private Object lang_;
            private boolean lmt_;
            private Object make_;
            private Object mccmnc_;
            private Object mccmncsim_;
            private Object model_;
            private int os_;
            private Object osv_;
            private int ppi_;
            private float pxratio_;
            private int type_;
            private Object ua_;
            private int w_;
            private Object xff_;

            private Builder() {
                super(null);
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 1;
                }
            }

            private xa getAudioContextFieldBuilder() {
                if (this.audioContextBuilder_ == null) {
                    this.audioContextBuilder_ = new xa(getAudioContext(), getParentForChildren(), isClean());
                    this.audioContext_ = null;
                }
                return this.audioContextBuilder_;
            }

            private xa getConnectionFieldBuilder() {
                if (this.connectionBuilder_ == null) {
                    this.connectionBuilder_ = new xa(getConnection(), getParentForChildren(), isClean());
                    this.connection_ = null;
                }
                return this.connectionBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21894s;
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

            private xa getGeoFieldBuilder() {
                if (this.geoBuilder_ == null) {
                    this.geoBuilder_ = new xa(getGeo(), getParentForChildren(), isClean());
                    this.geo_ = null;
                }
                return this.geoBuilder_;
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

            public Builder clearAudioContext() {
                if (this.audioContextBuilder_ == null) {
                    this.audioContext_ = null;
                    onChanged();
                    return this;
                }
                this.audioContext_ = null;
                this.audioContextBuilder_ = null;
                return this;
            }

            public Builder clearCarrier() {
                this.carrier_ = Device.getDefaultInstance().getCarrier();
                onChanged();
                return this;
            }

            public Builder clearConnection() {
                if (this.connectionBuilder_ == null) {
                    this.connection_ = null;
                    onChanged();
                    return this;
                }
                this.connection_ = null;
                this.connectionBuilder_ = null;
                return this;
            }

            public Builder clearContype() {
                this.contype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDnt() {
                this.dnt_ = false;
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

            public Builder clearGeo() {
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                    onChanged();
                    return this;
                }
                this.geo_ = null;
                this.geoBuilder_ = null;
                return this;
            }

            public Builder clearGeofetch() {
                this.geofetch_ = false;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHwv() {
                this.hwv_ = Device.getDefaultInstance().getHwv();
                onChanged();
                return this;
            }

            public Builder clearIfa() {
                this.ifa_ = Device.getDefaultInstance().getIfa();
                onChanged();
                return this;
            }

            public Builder clearIp() {
                this.ip_ = Device.getDefaultInstance().getIp();
                onChanged();
                return this;
            }

            public Builder clearIptr() {
                this.iptr_ = false;
                onChanged();
                return this;
            }

            public Builder clearIpv6() {
                this.ipv6_ = Device.getDefaultInstance().getIpv6();
                onChanged();
                return this;
            }

            public Builder clearJs() {
                this.js_ = false;
                onChanged();
                return this;
            }

            public Builder clearLang() {
                this.lang_ = Device.getDefaultInstance().getLang();
                onChanged();
                return this;
            }

            public Builder clearLmt() {
                this.lmt_ = false;
                onChanged();
                return this;
            }

            public Builder clearMake() {
                this.make_ = Device.getDefaultInstance().getMake();
                onChanged();
                return this;
            }

            public Builder clearMccmnc() {
                this.mccmnc_ = Device.getDefaultInstance().getMccmnc();
                onChanged();
                return this;
            }

            public Builder clearMccmncsim() {
                this.mccmncsim_ = Device.getDefaultInstance().getMccmncsim();
                onChanged();
                return this;
            }

            public Builder clearModel() {
                this.model_ = Device.getDefaultInstance().getModel();
                onChanged();
                return this;
            }

            public Builder clearOs() {
                this.os_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOsv() {
                this.osv_ = Device.getDefaultInstance().getOsv();
                onChanged();
                return this;
            }

            public Builder clearPpi() {
                this.ppi_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPxratio() {
                this.pxratio_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUa() {
                this.ua_ = Device.getDefaultInstance().getUa();
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            public Builder clearXff() {
                this.xff_ = Device.getDefaultInstance().getXff();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public AudioContext getAudioContext() {
                xa xaVar = this.audioContextBuilder_;
                if (xaVar != null) {
                    return (AudioContext) xaVar.getMessage();
                }
                AudioContext audioContext = this.audioContext_;
                return audioContext == null ? AudioContext.getDefaultInstance() : audioContext;
            }

            public AudioContext.Builder getAudioContextBuilder() {
                onChanged();
                return (AudioContext.Builder) getAudioContextFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public AudioContextOrBuilder getAudioContextOrBuilder() {
                xa xaVar = this.audioContextBuilder_;
                if (xaVar != null) {
                    return (AudioContextOrBuilder) xaVar.getMessageOrBuilder();
                }
                AudioContext audioContext = this.audioContext_;
                return audioContext == null ? AudioContext.getDefaultInstance() : audioContext;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getCarrier() {
                Object obj = this.carrier_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.carrier_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getCarrierBytes() {
                Object obj = this.carrier_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.carrier_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public Connection getConnection() {
                xa xaVar = this.connectionBuilder_;
                if (xaVar != null) {
                    return (Connection) xaVar.getMessage();
                }
                Connection connection = this.connection_;
                return connection == null ? Connection.getDefaultInstance() : connection;
            }

            public Connection.Builder getConnectionBuilder() {
                onChanged();
                return (Connection.Builder) getConnectionFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ConnectionOrBuilder getConnectionOrBuilder() {
                xa xaVar = this.connectionBuilder_;
                if (xaVar != null) {
                    return (ConnectionOrBuilder) xaVar.getMessageOrBuilder();
                }
                Connection connection = this.connection_;
                return connection == null ? Connection.getDefaultInstance() : connection;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ConnectionType getContype() {
                ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
                return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getContypeValue() {
                return this.contype_;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f21894s;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getDnt() {
                return this.dnt_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public Geo getGeo() {
                xa xaVar = this.geoBuilder_;
                if (xaVar != null) {
                    return (Geo) xaVar.getMessage();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            public Geo.Builder getGeoBuilder() {
                onChanged();
                return (Geo.Builder) getGeoFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public GeoOrBuilder getGeoOrBuilder() {
                xa xaVar = this.geoBuilder_;
                if (xaVar != null) {
                    return (GeoOrBuilder) xaVar.getMessageOrBuilder();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getGeofetch() {
                return this.geofetch_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getHwv() {
                Object obj = this.hwv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.hwv_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getHwvBytes() {
                Object obj = this.hwv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.hwv_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getIfa() {
                Object obj = this.ifa_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ifa_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getIfaBytes() {
                Object obj = this.ifa_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ifa_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getIp() {
                Object obj = this.ip_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ip_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getIpBytes() {
                Object obj = this.ip_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ip_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getIptr() {
                return this.iptr_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getIpv6() {
                Object obj = this.ipv6_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ipv6_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getIpv6Bytes() {
                Object obj = this.ipv6_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ipv6_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getJs() {
                return this.js_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getLang() {
                Object obj = this.lang_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lang_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getLangBytes() {
                Object obj = this.lang_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lang_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean getLmt() {
                return this.lmt_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getMake() {
                Object obj = this.make_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.make_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getMakeBytes() {
                Object obj = this.make_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.make_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getMccmnc() {
                Object obj = this.mccmnc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mccmnc_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getMccmncBytes() {
                Object obj = this.mccmnc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mccmnc_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getMccmncsim() {
                Object obj = this.mccmncsim_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mccmncsim_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getMccmncsimBytes() {
                Object obj = this.mccmncsim_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mccmncsim_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getModel() {
                Object obj = this.model_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.model_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getModelBytes() {
                Object obj = this.model_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.model_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public OS getOs() {
                OS osValueOf = OS.valueOf(this.os_);
                return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getOsValue() {
                return this.os_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getOsv() {
                Object obj = this.osv_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.osv_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getOsvBytes() {
                Object obj = this.osv_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.osv_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getPpi() {
                return this.ppi_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public float getPxratio() {
                return this.pxratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public DeviceType getType() {
                DeviceType deviceTypeValueOf = DeviceType.valueOf(this.type_);
                return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getUa() {
                Object obj = this.ua_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ua_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getUaBytes() {
                Object obj = this.ua_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ua_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public String getXff() {
                Object obj = this.xff_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.xff_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public ByteString getXffBytes() {
                Object obj = this.xff_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.xff_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasAudioContext() {
                return (this.audioContextBuilder_ == null && this.audioContext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasConnection() {
                return (this.connectionBuilder_ == null && this.connection_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.DeviceOrBuilder
            public boolean hasGeo() {
                return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.f21896t.ensureFieldAccessorsInitialized(Device.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAudioContext(AudioContext audioContext) {
                xa xaVar = this.audioContextBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(audioContext);
                    return this;
                }
                AudioContext audioContext2 = this.audioContext_;
                if (audioContext2 != null) {
                    this.audioContext_ = AudioContext.newBuilder(audioContext2).mergeFrom(audioContext).buildPartial();
                } else {
                    this.audioContext_ = audioContext;
                }
                onChanged();
                return this;
            }

            public Builder mergeConnection(Connection connection) {
                xa xaVar = this.connectionBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(connection);
                    return this;
                }
                Connection connection2 = this.connection_;
                if (connection2 != null) {
                    this.connection_ = Connection.newBuilder(connection2).mergeFrom(connection).buildPartial();
                } else {
                    this.connection_ = connection;
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

            public Builder mergeGeo(Geo geo) {
                xa xaVar = this.geoBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(geo);
                    return this;
                }
                Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
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

            public Builder setAudioContext(AudioContext audioContext) {
                xa xaVar = this.audioContextBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(audioContext);
                    return this;
                }
                audioContext.getClass();
                this.audioContext_ = audioContext;
                onChanged();
                return this;
            }

            public Builder setCarrier(String str) {
                str.getClass();
                this.carrier_ = str;
                onChanged();
                return this;
            }

            public Builder setCarrierBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.carrier_ = byteString;
                onChanged();
                return this;
            }

            public Builder setConnection(Connection connection) {
                xa xaVar = this.connectionBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(connection);
                    return this;
                }
                connection.getClass();
                this.connection_ = connection;
                onChanged();
                return this;
            }

            public Builder setContype(ConnectionType connectionType) {
                connectionType.getClass();
                this.contype_ = connectionType.getNumber();
                onChanged();
                return this;
            }

            public Builder setContypeValue(int i10) {
                this.contype_ = i10;
                onChanged();
                return this;
            }

            public Builder setDnt(boolean z10) {
                this.dnt_ = z10;
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

            public Builder setGeo(Geo geo) {
                xa xaVar = this.geoBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(geo);
                    return this;
                }
                geo.getClass();
                this.geo_ = geo;
                onChanged();
                return this;
            }

            public Builder setGeofetch(boolean z10) {
                this.geofetch_ = z10;
                onChanged();
                return this;
            }

            public Builder setH(int i10) {
                this.h_ = i10;
                onChanged();
                return this;
            }

            public Builder setHwv(String str) {
                str.getClass();
                this.hwv_ = str;
                onChanged();
                return this;
            }

            public Builder setHwvBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.hwv_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIfa(String str) {
                str.getClass();
                this.ifa_ = str;
                onChanged();
                return this;
            }

            public Builder setIfaBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.ifa_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIp(String str) {
                str.getClass();
                this.ip_ = str;
                onChanged();
                return this;
            }

            public Builder setIpBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.ip_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIptr(boolean z10) {
                this.iptr_ = z10;
                onChanged();
                return this;
            }

            public Builder setIpv6(String str) {
                str.getClass();
                this.ipv6_ = str;
                onChanged();
                return this;
            }

            public Builder setIpv6Bytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.ipv6_ = byteString;
                onChanged();
                return this;
            }

            public Builder setJs(boolean z10) {
                this.js_ = z10;
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

            public Builder setLmt(boolean z10) {
                this.lmt_ = z10;
                onChanged();
                return this;
            }

            public Builder setMake(String str) {
                str.getClass();
                this.make_ = str;
                onChanged();
                return this;
            }

            public Builder setMakeBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.make_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMccmnc(String str) {
                str.getClass();
                this.mccmnc_ = str;
                onChanged();
                return this;
            }

            public Builder setMccmncBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.mccmnc_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMccmncsim(String str) {
                str.getClass();
                this.mccmncsim_ = str;
                onChanged();
                return this;
            }

            public Builder setMccmncsimBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.mccmncsim_ = byteString;
                onChanged();
                return this;
            }

            public Builder setModel(String str) {
                str.getClass();
                this.model_ = str;
                onChanged();
                return this;
            }

            public Builder setModelBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.model_ = byteString;
                onChanged();
                return this;
            }

            public Builder setOs(OS os2) {
                os2.getClass();
                this.os_ = os2.getNumber();
                onChanged();
                return this;
            }

            public Builder setOsValue(int i10) {
                this.os_ = i10;
                onChanged();
                return this;
            }

            public Builder setOsv(String str) {
                str.getClass();
                this.osv_ = str;
                onChanged();
                return this;
            }

            public Builder setOsvBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.osv_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPpi(int i10) {
                this.ppi_ = i10;
                onChanged();
                return this;
            }

            public Builder setPxratio(float f10) {
                this.pxratio_ = f10;
                onChanged();
                return this;
            }

            public Builder setType(DeviceType deviceType) {
                deviceType.getClass();
                this.type_ = deviceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            public Builder setUa(String str) {
                str.getClass();
                this.ua_ = str;
                onChanged();
                return this;
            }

            public Builder setUaBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.ua_ = byteString;
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            public Builder setXff(String str) {
                str.getClass();
                this.xff_ = str;
                onChanged();
                return this;
            }

            public Builder setXffBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.xff_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Device build() {
                Device deviceBuildPartial = buildPartial();
                if (deviceBuildPartial.isInitialized()) {
                    return deviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Device buildPartial() {
                Device device = new Device(this);
                device.type_ = this.type_;
                device.ua_ = this.ua_;
                device.ifa_ = this.ifa_;
                device.dnt_ = this.dnt_;
                device.lmt_ = this.lmt_;
                device.make_ = this.make_;
                device.model_ = this.model_;
                device.os_ = this.os_;
                device.osv_ = this.osv_;
                device.hwv_ = this.hwv_;
                device.h_ = this.h_;
                device.w_ = this.w_;
                device.ppi_ = this.ppi_;
                device.pxratio_ = this.pxratio_;
                device.js_ = this.js_;
                device.lang_ = this.lang_;
                device.ip_ = this.ip_;
                device.ipv6_ = this.ipv6_;
                device.xff_ = this.xff_;
                device.iptr_ = this.iptr_;
                device.carrier_ = this.carrier_;
                device.mccmnc_ = this.mccmnc_;
                device.mccmncsim_ = this.mccmncsim_;
                device.contype_ = this.contype_;
                device.geofetch_ = this.geofetch_;
                xa xaVar = this.geoBuilder_;
                if (xaVar == null) {
                    device.geo_ = this.geo_;
                } else {
                    device.geo_ = (Geo) xaVar.build();
                }
                xa xaVar2 = this.connectionBuilder_;
                if (xaVar2 == null) {
                    device.connection_ = this.connection_;
                } else {
                    device.connection_ = (Connection) xaVar2.build();
                }
                xa xaVar3 = this.audioContextBuilder_;
                if (xaVar3 == null) {
                    device.audioContext_ = this.audioContext_;
                } else {
                    device.audioContext_ = (AudioContext) xaVar3.build();
                }
                xa xaVar4 = this.extBuilder_;
                if (xaVar4 == null) {
                    device.ext_ = this.ext_;
                } else {
                    device.ext_ = (Struct) xaVar4.build();
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    device.extProto_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    device.extProto_ = this.extProto_;
                }
                onBuilt();
                return device;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Device getDefaultInstanceForType() {
                return Device.getDefaultInstance();
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
                this.ua_ = "";
                this.ifa_ = "";
                this.dnt_ = false;
                this.lmt_ = false;
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.h_ = 0;
                this.w_ = 0;
                this.ppi_ = 0;
                this.pxratio_ = 0.0f;
                this.js_ = false;
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.iptr_ = false;
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.geofetch_ = false;
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                } else {
                    this.geo_ = null;
                    this.geoBuilder_ = null;
                }
                if (this.connectionBuilder_ == null) {
                    this.connection_ = null;
                } else {
                    this.connection_ = null;
                    this.connectionBuilder_ = null;
                }
                if (this.audioContextBuilder_ == null) {
                    this.audioContext_ = null;
                } else {
                    this.audioContext_ = null;
                    this.audioContextBuilder_ = null;
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

            public Builder setAudioContext(AudioContext.Builder builder) {
                xa xaVar = this.audioContextBuilder_;
                if (xaVar == null) {
                    this.audioContext_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder setConnection(Connection.Builder builder) {
                xa xaVar = this.connectionBuilder_;
                if (xaVar == null) {
                    this.connection_ = builder.build();
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

            public Builder setGeo(Geo.Builder builder) {
                xa xaVar = this.geoBuilder_;
                if (xaVar == null) {
                    this.geo_ = builder.build();
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
                if (message instanceof Device) {
                    return mergeFrom((Device) message);
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

            public Builder mergeFrom(Device device) {
                if (device == Device.getDefaultInstance()) {
                    return this;
                }
                if (device.type_ != 0) {
                    setTypeValue(device.getTypeValue());
                }
                if (!device.getUa().isEmpty()) {
                    this.ua_ = device.ua_;
                    onChanged();
                }
                if (!device.getIfa().isEmpty()) {
                    this.ifa_ = device.ifa_;
                    onChanged();
                }
                if (device.getDnt()) {
                    setDnt(device.getDnt());
                }
                if (device.getLmt()) {
                    setLmt(device.getLmt());
                }
                if (!device.getMake().isEmpty()) {
                    this.make_ = device.make_;
                    onChanged();
                }
                if (!device.getModel().isEmpty()) {
                    this.model_ = device.model_;
                    onChanged();
                }
                if (device.os_ != 0) {
                    setOsValue(device.getOsValue());
                }
                if (!device.getOsv().isEmpty()) {
                    this.osv_ = device.osv_;
                    onChanged();
                }
                if (!device.getHwv().isEmpty()) {
                    this.hwv_ = device.hwv_;
                    onChanged();
                }
                if (device.getH() != 0) {
                    setH(device.getH());
                }
                if (device.getW() != 0) {
                    setW(device.getW());
                }
                if (device.getPpi() != 0) {
                    setPpi(device.getPpi());
                }
                if (device.getPxratio() != 0.0f) {
                    setPxratio(device.getPxratio());
                }
                if (device.getJs()) {
                    setJs(device.getJs());
                }
                if (!device.getLang().isEmpty()) {
                    this.lang_ = device.lang_;
                    onChanged();
                }
                if (!device.getIp().isEmpty()) {
                    this.ip_ = device.ip_;
                    onChanged();
                }
                if (!device.getIpv6().isEmpty()) {
                    this.ipv6_ = device.ipv6_;
                    onChanged();
                }
                if (!device.getXff().isEmpty()) {
                    this.xff_ = device.xff_;
                    onChanged();
                }
                if (device.getIptr()) {
                    setIptr(device.getIptr());
                }
                if (!device.getCarrier().isEmpty()) {
                    this.carrier_ = device.carrier_;
                    onChanged();
                }
                if (!device.getMccmnc().isEmpty()) {
                    this.mccmnc_ = device.mccmnc_;
                    onChanged();
                }
                if (!device.getMccmncsim().isEmpty()) {
                    this.mccmncsim_ = device.mccmncsim_;
                    onChanged();
                }
                if (device.contype_ != 0) {
                    setContypeValue(device.getContypeValue());
                }
                if (device.getGeofetch()) {
                    setGeofetch(device.getGeofetch());
                }
                if (device.hasGeo()) {
                    mergeGeo(device.getGeo());
                }
                if (device.hasConnection()) {
                    mergeConnection(device.getConnection());
                }
                if (device.hasAudioContext()) {
                    mergeAudioContext(device.getAudioContext());
                }
                if (device.hasExt()) {
                    mergeExt(device.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!device.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = device.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(device.extProto_);
                        }
                        onChanged();
                    }
                } else if (!device.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(device.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = device.extProto_;
                        this.bitField0_ &= -2;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) device).unknownFields);
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

            private Builder(p6 p6Var) {
                super(p6Var);
                this.type_ = 0;
                this.ua_ = "";
                this.ifa_ = "";
                this.make_ = "";
                this.model_ = "";
                this.os_ = 0;
                this.osv_ = "";
                this.hwv_ = "";
                this.lang_ = "";
                this.ip_ = "";
                this.ipv6_ = "";
                this.xff_ = "";
                this.carrier_ = "";
                this.mccmnc_ = "";
                this.mccmncsim_ = "";
                this.contype_ = 0;
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.explorestack.protobuf.adcom.Context.Device.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.Device.access$25300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Device r3 = (com.explorestack.protobuf.adcom.Context.Device) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Device r4 = (com.explorestack.protobuf.adcom.Context.Device) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Device.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$Device$Builder");
            }
        }

        public static Builder newBuilder(Device device) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Device(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Device parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Device) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Device parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Device getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Device parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Device() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.ua_ = "";
            this.ifa_ = "";
            this.make_ = "";
            this.model_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.hwv_ = "";
            this.lang_ = "";
            this.ip_ = "";
            this.ipv6_ = "";
            this.xff_ = "";
            this.carrier_ = "";
            this.mccmnc_ = "";
            this.mccmncsim_ = "";
            this.contype_ = 0;
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Device parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Device parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Device) PARSER.parseFrom(bArr, m5Var);
        }

        public static Device parseFrom(InputStream inputStream) throws IOException {
            return (Device) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Device) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Device parseFrom(y yVar) throws IOException {
            return (Device) k7.parseWithIOException(PARSER, yVar);
        }

        public static Device parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Device) k7.parseWithIOException(PARSER, yVar, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Device(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.type_ = yVar.readEnum();
                            case 18:
                                this.ua_ = yVar.readStringRequireUtf8();
                            case 26:
                                this.ifa_ = yVar.readStringRequireUtf8();
                            case 32:
                                this.dnt_ = yVar.readBool();
                            case 40:
                                this.lmt_ = yVar.readBool();
                            case 50:
                                this.make_ = yVar.readStringRequireUtf8();
                            case 58:
                                this.model_ = yVar.readStringRequireUtf8();
                            case 64:
                                this.os_ = yVar.readEnum();
                            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                this.osv_ = yVar.readStringRequireUtf8();
                            case 82:
                                this.hwv_ = yVar.readStringRequireUtf8();
                            case 88:
                                this.h_ = yVar.readUInt32();
                            case 96:
                                this.w_ = yVar.readUInt32();
                            case 104:
                                this.ppi_ = yVar.readUInt32();
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                                this.pxratio_ = yVar.readFloat();
                            case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                                this.js_ = yVar.readBool();
                            case 130:
                                this.lang_ = yVar.readStringRequireUtf8();
                            case 138:
                                this.ip_ = yVar.readStringRequireUtf8();
                            case 146:
                                this.ipv6_ = yVar.readStringRequireUtf8();
                            case 154:
                                this.xff_ = yVar.readStringRequireUtf8();
                            case 160:
                                this.iptr_ = yVar.readBool();
                            case 170:
                                this.carrier_ = yVar.readStringRequireUtf8();
                            case 178:
                                this.mccmnc_ = yVar.readStringRequireUtf8();
                            case 186:
                                this.mccmncsim_ = yVar.readStringRequireUtf8();
                            case PsExtractor.AUDIO_STREAM /* 192 */:
                                this.contype_ = yVar.readEnum();
                            case 200:
                                this.geofetch_ = yVar.readBool();
                            case 210:
                                Geo geo = this.geo_;
                                Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                                Geo geo2 = (Geo) yVar.readMessage(Geo.parser(), m5Var);
                                this.geo_ = geo2;
                                if (builder != null) {
                                    builder.mergeFrom(geo2);
                                    this.geo_ = builder.buildPartial();
                                }
                            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                if (objArr == false) {
                                    this.extProto_ = new ArrayList();
                                    objArr = true;
                                }
                                this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                Struct struct = this.ext_;
                                Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                this.ext_ = struct2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(struct2);
                                    this.ext_ = builder2.buildPartial();
                                }
                            case 234:
                                Connection connection = this.connection_;
                                Connection.Builder builder3 = connection != null ? connection.toBuilder() : null;
                                Connection connection2 = (Connection) yVar.readMessage(Connection.parser(), m5Var);
                                this.connection_ = connection2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(connection2);
                                    this.connection_ = builder3.buildPartial();
                                }
                            case 242:
                                AudioContext audioContext = this.audioContext_;
                                AudioContext.Builder builder4 = audioContext != null ? audioContext.toBuilder() : null;
                                AudioContext audioContext2 = (AudioContext) yVar.readMessage(AudioContext.parser(), m5Var);
                                this.audioContext_ = audioContext2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(audioContext2);
                                    this.audioContext_ = builder4.buildPartial();
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
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface DeviceOrBuilder extends MessageOrBuilder {
        Device.AudioContext getAudioContext();

        Device.AudioContextOrBuilder getAudioContextOrBuilder();

        String getCarrier();

        ByteString getCarrierBytes();

        Device.Connection getConnection();

        Device.ConnectionOrBuilder getConnectionOrBuilder();

        ConnectionType getContype();

        int getContypeValue();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        boolean getDnt();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        Geo getGeo();

        GeoOrBuilder getGeoOrBuilder();

        boolean getGeofetch();

        int getH();

        String getHwv();

        ByteString getHwvBytes();

        String getIfa();

        ByteString getIfaBytes();

        String getIp();

        ByteString getIpBytes();

        boolean getIptr();

        String getIpv6();

        ByteString getIpv6Bytes();

        boolean getJs();

        String getLang();

        ByteString getLangBytes();

        boolean getLmt();

        String getMake();

        ByteString getMakeBytes();

        String getMccmnc();

        ByteString getMccmncBytes();

        String getMccmncsim();

        ByteString getMccmncsimBytes();

        String getModel();

        ByteString getModelBytes();

        OS getOs();

        int getOsValue();

        String getOsv();

        ByteString getOsvBytes();

        int getPpi();

        float getPxratio();

        DeviceType getType();

        int getTypeValue();

        String getUa();

        ByteString getUaBytes();

        int getW();

        String getXff();

        ByteString getXffBytes();

        boolean hasAudioContext();

        boolean hasConnection();

        boolean hasExt();

        boolean hasGeo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Geo extends k7 implements GeoOrBuilder {
        public static final int ACCUR_FIELD_NUMBER = 4;
        public static final int CITY_FIELD_NUMBER = 10;
        public static final int COUNTRY_FIELD_NUMBER = 7;
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int EXT_PROTO_FIELD_NUMBER = 13;
        public static final int IPSERV_FIELD_NUMBER = 6;
        public static final int LASTFIX_FIELD_NUMBER = 5;
        public static final int LAT_FIELD_NUMBER = 2;
        public static final int LON_FIELD_NUMBER = 3;
        public static final int METRO_FIELD_NUMBER = 9;
        public static final int REGION_FIELD_NUMBER = 8;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int UTCOFFSET_FIELD_NUMBER = 12;
        public static final int ZIP_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private int accur_;
        private volatile Object city_;
        private volatile Object country_;
        private List<Any> extProto_;
        private Struct ext_;
        private int ipserv_;
        private long lastfix_;
        private float lat_;
        private float lon_;
        private byte memoizedIsInitialized;
        private volatile Object metro_;
        private volatile Object region_;
        private int type_;
        private int utcoffset_;
        private volatile Object zip_;
        private static final Geo DEFAULT_INSTANCE = new Geo();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Geo.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Geo parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Geo(yVar, m5Var);
            }
        };

        public static Geo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21890q;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Geo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Geo) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Geo)) {
                return super.equals(obj);
            }
            Geo geo = (Geo) obj;
            if (this.type_ == geo.type_ && Float.floatToIntBits(getLat()) == Float.floatToIntBits(geo.getLat()) && Float.floatToIntBits(getLon()) == Float.floatToIntBits(geo.getLon()) && getAccur() == geo.getAccur() && getLastfix() == geo.getLastfix() && this.ipserv_ == geo.ipserv_ && getCountry().equals(geo.getCountry()) && getRegion().equals(geo.getRegion()) && getMetro().equals(geo.getMetro()) && getCity().equals(geo.getCity()) && getZip().equals(geo.getZip()) && getUtcoffset() == geo.getUtcoffset() && hasExt() == geo.hasExt()) {
                return (!hasExt() || getExt().equals(geo.getExt())) && getExtProtoList().equals(geo.getExtProtoList()) && this.unknownFields.equals(geo.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getAccur() {
            return this.accur_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getCity() {
            Object obj = this.city_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.city_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getCityBytes() {
            Object obj = this.city_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.city_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getCountry() {
            Object obj = this.country_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.country_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getCountryBytes() {
            Object obj = this.country_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.country_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public IpLocationService getIpserv() {
            IpLocationService ipLocationServiceValueOf = IpLocationService.valueOf(this.ipserv_);
            return ipLocationServiceValueOf == null ? IpLocationService.UNRECOGNIZED : ipLocationServiceValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getIpservValue() {
            return this.ipserv_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public long getLastfix() {
            return this.lastfix_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public float getLat() {
            return this.lat_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public float getLon() {
            return this.lon_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getMetro() {
            Object obj = this.metro_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.metro_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getMetroBytes() {
            Object obj = this.metro_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.metro_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public fa getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getRegion() {
            Object obj = this.region_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.region_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getRegionBytes() {
            Object obj = this.region_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.region_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = this.type_ != LocationType.LOCATION_TYPE_INVALID.getNumber() ? h0.computeEnumSize(1, this.type_) : 0;
            float f10 = this.lat_;
            if (f10 != 0.0f) {
                iComputeEnumSize += h0.computeFloatSize(2, f10);
            }
            float f11 = this.lon_;
            if (f11 != 0.0f) {
                iComputeEnumSize += h0.computeFloatSize(3, f11);
            }
            int i11 = this.accur_;
            if (i11 != 0) {
                iComputeEnumSize += h0.computeUInt32Size(4, i11);
            }
            long j10 = this.lastfix_;
            if (j10 != 0) {
                iComputeEnumSize += h0.computeUInt64Size(5, j10);
            }
            if (this.ipserv_ != IpLocationService.IP_LOCATION_SERVICE_INVALID.getNumber()) {
                iComputeEnumSize += h0.computeEnumSize(6, this.ipserv_);
            }
            if (!getCountryBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(7, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(8, this.region_);
            }
            if (!getMetroBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(9, this.metro_);
            }
            if (!getCityBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(10, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                iComputeEnumSize += k7.computeStringSize(11, this.zip_);
            }
            int i12 = this.utcoffset_;
            if (i12 != 0) {
                iComputeEnumSize += h0.computeInt32Size(12, i12);
            }
            for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                iComputeEnumSize += h0.computeMessageSize(13, this.extProto_.get(i13));
            }
            if (this.ext_ != null) {
                iComputeEnumSize += h0.computeMessageSize(14, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public LocationType getType() {
            LocationType locationTypeValueOf = LocationType.valueOf(this.type_);
            return locationTypeValueOf == null ? LocationType.UNRECOGNIZED : locationTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public int getUtcoffset() {
            return this.utcoffset_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public String getZip() {
            Object obj = this.zip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.zip_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public ByteString getZipBytes() {
            Object obj = this.zip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.zip_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int utcoffset = getUtcoffset() + ((((getZip().hashCode() + ((((getCity().hashCode() + ((((getMetro().hashCode() + ((((getRegion().hashCode() + ((((getCountry().hashCode() + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((x7.hashLong(getLastfix()) + ((((getAccur() + ((((Float.floatToIntBits(getLon()) + ((((Float.floatToIntBits(getLat()) + com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.d((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53, this.ipserv_, 37, 7, 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53);
            if (hasExt()) {
                utcoffset = o2.B(utcoffset, 37, 14, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                utcoffset = o2.B(utcoffset, 37, 13, 53) + getExtProtoList().hashCode();
            }
            int iHashCode = this.unknownFields.hashCode() + (utcoffset * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.f21892r.ensureFieldAccessorsInitialized(Geo.class, Builder.class);
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
            return new Geo();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (this.type_ != LocationType.LOCATION_TYPE_INVALID.getNumber()) {
                h0Var.writeEnum(1, this.type_);
            }
            float f10 = this.lat_;
            if (f10 != 0.0f) {
                h0Var.writeFloat(2, f10);
            }
            float f11 = this.lon_;
            if (f11 != 0.0f) {
                h0Var.writeFloat(3, f11);
            }
            int i10 = this.accur_;
            if (i10 != 0) {
                h0Var.writeUInt32(4, i10);
            }
            long j10 = this.lastfix_;
            if (j10 != 0) {
                h0Var.writeUInt64(5, j10);
            }
            if (this.ipserv_ != IpLocationService.IP_LOCATION_SERVICE_INVALID.getNumber()) {
                h0Var.writeEnum(6, this.ipserv_);
            }
            if (!getCountryBytes().isEmpty()) {
                k7.writeString(h0Var, 7, this.country_);
            }
            if (!getRegionBytes().isEmpty()) {
                k7.writeString(h0Var, 8, this.region_);
            }
            if (!getMetroBytes().isEmpty()) {
                k7.writeString(h0Var, 9, this.metro_);
            }
            if (!getCityBytes().isEmpty()) {
                k7.writeString(h0Var, 10, this.city_);
            }
            if (!getZipBytes().isEmpty()) {
                k7.writeString(h0Var, 11, this.zip_);
            }
            int i11 = this.utcoffset_;
            if (i11 != 0) {
                h0Var.writeInt32(12, i11);
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                h0Var.writeMessage(13, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(14, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements GeoOrBuilder {
            private int accur_;
            private int bitField0_;
            private Object city_;
            private Object country_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int ipserv_;
            private long lastfix_;
            private float lat_;
            private float lon_;
            private Object metro_;
            private Object region_;
            private int type_;
            private int utcoffset_;
            private Object zip_;

            private Builder() {
                super(null);
                this.type_ = 0;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
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
                return b.f21890q;
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

            public Builder clearAccur() {
                this.accur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCity() {
                this.city_ = Geo.getDefaultInstance().getCity();
                onChanged();
                return this;
            }

            public Builder clearCountry() {
                this.country_ = Geo.getDefaultInstance().getCountry();
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

            public Builder clearIpserv() {
                this.ipserv_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLastfix() {
                this.lastfix_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearLat() {
                this.lat_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearLon() {
                this.lon_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearMetro() {
                this.metro_ = Geo.getDefaultInstance().getMetro();
                onChanged();
                return this;
            }

            public Builder clearRegion() {
                this.region_ = Geo.getDefaultInstance().getRegion();
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUtcoffset() {
                this.utcoffset_ = 0;
                onChanged();
                return this;
            }

            public Builder clearZip() {
                this.zip_ = Geo.getDefaultInstance().getZip();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getAccur() {
                return this.accur_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getCity() {
                Object obj = this.city_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.city_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getCityBytes() {
                Object obj = this.city_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.city_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getCountry() {
                Object obj = this.country_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.country_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getCountryBytes() {
                Object obj = this.country_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.country_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f21890q;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public IpLocationService getIpserv() {
                IpLocationService ipLocationServiceValueOf = IpLocationService.valueOf(this.ipserv_);
                return ipLocationServiceValueOf == null ? IpLocationService.UNRECOGNIZED : ipLocationServiceValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getIpservValue() {
                return this.ipserv_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public long getLastfix() {
                return this.lastfix_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public float getLat() {
                return this.lat_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public float getLon() {
                return this.lon_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getMetro() {
                Object obj = this.metro_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.metro_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getMetroBytes() {
                Object obj = this.metro_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.metro_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getRegion() {
                Object obj = this.region_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.region_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getRegionBytes() {
                Object obj = this.region_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.region_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public LocationType getType() {
                LocationType locationTypeValueOf = LocationType.valueOf(this.type_);
                return locationTypeValueOf == null ? LocationType.UNRECOGNIZED : locationTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public int getUtcoffset() {
                return this.utcoffset_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public String getZip() {
                Object obj = this.zip_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.zip_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public ByteString getZipBytes() {
                Object obj = this.zip_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.zip_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.GeoOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.f21892r.ensureFieldAccessorsInitialized(Geo.class, Builder.class);
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

            public Builder setAccur(int i10) {
                this.accur_ = i10;
                onChanged();
                return this;
            }

            public Builder setCity(String str) {
                str.getClass();
                this.city_ = str;
                onChanged();
                return this;
            }

            public Builder setCityBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.city_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCountry(String str) {
                str.getClass();
                this.country_ = str;
                onChanged();
                return this;
            }

            public Builder setCountryBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.country_ = byteString;
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

            public Builder setIpserv(IpLocationService ipLocationService) {
                ipLocationService.getClass();
                this.ipserv_ = ipLocationService.getNumber();
                onChanged();
                return this;
            }

            public Builder setIpservValue(int i10) {
                this.ipserv_ = i10;
                onChanged();
                return this;
            }

            public Builder setLastfix(long j10) {
                this.lastfix_ = j10;
                onChanged();
                return this;
            }

            public Builder setLat(float f10) {
                this.lat_ = f10;
                onChanged();
                return this;
            }

            public Builder setLon(float f10) {
                this.lon_ = f10;
                onChanged();
                return this;
            }

            public Builder setMetro(String str) {
                str.getClass();
                this.metro_ = str;
                onChanged();
                return this;
            }

            public Builder setMetroBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.metro_ = byteString;
                onChanged();
                return this;
            }

            public Builder setRegion(String str) {
                str.getClass();
                this.region_ = str;
                onChanged();
                return this;
            }

            public Builder setRegionBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.region_ = byteString;
                onChanged();
                return this;
            }

            public Builder setType(LocationType locationType) {
                locationType.getClass();
                this.type_ = locationType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10) {
                this.type_ = i10;
                onChanged();
                return this;
            }

            public Builder setUtcoffset(int i10) {
                this.utcoffset_ = i10;
                onChanged();
                return this;
            }

            public Builder setZip(String str) {
                str.getClass();
                this.zip_ = str;
                onChanged();
                return this;
            }

            public Builder setZipBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.zip_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Geo build() {
                Geo geoBuildPartial = buildPartial();
                if (geoBuildPartial.isInitialized()) {
                    return geoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) geoBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Geo buildPartial() {
                Geo geo = new Geo(this);
                geo.type_ = this.type_;
                geo.lat_ = this.lat_;
                geo.lon_ = this.lon_;
                geo.accur_ = this.accur_;
                geo.lastfix_ = this.lastfix_;
                geo.ipserv_ = this.ipserv_;
                geo.country_ = this.country_;
                geo.region_ = this.region_;
                geo.metro_ = this.metro_;
                geo.city_ = this.city_;
                geo.zip_ = this.zip_;
                geo.utcoffset_ = this.utcoffset_;
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    geo.ext_ = this.ext_;
                } else {
                    geo.ext_ = (Struct) xaVar.build();
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    geo.extProto_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    geo.extProto_ = this.extProto_;
                }
                onBuilt();
                return geo;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Geo getDefaultInstanceForType() {
                return Geo.getDefaultInstance();
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
                this.lat_ = 0.0f;
                this.lon_ = 0.0f;
                this.accur_ = 0;
                this.lastfix_ = 0L;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
                this.utcoffset_ = 0;
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
                if (message instanceof Geo) {
                    return mergeFrom((Geo) message);
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

            public Builder mergeFrom(Geo geo) {
                if (geo == Geo.getDefaultInstance()) {
                    return this;
                }
                if (geo.type_ != 0) {
                    setTypeValue(geo.getTypeValue());
                }
                if (geo.getLat() != 0.0f) {
                    setLat(geo.getLat());
                }
                if (geo.getLon() != 0.0f) {
                    setLon(geo.getLon());
                }
                if (geo.getAccur() != 0) {
                    setAccur(geo.getAccur());
                }
                if (geo.getLastfix() != 0) {
                    setLastfix(geo.getLastfix());
                }
                if (geo.ipserv_ != 0) {
                    setIpservValue(geo.getIpservValue());
                }
                if (!geo.getCountry().isEmpty()) {
                    this.country_ = geo.country_;
                    onChanged();
                }
                if (!geo.getRegion().isEmpty()) {
                    this.region_ = geo.region_;
                    onChanged();
                }
                if (!geo.getMetro().isEmpty()) {
                    this.metro_ = geo.metro_;
                    onChanged();
                }
                if (!geo.getCity().isEmpty()) {
                    this.city_ = geo.city_;
                    onChanged();
                }
                if (!geo.getZip().isEmpty()) {
                    this.zip_ = geo.zip_;
                    onChanged();
                }
                if (geo.getUtcoffset() != 0) {
                    setUtcoffset(geo.getUtcoffset());
                }
                if (geo.hasExt()) {
                    mergeExt(geo.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!geo.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = geo.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(geo.extProto_);
                        }
                        onChanged();
                    }
                } else if (!geo.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(geo.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = geo.extProto_;
                        this.bitField0_ &= -2;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) geo).unknownFields);
                onChanged();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.type_ = 0;
                this.ipserv_ = 0;
                this.country_ = "";
                this.region_ = "";
                this.metro_ = "";
                this.city_ = "";
                this.zip_ = "";
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
            public com.explorestack.protobuf.adcom.Context.Geo.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.Geo.access$19100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Geo r3 = (com.explorestack.protobuf.adcom.Context.Geo) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Geo r4 = (com.explorestack.protobuf.adcom.Context.Geo) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Geo.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$Geo$Builder");
            }
        }

        public static Builder newBuilder(Geo geo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(geo);
        }

        public static Geo parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Geo(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Geo parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Geo) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Geo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Geo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Geo parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Geo() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.ipserv_ = 0;
            String str = DwaEpyvxz.BtvvYgwesa;
            this.country_ = str;
            this.region_ = str;
            this.metro_ = str;
            this.city_ = str;
            this.zip_ = str;
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Geo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Geo parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Geo) PARSER.parseFrom(bArr, m5Var);
        }

        public static Geo parseFrom(InputStream inputStream) throws IOException {
            return (Geo) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Geo parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Geo) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Geo parseFrom(y yVar) throws IOException {
            return (Geo) k7.parseWithIOException(PARSER, yVar);
        }

        public static Geo parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Geo) k7.parseWithIOException(PARSER, yVar, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Geo(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            this();
            m5Var.getClass();
            cc ccVarNewBuilder = gc.newBuilder();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = yVar.readTag();
                        switch (tag) {
                            case 0:
                                z10 = true;
                            case 8:
                                this.type_ = yVar.readEnum();
                            case 21:
                                this.lat_ = yVar.readFloat();
                            case 29:
                                this.lon_ = yVar.readFloat();
                            case 32:
                                this.accur_ = yVar.readUInt32();
                            case 40:
                                this.lastfix_ = yVar.readUInt64();
                            case 48:
                                this.ipserv_ = yVar.readEnum();
                            case 58:
                                this.country_ = yVar.readStringRequireUtf8();
                            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                this.region_ = yVar.readStringRequireUtf8();
                            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                this.metro_ = yVar.readStringRequireUtf8();
                            case 82:
                                this.city_ = yVar.readStringRequireUtf8();
                            case 90:
                                this.zip_ = yVar.readStringRequireUtf8();
                            case 96:
                                this.utcoffset_ = yVar.readInt32();
                            case 106:
                                if (!z11) {
                                    this.extProto_ = new ArrayList();
                                    z11 = true;
                                }
                                this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                            case 114:
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
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface GeoOrBuilder extends MessageOrBuilder {
        int getAccur();

        String getCity();

        ByteString getCityBytes();

        String getCountry();

        ByteString getCountryBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        IpLocationService getIpserv();

        int getIpservValue();

        long getLastfix();

        float getLat();

        float getLon();

        String getMetro();

        ByteString getMetroBytes();

        String getRegion();

        ByteString getRegionBytes();

        LocationType getType();

        int getTypeValue();

        int getUtcoffset();

        String getZip();

        ByteString getZipBytes();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Regs extends k7 implements RegsOrBuilder {
        public static final int COPPA_FIELD_NUMBER = 1;
        public static final int EXT_FIELD_NUMBER = 4;
        public static final int EXT_PROTO_FIELD_NUMBER = 3;
        public static final int GDPR_FIELD_NUMBER = 2;
        public static final int GPP_FIELD_NUMBER = 5;
        public static final int GPP_SID_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private boolean coppa_;
        private List<Any> extProto_;
        private Struct ext_;
        private boolean gdpr_;
        private int gppSidMemoizedSerializedSize;
        private s7 gppSid_;
        private volatile Object gpp_;
        private byte memoizedIsInitialized;
        private static final Regs DEFAULT_INSTANCE = new Regs();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Regs.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Regs parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Regs(yVar, m5Var);
            }
        };

        public static Regs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21906y;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Regs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Regs) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Regs)) {
                return super.equals(obj);
            }
            Regs regs = (Regs) obj;
            if (getCoppa() == regs.getCoppa() && getGdpr() == regs.getGdpr() && getGpp().equals(regs.getGpp()) && getGppSidList().equals(regs.getGppSidList()) && hasExt() == regs.hasExt()) {
                return (!hasExt() || getExt().equals(regs.getExt())) && getExtProtoList().equals(regs.getExtProtoList()) && this.unknownFields.equals(regs.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public boolean getCoppa() {
            return this.coppa_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public boolean getGdpr() {
            return this.gdpr_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public String getGpp() {
            Object obj = this.gpp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public ByteString getGppBytes() {
            Object obj = this.gpp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public int getGppSid(int i10) {
            return ((l7) this.gppSid_).getInt(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public int getGppSidCount() {
            return this.gppSid_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public List<Integer> getGppSidList() {
            return this.gppSid_;
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
            boolean z10 = this.coppa_;
            int iComputeBoolSize = z10 ? h0.computeBoolSize(1, z10) : 0;
            boolean z11 = this.gdpr_;
            if (z11) {
                iComputeBoolSize += h0.computeBoolSize(2, z11);
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                iComputeBoolSize += h0.computeMessageSize(3, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                iComputeBoolSize += h0.computeMessageSize(4, getExt());
            }
            if (!getGppBytes().isEmpty()) {
                iComputeBoolSize += k7.computeStringSize(5, this.gpp_);
            }
            int iComputeUInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < this.gppSid_.size(); i12++) {
                iComputeUInt32SizeNoTag += h0.computeUInt32SizeNoTag(((l7) this.gppSid_).getInt(i12));
            }
            int iComputeInt32SizeNoTag = iComputeBoolSize + iComputeUInt32SizeNoTag;
            if (!getGppSidList().isEmpty()) {
                iComputeInt32SizeNoTag = iComputeInt32SizeNoTag + 1 + h0.computeInt32SizeNoTag(iComputeUInt32SizeNoTag);
            }
            this.gppSidMemoizedSerializedSize = iComputeUInt32SizeNoTag;
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32SizeNoTag;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getGpp().hashCode() + ((((x7.hashBoolean(getGdpr()) + ((((x7.hashBoolean(getCoppa()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 5) * 53);
            if (getGppSidCount() > 0) {
                iHashCode = getGppSidList().hashCode() + o2.B(iHashCode, 37, 6, 53);
            }
            if (hasExt()) {
                iHashCode = getExt().hashCode() + o2.B(iHashCode, 37, 4, 53);
            }
            if (getExtProtoCount() > 0) {
                iHashCode = getExtProtoList().hashCode() + o2.B(iHashCode, 37, 3, 53);
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.f21908z.ensureFieldAccessorsInitialized(Regs.class, Builder.class);
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
            return new Regs();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            getSerializedSize();
            boolean z10 = this.coppa_;
            if (z10) {
                h0Var.writeBool(1, z10);
            }
            boolean z11 = this.gdpr_;
            if (z11) {
                h0Var.writeBool(2, z11);
            }
            for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                h0Var.writeMessage(3, this.extProto_.get(i10));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(4, getExt());
            }
            if (!getGppBytes().isEmpty()) {
                k7.writeString(h0Var, 5, this.gpp_);
            }
            if (getGppSidList().size() > 0) {
                h0Var.writeUInt32NoTag(50);
                h0Var.writeUInt32NoTag(this.gppSidMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.gppSid_.size(); i11++) {
                h0Var.writeUInt32NoTag(((l7) this.gppSid_).getInt(i11));
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements RegsOrBuilder {
            private int bitField0_;
            private boolean coppa_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private boolean gdpr_;
            private s7 gppSid_;
            private Object gpp_;

            private Builder() {
                super(null);
                this.gpp_ = "";
                this.gppSid_ = k7.emptyIntList();
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureGppSidIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.gppSid_ = k7.mutableCopy(this.gppSid_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.f21906y;
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

            public Builder addAllGppSid(Iterable<? extends Integer> iterable) {
                ensureGppSidIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.gppSid_);
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

            public Builder addGppSid(int i10) {
                ensureGppSidIsMutable();
                ((l7) this.gppSid_).addInt(i10);
                onChanged();
                return this;
            }

            public Builder clearCoppa() {
                this.coppa_ = false;
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

            public Builder clearGdpr() {
                this.gdpr_ = false;
                onChanged();
                return this;
            }

            public Builder clearGpp() {
                this.gpp_ = Regs.getDefaultInstance().getGpp();
                onChanged();
                return this;
            }

            public Builder clearGppSid() {
                this.gppSid_ = k7.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public boolean getCoppa() {
                return this.coppa_;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.f21906y;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public boolean getGdpr() {
                return this.gdpr_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public String getGpp() {
                Object obj = this.gpp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.gpp_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public ByteString getGppBytes() {
                Object obj = this.gpp_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gpp_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public int getGppSid(int i10) {
                return ((l7) this.gppSid_).getInt(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public int getGppSidCount() {
                return this.gppSid_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public List<Integer> getGppSidList() {
                return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.gppSid_) : this.gppSid_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RegsOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.f21908z.ensureFieldAccessorsInitialized(Regs.class, Builder.class);
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

            public Builder setCoppa(boolean z10) {
                this.coppa_ = z10;
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

            public Builder setGdpr(boolean z10) {
                this.gdpr_ = z10;
                onChanged();
                return this;
            }

            public Builder setGpp(String str) {
                str.getClass();
                this.gpp_ = str;
                onChanged();
                return this;
            }

            public Builder setGppBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.gpp_ = byteString;
                onChanged();
                return this;
            }

            public Builder setGppSid(int i10, int i11) {
                ensureGppSidIsMutable();
                ((l7) this.gppSid_).setInt(i10, i11);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Regs build() {
                Regs regsBuildPartial = buildPartial();
                if (regsBuildPartial.isInitialized()) {
                    return regsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) regsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Regs buildPartial() {
                Regs regs = new Regs(this);
                regs.coppa_ = this.coppa_;
                regs.gdpr_ = this.gdpr_;
                regs.gpp_ = this.gpp_;
                if ((this.bitField0_ & 1) != 0) {
                    ((com.explorestack.protobuf.e) this.gppSid_).makeImmutable();
                    this.bitField0_ &= -2;
                }
                regs.gppSid_ = this.gppSid_;
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    regs.ext_ = this.ext_;
                } else {
                    regs.ext_ = (Struct) xaVar.build();
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    regs.extProto_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    regs.extProto_ = this.extProto_;
                }
                onBuilt();
                return regs;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Regs getDefaultInstanceForType() {
                return Regs.getDefaultInstance();
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
                this.coppa_ = false;
                this.gdpr_ = false;
                this.gpp_ = "";
                this.gppSid_ = k7.emptyIntList();
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
                if (message instanceof Regs) {
                    return mergeFrom((Regs) message);
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
                this.gpp_ = "";
                this.gppSid_ = k7.emptyIntList();
                this.extProto_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(Regs regs) {
                if (regs == Regs.getDefaultInstance()) {
                    return this;
                }
                if (regs.getCoppa()) {
                    setCoppa(regs.getCoppa());
                }
                if (regs.getGdpr()) {
                    setGdpr(regs.getGdpr());
                }
                if (!regs.getGpp().isEmpty()) {
                    this.gpp_ = regs.gpp_;
                    onChanged();
                }
                if (!regs.gppSid_.isEmpty()) {
                    if (this.gppSid_.isEmpty()) {
                        this.gppSid_ = regs.gppSid_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureGppSidIsMutable();
                        this.gppSid_.addAll(regs.gppSid_);
                    }
                    onChanged();
                }
                if (regs.hasExt()) {
                    mergeExt(regs.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!regs.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = regs.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(regs.extProto_);
                        }
                        onChanged();
                    }
                } else if (!regs.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(regs.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = regs.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) regs).unknownFields);
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
            public com.explorestack.protobuf.adcom.Context.Regs.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.Regs.access$28100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Regs r3 = (com.explorestack.protobuf.adcom.Context.Regs) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Regs r4 = (com.explorestack.protobuf.adcom.Context.Regs) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Regs.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$Regs$Builder");
            }
        }

        public static Builder newBuilder(Regs regs) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(regs);
        }

        public static Regs parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private Regs(o6 o6Var) {
            super(o6Var);
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Regs parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Regs) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Regs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Regs getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Regs parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Regs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        private Regs() {
            this.gppSidMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.gpp_ = "";
            this.gppSid_ = k7.emptyIntList();
            this.extProto_ = Collections.EMPTY_LIST;
        }

        public static Regs parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Regs) PARSER.parseFrom(bArr, m5Var);
        }

        public static Regs parseFrom(InputStream inputStream) throws IOException {
            return (Regs) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Regs parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Regs) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Regs parseFrom(y yVar) throws IOException {
            return (Regs) k7.parseWithIOException(PARSER, yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Regs(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.coppa_ = yVar.readBool();
                            } else if (tag == 16) {
                                this.gdpr_ = yVar.readBool();
                            } else if (tag == 26) {
                                if ((i10 & 2) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                            } else if (tag == 34) {
                                Struct struct = this.ext_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
                                }
                            } else if (tag == 42) {
                                this.gpp_ = yVar.readStringRequireUtf8();
                            } else if (tag == 48) {
                                if ((i10 & 1) == 0) {
                                    this.gppSid_ = k7.newIntList();
                                    i10 |= 1;
                                }
                                ((l7) this.gppSid_).addInt(yVar.readUInt32());
                            } else if (tag != 50) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                if ((i10 & 1) == 0 && yVar.getBytesUntilLimit() > 0) {
                                    this.gppSid_ = k7.newIntList();
                                    i10 |= 1;
                                }
                                while (yVar.getBytesUntilLimit() > 0) {
                                    ((l7) this.gppSid_).addInt(yVar.readUInt32());
                                }
                                yVar.popLimit(iPushLimit);
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    if ((i10 & 1) != 0) {
                        ((com.explorestack.protobuf.e) this.gppSid_).makeImmutable();
                    }
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            if ((i10 & 1) != 0) {
                ((com.explorestack.protobuf.e) this.gppSid_).makeImmutable();
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Regs parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Regs) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface RegsOrBuilder extends MessageOrBuilder {
        boolean getCoppa();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        boolean getGdpr();

        String getGpp();

        ByteString getGppBytes();

        int getGppSid(int i10);

        int getGppSidCount();

        List<Integer> getGppSidList();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Restrictions extends k7 implements RestrictionsOrBuilder {
        public static final int BADV_FIELD_NUMBER = 3;
        public static final int BAPP_FIELD_NUMBER = 4;
        public static final int BATTR_FIELD_NUMBER = 5;
        public static final int BCAT_FIELD_NUMBER = 1;
        public static final int CATTAX_FIELD_NUMBER = 2;
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private g8 badv_;
        private g8 bapp_;
        private int battrMemoizedSerializedSize;
        private List<Integer> battr_;
        private g8 bcat_;
        private int cattax_;
        private List<Any> extProto_;
        private Struct ext_;
        private byte memoizedIsInitialized;
        private static final t7 battr_converter_ = new t7() { // from class: com.explorestack.protobuf.adcom.Context.Restrictions.1
            @Override // com.explorestack.protobuf.t7
            public CreativeAttribute convert(Integer num) {
                CreativeAttribute creativeAttributeValueOf = CreativeAttribute.valueOf(num.intValue());
                return creativeAttributeValueOf == null ? CreativeAttribute.UNRECOGNIZED : creativeAttributeValueOf;
            }
        };
        private static final Restrictions DEFAULT_INSTANCE = new Restrictions();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.Restrictions.2
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public Restrictions parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new Restrictions(yVar, m5Var);
            }
        };

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements RestrictionsOrBuilder {
            private g8 badv_;
            private g8 bapp_;
            private List<Integer> battr_;
            private g8 bcat_;
            private int bitField0_;
            private int cattax_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;

            private Builder() {
                super(null);
                f8 f8Var = f8.f22138e;
                this.bcat_ = f8Var;
                this.cattax_ = 0;
                this.badv_ = f8Var;
                this.bapp_ = f8Var;
                List list = Collections.EMPTY_LIST;
                this.battr_ = list;
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
                if ((this.bitField0_ & 16) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.A;
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public String getBadv(int i10) {
                return (String) this.badv_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ByteString getBadvBytes(int i10) {
                return this.badv_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBadvCount() {
                return this.badv_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public String getBapp(int i10) {
                return (String) this.bapp_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ByteString getBappBytes(int i10) {
                return this.bapp_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBappCount() {
                return this.bapp_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public CreativeAttribute getBattr(int i10) {
                return (CreativeAttribute) Restrictions.battr_converter_.convert(this.battr_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBattrCount() {
                return this.battr_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<CreativeAttribute> getBattrList() {
                return new u7(this.battr_, Restrictions.battr_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBattrValue(int i10) {
                return this.battr_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<Integer> getBattrValueList() {
                return Collections.unmodifiableList(this.battr_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public String getBcat(int i10) {
                return (String) this.bcat_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ByteString getBcatBytes(int i10) {
                return this.bcat_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getBcatCount() {
                return this.bcat_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public CategoryTaxonomy getCattax() {
                CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
                return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getCattaxValue() {
                return this.cattax_;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.A;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.B.ensureFieldAccessorsInitialized(Restrictions.class, Builder.class);
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

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ka getBadvList() {
                return this.badv_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ka getBappList() {
                return this.bapp_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
            public ka getBcatList() {
                return this.bcat_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Restrictions build() {
                Restrictions restrictionsBuildPartial = buildPartial();
                if (restrictionsBuildPartial.isInitialized()) {
                    return restrictionsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) restrictionsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Restrictions buildPartial() {
                Restrictions restrictions = new Restrictions(this);
                if ((this.bitField0_ & 1) != 0) {
                    this.bcat_ = this.bcat_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                restrictions.bcat_ = this.bcat_;
                restrictions.cattax_ = this.cattax_;
                if ((this.bitField0_ & 2) != 0) {
                    this.badv_ = this.badv_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                restrictions.badv_ = this.badv_;
                if ((this.bitField0_ & 4) != 0) {
                    this.bapp_ = this.bapp_.getUnmodifiableView();
                    this.bitField0_ &= -5;
                }
                restrictions.bapp_ = this.bapp_;
                if ((this.bitField0_ & 8) != 0) {
                    this.battr_ = Collections.unmodifiableList(this.battr_);
                    this.bitField0_ &= -9;
                }
                restrictions.battr_ = this.battr_;
                xa xaVar = this.extBuilder_;
                if (xaVar == null) {
                    restrictions.ext_ = this.ext_;
                } else {
                    restrictions.ext_ = (Struct) xaVar.build();
                }
                pa paVar = this.extProtoBuilder_;
                if (paVar != null) {
                    restrictions.extProto_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -17;
                    }
                    restrictions.extProto_ = this.extProto_;
                }
                onBuilt();
                return restrictions;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public Restrictions getDefaultInstanceForType() {
                return Restrictions.getDefaultInstance();
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
                f8 f8Var = f8.f22138e;
                this.bcat_ = f8Var;
                int i10 = this.bitField0_;
                this.cattax_ = 0;
                this.badv_ = f8Var;
                this.bapp_ = f8Var;
                this.bitField0_ = i10 & (-8);
                List list = Collections.EMPTY_LIST;
                this.battr_ = list;
                this.bitField0_ = i10 & (-16);
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
                if (message instanceof Restrictions) {
                    return mergeFrom((Restrictions) message);
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

            public Builder mergeFrom(Restrictions restrictions) {
                if (restrictions == Restrictions.getDefaultInstance()) {
                    return this;
                }
                if (!restrictions.bcat_.isEmpty()) {
                    if (this.bcat_.isEmpty()) {
                        this.bcat_ = restrictions.bcat_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureBcatIsMutable();
                        this.bcat_.addAll(restrictions.bcat_);
                    }
                    onChanged();
                }
                if (restrictions.cattax_ != 0) {
                    setCattaxValue(restrictions.getCattaxValue());
                }
                if (!restrictions.badv_.isEmpty()) {
                    if (this.badv_.isEmpty()) {
                        this.badv_ = restrictions.badv_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureBadvIsMutable();
                        this.badv_.addAll(restrictions.badv_);
                    }
                    onChanged();
                }
                if (!restrictions.bapp_.isEmpty()) {
                    if (this.bapp_.isEmpty()) {
                        this.bapp_ = restrictions.bapp_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureBappIsMutable();
                        this.bapp_.addAll(restrictions.bapp_);
                    }
                    onChanged();
                }
                if (!restrictions.battr_.isEmpty()) {
                    if (this.battr_.isEmpty()) {
                        this.battr_ = restrictions.battr_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureBattrIsMutable();
                        this.battr_.addAll(restrictions.battr_);
                    }
                    onChanged();
                }
                if (restrictions.hasExt()) {
                    mergeExt(restrictions.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!restrictions.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = restrictions.extProto_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(restrictions.extProto_);
                        }
                        onChanged();
                    }
                } else if (!restrictions.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(restrictions.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = restrictions.extProto_;
                        this.bitField0_ &= -17;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) restrictions).unknownFields);
                onChanged();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                f8 f8Var = f8.f22138e;
                this.bcat_ = f8Var;
                this.cattax_ = 0;
                this.badv_ = f8Var;
                this.bapp_ = f8Var;
                List list = Collections.EMPTY_LIST;
                this.battr_ = list;
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
            public com.explorestack.protobuf.adcom.Context.Restrictions.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.Restrictions.access$30000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$Restrictions r3 = (com.explorestack.protobuf.adcom.Context.Restrictions) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$Restrictions r4 = (com.explorestack.protobuf.adcom.Context.Restrictions) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Restrictions.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$Restrictions$Builder");
            }
        }

        public static Restrictions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.A;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Restrictions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Restrictions) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Restrictions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Restrictions)) {
                return super.equals(obj);
            }
            Restrictions restrictions = (Restrictions) obj;
            if (getBcatList().equals(restrictions.getBcatList()) && this.cattax_ == restrictions.cattax_ && getBadvList().equals(restrictions.getBadvList()) && getBappList().equals(restrictions.getBappList()) && this.battr_.equals(restrictions.battr_) && hasExt() == restrictions.hasExt()) {
                return (!hasExt() || getExt().equals(restrictions.getExt())) && getExtProtoList().equals(restrictions.getExtProtoList()) && this.unknownFields.equals(restrictions.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public String getBadv(int i10) {
            return (String) this.badv_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ByteString getBadvBytes(int i10) {
            return this.badv_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBadvCount() {
            return this.badv_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public String getBapp(int i10) {
            return (String) this.bapp_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ByteString getBappBytes(int i10) {
            return this.bapp_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBappCount() {
            return this.bapp_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public CreativeAttribute getBattr(int i10) {
            return (CreativeAttribute) battr_converter_.convert(this.battr_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBattrCount() {
            return this.battr_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public List<CreativeAttribute> getBattrList() {
            return new u7(this.battr_, battr_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBattrValue(int i10) {
            return this.battr_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public List<Integer> getBattrValueList() {
            return this.battr_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public String getBcat(int i10) {
            return (String) this.bcat_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ByteString getBcatBytes(int i10) {
            return this.bcat_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getBcatCount() {
            return this.bcat_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getCattaxValue() {
            return this.cattax_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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
            int iE = 0;
            for (int i11 = 0; i11 < this.bcat_.size(); i11++) {
                iE = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.bcat_, i11, iE);
            }
            int size = getBcatList().size() + iE;
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                size += h0.computeEnumSize(2, this.cattax_);
            }
            int iE2 = 0;
            for (int i12 = 0; i12 < this.badv_.size(); i12++) {
                iE2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.badv_, i12, iE2);
            }
            int size2 = getBadvList().size() + size + iE2;
            int iE3 = 0;
            for (int i13 = 0; i13 < this.bapp_.size(); i13++) {
                iE3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.e(this.bapp_, i13, iE3);
            }
            int size3 = getBappList().size() + size2 + iE3;
            int iComputeEnumSizeNoTag = 0;
            for (int i14 = 0; i14 < this.battr_.size(); i14++) {
                iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(this.battr_.get(i14).intValue());
            }
            int iComputeMessageSize = size3 + iComputeEnumSizeNoTag;
            if (!getBattrList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + h0.computeUInt32SizeNoTag(iComputeEnumSizeNoTag);
            }
            this.battrMemoizedSerializedSize = iComputeEnumSizeNoTag;
            for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                iComputeMessageSize += h0.computeMessageSize(6, this.extProto_.get(i15));
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

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
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
            if (getBcatCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 1, 53) + getBcatList().hashCode();
            }
            int iB = o2.B(iHashCode, 37, 2, 53) + this.cattax_;
            if (getBadvCount() > 0) {
                iB = o2.B(iB, 37, 3, 53) + getBadvList().hashCode();
            }
            if (getBappCount() > 0) {
                iB = o2.B(iB, 37, 4, 53) + getBappList().hashCode();
            }
            if (getBattrCount() > 0) {
                iB = o2.B(iB, 37, 5, 53) + this.battr_.hashCode();
            }
            if (hasExt()) {
                iB = o2.B(iB, 37, 7, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iB = o2.B(iB, 37, 6, 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iB * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.B.ensureFieldAccessorsInitialized(Restrictions.class, Builder.class);
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
            return new Restrictions();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            getSerializedSize();
            int iF = 0;
            while (iF < this.bcat_.size()) {
                iF = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.bcat_, iF, h0Var, 1, iF, 1);
            }
            if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
                h0Var.writeEnum(2, this.cattax_);
            }
            int iF2 = 0;
            while (iF2 < this.badv_.size()) {
                iF2 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.badv_, iF2, h0Var, 3, iF2, 1);
            }
            int iF3 = 0;
            while (iF3 < this.bapp_.size()) {
                iF3 = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.f(this.bapp_, iF3, h0Var, 4, iF3, 1);
            }
            if (getBattrList().size() > 0) {
                h0Var.writeUInt32NoTag(42);
                h0Var.writeUInt32NoTag(this.battrMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.battr_.size(); i10++) {
                h0Var.writeEnumNoTag(this.battr_.get(i10).intValue());
            }
            for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                h0Var.writeMessage(6, this.extProto_.get(i11));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        public static Builder newBuilder(Restrictions restrictions) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(restrictions);
        }

        public static Restrictions parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteBuffer, m5Var);
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ka getBadvList() {
            return this.badv_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ka getBappList() {
            return this.bapp_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.RestrictionsOrBuilder
        public ka getBcatList() {
            return this.bcat_;
        }

        private Restrictions(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Restrictions parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Restrictions) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static Restrictions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Restrictions getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Restrictions parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Restrictions() {
            this.memoizedIsInitialized = (byte) -1;
            f8 f8Var = f8.f22138e;
            this.bcat_ = f8Var;
            this.cattax_ = 0;
            this.badv_ = f8Var;
            this.bapp_ = f8Var;
            List list = Collections.EMPTY_LIST;
            this.battr_ = list;
            this.extProto_ = list;
        }

        public static Restrictions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static Restrictions parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (Restrictions) PARSER.parseFrom(bArr, m5Var);
        }

        public static Restrictions parseFrom(InputStream inputStream) throws IOException {
            return (Restrictions) k7.parseWithIOException(PARSER, inputStream);
        }

        public static Restrictions parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (Restrictions) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static Restrictions parseFrom(y yVar) throws IOException {
            return (Restrictions) k7.parseWithIOException(PARSER, yVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Restrictions(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.bcat_ = new f8();
                                    i10 |= 1;
                                }
                                this.bcat_.add((g8) stringRequireUtf8);
                            } else if (tag == 16) {
                                this.cattax_ = yVar.readEnum();
                            } else if (tag == 26) {
                                String stringRequireUtf82 = yVar.readStringRequireUtf8();
                                if ((i10 & 2) == 0) {
                                    this.badv_ = new f8();
                                    i10 |= 2;
                                }
                                this.badv_.add((g8) stringRequireUtf82);
                            } else if (tag == 34) {
                                String stringRequireUtf83 = yVar.readStringRequireUtf8();
                                if ((i10 & 4) == 0) {
                                    this.bapp_ = new f8();
                                    i10 |= 4;
                                }
                                this.bapp_.add((g8) stringRequireUtf83);
                            } else if (tag == 40) {
                                int i11 = yVar.readEnum();
                                if ((i10 & 8) == 0) {
                                    this.battr_ = new ArrayList();
                                    i10 |= 8;
                                }
                                this.battr_.add(Integer.valueOf(i11));
                            } else if (tag == 42) {
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                while (yVar.getBytesUntilLimit() > 0) {
                                    int i12 = yVar.readEnum();
                                    if ((i10 & 8) == 0) {
                                        this.battr_ = new ArrayList();
                                        i10 |= 8;
                                    }
                                    this.battr_.add(Integer.valueOf(i12));
                                }
                                yVar.popLimit(iPushLimit);
                            } else if (tag == 50) {
                                if ((i10 & 16) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 16;
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
                        this.bcat_ = this.bcat_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.badv_ = this.badv_.getUnmodifiableView();
                    }
                    if ((i10 & 4) != 0) {
                        this.bapp_ = this.bapp_.getUnmodifiableView();
                    }
                    if ((i10 & 8) != 0) {
                        this.battr_ = Collections.unmodifiableList(this.battr_);
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
                this.bcat_ = this.bcat_.getUnmodifiableView();
            }
            if ((i10 & 2) != 0) {
                this.badv_ = this.badv_.getUnmodifiableView();
            }
            if ((i10 & 4) != 0) {
                this.bapp_ = this.bapp_.getUnmodifiableView();
            }
            if ((i10 & 8) != 0) {
                this.battr_ = Collections.unmodifiableList(this.battr_);
            }
            if ((i10 & 16) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Restrictions parseFrom(y yVar, m5 m5Var) throws IOException {
            return (Restrictions) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface RestrictionsOrBuilder extends MessageOrBuilder {
        String getBadv(int i10);

        ByteString getBadvBytes(int i10);

        int getBadvCount();

        List<String> getBadvList();

        String getBapp(int i10);

        ByteString getBappBytes(int i10);

        int getBappCount();

        List<String> getBappList();

        CreativeAttribute getBattr(int i10);

        int getBattrCount();

        List<CreativeAttribute> getBattrList();

        int getBattrValue(int i10);

        List<Integer> getBattrValueList();

        String getBcat(int i10);

        ByteString getBcatBytes(int i10);

        int getBcatCount();

        List<String> getBcatList();

        CategoryTaxonomy getCattax();

        int getCattaxValue();

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

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class User extends k7 implements UserOrBuilder {
        public static final int BUYERUID_FIELD_NUMBER = 2;
        public static final int CONSENT_FIELD_NUMBER = 6;
        public static final int DATA_FIELD_NUMBER = 8;
        public static final int EXT_FIELD_NUMBER = 10;
        public static final int EXT_PROTO_FIELD_NUMBER = 9;
        public static final int GENDER_FIELD_NUMBER = 4;
        public static final int GEO_FIELD_NUMBER = 7;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int KEYWORDS_FIELD_NUMBER = 5;
        public static final int YOB_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object buyeruid_;
        private volatile Object consent_;
        private List<Data> data_;
        private List<Any> extProto_;
        private Struct ext_;
        private volatile Object gender_;
        private Geo geo_;
        private volatile Object id_;
        private volatile Object keywords_;
        private byte memoizedIsInitialized;
        private int yob_;
        private static final User DEFAULT_INSTANCE = new User();
        private static final fa PARSER = new com.explorestack.protobuf.d() { // from class: com.explorestack.protobuf.adcom.Context.User.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public User parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new User(yVar, m5Var);
            }
        };

        public static User getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.C;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static User parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (User) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static User parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof User)) {
                return super.equals(obj);
            }
            User user = (User) obj;
            if (!getId().equals(user.getId()) || !getBuyeruid().equals(user.getBuyeruid()) || getYob() != user.getYob() || !getGender().equals(user.getGender()) || !getKeywords().equals(user.getKeywords()) || !getConsent().equals(user.getConsent()) || hasGeo() != user.hasGeo()) {
                return false;
            }
            if ((!hasGeo() || getGeo().equals(user.getGeo())) && getDataList().equals(user.getDataList()) && hasExt() == user.hasExt()) {
                return (!hasExt() || getExt().equals(user.getExt())) && getExtProtoList().equals(user.getExtProtoList()) && this.unknownFields.equals(user.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getBuyeruid() {
            Object obj = this.buyeruid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.buyeruid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getBuyeruidBytes() {
            Object obj = this.buyeruid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.buyeruid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getConsent() {
            Object obj = this.consent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.consent_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getConsentBytes() {
            Object obj = this.consent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consent_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Data getData(int i10) {
            return this.data_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<Data> getDataList() {
            return this.data_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public DataOrBuilder getDataOrBuilder(int i10) {
            return this.data_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<? extends DataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public jb getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getGender() {
            Object obj = this.gender_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gender_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getGenderBytes() {
            Object obj = this.gender_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gender_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public Geo getGeo() {
            Geo geo = this.geo_;
            return geo == null ? Geo.getDefaultInstance() : geo;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public GeoOrBuilder getGeoOrBuilder() {
            return getGeo();
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public String getKeywords() {
            Object obj = this.keywords_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.keywords_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public ByteString getKeywordsBytes() {
            Object obj = this.keywords_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.keywords_ = byteStringCopyFromUtf8;
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
            if (!getBuyeruidBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(2, this.buyeruid_);
            }
            int i11 = this.yob_;
            if (i11 != 0) {
                iComputeStringSize += h0.computeUInt32Size(3, i11);
            }
            if (!getGenderBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(4, this.gender_);
            }
            if (!getKeywordsBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(5, this.keywords_);
            }
            if (!getConsentBytes().isEmpty()) {
                iComputeStringSize += k7.computeStringSize(6, this.consent_);
            }
            if (this.geo_ != null) {
                iComputeStringSize += h0.computeMessageSize(7, getGeo());
            }
            for (int i12 = 0; i12 < this.data_.size(); i12++) {
                iComputeStringSize += h0.computeMessageSize(8, this.data_.get(i12));
            }
            for (int i13 = 0; i13 < this.extProto_.size(); i13++) {
                iComputeStringSize += h0.computeMessageSize(9, this.extProto_.get(i13));
            }
            if (this.ext_ != null) {
                iComputeStringSize += h0.computeMessageSize(10, getExt());
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
        public final gc getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public int getYob() {
            return this.yob_;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
        public boolean hasGeo() {
            return this.geo_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = getConsent().hashCode() + ((((getKeywords().hashCode() + ((((getGender().hashCode() + ((((getYob() + ((((getBuyeruid().hashCode() + ((((getId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53);
            if (hasGeo()) {
                iHashCode = o2.B(iHashCode, 37, 7, 53) + getGeo().hashCode();
            }
            if (getDataCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 8, 53) + getDataList().hashCode();
            }
            if (hasExt()) {
                iHashCode = o2.B(iHashCode, 37, 10, 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                iHashCode = o2.B(iHashCode, 37, 9, 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return b.D.ensureFieldAccessorsInitialized(User.class, Builder.class);
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
            return new User();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getIdBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.id_);
            }
            if (!getBuyeruidBytes().isEmpty()) {
                k7.writeString(h0Var, 2, this.buyeruid_);
            }
            int i10 = this.yob_;
            if (i10 != 0) {
                h0Var.writeUInt32(3, i10);
            }
            if (!getGenderBytes().isEmpty()) {
                k7.writeString(h0Var, 4, this.gender_);
            }
            if (!getKeywordsBytes().isEmpty()) {
                k7.writeString(h0Var, 5, this.keywords_);
            }
            if (!getConsentBytes().isEmpty()) {
                k7.writeString(h0Var, 6, this.consent_);
            }
            if (this.geo_ != null) {
                h0Var.writeMessage(7, getGeo());
            }
            for (int i11 = 0; i11 < this.data_.size(); i11++) {
                h0Var.writeMessage(8, this.data_.get(i11));
            }
            for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                h0Var.writeMessage(9, this.extProto_.get(i12));
            }
            if (this.ext_ != null) {
                h0Var.writeMessage(10, getExt());
            }
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements UserOrBuilder {
            private int bitField0_;
            private Object buyeruid_;
            private Object consent_;
            private pa dataBuilder_;
            private List<Data> data_;
            private xa extBuilder_;
            private pa extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object gender_;
            private xa geoBuilder_;
            private Geo geo_;
            private Object id_;
            private Object keywords_;
            private int yob_;

            private Builder() {
                super(null);
                this.id_ = "";
                this.buyeruid_ = "";
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                List list = Collections.EMPTY_LIST;
                this.data_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            private pa getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new pa(this.data_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.C;
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

            private xa getGeoFieldBuilder() {
                if (this.geoBuilder_ == null) {
                    this.geoBuilder_ = new xa(getGeo(), getParentForChildren(), isClean());
                    this.geo_ = null;
                }
                return this.geoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (k7.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllData(Iterable<? extends Data> iterable) {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.addAllMessages(iterable);
                    return this;
                }
                ensureDataIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.data_);
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

            public Builder addData(Data data) {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.addMessage(data);
                    return this;
                }
                data.getClass();
                ensureDataIsMutable();
                this.data_.add(data);
                onChanged();
                return this;
            }

            public Data.Builder addDataBuilder() {
                return (Data.Builder) getDataFieldBuilder().addBuilder(Data.getDefaultInstance());
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

            public Builder clearBuyeruid() {
                this.buyeruid_ = User.getDefaultInstance().getBuyeruid();
                onChanged();
                return this;
            }

            public Builder clearConsent() {
                this.consent_ = User.getDefaultInstance().getConsent();
                onChanged();
                return this;
            }

            public Builder clearData() {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.clear();
                    return this;
                }
                this.data_ = Collections.EMPTY_LIST;
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

            public Builder clearGender() {
                this.gender_ = User.getDefaultInstance().getGender();
                onChanged();
                return this;
            }

            public Builder clearGeo() {
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                    onChanged();
                    return this;
                }
                this.geo_ = null;
                this.geoBuilder_ = null;
                return this;
            }

            public Builder clearId() {
                this.id_ = User.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder clearKeywords() {
                this.keywords_ = User.getDefaultInstance().getKeywords();
                onChanged();
                return this;
            }

            public Builder clearYob() {
                this.yob_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getBuyeruid() {
                Object obj = this.buyeruid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.buyeruid_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getBuyeruidBytes() {
                Object obj = this.buyeruid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.buyeruid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getConsent() {
                Object obj = this.consent_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.consent_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getConsentBytes() {
                Object obj = this.consent_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.consent_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public Data getData(int i10) {
                pa paVar = this.dataBuilder_;
                return paVar == null ? this.data_.get(i10) : (Data) paVar.getMessage(i10);
            }

            public Data.Builder getDataBuilder(int i10) {
                return (Data.Builder) getDataFieldBuilder().getBuilder(i10);
            }

            public List<Data.Builder> getDataBuilderList() {
                return getDataFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public int getDataCount() {
                pa paVar = this.dataBuilder_;
                return paVar == null ? this.data_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<Data> getDataList() {
                pa paVar = this.dataBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.data_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public DataOrBuilder getDataOrBuilder(int i10) {
                pa paVar = this.dataBuilder_;
                return paVar == null ? this.data_.get(i10) : (DataOrBuilder) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<? extends DataOrBuilder> getDataOrBuilderList() {
                pa paVar = this.dataBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.data_);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.C;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public jb getExtOrBuilder() {
                xa xaVar = this.extBuilder_;
                if (xaVar != null) {
                    return (jb) xaVar.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
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

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public int getExtProtoCount() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.size() : paVar.getCount();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<Any> getExtProtoList() {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
                pa paVar = this.extProtoBuilder_;
                return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
                pa paVar = this.extProtoBuilder_;
                return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getGender() {
                Object obj = this.gender_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.gender_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getGenderBytes() {
                Object obj = this.gender_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gender_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public Geo getGeo() {
                xa xaVar = this.geoBuilder_;
                if (xaVar != null) {
                    return (Geo) xaVar.getMessage();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            public Geo.Builder getGeoBuilder() {
                onChanged();
                return (Geo.Builder) getGeoFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public GeoOrBuilder getGeoOrBuilder() {
                xa xaVar = this.geoBuilder_;
                if (xaVar != null) {
                    return (GeoOrBuilder) xaVar.getMessageOrBuilder();
                }
                Geo geo = this.geo_;
                return geo == null ? Geo.getDefaultInstance() : geo;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public String getKeywords() {
                Object obj = this.keywords_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keywords_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public ByteString getKeywordsBytes() {
                Object obj = this.keywords_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keywords_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public int getYob() {
                return this.yob_;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Context.UserOrBuilder
            public boolean hasGeo() {
                return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return b.D.ensureFieldAccessorsInitialized(User.class, Builder.class);
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

            public Builder mergeGeo(Geo geo) {
                xa xaVar = this.geoBuilder_;
                if (xaVar != null) {
                    xaVar.mergeFrom(geo);
                    return this;
                }
                Geo geo2 = this.geo_;
                if (geo2 != null) {
                    this.geo_ = Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
                } else {
                    this.geo_ = geo;
                }
                onChanged();
                return this;
            }

            public Builder removeData(int i10) {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.remove(i10);
                    return this;
                }
                ensureDataIsMutable();
                this.data_.remove(i10);
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

            public Builder setBuyeruid(String str) {
                str.getClass();
                this.buyeruid_ = str;
                onChanged();
                return this;
            }

            public Builder setBuyeruidBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.buyeruid_ = byteString;
                onChanged();
                return this;
            }

            public Builder setConsent(String str) {
                str.getClass();
                this.consent_ = str;
                onChanged();
                return this;
            }

            public Builder setConsentBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.consent_ = byteString;
                onChanged();
                return this;
            }

            public Builder setData(int i10, Data data) {
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    paVar.setMessage(i10, data);
                    return this;
                }
                data.getClass();
                ensureDataIsMutable();
                this.data_.set(i10, data);
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

            public Builder setGender(String str) {
                str.getClass();
                this.gender_ = str;
                onChanged();
                return this;
            }

            public Builder setGenderBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.gender_ = byteString;
                onChanged();
                return this;
            }

            public Builder setGeo(Geo geo) {
                xa xaVar = this.geoBuilder_;
                if (xaVar != null) {
                    xaVar.setMessage(geo);
                    return this;
                }
                geo.getClass();
                this.geo_ = geo;
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

            public Builder setKeywords(String str) {
                str.getClass();
                this.keywords_ = str;
                onChanged();
                return this;
            }

            public Builder setKeywordsBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.keywords_ = byteString;
                onChanged();
                return this;
            }

            public Builder setYob(int i10) {
                this.yob_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public User build() {
                User userBuildPartial = buildPartial();
                if (userBuildPartial.isInitialized()) {
                    return userBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public User buildPartial() {
                User user = new User(this);
                user.id_ = this.id_;
                user.buyeruid_ = this.buyeruid_;
                user.yob_ = this.yob_;
                user.gender_ = this.gender_;
                user.keywords_ = this.keywords_;
                user.consent_ = this.consent_;
                xa xaVar = this.geoBuilder_;
                if (xaVar == null) {
                    user.geo_ = this.geo_;
                } else {
                    user.geo_ = (Geo) xaVar.build();
                }
                pa paVar = this.dataBuilder_;
                if (paVar != null) {
                    user.data_ = paVar.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    user.data_ = this.data_;
                }
                xa xaVar2 = this.extBuilder_;
                if (xaVar2 == null) {
                    user.ext_ = this.ext_;
                } else {
                    user.ext_ = (Struct) xaVar2.build();
                }
                pa paVar2 = this.extProtoBuilder_;
                if (paVar2 != null) {
                    user.extProto_ = paVar2.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    user.extProto_ = this.extProto_;
                }
                onBuilt();
                return user;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public User getDefaultInstanceForType() {
                return User.getDefaultInstance();
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

            public Data.Builder addDataBuilder(int i10) {
                return (Data.Builder) getDataFieldBuilder().addBuilder(i10, Data.getDefaultInstance());
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
                this.buyeruid_ = "";
                this.yob_ = 0;
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                if (this.geoBuilder_ == null) {
                    this.geo_ = null;
                } else {
                    this.geo_ = null;
                    this.geoBuilder_ = null;
                }
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    this.data_ = Collections.EMPTY_LIST;
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

            public Builder setGeo(Geo.Builder builder) {
                xa xaVar = this.geoBuilder_;
                if (xaVar == null) {
                    this.geo_ = builder.build();
                    onChanged();
                    return this;
                }
                xaVar.setMessage(builder.build());
                return this;
            }

            public Builder addData(int i10, Data data) {
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    data.getClass();
                    ensureDataIsMutable();
                    this.data_.add(i10, data);
                    onChanged();
                    return this;
                }
                paVar.addMessage(i10, data);
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
                if (message instanceof User) {
                    return mergeFrom((User) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setData(int i10, Data.Builder builder) {
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    ensureDataIsMutable();
                    this.data_.set(i10, builder.build());
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

            public Builder mergeFrom(User user) {
                if (user == User.getDefaultInstance()) {
                    return this;
                }
                if (!user.getId().isEmpty()) {
                    this.id_ = user.id_;
                    onChanged();
                }
                if (!user.getBuyeruid().isEmpty()) {
                    this.buyeruid_ = user.buyeruid_;
                    onChanged();
                }
                if (user.getYob() != 0) {
                    setYob(user.getYob());
                }
                if (!user.getGender().isEmpty()) {
                    this.gender_ = user.gender_;
                    onChanged();
                }
                if (!user.getKeywords().isEmpty()) {
                    this.keywords_ = user.keywords_;
                    onChanged();
                }
                if (!user.getConsent().isEmpty()) {
                    this.consent_ = user.consent_;
                    onChanged();
                }
                if (user.hasGeo()) {
                    mergeGeo(user.getGeo());
                }
                if (this.dataBuilder_ == null) {
                    if (!user.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = user.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(user.data_);
                        }
                        onChanged();
                    }
                } else if (!user.data_.isEmpty()) {
                    if (!this.dataBuilder_.isEmpty()) {
                        this.dataBuilder_.addAllMessages(user.data_);
                    } else {
                        this.dataBuilder_.dispose();
                        this.dataBuilder_ = null;
                        this.data_ = user.data_;
                        this.bitField0_ &= -2;
                        this.dataBuilder_ = k7.alwaysUseFieldBuilders ? getDataFieldBuilder() : null;
                    }
                }
                if (user.hasExt()) {
                    mergeExt(user.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!user.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = user.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(user.extProto_);
                        }
                        onChanged();
                    }
                } else if (!user.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.addAllMessages(user.extProto_);
                    } else {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = user.extProto_;
                        this.bitField0_ &= -3;
                        this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((k7) user).unknownFields);
                onChanged();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.id_ = "";
                this.buyeruid_ = "";
                this.gender_ = "";
                this.keywords_ = "";
                this.consent_ = "";
                List list = Collections.EMPTY_LIST;
                this.data_ = list;
                this.extProto_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addData(Data.Builder builder) {
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
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

            public Builder addData(int i10, Data.Builder builder) {
                pa paVar = this.dataBuilder_;
                if (paVar == null) {
                    ensureDataIsMutable();
                    this.data_.add(i10, builder.build());
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
            public com.explorestack.protobuf.adcom.Context.User.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.User.access$32300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    com.explorestack.protobuf.adcom.Context$User r3 = (com.explorestack.protobuf.adcom.Context.User) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    com.explorestack.protobuf.adcom.Context$User r4 = (com.explorestack.protobuf.adcom.Context.User) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.User.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$User$Builder");
            }
        }

        public static Builder newBuilder(User user) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(user);
        }

        public static User parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private User(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static User parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (User) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static User parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public User getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static User parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private User() {
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.buyeruid_ = "";
            this.gender_ = "";
            this.keywords_ = "";
            this.consent_ = "";
            List list = Collections.EMPTY_LIST;
            this.data_ = list;
            this.extProto_ = list;
        }

        public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static User parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (User) PARSER.parseFrom(bArr, m5Var);
        }

        public static User parseFrom(InputStream inputStream) throws IOException {
            return (User) k7.parseWithIOException(PARSER, inputStream);
        }

        public static User parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (User) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static User parseFrom(y yVar) throws IOException {
            return (User) k7.parseWithIOException(PARSER, yVar);
        }

        public static User parseFrom(y yVar, m5 m5Var) throws IOException {
            return (User) k7.parseWithIOException(PARSER, yVar, m5Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v5 */
        private User(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.buyeruid_ = yVar.readStringRequireUtf8();
                            case 24:
                                this.yob_ = yVar.readUInt32();
                            case 34:
                                this.gender_ = yVar.readStringRequireUtf8();
                            case 42:
                                this.keywords_ = yVar.readStringRequireUtf8();
                            case 50:
                                this.consent_ = yVar.readStringRequireUtf8();
                            case 58:
                                Geo geo = this.geo_;
                                Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                                Geo geo2 = (Geo) yVar.readMessage(Geo.parser(), m5Var);
                                this.geo_ = geo2;
                                if (builder != null) {
                                    builder.mergeFrom(geo2);
                                    this.geo_ = builder.buildPartial();
                                }
                            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                int i10 = (c10 == true ? 1 : 0) & 1;
                                c10 = c10;
                                if (i10 == 0) {
                                    this.data_ = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 1;
                                }
                                this.data_.add(yVar.readMessage(Data.parser(), m5Var));
                            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                int i11 = (c10 == true ? 1 : 0) & 2;
                                c10 = c10;
                                if (i11 == 0) {
                                    this.extProto_ = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 2;
                                }
                                this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                            case 82:
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
                        this.data_ = Collections.unmodifiableList(this.data_);
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
                this.data_ = Collections.unmodifiableList(this.data_);
            }
            if (((c10 == true ? 1 : 0) & 2) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface UserOrBuilder extends MessageOrBuilder {
        String getBuyeruid();

        ByteString getBuyeruidBytes();

        String getConsent();

        ByteString getConsentBytes();

        Data getData(int i10);

        int getDataCount();

        List<Data> getDataList();

        DataOrBuilder getDataOrBuilder(int i10);

        List<? extends DataOrBuilder> getDataOrBuilderList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        Struct getExt();

        jb getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        com.explorestack.protobuf.g getExtProtoOrBuilder(int i10);

        List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList();

        String getGender();

        ByteString getGenderBytes();

        Geo getGeo();

        GeoOrBuilder getGeoOrBuilder();

        String getId();

        ByteString getIdBytes();

        String getKeywords();

        ByteString getKeywordsBytes();

        int getYob();

        boolean hasExt();

        boolean hasGeo();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.f21858a;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Context) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Context)) {
            return super.equals(obj);
        }
        Context context = (Context) obj;
        if (hasApp() != context.hasApp()) {
            return false;
        }
        if ((hasApp() && !getApp().equals(context.getApp())) || hasDevice() != context.hasDevice()) {
            return false;
        }
        if ((hasDevice() && !getDevice().equals(context.getDevice())) || hasRegs() != context.hasRegs()) {
            return false;
        }
        if ((hasRegs() && !getRegs().equals(context.getRegs())) || hasRestrictions() != context.hasRestrictions()) {
            return false;
        }
        if ((hasRestrictions() && !getRestrictions().equals(context.getRestrictions())) || hasUser() != context.hasUser()) {
            return false;
        }
        if ((!hasUser() || getUser().equals(context.getUser())) && hasExt() == context.hasExt()) {
            return (!hasExt() || getExt().equals(context.getExt())) && getExtProtoList().equals(context.getExtProtoList()) && this.unknownFields.equals(context.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public AppOrBuilder getAppOrBuilder() {
        return getApp();
    }

    @Override // com.explorestack.protobuf.adcom.h
    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public DeviceOrBuilder getDeviceOrBuilder() {
        return getDevice();
    }

    @Override // com.explorestack.protobuf.adcom.h
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public jb getExtOrBuilder() {
        return getExt();
    }

    @Override // com.explorestack.protobuf.adcom.h
    public Any getExtProto(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.h
    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    @Override // com.explorestack.protobuf.adcom.h
    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
        return this.extProto_.get(i10);
    }

    @Override // com.explorestack.protobuf.adcom.h
    public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public Regs getRegs() {
        Regs regs = this.regs_;
        return regs == null ? Regs.getDefaultInstance() : regs;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public RegsOrBuilder getRegsOrBuilder() {
        return getRegs();
    }

    @Override // com.explorestack.protobuf.adcom.h
    public Restrictions getRestrictions() {
        Restrictions restrictions = this.restrictions_;
        return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public RestrictionsOrBuilder getRestrictionsOrBuilder() {
        return getRestrictions();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = this.app_ != null ? h0.computeMessageSize(1, getApp()) : 0;
        if (this.device_ != null) {
            iComputeMessageSize += h0.computeMessageSize(2, getDevice());
        }
        if (this.regs_ != null) {
            iComputeMessageSize += h0.computeMessageSize(3, getRegs());
        }
        if (this.restrictions_ != null) {
            iComputeMessageSize += h0.computeMessageSize(4, getRestrictions());
        }
        if (this.user_ != null) {
            iComputeMessageSize += h0.computeMessageSize(5, getUser());
        }
        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
            iComputeMessageSize += h0.computeMessageSize(6, this.extProto_.get(i11));
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

    @Override // com.explorestack.protobuf.adcom.h
    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public UserOrBuilder getUserOrBuilder() {
        return getUser();
    }

    @Override // com.explorestack.protobuf.adcom.h
    public boolean hasApp() {
        return this.app_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public boolean hasDevice() {
        return this.device_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public boolean hasRegs() {
        return this.regs_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public boolean hasRestrictions() {
        return this.restrictions_ != null;
    }

    @Override // com.explorestack.protobuf.adcom.h
    public boolean hasUser() {
        return this.user_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasApp()) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getApp().hashCode();
        }
        if (hasDevice()) {
            iHashCode = o2.B(iHashCode, 37, 2, 53) + getDevice().hashCode();
        }
        if (hasRegs()) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + getRegs().hashCode();
        }
        if (hasRestrictions()) {
            iHashCode = o2.B(iHashCode, 37, 4, 53) + getRestrictions().hashCode();
        }
        if (hasUser()) {
            iHashCode = o2.B(iHashCode, 37, 5, 53) + getUser().hashCode();
        }
        if (hasExt()) {
            iHashCode = o2.B(iHashCode, 37, 7, 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 6, 53) + getExtProtoList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return b.f21860b.ensureFieldAccessorsInitialized(Context.class, Builder.class);
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
        return new Context();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.app_ != null) {
            h0Var.writeMessage(1, getApp());
        }
        if (this.device_ != null) {
            h0Var.writeMessage(2, getDevice());
        }
        if (this.regs_ != null) {
            h0Var.writeMessage(3, getRegs());
        }
        if (this.restrictions_ != null) {
            h0Var.writeMessage(4, getRestrictions());
        }
        if (this.user_ != null) {
            h0Var.writeMessage(5, getUser());
        }
        for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
            h0Var.writeMessage(6, this.extProto_.get(i10));
        }
        if (this.ext_ != null) {
            h0Var.writeMessage(7, getExt());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements h {
        private xa appBuilder_;
        private App app_;
        private int bitField0_;
        private xa deviceBuilder_;
        private Device device_;
        private xa extBuilder_;
        private pa extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private xa regsBuilder_;
        private Regs regs_;
        private xa restrictionsBuilder_;
        private Restrictions restrictions_;
        private xa userBuilder_;
        private User user_;

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

        private xa getAppFieldBuilder() {
            if (this.appBuilder_ == null) {
                this.appBuilder_ = new xa(getApp(), getParentForChildren(), isClean());
                this.app_ = null;
            }
            return this.appBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.f21858a;
        }

        private xa getDeviceFieldBuilder() {
            if (this.deviceBuilder_ == null) {
                this.deviceBuilder_ = new xa(getDevice(), getParentForChildren(), isClean());
                this.device_ = null;
            }
            return this.deviceBuilder_;
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

        private xa getRegsFieldBuilder() {
            if (this.regsBuilder_ == null) {
                this.regsBuilder_ = new xa(getRegs(), getParentForChildren(), isClean());
                this.regs_ = null;
            }
            return this.regsBuilder_;
        }

        private xa getRestrictionsFieldBuilder() {
            if (this.restrictionsBuilder_ == null) {
                this.restrictionsBuilder_ = new xa(getRestrictions(), getParentForChildren(), isClean());
                this.restrictions_ = null;
            }
            return this.restrictionsBuilder_;
        }

        private xa getUserFieldBuilder() {
            if (this.userBuilder_ == null) {
                this.userBuilder_ = new xa(getUser(), getParentForChildren(), isClean());
                this.user_ = null;
            }
            return this.userBuilder_;
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

        public Builder clearApp() {
            if (this.appBuilder_ == null) {
                this.app_ = null;
                onChanged();
                return this;
            }
            this.app_ = null;
            this.appBuilder_ = null;
            return this;
        }

        public Builder clearDevice() {
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
                onChanged();
                return this;
            }
            this.device_ = null;
            this.deviceBuilder_ = null;
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

        public Builder clearRegs() {
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
                onChanged();
                return this;
            }
            this.regs_ = null;
            this.regsBuilder_ = null;
            return this;
        }

        public Builder clearRestrictions() {
            if (this.restrictionsBuilder_ == null) {
                this.restrictions_ = null;
                onChanged();
                return this;
            }
            this.restrictions_ = null;
            this.restrictionsBuilder_ = null;
            return this;
        }

        public Builder clearUser() {
            if (this.userBuilder_ == null) {
                this.user_ = null;
                onChanged();
                return this;
            }
            this.user_ = null;
            this.userBuilder_ = null;
            return this;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public App getApp() {
            xa xaVar = this.appBuilder_;
            if (xaVar != null) {
                return (App) xaVar.getMessage();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        public App.Builder getAppBuilder() {
            onChanged();
            return (App.Builder) getAppFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.h
        public AppOrBuilder getAppOrBuilder() {
            xa xaVar = this.appBuilder_;
            if (xaVar != null) {
                return (AppOrBuilder) xaVar.getMessageOrBuilder();
            }
            App app = this.app_;
            return app == null ? App.getDefaultInstance() : app;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.f21858a;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public Device getDevice() {
            xa xaVar = this.deviceBuilder_;
            if (xaVar != null) {
                return (Device) xaVar.getMessage();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        public Device.Builder getDeviceBuilder() {
            onChanged();
            return (Device.Builder) getDeviceFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.h
        public DeviceOrBuilder getDeviceOrBuilder() {
            xa xaVar = this.deviceBuilder_;
            if (xaVar != null) {
                return (DeviceOrBuilder) xaVar.getMessageOrBuilder();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // com.explorestack.protobuf.adcom.h
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

        @Override // com.explorestack.protobuf.adcom.h
        public jb getExtOrBuilder() {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.h
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

        @Override // com.explorestack.protobuf.adcom.h
        public int getExtProtoCount() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.size() : paVar.getCount();
        }

        @Override // com.explorestack.protobuf.adcom.h
        public List<Any> getExtProtoList() {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.extProto_) : paVar.getMessageList();
        }

        @Override // com.explorestack.protobuf.adcom.h
        public com.explorestack.protobuf.g getExtProtoOrBuilder(int i10) {
            pa paVar = this.extProtoBuilder_;
            return paVar == null ? this.extProto_.get(i10) : (com.explorestack.protobuf.g) paVar.getMessageOrBuilder(i10);
        }

        @Override // com.explorestack.protobuf.adcom.h
        public List<? extends com.explorestack.protobuf.g> getExtProtoOrBuilderList() {
            pa paVar = this.extProtoBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.extProto_);
        }

        @Override // com.explorestack.protobuf.adcom.h
        public Regs getRegs() {
            xa xaVar = this.regsBuilder_;
            if (xaVar != null) {
                return (Regs) xaVar.getMessage();
            }
            Regs regs = this.regs_;
            return regs == null ? Regs.getDefaultInstance() : regs;
        }

        public Regs.Builder getRegsBuilder() {
            onChanged();
            return (Regs.Builder) getRegsFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.h
        public RegsOrBuilder getRegsOrBuilder() {
            xa xaVar = this.regsBuilder_;
            if (xaVar != null) {
                return (RegsOrBuilder) xaVar.getMessageOrBuilder();
            }
            Regs regs = this.regs_;
            return regs == null ? Regs.getDefaultInstance() : regs;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public Restrictions getRestrictions() {
            xa xaVar = this.restrictionsBuilder_;
            if (xaVar != null) {
                return (Restrictions) xaVar.getMessage();
            }
            Restrictions restrictions = this.restrictions_;
            return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
        }

        public Restrictions.Builder getRestrictionsBuilder() {
            onChanged();
            return (Restrictions.Builder) getRestrictionsFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.h
        public RestrictionsOrBuilder getRestrictionsOrBuilder() {
            xa xaVar = this.restrictionsBuilder_;
            if (xaVar != null) {
                return (RestrictionsOrBuilder) xaVar.getMessageOrBuilder();
            }
            Restrictions restrictions = this.restrictions_;
            return restrictions == null ? Restrictions.getDefaultInstance() : restrictions;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public User getUser() {
            xa xaVar = this.userBuilder_;
            if (xaVar != null) {
                return (User) xaVar.getMessage();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        public User.Builder getUserBuilder() {
            onChanged();
            return (User.Builder) getUserFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.adcom.h
        public UserOrBuilder getUserOrBuilder() {
            xa xaVar = this.userBuilder_;
            if (xaVar != null) {
                return (UserOrBuilder) xaVar.getMessageOrBuilder();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public boolean hasApp() {
            return (this.appBuilder_ == null && this.app_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public boolean hasDevice() {
            return (this.deviceBuilder_ == null && this.device_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public boolean hasRegs() {
            return (this.regsBuilder_ == null && this.regs_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public boolean hasRestrictions() {
            return (this.restrictionsBuilder_ == null && this.restrictions_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.adcom.h
        public boolean hasUser() {
            return (this.userBuilder_ == null && this.user_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return b.f21860b.ensureFieldAccessorsInitialized(Context.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeApp(App app) {
            xa xaVar = this.appBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(app);
                return this;
            }
            App app2 = this.app_;
            if (app2 != null) {
                this.app_ = App.newBuilder(app2).mergeFrom(app).buildPartial();
            } else {
                this.app_ = app;
            }
            onChanged();
            return this;
        }

        public Builder mergeDevice(Device device) {
            xa xaVar = this.deviceBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(device);
                return this;
            }
            Device device2 = this.device_;
            if (device2 != null) {
                this.device_ = Device.newBuilder(device2).mergeFrom(device).buildPartial();
            } else {
                this.device_ = device;
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

        public Builder mergeRegs(Regs regs) {
            xa xaVar = this.regsBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(regs);
                return this;
            }
            Regs regs2 = this.regs_;
            if (regs2 != null) {
                this.regs_ = Regs.newBuilder(regs2).mergeFrom(regs).buildPartial();
            } else {
                this.regs_ = regs;
            }
            onChanged();
            return this;
        }

        public Builder mergeRestrictions(Restrictions restrictions) {
            xa xaVar = this.restrictionsBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(restrictions);
                return this;
            }
            Restrictions restrictions2 = this.restrictions_;
            if (restrictions2 != null) {
                this.restrictions_ = Restrictions.newBuilder(restrictions2).mergeFrom(restrictions).buildPartial();
            } else {
                this.restrictions_ = restrictions;
            }
            onChanged();
            return this;
        }

        public Builder mergeUser(User user) {
            xa xaVar = this.userBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(user);
                return this;
            }
            User user2 = this.user_;
            if (user2 != null) {
                this.user_ = User.newBuilder(user2).mergeFrom(user).buildPartial();
            } else {
                this.user_ = user;
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

        public Builder setApp(App app) {
            xa xaVar = this.appBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(app);
                return this;
            }
            app.getClass();
            this.app_ = app;
            onChanged();
            return this;
        }

        public Builder setDevice(Device device) {
            xa xaVar = this.deviceBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(device);
                return this;
            }
            device.getClass();
            this.device_ = device;
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

        public Builder setRegs(Regs regs) {
            xa xaVar = this.regsBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(regs);
                return this;
            }
            regs.getClass();
            this.regs_ = regs;
            onChanged();
            return this;
        }

        public Builder setRestrictions(Restrictions restrictions) {
            xa xaVar = this.restrictionsBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(restrictions);
                return this;
            }
            restrictions.getClass();
            this.restrictions_ = restrictions;
            onChanged();
            return this;
        }

        public Builder setUser(User user) {
            xa xaVar = this.userBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(user);
                return this;
            }
            user.getClass();
            this.user_ = user;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Context build() {
            Context contextBuildPartial = buildPartial();
            if (contextBuildPartial.isInitialized()) {
                return contextBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) contextBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Context buildPartial() {
            Context context = new Context(this);
            xa xaVar = this.appBuilder_;
            if (xaVar == null) {
                context.app_ = this.app_;
            } else {
                context.app_ = (App) xaVar.build();
            }
            xa xaVar2 = this.deviceBuilder_;
            if (xaVar2 == null) {
                context.device_ = this.device_;
            } else {
                context.device_ = (Device) xaVar2.build();
            }
            xa xaVar3 = this.regsBuilder_;
            if (xaVar3 == null) {
                context.regs_ = this.regs_;
            } else {
                context.regs_ = (Regs) xaVar3.build();
            }
            xa xaVar4 = this.restrictionsBuilder_;
            if (xaVar4 == null) {
                context.restrictions_ = this.restrictions_;
            } else {
                context.restrictions_ = (Restrictions) xaVar4.build();
            }
            xa xaVar5 = this.userBuilder_;
            if (xaVar5 == null) {
                context.user_ = this.user_;
            } else {
                context.user_ = (User) xaVar5.build();
            }
            xa xaVar6 = this.extBuilder_;
            if (xaVar6 == null) {
                context.ext_ = this.ext_;
            } else {
                context.ext_ = (Struct) xaVar6.build();
            }
            pa paVar = this.extProtoBuilder_;
            if (paVar != null) {
                context.extProto_ = paVar.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -2;
                }
                context.extProto_ = this.extProto_;
            }
            onBuilt();
            return context;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Context getDefaultInstanceForType() {
            return Context.getDefaultInstance();
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
            if (this.appBuilder_ == null) {
                this.app_ = null;
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            if (this.regsBuilder_ == null) {
                this.regs_ = null;
            } else {
                this.regs_ = null;
                this.regsBuilder_ = null;
            }
            if (this.restrictionsBuilder_ == null) {
                this.restrictions_ = null;
            } else {
                this.restrictions_ = null;
                this.restrictionsBuilder_ = null;
            }
            if (this.userBuilder_ == null) {
                this.user_ = null;
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
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

        public Builder setApp(App.Builder builder) {
            xa xaVar = this.appBuilder_;
            if (xaVar == null) {
                this.app_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setDevice(Device.Builder builder) {
            xa xaVar = this.deviceBuilder_;
            if (xaVar == null) {
                this.device_ = builder.build();
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

        public Builder setRegs(Regs.Builder builder) {
            xa xaVar = this.regsBuilder_;
            if (xaVar == null) {
                this.regs_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setRestrictions(Restrictions.Builder builder) {
            xa xaVar = this.restrictionsBuilder_;
            if (xaVar == null) {
                this.restrictions_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setUser(User.Builder builder) {
            xa xaVar = this.userBuilder_;
            if (xaVar == null) {
                this.user_ = builder.build();
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
            if (message instanceof Context) {
                return mergeFrom((Context) message);
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

        public Builder mergeFrom(Context context) {
            if (context == Context.getDefaultInstance()) {
                return this;
            }
            if (context.hasApp()) {
                mergeApp(context.getApp());
            }
            if (context.hasDevice()) {
                mergeDevice(context.getDevice());
            }
            if (context.hasRegs()) {
                mergeRegs(context.getRegs());
            }
            if (context.hasRestrictions()) {
                mergeRestrictions(context.getRestrictions());
            }
            if (context.hasUser()) {
                mergeUser(context.getUser());
            }
            if (context.hasExt()) {
                mergeExt(context.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!context.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = context.extProto_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(context.extProto_);
                    }
                    onChanged();
                }
            } else if (!context.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.addAllMessages(context.extProto_);
                } else {
                    this.extProtoBuilder_.dispose();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = context.extProto_;
                    this.bitField0_ &= -2;
                    this.extProtoBuilder_ = k7.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) context).unknownFields);
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
        public com.explorestack.protobuf.adcom.Context.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.adcom.Context.access$34300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.adcom.Context r3 = (com.explorestack.protobuf.adcom.Context) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.adcom.Context r4 = (com.explorestack.protobuf.adcom.Context) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Context.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.adcom.Context$Builder");
        }
    }

    public static Builder newBuilder(Context context) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(context);
    }

    public static Context parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Context(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Context parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Context) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Context getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Context parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Context() {
        this.memoizedIsInitialized = (byte) -1;
        this.extProto_ = Collections.EMPTY_LIST;
    }

    public static Context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static Context parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Context) PARSER.parseFrom(bArr, m5Var);
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context) k7.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Context(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            App app = this.app_;
                            App.Builder builder = app != null ? app.toBuilder() : null;
                            App app2 = (App) yVar.readMessage(App.parser(), m5Var);
                            this.app_ = app2;
                            if (builder != null) {
                                builder.mergeFrom(app2);
                                this.app_ = builder.buildPartial();
                            }
                        } else if (tag == 18) {
                            Device device = this.device_;
                            Device.Builder builder2 = device != null ? device.toBuilder() : null;
                            Device device2 = (Device) yVar.readMessage(Device.parser(), m5Var);
                            this.device_ = device2;
                            if (builder2 != null) {
                                builder2.mergeFrom(device2);
                                this.device_ = builder2.buildPartial();
                            }
                        } else if (tag == 26) {
                            Regs regs = this.regs_;
                            Regs.Builder builder3 = regs != null ? regs.toBuilder() : null;
                            Regs regs2 = (Regs) yVar.readMessage(Regs.parser(), m5Var);
                            this.regs_ = regs2;
                            if (builder3 != null) {
                                builder3.mergeFrom(regs2);
                                this.regs_ = builder3.buildPartial();
                            }
                        } else if (tag == 34) {
                            Restrictions restrictions = this.restrictions_;
                            Restrictions.Builder builder4 = restrictions != null ? restrictions.toBuilder() : null;
                            Restrictions restrictions2 = (Restrictions) yVar.readMessage(Restrictions.parser(), m5Var);
                            this.restrictions_ = restrictions2;
                            if (builder4 != null) {
                                builder4.mergeFrom(restrictions2);
                                this.restrictions_ = builder4.buildPartial();
                            }
                        } else if (tag == 42) {
                            User user = this.user_;
                            User.Builder builder5 = user != null ? user.toBuilder() : null;
                            User user2 = (User) yVar.readMessage(User.parser(), m5Var);
                            this.user_ = user2;
                            if (builder5 != null) {
                                builder5.mergeFrom(user2);
                                this.user_ = builder5.buildPartial();
                            }
                        } else if (tag == 50) {
                            if (objArr == false) {
                                this.extProto_ = new ArrayList();
                                objArr = true;
                            }
                            this.extProto_.add(yVar.readMessage(Any.parser(), m5Var));
                        } else if (tag != 58) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            Struct struct = this.ext_;
                            Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                            this.ext_ = struct2;
                            if (builder6 != null) {
                                builder6.mergeFrom(struct2);
                                this.ext_ = builder6.buildPartial();
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

    public static Context parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Context) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Context parseFrom(y yVar) throws IOException {
        return (Context) k7.parseWithIOException(PARSER, yVar);
    }

    public static Context parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Context) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
