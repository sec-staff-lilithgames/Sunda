package io.odeeo.sdk.advertisement.data;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Regulations {
    private final String gcp;

    public Regulations(String gcp) {
        e0.checkNotNullParameter(gcp, "gcp");
        this.gcp = gcp;
    }

    public static /* synthetic */ Regulations copy$default(Regulations regulations, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = regulations.gcp;
        }
        return regulations.copy(str);
    }

    public final String component1() {
        return this.gcp;
    }

    public final Regulations copy(String gcp) {
        e0.checkNotNullParameter(gcp, "gcp");
        return new Regulations(gcp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Regulations) && e0.areEqual(this.gcp, ((Regulations) obj).gcp);
    }

    public final String getGcp() {
        return this.gcp;
    }

    public int hashCode() {
        return this.gcp.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("Regulations(gcp="), this.gcp, ')');
    }
}
