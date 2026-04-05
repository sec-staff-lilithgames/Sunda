package ll;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.a f73385a;

    /* renamed from: b, reason: collision with root package name */
    public final g f73386b;

    /* renamed from: c, reason: collision with root package name */
    public final f f73387c;

    public d(com.unity3d.scar.adapter.common.a aVar, f fVar) {
        this(aVar, null, fVar);
    }

    @Override // ll.a
    public void onFailure(String str) {
        this.f73387c.setErrorMessage(str);
        this.f73385a.leave();
    }

    @Override // ll.a
    public void onSuccess(String str, String str2, Object obj) {
        this.f73387c.addToSignalsMap(str, str2);
        g gVar = this.f73386b;
        if (gVar != null) {
            gVar.put(str, obj);
        }
        this.f73385a.leave();
    }

    public d(com.unity3d.scar.adapter.common.a aVar, g gVar, f fVar) {
        this.f73385a = aVar;
        this.f73386b = gVar;
        this.f73387c = fVar;
    }
}
