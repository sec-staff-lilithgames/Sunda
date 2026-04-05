package ao;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.applovin.impl.i2;
import com.applovin.impl.i8;
import com.applovin.impl.o2;
import com.applovin.impl.p2;
import com.applovin.impl.privacy.cmp.a;
import com.applovin.impl.q4;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityInitCallback;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import fo.e;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import nh.we;
import o9.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class q0 implements io.bidmachine.media3.common.util.k, q4.b, p2.a, ConsentInformation.OnConsentInfoUpdateSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener, SuccessContinuation, MolocoInitializationListener, t3.f, fo.i, Continuation, o.a, w2.l, OnSuccessListener, sj.a, wd.b, vd.n, PurchasesResponseListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7781c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7783f;

    public /* synthetic */ q0(Object obj, int i10, Object obj2, Object obj3) {
        this.f7780b = i10;
        this.f7781c = obj;
        this.f7782e = obj2;
        this.f7783f = obj3;
    }

    @Override // com.applovin.impl.p2.a
    public void a(i2 i2Var, o2 o2Var) {
        switch (this.f7780b) {
            case 2:
                ((com.applovin.impl.p) this.f7781c).a((com.applovin.impl.sdk.k) this.f7782e, (com.applovin.impl.n) this.f7783f, i2Var, o2Var);
                break;
            default:
                ((com.applovin.impl.q) this.f7781c).a((List) this.f7782e, (com.applovin.impl.sdk.k) this.f7783f, i2Var, o2Var);
                break;
        }
    }

    @Override // io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h
    public void accept(Object obj) {
        r0 r0Var = (r0) this.f7781c;
        ((s0) obj).onUpstreamDiscarded(r0Var.f7805a, (k0) this.f7782e, (g0) this.f7783f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[PHI: r8
      0x0038: PHI (r8v26 qd.f) = (r8v19 qd.f), (r8v20 qd.f), (r8v21 qd.f), (r8v22 qd.f), (r8v23 qd.f), (r8v24 qd.f) binds: [B:11:0x0036, B:14:0x0040, B:17:0x0049, B:20:0x0052, B:23:0x005b, B:26:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // vd.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.q0.apply(java.lang.Object):java.lang.Object");
    }

    @Override // w2.l
    public Object attachCompleter(w2.j completer) {
        switch (this.f7780b) {
            case 12:
                Executor executor = (Executor) this.f7781c;
                String str = (String) this.f7782e;
                kv.a aVar = (kv.a) this.f7783f;
                kotlin.jvm.internal.e0.checkNotNullParameter(completer, "completer");
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                completer.addCancellationListener(new n6.t(atomicBoolean, 0), n6.l.f75753b);
                executor.execute(new n6.u(atomicBoolean, completer, aVar, 0));
                return str;
            default:
                zu.m mVar = (zu.m) this.f7781c;
                CoroutineStart coroutineStart = (CoroutineStart) this.f7782e;
                kv.p pVar = (kv.p) this.f7783f;
                kotlin.jvm.internal.e0.checkNotNullParameter(completer, "completer");
                completer.addCancellationListener(new ji.t((Job) mVar.get(Job.Key), 7), n6.l.f75753b);
                return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(mVar), null, coroutineStart, new n6.v(pVar, completer, null), 1, null);
        }
    }

    @Override // fo.i
    public List create(int i10, gn.v1 v1Var, int[] iArr) {
        fo.g gVar = (fo.g) this.f7781c;
        String str = (String) this.f7782e;
        String str2 = (String) this.f7783f;
        we weVar = fo.e.f55823j;
        return e.g.createForTrackGroup(i10, v1Var, gVar, iArr, str, str2);
    }

    @Override // wd.b
    public Object execute() {
        td.a aVar = (td.a) this.f7781c;
        md.d0 d0Var = (md.d0) this.f7782e;
        ((vd.p) aVar.f86817d).persist(d0Var, (md.u) this.f7783f);
        aVar.f86814a.schedule(d0Var, 1);
        return null;
    }

    @Override // sj.a
    public void handle(sj.c cVar) {
        nj.t0 t0Var = (nj.t0) this.f7781c;
        String str = (String) this.f7782e;
        yh.b bVar = (yh.b) this.f7783f;
        if (t0Var.f77013b == nj.t0.f77011c) {
            return;
        }
        yh.a aVarRegisterAnalyticsConnectorListener = ((yh.d) cVar.get()).registerAnalyticsConnectorListener(str, bVar);
        t0Var.f77013b = aVarRegisterAnalyticsConnectorListener;
        synchronized (t0Var) {
            try {
                if (!t0Var.f77012a.isEmpty()) {
                    aVarRegisterAnalyticsConnectorListener.registerEventNames(t0Var.f77012a);
                    t0Var.f77012a = new HashSet();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        ((io.odeeo.internal.c.b) obj).onTracksChanged((b.a) this.f7781c, (io.odeeo.internal.a0.l0) this.f7782e, (io.odeeo.internal.n0.h) this.f7783f);
    }

    @Override // t3.f
    public void onCancel() {
        Runnable runnable = (Runnable) this.f7781c;
        e6.c0 c0Var = (e6.c0) this.f7782e;
        Runnable runnable2 = (Runnable) this.f7783f;
        if (runnable != null) {
            runnable.run();
        } else {
            c0Var.cancel();
            runnable2.run();
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((com.applovin.impl.privacy.cmp.a) this.f7781c).a((a.InterfaceC0037a) this.f7782e, (FormError) this.f7783f, formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        ((com.applovin.impl.privacy.cmp.a) this.f7781c).a((Activity) this.f7782e, (a.InterfaceC0037a) this.f7783f);
    }

    @Override // com.moloco.sdk.publisher.MolocoInitializationListener
    public void onMolocoInitializationStatus(MolocoInitStatus molocoInitStatus) {
        MolocoUnityPlugin.initializeSdk$lambda$3((String) this.f7781c, (String) this.f7782e, (MolocoUnityInitCallback) this.f7783f, molocoInitStatus);
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        z9.d dVar;
        z9.l lVar = (z9.l) this.f7781c;
        z9.j jVar = (z9.j) this.f7782e;
        z9.d dVar2 = (z9.d) this.f7783f;
        if (billingResult.getResponseCode() != 0) {
            if (dVar2 != null) {
                dVar2.onInappPurchasesRequested(false);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lVar.a((Purchase) it.next());
        }
        int i10 = jVar.f97723a - 1;
        jVar.f97723a = i10;
        if (i10 != 0 || (dVar = jVar.f97724b) == null) {
            return;
        }
        dVar.onInappPurchasesRequested(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f7780b) {
            case 14:
                nj.n0 n0Var = (nj.n0) this.f7781c;
                rj.o oVar = (rj.o) this.f7782e;
                bj.a1 a1Var = (bj.a1) this.f7783f;
                nj.m0 m0Var = n0Var.f76979a;
                b3 b3Var = (b3) m0Var;
                b3Var.logEvent(((CampaignAnalytics) n0Var.a(oVar, (String) obj).setRenderErrorReason((bj.z1) nj.n0.f76977h.get(a1Var)).build()).toByteArray());
                break;
            default:
                nj.n0 n0Var2 = (nj.n0) this.f7781c;
                rj.o oVar2 = (rj.o) this.f7782e;
                bj.z0 z0Var = (bj.z0) this.f7783f;
                nj.m0 m0Var2 = n0Var2.f76979a;
                b3 b3Var2 = (b3) m0Var2;
                b3Var2.logEvent(((CampaignAnalytics) n0Var2.a(oVar2, (String) obj).setDismissType((bj.g0) nj.n0.f76978i.get(z0Var)).build()).toByteArray());
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7781c;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f7782e;
        CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f7783f;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return Tasks.forResult(null);
    }

    @Override // com.applovin.impl.q4.b
    public void a(boolean z10, Object obj, Object obj2) {
        ((i8) this.f7781c).a((AppLovinPostbackListener) this.f7782e, (String) this.f7783f, z10, (String) obj, (String) obj2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f7781c;
        String str = (String) this.f7782e;
        com.google.firebase.messaging.i0 i0Var = (com.google.firebase.messaging.i0) this.f7783f;
        String str2 = (String) obj;
        FirebaseMessaging.c(firebaseMessaging.f29727b).saveToken(firebaseMessaging.d(), str, str2, firebaseMessaging.f29734i.a());
        if (i0Var == null || !str2.equals(i0Var.f29817a)) {
            com.google.firebase.g gVar = firebaseMessaging.f29726a;
            if ("[DEFAULT]".equals(gVar.getName())) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + gVar.getName());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.n(firebaseMessaging.f29727b).process(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
