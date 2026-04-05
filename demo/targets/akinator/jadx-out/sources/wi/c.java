package wi;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements ui.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f90629a;

    public c(e eVar) {
        this.f90629a = eVar;
    }

    @Override // ui.a
    public void encode(Object obj, Writer writer) throws IOException {
        e eVar = this.f90629a;
        f fVar = new f(writer, eVar.f90635a, eVar.f90636b, eVar.f90637c, eVar.f90638d);
        fVar.a(obj, false);
        fVar.b();
        fVar.f90641c.flush();
    }

    @Override // ui.a
    public String encode(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            encode(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
