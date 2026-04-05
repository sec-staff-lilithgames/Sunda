package w6;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90399a;

    static {
        String strTagWithPrefix = n6.c0.tagWithPrefix("WakeLocks");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f90399a = strTagWithPrefix;
    }

    public static final void checkWakeLocks() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d0 d0Var = d0.f90400a;
        synchronized (d0Var) {
            linkedHashMap.putAll(d0Var.getWakeLocks());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                n6.c0.get().warning(f90399a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock newWakeLock(Context context, String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strK = a.b.k("WorkManager: ", tag);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strK);
        d0 d0Var = d0.f90400a;
        synchronized (d0Var) {
            d0Var.getWakeLocks().put(wakeLockNewWakeLock, strK);
        }
        kotlin.jvm.internal.e0.checkNotNull(wakeLockNewWakeLock);
        return wakeLockNewWakeLock;
    }
}
