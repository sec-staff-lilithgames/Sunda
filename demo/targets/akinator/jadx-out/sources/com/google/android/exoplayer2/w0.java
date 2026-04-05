package com.google.android.exoplayer2;

import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f28642a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f28643b = "goog.exo.core";

    public static synchronized void registerModule(String str) {
        if (f28642a.add(str)) {
            f28643b += ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return f28643b;
    }
}
