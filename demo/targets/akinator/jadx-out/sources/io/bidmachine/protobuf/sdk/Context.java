package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
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
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.y;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.Session;
import io.bidmachine.protobuf.sdk.User;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class Context extends k7 implements ContextOrBuilder {
    public static final int APP_FIELD_NUMBER = 2;
    public static final int DEVICE_FIELD_NUMBER = 4;
    public static final int SDK_FIELD_NUMBER = 1;
    public static final int SESSION_FIELD_NUMBER = 5;
    public static final int USER_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private App app_;
    private Device device_;
    private byte memoizedIsInitialized;
    private SDK sdk_;
    private Session session_;
    private User user_;
    private static final Context DEFAULT_INSTANCE = new Context();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.Context.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Context parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Context(yVar, m5Var);
        }
    };

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
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
        if (hasSdk() != context.hasSdk()) {
            return false;
        }
        if ((hasSdk() && !getSdk().equals(context.getSdk())) || hasApp() != context.hasApp()) {
            return false;
        }
        if ((hasApp() && !getApp().equals(context.getApp())) || hasUser() != context.hasUser()) {
            return false;
        }
        if ((hasUser() && !getUser().equals(context.getUser())) || hasDevice() != context.hasDevice()) {
            return false;
        }
        if ((!hasDevice() || getDevice().equals(context.getDevice())) && hasSession() == context.hasSession()) {
            return (!hasSession() || getSession().equals(context.getSession())) && this.unknownFields.equals(context.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public App getApp() {
        App app = this.app_;
        return app == null ? App.getDefaultInstance() : app;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public AppOrBuilder getAppOrBuilder() {
        return getApp();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public Device getDevice() {
        Device device = this.device_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public DeviceOrBuilder getDeviceOrBuilder() {
        return getDevice();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public SDK getSdk() {
        SDK sdk = this.sdk_;
        return sdk == null ? SDK.getDefaultInstance() : sdk;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public SDKOrBuilder getSdkOrBuilder() {
        return getSdk();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = this.sdk_ != null ? h0.computeMessageSize(1, getSdk()) : 0;
        if (this.app_ != null) {
            iComputeMessageSize += h0.computeMessageSize(2, getApp());
        }
        if (this.user_ != null) {
            iComputeMessageSize += h0.computeMessageSize(3, getUser());
        }
        if (this.device_ != null) {
            iComputeMessageSize += h0.computeMessageSize(4, getDevice());
        }
        if (this.session_ != null) {
            iComputeMessageSize += h0.computeMessageSize(5, getSession());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public Session getSession() {
        Session session = this.session_;
        return session == null ? Session.getDefaultInstance() : session;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public SessionOrBuilder getSessionOrBuilder() {
        return getSession();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public User getUser() {
        User user = this.user_;
        return user == null ? User.getDefaultInstance() : user;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public UserOrBuilder getUserOrBuilder() {
        return getUser();
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasApp() {
        return this.app_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasDevice() {
        return this.device_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasSdk() {
        return this.sdk_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
    public boolean hasSession() {
        return this.session_ != null;
    }

    @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
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
        if (hasSdk()) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getSdk().hashCode();
        }
        if (hasApp()) {
            iHashCode = o2.B(iHashCode, 37, 2, 53) + getApp().hashCode();
        }
        if (hasUser()) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + getUser().hashCode();
        }
        if (hasDevice()) {
            iHashCode = o2.B(iHashCode, 37, 4, 53) + getDevice().hashCode();
        }
        if (hasSession()) {
            iHashCode = o2.B(iHashCode, 37, 5, 53) + getSession().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
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
        if (this.sdk_ != null) {
            h0Var.writeMessage(1, getSdk());
        }
        if (this.app_ != null) {
            h0Var.writeMessage(2, getApp());
        }
        if (this.user_ != null) {
            h0Var.writeMessage(3, getUser());
        }
        if (this.device_ != null) {
            h0Var.writeMessage(4, getDevice());
        }
        if (this.session_ != null) {
            h0Var.writeMessage(5, getSession());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements ContextOrBuilder {
        private xa appBuilder_;
        private App app_;
        private xa deviceBuilder_;
        private Device device_;
        private xa sdkBuilder_;
        private SDK sdk_;
        private xa sessionBuilder_;
        private Session session_;
        private xa userBuilder_;
        private User user_;

        private xa getAppFieldBuilder() {
            if (this.appBuilder_ == null) {
                this.appBuilder_ = new xa(getApp(), getParentForChildren(), isClean());
                this.app_ = null;
            }
            return this.appBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
        }

        private xa getDeviceFieldBuilder() {
            if (this.deviceBuilder_ == null) {
                this.deviceBuilder_ = new xa(getDevice(), getParentForChildren(), isClean());
                this.device_ = null;
            }
            return this.deviceBuilder_;
        }

        private xa getSdkFieldBuilder() {
            if (this.sdkBuilder_ == null) {
                this.sdkBuilder_ = new xa(getSdk(), getParentForChildren(), isClean());
                this.sdk_ = null;
            }
            return this.sdkBuilder_;
        }

        private xa getSessionFieldBuilder() {
            if (this.sessionBuilder_ == null) {
                this.sessionBuilder_ = new xa(getSession(), getParentForChildren(), isClean());
                this.session_ = null;
            }
            return this.sessionBuilder_;
        }

        private xa getUserFieldBuilder() {
            if (this.userBuilder_ == null) {
                this.userBuilder_ = new xa(getUser(), getParentForChildren(), isClean());
                this.user_ = null;
            }
            return this.userBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
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

        public Builder clearSdk() {
            if (this.sdkBuilder_ == null) {
                this.sdk_ = null;
                onChanged();
                return this;
            }
            this.sdk_ = null;
            this.sdkBuilder_ = null;
            return this;
        }

        public Builder clearSession() {
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
                onChanged();
                return this;
            }
            this.session_ = null;
            this.sessionBuilder_ = null;
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

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
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

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
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
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
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

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public DeviceOrBuilder getDeviceOrBuilder() {
            xa xaVar = this.deviceBuilder_;
            if (xaVar != null) {
                return (DeviceOrBuilder) xaVar.getMessageOrBuilder();
            }
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public SDK getSdk() {
            xa xaVar = this.sdkBuilder_;
            if (xaVar != null) {
                return (SDK) xaVar.getMessage();
            }
            SDK sdk = this.sdk_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        public SDK.Builder getSdkBuilder() {
            onChanged();
            return (SDK.Builder) getSdkFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public SDKOrBuilder getSdkOrBuilder() {
            xa xaVar = this.sdkBuilder_;
            if (xaVar != null) {
                return (SDKOrBuilder) xaVar.getMessageOrBuilder();
            }
            SDK sdk = this.sdk_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public Session getSession() {
            xa xaVar = this.sessionBuilder_;
            if (xaVar != null) {
                return (Session) xaVar.getMessage();
            }
            Session session = this.session_;
            return session == null ? Session.getDefaultInstance() : session;
        }

        public Session.Builder getSessionBuilder() {
            onChanged();
            return (Session.Builder) getSessionFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public SessionOrBuilder getSessionOrBuilder() {
            xa xaVar = this.sessionBuilder_;
            if (xaVar != null) {
                return (SessionOrBuilder) xaVar.getMessageOrBuilder();
            }
            Session session = this.session_;
            return session == null ? Session.getDefaultInstance() : session;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
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

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public UserOrBuilder getUserOrBuilder() {
            xa xaVar = this.userBuilder_;
            if (xaVar != null) {
                return (UserOrBuilder) xaVar.getMessageOrBuilder();
            }
            User user = this.user_;
            return user == null ? User.getDefaultInstance() : user;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasApp() {
            return (this.appBuilder_ == null && this.app_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasDevice() {
            return (this.deviceBuilder_ == null && this.device_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasSdk() {
            return (this.sdkBuilder_ == null && this.sdk_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasSession() {
            return (this.sessionBuilder_ == null && this.session_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.sdk.ContextOrBuilder
        public boolean hasUser() {
            return (this.userBuilder_ == null && this.user_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_Context_fieldAccessorTable.ensureFieldAccessorsInitialized(Context.class, Builder.class);
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

        public Builder mergeSdk(SDK sdk) {
            xa xaVar = this.sdkBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(sdk);
                return this;
            }
            SDK sdk2 = this.sdk_;
            if (sdk2 != null) {
                this.sdk_ = SDK.newBuilder(sdk2).mergeFrom(sdk).buildPartial();
            } else {
                this.sdk_ = sdk;
            }
            onChanged();
            return this;
        }

        public Builder mergeSession(Session session) {
            xa xaVar = this.sessionBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(session);
                return this;
            }
            Session session2 = this.session_;
            if (session2 != null) {
                this.session_ = Session.newBuilder(session2).mergeFrom(session).buildPartial();
            } else {
                this.session_ = session;
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

        public Builder setSdk(SDK sdk) {
            xa xaVar = this.sdkBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(sdk);
                return this;
            }
            sdk.getClass();
            this.sdk_ = sdk;
            onChanged();
            return this;
        }

        public Builder setSession(Session session) {
            xa xaVar = this.sessionBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(session);
                return this;
            }
            session.getClass();
            this.session_ = session;
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

        private Builder(p6 p6Var) {
            super(p6Var);
            maybeForceBuilderInitialization();
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
            xa xaVar = this.sdkBuilder_;
            if (xaVar == null) {
                context.sdk_ = this.sdk_;
            } else {
                context.sdk_ = (SDK) xaVar.build();
            }
            xa xaVar2 = this.appBuilder_;
            if (xaVar2 == null) {
                context.app_ = this.app_;
            } else {
                context.app_ = (App) xaVar2.build();
            }
            xa xaVar3 = this.userBuilder_;
            if (xaVar3 == null) {
                context.user_ = this.user_;
            } else {
                context.user_ = (User) xaVar3.build();
            }
            xa xaVar4 = this.deviceBuilder_;
            if (xaVar4 == null) {
                context.device_ = this.device_;
            } else {
                context.device_ = (Device) xaVar4.build();
            }
            xa xaVar5 = this.sessionBuilder_;
            if (xaVar5 == null) {
                context.session_ = this.session_;
            } else {
                context.session_ = (Session) xaVar5.build();
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

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(gc gcVar) {
            return (Builder) super.mergeUnknownFields(gcVar);
        }

        private Builder() {
            super(null);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.sdkBuilder_ == null) {
                this.sdk_ = null;
            } else {
                this.sdk_ = null;
                this.sdkBuilder_ = null;
            }
            if (this.appBuilder_ == null) {
                this.app_ = null;
            } else {
                this.app_ = null;
                this.appBuilder_ = null;
            }
            if (this.userBuilder_ == null) {
                this.user_ = null;
            } else {
                this.user_ = null;
                this.userBuilder_ = null;
            }
            if (this.deviceBuilder_ == null) {
                this.device_ = null;
            } else {
                this.device_ = null;
                this.deviceBuilder_ = null;
            }
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
                return this;
            }
            this.session_ = null;
            this.sessionBuilder_ = null;
            return this;
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

        public Builder setSdk(SDK.Builder builder) {
            xa xaVar = this.sdkBuilder_;
            if (xaVar == null) {
                this.sdk_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setSession(Session.Builder builder) {
            xa xaVar = this.sessionBuilder_;
            if (xaVar == null) {
                this.session_ = builder.build();
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

        public Builder mergeFrom(Context context) {
            if (context == Context.getDefaultInstance()) {
                return this;
            }
            if (context.hasSdk()) {
                mergeSdk(context.getSdk());
            }
            if (context.hasApp()) {
                mergeApp(context.getApp());
            }
            if (context.hasUser()) {
                mergeUser(context.getUser());
            }
            if (context.hasDevice()) {
                mergeDevice(context.getDevice());
            }
            if (context.hasSession()) {
                mergeSession(context.getSession());
            }
            mergeUnknownFields(((k7) context).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.sdk.Context.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.Context.access$1000()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.Context r3 = (io.bidmachine.protobuf.sdk.Context) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.Context r4 = (io.bidmachine.protobuf.sdk.Context) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.Context.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.Context$Builder");
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

    private Context(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            SDK sdk = this.sdk_;
                            SDK.Builder builder = sdk != null ? sdk.toBuilder() : null;
                            SDK sdk2 = (SDK) yVar.readMessage(SDK.parser(), m5Var);
                            this.sdk_ = sdk2;
                            if (builder != null) {
                                builder.mergeFrom(sdk2);
                                this.sdk_ = builder.buildPartial();
                            }
                        } else if (tag == 18) {
                            App app = this.app_;
                            App.Builder builder2 = app != null ? app.toBuilder() : null;
                            App app2 = (App) yVar.readMessage(App.parser(), m5Var);
                            this.app_ = app2;
                            if (builder2 != null) {
                                builder2.mergeFrom(app2);
                                this.app_ = builder2.buildPartial();
                            }
                        } else if (tag == 26) {
                            User user = this.user_;
                            User.Builder builder3 = user != null ? user.toBuilder() : null;
                            User user2 = (User) yVar.readMessage(User.parser(), m5Var);
                            this.user_ = user2;
                            if (builder3 != null) {
                                builder3.mergeFrom(user2);
                                this.user_ = builder3.buildPartial();
                            }
                        } else if (tag == 34) {
                            Device device = this.device_;
                            Device.Builder builder4 = device != null ? device.toBuilder() : null;
                            Device device2 = (Device) yVar.readMessage(Device.parser(), m5Var);
                            this.device_ = device2;
                            if (builder4 != null) {
                                builder4.mergeFrom(device2);
                                this.device_ = builder4.buildPartial();
                            }
                        } else if (tag != 42) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            Session session = this.session_;
                            Session.Builder builder5 = session != null ? session.toBuilder() : null;
                            Session session2 = (Session) yVar.readMessage(Session.parser(), m5Var);
                            this.session_ = session2;
                            if (builder5 != null) {
                                builder5.mergeFrom(session2);
                                this.session_ = builder5.buildPartial();
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
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context) k7.parseWithIOException(PARSER, inputStream);
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
