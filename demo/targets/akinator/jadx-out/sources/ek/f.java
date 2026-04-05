package ek;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f54508a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f54509b = ui.e.of("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f54510c = ui.e.of("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f54511d = ui.e.of("importance");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f54512e = ui.e.of("defaultProcess");

    @Override // ui.f, ui.b
    public void encode(q0 q0Var, ui.g gVar) throws IOException {
        gVar.add(f54509b, q0Var.getProcessName());
        gVar.add(f54510c, q0Var.getPid());
        gVar.add(f54511d, q0Var.getImportance());
        gVar.add(f54512e, q0Var.isDefaultProcess());
    }
}
