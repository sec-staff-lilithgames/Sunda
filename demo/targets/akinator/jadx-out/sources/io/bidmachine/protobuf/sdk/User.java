package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.cc;
import com.explorestack.protobuf.d;
import com.explorestack.protobuf.e;
import com.explorestack.protobuf.fa;
import com.explorestack.protobuf.gc;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.j7;
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.l7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.s7;
import com.explorestack.protobuf.x7;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class User extends k7 implements UserOrBuilder {
    public static final int CCPA_FIELD_NUMBER = 3;
    public static final int CONSENT_FIELD_NUMBER = 1;
    public static final int COPPA_FIELD_NUMBER = 6;
    public static final int GDPR_FIELD_NUMBER = 2;
    public static final int GPP_FIELD_NUMBER = 4;
    public static final int GPP_SID_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private volatile Object ccpa_;
    private volatile Object consent_;
    private boolean coppa_;
    private boolean gdpr_;
    private int gppSidMemoizedSerializedSize;
    private s7 gppSid_;
    private volatile Object gpp_;
    private byte memoizedIsInitialized;
    private static final User DEFAULT_INSTANCE = new User();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.sdk.User.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public User parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new User(yVar, m5Var);
        }
    };

    public static User getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_descriptor;
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
        return getConsent().equals(user.getConsent()) && getGdpr() == user.getGdpr() && getCcpa().equals(user.getCcpa()) && getGpp().equals(user.getGpp()) && getGppSidList().equals(user.getGppSidList()) && getCoppa() == user.getCoppa() && this.unknownFields.equals(user.unknownFields);
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public String getCcpa() {
        Object obj = this.ccpa_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ccpa_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public ByteString getCcpaBytes() {
        Object obj = this.ccpa_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ccpa_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public String getConsent() {
        Object obj = this.consent_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.consent_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public ByteString getConsentBytes() {
        Object obj = this.consent_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.consent_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public boolean getCoppa() {
        return this.coppa_;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public boolean getGdpr() {
        return this.gdpr_;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public String getGpp() {
        Object obj = this.gpp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.gpp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public ByteString getGppBytes() {
        Object obj = this.gpp_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.gpp_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public int getGppSid(int i10) {
        return ((l7) this.gppSid_).getInt(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
    public int getGppSidCount() {
        return this.gppSid_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
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
        int iComputeStringSize = !getConsentBytes().isEmpty() ? k7.computeStringSize(1, this.consent_) : 0;
        boolean z10 = this.gdpr_;
        if (z10) {
            iComputeStringSize += h0.computeBoolSize(2, z10);
        }
        if (!getCcpaBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(3, this.ccpa_);
        }
        if (!getGppBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(4, this.gpp_);
        }
        int iComputeUInt32SizeNoTag = 0;
        for (int i11 = 0; i11 < this.gppSid_.size(); i11++) {
            iComputeUInt32SizeNoTag += h0.computeUInt32SizeNoTag(((l7) this.gppSid_).getInt(i11));
        }
        int iComputeBoolSize = iComputeStringSize + iComputeUInt32SizeNoTag;
        if (!getGppSidList().isEmpty()) {
            iComputeBoolSize = iComputeBoolSize + 1 + h0.computeInt32SizeNoTag(iComputeUInt32SizeNoTag);
        }
        this.gppSidMemoizedSerializedSize = iComputeUInt32SizeNoTag;
        boolean z11 = this.coppa_;
        if (z11) {
            iComputeBoolSize += h0.computeBoolSize(6, z11);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeBoolSize;
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
        int iHashCode = getGpp().hashCode() + ((((getCcpa().hashCode() + ((((x7.hashBoolean(getGdpr()) + ((((getConsent().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53);
        if (getGppSidCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 5, 53) + getGppSidList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + ((x7.hashBoolean(getCoppa()) + o2.B(iHashCode, 37, 6, 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_fieldAccessorTable.ensureFieldAccessorsInitialized(User.class, Builder.class);
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
        getSerializedSize();
        if (!getConsentBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.consent_);
        }
        boolean z10 = this.gdpr_;
        if (z10) {
            h0Var.writeBool(2, z10);
        }
        if (!getCcpaBytes().isEmpty()) {
            k7.writeString(h0Var, 3, this.ccpa_);
        }
        if (!getGppBytes().isEmpty()) {
            k7.writeString(h0Var, 4, this.gpp_);
        }
        if (getGppSidList().size() > 0) {
            h0Var.writeUInt32NoTag(42);
            h0Var.writeUInt32NoTag(this.gppSidMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.gppSid_.size(); i10++) {
            h0Var.writeUInt32NoTag(((l7) this.gppSid_).getInt(i10));
        }
        boolean z11 = this.coppa_;
        if (z11) {
            h0Var.writeBool(6, z11);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements UserOrBuilder {
        private int bitField0_;
        private Object ccpa_;
        private Object consent_;
        private boolean coppa_;
        private boolean gdpr_;
        private s7 gppSid_;
        private Object gpp_;

        private Builder() {
            super(null);
            this.consent_ = "";
            this.ccpa_ = "";
            this.gpp_ = "";
            this.gppSid_ = k7.emptyIntList();
            maybeForceBuilderInitialization();
        }

        private void ensureGppSidIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.gppSid_ = k7.mutableCopy(this.gppSid_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = k7.alwaysUseFieldBuilders;
        }

        public Builder addAllGppSid(Iterable<? extends Integer> iterable) {
            ensureGppSidIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.gppSid_);
            onChanged();
            return this;
        }

        public Builder addGppSid(int i10) {
            ensureGppSidIsMutable();
            ((l7) this.gppSid_).addInt(i10);
            onChanged();
            return this;
        }

        public Builder clearCcpa() {
            this.ccpa_ = User.getDefaultInstance().getCcpa();
            onChanged();
            return this;
        }

        public Builder clearConsent() {
            this.consent_ = User.getDefaultInstance().getConsent();
            onChanged();
            return this;
        }

        public Builder clearCoppa() {
            this.coppa_ = false;
            onChanged();
            return this;
        }

        public Builder clearGdpr() {
            this.gdpr_ = false;
            onChanged();
            return this;
        }

        public Builder clearGpp() {
            this.gpp_ = User.getDefaultInstance().getGpp();
            onChanged();
            return this;
        }

        public Builder clearGppSid() {
            this.gppSid_ = k7.emptyIntList();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public String getCcpa() {
            Object obj = this.ccpa_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ccpa_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public ByteString getCcpaBytes() {
            Object obj = this.ccpa_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ccpa_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public String getConsent() {
            Object obj = this.consent_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.consent_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public ByteString getConsentBytes() {
            Object obj = this.consent_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consent_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public boolean getCoppa() {
            return this.coppa_;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public boolean getGdpr() {
            return this.gdpr_;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public String getGpp() {
            Object obj = this.gpp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.gpp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public ByteString getGppBytes() {
            Object obj = this.gpp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gpp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public int getGppSid(int i10) {
            return ((l7) this.gppSid_).getInt(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public int getGppSidCount() {
            return this.gppSid_.size();
        }

        @Override // io.bidmachine.protobuf.sdk.UserOrBuilder
        public List<Integer> getGppSidList() {
            return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.gppSid_) : this.gppSid_;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return SDKContextProto.internal_static_bidmachine_protobuf_sdk_context_User_fieldAccessorTable.ensureFieldAccessorsInitialized(User.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setCcpa(String str) {
            str.getClass();
            this.ccpa_ = str;
            onChanged();
            return this;
        }

        public Builder setCcpaBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.ccpa_ = byteString;
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
            b.checkByteStringIsUtf8(byteString);
            this.consent_ = byteString;
            onChanged();
            return this;
        }

        public Builder setCoppa(boolean z10) {
            this.coppa_ = z10;
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
            b.checkByteStringIsUtf8(byteString);
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
            user.consent_ = this.consent_;
            user.gdpr_ = this.gdpr_;
            user.ccpa_ = this.ccpa_;
            user.gpp_ = this.gpp_;
            if ((this.bitField0_ & 1) != 0) {
                ((e) this.gppSid_).makeImmutable();
                this.bitField0_ &= -2;
            }
            user.gppSid_ = this.gppSid_;
            user.coppa_ = this.coppa_;
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
            this.consent_ = "";
            this.gdpr_ = false;
            this.ccpa_ = "";
            this.gpp_ = "";
            this.gppSid_ = k7.emptyIntList();
            this.bitField0_ &= -2;
            this.coppa_ = false;
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

        private Builder(p6 p6Var) {
            super(p6Var);
            this.consent_ = "";
            this.ccpa_ = "";
            this.gpp_ = "";
            this.gppSid_ = k7.emptyIntList();
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(User user) {
            if (user == User.getDefaultInstance()) {
                return this;
            }
            if (!user.getConsent().isEmpty()) {
                this.consent_ = user.consent_;
                onChanged();
            }
            if (user.getGdpr()) {
                setGdpr(user.getGdpr());
            }
            if (!user.getCcpa().isEmpty()) {
                this.ccpa_ = user.ccpa_;
                onChanged();
            }
            if (!user.getGpp().isEmpty()) {
                this.gpp_ = user.gpp_;
                onChanged();
            }
            if (!user.gppSid_.isEmpty()) {
                if (this.gppSid_.isEmpty()) {
                    this.gppSid_ = user.gppSid_;
                    this.bitField0_ &= -2;
                } else {
                    ensureGppSidIsMutable();
                    this.gppSid_.addAll(user.gppSid_);
                }
                onChanged();
            }
            if (user.getCoppa()) {
                setCoppa(user.getCoppa());
            }
            mergeUnknownFields(((k7) user).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.bidmachine.protobuf.sdk.User.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.sdk.User.access$1200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.sdk.User r3 = (io.bidmachine.protobuf.sdk.User) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.sdk.User r4 = (io.bidmachine.protobuf.sdk.User) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.sdk.User.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.sdk.User$Builder");
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
        this.gppSidMemoizedSerializedSize = -1;
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

    public static User parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (User) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    private User() {
        this.gppSidMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.consent_ = "";
        this.ccpa_ = "";
        this.gpp_ = "";
        this.gppSid_ = k7.emptyIntList();
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

    private User(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            this.consent_ = yVar.readStringRequireUtf8();
                        } else if (tag == 16) {
                            this.gdpr_ = yVar.readBool();
                        } else if (tag == 26) {
                            this.ccpa_ = yVar.readStringRequireUtf8();
                        } else if (tag == 34) {
                            this.gpp_ = yVar.readStringRequireUtf8();
                        } else if (tag == 40) {
                            if (!z11) {
                                this.gppSid_ = k7.newIntList();
                                z11 = true;
                            }
                            ((l7) this.gppSid_).addInt(yVar.readUInt32());
                        } else if (tag == 42) {
                            int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                            if (!z11 && yVar.getBytesUntilLimit() > 0) {
                                this.gppSid_ = k7.newIntList();
                                z11 = true;
                            }
                            while (yVar.getBytesUntilLimit() > 0) {
                                ((l7) this.gppSid_).addInt(yVar.readUInt32());
                            }
                            yVar.popLimit(iPushLimit);
                        } else if (tag != 48) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            this.coppa_ = yVar.readBool();
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
                    ((e) this.gppSid_).makeImmutable();
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            ((e) this.gppSid_).makeImmutable();
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static User parseFrom(y yVar, m5 m5Var) throws IOException {
        return (User) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
