package io.bidmachine.protobuf;

import a.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
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
import com.explorestack.protobuf.k7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.o6;
import com.explorestack.protobuf.p6;
import com.explorestack.protobuf.pa;
import com.explorestack.protobuf.s8;
import com.explorestack.protobuf.xc;
import com.explorestack.protobuf.y;
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
/* loaded from: classes9.dex */
public final class AdNetwork extends k7 implements AdNetworkOrBuilder {
    public static final int AD_UNITS_FIELD_NUMBER = 4;
    public static final int CLASS_NAME_FIELD_NUMBER = 2;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private List<AdUnit> adUnits_;
    private volatile Object className_;
    private b9 customParams_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private static final AdNetwork DEFAULT_INSTANCE = new AdNetwork();
    private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.AdNetwork.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public AdNetwork parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new AdNetwork(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class AdUnit extends k7 implements AdUnitOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        public static final int CUSTOM_PARAMS_FIELD_NUMBER = 2;
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        private static final fa PARSER = new d() { // from class: io.bidmachine.protobuf.AdNetwork.AdUnit.1
            @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
            public AdUnit parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
                return new AdUnit(yVar, m5Var);
            }
        };
        private static final long serialVersionUID = 0;
        private volatile Object adFormat_;
        private b9 customParams_;
        private byte memoizedIsInitialized;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class CustomParamsDefaultEntryHolder {
            static final s8 defaultEntry;

            static {
                Descriptors.Descriptor descriptor = InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_descriptor;
                xc xcVar = bd.f21956f;
                defaultEntry = s8.newDefaultInstance(descriptor, xcVar, "", xcVar, "");
            }

            private CustomParamsDefaultEntryHolder() {
            }
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b9 internalGetCustomParams() {
            b9 b9Var = this.customParams_;
            return b9Var == null ? b9.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : b9Var;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer);
        }

