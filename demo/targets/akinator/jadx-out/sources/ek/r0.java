package ek;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f54624a = new r0();

    public final List<q0> getAppProcessDetails(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listEmptyList;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listEmptyList = activityManager.getRunningAppProcesses()) == null) {
            listEmptyList = uu.p0.emptyList();
        }
        List listFilterNotNull = uu.y0.filterNotNull(listEmptyList);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(uu.q0.collectionSizeOrDefault(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String processName = runningAppProcessInfo.processName;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(processName, "processName");
            arrayList2.add(new q0(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.e0.areEqual(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final q0 getMyProcessDetails(Context context) {
        Object next;
        String myProcessName;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((q0) next).getPid() == iMyPid) {
                break;
            }
        }
        q0 q0Var = (q0) next;
        if (q0Var != null) {
            return q0Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            myProcessName = Process.myProcessName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(myProcessName, "myProcessName(...)");
        } else if ((i10 < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
            myProcessName = "";
        }
        return new q0(myProcessName, iMyPid, 0, false);
    }
}
