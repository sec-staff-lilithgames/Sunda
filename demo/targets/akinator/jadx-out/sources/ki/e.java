package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f71222a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71223b = ui.e.of("files");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71224c = ui.e.of("orgId");

    @Override // ui.f, ui.b
    public void encode(f2.d dVar, ui.g gVar) throws IOException {
        gVar.add(f71223b, dVar.getFiles());
        gVar.add(f71224c, dVar.getOrgId());
    }
}
