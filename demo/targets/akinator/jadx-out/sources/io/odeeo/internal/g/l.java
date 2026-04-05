package io.odeeo.internal.g;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f64143a = new bt.a(1);

    static /* synthetic */ h[] a() {
        return new h[0];
    }

    h[] createExtractors();

    default h[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }
}
