package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final r f71428a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71429b = ui.e.of("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71430c = ui.e.of("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71431d = ui.e.of("importance");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71432e = ui.e.of("defaultProcess");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.a.c cVar, ui.g gVar) throws IOException {
        gVar.add(f71429b, cVar.getProcessName());
        gVar.add(f71430c, cVar.getPid());
        gVar.add(f71431d, cVar.getImportance());
        gVar.add(f71432e, cVar.isDefaultProcess());
    }
}
