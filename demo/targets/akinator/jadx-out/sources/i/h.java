package i;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f59290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f59291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.a f59292c;

    public h(g gVar, String str, j.a aVar) {
        this.f59290a = gVar;
        this.f59291b = str;
        this.f59292c = aVar;
    }

    @Override // i.d
    public j.a getContract() {
        return this.f59292c;
    }

    @Override // i.d
    public void launch(Object obj, k3.h hVar) throws Exception {
        g gVar = this.f59290a;
        Map map = gVar.f59280b;
        String str = this.f59291b;
        Object obj2 = map.get(str);
        j.a aVar = this.f59292c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        gVar.f59282d.add(str);
        try {
            gVar.onLaunch(iIntValue, aVar, obj, hVar);
        } catch (Exception e10) {
            gVar.f59282d.remove(str);
            throw e10;
        }
    }

    @Override // i.d
    public void unregister() {
        this.f59290a.unregister$activity_release(this.f59291b);
    }
}
