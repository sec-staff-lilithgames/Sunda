package zp;

import android.content.Context;
import cr.s;
import dq.d0;
import java.util.concurrent.atomic.AtomicBoolean;
import tm.t;
import um.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f98423a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static s f98424b;

    public static String getUserAgent() {
        s sVar = f98424b;
        if (sVar != null) {
            return sVar.getUserAgent();
        }
        return null;
    }

    public static void initialize(Context context) {
        f98423a.compareAndSet(false, true);
    }

    public static void setLoggingEnabled(boolean z10) {
        d0.a(z10);
        t.setLoggingLevel(z10 ? c0.debug : c0.none);
    }

    public static void setUserAgentProvider(s sVar) {
        f98424b = sVar;
    }
}
