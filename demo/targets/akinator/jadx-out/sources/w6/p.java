package w6;

import android.net.NetworkRequest;
import android.net.NetworkSpecifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f90428a = new p();

    public final NetworkSpecifier getNetworkSpecifier(NetworkRequest request) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        return request.getNetworkSpecifier();
    }
}
