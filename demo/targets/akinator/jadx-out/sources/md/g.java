package md;

import j1.o2;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final g f74275a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f74276b = o2.s(1, ui.e.builder("startMs"));

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f74277c = o2.s(2, ui.e.builder("endMs"));

    @Override // ui.f, ui.b
    public void encode(qd.m mVar, ui.g gVar) throws IOException {
        gVar.add(f74276b, mVar.getStartMs());
        gVar.add(f74277c, mVar.getEndMs());
    }
}
