package c4;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityWindowInfo;
import android.view.inputmethod.EditorInfo;
import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static boolean a(Context context) {
        return !context.getPackageManager().isAutoRevokeWhitelisted();
    }

    public static Context b(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static DisplayCutout c(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
        return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
    }

    public static Icon d(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String e(Context context) {
        return context.getAttributionTag();
    }

    public static String f(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static Display g(Activity activity) {
        return activity.getDisplay();
    }

    public static Display h(Context context) {
        try {
            return context.getDisplay();
        } catch (UnsupportedOperationException unused) {
            Log.w("ContextCompat", "The context:" + context + " is not associated with any display. Return a fallback display instead.");
            return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
        }
    }

    public static CharSequence i(EditorInfo editorInfo, int i10) {
        return editorInfo.getInitialSelectedText(i10);
    }

    public static CharSequence j(EditorInfo editorInfo, int i10, int i11) {
        return editorInfo.getInitialTextAfterCursor(i10, i11);
    }

    public static CharSequence k(EditorInfo editorInfo, int i10, int i11) {
        return editorInfo.getInitialTextBeforeCursor(i10, i11);
    }

    public static NotificationChannel l(NotificationManager notificationManager, String str, String str2) {
        return notificationManager.getNotificationChannel(str, str2);
    }

    public static String m(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static String n(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static Insets o(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static AccessibilityWindowInfo p() {
        return new AccessibilityWindowInfo();
    }

    public static boolean q(NotificationChannel notificationChannel) {
        return notificationChannel.isImportantConversation();
    }

    public static void r(NotificationChannel notificationChannel, String str, String str2) {
        notificationChannel.setConversationId(str, str2);
    }

    public static void s(Window window, boolean z10) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-257) : systemUiVisibility | NotificationCompat.FLAG_LOCAL_ONLY);
        window.setDecorFitsSystemWindows(z10);
    }

    public static void t(Window window, boolean z10) {
        window.setDecorFitsSystemWindows(z10);
    }

    public static void u(EditorInfo editorInfo, CharSequence charSequence, int i10) {
        editorInfo.setInitialSurroundingSubText(charSequence, i10);
    }

    public static void v(Activity activity, m3.e eVar, Bundle bundle) {
        activity.setLocusContext(eVar == null ? null : eVar.toLocusId(), bundle);
    }
}
