package t4;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f86304a;

    /* renamed from: b, reason: collision with root package name */
    public int f86305b;

    /* renamed from: c, reason: collision with root package name */
    public int f86306c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f86307d;

    /* renamed from: e, reason: collision with root package name */
    public int f86308e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86309f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f86310g;

    /* renamed from: h, reason: collision with root package name */
    public int f86311h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f86312i;

    /* renamed from: j, reason: collision with root package name */
    public int f86313j;

    /* renamed from: k, reason: collision with root package name */
    public int f86314k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f86315l;

    /* renamed from: m, reason: collision with root package name */
    public b f86316m;

    /* renamed from: n, reason: collision with root package name */
    public final i f86317n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        public final ByteBuffer f86318b;

        public a(ByteBuffer byteBuffer) {
            this.f86318b = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f86318b.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: t4.c$c, reason: collision with other inner class name */
    public static final class C0783c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0783c f86319a = new C0783c();

        @Override // t4.c.b
        public ByteBuffer newByteBuffer(int i10) {
            return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public c(int i10, b bVar) {
        this(i10, bVar, null, i.getDefault());
    }

    public static boolean isFieldPresent(h hVar, int i10) {
        return hVar.a(i10) != 0;
    }

    public void Nested(int i10) {
        if (i10 != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public final void a(int i10, String str, boolean z10) {
        prep(this.f86306c, (z10 ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i11 = 3; i11 >= 0; i11--) {
            addByte((byte) str.charAt(i11));
        }
        b(i10, z10);
    }

    public void addBoolean(boolean z10) {
        prep(1, 0);
        putBoolean(z10);
    }

    public void addByte(byte b10) {
        prep(1, 0);
        putByte(b10);
    }

    public void addDouble(double d10) {
        prep(8, 0);
        putDouble(d10);
    }

    public void addFloat(float f10) {
        prep(4, 0);
        putFloat(f10);
    }

    public void addInt(int i10) {
        prep(4, 0);
        putInt(i10);
    }

    public void addLong(long j10) {
        prep(8, 0);
        putLong(j10);
    }

    public void addOffset(int i10) {
        prep(4, 0);
        putInt((offset() - i10) + 4);
    }

    public void addShort(short s10) {
        prep(2, 0);
        putShort(s10);
    }

    public void addStruct(int i10, int i11, int i12) {
        if (i11 != i12) {
            Nested(i11);
            slot(i10);
        }
    }

    public final void b(int i10, boolean z10) {
        prep(this.f86306c, (z10 ? 4 : 0) + 4);
        addOffset(i10);
        if (z10) {
            addInt(this.f86304a.capacity() - this.f86305b);
        }
        this.f86304a.position(this.f86305b);
        this.f86310g = true;
    }

    public void clear() {
        this.f86305b = this.f86304a.capacity();
        this.f86304a.clear();
        this.f86306c = 1;
        while (true) {
            int i10 = this.f86308e;
            if (i10 <= 0) {
                this.f86308e = 0;
                this.f86309f = false;
                this.f86310g = false;
                this.f86311h = 0;
                this.f86313j = 0;
                this.f86314k = 0;
                return;
            }
            int[] iArr = this.f86307d;
            int i11 = i10 - 1;
            this.f86308e = i11;
            iArr[i11] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f86304a;
        int i10 = this.f86305b - length;
        this.f86305b = i10;
        byteBuffer.position(i10);
        this.f86304a.put(bArr);
        return endVector();
    }

    public <T extends h> int createSortedVectorOfTables(T t10, int[] iArr) {
        ByteBuffer byteBuffer = this.f86304a;
        t10.getClass();
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        Arrays.sort(numArr, new g(t10, byteBuffer));
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = numArr[i11].intValue();
        }
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        i iVar = this.f86317n;
        int iEncodedLength = iVar.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, iEncodedLength, 1);
        ByteBuffer byteBuffer = this.f86304a;
        int i10 = this.f86305b - iEncodedLength;
        this.f86305b = i10;
        byteBuffer.position(i10);
        iVar.encodeUtf8(charSequence, this.f86304a);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i10, int i11, int i12) {
        int i13 = i10 * i11;
        startVector(i10, i11, i12);
        ByteBuffer byteBuffer = this.f86304a;
        int i14 = this.f86305b - i13;
        this.f86305b = i14;
        byteBuffer.position(i14);
        ByteBuffer byteBufferOrder = this.f86304a.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i13);
        return byteBufferOrder;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.f86304a;
    }

    public int endTable() {
        int i10;
        if (this.f86307d == null || !this.f86309f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int iOffset = offset();
        int i11 = this.f86308e - 1;
        while (i11 >= 0 && this.f86307d[i11] == 0) {
            i11--;
        }
        for (int i12 = i11; i12 >= 0; i12--) {
            int i13 = this.f86307d[i12];
            addShort((short) (i13 != 0 ? iOffset - i13 : 0));
        }
        addShort((short) (iOffset - this.f86311h));
        addShort((short) ((i11 + 3) * 2));
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= this.f86313j) {
                i10 = 0;
                break;
            }
            int iCapacity = this.f86304a.capacity() - this.f86312i[i14];
            int i15 = this.f86305b;
            short s10 = this.f86304a.getShort(iCapacity);
            if (s10 == this.f86304a.getShort(i15)) {
                for (int i16 = 2; i16 < s10; i16 += 2) {
                    if (this.f86304a.getShort(iCapacity + i16) != this.f86304a.getShort(i15 + i16)) {
                        break;
                    }
                }
                i10 = this.f86312i[i14];
                break loop2;
            }
            i14++;
        }
        if (i10 != 0) {
            int iCapacity2 = this.f86304a.capacity() - iOffset;
            this.f86305b = iCapacity2;
            this.f86304a.putInt(iCapacity2, i10 - iOffset);
        } else {
            int i17 = this.f86313j;
            int[] iArr = this.f86312i;
            if (i17 == iArr.length) {
                this.f86312i = Arrays.copyOf(iArr, i17 * 2);
            }
            int[] iArr2 = this.f86312i;
            int i18 = this.f86313j;
            this.f86313j = i18 + 1;
            iArr2[i18] = offset();
            ByteBuffer byteBuffer = this.f86304a;
            byteBuffer.putInt(byteBuffer.capacity() - iOffset, offset() - iOffset);
        }
        this.f86309f = false;
        return iOffset;
    }

    public int endVector() {
        if (!this.f86309f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f86309f = false;
        putInt(this.f86314k);
        return offset();
    }

    public void finish(int i10) {
        b(i10, false);
    }

    public void finishSizePrefixed(int i10) {
        b(i10, true);
    }

    public void finished() {
        if (!this.f86310g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public c forceDefaults(boolean z10) {
        this.f86315l = z10;
        return this;
    }

    public c init(ByteBuffer byteBuffer, b bVar) {
        this.f86316m = bVar;
        this.f86304a = byteBuffer;
        byteBuffer.clear();
        this.f86304a.order(ByteOrder.LITTLE_ENDIAN);
        this.f86306c = 1;
        this.f86305b = this.f86304a.capacity();
        this.f86308e = 0;
        this.f86309f = false;
        this.f86310g = false;
        this.f86311h = 0;
        this.f86313j = 0;
        this.f86314k = 0;
        return this;
    }

    public void notNested() {
        if (this.f86309f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.f86304a.capacity() - this.f86305b;
    }

    public void pad(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBuffer = this.f86304a;
            int i12 = this.f86305b - 1;
            this.f86305b = i12;
            byteBuffer.put(i12, (byte) 0);
        }
    }

    public void prep(int i10, int i11) {
        if (i10 > this.f86306c) {
            this.f86306c = i10;
        }
        int i12 = ((~((this.f86304a.capacity() - this.f86305b) + i11)) + 1) & (i10 - 1);
        while (this.f86305b < i12 + i10 + i11) {
            int iCapacity = this.f86304a.capacity();
            ByteBuffer byteBuffer = this.f86304a;
            b bVar = this.f86316m;
            int iCapacity2 = byteBuffer.capacity();
            if (((-1073741824) & iCapacity2) != 0) {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
            int i13 = iCapacity2 == 0 ? 1 : iCapacity2 << 1;
            byteBuffer.position(0);
            ByteBuffer byteBufferNewByteBuffer = bVar.newByteBuffer(i13);
            byteBufferNewByteBuffer.position(byteBufferNewByteBuffer.clear().capacity() - iCapacity2);
            byteBufferNewByteBuffer.put(byteBuffer);
            this.f86304a = byteBufferNewByteBuffer;
            if (byteBuffer != byteBufferNewByteBuffer) {
                this.f86316m.releaseByteBuffer(byteBuffer);
            }
            this.f86305b = (this.f86304a.capacity() - iCapacity) + this.f86305b;
        }
        pad(i12);
    }

    public void putBoolean(boolean z10) {
        ByteBuffer byteBuffer = this.f86304a;
        int i10 = this.f86305b - 1;
        this.f86305b = i10;
        byteBuffer.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b10) {
        ByteBuffer byteBuffer = this.f86304a;
        int i10 = this.f86305b - 1;
        this.f86305b = i10;
        byteBuffer.put(i10, b10);
    }

    public void putDouble(double d10) {
        ByteBuffer byteBuffer = this.f86304a;
        int i10 = this.f86305b - 8;
        this.f86305b = i10;
        byteBuffer.putDouble(i10, d10);
    }

    public void putFloat(float f10) {
        ByteBuffer byteBuffer = this.f86304a;
        int i10 = this.f86305b - 4;
        this.f86305b = i10;
        byteBuffer.putFloat(i10, f10);
    }

    public void putInt(int i10) {
        ByteBuffer byteBuffer = this.f86304a;
        int i11 = this.f86305b - 4;
        this.f86305b = i11;
        byteBuffer.putInt(i11, i10);
    }

    public void putLong(long j10) {
        ByteBuffer byteBuffer = this.f86304a;
        int i10 = this.f86305b - 8;
        this.f86305b = i10;
        byteBuffer.putLong(i10, j10);
    }

    public void putShort(short s10) {
        ByteBuffer byteBuffer = this.f86304a;
        int i10 = this.f86305b - 2;
        this.f86305b = i10;
        byteBuffer.putShort(i10, s10);
    }

    public void required(int i10, int i11) {
        int iCapacity = this.f86304a.capacity() - i10;
        if (this.f86304a.getShort((iCapacity - this.f86304a.getInt(iCapacity)) + i11) == 0) {
            throw new AssertionError(o2.k(i11, "FlatBuffers: field ", " must be set"));
        }
    }

    public byte[] sizedByteArray(int i10, int i11) {
        finished();
        byte[] bArr = new byte[i11];
        this.f86304a.position(i10);
        this.f86304a.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer byteBufferDuplicate = this.f86304a.duplicate();
        byteBufferDuplicate.position(this.f86305b);
        byteBufferDuplicate.limit(this.f86304a.capacity());
        return new a(byteBufferDuplicate);
    }

    public void slot(int i10) {
        this.f86307d[i10] = offset();
    }

    public void startTable(int i10) {
        notNested();
        int[] iArr = this.f86307d;
        if (iArr == null || iArr.length < i10) {
            this.f86307d = new int[i10];
        }
        this.f86308e = i10;
        Arrays.fill(this.f86307d, 0, i10, 0);
        this.f86309f = true;
        this.f86311h = offset();
    }

    public void startVector(int i10, int i11, int i12) {
        notNested();
        this.f86314k = i11;
        int i13 = i10 * i11;
        prep(4, i13);
        prep(i12, i13);
        this.f86309f = true;
    }

    public c(int i10, b bVar, ByteBuffer byteBuffer, i iVar) {
        this.f86306c = 1;
        this.f86307d = null;
        this.f86308e = 0;
        this.f86309f = false;
        this.f86310g = false;
        this.f86312i = new int[16];
        this.f86313j = 0;
        this.f86314k = 0;
        this.f86315l = false;
        i10 = i10 <= 0 ? 1 : i10;
        this.f86316m = bVar;
        if (byteBuffer != null) {
            this.f86304a = byteBuffer;
            byteBuffer.clear();
            this.f86304a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f86304a = bVar.newByteBuffer(i10);
        }
        this.f86317n = iVar;
        this.f86305b = this.f86304a.capacity();
    }

    public void addBoolean(int i10, boolean z10, boolean z11) {
        if (this.f86315l || z10 != z11) {
            addBoolean(z10);
            slot(i10);
        }
    }

    public void addByte(int i10, byte b10, int i11) {
        if (this.f86315l || b10 != i11) {
            addByte(b10);
            slot(i10);
        }
    }

    public void addDouble(int i10, double d10, double d11) {
        if (this.f86315l || d10 != d11) {
            addDouble(d10);
            slot(i10);
        }
    }

    public void addFloat(int i10, float f10, double d10) {
        if (this.f86315l || f10 != d10) {
            addFloat(f10);
            slot(i10);
        }
    }

    public void addInt(int i10, int i11, int i12) {
        if (this.f86315l || i11 != i12) {
            addInt(i11);
            slot(i10);
        }
    }

    public void addLong(int i10, long j10, long j11) {
        if (this.f86315l || j10 != j11) {
            addLong(j10);
            slot(i10);
        }
    }

    public void addShort(int i10, short s10, int i11) {
        if (this.f86315l || s10 != i11) {
            addShort(s10);
            slot(i10);
        }
    }

    public void finish(int i10, String str) {
        a(i10, str, false);
    }

    public void finishSizePrefixed(int i10, String str) {
        a(i10, str, true);
    }

    public void addOffset(int i10, int i11, int i12) {
        if (this.f86315l || i11 != i12) {
            addOffset(i11);
            slot(i10);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.f86305b, this.f86304a.capacity() - this.f86305b);
    }

    public int createByteVector(byte[] bArr, int i10, int i11) {
        startVector(1, i11, 1);
        ByteBuffer byteBuffer = this.f86304a;
        int i12 = this.f86305b - i11;
        this.f86305b = i12;
        byteBuffer.position(i12);
        this.f86304a.put(bArr, i10, i11);
        return endVector();
    }

    public int createString(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f86304a;
        int i10 = this.f86305b - iRemaining;
        this.f86305b = i10;
        byteBuffer2.position(i10);
        this.f86304a.put(byteBuffer);
        return endVector();
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f86304a;
        int i10 = this.f86305b - iRemaining;
        this.f86305b = i10;
        byteBuffer2.position(i10);
        this.f86304a.put(byteBuffer);
        return endVector();
    }

    public c(int i10) {
        this(i10, C0783c.f86319a, null, i.getDefault());
    }

    public c() {
        this(1024);
    }

    public c(ByteBuffer byteBuffer, b bVar) {
        this(byteBuffer.capacity(), bVar, byteBuffer, i.getDefault());
    }

    public c(ByteBuffer byteBuffer) {
        this(byteBuffer, new C0783c());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b {
        public abstract ByteBuffer newByteBuffer(int i10);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }
}
