package dk;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f52350a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f52351b = ui.e.of("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f52352c = ui.e.of("variantId");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f52353d = ui.e.of("parameterKey");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f52354e = ui.e.of("parameterValue");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f52355f = ui.e.of("templateVersion");

    @Override // ui.f, ui.b
    public void encode(f fVar, ui.g gVar) throws IOException {
        gVar.add(f52351b, fVar.getRolloutId());
        gVar.add(f52352c, fVar.getVariantId());
        gVar.add(f52353d, fVar.getParameterKey());
        gVar.add(f52354e, fVar.getParameterValue());
        gVar.add(f52355f, fVar.getTemplateVersion());
    }
}
