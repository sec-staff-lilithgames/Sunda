package io.odeeo.internal.t0;

import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f66452a = Logger.getLogger(t.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final s f66453b = a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements s {
        public b() {
        }

        @Override // io.odeeo.internal.t0.s
        public g compile(String str) {
            return new m(Pattern.compile(str));
        }

        @Override // io.odeeo.internal.t0.s
        public boolean isPcreLike() {
            return true;
        }
    }

    public static d a(d dVar) {
        return dVar.a();
    }

    public static String b(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }

    public static String c(String str) {
        return str == null ? "" : str;
    }

    public static boolean d(String str) {
        return str == null || str.isEmpty();
    }

    public static g a(String str) {
        u.checkNotNull(str);
        return f66453b.compile(str);
    }

    public static boolean b() {
        return f66453b.isPcreLike();
    }

    public static s a() {
        return new b();
    }
}
