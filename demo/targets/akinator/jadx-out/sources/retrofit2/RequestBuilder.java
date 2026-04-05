package retrofit2;

import a.b;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.EOFException;
import java.io.IOException;
import java.util.regex.Pattern;
import pw.g;
import pw.j;
import xv.d0;
import xv.f0;
import xv.g0;
import xv.j0;
import xv.k0;
import xv.o0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final g0 baseUrl;
    private u0 body;
    private j0 contentType;
    private d0.a formBuilder;
    private final boolean hasBody;
    private final f0.a headersBuilder;
    private final String method;
    private k0.a multipartBuilder;
    private String relativeUrl;
    private final o0.a requestBuilder = new o0.a();
    private g0.a urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ContentTypeOverridingRequestBody extends u0 {
        private final j0 contentType;
        private final u0 delegate;

        public ContentTypeOverridingRequestBody(u0 u0Var, j0 j0Var) {
            this.delegate = u0Var;
            this.contentType = j0Var;
        }

        @Override // xv.u0
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // xv.u0
        public j0 contentType() {
            return this.contentType;
        }

        @Override // xv.u0
        public void writeTo(j jVar) throws IOException {
            this.delegate.writeTo(jVar);
        }
    }

    public RequestBuilder(String str, g0 g0Var, String str2, f0 f0Var, j0 j0Var, boolean z10, boolean z11, boolean z12) {
        this.method = str;
        this.baseUrl = g0Var;
        this.relativeUrl = str2;
        this.contentType = j0Var;
        this.hasBody = z10;
        if (f0Var != null) {
            this.headersBuilder = f0Var.newBuilder();
        } else {
            this.headersBuilder = new f0.a();
        }
        if (z11) {
            this.formBuilder = new d0.a();
        } else if (z12) {
            k0.a aVar = new k0.a();
            this.multipartBuilder = aVar;
            aVar.setType(k0.f93679j);
        }
    }

    private static String canonicalizeForPath(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                g gVar = new g();
                gVar.writeUtf8(str, 0, iCharCount);
                canonicalizeForPath(gVar, str, iCharCount, length, z10);
                return gVar.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    public void addFormField(String str, String str2, boolean z10) {
        if (z10) {
            this.formBuilder.addEncoded(str, str2);
        } else {
            this.formBuilder.add(str, str2);
        }
    }

    public void addHeader(String str, String str2, boolean z10) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.contentType = j0.get(str2);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(b.k("Malformed content type: ", str2), e10);
            }
        } else if (z10) {
            this.headersBuilder.addUnsafeNonAscii(str, str2);
        } else {
            this.headersBuilder.add(str, str2);
        }
    }

    public void addHeaders(f0 f0Var) {
        this.headersBuilder.addAll(f0Var);
    }

    public void addPart(f0 f0Var, u0 u0Var) {
        this.multipartBuilder.addPart(f0Var, u0Var);
    }

    public void addPathParam(String str, String str2, boolean z10) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String strCanonicalizeForPath = canonicalizeForPath(str2, z10);
        String strReplace = this.relativeUrl.replace("{" + str + "}", strCanonicalizeForPath);
        if (PATH_TRAVERSAL.matcher(strReplace).matches()) {
            throw new IllegalArgumentException(b.k("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        this.relativeUrl = strReplace;
    }

    public void addQueryParam(String str, String str2, boolean z10) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            g0.a aVarNewBuilder = this.baseUrl.newBuilder(str3);
            this.urlBuilder = aVarNewBuilder;
            if (aVarNewBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (z10) {
            this.urlBuilder.addEncodedQueryParameter(str, str2);
        } else {
            this.urlBuilder.addQueryParameter(str, str2);
        }
    }

    public <T> void addTag(Class<T> cls, T t10) {
        this.requestBuilder.tag((Class<? super Class<T>>) cls, (Class<T>) t10);
    }

    public o0.a get() {
        g0 g0VarResolve;
        g0.a aVar = this.urlBuilder;
        if (aVar != null) {
            g0VarResolve = aVar.build();
        } else {
            g0VarResolve = this.baseUrl.resolve(this.relativeUrl);
            if (g0VarResolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        u0 contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            d0.a aVar2 = this.formBuilder;
            if (aVar2 != null) {
                contentTypeOverridingRequestBody = aVar2.build();
            } else {
                k0.a aVar3 = this.multipartBuilder;
                if (aVar3 != null) {
                    contentTypeOverridingRequestBody = aVar3.build();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = u0.create((j0) null, new byte[0]);
                }
            }
        }
        j0 j0Var = this.contentType;
        if (j0Var != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, j0Var);
            } else {
                this.headersBuilder.add("Content-Type", j0Var.toString());
            }
        }
        return this.requestBuilder.url(g0VarResolve).headers(this.headersBuilder.build()).method(this.method, contentTypeOverridingRequestBody);
    }

    public void setBody(u0 u0Var) {
        this.body = u0Var;
    }

    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    public void addPart(k0.c cVar) {
        this.multipartBuilder.addPart(cVar);
    }

    private static void canonicalizeForPath(g gVar, String str, int i10, int i11, boolean z10) throws EOFException {
        g gVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt >= 32 && iCodePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) == -1 && (z10 || (iCodePointAt != 47 && iCodePointAt != 37))) {
                    gVar.writeUtf8CodePoint(iCodePointAt);
                } else {
                    if (gVar2 == null) {
                        gVar2 = new g();
                    }
                    gVar2.writeUtf8CodePoint(iCodePointAt);
                    long size = gVar2.size();
                    for (long j10 = 0; j10 < size; j10++) {
                        byte b10 = gVar2.getByte(j10);
                        int i12 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        gVar.writeByte(37);
                        char[] cArr = HEX_DIGITS;
                        gVar.writeByte((int) cArr[(i12 >> 4) & 15]);
                        gVar.writeByte((int) cArr[b10 & 15]);
                    }
                    gVar2.clear();
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }
}
