package nd;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.localbroadcastmanager.content.b f75998a;

    /* renamed from: b, reason: collision with root package name */
    public final k f75999b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f76000c;

    public m(Context context, k kVar) {
        androidx.localbroadcastmanager.content.b bVar = new androidx.localbroadcastmanager.content.b(context, 11);
        this.f76000c = new HashMap();
        this.f75998a = bVar;
        this.f75999b = kVar;
    }

    @Override // nd.f
    public synchronized o get(String str) {
        if (this.f76000c.containsKey(str)) {
            return (o) this.f76000c.get(str);
        }
        e eVarB = this.f75998a.b(str);
        if (eVarB == null) {
            return null;
        }
        k kVar = this.f75999b;
        o oVarCreate = eVarB.create(j.create(kVar.f75992a, kVar.f75993b, kVar.f75994c, str));
        this.f76000c.put(str, oVarCreate);
        return oVarCreate;
    }
}
