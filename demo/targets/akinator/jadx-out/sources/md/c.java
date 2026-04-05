package md;

import j1.o2;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final c f74257a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f74258b = o2.s(1, ui.e.builder("eventsDroppedCount"));

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f74259c = o2.s(3, ui.e.builder("reason"));

    @Override // ui.f, ui.b
    public void encode(qd.g gVar, ui.g gVar2) throws IOException {
        gVar2.add(f74258b, gVar.getEventsDroppedCount());
        gVar2.add(f74259c, gVar.getReason());
    }
}
