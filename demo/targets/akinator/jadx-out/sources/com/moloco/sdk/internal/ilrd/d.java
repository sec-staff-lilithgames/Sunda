package com.moloco.sdk.internal.ilrd;

import android.content.Context;
import androidx.lifecycle.b2;
import androidx.lifecycle.k0;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.h9;
import com.moloco.sdk.internal.services.p;
import com.moloco.sdk.service_locator.a;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f46004a;

    /* renamed from: b, reason: collision with root package name */
    public k f46005b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.f46004a = context;
    }

    public final k a() {
        return this.f46005b;
    }

    public final Object b(Init$SDKInitResponse response) {
        e0.checkNotNullParameter(response, "response");
        k kVar = this.f46005b;
        x0 x0Var = x0.f87415a;
        if (kVar != null) {
            int i10 = z.f87419c;
            return z.m7131constructorimpl(x0Var);
        }
        Init$SDKInitResponse.ILRDConfig iLRDConfigA = a(response);
        if (iLRDConfigA == null) {
            int i11 = z.f87419c;
            return z.m7131constructorimpl(a0.createFailure(new Exception("No ILRD configuration found")));
        }
        List<h9> supportedNetworksList = iLRDConfigA.getSupportedNetworksList();
        if (!iLRDConfigA.getEnabled()) {
            int i12 = z.f87419c;
            return z.m7131constructorimpl(a0.createFailure(new Exception("Publisher has not opted into ILRD collection")));
        }
        if (supportedNetworksList.isEmpty()) {
            int i13 = z.f87419c;
            return z.m7131constructorimpl(a0.createFailure(new Exception("No ILRD supported networks available")));
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        b bVarA = a(CoroutineScope, iLRDConfigA, response);
        e0.checkNotNull(supportedNetworksList);
        a(CoroutineScope, bVarA, supportedNetworksList);
        int i14 = z.f87419c;
        return z.m7131constructorimpl(x0Var);
    }

    public final Init$SDKInitResponse.ILRDConfig a(Init$SDKInitResponse init$SDKInitResponse) {
        if (init$SDKInitResponse.hasIlrdConfig()) {
            return init$SDKInitResponse.getIlrdConfig();
        }
        return null;
    }

    public final b a(CoroutineScope coroutineScope, Init$SDKInitResponse.ILRDConfig iLRDConfig, Init$SDKInitResponse init$SDKInitResponse) {
        String rawImpUrl = iLRDConfig.getRawImpUrl();
        e0.checkNotNullExpressionValue(rawImpUrl, "getRawImpUrl(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVarC = a.i.f47469a.c();
        tv.e eVar = tv.f.f87433c;
        int sessionExp = iLRDConfig.getSessionExp();
        tv.i iVar = tv.i.f87442g;
        long duration = tv.h.toDuration(sessionExp, iVar);
        int maxBatchSize = iLRDConfig.getMaxBatchSize();
        long duration2 = tv.h.toDuration(iLRDConfig.getUploadInterval(), iVar);
        long duration3 = tv.h.toDuration(iLRDConfig.getMaxSessionLen(), iVar);
        a.h hVar = a.h.f47463a;
        com.moloco.sdk.internal.services.i iVarH = hVar.h();
        k0 lifecycle = b2.f6515k.get().getLifecycle();
        p pVarD = hVar.d();
        String publisherId = init$SDKInitResponse.getPublisherId();
        e0.checkNotNullExpressionValue(publisherId, "getPublisherId(...)");
        String appId = init$SDKInitResponse.getAppId();
        e0.checkNotNullExpressionValue(appId, "getAppId(...)");
        return new b(coroutineScope, rawImpUrl, kVarC, duration, maxBatchSize, duration2, duration3, iVarH, lifecycle, pVarD, publisherId, appId, a.j.f47474a.b(), null, null, null, 57344, null);
    }

    public final k a(CoroutineScope coroutineScope, b bVar, List<? extends h9> list) {
        k kVar = new k(coroutineScope, this.f46004a, bVar, list);
        this.f46005b = kVar;
        kVar.c();
        return kVar;
    }
}
