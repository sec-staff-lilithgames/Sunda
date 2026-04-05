package ki;

import io.ktor.http.ContentDisposition;
import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f71242a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71243b = ui.e.of(ContentDisposition.Parameters.FileName);

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71244c = ui.e.of("contents");

    @Override // ui.f, ui.b
    public void encode(f2.d.b bVar, ui.g gVar) throws IOException {
        gVar.add(f71243b, bVar.getFilename());
        gVar.add(f71244c, bVar.getContents());
    }
}
