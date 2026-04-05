package es;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import mh.p1;
import nh.b5;
import nh.ej;
import wr.b3;
import wr.c3;
import wr.e3;
import wr.f1;
import wr.m6;
import xr.ua;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class q extends b3 {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f55088k = Logger.getLogger(q.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public final b3.c f55090g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f55091h;

    /* renamed from: j, reason: collision with root package name */
    public wr.f0 f55093j;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f55089f = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ua f55092i = new ua();

    public q(b3.c cVar) {
        this.f55090g = (b3.c) p1.checkNotNull(cVar, "helper");
        f55088k.log(Level.FINE, "Created");
    }

    public final m a(e3 e3Var) {
        LinkedHashMap linkedHashMap;
        p pVar;
        f1 next;
        Level level = Level.FINE;
        Logger logger = f55088k;
        logger.log(level, "Received resolution result: {0}", e3Var);
        HashMap map = new HashMap();
        Iterator<f1> it = e3Var.getAddresses().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f55089f;
            if (!zHasNext) {
                break;
            }
            p pVar2 = new p(it.next());
            o oVar = (o) linkedHashMap.get(pVar2);
            if (oVar != null) {
                map.put(pVar2, oVar);
            } else {
                map.put(pVar2, new o(this, pVar2, this.f55092i, null, new b3.b(c3.withNoResult())));
            }
        }
        if (map.isEmpty()) {
            m6 m6VarWithDescription = m6.f91047o.withDescription("NameResolver returned no usable address. " + e3Var);
            handleNameResolutionError(m6VarWithDescription);
            return new m(m6VarWithDescription, null);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((o) entry.getValue()).getPolicyProvider();
            Object obj = ((o) entry.getValue()).f55078c;
            if (linkedHashMap.containsKey(key)) {
                o oVar2 = (o) linkedHashMap.get(key);
                if (oVar2.isDeactivated()) {
                    oVar2.f55083h = false;
                }
            } else {
                linkedHashMap.put(key, (o) entry.getValue());
            }
            o oVar3 = (o) linkedHashMap.get(key);
            if (key instanceof f1) {
                pVar = new p((f1) key);
            } else {
                p1.checkArgument(key instanceof p, "key is wrong type");
                pVar = (p) key;
            }
            Iterator<f1> it2 = e3Var.getAddresses().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (pVar.equals(new p(next))) {
                    break;
                }
            }
            p1.checkNotNull(next, key + " no longer present in load balancer children");
            e3 e3VarBuild = e3Var.toBuilder().setAddresses(Collections.singletonList(next)).setAttributes(wr.c.newBuilder().set(b3.f90831e, Boolean.TRUE).build()).setLoadBalancingPolicyConfig(obj).build();
            o oVar4 = (o) linkedHashMap.get(key);
            oVar4.getClass();
            p1.checkNotNull(e3VarBuild, "Missing address list for child");
            oVar4.f55077b = e3VarBuild;
            if (!oVar3.f55083h) {
                oVar3.f55079d.handleResolvedAddresses(e3VarBuild);
            }
        }
        ArrayList arrayList = new ArrayList();
        ej it3 = b5.copyOf((Collection) linkedHashMap.keySet()).iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!map.containsKey(next2)) {
                o oVar5 = (o) linkedHashMap.get(next2);
                Object obj2 = oVar5.f55076a;
                if (!oVar5.f55083h) {
                    oVar5.f55084i.f55089f.remove(obj2);
                    oVar5.f55083h = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", obj2);
                }
                arrayList.add(oVar5);
            }
        }
        return new m(m6.f91037e, arrayList);
    }

    @Override // wr.b3
    public m6 acceptResolvedAddresses(e3 e3Var) {
        try {
            this.f55091h = true;
            m mVarA = a(e3Var);
            m6 m6Var = mVarA.f55068a;
            if (!m6Var.isOk()) {
                return m6Var;
            }
            b();
            for (o oVar : mVarA.f55069b) {
                oVar.f55079d.shutdown();
                oVar.f55081f = wr.f0.f90916g;
                f55088k.log(Level.FINE, "Child balancer {0} deleted", oVar.f55076a);
            }
            return m6Var;
        } finally {
            this.f55091h = false;
        }
    }

    public abstract void b();

    @Override // wr.b3
    public void handleNameResolutionError(m6 m6Var) {
        if (this.f55093j != wr.f0.f90913c) {
            this.f55090g.updateBalancingState(wr.f0.f90914e, new b3.b(c3.withError(m6Var)));
        }
    }

    @Override // wr.b3
    public void shutdown() {
        Level level = Level.FINE;
        Logger logger = f55088k;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f55089f;
        for (o oVar : linkedHashMap.values()) {
            oVar.f55079d.shutdown();
            oVar.f55081f = wr.f0.f90916g;
            logger.log(Level.FINE, "Child balancer {0} deleted", oVar.f55076a);
        }
        linkedHashMap.clear();
    }
}
