package cr;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import br.h0;
import com.mbridge.msdk.foundation.download.Command;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class f {

    /* renamed from: k, reason: collision with root package name */
    public static final nr.c f50896k = new nr.c();

    /* renamed from: a, reason: collision with root package name */
    public final String f50897a;

    /* renamed from: b, reason: collision with root package name */
    public final i f50898b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f50899c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f50900d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f50901e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f50902f;

    /* renamed from: g, reason: collision with root package name */
    public final j f50903g;

    /* renamed from: h, reason: collision with root package name */
    public final h f50904h;

    /* renamed from: i, reason: collision with root package name */
    public mr.c f50905i;

    /* renamed from: j, reason: collision with root package name */
    public m f50906j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b implements j, k {
        @Override // cr.j
        public Object process(URLConnection uRLConnection) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream;
            InputStream inputStream2 = null;
            try {
                inputStream = uRLConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (Throwable th2) {
                    inputStream2 = inputStream;
                    th = th2;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
            try {
                t.write(inputStream, byteArrayOutputStream);
                Object objTransform = transform(byteArrayOutputStream.toByteArray());
                ir.q.flushSafely(byteArrayOutputStream);
                ir.q.closeSafely(byteArrayOutputStream);
                ir.q.closeSafely(inputStream);
                return objTransform;
            } catch (Throwable th4) {
                inputStream2 = inputStream;
                th = th4;
                ir.q.flushSafely(byteArrayOutputStream);
                ir.q.closeSafely(byteArrayOutputStream);
                ir.q.closeSafely(inputStream2);
                throw th;
            }
        }

        @Override // cr.k
        public abstract /* synthetic */ Object transform(Object obj);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c implements j, k {

        /* renamed from: a, reason: collision with root package name */
        public final Context f50915a;

        /* renamed from: b, reason: collision with root package name */
        public final File f50916b;

        public c(Context context, File file) {
            this.f50915a = context.getApplicationContext();
            this.f50916b = file;
        }

        @Override // cr.j
        public Object process(URLConnection uRLConnection) throws Throwable {
            FileOutputStream fileOutputStream;
            File externalDir = kr.b.getExternalDir(this.f50915a);
            if (externalDir == null) {
                throw new IllegalStateException("Can't get external dir");
            }
            File fileCreateTempFile = kr.b.createTempFile(externalDir);
            long contentLength = uRLConnection.getContentLength();
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = uRLConnection.getInputStream();
                try {
                    fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        long jWrite = t.write(inputStream2, fileOutputStream);
                        ir.q.flushSafely(fileOutputStream);
                        ir.q.closeSafely(fileOutputStream);
                        ir.q.closeSafely(inputStream2);
                        if (contentLength != jWrite) {
                            kr.b.deleteFile(fileCreateTempFile);
                            throw new IllegalStateException("The downloaded file size does not match the stated size");
                        }
                        File file = this.f50916b;
                        if (!kr.b.renameToSafely(fileCreateTempFile, file)) {
                            kr.b.deleteFile(fileCreateTempFile);
                            if (!kr.b.hasContent(file)) {
                                throw new IllegalStateException("Can't rename temp file");
                            }
                        }
                        return transform(file);
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        ir.q.flushSafely(fileOutputStream);
                        ir.q.closeSafely(fileOutputStream);
                        ir.q.closeSafely(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }

        @Override // cr.k
        public abstract /* synthetic */ Object transform(Object obj);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends b {
        @Override // cr.f.b, cr.k
        public String transform(byte[] bArr) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public f(String str, i iVar, Map<String, String> map, Map<String, String> map2, Integer num, Integer num2, l lVar, g gVar, j jVar, h hVar) {
        this.f50897a = str;
        this.f50898b = iVar;
        this.f50901e = num;
        this.f50902f = num2;
        this.f50903g = jVar;
        this.f50899c = map;
        this.f50900d = map2;
        this.f50904h = hVar;
    }

    public static String a(String str, Map map) {
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public final HttpURLConnection b(String str) throws Throwable {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setRequestMethod(this.f50898b.getNetworkName());
                for (Map.Entry entry : this.f50899c.entrySet()) {
                    httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                Integer num = this.f50901e;
                if (num != null && num.intValue() >= 0) {
                    httpURLConnection2.setConnectTimeout(num.intValue());
                }
                Integer num2 = this.f50902f;
                if (num2 != null && num2.intValue() >= 0) {
                    httpURLConnection2.setReadTimeout(num2.intValue());
                }
                switch (httpURLConnection2.getResponseCode()) {
                    case MRAID_ERROR_VALUE:
                    case INVALID_IFA_STATUS_VALUE:
                    case 303:
                    case MRAID_BRIDGE_ERROR_VALUE:
                    case 307:
                    case 308:
                        String headerField = httpURLConnection2.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField) && ir.q.isHttpUrl(headerField)) {
                            lr.a.disconnectSafely(httpURLConnection2);
                            return b(headerField);
                        }
                        return httpURLConnection2;
                    case AD_EXPIRED_VALUE:
                    case 306:
                    default:
                        return httpURLConnection2;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                lr.a.disconnectSafely(httpURLConnection);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void cancel() {
        mr.c cVar = this.f50905i;
        m mVar = this.f50906j;
        if (cVar != null && mVar != null) {
            cVar.cancel(mVar);
        }
        this.f50905i = null;
        this.f50906j = null;
    }

    public void send() {
        send(f50896k);
    }

    public void send(mr.c cVar) {
        cancel();
        this.f50905i = cVar;
        m mVar = new m(this);
        this.f50906j = mVar;
        try {
            cVar.execute(mVar);
        } catch (Throwable th2) {
            h0 h0VarCreate = h0.create(th2);
            h hVar = this.f50904h;
            if (hVar != null) {
                hVar.onError(h0VarCreate);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f50907a;

        /* renamed from: b, reason: collision with root package name */
        public final i f50908b;

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f50909c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f50910d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public Integer f50911e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f50912f;

        /* renamed from: g, reason: collision with root package name */
        public j f50913g;

        /* renamed from: h, reason: collision with root package name */
        public h f50914h;

        public a(String str, i iVar) {
            this.f50907a = str;
            this.f50908b = iVar;
        }

        public a addHeader(String str, String str2) {
            this.f50909c.put(str, str2);
            return this;
        }

        public a addQueryParameter(String str, String str2) {
            this.f50910d.put(str, str2);
            return this;
        }

        public f build() {
            return new f(this.f50907a, this.f50908b, this.f50909c, this.f50910d, this.f50911e, this.f50912f, null, null, this.f50913g, this.f50914h);
        }

        public f send() {
            f fVarBuild = build();
            fVarBuild.send();
            return fVarBuild;
        }

        public a setConnectTimeout(Integer num) {
            this.f50911e = num;
            return this;
        }

        public a setHeaders(Map<String, String> map) {
            t.set(this.f50909c, map);
            return this;
        }

        public a setListener(h hVar) {
            this.f50914h = hVar;
            return this;
        }

        public a setQueryParameters(Map<String, String> map) {
            t.set(this.f50910d, map);
            return this;
        }

        public a setReadTimeout(Integer num) {
            this.f50912f = num;
            return this;
        }

        public a setResponseTransformer(j jVar) {
            this.f50913g = jVar;
            return this;
        }

        public a setUserAgent(String str) {
            if (!TextUtils.isEmpty(str)) {
                addHeader(Command.HTTP_HEADER_USER_AGENT, str);
            }
            return this;
        }

        public a setRequestDataRetriever(g gVar) {
            return this;
        }

        public a setUrlConnectionProcessor(l lVar) {
            return this;
        }
    }
}
