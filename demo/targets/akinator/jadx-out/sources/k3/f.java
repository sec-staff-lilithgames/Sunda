package k3;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import j1.o2;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f extends m3.a {
    public static void finishAffinity(Activity activity) {
        activity.finishAffinity();
    }

    public static void finishAfterTransition(Activity activity) {
        activity.finishAfterTransition();
    }

    public static c getPermissionCompatDelegate() {
        return null;
    }

    public static Uri getReferrer(Activity activity) {
        return activity.getReferrer();
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static boolean isLaunchedFromBubble(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 ? a.d(activity) : i10 == 30 ? (c4.a.g(activity) == null || c4.a.g(activity).getDisplayId() == 0) ? false : true : (i10 != 29 || activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
    }

    public static void postponeEnterTransition(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void recreate(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new ji.t(activity, 2));
        }
    }

    public static x3.t requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
        return x3.t.request(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(Activity activity, String[] strArr, int i10) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (TextUtils.isEmpty(strArr[i11])) {
                throw new IllegalArgumentException(o2.o(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (activity instanceof d) {
            ((d) activity).validateRequestPermissionsRequestCode(i10);
        }
        activity.requestPermissions(strArr, i10);
    }

    public static <T extends View> T requireViewById(Activity activity, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) e4.q.w(activity, i10);
        }
        T t10 = (T) activity.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(Activity activity, i1 i1Var) {
        activity.setEnterSharedElementCallback(i1Var != null ? new e(i1Var) : null);
    }

    public static void setExitSharedElementCallback(Activity activity, i1 i1Var) {
        activity.setExitSharedElementCallback(i1Var != null ? new e(i1Var) : null);
    }

    public static void setLocusContext(Activity activity, m3.e eVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            c4.a.v(activity, eVar, bundle);
        }
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i10 >= 32) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        if (i10 != 31) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i10, Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public static void startPostponedEnterTransition(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static void setPermissionCompatDelegate(c cVar) {
    }
}
