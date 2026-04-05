package wa;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f90471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f90472c;

    public c(e eVar, d dVar) {
        this.f90472c = eVar;
        this.f90471b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xa.a aVarA;
        e eVar = this.f90472c;
        if (eVar.a()) {
            try {
                aVarA = db.a.a(new JSONObject(eVar.f90485l.version()));
            } catch (Exception e10) {
                ya.b.a(ya.d.ONE_DT_GENERAL_ERROR, e10);
                cb.b.b("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e10.toString());
            }
        } else {
            aVarA = new xa.a(false, "");
        }
        eVar.f90484k = aVarA;
        eb.c.f54000b.post(this.f90471b);
    }
}
