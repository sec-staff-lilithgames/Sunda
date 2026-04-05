package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3271ic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f13146a;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f13147b;

    /* renamed from: c, reason: collision with root package name */
    private String f13148c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13149d;

    /* renamed from: e, reason: collision with root package name */
    private f f13150e;

    /* renamed from: f, reason: collision with root package name */
    private k f13151f;

    public i(String str, String str2, boolean z10) throws IOException {
        this.f13148c = str2;
        this.f13149d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f13146a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f13147b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f13147b.setDoOutput(true);
        this.f13147b.setDoInput(true);
        this.f13147b.setRequestMethod(C3271ic.f36944b);
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f13147b);
        }
        this.f13147b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z10) {
            this.f13150e = new f(this.f13147b.getOutputStream());
        } else {
            this.f13147b.setRequestProperty("Content-Encoding", "gzip");
            this.f13151f = new k(this.f13147b.getOutputStream());
        }
    }

    public final void a(String str, String str2) throws IOException {
        b(str, str2);
    }

    public final void b(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder("--");
        com.google.android.gms.internal.play_billing.a.B(sb2, this.f13146a, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.f13148c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f13149d) {
                this.f13151f.write(sb2.toString().getBytes());
            } else {
                this.f13150e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f13149d) {
                this.f13151f.write(bytes);
                this.f13151f.write("\r\n".getBytes());
            } else {
                this.f13150e.write(bytes);
                this.f13150e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws Throwable {
        StringBuilder sb2 = new StringBuilder("--");
        com.google.android.gms.internal.play_billing.a.B(sb2, this.f13146a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f13149d) {
            this.f13151f.write(sb2.toString().getBytes());
        } else {
            this.f13150e.write(sb2.toString().getBytes());
        }
        if (this.f13149d) {
            com.apm.insight.l.f.a(this.f13151f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f13150e, fileArr);
        }
        if (this.f13149d) {
            this.f13151f.write("\r\n".getBytes());
        } else {
            this.f13150e.write("\r\n".getBytes());
            this.f13150e.flush();
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder("--");
        com.google.android.gms.internal.play_billing.a.B(sb2, this.f13146a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f13149d) {
            this.f13151f.write(sb2.toString().getBytes());
        } else {
            this.f13150e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                break;
            } else if (this.f13149d) {
                this.f13151f.write(bArr, 0, i10);
            } else {
                this.f13150e.write(bArr, 0, i10);
            }
        }
        fileInputStream.close();
        if (this.f13149d) {
            this.f13151f.write("\r\n".getBytes());
        } else {
            this.f13150e.write("\r\n".getBytes());
            this.f13150e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f13146a + "--\r\n").getBytes();
        if (this.f13149d) {
            this.f13151f.write(bytes);
            this.f13151f.b();
            this.f13151f.a();
        } else {
            this.f13150e.write(bytes);
            this.f13150e.flush();
            this.f13150e.a();
        }
        int responseCode = this.f13147b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f13147b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f13147b.disconnect();
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            return sb2.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
