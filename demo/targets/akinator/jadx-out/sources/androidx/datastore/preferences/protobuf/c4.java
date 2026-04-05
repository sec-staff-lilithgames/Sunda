package androidx.datastore.preferences.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c4 {

    /* renamed from: f, reason: collision with root package name */
    public static final c4 f5837f = new c4(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f5838a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5839b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5840c;

    /* renamed from: d, reason: collision with root package name */
    public int f5841d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5842e;

    public c4(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f5838a = i10;
        this.f5839b = iArr;
        this.f5840c = objArr;
        this.f5842e = z10;
    }

    public static c4 b() {
        return new c4(0, new int[8], new Object[8], true);
    }

    public static void d(int i10, Object obj, m0 m0Var) throws IOException {
        int tagFieldNumber = t4.getTagFieldNumber(i10);
        int tagWireType = t4.getTagWireType(i10);
        if (tagWireType == 0) {
            m0Var.writeInt64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            m0Var.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            m0Var.writeBytes(tagFieldNumber, (x) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(u1.d());
            }
            m0Var.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
        } else if (m0Var.fieldOrder() == u4.f6037b) {
            m0Var.writeStartGroup(tagFieldNumber);
            ((c4) obj).writeTo(m0Var);
            m0Var.writeEndGroup(tagFieldNumber);
        } else {
            m0Var.writeEndGroup(tagFieldNumber);
            ((c4) obj).writeTo(m0Var);
            m0Var.writeStartGroup(tagFieldNumber);
        }
    }

    public static c4 getDefaultInstance() {
        return f5837f;
    }

    public final void a(int i10) {
        int[] iArr = this.f5839b;
        if (i10 > iArr.length) {
            int i11 = this.f5838a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f5839b = Arrays.copyOf(iArr, i10);
            this.f5840c = Arrays.copyOf(this.f5840c, i10);
        }
    }

    public final void c(int i10, Object obj) {
        if (!this.f5842e) {
            throw new UnsupportedOperationException();
        }
        a(this.f5838a + 1);
        int[] iArr = this.f5839b;
        int i11 = this.f5838a;
        iArr[i11] = i10;
        this.f5840c[i11] = obj;
        this.f5838a = i11 + 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        int i10 = this.f5838a;
        if (i10 == c4Var.f5838a) {
            int[] iArr = this.f5839b;
            int[] iArr2 = c4Var.f5839b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f5840c;
                    Object[] objArr2 = c4Var.f5840c;
                    int i12 = this.f5838a;
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
        int i10 = this.f5841d;
        if (i10 != -1) {
            return i10;
        }
        int serializedSize = 0;
        for (int i11 = 0; i11 < this.f5838a; i11++) {
            int i12 = this.f5839b[i11];
            int tagFieldNumber = t4.getTagFieldNumber(i12);
            int tagWireType = t4.getTagWireType(i12);
            if (tagWireType == 0) {
                iComputeUInt64Size = l0.computeUInt64Size(tagFieldNumber, ((Long) this.f5840c[i11]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = l0.computeFixed64Size(tagFieldNumber, ((Long) this.f5840c[i11]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = l0.computeBytesSize(tagFieldNumber, (x) this.f5840c[i11]);
            } else if (tagWireType == 3) {
                serializedSize = ((c4) this.f5840c[i11]).getSerializedSize() + (l0.computeTagSize(tagFieldNumber) * 2) + serializedSize;
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(u1.d());
                }
                iComputeUInt64Size = l0.computeFixed32Size(tagFieldNumber, ((Integer) this.f5840c[i11]).intValue());
            }
            serializedSize = iComputeUInt64Size + serializedSize;
        }
        this.f5841d = serializedSize;
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int i10 = this.f5841d;
        if (i10 != -1) {
            return i10;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i11 = 0; i11 < this.f5838a; i11++) {
            iComputeRawMessageSetExtensionSize += l0.computeRawMessageSetExtensionSize(t4.getTagFieldNumber(this.f5839b[i11]), (x) this.f5840c[i11]);
        }
        this.f5841d = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public int hashCode() {
        int i10 = this.f5838a;
        int i11 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        int[] iArr = this.f5839b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f5840c;
        int i15 = this.f5838a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public void makeImmutable() {
        if (this.f5842e) {
            this.f5842e = false;
        }
    }

    public void writeAsMessageSetTo(l0 l0Var) throws IOException {
        for (int i10 = 0; i10 < this.f5838a; i10++) {
            l0Var.writeRawMessageSetExtension(t4.getTagFieldNumber(this.f5839b[i10]), (x) this.f5840c[i10]);
        }
    }

    public void writeTo(l0 l0Var) throws IOException {
        for (int i10 = 0; i10 < this.f5838a; i10++) {
            int i11 = this.f5839b[i10];
            int tagFieldNumber = t4.getTagFieldNumber(i11);
            int tagWireType = t4.getTagWireType(i11);
            if (tagWireType == 0) {
                l0Var.writeUInt64(tagFieldNumber, ((Long) this.f5840c[i10]).longValue());
            } else if (tagWireType == 1) {
                l0Var.writeFixed64(tagFieldNumber, ((Long) this.f5840c[i10]).longValue());
            } else if (tagWireType == 2) {
                l0Var.writeBytes(tagFieldNumber, (x) this.f5840c[i10]);
            } else if (tagWireType == 3) {
                l0Var.writeTag(tagFieldNumber, 3);
                ((c4) this.f5840c[i10]).writeTo(l0Var);
                l0Var.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw u1.d();
                }
                l0Var.writeFixed32(tagFieldNumber, ((Integer) this.f5840c[i10]).intValue());
            }
        }
    }

    public void writeTo(v4 v4Var) throws IOException {
        if (this.f5838a == 0) {
            return;
        }
        m0 m0Var = (m0) v4Var;
        if (m0Var.fieldOrder() == u4.f6037b) {
            for (int i10 = 0; i10 < this.f5838a; i10++) {
                d(this.f5839b[i10], this.f5840c[i10], m0Var);
            }
            return;
        }
        for (int i11 = this.f5838a - 1; i11 >= 0; i11--) {
            d(this.f5839b[i11], this.f5840c[i11], m0Var);
        }
    }
}