        public static fa parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().getMap().containsKey(str);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return super.equals(obj);
            }
            AdUnit adUnit = (AdUnit) obj;
            return getAdFormat().equals(adUnit.getAdFormat()) && internalGetCustomParams().equals(adUnit.internalGetCustomParams()) && this.unknownFields.equals(adUnit.unknownFields);
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getAdFormat() {
            Object obj = this.adFormat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adFormat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public ByteString getAdFormatBytes() {
            Object obj = this.adFormat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adFormat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().getMap().size();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().getMap();
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<Object, Object> map = internalGetCustomParams().getMap();
            return map.containsKey(str) ? (String) map.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetCustomParams().getMap();
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            throw new IllegalArgumentException();
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
            int iComputeStringSize = !getAdFormatBytes().isEmpty() ? k7.computeStringSize(1, this.adFormat_) : 0;
            Iterator itN = a.n(internalGetCustomParams());
            while (itN.hasNext()) {
                Map.Entry entry = (Map.Entry) itN.next();
                iComputeStringSize = a.g(entry, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 2, iComputeStringSize);
            }
            int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
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
            int iHashCode = getAdFormat().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (!internalGetCustomParams().getMap().isEmpty()) {
                iHashCode = internalGetCustomParams().hashCode() + o2.B(iHashCode, 37, 2, 53);
            }
            int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.k7
        public i7 internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.k7
        public b9 internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetCustomParams();
            }
            throw new RuntimeException(b.e(i10, "Invalid map field number: "));
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
            return new AdUnit();
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(h0 h0Var) throws IOException {
            if (!getAdFormatBytes().isEmpty()) {
                k7.writeString(h0Var, 1, this.adFormat_);
            }
            k7.serializeStringMapTo(h0Var, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 2);
            this.unknownFields.writeTo(h0Var);
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends o6 implements AdUnitOrBuilder {
            private Object adFormat_;
            private int bitField0_;
            private b9 customParams_;

            private Builder() {
                super(null);
                this.adFormat_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
            }

            private b9 internalGetCustomParams() {
                b9 b9Var = this.customParams_;
                return b9Var == null ? b9.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : b9Var;
            }

            private b9 internalGetMutableCustomParams() {
                onChanged();
                if (this.customParams_ == null) {
                    this.customParams_ = b9.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                }
                if (!this.customParams_.isMutable()) {
                    this.customParams_ = this.customParams_.copy();
                }
                return this.customParams_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = k7.alwaysUseFieldBuilders;
            }

            public Builder clearAdFormat() {
                this.adFormat_ = AdUnit.getDefaultInstance().getAdFormat();
                onChanged();
                return this;
            }

            public Builder clearCustomParams() {
                internalGetMutableCustomParams().getMutableMap().clear();
                return this;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public boolean containsCustomParams(String str) {
                str.getClass();
                return internalGetCustomParams().getMap().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getAdFormat() {
                Object obj = this.adFormat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adFormat_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public ByteString getAdFormatBytes() {
                Object obj = this.adFormat_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adFormat_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            @Deprecated
            public Map<String, String> getCustomParams() {
                return getCustomParamsMap();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public int getCustomParamsCount() {
                return internalGetCustomParams().getMap().size();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public Map<String, String> getCustomParamsMap() {
                return internalGetCustomParams().getMap();
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getCustomParamsOrDefault(String str, String str2) {
                str.getClass();
                Map<Object, Object> map = internalGetCustomParams().getMap();
                return map.containsKey(str) ? (String) map.get(str) : str2;
            }

            @Override // io.bidmachine.protobuf.AdNetwork.AdUnitOrBuilder
            public String getCustomParamsOrThrow(String str) {
                str.getClass();
                Map<Object, Object> map = internalGetCustomParams().getMap();
                if (map.containsKey(str)) {
                    return (String) map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
            }

            @Deprecated
            public Map<String, String> getMutableCustomParams() {
                return internalGetMutableCustomParams().getMutableMap();
            }

            @Override // com.explorestack.protobuf.o6
            public i7 internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMapField(int i10) {
                if (i10 == 2) {
                    return internalGetCustomParams();
                }
                throw new RuntimeException(b.e(i10, "Invalid map field number: "));
            }

            @Override // com.explorestack.protobuf.o6
            public b9 internalGetMutableMapField(int i10) {
                if (i10 == 2) {
                    return internalGetMutableCustomParams();
                }
                throw new RuntimeException(b.e(i10, "Invalid map field number: "));
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder putAllCustomParams(Map<String, String> map) {
                internalGetMutableCustomParams().getMutableMap().putAll(map);
                return this;
            }

            public Builder putCustomParams(String str, String str2) {
                str.getClass();
                str2.getClass();
                internalGetMutableCustomParams().getMutableMap().put(str, str2);
                return this;
            }

            public Builder removeCustomParams(String str) {
                str.getClass();
                internalGetMutableCustomParams().getMutableMap().remove(str);
                return this;
            }

            public Builder setAdFormat(String str) {
                str.getClass();
                this.adFormat_ = str;
                onChanged();
                return this;
            }

            public Builder setAdFormatBytes(ByteString byteString) throws IllegalArgumentException {
                byteString.getClass();
                com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
                this.adFormat_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit build() {
                AdUnit adUnitBuildPartial = buildPartial();
                if (adUnitBuildPartial.isInitialized()) {
                    return adUnitBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adUnitBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdUnit buildPartial() {
                AdUnit adUnit = new AdUnit(this);
                adUnit.adFormat_ = this.adFormat_;
                adUnit.customParams_ = internalGetCustomParams();
                adUnit.customParams_.makeImmutable();
                onBuilt();
                return adUnit;
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            public AdUnit getDefaultInstanceForType() {
                return AdUnit.getDefaultInstance();
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
                this.adFormat_ = "";
                internalGetMutableCustomParams().clear();
                return this;
            }

            private Builder(p6 p6Var) {
                super(p6Var);
                this.adFormat_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
            /* renamed from: clone */
            public Builder mo500clone() {
                return (Builder) super.mo500clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdUnit) {
                    return mergeFrom((AdUnit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdUnit adUnit) {
                if (adUnit == AdUnit.getDefaultInstance()) {
                    return this;
                }
                if (!adUnit.getAdFormat().isEmpty()) {
                    this.adFormat_ = adUnit.adFormat_;
                    onChanged();
                }
                internalGetMutableCustomParams().mergeFrom(adUnit.internalGetCustomParams());
                mergeUnknownFields(((k7) adUnit).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public io.bidmachine.protobuf.AdNetwork.AdUnit.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.AdNetwork.AdUnit.access$800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.AdNetwork$AdUnit r3 = (io.bidmachine.protobuf.AdNetwork.AdUnit) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.AdNetwork$AdUnit r4 = (io.bidmachine.protobuf.AdNetwork.AdUnit) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdNetwork.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.AdNetwork$AdUnit$Builder");
            }
        }

        public static Builder newBuilder(AdUnit adUnit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteBuffer, m5Var);
        }

        private AdUnit(o6 o6Var) {
            super(o6Var);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdUnit) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
        }

        public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdUnit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdUnit parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(byteString, m5Var);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdUnit() {
            this.memoizedIsInitialized = (byte) -1;
            this.adFormat_ = "";
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.k7
        public Builder newBuilderForType(p6 p6Var) {
            return new Builder(p6Var);
        }

        public static AdUnit parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
            return (AdUnit) PARSER.parseFrom(bArr, m5Var);
        }

        public static AdUnit parseFrom(InputStream inputStream) throws IOException {
            return (AdUnit) k7.parseWithIOException(PARSER, inputStream);
        }

        private AdUnit(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                                this.adFormat_ = yVar.readStringRequireUtf8();
                            } else if (tag != 18) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                if (!z11) {
                                    this.customParams_ = b9.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                                    z11 = true;
                                }
                                s8 s8Var = (s8) yVar.readMessage(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                                this.customParams_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
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

        public static AdUnit parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
            return (AdUnit) k7.parseWithIOException(PARSER, inputStream, m5Var);
        }

        public static AdUnit parseFrom(y yVar) throws IOException {
            return (AdUnit) k7.parseWithIOException(PARSER, yVar);
        }

        public static AdUnit parseFrom(y yVar, m5 m5Var) throws IOException {
            return (AdUnit) k7.parseWithIOException(PARSER, yVar, m5Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface AdUnitOrBuilder extends MessageOrBuilder {
        boolean containsCustomParams(String str);

        String getAdFormat();

        ByteString getAdFormatBytes();

        @Deprecated
        Map<String, String> getCustomParams();

        int getCustomParamsCount();

        Map<String, String> getCustomParamsMap();

        String getCustomParamsOrDefault(String str, String str2);

        String getCustomParamsOrThrow(String str);

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CustomParamsDefaultEntryHolder {
        static final s8 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = InitProto.internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_descriptor;
            xc xcVar = bd.f21956f;
            defaultEntry = s8.newDefaultInstance(descriptor, xcVar, "", xcVar, "");
        }

        private CustomParamsDefaultEntryHolder() {
        }
    }

    public static AdNetwork getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b9 internalGetCustomParams() {
        b9 b9Var = this.customParams_;
        return b9Var == null ? b9.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : b9Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public boolean containsCustomParams(String str) {
        str.getClass();
        return internalGetCustomParams().getMap().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdNetwork)) {
            return super.equals(obj);
        }
        AdNetwork adNetwork = (AdNetwork) obj;
        return getName().equals(adNetwork.getName()) && getClassName().equals(adNetwork.getClassName()) && internalGetCustomParams().equals(adNetwork.internalGetCustomParams()) && getAdUnitsList().equals(adNetwork.getAdUnitsList()) && this.unknownFields.equals(adNetwork.unknownFields);
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public AdUnit getAdUnits(int i10) {
        return this.adUnits_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
        return this.adUnits_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
        return this.adUnits_;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getClassName() {
        Object obj = this.className_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.className_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public ByteString getClassNameBytes() {
        Object obj = this.className_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.className_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    @Deprecated
    public Map<String, String> getCustomParams() {
        return getCustomParamsMap();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public int getCustomParamsCount() {
        return internalGetCustomParams().getMap().size();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public Map<String, String> getCustomParamsMap() {
        return internalGetCustomParams().getMap();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getCustomParamsOrDefault(String str, String str2) {
        str.getClass();
        Map<Object, Object> map = internalGetCustomParams().getMap();
        return map.containsKey(str) ? (String) map.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getCustomParamsOrThrow(String str) {
        str.getClass();
        Map<Object, Object> map = internalGetCustomParams().getMap();
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
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
        int iComputeStringSize = !getNameBytes().isEmpty() ? k7.computeStringSize(1, this.name_) : 0;
        if (!getClassNameBytes().isEmpty()) {
            iComputeStringSize += k7.computeStringSize(2, this.className_);
        }
        Iterator itN = a.n(internalGetCustomParams());
        while (itN.hasNext()) {
            Map.Entry entry = (Map.Entry) itN.next();
            iComputeStringSize = a.g(entry, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()), 3, iComputeStringSize);
        }
        for (int i11 = 0; i11 < this.adUnits_.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(4, this.adUnits_.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
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
        int iHashCode = getClassName().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53);
        if (!internalGetCustomParams().getMap().isEmpty()) {
            iHashCode = o2.B(iHashCode, 37, 3, 53) + internalGetCustomParams().hashCode();
        }
        if (getAdUnitsCount() > 0) {
            iHashCode = o2.B(iHashCode, 37, 4, 53) + getAdUnitsList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable.ensureFieldAccessorsInitialized(AdNetwork.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.k7
    public b9 internalGetMapField(int i10) {
        if (i10 == 3) {
            return internalGetCustomParams();
        }
        throw new RuntimeException(b.e(i10, "Invalid map field number: "));
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
        return new AdNetwork();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getNameBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.name_);
        }
        if (!getClassNameBytes().isEmpty()) {
            k7.writeString(h0Var, 2, this.className_);
        }
        k7.serializeStringMapTo(h0Var, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 3);
        for (int i10 = 0; i10 < this.adUnits_.size(); i10++) {
            h0Var.writeMessage(4, this.adUnits_.get(i10));
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements AdNetworkOrBuilder {
        private pa adUnitsBuilder_;
        private List<AdUnit> adUnits_;
        private int bitField0_;
        private Object className_;
        private b9 customParams_;
        private Object name_;

        private Builder() {
            super(null);
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        private void ensureAdUnitsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.adUnits_ = new ArrayList(this.adUnits_);
                this.bitField0_ |= 2;
            }
        }

        private pa getAdUnitsFieldBuilder() {
            if (this.adUnitsBuilder_ == null) {
                this.adUnitsBuilder_ = new pa(this.adUnits_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.adUnits_ = null;
            }
            return this.adUnitsBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        private b9 internalGetCustomParams() {
            b9 b9Var = this.customParams_;
            return b9Var == null ? b9.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : b9Var;
        }

        private b9 internalGetMutableCustomParams() {
            onChanged();
            if (this.customParams_ == null) {
                this.customParams_ = b9.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.customParams_.isMutable()) {
                this.customParams_ = this.customParams_.copy();
            }
            return this.customParams_;
        }

        private void maybeForceBuilderInitialization() {
            if (k7.alwaysUseFieldBuilders) {
                getAdUnitsFieldBuilder();
            }
        }

        public Builder addAdUnits(AdUnit adUnit) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.addMessage(adUnit);
                return this;
            }
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.add(adUnit);
            onChanged();
            return this;
        }

        public AdUnit.Builder addAdUnitsBuilder() {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().addBuilder(AdUnit.getDefaultInstance());
        }

        public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.addAllMessages(iterable);
                return this;
            }
            ensureAdUnitsIsMutable();
            b.a.addAll((Iterable) iterable, (List) this.adUnits_);
            onChanged();
            return this;
        }

        public Builder clearAdUnits() {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.clear();
                return this;
            }
            this.adUnits_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearClassName() {
            this.className_ = AdNetwork.getDefaultInstance().getClassName();
            onChanged();
            return this;
        }

        public Builder clearCustomParams() {
            internalGetMutableCustomParams().getMutableMap().clear();
            return this;
        }

        public Builder clearName() {
            this.name_ = AdNetwork.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().getMap().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public AdUnit getAdUnits(int i10) {
            pa paVar = this.adUnitsBuilder_;
            return paVar == null ? this.adUnits_.get(i10) : (AdUnit) paVar.getMessage(i10);
        }

        public AdUnit.Builder getAdUnitsBuilder(int i10) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().getBuilder(i10);
        }

        public List<AdUnit.Builder> getAdUnitsBuilderList() {
            return getAdUnitsFieldBuilder().getBuilderList();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public int getAdUnitsCount() {
            pa paVar = this.adUnitsBuilder_;
            return paVar == null ? this.adUnits_.size() : paVar.getCount();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public List<AdUnit> getAdUnitsList() {
            pa paVar = this.adUnitsBuilder_;
            return paVar == null ? Collections.unmodifiableList(this.adUnits_) : paVar.getMessageList();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public AdUnitOrBuilder getAdUnitsOrBuilder(int i10) {
            pa paVar = this.adUnitsBuilder_;
            return paVar == null ? this.adUnits_.get(i10) : (AdUnitOrBuilder) paVar.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            pa paVar = this.adUnitsBuilder_;
            return paVar != null ? paVar.getMessageOrBuilderList() : Collections.unmodifiableList(this.adUnits_);
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getClassName() {
            Object obj = this.className_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.className_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public ByteString getClassNameBytes() {
            Object obj = this.className_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.className_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().getMap().size();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().getMap();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<Object, Object> map = internalGetCustomParams().getMap();
            return map.containsKey(str) ? (String) map.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map<Object, Object> map = internalGetCustomParams().getMap();
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_descriptor;
        }

        @Deprecated
        public Map<String, String> getMutableCustomParams() {
            return internalGetMutableCustomParams().getMutableMap();
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdNetworkOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable.ensureFieldAccessorsInitialized(AdNetwork.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMapField(int i10) {
            if (i10 == 3) {
                return internalGetCustomParams();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6
        public b9 internalGetMutableMapField(int i10) {
            if (i10 == 3) {
                return internalGetMutableCustomParams();
            }
            throw new RuntimeException(a.b.e(i10, "Invalid map field number: "));
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllCustomParams(Map<String, String> map) {
            internalGetMutableCustomParams().getMutableMap().putAll(map);
            return this;
        }

        public Builder putCustomParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomParams().getMutableMap().put(str, str2);
            return this;
        }

        public Builder removeAdUnits(int i10) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.remove(i10);
                return this;
            }
            ensureAdUnitsIsMutable();
            this.adUnits_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeCustomParams(String str) {
            str.getClass();
            internalGetMutableCustomParams().getMutableMap().remove(str);
            return this;
        }

        public Builder setAdUnits(int i10, AdUnit adUnit) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                paVar.setMessage(i10, adUnit);
                return this;
            }
            adUnit.getClass();
            ensureAdUnitsIsMutable();
            this.adUnits_.set(i10, adUnit);
            onChanged();
            return this;
        }

        public Builder setClassName(String str) {
            str.getClass();
            this.className_ = str;
            onChanged();
            return this;
        }

        public Builder setClassNameBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            com.explorestack.protobuf.b.checkByteStringIsUtf8(byteString);
            this.className_ = byteString;
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

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdNetwork build() {
            AdNetwork adNetworkBuildPartial = buildPartial();
            if (adNetworkBuildPartial.isInitialized()) {
                return adNetworkBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adNetworkBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdNetwork buildPartial() {
            AdNetwork adNetwork = new AdNetwork(this);
            adNetwork.name_ = this.name_;
            adNetwork.className_ = this.className_;
            adNetwork.customParams_ = internalGetCustomParams();
            adNetwork.customParams_.makeImmutable();
            pa paVar = this.adUnitsBuilder_;
            if (paVar != null) {
                adNetwork.adUnits_ = paVar.build();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    this.bitField0_ &= -3;
                }
                adNetwork.adUnits_ = this.adUnits_;
            }
            onBuilt();
            return adNetwork;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AdNetwork getDefaultInstanceForType() {
            return AdNetwork.getDefaultInstance();
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

        public AdUnit.Builder addAdUnitsBuilder(int i10) {
            return (AdUnit.Builder) getAdUnitsFieldBuilder().addBuilder(i10, AdUnit.getDefaultInstance());
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
            this.name_ = "";
            this.className_ = "";
            internalGetMutableCustomParams().clear();
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                this.adUnits_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                return this;
            }
            paVar.clear();
            return this;
        }

        public Builder addAdUnits(int i10, AdUnit adUnit) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                adUnit.getClass();
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i10, adUnit);
                onChanged();
                return this;
            }
            paVar.addMessage(i10, adUnit);
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AdNetwork) {
                return mergeFrom((AdNetwork) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setAdUnits(int i10, AdUnit.Builder builder) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i10, builder.build());
                onChanged();
                return this;
            }
            paVar.setMessage(i10, builder.build());
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.name_ = "";
            this.className_ = "";
            this.adUnits_ = Collections.EMPTY_LIST;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(AdNetwork adNetwork) {
            if (adNetwork == AdNetwork.getDefaultInstance()) {
                return this;
            }
            if (!adNetwork.getName().isEmpty()) {
                this.name_ = adNetwork.name_;
                onChanged();
            }
            if (!adNetwork.getClassName().isEmpty()) {
                this.className_ = adNetwork.className_;
                onChanged();
            }
            internalGetMutableCustomParams().mergeFrom(adNetwork.internalGetCustomParams());
            if (this.adUnitsBuilder_ == null) {
                if (!adNetwork.adUnits_.isEmpty()) {
                    if (this.adUnits_.isEmpty()) {
                        this.adUnits_ = adNetwork.adUnits_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureAdUnitsIsMutable();
                        this.adUnits_.addAll(adNetwork.adUnits_);
                    }
                    onChanged();
                }
            } else if (!adNetwork.adUnits_.isEmpty()) {
                if (!this.adUnitsBuilder_.isEmpty()) {
                    this.adUnitsBuilder_.addAllMessages(adNetwork.adUnits_);
                } else {
                    this.adUnitsBuilder_.dispose();
                    this.adUnitsBuilder_ = null;
                    this.adUnits_ = adNetwork.adUnits_;
                    this.bitField0_ &= -3;
                    this.adUnitsBuilder_ = k7.alwaysUseFieldBuilders ? getAdUnitsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((k7) adNetwork).unknownFields);
            onChanged();
            return this;
        }

        public Builder addAdUnits(AdUnit.Builder builder) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(builder.build());
                onChanged();
                return this;
            }
            paVar.addMessage(builder.build());
            return this;
        }

        public Builder addAdUnits(int i10, AdUnit.Builder builder) {
            pa paVar = this.adUnitsBuilder_;
            if (paVar == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.AdNetwork.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = io.bidmachine.protobuf.AdNetwork.access$2200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.AdNetwork r3 = (io.bidmachine.protobuf.AdNetwork) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.AdNetwork r4 = (io.bidmachine.protobuf.AdNetwork) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdNetwork.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):io.bidmachine.protobuf.AdNetwork$Builder");
        }
    }

    public static Builder newBuilder(AdNetwork adNetwork) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adNetwork);
    }

    public static AdNetwork parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private AdNetwork(o6 o6Var) {
        super(o6Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdNetwork parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (AdNetwork) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static AdNetwork parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public AdNetwork getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AdNetwork parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AdNetwork() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.className_ = "";
        this.adUnits_ = Collections.EMPTY_LIST;
    }

    public static AdNetwork parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    public static AdNetwork parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (AdNetwork) PARSER.parseFrom(bArr, m5Var);
    }

    public static AdNetwork parseFrom(InputStream inputStream) throws IOException {
        return (AdNetwork) k7.parseWithIOException(PARSER, inputStream);
    }

    public static AdNetwork parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (AdNetwork) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AdNetwork(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            this.name_ = yVar.readStringRequireUtf8();
                        } else if (tag == 18) {
                            this.className_ = yVar.readStringRequireUtf8();
                        } else if (tag == 26) {
                            if ((i10 & 1) == 0) {
                                this.customParams_ = b9.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                                i10 |= 1;
                            }
                            s8 s8Var = (s8) yVar.readMessage(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), m5Var);
                            this.customParams_.getMutableMap().put(s8Var.getKey(), s8Var.getValue());
                        } else if (tag != 34) {
                            if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        } else {
                            if ((i10 & 2) == 0) {
                                this.adUnits_ = new ArrayList();
                                i10 |= 2;
                            }
                            this.adUnits_.add(yVar.readMessage(AdUnit.parser(), m5Var));
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
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                }
                this.unknownFields = ccVarNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 2) != 0) {
            this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
        }
        this.unknownFields = ccVarNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static AdNetwork parseFrom(y yVar) throws IOException {
        return (AdNetwork) k7.parseWithIOException(PARSER, yVar);
    }

    public static AdNetwork parseFrom(y yVar, m5 m5Var) throws IOException {
        return (AdNetwork) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
