package io.bidmachine.protobuf;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.DeviceType;
import com.explorestack.protobuf.adcom.OS;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
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
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SdkAnalyticContext extends k7 implements SdkAnalyticContextOrBuilder {
    public static final int APP_VER_FIELD_NUMBER = 13;
    public static final int BM_IFV_FIELD_NUMBER = 12;
    public static final int BUNDLE_FIELD_NUMBER = 2;
    public static final int CONTYPE_FIELD_NUMBER = 10;
    public static final int DCID_FIELD_NUMBER = 15;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 9;
    public static final int EXPERIMENTS_FIELD_NUMBER = 17;
    public static final int EXT_FIELD_NUMBER = 16;
    public static final int GEO_FIELD_NUMBER = 5;
    public static final int HWV_FIELD_NUMBER = 20;
    public static final int IFA_FIELD_NUMBER = 8;
    public static final int IFV_FIELD_NUMBER = 11;
    public static final int MAKE_FIELD_NUMBER = 18;
    public static final int MODEL_FIELD_NUMBER = 19;
    public static final int OSV_FIELD_NUMBER = 4;
    public static final int OS_FIELD_NUMBER = 3;
    public static final int SDKVER_FIELD_NUMBER = 7;
    public static final int SDK_FIELD_NUMBER = 6;
    public static final int SESSION_ID_FIELD_NUMBER = 14;
    public static final int SOURCE_ID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object appVer_;
    private volatile Object bmIfv_;
    private volatile Object bundle_;
    private int contype_;
    private volatile Object dcid_;
    private int deviceType_;
    private g8 experiments_;
    private Struct ext_;
    private Context.Geo geo_;
    private volatile Object hwv_;
    private volatile Object ifa_;
    private volatile Object ifv_;
    private volatile Object make_;
    private byte memoizedIsInitialized;
    private volatile Object model_;
    private int os_;
    private volatile Object osv_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private volatile Object sessionId_;
    private volatile Object sourceId_;
    private static final SdkAnalyticContext DEFAULT_INSTANCE = new SdkAnalyticContext();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.SdkAnalyticContext.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public SdkAnalyticContext parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new SdkAnalyticContext(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements SdkAnalyticContextOrBuilder {
        private Object appVer_;
        private int bitField0_;
        private Object bmIfv_;
        private Object bundle_;
        private int contype_;
        private Object dcid_;
        private int deviceType_;
        private g8 experiments_;
        private xa extBuilder_;
        private Struct ext_;
        private xa geoBuilder_;
        private Context.Geo geo_;
        private Object hwv_;
        private Object ifa_;
        private Object ifv_;
        private Object make_;
        private Object model_;
        private int os_;
        private Object osv_;
        private Object sdk_;
        private Object sdkver_;
        private Object sessionId_;
        private Object sourceId_;

        private Builder() {
            super(null);
            this.sourceId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.dcid_ = "";
            this.experiments_ = f8.f22138e;
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        private void ensureExperimentsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.experiments_ = new f8(this.experiments_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
        }

        private xa getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new xa(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private xa getGeoFieldBuilder() {
            if (this.geoBuilder_ == null) {
                this.geoBuilder_ = new xa(getGeo(), getParentForChildren(), isClean());
                this.geo_ = null;
            }
            return this.geoBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder addAllExperiments(Iterable<String> iterable) {
            ensureExperimentsIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.experiments_);
            onChanged();
            return this;
        }

        public Builder addExperiments(String str) {
            str.getClass();
            ensureExperimentsIsMutable();
            this.experiments_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addExperimentsBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            ensureExperimentsIsMutable();
            this.experiments_.add(byteString);
            onChanged();
            return this;
        }

        public Builder clearAppVer() {
            this.appVer_ = SdkAnalyticContext.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder clearBmIfv() {
            this.bmIfv_ = SdkAnalyticContext.getDefaultInstance().getBmIfv();
            onChanged();
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = SdkAnalyticContext.getDefaultInstance().getBundle();
            onChanged();
            return this;
        }

        public Builder clearContype() {
            this.contype_ = 0;
            onChanged();
            return this;
        }

        public Builder clearDcid() {
            this.dcid_ = SdkAnalyticContext.getDefaultInstance().getDcid();
            onChanged();
            return this;
        }

        public Builder clearDeviceType() {
            this.deviceType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearExperiments() {
            this.experiments_ = f8.f22138e;
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

        public Builder clearHwv() {
            this.hwv_ = SdkAnalyticContext.getDefaultInstance().getHwv();
            onChanged();
            return this;
        }

        public Builder clearIfa() {
            this.ifa_ = SdkAnalyticContext.getDefaultInstance().getIfa();
            onChanged();
            return this;
        }

        public Builder clearIfv() {
            this.ifv_ = SdkAnalyticContext.getDefaultInstance().getIfv();
            onChanged();
            return this;
        }

        public Builder clearMake() {
            this.make_ = SdkAnalyticContext.getDefaultInstance().getMake();
            onChanged();
            return this;
        }

        public Builder clearModel() {
            this.model_ = SdkAnalyticContext.getDefaultInstance().getModel();
            onChanged();
            return this;
        }

        public Builder clearOs() {
            this.os_ = 0;
            onChanged();
            return this;
        }

        public Builder clearOsv() {
            this.osv_ = SdkAnalyticContext.getDefaultInstance().getOsv();
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = SdkAnalyticContext.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = SdkAnalyticContext.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder clearSessionId() {
            this.sessionId_ = SdkAnalyticContext.getDefaultInstance().getSessionId();
            onChanged();
            return this;
        }

        public Builder clearSourceId() {
            this.sourceId_ = SdkAnalyticContext.getDefaultInstance().getSourceId();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getAppVer() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVer_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getBmIfv() {
            Object obj = this.bmIfv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bmIfv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getBmIfvBytes() {
            Object obj = this.bmIfv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bmIfv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getBundle() {
            Object obj = this.bundle_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bundle_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getBundleBytes() {
            Object obj = this.bundle_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bundle_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ConnectionType getContype() {
            ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
            return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public int getContypeValue() {
            return this.contype_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getDcid() {
            Object obj = this.dcid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.dcid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getDcidBytes() {
            Object obj = this.dcid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.dcid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public DeviceType getDeviceType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
            return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public int getDeviceTypeValue() {
            return this.deviceType_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getExperiments(int i10) {
            return (String) this.experiments_.get(i10);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getExperimentsBytes(int i10) {
            return this.experiments_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public int getExperimentsCount() {
            return this.experiments_.size();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
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

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public jb getExtOrBuilder() {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public Context.Geo getGeo() {
            xa xaVar = this.geoBuilder_;
            if (xaVar != null) {
                return (Context.Geo) xaVar.getMessage();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        public Context.Geo.Builder getGeoBuilder() {
            onChanged();
            return (Context.Geo.Builder) getGeoFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public Context.GeoOrBuilder getGeoOrBuilder() {
            xa xaVar = this.geoBuilder_;
            if (xaVar != null) {
                return (Context.GeoOrBuilder) xaVar.getMessageOrBuilder();
            }
            Context.Geo geo = this.geo_;
            return geo == null ? Context.Geo.getDefaultInstance() : geo;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getHwv() {
            Object obj = this.hwv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.hwv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getHwvBytes() {
            Object obj = this.hwv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.hwv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getIfa() {
            Object obj = this.ifa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifa_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getIfaBytes() {
            Object obj = this.ifa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifa_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getIfv() {
            Object obj = this.ifv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ifv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getIfvBytes() {
            Object obj = this.ifv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ifv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getMake() {
            Object obj = this.make_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.make_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getMakeBytes() {
            Object obj = this.make_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.make_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.model_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public OS getOs() {
            OS osValueOf = OS.valueOf(this.os_);
            return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public int getOsValue() {
            return this.os_;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getOsv() {
            Object obj = this.osv_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osv_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getOsvBytes() {
            Object obj = this.osv_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osv_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public String getSourceId() {
            Object obj = this.sourceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sourceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ByteString getSourceIdBytes() {
            Object obj = this.sourceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sourceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public boolean hasGeo() {
            return (this.geoBuilder_ == null && this.geo_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable.ensureFieldAccessorsInitialized(SdkAnalyticContext.class, Builder.class);
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
                this.ext_ = a.i(struct2, struct);
            } else {
                this.ext_ = struct;
            }
            onChanged();
            return this;
        }

        public Builder mergeGeo(Context.Geo geo) {
            xa xaVar = this.geoBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(geo);
                return this;
            }
            Context.Geo geo2 = this.geo_;
            if (geo2 != null) {
                this.geo_ = Context.Geo.newBuilder(geo2).mergeFrom(geo).buildPartial();
            } else {
                this.geo_ = geo;
            }
            onChanged();
            return this;
        }

        public Builder setAppVer(String str) {
            str.getClass();
            this.appVer_ = str;
            onChanged();
            return this;
        }

        public Builder setAppVerBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.appVer_ = byteString;
            onChanged();
            return this;
        }

        public Builder setBmIfv(String str) {
            str.getClass();
            this.bmIfv_ = str;
            onChanged();
            return this;
        }

        public Builder setBmIfvBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.bmIfv_ = byteString;
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
            b.checkByteStringIsUtf8(byteString);
            this.bundle_ = byteString;
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

        public Builder setDcid(String str) {
            str.getClass();
            this.dcid_ = str;
            onChanged();
            return this;
        }

        public Builder setDcidBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.dcid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setDeviceType(DeviceType deviceType) {
            deviceType.getClass();
            this.deviceType_ = deviceType.getNumber();
            onChanged();
            return this;
        }

        public Builder setDeviceTypeValue(int i10) {
            this.deviceType_ = i10;
            onChanged();
            return this;
        }

        public Builder setExperiments(int i10, String str) {
            str.getClass();
            ensureExperimentsIsMutable();
            this.experiments_.set(i10, (int) str);
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

        public Builder setGeo(Context.Geo geo) {
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

        public Builder setHwv(String str) {
            str.getClass();
            this.hwv_ = str;
            onChanged();
            return this;
        }

        public Builder setHwvBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
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
            b.checkByteStringIsUtf8(byteString);
            this.ifa_ = byteString;
            onChanged();
            return this;
        }

        public Builder setIfv(String str) {
            str.getClass();
            this.ifv_ = str;
            onChanged();
            return this;
        }

        public Builder setIfvBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.ifv_ = byteString;
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
            b.checkByteStringIsUtf8(byteString);
            this.make_ = byteString;
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
            b.checkByteStringIsUtf8(byteString);
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
            b.checkByteStringIsUtf8(byteString);
            this.osv_ = byteString;
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
            b.checkByteStringIsUtf8(byteString);
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
            b.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
            onChanged();
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.sessionId_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSourceId(String str) {
            str.getClass();
            this.sourceId_ = str;
            onChanged();
            return this;
        }

        public Builder setSourceIdBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.sourceId_ = byteString;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
        public ka getExperimentsList() {
            return this.experiments_.getUnmodifiableView();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SdkAnalyticContext build() {
            SdkAnalyticContext sdkAnalyticContextBuildPartial = buildPartial();
            if (sdkAnalyticContextBuildPartial.isInitialized()) {
                return sdkAnalyticContextBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) sdkAnalyticContextBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public SdkAnalyticContext buildPartial() {
            SdkAnalyticContext sdkAnalyticContext = new SdkAnalyticContext(this);
            sdkAnalyticContext.sourceId_ = this.sourceId_;
            sdkAnalyticContext.bundle_ = this.bundle_;
            sdkAnalyticContext.os_ = this.os_;
            sdkAnalyticContext.osv_ = this.osv_;
            xa xaVar = this.geoBuilder_;
            if (xaVar == null) {
                sdkAnalyticContext.geo_ = this.geo_;
            } else {
                sdkAnalyticContext.geo_ = (Context.Geo) xaVar.build();
            }
            sdkAnalyticContext.sdk_ = this.sdk_;
            sdkAnalyticContext.sdkver_ = this.sdkver_;
            sdkAnalyticContext.ifa_ = this.ifa_;
            sdkAnalyticContext.ifv_ = this.ifv_;
            sdkAnalyticContext.bmIfv_ = this.bmIfv_;
            sdkAnalyticContext.deviceType_ = this.deviceType_;
            sdkAnalyticContext.contype_ = this.contype_;
            sdkAnalyticContext.appVer_ = this.appVer_;
            sdkAnalyticContext.sessionId_ = this.sessionId_;
            sdkAnalyticContext.dcid_ = this.dcid_;
            xa xaVar2 = this.extBuilder_;
            if (xaVar2 == null) {
                sdkAnalyticContext.ext_ = this.ext_;
            } else {
                sdkAnalyticContext.ext_ = (Struct) xaVar2.build();
            }
            if ((this.bitField0_ & 1) != 0) {
                this.experiments_ = this.experiments_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            sdkAnalyticContext.experiments_ = this.experiments_;
            sdkAnalyticContext.make_ = this.make_;
            sdkAnalyticContext.model_ = this.model_;
            sdkAnalyticContext.hwv_ = this.hwv_;
            onBuilt();
            return sdkAnalyticContext;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public SdkAnalyticContext getDefaultInstanceForType() {
            return SdkAnalyticContext.getDefaultInstance();
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
            this.sourceId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            if (this.geoBuilder_ == null) {
                this.geo_ = null;
            } else {
                this.geo_ = null;
                this.geoBuilder_ = null;
            }
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.dcid_ = "";
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            this.experiments_ = f8.f22138e;
            this.bitField0_ &= -2;
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
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

        public Builder setGeo(Context.Geo.Builder builder) {
            xa xaVar = this.geoBuilder_;
            if (xaVar == null) {
                this.geo_ = builder.build();
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
            if (message instanceof SdkAnalyticContext) {
                return mergeFrom((SdkAnalyticContext) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SdkAnalyticContext sdkAnalyticContext) {
            if (sdkAnalyticContext == SdkAnalyticContext.getDefaultInstance()) {
                return this;
            }
            if (!sdkAnalyticContext.getSourceId().isEmpty()) {
                this.sourceId_ = sdkAnalyticContext.sourceId_;
                onChanged();
            }
            if (!sdkAnalyticContext.getBundle().isEmpty()) {
                this.bundle_ = sdkAnalyticContext.bundle_;
                onChanged();
            }
            if (sdkAnalyticContext.os_ != 0) {
                setOsValue(sdkAnalyticContext.getOsValue());
            }
            if (!sdkAnalyticContext.getOsv().isEmpty()) {
                this.osv_ = sdkAnalyticContext.osv_;
                onChanged();
            }
            if (sdkAnalyticContext.hasGeo()) {
                mergeGeo(sdkAnalyticContext.getGeo());
            }
            if (!sdkAnalyticContext.getSdk().isEmpty()) {
                this.sdk_ = sdkAnalyticContext.sdk_;
                onChanged();
            }
            if (!sdkAnalyticContext.getSdkver().isEmpty()) {
                this.sdkver_ = sdkAnalyticContext.sdkver_;
                onChanged();
            }
            if (!sdkAnalyticContext.getIfa().isEmpty()) {
                this.ifa_ = sdkAnalyticContext.ifa_;
                onChanged();
            }
            if (!sdkAnalyticContext.getIfv().isEmpty()) {
                this.ifv_ = sdkAnalyticContext.ifv_;
                onChanged();
            }
            if (!sdkAnalyticContext.getBmIfv().isEmpty()) {
                this.bmIfv_ = sdkAnalyticContext.bmIfv_;
                onChanged();
            }
            if (sdkAnalyticContext.deviceType_ != 0) {
                setDeviceTypeValue(sdkAnalyticContext.getDeviceTypeValue());
            }
            if (sdkAnalyticContext.contype_ != 0) {
                setContypeValue(sdkAnalyticContext.getContypeValue());
            }
            if (!sdkAnalyticContext.getAppVer().isEmpty()) {
                this.appVer_ = sdkAnalyticContext.appVer_;
                onChanged();
            }
            if (!sdkAnalyticContext.getSessionId().isEmpty()) {
                this.sessionId_ = sdkAnalyticContext.sessionId_;
                onChanged();
            }
            if (!sdkAnalyticContext.getDcid().isEmpty()) {
                this.dcid_ = sdkAnalyticContext.dcid_;
                onChanged();
            }
            if (sdkAnalyticContext.hasExt()) {
                mergeExt(sdkAnalyticContext.getExt());
            }
            if (!sdkAnalyticContext.experiments_.isEmpty()) {
                if (this.experiments_.isEmpty()) {
                    this.experiments_ = sdkAnalyticContext.experiments_;
                    this.bitField0_ &= -2;
                } else {
                    ensureExperimentsIsMutable();
                    this.experiments_.addAll(sdkAnalyticContext.experiments_);
                }
                onChanged();
            }
            if (!sdkAnalyticContext.getMake().isEmpty()) {
                this.make_ = sdkAnalyticContext.make_;
                onChanged();
            }
            if (!sdkAnalyticContext.getModel().isEmpty()) {
                this.model_ = sdkAnalyticContext.model_;
                onChanged();
            }
            if (!sdkAnalyticContext.getHwv().isEmpty()) {
                this.hwv_ = sdkAnalyticContext.hwv_;
                onChanged();
            }
            mergeUnknownFields(((k7) sdkAnalyticContext).unknownFields);
            onChanged();
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.sourceId_ = "";
            this.bundle_ = "";
            this.os_ = 0;
            this.osv_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.ifa_ = "";
            this.ifv_ = "";
            this.bmIfv_ = "";
            this.deviceType_ = 0;
            this.contype_ = 0;
            this.appVer_ = "";
            this.sessionId_ = "";
            this.dcid_ = "";
            this.experiments_ = f8.f22138e;
            this.make_ = "";
            this.model_ = "";
            this.hwv_ = "";
            maybeForceBuilderInitialization();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.SdkAnalyticContext.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.SdkAnalyticContext.access$2500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.SdkAnalyticContext r3 = (io.bidmachine.protobuf.SdkAnalyticContext) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.SdkAnalyticContext r4 = (io.bidmachine.protobuf.SdkAnalyticContext) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.SdkAnalyticContext.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.SdkAnalyticContext$Builder");
        }
    }

    public static SdkAnalyticContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SdkAnalyticContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticContext) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkAnalyticContext)) {
            return super.equals(obj);
        }
        SdkAnalyticContext sdkAnalyticContext = (SdkAnalyticContext) obj;
        if (!getSourceId().equals(sdkAnalyticContext.getSourceId()) || !getBundle().equals(sdkAnalyticContext.getBundle()) || this.os_ != sdkAnalyticContext.os_ || !getOsv().equals(sdkAnalyticContext.getOsv()) || hasGeo() != sdkAnalyticContext.hasGeo()) {
            return false;
        }
        if ((!hasGeo() || getGeo().equals(sdkAnalyticContext.getGeo())) && getSdk().equals(sdkAnalyticContext.getSdk()) && getSdkver().equals(sdkAnalyticContext.getSdkver()) && getIfa().equals(sdkAnalyticContext.getIfa()) && getIfv().equals(sdkAnalyticContext.getIfv()) && getBmIfv().equals(sdkAnalyticContext.getBmIfv()) && this.deviceType_ == sdkAnalyticContext.deviceType_ && this.contype_ == sdkAnalyticContext.contype_ && getAppVer().equals(sdkAnalyticContext.getAppVer()) && getSessionId().equals(sdkAnalyticContext.getSessionId()) && getDcid().equals(sdkAnalyticContext.getDcid()) && hasExt() == sdkAnalyticContext.hasExt()) {
            return (!hasExt() || getExt().equals(sdkAnalyticContext.getExt())) && getExperimentsList().equals(sdkAnalyticContext.getExperimentsList()) && getMake().equals(sdkAnalyticContext.getMake()) && getModel().equals(sdkAnalyticContext.getModel()) && getHwv().equals(sdkAnalyticContext.getHwv()) && this.unknownFields.equals(sdkAnalyticContext.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appVer_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getBmIfv() {
        Object obj = this.bmIfv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bmIfv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getBmIfvBytes() {
        Object obj = this.bmIfv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bmIfv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getBundle() {
        Object obj = this.bundle_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bundle_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getBundleBytes() {
        Object obj = this.bundle_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bundle_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ConnectionType getContype() {
        ConnectionType connectionTypeValueOf = ConnectionType.valueOf(this.contype_);
        return connectionTypeValueOf == null ? ConnectionType.UNRECOGNIZED : connectionTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public int getContypeValue() {
        return this.contype_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getDcid() {
        Object obj = this.dcid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.dcid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getDcidBytes() {
        Object obj = this.dcid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.dcid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public DeviceType getDeviceType() {
        DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
        return deviceTypeValueOf == null ? DeviceType.UNRECOGNIZED : deviceTypeValueOf;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public int getDeviceTypeValue() {
        return this.deviceType_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getExperiments(int i10) {
        return (String) this.experiments_.get(i10);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getExperimentsBytes(int i10) {
        return this.experiments_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public int getExperimentsCount() {
        return this.experiments_.size();
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public jb getExtOrBuilder() {
        return getExt();
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public Context.Geo getGeo() {
        Context.Geo geo = this.geo_;
        return geo == null ? Context.Geo.getDefaultInstance() : geo;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public Context.GeoOrBuilder getGeoOrBuilder() {
        return getGeo();
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getHwv() {
        Object obj = this.hwv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.hwv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getHwvBytes() {
        Object obj = this.hwv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.hwv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getIfa() {
        Object obj = this.ifa_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifa_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getIfaBytes() {
        Object obj = this.ifa_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifa_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getIfv() {
        Object obj = this.ifv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ifv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getIfvBytes() {
        Object obj = this.ifv_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ifv_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getMake() {
        Object obj = this.make_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.make_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getMakeBytes() {
        Object obj = this.make_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.make_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getModel() {
        Object obj = this.model_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.model_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getModelBytes() {
        Object obj = this.model_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.model_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public OS getOs() {
        OS osValueOf = OS.valueOf(this.os_);
        return osValueOf == null ? OS.UNRECOGNIZED : osValueOf;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public int getOsValue() {
        return this.os_;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getOsv() {
        Object obj = this.osv_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osv_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
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

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getSourceIdBytes().isEmpty() ? k7.computeStringSize(1, this.sourceId_) : 0;
        if (!getBundleBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            iComputeStringSize += h0.computeEnumSize(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(4, this.osv_);
        }
        if (this.geo_ != null) {
            iComputeStringSize += h0.computeMessageSize(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            iComputeStringSize += h0.computeEnumSize(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            iComputeStringSize += h0.computeEnumSize(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(14, this.sessionId_);
        }
        if (!getDcidBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(15, this.dcid_);
        }
        if (this.ext_ != null) {
            iComputeStringSize += h0.computeMessageSize(16, getExt());
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.experiments_.size(); i11++) {
            iE = a.e(this.experiments_, i11, iE);
        }
        int size = (getExperimentsList().size() * 2) + iComputeStringSize + iE;
        if (!getMakeBytes().isEmpty()) {
            size += k7.computeStringSize(18, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            size += k7.computeStringSize(19, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            size += k7.computeStringSize(20, this.hwv_);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getSessionId() {
        Object obj = this.sessionId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sessionId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getSessionIdBytes() {
        Object obj = this.sessionId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sessionId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public String getSourceId() {
        Object obj = this.sourceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sourceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ByteString getSourceIdBytes() {
        Object obj = this.sourceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sourceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public boolean hasGeo() {
        return this.geo_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getOsv().hashCode() + a.d((((getBundle().hashCode() + ((((getSourceId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53, this.os_, 37, 4, 53);
        if (hasGeo()) {
            iHashCode = getGeo().hashCode() + o2.B(iHashCode, 37, 5, 53);
        }
        int iHashCode2 = getDcid().hashCode() + ((((getSessionId().hashCode() + ((((getAppVer().hashCode() + a.d(a.d((((getBmIfv().hashCode() + ((((getIfv().hashCode() + ((((getIfa().hashCode() + ((((getSdkver().hashCode() + ((((getSdk().hashCode() + o2.B(iHashCode, 37, 6, 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 9) * 53, this.deviceType_, 37, 10, 53), this.contype_, 37, 13, 53)) * 37) + 14) * 53)) * 37) + 15) * 53);
        if (hasExt()) {
            iHashCode2 = getExt().hashCode() + o2.B(iHashCode2, 37, 16, 53);
        }
        if (getExperimentsCount() > 0) {
            iHashCode2 = getExperimentsList().hashCode() + o2.B(iHashCode2, 37, 17, 53);
        }
        int iHashCode3 = this.unknownFields.hashCode() + ((getHwv().hashCode() + ((((getModel().hashCode() + ((((getMake().hashCode() + o2.B(iHashCode2, 37, 18, 53)) * 37) + 19) * 53)) * 37) + 20) * 53)) * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable.ensureFieldAccessorsInitialized(SdkAnalyticContext.class, Builder.class);
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
        return new SdkAnalyticContext();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getSourceIdBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.sourceId_);
        }
        if (!getBundleBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.bundle_);
        }
        if (this.os_ != OS.OS_INVALID.getNumber()) {
            h0Var.writeEnum(3, this.os_);
        }
        if (!getOsvBytes().isEmpty()) {
            k7.writeString(h0Var, 4, this.osv_);
        }
        if (this.geo_ != null) {
            h0Var.writeMessage(5, getGeo());
        }
        if (!getSdkBytes().isEmpty()) {
            k7.writeString(h0Var, 6, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            k7.writeString(h0Var, 7, this.sdkver_);
        }
        if (!getIfaBytes().isEmpty()) {
            k7.writeString(h0Var, 8, this.ifa_);
        }
        if (this.deviceType_ != DeviceType.DEVICE_TYPE_INVALID.getNumber()) {
            h0Var.writeEnum(9, this.deviceType_);
        }
        if (this.contype_ != ConnectionType.CONNECTION_TYPE_INVALID.getNumber()) {
            h0Var.writeEnum(10, this.contype_);
        }
        if (!getIfvBytes().isEmpty()) {
            k7.writeString(h0Var, 11, this.ifv_);
        }
        if (!getBmIfvBytes().isEmpty()) {
            k7.writeString(h0Var, 12, this.bmIfv_);
        }
        if (!getAppVerBytes().isEmpty()) {
            k7.writeString(h0Var, 13, this.appVer_);
        }
        if (!getSessionIdBytes().isEmpty()) {
            k7.writeString(h0Var, 14, this.sessionId_);
        }
        if (!getDcidBytes().isEmpty()) {
            k7.writeString(h0Var, 15, this.dcid_);
        }
        if (this.ext_ != null) {
            h0Var.writeMessage(16, getExt());
        }
        int iF = 0;
        while (iF < this.experiments_.size()) {
            iF = a.f(this.experiments_, iF, h0Var, 17, iF, 1);
        }
        if (!getMakeBytes().isEmpty()) {
            k7.writeString(h0Var, 18, this.make_);
        }
        if (!getModelBytes().isEmpty()) {
            k7.writeString(h0Var, 19, this.model_);
        }
        if (!getHwvBytes().isEmpty()) {
            k7.writeString(h0Var, 20, this.hwv_);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static Builder newBuilder(SdkAnalyticContext sdkAnalyticContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sdkAnalyticContext);
    }

    public static SdkAnalyticContext parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(byteBuffer, m5Var);
    }

    @Override // io.bidmachine.protobuf.SdkAnalyticContextOrBuilder
    public ka getExperimentsList() {
        return this.experiments_;
    }

    private SdkAnalyticContext(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static SdkAnalyticContext parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (SdkAnalyticContext) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static SdkAnalyticContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public SdkAnalyticContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static SdkAnalyticContext parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private SdkAnalyticContext() {
        this.memoizedIsInitialized = (byte) -1;
        this.sourceId_ = "";
        this.bundle_ = "";
        this.os_ = 0;
        this.osv_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        this.ifa_ = "";
        this.ifv_ = "";
        this.bmIfv_ = "";
        this.deviceType_ = 0;
        this.contype_ = 0;
        this.appVer_ = "";
        this.sessionId_ = "";
        this.dcid_ = "";
        this.experiments_ = f8.f22138e;
        this.make_ = "";
        this.model_ = "";
        this.hwv_ = "";
    }

    public static SdkAnalyticContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static SdkAnalyticContext parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (SdkAnalyticContext) PARSER.parseFrom(bArr, m5Var);
    }

    public static SdkAnalyticContext parseFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticContext) k7.parseWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticContext parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (SdkAnalyticContext) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static SdkAnalyticContext parseFrom(y yVar) throws IOException {
        return (SdkAnalyticContext) k7.parseWithIOException(PARSER, yVar);
    }

    public static SdkAnalyticContext parseFrom(y yVar, m5 m5Var) throws IOException {
        return (SdkAnalyticContext) k7.parseWithIOException(PARSER, yVar, m5Var);
    }

    private SdkAnalyticContext(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                        case 10:
                            this.sourceId_ = yVar.readStringRequireUtf8();
                        case 18:
                            this.bundle_ = yVar.readStringRequireUtf8();
                        case 24:
                            this.os_ = yVar.readEnum();
                        case 34:
                            this.osv_ = yVar.readStringRequireUtf8();
                        case 42:
                            Context.Geo geo = this.geo_;
                            Context.Geo.Builder builder = geo != null ? geo.toBuilder() : null;
                            Context.Geo geo2 = (Context.Geo) yVar.readMessage(Context.Geo.parser(), m5Var);
                            this.geo_ = geo2;
                            if (builder != null) {
                                builder.mergeFrom(geo2);
                                this.geo_ = builder.buildPartial();
                            }
                        case 50:
                            this.sdk_ = yVar.readStringRequireUtf8();
                        case 58:
                            this.sdkver_ = yVar.readStringRequireUtf8();
                        case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                            this.ifa_ = yVar.readStringRequireUtf8();
                        case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                            this.deviceType_ = yVar.readEnum();
                        case 80:
                            this.contype_ = yVar.readEnum();
                        case 90:
                            this.ifv_ = yVar.readStringRequireUtf8();
                        case 98:
                            this.bmIfv_ = yVar.readStringRequireUtf8();
                        case 106:
                            this.appVer_ = yVar.readStringRequireUtf8();
                        case 114:
                            this.sessionId_ = yVar.readStringRequireUtf8();
                        case INVALID_ADS_ENDPOINT_VALUE:
                            this.dcid_ = yVar.readStringRequireUtf8();
                        case 130:
                            Struct struct = this.ext_;
                            Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                            this.ext_ = struct2;
                            if (builder2 != null) {
                                builder2.mergeFrom(struct2);
                                this.ext_ = builder2.buildPartial();
                            }
                        case 138:
                            String stringRequireUtf8 = yVar.readStringRequireUtf8();
                            z11 = z11;
                            if (!z11) {
                                this.experiments_ = new f8();
                                z11 = true;
                            }
                            this.experiments_.add((g8) stringRequireUtf8);
                        case 146:
                            this.make_ = yVar.readStringRequireUtf8();
                        case 154:
                            this.model_ = yVar.readStringRequireUtf8();
                        case 162:
                            this.hwv_ = yVar.readStringRequireUtf8();
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
                    this.experiments_ = this.experiments_.getUnmodifiableView();
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.experiments_ = this.experiments_.getUnmodifiableView();
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }
}
