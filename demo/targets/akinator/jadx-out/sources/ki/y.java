package ki;

import com.ironsource.Q6;
import java.io.IOException;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y implements ui.f {

    /* renamed from: a, reason: collision with root package name */
    public static final y f71521a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final ui.e f71522b = ui.e.of(Q6.H);

    /* renamed from: c, reason: collision with root package name */
    public static final ui.e f71523c = ui.e.of("version");

    /* renamed from: d, reason: collision with root package name */
    public static final ui.e f71524d = ui.e.of("buildVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final ui.e f71525e = ui.e.of("jailbroken");

    @Override // ui.f, ui.b
    public void encode(f2.e.AbstractC0732e abstractC0732e, ui.g gVar) throws IOException {
        gVar.add(f71522b, abstractC0732e.getPlatform());
        gVar.add(f71523c, abstractC0732e.getVersion());
        gVar.add(f71524d, abstractC0732e.getBuildVersion());
        gVar.add(f71525e, abstractC0732e.isJailbroken());
    }
}
