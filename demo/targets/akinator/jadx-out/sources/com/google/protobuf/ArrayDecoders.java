package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@CheckReturnValue
/* loaded from: classes7.dex */
final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.google.protobuf.ArrayDecoders$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private ArrayDecoders() {
    }

    private static void checkRecursionLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public static int decodeBoolList(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i11, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (iDecodeVarint64 < i12) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return iDecodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i10, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i11 == 0) {
            registers.object1 = ByteString.EMPTY;
            return iDecodeVarint32;
        }
        registers.object1 = ByteString.copyFrom(bArr, iDecodeVarint32, i11);
        return iDecodeVarint32 + i11;
    }

    public static int decodeBytesList(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i13 = registers.int1;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i13 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i13 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i13));
            iDecodeVarint32 += i13;
        }
        while (iDecodeVarint32 < i12) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i14 = registers.int1;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i14 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i14 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i14));
                iDecodeVarint32 += i14;
            }
        }
        return iDecodeVarint32;
    }

    public static double decodeDouble(byte[] bArr, int i10) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i10));
    }

    public static int decodeDoubleList(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
            if (i10 != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i13 = iDecodeVarint32 + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int decodeExtension(int i10, byte[] bArr, int i11, int i12, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        int i13;
        int i14;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i15 = i10 >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i11, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return iDecodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i11, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i11, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i11, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i11, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i11, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return iDecodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i11, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return iDecodePackedBoolList;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i11, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return iDecodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i11, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return iDecodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i11, intArrayList4, registers);
                    SchemaUtil.filterUnknownEnumList((Object) extendableMessage, i15, (List<Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), (Object) null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        Object objValueOf = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i11 = decodeVarint32(bArr, i11, registers);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                SchemaUtil.storeUnknownEnum(extendableMessage, i15, registers.int1, null, unknownFieldSchema);
                return i11;
            }
            objValueOf = Integer.valueOf(registers.int1);
        } else {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    i13 = i11;
                    objValueOf = Double.valueOf(decodeDouble(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 2:
                    i14 = i11;
                    objValueOf = Float.valueOf(decodeFloat(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 3:
                case 4:
                    i11 = decodeVarint64(bArr, i11, registers);
                    objValueOf = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    i11 = decodeVarint32(bArr, i11, registers);
                    objValueOf = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    i13 = i11;
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 9:
                case 10:
                    i14 = i11;
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 11:
                    i11 = decodeVarint64(bArr, i11, registers);
                    objValueOf = Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    i11 = decodeVarint32(bArr, i11, registers);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    i11 = decodeVarint64(bArr, i11, registers);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = decodeBytes(bArr, i11, registers);
                    objValueOf = registers.object1;
                    break;
                case 16:
                    i11 = decodeString(bArr, i11, registers);
                    objValueOf = registers.object1;
                    break;
                case 17:
                    int i16 = (i15 << 3) | 4;
                    Schema schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(schemaSchemaFor, bArr, i11, i12, i16, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeGroupField;
                    }
                    Object field = fieldSet.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = schemaSchemaFor.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaSchemaFor, bArr, i11, i12, i16, registers);
                case 18:
                    Schema schemaSchemaFor2 = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(schemaSchemaFor2, bArr, i11, i12, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = fieldSet.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = schemaSchemaFor2.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaSchemaFor2, bArr, i11, i12, registers);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
            return i11;
        }
        fieldSet.setField(generatedExtension.descriptor, objValueOf);
        return i11;
    }

    public static int decodeExtensionOrUnknownField(int i10, byte[] bArr, int i11, int i12, Object obj, MessageLite messageLite, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i10 >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i10, bArr, i11, i12, MessageSchema.getMutableUnknownFields(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i10, bArr, i11, i12, extendableMessage, generatedExtensionFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    public static int decodeFixed32(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public static int decodeFixed32List(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
            if (i10 != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i13 = iDecodeVarint32 + 4;
        }
        return i13;
    }

    public static long decodeFixed64(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int decodeFixed64List(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
            if (i10 != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i13 = iDecodeVarint32 + 8;
        }
        return i13;
    }

    public static float decodeFloat(byte[] bArr, int i10) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i10));
    }

    public static int decodeFloatList(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iDecodeVarint32 = decodeVarint32(bArr, i13, registers);
            if (i10 != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i13 = iDecodeVarint32 + 4;
        }
        return i13;
    }

    public static int decodeGroupField(Schema schema, byte[] bArr, int i10, int i11, int i12, Registers registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, schema, bArr, i10, i11, i12, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeGroupField;
    }

    public static int decodeGroupList(Schema schema, int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(schema, bArr, i11, i12, i13, registers);
        protobufList.add(registers.object1);
        while (iDecodeGroupField < i12) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(schema, bArr, iDecodeVarint32, i12, i13, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeGroupField;
    }

    public static int decodeMessageField(Schema schema, byte[] bArr, int i10, int i11, Registers registers) throws IOException {
        Object objNewInstance = schema.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, schema, bArr, i10, i11, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeMessageField;
    }

    public static int decodeMessageList(Schema<?> schema, int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        int iDecodeMessageField = decodeMessageField(schema, bArr, i11, i12, registers);
        protobufList.add(registers.object1);
        while (iDecodeMessageField < i12) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(schema, bArr, iDecodeVarint32, i12, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i11) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (iDecodeVarint32 == i11) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i11) {
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i11) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i11) {
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i11) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i11) {
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i11) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i11) {
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i11) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i11) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (iDecodeVarint32 == i11) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i11) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (iDecodeVarint32 == i11) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i11) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (iDecodeVarint32 == i11) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i10, Internal.ProtobufList<?> protobufList, Registers registers) throws IOException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i11) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (iDecodeVarint32 == i11) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeSInt32List(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i11, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (iDecodeVarint32 < i12) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return iDecodeVarint32;
    }

    public static int decodeSInt64List(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i11, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (iDecodeVarint64 < i12) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return iDecodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i10, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = new String(bArr, iDecodeVarint32, i11, Internal.UTF_8);
        return iDecodeVarint32 + i11;
    }

    public static int decodeStringList(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i13 = registers.int1;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i13 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, iDecodeVarint32, i13, Internal.UTF_8));
            iDecodeVarint32 += i13;
        }
        while (iDecodeVarint32 < i12) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i14 = registers.int1;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i14 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, iDecodeVarint32, i14, Internal.UTF_8));
                iDecodeVarint32 += i14;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringListRequireUtf8(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i11, registers);
        int i13 = registers.int1;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i13 == 0) {
            protobufList.add("");
        } else {
            int i14 = iDecodeVarint32 + i13;
            if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i14)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, iDecodeVarint32, i13, Internal.UTF_8));
            iDecodeVarint32 = i14;
        }
        while (iDecodeVarint32 < i12) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i15 = registers.int1;
            if (i15 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i15 == 0) {
                protobufList.add("");
            } else {
                int i16 = iDecodeVarint32 + i15;
                if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i16)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, iDecodeVarint32, i15, Internal.UTF_8));
                iDecodeVarint32 = i16;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i10, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i10, registers);
        int i11 = registers.int1;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i11 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = Utf8.decodeUtf8(bArr, iDecodeVarint32, i11);
        return iDecodeVarint32 + i11;
    }

    public static int decodeUnknownField(int i10, byte[] bArr, int i11, int i12, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i10) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i11, registers);
            unknownFieldSetLite.storeField(i10, Long.valueOf(registers.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i10, Long.valueOf(decodeFixed64(bArr, i11)));
            return i11 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i11, registers);
            int i13 = registers.int1;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i13 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i13 == 0) {
                unknownFieldSetLite.storeField(i10, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i10, ByteString.copyFrom(bArr, iDecodeVarint32, i13));
            }
            return iDecodeVarint32 + i13;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i10, Integer.valueOf(decodeFixed32(bArr, i11)));
            return i11 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i14 = (i10 & (-8)) | 4;
        int i15 = registers.recursionDepth + 1;
        registers.recursionDepth = i15;
        checkRecursionLimit(i15);
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iDecodeVarint322 = decodeVarint32(bArr, i11, registers);
            i16 = registers.int1;
            if (i16 == i14) {
                i11 = iDecodeVarint322;
                break;
            }
            i11 = decodeUnknownField(i16, bArr, iDecodeVarint322, i12, unknownFieldSetLiteNewInstance, registers);
        }
        registers.recursionDepth--;
        if (i11 > i12 || i16 != i14) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i10, unknownFieldSetLiteNewInstance);
        return i11;
    }

    public static int decodeVarint32(byte[] bArr, int i10, Registers registers) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return decodeVarint32(b10, bArr, i11, registers);
        }
        registers.int1 = b10;
        return i11;
    }

    public static int decodeVarint32List(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i11, registers);
        intArrayList.addInt(registers.int1);
        while (iDecodeVarint32 < i12) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            intArrayList.addInt(registers.int1);
        }
        return iDecodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i10, Registers registers) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return decodeVarint64(j10, bArr, i11, registers);
        }
        registers.long1 = j10;
        return i11;
    }

    public static int decodeVarint64List(int i10, byte[] bArr, int i11, int i12, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i11, registers);
        longArrayList.addLong(registers.long1);
        while (iDecodeVarint64 < i12) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i10 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return iDecodeVarint64;
    }

    public static int mergeGroupField(Object obj, Schema schema, byte[] bArr, int i10, int i11, int i12, Registers registers) throws IOException {
        int i13 = registers.recursionDepth + 1;
        registers.recursionDepth = i13;
        checkRecursionLimit(i13);
        int message = ((MessageSchema) schema).parseMessage(obj, bArr, i10, i11, i12, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return message;
    }

    public static int mergeMessageField(Object obj, Schema schema, byte[] bArr, int i10, int i11, Registers registers) throws IOException {
        int iDecodeVarint32 = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iDecodeVarint32 = decodeVarint32(i12, bArr, iDecodeVarint32, registers);
            i12 = registers.int1;
        }
        int i13 = iDecodeVarint32;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i14 = registers.recursionDepth + 1;
        registers.recursionDepth = i14;
        checkRecursionLimit(i14);
        int i15 = i13 + i12;
        schema.mergeFrom(obj, bArr, i13, i15, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return i15;
    }

    public static void setRecursionLimit(int i10) {
        recursionLimit = i10;
    }

    public static int skipField(int i10, byte[] bArr, int i11, int i12, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i10) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i11, registers);
        }
        if (tagWireType == 1) {
            return i11 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i11, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i11 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = decodeVarint32(bArr, i11, registers);
            i14 = registers.int1;
            if (i14 == i13) {
                break;
            }
            i11 = skipField(i14, bArr, i11, i12, registers);
        }
        if (i11 > i12 || i14 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i11;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        public Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        public Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public static int decodeVarint32(int i10, byte[] bArr, int i11, Registers registers) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            registers.int1 = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            registers.int1 = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & AbstractJsonLexerKt.TC_INVALID) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            registers.int1 = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & AbstractJsonLexerKt.TC_INVALID) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            registers.int1 = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & AbstractJsonLexerKt.TC_INVALID) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                registers.int1 = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int decodeVarint64(long j10, byte[] bArr, int i10, Registers registers) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & AbstractJsonLexerKt.TC_INVALID) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & AbstractJsonLexerKt.TC_INVALID) << i12;
            i11 = i13;
            b10 = b11;
        }
        registers.long1 = j11;
        return i11;
    }
}
