package com.explorestack.protobuf;

import com.explorestack.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z implements la {

    /* renamed from: a, reason: collision with root package name */
    public final y f22925a;

    /* renamed from: b, reason: collision with root package name */
    public int f22926b;

    /* renamed from: c, reason: collision with root package name */
    public int f22927c;

    /* renamed from: d, reason: collision with root package name */
    public int f22928d = 0;

    public z(y yVar) {
        Charset charset = x7.f22881a;
        this.f22925a = yVar;
        yVar.f22898d = this;
    }

    public static void f(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static z forCodedInput(y yVar) {
        z zVar = yVar.f22898d;
        return zVar != null ? zVar : new z(yVar);
    }

    public static void g(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final Object a(bd bdVar, Class cls, m5 m5Var) {
        switch (bdVar.ordinal()) {
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
                throw new RuntimeException("unsupported field type.");
            case 10:
                return readMessage(cls, m5Var);
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

    public final Object b(ua uaVar, m5 m5Var) {
        int i10 = this.f22927c;
        this.f22927c = (hd.getTagFieldNumber(this.f22926b) << 3) | 4;
        try {
            Object objNewInstance = uaVar.newInstance();
            uaVar.mergeFrom(objNewInstance, this, m5Var);
            uaVar.makeImmutable(objNewInstance);
            if (this.f22926b == this.f22927c) {
                return objNewInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f22927c = i10;
        }
    }

    public final Object c(ua uaVar, m5 m5Var) throws IOException {
        y yVar = this.f22925a;
        int uInt32 = yVar.readUInt32();
        if (yVar.f22895a >= yVar.f22896b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iPushLimit = yVar.pushLimit(uInt32);
        Object objNewInstance = uaVar.newInstance();
        yVar.f22895a++;
        uaVar.mergeFrom(objNewInstance, this, m5Var);
        uaVar.makeImmutable(objNewInstance);
        yVar.checkLastTagWas(0);
        yVar.f22895a--;
        yVar.popLimit(iPushLimit);
        return objNewInstance;
    }

    public final void d(int i10) throws InvalidProtocolBufferException {
        if (this.f22925a.getTotalBytesRead() != i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void e(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (hd.getTagWireType(this.f22926b) != i10) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.explorestack.protobuf.la
    public int getFieldNumber() throws IOException {
        int i10 = this.f22928d;
        if (i10 != 0) {
            this.f22926b = i10;
            this.f22928d = 0;
        } else {
            this.f22926b = this.f22925a.readTag();
        }
        int i11 = this.f22926b;
        if (i11 == 0 || i11 == this.f22927c) {
            return Integer.MAX_VALUE;
        }
        return hd.getTagFieldNumber(i11);
    }

    @Override // com.explorestack.protobuf.la
    public int getTag() {
        return this.f22926b;
    }

    @Override // com.explorestack.protobuf.la
    public boolean readBool() throws IOException {
        e(0);
        return this.f22925a.readBool();
    }

    @Override // com.explorestack.protobuf.la
    public void readBoolList(List<Boolean> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof q;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(yVar.readBool()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = yVar.getTotalBytesRead() + yVar.readUInt32();
            do {
                list.add(Boolean.valueOf(yVar.readBool()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        q qVar = (q) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 0) {
            do {
                qVar.addBoolean(yVar.readBool());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = yVar.getTotalBytesRead() + yVar.readUInt32();
        do {
            qVar.addBoolean(yVar.readBool());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public ByteString readBytes() throws IOException {
        e(2);
        return this.f22925a.readBytes();
    }

    @Override // com.explorestack.protobuf.la
    public void readBytesList(List<ByteString> list) throws IOException {
        int tag;
        if (hd.getTagWireType(this.f22926b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            y yVar = this.f22925a;
            if (yVar.isAtEnd()) {
                return;
            } else {
                tag = yVar.readTag();
            }
        } while (tag == this.f22926b);
        this.f22928d = tag;
    }

    @Override // com.explorestack.protobuf.la
    public double readDouble() throws IOException {
        e(1);
        return this.f22925a.readDouble();
    }

    @Override // com.explorestack.protobuf.la
    public void readDoubleList(List<Double> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof y4;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(yVar.readDouble()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = yVar.readUInt32();
            g(uInt32);
            int totalBytesRead = yVar.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(yVar.readDouble()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        y4 y4Var = (y4) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 1) {
            do {
                y4Var.addDouble(yVar.readDouble());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt322 = yVar.readUInt32();
        g(uInt322);
        int totalBytesRead2 = yVar.getTotalBytesRead() + uInt322;
        do {
            y4Var.addDouble(yVar.readDouble());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public int readEnum() throws IOException {
        e(0);
        return this.f22925a.readEnum();
    }

    @Override // com.explorestack.protobuf.la
    public void readEnumList(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l7;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(yVar.readEnum()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = yVar.getTotalBytesRead() + yVar.readUInt32();
            do {
                list.add(Integer.valueOf(yVar.readEnum()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 0) {
            do {
                l7Var.addInt(yVar.readEnum());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = yVar.getTotalBytesRead() + yVar.readUInt32();
        do {
            l7Var.addInt(yVar.readEnum());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public int readFixed32() throws IOException {
        e(5);
        return this.f22925a.readFixed32();
    }

    @Override // com.explorestack.protobuf.la
    public void readFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l7;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 2) {
                int uInt32 = yVar.readUInt32();
                f(uInt32);
                int totalBytesRead = yVar.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(yVar.readFixed32()));
                } while (yVar.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(yVar.readFixed32()));
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag = yVar.readTag();
                }
            } while (tag == this.f22926b);
            this.f22928d = tag;
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 2) {
            int uInt322 = yVar.readUInt32();
            f(uInt322);
            int totalBytesRead2 = yVar.getTotalBytesRead() + uInt322;
            do {
                l7Var.addInt(yVar.readFixed32());
            } while (yVar.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            l7Var.addInt(yVar.readFixed32());
            if (yVar.isAtEnd()) {
                return;
            } else {
                tag2 = yVar.readTag();
            }
        } while (tag2 == this.f22926b);
        this.f22928d = tag2;
    }

    @Override // com.explorestack.protobuf.la
    public long readFixed64() throws IOException {
        e(1);
        return this.f22925a.readFixed64();
    }

    @Override // com.explorestack.protobuf.la
    public void readFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l8;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(yVar.readFixed64()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = yVar.readUInt32();
            g(uInt32);
            int totalBytesRead = yVar.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(yVar.readFixed64()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 1) {
            do {
                l8Var.addLong(yVar.readFixed64());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt322 = yVar.readUInt32();
        g(uInt322);
        int totalBytesRead2 = yVar.getTotalBytesRead() + uInt322;
        do {
            l8Var.addLong(yVar.readFixed64());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public float readFloat() throws IOException {
        e(5);
        return this.f22925a.readFloat();
    }

    @Override // com.explorestack.protobuf.la
    public void readFloatList(List<Float> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof d6;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 2) {
                int uInt32 = yVar.readUInt32();
                f(uInt32);
                int totalBytesRead = yVar.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(yVar.readFloat()));
                } while (yVar.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(yVar.readFloat()));
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag = yVar.readTag();
                }
            } while (tag == this.f22926b);
            this.f22928d = tag;
            return;
        }
        d6 d6Var = (d6) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 2) {
            int uInt322 = yVar.readUInt32();
            f(uInt322);
            int totalBytesRead2 = yVar.getTotalBytesRead() + uInt322;
            do {
                d6Var.addFloat(yVar.readFloat());
            } while (yVar.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            d6Var.addFloat(yVar.readFloat());
            if (yVar.isAtEnd()) {
                return;
            } else {
                tag2 = yVar.readTag();
            }
        } while (tag2 == this.f22926b);
        this.f22928d = tag2;
    }

    @Override // com.explorestack.protobuf.la
    public <T> T readGroup(Class<T> cls, m5 m5Var) throws IOException {
        e(3);
        return (T) b(ia.getInstance().schemaFor((Class) cls), m5Var);
    }

    @Override // com.explorestack.protobuf.la
    public <T> T readGroupBySchemaWithCheck(ua uaVar, m5 m5Var) throws IOException {
        e(3);
        return (T) b(uaVar, m5Var);
    }

    @Override // com.explorestack.protobuf.la
    public <T> void readGroupList(List<T> list, Class<T> cls, m5 m5Var) throws IOException {
        readGroupList(list, ia.getInstance().schemaFor((Class) cls), m5Var);
    }

    @Override // com.explorestack.protobuf.la
    public int readInt32() throws IOException {
        e(0);
        return this.f22925a.readInt32();
    }

    @Override // com.explorestack.protobuf.la
    public void readInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l7;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(yVar.readInt32()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = yVar.getTotalBytesRead() + yVar.readUInt32();
            do {
                list.add(Integer.valueOf(yVar.readInt32()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 0) {
            do {
                l7Var.addInt(yVar.readInt32());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = yVar.getTotalBytesRead() + yVar.readUInt32();
        do {
            l7Var.addInt(yVar.readInt32());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public long readInt64() throws IOException {
        e(0);
        return this.f22925a.readInt64();
    }

    @Override // com.explorestack.protobuf.la
    public void readInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l8;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(yVar.readInt64()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = yVar.getTotalBytesRead() + yVar.readUInt32();
            do {
                list.add(Long.valueOf(yVar.readInt64()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 0) {
            do {
                l8Var.addLong(yVar.readInt64());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = yVar.getTotalBytesRead() + yVar.readUInt32();
        do {
            l8Var.addLong(yVar.readInt64());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
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
    @Override // com.explorestack.protobuf.la
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void readMap(java.util.Map<K, V> r10, com.explorestack.protobuf.t8 r11, com.explorestack.protobuf.m5 r12) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 2
            r9.e(r0)
            com.explorestack.protobuf.y r1 = r9.f22925a
            int r2 = r1.readUInt32()
            int r2 = r1.pushLimit(r2)
            java.lang.Object r3 = r11.f22662b
            java.lang.Object r4 = r11.f22664d
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
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L37 com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.explorestack.protobuf.InvalidProtocolBufferException r6 = new com.explorestack.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37 com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L37 com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            throw r6     // Catch: java.lang.Throwable -> L37 com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
        L37:
            r10 = move-exception
            goto L60
        L39:
            com.explorestack.protobuf.bd r6 = r11.f22663c     // Catch: java.lang.Throwable -> L37 com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            java.lang.Class r7 = r4.getClass()     // Catch: java.lang.Throwable -> L37 com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            java.lang.Object r5 = r9.a(r6, r7, r12)     // Catch: java.lang.Throwable -> L37 com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            goto L13
        L44:
            com.explorestack.protobuf.bd r6 = r11.f22661a     // Catch: java.lang.Throwable -> L37 com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            r7 = 0
            java.lang.Object r3 = r9.a(r6, r7, r7)     // Catch: java.lang.Throwable -> L37 com.explorestack.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4c
            goto L13
        L4c:
            boolean r6 = r9.skipField()     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L53
            goto L13
        L53:
            com.explorestack.protobuf.InvalidProtocolBufferException r10 = new com.explorestack.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L37
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
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.z.readMap(java.util.Map, com.explorestack.protobuf.t8, com.explorestack.protobuf.m5):void");
    }

    @Override // com.explorestack.protobuf.la
    public <T> T readMessage(Class<T> cls, m5 m5Var) throws IOException {
        e(2);
        return (T) c(ia.getInstance().schemaFor((Class) cls), m5Var);
    }

    @Override // com.explorestack.protobuf.la
    public <T> T readMessageBySchemaWithCheck(ua uaVar, m5 m5Var) throws IOException {
        e(2);
        return (T) c(uaVar, m5Var);
    }

    @Override // com.explorestack.protobuf.la
    public <T> void readMessageList(List<T> list, Class<T> cls, m5 m5Var) throws IOException {
        readMessageList(list, ia.getInstance().schemaFor((Class) cls), m5Var);
    }

    @Override // com.explorestack.protobuf.la
    public int readSFixed32() throws IOException {
        e(5);
        return this.f22925a.readSFixed32();
    }

    @Override // com.explorestack.protobuf.la
    public void readSFixed32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l7;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 2) {
                int uInt32 = yVar.readUInt32();
                f(uInt32);
                int totalBytesRead = yVar.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(yVar.readSFixed32()));
                } while (yVar.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(yVar.readSFixed32()));
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag = yVar.readTag();
                }
            } while (tag == this.f22926b);
            this.f22928d = tag;
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 2) {
            int uInt322 = yVar.readUInt32();
            f(uInt322);
            int totalBytesRead2 = yVar.getTotalBytesRead() + uInt322;
            do {
                l7Var.addInt(yVar.readSFixed32());
            } while (yVar.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            l7Var.addInt(yVar.readSFixed32());
            if (yVar.isAtEnd()) {
                return;
            } else {
                tag2 = yVar.readTag();
            }
        } while (tag2 == this.f22926b);
        this.f22928d = tag2;
    }

    @Override // com.explorestack.protobuf.la
    public long readSFixed64() throws IOException {
        e(1);
        return this.f22925a.readSFixed64();
    }

    @Override // com.explorestack.protobuf.la
    public void readSFixed64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l8;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(yVar.readSFixed64()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int uInt32 = yVar.readUInt32();
            g(uInt32);
            int totalBytesRead = yVar.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(yVar.readSFixed64()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 1) {
            do {
                l8Var.addLong(yVar.readSFixed64());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int uInt322 = yVar.readUInt32();
        g(uInt322);
        int totalBytesRead2 = yVar.getTotalBytesRead() + uInt322;
        do {
            l8Var.addLong(yVar.readSFixed64());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public int readSInt32() throws IOException {
        e(0);
        return this.f22925a.readSInt32();
    }

    @Override // com.explorestack.protobuf.la
    public void readSInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l7;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(yVar.readSInt32()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = yVar.getTotalBytesRead() + yVar.readUInt32();
            do {
                list.add(Integer.valueOf(yVar.readSInt32()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 0) {
            do {
                l7Var.addInt(yVar.readSInt32());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = yVar.getTotalBytesRead() + yVar.readUInt32();
        do {
            l7Var.addInt(yVar.readSInt32());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public long readSInt64() throws IOException {
        e(0);
        return this.f22925a.readSInt64();
    }

    @Override // com.explorestack.protobuf.la
    public void readSInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l8;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(yVar.readSInt64()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = yVar.getTotalBytesRead() + yVar.readUInt32();
            do {
                list.add(Long.valueOf(yVar.readSInt64()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 0) {
            do {
                l8Var.addLong(yVar.readSInt64());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = yVar.getTotalBytesRead() + yVar.readUInt32();
        do {
            l8Var.addLong(yVar.readSInt64());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public String readString() throws IOException {
        e(2);
        return this.f22925a.readString();
    }

    @Override // com.explorestack.protobuf.la
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z10) throws IOException {
        int tag;
        int tag2;
        if (hd.getTagWireType(this.f22926b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z11 = list instanceof g8;
        y yVar = this.f22925a;
        if (!z11 || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag = yVar.readTag();
                }
            } while (tag == this.f22926b);
            this.f22928d = tag;
            return;
        }
        g8 g8Var = (g8) list;
        do {
            g8Var.add(readBytes());
            if (yVar.isAtEnd()) {
                return;
            } else {
                tag2 = yVar.readTag();
            }
        } while (tag2 == this.f22926b);
        this.f22928d = tag2;
    }

    @Override // com.explorestack.protobuf.la
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // com.explorestack.protobuf.la
    public String readStringRequireUtf8() throws IOException {
        e(2);
        return this.f22925a.readStringRequireUtf8();
    }

    @Override // com.explorestack.protobuf.la
    public int readUInt32() throws IOException {
        e(0);
        return this.f22925a.readUInt32();
    }

    @Override // com.explorestack.protobuf.la
    public void readUInt32List(List<Integer> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l7;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(yVar.readUInt32()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = yVar.getTotalBytesRead() + yVar.readUInt32();
            do {
                list.add(Integer.valueOf(yVar.readUInt32()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 0) {
            do {
                l7Var.addInt(yVar.readUInt32());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = yVar.getTotalBytesRead() + yVar.readUInt32();
        do {
            l7Var.addInt(yVar.readUInt32());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public long readUInt64() throws IOException {
        e(0);
        return this.f22925a.readUInt64();
    }

    @Override // com.explorestack.protobuf.la
    public void readUInt64List(List<Long> list) throws IOException {
        int tag;
        int tag2;
        boolean z10 = list instanceof l8;
        y yVar = this.f22925a;
        if (!z10) {
            int tagWireType = hd.getTagWireType(this.f22926b);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(yVar.readUInt64()));
                    if (yVar.isAtEnd()) {
                        return;
                    } else {
                        tag = yVar.readTag();
                    }
                } while (tag == this.f22926b);
                this.f22928d = tag;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int totalBytesRead = yVar.getTotalBytesRead() + yVar.readUInt32();
            do {
                list.add(Long.valueOf(yVar.readUInt64()));
            } while (yVar.getTotalBytesRead() < totalBytesRead);
            d(totalBytesRead);
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22926b);
        if (tagWireType2 == 0) {
            do {
                l8Var.addLong(yVar.readUInt64());
                if (yVar.isAtEnd()) {
                    return;
                } else {
                    tag2 = yVar.readTag();
                }
            } while (tag2 == this.f22926b);
            this.f22928d = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int totalBytesRead2 = yVar.getTotalBytesRead() + yVar.readUInt32();
        do {
            l8Var.addLong(yVar.readUInt64());
        } while (yVar.getTotalBytesRead() < totalBytesRead2);
        d(totalBytesRead2);
    }

    @Override // com.explorestack.protobuf.la
    public boolean shouldDiscardUnknownFields() {
        this.f22925a.getClass();
        return false;
    }

    @Override // com.explorestack.protobuf.la
    public boolean skipField() throws IOException {
        int i10;
        y yVar = this.f22925a;
        if (yVar.isAtEnd() || (i10 = this.f22926b) == this.f22927c) {
            return false;
        }
        return yVar.skipField(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.la
    public <T> void readGroupList(List<T> list, ua uaVar, m5 m5Var) throws IOException {
        int tag;
        if (hd.getTagWireType(this.f22926b) == 3) {
            int i10 = this.f22926b;
            do {
                list.add(b(uaVar, m5Var));
                y yVar = this.f22925a;
                if (yVar.isAtEnd() || this.f22928d != 0) {
                    return;
                } else {
                    tag = yVar.readTag();
                }
            } while (tag == i10);
            this.f22928d = tag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.la
    public <T> void readMessageList(List<T> list, ua uaVar, m5 m5Var) throws IOException {
        int tag;
        if (hd.getTagWireType(this.f22926b) == 2) {
            int i10 = this.f22926b;
            do {
                list.add(c(uaVar, m5Var));
                y yVar = this.f22925a;
                if (yVar.isAtEnd() || this.f22928d != 0) {
                    return;
                } else {
                    tag = yVar.readTag();
                }
            } while (tag == i10);
            this.f22928d = tag;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
