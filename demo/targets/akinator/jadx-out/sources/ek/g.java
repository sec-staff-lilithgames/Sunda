package ek;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final g f54519a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f54520b = ui.e.of("eventType");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f54521c = ui.e.of("sessionData");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f54522d = ui.e.of("applicationInfo");

    @Override // ui.f, ui.b
    public void encode(y0 y0Var, ui.g gVar) throws IOException {
        gVar.add(f54520b, y0Var.getEventType());
        gVar.add(f54521c, y0Var.getSessionData());
        gVar.add(f54522d, y0Var.getApplicationInfo());
    }
}
