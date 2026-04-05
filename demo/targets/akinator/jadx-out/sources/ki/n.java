package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final n f71354a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71355b = ui.e.of("type");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71356c = ui.e.of("reason");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71357d = ui.e.of(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS);

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71358e = ui.e.of("causedBy");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f71359f = ui.e.of("overflowCount");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.a.b.c cVar, ui.g gVar) throws IOException {
        gVar.add(f71355b, cVar.getType());
        gVar.add(f71356c, cVar.getReason());
        gVar.add(f71357d, cVar.getFrames());
        gVar.add(f71358e, cVar.getCausedBy());
        gVar.add(f71359f, cVar.getOverflowCount());
    }
}
