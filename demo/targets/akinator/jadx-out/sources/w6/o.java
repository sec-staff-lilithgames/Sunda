package w6;

import android.net.NetworkRequest;
import b0.e2;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f90427a = new o();

    public static final NetworkRequest createNetworkRequest(int[] capabilities, int[] transports) {
        kotlin.jvm.internal.e0.checkNotNullParameter(capabilities, "capabilities");
        kotlin.jvm.internal.e0.checkNotNullParameter(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : capabilities) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e10) {
                n6.c0.get().warning(r.f90430b.getTAG(), e2.h('\'', "Ignoring adding capability '", i10), e10);
            }
        }
        for (int i11 : s.f90433a) {
            if (!k0.contains(capabilities, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e11) {
                    n6.c0.get().warning(r.f90430b.getTAG(), e2.h('\'', "Ignoring removing default capability '", i11), e11);
                }
            }
        }
        for (int i12 : transports) {
            builder.addTransportType(i12);
        }
        NetworkRequest networkRequestBuild = builder.build();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(networkRequestBuild, "build(...)");
        return networkRequestBuild;
    }

    public final r createNetworkRequestCompat$work_runtime_release(int[] capabilities, int[] transports) {
        kotlin.jvm.internal.e0.checkNotNullParameter(capabilities, "capabilities");
        kotlin.jvm.internal.e0.checkNotNullParameter(transports, "transports");
        return new r(createNetworkRequest(capabilities, transports));
    }

    public final boolean hasCapability$work_runtime_release(NetworkRequest request, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        return request.hasCapability(i10);
    }

    public final boolean hasTransport$work_runtime_release(NetworkRequest request, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        return request.hasTransport(i10);
    }
}
