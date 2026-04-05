package sn;

import android.os.SystemClock;
import io.bidmachine.media3.common.util.a1;
import java.util.Collection;
import java.util.HashSet;
import nh.b5;
import nh.ej;
import sn.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f85986a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public d f85987b;

    public j(l lVar) {
    }

    @Override // sn.b
    public void onProvisionCompleted() {
        this.f85987b = null;
        HashSet hashSet = this.f85986a;
        b5 b5VarCopyOf = b5.copyOf((Collection) hashSet);
        hashSet.clear();
        ej it = b5VarCopyOf.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.e()) {
                dVar.a(true);
            }
        }
    }

    @Override // sn.b
    public void onProvisionError(Exception exc, boolean z10) {
        this.f85987b = null;
        HashSet hashSet = this.f85986a;
        b5 b5VarCopyOf = b5.copyOf((Collection) hashSet);
        hashSet.clear();
        ej it = b5VarCopyOf.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.getClass();
            dVar.c(exc, z10 ? 1 : 3);
        }
    }

    public void onSessionFullyReleased(d dVar) {
        HashSet hashSet = this.f85986a;
        hashSet.remove(dVar);
        if (this.f85987b == dVar) {
            this.f85987b = null;
            if (hashSet.isEmpty()) {
                return;
            }
            d dVar2 = (d) hashSet.iterator().next();
            this.f85987b = dVar2;
            dVar2.f85961y = dVar2.f85938b.getProvisionRequest();
            d.a aVar = (d.a) a1.castNonNull(dVar2.f85955s);
            Object objCheckNotNull = io.bidmachine.media3.common.util.a.checkNotNull(dVar2.f85961y);
            aVar.getClass();
            aVar.obtainMessage(1, new d.b(ao.b0.getNewId(), true, SystemClock.elapsedRealtime(), objCheckNotNull)).sendToTarget();
        }
    }

    @Override // sn.b
    public void provisionRequired(d dVar) {
        this.f85986a.add(dVar);
        if (this.f85987b != null) {
            return;
        }
        this.f85987b = dVar;
        dVar.f85961y = dVar.f85938b.getProvisionRequest();
        d.a aVar = (d.a) a1.castNonNull(dVar.f85955s);
        Object objCheckNotNull = io.bidmachine.media3.common.util.a.checkNotNull(dVar.f85961y);
        aVar.getClass();
        aVar.obtainMessage(1, new d.b(ao.b0.getNewId(), true, SystemClock.elapsedRealtime(), objCheckNotNull)).sendToTarget();
    }
}
