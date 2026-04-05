package ec;

import cc.r;
import com.inmobi.commons.core.configs.AdConfig;
import ic.m0;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import ub.a0;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final cc.h f54001a;

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f54002b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f54003c;

    /* renamed from: d, reason: collision with root package name */
    public int f54004d;

    /* renamed from: e, reason: collision with root package name */
    public int f54005e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f54006f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54007g;

    /* renamed from: h, reason: collision with root package name */
    public int f54008h;

    public a(cc.h hVar, InputStream inputStream) {
        this.f54007g = true;
        this.f54001a = hVar;
        this.f54002b = inputStream;
        this.f54003c = hVar.allocReadIOBuffer();
        this.f54004d = 0;
        this.f54005e = 0;
        this.f54006f = true;
    }

    public static void b(String str) throws CharConversionException {
        throw new CharConversionException(a.b.l("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    public static int c(zb.c cVar, byte b10) throws IOException {
        while (true) {
            int i10 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i10 != 32 && i10 != 13 && i10 != 10 && i10 != 9) {
                return i10;
            }
            if (!cVar.hasMoreBytes()) {
                return -1;
            }
            b10 = cVar.nextByte();
        }
    }

    public static zb.d d(zb.c cVar, String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!cVar.hasMoreBytes()) {
                return zb.d.f97748c;
            }
            if (cVar.nextByte() != str.charAt(i10)) {
                return zb.d.f97747b;
            }
        }
        return zb.d.f97749e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r2 != 125) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if ((r5.hasMoreBytes() ? c(r5, r5.nextByte()) : -1) < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a6, code lost:
    
        if (r2 >= 48) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static zb.d hasJSONFormat(zb.c r5) throws java.io.IOException {
        /*
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L8
            goto La1
        L8:
            byte r0 = r5.nextByte()
            r1 = -17
            if (r0 != r1) goto L40
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L18
            goto La1
        L18:
            byte r0 = r5.nextByte()
            r1 = -69
            if (r0 == r1) goto L22
            goto Lcc
        L22:
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L2a
            goto La1
        L2a:
            byte r0 = r5.nextByte()
            r1 = -65
            if (r0 == r1) goto L34
            goto Lcc
        L34:
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L3c
            goto La1
        L3c:
            byte r0 = r5.nextByte()
        L40:
            int r0 = c(r5, r0)
            if (r0 >= 0) goto L47
            goto La1
        L47:
            r1 = 123(0x7b, float:1.72E-43)
            r2 = -1
            r3 = 34
            if (r0 != r1) goto L67
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L55
            goto L5d
        L55:
            byte r0 = r5.nextByte()
            int r2 = c(r5, r0)
        L5d:
            if (r2 >= 0) goto L60
            goto La1
        L60:
            if (r2 == r3) goto L7d
            r5 = 125(0x7d, float:1.75E-43)
            if (r2 != r5) goto Lcc
            goto L7d
        L67:
            r1 = 91
            if (r0 != r1) goto L80
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L72
            goto L7a
        L72:
            byte r0 = r5.nextByte()
            int r2 = c(r5, r0)
        L7a:
            if (r2 >= 0) goto L7d
            goto La1
        L7d:
            zb.d r5 = zb.d.f97750f
            return r5
        L80:
            if (r0 != r3) goto L83
            goto La8
        L83:
            r1 = 48
            r3 = 57
            if (r0 > r3) goto L8c
            if (r0 < r1) goto L8c
            goto La8
        L8c:
            r4 = 45
            if (r0 != r4) goto Lab
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L97
            goto L9f
        L97:
            byte r0 = r5.nextByte()
            int r2 = c(r5, r0)
        L9f:
            if (r2 >= 0) goto La4
        La1:
            zb.d r5 = zb.d.f97748c
            return r5
        La4:
            if (r2 > r3) goto Lcc
            if (r2 < r1) goto Lcc
        La8:
            zb.d r5 = zb.d.f97749e
            return r5
        Lab:
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto Lb6
            java.lang.String r0 = "ull"
            zb.d r5 = d(r5, r0)
            return r5
        Lb6:
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto Lc1
            java.lang.String r0 = "rue"
            zb.d r5 = d(r5, r0)
            return r5
        Lc1:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 != r1) goto Lcc
            java.lang.String r0 = "alse"
            zb.d r5 = d(r5, r0)
            return r5
        Lcc:
            zb.d r5 = zb.d.f97747b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.a.hasJSONFormat(zb.c):zb.d");
    }

    public static int skipUTF8BOM(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 239) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 != 187) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (unsignedByte3 == 191) {
            return dataInput.readUnsignedByte();
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
    }

    public final boolean a(int i10) throws IOException {
        int i11;
        int i12 = this.f54005e - this.f54004d;
        while (i12 < i10) {
            InputStream inputStream = this.f54002b;
            if (inputStream == null) {
                i11 = -1;
            } else {
                int i13 = this.f54005e;
                byte[] bArr = this.f54003c;
                i11 = inputStream.read(bArr, i13, bArr.length - i13);
            }
            if (i11 < 1) {
                return false;
            }
            this.f54005e += i11;
            i12 += i11;
        }
        return true;
    }

    public u constructParser(int i10, a0 a0Var, gc.b bVar, gc.e eVar, int i11) throws IOException {
        int i12 = this.f54004d;
        boolean zEnabledIn = ub.j.f88246g.enabledIn(i11);
        ub.i iVar = ub.i.f88232f;
        ub.i iVarDetectEncoding = zEnabledIn ? detectEncoding() : iVar;
        int i13 = this.f54004d - i12;
        if (iVarDetectEncoding == iVar && ub.j.f88243c.enabledIn(i11)) {
            return new m(this.f54001a, i10, this.f54002b, a0Var, bVar.makeChild(i11), this.f54003c, this.f54004d, this.f54005e, i13, this.f54006f);
        }
        return new j(this.f54001a, i10, constructReader(), a0Var, eVar.makeChild());
    }

    public Reader constructReader() throws IOException {
        ub.i encoding = this.f54001a.getEncoding();
        int iBits = encoding.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits != 32) {
                return (Reader) m0.throwInternalReturnAny();
            }
            int i10 = this.f54004d;
            int i11 = this.f54005e;
            cc.h hVar = this.f54001a;
            return new r(hVar, this.f54002b, this.f54003c, i10, i11, hVar.getEncoding().isBigEndian());
        }
        InputStream lVar = this.f54002b;
        if (lVar == null) {
            int i12 = this.f54005e - this.f54004d;
            byte[] bArr = this.f54003c;
            if (i12 <= 8192) {
                return new StringReader(new String(bArr, this.f54004d, i12, encoding.getJavaName()));
            }
            lVar = new ByteArrayInputStream(bArr, this.f54004d, this.f54005e);
        } else if (this.f54004d < this.f54005e) {
            lVar = new cc.l(this.f54001a, lVar, this.f54003c, this.f54004d, this.f54005e);
        }
        return new InputStreamReader(lVar, encoding.getJavaName());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ub.i detectEncoding() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.a.detectEncoding():ub.i");
    }

    public a(cc.h hVar, byte[] bArr, int i10, int i11) {
        this.f54007g = true;
        this.f54001a = hVar;
        this.f54002b = null;
        this.f54003c = bArr;
        this.f54004d = i10;
        this.f54005e = i10 + i11;
        this.f54006f = false;
    }
}
