package ki;

import io.ktor.http.ContentDisposition;
import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final l f71330a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71331b = ui.e.of("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71332c = ui.e.of(ContentDisposition.Parameters.Size);

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71333d = ui.e.of("name");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71334e = ui.e.of("uuid");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.a.b.AbstractC0719a abstractC0719a, ui.g gVar) throws IOException {
        gVar.add(f71331b, abstractC0719a.getBaseAddress());
        gVar.add(f71332c, abstractC0719a.getSize());
        gVar.add(f71333d, abstractC0719a.getName());
        gVar.add(f71334e, abstractC0719a.getUuidUtf8Bytes());
    }
}
