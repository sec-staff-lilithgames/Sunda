package bs;

import com.unity3d.services.core.network.model.HttpRequest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f10041a;

    /* renamed from: b, reason: collision with root package name */
    public String f10042b;

    /* renamed from: c, reason: collision with root package name */
    public int f10043c = -1;

    public b build() {
        if (this.f10041a == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f10042b != null) {
            return new b(this);
        }
        throw new IllegalStateException("host == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01bc, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0101, code lost:
    
        r2 = null;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013a, code lost:
    
        if (r11 == 16) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x013c, code lost:
    
        if (r12 != (-1)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013f, code lost:
    
        r2 = r11 - r12;
        java.lang.System.arraycopy(r9, r12, r9, 16 - r2, r2);
        r3 = 0;
        java.util.Arrays.fill(r9, r12, (16 - r11) + r12, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x014f, code lost:
    
        r2 = java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0101 A[EDGE_INSN: B:189:0x0101->B:78:0x0101 BREAK  A[LOOP:7: B:50:0x00b7->B:75:0x00f4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f4 A[LOOP:7: B:50:0x00b7->B:75:0x00f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bs.a host(java.lang.String r18) throws java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.a.host(java.lang.String):bs.a");
    }

    public a port(int i10) {
        if (i10 <= 0 || i10 > 65535) {
            throw new IllegalArgumentException(a.b.e(i10, "unexpected port: "));
        }
        this.f10043c = i10;
        return this;
    }

    public a scheme(String str) {
        if (str == null) {
            throw new IllegalArgumentException("scheme == null");
        }
        if (str.equalsIgnoreCase("http")) {
            this.f10041a = "http";
            return this;
        }
        if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str));
        }
        this.f10041a = HttpRequest.DEFAULT_SCHEME;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10041a);
        sb2.append("://");
        if (this.f10042b.indexOf(58) != -1) {
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.f10042b);
            sb2.append(AbstractJsonLexerKt.END_LIST);
        } else {
            sb2.append(this.f10042b);
        }
        int iDefaultPort = this.f10043c;
        if (iDefaultPort == -1) {
            iDefaultPort = b.defaultPort(this.f10041a);
        }
        if (iDefaultPort != b.defaultPort(this.f10041a)) {
            sb2.append(AbstractJsonLexerKt.COLON);
            sb2.append(iDefaultPort);
        }
        return sb2.toString();
    }
}
