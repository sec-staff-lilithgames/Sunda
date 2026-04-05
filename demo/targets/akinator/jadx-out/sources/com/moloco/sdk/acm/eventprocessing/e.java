package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import com.ironsource.Q6;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import n6.b0;
import n6.d0;
import n6.f;
import n6.f0;
import n6.y0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.i f45558a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f45559b;

    public e(com.moloco.sdk.acm.i config, Context context) {
        e0.checkNotNullParameter(config, "config");
        e0.checkNotNullParameter(context, "context");
        this.f45558a = config;
        this.f45559b = context;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.d
    public void a() {
        n6.f fVarBuild = new f.a().setRequiredNetworkType(d0.f75706c).build();
        com.moloco.sdk.acm.i iVar = this.f45558a;
        androidx.work.b bVarA = f.a(p1.mapOf(tu.e0.to("url", iVar.g()), tu.e0.to("AppKey", iVar.f().get("AppKey")), tu.e0.to("AppBundle", iVar.f().get("AppBundle")), tu.e0.to("AppVersion", iVar.f().get("AppVersion")), tu.e0.to("OS", iVar.f().get("OS")), tu.e0.to(Q6.G, iVar.f().get(Q6.G)), tu.e0.to("SdkVersion", iVar.f().get("SdkVersion")), tu.e0.to("Mediator", iVar.f().get("Mediator"))));
        if (bVarA == null) {
            return;
        }
        y0.getInstance(this.f45559b).enqueue((f0) ((f0.a) ((f0.a) ((f0.a) new f0.a((Class<? extends b0>) DBRequestWorker.class).setConstraints(fVarBuild)).setInputData(bVarA)).setBackoffCriteria(n6.a.f75680b, 10000L, TimeUnit.MILLISECONDS)).build());
    }
}
