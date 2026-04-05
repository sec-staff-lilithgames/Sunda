package xr;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import nh.ej;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class na extends wr.b3 {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f92815o = Logger.getLogger(na.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final b3.c f92816f;

    /* renamed from: h, reason: collision with root package name */
    public ia f92818h;

    /* renamed from: k, reason: collision with root package name */
    public wr.t6 f92821k;

    /* renamed from: l, reason: collision with root package name */
    public wr.f0 f92822l;

    /* renamed from: m, reason: collision with root package name */
    public wr.f0 f92823m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f92824n;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f92817g = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f92819i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f92820j = true;

    public na(b3.c cVar) {
        wr.f0 f0Var = wr.f0.f90915f;
        this.f92822l = f0Var;
        this.f92823m = f0Var;
        this.f92824n = c5.getFlag("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS", false);
        this.f92816f = (b3.c) mh.p1.checkNotNull(cVar, "helper");
    }

    public final void a() {
        wr.t6 t6Var = this.f92821k;
        if (t6Var != null) {
            t6Var.cancel();
            this.f92821k = null;
        }
    }

    @Override // wr.b3
    public wr.m6 acceptResolvedAddresses(wr.e3 e3Var) {
        wr.f0 f0Var;
        Boolean bool;
        if (this.f92822l == wr.f0.f90916g) {
            return wr.m6.f91044l.withDescription("Already shut down");
        }
        List<wr.f1> addresses = e3Var.getAddresses();
        if (addresses.isEmpty()) {
            wr.m6 m6VarWithDescription = wr.m6.f91047o.withDescription("NameResolver returned no usable address. addrs=" + e3Var.getAddresses() + ", attrs=" + e3Var.getAttributes());
            handleNameResolutionError(m6VarWithDescription);
            return m6VarWithDescription;
        }
        Iterator<wr.f1> it = addresses.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                wr.m6 m6VarWithDescription2 = wr.m6.f91047o.withDescription("NameResolver returned address list with null endpoint. addrs=" + e3Var.getAddresses() + ", attrs=" + e3Var.getAttributes());
                handleNameResolutionError(m6VarWithDescription2);
                return m6VarWithDescription2;
            }
        }
        this.f92820j = true;
        if ((e3Var.getLoadBalancingPolicyConfig() instanceof ja) && (bool = ((ja) e3Var.getLoadBalancingPolicyConfig()).f92709a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(addresses);
            Collections.shuffle(arrayList, new Random());
            addresses = arrayList;
        }
        nh.b5 b5VarBuild = nh.b5.builder().addAll((Iterable<Object>) addresses).build();
        ia iaVar = this.f92818h;
        wr.f0 f0Var2 = wr.f0.f90913c;
        if (iaVar == null) {
            this.f92818h = new ia(b5VarBuild);
        } else if (this.f92822l == f0Var2) {
            SocketAddress currentAddress = iaVar.getCurrentAddress();
            this.f92818h.updateGroups(b5VarBuild);
            if (this.f92818h.seekTo(currentAddress)) {
                return wr.m6.f91037e;
            }
            this.f92818h.reset();
        } else {
            iaVar.updateGroups(b5VarBuild);
        }
        HashMap map = this.f92817g;
        HashSet hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        ej it2 = b5VarBuild.iterator();
        while (it2.hasNext()) {
            hashSet2.addAll(((wr.f1) it2.next()).getAddresses());
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            SocketAddress socketAddress = (SocketAddress) it3.next();
            if (!hashSet2.contains(socketAddress)) {
                ((ma) map.remove(socketAddress)).getSubchannel().shutdown();
            }
        }
        int size = hashSet.size();
        wr.f0 f0Var3 = wr.f0.f90912b;
        if (size == 0 || (f0Var = this.f92822l) == f0Var3 || f0Var == f0Var2) {
            this.f92822l = f0Var3;
            c(f0Var3, new ka(wr.c3.withNoResult()));
            a();
            requestConnection();
        } else {
            wr.f0 f0Var4 = wr.f0.f90915f;
            if (f0Var == f0Var4) {
                c(f0Var4, new la(this, this));
            } else if (f0Var == wr.f0.f90914e) {
                a();
                requestConnection();
            }
        }
        return wr.m6.f91037e;
    }

    public final void b() {
        if (this.f92824n) {
            wr.t6 t6Var = this.f92821k;
            if (t6Var == null || !t6Var.isPending()) {
                b3.c cVar = this.f92816f;
                this.f92821k = cVar.getSynchronizationContext().schedule(new ga(this), 250L, TimeUnit.MILLISECONDS, cVar.getScheduledExecutorService());
            }
        }
    }

    public final void c(wr.f0 f0Var, b3.f fVar) {
        if (f0Var == this.f92823m && (f0Var == wr.f0.f90915f || f0Var == wr.f0.f90912b)) {
            return;
        }
        this.f92823m = f0Var;
        this.f92816f.updateBalancingState(f0Var, fVar);
    }

    public final void d(ma maVar) {
        wr.f0 f0Var = maVar.f92795b;
        ha haVar = maVar.f92796c;
        wr.f0 f0Var2 = wr.f0.f90913c;
        if (f0Var != f0Var2) {
            return;
        }
        if (haVar.f92588a.getState() == f0Var2) {
            c(f0Var2, new b3.b(wr.c3.withSubchannel(maVar.f92794a)));
            return;
        }
        wr.f0 state = haVar.f92588a.getState();
        wr.f0 f0Var3 = wr.f0.f90914e;
        if (state == f0Var3) {
            c(f0Var3, new ka(wr.c3.withError(haVar.f92588a.getStatus())));
        } else if (this.f92823m != f0Var3) {
            c(haVar.f92588a.getState(), new ka(wr.c3.withNoResult()));
        }
    }

    @Override // wr.b3
    public void handleNameResolutionError(wr.m6 m6Var) {
        HashMap map = this.f92817g;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((ma) it.next()).getSubchannel().shutdown();
        }
        map.clear();
        c(wr.f0.f90914e, new ka(wr.c3.withError(m6Var)));
    }

    @Override // wr.b3
    public void requestConnection() {
        b3.e subchannel;
        ia iaVar = this.f92818h;
        if (iaVar == null || !iaVar.isValid() || this.f92822l == wr.f0.f90916g) {
            return;
        }
        SocketAddress currentAddress = this.f92818h.getCurrentAddress();
        HashMap map = this.f92817g;
        boolean zContainsKey = map.containsKey(currentAddress);
        Logger logger = f92815o;
        if (zContainsKey) {
            subchannel = ((ma) map.get(currentAddress)).getSubchannel();
        } else {
            ha haVar = new ha(this);
            final b3.e eVarCreateSubchannel = this.f92816f.createSubchannel(wr.a3.newBuilder().setAddresses(nh.p8.newArrayList(new wr.f1(currentAddress))).addOption(wr.b3.f90829c, haVar).build());
            if (eVarCreateSubchannel == null) {
                logger.warning("Was not able to create subchannel for " + currentAddress);
                throw new IllegalStateException("Can't create subchannel");
            }
            ma maVar = new ma(eVarCreateSubchannel, wr.f0.f90915f, haVar);
            haVar.f92589b = maVar;
            map.put(currentAddress, maVar);
            if (eVarCreateSubchannel.getAttributes().get(wr.b3.f90830d) == null) {
                haVar.f92588a = wr.g0.forNonError(wr.f0.f90913c);
            }
            eVarCreateSubchannel.start(new wr.f3() { // from class: xr.fa
                @Override // wr.f3
                public final void onSubchannelState(wr.g0 g0Var) {
                    na naVar = this.f92513a;
                    b3.c cVar = naVar.f92816f;
                    wr.f0 state = g0Var.getState();
                    HashMap map2 = naVar.f92817g;
                    b3.e eVar = eVarCreateSubchannel;
                    ma maVar2 = (ma) map2.get(eVar.getAddresses().getAddresses().get(0));
                    if (maVar2 != null) {
                        b3.e eVar2 = maVar2.f92794a;
                        if (maVar2.getSubchannel() == eVar && state != wr.f0.f90916g) {
                            wr.f0 f0Var = wr.f0.f90915f;
                            if (state == f0Var) {
                                cVar.refreshNameResolution();
                            }
                            ma.a(maVar2, state);
                            wr.f0 f0Var2 = naVar.f92822l;
                            wr.f0 f0Var3 = wr.f0.f90912b;
                            wr.f0 f0Var4 = wr.f0.f90914e;
                            if (f0Var2 == f0Var4 || naVar.f92823m == f0Var4) {
                                if (state == f0Var3) {
                                    return;
                                }
                                if (state == f0Var) {
                                    naVar.requestConnection();
                                    return;
                                }
                            }
                            int iOrdinal = state.ordinal();
                            if (iOrdinal == 0) {
                                naVar.f92822l = f0Var3;
                                naVar.c(f0Var3, new ka(wr.c3.withNoResult()));
                                return;
                            }
                            if (iOrdinal == 1) {
                                naVar.a();
                                for (ma maVar3 : map2.values()) {
                                    if (!maVar3.getSubchannel().equals(eVar2)) {
                                        maVar3.getSubchannel().shutdown();
                                    }
                                }
                                map2.clear();
                                wr.f0 f0Var5 = wr.f0.f90913c;
                                ma.a(maVar2, f0Var5);
                                map2.put(eVar2.getAddresses().getAddresses().get(0), maVar2);
                                naVar.f92818h.seekTo(eVar.getAddresses().getAddresses().get(0));
                                naVar.f92822l = f0Var5;
                                naVar.d(maVar2);
                                return;
                            }
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new IllegalArgumentException("Unsupported state:" + state);
                                }
                                naVar.f92818h.reset();
                                naVar.f92822l = f0Var;
                                naVar.c(f0Var, new la(naVar, naVar));
                                return;
                            }
                            if (naVar.f92818h.isValid() && ((ma) map2.get(naVar.f92818h.getCurrentAddress())).getSubchannel() == eVar && naVar.f92818h.increment()) {
                                naVar.a();
                                naVar.requestConnection();
                            }
                            ia iaVar2 = naVar.f92818h;
                            if (iaVar2 == null || iaVar2.isValid() || map2.size() < naVar.f92818h.size()) {
                                return;
                            }
                            Iterator it = map2.values().iterator();
                            while (it.hasNext()) {
                                if (!((ma) it.next()).isCompletedConnectivityAttempt()) {
                                    return;
                                }
                            }
                            naVar.f92822l = f0Var4;
                            naVar.c(f0Var4, new ka(wr.c3.withError(g0Var.getStatus())));
                            int i10 = naVar.f92819i + 1;
                            naVar.f92819i = i10;
                            if (i10 >= naVar.f92818h.size() || naVar.f92820j) {
                                naVar.f92820j = false;
                                naVar.f92819i = 0;
                                cVar.refreshNameResolution();
                            }
                        }
                    }
                }
            });
            subchannel = eVarCreateSubchannel;
        }
        int iOrdinal = ((ma) map.get(currentAddress)).getState().ordinal();
        if (iOrdinal == 0) {
            if (this.f92824n) {
                b();
                return;
            } else {
                subchannel.requestConnection();
                return;
            }
        }
        if (iOrdinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.f92818h.increment();
            requestConnection();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            subchannel.requestConnection();
            ma.a((ma) map.get(currentAddress), wr.f0.f90912b);
            b();
        }
    }

    @Override // wr.b3
    public void shutdown() {
        Level level = Level.FINE;
        HashMap map = this.f92817g;
        f92815o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        wr.f0 f0Var = wr.f0.f90916g;
        this.f92822l = f0Var;
        this.f92823m = f0Var;
        a();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((ma) it.next()).getSubchannel().shutdown();
        }
        map.clear();
    }
}
