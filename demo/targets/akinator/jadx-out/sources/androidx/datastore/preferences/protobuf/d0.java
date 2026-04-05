package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u1;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 implements g3 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f5844a;

    /* renamed from: b, reason: collision with root package name */
    public int f5845b;

    /* renamed from: c, reason: collision with root package name */
    public int f5846c;

    /* renamed from: d, reason: collision with root package name */
    public int f5847d = 0;

    public d0(c0 c0Var) {
        Charset charset = t1.f6006a;
        this.f5844a = c0Var;
        c0Var.f5829d = this;
    }

    public static void f(int i10) throws u1 {
        if ((i10 & 3) != 0) {
            throw u1.g();
        }
    }

    public static d0 forCodedInput(c0 c0Var) {
        d0 d0Var = c0Var.f5829d;
        return d0Var != null ? d0Var : new d0(c0Var);
    }

    public static void g(int i10) throws u1 {
        if ((i10 & 7) != 0) {
            throw u1.g();
        }
    }

    public final void a(Object obj, m3 m3Var, s0 s0Var) {
        int i10 = this.f5846c;
        this.f5846c = (t4.getTagFieldNumber(this.f5845b) << 3) | 4;
        try {
            m3Var.mergeFrom(obj, this, s0Var);
            if (this.f5845b == this.f5846c) {
            } else {
                throw u1.g();
            }
        } finally {
            this.f5846c = i10;
        }
    }

    public final void b(Object obj, m3 m3Var, s0 s0Var) throws IOException {
        c0 c0Var = this.f5844a;
        int uInt32 = c0Var.readUInt32();
        if (c0Var.f5826a >= c0Var.f5827b) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iPushLimit = c0Var.pushLimit(uInt32);
        c0Var.f5826a++;
        m3Var.mergeFrom(obj, this, s0Var);
        c0Var.checkLastTagWas(0);
        c0Var.f5826a--;
        c0Var.popLimit(iPushLimit);
    }

    public final Object c(r4 r4Var, Class cls, s0 s0Var) {
        switch (r4Var.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(readInt64());
            case 3:
                return Long.valueOf(readUInt64());
            case 4:
                return Integer.valueOf(readInt32());
            case 5:
                return Long.valueOf(readFixed64());
            case 6:
                return Integer.valueOf(readFixed32());
            case 7:
                return Boolean.valueOf(readBool());
            case 8:
                return readStringRequireUtf8();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return readMessage(cls, s0Var);
            case 11:
                return readBytes();
            case 12:
                return Integer.valueOf(readUInt32());
            case 13:
                return Integer.valueOf(readEnum());
            case 14:
                return Integer.valueOf(readSFixed32());
            case 15:
                return Long.valueOf(readSFixed64());
            case 16:
                return Integer.valueOf(readSInt32());
            case 17:
                return Long.valueOf(readSInt64());
        }
    }

    public final void d(int i10) throws u1 {
        if (this.f5844a.getTotalBytesRead() != i10) {
            throw u1.h();
        }
    }

    public final void e(int i10) throws u1.a {
        if (t4.getTagWireType(this.f5845b) != i10) {
            throw u1.d();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public int getFieldNumber() throws IOException {
        int i10 = this.f5847d;
        if (i10 != 0) {
            this.f5845b = i10;
            this.f5847d = 0;
        } else {
            this.f5845b = this.f5844a.readTag();
        }
        int i11 = this.f5845b;
        if (i11 == 0 || i11 == this.f5846c) {
            return Integer.MAX_VALUE;
        }
        return t4.getTagFieldNumber(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public int getTag() {
        return this.f5845b;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public <T> void mergeGroupField(T t10, m3 m3Var, s0 s0Var) throws IOException {
        e(3);
        a(t10, m3Var, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public <T> void mergeMessageField(T t10, m3 m3Var, s0 s0Var) throws IOException {
        e(2);
        b(t10, m3Var, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public boolean readBool() throws IOException {
        e(0);
        return this.f5844a.readBool();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readBoolList(List<Boolean> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof h;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(c0Var.readBool()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int totalBytesRead = c0Var.getTotalBytesRead() + c0Var.readUInt32();
            do {
                list.add(Boolean.valueOf(c0Var.readBool()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        h hVar = (h) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 0) {
            do {
                hVar.addBoolean(c0Var.readBool());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int totalBytesRead2 = c0Var.getTotalBytesRead() + c0Var.readUInt32();
        do {
            hVar.addBoolean(c0Var.readBool());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public x readBytes() throws IOException {
        e(2);
        return this.f5844a.readBytes();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readBytesList(List<x> list) throws IOException {
        int tag;
        if (t4.getTagWireType(this.f5845b) != 2) {
            throw u1.d();
        }
        do {
            list.add(readBytes());
            c0 c0Var = this.f5844a;
            if (c0Var.isAtEnd()) {
                return;
            } else {
                tag = c0Var.readTag();
            }
        } while (tag == this.f5845b);
        this.f5847d = tag;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public double readDouble() throws IOException {
        e(1);
        return this.f5844a.readDouble();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readDoubleList(List<Double> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof n0;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(c0Var.readDouble()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int uInt32 = c0Var.readUInt32();
            g(uInt32);
            int totalBytesRead = c0Var.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(c0Var.readDouble()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            return;
        }
        n0 n0Var = (n0) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 1) {
            do {
                n0Var.addDouble(c0Var.readDouble());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int uInt322 = c0Var.readUInt32();
        g(uInt322);
        int totalBytesRead2 = c0Var.getTotalBytesRead() + uInt322;
        do {
            n0Var.addDouble(c0Var.readDouble());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public int readEnum() throws IOException {
        e(0);
        return this.f5844a.readEnum();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readEnumList(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof j1;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(c0Var.readEnum()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int totalBytesRead = c0Var.getTotalBytesRead() + c0Var.readUInt32();
            do {
                list.add(Integer.valueOf(c0Var.readEnum()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        j1 j1Var = (j1) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 0) {
            do {
                j1Var.addInt(c0Var.readEnum());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int totalBytesRead2 = c0Var.getTotalBytesRead() + c0Var.readUInt32();
        do {
            j1Var.addInt(c0Var.readEnum());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public int readFixed32() throws IOException {
        e(5);
        return this.f5844a.readFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof j1;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 2) {
                int uInt32 = c0Var.readUInt32();
                f(uInt32);
                int totalBytesRead = c0Var.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(c0Var.readFixed32()));
                } while (c0Var.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw u1.d();
            }
            do {
                list.add(Integer.valueOf(c0Var.readFixed32()));
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag = c0Var.readTag();
                }
            } while (tag == this.f5845b);
            this.f5847d = tag;
            return;
        }
        j1 j1Var = (j1) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 2) {
            int uInt322 = c0Var.readUInt32();
            f(uInt322);
            int totalBytesRead2 = c0Var.getTotalBytesRead() + uInt322;
            do {
                j1Var.addInt(c0Var.readFixed32());
            } while (c0Var.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw u1.d();
        }
        do {
            j1Var.addInt(c0Var.readFixed32());
            if (c0Var.isAtEnd()) {
                return;
            } else {
                tag2 = c0Var.readTag();
            }
        } while (tag2 == this.f5845b);
        this.f5847d = tag2;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public long readFixed64() throws IOException {
        e(1);
        return this.f5844a.readFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof e2;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(c0Var.readFixed64()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int uInt32 = c0Var.readUInt32();
            g(uInt32);
            int totalBytesRead = c0Var.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(c0Var.readFixed64()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            return;
        }
        e2 e2Var = (e2) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 1) {
            do {
                e2Var.addLong(c0Var.readFixed64());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int uInt322 = c0Var.readUInt32();
        g(uInt322);
        int totalBytesRead2 = c0Var.getTotalBytesRead() + uInt322;
        do {
            e2Var.addLong(c0Var.readFixed64());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public float readFloat() throws IOException {
        e(5);
        return this.f5844a.readFloat();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readFloatList(List<Float> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof c1;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 2) {
                int uInt32 = c0Var.readUInt32();
                f(uInt32);
                int totalBytesRead = c0Var.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(c0Var.readFloat()));
                } while (c0Var.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw u1.d();
            }
            do {
                list.add(Float.valueOf(c0Var.readFloat()));
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag = c0Var.readTag();
                }
            } while (tag == this.f5845b);
            this.f5847d = tag;
            return;
        }
        c1 c1Var = (c1) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 2) {
            int uInt322 = c0Var.readUInt32();
            f(uInt322);
            int totalBytesRead2 = c0Var.getTotalBytesRead() + uInt322;
            do {
                c1Var.addFloat(c0Var.readFloat());
            } while (c0Var.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw u1.d();
        }
        do {
            c1Var.addFloat(c0Var.readFloat());
            if (c0Var.isAtEnd()) {
                return;
            } else {
                tag2 = c0Var.readTag();
            }
        } while (tag2 == this.f5845b);
        this.f5847d = tag2;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    @Deprecated
    public <T> T readGroup(Class<T> cls, s0 s0Var) throws IOException {
        e(3);
        m3 m3VarSchemaFor = d3.getInstance().schemaFor((Class) cls);
        T t10 = (T) m3VarSchemaFor.newInstance();
        a(t10, m3VarSchemaFor, s0Var);
        m3VarSchemaFor.makeImmutable(t10);
        return t10;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    @Deprecated
    public <T> T readGroupBySchemaWithCheck(m3 m3Var, s0 s0Var) throws IOException {
        e(3);
        T t10 = (T) m3Var.newInstance();
        a(t10, m3Var, s0Var);
        m3Var.makeImmutable(t10);
        return t10;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    @Deprecated
    public <T> void readGroupList(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
        readGroupList(list, d3.getInstance().schemaFor((Class) cls), s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public int readInt32() throws IOException {
        e(0);
        return this.f5844a.readInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof j1;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(c0Var.readInt32()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int totalBytesRead = c0Var.getTotalBytesRead() + c0Var.readUInt32();
            do {
                list.add(Integer.valueOf(c0Var.readInt32()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        j1 j1Var = (j1) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 0) {
            do {
                j1Var.addInt(c0Var.readInt32());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int totalBytesRead2 = c0Var.getTotalBytesRead() + c0Var.readUInt32();
        do {
            j1Var.addInt(c0Var.readInt32());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public long readInt64() throws IOException {
        e(0);
        return this.f5844a.readInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof e2;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(c0Var.readInt64()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int totalBytesRead = c0Var.getTotalBytesRead() + c0Var.readUInt32();
            do {
                list.add(Long.valueOf(c0Var.readInt64()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        e2 e2Var = (e2) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 0) {
            do {
                e2Var.addLong(c0Var.readInt64());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int totalBytesRead2 = c0Var.getTotalBytesRead() + c0Var.readUInt32();
        do {
            e2Var.addLong(c0Var.readInt64());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r1.popLimit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void readMap(java.util.Map<K, V> r10, androidx.datastore.preferences.protobuf.i2 r11, androidx.datastore.preferences.protobuf.s0 r12) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 2
            r9.e(r0)
            androidx.datastore.preferences.protobuf.c0 r1 = r9.f5844a
            int r2 = r1.readUInt32()
            int r2 = r1.pushLimit(r2)
            java.lang.Object r3 = r11.f5903b
            java.lang.Object r4 = r11.f5905d
            r5 = r4
        L13:
            int r6 = r9.getFieldNumber()     // Catch: java.lang.Throwable -> L37
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L59
            boolean r7 = r1.isAtEnd()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L23
            goto L59
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L44
            if (r6 == r0) goto L39
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.u1.a -> L4c
            if (r6 == 0) goto L31
            goto L13
        L31:
            androidx.datastore.preferences.protobuf.u1 r6 = new androidx.datastore.preferences.protobuf.u1     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.u1.a -> L4c
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.u1.a -> L4c
            throw r6     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.u1.a -> L4c
        L37:
            r10 = move-exception
            goto L60
        L39:
            androidx.datastore.preferences.protobuf.r4 r6 = r11.f5904c     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.u1.a -> L4c
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.u1.a -> L4c
            java.lang.Object r5 = r9.c(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.u1.a -> L4c
            goto L13
        L44:
            androidx.datastore.preferences.protobuf.r4 r6 = r11.f5902a     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.u1.a -> L4c
            r7 = 0
            java.lang.Object r3 = r9.c(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 androidx.datastore.preferences.protobuf.u1.a -> L4c
            goto L13
        L4c:
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L53
            goto L13
        L53:
            androidx.datastore.preferences.protobuf.u1 r10 = new androidx.datastore.preferences.protobuf.u1     // Catch: java.lang.Throwable -> L37
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L37
            throw r10     // Catch: java.lang.Throwable -> L37
        L59:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L37
            r1.popLimit(r2)
            return
        L60:
            r1.popLimit(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.d0.readMap(java.util.Map, androidx.datastore.preferences.protobuf.i2, androidx.datastore.preferences.protobuf.s0):void");
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public <T> T readMessage(Class<T> cls, s0 s0Var) throws IOException {
        e(2);
        m3 m3VarSchemaFor = d3.getInstance().schemaFor((Class) cls);
        T t10 = (T) m3VarSchemaFor.newInstance();
        b(t10, m3VarSchemaFor, s0Var);
        m3VarSchemaFor.makeImmutable(t10);
        return t10;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public <T> T readMessageBySchemaWithCheck(m3 m3Var, s0 s0Var) throws IOException {
        e(2);
        T t10 = (T) m3Var.newInstance();
        b(t10, m3Var, s0Var);
        m3Var.makeImmutable(t10);
        return t10;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public <T> void readMessageList(List<T> list, Class<T> cls, s0 s0Var) throws IOException {
        readMessageList(list, d3.getInstance().schemaFor((Class) cls), s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public int readSFixed32() throws IOException {
        e(5);
        return this.f5844a.readSFixed32();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readSFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof j1;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 2) {
                int uInt32 = c0Var.readUInt32();
                f(uInt32);
                int totalBytesRead = c0Var.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(c0Var.readSFixed32()));
                } while (c0Var.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw u1.d();
            }
            do {
                list.add(Integer.valueOf(c0Var.readSFixed32()));
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag = c0Var.readTag();
                }
            } while (tag == this.f5845b);
            this.f5847d = tag;
            return;
        }
        j1 j1Var = (j1) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 2) {
            int uInt322 = c0Var.readUInt32();
            f(uInt322);
            int totalBytesRead2 = c0Var.getTotalBytesRead() + uInt322;
            do {
                j1Var.addInt(c0Var.readSFixed32());
            } while (c0Var.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw u1.d();
        }
        do {
            j1Var.addInt(c0Var.readSFixed32());
            if (c0Var.isAtEnd()) {
                return;
            } else {
                tag2 = c0Var.readTag();
            }
        } while (tag2 == this.f5845b);
        this.f5847d = tag2;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public long readSFixed64() throws IOException {
        e(1);
        return this.f5844a.readSFixed64();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readSFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof e2;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(c0Var.readSFixed64()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int uInt32 = c0Var.readUInt32();
            g(uInt32);
            int totalBytesRead = c0Var.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(c0Var.readSFixed64()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            return;
        }
        e2 e2Var = (e2) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 1) {
            do {
                e2Var.addLong(c0Var.readSFixed64());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int uInt322 = c0Var.readUInt32();
        g(uInt322);
        int totalBytesRead2 = c0Var.getTotalBytesRead() + uInt322;
        do {
            e2Var.addLong(c0Var.readSFixed64());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public int readSInt32() throws IOException {
        e(0);
        return this.f5844a.readSInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readSInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof j1;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(c0Var.readSInt32()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int totalBytesRead = c0Var.getTotalBytesRead() + c0Var.readUInt32();
            do {
                list.add(Integer.valueOf(c0Var.readSInt32()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        j1 j1Var = (j1) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 0) {
            do {
                j1Var.addInt(c0Var.readSInt32());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int totalBytesRead2 = c0Var.getTotalBytesRead() + c0Var.readUInt32();
        do {
            j1Var.addInt(c0Var.readSInt32());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public long readSInt64() throws IOException {
        e(0);
        return this.f5844a.readSInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readSInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof e2;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(c0Var.readSInt64()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int totalBytesRead = c0Var.getTotalBytesRead() + c0Var.readUInt32();
            do {
                list.add(Long.valueOf(c0Var.readSInt64()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        e2 e2Var = (e2) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 0) {
            do {
                e2Var.addLong(c0Var.readSInt64());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int totalBytesRead2 = c0Var.getTotalBytesRead() + c0Var.readUInt32();
        do {
            e2Var.addLong(c0Var.readSInt64());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public String readString() throws IOException {
        e(2);
        return this.f5844a.readString();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z10) throws IOException {
        int tag;
        int tag2;
        if (t4.getTagWireType(this.f5845b) != 2) {
            throw u1.d();
        }
        boolean z11 = list instanceof a2;
        c0 c0Var = this.f5844a;
        if (!z11 || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag = c0Var.readTag();
                }
            } while (tag == this.f5845b);
            this.f5847d = tag;
            return;
        }
        a2 a2Var = (a2) list;
        do {
            readBytes();
            a2Var.k();
            if (c0Var.isAtEnd()) {
                return;
            } else {
                tag2 = c0Var.readTag();
            }
        } while (tag2 == this.f5845b);
        this.f5847d = tag2;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public String readStringRequireUtf8() throws IOException {
        e(2);
        return this.f5844a.readStringRequireUtf8();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public int readUInt32() throws IOException {
        e(0);
        return this.f5844a.readUInt32();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readUInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof j1;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(c0Var.readUInt32()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int totalBytesRead = c0Var.getTotalBytesRead() + c0Var.readUInt32();
            do {
                list.add(Integer.valueOf(c0Var.readUInt32()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        j1 j1Var = (j1) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 0) {
            do {
                j1Var.addInt(c0Var.readUInt32());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int totalBytesRead2 = c0Var.getTotalBytesRead() + c0Var.readUInt32();
        do {
            j1Var.addInt(c0Var.readUInt32());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public long readUInt64() throws IOException {
        e(0);
        return this.f5844a.readUInt64();
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public void readUInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof e2;
        c0 c0Var = this.f5844a;
        if (!z10) {
            int tagWireType = t4.getTagWireType(this.f5845b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(c0Var.readUInt64()));
                    if (c0Var.isAtEnd()) {
                        return;
                    } else {
                        tag = c0Var.readTag();
                    }
                } while (tag == this.f5845b);
                this.f5847d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw u1.d();
            }
            int totalBytesRead = c0Var.getTotalBytesRead() + c0Var.readUInt32();
            do {
                list.add(Long.valueOf(c0Var.readUInt64()));
            } while (c0Var.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        e2 e2Var = (e2) list;
        int tagWireType2 = t4.getTagWireType(this.f5845b);
        if (tagWireType2 == 0) {
            do {
                e2Var.addLong(c0Var.readUInt64());
                if (c0Var.isAtEnd()) {
                    return;
                } else {
                    tag2 = c0Var.readTag();
                }
            } while (tag2 == this.f5845b);
            this.f5847d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw u1.d();
        }
        int totalBytesRead2 = c0Var.getTotalBytesRead() + c0Var.readUInt32();
        do {
            e2Var.addLong(c0Var.readUInt64());
        } while (c0Var.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public boolean shouldDiscardUnknownFields() {
        this.f5844a.getClass();
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.g3
    public boolean skipField() throws IOException {
        int i10;
        c0 c0Var = this.f5844a;
        if (c0Var.isAtEnd() || (i10 = this.f5845b) == this.f5846c) {
            return false;
        }
        return c0Var.skipField(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.g3
    @Deprecated
    public <T> void readGroupList(List<T> list, m3 m3Var, s0 s0Var) throws IOException {
        int tag;
        if (t4.getTagWireType(this.f5845b) == 3) {
            int i10 = this.f5845b;
            do {
                Object objNewInstance = m3Var.newInstance();
                a(objNewInstance, m3Var, s0Var);
                m3Var.makeImmutable(objNewInstance);
                list.add(objNewInstance);
                c0 c0Var = this.f5844a;
                if (c0Var.isAtEnd() || this.f5847d != 0) {
                    return;
                } else {
                    tag = c0Var.readTag();
                }
            } while (tag == i10);
            this.f5847d = tag;
            return;
        }
        throw u1.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.g3
    public <T> void readMessageList(List<T> list, m3 m3Var, s0 s0Var) throws IOException {
        int tag;
        if (t4.getTagWireType(this.f5845b) == 2) {
            int i10 = this.f5845b;
            do {
                Object objNewInstance = m3Var.newInstance();
                b(objNewInstance, m3Var, s0Var);
                m3Var.makeImmutable(objNewInstance);
                list.add(objNewInstance);
                c0 c0Var = this.f5844a;
                if (c0Var.isAtEnd() || this.f5847d != 0) {
                    return;
                } else {
                    tag = c0Var.readTag();
                }
            } while (tag == i10);
            this.f5847d = tag;
            return;
        }
        throw u1.d();
    }
}
