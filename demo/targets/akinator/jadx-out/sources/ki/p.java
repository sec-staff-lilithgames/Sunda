package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final p f71402a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71403b = ui.e.of("name");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71404c = ui.e.of("importance");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71405d = ui.e.of(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

    @Override // ui.f, ui.b
    public void encode(f2.e.d.a.b.AbstractC0725e abstractC0725e, ui.g gVar) throws IOException {
        gVar.add(f71403b, abstractC0725e.getName());
        gVar.add(f71404c, abstractC0725e.getImportance());
        gVar.add(f71405d, abstractC0725e.getFrames());
    }
}
