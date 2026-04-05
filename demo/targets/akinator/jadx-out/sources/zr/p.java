package zr;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum p {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: b, reason: collision with root package name */
    public final String f98513b;

    p(String str) {
        this.f98513b = str;
    }

    public static p get(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return HTTP_1_1;
        }
        if (str.equals("h2")) {
            return HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return SPDY_3;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f98513b;
    }
}
