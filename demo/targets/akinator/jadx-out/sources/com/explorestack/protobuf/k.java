package com.explorestack.protobuf;

import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22283a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22284b;

    /* renamed from: c, reason: collision with root package name */
    public int f22285c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22286d;

    /* renamed from: e, reason: collision with root package name */
    public int f22287e;

    /* renamed from: f, reason: collision with root package name */
    public int f22288f;

    /* renamed from: g, reason: collision with root package name */
    public int f22289g;

    public k(ByteBuffer byteBuffer, boolean z10) {
        this.f22283a = z10;
        this.f22284b = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        this.f22285c = iPosition;
        this.f22286d = iPosition;
        this.f22287e = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    public final boolean a() {
        return this.f22285c == this.f22287e;
    }

    public final Object b(bd bdVar, Class cls, m5 m5Var) {
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

    public final Object c(ua uaVar, m5 m5Var) {
        int i10 = this.f22289g;
        this.f22289g = (hd.getTagFieldNumber(this.f22288f) << 3) | 4;
        try {
            Object objNewInstance = uaVar.newInstance();
            uaVar.mergeFrom(objNewInstance, this, m5Var);
            uaVar.makeImmutable(objNewInstance);
            if (this.f22288f == this.f22289g) {
                return objNewInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f22289g = i10;
        }
    }

    public final int d() {
        int i10 = this.f22285c;
        this.f22285c = i10 + 4;
        byte[] bArr = this.f22284b;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long e() {
        this.f22285c = this.f22285c + 8;
        byte[] bArr = this.f22284b;
        return ((bArr[r0 + 7] & 255) << 56) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16) | ((bArr[r0 + 3] & 255) << 24) | ((bArr[r0 + 4] & 255) << 32) | ((bArr[r0 + 5] & 255) << 40) | ((bArr[r0 + 6] & 255) << 48);
    }

    public final Object f(ua uaVar, m5 m5Var) throws InvalidProtocolBufferException {
        int iG = g();
        i(iG);
        int i10 = this.f22287e;
        int i11 = this.f22285c + iG;
        this.f22287e = i11;
        try {
            Object objNewInstance = uaVar.newInstance();
            uaVar.mergeFrom(objNewInstance, this, m5Var);
            uaVar.makeImmutable(objNewInstance);
            if (this.f22285c == i11) {
                return objNewInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f22287e = i10;
        }
    }

    public final int g() throws InvalidProtocolBufferException {
        int i10;
        int i11 = this.f22285c;
        int i12 = this.f22287e;
        if (i12 == i11) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = i11 + 1;
        byte[] bArr = this.f22284b;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            this.f22285c = i13;
            return b10;
        }
        if (i12 - i13 < 9) {
            return (int) h();
        }
        int i14 = i11 + 2;
        int i15 = (bArr[i13] << 7) ^ b10;
        if (i15 < 0) {
            i10 = i15 ^ (-128);
        } else {
            int i16 = i11 + 3;
            int i17 = (bArr[i14] << 14) ^ i15;
            if (i17 >= 0) {
                i10 = i17 ^ 16256;
            } else {
                int i18 = i11 + 4;
                int i19 = i17 ^ (bArr[i16] << 21);
                if (i19 < 0) {
                    i10 = (-2080896) ^ i19;
                } else {
                    i16 = i11 + 5;
                    byte b11 = bArr[i18];
                    int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                    if (b11 < 0) {
                        i18 = i11 + 6;
                        if (bArr[i16] < 0) {
                            i16 = i11 + 7;
                            if (bArr[i18] < 0) {
                                i18 = i11 + 8;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 9;
                                    if (bArr[i18] < 0) {
                                        int i21 = i11 + 10;
                                        if (bArr[i16] < 0) {
                                            throw InvalidProtocolBufferException.malformedVarint();
                                        }
                                        i14 = i21;
                                        i10 = i20;
                                    }
                                }
                            }
                        }
                        i10 = i20;
                    }
                    i10 = i20;
                }
                i14 = i18;
            }
            i14 = i16;
        }
        this.f22285c = i14;
        return i10;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public int getFieldNumber() throws IOException {
        if (a()) {
            return Integer.MAX_VALUE;
        }
        int iG = g();
        this.f22288f = iG;
        if (iG == this.f22289g) {
            return Integer.MAX_VALUE;
        }
        return hd.getTagFieldNumber(iG);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public int getTag() {
        return this.f22288f;
    }

    @Override // com.explorestack.protobuf.l
    public int getTotalBytesRead() {
        return this.f22285c - this.f22286d;
    }

    public final long h() throws InvalidProtocolBufferException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f22285c;
            if (i11 == this.f22287e) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f22285c = i11 + 1;
            j10 |= (r3 & AbstractJsonLexerKt.TC_INVALID) << i10;
            if ((this.f22284b[i11] & 128) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public final void i(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0 || i10 > this.f22287e - this.f22285c) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void j(int i10) throws InvalidProtocolBufferException {
        if (this.f22285c != i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void k(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (hd.getTagWireType(this.f22288f) != i10) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final void l(int i10) throws InvalidProtocolBufferException {
        i(i10);
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final void m(int i10) throws InvalidProtocolBufferException {
        i(i10);
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public boolean readBool() throws IOException {
        k(0);
        return g() != 0;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readBoolList(List<Boolean> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof q)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType != 0) {
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iG = this.f22285c + g();
                while (this.f22285c < iG) {
                    list.add(Boolean.valueOf(g() != 0));
                }
                j(iG);
                return;
            }
            do {
                list.add(Boolean.valueOf(readBool()));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i10;
            return;
        }
        q qVar = (q) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 != 0) {
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG2 = this.f22285c + g();
            while (this.f22285c < iG2) {
                qVar.addBoolean(g() != 0);
            }
            j(iG2);
            return;
        }
        do {
            qVar.addBoolean(readBool());
            if (a()) {
                return;
            } else {
                i11 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i11;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public ByteString readBytes() throws IOException {
        k(2);
        int iG = g();
        if (iG == 0) {
            return ByteString.EMPTY;
        }
        i(iG);
        boolean z10 = this.f22283a;
        byte[] bArr = this.f22284b;
        ByteString byteStringWrap = z10 ? ByteString.wrap(bArr, this.f22285c, iG) : ByteString.copyFrom(bArr, this.f22285c, iG);
        this.f22285c += iG;
        return byteStringWrap;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readBytesList(List<ByteString> list) throws IOException {
        int i10;
        if (hd.getTagWireType(this.f22288f) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (a()) {
                return;
            } else {
                i10 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i10;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public double readDouble() throws IOException {
        k(1);
        i(8);
        return Double.longBitsToDouble(e());
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readDoubleList(List<Double> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof y4)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(readDouble()));
                    if (a()) {
                        return;
                    } else {
                        i10 = this.f22285c;
                    }
                } while (g() == this.f22288f);
                this.f22285c = i10;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG = g();
            m(iG);
            int i12 = this.f22285c + iG;
            while (this.f22285c < i12) {
                list.add(Double.valueOf(Double.longBitsToDouble(e())));
            }
            return;
        }
        y4 y4Var = (y4) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 == 1) {
            do {
                y4Var.addDouble(readDouble());
                if (a()) {
                    return;
                } else {
                    i11 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i11;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iG2 = g();
        m(iG2);
        int i13 = this.f22285c + iG2;
        while (this.f22285c < i13) {
            y4Var.addDouble(Double.longBitsToDouble(e()));
        }
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public int readEnum() throws IOException {
        k(0);
        return g();
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readEnumList(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l7)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType != 0) {
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iG = this.f22285c + g();
                while (this.f22285c < iG) {
                    list.add(Integer.valueOf(g()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(readEnum()));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i10;
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 != 0) {
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG2 = this.f22285c + g();
            while (this.f22285c < iG2) {
                l7Var.addInt(g());
            }
            return;
        }
        do {
            l7Var.addInt(readEnum());
            if (a()) {
                return;
            } else {
                i11 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i11;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public int readFixed32() throws IOException {
        k(5);
        i(4);
        return d();
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readFixed32List(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l7)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType == 2) {
                int iG = g();
                l(iG);
                int i12 = this.f22285c + iG;
                while (this.f22285c < i12) {
                    list.add(Integer.valueOf(d()));
                }
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readFixed32()));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i10;
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 == 2) {
            int iG2 = g();
            l(iG2);
            int i13 = this.f22285c + iG2;
            while (this.f22285c < i13) {
                l7Var.addInt(d());
            }
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            l7Var.addInt(readFixed32());
            if (a()) {
                return;
            } else {
                i11 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i11;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public long readFixed64() throws IOException {
        k(1);
        i(8);
        return e();
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readFixed64List(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l8)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(readFixed64()));
                    if (a()) {
                        return;
                    } else {
                        i10 = this.f22285c;
                    }
                } while (g() == this.f22288f);
                this.f22285c = i10;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG = g();
            m(iG);
            int i12 = this.f22285c + iG;
            while (this.f22285c < i12) {
                list.add(Long.valueOf(e()));
            }
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 == 1) {
            do {
                l8Var.addLong(readFixed64());
                if (a()) {
                    return;
                } else {
                    i11 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i11;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iG2 = g();
        m(iG2);
        int i13 = this.f22285c + iG2;
        while (this.f22285c < i13) {
            l8Var.addLong(e());
        }
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public float readFloat() throws IOException {
        k(5);
        i(4);
        return Float.intBitsToFloat(d());
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readFloatList(List<Float> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof d6)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType == 2) {
                int iG = g();
                l(iG);
                int i12 = this.f22285c + iG;
                while (this.f22285c < i12) {
                    list.add(Float.valueOf(Float.intBitsToFloat(d())));
                }
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(readFloat()));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i10;
            return;
        }
        d6 d6Var = (d6) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 == 2) {
            int iG2 = g();
            l(iG2);
            int i13 = this.f22285c + iG2;
            while (this.f22285c < i13) {
                d6Var.addFloat(Float.intBitsToFloat(d()));
            }
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            d6Var.addFloat(readFloat());
            if (a()) {
                return;
            } else {
                i11 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i11;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public <T> T readGroup(Class<T> cls, m5 m5Var) throws IOException {
        k(3);
        return (T) c(ia.getInstance().schemaFor((Class) cls), m5Var);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public <T> T readGroupBySchemaWithCheck(ua uaVar, m5 m5Var) throws IOException {
        k(3);
        return (T) c(uaVar, m5Var);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public <T> void readGroupList(List<T> list, Class<T> cls, m5 m5Var) throws IOException {
        readGroupList(list, ia.getInstance().schemaFor((Class) cls), m5Var);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public int readInt32() throws IOException {
        k(0);
        return g();
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readInt32List(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l7)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(readInt32()));
                    if (a()) {
                        return;
                    } else {
                        i10 = this.f22285c;
                    }
                } while (g() == this.f22288f);
                this.f22285c = i10;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG = this.f22285c + g();
            while (this.f22285c < iG) {
                list.add(Integer.valueOf(g()));
            }
            j(iG);
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 == 0) {
            do {
                l7Var.addInt(readInt32());
                if (a()) {
                    return;
                } else {
                    i11 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i11;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iG2 = this.f22285c + g();
        while (this.f22285c < iG2) {
            l7Var.addInt(g());
        }
        j(iG2);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public long readInt64() throws IOException {
        k(0);
        return readVarint64();
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readInt64List(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l8)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(readInt64()));
                    if (a()) {
                        return;
                    } else {
                        i10 = this.f22285c;
                    }
                } while (g() == this.f22288f);
                this.f22285c = i10;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG = this.f22285c + g();
            while (this.f22285c < iG) {
                list.add(Long.valueOf(readVarint64()));
            }
            j(iG);
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 == 0) {
            do {
                l8Var.addLong(readInt64());
                if (a()) {
                    return;
                } else {
                    i11 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i11;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iG2 = this.f22285c + g();
        while (this.f22285c < iG2) {
            l8Var.addLong(readVarint64());
        }
        j(iG2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public <K, V> void readMap(Map<K, V> map, t8 t8Var, m5 m5Var) throws IOException {
        k(2);
        int iG = g();
        i(iG);
        int i10 = this.f22287e;
        this.f22287e = this.f22285c + iG;
        try {
            Object objB = t8Var.f22662b;
            Object objB2 = t8Var.f22664d;
            while (true) {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE) {
                    map.put(objB, objB2);
                    return;
                }
                if (fieldNumber == 1) {
                    objB = b(t8Var.f22661a, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objB2 = b(t8Var.f22663c, t8Var.f22664d.getClass(), m5Var);
                }
            }
        } finally {
            this.f22287e = i10;
        }
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public <T> T readMessage(Class<T> cls, m5 m5Var) throws IOException {
        k(2);
        return (T) f(ia.getInstance().schemaFor((Class) cls), m5Var);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public <T> T readMessageBySchemaWithCheck(ua uaVar, m5 m5Var) throws IOException {
        k(2);
        return (T) f(uaVar, m5Var);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public <T> void readMessageList(List<T> list, Class<T> cls, m5 m5Var) throws IOException {
        readMessageList(list, ia.getInstance().schemaFor((Class) cls), m5Var);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public int readSFixed32() throws IOException {
        k(5);
        i(4);
        return d();
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readSFixed32List(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l7)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType == 2) {
                int iG = g();
                l(iG);
                int i12 = this.f22285c + iG;
                while (this.f22285c < i12) {
                    list.add(Integer.valueOf(d()));
                }
                return;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(readSFixed32()));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i10;
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 == 2) {
            int iG2 = g();
            l(iG2);
            int i13 = this.f22285c + iG2;
            while (this.f22285c < i13) {
                l7Var.addInt(d());
            }
            return;
        }
        if (tagWireType2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            l7Var.addInt(readSFixed32());
            if (a()) {
                return;
            } else {
                i11 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i11;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public long readSFixed64() throws IOException {
        k(1);
        i(8);
        return e();
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readSFixed64List(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l8)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(readSFixed64()));
                    if (a()) {
                        return;
                    } else {
                        i10 = this.f22285c;
                    }
                } while (g() == this.f22288f);
                this.f22285c = i10;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG = g();
            m(iG);
            int i12 = this.f22285c + iG;
            while (this.f22285c < i12) {
                list.add(Long.valueOf(e()));
            }
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 == 1) {
            do {
                l8Var.addLong(readSFixed64());
                if (a()) {
                    return;
                } else {
                    i11 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i11;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iG2 = g();
        m(iG2);
        int i13 = this.f22285c + iG2;
        while (this.f22285c < i13) {
            l8Var.addLong(e());
        }
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public int readSInt32() throws IOException {
        k(0);
        return y.decodeZigZag32(g());
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readSInt32List(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l7)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType != 0) {
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iG = this.f22285c + g();
                while (this.f22285c < iG) {
                    list.add(Integer.valueOf(y.decodeZigZag32(g())));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(readSInt32()));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i10;
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 != 0) {
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG2 = this.f22285c + g();
            while (this.f22285c < iG2) {
                l7Var.addInt(y.decodeZigZag32(g()));
            }
            return;
        }
        do {
            l7Var.addInt(readSInt32());
            if (a()) {
                return;
            } else {
                i11 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i11;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public long readSInt64() throws IOException {
        k(0);
        return y.decodeZigZag64(readVarint64());
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readSInt64List(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l8)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType != 0) {
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iG = this.f22285c + g();
                while (this.f22285c < iG) {
                    list.add(Long.valueOf(y.decodeZigZag64(readVarint64())));
                }
                return;
            }
            do {
                list.add(Long.valueOf(readSInt64()));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i10;
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 != 0) {
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG2 = this.f22285c + g();
            while (this.f22285c < iG2) {
                l8Var.addLong(y.decodeZigZag64(readVarint64()));
            }
            return;
        }
        do {
            l8Var.addLong(readSInt64());
            if (a()) {
                return;
            } else {
                i11 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i11;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public String readString() throws IOException {
        return readStringInternal(false);
    }

    public String readStringInternal(boolean z10) throws IOException {
        k(2);
        int iG = g();
        if (iG == 0) {
            return "";
        }
        i(iG);
        byte[] bArr = this.f22284b;
        if (z10) {
            int i10 = this.f22285c;
            if (!vc.isValidUtf8(bArr, i10, i10 + iG)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
        }
        String str = new String(bArr, this.f22285c, iG, x7.f22881a);
        this.f22285c += iG;
        return str;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readStringList(List<String> list) throws IOException {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z10) throws IOException {
        int i10;
        int i11;
        if (hd.getTagWireType(this.f22288f) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof g8) || z10) {
            do {
                list.add(readStringInternal(z10));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i10;
            return;
        }
        g8 g8Var = (g8) list;
        do {
            g8Var.add(readBytes());
            if (a()) {
                return;
            } else {
                i11 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i11;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readStringListRequireUtf8(List<String> list) throws IOException {
        readStringListInternal(list, true);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public String readStringRequireUtf8() throws IOException {
        return readStringInternal(true);
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public int readUInt32() throws IOException {
        k(0);
        return g();
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readUInt32List(List<Integer> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l7)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType != 0) {
                if (tagWireType != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iG = this.f22285c + g();
                while (this.f22285c < iG) {
                    list.add(Integer.valueOf(g()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(readUInt32()));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i10;
            return;
        }
        l7 l7Var = (l7) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 != 0) {
            if (tagWireType2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG2 = this.f22285c + g();
            while (this.f22285c < iG2) {
                l7Var.addInt(g());
            }
            return;
        }
        do {
            l7Var.addInt(readUInt32());
            if (a()) {
                return;
            } else {
                i11 = this.f22285c;
            }
        } while (g() == this.f22288f);
        this.f22285c = i11;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public long readUInt64() throws IOException {
        k(0);
        return readVarint64();
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public void readUInt64List(List<Long> list) throws IOException {
        int i10;
        int i11;
        if (!(list instanceof l8)) {
            int tagWireType = hd.getTagWireType(this.f22288f);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(readUInt64()));
                    if (a()) {
                        return;
                    } else {
                        i10 = this.f22285c;
                    }
                } while (g() == this.f22288f);
                this.f22285c = i10;
                return;
            }
            if (tagWireType != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iG = this.f22285c + g();
            while (this.f22285c < iG) {
                list.add(Long.valueOf(readVarint64()));
            }
            j(iG);
            return;
        }
        l8 l8Var = (l8) list;
        int tagWireType2 = hd.getTagWireType(this.f22288f);
        if (tagWireType2 == 0) {
            do {
                l8Var.addLong(readUInt64());
                if (a()) {
                    return;
                } else {
                    i11 = this.f22285c;
                }
            } while (g() == this.f22288f);
            this.f22285c = i11;
            return;
        }
        if (tagWireType2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iG2 = this.f22285c + g();
        while (this.f22285c < iG2) {
            l8Var.addLong(readVarint64());
        }
        j(iG2);
    }

    public long readVarint64() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f22285c;
        int i11 = this.f22287e;
        if (i11 == i10) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i12 = i10 + 1;
        byte[] bArr = this.f22284b;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            this.f22285c = i12;
            return b10;
        }
        if (i11 - i12 < 9) {
            return h();
        }
        int i13 = i10 + 2;
        int i14 = (bArr[i12] << 7) ^ b10;
        if (i14 < 0) {
            j10 = i14 ^ (-128);
        } else {
            int i15 = i10 + 3;
            int i16 = (bArr[i13] << 14) ^ i14;
            if (i16 >= 0) {
                j10 = i16 ^ 16256;
                i13 = i15;
            } else {
                int i17 = i10 + 4;
                int i18 = i16 ^ (bArr[i15] << 21);
                if (i18 < 0) {
                    j13 = (-2080896) ^ i18;
                } else {
                    long j14 = i18;
                    i13 = i10 + 5;
                    long j15 = j14 ^ (bArr[i17] << 28);
                    if (j15 >= 0) {
                        j12 = 266354560;
                    } else {
                        i17 = i10 + 6;
                        long j16 = j15 ^ (bArr[i13] << 35);
                        if (j16 < 0) {
                            j11 = -34093383808L;
                        } else {
                            i13 = i10 + 7;
                            j15 = j16 ^ (bArr[i17] << 42);
                            if (j15 >= 0) {
                                j12 = 4363953127296L;
                            } else {
                                i17 = i10 + 8;
                                j16 = j15 ^ (bArr[i13] << 49);
                                if (j16 < 0) {
                                    j11 = -558586000294016L;
                                } else {
                                    i13 = i10 + 9;
                                    long j17 = (j16 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                    if (j17 < 0) {
                                        int i19 = i10 + 10;
                                        if (bArr[i13] < 0) {
                                            throw InvalidProtocolBufferException.malformedVarint();
                                        }
                                        i13 = i19;
                                    }
                                    j10 = j17;
                                }
                            }
                        }
                        j13 = j11 ^ j16;
                    }
                    j10 = j12 ^ j15;
                }
                i13 = i17;
                j10 = j13;
            }
        }
        this.f22285c = i13;
        return j10;
    }

    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public boolean skipField() throws IOException {
        int i10;
        if (a() || (i10 = this.f22288f) == this.f22289g) {
            return false;
        }
        int tagWireType = hd.getTagWireType(i10);
        if (tagWireType == 0) {
            int i11 = this.f22287e;
            int i12 = this.f22285c;
            int i13 = i11 - i12;
            byte[] bArr = this.f22284b;
            if (i13 >= 10) {
                int i14 = 0;
                while (i14 < 10) {
                    int i15 = i12 + 1;
                    if (bArr[i12] >= 0) {
                        this.f22285c = i15;
                        return true;
                    }
                    i14++;
                    i12 = i15;
                }
            }
            for (int i16 = 0; i16 < 10; i16++) {
                int i17 = this.f22285c;
                if (i17 == this.f22287e) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f22285c = i17 + 1;
                if (bArr[i17] >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
        if (tagWireType == 1) {
            i(8);
            this.f22285c += 8;
            return true;
        }
        if (tagWireType == 2) {
            int iG = g();
            i(iG);
            this.f22285c += iG;
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            i(4);
            this.f22285c += 4;
            return true;
        }
        int i18 = this.f22289g;
        this.f22289g = 4 | (hd.getTagFieldNumber(this.f22288f) << 3);
        while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
        }
        if (this.f22288f != this.f22289g) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        this.f22289g = i18;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public <T> void readGroupList(List<T> list, ua uaVar, m5 m5Var) throws IOException {
        int i10;
        if (hd.getTagWireType(this.f22288f) == 3) {
            int i11 = this.f22288f;
            do {
                list.add(c(uaVar, m5Var));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == i11);
            this.f22285c = i10;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.explorestack.protobuf.l, com.explorestack.protobuf.la
    public <T> void readMessageList(List<T> list, ua uaVar, m5 m5Var) throws IOException {
        int i10;
        if (hd.getTagWireType(this.f22288f) == 2) {
            int i11 = this.f22288f;
            do {
                list.add(f(uaVar, m5Var));
                if (a()) {
                    return;
                } else {
                    i10 = this.f22285c;
                }
            } while (g() == i11);
            this.f22285c = i10;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }
}
