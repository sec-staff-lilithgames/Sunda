package hi;

import android.os.Process;
import b0.e2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final String f58823b = j.sha1(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f58824c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f58825a;

    public h() {
        long jC = e2.c();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (jC / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b10 = bArrArray[0];
        byte b11 = bArrArray[1];
        byte b12 = bArrArray[2];
        byte b13 = bArrArray[3];
        byte[] bArrA = a(jC % 1000);
        byte b14 = bArrA[0];
        byte b15 = bArrA[1];
        byte[] bArrA2 = a(f58824c.incrementAndGet());
        byte b16 = bArrA2[0];
        byte b17 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        String strHexify = j.hexify(new byte[]{b10, b11, b12, b13, b14, b15, b16, b17, bArrA3[0], bArrA3[1]});
        Locale locale = Locale.US;
        this.f58825a = String.format(locale, "%s%s%s%s", strHexify.substring(0, 12), strHexify.substring(12, 16), strHexify.subSequence(16, 20), f58823b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j10);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public String getSessionId() {
        return this.f58825a;
    }

    public String toString() {
        return this.f58825a;
    }
}
