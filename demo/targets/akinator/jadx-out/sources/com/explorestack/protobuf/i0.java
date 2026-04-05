package com.explorestack.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 implements kd {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f22214a;

    public i0(h0 h0Var) {
        Charset charset = x7.f22881a;
        this.f22214a = h0Var;
        h0Var.f22186a = this;
    }

    public static i0 forCodedOutput(h0 h0Var) {
        i0 i0Var = h0Var.f22186a;
        return i0Var != null ? i0Var : new i0(h0Var);
    }

    @Override // com.explorestack.protobuf.kd
    public jd fieldOrder() {
        return jd.f22280b;
    }

    public int getTotalBytesWritten() {
        return this.f22214a.getTotalBytesWritten();
    }

    @Override // com.explorestack.protobuf.kd
    public void writeBool(int i10, boolean z10) throws IOException {
        this.f22214a.writeBool(i10, z10);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeBoolList(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeBool(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeBoolSizeNoTag += h0.computeBoolSizeNoTag(list.get(i12).booleanValue());
        }
        h0Var.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeBoolNoTag(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeBytes(int i10, ByteString byteString) throws IOException {
        this.f22214a.writeBytes(i10, byteString);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeBytesList(int i10, List<ByteString> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f22214a.writeBytes(i10, list.get(i11));
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeDouble(int i10, double d10) throws IOException {
        this.f22214a.writeDouble(i10, d10);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeDoubleList(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeDouble(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeDoubleSizeNoTag += h0.computeDoubleSizeNoTag(list.get(i12).doubleValue());
        }
        h0Var.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeDoubleNoTag(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeEndGroup(int i10) throws IOException {
        this.f22214a.writeTag(i10, 4);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeEnum(int i10, int i11) throws IOException {
        this.f22214a.writeEnum(i10, i11);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeEnumList(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeEnum(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeEnumSizeNoTag += h0.computeEnumSizeNoTag(list.get(i12).intValue());
        }
        h0Var.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeEnumNoTag(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeFixed32(int i10, int i11) throws IOException {
        this.f22214a.writeFixed32(i10, i11);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeFixed32(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFixed32SizeNoTag += h0.computeFixed32SizeNoTag(list.get(i12).intValue());
        }
        h0Var.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeFixed32NoTag(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeFixed64(int i10, long j10) throws IOException {
        this.f22214a.writeFixed64(i10, j10);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeFixed64(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFixed64SizeNoTag += h0.computeFixed64SizeNoTag(list.get(i12).longValue());
        }
        h0Var.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeFixed64NoTag(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeFloat(int i10, float f10) throws IOException {
        this.f22214a.writeFloat(i10, f10);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeFloatList(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeFloat(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeFloatSizeNoTag += h0.computeFloatSizeNoTag(list.get(i12).floatValue());
        }
        h0Var.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeFloatNoTag(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeGroup(int i10, Object obj) throws IOException {
        this.f22214a.writeGroup(i10, (MessageLite) obj);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeGroupList(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeGroup(i10, list.get(i11));
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeInt32(int i10, int i11) throws IOException {
        this.f22214a.writeInt32(i10, i11);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeInt32(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeInt32SizeNoTag += h0.computeInt32SizeNoTag(list.get(i12).intValue());
        }
        h0Var.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeInt32NoTag(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeInt64(int i10, long j10) throws IOException {
        this.f22214a.writeInt64(i10, j10);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeInt64(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeInt64SizeNoTag += h0.computeInt64SizeNoTag(list.get(i12).longValue());
        }
        h0Var.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeInt64NoTag(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public <K, V> void writeMap(int i10, t8 t8Var, Map<K, V> map) throws IOException {
        h0 h0Var = this.f22214a;
        if (!h0Var.f22187b) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                h0Var.writeTag(i10, 2);
                h0Var.writeUInt32NoTag(u8.a(t8Var, entry.getKey(), entry.getValue()));
                u8.d(h0Var, t8Var, entry.getKey(), entry.getValue());
            }
            return;
        }
        int i11 = 0;
        switch (t8Var.f22661a.ordinal()) {
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
                    h0Var.writeTag(i10, 2);
                    h0Var.writeUInt32NoTag(u8.a(t8Var, Long.valueOf(j10), v10));
                    u8.d(h0Var, t8Var, Long.valueOf(j10), v10);
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
                    h0Var.writeTag(i10, 2);
                    h0Var.writeUInt32NoTag(u8.a(t8Var, Integer.valueOf(i14), v11));
                    u8.d(h0Var, t8Var, Integer.valueOf(i14), v11);
                    i11++;
                }
                return;
            case 7:
                Boolean bool = Boolean.FALSE;
                V v12 = map.get(bool);
                if (v12 != null) {
                    h0Var.writeTag(i10, 2);
                    h0Var.writeUInt32NoTag(u8.a(t8Var, bool, v12));
                    u8.d(h0Var, t8Var, bool, v12);
                }
                Boolean bool2 = Boolean.TRUE;
                V v13 = map.get(bool2);
                if (v13 != null) {
                    h0Var.writeTag(i10, 2);
                    h0Var.writeUInt32NoTag(u8.a(t8Var, bool2, v13));
                    u8.d(h0Var, t8Var, bool2, v13);
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
                    h0Var.writeTag(i10, 2);
                    h0Var.writeUInt32NoTag(u8.a(t8Var, str, v14));
                    u8.d(h0Var, t8Var, str, v14);
                    i11++;
                }
                return;
            case 9:
            case 10:
            case 11:
            case 13:
            default:
                throw new IllegalArgumentException("does not support key type: " + t8Var.f22661a);
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeMessage(int i10, Object obj) throws IOException {
        this.f22214a.writeMessage(i10, (MessageLite) obj);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeMessageList(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeMessage(i10, list.get(i11));
        }
    }

    @Override // com.explorestack.protobuf.kd
    public final void writeMessageSetItem(int i10, Object obj) throws IOException {
        boolean z10 = obj instanceof ByteString;
        h0 h0Var = this.f22214a;
        if (z10) {
            h0Var.writeRawMessageSetExtension(i10, (ByteString) obj);
        } else {
            h0Var.writeMessageSetExtension(i10, (MessageLite) obj);
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeSFixed32(int i10, int i11) throws IOException {
        this.f22214a.writeSFixed32(i10, i11);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeSFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeSFixed32(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSFixed32SizeNoTag += h0.computeSFixed32SizeNoTag(list.get(i12).intValue());
        }
        h0Var.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeSFixed32NoTag(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeSFixed64(int i10, long j10) throws IOException {
        this.f22214a.writeSFixed64(i10, j10);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeSFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeSFixed64(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSFixed64SizeNoTag += h0.computeSFixed64SizeNoTag(list.get(i12).longValue());
        }
        h0Var.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeSFixed64NoTag(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeSInt32(int i10, int i11) throws IOException {
        this.f22214a.writeSInt32(i10, i11);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeSInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeSInt32(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSInt32SizeNoTag += h0.computeSInt32SizeNoTag(list.get(i12).intValue());
        }
        h0Var.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeSInt32NoTag(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeSInt64(int i10, long j10) throws IOException {
        this.f22214a.writeSInt64(i10, j10);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeSInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeSInt64(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeSInt64SizeNoTag += h0.computeSInt64SizeNoTag(list.get(i12).longValue());
        }
        h0Var.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeSInt64NoTag(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeStartGroup(int i10) throws IOException {
        this.f22214a.writeTag(i10, 3);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeString(int i10, String str) throws IOException {
        this.f22214a.writeString(i10, str);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeStringList(int i10, List<String> list) throws IOException {
        boolean z10 = list instanceof g8;
        h0 h0Var = this.f22214a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeString(i10, list.get(i11));
                i11++;
            }
            return;
        }
        g8 g8Var = (g8) list;
        while (i11 < list.size()) {
            Object raw = g8Var.getRaw(i11);
            if (raw instanceof String) {
                h0Var.writeString(i10, (String) raw);
            } else {
                h0Var.writeBytes(i10, (ByteString) raw);
            }
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeUInt32(int i10, int i11) throws IOException {
        this.f22214a.writeUInt32(i10, i11);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeUInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeUInt32(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeUInt32SizeNoTag += h0.computeUInt32SizeNoTag(list.get(i12).intValue());
        }
        h0Var.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeUInt32NoTag(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeUInt64(int i10, long j10) throws IOException {
        this.f22214a.writeUInt64(i10, j10);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeUInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        h0 h0Var = this.f22214a;
        if (!z10) {
            while (i11 < list.size()) {
                h0Var.writeUInt64(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        h0Var.writeTag(i10, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iComputeUInt64SizeNoTag += h0.computeUInt64SizeNoTag(list.get(i12).longValue());
        }
        h0Var.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i11 < list.size()) {
            h0Var.writeUInt64NoTag(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeGroup(int i10, Object obj, ua uaVar) throws IOException {
        h0 h0Var = this.f22214a;
        h0Var.writeTag(i10, 3);
        uaVar.writeTo((MessageLite) obj, h0Var.f22186a);
        h0Var.writeTag(i10, 4);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeMessage(int i10, Object obj, ua uaVar) throws IOException {
        this.f22214a.c(i10, (MessageLite) obj, uaVar);
    }

    @Override // com.explorestack.protobuf.kd
    public void writeGroupList(int i10, List<?> list, ua uaVar) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeGroup(i10, list.get(i11), uaVar);
        }
    }

    @Override // com.explorestack.protobuf.kd
    public void writeMessageList(int i10, List<?> list, ua uaVar) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeMessage(i10, list.get(i11), uaVar);
        }
    }
}
