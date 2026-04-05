package io.ktor.http;

import e3.g;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpProtocolVersion {
    private final int major;
    private final int minor;
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final HttpProtocolVersion HTTP_2_0 = new HttpProtocolVersion("HTTP", 2, 0);
    private static final HttpProtocolVersion HTTP_1_1 = new HttpProtocolVersion("HTTP", 1, 1);
    private static final HttpProtocolVersion HTTP_1_0 = new HttpProtocolVersion("HTTP", 1, 0);
    private static final HttpProtocolVersion SPDY_3 = new HttpProtocolVersion("SPDY", 3, 0);
    private static final HttpProtocolVersion QUIC = new HttpProtocolVersion("QUIC", 1, 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final HttpProtocolVersion fromValue(String name, int i10, int i11) {
            e0.checkNotNullParameter(name, "name");
            return (e0.areEqual(name, "HTTP") && i10 == 1 && i11 == 0) ? getHTTP_1_0() : (e0.areEqual(name, "HTTP") && i10 == 1 && i11 == 1) ? getHTTP_1_1() : (e0.areEqual(name, "HTTP") && i10 == 2 && i11 == 0) ? getHTTP_2_0() : new HttpProtocolVersion(name, i10, i11);
        }

        public final HttpProtocolVersion getHTTP_1_0() {
            return HttpProtocolVersion.HTTP_1_0;
        }

        public final HttpProtocolVersion getHTTP_1_1() {
            return HttpProtocolVersion.HTTP_1_1;
        }

        public final HttpProtocolVersion getHTTP_2_0() {
            return HttpProtocolVersion.HTTP_2_0;
        }

        public final HttpProtocolVersion getQUIC() {
            return HttpProtocolVersion.QUIC;
        }

        public final HttpProtocolVersion getSPDY_3() {
            return HttpProtocolVersion.SPDY_3;
        }

        public final HttpProtocolVersion parse(CharSequence value) {
            e0.checkNotNullParameter(value, "value");
            List listSplit$default = n0.split$default(value, new String[]{"/", "."}, false, 0, 6, (Object) null);
            if (listSplit$default.size() != 3) {
                throw new IllegalStateException(("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: " + ((Object) value)).toString());
            }
            return fromValue((String) listSplit$default.get(0), Integer.parseInt((String) listSplit$default.get(1)), Integer.parseInt((String) listSplit$default.get(2)));
        }

        private Companion() {
        }
    }

    public HttpProtocolVersion(String name, int i10, int i11) {
        e0.checkNotNullParameter(name, "name");
        this.name = name;
        this.major = i10;
        this.minor = i11;
    }

    public static /* synthetic */ HttpProtocolVersion copy$default(HttpProtocolVersion httpProtocolVersion, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = httpProtocolVersion.name;
        }
        if ((i12 & 2) != 0) {
            i10 = httpProtocolVersion.major;
        }
        if ((i12 & 4) != 0) {
            i11 = httpProtocolVersion.minor;
        }
        return httpProtocolVersion.copy(str, i10, i11);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.major;
    }

    public final int component3() {
        return this.minor;
    }

    public final HttpProtocolVersion copy(String name, int i10, int i11) {
        e0.checkNotNullParameter(name, "name");
        return new HttpProtocolVersion(name, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpProtocolVersion)) {
            return false;
        }
        HttpProtocolVersion httpProtocolVersion = (HttpProtocolVersion) obj;
        return e0.areEqual(this.name, httpProtocolVersion.name) && this.major == httpProtocolVersion.major && this.minor == httpProtocolVersion.minor;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Integer.hashCode(this.minor) + g.d(this.major, this.name.hashCode() * 31, 31);
    }

    public String toString() {
        return this.name + '/' + this.major + '.' + this.minor;
    }
}
