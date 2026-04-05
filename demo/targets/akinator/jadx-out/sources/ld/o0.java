package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract o0 build();

        public abstract a setComplianceData(j0 j0Var);

        public abstract a setEventCode(Integer num);

        public abstract a setEventTimeMs(long j10);

        public abstract a setEventUptimeMs(long j10);

        public abstract a setExperimentIds(l0 l0Var);

        public abstract a setNetworkConnectionInfo(r0 r0Var);

        public abstract a setTimezoneOffsetSeconds(long j10);
    }

    public static a jsonBuilder(String str) {
        z zVar = new z();
        zVar.f73323f = str;
        return zVar;
    }

    public static a protoBuilder(byte[] bArr) {
        z zVar = new z();
        zVar.f73322e = bArr;
        return zVar;
    }

    public abstract j0 getComplianceData();

    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    public abstract l0 getExperimentIds();

    public abstract r0 getNetworkConnectionInfo();

    public abstract byte[] getSourceExtension();

    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
