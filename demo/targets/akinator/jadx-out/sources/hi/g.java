package hi;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f58812a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58813b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58814c;

    public g(String str, String str2, byte[] bArr) {
        this.f58813b = str;
        this.f58814c = str2;
        this.f58812a = bArr;
    }

    @Override // hi.q0
    public f2.d.b asFilePayload() throws IOException {
        byte[] byteArray;
        byte[] bArr = this.f58812a;
        if (bArr == null || bArr.length == 0) {
            byteArray = null;
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        if (byteArray == null) {
            return null;
        }
        return f2.d.b.builder().setContents(byteArray).setFilename(this.f58813b).build();
    }

    @Override // hi.q0
    public String getReportsEndpointFilename() {
        return this.f58814c;
    }

    @Override // hi.q0
    public InputStream getStream() {
        byte[] bArr = this.f58812a;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }
}
