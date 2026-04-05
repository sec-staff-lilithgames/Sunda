package com.applovin.shadow.okhttp3.internal.http;

import a.b;
import com.applovin.shadow.okhttp3.Protocol;
import com.applovin.shadow.okhttp3.Response;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final StatusLine get(Response response) {
            e0.checkNotNullParameter(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String statusLine) throws NumberFormatException, IOException {
            Protocol protocol;
            int i10;
            String strSubstring;
            e0.checkNotNullParameter(statusLine, "statusLine");
            if (k0.startsWith$default(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!k0.startsWith$default(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException(b.k("Unexpected status line: ", statusLine));
                }
                protocol = Protocol.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i10, String message) {
        e0.checkNotNullParameter(protocol, "protocol");
        e0.checkNotNullParameter(message, "message");
        this.protocol = protocol;
        this.code = i10;
        this.message = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.code);
        sb2.append(' ');
        sb2.append(this.message);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
