package com.bytedance.sdk.component.jd.jpo.jpo.jpo;

import com.bytedance.sdk.component.jd.jpo.prr;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends prr {

    /* renamed from: jd, reason: collision with root package name */
    InputStream f18585jd;
    HttpURLConnection jpo;

    public zz(HttpURLConnection httpURLConnection) throws IOException {
        this.jpo = httpURLConnection;
        this.f18585jd = new qk(httpURLConnection.getInputStream(), httpURLConnection);
    }

    @Override // com.bytedance.sdk.component.jd.jpo.prr, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f18585jd.close();
            this.jpo.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.jd.jpo.prr
    public byte[] cm() throws IOException {
        try {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i10 = this.f18585jd.read(bArr);
                if (i10 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.bytedance.sdk.component.jd.jpo.prr
    public String jd() throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f18585jd));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = stringBuffer.toString();
                    close();
                    return string;
                }
                stringBuffer.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.jd.jpo.prr
    public long jpo() {
        try {
            return this.jpo.getContentLength();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // com.bytedance.sdk.component.jd.jpo.prr
    public com.bytedance.sdk.component.jd.jpo.zz my() {
        if (this.jpo.getContentType() != null) {
            return com.bytedance.sdk.component.jd.jpo.zz.jpo(this.jpo.getContentType());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.jd.jpo.prr
    public InputStream wqx() {
        return this.f18585jd;
    }

    public zz(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.jpo = httpURLConnection;
        this.f18585jd = new qk(inputStream, httpURLConnection);
    }
}
