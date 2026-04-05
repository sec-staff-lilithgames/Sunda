package md;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract Map a();

        public final a addMetadata(String str, String str2) {
            a().put(str, str2);
            return this;
        }

        public abstract i b(HashMap map);

        public abstract u build();

        public abstract a setCode(Integer num);

        public abstract a setEncodedPayload(t tVar);

        public abstract a setEventMillis(long j10);

        public abstract a setExperimentIdsClear(byte[] bArr);

        public abstract a setExperimentIdsEncrypted(byte[] bArr);

        public abstract a setProductId(Integer num);

        public abstract a setPseudonymousId(String str);

        public abstract a setTransportName(String str);

        public abstract a setUptimeMillis(long j10);

        public final a addMetadata(String str, long j10) {
            a().put(str, String.valueOf(j10));
            return this;
        }

        public final a addMetadata(String str, int i10) {
            a().put(str, String.valueOf(i10));
            return this;
        }
    }

    public static a builder() {
        i iVar = new i();
        iVar.f74289f = new HashMap();
        return iVar;
    }

    public abstract Map a();

    public final String get(String str) {
        String str2 = (String) a().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Integer getCode();

    public abstract t getEncodedPayload();

    public abstract long getEventMillis();

    public abstract byte[] getExperimentIdsClear();

    public abstract byte[] getExperimentIdsEncrypted();

    public final int getInteger(String str) {
        String str2 = (String) a().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long getLong(String str) {
        String str2 = (String) a().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(a());
    }

    public final String getOrDefault(String str, String str2) {
        String str3 = (String) a().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    public byte[] getPayload() {
        return getEncodedPayload().getBytes();
    }

    public abstract Integer getProductId();

    public abstract String getPseudonymousId();

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public a toBuilder() {
        return new i().setTransportName(getTransportName()).setCode(getCode()).setProductId(getProductId()).setPseudonymousId(getPseudonymousId()).setExperimentIdsClear(getExperimentIdsClear()).setExperimentIdsEncrypted(getExperimentIdsEncrypted()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).b(new HashMap(a()));
    }
}
