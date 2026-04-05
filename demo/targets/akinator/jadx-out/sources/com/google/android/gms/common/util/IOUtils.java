package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Preconditions;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public final class IOUtils {
    private IOUtils() {
    }

    public static void closeQuietly(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public static byte[] readInputStreamFully(InputStream inputStream) throws IOException {
        return readInputStreamFully(inputStream, true);
    }

    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    public static long copyStream(InputStream inputStream, OutputStream outputStream, boolean z10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr, 0, i10);
                if (i11 == -1) {
                    break;
                }
                j10 += i11;
                outputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                if (z10) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th2;
            }
        }
        if (z10) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j10;
    }

    @Deprecated
    public static byte[] readInputStreamFully(InputStream inputStream, boolean z10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z10, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
