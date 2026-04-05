package ld;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g0 {
    public static g0 create(List<p0> list) {
        return new o(list);
    }

    public static ui.a createDataEncoder() {
        return new wi.e().configureWith(l.f73260a).ignoreNullValues(true).build();
    }

    public abstract List<p0> getLogRequests();
}
