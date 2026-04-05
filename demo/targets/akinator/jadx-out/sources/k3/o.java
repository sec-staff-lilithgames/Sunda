package k3;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {
    public static int checkOrNoteProxyOp(Context context, int i10, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return noteProxyOpNoThrow(context, str, str2);
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        int iCheckOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(str, Binder.getCallingUid(), str2);
        if (iCheckOpNoThrow != 0) {
            return iCheckOpNoThrow;
        }
        String strM = com.google.firebase.messaging.b0.m(context);
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i10, strM);
    }

    public static int noteOp(Context context, String str, int i10, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i10, str2);
    }

    public static int noteOpNoThrow(Context context, String str, int i10, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i10, str2);
    }

    public static int noteProxyOp(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    public static int noteProxyOpNoThrow(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    public static String permissionToOp(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
