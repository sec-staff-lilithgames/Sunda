package es;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import mh.p1;
import wr.b3;
import wr.e3;
import wr.f1;
import wr.m6;
import wr.t6;
import wr.u6;
import xr.bf;
import xr.cf;
import xr.je;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k0 extends b3 {

    /* renamed from: n, reason: collision with root package name */
    public static final wr.b f55058n = wr.b.create("addressTrackerKey");

    /* renamed from: f, reason: collision with root package name */
    public final s f55059f;

    /* renamed from: g, reason: collision with root package name */
    public final u6 f55060g;

    /* renamed from: h, reason: collision with root package name */
    public final i f55061h;

    /* renamed from: i, reason: collision with root package name */
    public final cf f55062i;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f55063j;

    /* renamed from: k, reason: collision with root package name */
    public t6 f55064k;

    /* renamed from: l, reason: collision with root package name */
    public Long f55065l;

    /* renamed from: m, reason: collision with root package name */
    public final wr.m f55066m;

    public k0(b3.c cVar, cf cfVar) {
        wr.m channelLogger = cVar.getChannelLogger();
        this.f55066m = channelLogger;
        this.f55061h = new i(new t(this, (b3.c) p1.checkNotNull(cVar, "helper")));
        this.f55059f = new s();
        this.f55060g = (u6) p1.checkNotNull(cVar.getSynchronizationContext(), "syncContext");
        this.f55063j = (ScheduledExecutorService) p1.checkNotNull(cVar.getScheduledExecutorService(), "timeService");
        this.f55062i = cfVar;
        channelLogger.log(wr.l.f91017b, "OutlierDetection lb created.");
    }

    public static boolean a(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((f1) it.next()).getAddresses().size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList b(s sVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = sVar.values().iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar.c() >= i10) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    @Override // wr.b3
    public m6 acceptResolvedAddresses(e3 e3Var) {
        i iVar = this.f55061h;
        s sVar = this.f55059f;
        wr.m mVar = this.f55066m;
        mVar.log(wr.l.f91017b, "Received resolution result: {0}", e3Var);
        b0 b0Var = (b0) e3Var.getLoadBalancingPolicyConfig();
        ArrayList arrayList = new ArrayList();
        Iterator<f1> it = e3Var.getAddresses().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getAddresses());
        }
        sVar.keySet().retainAll(arrayList);
        Iterator it2 = sVar.f55100b.values().iterator();
        while (it2.hasNext()) {
            ((r) it2.next()).f55094a = b0Var;
        }
        HashMap map = sVar.f55100b;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it3.next();
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new r(b0Var));
            }
        }
        je jeVar = b0Var.f55023g;
        Long l9 = b0Var.f55017a;
        iVar.switchTo(jeVar.getProvider());
        if (b0Var.f55021e == null && b0Var.f55022f == null) {
            t6 t6Var = this.f55064k;
            if (t6Var != null) {
                t6Var.cancel();
                this.f55065l = null;
                for (r rVar : sVar.f55100b.values()) {
                    if (rVar.d()) {
                        rVar.e();
                    }
                    rVar.f55098e = 0;
                }
            }
        } else {
            Long lValueOf = this.f55065l == null ? l9 : Long.valueOf(Math.max(0L, l9.longValue() - (((bf) this.f55062i).currentTimeNanos() - this.f55065l.longValue())));
            t6 t6Var2 = this.f55064k;
            if (t6Var2 != null) {
                t6Var2.cancel();
                for (r rVar2 : sVar.f55100b.values()) {
                    androidx.localbroadcastmanager.content.b bVar = rVar2.f55095b;
                    ((AtomicLong) bVar.f6756a).set(0L);
                    ((AtomicLong) bVar.f6757b).set(0L);
                    androidx.localbroadcastmanager.content.b bVar2 = rVar2.f55096c;
                    ((AtomicLong) bVar2.f6756a).set(0L);
                    ((AtomicLong) bVar2.f6757b).set(0L);
                }
            }
            this.f55064k = this.f55060g.scheduleWithFixedDelay(new u(this, b0Var, mVar), lValueOf.longValue(), l9.longValue(), TimeUnit.NANOSECONDS, this.f55063j);
        }
        iVar.handleResolvedAddresses(e3Var.toBuilder().setLoadBalancingPolicyConfig(b0Var.f55023g.getConfig()).build());
        return m6.f91037e;
    }

    @Override // wr.b3
    public void handleNameResolutionError(m6 m6Var) {
        this.f55061h.handleNameResolutionError(m6Var);
    }

    @Override // wr.b3
    public void shutdown() {
        this.f55061h.shutdown();
    }
}
