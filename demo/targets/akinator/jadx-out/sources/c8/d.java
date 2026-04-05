package c8;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static y7.a a(d8.c cVar, r7.h hVar) {
        return new y7.a(u.a(cVar, hVar, 1.0f, g.f11881a, false));
    }

    public static y7.d b(d8.c cVar, r7.h hVar) {
        return new y7.d(u.a(cVar, hVar, 1.0f, r.f11913a, false));
    }

    public static y7.f c(d8.c cVar, r7.h hVar) {
        return new y7.f(u.a(cVar, hVar, e8.n.dpScale(), z.f11929a, true));
    }

    public static y7.b parseFloat(d8.c cVar, r7.h hVar) throws IOException {
        return parseFloat(cVar, hVar, true);
    }

    public static y7.b parseFloat(d8.c cVar, r7.h hVar, boolean z10) throws IOException {
        return new y7.b(u.a(cVar, hVar, z10 ? e8.n.dpScale() : 1.0f, l.f11903a, false));
    }
}
