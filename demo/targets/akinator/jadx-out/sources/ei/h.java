package ei;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.f2;
import kotlin.jvm.internal.e0;
import uu.p0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f54405a = new h();

    public static /* synthetic */ f2.e.d.a.c buildProcessDetails$default(h hVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return hVar.buildProcessDetails(str, i10, i11, z10);
    }

    public final f2.e.d.a.c buildProcessDetails(String processName) {
        e0.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, 0, 0, false, 14, null);
    }

    public final List<f2.e.d.a.c> getAppProcessDetails(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listEmptyList;
        e0.checkNotNullParameter(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listEmptyList = activityManager.getRunningAppProcesses()) == null) {
            listEmptyList = p0.emptyList();
        }
        List listFilterNotNull = y0.filterNotNull(listEmptyList);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(f2.e.d.a.c.builder().setProcessName(runningAppProcessInfo.processName).setPid(runningAppProcessInfo.pid).setImportance(runningAppProcessInfo.importance).setDefaultProcess(e0.areEqual(runningAppProcessInfo.processName, str)).build());
        }
        return arrayList2;
    }

    public final f2.e.d.a.c getCurrentProcessDetails(Context context) {
        Object next;
        String str;
        String processName;
        e0.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((f2.e.d.a.c) next).getPid() == iMyPid) {
                break;
            }
        }
        f2.e.d.a.c cVar = (f2.e.d.a.c) next;
        if (cVar != null) {
            return cVar;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 33) {
            if (i10 < 28 || (processName = Application.getProcessName()) == null) {
                str = "";
            }
            return buildProcessDetails$default(this, str, iMyPid, 0, false, 12, null);
        }
        processName = Process.myProcessName();
        e0.checkNotNull(processName);
        str = processName;
        return buildProcessDetails$default(this, str, iMyPid, 0, false, 12, null);
    }

    public final f2.e.d.a.c buildProcessDetails(String processName, int i10) {
        e0.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i10, 0, false, 12, null);
    }

    public final f2.e.d.a.c buildProcessDetails(String processName, int i10, int i11) {
        e0.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i10, i11, false, 8, null);
    }

    public final f2.e.d.a.c buildProcessDetails(String processName, int i10, int i11, boolean z10) {
        e0.checkNotNullParameter(processName, "processName");
        f2.e.d.a.c cVarBuild = f2.e.d.a.c.builder().setProcessName(processName).setPid(i10).setImportance(i11).setDefaultProcess(z10).build();
        e0.checkNotNullExpressionValue(cVarBuild, "build(...)");
        return cVarBuild;
    }
}
