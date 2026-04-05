package ki;

import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final v f71483a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71484b = ui.e.of("rolloutVariant");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71485c = ui.e.of("parameterKey");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71486d = ui.e.of("parameterValue");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71487e = ui.e.of("templateVersion");

    @Override // ui.f, ui.b
    public void encode(f2.e.d.AbstractC0731e abstractC0731e, ui.g gVar) throws IOException {
        gVar.add(f71484b, abstractC0731e.getRolloutVariant());
        gVar.add(f71485c, abstractC0731e.getParameterKey());
        gVar.add(f71486d, abstractC0731e.getParameterValue());
        gVar.add(f71487e, abstractC0731e.getTemplateVersion());
    }
}
