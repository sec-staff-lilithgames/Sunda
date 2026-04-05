package wr;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b3 {

    /* renamed from: b, reason: collision with root package name */
    public static final wr.b f90828b = wr.b.create("internal:health-checking-config");

    /* renamed from: c, reason: collision with root package name */
    public static final z2 f90829c = z2.create("internal:health-check-consumer-listener");

    /* renamed from: d, reason: collision with root package name */
    public static final wr.b f90830d = wr.b.create("internal:has-health-check-producer-listener");

    /* renamed from: e, reason: collision with root package name */
    public static final wr.b f90831e = wr.b.create("io.grpc.IS_PETIOLE_POLICY");

    /* renamed from: a, reason: collision with root package name */
    public int f90832a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract b3 newLoadBalancer(c cVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final c3 f90833a;

        public b(c3 c3Var) {
            this.f90833a = (c3) mh.p1.checkNotNull(c3Var, "result");
        }

        @Override // wr.b3.f
        public c3 pickSubchannel(d dVar) {
            return this.f90833a;
        }

        public String toString() {
            return "FixedResultPicker(" + this.f90833a + ")";
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {
        public k3 createOobChannel(List<f1> list, String str) {
            throw new UnsupportedOperationException();
        }

        public abstract k3 createOobChannel(f1 f1Var, String str);

        public k3 createResolvingOobChannel(String str) {
            return createResolvingOobChannelBuilder(str).build();
        }

        @Deprecated
        public l3 createResolvingOobChannelBuilder(String str) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public e createSubchannel(a3 a3Var) {
            throw new UnsupportedOperationException();
        }

        public abstract String getAuthority();

        public k getChannelCredentials() {
            return getUnsafeChannelCredentials().withoutBearerTokens();
        }

        public m getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        public n4 getNameResolverArgs() {
            throw new UnsupportedOperationException();
        }

        public w4 getNameResolverRegistry() {
            throw new UnsupportedOperationException();
        }

        public ScheduledExecutorService getScheduledExecutorService() {
            throw new UnsupportedOperationException();
        }

        public u6 getSynchronizationContext() {
            throw new UnsupportedOperationException();
        }

        public k getUnsafeChannelCredentials() {
            throw new UnsupportedOperationException();
        }

        public void refreshNameResolution() {
            throw new UnsupportedOperationException();
        }

        public abstract void updateBalancingState(f0 f0Var, f fVar);

        public void updateOobChannelAddresses(k3 k3Var, f1 f1Var) {
            throw new UnsupportedOperationException();
        }

        public l3 createResolvingOobChannelBuilder(String str, k kVar) {
            throw new UnsupportedOperationException();
        }

        public void updateOobChannelAddresses(k3 k3Var, List<f1> list) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public void ignoreRefreshNameResolutionCheck() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class d {
        public abstract i getCallOptions();

        public abstract e4 getHeaders();

        public abstract k4 getMethodDescriptor();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class e {
        public j asChannel() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final wr.f1 getAddresses() {
            /*
                r4 = this;
                java.util.List r0 = r4.getAllAddresses()
                r1 = 0
                if (r0 == 0) goto Lf
                int r2 = r0.size()
                r3 = 1
                if (r2 != r3) goto Lf
                goto L10
            Lf:
                r3 = r1
            L10:
                java.lang.String r2 = "%s does not have exactly one group"
                mh.p1.checkState(r3, r2, r0)
                java.lang.Object r0 = r0.get(r1)
                wr.f1 r0 = (wr.f1) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wr.b3.e.getAddresses():wr.f1");
        }

        public List<f1> getAllAddresses() {
            throw new UnsupportedOperationException();
        }

        public abstract wr.c getAttributes();

        public m getChannelLogger() {
            throw new UnsupportedOperationException();
        }

        public Object getInternalSubchannel() {
            throw new UnsupportedOperationException();
        }

        public abstract void requestConnection();

        public abstract void shutdown();

        public void start(f3 f3Var) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public void updateAddresses(List<f1> list) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        new x2();
    }

    public m6 acceptResolvedAddresses(e3 e3Var) {
        if (!e3Var.getAddresses().isEmpty() || canHandleEmptyAddressListFromNameResolution()) {
            int i10 = this.f90832a;
            this.f90832a = i10 + 1;
            if (i10 == 0) {
                handleResolvedAddresses(e3Var);
            }
            this.f90832a = 0;
            return m6.f91037e;
        }
        m6 m6VarWithDescription = m6.f91047o.withDescription("NameResolver returned no usable address. addrs=" + e3Var.getAddresses() + ", attrs=" + e3Var.getAttributes());
        handleNameResolutionError(m6VarWithDescription);
        return m6VarWithDescription;
    }

    public boolean canHandleEmptyAddressListFromNameResolution() {
        return false;
    }

    public abstract void handleNameResolutionError(m6 m6Var);

    public void handleResolvedAddresses(e3 e3Var) {
        int i10 = this.f90832a;
        this.f90832a = i10 + 1;
        if (i10 == 0) {
            acceptResolvedAddresses(e3Var);
        }
        this.f90832a = 0;
    }

    public abstract void shutdown();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class f {
        public abstract c3 pickSubchannel(d dVar);

        @Deprecated
        public void requestConnection() {
        }
    }

    public void requestConnection() {
    }

    @Deprecated
    public void handleSubchannelState(e eVar, g0 g0Var) {
    }
}
