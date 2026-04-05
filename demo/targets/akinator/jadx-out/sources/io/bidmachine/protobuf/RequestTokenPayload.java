package io.bidmachine.protobuf;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
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
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.jb;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.xa;
import com.explorestack.protobuf.xc;
import com.explorestack.protobuf.y;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import h2.rl.UeklptUrP;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementOrBuilder;
import io.bidmachine.protobuf.sdk.App;
import io.bidmachine.protobuf.sdk.AppOrBuilder;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.protobuf.sdk.DeviceOrBuilder;
import io.bidmachine.protobuf.sdk.Placement;
import io.bidmachine.protobuf.sdk.PlacementOrBuilder;
import io.bidmachine.protobuf.sdk.SDK;
import io.bidmachine.protobuf.sdk.SDKOrBuilder;
import io.bidmachine.protobuf.sdk.Session;
import io.bidmachine.protobuf.sdk.User;
import io.bidmachine.protobuf.sdk.UserOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class RequestTokenPayload extends k7 implements RequestTokenPayloadOrBuilder {
    public static final int AD_TYPE_FIELD_NUMBER = 10;
    public static final int APP_DATA_FIELD_NUMBER = 6;
    public static final int CUSTOM_DATA_FIELD_NUMBER = 4;
    public static final int DEVICE_DATA_FIELD_NUMBER = 3;
    public static final int EXT_FIELD_NUMBER = 7;
    public static final int HB_PLACEMENT_FIELD_NUMBER = 9;
    public static final int PLACEMENT_DATA_FIELD_NUMBER = 1;
    public static final int PLACEMENT_FIELD_NUMBER = 12;
    public static final int SESSION_DATA_FIELD_NUMBER = 2;
    public static final int SESSION_FIELD_NUMBER = 11;
    public static final int TOKEN_HASH_VALUE_FIELD_NUMBER = 8;
    public static final int USER_DATA_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private volatile Object adType_;
    private App appData_;
    private b9 customData_;
    private Device deviceData_;
    private Struct ext_;
    private HeaderBiddingPlacement hbPlacement_;
    private byte memoizedIsInitialized;
    private SDK placementData_;
    private Placement placement_;
    private SessionData sessionData_;
    private io.bidmachine.protobuf.sdk.Session session_;
    private volatile Object tokenHashValue_;
    private User userData_;
    private static final RequestTokenPayload DEFAULT_INSTANCE = new RequestTokenPayload();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.RequestTokenPayload.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public RequestTokenPayload parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new RequestTokenPayload(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CustomDataDefaultEntryHolder {
        static final s8 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_descriptor;
            xc xcVar = bd.f21956f;
            defaultEntry = s8.newDefaultInstance(descriptor, xcVar, "", xcVar, "");
        }

        private CustomDataDefaultEntryHolder() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SessionData extends k7 implements SessionDataOrBuilder {
        private static final SessionData DEFAULT_INSTANCE = new SessionData();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.RequestTokenPayload.SessionData.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public SessionData parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new SessionData(yVar, m5Var);
            }
        };
        public static final int SESSIONDURATION_FIELD_NUMBER = 2;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        public static final int SESSION_PLACEMENT_DATA_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object sessionId_;
        private b9 sessionPlacementData_;
        private long sessionduration_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class SessionPlacementData extends k7 implements SessionPlacementDataOrBuilder {
            public static final int CLICKRATE_FIELD_NUMBER = 5;
            public static final int COMPLETIONRATE_FIELD_NUMBER = 7;
            public static final int IMPDEPTH_FIELD_NUMBER = 1;
            public static final int LASTADOMAIN_FIELD_NUMBER = 4;
            public static final int LASTBUNDLE_FIELD_NUMBER = 3;
            public static final int LASTCLICK_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private float clickrate_;
            private float completionrate_;
            private int impdepth_;
            private volatile Object lastadomain_;
            private volatile Object lastbundle_;
            private boolean lastclick_;
            private byte memoizedIsInitialized;
            private static final SessionPlacementData DEFAULT_INSTANCE = new SessionPlacementData();
            private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.1
                @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
                public SessionPlacementData parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                    return new SessionPlacementData(yVar, m5Var);
                }
            };

            public static SessionPlacementData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SessionPlacementData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (SessionPlacementData) k7.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SessionPlacementData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(byteBuffer);
            }

            public static fa parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SessionPlacementData)) {
                    return super.equals(obj);
                }
                SessionPlacementData sessionPlacementData = (SessionPlacementData) obj;
                return getImpdepth() == sessionPlacementData.getImpdepth() && getLastbundle().equals(sessionPlacementData.getLastbundle()) && getLastadomain().equals(sessionPlacementData.getLastadomain()) && Float.floatToIntBits(getClickrate()) == Float.floatToIntBits(sessionPlacementData.getClickrate()) && getLastclick() == sessionPlacementData.getLastclick() && Float.floatToIntBits(getCompletionrate()) == Float.floatToIntBits(sessionPlacementData.getCompletionrate()) && this.unknownFields.equals(sessionPlacementData.unknownFields);
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public float getClickrate() {
                return this.clickrate_;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public float getCompletionrate() {
                return this.completionrate_;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public int getImpdepth() {
                return this.impdepth_;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public String getLastadomain() {
                Object obj = this.lastadomain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastadomain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public ByteString getLastadomainBytes() {
                Object obj = this.lastadomain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastadomain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public String getLastbundle() {
                Object obj = this.lastbundle_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastbundle_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public ByteString getLastbundleBytes() {
                Object obj = this.lastbundle_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastbundle_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
            public boolean getLastclick() {
                return this.lastclick_;
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
                int i11 = this.impdepth_;
                int iComputeUInt32Size = i11 != 0 ? h0.computeUInt32Size(1, i11) : 0;
                if (!getLastbundleBytes().isEmpty()) {
                    iComputeUInt32Size += k7.computeStringSize(3, this.lastbundle_);
                }
                if (!getLastadomainBytes().isEmpty()) {
                    iComputeUInt32Size += k7.computeStringSize(4, this.lastadomain_);
                }
                float f10 = this.clickrate_;
                if (f10 != 0.0f) {
                    iComputeUInt32Size += h0.computeFloatSize(5, f10);
                }
                boolean z10 = this.lastclick_;
                if (z10) {
                    iComputeUInt32Size += h0.computeBoolSize(6, z10);
                }
                float f11 = this.completionrate_;
                if (f11 != 0.0f) {
                    iComputeUInt32Size += h0.computeFloatSize(7, f11);
                }
                int serializedSize = this.unknownFields.getSerializedSize() + iComputeUInt32Size;
                this.memoizedSize = serializedSize;
                return serializedSize;
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
                int iHashCode = this.unknownFields.hashCode() + ((Float.floatToIntBits(getCompletionrate()) + ((((x7.hashBoolean(getLastclick()) + ((((Float.floatToIntBits(getClickrate()) + ((((getLastadomain().hashCode() + ((((getLastbundle().hashCode() + ((((getImpdepth() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.explorestack.protobuf.k7
            public i7 internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionPlacementData.class, Builder.class);
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
                return new SessionPlacementData();
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(h0 h0Var) throws IOException {
                int i10 = this.impdepth_;
                if (i10 != 0) {
                    h0Var.writeUInt32(1, i10);
                }
                if (!getLastbundleBytes().isEmpty()) {
                    k7.writeString(h0Var, 3, this.lastbundle_);
                }
                if (!getLastadomainBytes().isEmpty()) {
                    k7.writeString(h0Var, 4, this.lastadomain_);
                }
                float f10 = this.clickrate_;
                if (f10 != 0.0f) {
                    h0Var.writeFloat(5, f10);
                }
                boolean z10 = this.lastclick_;
                if (z10) {
                    h0Var.writeBool(6, z10);
                }
                float f11 = this.completionrate_;
                if (f11 != 0.0f) {
                    h0Var.writeFloat(7, f11);
                }
                this.unknownFields.writeTo(h0Var);
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends o6 implements SessionPlacementDataOrBuilder {
                private float clickrate_;
                private float completionrate_;
                private int impdepth_;
                private Object lastadomain_;
                private Object lastbundle_;
                private boolean lastclick_;

                private Builder() {
                    super(null);
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = k7.alwaysUseFieldBuilders;
                }

                public Builder clearClickrate() {
                    this.clickrate_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearCompletionrate() {
                    this.completionrate_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearImpdepth() {
                    this.impdepth_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLastadomain() {
                    this.lastadomain_ = SessionPlacementData.getDefaultInstance().getLastadomain();
                    onChanged();
                    return this;
                }

                public Builder clearLastbundle() {
                    this.lastbundle_ = SessionPlacementData.getDefaultInstance().getLastbundle();
                    onChanged();
                    return this;
                }

                public Builder clearLastclick() {
                    this.lastclick_ = false;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public float getClickrate() {
                    return this.clickrate_;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public float getCompletionrate() {
                    return this.completionrate_;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public int getImpdepth() {
                    return this.impdepth_;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public String getLastadomain() {
                    Object obj = this.lastadomain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lastadomain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public ByteString getLastadomainBytes() {
                    Object obj = this.lastadomain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lastadomain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public String getLastbundle() {
                    Object obj = this.lastbundle_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lastbundle_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public ByteString getLastbundleBytes() {
                    Object obj = this.lastbundle_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lastbundle_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataOrBuilder
                public boolean getLastclick() {
                    return this.lastclick_;
                }

                @Override // com.explorestack.protobuf.o6
                public i7 internalGetFieldAccessorTable() {
                    return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionPlacementData.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setClickrate(float f10) {
                    this.clickrate_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setCompletionrate(float f10) {
                    this.completionrate_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setImpdepth(int i10) {
                    this.impdepth_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLastadomain(String str) {
                    str.getClass();
                    this.lastadomain_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLastadomainBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    b.checkByteStringIsUtf8(byteString);
                    this.lastadomain_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLastbundle(String str) {
                    str.getClass();
                    this.lastbundle_ = str;
                    onChanged();
                    return this;
                }

                public Builder setLastbundleBytes(ByteString byteString) throws IllegalArgumentException {
                    byteString.getClass();
                    b.checkByteStringIsUtf8(byteString);
                    this.lastbundle_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setLastclick(boolean z10) {
                    this.lastclick_ = z10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public SessionPlacementData build() {
                    SessionPlacementData sessionPlacementDataBuildPartial = buildPartial();
                    if (sessionPlacementDataBuildPartial.isInitialized()) {
                        return sessionPlacementDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionPlacementDataBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public SessionPlacementData buildPartial() {
                    SessionPlacementData sessionPlacementData = new SessionPlacementData(this);
                    sessionPlacementData.impdepth_ = this.impdepth_;
                    sessionPlacementData.lastbundle_ = this.lastbundle_;
                    sessionPlacementData.lastadomain_ = this.lastadomain_;
                    sessionPlacementData.clickrate_ = this.clickrate_;
                    sessionPlacementData.lastclick_ = this.lastclick_;
                    sessionPlacementData.completionrate_ = this.completionrate_;
                    onBuilt();
                    return sessionPlacementData;
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                public SessionPlacementData getDefaultInstanceForType() {
                    return SessionPlacementData.getDefaultInstance();
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
                    this.impdepth_ = 0;
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    this.clickrate_ = 0.0f;
                    this.lastclick_ = false;
                    this.completionrate_ = 0.0f;
                    return this;
                }

                private Builder(p6 p6Var) {
                    super(p6Var);
                    this.lastbundle_ = "";
                    this.lastadomain_ = "";
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
                /* renamed from: clone */
                public Builder mo500clone() {
                    return (Builder) super.mo500clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SessionPlacementData) {
                        return mergeFrom((SessionPlacementData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(SessionPlacementData sessionPlacementData) {
                    if (sessionPlacementData == SessionPlacementData.getDefaultInstance()) {
                        return this;
                    }
                    if (sessionPlacementData.getImpdepth() != 0) {
                        setImpdepth(sessionPlacementData.getImpdepth());
                    }
                    if (!sessionPlacementData.getLastbundle().isEmpty()) {
                        this.lastbundle_ = sessionPlacementData.lastbundle_;
                        onChanged();
                    }
                    if (!sessionPlacementData.getLastadomain().isEmpty()) {
                        this.lastadomain_ = sessionPlacementData.lastadomain_;
                        onChanged();
                    }
                    if (sessionPlacementData.getClickrate() != 0.0f) {
                        setClickrate(sessionPlacementData.getClickrate());
                    }
                    if (sessionPlacementData.getLastclick()) {
                        setLastclick(sessionPlacementData.getLastclick());
                    }
                    if (sessionPlacementData.getCompletionrate() != 0.0f) {
                        setCompletionrate(sessionPlacementData.getCompletionrate());
                    }
                    mergeUnknownFields(((k7) sessionPlacementData).unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.access$1100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                        io.bidmachine.protobuf.RequestTokenPayload$SessionData$SessionPlacementData r3 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                        io.bidmachine.protobuf.RequestTokenPayload$SessionData$SessionPlacementData r4 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData) r4     // Catch: java.lang.Throwable -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.RequestTokenPayload$SessionData$SessionPlacementData$Builder");
                }
            }

            public static Builder newBuilder(SessionPlacementData sessionPlacementData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionPlacementData);
            }

            public static SessionPlacementData parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(byteBuffer, m5Var);
            }

            private SessionPlacementData(o6 o6Var) {
                super(o6Var);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static SessionPlacementData parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (SessionPlacementData) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
            }

            public static SessionPlacementData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public SessionPlacementData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static SessionPlacementData parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(byteString, m5Var);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private SessionPlacementData() {
                this.memoizedIsInitialized = (byte) -1;
                this.lastbundle_ = "";
                this.lastadomain_ = "";
            }

            public static SessionPlacementData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.k7
            public Builder newBuilderForType(p6 p6Var) {
                return new Builder(p6Var);
            }

            public static SessionPlacementData parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
                return (SessionPlacementData) PARSER.parseFrom(bArr, m5Var);
            }

            public static SessionPlacementData parseFrom(InputStream inputStream) throws IOException {
                return (SessionPlacementData) k7.parseWithIOException(PARSER, inputStream);
            }

            private SessionPlacementData(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.impdepth_ = yVar.readUInt32();
                                } else if (tag == 26) {
                                    this.lastbundle_ = yVar.readStringRequireUtf8();
                                } else if (tag == 34) {
                                    this.lastadomain_ = yVar.readStringRequireUtf8();
                                } else if (tag == 45) {
                                    this.clickrate_ = yVar.readFloat();
                                } else if (tag == 48) {
                                    this.lastclick_ = yVar.readBool();
                                } else if (tag != 61) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    this.completionrate_ = yVar.readFloat();
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

            public static SessionPlacementData parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
                return (SessionPlacementData) k7.parseWithIOException(PARSER, inputStream, m5Var);
            }

            public static SessionPlacementData parseFrom(y yVar) throws IOException {
                return (SessionPlacementData) k7.parseWithIOException(PARSER, yVar);
            }

            public static SessionPlacementData parseFrom(y yVar, m5 m5Var) throws IOException {
                return (SessionPlacementData) k7.parseWithIOException(PARSER, yVar, m5Var);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class SessionPlacementDataDefaultEntryHolder {
            static final s8 defaultEntry = s8.newDefaultInstance(CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_descriptor, bd.f21956f, "", bd.f21958h, SessionPlacementData.getDefaultInstance());

            private SessionPlacementDataDefaultEntryHolder() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface SessionPlacementDataOrBuilder extends MessageOrBuilder {
            float getClickrate();

            float getCompletionrate();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ MessageLite getDefaultInstanceForType();

            int getImpdepth();

            String getLastadomain();

            ByteString getLastadomainBytes();

            String getLastbundle();

            ByteString getLastbundleBytes();

            boolean getLastclick();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static SessionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b9 internalGetSessionPlacementData() {
            b9 b9Var = this.sessionPlacementData_;
            return b9Var == null ? b9.emptyMapField(SessionPlacementDataDefaultEntryHolder.defaultEntry) : b9Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionData) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public boolean containsSessionPlacementData(String str) {
            str.getClass();
            return internalGetSessionPlacementData().getMap().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionData)) {
                return super.equals(obj);
            }
            SessionData sessionData = (SessionData) obj;
            return getSessionId().equals(sessionData.getSessionId()) && getSessionduration() == sessionData.getSessionduration() && internalGetSessionPlacementData().equals(sessionData.internalGetSessionPlacementData()) && this.unknownFields.equals(sessionData.unknownFields);
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
            int iComputeStringSize = !getSessionIdBytes().isEmpty() ? k7.computeStringSize(1, this.sessionId_) : 0;
            long j10 = this.sessionduration_;
            if (j10 != 0) {
                iComputeStringSize += h0.computeUInt64Size(2, j10);
            }
            Iterator itN = a.n(internalGetSessionPlacementData());
            while (itN.hasNext()) {
                Map.Entry entry = (Map.Entry) itN.next();
                iComputeStringSize = a.g(entry, SessionPlacementDataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 3, iComputeStringSize);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public String getSessionId() {
            Object obj = this.sessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sessionId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public ByteString getSessionIdBytes() {
            Object obj = this.sessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        @Deprecated
        public Map<String, SessionPlacementData> getSessionPlacementData() {
            return getSessionPlacementDataMap();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public int getSessionPlacementDataCount() {
            return internalGetSessionPlacementData().getMap().size();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public Map<String, SessionPlacementData> getSessionPlacementDataMap() {
            return internalGetSessionPlacementData().getMap();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionPlacementData sessionPlacementData) {
            str.getClass();
            Map<Object, Object> map = internalGetSessionPlacementData().getMap();
            return map.containsKey(str) ? (SessionPlacementData) map.get(str) : sessionPlacementData;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public SessionPlacementData getSessionPlacementDataOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetSessionPlacementData().getMap();
            if (map.containsKey(str)) {
                return (SessionPlacementData) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
        public long getSessionduration() {
            return this.sessionduration_;
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
            int iHashLong = x7.hashLong(getSessionduration()) + ((((getSessionId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
            if (!internalGetSessionPlacementData().getMap().isEmpty()) {
                iHashLong = o2.B(iHashLong, 37, 3, 53) + internalGetSessionPlacementData().hashCode();
            }
            int iHashCode = this.unknownFields.hashCode() + (iHashLong * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionData.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.k7
        public b9 internalGetMapField(int i10) {
            if (i10 == 3) {
                return internalGetSessionPlacementData();
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
            return new SessionData();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getSessionIdBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.sessionId_);
            }
            long j10 = this.sessionduration_;
            if (j10 != 0) {
                h0Var.writeUInt64(2, j10);
            }
            k7.serializeStringMapTo(h0Var, internalGetSessionPlacementData(), SessionPlacementDataDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements SessionDataOrBuilder {
            private int bitField0_;
            private Object sessionId_;
            private b9 sessionPlacementData_;
            private long sessionduration_;

            private Builder() {
                super(null);
                this.sessionId_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
            }

            private b9 internalGetMutableSessionPlacementData() {
                onChanged();
                if (this.sessionPlacementData_ == null) {
                    this.sessionPlacementData_ = b9.newMapField(SessionPlacementDataDefaultEntryHolder.defaultEntry);
                }
                if (!this.sessionPlacementData_.isMutable()) {
                    this.sessionPlacementData_ = this.sessionPlacementData_.copy();
                }
                return this.sessionPlacementData_;
            }

            private b9 internalGetSessionPlacementData() {
                b9 b9Var = this.sessionPlacementData_;
                return b9Var == null ? b9.emptyMapField(SessionPlacementDataDefaultEntryHolder.defaultEntry) : b9Var;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearSessionId() {
                this.sessionId_ = SessionData.getDefaultInstance().getSessionId();
                onChanged();
                return this;
            }

            public Builder clearSessionPlacementData() {
                internalGetMutableSessionPlacementData().getMutableMap().clear();
                return this;
            }

            public Builder clearSessionduration() {
                this.sessionduration_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public boolean containsSessionPlacementData(String str) {
                str.getClass();
                return internalGetSessionPlacementData().getMap().containsKey(str);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
            }

            @Deprecated
            public Map<String, SessionPlacementData> getMutableSessionPlacementData() {
                return internalGetMutableSessionPlacementData().getMutableMap();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public String getSessionId() {
                Object obj = this.sessionId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sessionId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public ByteString getSessionIdBytes() {
                Object obj = this.sessionId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sessionId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            @Deprecated
            public Map<String, SessionPlacementData> getSessionPlacementData() {
                return getSessionPlacementDataMap();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public int getSessionPlacementDataCount() {
                return internalGetSessionPlacementData().getMap().size();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public Map<String, SessionPlacementData> getSessionPlacementDataMap() {
                return internalGetSessionPlacementData().getMap();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionPlacementData sessionPlacementData) {
                str.getClass();
                Map<Object, Object> map = internalGetSessionPlacementData().getMap();
                return map.containsKey(str) ? (SessionPlacementData) map.get(str) : sessionPlacementData;
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public SessionPlacementData getSessionPlacementDataOrThrow(String str) {
                str.getClass();
                Map<Object, Object> map = internalGetSessionPlacementData().getMap();
                if (map.containsKey(str)) {
                    return (SessionPlacementData) map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // io.bidmachine.protobuf.RequestTokenPayload.SessionDataOrBuilder
            public long getSessionduration() {
                return this.sessionduration_;
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionData.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMapField(int i10) {
                if (i10 == 3) {
                    return internalGetSessionPlacementData();
                }
                throw new RuntimeException(a.b.e(i10, UeklptUrP.vwNLw));
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMutableMapField(int i10) {
                if (i10 == 3) {
                    return internalGetMutableSessionPlacementData();
                }
                throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAllSessionPlacementData(Map<String, SessionPlacementData> map) {
                internalGetMutableSessionPlacementData().getMutableMap().putAll(map);
                return this;
            }

            public Builder putSessionPlacementData(String str, SessionPlacementData sessionPlacementData) {
                str.getClass();
                sessionPlacementData.getClass();
                internalGetMutableSessionPlacementData().getMutableMap().put(str, sessionPlacementData);
                return this;
            }

            public Builder removeSessionPlacementData(String str) {
                str.getClass();
                internalGetMutableSessionPlacementData().getMutableMap().remove(str);
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

            public Builder setSessionduration(long j10) {
                this.sessionduration_ = j10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionData build() {
                SessionData sessionDataBuildPartial = buildPartial();
                if (sessionDataBuildPartial.isInitialized()) {
                    return sessionDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionDataBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionData buildPartial() {
                SessionData sessionData = new SessionData(this);
                sessionData.sessionId_ = this.sessionId_;
                sessionData.sessionduration_ = this.sessionduration_;
                sessionData.sessionPlacementData_ = internalGetSessionPlacementData();
                sessionData.sessionPlacementData_.makeImmutable();
                onBuilt();
                return sessionData;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public SessionData getDefaultInstanceForType() {
                return SessionData.getDefaultInstance();
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
                this.sessionId_ = "";
                this.sessionduration_ = 0L;
                internalGetMutableSessionPlacementData().clear();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.sessionId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionData) {
                    return mergeFrom((SessionData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionData sessionData) {
                if (sessionData == SessionData.getDefaultInstance()) {
                    return this;
                }
                if (!sessionData.getSessionId().isEmpty()) {
                    this.sessionId_ = sessionData.sessionId_;
                    onChanged();
                }
                if (sessionData.getSessionduration() != 0) {
                    setSessionduration(sessionData.getSessionduration());
                }
                internalGetMutableSessionPlacementData().mergeFrom(sessionData.internalGetSessionPlacementData());
                mergeUnknownFields(((k7) sessionData).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.RequestTokenPayload.SessionData.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.RequestTokenPayload.SessionData.access$2400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.RequestTokenPayload$SessionData r3 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.RequestTokenPayload$SessionData r4 = (io.bidmachine.protobuf.RequestTokenPayload.SessionData) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.SessionData.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.RequestTokenPayload$SessionData$Builder");
            }
        }

        public static Builder newBuilder(SessionData sessionData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionData);
        }

        public static SessionData parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private SessionData(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionData parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (SessionData) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static SessionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public SessionData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SessionData parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SessionData() {
            this.memoizedIsInitialized = (byte) -1;
            this.sessionId_ = "";
        }

        public static SessionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static SessionData parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (SessionData) PARSER.parseFrom(bArr, m5Var);
        }

        public static SessionData parseFrom(InputStream inputStream) throws IOException {
            return (SessionData) k7.parseWithIOException(PARSER, inputStream);
        }

        private SessionData(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                    this.sessionId_ = yVar.readStringRequireUtf8();
                                } else if (tag == 16) {
                                    this.sessionduration_ = yVar.readUInt64();
                                } else if (tag != 26) {
                                    if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    }
                                } else {
                                    if (!z11) {
                                        this.sessionPlacementData_ = b9.newMapField(SessionPlacementDataDefaultEntryHolder.defaultEntry);
                                        z11 = true;
                                    }
                                    s8 s8Var = (s8) yVar.readMessage(SessionPlacementDataDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                    this.sessionPlacementData_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
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
                    this.unknownFields = ccVarNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = ccVarNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static SessionData parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (SessionData) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static SessionData parseFrom(y yVar) throws IOException {
            return (SessionData) k7.parseWithIOException(PARSER, yVar);
        }

        public static SessionData parseFrom(y yVar, m5 m5Var) throws IOException {
            return (SessionData) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface SessionDataOrBuilder extends MessageOrBuilder {
        boolean containsSessionPlacementData(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getSessionId();

        ByteString getSessionIdBytes();

        @Deprecated
        Map<String, SessionData.SessionPlacementData> getSessionPlacementData();

        int getSessionPlacementDataCount();

        Map<String, SessionData.SessionPlacementData> getSessionPlacementDataMap();

        SessionData.SessionPlacementData getSessionPlacementDataOrDefault(String str, SessionData.SessionPlacementData sessionPlacementData);

        SessionData.SessionPlacementData getSessionPlacementDataOrThrow(String str);

        long getSessionduration();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static RequestTokenPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b9 internalGetCustomData() {
        b9 b9Var = this.customData_;
        return b9Var == null ? b9.emptyMapField(CustomDataDefaultEntryHolder.defaultEntry) : b9Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static RequestTokenPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestTokenPayload) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RequestTokenPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public boolean containsCustomData(String str) {
        str.getClass();
        return internalGetCustomData().getMap().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestTokenPayload)) {
            return super.equals(obj);
        }
        RequestTokenPayload requestTokenPayload = (RequestTokenPayload) obj;
        if (!getTokenHashValue().equals(requestTokenPayload.getTokenHashValue()) || !getAdType().equals(requestTokenPayload.getAdType()) || hasPlacementData() != requestTokenPayload.hasPlacementData()) {
            return false;
        }
        if ((hasPlacementData() && !getPlacementData().equals(requestTokenPayload.getPlacementData())) || hasSessionData() != requestTokenPayload.hasSessionData()) {
            return false;
        }
        if ((hasSessionData() && !getSessionData().equals(requestTokenPayload.getSessionData())) || hasSession() != requestTokenPayload.hasSession()) {
            return false;
        }
        if ((hasSession() && !getSession().equals(requestTokenPayload.getSession())) || hasDeviceData() != requestTokenPayload.hasDeviceData()) {
            return false;
        }
        if ((hasDeviceData() && !getDeviceData().equals(requestTokenPayload.getDeviceData())) || hasUserData() != requestTokenPayload.hasUserData()) {
            return false;
        }
        if ((hasUserData() && !getUserData().equals(requestTokenPayload.getUserData())) || hasAppData() != requestTokenPayload.hasAppData()) {
            return false;
        }
        if ((hasAppData() && !getAppData().equals(requestTokenPayload.getAppData())) || hasHbPlacement() != requestTokenPayload.hasHbPlacement()) {
            return false;
        }
        if ((hasHbPlacement() && !getHbPlacement().equals(requestTokenPayload.getHbPlacement())) || !internalGetCustomData().equals(requestTokenPayload.internalGetCustomData()) || hasPlacement() != requestTokenPayload.hasPlacement()) {
            return false;
        }
        if ((!hasPlacement() || getPlacement().equals(requestTokenPayload.getPlacement())) && hasExt() == requestTokenPayload.hasExt()) {
            return (!hasExt() || getExt().equals(requestTokenPayload.getExt())) && this.unknownFields.equals(requestTokenPayload.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public String getAdType() {
        Object obj = this.adType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.adType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public ByteString getAdTypeBytes() {
        Object obj = this.adType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.adType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public App getAppData() {
        App app = this.appData_;
        return app == null ? App.getDefaultInstance() : app;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public AppOrBuilder getAppDataOrBuilder() {
        return getAppData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public Map<String, String> getCustomData() {
        return getCustomDataMap();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public int getCustomDataCount() {
        return internalGetCustomData().getMap().size();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public Map<String, String> getCustomDataMap() {
        return internalGetCustomData().getMap();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public String getCustomDataOrDefault(String str, String str2) {
        str.getClass();
        Map<Object, Object> map = internalGetCustomData().getMap();
        return map.containsKey(str) ? (String) map.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public String getCustomDataOrThrow(String str) {
        str.getClass();
        Map<Object, Object> map = internalGetCustomData().getMap();
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public Device getDeviceData() {
        Device device = this.deviceData_;
        return device == null ? Device.getDefaultInstance() : device;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public DeviceOrBuilder getDeviceDataOrBuilder() {
        return getDeviceData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public jb getExtOrBuilder() {
        return getExt();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public HeaderBiddingPlacement getHbPlacement() {
        HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
        return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
        return getHbPlacement();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public Placement getPlacement() {
        Placement placement = this.placement_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public SDK getPlacementData() {
        SDK sdk = this.placementData_;
        return sdk == null ? SDK.getDefaultInstance() : sdk;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public SDKOrBuilder getPlacementDataOrBuilder() {
        return getPlacementData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public PlacementOrBuilder getPlacementOrBuilder() {
        return getPlacement();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = this.placementData_ != null ? h0.computeMessageSize(1, getPlacementData()) : 0;
        if (this.sessionData_ != null) {
            iComputeMessageSize += h0.computeMessageSize(2, getSessionData());
        }
        if (this.deviceData_ != null) {
            iComputeMessageSize += h0.computeMessageSize(3, getDeviceData());
        }
        Iterator itN = a.n(internalGetCustomData());
        while (itN.hasNext()) {
            Map.Entry entry = (Map.Entry) itN.next();
            iComputeMessageSize = a.g(entry, CustomDataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 4, iComputeMessageSize);
        }
        if (this.userData_ != null) {
            iComputeMessageSize += h0.computeMessageSize(5, getUserData());
        }
        if (this.appData_ != null) {
            iComputeMessageSize += h0.computeMessageSize(6, getAppData());
        }
        if (this.ext_ != null) {
            iComputeMessageSize += h0.computeMessageSize(7, getExt());
        }
        if (!getTokenHashValueBytes().isEmpty()) {
            iComputeMessageSize += k7.computeStringSize(8, this.tokenHashValue_);
        }
        if (this.hbPlacement_ != null) {
            iComputeMessageSize += h0.computeMessageSize(9, getHbPlacement());
        }
        if (!getAdTypeBytes().isEmpty()) {
            iComputeMessageSize += k7.computeStringSize(10, this.adType_);
        }
        if (this.session_ != null) {
            iComputeMessageSize += h0.computeMessageSize(11, getSession());
        }
        if (this.placement_ != null) {
            iComputeMessageSize += h0.computeMessageSize(12, getPlacement());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public io.bidmachine.protobuf.sdk.Session getSession() {
        io.bidmachine.protobuf.sdk.Session session = this.session_;
        return session == null ? io.bidmachine.protobuf.sdk.Session.getDefaultInstance() : session;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public SessionData getSessionData() {
        SessionData sessionData = this.sessionData_;
        return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public SessionDataOrBuilder getSessionDataOrBuilder() {
        return getSessionData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public io.bidmachine.protobuf.sdk.SessionOrBuilder getSessionOrBuilder() {
        return getSession();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public String getTokenHashValue() {
        Object obj = this.tokenHashValue_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.tokenHashValue_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public ByteString getTokenHashValueBytes() {
        Object obj = this.tokenHashValue_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.tokenHashValue_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public User getUserData() {
        User user = this.userData_;
        return user == null ? User.getDefaultInstance() : user;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public UserOrBuilder getUserDataOrBuilder() {
        return getUserData();
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasAppData() {
        return this.appData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasDeviceData() {
        return this.deviceData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasExt() {
        return this.ext_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public boolean hasHbPlacement() {
        return this.hbPlacement_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasPlacement() {
        return this.placement_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasPlacementData() {
        return this.placementData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasSession() {
        return this.session_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    @Deprecated
    public boolean hasSessionData() {
        return this.sessionData_ != null;
    }

    @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
    public boolean hasUserData() {
        return this.userData_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getAdType().hashCode() + ((((getTokenHashValue().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 8) * 53)) * 37) + 10) * 53);
        if (hasPlacementData()) {
            iHashCode = o2.B(iHashCode, 37, 1, 53) + getPlacementData().hashCode();
        }
        if (hasSessionData()) {
            iHashCode = o2.B(iHashCode, 37, 2, 53) + getSessionData().hashCode();
        }
        if (hasSession()) {
            iHashCode = o2.B(iHashCode, 37, 11, 53) + getSession().hashCode();
        }
        if (hasDeviceData()) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + getDeviceData().hashCode();
        }
        if (hasUserData()) {
            iHashCode = o2.B(iHashCode, 37, 5, 53) + getUserData().hashCode();
        }
        if (hasAppData()) {
            iHashCode = o2.B(iHashCode, 37, 6, 53) + getAppData().hashCode();
        }
        if (hasHbPlacement()) {
            iHashCode = o2.B(iHashCode, 37, 9, 53) + getHbPlacement().hashCode();
        }
        if (!internalGetCustomData().getMap().isEmpty()) {
            iHashCode = o2.B(iHashCode, 37, 4, 53) + internalGetCustomData().hashCode();
        }
        if (hasPlacement()) {
            iHashCode = o2.B(iHashCode, 37, 12, 53) + getPlacement().hashCode();
        }
        if (hasExt()) {
            iHashCode = o2.B(iHashCode, 37, 7, 53) + getExt().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestTokenPayload.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.k7
    public b9 internalGetMapField(int i10) {
        if (i10 == 4) {
            return internalGetCustomData();
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
        return new RequestTokenPayload();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.placementData_ != null) {
            h0Var.writeMessage(1, getPlacementData());
        }
        if (this.sessionData_ != null) {
            h0Var.writeMessage(2, getSessionData());
        }
        if (this.deviceData_ != null) {
            h0Var.writeMessage(3, getDeviceData());
        }
        k7.serializeStringMapTo(h0Var, internalGetCustomData(), CustomDataDefaultEntryHolder.defaultEntry, 4);
        if (this.userData_ != null) {
            h0Var.writeMessage(5, getUserData());
        }
        if (this.appData_ != null) {
            h0Var.writeMessage(6, getAppData());
        }
        if (this.ext_ != null) {
            h0Var.writeMessage(7, getExt());
        }
        if (!getTokenHashValueBytes().isEmpty()) {
            k7.writeString(h0Var, 8, this.tokenHashValue_);
        }
        if (this.hbPlacement_ != null) {
            h0Var.writeMessage(9, getHbPlacement());
        }
        if (!getAdTypeBytes().isEmpty()) {
            k7.writeString(h0Var, 10, this.adType_);
        }
        if (this.session_ != null) {
            h0Var.writeMessage(11, getSession());
        }
        if (this.placement_ != null) {
            h0Var.writeMessage(12, getPlacement());
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements RequestTokenPayloadOrBuilder {
        private Object adType_;
        private xa appDataBuilder_;
        private App appData_;
        private int bitField0_;
        private b9 customData_;
        private xa deviceDataBuilder_;
        private Device deviceData_;
        private xa extBuilder_;
        private Struct ext_;
        private xa hbPlacementBuilder_;
        private HeaderBiddingPlacement hbPlacement_;
        private xa placementBuilder_;
        private xa placementDataBuilder_;
        private SDK placementData_;
        private Placement placement_;
        private xa sessionBuilder_;
        private xa sessionDataBuilder_;
        private SessionData sessionData_;
        private io.bidmachine.protobuf.sdk.Session session_;
        private Object tokenHashValue_;
        private xa userDataBuilder_;
        private User userData_;

        private Builder() {
            super(null);
            this.tokenHashValue_ = "";
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        private xa getAppDataFieldBuilder() {
            if (this.appDataBuilder_ == null) {
                this.appDataBuilder_ = new xa(getAppData(), getParentForChildren(), isClean());
                this.appData_ = null;
            }
            return this.appDataBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
        }

        private xa getDeviceDataFieldBuilder() {
            if (this.deviceDataBuilder_ == null) {
                this.deviceDataBuilder_ = new xa(getDeviceData(), getParentForChildren(), isClean());
                this.deviceData_ = null;
            }
            return this.deviceDataBuilder_;
        }

        private xa getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new xa(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private xa getHbPlacementFieldBuilder() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacementBuilder_ = new xa(getHbPlacement(), getParentForChildren(), isClean());
                this.hbPlacement_ = null;
            }
            return this.hbPlacementBuilder_;
        }

        private xa getPlacementDataFieldBuilder() {
            if (this.placementDataBuilder_ == null) {
                this.placementDataBuilder_ = new xa(getPlacementData(), getParentForChildren(), isClean());
                this.placementData_ = null;
            }
            return this.placementDataBuilder_;
        }

        private xa getPlacementFieldBuilder() {
            if (this.placementBuilder_ == null) {
                this.placementBuilder_ = new xa(getPlacement(), getParentForChildren(), isClean());
                this.placement_ = null;
            }
            return this.placementBuilder_;
        }

        private xa getSessionDataFieldBuilder() {
            if (this.sessionDataBuilder_ == null) {
                this.sessionDataBuilder_ = new xa(getSessionData(), getParentForChildren(), isClean());
                this.sessionData_ = null;
            }
            return this.sessionDataBuilder_;
        }

        private xa getSessionFieldBuilder() {
            if (this.sessionBuilder_ == null) {
                this.sessionBuilder_ = new xa(getSession(), getParentForChildren(), isClean());
                this.session_ = null;
            }
            return this.sessionBuilder_;
        }

        private xa getUserDataFieldBuilder() {
            if (this.userDataBuilder_ == null) {
                this.userDataBuilder_ = new xa(getUserData(), getParentForChildren(), isClean());
                this.userData_ = null;
            }
            return this.userDataBuilder_;
        }

        private b9 internalGetCustomData() {
            b9 b9Var = this.customData_;
            return b9Var == null ? b9.emptyMapField(CustomDataDefaultEntryHolder.defaultEntry) : b9Var;
        }

        private b9 internalGetMutableCustomData() {
            onChanged();
            if (this.customData_ == null) {
                this.customData_ = b9.newMapField(CustomDataDefaultEntryHolder.defaultEntry);
            }
            if (!this.customData_.isMutable()) {
                this.customData_ = this.customData_.copy();
            }
            return this.customData_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        @Deprecated
        public Builder clearAdType() {
            this.adType_ = RequestTokenPayload.getDefaultInstance().getAdType();
            onChanged();
            return this;
        }

        public Builder clearAppData() {
            if (this.appDataBuilder_ == null) {
                this.appData_ = null;
                onChanged();
                return this;
            }
            this.appData_ = null;
            this.appDataBuilder_ = null;
            return this;
        }

        @Deprecated
        public Builder clearCustomData() {
            internalGetMutableCustomData().getMutableMap().clear();
            return this;
        }

        public Builder clearDeviceData() {
            if (this.deviceDataBuilder_ == null) {
                this.deviceData_ = null;
                onChanged();
                return this;
            }
            this.deviceData_ = null;
            this.deviceDataBuilder_ = null;
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

        @Deprecated
        public Builder clearHbPlacement() {
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
                onChanged();
                return this;
            }
            this.hbPlacement_ = null;
            this.hbPlacementBuilder_ = null;
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

        public Builder clearPlacementData() {
            if (this.placementDataBuilder_ == null) {
                this.placementData_ = null;
                onChanged();
                return this;
            }
            this.placementData_ = null;
            this.placementDataBuilder_ = null;
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

        @Deprecated
        public Builder clearSessionData() {
            if (this.sessionDataBuilder_ == null) {
                this.sessionData_ = null;
                onChanged();
                return this;
            }
            this.sessionData_ = null;
            this.sessionDataBuilder_ = null;
            return this;
        }

        public Builder clearTokenHashValue() {
            this.tokenHashValue_ = RequestTokenPayload.getDefaultInstance().getTokenHashValue();
            onChanged();
            return this;
        }

        public Builder clearUserData() {
            if (this.userDataBuilder_ == null) {
                this.userData_ = null;
                onChanged();
                return this;
            }
            this.userData_ = null;
            this.userDataBuilder_ = null;
            return this;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public boolean containsCustomData(String str) {
            str.getClass();
            return internalGetCustomData().getMap().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public String getAdType() {
            Object obj = this.adType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public ByteString getAdTypeBytes() {
            Object obj = this.adType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public App getAppData() {
            xa xaVar = this.appDataBuilder_;
            if (xaVar != null) {
                return (App) xaVar.getMessage();
            }
            App app = this.appData_;
            return app == null ? App.getDefaultInstance() : app;
        }

        public App.Builder getAppDataBuilder() {
            onChanged();
            return (App.Builder) getAppDataFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public AppOrBuilder getAppDataOrBuilder() {
            xa xaVar = this.appDataBuilder_;
            if (xaVar != null) {
                return (AppOrBuilder) xaVar.getMessageOrBuilder();
            }
            App app = this.appData_;
            return app == null ? App.getDefaultInstance() : app;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public Map<String, String> getCustomData() {
            return getCustomDataMap();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public int getCustomDataCount() {
            return internalGetCustomData().getMap().size();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public Map<String, String> getCustomDataMap() {
            return internalGetCustomData().getMap();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public String getCustomDataOrDefault(String str, String str2) {
            str.getClass();
            Map<Object, Object> map = internalGetCustomData().getMap();
            return map.containsKey(str) ? (String) map.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public String getCustomDataOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetCustomData().getMap();
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public Device getDeviceData() {
            xa xaVar = this.deviceDataBuilder_;
            if (xaVar != null) {
                return (Device) xaVar.getMessage();
            }
            Device device = this.deviceData_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        public Device.Builder getDeviceDataBuilder() {
            onChanged();
            return (Device.Builder) getDeviceDataFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public DeviceOrBuilder getDeviceDataOrBuilder() {
            xa xaVar = this.deviceDataBuilder_;
            if (xaVar != null) {
                return (DeviceOrBuilder) xaVar.getMessageOrBuilder();
            }
            Device device = this.deviceData_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
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

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public jb getExtOrBuilder() {
            xa xaVar = this.extBuilder_;
            if (xaVar != null) {
                return (jb) xaVar.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public HeaderBiddingPlacement getHbPlacement() {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar != null) {
                return (HeaderBiddingPlacement) xaVar.getMessage();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        @Deprecated
        public HeaderBiddingPlacement.Builder getHbPlacementBuilder() {
            onChanged();
            return (HeaderBiddingPlacement.Builder) getHbPlacementFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public HeaderBiddingPlacementOrBuilder getHbPlacementOrBuilder() {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar != null) {
                return (HeaderBiddingPlacementOrBuilder) xaVar.getMessageOrBuilder();
            }
            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
            return headerBiddingPlacement == null ? HeaderBiddingPlacement.getDefaultInstance() : headerBiddingPlacement;
        }

        @Deprecated
        public Map<String, String> getMutableCustomData() {
            return internalGetMutableCustomData().getMutableMap();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
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

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public SDK getPlacementData() {
            xa xaVar = this.placementDataBuilder_;
            if (xaVar != null) {
                return (SDK) xaVar.getMessage();
            }
            SDK sdk = this.placementData_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        public SDK.Builder getPlacementDataBuilder() {
            onChanged();
            return (SDK.Builder) getPlacementDataFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public SDKOrBuilder getPlacementDataOrBuilder() {
            xa xaVar = this.placementDataBuilder_;
            if (xaVar != null) {
                return (SDKOrBuilder) xaVar.getMessageOrBuilder();
            }
            SDK sdk = this.placementData_;
            return sdk == null ? SDK.getDefaultInstance() : sdk;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public PlacementOrBuilder getPlacementOrBuilder() {
            xa xaVar = this.placementBuilder_;
            if (xaVar != null) {
                return (PlacementOrBuilder) xaVar.getMessageOrBuilder();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public io.bidmachine.protobuf.sdk.Session getSession() {
            xa xaVar = this.sessionBuilder_;
            if (xaVar != null) {
                return (io.bidmachine.protobuf.sdk.Session) xaVar.getMessage();
            }
            io.bidmachine.protobuf.sdk.Session session = this.session_;
            return session == null ? io.bidmachine.protobuf.sdk.Session.getDefaultInstance() : session;
        }

        public Session.Builder getSessionBuilder() {
            onChanged();
            return (Session.Builder) getSessionFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public SessionData getSessionData() {
            xa xaVar = this.sessionDataBuilder_;
            if (xaVar != null) {
                return (SessionData) xaVar.getMessage();
            }
            SessionData sessionData = this.sessionData_;
            return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
        }

        @Deprecated
        public SessionData.Builder getSessionDataBuilder() {
            onChanged();
            return (SessionData.Builder) getSessionDataFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public SessionDataOrBuilder getSessionDataOrBuilder() {
            xa xaVar = this.sessionDataBuilder_;
            if (xaVar != null) {
                return (SessionDataOrBuilder) xaVar.getMessageOrBuilder();
            }
            SessionData sessionData = this.sessionData_;
            return sessionData == null ? SessionData.getDefaultInstance() : sessionData;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public io.bidmachine.protobuf.sdk.SessionOrBuilder getSessionOrBuilder() {
            xa xaVar = this.sessionBuilder_;
            if (xaVar != null) {
                return (io.bidmachine.protobuf.sdk.SessionOrBuilder) xaVar.getMessageOrBuilder();
            }
            io.bidmachine.protobuf.sdk.Session session = this.session_;
            return session == null ? io.bidmachine.protobuf.sdk.Session.getDefaultInstance() : session;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public String getTokenHashValue() {
            Object obj = this.tokenHashValue_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tokenHashValue_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public ByteString getTokenHashValueBytes() {
            Object obj = this.tokenHashValue_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tokenHashValue_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public User getUserData() {
            xa xaVar = this.userDataBuilder_;
            if (xaVar != null) {
                return (User) xaVar.getMessage();
            }
            User user = this.userData_;
            return user == null ? User.getDefaultInstance() : user;
        }

        public User.Builder getUserDataBuilder() {
            onChanged();
            return (User.Builder) getUserDataFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public UserOrBuilder getUserDataOrBuilder() {
            xa xaVar = this.userDataBuilder_;
            if (xaVar != null) {
                return (UserOrBuilder) xaVar.getMessageOrBuilder();
            }
            User user = this.userData_;
            return user == null ? User.getDefaultInstance() : user;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasAppData() {
            return (this.appDataBuilder_ == null && this.appData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasDeviceData() {
            return (this.deviceDataBuilder_ == null && this.deviceData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public boolean hasHbPlacement() {
            return (this.hbPlacementBuilder_ == null && this.hbPlacement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasPlacement() {
            return (this.placementBuilder_ == null && this.placement_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasPlacementData() {
            return (this.placementDataBuilder_ == null && this.placementData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasSession() {
            return (this.sessionBuilder_ == null && this.session_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        @Deprecated
        public boolean hasSessionData() {
            return (this.sessionDataBuilder_ == null && this.sessionData_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.RequestTokenPayloadOrBuilder
        public boolean hasUserData() {
            return (this.userDataBuilder_ == null && this.userData_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return CacheProto.internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestTokenPayload.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMapField(int i10) {
            if (i10 == 4) {
                return internalGetCustomData();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMutableMapField(int i10) {
            if (i10 == 4) {
                return internalGetMutableCustomData();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAppData(App app) {
            xa xaVar = this.appDataBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(app);
                return this;
            }
            App app2 = this.appData_;
            if (app2 != null) {
                this.appData_ = App.newBuilder(app2).mergeFrom(app).buildPartial();
            } else {
                this.appData_ = app;
            }
            onChanged();
            return this;
        }

        public Builder mergeDeviceData(Device device) {
            xa xaVar = this.deviceDataBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(device);
                return this;
            }
            Device device2 = this.deviceData_;
            if (device2 != null) {
                this.deviceData_ = Device.newBuilder(device2).mergeFrom(device).buildPartial();
            } else {
                this.deviceData_ = device;
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
                this.ext_ = a.i(struct2, struct);
            } else {
                this.ext_ = struct;
            }
            onChanged();
            return this;
        }

        @Deprecated
        public Builder mergeHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(headerBiddingPlacement);
                return this;
            }
            HeaderBiddingPlacement headerBiddingPlacement2 = this.hbPlacement_;
            if (headerBiddingPlacement2 != null) {
                this.hbPlacement_ = HeaderBiddingPlacement.newBuilder(headerBiddingPlacement2).mergeFrom(headerBiddingPlacement).buildPartial();
            } else {
                this.hbPlacement_ = headerBiddingPlacement;
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

        public Builder mergePlacementData(SDK sdk) {
            xa xaVar = this.placementDataBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(sdk);
                return this;
            }
            SDK sdk2 = this.placementData_;
            if (sdk2 != null) {
                this.placementData_ = SDK.newBuilder(sdk2).mergeFrom(sdk).buildPartial();
            } else {
                this.placementData_ = sdk;
            }
            onChanged();
            return this;
        }

        public Builder mergeSession(io.bidmachine.protobuf.sdk.Session session) {
            xa xaVar = this.sessionBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(session);
                return this;
            }
            io.bidmachine.protobuf.sdk.Session session2 = this.session_;
            if (session2 != null) {
                this.session_ = io.bidmachine.protobuf.sdk.Session.newBuilder(session2).mergeFrom(session).buildPartial();
            } else {
                this.session_ = session;
            }
            onChanged();
            return this;
        }

        @Deprecated
        public Builder mergeSessionData(SessionData sessionData) {
            xa xaVar = this.sessionDataBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(sessionData);
                return this;
            }
            SessionData sessionData2 = this.sessionData_;
            if (sessionData2 != null) {
                this.sessionData_ = SessionData.newBuilder(sessionData2).mergeFrom(sessionData).buildPartial();
            } else {
                this.sessionData_ = sessionData;
            }
            onChanged();
            return this;
        }

        public Builder mergeUserData(User user) {
            xa xaVar = this.userDataBuilder_;
            if (xaVar != null) {
                xaVar.mergeFrom(user);
                return this;
            }
            User user2 = this.userData_;
            if (user2 != null) {
                this.userData_ = User.newBuilder(user2).mergeFrom(user).buildPartial();
            } else {
                this.userData_ = user;
            }
            onChanged();
            return this;
        }

        @Deprecated
        public Builder putAllCustomData(Map<String, String> map) {
            internalGetMutableCustomData().getMutableMap().putAll(map);
            return this;
        }

        @Deprecated
        public Builder putCustomData(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomData().getMutableMap().put(str, str2);
            return this;
        }

        @Deprecated
        public Builder removeCustomData(String str) {
            str.getClass();
            internalGetMutableCustomData().getMutableMap().remove(str);
            return this;
        }

        @Deprecated
        public Builder setAdType(String str) {
            str.getClass();
            this.adType_ = str;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setAdTypeBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.adType_ = byteString;
            onChanged();
            return this;
        }

        public Builder setAppData(App app) {
            xa xaVar = this.appDataBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(app);
                return this;
            }
            app.getClass();
            this.appData_ = app;
            onChanged();
            return this;
        }

        public Builder setDeviceData(Device device) {
            xa xaVar = this.deviceDataBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(device);
                return this;
            }
            device.getClass();
            this.deviceData_ = device;
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

        @Deprecated
        public Builder setHbPlacement(HeaderBiddingPlacement headerBiddingPlacement) {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(headerBiddingPlacement);
                return this;
            }
            headerBiddingPlacement.getClass();
            this.hbPlacement_ = headerBiddingPlacement;
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

        public Builder setPlacementData(SDK sdk) {
            xa xaVar = this.placementDataBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(sdk);
                return this;
            }
            sdk.getClass();
            this.placementData_ = sdk;
            onChanged();
            return this;
        }

        public Builder setSession(io.bidmachine.protobuf.sdk.Session session) {
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

        @Deprecated
        public Builder setSessionData(SessionData sessionData) {
            xa xaVar = this.sessionDataBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(sessionData);
                return this;
            }
            sessionData.getClass();
            this.sessionData_ = sessionData;
            onChanged();
            return this;
        }

        public Builder setTokenHashValue(String str) {
            str.getClass();
            this.tokenHashValue_ = str;
            onChanged();
            return this;
        }

        public Builder setTokenHashValueBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.tokenHashValue_ = byteString;
            onChanged();
            return this;
        }

        public Builder setUserData(User user) {
            xa xaVar = this.userDataBuilder_;
            if (xaVar != null) {
                xaVar.setMessage(user);
                return this;
            }
            user.getClass();
            this.userData_ = user;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestTokenPayload build() {
            RequestTokenPayload requestTokenPayloadBuildPartial = buildPartial();
            if (requestTokenPayloadBuildPartial.isInitialized()) {
                return requestTokenPayloadBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestTokenPayloadBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public RequestTokenPayload buildPartial() {
            RequestTokenPayload requestTokenPayload = new RequestTokenPayload(this);
            requestTokenPayload.tokenHashValue_ = this.tokenHashValue_;
            requestTokenPayload.adType_ = this.adType_;
            xa xaVar = this.placementDataBuilder_;
            if (xaVar == null) {
                requestTokenPayload.placementData_ = this.placementData_;
            } else {
                requestTokenPayload.placementData_ = (SDK) xaVar.build();
            }
            xa xaVar2 = this.sessionDataBuilder_;
            if (xaVar2 == null) {
                requestTokenPayload.sessionData_ = this.sessionData_;
            } else {
                requestTokenPayload.sessionData_ = (SessionData) xaVar2.build();
            }
            xa xaVar3 = this.sessionBuilder_;
            if (xaVar3 == null) {
                requestTokenPayload.session_ = this.session_;
            } else {
                requestTokenPayload.session_ = (io.bidmachine.protobuf.sdk.Session) xaVar3.build();
            }
            xa xaVar4 = this.deviceDataBuilder_;
            if (xaVar4 == null) {
                requestTokenPayload.deviceData_ = this.deviceData_;
            } else {
                requestTokenPayload.deviceData_ = (Device) xaVar4.build();
            }
            xa xaVar5 = this.userDataBuilder_;
            if (xaVar5 == null) {
                requestTokenPayload.userData_ = this.userData_;
            } else {
                requestTokenPayload.userData_ = (User) xaVar5.build();
            }
            xa xaVar6 = this.appDataBuilder_;
            if (xaVar6 == null) {
                requestTokenPayload.appData_ = this.appData_;
            } else {
                requestTokenPayload.appData_ = (App) xaVar6.build();
            }
            xa xaVar7 = this.hbPlacementBuilder_;
            if (xaVar7 == null) {
                requestTokenPayload.hbPlacement_ = this.hbPlacement_;
            } else {
                requestTokenPayload.hbPlacement_ = (HeaderBiddingPlacement) xaVar7.build();
            }
            requestTokenPayload.customData_ = internalGetCustomData();
            requestTokenPayload.customData_.makeImmutable();
            xa xaVar8 = this.placementBuilder_;
            if (xaVar8 == null) {
                requestTokenPayload.placement_ = this.placement_;
            } else {
                requestTokenPayload.placement_ = (Placement) xaVar8.build();
            }
            xa xaVar9 = this.extBuilder_;
            if (xaVar9 == null) {
                requestTokenPayload.ext_ = this.ext_;
            } else {
                requestTokenPayload.ext_ = (Struct) xaVar9.build();
            }
            onBuilt();
            return requestTokenPayload;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public RequestTokenPayload getDefaultInstanceForType() {
            return RequestTokenPayload.getDefaultInstance();
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
            this.tokenHashValue_ = "";
            this.adType_ = "";
            if (this.placementDataBuilder_ == null) {
                this.placementData_ = null;
            } else {
                this.placementData_ = null;
                this.placementDataBuilder_ = null;
            }
            if (this.sessionDataBuilder_ == null) {
                this.sessionData_ = null;
            } else {
                this.sessionData_ = null;
                this.sessionDataBuilder_ = null;
            }
            if (this.sessionBuilder_ == null) {
                this.session_ = null;
            } else {
                this.session_ = null;
                this.sessionBuilder_ = null;
            }
            if (this.deviceDataBuilder_ == null) {
                this.deviceData_ = null;
            } else {
                this.deviceData_ = null;
                this.deviceDataBuilder_ = null;
            }
            if (this.userDataBuilder_ == null) {
                this.userData_ = null;
            } else {
                this.userData_ = null;
                this.userDataBuilder_ = null;
            }
            if (this.appDataBuilder_ == null) {
                this.appData_ = null;
            } else {
                this.appData_ = null;
                this.appDataBuilder_ = null;
            }
            if (this.hbPlacementBuilder_ == null) {
                this.hbPlacement_ = null;
            } else {
                this.hbPlacement_ = null;
                this.hbPlacementBuilder_ = null;
            }
            internalGetMutableCustomData().clear();
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
            } else {
                this.placement_ = null;
                this.placementBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                return this;
            }
            this.ext_ = null;
            this.extBuilder_ = null;
            return this;
        }

        public Builder setAppData(App.Builder builder) {
            xa xaVar = this.appDataBuilder_;
            if (xaVar == null) {
                this.appData_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setDeviceData(Device.Builder builder) {
            xa xaVar = this.deviceDataBuilder_;
            if (xaVar == null) {
                this.deviceData_ = builder.build();
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

        @Deprecated
        public Builder setHbPlacement(HeaderBiddingPlacement.Builder builder) {
            xa xaVar = this.hbPlacementBuilder_;
            if (xaVar == null) {
                this.hbPlacement_ = builder.build();
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

        public Builder setPlacementData(SDK.Builder builder) {
            xa xaVar = this.placementDataBuilder_;
            if (xaVar == null) {
                this.placementData_ = builder.build();
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

        @Deprecated
        public Builder setSessionData(SessionData.Builder builder) {
            xa xaVar = this.sessionDataBuilder_;
            if (xaVar == null) {
                this.sessionData_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        public Builder setUserData(User.Builder builder) {
            xa xaVar = this.userDataBuilder_;
            if (xaVar == null) {
                this.userData_ = builder.build();
                onChanged();
                return this;
            }
            xaVar.setMessage(builder.build());
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.tokenHashValue_ = "";
            this.adType_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RequestTokenPayload) {
                return mergeFrom((RequestTokenPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RequestTokenPayload requestTokenPayload) {
            if (requestTokenPayload == RequestTokenPayload.getDefaultInstance()) {
                return this;
            }
            if (!requestTokenPayload.getTokenHashValue().isEmpty()) {
                this.tokenHashValue_ = requestTokenPayload.tokenHashValue_;
                onChanged();
            }
            if (!requestTokenPayload.getAdType().isEmpty()) {
                this.adType_ = requestTokenPayload.adType_;
                onChanged();
            }
            if (requestTokenPayload.hasPlacementData()) {
                mergePlacementData(requestTokenPayload.getPlacementData());
            }
            if (requestTokenPayload.hasSessionData()) {
                mergeSessionData(requestTokenPayload.getSessionData());
            }
            if (requestTokenPayload.hasSession()) {
                mergeSession(requestTokenPayload.getSession());
            }
            if (requestTokenPayload.hasDeviceData()) {
                mergeDeviceData(requestTokenPayload.getDeviceData());
            }
            if (requestTokenPayload.hasUserData()) {
                mergeUserData(requestTokenPayload.getUserData());
            }
            if (requestTokenPayload.hasAppData()) {
                mergeAppData(requestTokenPayload.getAppData());
            }
            if (requestTokenPayload.hasHbPlacement()) {
                mergeHbPlacement(requestTokenPayload.getHbPlacement());
            }
            internalGetMutableCustomData().mergeFrom(requestTokenPayload.internalGetCustomData());
            if (requestTokenPayload.hasPlacement()) {
                mergePlacement(requestTokenPayload.getPlacement());
            }
            if (requestTokenPayload.hasExt()) {
                mergeExt(requestTokenPayload.getExt());
            }
            mergeUnknownFields(((k7) requestTokenPayload).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.RequestTokenPayload.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.RequestTokenPayload.access$4500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.RequestTokenPayload r3 = (io.bidmachine.protobuf.RequestTokenPayload) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.RequestTokenPayload r4 = (io.bidmachine.protobuf.RequestTokenPayload) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.RequestTokenPayload.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.RequestTokenPayload$Builder");
        }
    }

    public static Builder newBuilder(RequestTokenPayload requestTokenPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestTokenPayload);
    }

    public static RequestTokenPayload parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private RequestTokenPayload(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static RequestTokenPayload parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (RequestTokenPayload) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static RequestTokenPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public RequestTokenPayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static RequestTokenPayload parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private RequestTokenPayload() {
        this.memoizedIsInitialized = (byte) -1;
        this.tokenHashValue_ = "";
        this.adType_ = "";
    }

    public static RequestTokenPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static RequestTokenPayload parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (RequestTokenPayload) PARSER.parseFrom(bArr, m5Var);
    }

    public static RequestTokenPayload parseFrom(InputStream inputStream) throws IOException {
        return (RequestTokenPayload) k7.parseWithIOException(PARSER, inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RequestTokenPayload(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                        case 10:
                            SDK sdk = this.placementData_;
                            SDK.Builder builder = sdk != null ? sdk.toBuilder() : null;
                            SDK sdk2 = (SDK) yVar.readMessage(SDK.parser(), m5Var);
                            this.placementData_ = sdk2;
                            if (builder != null) {
                                builder.mergeFrom(sdk2);
                                this.placementData_ = builder.buildPartial();
                            }
                        case 18:
                            SessionData sessionData = this.sessionData_;
                            SessionData.Builder builder2 = sessionData != null ? sessionData.toBuilder() : null;
                            SessionData sessionData2 = (SessionData) yVar.readMessage(SessionData.parser(), m5Var);
                            this.sessionData_ = sessionData2;
                            if (builder2 != null) {
                                builder2.mergeFrom(sessionData2);
                                this.sessionData_ = builder2.buildPartial();
                            }
                        case 26:
                            Device device = this.deviceData_;
                            Device.Builder builder3 = device != null ? device.toBuilder() : null;
                            Device device2 = (Device) yVar.readMessage(Device.parser(), m5Var);
                            this.deviceData_ = device2;
                            if (builder3 != null) {
                                builder3.mergeFrom(device2);
                                this.deviceData_ = builder3.buildPartial();
                            }
                        case 34:
                            if (objArr == false) {
                                this.customData_ = b9.newMapField(CustomDataDefaultEntryHolder.defaultEntry);
                                objArr = true;
                            }
                            s8 s8Var = (s8) yVar.readMessage(CustomDataDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                            this.customData_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
                        case 42:
                            User user = this.userData_;
                            User.Builder builder4 = user != null ? user.toBuilder() : null;
                            User user2 = (User) yVar.readMessage(User.parser(), m5Var);
                            this.userData_ = user2;
                            if (builder4 != null) {
                                builder4.mergeFrom(user2);
                                this.userData_ = builder4.buildPartial();
                            }
                        case 50:
                            App app = this.appData_;
                            App.Builder builder5 = app != null ? app.toBuilder() : null;
                            App app2 = (App) yVar.readMessage(App.parser(), m5Var);
                            this.appData_ = app2;
                            if (builder5 != null) {
                                builder5.mergeFrom(app2);
                                this.appData_ = builder5.buildPartial();
                            }
                        case 58:
                            Struct struct = this.ext_;
                            Struct.Builder builder6 = struct != null ? struct.toBuilder() : null;
                            Struct struct2 = (Struct) yVar.readMessage(Struct.parser(), m5Var);
                            this.ext_ = struct2;
                            if (builder6 != null) {
                                builder6.mergeFrom(struct2);
                                this.ext_ = builder6.buildPartial();
                            }
                        case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                            this.tokenHashValue_ = yVar.readStringRequireUtf8();
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            HeaderBiddingPlacement headerBiddingPlacement = this.hbPlacement_;
                            HeaderBiddingPlacement.Builder builder7 = headerBiddingPlacement != null ? headerBiddingPlacement.toBuilder() : null;
                            HeaderBiddingPlacement headerBiddingPlacement2 = (HeaderBiddingPlacement) yVar.readMessage(HeaderBiddingPlacement.parser(), m5Var);
                            this.hbPlacement_ = headerBiddingPlacement2;
                            if (builder7 != null) {
                                builder7.mergeFrom(headerBiddingPlacement2);
                                this.hbPlacement_ = builder7.buildPartial();
                            }
                        case 82:
                            this.adType_ = yVar.readStringRequireUtf8();
                        case 90:
                            io.bidmachine.protobuf.sdk.Session session = this.session_;
                            Session.Builder builder8 = session != null ? session.toBuilder() : null;
                            io.bidmachine.protobuf.sdk.Session session2 = (io.bidmachine.protobuf.sdk.Session) yVar.readMessage(io.bidmachine.protobuf.sdk.Session.parser(), m5Var);
                            this.session_ = session2;
                            if (builder8 != null) {
                                builder8.mergeFrom(session2);
                                this.session_ = builder8.buildPartial();
                            }
                        case 98:
                            Placement placement = this.placement_;
                            Placement.Builder builder9 = placement != null ? placement.toBuilder() : null;
                            Placement placement2 = (Placement) yVar.readMessage(Placement.parser(), m5Var);
                            this.placement_ = placement2;
                            if (builder9 != null) {
                                builder9.mergeFrom(placement2);
                                this.placement_ = builder9.buildPartial();
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
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static RequestTokenPayload parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (RequestTokenPayload) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static RequestTokenPayload parseFrom(y yVar) throws IOException {
        return (RequestTokenPayload) k7.parseWithIOException(PARSER, yVar);
    }

    public static RequestTokenPayload parseFrom(y yVar, m5 m5Var) throws IOException {
        return (RequestTokenPayload) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
