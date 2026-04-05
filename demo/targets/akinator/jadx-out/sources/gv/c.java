package gv;

import com.applovin.shadow.okio.Segment;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.e0;
import uu.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {
    public static final long copyTo(InputStream inputStream, OutputStream out, int i10) throws IOException {
        e0.checkNotNullParameter(inputStream, "<this>");
        e0.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j10 += i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Segment.SIZE;
        }
        return copyTo(inputStream, outputStream, i10);
    }

    public static final m0 iterator(BufferedInputStream bufferedInputStream) {
        e0.checkNotNullParameter(bufferedInputStream, "<this>");
        return new b(bufferedInputStream);
    }

    @tu.f
    public static final byte[] readBytes(InputStream inputStream, int i10) {
        e0.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i10, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Segment.SIZE;
        }
        return readBytes(inputStream, i10);
    }

    public static final byte[] readBytes(InputStream inputStream) {
        e0.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(Segment.SIZE, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
