package w6;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import n6.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90436a;

    static {
        String strTagWithPrefix = n6.c0.tagWithPrefix("ProcessUtils");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f90436a = strTagWithPrefix;
    }

    public static final boolean isDefaultProcess(Context context, androidx.work.a configuration) {
        String processName;
        Object next;
        Object objInvoke;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            processName = a.f90387a.getProcessName();
        } else {
            processName = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, y0.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                kotlin.jvm.internal.e0.checkNotNull(objInvoke);
            } catch (Throwable th2) {
                n6.c0.get().debug(f90436a, "Unable to check ActivityThread for processName", th2);
            }
            if (objInvoke instanceof String) {
                processName = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        processName = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        String defaultProcessName = configuration.getDefaultProcessName();
        return (defaultProcessName == null || defaultProcessName.length() == 0) ? kotlin.jvm.internal.e0.areEqual(processName, context.getApplicationInfo().processName) : kotlin.jvm.internal.e0.areEqual(processName, configuration.getDefaultProcessName());
    }
}
