package dw;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.j0;
import sv.k0;
import xv.n0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final a f52930d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final n0 f52931a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52932b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52933c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final o get(v0 response) {
            e0.checkNotNullParameter(response, "response");
            return new o(response.protocol(), response.code(), response.message());
        }

        public final o parse(String statusLine) throws IOException {
            n0 n0Var;
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
                    n0Var = n0.f93759e;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    n0Var = n0.f93760f;
                }
            } else if (k0.startsWith$default(statusLine, "ICY ", false, 2, null)) {
                n0Var = n0.f93759e;
                i10 = 4;
            } else {
                if (!k0.startsWith$default(statusLine, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException(a.b.k("Unexpected status line: ", statusLine));
                }
                n0Var = n0.f93760f;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            String strSubstring2 = statusLine.substring(i10, i11);
            e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Integer intOrNull = j0.toIntOrNull(strSubstring2);
            if (intOrNull == null) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iIntValue = intOrNull.intValue();
            if (statusLine.length() <= i11) {
                strSubstring = "";
            } else {
                if (statusLine.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                strSubstring = statusLine.substring(i10 + 4);
                e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            return new o(n0Var, iIntValue, strSubstring);
        }
    }

    public o(n0 protocol, int i10, String message) {
        e0.checkNotNullParameter(protocol, "protocol");
        e0.checkNotNullParameter(message, "message");
        this.f52931a = protocol;
        this.f52932b = i10;
        this.f52933c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f52931a == n0.f93759e) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f52932b);
        sb2.append(' ');
        sb2.append(this.f52933c);
        return sb2.toString();
    }
}
