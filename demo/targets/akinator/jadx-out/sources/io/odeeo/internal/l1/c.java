package io.odeeo.internal.l1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    @lk.c("name")
    private final String name;

    @lk.c("uri")
    private final String uri;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ c copy$default(c cVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.name;
        }
        if ((i10 & 2) != 0) {
            str2 = cVar.uri;
        }
        return cVar.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.uri;
    }

    public final c copy(String name, String uri) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(uri, "uri");
        return new c(name, uri);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e0.areEqual(this.name, cVar.name) && e0.areEqual(this.uri, cVar.uri);
    }

    public final String getName() {
        return this.name;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrackingEvent(name=");
        sb2.append(this.name);
        sb2.append(", uri=");
        return o2.q(sb2, this.uri, ')');
    }

    public c(String name, String uri) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(uri, "uri");
        this.name = name;
        this.uri = uri;
    }

    public /* synthetic */ c(String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
