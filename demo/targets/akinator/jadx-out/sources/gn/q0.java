package gn;

import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f58075a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f58076b = "media3.common";

    public static synchronized void registerModule(String str) {
        if (f58075a.add(str)) {
            f58076b += ", " + str;
        }
    }

    public static synchronized String registeredModules() {
        return f58076b;
    }
}
