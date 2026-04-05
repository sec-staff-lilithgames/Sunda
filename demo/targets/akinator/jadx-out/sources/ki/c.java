package ki;

import com.ironsource.C3191e4;
import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final c f71159a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71160b = ui.e.of(C3191e4.h.W);

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71161c = ui.e.of("value");

    @Override // ui.f, ui.b
    public void encode(f2.c cVar, ui.g gVar) throws IOException {
        gVar.add(f71160b, cVar.getKey());
        gVar.add(f71161c, cVar.getValue());
    }
}
