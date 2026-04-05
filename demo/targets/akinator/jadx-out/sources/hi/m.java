package hi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m implements fk.g {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f58844a;

    /* renamed from: b, reason: collision with root package name */
    public final l f58845b;

    public m(g0 g0Var, ni.d dVar) {
        this.f58844a = g0Var;
        this.f58845b = new l(dVar);
    }

    public String getAppQualitySessionId(String str) {
        return this.f58845b.getAppQualitySessionId(str);
    }

    @Override // fk.g
    public fk.e getSessionSubscriberName() {
        return fk.e.f55731b;
    }

    @Override // fk.g
    public boolean isDataCollectionEnabled() {
        return this.f58844a.isAutomaticDataCollectionEnabled();
    }

    @Override // fk.g
    public void onSessionChanged(fk.f fVar) {
        ei.f.getLogger().d("App Quality Sessions session changed: " + fVar);
        this.f58845b.rotateAppQualitySessionId(fVar.getSessionId());
    }

    public void setSessionId(String str) {
        this.f58845b.rotateSessionId(str);
    }
}
