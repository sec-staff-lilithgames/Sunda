package com.google.firebase.inappmessaging;

import ai.a;
import ai.b;
import ai.c;
import android.app.Application;
import android.content.Context;
import bi.b0;
import bi.d;
import bj.w0;
import bk.i;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import jd.l;
import nj.p0;
import oj.a0;
import oj.u;
import oj.v;
import oj.w;
import oj.y;
import oj.z;
import pj.c0;
import pj.k;
import pj.n;
import pj.q;
import tj.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private b0 backgroundExecutor = b0.qualified(a.class, Executor.class);
    private b0 blockingExecutor = b0.qualified(b.class, Executor.class);
    private b0 lightWeightExecutor = b0.qualified(c.class, Executor.class);
    private b0 legacyTransportFactory = b0.qualified(si.a.class, l.class);

    /* JADX INFO: Access modifiers changed from: private */
    public w0 providesFirebaseInAppMessaging(d dVar) {
        g gVar = (g) dVar.get(g.class);
        f fVar = (f) dVar.get(f.class);
        sj.b deferred = dVar.getDeferred(yh.d.class);
        yi.d dVar2 = (yi.d) dVar.get(yi.d.class);
        a0 a0VarBuild = z.builder().applicationModule(new n((Application) gVar.getApplicationContext())).appMeasurementModule(new k(deferred, dVar2)).analyticsEventsModule(new pj.a()).programmaticContextualTriggerFlowableModule(new c0(new p0())).executorsModule(new q((Executor) dVar.get(this.lightWeightExecutor), (Executor) dVar.get(this.backgroundExecutor), (Executor) dVar.get(this.blockingExecutor))).build();
        y yVar = (y) a0VarBuild;
        return ((u) ((v) ((v) ((v) ((v) ((v) ((v) w.builder()).abtIntegrationHelper(new nj.a(((wh.a) dVar.get(wh.a.class)).get(AppMeasurement.FIAM_ORIGIN), (Executor) dVar.get(this.blockingExecutor)))).apiClientModule(new pj.d(gVar, fVar, yVar.clock()))).grpcClientModule(new pj.z(gVar))).universalComponent((a0) yVar)).transportFactory((l) dVar.get(this.legacyTransportFactory))).build()).providesFirebaseInAppMessaging();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bi.c> getComponents() {
        return Arrays.asList(bi.c.builder(w0.class).name(LIBRARY_NAME).add(bi.q.required((Class<?>) Context.class)).add(bi.q.required((Class<?>) f.class)).add(bi.q.required((Class<?>) g.class)).add(bi.q.required((Class<?>) wh.a.class)).add(bi.q.deferred((Class<?>) yh.d.class)).add(bi.q.required(this.legacyTransportFactory)).add(bi.q.required((Class<?>) yi.d.class)).add(bi.q.required(this.backgroundExecutor)).add(bi.q.required(this.blockingExecutor)).add(bi.q.required(this.lightWeightExecutor)).factory(new bi.a(this, 1)).eagerInDefaultApp().build(), i.create(LIBRARY_NAME, "22.0.1"));
    }
}
