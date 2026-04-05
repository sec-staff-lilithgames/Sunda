package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i10, byte[] bArr, long j10, long j11) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j12 = blockSize;
            long j13 = j11 / j12;
            int i11 = (int) (j11 % j12);
            cipher.init(i10, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j10, j13)));
            if (i11 != 0) {
                updateInPlace(new byte[i11], 0, i11);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private byte[] getInitializationVector(long j10, long j11) {
        return ByteBuffer.allocate(16).putLong(j10).putLong(j11).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        try {
            return this.cipher.update(bArr, i10, i11, bArr2, i12);
        } catch (ShortBufferException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void update(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        do {
            int i16 = this.pendingXorBytes;
            if (i16 <= 0) {
                int iNonFlushingUpdate = nonFlushingUpdate(bArr, i13, i14, bArr2, i15);
                if (i14 == iNonFlushingUpdate) {
                    return;
                }
                int i17 = i14 - iNonFlushingUpdate;
                int i18 = 0;
                Assertions.checkState(i17 < this.blockSize);
                int i19 = i15 + iNonFlushingUpdate;
                int i20 = this.blockSize - i17;
                this.pendingXorBytes = i20;
                Assertions.checkState(nonFlushingUpdate(this.zerosBlock, 0, i20, this.flushedBlock, 0) == this.blockSize);
                while (i18 < i17) {
                    bArr2[i19] = this.flushedBlock[i18];
                    i18++;
                    i19++;
                }
                return;
            }
            bArr2[i15] = (byte) (bArr[i13] ^ this.flushedBlock[this.blockSize - i16]);
            i15++;
            i13++;
            this.pendingXorBytes = i16 - 1;
            i14--;
        } while (i14 != 0);
    }

    public void updateInPlace(byte[] bArr, int i10, int i11) {
        update(bArr, i10, i11, bArr, i10);
    }
}
