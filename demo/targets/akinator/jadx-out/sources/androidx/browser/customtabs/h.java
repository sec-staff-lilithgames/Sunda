package androidx.browser.customtabs;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Pair;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.util.c0;
import com.inmobi.media.GestureDetectorOnGestureListenerC3093yc;
import com.inmobi.media.O1;
import io.bidmachine.media3.common.util.y;
import io.bidmachine.media3.exoplayer.i1;
import io.odeeo.internal.f.g;
import io.odeeo.internal.q0.o;
import j.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import nh.b5;
import sh.n1;
import sh.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5228c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5230f;

    public /* synthetic */ h(Object obj, int i10, Object obj2, int i11) {
        this.f5227b = i11;
        this.f5229e = obj;
        this.f5228c = i10;
        this.f5230f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5227b) {
            case 0:
                ((u.c) ((u.a) this.f5229e)).onNavigationEvent(this.f5228c, (Bundle) this.f5230f);
                break;
            case 1:
                ((MaxAdPlacer) this.f5229e).a(this.f5228c, (Collection) this.f5230f);
                break;
            case 2:
                f2.a aVar = (f2.a) this.f5229e;
                Pair pair = (Pair) this.f5230f;
                aVar.f27478c.f27472h.onDrmSessionAcquired(((Integer) pair.first).intValue(), (bf.d0) pair.second, this.f5228c);
                break;
            case 3:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f5229e;
                int i10 = this.f5228c;
                com.google.android.exoplayer2.util.a0 a0Var = (com.google.android.exoplayer2.util.a0) this.f5230f;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ((c0.a) it.next()).invoke(i10, a0Var);
                }
                break;
            case 4:
                io.odeeo.internal.q0.o.a((CopyOnWriteArraySet) this.f5229e, this.f5228c, (o.a) this.f5230f);
                break;
            case 5:
                de.p pVar = (de.p) this.f5229e;
                de.q qVar = (de.q) this.f5230f;
                int i11 = this.f5228c;
                int i12 = pVar.f52159a;
                bf.d0 d0Var = pVar.f52160b;
                qVar.onDrmSessionAcquired(i12, d0Var);
                qVar.onDrmSessionAcquired(i12, d0Var, i11);
                break;
            case 6:
                ((f.l) this.f5229e).dispatchResult(this.f5228c, ((a.C0708a) this.f5230f).getValue());
                break;
            case 7:
                ((f.l) this.f5229e).dispatchResult(this.f5228c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f5230f));
                break;
            case 8:
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.f5229e;
                int i13 = this.f5228c;
                io.bidmachine.media3.common.util.w wVar = (io.bidmachine.media3.common.util.w) this.f5230f;
                Iterator it2 = copyOnWriteArraySet2.iterator();
                while (it2.hasNext()) {
                    ((y.a) it2.next()).invoke(i13, wVar);
                }
                break;
            case 9:
                i1.a aVar2 = (i1.a) this.f5229e;
                Pair pair2 = (Pair) this.f5230f;
                i1.this.f61260h.onDrmSessionAcquired(((Integer) pair2.first).intValue(), (ao.k0) pair2.second, this.f5228c);
                break;
            case 10:
                n5.a aVar3 = (n5.a) this.f5229e;
                aVar3.f75636c.onResultReceived(this.f5228c, this.f5230f);
                break;
            case 11:
                ((g.a) this.f5229e).a((io.odeeo.internal.f.g) this.f5230f, this.f5228c);
                break;
            case 12:
                ((sh.z) this.f5229e).s(this.f5228c, (n1) this.f5230f);
                break;
            case 13:
                z0 z0Var = (z0) this.f5229e;
                b5 b5Var = (b5) this.f5230f;
                int i14 = this.f5228c;
                n1 n1Var = z0Var.f85893d[i14];
                Objects.requireNonNull(n1Var);
                z0Var.f85893d[i14] = null;
                for (int i15 = z0Var.f85894e; i15 < b5Var.size(); i15++) {
                    if (((sh.k) b5Var.get(i15)).setFuture(n1Var)) {
                        z0Var.a();
                        z0Var.f85894e = i15 + 1;
                        break;
                    }
                }
                z0Var.f85894e = b5Var.size();
                break;
            case 14:
                sn.q qVar2 = (sn.q) this.f5229e;
                ((sn.r) this.f5230f).onDrmSessionAcquired(qVar2.f86034a, qVar2.f86035b, this.f5228c);
                break;
            default:
                O1.a((O1) this.f5229e, (GestureDetectorOnGestureListenerC3093yc) this.f5230f, this.f5228c);
                break;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i10, int i11) {
        this.f5227b = i11;
        this.f5229e = obj;
        this.f5230f = obj2;
        this.f5228c = i10;
    }
}
