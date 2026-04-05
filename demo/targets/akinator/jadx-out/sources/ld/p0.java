package ld;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract b0 a(Integer num);

        public abstract b0 b(String str);

        public abstract p0 build();

        public abstract a setClientInfo(h0 h0Var);

        public abstract a setLogEvents(List<o0> list);

        public abstract a setQosTier(u0 u0Var);

        public abstract a setRequestTimeMs(long j10);

        public abstract a setRequestUptimeMs(long j10);

        public a setSource(int i10) {
            return a(Integer.valueOf(i10));
        }

        public a setSource(String str) {
            return b(str);
        }
    }

    public static a builder() {
        return new b0();
    }

    public abstract h0 getClientInfo();

    public abstract List<o0> getLogEvents();

    public abstract Integer getLogSource();

    public abstract String getLogSourceName();

    public abstract u0 getQosTier();

    public abstract long getRequestTimeMs();

    public abstract long getRequestUptimeMs();
}
