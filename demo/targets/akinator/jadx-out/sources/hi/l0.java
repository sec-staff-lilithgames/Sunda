package hi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final File f58841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58843c;

    public l0(File file, String str, String str2) {
        this.f58842b = str;
        this.f58843c = str2;
        this.f58841a = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // hi.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ki.f2.d.b asFilePayload() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.InputStream r2 = r7.getStream()     // Catch: java.io.IOException -> L20
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L22
            r3.<init>()     // Catch: java.lang.Throwable -> L22
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L24
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L26
            r4.close()     // Catch: java.lang.Throwable -> L24
            r3.close()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L20
            r2.close()     // Catch: java.io.IOException -> L20
        L20:
            r0 = r1
            goto L61
        L22:
            r0 = move-exception
            goto L56
        L24:
            r0 = move-exception
            goto L4d
        L26:
            int r5 = r2.read(r0)     // Catch: java.lang.Throwable -> L31
            if (r5 <= 0) goto L33
            r6 = 0
            r4.write(r0, r6, r5)     // Catch: java.lang.Throwable -> L31
            goto L26
        L31:
            r0 = move-exception
            goto L44
        L33:
            r4.finish()     // Catch: java.lang.Throwable -> L31
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L31
            r4.close()     // Catch: java.lang.Throwable -> L24
            r3.close()     // Catch: java.lang.Throwable -> L22
            r2.close()     // Catch: java.io.IOException -> L20
            goto L61
        L44:
            r4.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.lang.Throwable -> L24
        L4c:
            throw r0     // Catch: java.lang.Throwable -> L24
        L4d:
            r3.close()     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r3 = move-exception
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L22
        L55:
            throw r0     // Catch: java.lang.Throwable -> L22
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.io.IOException -> L20
        L60:
            throw r0     // Catch: java.io.IOException -> L20
        L61:
            if (r0 == 0) goto L75
            ki.f2$d$b$a r1 = ki.f2.d.b.builder()
            ki.f2$d$b$a r0 = r1.setContents(r0)
            java.lang.String r1 = r7.f58842b
            ki.f2$d$b$a r0 = r0.setFilename(r1)
            ki.f2$d$b r1 = r0.build()
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.l0.asFilePayload():ki.f2$d$b");
    }

    @Override // hi.q0
    public String getReportsEndpointFilename() {
        return this.f58843c;
    }

    @Override // hi.q0
    public InputStream getStream() {
        File file = this.f58841a;
        if (file.exists() && file.isFile()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
