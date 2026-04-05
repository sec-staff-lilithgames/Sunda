package zr;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f98514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98515b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98516c;

    public q(p pVar, int i10, String str) {
        this.f98514a = pVar;
        this.f98515b = i10;
        this.f98516c = str;
    }

    public static q parse(String str) throws NumberFormatException, IOException {
        int i10;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        p pVar = p.HTTP_1_0;
        if (zStartsWith) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                pVar = p.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i12 = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i10 + 4);
            }
            return new q(pVar, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f98514a == p.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f98515b);
        String str = this.f98516c;
        if (str != null) {
            sb2.append(' ');
            sb2.append(str);
        }
        return sb2.toString();
    }
}
