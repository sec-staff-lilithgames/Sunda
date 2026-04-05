package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: d, reason: collision with root package name */
    public static final a1 f5796d;

    /* renamed from: a, reason: collision with root package name */
    public final v3 f5797a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5798b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5799c;

    static {
        int i10 = v3.f6061i;
        a1 a1Var = new a1(new p3());
        a1Var.makeImmutable();
        f5796d = a1Var;
    }

    public a1() {
        int i10 = v3.f6061i;
        this.f5797a = new p3();
    }

    public static p3 a(v3 v3Var, boolean z10, boolean z11) {
        int i10 = v3.f6061i;
        p3 p3Var = new p3();
        int numArrayEntries = v3Var.getNumArrayEntries();
        for (int i11 = 0; i11 < numArrayEntries; i11++) {
            b(p3Var, v3Var.getArrayEntryAt(i11), z10, z11);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = v3Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            b(p3Var, it.next(), z10, z11);
        }
        return p3Var;
    }

    public static void b(p3 p3Var, Map.Entry entry, boolean z10, boolean z11) {
        z0 z0Var = (z0) entry.getKey();
        Object value = entry.getValue();
        if (z11 && (value instanceof y1)) {
            p3Var.put((p3) z0Var, (z0) ((y1) value).getValue());
        } else if (z10 && (value instanceof List)) {
            p3Var.put((p3) z0Var, (z0) new ArrayList((List) value));
        } else {
            p3Var.put((p3) z0Var, (z0) value);
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

    public static int computeFieldSize(z0 z0Var, Object obj) {
        h1 h1Var = (h1) z0Var;
        r4 liteType = h1Var.getLiteType();
        int number = h1Var.getNumber();
        if (!h1Var.isRepeated()) {
            return d(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!h1Var.isPacked()) {
            int iD = 0;
            while (i10 < size) {
                iD += d(liteType, number, list.get(i10));
                i10++;
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iE = 0;
        while (i10 < size) {
            iE += e(liteType, list.get(i10));
            i10++;
        }
        return l0.computeUInt32SizeNoTag(iE) + l0.computeTagSize(number) + iE;
    }

    public static int d(r4 r4Var, int i10, Object obj) {
        int iComputeTagSize = l0.computeTagSize(i10);
        if (r4Var == r4.f5980f) {
            iComputeTagSize *= 2;
        }
        return e(r4Var, obj) + iComputeTagSize;
    }

    public static int e(r4 r4Var, Object obj) {
        switch (r4Var.ordinal()) {
            case 0:
                return l0.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 1:
                return l0.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 2:
                return l0.computeInt64SizeNoTag(((Long) obj).longValue());
            case 3:
                return l0.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return l0.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 5:
                return l0.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 6:
                return l0.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 7:
                return l0.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 8:
                return obj instanceof x ? l0.computeBytesSizeNoTag((x) obj) : l0.computeStringSizeNoTag((String) obj);
            case 9:
                return l0.computeGroupSizeNoTag((r2) obj);
            case 10:
                return obj instanceof y1 ? l0.computeLazyFieldSizeNoTag((y1) obj) : l0.computeMessageSizeNoTag((r2) obj);
            case 11:
                return obj instanceof x ? l0.computeBytesSizeNoTag((x) obj) : l0.computeByteArraySizeNoTag((byte[]) obj);
            case 12:
                return l0.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 13:
                return l0.computeEnumSizeNoTag(((Integer) obj).intValue());
            case 14:
                return l0.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return l0.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return l0.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return l0.computeSInt64SizeNoTag(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends z0> a1 emptySet() {
        return f5796d;
    }

    public static int f(Map.Entry entry) {
        z0 z0Var = (z0) entry.getKey();
        Object value = entry.getValue();
        h1 h1Var = (h1) z0Var;
        return (h1Var.getLiteJavaType() != s4.MESSAGE || h1Var.isRepeated() || h1Var.isPacked()) ? computeFieldSize(h1Var, value) : value instanceof y1 ? l0.computeLazyFieldMessageSetExtensionSize(((h1) ((z0) entry.getKey())).getNumber(), (y1) value) : l0.computeMessageSetExtensionSize(((h1) ((z0) entry.getKey())).getNumber(), (r2) value);
    }

    public static boolean g(Map.Entry entry) {
        boolean zIsInitialized;
        h1 h1Var = (h1) ((z0) entry.getKey());
        if (h1Var.getLiteJavaType() == s4.MESSAGE) {
            if (!h1Var.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof s2) {
                    return ((s2) value).isInitialized();
                }
                if (value instanceof y1) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                if (obj instanceof s2) {
                    zIsInitialized = ((s2) obj).isInitialized();
                } else {
                    if (!(obj instanceof y1)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean h(r4 r4Var, Object obj) {
        Charset charset = t1.f6006a;
        obj.getClass();
        switch (r4Var.getJavaType()) {
            case BYTE_STRING:
                if ((obj instanceof x) || (obj instanceof byte[])) {
                }
                break;
            case ENUM:
                if (!(obj instanceof Integer)) {
                }
                break;
            case MESSAGE:
                if ((obj instanceof r2) || (obj instanceof y1)) {
                }
                break;
        }
        return false;
    }

    public static void j(h1 h1Var, Object obj) {
        if (!h(h1Var.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(h1Var.getNumber()), h1Var.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void k(l0 l0Var, r4 r4Var, int i10, Object obj) throws IOException {
        if (r4Var == r4.f5980f) {
            l0Var.writeGroup(i10, (r2) obj);
        } else {
            l0Var.writeTag(i10, r4Var.getWireType());
            l(l0Var, r4Var, obj);
        }
    }

    public static void l(l0 l0Var, r4 r4Var, Object obj) throws IOException {
        switch (r4Var.ordinal()) {
            case 0:
                l0Var.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 1:
                l0Var.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 2:
                l0Var.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 3:
                l0Var.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                l0Var.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 5:
                l0Var.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 6:
                l0Var.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 7:
                l0Var.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 8:
                if (!(obj instanceof x)) {
                    l0Var.writeStringNoTag((String) obj);
                    break;
                } else {
                    l0Var.writeBytesNoTag((x) obj);
                    break;
                }
            case 9:
                l0Var.writeGroupNoTag((r2) obj);
                break;
            case 10:
                l0Var.writeMessageNoTag((r2) obj);
                break;
            case 11:
                if (!(obj instanceof x)) {
                    l0Var.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    l0Var.writeBytesNoTag((x) obj);
                    break;
                }
            case 12:
                l0Var.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 13:
                l0Var.writeEnumNoTag(((Integer) obj).intValue());
                break;
            case 14:
                l0Var.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                l0Var.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                l0Var.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                l0Var.writeSInt64NoTag(((Long) obj).longValue());
                break;
        }
    }

    public static void m(Map.Entry entry, l0 l0Var) throws IOException {
        h1 h1Var = (h1) ((z0) entry.getKey());
        if (h1Var.getLiteJavaType() != s4.MESSAGE || h1Var.isRepeated() || h1Var.isPacked()) {
            writeField(h1Var, entry.getValue(), l0Var);
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof y1)) {
            l0Var.writeMessageSetExtension(((h1) ((z0) entry.getKey())).getNumber(), (r2) value);
        } else {
            l0Var.writeRawMessageSetExtension(((h1) ((z0) entry.getKey())).getNumber(), ((y1) value).toByteString());
        }
    }

    public static <T extends z0> y0 newBuilder() {
        int i10 = v3.f6061i;
        return new y0(new p3());
    }

    public static <T extends z0> a1 newFieldSet() {
        return new a1();
    }

    public static Object readPrimitiveField(c0 c0Var, r4 r4Var, boolean z10) throws IOException {
        return z10 ? t4.a(c0Var, r4Var, 2) : t4.a(c0Var, r4Var, 1);
    }

    public static void writeField(z0 z0Var, Object obj, l0 l0Var) throws IOException {
        h1 h1Var = (h1) z0Var;
        r4 liteType = h1Var.getLiteType();
        int number = h1Var.getNumber();
        if (!h1Var.isRepeated()) {
            if (obj instanceof y1) {
                k(l0Var, liteType, number, ((y1) obj).getValue());
                return;
            } else {
                k(l0Var, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!h1Var.isPacked()) {
            while (i10 < size) {
                k(l0Var, liteType, number, list.get(i10));
                i10++;
            }
        } else {
            if (list.isEmpty()) {
                return;
            }
            l0Var.writeTag(number, 2);
            int iE = 0;
            for (int i11 = 0; i11 < size; i11++) {
                iE += e(liteType, list.get(i11));
            }
            l0Var.writeUInt32NoTag(iE);
            while (i10 < size) {
                l(l0Var, liteType, list.get(i10));
                i10++;
            }
        }
    }

    public void addRepeatedField(z0 z0Var, Object obj) {
        List arrayList;
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(h1Var, obj);
        Object field = getField(h1Var);
        if (field == null) {
            arrayList = new ArrayList();
            this.f5797a.put((Comparable<Object>) h1Var, (Object) arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public void clear() {
        this.f5797a.clear();
        this.f5799c = false;
    }

    public void clearField(z0 z0Var) {
        v3 v3Var = this.f5797a;
        v3Var.remove(z0Var);
        if (v3Var.isEmpty()) {
            this.f5799c = false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a1) {
            return this.f5797a.equals(((a1) obj).f5797a);
        }
        return false;
    }

    public Map<z0, Object> getAllFields() {
        boolean z10 = this.f5799c;
        v3 v3Var = this.f5797a;
        if (!z10) {
            return v3Var.isImmutable() ? v3Var : Collections.unmodifiableMap(v3Var);
        }
        p3 p3VarA = a(v3Var, false, true);
        if (v3Var.isImmutable()) {
            p3VarA.makeImmutable();
        }
        return p3VarA;
    }

    public Object getField(z0 z0Var) {
        Object obj = this.f5797a.get(z0Var);
        return obj instanceof y1 ? ((y1) obj).getValue() : obj;
    }

    public int getMessageSetSerializedSize() {
        v3 v3Var = this.f5797a;
        int numArrayEntries = v3Var.getNumArrayEntries();
        int iF = 0;
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            iF += f(v3Var.getArrayEntryAt(i10));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = v3Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            iF += f(it.next());
        }
        return iF;
    }

    public Object getRepeatedField(z0 z0Var, int i10) {
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(h1Var);
        if (field != null) {
            return ((List) field).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(z0 z0Var) {
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(h1Var);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        v3 v3Var = this.f5797a;
        int numArrayEntries = v3Var.getNumArrayEntries();
        int iComputeFieldSize = 0;
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = v3Var.getArrayEntryAt(i10);
            iComputeFieldSize += computeFieldSize((z0) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : v3Var.getOverflowEntries()) {
            iComputeFieldSize += computeFieldSize((z0) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(z0 z0Var) {
        h1 h1Var = (h1) z0Var;
        if (h1Var.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f5797a.get(h1Var) != null;
    }

    public int hashCode() {
        return this.f5797a.hashCode();
    }

    public final void i(Map.Entry entry) {
        z0 z0Var = (z0) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof y1;
        h1 h1Var = (h1) z0Var;
        boolean zIsRepeated = h1Var.isRepeated();
        v3 v3Var = this.f5797a;
        if (zIsRepeated) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object field = getField(h1Var);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(c(it.next()));
            }
            v3Var.put((Comparable<Object>) h1Var, field);
            return;
        }
        if (h1Var.getLiteJavaType() != s4.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            v3Var.put((Comparable<Object>) h1Var, c(value));
            return;
        }
        Object field2 = getField(h1Var);
        if (field2 != null) {
            if (z10) {
                value = ((y1) value).getValue();
            }
            v3Var.put((Comparable<Object>) h1Var, (Object) h1Var.internalMergeFrom(((r2) field2).toBuilder(), (r2) value).build());
        } else {
            v3Var.put((Comparable<Object>) h1Var, c(value));
            if (z10) {
                this.f5799c = true;
            }
        }
    }

    public boolean isImmutable() {
        return this.f5798b;
    }

    public boolean isInitialized() {
        v3 v3Var = this.f5797a;
        int numArrayEntries = v3Var.getNumArrayEntries();
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            if (!g(v3Var.getArrayEntryAt(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = v3Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!g(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<z0, Object>> iterator() {
        v3 v3Var = this.f5797a;
        return v3Var.isEmpty() ? Collections.emptyIterator() : this.f5799c ? new y1.a(v3Var.entrySet().iterator()) : v3Var.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.f5798b) {
            return;
        }
        v3 v3Var = this.f5797a;
        int numArrayEntries = v3Var.getNumArrayEntries();
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = v3Var.getArrayEntryAt(i10);
            if (arrayEntryAt.getValue() instanceof f1) {
                f1 f1Var = (f1) arrayEntryAt.getValue();
                f1Var.getClass();
                d3.getInstance().schemaFor((d3) f1Var).makeImmutable(f1Var);
                f1Var.k();
            }
        }
        v3Var.makeImmutable();
        this.f5798b = true;
    }

    public void mergeFrom(a1 a1Var) {
        v3 v3Var = a1Var.f5797a;
        v3 v3Var2 = a1Var.f5797a;
        int numArrayEntries = v3Var.getNumArrayEntries();
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            i(v3Var2.getArrayEntryAt(i10));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = v3Var2.getOverflowEntries().iterator();
        while (it.hasNext()) {
            i(it.next());
        }
    }

    public void setField(z0 z0Var, Object obj) {
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            j(h1Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(h1Var, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof y1) {
            this.f5799c = true;
        }
        this.f5797a.put((Comparable<Object>) h1Var, obj);
    }

    public void setRepeatedField(z0 z0Var, int i10, Object obj) {
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(h1Var);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        j(h1Var, obj);
        ((List) field).set(i10, obj);
    }

    public void writeMessageSetTo(l0 l0Var) throws IOException {
        v3 v3Var = this.f5797a;
        int numArrayEntries = v3Var.getNumArrayEntries();
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            m(v3Var.getArrayEntryAt(i10), l0Var);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = v3Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            m(it.next(), l0Var);
        }
    }

    public void writeTo(l0 l0Var) throws IOException {
        v3 v3Var = this.f5797a;
        int numArrayEntries = v3Var.getNumArrayEntries();
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = v3Var.getArrayEntryAt(i10);
            writeField((z0) arrayEntryAt.getKey(), arrayEntryAt.getValue(), l0Var);
        }
        for (Map.Entry<Comparable<Object>, Object> entry : v3Var.getOverflowEntries()) {
            writeField((z0) entry.getKey(), entry.getValue(), l0Var);
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public a1 m69clone() {
        a1 a1VarNewFieldSet = newFieldSet();
        v3 v3Var = this.f5797a;
        int numArrayEntries = v3Var.getNumArrayEntries();
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = v3Var.getArrayEntryAt(i10);
            a1VarNewFieldSet.setField((z0) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : v3Var.getOverflowEntries()) {
            a1VarNewFieldSet.setField((z0) entry.getKey(), entry.getValue());
        }
        a1VarNewFieldSet.f5799c = this.f5799c;
        return a1VarNewFieldSet;
    }

    public a1(v3 v3Var) {
        this.f5797a = v3Var;
        makeImmutable();
    }
}
