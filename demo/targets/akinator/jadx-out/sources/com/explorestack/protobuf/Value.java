package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class Value extends k7 implements wc {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int kindCase_;
    private Object kind_;
    private byte memoizedIsInitialized;
    private static final Value DEFAULT_INSTANCE = new Value();
    private static final fa PARSER = new d() { // from class: com.explorestack.protobuf.Value.1
        @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
        public Value parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
            return new Value(yVar, m5Var);
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.explorestack.protobuf.Value$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Value$KindCase;

        static {
            int[] iArr = new int[KindCase.values().length];
            $SwitchMap$com$google$protobuf$Value$KindCase = iArr;
            try {
                iArr[KindCase.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.NUMBER_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.STRING_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.BOOL_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.STRUCT_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.LIST_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Value$KindCase[KindCase.KIND_NOT_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum KindCase implements o7, c {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i10) {
            this.value = i10;
        }

        public static KindCase forNumber(int i10) {
            switch (i10) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        @Override // com.explorestack.protobuf.o7
        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static KindCase valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return kb.f22315d;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) k7.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return super.equals(obj);
        }
        Value value = (Value) obj;
        if (!getKindCase().equals(value.getKindCase())) {
            return false;
        }
        switch (this.kindCase_) {
            case 1:
                if (getNullValueValue() != value.getNullValueValue()) {
                    return false;
                }
                break;
            case 2:
                if (Double.doubleToLongBits(getNumberValue()) != Double.doubleToLongBits(value.getNumberValue())) {
                    return false;
                }
                break;
            case 3:
                if (!getStringValue().equals(value.getStringValue())) {
                    return false;
                }
                break;
            case 4:
                if (getBoolValue() != value.getBoolValue()) {
                    return false;
                }
                break;
            case 5:
                if (!getStructValue().equals(value.getStructValue())) {
                    return false;
                }
                break;
            case 6:
                if (!getListValue().equals(value.getListValue())) {
                    return false;
                }
                break;
        }
        return this.unknownFields.equals(value.unknownFields);
    }

    @Override // com.explorestack.protobuf.wc
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // com.explorestack.protobuf.wc
    public KindCase getKindCase() {
        return KindCase.forNumber(this.kindCase_);
    }

    @Override // com.explorestack.protobuf.wc
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.wc
    public k8 getListValueOrBuilder() {
        return this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.wc
    public NullValue getNullValue() {
        if (this.kindCase_ != 1) {
            return NullValue.NULL_VALUE;
        }
        NullValue nullValueValueOf = NullValue.valueOf(((Integer) this.kind_).intValue());
        return nullValueValueOf == null ? NullValue.UNRECOGNIZED : nullValueValueOf;
    }

    @Override // com.explorestack.protobuf.wc
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.explorestack.protobuf.wc
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
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
        int iComputeEnumSize = this.kindCase_ == 1 ? h0.computeEnumSize(1, ((Integer) this.kind_).intValue()) : 0;
        if (this.kindCase_ == 2) {
            iComputeEnumSize += h0.computeDoubleSize(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            iComputeEnumSize += k7.computeStringSize(3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            iComputeEnumSize += h0.computeBoolSize(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            iComputeEnumSize += h0.computeMessageSize(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            iComputeEnumSize += h0.computeMessageSize(6, (ListValue) this.kind_);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeEnumSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.wc
    public String getStringValue() {
        String str = this.kindCase_ == 3 ? this.kind_ : "";
        if (str instanceof String) {
            return (String) str;
        }
        String stringUtf8 = ((ByteString) str).toStringUtf8();
        if (this.kindCase_ == 3) {
            this.kind_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.wc
    public ByteString getStringValueBytes() {
        String str = this.kindCase_ == 3 ? this.kind_ : "";
        if (!(str instanceof String)) {
            return (ByteString) str;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
        if (this.kindCase_ == 3) {
            this.kind_ = byteStringCopyFromUtf8;
        }
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.wc
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.wc
    public jb getStructValueOrBuilder() {
        return this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.wc
    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // com.explorestack.protobuf.wc
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // com.explorestack.protobuf.wc
    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // com.explorestack.protobuf.wc
    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // com.explorestack.protobuf.wc
    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // com.explorestack.protobuf.wc
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int iB;
        int nullValueValue;
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        switch (this.kindCase_) {
            case 1:
                iB = p0.o2.B(iHashCode, 37, 1, 53);
                nullValueValue = getNullValueValue();
                break;
            case 2:
                iB = p0.o2.B(iHashCode, 37, 2, 53);
                nullValueValue = x7.hashLong(Double.doubleToLongBits(getNumberValue()));
                break;
            case 3:
                iB = p0.o2.B(iHashCode, 37, 3, 53);
                nullValueValue = getStringValue().hashCode();
                break;
            case 4:
                iB = p0.o2.B(iHashCode, 37, 4, 53);
                nullValueValue = x7.hashBoolean(getBoolValue());
                break;
            case 5:
                iB = p0.o2.B(iHashCode, 37, 5, 53);
                nullValueValue = getStructValue().hashCode();
                break;
            case 6:
                iB = p0.o2.B(iHashCode, 37, 6, 53);
                nullValueValue = getListValue().hashCode();
                break;
            default:
                int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
        }
        iHashCode = iB + nullValueValue;
        int iHashCode22 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.explorestack.protobuf.k7
    public i7 internalGetFieldAccessorTable() {
        return kb.f22316e.ensureFieldAccessorsInitialized(Value.class, Builder.class);
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
        return new Value();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (this.kindCase_ == 1) {
            h0Var.writeEnum(1, ((Integer) this.kind_).intValue());
        }
        if (this.kindCase_ == 2) {
            h0Var.writeDouble(2, ((Double) this.kind_).doubleValue());
        }
        if (this.kindCase_ == 3) {
            k7.writeString(h0Var, 3, this.kind_);
        }
        if (this.kindCase_ == 4) {
            h0Var.writeBool(4, ((Boolean) this.kind_).booleanValue());
        }
        if (this.kindCase_ == 5) {
            h0Var.writeMessage(5, (Struct) this.kind_);
        }
        if (this.kindCase_ == 6) {
            h0Var.writeMessage(6, (ListValue) this.kind_);
        }
        this.unknownFields.writeTo(h0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder extends o6 implements wc {
        private int kindCase_;
        private Object kind_;
        private xa listValueBuilder_;
        private xa structValueBuilder_;

        private Builder() {
            super(null);
            this.kindCase_ = 0;
            maybeForceBuilderInitialization();
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return kb.f22315d;
        }

        private xa getListValueFieldBuilder() {
            if (this.listValueBuilder_ == null) {
                if (this.kindCase_ != 6) {
                    this.kind_ = ListValue.getDefaultInstance();
                }
                this.listValueBuilder_ = new xa((ListValue) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 6;
            onChanged();
            return this.listValueBuilder_;
        }

        private xa getStructValueFieldBuilder() {
            if (this.structValueBuilder_ == null) {
                if (this.kindCase_ != 5) {
                    this.kind_ = Struct.getDefaultInstance();
                }
                this.structValueBuilder_ = new xa((Struct) this.kind_, getParentForChildren(), isClean());
                this.kind_ = null;
            }
            this.kindCase_ = 5;
            onChanged();
            return this.structValueBuilder_;
        }

        public Builder clearBoolValue() {
            if (this.kindCase_ == 4) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearKind() {
            this.kindCase_ = 0;
            this.kind_ = null;
            onChanged();
            return this;
        }

        public Builder clearListValue() {
            xa xaVar = this.listValueBuilder_;
            if (xaVar == null) {
                if (this.kindCase_ == 6) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.kindCase_ == 6) {
                this.kindCase_ = 0;
                this.kind_ = null;
            }
            xaVar.clear();
            return this;
        }

        public Builder clearNullValue() {
            if (this.kindCase_ == 1) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearNumberValue() {
            if (this.kindCase_ == 2) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearStringValue() {
            if (this.kindCase_ == 3) {
                this.kindCase_ = 0;
                this.kind_ = null;
                onChanged();
            }
            return this;
        }

        public Builder clearStructValue() {
            xa xaVar = this.structValueBuilder_;
            if (xaVar == null) {
                if (this.kindCase_ == 5) {
                    this.kindCase_ = 0;
                    this.kind_ = null;
                    onChanged();
                }
                return this;
            }
            if (this.kindCase_ == 5) {
                this.kindCase_ = 0;
                this.kind_ = null;
            }
            xaVar.clear();
            return this;
        }

        @Override // com.explorestack.protobuf.wc
        public boolean getBoolValue() {
            if (this.kindCase_ == 4) {
                return ((Boolean) this.kind_).booleanValue();
            }
            return false;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return kb.f22315d;
        }

        @Override // com.explorestack.protobuf.wc
        public KindCase getKindCase() {
            return KindCase.forNumber(this.kindCase_);
        }

        @Override // com.explorestack.protobuf.wc
        public ListValue getListValue() {
            xa xaVar = this.listValueBuilder_;
            return xaVar == null ? this.kindCase_ == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : this.kindCase_ == 6 ? (ListValue) xaVar.getMessage() : ListValue.getDefaultInstance();
        }

        public ListValue.Builder getListValueBuilder() {
            return (ListValue.Builder) getListValueFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.wc
        public k8 getListValueOrBuilder() {
            xa xaVar;
            int i10 = this.kindCase_;
            return (i10 != 6 || (xaVar = this.listValueBuilder_) == null) ? i10 == 6 ? (ListValue) this.kind_ : ListValue.getDefaultInstance() : (k8) xaVar.getMessageOrBuilder();
        }

        @Override // com.explorestack.protobuf.wc
        public NullValue getNullValue() {
            if (this.kindCase_ != 1) {
                return NullValue.NULL_VALUE;
            }
            NullValue nullValueValueOf = NullValue.valueOf(((Integer) this.kind_).intValue());
            return nullValueValueOf == null ? NullValue.UNRECOGNIZED : nullValueValueOf;
        }

        @Override // com.explorestack.protobuf.wc
        public int getNullValueValue() {
            if (this.kindCase_ == 1) {
                return ((Integer) this.kind_).intValue();
            }
            return 0;
        }

        @Override // com.explorestack.protobuf.wc
        public double getNumberValue() {
            if (this.kindCase_ == 2) {
                return ((Double) this.kind_).doubleValue();
            }
            return 0.0d;
        }

        @Override // com.explorestack.protobuf.wc
        public String getStringValue() {
            String str = this.kindCase_ == 3 ? this.kind_ : "";
            if (str instanceof String) {
                return (String) str;
            }
            String stringUtf8 = ((ByteString) str).toStringUtf8();
            if (this.kindCase_ == 3) {
                this.kind_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.explorestack.protobuf.wc
        public ByteString getStringValueBytes() {
            String str = this.kindCase_ == 3 ? this.kind_ : "";
            if (!(str instanceof String)) {
                return (ByteString) str;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.kindCase_ == 3) {
                this.kind_ = byteStringCopyFromUtf8;
            }
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.wc
        public Struct getStructValue() {
            xa xaVar = this.structValueBuilder_;
            return xaVar == null ? this.kindCase_ == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : this.kindCase_ == 5 ? (Struct) xaVar.getMessage() : Struct.getDefaultInstance();
        }

        public Struct.Builder getStructValueBuilder() {
            return (Struct.Builder) getStructValueFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.wc
        public jb getStructValueOrBuilder() {
            xa xaVar;
            int i10 = this.kindCase_;
            return (i10 != 5 || (xaVar = this.structValueBuilder_) == null) ? i10 == 5 ? (Struct) this.kind_ : Struct.getDefaultInstance() : (jb) xaVar.getMessageOrBuilder();
        }

        @Override // com.explorestack.protobuf.wc
        public boolean hasBoolValue() {
            return this.kindCase_ == 4;
        }

        @Override // com.explorestack.protobuf.wc
        public boolean hasListValue() {
            return this.kindCase_ == 6;
        }

        @Override // com.explorestack.protobuf.wc
        public boolean hasNullValue() {
            return this.kindCase_ == 1;
        }

        @Override // com.explorestack.protobuf.wc
        public boolean hasNumberValue() {
            return this.kindCase_ == 2;
        }

        @Override // com.explorestack.protobuf.wc
        public boolean hasStringValue() {
            return this.kindCase_ == 3;
        }

        @Override // com.explorestack.protobuf.wc
        public boolean hasStructValue() {
            return this.kindCase_ == 5;
        }

        @Override // com.explorestack.protobuf.o6
        public i7 internalGetFieldAccessorTable() {
            return kb.f22316e.ensureFieldAccessorsInitialized(Value.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeListValue(ListValue listValue) {
            xa xaVar = this.listValueBuilder_;
            if (xaVar == null) {
                if (this.kindCase_ != 6 || this.kind_ == ListValue.getDefaultInstance()) {
                    this.kind_ = listValue;
                } else {
                    this.kind_ = ListValue.newBuilder((ListValue) this.kind_).mergeFrom(listValue).buildPartial();
                }
                onChanged();
            } else {
                if (this.kindCase_ == 6) {
                    xaVar.mergeFrom(listValue);
                }
                this.listValueBuilder_.setMessage(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public Builder mergeStructValue(Struct struct) {
            xa xaVar = this.structValueBuilder_;
            if (xaVar == null) {
                if (this.kindCase_ != 5 || this.kind_ == Struct.getDefaultInstance()) {
                    this.kind_ = struct;
                } else {
                    this.kind_ = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.i((Struct) this.kind_, struct);
                }
                onChanged();
            } else {
                if (this.kindCase_ == 5) {
                    xaVar.mergeFrom(struct);
                }
                this.structValueBuilder_.setMessage(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        public Builder setBoolValue(boolean z10) {
            this.kindCase_ = 4;
            this.kind_ = Boolean.valueOf(z10);
            onChanged();
            return this;
        }

        public Builder setListValue(ListValue listValue) {
            xa xaVar = this.listValueBuilder_;
            if (xaVar == null) {
                listValue.getClass();
                this.kind_ = listValue;
                onChanged();
            } else {
                xaVar.setMessage(listValue);
            }
            this.kindCase_ = 6;
            return this;
        }

        public Builder setNullValue(NullValue nullValue) {
            nullValue.getClass();
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(nullValue.getNumber());
            onChanged();
            return this;
        }

        public Builder setNullValueValue(int i10) {
            this.kindCase_ = 1;
            this.kind_ = Integer.valueOf(i10);
            onChanged();
            return this;
        }

        public Builder setNumberValue(double d10) {
            this.kindCase_ = 2;
            this.kind_ = Double.valueOf(d10);
            onChanged();
            return this;
        }

        public Builder setStringValue(String str) {
            str.getClass();
            this.kindCase_ = 3;
            this.kind_ = str;
            onChanged();
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString) throws IllegalArgumentException {
            byteString.getClass();
            b.checkByteStringIsUtf8(byteString);
            this.kindCase_ = 3;
            this.kind_ = byteString;
            onChanged();
            return this;
        }

        public Builder setStructValue(Struct struct) {
            xa xaVar = this.structValueBuilder_;
            if (xaVar == null) {
                struct.getClass();
                this.kind_ = struct;
                onChanged();
            } else {
                xaVar.setMessage(struct);
            }
            this.kindCase_ = 5;
            return this;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Value build() {
            Value valueBuildPartial = buildPartial();
            if (valueBuildPartial.isInitialized()) {
                return valueBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) valueBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Value buildPartial() {
            Value value = new Value(this);
            if (this.kindCase_ == 1) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 2) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 3) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 4) {
                value.kind_ = this.kind_;
            }
            if (this.kindCase_ == 5) {
                xa xaVar = this.structValueBuilder_;
                if (xaVar == null) {
                    value.kind_ = this.kind_;
                } else {
                    value.kind_ = xaVar.build();
                }
            }
            if (this.kindCase_ == 6) {
                xa xaVar2 = this.listValueBuilder_;
                if (xaVar2 == null) {
                    value.kind_ = this.kind_;
                } else {
                    value.kind_ = xaVar2.build();
                }
            }
            value.kindCase_ = this.kindCase_;
            onBuilt();
            return value;
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Value getDefaultInstanceForType() {
            return Value.getDefaultInstance();
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
            this.kindCase_ = 0;
            this.kind_ = null;
            return this;
        }

        private Builder(p6 p6Var) {
            super(p6Var);
            this.kindCase_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
        /* renamed from: clone */
        public Builder mo500clone() {
            return (Builder) super.mo500clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Value) {
                return mergeFrom((Value) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setListValue(ListValue.Builder builder) {
            xa xaVar = this.listValueBuilder_;
            if (xaVar == null) {
                this.kind_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.kindCase_ = 6;
            return this;
        }

        public Builder setStructValue(Struct.Builder builder) {
            xa xaVar = this.structValueBuilder_;
            if (xaVar == null) {
                this.kind_ = builder.build();
                onChanged();
            } else {
                xaVar.setMessage(builder.build());
            }
            this.kindCase_ = 5;
            return this;
        }

        public Builder mergeFrom(Value value) {
            if (value == Value.getDefaultInstance()) {
                return this;
            }
            switch (AnonymousClass2.$SwitchMap$com$google$protobuf$Value$KindCase[value.getKindCase().ordinal()]) {
                case 1:
                    setNullValueValue(value.getNullValueValue());
                    break;
                case 2:
                    setNumberValue(value.getNumberValue());
                    break;
                case 3:
                    this.kindCase_ = 3;
                    this.kind_ = value.kind_;
                    onChanged();
                    break;
                case 4:
                    setBoolValue(value.getBoolValue());
                    break;
                case 5:
                    mergeStructValue(value.getStructValue());
                    break;
                case 6:
                    mergeListValue(value.getListValue());
                    break;
            }
            mergeUnknownFields(value.unknownFields);
            onChanged();
            return this;
        }

        private void maybeForceBuilderInitialization() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.explorestack.protobuf.Value.Builder mergeFrom(com.explorestack.protobuf.y r3, com.explorestack.protobuf.m5 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.fa r1 = com.explorestack.protobuf.Value.access$500()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                com.explorestack.protobuf.Value r3 = (com.explorestack.protobuf.Value) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                com.explorestack.protobuf.Value r4 = (com.explorestack.protobuf.Value) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.Value.Builder.mergeFrom(com.explorestack.protobuf.y, com.explorestack.protobuf.m5):com.explorestack.protobuf.Value$Builder");
        }
    }

    public static Builder newBuilder(Value value) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(value);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteBuffer, m5Var);
    }

    private Value(o6 o6Var) {
        super(o6Var);
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Value parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Value) k7.parseDelimitedWithIOException(PARSER, inputStream, m5Var);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public Value getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Value parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.k7
    public Builder newBuilderForType(p6 p6Var) {
        return new Builder(p6Var);
    }

    private Value() {
        this.kindCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Value parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (Value) PARSER.parseFrom(bArr, m5Var);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) k7.parseWithIOException(PARSER, inputStream);
    }

    private Value(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
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
                            int i10 = yVar.readEnum();
                            this.kindCase_ = 1;
                            this.kind_ = Integer.valueOf(i10);
                        } else if (tag == 17) {
                            this.kindCase_ = 2;
                            this.kind_ = Double.valueOf(yVar.readDouble());
                        } else if (tag == 26) {
                            String stringRequireUtf8 = yVar.readStringRequireUtf8();
                            this.kindCase_ = 3;
                            this.kind_ = stringRequireUtf8;
                        } else if (tag != 32) {
                            if (tag == 42) {
                                Struct.Builder builder = this.kindCase_ == 5 ? ((Struct) this.kind_).toBuilder() : null;
                                MessageLite message = yVar.readMessage(Struct.parser(), m5Var);
                                this.kind_ = message;
                                if (builder != null) {
                                    builder.mergeFrom((Struct) message);
                                    this.kind_ = builder.buildPartial();
                                }
                                this.kindCase_ = 5;
                            } else if (tag != 50) {
                                if (!parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                }
                            } else {
                                ListValue.Builder builder2 = this.kindCase_ == 6 ? ((ListValue) this.kind_).toBuilder() : null;
                                MessageLite message2 = yVar.readMessage(ListValue.parser(), m5Var);
                                this.kind_ = message2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((ListValue) message2);
                                    this.kind_ = builder2.buildPartial();
                                }
                                this.kindCase_ = 6;
                            }
                        } else {
                            this.kindCase_ = 4;
                            this.kind_ = Boolean.valueOf(yVar.readBool());
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

    public static Value parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (Value) k7.parseWithIOException(PARSER, inputStream, m5Var);
    }

    public static Value parseFrom(y yVar) throws IOException {
        return (Value) k7.parseWithIOException(PARSER, yVar);
    }

    public static Value parseFrom(y yVar, m5 m5Var) throws IOException {
        return (Value) k7.parseWithIOException(PARSER, yVar, m5Var);
    }
}
