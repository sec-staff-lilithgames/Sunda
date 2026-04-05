package wi;

import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90627a;

    public /* synthetic */ a(int i10) {
        this.f90627a = i10;
    }

    @Override // ui.f, ui.b
    public final void encode(Object obj, Object obj2) throws IOException {
        switch (this.f90627a) {
            case 0:
                a aVar = e.f90631e;
                throw new ui.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ui.g gVar = (ui.g) obj2;
                gVar.add(xi.g.f92006g, entry.getKey());
                gVar.add(xi.g.f92007h, entry.getValue());
                return;
            default:
                throw new ui.c("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
