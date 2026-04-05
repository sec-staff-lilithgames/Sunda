package xv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import xv.f0;
import xv.j0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 extends u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final b f93677h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    public static final j0 f93678i;

    /* renamed from: j, reason: collision with root package name */
    public static final j0 f93679j;

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f93680k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f93681l;

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f93682m;

    /* renamed from: c, reason: collision with root package name */
    public final pw.l f93683c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f93684d;

    /* renamed from: e, reason: collision with root package name */
    public final List f93685e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f93686f;

    /* renamed from: g, reason: collision with root package name */
    public long f93687g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final pw.l f93688a;

        /* renamed from: b, reason: collision with root package name */
        public j0 f93689b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f93690c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a addFormDataPart(String name, String value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            addPart(c.f93691c.createFormData(name, value));
            return this;
        }

        public final a addPart(u0 body) {
            kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
            addPart(c.f93691c.create(body));
            return this;
        }

        public final k0 build() {
            ArrayList arrayList = this.f93690c;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new k0(this.f93688a, this.f93689b, yv.i.toImmutableList(arrayList));
        }

        public final a setType(j0 type) {
            kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
            if (kotlin.jvm.internal.e0.areEqual(type.type(), "multipart")) {
                this.f93689b = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            kotlin.jvm.internal.e0.checkNotNullParameter(boundary, "boundary");
            this.f93688a = pw.l.f81911f.encodeUtf8(boundary);
            this.f93689b = k0.f93678i;
            this.f93690c = new ArrayList();
        }

        public final a addFormDataPart(String name, String str, u0 body) {
            kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
            addPart(c.f93691c.createFormData(name, str, body));
            return this;
        }

        public final a addPart(f0 f0Var, u0 body) {
            kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
            addPart(c.f93691c.create(f0Var, body));
            return this;
        }

        public final a addPart(c part) {
            kotlin.jvm.internal.e0.checkNotNullParameter(part, "part");
            this.f93690c.add(part);
            return this;
        }

        public /* synthetic */ a(String str, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? w0.i.c("toString(...)") : str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final void appendQuotedString$okhttp(StringBuilder sb2, String key) {
            kotlin.jvm.internal.e0.checkNotNullParameter(sb2, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
            sb2.append(AbstractJsonLexerKt.STRING);
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt != '\"') {
                    sb2.append(cCharAt);
                } else {
                    sb2.append("%22");
                }
            }
            sb2.append(AbstractJsonLexerKt.STRING);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f93691c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final f0 f93692a;

        /* renamed from: b, reason: collision with root package name */
        public final u0 f93693b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(kotlin.jvm.internal.u uVar) {
            }

            public final c create(u0 body) {
                kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
                return create(null, body);
            }

            public final c createFormData(String name, String value) {
                kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
                return createFormData(name, null, u0.a.create$default(u0.Companion, value, (j0) null, 1, (Object) null));
            }

            public final c create(f0 f0Var, u0 body) {
                kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
                if ((f0Var != null ? f0Var.get("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((f0Var != null ? f0Var.get("Content-Length") : null) == null) {
                    return new c(f0Var, body, null);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            public final c createFormData(String name, String str, u0 body) {
                kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
                kotlin.jvm.internal.e0.checkNotNullParameter(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                b bVar = k0.f93677h;
                bVar.appendQuotedString$okhttp(sb2, name);
                if (str != null) {
                    sb2.append("; filename=");
                    bVar.appendQuotedString$okhttp(sb2, str);
                }
                return create(new f0.a().addUnsafeNonAscii("Content-Disposition", sb2.toString()).build(), body);
            }
        }

        public c(f0 f0Var, u0 u0Var, kotlin.jvm.internal.u uVar) {
            this.f93692a = f0Var;
            this.f93693b = u0Var;
        }

        public static final c create(f0 f0Var, u0 u0Var) {
            return f93691c.create(f0Var, u0Var);
        }

        public static final c createFormData(String str, String str2) {
            return f93691c.createFormData(str, str2);
        }

        @tu.f
        /* renamed from: -deprecated_body, reason: not valid java name */
        public final u0 m7938deprecated_body() {
            return this.f93693b;
        }

        @tu.f
        /* renamed from: -deprecated_headers, reason: not valid java name */
        public final f0 m7939deprecated_headers() {
            return this.f93692a;
        }

        public final u0 body() {
            return this.f93693b;
        }

        public final f0 headers() {
            return this.f93692a;
        }

        public static final c create(u0 u0Var) {
            return f93691c.create(u0Var);
        }

        public static final c createFormData(String str, String str2, u0 u0Var) {
            return f93691c.createFormData(str, str2, u0Var);
        }
    }

    static {
        j0.a aVar = j0.f93670e;
        f93678i = aVar.get("multipart/mixed");
        aVar.get("multipart/alternative");
        aVar.get("multipart/digest");
        aVar.get("multipart/parallel");
        f93679j = aVar.get("multipart/form-data");
        f93680k = new byte[]{58, 32};
        f93681l = new byte[]{13, 10};
        f93682m = new byte[]{45, 45};
    }

    public k0(pw.l boundaryByteString, j0 type, List<c> parts) {
        kotlin.jvm.internal.e0.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.e0.checkNotNullParameter(parts, "parts");
        this.f93683c = boundaryByteString;
        this.f93684d = type;
        this.f93685e = parts;
        this.f93686f = j0.f93670e.get(type + "; boundary=" + boundary());
        this.f93687g = -1L;
    }

    @tu.f
    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m7934deprecated_boundary() {
        return boundary();
    }

    @tu.f
    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final List<c> m7935deprecated_parts() {
        return this.f93685e;
    }

    @tu.f
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m7936deprecated_size() {
        return size();
    }

    @tu.f
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final j0 m7937deprecated_type() {
        return this.f93684d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(pw.j jVar, boolean z10) throws IOException {
        pw.g gVar;
        pw.j gVar2;
        if (z10) {
            gVar2 = new pw.g();
            gVar = gVar2;
        } else {
            gVar = 0;
            gVar2 = jVar;
        }
        List list = this.f93685e;
        int size = list.size();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            pw.l lVar = this.f93683c;
            byte[] bArr = f93682m;
            byte[] bArr2 = f93681l;
            if (i10 >= size) {
                kotlin.jvm.internal.e0.checkNotNull(gVar2);
                gVar2.write(bArr);
                gVar2.write(lVar);
                gVar2.write(bArr);
                gVar2.write(bArr2);
                if (!z10) {
                    return j10;
                }
                kotlin.jvm.internal.e0.checkNotNull(gVar);
                long size2 = gVar.size() + j10;
                gVar.clear();
                return size2;
            }
            c cVar = (c) list.get(i10);
            f0 f0VarHeaders = cVar.headers();
            u0 u0VarBody = cVar.body();
            kotlin.jvm.internal.e0.checkNotNull(gVar2);
            gVar2.write(bArr);
            gVar2.write(lVar);
            gVar2.write(bArr2);
            if (f0VarHeaders != null) {
                int size3 = f0VarHeaders.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    gVar2.writeUtf8(f0VarHeaders.name(i11)).write(f93680k).writeUtf8(f0VarHeaders.value(i11)).write(bArr2);
                }
            }
            j0 j0VarContentType = u0VarBody.contentType();
            if (j0VarContentType != null) {
                gVar2.writeUtf8("Content-Type: ").writeUtf8(j0VarContentType.toString()).write(bArr2);
            }
            long jContentLength = u0VarBody.contentLength();
            if (jContentLength == -1 && z10) {
                kotlin.jvm.internal.e0.checkNotNull(gVar);
                gVar.clear();
                return -1L;
            }
            gVar2.write(bArr2);
            if (z10) {
                j10 += jContentLength;
            } else {
                u0VarBody.writeTo(gVar2);
            }
            gVar2.write(bArr2);
            i10++;
        }
    }

    public final String boundary() {
        return this.f93683c.utf8();
    }

    @Override // xv.u0
    public long contentLength() throws IOException {
        long j10 = this.f93687g;
        if (j10 != -1) {
            return j10;
        }
        long jA = a(null, true);
        this.f93687g = jA;
        return jA;
    }

    @Override // xv.u0
    public j0 contentType() {
        return this.f93686f;
    }

    @Override // xv.u0
    public boolean isOneShot() {
        List list = this.f93685e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).body().isOneShot()) {
                return true;
            }
        }
        return false;
    }

    public final c part(int i10) {
        return (c) this.f93685e.get(i10);
    }

    public final List<c> parts() {
        return this.f93685e;
    }

    public final int size() {
        return this.f93685e.size();
    }

    public final j0 type() {
        return this.f93684d;
    }

    @Override // xv.u0
    public void writeTo(pw.j sink) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
