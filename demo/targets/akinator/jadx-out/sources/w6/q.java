package w6;

import android.net.NetworkRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f90429a = new q();

    public final int[] capabilities(NetworkRequest request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        int[] capabilities = request.getCapabilities();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(capabilities, "getCapabilities(...)");
        return capabilities;
    }

    public final int[] transportTypes(NetworkRequest request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        int[] transportTypes = request.getTransportTypes();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(transportTypes, "getTransportTypes(...)");
        return transportTypes;
    }
}
