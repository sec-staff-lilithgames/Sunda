package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final x f71506a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71507b = ui.e.of("assignments");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.f fVar, ui.g gVar) throws IOException {
        gVar.add(f71507b, fVar.getRolloutAssignments());
    }
}
