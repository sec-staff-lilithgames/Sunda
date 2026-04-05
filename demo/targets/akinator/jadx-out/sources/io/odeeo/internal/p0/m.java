package io.odeeo.internal.p0;

import android.net.Uri;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f65626a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65627b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65628c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f65629d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f65630e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f65631f;

    /* renamed from: g, reason: collision with root package name */
    public final long f65632g;

    /* renamed from: h, reason: collision with root package name */
    public final long f65633h;

    /* renamed from: i, reason: collision with root package name */
    public final String f65634i;

    /* renamed from: j, reason: collision with root package name */
    public final int f65635j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f65636k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Uri f65637a;

        /* renamed from: b, reason: collision with root package name */
        public long f65638b;

        /* renamed from: c, reason: collision with root package name */
        public int f65639c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f65640d;

        /* renamed from: e, reason: collision with root package name */
        public Map<String, String> f65641e;

        /* renamed from: f, reason: collision with root package name */
        public long f65642f;

        /* renamed from: g, reason: collision with root package name */
        public long f65643g;

        /* renamed from: h, reason: collision with root package name */
        public String f65644h;

        /* renamed from: i, reason: collision with root package name */
        public int f65645i;

        /* renamed from: j, reason: collision with root package name */
        public Object f65646j;

        public m build() {
            io.odeeo.internal.q0.a.checkStateNotNull(this.f65637a, "The uri must be set.");
            return new m(this.f65637a, this.f65638b, this.f65639c, this.f65640d, this.f65641e, this.f65642f, this.f65643g, this.f65644h, this.f65645i, this.f65646j);
        }

        public b setCustomData(Object obj) {
            this.f65646j = obj;
            return this;
        }

        public b setFlags(int i10) {
            this.f65645i = i10;
            return this;
        }

        public b setHttpBody(byte[] bArr) {
            this.f65640d = bArr;
            return this;
        }

        public b setHttpMethod(int i10) {
            this.f65639c = i10;
            return this;
        }

        public b setHttpRequestHeaders(Map<String, String> map) {
            this.f65641e = map;
            return this;
        }

        public b setKey(String str) {
            this.f65644h = str;
            return this;
        }

        public b setLength(long j10) {
            this.f65643g = j10;
            return this;
        }

        public b setPosition(long j10) {
            this.f65642f = j10;
            return this;
        }

        public b setUri(String str) {
            this.f65637a = Uri.parse(str);
            return this;
        }

        public b setUriPositionOffset(long j10) {
            this.f65638b = j10;
            return this;
        }

        public b() {
            this.f65639c = 1;
            this.f65641e = Collections.EMPTY_MAP;
            this.f65643g = -1L;
        }

        public b setUri(Uri uri) {
            this.f65637a = uri;
            return this;
        }

        public b(m mVar) {
            this.f65637a = mVar.f65626a;
            this.f65638b = mVar.f65627b;
            this.f65639c = mVar.f65628c;
            this.f65640d = mVar.f65629d;
            this.f65641e = mVar.f65630e;
            this.f65642f = mVar.f65632g;
            this.f65643g = mVar.f65633h;
            this.f65644h = mVar.f65634i;
            this.f65645i = mVar.f65635j;
            this.f65646j = mVar.f65636k;
        }
    }

    static {
        io.odeeo.internal.b.r.registerModule("goog.exo.datasource");
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

    public b buildUpon() {
        return new b();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.f65628c);
    }

    public boolean isFlagSet(int i10) {
        return (this.f65635j & i10) == i10;
    }

    public m subrange(long j10) {
        long j11 = this.f65633h;
        return subrange(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(getHttpMethodString());
        sb2.append(" ");
        sb2.append(this.f65626a);
        sb2.append(", ");
        sb2.append(this.f65632g);
        sb2.append(", ");
        sb2.append(this.f65633h);
        sb2.append(", ");
        sb2.append(this.f65634i);
        sb2.append(", ");
        return a.b.f(this.f65635j, C3191e4.i.f36531e, sb2);
    }

    public m withAdditionalHeaders(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f65630e);
        map2.putAll(map);
        return new m(this.f65626a, this.f65627b, this.f65628c, this.f65629d, map2, this.f65632g, this.f65633h, this.f65634i, this.f65635j, this.f65636k);
    }

    public m withRequestHeaders(Map<String, String> map) {
        return new m(this.f65626a, this.f65627b, this.f65628c, this.f65629d, map, this.f65632g, this.f65633h, this.f65634i, this.f65635j, this.f65636k);
    }

    public m withUri(Uri uri) {
        return new m(uri, this.f65627b, this.f65628c, this.f65629d, this.f65630e, this.f65632g, this.f65633h, this.f65634i, this.f65635j, this.f65636k);
    }

    public m(Uri uri) {
        this(uri, 0L, -1L);
    }

    public m subrange(long j10, long j11) {
        return (j10 == 0 && this.f65633h == j11) ? this : new m(this.f65626a, this.f65627b, this.f65628c, this.f65629d, this.f65630e, this.f65632g + j10, j11, this.f65634i, this.f65635j, this.f65636k);
    }

    public m(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, null, 0, null);
    }

    @Deprecated
    public m(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    @Deprecated
    public m(Uri uri, long j10, long j11, String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    @Deprecated
    public m(Uri uri, long j10, long j11, String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    @Deprecated
    public m(Uri uri, long j10, long j11, String str, int i10, Map<String, String> map) {
        this(uri, 1, null, j10, j10, j11, str, i10, map);
    }

    @Deprecated
    public m(Uri uri, long j10, long j11, long j12, String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    @Deprecated
    public m(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, bArr != null ? 2 : 1, bArr, j10, j11, j12, str, i10);
    }

    @Deprecated
    public m(Uri uri, int i10, byte[] bArr, long j10, long j11, long j12, String str, int i11) {
        this(uri, i10, bArr, j10, j11, j12, str, i11, Collections.EMPTY_MAP);
    }

    @Deprecated
    public m(Uri uri, int i10, byte[] bArr, long j10, long j11, long j12, String str, int i11, Map<String, String> map) {
        this(uri, j10 - j11, i10, bArr, map, j11, j12, str, i11, null);
    }

    public m(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        io.odeeo.internal.q0.a.checkArgument(j13 >= 0);
        io.odeeo.internal.q0.a.checkArgument(j11 >= 0);
        io.odeeo.internal.q0.a.checkArgument(j12 > 0 || j12 == -1);
        this.f65626a = uri;
        this.f65627b = j10;
        this.f65628c = i10;
        this.f65629d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f65630e = Collections.unmodifiableMap(new HashMap(map));
        this.f65632g = j11;
        this.f65631f = j13;
        this.f65633h = j12;
        this.f65634i = str;
        this.f65635j = i11;
        this.f65636k = obj;
    }
}
