package i;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f59293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f59294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j.a f59295c;

    public i(g gVar, String str, j.a aVar) {
        this.f59293a = gVar;
        this.f59294b = str;
        this.f59295c = aVar;
    }

    @Override // i.d
    public j.a getContract() {
        return this.f59295c;
    }

    @Override // i.d
    public void launch(Object obj, k3.h hVar) throws Exception {
        g gVar = this.f59293a;
        Map map = gVar.f59280b;
        String str = this.f59294b;
        Object obj2 = map.get(str);
        j.a aVar = this.f59295c;
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
        this.f59293a.unregister$activity_release(this.f59294b);
    }
}
