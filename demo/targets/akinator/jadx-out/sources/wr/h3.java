package wr;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class h3 extends b3.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o4 f90953a = o4.fromConfig(new g3());

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String getPolicyName();

    public abstract int getPriority();

    public final int hashCode() {
        return super.hashCode();
    }

    public abstract boolean isAvailable();

    public o4 parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        return f90953a;
    }

    public final String toString() {
        return mh.g1.toStringHelper(this).add("policy", getPolicyName()).add(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, getPriority()).add("available", isAvailable()).toString();
    }
}
