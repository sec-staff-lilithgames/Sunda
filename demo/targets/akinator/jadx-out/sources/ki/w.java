package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final w f71496a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71497b = ui.e.of("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71498c = ui.e.of("variantId");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.AbstractC0731e.b bVar, ui.g gVar) throws IOException {
        gVar.add(f71497b, bVar.getRolloutId());
        gVar.add(f71498c, bVar.getVariantId());
    }
}
