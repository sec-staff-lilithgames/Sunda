package com.applovin.shadow.okhttp3.internal.ws;

import a.b;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String key) {
        e0.checkNotNullParameter(key, "key");
        return ByteString.Companion.encodeUtf8(key + ACCEPT_MAGIC).sha1().base64();
    }

    public final String closeCodeExceptionMessage(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return b.e(i10, "Code must be in range [1000,5000): ");
        }
        if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
            return null;
        }
        return o2.k(i10, "Code ", " is reserved and may not be used.");
    }

    public final void toggleMask(Buffer.UnsafeCursor cursor, byte[] key) {
        e0.checkNotNullParameter(cursor, "cursor");
        e0.checkNotNullParameter(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.data;
            int i11 = cursor.start;
            int i12 = cursor.end;
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
