package io.odeeo.internal.l1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    @lk.c("api_framework")
    private final String apiFramework;

    @lk.c("uri")
    private final String uri;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ b copy$default(b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.apiFramework;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.uri;
        }
        return bVar.copy(str, str2);
    }

    public final String component1() {
        return this.apiFramework;
    }

    public final String component2() {
        return this.uri;
    }

    public final b copy(String apiFramework, String uri) {
        e0.checkNotNullParameter(apiFramework, "apiFramework");
        e0.checkNotNullParameter(uri, "uri");
        return new b(apiFramework, uri);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return e0.areEqual(this.apiFramework, bVar.apiFramework) && e0.areEqual(this.uri, bVar.uri);
    }

    public final String getApiFramework() {
        return this.apiFramework;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() + (this.apiFramework.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JavascriptResource(apiFramework=");
        sb2.append(this.apiFramework);
        sb2.append(", uri=");
        return o2.q(sb2, this.uri, ')');
    }

    public b(String apiFramework, String uri) {
        e0.checkNotNullParameter(apiFramework, "apiFramework");
        e0.checkNotNullParameter(uri, "uri");
        this.apiFramework = apiFramework;
        this.uri = uri;
    }

    public /* synthetic */ b(String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
