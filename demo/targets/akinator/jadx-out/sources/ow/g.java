package ow;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import kotlin.jvm.internal.e0;
import p0.o2;
import pw.g;
import pw.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f79921a = new g();

    public final String acceptHeader(String key) {
        e0.checkNotNullParameter(key, "key");
        return l.f81911f.encodeUtf8(key + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
    }

    public final String closeCodeExceptionMessage(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return a.b.e(i10, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
            return null;
        }
        return o2.k(i10, "Code ", " is reserved and may not be used.");
    }

    public final void toggleMask(g.a cursor, byte[] key) {
        e0.checkNotNullParameter(cursor, "cursor");
        e0.checkNotNullParameter(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.f81902g;
            int i11 = cursor.f81903h;
            int i12 = cursor.f81904i;
            if (bArr != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr[i11] = (byte) (bArr[i11] ^ key[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (cursor.next() != -1);
    }

    public final void validateCloseCode(int i10) {
        String strCloseCodeExceptionMessage = closeCodeExceptionMessage(i10);
        if (strCloseCodeExceptionMessage == null) {
            return;
        }
        e0.checkNotNull(strCloseCodeExceptionMessage);
        throw new IllegalArgumentException(strCloseCodeExceptionMessage.toString());
    }
}
