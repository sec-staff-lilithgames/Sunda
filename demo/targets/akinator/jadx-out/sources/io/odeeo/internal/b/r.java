package io.odeeo.internal.b;

import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f62955a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public static String f62956b = "goog.exo.core";

    public static synchronized void registerModule(String str) {
        if (f62955a.add(str)) {
            f62956b += ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return f62956b;
    }
}
