package a1;

import com.digidust.elokence.akinator.factories.AkApplication;
import com.moloco.sdk.internal.a0;
import com.moloco.sdk.internal.ortb.model.l;
import com.moloco.sdk.internal.ortb.model.v;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin;
import com.moloco.sdk.publisher.Moloco;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p0.g3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3410b;

    public /* synthetic */ k(int i10) {
        this.f3410b = i10;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f3410b) {
            case 0:
                g3 g3Var = l.f3411a;
                return null;
            case 1:
                return b5.b.f8750c;
            case 2:
                AkApplication.a aVar = AkApplication.f21719f;
                return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
            case 3:
                return Long.valueOf(System.currentTimeMillis());
            case 4:
                return com.moloco.sdk.acm.http.c.b();
            case 5:
                return com.moloco.sdk.acm.http.d.a();
            case 6:
                return com.moloco.sdk.internal.g.c();
            case 7:
                return com.moloco.sdk.internal.j.b();
            case 8:
                return com.moloco.sdk.internal.ortb.c.b();
            case 9:
                return l.a.f46147a;
            case 10:
                return v.a.f46218a;
            case 11:
                return com.moloco.sdk.internal.q.d();
            case 12:
                return com.moloco.sdk.internal.q.e();
            case 13:
                return com.moloco.sdk.internal.q.f();
            case 14:
                return com.moloco.sdk.internal.q.b();
            case 15:
                return com.moloco.sdk.internal.q.a();
            case 16:
                return com.moloco.sdk.internal.q.c();
            case 17:
                return com.moloco.sdk.internal.r.a();
            case 18:
                return com.moloco.sdk.internal.services.bidtoken.a.a();
            case 19:
                return com.moloco.sdk.internal.services.bidtoken.o.b();
            case 20:
                return com.moloco.sdk.internal.services.bidtoken.providers.l.b();
            case 21:
                return com.moloco.sdk.internal.services.encryption.c.f();
            case 22:
                return com.moloco.sdk.internal.services.encryption.c.e();
            case 23:
                return com.moloco.sdk.internal.services.encryption.c.d();
            case 24:
                return com.moloco.sdk.internal.services.encryption.c.c();
            case 25:
                return com.moloco.sdk.internal.services.encryption.c.g();
            case 26:
                return MolocoUnityPlugin.context_delegate$lambda$0();
            case 27:
                return MolocoUnityPlugin.adManager_delegate$lambda$1();
            case 28:
                return a0.a();
            default:
                return Moloco.initializationHandler_delegate$lambda$4();
        }
    }
}
