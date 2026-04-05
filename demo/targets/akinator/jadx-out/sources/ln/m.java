package ln;

import android.net.Uri;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import gn.q0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f73467a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73469c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f73470d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f73471e;

    /* renamed from: f, reason: collision with root package name */
    public final long f73472f;

    /* renamed from: g, reason: collision with root package name */
    public final long f73473g;

    /* renamed from: h, reason: collision with root package name */
    public final String f73474h;

    /* renamed from: i, reason: collision with root package name */
    public final int f73475i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f73476j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Uri f73477a;

        /* renamed from: b, reason: collision with root package name */
        public long f73478b;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f73480d;

        /* renamed from: f, reason: collision with root package name */
        public long f73482f;

        /* renamed from: h, reason: collision with root package name */
        public String f73484h;

        /* renamed from: i, reason: collision with root package name */
        public int f73485i;

        /* renamed from: j, reason: collision with root package name */
        public Object f73486j;

        /* renamed from: c, reason: collision with root package name */
        public int f73479c = 1;

        /* renamed from: e, reason: collision with root package name */
        public Map f73481e = Collections.EMPTY_MAP;

        /* renamed from: g, reason: collision with root package name */
        public long f73483g = -1;

        public m build() {
            io.bidmachine.media3.common.util.a.checkStateNotNull(this.f73477a, "The uri must be set.");
            return new m(this.f73477a, this.f73478b, this.f73479c, this.f73480d, this.f73481e, this.f73482f, this.f73483g, this.f73484h, this.f73485i, this.f73486j);
        }

        public a setCustomData(Object obj) {
            this.f73486j = obj;
            return this;
        }

        public a setFlags(int i10) {
            this.f73485i = i10;
            return this;
        }

        public a setHttpBody(byte[] bArr) {
            this.f73480d = bArr;
            return this;
        }

        public a setHttpMethod(int i10) {
            this.f73479c = i10;
            return this;
        }

        public a setHttpRequestHeaders(Map<String, String> map) {
            this.f73481e = map;
            return this;
        }

        public a setKey(String str) {
            this.f73484h = str;
            return this;
        }

        public a setLength(long j10) {
            this.f73483g = j10;
            return this;
        }

        public a setPosition(long j10) {
            this.f73482f = j10;
            return this;
        }

        public a setUri(String str) {
            this.f73477a = Uri.parse(str);
            return this;
        }

        public a setUriPositionOffset(long j10) {
            this.f73478b = j10;
            return this;
        }

        public a setUri(Uri uri) {
            this.f73477a = uri;
            return this;
        }
    }

    static {
        q0.registerModule("media3.datasource");
    }

    public m(Uri uri) {
        this(uri, 0L, -1L);
    }

    public static String getStringForHttpMethod(int i10) {
        if (i10 == 1) {
            return C3271ic.f36943a;
        }
        if (i10 == 2) {
            return C3271ic.f36944b;
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public a buildUpon() {
        a aVar = new a();
        aVar.f73477a = this.f73467a;
        aVar.f73478b = this.f73468b;
        aVar.f73479c = this.f73469c;
        aVar.f73480d = this.f73470d;
        aVar.f73481e = this.f73471e;
        aVar.f73482f = this.f73472f;
        aVar.f73483g = this.f73473g;
        aVar.f73484h = this.f73474h;
        aVar.f73485i = this.f73475i;
        aVar.f73486j = this.f73476j;
        return aVar;
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.f73469c);
    }

    public boolean isFlagSet(int i10) {
        return (this.f73475i & i10) == i10;
    }

    public m subrange(long j10) {
        long j11 = this.f73473g;
        return subrange(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(getHttpMethodString());
        sb2.append(" ");
        sb2.append(this.f73467a);
        sb2.append(", ");
        sb2.append(this.f73472f);
        sb2.append(", ");
        sb2.append(this.f73473g);
        sb2.append(", ");
        sb2.append(this.f73474h);
        sb2.append(", ");
        return a.b.f(this.f73475i, C3191e4.i.f36531e, sb2);
    }

    public m withAdditionalHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f73471e);
        map2.putAll(map);
        return new m(this.f73467a, this.f73468b, this.f73469c, this.f73470d, map2, this.f73472f, this.f73473g, this.f73474h, this.f73475i, this.f73476j);
    }

    public m withRequestHeaders(Map<String, String> map) {
        return new m(this.f73467a, this.f73468b, this.f73469c, this.f73470d, map, this.f73472f, this.f73473g, this.f73474h, this.f73475i, this.f73476j);
    }

    public m withUri(Uri uri) {
        return new m(uri, this.f73468b, this.f73469c, this.f73470d, this.f73471e, this.f73472f, this.f73473g, this.f73474h, this.f73475i, this.f73476j);
    }

    public m(Uri uri, long j10, long j11) {
        this(uri, j10, j11, null);
    }

    public m subrange(long j10, long j11) {
        if (j10 == 0 && this.f73473g == j11) {
            return this;
        }
        return new m(this.f73467a, this.f73468b, this.f73469c, this.f73470d, this.f73471e, this.f73472f + j10, j11, this.f73474h, this.f73475i, this.f73476j);
    }

    @Deprecated
    public m(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, str, 0, null);
    }

    public m(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        io.bidmachine.media3.common.util.a.checkArgument(j10 + j11 >= 0);
        io.bidmachine.media3.common.util.a.checkArgument(j11 >= 0);
        io.bidmachine.media3.common.util.a.checkArgument(j12 > 0 || j12 == -1);
        this.f73467a = (Uri) io.bidmachine.media3.common.util.a.checkNotNull(uri);
        this.f73468b = j10;
        this.f73469c = i10;
        this.f73470d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f73471e = Collections.unmodifiableMap(new HashMap(map));
        this.f73472f = j11;
        this.f73473g = j12;
        this.f73474h = str;
        this.f73475i = i11;
        this.f73476j = obj;
    }
}
