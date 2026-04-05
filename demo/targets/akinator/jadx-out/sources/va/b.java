package va;

import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import java.util.ArrayList;
import java.util.Iterator;
import wa.h;
import ya.c;
import ya.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends IIgniteServiceCallback.Stub {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f89200c;

    public b(za.a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f89200c = arrayList;
        arrayList.add(aVar);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        cb.b.a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.f89200c.iterator();
        while (it.hasNext()) {
            h hVar = ((za.a) it.next()).f97733a;
            if (hVar != null) {
                cb.b.a("%s : on one dt error", "OneDTAuthenticator");
                hVar.f90503m.set(true);
                if (hVar.f90496f != null) {
                    cb.b.b("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        cb.b.a("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.f89200c.iterator();
        while (it.hasNext()) {
            h hVar = ((za.a) it.next()).f97733a;
            if (hVar != null) {
                if (TextUtils.isEmpty(str)) {
                    cb.b.a("%s : on one dt error", "OneDTAuthenticator");
                    hVar.f90503m.set(true);
                    if (hVar.f90496f != null) {
                        cb.b.b("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    ya.b.a(d.RAW_ONE_DT_ERROR, "error_code", c.ONE_DT_EMPTY_ENTITY.a());
                } else {
                    hVar.f90497g.a(str);
                    hVar.f90498h.getClass();
                    ua.c cVarA = db.b.a(str);
                    hVar.f90499i = cVarA;
                    ua.a aVar = hVar.f90496f;
                    if (aVar != null) {
                        cb.b.a("%s : setting one dt entity", "IgniteManager");
                        aVar.f88176b = cVarA;
                    }
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
