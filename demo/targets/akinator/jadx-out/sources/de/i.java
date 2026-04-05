package de;

import android.os.SystemClock;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.util.n1;
import java.util.Collection;
import java.util.HashSet;
import nh.b5;
import nh.ej;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f52136a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.exoplayer2.drm.a f52137b;

    public i(com.google.android.exoplayer2.drm.b bVar) {
    }

    @Override // de.b
    public void onProvisionCompleted() {
        this.f52137b = null;
        HashSet hashSet = this.f52136a;
        b5 b5VarCopyOf = b5.copyOf((Collection) hashSet);
        hashSet.clear();
        ej it = b5VarCopyOf.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.drm.a aVar = (com.google.android.exoplayer2.drm.a) it.next();
            if (aVar.e()) {
                aVar.a(true);
            }
        }
    }

    @Override // de.b
    public void onProvisionError(Exception exc, boolean z10) {
        this.f52137b = null;
        HashSet hashSet = this.f52136a;
        b5 b5VarCopyOf = b5.copyOf((Collection) hashSet);
        hashSet.clear();
        ej it = b5VarCopyOf.iterator();
        while (it.hasNext()) {
            com.google.android.exoplayer2.drm.a aVar = (com.google.android.exoplayer2.drm.a) it.next();
            aVar.getClass();
            aVar.c(exc, z10 ? 1 : 3);
        }
    }

    public void onSessionFullyReleased(com.google.android.exoplayer2.drm.a aVar) {
        HashSet hashSet = this.f52136a;
        hashSet.remove(aVar);
        if (this.f52137b == aVar) {
            this.f52137b = null;
            if (hashSet.isEmpty()) {
                return;
            }
            com.google.android.exoplayer2.drm.a aVar2 = (com.google.android.exoplayer2.drm.a) hashSet.iterator().next();
            this.f52137b = aVar2;
            aVar2.f27400y = aVar2.f27377b.getProvisionRequest();
            a.HandlerC0158a handlerC0158a = (a.HandlerC0158a) n1.castNonNull(aVar2.f27394s);
            Object objCheckNotNull = com.google.android.exoplayer2.util.a.checkNotNull(aVar2.f27400y);
            handlerC0158a.getClass();
            handlerC0158a.obtainMessage(0, new a.b(bf.t.getNewId(), true, SystemClock.elapsedRealtime(), objCheckNotNull)).sendToTarget();
        }
    }

    @Override // de.b
    public void provisionRequired(com.google.android.exoplayer2.drm.a aVar) {
        this.f52136a.add(aVar);
        if (this.f52137b != null) {
            return;
        }
        this.f52137b = aVar;
        aVar.f27400y = aVar.f27377b.getProvisionRequest();
        a.HandlerC0158a handlerC0158a = (a.HandlerC0158a) n1.castNonNull(aVar.f27394s);
        Object objCheckNotNull = com.google.android.exoplayer2.util.a.checkNotNull(aVar.f27400y);
        handlerC0158a.getClass();
        handlerC0158a.obtainMessage(0, new a.b(bf.t.getNewId(), true, SystemClock.elapsedRealtime(), objCheckNotNull)).sendToTarget();
    }
}
