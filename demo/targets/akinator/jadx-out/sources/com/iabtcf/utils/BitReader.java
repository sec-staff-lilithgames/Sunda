package com.iabtcf.utils;

import com.iabtcf.exceptions.ByteParseException;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BitReader {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] buffer;
    final LengthOffsetCache cache;

    /* renamed from: is, reason: collision with root package name */
    private final InputStream f31531is;
    private int isrpos;

    public BitReader(InputStream inputStream) {
        this.buffer = new byte[4096];
        this.f31531is = inputStream;
        this.isrpos = 0;
        this.cache = new LengthOffsetCache(this);
    }

    private void ensureCapacity(int i10) {
        byte[] bArr = this.buffer;
        if (bArr.length >= i10) {
            return;
        }
        byte[] bArr2 = new byte[i10 * 2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.buffer = bArr2;
    }

    private boolean ensureReadable(int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.isrpos;
        int i14 = i12 - i13;
        if (i12 <= i13) {
            return true;
        }
        if (this.f31531is == null) {
            throw new ByteParseException(String.format("read %d bytes at index %d out of bounds for buffer length %d", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.buffer.length)));
        }
        ensureCapacity(i12);
        while (i14 > 0) {
            try {
                int i15 = this.f31531is.read(this.buffer, this.isrpos, i14);
                if (i15 == -1) {
                    return false;
                }
                this.isrpos += i15;
                i14 -= i15;
            } catch (IOException e10) {
                throw new ByteParseException(String.format("error decoding at offset %d length %d", Integer.valueOf(i10), Integer.valueOf(i11)), e10);
            }
        }
        return true;
    }

    private byte readByteBits(int i10, int i11) throws IOException {
        int i12 = i10 >>> 3;
        int i13 = i10 % 8;
        int i14 = 8 - i13;
        if (i14 >= i11) {
            ensureReadable(i12, 1);
            return unsafeReadMsb(this.buffer[i12], i13, i11);
        }
        ensureReadable(i12, 2);
        int i15 = i11 - i14;
        return (byte) (unsafeReadLsb(this.buffer[i12], i15, i14) | unsafeReadMsb(this.buffer[i12 + 1], 0, i15));
    }

    private byte unsafeReadLsb(byte b10, int i10, int i11) {
        return i11 == 0 ? b10 : (byte) ((b10 & ((1 << i11) - 1)) << i10);
    }

    private byte unsafeReadMsb(byte b10, int i10, int i11) {
        if (i11 == 0) {
            return (byte) 0;
        }
        return (byte) ((b10 >>> ((8 - i11) - i10)) & ((1 << i11) - 1));
    }

    public BitSet readBitSet(int i10, int i11) {
        BitSet bitSet = new BitSet(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            if (readBits1(i10 + i12)) {
                bitSet.set(i12);
            }
        }
        return bitSet;
    }

    public boolean readBits1(FieldDefs fieldDefs) {
        return readBits1(fieldDefs.getOffset(this));
    }

    public int readBits12(FieldDefs fieldDefs) {
        return readBits12(fieldDefs.getOffset(this));
    }

    public int readBits16(FieldDefs fieldDefs) {
        return readBits16(fieldDefs.getOffset(this));
    }

    public byte readBits2(FieldDefs fieldDefs) {
        return readBits2(fieldDefs.getOffset(this));
    }

    public int readBits24(FieldDefs fieldDefs) {
        return readBits24(fieldDefs.getOffset(this));
    }

    public byte readBits3(FieldDefs fieldDefs) {
        return readBits3(fieldDefs.getOffset(this));
    }

    public long readBits36(FieldDefs fieldDefs) {
        return readBits36(fieldDefs.getOffset(this));
    }

    public byte readBits6(FieldDefs fieldDefs) {
        return readBits6(fieldDefs.getOffset(this));
    }

    public String readStr2(int i10) {
        return String.valueOf(new char[]{(char) (readBits6(i10) + 65), (char) (readBits6(i10 + 6) + 65)});
    }

    public boolean readBits1(int i10) throws IOException {
        int i11 = i10 >>> 3;
        ensureReadable(i11, 1);
        return ((this.buffer[i11] >>> (7 - (i10 % 8))) & 1) == 1;
    }

    public int readBits12(int i10) throws IOException {
        int iUnsafeReadLsb;
        byte bUnsafeReadMsb;
        int i11 = i10 >>> 3;
        int i12 = i10 % 8;
        int i13 = 8 - i12;
        if (i13 < 4) {
            ensureReadable(i11, 3);
            int iUnsafeReadLsb2 = (unsafeReadLsb(this.buffer[i11], i12, i13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
            byte[] bArr = this.buffer;
            int i14 = i12 - 4;
            iUnsafeReadLsb = iUnsafeReadLsb2 | ((bArr[i11 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i14);
            bUnsafeReadMsb = unsafeReadMsb(bArr[i11 + 2], 0, i14);
        } else {
            ensureReadable(i11, 2);
            iUnsafeReadLsb = (unsafeReadLsb(this.buffer[i11], i12, i13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
            bUnsafeReadMsb = unsafeReadMsb(this.buffer[i11 + 1], 0, i12 + 4);
        }
        return (bUnsafeReadMsb & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | iUnsafeReadLsb;
    }

    public int readBits16(int i10) throws IOException {
        int i11;
        byte bUnsafeReadMsb;
        int i12 = i10 >>> 3;
        int i13 = i10 % 8;
        int i14 = 8 - i13;
        if (i14 < 8) {
            ensureReadable(i12, 3);
            int iUnsafeReadLsb = (unsafeReadLsb(this.buffer[i12], i13, i14) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
            byte[] bArr = this.buffer;
            i11 = iUnsafeReadLsb | ((bArr[i12 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i13);
            bUnsafeReadMsb = unsafeReadMsb(bArr[i12 + 2], 0, i13);
        } else {
            ensureReadable(i12, 2);
            byte[] bArr2 = this.buffer;
            i11 = (bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
            bUnsafeReadMsb = bArr2[i12 + 1];
        }
        return (bUnsafeReadMsb & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i11;
    }

    public byte readBits2(int i10) {
        return readByteBits(i10, 2);
    }

    public int readBits24(int i10) throws IOException {
        int i11;
        byte bUnsafeReadMsb;
        int i12 = i10 >>> 3;
        int i13 = i10 % 8;
        int i14 = 8 - i13;
        if (i14 < 8) {
            ensureReadable(i12, 4);
            int iUnsafeReadLsb = (unsafeReadLsb(this.buffer[i12], i13, i14) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
            byte[] bArr = this.buffer;
            i11 = iUnsafeReadLsb | ((bArr[i12 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << (i13 + 8)) | ((bArr[i12 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i13);
            bUnsafeReadMsb = unsafeReadMsb(bArr[i12 + 3], 0, i13);
        } else {
            ensureReadable(i12, 3);
            byte[] bArr2 = this.buffer;
            i11 = ((bArr2[i12 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
            bUnsafeReadMsb = bArr2[i12 + 2];
        }
        return (bUnsafeReadMsb & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i11;
    }

    public byte readBits3(int i10) {
        return readByteBits(i10, 3);
    }

    public long readBits36(int i10) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 % 8;
        if (8 - i12 < 4) {
            ensureReadable(i11, 6);
            long jUnsafeReadLsb = (unsafeReadLsb(this.buffer[i11], i12, r1) & 255) << 28;
            byte[] bArr = this.buffer;
            return (unsafeReadMsb(bArr[i11 + 5], 0, r13) & 255) | jUnsafeReadLsb | ((bArr[i11 + 1] & 255) << (i12 + 20)) | ((bArr[i11 + 2] & 255) << (i12 + 12)) | ((bArr[i11 + 3] & 255) << (i12 + 4)) | ((bArr[i11 + 4] & 255) << (i12 - 4));
        }
        ensureReadable(i11, 5);
        long jUnsafeReadLsb2 = (unsafeReadLsb(this.buffer[i11], i12, r1) & 255) << 28;
        byte[] bArr2 = this.buffer;
        return (unsafeReadMsb(bArr2[i11 + 4], 0, r13) & 255) | jUnsafeReadLsb2 | ((bArr2[i11 + 1] & 255) << (i12 + 20)) | ((bArr2[i11 + 2] & 255) << (i12 + 12)) | ((bArr2[i11 + 3] & 255) << (i12 + 4));
    }

    public byte readBits6(int i10) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 % 8;
        int i13 = 8 - i12;
        if (i13 >= 6) {
            ensureReadable(i11, 1);
            return unsafeReadMsb(this.buffer[i11], i12, 6);
        }
        ensureReadable(i11, 2);
        int i14 = 6 - i13;
        return (byte) (unsafeReadLsb(this.buffer[i11], i14, i13) | unsafeReadMsb(this.buffer[i11 + 1], 0, i14));
    }

    public String readStr2(FieldDefs fieldDefs) {
        return readStr2(fieldDefs.getOffset(this));
    }

    public BitReader(byte[] bArr) {
        this.buffer = bArr;
        this.isrpos = bArr.length;
        this.f31531is = null;
        this.cache = new LengthOffsetCache(this);
    }
}
