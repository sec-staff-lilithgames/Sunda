package com.explorestack.protobuf;

import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class wa {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f22814a = k7.class;

    /* renamed from: b, reason: collision with root package name */
    public static final bc f22815b = y(false);

    /* renamed from: c, reason: collision with root package name */
    public static final bc f22816c = y(true);

    /* renamed from: d, reason: collision with root package name */
    public static final ic f22817d = new ic();

    public static Object A(int i10, int i11, Object obj, bc bcVar) {
        if (obj == null) {
            obj = bcVar.m();
        }
        bcVar.e(obj, i10, i11);
        return obj;
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = h0.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeTagSize += h0.computeBytesSizeNoTag((ByteString) list.get(i11));
        }
        return iComputeTagSize;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h0.computeTagSize(i10) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l7)) {
            int iComputeEnumSizeNoTag = 0;
            while (i10 < size) {
                iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeEnumSizeNoTag;
        }
        l7 l7Var = (l7) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i10 < size) {
            iComputeEnumSizeNoTag2 += h0.computeEnumSizeNoTag(l7Var.getInt(i10));
            i10++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return h0.computeFixed32Size(i10, 0) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return h0.computeFixed64Size(i10, 0L) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h0.computeTagSize(i10) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l7)) {
            int iComputeInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt32SizeNoTag += h0.computeInt32SizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeInt32SizeNoTag;
        }
        l7 l7Var = (l7) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeInt32SizeNoTag2 += h0.computeInt32SizeNoTag(l7Var.getInt(i10));
            i10++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int j(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (h0.computeTagSize(i10) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l8)) {
            int iComputeInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt64SizeNoTag += h0.computeInt64SizeNoTag(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iComputeInt64SizeNoTag;
        }
        l8 l8Var = (l8) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeInt64SizeNoTag2 += h0.computeInt64SizeNoTag(l8Var.getLong(i10));
            i10++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int l(int i10, Object obj, ua uaVar) {
        if (obj instanceof c8) {
            return h0.computeLazyFieldSize(i10, (c8) obj);
        }
        int iComputeTagSize = h0.computeTagSize(i10);
        int serializedSize = ((b) ((MessageLite) obj)).getSerializedSize(uaVar);
        return h0.computeUInt32SizeNoTag(serializedSize) + serializedSize + iComputeTagSize;
    }

    public static int m(int i10, List list, ua uaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = h0.computeTagSize(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof c8) {
                iComputeTagSize = h0.computeLazyFieldSizeNoTag((c8) obj) + iComputeTagSize;
            } else {
                int serializedSize = ((b) ((MessageLite) obj)).getSerializedSize(uaVar);
                iComputeTagSize = h0.computeUInt32SizeNoTag(serializedSize) + serializedSize + iComputeTagSize;
            }
        }
        return iComputeTagSize;
    }

    public static int n(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h0.computeTagSize(i10) * size) + o(list);
    }

    public static int o(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l7)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt32SizeNoTag += h0.computeSInt32SizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeSInt32SizeNoTag;
        }
        l7 l7Var = (l7) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeSInt32SizeNoTag2 += h0.computeSInt32SizeNoTag(l7Var.getInt(i10));
            i10++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int p(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h0.computeTagSize(i10) * size) + q(list);
    }

    public static bc proto2UnknownFieldSetSchema() {
        return f22815b;
    }

    public static bc proto3UnknownFieldSetSchema() {
        return f22816c;
    }

    public static int q(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l8)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt64SizeNoTag += h0.computeSInt64SizeNoTag(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iComputeSInt64SizeNoTag;
        }
        l8 l8Var = (l8) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeSInt64SizeNoTag2 += h0.computeSInt64SizeNoTag(l8Var.getLong(i10));
            i10++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int r(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = h0.computeTagSize(i10) * size;
        if (!(list instanceof g8)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iComputeTagSize = (obj instanceof ByteString ? h0.computeBytesSizeNoTag((ByteString) obj) : h0.computeStringSizeNoTag((String) obj)) + iComputeTagSize;
                i11++;
            }
            return iComputeTagSize;
        }
        g8 g8Var = (g8) list;
        while (i11 < size) {
            Object raw = g8Var.getRaw(i11);
            iComputeTagSize = (raw instanceof ByteString ? h0.computeBytesSizeNoTag((ByteString) raw) : h0.computeStringSizeNoTag((String) raw)) + iComputeTagSize;
            i11++;
        }
        return iComputeTagSize;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h0.computeTagSize(i10) * size) + t(list);
    }

    public static boolean shouldUseTableSwitch(int i10, int i11, int i12) {
        if (i11 < 40) {
            return true;
        }
        long j10 = i11 - i10;
        long j11 = i12;
        return j10 + 10 <= ((j11 + 3) * 3) + ((2 * j11) + 3);
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l7)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt32SizeNoTag += h0.computeUInt32SizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeUInt32SizeNoTag;
        }
        l7 l7Var = (l7) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeUInt32SizeNoTag2 += h0.computeUInt32SizeNoTag(l7Var.getInt(i10));
            i10++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int u(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (h0.computeTagSize(i10) * size) + v(list);
    }

    public static bc unknownFieldSetLiteSchema() {
        return f22817d;
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l8)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt64SizeNoTag += h0.computeUInt64SizeNoTag(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iComputeUInt64SizeNoTag;
        }
        l8 l8Var = (l8) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeUInt64SizeNoTag2 += h0.computeUInt64SizeNoTag(l8Var.getLong(i10));
            i10++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    public static Object w(int i10, List list, q7 q7Var, Object obj, bc bcVar) {
        if (q7Var == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!q7Var.isInRange(iIntValue)) {
                    obj = A(i10, iIntValue, obj, bcVar);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (q7Var.isInRange(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj = A(i10, iIntValue2, obj, bcVar);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj;
    }

    public static void writeBool(int i10, boolean z10, kd kdVar) throws IOException {
        if (z10) {
            ((i0) kdVar).writeBool(i10, true);
        }
    }

    public static void writeBoolList(int i10, List<Boolean> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeBoolList(i10, list, z10);
    }

    public static void writeBytes(int i10, ByteString byteString, kd kdVar) throws IOException {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeBytes(i10, byteString);
    }

    public static void writeBytesList(int i10, List<ByteString> list, kd kdVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeBytesList(i10, list);
    }

    public static void writeDouble(int i10, double d10, kd kdVar) throws IOException {
        if (Double.compare(d10, 0.0d) != 0) {
            ((i0) kdVar).writeDouble(i10, d10);
        }
    }

    public static void writeDoubleList(int i10, List<Double> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeDoubleList(i10, list, z10);
    }

    public static void writeEnum(int i10, int i11, kd kdVar) throws IOException {
        if (i11 != 0) {
            ((i0) kdVar).writeEnum(i10, i11);
        }
    }

    public static void writeEnumList(int i10, List<Integer> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeEnumList(i10, list, z10);
    }

    public static void writeFixed32(int i10, int i11, kd kdVar) throws IOException {
        if (i11 != 0) {
            ((i0) kdVar).writeFixed32(i10, i11);
        }
    }

    public static void writeFixed32List(int i10, List<Integer> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeFixed32List(i10, list, z10);
    }

    public static void writeFixed64(int i10, long j10, kd kdVar) throws IOException {
        if (j10 != 0) {
            ((i0) kdVar).writeFixed64(i10, j10);
        }
    }

    public static void writeFixed64List(int i10, List<Long> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeFixed64List(i10, list, z10);
    }

    public static void writeFloat(int i10, float f10, kd kdVar) throws IOException {
        if (Float.compare(f10, 0.0f) != 0) {
            ((i0) kdVar).writeFloat(i10, f10);
        }
    }

    public static void writeFloatList(int i10, List<Float> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeFloatList(i10, list, z10);
    }

    public static void writeGroupList(int i10, List<?> list, kd kdVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeGroupList(i10, list);
    }

    public static void writeInt32(int i10, int i11, kd kdVar) throws IOException {
        if (i11 != 0) {
            ((i0) kdVar).writeInt32(i10, i11);
        }
    }

    public static void writeInt32List(int i10, List<Integer> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeInt32List(i10, list, z10);
    }

    public static void writeInt64(int i10, long j10, kd kdVar) throws IOException {
        if (j10 != 0) {
            ((i0) kdVar).writeInt64(i10, j10);
        }
    }

    public static void writeInt64List(int i10, List<Long> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeInt64List(i10, list, z10);
    }

    public static void writeLazyFieldList(int i10, List<?> list, kd kdVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            c8 c8Var = (c8) it.next();
            if (c8Var.f22030d != null) {
                ((i0) kdVar).writeBytes(i10, c8Var.f22030d);
            } else {
                ByteString byteString = c8Var.f22027a;
                if (byteString != null) {
                    ((i0) kdVar).writeBytes(i10, byteString);
                } else if (c8Var.f22029c != null) {
                    ((i0) kdVar).writeMessage(i10, c8Var.f22029c);
                } else {
                    ((i0) kdVar).writeBytes(i10, ByteString.EMPTY);
                }
            }
        }
    }

    public static void writeMessage(int i10, Object obj, kd kdVar) throws IOException {
        if (obj != null) {
            ((i0) kdVar).writeMessage(i10, obj);
        }
    }

    public static void writeMessageList(int i10, List<?> list, kd kdVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeMessageList(i10, list);
    }

    public static void writeSFixed32(int i10, int i11, kd kdVar) throws IOException {
        if (i11 != 0) {
            ((i0) kdVar).writeSFixed32(i10, i11);
        }
    }

    public static void writeSFixed32List(int i10, List<Integer> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeSFixed32List(i10, list, z10);
    }

    public static void writeSFixed64(int i10, long j10, kd kdVar) throws IOException {
        if (j10 != 0) {
            ((i0) kdVar).writeSFixed64(i10, j10);
        }
    }

    public static void writeSFixed64List(int i10, List<Long> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeSFixed64List(i10, list, z10);
    }

    public static void writeSInt32(int i10, int i11, kd kdVar) throws IOException {
        if (i11 != 0) {
            ((i0) kdVar).writeSInt32(i10, i11);
        }
    }

    public static void writeSInt32List(int i10, List<Integer> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeSInt32List(i10, list, z10);
    }

    public static void writeSInt64(int i10, long j10, kd kdVar) throws IOException {
        if (j10 != 0) {
            ((i0) kdVar).writeSInt64(i10, j10);
        }
    }

    public static void writeSInt64List(int i10, List<Long> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeSInt64List(i10, list, z10);
    }

    public static void writeString(int i10, Object obj, kd kdVar) throws IOException {
        if (!(obj instanceof String)) {
            writeBytes(i10, (ByteString) obj, kdVar);
            return;
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeString(i10, str);
    }

    public static void writeStringList(int i10, List<String> list, kd kdVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeStringList(i10, list);
    }

    public static void writeUInt32(int i10, int i11, kd kdVar) throws IOException {
        if (i11 != 0) {
            ((i0) kdVar).writeUInt32(i10, i11);
        }
    }

    public static void writeUInt32List(int i10, List<Integer> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeUInt32List(i10, list, z10);
    }

    public static void writeUInt64(int i10, long j10, kd kdVar) throws IOException {
        if (j10 != 0) {
            ((i0) kdVar).writeUInt64(i10, j10);
        }
    }

    public static void writeUInt64List(int i10, List<Long> list, kd kdVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeUInt64List(i10, list, z10);
    }

    public static Object x(Class cls, String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("$");
            StringBuilder sb3 = new StringBuilder();
            boolean z10 = true;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if ('a' > cCharAt || cCharAt > 'z') {
                    if ('A' > cCharAt || cCharAt > 'Z') {
                        if ('0' <= cCharAt && cCharAt <= '9') {
                            sb3.append(cCharAt);
                        }
                        z10 = true;
                    } else if (i10 != 0 || z10) {
                        sb3.append(cCharAt);
                    } else {
                        sb3.append((char) (cCharAt + ' '));
                    }
                } else if (z10) {
                    sb3.append((char) (cCharAt - ' '));
                } else {
                    sb3.append(cCharAt);
                }
                z10 = false;
            }
            sb2.append(sb3.toString());
            sb2.append("DefaultEntryHolder");
            Field[] declaredFields = Class.forName(sb2.toString()).getDeclaredFields();
            if (declaredFields.length == 1) {
                return sc.f22643c.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static bc y(boolean z10) {
        if (jc.class != 0) {
            try {
                return (bc) jc.class.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class cls2;
        if (!h6.class.isAssignableFrom(cls) && (cls2 = f22814a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(wHkgq.MZMX);
        }
    }

    public static boolean shouldUseTableSwitch(x5[] x5VarArr) {
        if (x5VarArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(x5VarArr[0].getFieldNumber(), x5VarArr[x5VarArr.length - 1].getFieldNumber(), x5VarArr.length);
    }

    public static void writeGroupList(int i10, List<?> list, kd kdVar, ua uaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeGroupList(i10, list, uaVar);
    }

    public static void writeMessageList(int i10, List<?> list, kd kdVar, ua uaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((i0) kdVar).writeMessageList(i10, list, uaVar);
    }
}
