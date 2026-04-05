package t4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends h {
    public static void ValidateVersion() {
        b.FLATBUFFERS_1_12_0();
    }

    public static void addCodepoints(c cVar, int i10) {
        cVar.addOffset(6, i10, 0);
    }

    public static void addCompatAdded(c cVar, short s10) {
        cVar.addShort(3, s10, 0);
    }

    public static void addEmojiStyle(c cVar, boolean z10) {
        cVar.addBoolean(1, z10, false);
    }

    public static void addHeight(c cVar, short s10) {
        cVar.addShort(5, s10, 0);
    }

    public static void addId(c cVar, int i10) {
        cVar.addInt(0, i10, 0);
    }

    public static void addSdkAdded(c cVar, short s10) {
        cVar.addShort(2, s10, 0);
    }

    public static void addWidth(c cVar, short s10) {
        cVar.addShort(4, s10, 0);
    }

    public static int createCodepointsVector(c cVar, int[] iArr) {
        cVar.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            cVar.addInt(iArr[length]);
        }
        return cVar.endVector();
    }

    public static int createMetadataItem(c cVar, int i10, boolean z10, short s10, short s11, short s12, short s13, int i11) {
        cVar.startTable(7);
        addCodepoints(cVar, i11);
        addId(cVar, i10);
        addHeight(cVar, s13);
        addWidth(cVar, s12);
        addCompatAdded(cVar, s11);
        addSdkAdded(cVar, s10);
        addEmojiStyle(cVar, z10);
        return endMetadataItem(cVar);
    }

    public static int endMetadataItem(c cVar) {
        return cVar.endTable();
    }

    public static e getRootAsMetadataItem(ByteBuffer byteBuffer) {
        return getRootAsMetadataItem(byteBuffer, new e());
    }

    public static void startCodepointsVector(c cVar, int i10) {
        cVar.startVector(4, i10, 4);
    }

    public static void startMetadataItem(c cVar) {
        cVar.startTable(7);
    }

    public e __assign(int i10, ByteBuffer byteBuffer) {
        __init(i10, byteBuffer);
        return this;
    }

    public void __init(int i10, ByteBuffer byteBuffer) {
        b(i10, byteBuffer);
    }

    public int codepoints(int i10) {
        int iA = a(16);
        if (iA == 0) {
            return 0;
        }
        return this.f86322b.getInt((i10 * 4) + c(iA));
    }

    public ByteBuffer codepointsAsByteBuffer() {
        return d(16, 4);
    }

    public ByteBuffer codepointsInByteBuffer(ByteBuffer byteBuffer) {
        int iA = a(16);
        if (iA == 0) {
            return null;
        }
        int iC = c(iA);
        byteBuffer.rewind();
        byteBuffer.limit((e(iA) * 4) + iC);
        byteBuffer.position(iC);
        return byteBuffer;
    }

    public int codepointsLength() {
        int iA = a(16);
        if (iA != 0) {
            return e(iA);
        }
        return 0;
    }

    public d codepointsVector() {
        return codepointsVector(new d());
    }

    public short compatAdded() {
        int iA = a(10);
        if (iA != 0) {
            return this.f86322b.getShort(iA + this.f86321a);
        }
        return (short) 0;
    }

    public boolean emojiStyle() {
        int iA = a(6);
        return (iA == 0 || this.f86322b.get(iA + this.f86321a) == 0) ? false : true;
    }

    public short height() {
        int iA = a(14);
        if (iA != 0) {
            return this.f86322b.getShort(iA + this.f86321a);
        }
        return (short) 0;
    }

    public int id() {
        int iA = a(4);
        if (iA != 0) {
            return this.f86322b.getInt(iA + this.f86321a);
        }
        return 0;
    }

    public short sdkAdded() {
        int iA = a(8);
        if (iA != 0) {
            return this.f86322b.getShort(iA + this.f86321a);
        }
        return (short) 0;
    }

    public short width() {
        int iA = a(12);
        if (iA != 0) {
            return this.f86322b.getShort(iA + this.f86321a);
        }
        return (short) 0;
    }

    public static e getRootAsMetadataItem(ByteBuffer byteBuffer, e eVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return eVar.__assign(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
    }

    public d codepointsVector(d dVar) {
        int iA = a(16);
        if (iA != 0) {
            return dVar.__assign(c(iA), this.f86322b);
        }
        return null;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends t4.a {
        public a __assign(int i10, int i11, ByteBuffer byteBuffer) {
            a(i10, i11, byteBuffer);
            return this;
        }

        public e get(e eVar, int i10) {
            int i11 = (i10 * this.f86302c) + this.f86300a;
            return eVar.__assign(this.f86303d.getInt(i11) + i11, this.f86303d);
        }

        public e get(int i10) {
            return get(new e(), i10);
        }
    }
}
