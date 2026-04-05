package md;

import j1.o2;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f74260a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f74261b = o2.s(1, ui.e.builder("logSource"));

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f74262c = o2.s(2, ui.e.builder("logEventDropped"));

    @Override // ui.f, ui.b
    public void encode(qd.i iVar, ui.g gVar) throws IOException {
        gVar.add(f74261b, iVar.getLogSource());
        gVar.add(f74262c, iVar.getLogEventDroppedList());
    }
}
