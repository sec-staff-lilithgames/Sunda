package ei;

import bi.y;
import java.util.concurrent.atomic.AtomicReference;
import ki.h2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: c, reason: collision with root package name */
    public static final b f54397c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final sj.b f54398a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f54399b = new AtomicReference(null);

    public c(sj.b bVar) {
        this.f54398a = bVar;
        ((y) bVar).whenAvailable(new af.g(this, 23));
    }

    @Override // ei.a
    public g getSessionFileProvider(String str) {
        a aVar = (a) this.f54399b.get();
        return aVar == null ? f54397c : aVar.getSessionFileProvider(str);
    }

    @Override // ei.a
    public boolean hasCrashDataForCurrentSession() {
        a aVar = (a) this.f54399b.get();
        return aVar != null && aVar.hasCrashDataForCurrentSession();
    }

    @Override // ei.a
    public boolean hasCrashDataForSession(String str) {
        a aVar = (a) this.f54399b.get();
        return aVar != null && aVar.hasCrashDataForSession(str);
    }

    @Override // ei.a
    public void prepareNativeSession(String str, String str2, long j10, h2 h2Var) {
        f.getLogger().v("Deferring native open session: " + str);
        ((y) this.f54398a).whenAvailable(new ci.b(str, str2, j10, h2Var, 2));
    }
}
