package ji;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f69570a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f69571b = ui.e.of("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f69572c = ui.e.of("parameterKey");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f69573d = ui.e.of("parameterValue");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f69574e = ui.e.of("variantId");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f69575f = ui.e.of("templateVersion");

    @Override // ui.f, ui.b
    public void encode(r rVar, ui.g gVar) throws IOException {
        gVar.add(f69571b, rVar.getRolloutId());
        gVar.add(f69572c, rVar.getParameterKey());
        gVar.add(f69573d, rVar.getParameterValue());
        gVar.add(f69574e, rVar.getVariantId());
        gVar.add(f69575f, rVar.getTemplateVersion());
    }
}
