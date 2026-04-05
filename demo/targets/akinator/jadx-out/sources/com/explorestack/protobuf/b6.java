package com.explorestack.protobuf;

import com.explorestack.protobuf.b8;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b6 {

    /* renamed from: d, reason: collision with root package name */
    public static final b6 f21942d;

    /* renamed from: a, reason: collision with root package name */
    public final gb f21943a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21944b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21945c;

    static {
        b6 b6Var = new b6(new ya(0));
        b6Var.makeImmutable();
        f21942d = b6Var;
    }

    public b6() {
        this.f21943a = new ya(16);
    }

    public static ya a(gb gbVar, boolean z10) {
        int i10 = gb.f22166j;
        ya yaVar = new ya(16);
        for (int i11 = 0; i11 < gbVar.getNumArrayEntries(); i11++) {
            b(yaVar, gbVar.getArrayEntryAt(i11), z10);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = gbVar.getOverflowEntries().iterator();
        while (it.hasNext()) {
            b(yaVar, it.next(), z10);
        }
        return yaVar;
    }

    public static void b(ya yaVar, Map.Entry entry, boolean z10) {
        a6 a6Var = (a6) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b8) {
            yaVar.put((ya) a6Var, (a6) ((b8) value).getValue());
        } else if (z10 && (value instanceof List)) {
            yaVar.put((ya) a6Var, (a6) new ArrayList((List) value));
        } else {
            yaVar.put((ya) a6Var, (a6) value);
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int computeFieldSize(a6 a6Var, Object obj) {
        bd liteType = a6Var.getLiteType();
        int number = a6Var.getNumber();
        if (!a6Var.isRepeated()) {
            return d(liteType, number, obj);
        }
        int iD = 0;
        if (!a6Var.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += d(liteType, number, it.next());
            }
            return iD;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iD += e(liteType, it2.next());
        }
        return h0.computeRawVarint32Size(iD) + h0.computeTagSize(number) + iD;
    }

    public static int d(bd bdVar, int i10, Object obj) {
        int iComputeTagSize = h0.computeTagSize(i10);
        if (bdVar == bd.f21957g) {
            iComputeTagSize *= 2;
        }
        return e(bdVar, obj) + iComputeTagSize;
    }

    public static int e(bd bdVar, Object obj) {
        switch (bdVar.ordinal()) {
            case 0:
                return h0.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 1:
                return h0.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 2:
                return h0.computeInt64SizeNoTag(((Long) obj).longValue());
            case 3:
                return h0.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return h0.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 5:
                return h0.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 6:
                return h0.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 7:
                return h0.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 8:
                return obj instanceof ByteString ? h0.computeBytesSizeNoTag((ByteString) obj) : h0.computeStringSizeNoTag((String) obj);
            case 9:
                return h0.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof b8 ? h0.computeLazyFieldSizeNoTag((b8) obj) : h0.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? h0.computeBytesSizeNoTag((ByteString) obj) : h0.computeByteArraySizeNoTag((byte[]) obj);
            case 12:
                return h0.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 13:
                return obj instanceof o7 ? h0.computeEnumSizeNoTag(((o7) obj).getNumber()) : h0.computeEnumSizeNoTag(((Integer) obj).intValue());
            case 14:
                return h0.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return h0.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return h0.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return h0.computeSInt64SizeNoTag(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends a6> b6 emptySet() {
        return f21942d;
    }

    public static int f(Map.Entry entry) {
        a6 a6Var = (a6) entry.getKey();
        Object value = entry.getValue();
        return (a6Var.getLiteJavaType() != cd.MESSAGE || a6Var.isRepeated() || a6Var.isPacked()) ? computeFieldSize(a6Var, value) : value instanceof b8 ? h0.computeLazyFieldMessageSetExtensionSize(((a6) entry.getKey()).getNumber(), (b8) value) : h0.computeMessageSetExtensionSize(((a6) entry.getKey()).getNumber(), (MessageLite) value);
    }

    public static boolean g(Map.Entry entry) {
        a6 a6Var = (a6) entry.getKey();
        if (a6Var.getLiteJavaType() == cd.MESSAGE) {
            if (a6Var.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof MessageLite)) {
                    if (value instanceof b8) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((MessageLite) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean h(bd bdVar, Object obj) {
        Charset charset = x7.f22881a;
        obj.getClass();
        switch (bdVar.getJavaType().ordinal()) {
            case 6:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                }
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof o7)) {
                }
                break;
            case 8:
                if ((obj instanceof MessageLite) || (obj instanceof b8)) {
                }
                break;
        }
        return false;
    }

    public static void j(a6 a6Var, Object obj) {
        if (!h(a6Var.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(a6Var.getNumber()), a6Var.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void k(h0 h0Var, bd bdVar, int i10, Object obj) throws IOException {
        if (bdVar == bd.f21957g) {
            h0Var.writeGroup(i10, (MessageLite) obj);
        } else {
            h0Var.writeTag(i10, bdVar.getWireType());
            l(h0Var, bdVar, obj);
        }
    }

    public static void l(h0 h0Var, bd bdVar, Object obj) throws IOException {
        switch (bdVar.ordinal()) {
            case 0:
                h0Var.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 1:
                h0Var.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 2:
                h0Var.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 3:
                h0Var.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                h0Var.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 5:
                h0Var.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 6:
                h0Var.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 7:
                h0Var.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    h0Var.writeStringNoTag((String) obj);
                    break;
                } else {
                    h0Var.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 9:
                h0Var.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                h0Var.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    h0Var.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    h0Var.writeBytesNoTag((ByteString) obj);
                    break;
                }
            case 12:
                h0Var.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof o7)) {
                    h0Var.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    h0Var.writeEnumNoTag(((o7) obj).getNumber());
                    break;
                }
            case 14:
                h0Var.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                h0Var.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                h0Var.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                h0Var.writeSInt64NoTag(((Long) obj).longValue());
                break;
        }
    }

    public static void m(Map.Entry entry, h0 h0Var) throws IOException {
        a6 a6Var = (a6) entry.getKey();
        if (a6Var.getLiteJavaType() != cd.MESSAGE || a6Var.isRepeated() || a6Var.isPacked()) {
            writeField(a6Var, entry.getValue(), h0Var);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof b8) {
            value = ((b8) value).getValue();
        }
        h0Var.writeMessageSetExtension(((a6) entry.getKey()).getNumber(), (MessageLite) value);
    }

    public static <T extends a6> z5 newBuilder() {
        int i10 = gb.f22166j;
        return new z5(new ya(16));
    }

    public static <T extends a6> b6 newFieldSet() {
        return new b6();
    }

    public static Object readPrimitiveField(y yVar, bd bdVar, boolean z10) throws IOException {
        return z10 ? hd.a(yVar, bdVar, gd.f22179c) : hd.a(yVar, bdVar, gd.f22178b);
    }

    public static void writeField(a6 a6Var, Object obj, h0 h0Var) throws IOException {
        bd liteType = a6Var.getLiteType();
        int number = a6Var.getNumber();
        if (!a6Var.isRepeated()) {
            if (obj instanceof b8) {
                k(h0Var, liteType, number, ((b8) obj).getValue());
                return;
            } else {
                k(h0Var, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!a6Var.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(h0Var, liteType, number, it.next());
            }
            return;
        }
        h0Var.writeTag(number, 2);
        Iterator it2 = list.iterator();
        int iE = 0;
        while (it2.hasNext()) {
            iE += e(liteType, it2.next());
        }
        h0Var.writeRawVarint32(iE);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            l(h0Var, liteType, it3.next());
        }
    }

    public void addRepeatedField(a6 a6Var, Object obj) {
        List arrayList;
        if (!a6Var.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(a6Var, obj);
        Object field = getField(a6Var);
        if (field == null) {
            arrayList = new ArrayList();
            this.f21943a.put((Comparable<Object>) a6Var, (Object) arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public void clear() {
        this.f21943a.clear();
        this.f21945c = false;
    }

    public void clearField(a6 a6Var) {
        gb gbVar = this.f21943a;
        gbVar.remove(a6Var);
        if (gbVar.isEmpty()) {
            this.f21945c = false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b6) {
            return this.f21943a.equals(((b6) obj).f21943a);
        }
        return false;
    }

    public Map<a6, Object> getAllFields() {
        boolean z10 = this.f21945c;
        gb gbVar = this.f21943a;
        if (!z10) {
            return gbVar.isImmutable() ? gbVar : Collections.unmodifiableMap(gbVar);
        }
        ya yaVarA = a(gbVar, false);
        if (gbVar.isImmutable()) {
            yaVarA.makeImmutable();
        }
        return yaVarA;
    }

    public Object getField(a6 a6Var) {
        Object obj = this.f21943a.get(a6Var);
        return obj instanceof b8 ? ((b8) obj).getValue() : obj;
    }

    public int getMessageSetSerializedSize() {
        gb gbVar;
        int i10 = 0;
        int iF = 0;
        while (true) {
            gbVar = this.f21943a;
            if (i10 >= gbVar.getNumArrayEntries()) {
                break;
            }
            iF += f(gbVar.getArrayEntryAt(i10));
            i10++;
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = gbVar.getOverflowEntries().iterator();
        while (it.hasNext()) {
            iF += f(it.next());
        }
        return iF;
    }

    public Object getRepeatedField(a6 a6Var, int i10) {
        if (!a6Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(a6Var);
        if (field != null) {
            return ((List) field).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(a6 a6Var) {
        if (!a6Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(a6Var);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        gb gbVar;
        int i10 = 0;
        int iComputeFieldSize = 0;
        while (true) {
            gbVar = this.f21943a;
            if (i10 >= gbVar.getNumArrayEntries()) {
                break;
            }
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = gbVar.getArrayEntryAt(i10);
            iComputeFieldSize += computeFieldSize((a6) arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i10++;
        }
        for (Map.Entry<Comparable<Object>, Object> entry : gbVar.getOverflowEntries()) {
            iComputeFieldSize += computeFieldSize((a6) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(a6 a6Var) {
        if (a6Var.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f21943a.get(a6Var) != null;
    }

    public int hashCode() {
        return this.f21943a.hashCode();
    }

    public final void i(Map.Entry entry) {
        a6 a6Var = (a6) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b8) {
            value = ((b8) value).getValue();
        }
        boolean zIsRepeated = a6Var.isRepeated();
        gb gbVar = this.f21943a;
        if (zIsRepeated) {
            Object field = getField(a6Var);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(c(it.next()));
            }
            gbVar.put((Comparable<Object>) a6Var, field);
            return;
        }
        if (a6Var.getLiteJavaType() != cd.MESSAGE) {
            gbVar.put((Comparable<Object>) a6Var, c(value));
            return;
        }
        Object field2 = getField(a6Var);
        if (field2 == null) {
            gbVar.put((Comparable<Object>) a6Var, c(value));
        } else {
            gbVar.put((Comparable<Object>) a6Var, (Object) a6Var.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
        }
    }

    public boolean isImmutable() {
        return this.f21944b;
    }

    public boolean isInitialized() {
        int i10 = 0;
        while (true) {
            gb gbVar = this.f21943a;
            if (i10 >= gbVar.getNumArrayEntries()) {
                Iterator<Map.Entry<Comparable<Object>, Object>> it = gbVar.getOverflowEntries().iterator();
                while (it.hasNext()) {
                    if (!g(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!g(gbVar.getArrayEntryAt(i10))) {
                return false;
            }
            i10++;
        }
    }

    public Iterator<Map.Entry<a6, Object>> iterator() {
        boolean z10 = this.f21945c;
        gb gbVar = this.f21943a;
        return z10 ? new b8.a(gbVar.entrySet().iterator()) : gbVar.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.f21944b) {
            return;
        }
        this.f21943a.makeImmutable();
        this.f21944b = true;
    }

    public void mergeFrom(b6 b6Var) {
        gb gbVar;
        int i10 = 0;
        while (true) {
            gb gbVar2 = b6Var.f21943a;
            gbVar = b6Var.f21943a;
            if (i10 >= gbVar2.getNumArrayEntries()) {
                break;
            }
            i(gbVar.getArrayEntryAt(i10));
            i10++;
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = gbVar.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i(it.next());
        }
    }

    public void setField(a6 a6Var, Object obj) {
        if (!a6Var.isRepeated()) {
            j(a6Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(a6Var, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof b8) {
            this.f21945c = true;
        }
        this.f21943a.put((Comparable<Object>) a6Var, obj);
    }

    public void setRepeatedField(a6 a6Var, int i10, Object obj) {
        if (!a6Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(a6Var);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        j(a6Var, obj);
        ((List) field).set(i10, obj);
    }

    public void writeMessageSetTo(h0 h0Var) throws IOException {
        gb gbVar;
        int i10 = 0;
        while (true) {
            gbVar = this.f21943a;
            if (i10 >= gbVar.getNumArrayEntries()) {
                break;
            }
            m(gbVar.getArrayEntryAt(i10), h0Var);
            i10++;
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = gbVar.getOverflowEntries().iterator();
        while (it.hasNext()) {
            m(it.next(), h0Var);
        }
    }

    public void writeTo(h0 h0Var) throws IOException {
        gb gbVar;
        int i10 = 0;
        while (true) {
            gbVar = this.f21943a;
            if (i10 >= gbVar.getNumArrayEntries()) {
                break;
            }
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = gbVar.getArrayEntryAt(i10);
            writeField((a6) arrayEntryAt.getKey(), arrayEntryAt.getValue(), h0Var);
            i10++;
        }
        for (Map.Entry<Comparable<Object>, Object> entry : gbVar.getOverflowEntries()) {
            writeField((a6) entry.getKey(), entry.getValue(), h0Var);
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b6 m501clone() {
        gb gbVar;
        b6 b6VarNewFieldSet = newFieldSet();
        int i10 = 0;
        while (true) {
            gbVar = this.f21943a;
            if (i10 >= gbVar.getNumArrayEntries()) {
                break;
            }
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = gbVar.getArrayEntryAt(i10);
            b6VarNewFieldSet.setField((a6) arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i10++;
        }
        for (Map.Entry<Comparable<Object>, Object> entry : gbVar.getOverflowEntries()) {
            b6VarNewFieldSet.setField((a6) entry.getKey(), entry.getValue());
        }
        b6VarNewFieldSet.f21945c = this.f21945c;
        return b6VarNewFieldSet;
    }

    public b6(gb gbVar) {
        this.f21943a = gbVar;
        makeImmutable();
    }
}
