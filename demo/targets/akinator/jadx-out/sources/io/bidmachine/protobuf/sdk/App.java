package io.bidmachine.protobuf.sdk;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.adcom.Context;
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
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.ka;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.sb;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class App extends k7 implements AppOrBuilder {
    public static final int APP_NAME_FIELD_NUMBER = 1;
    public static final int APP_VER_FIELD_NUMBER = 2;
    public static final int FIRST_LAUNCH_TIME_FIELD_NUMBER = 5;
    public static final int FMWNAME_FIELD_NUMBER = 8;
    public static final int INSTALL_TIME_FIELD_NUMBER = 4;
    public static final int RELEASE_FIELD_NUMBER = 3;
    public static final int STORECAT_FIELD_NUMBER = 6;
    public static final int STORESUBCAT_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private volatile Object appName_;
    private volatile Object appVer_;
    private Timestamp firstLaunchTime_;
    private volatile Object fmwname_;
    private Timestamp installTime_;
    private byte memoizedIsInitialized;
    private Context.App.Release release_;
    private volatile Object storecat_;
    private g8 storesubcat_;
    private static final App DEFAULT_INSTANCE = new App();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.App.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public App parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new App(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements AppOrBuilder {
        private Object appName_;
        private Object appVer_;
        private int bitField0_;
        private xa firstLaunchTimeBuilder_;
        private Timestamp firstLaunchTime_;
        private Object fmwname_;
        private xa installTimeBuilder_;
        private Timestamp installTime_;
        private xa releaseBuilder_;
        private Context.App.Release release_;
        private Object storecat_;
        private g8 storesubcat_;

        private Builder() {
            super(null);
            this.appName_ = "";
            this.appVer_ = "";
            this.storecat_ = "";
            this.storesubcat_ = f8.f22138e;
            this.fmwname_ = "";
            maybeForceBuilderInitialization();
        }

        private void ensureStoresubcatIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.storesubcat_ = new f8(this.storesubcat_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
        }

        private xa getFirstLaunchTimeFieldBuilder() {
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTimeBuilder_ = new xa(getFirstLaunchTime(), getParentForChildren(), isClean());
                this.firstLaunchTime_ = null;
            }
            return this.firstLaunchTimeBuilder_;
        }

        private xa getInstallTimeFieldBuilder() {
            if (this.installTimeBuilder_ == null) {
                this.installTimeBuilder_ = new xa(getInstallTime(), getParentForChildren(), isClean());
                this.installTime_ = null;
            }
            return this.installTimeBuilder_;
        }

        private xa getReleaseFieldBuilder() {
            if (this.releaseBuilder_ == null) {
                this.releaseBuilder_ = new xa(getRelease(), getParentForChildren(), isClean());
                this.release_ = null;
            }
            return this.releaseBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder addAllStoresubcat(Iterable<String> iterable) {
            ensureStoresubcatIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.storesubcat_);
            onChanged();
            return this;
        }

        public Builder addStoresubcat(String str) {
            str.getClass();
            ensureStoresubcatIsMutable();
            this.storesubcat_.add((g8) str);
            onChanged();
            return this;
        }

        public Builder addStoresubcatBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            ensureStoresubcatIsMutable();
            this.storesubcat_.add(byteString);
            onChanged();
            return this;
        }

        public Builder clearAppName() {
            this.appName_ = App.getDefaultInstance().getAppName();
            onChanged();
            return this;
        }

        public Builder clearAppVer() {
            this.appVer_ = App.getDefaultInstance().getAppVer();
            onChanged();
            return this;
        }

        public Builder clearFirstLaunchTime() {
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTime_ = null;
                onChanged();
                return this;
            }
            this.firstLaunchTime_ = null;
            this.firstLaunchTimeBuilder_ = null;
            return this;
        }

        public Builder clearFmwname() {
            this.fmwname_ = App.getDefaultInstance().getFmwname();
            onChanged();
            return this;
        }

        public Builder clearInstallTime() {
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
                onChanged();
                return this;
            }
            this.installTime_ = null;
            this.installTimeBuilder_ = null;
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

        public Builder clearStorecat() {
            this.storecat_ = App.getDefaultInstance().getStorecat();
            onChanged();
            return this;
        }

        public Builder clearStoresubcat() {
            this.storesubcat_ = f8.f22138e;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getAppVer() {
            Object obj = this.appVer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appVer_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getAppVerBytes() {
            Object obj = this.appVer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getFirstLaunchTime() {
            xa xaVar = this.firstLaunchTimeBuilder_;
            if (xaVar != null) {
                return (Timestamp) xaVar.getMessage();
            }
            Timestamp timestamp = this.firstLaunchTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getFirstLaunchTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getFirstLaunchTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public sb getFirstLaunchTimeOrBuilder() {
            xa xaVar = this.firstLaunchTimeBuilder_;
            if (xaVar != null) {
                return (sb) xaVar.getMessageOrBuilder();
            }
            Timestamp timestamp = this.firstLaunchTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getFmwname() {
            Object obj = this.fmwname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fmwname_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getFmwnameBytes() {
            Object obj = this.fmwname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fmwname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Timestamp getInstallTime() {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar != null) {
                return (Timestamp) xaVar.getMessage();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public Timestamp.Builder getInstallTimeBuilder() {
            onChanged();
            return (Timestamp.Builder) getInstallTimeFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public sb getInstallTimeOrBuilder() {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar != null) {
                return (sb) xaVar.getMessageOrBuilder();
            }
            Timestamp timestamp = this.installTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Context.App.Release getRelease() {
            xa xaVar = this.releaseBuilder_;
            if (xaVar != null) {
                return (Context.App.Release) xaVar.getMessage();
            }
            Context.App.Release release = this.release_;
            return release == null ? Context.App.Release.getDefaultInstance() : release;
        }

        public Context.App.Release.Builder getReleaseBuilder() {
            onChanged();
            return (Context.App.Release.Builder) getReleaseFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public Context.App.ReleaseOrBuilder getReleaseOrBuilder() {
            xa xaVar = this.releaseBuilder_;
            if (xaVar != null) {
                return (Context.App.ReleaseOrBuilder) xaVar.getMessageOrBuilder();
            }
            Context.App.Release release = this.release_;
            return release == null ? Context.App.Release.getDefaultInstance() : release;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getStorecat() {
            Object obj = this.storecat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storecat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getStorecatBytes() {
            Object obj = this.storecat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storecat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public String getStoresubcat(int i10) {
            return (String) this.storesubcat_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ByteString getStoresubcatBytes(int i10) {
            return this.storesubcat_.getByteString(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public int getStoresubcatCount() {
            return this.storesubcat_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasFirstLaunchTime() {
            return (this.firstLaunchTimeBuilder_ == null && this.firstLaunchTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasInstallTime() {
            return (this.installTimeBuilder_ == null && this.installTime_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public boolean hasRelease() {
            return (this.releaseBuilder_ == null && this.release_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable.ensureFieldAccessorsInitialized(App.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFirstLaunchTime(Timestamp timestamp) {
            xa xaVar = this.firstLaunchTimeBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.firstLaunchTime_;
            if (timestamp2 != null) {
                this.firstLaunchTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.firstLaunchTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeInstallTime(Timestamp timestamp) {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(timestamp);
                return this;
            }
            Timestamp timestamp2 = this.installTime_;
            if (timestamp2 != null) {
                this.installTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
            } else {
                this.installTime_ = timestamp;
            }
            onChanged();
            return this;
        }

        public Builder mergeRelease(Context.App.Release release) {
            xa xaVar = this.releaseBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(release);
                return this;
            }
            Context.App.Release release2 = this.release_;
            if (release2 != null) {
                this.release_ = Context.App.Release.newBuilder(release2).mergeFrom(release).buildPartial();
            } else {
                this.release_ = release;
            }
            onChanged();
            return this;
        }

        public Builder setAppName(String str) {
            str.getClass();
            this.appName_ = str;
            onChanged();
            return this;
        }

        public Builder setAppNameBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.appName_ = byteString;
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

        public Builder setFirstLaunchTime(Timestamp timestamp) {
            xa xaVar = this.firstLaunchTimeBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(timestamp);
                return this;
            }
            timestamp.getClass();
            this.firstLaunchTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setFmwname(String str) {
            str.getClass();
            this.fmwname_ = str;
            onChanged();
            return this;
        }

        public Builder setFmwnameBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.fmwname_ = byteString;
            onChanged();
            return this;
        }

        public Builder setInstallTime(Timestamp timestamp) {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(timestamp);
                return this;
            }
            timestamp.getClass();
            this.installTime_ = timestamp;
            onChanged();
            return this;
        }

        public Builder setRelease(Context.App.Release release) {
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

        public Builder setStorecat(String str) {
            str.getClass();
            this.storecat_ = str;
            onChanged();
            return this;
        }

        public Builder setStorecatBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.storecat_ = byteString;
            onChanged();
            return this;
        }

        public Builder setStoresubcat(int i10, String str) {
            str.getClass();
            ensureStoresubcatIsMutable();
            this.storesubcat_.set(i10, (int) str);
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
        public ka getStoresubcatList() {
            return this.storesubcat_.getUnmodifiableView();
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
            app.appName_ = this.appName_;
            app.appVer_ = this.appVer_;
            xa xaVar = this.releaseBuilder_;
            if (xaVar == null) {
                app.release_ = this.release_;
            } else {
                app.release_ = (Context.App.Release) xaVar.build();
            }
            xa xaVar2 = this.installTimeBuilder_;
            if (xaVar2 == null) {
                app.installTime_ = this.installTime_;
            } else {
                app.installTime_ = (Timestamp) xaVar2.build();
            }
            xa xaVar3 = this.firstLaunchTimeBuilder_;
            if (xaVar3 == null) {
                app.firstLaunchTime_ = this.firstLaunchTime_;
            } else {
                app.firstLaunchTime_ = (Timestamp) xaVar3.build();
            }
            app.storecat_ = this.storecat_;
            if ((this.bitField0_ & 1) != 0) {
                this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            app.storesubcat_ = this.storesubcat_;
            app.fmwname_ = this.fmwname_;
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
            this.appName_ = "";
            this.appVer_ = "";
            if (this.releaseBuilder_ == null) {
                this.release_ = null;
            } else {
                this.release_ = null;
                this.releaseBuilder_ = null;
            }
            if (this.installTimeBuilder_ == null) {
                this.installTime_ = null;
            } else {
                this.installTime_ = null;
                this.installTimeBuilder_ = null;
            }
            if (this.firstLaunchTimeBuilder_ == null) {
                this.firstLaunchTime_ = null;
            } else {
                this.firstLaunchTime_ = null;
                this.firstLaunchTimeBuilder_ = null;
            }
            this.storecat_ = "";
            this.storesubcat_ = f8.f22138e;
            this.bitField0_ &= -2;
            this.fmwname_ = "";
            return this;
        }

        public Builder setFirstLaunchTime(Timestamp.Builder builder) {
            xa xaVar = this.firstLaunchTimeBuilder_;
            if (xaVar == null) {
                this.firstLaunchTime_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setInstallTime(Timestamp.Builder builder) {
            xa xaVar = this.installTimeBuilder_;
            if (xaVar == null) {
                this.installTime_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setRelease(Context.App.Release.Builder builder) {
            xa xaVar = this.releaseBuilder_;
            if (xaVar == null) {
                this.release_ = builder.build();
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
            if (message instanceof App) {
                return mergeFrom((App) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.appName_ = "";
            this.appVer_ = "";
            this.storecat_ = "";
            this.storesubcat_ = f8.f22138e;
            this.fmwname_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(App app) {
            if (app == App.getDefaultInstance()) {
                return this;
            }
            if (!app.getAppName().isEmpty()) {
                this.appName_ = app.appName_;
                onChanged();
            }
            if (!app.getAppVer().isEmpty()) {
                this.appVer_ = app.appVer_;
                onChanged();
            }
            if (app.hasRelease()) {
                mergeRelease(app.getRelease());
            }
            if (app.hasInstallTime()) {
                mergeInstallTime(app.getInstallTime());
            }
            if (app.hasFirstLaunchTime()) {
                mergeFirstLaunchTime(app.getFirstLaunchTime());
            }
            if (!app.getStorecat().isEmpty()) {
                this.storecat_ = app.storecat_;
                onChanged();
            }
            if (!app.storesubcat_.isEmpty()) {
                if (this.storesubcat_.isEmpty()) {
                    this.storesubcat_ = app.storesubcat_;
                    this.bitField0_ &= -2;
                } else {
                    ensureStoresubcatIsMutable();
                    this.storesubcat_.addAll(app.storesubcat_);
                }
                onChanged();
            }
            if (!app.getFmwname().isEmpty()) {
                this.fmwname_ = app.fmwname_;
                onChanged();
            }
            mergeUnknownFields(((k7) app).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.sdk.App.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.App.access$1300()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.App r3 = (io.bidmachine.protobuf.sdk.App) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.App r4 = (io.bidmachine.protobuf.sdk.App) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.App.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.App$Builder");
        }
    }

    public static App getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
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
        if (!getAppName().equals(app.getAppName()) || !getAppVer().equals(app.getAppVer()) || hasRelease() != app.hasRelease()) {
            return false;
        }
        if ((hasRelease() && !getRelease().equals(app.getRelease())) || hasInstallTime() != app.hasInstallTime()) {
            return false;
        }
        if ((!hasInstallTime() || getInstallTime().equals(app.getInstallTime())) && hasFirstLaunchTime() == app.hasFirstLaunchTime()) {
            return (!hasFirstLaunchTime() || getFirstLaunchTime().equals(app.getFirstLaunchTime())) && getStorecat().equals(app.getStorecat()) && getStoresubcatList().equals(app.getStoresubcatList()) && getFmwname().equals(app.getFmwname()) && this.unknownFields.equals(app.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getAppName() {
        Object obj = this.appName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getAppNameBytes() {
        Object obj = this.appName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getAppVer() {
        Object obj = this.appVer_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appVer_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getAppVerBytes() {
        Object obj = this.appVer_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appVer_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getFirstLaunchTime() {
        Timestamp timestamp = this.firstLaunchTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public sb getFirstLaunchTimeOrBuilder() {
        return getFirstLaunchTime();
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getFmwname() {
        Object obj = this.fmwname_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.fmwname_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getFmwnameBytes() {
        Object obj = this.fmwname_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.fmwname_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Timestamp getInstallTime() {
        Timestamp timestamp = this.installTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public sb getInstallTimeOrBuilder() {
        return getInstallTime();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Context.App.Release getRelease() {
        Context.App.Release release = this.release_;
        return release == null ? Context.App.Release.getDefaultInstance() : release;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public Context.App.ReleaseOrBuilder getReleaseOrBuilder() {
        return getRelease();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getAppNameBytes().isEmpty() ? k7.computeStringSize(1, this.appName_) : 0;
        if (!getAppVerBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.appVer_);
        }
        if (this.release_ != null) {
            iComputeStringSize += h0.computeMessageSize(3, getRelease());
        }
        if (this.installTime_ != null) {
            iComputeStringSize += h0.computeMessageSize(4, getInstallTime());
        }
        if (this.firstLaunchTime_ != null) {
            iComputeStringSize += h0.computeMessageSize(5, getFirstLaunchTime());
        }
        if (!getStorecatBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(6, this.storecat_);
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.storesubcat_.size(); i11++) {
            iE = a.e(this.storesubcat_, i11, iE);
        }
        int size = getStoresubcatList().size() + iComputeStringSize + iE;
        if (!getFmwnameBytes().isEmpty()) {
            size += k7.computeStringSize(8, this.fmwname_);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getStorecat() {
        Object obj = this.storecat_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.storecat_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getStorecatBytes() {
        Object obj = this.storecat_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.storecat_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public String getStoresubcat(int i10) {
        return (String) this.storesubcat_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ByteString getStoresubcatBytes(int i10) {
        return this.storesubcat_.getByteString(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public int getStoresubcatCount() {
        return this.storesubcat_.size();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasFirstLaunchTime() {
        return this.firstLaunchTime_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasInstallTime() {
        return this.installTime_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public boolean hasRelease() {
        return this.release_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getAppVer().hashCode() + ((((getAppName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (hasRelease()) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + getRelease().hashCode();
        }
        if (hasInstallTime()) {
            iHashCode = o2.B(iHashCode, 37, 4, 53) + getInstallTime().hashCode();
        }
        if (hasFirstLaunchTime()) {
            iHashCode = o2.B(iHashCode, 37, 5, 53) + getFirstLaunchTime().hashCode();
        }
        int iHashCode2 = getStorecat().hashCode() + o2.B(iHashCode, 37, 6, 53);
        if (getStoresubcatCount() > 0) {
            iHashCode2 = getStoresubcatList().hashCode() + o2.B(iHashCode2, 37, 7, 53);
        }
        int iHashCode3 = this.unknownFields.hashCode() + ((getFmwname().hashCode() + o2.B(iHashCode2, 37, 8, 53)) * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable.ensureFieldAccessorsInitialized(App.class, Builder.class);
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
        if (!getAppNameBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.appName_);
        }
        if (!getAppVerBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.appVer_);
        }
        if (this.release_ != null) {
            h0Var.writeMessage(3, getRelease());
        }
        if (this.installTime_ != null) {
            h0Var.writeMessage(4, getInstallTime());
        }
        if (this.firstLaunchTime_ != null) {
            h0Var.writeMessage(5, getFirstLaunchTime());
        }
        if (!getStorecatBytes().isEmpty()) {
            k7.writeString(h0Var, 6, this.storecat_);
        }
        int iF = 0;
        while (iF < this.storesubcat_.size()) {
            iF = a.f(this.storesubcat_, iF, h0Var, 7, iF, 1);
        }
        if (!getFmwnameBytes().isEmpty()) {
            k7.writeString(h0Var, 8, this.fmwname_);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static Builder newBuilder(App app) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(app);
    }

    public static App parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (App) PARSER.parseFrom(byteBuffer, m5Var);
    }

    @Override // io.bidmachine.protobuf.sdk.AppOrBuilder
    public ka getStoresubcatList() {
        return this.storesubcat_;
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
        this.appName_ = "";
        this.appVer_ = "";
        this.storecat_ = "";
        this.storesubcat_ = f8.f22138e;
        this.fmwname_ = "";
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

    private App(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            this.appName_ = yVar.readStringRequireUtf8();
                        } else if (tag != 18) {
                            if (tag == 26) {
                                Context.App.Release release = this.release_;
                                Context.App.Release.Builder builder = release != null ? release.toBuilder() : null;
                                Context.App.Release release2 = (Context.App.Release) yVar.readMessage(Context.App.Release.parser(), m5Var);
                                this.release_ = release2;
                                if (builder != null) {
                                    builder.mergeFrom(release2);
                                    this.release_ = builder.buildPartial();
                                }
                            } else if (tag == 34) {
                                Timestamp timestamp = this.installTime_;
                                Timestamp.Builder builder2 = timestamp != null ? timestamp.toBuilder() : null;
                                Timestamp timestamp2 = (Timestamp) yVar.readMessage(Timestamp.parser(), m5Var);
                                this.installTime_ = timestamp2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(timestamp2);
                                    this.installTime_ = builder2.buildPartial();
                                }
                            } else if (tag == 42) {
                                Timestamp timestamp3 = this.firstLaunchTime_;
                                Timestamp.Builder builder3 = timestamp3 != null ? timestamp3.toBuilder() : null;
                                Timestamp timestamp4 = (Timestamp) yVar.readMessage(Timestamp.parser(), m5Var);
                                this.firstLaunchTime_ = timestamp4;
                                if (builder3 != null) {
                                    builder3.mergeFrom(timestamp4);
                                    this.firstLaunchTime_ = builder3.buildPartial();
                                }
                            } else if (tag == 50) {
                                this.storecat_ = yVar.readStringRequireUtf8();
                            } else if (tag == 58) {
                                String stringRequireUtf8 = yVar.readStringRequireUtf8();
                                z11 = z11;
                                if (!z11) {
                                    this.storesubcat_ = new f8();
                                    z11 = true;
                                }
                                this.storesubcat_.add((g8) stringRequireUtf8);
                            } else if (tag != 66) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                this.fmwname_ = yVar.readStringRequireUtf8();
                            }
                        } else {
                            this.appVer_ = yVar.readStringRequireUtf8();
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
                    this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            this.storesubcat_ = this.storesubcat_.getUnmodifiableView();
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static App parseFrom(y yVar, m5 m5Var) throws IOException {
        return (App) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
