package xv;

import aw.g;
import com.ironsource.C3271ic;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.g1;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.platform.c;
import pw.l;
import pw.n0;
import uu.c2;
import xv.f0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements Closeable, Flushable {

    /* renamed from: i, reason: collision with root package name */
    public static final b f93586i = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public final aw.g f93587b;

    /* renamed from: c, reason: collision with root package name */
    public int f93588c;

    /* renamed from: e, reason: collision with root package name */
    public int f93589e;

    /* renamed from: f, reason: collision with root package name */
    public int f93590f;

    /* renamed from: g, reason: collision with root package name */
    public int f93591g;

    /* renamed from: h, reason: collision with root package name */
    public int f93592h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends w0 {

        /* renamed from: e, reason: collision with root package name */
        public final g.d f93593e;

        /* renamed from: f, reason: collision with root package name */
        public final String f93594f;

        /* renamed from: g, reason: collision with root package name */
        public final String f93595g;

        /* renamed from: h, reason: collision with root package name */
        public final pw.k f93596h;

        public a(g.d snapshot, String str, String str2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(snapshot, "snapshot");
            this.f93593e = snapshot;
            this.f93594f = str;
            this.f93595g = str2;
            this.f93596h = pw.h0.buffer(new xv.d(snapshot.getSource(1), this));
        }

        @Override // xv.w0
        public long contentLength() {
            String str = this.f93595g;
            if (str != null) {
                return yv.h.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // xv.w0
        public j0 contentType() {
            String str = this.f93594f;
            if (str != null) {
                return j0.f93670e.parse(str);
            }
            return null;
        }

        public final g.d getSnapshot() {
            return this.f93593e;
        }

        @Override // xv.w0
        public pw.k source() {
            return this.f93596h;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public static Set a(f0 f0Var) {
            int size = f0Var.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (sv.k0.equals("Vary", f0Var.name(i10), true)) {
                    String strValue = f0Var.value(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(sv.k0.getCASE_INSENSITIVE_ORDER(g1.f71834a));
                    }
                    Iterator it = sv.n0.split$default((CharSequence) strValue, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(sv.n0.trim((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? c2.emptySet() : treeSet;
        }

        public final boolean hasVaryAll(v0 v0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(v0Var, "<this>");
            return a(v0Var.headers()).contains("*");
        }

        public final String key(g0 url) {
            kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
            return pw.l.f81911f.encodeUtf8(url.toString()).md5().hex();
        }

        public final int readInt$okhttp(pw.k source) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            try {
                long decimalLong = source.readDecimalLong();
                String utf8LineStrict = source.readUtf8LineStrict();
                if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.length() <= 0) {
                    return (int) decimalLong;
                }
                throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + AbstractJsonLexerKt.STRING);
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final f0 varyHeaders(v0 v0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(v0Var, "<this>");
            v0 v0VarNetworkResponse = v0Var.networkResponse();
            kotlin.jvm.internal.e0.checkNotNull(v0VarNetworkResponse);
            f0 f0VarHeaders = v0VarNetworkResponse.request().headers();
            Set setA = a(v0Var.headers());
            if (setA.isEmpty()) {
                return f0.f93622e;
            }
            f0.a aVar = new f0.a();
            int size = f0VarHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strName = f0VarHeaders.name(i10);
                if (setA.contains(strName)) {
                    aVar.add(strName, f0VarHeaders.value(i10));
                }
            }
            return aVar.build();
        }

        public final boolean varyMatches(v0 cachedResponse, f0 cachedRequest, o0 newRequest) {
            kotlin.jvm.internal.e0.checkNotNullParameter(cachedResponse, "cachedResponse");
            kotlin.jvm.internal.e0.checkNotNullParameter(cachedRequest, "cachedRequest");
            kotlin.jvm.internal.e0.checkNotNullParameter(newRequest, "newRequest");
            Set<String> setA = a(cachedResponse.headers());
            if ((setA instanceof Collection) && setA.isEmpty()) {
                return true;
            }
            for (String str : setA) {
                if (!kotlin.jvm.internal.e0.areEqual(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d implements aw.d {

        /* renamed from: a, reason: collision with root package name */
        public final g.b f93609a;

        /* renamed from: b, reason: collision with root package name */
        public final pw.z0 f93610b;

        /* renamed from: c, reason: collision with root package name */
        public final f f93611c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f93612d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f93613e;

        public d(e eVar, g.b editor) {
            kotlin.jvm.internal.e0.checkNotNullParameter(editor, "editor");
            this.f93613e = eVar;
            this.f93609a = editor;
            pw.z0 z0VarNewSink = editor.newSink(1);
            this.f93610b = z0VarNewSink;
            this.f93611c = new f(eVar, this, z0VarNewSink);
        }

        @Override // aw.d
        public void abort() throws IOException {
            e eVar = this.f93613e;
            synchronized (eVar) {
                if (this.f93612d) {
                    return;
                }
                this.f93612d = true;
                eVar.setWriteAbortCount$okhttp(eVar.getWriteAbortCount$okhttp() + 1);
                yv.h.closeQuietly(this.f93610b);
                try {
                    this.f93609a.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // aw.d
        public pw.z0 body() {
            return this.f93611c;
        }

        public final boolean getDone() {
            return this.f93612d;
        }

        public final void setDone(boolean z10) {
            this.f93612d = z10;
        }
    }

    public e(pw.n0 directory, long j10, pw.r fileSystem, bw.g taskRunner) {
        kotlin.jvm.internal.e0.checkNotNullParameter(directory, "directory");
        kotlin.jvm.internal.e0.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
        this.f93587b = new aw.g(fileSystem, directory, 201105, 2, j10, taskRunner);
    }

    public static final String key(g0 g0Var) {
        return f93586i.key(g0Var);
    }

    @tu.f
    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m7883deprecated_directory() {
        return this.f93587b.getDirectory().toFile();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f93587b.close();
    }

    public final void delete() throws IOException {
        this.f93587b.delete();
    }

    public final File directory() {
        return this.f93587b.getDirectory().toFile();
    }

    public final pw.n0 directoryPath() {
        return this.f93587b.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.f93587b.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f93587b.flush();
    }

    public final v0 get$okhttp(o0 request) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        try {
            g.d dVar = this.f93587b.get(f93586i.key(request.url()));
            if (dVar == null) {
                return null;
            }
            try {
                c cVar = new c(dVar.getSource(0));
                v0 v0VarResponse = cVar.response(dVar);
                if (cVar.matches(request, v0VarResponse)) {
                    return v0VarResponse;
                }
                yv.h.closeQuietly(v0VarResponse.body());
                return null;
            } catch (IOException unused) {
                yv.h.closeQuietly(dVar);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final aw.g getCache$okhttp() {
        return this.f93587b;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.f93589e;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.f93588c;
    }

    public final synchronized int hitCount() {
        return this.f93591g;
    }

    public final void initialize() throws IOException {
        this.f93587b.initialize();
    }

    public final boolean isClosed() {
        return this.f93587b.isClosed();
    }

    public final long maxSize() {
        return this.f93587b.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.f93590f;
    }

    public final aw.d put$okhttp(v0 response) {
        g.b bVarEdit$default;
        kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
        String strMethod = response.request().method();
        if (dw.j.invalidatesCache(response.request().method())) {
            remove$okhttp(response.request());
            return null;
        }
        if (kotlin.jvm.internal.e0.areEqual(strMethod, C3271ic.f36943a)) {
            b bVar = f93586i;
            if (!bVar.hasVaryAll(response)) {
                c cVar = new c(response);
                try {
                    bVarEdit$default = aw.g.edit$default(this.f93587b, bVar.key(response.request().url()), 0L, 2, null);
                    if (bVarEdit$default != null) {
                        try {
                            cVar.writeTo(bVarEdit$default);
                            return new d(this, bVarEdit$default);
                        } catch (IOException unused) {
                            if (bVarEdit$default != null) {
                                bVarEdit$default.abort();
                            }
                            return null;
                        }
                    }
                } catch (IOException unused2) {
                    bVarEdit$default = null;
                }
            }
        }
        return null;
    }

    public final void remove$okhttp(o0 request) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        this.f93587b.remove(f93586i.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.f93592h;
    }

    public final void setWriteAbortCount$okhttp(int i10) {
        this.f93589e = i10;
    }

    public final void setWriteSuccessCount$okhttp(int i10) {
        this.f93588c = i10;
    }

    public final long size() throws IOException {
        return this.f93587b.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.f93591g++;
    }

    public final synchronized void trackResponse$okhttp(aw.e cacheStrategy) {
        try {
            kotlin.jvm.internal.e0.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.f93592h++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.f93590f++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.f93591g++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void update$okhttp(v0 cached, v0 network) {
        g.b bVarEdit;
        kotlin.jvm.internal.e0.checkNotNullParameter(cached, "cached");
        kotlin.jvm.internal.e0.checkNotNullParameter(network, "network");
        c cVar = new c(network);
        w0 w0VarBody = cached.body();
        kotlin.jvm.internal.e0.checkNotNull(w0VarBody, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarEdit = ((a) w0VarBody).getSnapshot().edit();
            if (bVarEdit == null) {
                return;
            }
            try {
                cVar.writeTo(bVarEdit);
                bVarEdit.commit();
            } catch (IOException unused) {
                if (bVarEdit != null) {
                    try {
                        bVarEdit.abort();
                    } catch (IOException unused2) {
                    }
                }
            }
        } catch (IOException unused3) {
            bVarEdit = null;
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new g(this);
    }

    public final synchronized int writeAbortCount() {
        return this.f93589e;
    }

    public final synchronized int writeSuccessCount() {
        return this.f93588c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(pw.r fileSystem, pw.n0 directory, long j10) {
        this(directory, j10, fileSystem, bw.g.f11363l);
        kotlin.jvm.internal.e0.checkNotNullParameter(fileSystem, "fileSystem");
        kotlin.jvm.internal.e0.checkNotNullParameter(directory, "directory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(File directory, long j10) {
        this(pw.r.f81966c, n0.a.get$default(pw.n0.f81931c, directory, false, 1, (Object) null), j10);
        kotlin.jvm.internal.e0.checkNotNullParameter(directory, "directory");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: k, reason: collision with root package name */
        public static final String f93597k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f93598l;

        /* renamed from: a, reason: collision with root package name */
        public final g0 f93599a;

        /* renamed from: b, reason: collision with root package name */
        public final f0 f93600b;

        /* renamed from: c, reason: collision with root package name */
        public final String f93601c;

        /* renamed from: d, reason: collision with root package name */
        public final n0 f93602d;

        /* renamed from: e, reason: collision with root package name */
        public final int f93603e;

        /* renamed from: f, reason: collision with root package name */
        public final String f93604f;

        /* renamed from: g, reason: collision with root package name */
        public final f0 f93605g;

        /* renamed from: h, reason: collision with root package name */
        public final e0 f93606h;

        /* renamed from: i, reason: collision with root package name */
        public final long f93607i;

        /* renamed from: j, reason: collision with root package name */
        public final long f93608j;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(kotlin.jvm.internal.u uVar) {
            }
        }

        static {
            new a(null);
            StringBuilder sb2 = new StringBuilder();
            c.a aVar = okhttp3.internal.platform.c.f79515a;
            sb2.append(aVar.get().getPrefix());
            sb2.append("-Sent-Millis");
            f93597k = sb2.toString();
            f93598l = aVar.get().getPrefix() + "-Received-Millis";
        }

        public c(pw.b1 rawSource) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(rawSource, "rawSource");
            try {
                pw.k kVarBuffer = pw.h0.buffer(rawSource);
                String utf8LineStrict = kVarBuffer.readUtf8LineStrict();
                g0 g0Var = g0.f93628j.parse(utf8LineStrict);
                if (g0Var == null) {
                    IOException iOException = new IOException("Cache corruption for " + utf8LineStrict);
                    okhttp3.internal.platform.c.f79515a.get().log("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f93599a = g0Var;
                this.f93601c = kVarBuffer.readUtf8LineStrict();
                f0.a aVar = new f0.a();
                int int$okhttp = e.f93586i.readInt$okhttp(kVarBuffer);
                for (int i10 = 0; i10 < int$okhttp; i10++) {
                    aVar.addLenient$okhttp(kVarBuffer.readUtf8LineStrict());
                }
                this.f93600b = aVar.build();
                dw.o oVar = dw.o.f52930d.parse(kVarBuffer.readUtf8LineStrict());
                this.f93602d = oVar.f52931a;
                this.f93603e = oVar.f52932b;
                this.f93604f = oVar.f52933c;
                f0.a aVar2 = new f0.a();
                int int$okhttp2 = e.f93586i.readInt$okhttp(kVarBuffer);
                for (int i11 = 0; i11 < int$okhttp2; i11++) {
                    aVar2.addLenient$okhttp(kVarBuffer.readUtf8LineStrict());
                }
                String str = f93597k;
                String str2 = aVar2.get(str);
                String str3 = f93598l;
                String str4 = aVar2.get(str3);
                aVar2.removeAll(str);
                aVar2.removeAll(str3);
                this.f93607i = str2 != null ? Long.parseLong(str2) : 0L;
                this.f93608j = str4 != null ? Long.parseLong(str4) : 0L;
                this.f93605g = aVar2.build();
                if (this.f93599a.isHttps()) {
                    String utf8LineStrict2 = kVarBuffer.readUtf8LineStrict();
                    if (utf8LineStrict2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict2 + AbstractJsonLexerKt.STRING);
                    }
                    this.f93606h = e0.f93614e.get(!kVarBuffer.exhausted() ? a1.f93567c.forJavaName(kVarBuffer.readUtf8LineStrict()) : a1.f93572i, o.f93769b.forJavaName(kVarBuffer.readUtf8LineStrict()), a(kVarBuffer), a(kVarBuffer));
                } else {
                    this.f93606h = null;
                }
                gv.d.closeFinally(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    gv.d.closeFinally(rawSource, th2);
                    throw th3;
                }
            }
        }

        public static List a(pw.k kVar) throws IOException, CertificateException {
            int int$okhttp = e.f93586i.readInt$okhttp(kVar);
            if (int$okhttp == -1) {
                return uu.p0.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(int$okhttp);
                for (int i10 = 0; i10 < int$okhttp; i10++) {
                    String utf8LineStrict = kVar.readUtf8LineStrict();
                    pw.g gVar = new pw.g();
                    pw.l lVarDecodeBase64 = pw.l.f81911f.decodeBase64(utf8LineStrict);
                    if (lVarDecodeBase64 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    gVar.write(lVarDecodeBase64);
                    arrayList.add(certificateFactory.generateCertificate(gVar.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public static void b(pw.j jVar, List list) throws IOException, CertificateEncodingException {
            try {
                jVar.writeDecimalLong(list.size()).writeByte(10);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = ((Certificate) it.next()).getEncoded();
                    l.a aVar = pw.l.f81911f;
                    kotlin.jvm.internal.e0.checkNotNull(encoded);
                    jVar.writeUtf8(l.a.of$default(aVar, encoded, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean matches(o0 request, v0 response) {
            kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
            kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
            return kotlin.jvm.internal.e0.areEqual(this.f93599a, request.url()) && kotlin.jvm.internal.e0.areEqual(this.f93601c, request.method()) && e.f93586i.varyMatches(response, this.f93600b, request);
        }

        public final v0 response(g.d snapshot) {
            kotlin.jvm.internal.e0.checkNotNullParameter(snapshot, "snapshot");
            f0 f0Var = this.f93605g;
            String str = f0Var.get("Content-Type");
            String str2 = f0Var.get("Content-Length");
            return new v0.a().request(new o0(this.f93599a, this.f93600b, this.f93601c, null, 8, null)).protocol(this.f93602d).code(this.f93603e).message(this.f93604f).headers(f0Var).body(new a(snapshot, str, str2)).handshake(this.f93606h).sentRequestAtMillis(this.f93607i).receivedResponseAtMillis(this.f93608j).build();
        }

        public final void writeTo(g.b editor) throws IOException {
            g0 g0Var = this.f93599a;
            e0 e0Var = this.f93606h;
            f0 f0Var = this.f93605g;
            f0 f0Var2 = this.f93600b;
            kotlin.jvm.internal.e0.checkNotNullParameter(editor, "editor");
            pw.j jVarBuffer = pw.h0.buffer(editor.newSink(0));
            try {
                jVarBuffer.writeUtf8(g0Var.toString()).writeByte(10);
                jVarBuffer.writeUtf8(this.f93601c).writeByte(10);
                jVarBuffer.writeDecimalLong(f0Var2.size()).writeByte(10);
                int size = f0Var2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    jVarBuffer.writeUtf8(f0Var2.name(i10)).writeUtf8(": ").writeUtf8(f0Var2.value(i10)).writeByte(10);
                }
                jVarBuffer.writeUtf8(new dw.o(this.f93602d, this.f93603e, this.f93604f).toString()).writeByte(10);
                jVarBuffer.writeDecimalLong(f0Var.size() + 2).writeByte(10);
                int size2 = f0Var.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    jVarBuffer.writeUtf8(f0Var.name(i11)).writeUtf8(": ").writeUtf8(f0Var.value(i11)).writeByte(10);
                }
                jVarBuffer.writeUtf8(f93597k).writeUtf8(": ").writeDecimalLong(this.f93607i).writeByte(10);
                jVarBuffer.writeUtf8(f93598l).writeUtf8(": ").writeDecimalLong(this.f93608j).writeByte(10);
                if (g0Var.isHttps()) {
                    jVarBuffer.writeByte(10);
                    kotlin.jvm.internal.e0.checkNotNull(e0Var);
                    jVarBuffer.writeUtf8(e0Var.cipherSuite().javaName()).writeByte(10);
                    b(jVarBuffer, e0Var.peerCertificates());
                    b(jVarBuffer, e0Var.localCertificates());
                    jVarBuffer.writeUtf8(e0Var.tlsVersion().javaName()).writeByte(10);
                }
                gv.d.closeFinally(jVarBuffer, null);
            } finally {
            }
        }

        public c(v0 response) {
            kotlin.jvm.internal.e0.checkNotNullParameter(response, "response");
            this.f93599a = response.request().url();
            this.f93600b = e.f93586i.varyHeaders(response);
            this.f93601c = response.request().method();
            this.f93602d = response.protocol();
            this.f93603e = response.code();
            this.f93604f = response.message();
            this.f93605g = response.headers();
            this.f93606h = response.handshake();
            this.f93607i = response.sentRequestAtMillis();
            this.f93608j = response.receivedResponseAtMillis();
        }
    }
}
