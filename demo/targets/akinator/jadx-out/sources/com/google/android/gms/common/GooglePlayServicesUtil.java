package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i10, Activity activity, int i11) {
        return getErrorDialog(i10, activity, i11, null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i10, Context context, int i11) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i10, i11);
    }

    @Deprecated
    public static String getErrorString(int i10) {
        return GooglePlayServicesUtilLight.getErrorString(i10);
    }

    public static Context getRemoteContext(Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i10) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i10);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i10, Activity activity, int i11) {
        return showErrorDialogFragment(i10, activity, i11, null);
    }

    @Deprecated
    public static void showErrorNotification(int i10, Context context) throws Resources.NotFoundException {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i10) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i10)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i10);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i10, Activity activity, int i11, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i10)) {
            i10 = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i10, i11, onCancelListener);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i10) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i10);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i10, Activity activity, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i10, activity, null, i11, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i10, Activity activity, Fragment fragment, int i11, DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i10)) {
            i10 = 18;
        }
        int i12 = i10;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i12, i11, onCancelListener);
        }
        Dialog dialogZaa = googleApiAvailability.zaa(activity, i12, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i12, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D), i11), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, dialogZaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
