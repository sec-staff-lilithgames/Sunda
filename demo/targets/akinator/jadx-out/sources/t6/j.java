package t6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.e0;
import n6.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f86401a;

    static {
        String strTagWithPrefix = c0.tagWithPrefix("NetworkStateTracker");
        e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f86401a = strTagWithPrefix;
    }

    public static final f NetworkStateTracker(Context context, x6.b taskExecutor) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new i(context, taskExecutor);
    }

    public static final r6.i getActiveNetworkState(ConnectivityManager connectivityManager) {
        e0.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return new r6.i(activeNetworkInfo != null && activeNetworkInfo.isConnected(), isActiveNetworkValidated(connectivityManager), s3.a.isActiveNetworkMetered(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
        } catch (SecurityException e10) {
            c0.get().error(f86401a, "Unable to get active network state", e10);
            return new r6.i(false, false, false, true);
        }
    }

    public static final boolean isActiveNetworkValidated(ConnectivityManager connectivityManager) {
        e0.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e10) {
            c0.get().error(f86401a, "Unable to validate active network", e10);
            return false;
        }
    }

    public static final r6.i getActiveNetworkState(NetworkCapabilities networkCapabilities) {
        e0.checkNotNullParameter(networkCapabilities, "<this>");
        return new r6.i(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }

    public static /* synthetic */ void getActiveNetworkState$annotations(ConnectivityManager connectivityManager) {
    }
}
