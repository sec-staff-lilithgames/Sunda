package com.google.protobuf;

import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@CheckReturnValue
/* loaded from: classes7.dex */
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    public static int computeSizeBoolList(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z10) {
            return CodedOutputStream.computeBoolSize(i10, true) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size) + CodedOutputStream.computeTagSize(i10);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i10, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i11));
        }
        return iComputeTagSize;
    }

    public static int computeSizeEnumList(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (!z10) {
            return (CodedOutputStream.computeTagSize(i10) * size) + iComputeSizeEnumListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) + CodedOutputStream.computeTagSize(i10);
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeEnumSizeNoTag = 0;
            while (i10 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i10).intValue());
                i10++;
            }
            return iComputeEnumSizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i10 < size) {
            iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i10));
            i10++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int computeSizeFixed32List(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z10) {
            return CodedOutputStream.computeFixed32Size(i10, 0) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) + CodedOutputStream.computeTagSize(i10);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z10) {
            return CodedOutputStream.computeFixed64Size(i10, 0L) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) + CodedOutputStream.computeTagSize(i10);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i10, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i10, list.get(i11));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeInt32List(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (!z10) {
            return (CodedOutputStream.computeTagSize(i10) * size) + iComputeSizeInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) + CodedOutputStream.computeTagSize(i10);
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
            return iComputeInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i10));
            i10++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int computeSizeInt64List(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z10) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) + CodedOutputStream.computeTagSize(i10);
        }
        return (CodedOutputStream.computeTagSize(i10) * list.size()) + iComputeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
            return iComputeInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeInt64SizeNoTag2 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i10));
            i10++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int computeSizeMessage(int i10, Object obj, Schema schema) {
        return obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i10, (LazyFieldLite) obj) : CodedOutputStream.computeMessageSize(i10, (MessageLite) obj, schema);
    }

    public static int computeSizeMessageList(int i10, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iComputeTagSize = (obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj)) + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static int computeSizeSInt32List(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (!z10) {
            return (CodedOutputStream.computeTagSize(i10) * size) + iComputeSizeSInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) + CodedOutputStream.computeTagSize(i10);
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
            return iComputeSInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeSInt32SizeNoTag2 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i10));
            i10++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int computeSizeSInt64List(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (!z10) {
            return (CodedOutputStream.computeTagSize(i10) * size) + iComputeSizeSInt64ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) + CodedOutputStream.computeTagSize(i10);
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
            return iComputeSInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeSInt64SizeNoTag2 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i10));
            i10++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int computeSizeStringList(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        if (!(list instanceof LazyStringList)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iComputeTagSize = (obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj)) + iComputeTagSize;
                i11++;
            }
            return iComputeTagSize;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i11 < size) {
            Object raw = lazyStringList.getRaw(i11);
            iComputeTagSize = (raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw)) + iComputeTagSize;
            i11++;
        }
        return iComputeTagSize;
    }

    public static int computeSizeUInt32List(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (!z10) {
            return (CodedOutputStream.computeTagSize(i10) * size) + iComputeSizeUInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) + CodedOutputStream.computeTagSize(i10);
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i10).intValue());
                i10++;
            }
            return iComputeUInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeUInt32SizeNoTag2 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i10));
            i10++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int computeSizeUInt64List(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (!z10) {
            return (CodedOutputStream.computeTagSize(i10) * size) + iComputeSizeUInt64ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) + CodedOutputStream.computeTagSize(i10);
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i10).longValue());
                i10++;
            }
            return iComputeUInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeUInt64SizeNoTag2 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i10));
            i10++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i10, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) == null) {
                    ub2 = (UB) storeUnknownEnum(obj, i10, iIntValue, ub2, unknownFieldSchema);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int iIntValue2 = num.intValue();
            if (enumLiteMap.findValueByNumber(iIntValue2) != null) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) storeUnknownEnum(obj, i10, iIntValue2, ub2, unknownFieldSchema);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t10, T t11) {
        FieldSet<T> extensions = extensionSchema.getExtensions(t11);
        if (extensions.isEmpty()) {
            return;
        }
        extensionSchema.getMutableExtensions(t10).mergeFrom(extensions);
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t10, T t11, long j10) {
        UnsafeUtil.putObject(t10, j10, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(t10, j10), UnsafeUtil.getObject(t11, j10)));
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t10, T t11) {
        unknownFieldSchema.setToMessage(t10, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(t10), unknownFieldSchema.getFromMessage(t11)));
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int i10, int i11, int i12) {
        if (i11 < 40) {
            return true;
        }
        long j10 = i11 - i10;
        long j11 = i12;
        return j10 + 10 <= ((j11 + 3) * 3) + ((2 * j11) + 3);
    }

    public static <UT, UB> UB storeUnknownEnum(Object obj, int i10, int i11, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub2 == null) {
            ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub2, i10, i11);
        return ub2;
    }

    public static String toCamelCase(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb2.append(cCharAt);
                    }
                    z10 = true;
                } else if (i10 != 0 || z10) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) (cCharAt + ' '));
                }
            } else if (z10) {
                sb2.append((char) (cCharAt - ' '));
            } else {
                sb2.append(cCharAt);
            }
            z10 = false;
        }
        return sb2.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i10, boolean z10, Writer writer) throws IOException {
        if (z10) {
            writer.writeBool(i10, true);
        }
    }

    public static void writeBoolList(int i10, List<Boolean> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i10, list, z10);
    }

    public static void writeBytes(int i10, ByteString byteString, Writer writer) throws IOException {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        writer.writeBytes(i10, byteString);
    }

    public static void writeBytesList(int i10, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i10, list);
    }

    public static void writeDouble(int i10, double d10, Writer writer) throws IOException {
        if (Double.doubleToRawLongBits(d10) != 0) {
            writer.writeDouble(i10, d10);
        }
    }

    public static void writeDoubleList(int i10, List<Double> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i10, list, z10);
    }

    public static void writeEnum(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.writeEnum(i10, i11);
        }
    }

    public static void writeEnumList(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i10, list, z10);
    }

    public static void writeFixed32(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.writeFixed32(i10, i11);
        }
    }

    public static void writeFixed32List(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i10, list, z10);
    }

    public static void writeFixed64(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.writeFixed64(i10, j10);
        }
    }

    public static void writeFixed64List(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i10, list, z10);
    }

    public static void writeFloat(int i10, float f10, Writer writer) throws IOException {
        if (Float.floatToRawIntBits(f10) != 0) {
            writer.writeFloat(i10, f10);
        }
    }

    public static void writeFloatList(int i10, List<Float> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i10, list, z10);
    }

    public static void writeGroupList(int i10, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i10, list);
    }

    public static void writeInt32(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.writeInt32(i10, i11);
        }
    }

    public static void writeInt32List(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i10, list, z10);
    }

    public static void writeInt64(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.writeInt64(i10, j10);
        }
    }

    public static void writeInt64List(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i10, list, z10);
    }

    public static void writeLazyFieldList(int i10, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(writer, i10);
        }
    }

    public static void writeMessage(int i10, Object obj, Writer writer) throws IOException {
        if (obj != null) {
            writer.writeMessage(i10, obj);
        }
    }

    public static void writeMessageList(int i10, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i10, list);
    }

    public static void writeSFixed32(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.writeSFixed32(i10, i11);
        }
    }

    public static void writeSFixed32List(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i10, list, z10);
    }

    public static void writeSFixed64(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.writeSFixed64(i10, j10);
        }
    }

    public static void writeSFixed64List(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i10, list, z10);
    }

    public static void writeSInt32(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.writeSInt32(i10, i11);
        }
    }

    public static void writeSInt32List(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i10, list, z10);
    }

    public static void writeSInt64(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.writeSInt64(i10, j10);
        }
    }

    public static void writeSInt64List(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i10, list, z10);
    }

    public static void writeString(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i10, (String) obj, writer);
        } else {
            writeBytes(i10, (ByteString) obj, writer);
        }
    }

    private static void writeStringInternal(int i10, String str, Writer writer) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        writer.writeString(i10, str);
    }

    public static void writeStringList(int i10, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i10, list);
    }

    public static void writeUInt32(int i10, int i11, Writer writer) throws IOException {
        if (i11 != 0) {
            writer.writeUInt32(i10, i11);
        }
    }

    public static void writeUInt32List(int i10, List<Integer> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i10, list, z10);
    }

    public static void writeUInt64(int i10, long j10, Writer writer) throws IOException {
        if (j10 != 0) {
            writer.writeUInt64(i10, j10);
        }
    }

    public static void writeUInt64List(int i10, List<Long> list, Writer writer, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i10, list, z10);
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
        if (fieldInfoArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fieldInfoArr[0].getFieldNumber(), fieldInfoArr[fieldInfoArr.length - 1].getFieldNumber(), fieldInfoArr.length);
    }

    public static int computeSizeGroupList(int i10, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i10, list.get(i11), schema);
        }
        return iComputeGroupSize;
    }

    public static void writeGroupList(int i10, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i10, list, schema);
    }

    public static void writeMessageList(int i10, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i10, list, schema);
    }

    public static int computeSizeMessageList(int i10, List<?> list, Schema schema) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof LazyFieldLite) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            iComputeTagSize = iComputeMessageSizeNoTag + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i10, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int iIntValue = num.intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = (UB) storeUnknownEnum(obj, i10, iIntValue, ub2, unknownFieldSchema);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
            return ub2;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!enumVerifier.isInRange(iIntValue2)) {
                ub2 = (UB) storeUnknownEnum(obj, i10, iIntValue2, ub2, unknownFieldSchema);
                it.remove();
            }
        }
        return ub2;
    }
}
