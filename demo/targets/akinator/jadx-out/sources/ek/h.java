package ek;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final h f54529a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f54530b = ui.e.of(JsonStorageKeyNames.SESSION_ID_KEY);

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f54531c = ui.e.of("firstSessionId");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f54532d = ui.e.of("sessionIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f54533e = ui.e.of("eventTimestampUs");

    /* renamed from: f, reason: collision with root package name */
    public static final ui.e f54534f = ui.e.of("dataCollectionStatus");

    /* renamed from: g, reason: collision with root package name */
    public static final ui.e f54535g = ui.e.of("firebaseInstallationId");

    /* renamed from: h, reason: collision with root package name */
    public static final ui.e f54536h = ui.e.of("firebaseAuthenticationToken");

    @Override // ui.f, ui.b
    public void encode(h1 h1Var, ui.g gVar) throws IOException {
        gVar.add(f54530b, h1Var.getSessionId());
        gVar.add(f54531c, h1Var.getFirstSessionId());
        gVar.add(f54532d, h1Var.getSessionIndex());
        gVar.add(f54533e, h1Var.getEventTimestampUs());
        gVar.add(f54534f, h1Var.getDataCollectionStatus());
        gVar.add(f54535g, h1Var.getFirebaseInstallationId());
        gVar.add(f54536h, h1Var.getFirebaseAuthenticationToken());
    }
}
