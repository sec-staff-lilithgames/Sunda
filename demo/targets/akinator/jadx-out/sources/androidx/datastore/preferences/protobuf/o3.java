package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5966a;

    /* renamed from: b, reason: collision with root package name */
    public static final b4 f5967b;

    /* renamed from: c, reason: collision with root package name */
    public static final d4 f5968c;

    static {
        Class<?> cls;
        Class<?> cls2;
        d3 d3Var = d3.f5851c;
        b4 b4Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f5966a = cls;
        try {
            d3 d3Var2 = d3.f5851c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                b4Var = (b4) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f5967b = b4Var;
        f5968c = new d4();
    }

    public static int a(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iComputeEnumSizeNoTag = 0;
            while (i10 < size) {
                iComputeEnumSizeNoTag += l0.computeEnumSizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeEnumSizeNoTag;
        }
        j1 j1Var = (j1) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i10 < size) {
            iComputeEnumSizeNoTag2 += l0.computeEnumSizeNoTag(j1Var.getInt(i10));
            i10++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l0.computeFixed32Size(i10, 0) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l0.computeFixed64Size(i10, 0L) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iComputeInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt32SizeNoTag += l0.computeInt32SizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeInt32SizeNoTag;
        }
        j1 j1Var = (j1) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeInt32SizeNoTag2 += l0.computeInt32SizeNoTag(j1Var.getInt(i10));
            i10++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int e(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e2)) {
            int iComputeInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeInt64SizeNoTag += l0.computeInt64SizeNoTag(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iComputeInt64SizeNoTag;
        }
        e2 e2Var = (e2) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeInt64SizeNoTag2 += l0.computeInt64SizeNoTag(e2Var.getLong(i10));
            i10++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt32SizeNoTag += l0.computeSInt32SizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeSInt32SizeNoTag;
        }
        j1 j1Var = (j1) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeSInt32SizeNoTag2 += l0.computeSInt32SizeNoTag(j1Var.getInt(i10));
            i10++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int g(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e2)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeSInt64SizeNoTag += l0.computeSInt64SizeNoTag(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iComputeSInt64SizeNoTag;
        }
        e2 e2Var = (e2) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeSInt64SizeNoTag2 += l0.computeSInt64SizeNoTag(e2Var.getLong(i10));
            i10++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int h(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j1)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt32SizeNoTag += l0.computeUInt32SizeNoTag(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iComputeUInt32SizeNoTag;
        }
        j1 j1Var = (j1) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeUInt32SizeNoTag2 += l0.computeUInt32SizeNoTag(j1Var.getInt(i10));
            i10++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof e2)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i10 < size) {
                iComputeUInt64SizeNoTag += l0.computeUInt64SizeNoTag(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iComputeUInt64SizeNoTag;
        }
        e2 e2Var = (e2) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i10 < size) {
            iComputeUInt64SizeNoTag2 += l0.computeUInt64SizeNoTag(e2Var.getLong(i10));
            i10++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    public static void k(b4 b4Var, Object obj, Object obj2) {
        ((d4) b4Var).getClass();
        f1 f1Var = (f1) obj;
        c4 c4Var = f1Var.unknownFields;
        c4 c4Var2 = ((f1) obj2).unknownFields;
        if (!c4.getDefaultInstance().equals(c4Var2)) {
            if (c4.getDefaultInstance().equals(c4Var)) {
                int i10 = c4Var.f5838a + c4Var2.f5838a;
                int[] iArrCopyOf = Arrays.copyOf(c4Var.f5839b, i10);
                System.arraycopy(c4Var2.f5839b, 0, iArrCopyOf, c4Var.f5838a, c4Var2.f5838a);
                Object[] objArrCopyOf = Arrays.copyOf(c4Var.f5840c, i10);
                System.arraycopy(c4Var2.f5840c, 0, objArrCopyOf, c4Var.f5838a, c4Var2.f5838a);
                c4Var = new c4(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                c4Var.getClass();
                if (!c4Var2.equals(c4.getDefaultInstance())) {
                    if (!c4Var.f5842e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = c4Var.f5838a + c4Var2.f5838a;
                    c4Var.a(i11);
                    System.arraycopy(c4Var2.f5839b, 0, c4Var.f5839b, c4Var.f5838a, c4Var2.f5838a);
                    System.arraycopy(c4Var2.f5840c, 0, c4Var.f5840c, c4Var.f5838a, c4Var2.f5838a);
                    c4Var.f5838a = i11;
                }
            }
        }
        f1Var.unknownFields = c4Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        if (f1.class.isAssignableFrom(cls)) {
            return;
        }
        d3 d3Var = d3.f5851c;
        Class cls2 = f5966a;
        if (cls2 != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean shouldUseTableSwitch(int i10, int i11, int i12) {
        if (i11 < 40) {
            return true;
        }
        long j10 = i11 - i10;
        long j11 = i12;
        return j10 + 10 <= ((j11 + 3) * 3) + ((2 * j11) + 3);
    }

    public static b4 unknownFieldSetFullSchema() {
        return f5967b;
    }

    public static b4 unknownFieldSetLiteSchema() {
        return f5968c;
    }

    public static void writeBool(int i10, boolean z10, v4 v4Var) throws IOException {
        if (z10) {
            ((m0) v4Var).writeBool(i10, true);
        }
    }

    public static void writeBoolList(int i10, List<Boolean> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeBoolList(i10, list, z10);
    }

    public static void writeBytes(int i10, x xVar, v4 v4Var) throws IOException {
        if (xVar == null || xVar.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeBytes(i10, xVar);
    }

    public static void writeBytesList(int i10, List<x> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeBytesList(i10, list);
    }

    public static void writeDouble(int i10, double d10, v4 v4Var) throws IOException {
        if (Double.doubleToRawLongBits(d10) != 0) {
            ((m0) v4Var).writeDouble(i10, d10);
        }
    }

    public static void writeDoubleList(int i10, List<Double> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeDoubleList(i10, list, z10);
    }

    public static void writeEnum(int i10, int i11, v4 v4Var) throws IOException {
        if (i11 != 0) {
            ((m0) v4Var).writeEnum(i10, i11);
        }
    }

    public static void writeEnumList(int i10, List<Integer> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeEnumList(i10, list, z10);
    }

    public static void writeFixed32(int i10, int i11, v4 v4Var) throws IOException {
        if (i11 != 0) {
            ((m0) v4Var).writeFixed32(i10, i11);
        }
    }

    public static void writeFixed32List(int i10, List<Integer> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeFixed32List(i10, list, z10);
    }

    public static void writeFixed64(int i10, long j10, v4 v4Var) throws IOException {
        if (j10 != 0) {
            ((m0) v4Var).writeFixed64(i10, j10);
        }
    }

    public static void writeFixed64List(int i10, List<Long> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeFixed64List(i10, list, z10);
    }

    public static void writeFloat(int i10, float f10, v4 v4Var) throws IOException {
        if (Float.floatToRawIntBits(f10) != 0) {
            ((m0) v4Var).writeFloat(i10, f10);
        }
    }

    public static void writeFloatList(int i10, List<Float> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeFloatList(i10, list, z10);
    }

    public static void writeGroupList(int i10, List<?> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeGroupList(i10, list);
    }

    public static void writeInt32(int i10, int i11, v4 v4Var) throws IOException {
        if (i11 != 0) {
            ((m0) v4Var).writeInt32(i10, i11);
        }
    }

    public static void writeInt32List(int i10, List<Integer> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeInt32List(i10, list, z10);
    }

    public static void writeInt64(int i10, long j10, v4 v4Var) throws IOException {
        if (j10 != 0) {
            ((m0) v4Var).writeInt64(i10, j10);
        }
    }

    public static void writeInt64List(int i10, List<Long> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeInt64List(i10, list, z10);
    }

    public static void writeLazyFieldList(int i10, List<?> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            z1 z1Var = (z1) it.next();
            if (z1Var.f6157d != null) {
                ((m0) v4Var).writeBytes(i10, z1Var.f6157d);
            } else {
                x xVar = z1Var.f6154a;
                if (xVar != null) {
                    ((m0) v4Var).writeBytes(i10, xVar);
                } else if (z1Var.f6156c != null) {
                    ((m0) v4Var).writeMessage(i10, z1Var.f6156c);
                } else {
                    ((m0) v4Var).writeBytes(i10, x.f6099c);
                }
            }
        }
    }

    public static void writeMessage(int i10, Object obj, v4 v4Var) throws IOException {
        if (obj != null) {
            ((m0) v4Var).writeMessage(i10, obj);
        }
    }

    public static void writeMessageList(int i10, List<?> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeMessageList(i10, list);
    }

    public static void writeSFixed32(int i10, int i11, v4 v4Var) throws IOException {
        if (i11 != 0) {
            ((m0) v4Var).writeSFixed32(i10, i11);
        }
    }

    public static void writeSFixed32List(int i10, List<Integer> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeSFixed32List(i10, list, z10);
    }

    public static void writeSFixed64(int i10, long j10, v4 v4Var) throws IOException {
        if (j10 != 0) {
            ((m0) v4Var).writeSFixed64(i10, j10);
        }
    }

    public static void writeSFixed64List(int i10, List<Long> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeSFixed64List(i10, list, z10);
    }

    public static void writeSInt32(int i10, int i11, v4 v4Var) throws IOException {
        if (i11 != 0) {
            ((m0) v4Var).writeSInt32(i10, i11);
        }
    }

    public static void writeSInt32List(int i10, List<Integer> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeSInt32List(i10, list, z10);
    }

    public static void writeSInt64(int i10, long j10, v4 v4Var) throws IOException {
        if (j10 != 0) {
            ((m0) v4Var).writeSInt64(i10, j10);
        }
    }

    public static void writeSInt64List(int i10, List<Long> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeSInt64List(i10, list, z10);
    }

    public static void writeString(int i10, Object obj, v4 v4Var) throws IOException {
        if (!(obj instanceof String)) {
            writeBytes(i10, (x) obj, v4Var);
            return;
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeString(i10, str);
    }

    public static void writeStringList(int i10, List<String> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeStringList(i10, list);
    }

    public static void writeUInt32(int i10, int i11, v4 v4Var) throws IOException {
        if (i11 != 0) {
            ((m0) v4Var).writeUInt32(i10, i11);
        }
    }

    public static void writeUInt32List(int i10, List<Integer> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeUInt32List(i10, list, z10);
    }

    public static void writeUInt64(int i10, long j10, v4 v4Var) throws IOException {
        if (j10 != 0) {
            ((m0) v4Var).writeUInt64(i10, j10);
        }
    }

    public static void writeUInt64List(int i10, List<Long> list, v4 v4Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeUInt64List(i10, list, z10);
    }

    public static boolean shouldUseTableSwitch(x0[] x0VarArr) {
        if (x0VarArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(x0VarArr[0].getFieldNumber(), x0VarArr[x0VarArr.length - 1].getFieldNumber(), x0VarArr.length);
    }

    public static void writeGroupList(int i10, List<?> list, v4 v4Var, m3 m3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeGroupList(i10, list, m3Var);
    }

    public static void writeMessageList(int i10, List<?> list, v4 v4Var, m3 m3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((m0) v4Var).writeMessageList(i10, list, m3Var);
    }

    public static Object j(Object obj, int i10, List list, Object obj2, b4 b4Var) {
        return obj2;
    }
}
