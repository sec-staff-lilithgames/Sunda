package md;

import android.util.Base64;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class d0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract d0 build();

        public abstract a setBackendName(String str);

        public abstract a setExtras(byte[] bArr);

        public abstract a setPriority(jd.h hVar);
    }

    public static a builder() {
        return new m().setPriority(jd.h.f69502b);
    }

    public abstract String getBackendName();

    public abstract byte[] getExtras();

    public abstract jd.h getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final String toString() {
        String backendName = getBackendName();
        jd.h priority = getPriority();
        String strEncodeToString = getExtras() == null ? "" : Base64.encodeToString(getExtras(), 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(backendName);
        sb2.append(", ");
        sb2.append(priority);
        sb2.append(", ");
        return o2.o(sb2, strEncodeToString, ")");
    }

    public d0 withPriority(jd.h hVar) {
        return builder().setBackendName(getBackendName()).setPriority(hVar).setExtras(getExtras()).build();
    }
}
