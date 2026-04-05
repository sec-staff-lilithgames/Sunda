package io.odeeo.internal.y1;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.IOException;
import java.util.regex.Pattern;
import xv.d0;
import xv.f0;
import xv.g0;
import xv.j0;
import xv.k0;
import xv.o0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f67666l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f67667m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f67668a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f67669b;

    /* renamed from: c, reason: collision with root package name */
    public String f67670c;

    /* renamed from: d, reason: collision with root package name */
    public g0.a f67671d;

    /* renamed from: e, reason: collision with root package name */
    public final o0.a f67672e = new o0.a();

    /* renamed from: f, reason: collision with root package name */
    public final f0.a f67673f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f67674g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f67675h;

    /* renamed from: i, reason: collision with root package name */
    public k0.a f67676i;

    /* renamed from: j, reason: collision with root package name */
    public d0.a f67677j;

    /* renamed from: k, reason: collision with root package name */
    public u0 f67678k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends u0 {

        /* renamed from: a, reason: collision with root package name */
        public final u0 f67679a;

        /* renamed from: b, reason: collision with root package name */
        public final j0 f67680b;

        public a(u0 u0Var, j0 j0Var) {
            this.f67679a = u0Var;
            this.f67680b = j0Var;
        }

        @Override // xv.u0
        public long contentLength() throws IOException {
            return this.f67679a.contentLength();
        }

        @Override // xv.u0
        public j0 contentType() {
            return this.f67680b;
        }

        @Override // xv.u0
        public void writeTo(pw.j jVar) throws IOException {
            this.f67679a.writeTo(jVar);
        }
    }

    public p(String str, g0 g0Var, String str2, f0 f0Var, j0 j0Var, boolean z10, boolean z11, boolean z12) {
        this.f67668a = str;
        this.f67669b = g0Var;
        this.f67670c = str2;
        this.f67674g = j0Var;
        this.f67675h = z10;
        if (f0Var != null) {
            this.f67673f = f0Var.newBuilder();
        } else {
            this.f67673f = new f0.a();
        }
        if (z11) {
            this.f67677j = new d0.a();
        } else if (z12) {
            k0.a aVar = new k0.a();
            this.f67676i = aVar;
            aVar.setType(k0.f93679j);
        }
    }

    public void a(Object obj) {
        this.f67670c = obj.toString();
    }

    public void b(String str, String str2, boolean z10) {
        if (this.f67670c == null) {
            throw new AssertionError();
        }
        String strA = a(str2, z10);
        String strReplace = this.f67670c.replace("{" + str + "}", strA);
        if (f67667m.matcher(strReplace).matches()) {
            throw new IllegalArgumentException(a.b.k("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        this.f67670c = strReplace;
    }

    public void c(String str, String str2, boolean z10) {
        String str3 = this.f67670c;
        if (str3 != null) {
            g0.a aVarNewBuilder = this.f67669b.newBuilder(str3);
            this.f67671d = aVarNewBuilder;
            if (aVarNewBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f67669b + ", Relative: " + this.f67670c);
            }
            this.f67670c = null;
        }
        if (z10) {
            this.f67671d.addEncodedQueryParameter(str, str2);
        } else {
            this.f67671d.addQueryParameter(str, str2);
        }
    }

    public void a(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f67673f.add(str, str2);
            return;
        }
        try {
            this.f67674g = j0.get(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(a.b.k("Malformed content type: ", str2), e10);
        }
    }

    public void a(f0 f0Var) {
        this.f67673f.addAll(f0Var);
    }

    public static String a(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt < 127 && " \"<>^`{}|\\?#".indexOf(iCodePointAt) == -1 && (z10 || (iCodePointAt != 47 && iCodePointAt != 37))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                pw.g gVar = new pw.g();
                gVar.writeUtf8(str, 0, iCharCount);
                a(gVar, str, iCharCount, length, z10);
                return gVar.readUtf8();
            }
        }
        return str;
    }

    public static void a(pw.g gVar, String str, int i10, int i11, boolean z10) throws EOFException {
        pw.g gVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt >= 32 && iCodePointAt < 127 && " \"<>^`{}|\\?#".indexOf(iCodePointAt) == -1 && (z10 || (iCodePointAt != 47 && iCodePointAt != 37))) {
                    gVar.writeUtf8CodePoint(iCodePointAt);
                } else {
                    if (gVar2 == null) {
                        gVar2 = new pw.g();
                    }
                    gVar2.writeUtf8CodePoint(iCodePointAt);
                    while (!gVar2.exhausted()) {
                        byte b10 = gVar2.readByte();
                        int i12 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        gVar.writeByte(37);
                        char[] cArr = f67666l;
                        gVar.writeByte((int) cArr[(i12 >> 4) & 15]);
                        gVar.writeByte((int) cArr[b10 & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f67677j.addEncoded(str, str2);
        } else {
            this.f67677j.add(str, str2);
        }
    }

    public void a(f0 f0Var, u0 u0Var) {
        this.f67676i.addPart(f0Var, u0Var);
    }

    public void a(k0.c cVar) {
        this.f67676i.addPart(cVar);
    }

    public void a(u0 u0Var) {
        this.f67678k = u0Var;
    }

    public <T> void a(Class<T> cls, T t10) {
        this.f67672e.tag((Class<? super Class<T>>) cls, (Class<T>) t10);
    }

    public o0.a a() {
        g0 g0VarResolve;
        g0.a aVar = this.f67671d;
        if (aVar != null) {
            g0VarResolve = aVar.build();
        } else {
            g0VarResolve = this.f67669b.resolve(this.f67670c);
            if (g0VarResolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f67669b + ", Relative: " + this.f67670c);
            }
        }
        u0 aVar2 = this.f67678k;
        if (aVar2 == null) {
            d0.a aVar3 = this.f67677j;
            if (aVar3 != null) {
                aVar2 = aVar3.build();
            } else {
                k0.a aVar4 = this.f67676i;
                if (aVar4 != null) {
                    aVar2 = aVar4.build();
                } else if (this.f67675h) {
                    aVar2 = u0.create((j0) null, new byte[0]);
                }
            }
        }
        j0 j0Var = this.f67674g;
        if (j0Var != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, j0Var);
            } else {
                this.f67673f.add("Content-Type", j0Var.toString());
            }
        }
        return this.f67672e.url(g0VarResolve).headers(this.f67673f.build()).method(this.f67668a, aVar2);
    }
}
