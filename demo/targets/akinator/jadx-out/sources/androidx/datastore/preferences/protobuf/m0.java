package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 implements v4 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f5957a;

    public m0(l0 l0Var) {
        Charset charset = t1.f6006a;
        this.f5957a = l0Var;
        l0Var.f5949a = this;
    }

    public static m0 forCodedOutput(l0 l0Var) {
        m0 m0Var = l0Var.f5949a;
        return m0Var != null ? m0Var : new m0(l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public u4 fieldOrder() {
        return u4.f6037b;
    }

    public int getTotalBytesWritten() {
        return this.f5957a.getTotalBytesWritten();
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeBool(int i10, boolean z10) throws IOException {
        this.f5957a.writeBool(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeBoolList(int i10, List<Boolean> list, boolean z10) throws IOException {
        boolean z11 = list instanceof h;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeBool(i10, list.get(i11).booleanValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeBoolSizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeBoolSizeNoTag += l0.computeBoolSizeNoTag(list.get(i12).booleanValue());
            }
            l0Var.writeUInt32NoTag(iComputeBoolSizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeBoolNoTag(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        h hVar = (h) list;
        if (!z10) {
            while (i11 < hVar.size()) {
                l0Var.writeBool(i10, hVar.getBoolean(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeBoolSizeNoTag2 = 0;
        for (int i13 = 0; i13 < hVar.size(); i13++) {
            iComputeBoolSizeNoTag2 += l0.computeBoolSizeNoTag(hVar.getBoolean(i13));
        }
        l0Var.writeUInt32NoTag(iComputeBoolSizeNoTag2);
        while (i11 < hVar.size()) {
            l0Var.writeBoolNoTag(hVar.getBoolean(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeBytes(int i10, x xVar) throws IOException {
        this.f5957a.writeBytes(i10, xVar);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeBytesList(int i10, List<x> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f5957a.writeBytes(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeDouble(int i10, double d10) throws IOException {
        this.f5957a.writeDouble(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeDoubleList(int i10, List<Double> list, boolean z10) throws IOException {
        boolean z11 = list instanceof n0;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeDouble(i10, list.get(i11).doubleValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeDoubleSizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeDoubleSizeNoTag += l0.computeDoubleSizeNoTag(list.get(i12).doubleValue());
            }
            l0Var.writeUInt32NoTag(iComputeDoubleSizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeDoubleNoTag(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        n0 n0Var = (n0) list;
        if (!z10) {
            while (i11 < n0Var.size()) {
                l0Var.writeDouble(i10, n0Var.getDouble(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeDoubleSizeNoTag2 = 0;
        for (int i13 = 0; i13 < n0Var.size(); i13++) {
            iComputeDoubleSizeNoTag2 += l0.computeDoubleSizeNoTag(n0Var.getDouble(i13));
        }
        l0Var.writeUInt32NoTag(iComputeDoubleSizeNoTag2);
        while (i11 < n0Var.size()) {
            l0Var.writeDoubleNoTag(n0Var.getDouble(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    @Deprecated
    public void writeEndGroup(int i10) throws IOException {
        this.f5957a.writeTag(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeEnum(int i10, int i11) throws IOException {
        this.f5957a.writeEnum(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeEnumList(int i10, List<Integer> list, boolean z10) throws IOException {
        boolean z11 = list instanceof j1;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeEnum(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeEnumSizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeEnumSizeNoTag += l0.computeEnumSizeNoTag(list.get(i12).intValue());
            }
            l0Var.writeUInt32NoTag(iComputeEnumSizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeEnumNoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.size()) {
                l0Var.writeEnum(i10, j1Var.getInt(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeEnumSizeNoTag2 = 0;
        for (int i13 = 0; i13 < j1Var.size(); i13++) {
            iComputeEnumSizeNoTag2 += l0.computeEnumSizeNoTag(j1Var.getInt(i13));
        }
        l0Var.writeUInt32NoTag(iComputeEnumSizeNoTag2);
        while (i11 < j1Var.size()) {
            l0Var.writeEnumNoTag(j1Var.getInt(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeFixed32(int i10, int i11) throws IOException {
        this.f5957a.writeFixed32(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        boolean z11 = list instanceof j1;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeFixed32(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeFixed32SizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeFixed32SizeNoTag += l0.computeFixed32SizeNoTag(list.get(i12).intValue());
            }
            l0Var.writeUInt32NoTag(iComputeFixed32SizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeFixed32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.size()) {
                l0Var.writeFixed32(i10, j1Var.getInt(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeFixed32SizeNoTag2 = 0;
        for (int i13 = 0; i13 < j1Var.size(); i13++) {
            iComputeFixed32SizeNoTag2 += l0.computeFixed32SizeNoTag(j1Var.getInt(i13));
        }
        l0Var.writeUInt32NoTag(iComputeFixed32SizeNoTag2);
        while (i11 < j1Var.size()) {
            l0Var.writeFixed32NoTag(j1Var.getInt(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeFixed64(int i10, long j10) throws IOException {
        this.f5957a.writeFixed64(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        boolean z11 = list instanceof e2;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeFixed64(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeFixed64SizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeFixed64SizeNoTag += l0.computeFixed64SizeNoTag(list.get(i12).longValue());
            }
            l0Var.writeUInt32NoTag(iComputeFixed64SizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeFixed64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z10) {
            while (i11 < e2Var.size()) {
                l0Var.writeFixed64(i10, e2Var.getLong(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeFixed64SizeNoTag2 = 0;
        for (int i13 = 0; i13 < e2Var.size(); i13++) {
            iComputeFixed64SizeNoTag2 += l0.computeFixed64SizeNoTag(e2Var.getLong(i13));
        }
        l0Var.writeUInt32NoTag(iComputeFixed64SizeNoTag2);
        while (i11 < e2Var.size()) {
            l0Var.writeFixed64NoTag(e2Var.getLong(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeFloat(int i10, float f10) throws IOException {
        this.f5957a.writeFloat(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeFloatList(int i10, List<Float> list, boolean z10) throws IOException {
        boolean z11 = list instanceof c1;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeFloat(i10, list.get(i11).floatValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeFloatSizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeFloatSizeNoTag += l0.computeFloatSizeNoTag(list.get(i12).floatValue());
            }
            l0Var.writeUInt32NoTag(iComputeFloatSizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeFloatNoTag(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        c1 c1Var = (c1) list;
        if (!z10) {
            while (i11 < c1Var.size()) {
                l0Var.writeFloat(i10, c1Var.getFloat(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeFloatSizeNoTag2 = 0;
        for (int i13 = 0; i13 < c1Var.size(); i13++) {
            iComputeFloatSizeNoTag2 += l0.computeFloatSizeNoTag(c1Var.getFloat(i13));
        }
        l0Var.writeUInt32NoTag(iComputeFloatSizeNoTag2);
        while (i11 < c1Var.size()) {
            l0Var.writeFloatNoTag(c1Var.getFloat(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    @Deprecated
    public void writeGroup(int i10, Object obj) throws IOException {
        this.f5957a.writeGroup(i10, (r2) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    @Deprecated
    public void writeGroupList(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeGroup(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeInt32(int i10, int i11) throws IOException {
        this.f5957a.writeInt32(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        boolean z11 = list instanceof j1;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeInt32(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeInt32SizeNoTag += l0.computeInt32SizeNoTag(list.get(i12).intValue());
            }
            l0Var.writeUInt32NoTag(iComputeInt32SizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeInt32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.size()) {
                l0Var.writeInt32(i10, j1Var.getInt(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeInt32SizeNoTag2 = 0;
        for (int i13 = 0; i13 < j1Var.size(); i13++) {
            iComputeInt32SizeNoTag2 += l0.computeInt32SizeNoTag(j1Var.getInt(i13));
        }
        l0Var.writeUInt32NoTag(iComputeInt32SizeNoTag2);
        while (i11 < j1Var.size()) {
            l0Var.writeInt32NoTag(j1Var.getInt(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeInt64(int i10, long j10) throws IOException {
        this.f5957a.writeInt64(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        boolean z11 = list instanceof e2;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeInt64(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeInt64SizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeInt64SizeNoTag += l0.computeInt64SizeNoTag(list.get(i12).longValue());
            }
            l0Var.writeUInt32NoTag(iComputeInt64SizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeInt64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z10) {
            while (i11 < e2Var.size()) {
                l0Var.writeInt64(i10, e2Var.getLong(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeInt64SizeNoTag2 = 0;
        for (int i13 = 0; i13 < e2Var.size(); i13++) {
            iComputeInt64SizeNoTag2 += l0.computeInt64SizeNoTag(e2Var.getLong(i13));
        }
        l0Var.writeUInt32NoTag(iComputeInt64SizeNoTag2);
        while (i11 < e2Var.size()) {
            l0Var.writeInt64NoTag(e2Var.getLong(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public <K, V> void writeMap(int i10, i2 i2Var, Map<K, V> map) throws IOException {
        l0 l0Var = this.f5957a;
        if (!l0Var.f5950b) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                l0Var.writeTag(i10, 2);
                l0Var.writeUInt32NoTag(j2.a(i2Var, entry.getKey(), entry.getValue()));
                j2.c(l0Var, i2Var, entry.getKey(), entry.getValue());
            }
            return;
        }
        int i11 = 0;
        switch (i2Var.f5902a.ordinal()) {
            case 2:
            case 3:
            case 5:
            case 15:
            case 17:
                int size = map.size();
                long[] jArr = new long[size];
                Iterator<K> it = map.keySet().iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    jArr[i12] = ((Long) it.next()).longValue();
                    i12++;
                }
                Arrays.sort(jArr);
                while (i11 < size) {
                    long j10 = jArr[i11];
                    V v10 = map.get(Long.valueOf(j10));
                    l0Var.writeTag(i10, 2);
                    l0Var.writeUInt32NoTag(j2.a(i2Var, Long.valueOf(j10), v10));
                    j2.c(l0Var, i2Var, Long.valueOf(j10), v10);
                    i11++;
                }
                return;
            case 4:
            case 6:
            case 12:
            case 14:
            case 16:
                int size2 = map.size();
                int[] iArr = new int[size2];
                Iterator<K> it2 = map.keySet().iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    iArr[i13] = ((Integer) it2.next()).intValue();
                    i13++;
                }
                Arrays.sort(iArr);
                while (i11 < size2) {
                    int i14 = iArr[i11];
                    V v11 = map.get(Integer.valueOf(i14));
                    l0Var.writeTag(i10, 2);
                    l0Var.writeUInt32NoTag(j2.a(i2Var, Integer.valueOf(i14), v11));
                    j2.c(l0Var, i2Var, Integer.valueOf(i14), v11);
                    i11++;
                }
                return;
            case 7:
                Boolean bool = Boolean.FALSE;
                V v12 = map.get(bool);
                if (v12 != null) {
                    l0Var.writeTag(i10, 2);
                    l0Var.writeUInt32NoTag(j2.a(i2Var, bool, v12));
                    j2.c(l0Var, i2Var, bool, v12);
                }
                Boolean bool2 = Boolean.TRUE;
                V v13 = map.get(bool2);
                if (v13 != null) {
                    l0Var.writeTag(i10, 2);
                    l0Var.writeUInt32NoTag(j2.a(i2Var, bool2, v13));
                    j2.c(l0Var, i2Var, bool2, v13);
                    return;
                }
                return;
            case 8:
                int size3 = map.size();
                String[] strArr = new String[size3];
                Iterator<K> it3 = map.keySet().iterator();
                int i15 = 0;
                while (it3.hasNext()) {
                    strArr[i15] = (String) it3.next();
                    i15++;
                }
                Arrays.sort(strArr);
                while (i11 < size3) {
                    String str = strArr[i11];
                    V v14 = map.get(str);
                    l0Var.writeTag(i10, 2);
                    l0Var.writeUInt32NoTag(j2.a(i2Var, str, v14));
                    j2.c(l0Var, i2Var, str, v14);
                    i11++;
                }
                return;
            case 9:
            case 10:
            case 11:
            case 13:
            default:
                throw new IllegalArgumentException("does not support key type: " + i2Var.f5902a);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeMessage(int i10, Object obj) throws IOException {
        this.f5957a.writeMessage(i10, (r2) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeMessageList(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeMessage(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public final void writeMessageSetItem(int i10, Object obj) throws IOException {
        boolean z10 = obj instanceof x;
        l0 l0Var = this.f5957a;
        if (z10) {
            l0Var.writeRawMessageSetExtension(i10, (x) obj);
        } else {
            l0Var.writeMessageSetExtension(i10, (r2) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeSFixed32(int i10, int i11) throws IOException {
        this.f5957a.writeSFixed32(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeSFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        boolean z11 = list instanceof j1;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeSFixed32(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeSFixed32SizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeSFixed32SizeNoTag += l0.computeSFixed32SizeNoTag(list.get(i12).intValue());
            }
            l0Var.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeSFixed32NoTag(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        j1 j1Var = (j1) list;
        if (!z10) {
            while (i11 < j1Var.size()) {
                l0Var.writeSFixed32(i10, j1Var.getInt(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeSFixed32SizeNoTag2 = 0;
        for (int i13 = 0; i13 < j1Var.size(); i13++) {
            iComputeSFixed32SizeNoTag2 += l0.computeSFixed32SizeNoTag(j1Var.getInt(i13));
        }
        l0Var.writeUInt32NoTag(iComputeSFixed32SizeNoTag2);
        while (i11 < j1Var.size()) {
            l0Var.writeSFixed32NoTag(j1Var.getInt(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeSFixed64(int i10, long j10) throws IOException {
        this.f5957a.writeSFixed64(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeSFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        boolean z11 = list instanceof e2;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeSFixed64(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeSFixed64SizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeSFixed64SizeNoTag += l0.computeSFixed64SizeNoTag(list.get(i12).longValue());
            }
            l0Var.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeSFixed64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z10) {
            while (i11 < e2Var.size()) {
                l0Var.writeSFixed64(i10, e2Var.getLong(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeSFixed64SizeNoTag2 = 0;
        for (int i13 = 0; i13 < e2Var.size(); i13++) {
            iComputeSFixed64SizeNoTag2 += l0.computeSFixed64SizeNoTag(e2Var.getLong(i13));
        }
        l0Var.writeUInt32NoTag(iComputeSFixed64SizeNoTag2);
        while (i11 < e2Var.size()) {
            l0Var.writeSFixed64NoTag(e2Var.getLong(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeSInt32(int i10, int i11) throws IOException {
        this.f5957a.writeSInt32(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeSInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!(list instanceof j1)) {
            writeSInt32ListInternal(i10, list, z10);
            return;
        }
        j1 j1Var = (j1) list;
        int i11 = 0;
        l0 l0Var = this.f5957a;
        if (!z10) {
            while (i11 < j1Var.size()) {
                l0Var.writeSInt32(i10, j1Var.getInt(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < j1Var.size(); i12++) {
            iComputeSInt32SizeNoTag += l0.computeSInt32SizeNoTag(j1Var.getInt(i12));
        }
        l0Var.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i11 < j1Var.size()) {
            l0Var.writeSInt32NoTag(j1Var.getInt(i11));
            i11++;
        }
    }

    public void writeSInt32ListInternal(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        l0 l0Var = this.f5957a;
        if (!z10) {
            while (i11 < list.size()) {
                l0Var.writeSInt32(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSInt32SizeNoTag += l0.computeSInt32SizeNoTag(list.get(i12).intValue());
        }
        l0Var.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i11 < list.size()) {
            l0Var.writeSInt32NoTag(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeSInt64(int i10, long j10) throws IOException {
        this.f5957a.writeSInt64(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeSInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        boolean z11 = list instanceof e2;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeSInt64(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeSInt64SizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeSInt64SizeNoTag += l0.computeSInt64SizeNoTag(list.get(i12).longValue());
            }
            l0Var.writeUInt32NoTag(iComputeSInt64SizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeSInt64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z10) {
            while (i11 < e2Var.size()) {
                l0Var.writeSInt64(i10, e2Var.getLong(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeSInt64SizeNoTag2 = 0;
        for (int i13 = 0; i13 < e2Var.size(); i13++) {
            iComputeSInt64SizeNoTag2 += l0.computeSInt64SizeNoTag(e2Var.getLong(i13));
        }
        l0Var.writeUInt32NoTag(iComputeSInt64SizeNoTag2);
        while (i11 < e2Var.size()) {
            l0Var.writeSInt64NoTag(e2Var.getLong(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    @Deprecated
    public void writeStartGroup(int i10) throws IOException {
        this.f5957a.writeTag(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeString(int i10, String str) throws IOException {
        this.f5957a.writeString(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeStringList(int i10, List<String> list) throws IOException {
        boolean z10 = list instanceof a2;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                l0Var.writeString(i10, list.get(i11));
                i11++;
            }
            return;
        }
        a2 a2Var = (a2) list;
        while (i11 < list.size()) {
            Object objL = a2Var.l();
            if (objL instanceof String) {
                l0Var.writeString(i10, (String) objL);
            } else {
                l0Var.writeBytes(i10, (x) objL);
            }
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeUInt32(int i10, int i11) throws IOException {
        this.f5957a.writeUInt32(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeUInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        if (!(list instanceof j1)) {
            writeUInt32ListInternal(i10, list, z10);
            return;
        }
        j1 j1Var = (j1) list;
        int i11 = 0;
        l0 l0Var = this.f5957a;
        if (!z10) {
            while (i11 < j1Var.size()) {
                l0Var.writeUInt32(i10, j1Var.getInt(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < j1Var.size(); i12++) {
            iComputeUInt32SizeNoTag += l0.computeUInt32SizeNoTag(j1Var.getInt(i12));
        }
        l0Var.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i11 < j1Var.size()) {
            l0Var.writeUInt32NoTag(j1Var.getInt(i11));
            i11++;
        }
    }

    public void writeUInt32ListInternal(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        l0 l0Var = this.f5957a;
        if (!z10) {
            while (i11 < list.size()) {
                l0Var.writeUInt32(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeUInt32SizeNoTag += l0.computeUInt32SizeNoTag(list.get(i12).intValue());
        }
        l0Var.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i11 < list.size()) {
            l0Var.writeUInt32NoTag(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeUInt64(int i10, long j10) throws IOException {
        this.f5957a.writeUInt64(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeUInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        boolean z11 = list instanceof e2;
        l0 l0Var = this.f5957a;
        int i11 = 0;
        if (!z11) {
            if (!z10) {
                while (i11 < list.size()) {
                    l0Var.writeUInt64(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            l0Var.writeTag(i10, 2);
            int iComputeUInt64SizeNoTag = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iComputeUInt64SizeNoTag += l0.computeUInt64SizeNoTag(list.get(i12).longValue());
            }
            l0Var.writeUInt32NoTag(iComputeUInt64SizeNoTag);
            while (i11 < list.size()) {
                l0Var.writeUInt64NoTag(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        e2 e2Var = (e2) list;
        if (!z10) {
            while (i11 < e2Var.size()) {
                l0Var.writeUInt64(i10, e2Var.getLong(i11));
                i11++;
            }
            return;
        }
        l0Var.writeTag(i10, 2);
        int iComputeUInt64SizeNoTag2 = 0;
        for (int i13 = 0; i13 < e2Var.size(); i13++) {
            iComputeUInt64SizeNoTag2 += l0.computeUInt64SizeNoTag(e2Var.getLong(i13));
        }
        l0Var.writeUInt32NoTag(iComputeUInt64SizeNoTag2);
        while (i11 < e2Var.size()) {
            l0Var.writeUInt64NoTag(e2Var.getLong(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeGroup(int i10, Object obj, m3 m3Var) throws IOException {
        l0 l0Var = this.f5957a;
        l0Var.writeTag(i10, 3);
        m3Var.writeTo((r2) obj, l0Var.f5949a);
        l0Var.writeTag(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeMessage(int i10, Object obj, m3 m3Var) throws IOException {
        this.f5957a.b(i10, (r2) obj, m3Var);
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeGroupList(int i10, List<?> list, m3 m3Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeGroup(i10, list.get(i11), m3Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.v4
    public void writeMessageList(int i10, List<?> list, m3 m3Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeMessage(i10, list.get(i11), m3Var);
        }
    }
}
