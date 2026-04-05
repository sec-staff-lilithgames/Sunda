package ud;

import android.content.Context;
import com.applovin.impl.sdk.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import ks.s;
import md.d0;
import md.t;
import md.u;
import nd.m;
import nd.o;
import o9.b3;
import vd.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88427a;

    /* renamed from: b, reason: collision with root package name */
    public final nd.f f88428b;

    /* renamed from: c, reason: collision with root package name */
    public final vd.d f88429c;

    /* renamed from: d, reason: collision with root package name */
    public final l f88430d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f88431e;

    /* renamed from: f, reason: collision with root package name */
    public final wd.c f88432f;

    /* renamed from: g, reason: collision with root package name */
    public final xd.a f88433g;

    /* renamed from: h, reason: collision with root package name */
    public final xd.a f88434h;

    /* renamed from: i, reason: collision with root package name */
    public final vd.c f88435i;

    public h(Context context, nd.f fVar, vd.d dVar, l lVar, Executor executor, wd.c cVar, xd.a aVar, xd.a aVar2, vd.c cVar2) {
        this.f88427a = context;
        this.f88428b = fVar;
        this.f88429c = dVar;
        this.f88430d = lVar;
        this.f88431e = executor;
        this.f88432f = cVar;
        this.f88433g = aVar;
        this.f88434h = aVar2;
        this.f88435i = cVar2;
    }

    public u createMetricsEvent(o oVar) {
        vd.c cVar = this.f88435i;
        Objects.requireNonNull(cVar);
        return ((kd.d) oVar).decorate(u.builder().setEventMillis(this.f88433g.getTime()).setUptimeMillis(this.f88434h.getTime()).setTransportName("GDT_CLIENT_METRICS").setEncodedPayload(new t(jd.e.of("proto"), ((qd.b) ((p) this.f88432f).runCriticalSection(new b3(cVar, 17))).toByteArray())).build());
    }

    public nd.i logAndUpdateState(final d0 d0Var, int i10) {
        nd.i iVarSend;
        o oVar = ((m) this.f88428b).get(d0Var.getBackendName());
        nd.i iVarOk = nd.i.ok(0L);
        long jMax = 0;
        while (true) {
            final int i11 = 0;
            wd.b bVar = new wd.b(this) { // from class: ud.g

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h f88425c;

                {
                    this.f88425c = this;
                }

                @Override // wd.b
                public final Object execute() {
                    switch (i11) {
                        case 0:
                            return Boolean.valueOf(((p) this.f88425c.f88429c).hasPendingEventsFor(d0Var));
                        default:
                            return ((p) this.f88425c.f88429c).loadBatch(d0Var);
                    }
                }
            };
            p pVar = (p) this.f88432f;
            if (!((Boolean) pVar.runCriticalSection(bVar)).booleanValue()) {
                pVar.runCriticalSection(new ks.k(this, d0Var, jMax, 2));
                return iVarOk;
            }
            final int i12 = 1;
            Iterable iterable = (Iterable) pVar.runCriticalSection(new wd.b(this) { // from class: ud.g

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h f88425c;

                {
                    this.f88425c = this;
                }

                @Override // wd.b
                public final Object execute() {
                    switch (i12) {
                        case 0:
                            return Boolean.valueOf(((p) this.f88425c.f88429c).hasPendingEventsFor(d0Var));
                        default:
                            return ((p) this.f88425c.f88429c).loadBatch(d0Var);
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return iVarOk;
            }
            if (oVar == null) {
                rd.a.d("Uploader", "Unknown backend for %s, deleting event batch for it...", d0Var);
                iVarSend = nd.i.fatalError();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((vd.m) it.next()).getEvent());
                }
                if (d0Var.shouldUploadClientHealthMetrics()) {
                    arrayList.add(createMetricsEvent(oVar));
                }
                iVarSend = ((kd.d) oVar).send(nd.g.builder().setEvents(arrayList).setExtras(d0Var.getExtras()).build());
            }
            iVarOk = iVarSend;
            if (iVarOk.getStatus() == nd.h.f75988c) {
                long j10 = jMax;
                d0 d0Var2 = d0Var;
                pVar.runCriticalSection(new ci.b(this, iterable, d0Var2, j10));
                this.f88430d.schedule(d0Var2, i10 + 1, true);
                return iVarOk;
            }
            d0 d0Var3 = d0Var;
            pVar.runCriticalSection(new s(20, this, iterable));
            if (iVarOk.getStatus() == nd.h.f75987b) {
                jMax = Math.max(jMax, iVarOk.getNextRequestWaitMillis());
                if (d0Var3.shouldUploadClientHealthMetrics()) {
                    pVar.runCriticalSection(new b3(this, 18));
                }
            } else if (iVarOk.getStatus() == nd.h.f75990f) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String transportName = ((vd.m) it2.next()).getEvent().getTransportName();
                    if (map.containsKey(transportName)) {
                        map.put(transportName, Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                    } else {
                        map.put(transportName, 1);
                    }
                }
                pVar.runCriticalSection(new s(21, this, map));
            }
            d0Var = d0Var3;
        }
    }

    public void upload(d0 d0Var, int i10, Runnable runnable) {
        this.f88431e.execute(new y(i10, 2, this, d0Var, runnable));
    }
}
