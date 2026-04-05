package com.explorestack.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class hc {

    /* renamed from: f, reason: collision with root package name */
    public static final hc f22208f = new hc(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f22209a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f22210b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f22211c;

    /* renamed from: d, reason: collision with root package name */
    public int f22212d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22213e;

    public hc(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f22209a = i10;
        this.f22210b = iArr;
        this.f22211c = objArr;
        this.f22213e = z10;
    }

    public static hc a() {
        return new hc(0, new int[8], new Object[8], true);
    }

    public static void c(int i10, Object obj, i0 i0Var) throws IOException {
        int tagFieldNumber = hd.getTagFieldNumber(i10);
        int tagWireType = hd.getTagWireType(i10);
        if (tagWireType == 0) {
            i0Var.writeInt64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            i0Var.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            i0Var.writeBytes(tagFieldNumber, (ByteString) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            i0Var.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
        } else if (i0Var.fieldOrder() == jd.f22280b) {
            i0Var.writeStartGroup(tagFieldNumber);
            ((hc) obj).writeTo(i0Var);
            i0Var.writeEndGroup(tagFieldNumber);
        } else {
            i0Var.writeEndGroup(tagFieldNumber);
            ((hc) obj).writeTo(i0Var);
            i0Var.writeStartGroup(tagFieldNumber);
        }
    }

    public static hc getDefaultInstance() {
        return f22208f;
    }

    public final void b(int i10, Object obj) {
        if (!this.f22213e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f22209a;
        int[] iArr = this.f22210b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f22210b = Arrays.copyOf(iArr, i12);
            this.f22211c = Arrays.copyOf(this.f22211c, i12);
        }
        int[] iArr2 = this.f22210b;
        int i13 = this.f22209a;
        iArr2[i13] = i10;
        this.f22211c[i13] = obj;
        this.f22209a = i13 + 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        int i10 = this.f22209a;
        if (i10 == hcVar.f22209a) {
            int[] iArr = this.f22210b;
            int[] iArr2 = hcVar.f22210b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f22211c;
                    Object[] objArr2 = hcVar.f22211c;
                    int i12 = this.f22209a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i10 = this.f22212d;
        if (i10 != -1) {
            return i10;
        }
        int serializedSize = 0;
        for (int i11 = 0; i11 < this.f22209a; i11++) {
            int i12 = this.f22210b[i11];
            int tagFieldNumber = hd.getTagFieldNumber(i12);
            int tagWireType = hd.getTagWireType(i12);
            if (tagWireType == 0) {
                iComputeUInt64Size = h0.computeUInt64Size(tagFieldNumber, ((Long) this.f22211c[i11]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = h0.computeFixed64Size(tagFieldNumber, ((Long) this.f22211c[i11]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = h0.computeBytesSize(tagFieldNumber, (ByteString) this.f22211c[i11]);
            } else if (tagWireType == 3) {
                serializedSize = ((hc) this.f22211c[i11]).getSerializedSize() + (h0.computeTagSize(tagFieldNumber) * 2) + serializedSize;
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                }
                iComputeUInt64Size = h0.computeFixed32Size(tagFieldNumber, ((Integer) this.f22211c[i11]).intValue());
            }
            serializedSize = iComputeUInt64Size + serializedSize;
        }
        this.f22212d = serializedSize;
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int i10 = this.f22212d;
        if (i10 != -1) {
            return i10;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i11 = 0; i11 < this.f22209a; i11++) {
            iComputeRawMessageSetExtensionSize += h0.computeRawMessageSetExtensionSize(hd.getTagFieldNumber(this.f22210b[i11]), (ByteString) this.f22211c[i11]);
        }
        this.f22212d = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public int hashCode() {
        int i10 = this.f22209a;
        int i11 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        int[] iArr = this.f22210b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f22211c;
        int i15 = this.f22209a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public void makeImmutable() {
        this.f22213e = false;
    }

    public void writeAsMessageSetTo(h0 h0Var) throws IOException {
        for (int i10 = 0; i10 < this.f22209a; i10++) {
            h0Var.writeRawMessageSetExtension(hd.getTagFieldNumber(this.f22210b[i10]), (ByteString) this.f22211c[i10]);
        }
    }

    public void writeTo(h0 h0Var) throws IOException {
        for (int i10 = 0; i10 < this.f22209a; i10++) {
            int i11 = this.f22210b[i10];
            int tagFieldNumber = hd.getTagFieldNumber(i11);
            int tagWireType = hd.getTagWireType(i11);
            if (tagWireType == 0) {
                h0Var.writeUInt64(tagFieldNumber, ((Long) this.f22211c[i10]).longValue());
            } else if (tagWireType == 1) {
                h0Var.writeFixed64(tagFieldNumber, ((Long) this.f22211c[i10]).longValue());
            } else if (tagWireType == 2) {
                h0Var.writeBytes(tagFieldNumber, (ByteString) this.f22211c[i10]);
            } else if (tagWireType == 3) {
                h0Var.writeTag(tagFieldNumber, 3);
                ((hc) this.f22211c[i10]).writeTo(h0Var);
                h0Var.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                h0Var.writeFixed32(tagFieldNumber, ((Integer) this.f22211c[i10]).intValue());
            }
        }
    }

    public void writeTo(kd kdVar) throws IOException {
        if (this.f22209a == 0) {
            return;
        }
        i0 i0Var = (i0) kdVar;
        if (i0Var.fieldOrder() == jd.f22280b) {
            for (int i10 = 0; i10 < this.f22209a; i10++) {
                c(this.f22210b[i10], this.f22211c[i10], i0Var);
            }
            return;
        }
        for (int i11 = this.f22209a - 1; i11 >= 0; i11--) {
            c(this.f22210b[i11], this.f22211c[i11], i0Var);
        }
    }
}
