package io.odeeo.internal.v1;

import android.os.Build;
import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f67288a = new r();

    public final String getUserAgentString() {
        String property = System.getProperty("http.agent");
        return property == null ? e2.m("Dalvik/2.1.0 (Linux; U; Android %s; %s Build/%s)", "format(format, *args)", 3, new Object[]{Build.VERSION.RELEASE, Build.MODEL, Build.ID}) : property;
    }
}
