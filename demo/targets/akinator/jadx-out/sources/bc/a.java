package bc;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f9022a;

    static {
        byte[] bArr = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        f9022a = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            f9022a[c10] = (byte) (c10 - '0');
        }
        for (char c11 = 'A'; c11 <= 'F'; c11 = (char) (c11 + 1)) {
            f9022a[c11] = (byte) (c11 - '7');
        }
        for (char c12 = 'a'; c12 <= 'f'; c12 = (char) (c12 + 1)) {
            f9022a[c12] = (byte) (c12 - 'W');
        }
        f9022a[46] = -4;
    }

    public static byte a(int i10, int i11, byte[] bArr) {
        if (i10 < i11) {
            return bArr[i10];
        }
        return (byte) 0;
    }

    public static char b(int i10, char[] cArr, int i11) {
        if (i10 < i11) {
            return cArr[i10];
        }
        return (char) 0;
    }

    public static char c(CharSequence charSequence, int i10, int i11) {
        if (i10 < i11) {
            return charSequence.charAt(i10);
        }
        return (char) 0;
    }

    public static int d(int i10, int i11, int i12) {
        if ((((i10 - i12) - i11) | i11 | i12) >= 0) {
            return i12 + i11;
        }
        throw new IllegalArgumentException("offset < 0 or length > str.length");
    }

    public static void e(boolean z10, int i10, int i11, int i12, long j10) {
        if (z10 || i10 < i11) {
            throw new NumberFormatException("illegal syntax");
        }
        if (j10 <= -2147483648L || j10 > 2147483647L || i12 > 646456993) {
            throw new NumberFormatException("value exceeds limits");
        }
    }

    public static int f(char c10) {
        if (c10 < 128) {
            return f9022a[c10];
        }
        return -1;
    }
}
