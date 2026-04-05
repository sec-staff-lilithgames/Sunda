package xv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z0 {
    public z0(kotlin.jvm.internal.u uVar) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final a1 forJavaName(String javaName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return a1.f93570g;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return a1.f93569f;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return a1.f93568e;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return a1.f93571h;
            }
        } else if (javaName.equals("SSLv3")) {
            return a1.f93572i;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }
}
