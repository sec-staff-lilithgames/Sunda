package t4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import t4.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends h {
    public static void ValidateVersion() {
        b.FLATBUFFERS_1_12_0();
    }

    public static void addList(c cVar, int i10) {
        cVar.addOffset(1, i10, 0);
    }

    public static void addSourceSha(c cVar, int i10) {
        cVar.addOffset(2, i10, 0);
    }

    public static void addVersion(c cVar, int i10) {
        cVar.addInt(0, i10, 0);
    }

    public static int createListVector(c cVar, int[] iArr) {
        cVar.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.addOffset(iArr[length]);
        }
        return cVar.endVector();
    }

    public static int createMetadataList(c cVar, int i10, int i11, int i12) {
        cVar.startTable(3);
        addSourceSha(cVar, i12);
        addList(cVar, i11);
        addVersion(cVar, i10);
        return endMetadataList(cVar);
    }

    public static int endMetadataList(c cVar) {
        return cVar.endTable();
    }

    public static void finishMetadataListBuffer(c cVar, int i10) {
        cVar.finish(i10);
    }

    public static void finishSizePrefixedMetadataListBuffer(c cVar, int i10) {
        cVar.finishSizePrefixed(i10);
    }

    public static f getRootAsMetadataList(ByteBuffer byteBuffer) {
        return getRootAsMetadataList(byteBuffer, new f());
    }

    public static void startListVector(c cVar, int i10) {
        cVar.startVector(4, i10, 4);
    }

    public static void startMetadataList(c cVar) {
        cVar.startTable(3);
    }

    public f __assign(int i10, ByteBuffer byteBuffer) {
        __init(i10, byteBuffer);
        return this;
    }

    public void __init(int i10, ByteBuffer byteBuffer) {
        b(i10, byteBuffer);
    }

    public e list(int i10) {
        return list(new e(), i10);
    }

    public int listLength() {
        int iA = a(6);
        if (iA != 0) {
            return e(iA);
        }
        return 0;
    }

    public e.a listVector() {
        return listVector(new e.a());
    }

    public String sourceSha() {
        int iA = a(8);
        if (iA == 0) {
            return null;
        }
        int i10 = iA + this.f86321a;
        ByteBuffer byteBuffer = this.f86322b;
        int i11 = byteBuffer.getInt(i10) + i10;
        int i12 = byteBuffer.getInt(i11);
        return this.f86325e.decodeUtf8(byteBuffer, i11 + 4, i12);
    }

    public ByteBuffer sourceShaAsByteBuffer() {
        return d(8, 1);
    }

    public ByteBuffer sourceShaInByteBuffer(ByteBuffer byteBuffer) {
        int iA = a(8);
        if (iA == 0) {
            return null;
        }
        int iC = c(iA);
        byteBuffer.rewind();
        byteBuffer.limit(e(iA) + iC);
        byteBuffer.position(iC);
        return byteBuffer;
    }

    public int version() {
        int iA = a(4);
        if (iA != 0) {
            return this.f86322b.getInt(iA + this.f86321a);
        }
        return 0;
    }

    public static f getRootAsMetadataList(ByteBuffer byteBuffer, f fVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return fVar.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public e list(e eVar, int i10) {
        int iA = a(6);
        if (iA == 0) {
            return null;
        }
        int iC = (i10 * 4) + c(iA);
        return eVar.__assign(this.f86322b.getInt(iC) + iC, this.f86322b);
    }

    public e.a listVector(e.a aVar) {
        int iA = a(6);
        if (iA != 0) {
            return aVar.__assign(c(iA), 4, this.f86322b);
        }
        return null;
    }
}
