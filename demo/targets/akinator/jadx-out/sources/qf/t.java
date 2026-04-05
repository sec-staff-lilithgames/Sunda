package qf;

import android.net.Uri;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f82992a;

    /* renamed from: b, reason: collision with root package name */
    public final long f82993b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82994c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f82995d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f82996e;

    /* renamed from: f, reason: collision with root package name */
    public final long f82997f;

    /* renamed from: g, reason: collision with root package name */
    public final long f82998g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82999h;

    /* renamed from: i, reason: collision with root package name */
    public final int f83000i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f83001j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Uri f83002a;

        /* renamed from: b, reason: collision with root package name */
        public long f83003b;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f83005d;

        /* renamed from: f, reason: collision with root package name */
        public long f83007f;

        /* renamed from: h, reason: collision with root package name */
        public String f83009h;

        /* renamed from: i, reason: collision with root package name */
        public int f83010i;

        /* renamed from: j, reason: collision with root package name */
        public Object f83011j;

        /* renamed from: c, reason: collision with root package name */
        public int f83004c = 1;

        /* renamed from: e, reason: collision with root package name */
        public Map f83006e = Collections.EMPTY_MAP;

        /* renamed from: g, reason: collision with root package name */
        public long f83008g = -1;

        public t build() {
            com.google.android.exoplayer2.util.a.checkStateNotNull(this.f83002a, "The uri must be set.");
            return new t(this.f83002a, this.f83003b, this.f83004c, this.f83005d, this.f83006e, this.f83007f, this.f83008g, this.f83009h, this.f83010i, this.f83011j);
        }

        public a setCustomData(Object obj) {
            this.f83011j = obj;
            return this;
        }

        public a setFlags(int i10) {
            this.f83010i = i10;
            return this;
        }

        public a setHttpBody(byte[] bArr) {
            this.f83005d = bArr;
            return this;
        }

        public a setHttpMethod(int i10) {
            this.f83004c = i10;
            return this;
        }

        public a setHttpRequestHeaders(Map<String, String> map) {
            this.f83006e = map;
            return this;
        }

        public a setKey(String str) {
            this.f83009h = str;
            return this;
        }

        public a setLength(long j10) {
            this.f83008g = j10;
            return this;
        }

        public a setPosition(long j10) {
            this.f83007f = j10;
            return this;
        }

        public a setUri(String str) {
            this.f83002a = Uri.parse(str);
            return this;
        }

        public a setUriPositionOffset(long j10) {
            this.f83003b = j10;
            return this;
        }

        public a setUri(Uri uri) {
            this.f83002a = uri;
            return this;
        }
    }

    static {
        com.google.android.exoplayer2.w0.registerModule("goog.exo.datasource");
    }

    public t(Uri uri) {
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
        aVar.f83002a = this.f82992a;
        aVar.f83003b = this.f82993b;
        aVar.f83004c = this.f82994c;
        aVar.f83005d = this.f82995d;
        aVar.f83006e = this.f82996e;
        aVar.f83007f = this.f82997f;
        aVar.f83008g = this.f82998g;
        aVar.f83009h = this.f82999h;
        aVar.f83010i = this.f83000i;
        aVar.f83011j = this.f83001j;
        return aVar;
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.f82994c);
    }

    public boolean isFlagSet(int i10) {
        return (this.f83000i & i10) == i10;
    }

    public t subrange(long j10) {
        long j11 = this.f82998g;
        return subrange(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(getHttpMethodString());
        sb2.append(" ");
        sb2.append(this.f82992a);
        sb2.append(", ");
        sb2.append(this.f82997f);
        sb2.append(", ");
        sb2.append(this.f82998g);
        sb2.append(", ");
        sb2.append(this.f82999h);
        sb2.append(", ");
        return a.b.f(this.f83000i, C3191e4.i.f36531e, sb2);
    }

    public t withAdditionalHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f82996e);
        map2.putAll(map);
        return new t(this.f82992a, this.f82993b, this.f82994c, this.f82995d, map2, this.f82997f, this.f82998g, this.f82999h, this.f83000i, this.f83001j);
    }

    public t withRequestHeaders(Map<String, String> map) {
        return new t(this.f82992a, this.f82993b, this.f82994c, this.f82995d, map, this.f82997f, this.f82998g, this.f82999h, this.f83000i, this.f83001j);
    }

    public t withUri(Uri uri) {
        return new t(uri, this.f82993b, this.f82994c, this.f82995d, this.f82996e, this.f82997f, this.f82998g, this.f82999h, this.f83000i, this.f83001j);
    }

    public t(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, null, 0, null);
    }

    public t subrange(long j10, long j11) {
        if (j10 == 0 && this.f82998g == j11) {
            return this;
        }
        return new t(this.f82992a, this.f82993b, this.f82994c, this.f82995d, this.f82996e, this.f82997f + j10, j11, this.f82999h, this.f83000i, this.f83001j);
    }

    @Deprecated
    public t(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    @Deprecated
    public t(Uri uri, long j10, long j11, String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    @Deprecated
    public t(Uri uri, long j10, long j11, String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    @Deprecated
    public t(Uri uri, long j10, long j11, String str, int i10, Map<String, String> map) {
        this(uri, 1, null, j10, j10, j11, str, i10, map);
    }

    @Deprecated
    public t(Uri uri, long j10, long j11, long j12, String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    @Deprecated
    public t(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, bArr != null ? 2 : 1, bArr, j10, j11, j12, str, i10);
    }

    @Deprecated
    public t(Uri uri, int i10, byte[] bArr, long j10, long j11, long j12, String str, int i11) {
        this(uri, i10, bArr, j10, j11, j12, str, i11, Collections.EMPTY_MAP);
    }

    @Deprecated
    public t(Uri uri, int i10, byte[] bArr, long j10, long j11, long j12, String str, int i11, Map<String, String> map) {
        this(uri, j10 - j11, i10, bArr, map, j11, j12, str, i11, null);
    }

    public t(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        com.google.android.exoplayer2.util.a.checkArgument(j10 + j11 >= 0);
        com.google.android.exoplayer2.util.a.checkArgument(j11 >= 0);
        com.google.android.exoplayer2.util.a.checkArgument(j12 > 0 || j12 == -1);
        this.f82992a = uri;
        this.f82993b = j10;
        this.f82994c = i10;
        this.f82995d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f82996e = Collections.unmodifiableMap(new HashMap(map));
        this.f82997f = j11;
        this.f82998g = j12;
        this.f82999h = str;
        this.f83000i = i11;
        this.f83001j = obj;
    }
}
