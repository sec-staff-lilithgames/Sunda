package com.google.android.play.core.splitinstall.internal;

import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class m0 {
    public static Pair a(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        b(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i11 = -1;
        } else {
            int i12 = iCapacity - 22;
            int iMin = Math.min(i12, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            for (int i13 = 0; i13 < iMin; i13++) {
                i11 = i12 - i13;
                if (byteBufferAllocate.getInt(i11) == 101010256 && ((char) byteBufferAllocate.getShort(i11 + 20)) == i13) {
                    break;
                }
            }
            i11 = -1;
        }
        if (i11 == -1) {
            return null;
        }
        byteBufferAllocate.position(i11);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i11));
    }

    public static void b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static long zza(ByteBuffer byteBuffer) {
        b(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
    }

    public static long zzb(ByteBuffer byteBuffer) {
        b(byteBuffer);
        return byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L;
    }

    public static void zzd(ByteBuffer byteBuffer, long j10) {
        b(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j10 < 0 || j10 > 4294967295L) {
            throw new IllegalArgumentException(o2.m(j10, "uint32 value of out range: "));
        }
        byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j10);
    }
}
