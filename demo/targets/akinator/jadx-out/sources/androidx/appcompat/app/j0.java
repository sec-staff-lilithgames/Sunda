package androidx.appcompat.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Handler;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityWindowInfo;
import android.widget.TextView;
import androidx.browser.trusted.TrustedWebActivityService;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j0 {
    public static int[] A(TextView textView) {
        return textView.getAutoSizeTextAvailableSizes();
    }

    public static void A0(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static int B(TextView textView) {
        return textView.getAutoSizeTextType();
    }

    public static void B0(NotificationChannel notificationChannel, int i10) {
        notificationChannel.setLightColor(i10);
    }

    public static int C(Notification notification) {
        return notification.getBadgeIconType();
    }

    public static void C0(MenuItem menuItem, char c10, int i10) {
        menuItem.setNumericShortcut(c10, i10);
    }

    public static String D(Notification notification) {
        return notification.getChannelId();
    }

    public static void D0(Notification.Builder builder, CharSequence charSequence) {
        builder.setSettingsText(charSequence);
    }

    public static List E(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getChannels();
    }

    public static void E0(MenuItem menuItem, char c10, char c11, int i10, int i11) {
        menuItem.setShortcut(c10, c11, i10, i11);
    }

    public static CharSequence F(RemoteAction remoteAction) {
        return remoteAction.getContentDescription();
    }

    public static void F0(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static CharSequence G(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    public static void G0(NotificationChannel notificationChannel, boolean z10) {
        notificationChannel.setShowBadge(z10);
    }

    public static Map H(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static void H0(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }

    public static String I(NotificationChannel notificationChannel) {
        return notificationChannel.getDescription();
    }

    public static void I0(Notification.Builder builder, long j10) {
        builder.setTimeoutAfter(j10);
    }

    public static String J(NotificationChannel notificationChannel) {
        return notificationChannel.getGroup();
    }

    public static void J0(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static int K(Notification notification) {
        return notification.getGroupAlertBehavior();
    }

    public static void K0(NotificationChannel notificationChannel, long[] jArr) {
        notificationChannel.setVibrationPattern(jArr);
    }

    public static Icon L(RemoteAction remoteAction) {
        return remoteAction.getIcon();
    }

    public static boolean L0(NotificationChannel notificationChannel) {
        return notificationChannel.shouldShowLights();
    }

    public static ColorStateList M(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static boolean M0(NotificationChannel notificationChannel) {
        return notificationChannel.shouldVibrate();
    }

    public static PorterDuff.Mode N(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    public static void N0(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static String O(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    public static String P(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }

    public static int Q(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance();
    }

    public static int R(NotificationChannel notificationChannel) {
        return notificationChannel.getLightColor();
    }

    public static int S(NotificationChannel notificationChannel) {
        return notificationChannel.getLockscreenVisibility();
    }

    public static CharSequence T(NotificationChannel notificationChannel) {
        return notificationChannel.getName();
    }

    public static CharSequence U(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getName();
    }

    public static NotificationChannel V(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static List W(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroups();
    }

    public static List X(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static int Y(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    public static float Z(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void a(k3.g1 g1Var, Intent intent, Map map) {
        RemoteInput.addDataResultToIntent(k3.e1.fromCompat(g1Var), intent, map);
    }

    public static float a0(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static boolean b(NotificationChannel notificationChannel) {
        return notificationChannel.canBypassDnd();
    }

    public static CharSequence b0(Notification notification) {
        return notification.getSettingsText();
    }

    public static boolean c(NotificationChannel notificationChannel) {
        return notificationChannel.canShowBadge();
    }

    public static String c0(Notification notification) {
        return notification.getShortcutId();
    }

    public static Color d(Color color, Color color2) {
        if (!Objects.equals(color.getModel(), color2.getModel())) {
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
        }
        if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
            color = color.convert(color2.getColorSpace());
        }
        float[] components = color.getComponents();
        float[] components2 = color2.getComponents();
        float fAlpha = color.alpha();
        float fAlpha2 = (1.0f - fAlpha) * color2.alpha();
        int componentCount = color2.getComponentCount() - 1;
        float f10 = fAlpha + fAlpha2;
        components2[componentCount] = f10;
        if (f10 > 0.0f) {
            fAlpha /= f10;
            fAlpha2 /= f10;
        }
        for (int i10 = 0; i10 < componentCount; i10++) {
            components2[i10] = (components2[i10] * fAlpha2) + (components[i10] * fAlpha);
        }
        return Color.valueOf(components2, color2.getColorSpace());
    }

    public static Uri d0(NotificationChannel notificationChannel) {
        return notificationChannel.getSound();
    }

    public static Notification e(TrustedWebActivityService trustedWebActivityService, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification);
        builderRecoverBuilder.setChannelId(str);
        return builderRecoverBuilder.build();
    }

    public static long e0(Notification notification) {
        return notification.getTimeoutAfter();
    }

    public static Notification.Builder f(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static CharSequence f0(RemoteAction remoteAction) {
        return remoteAction.getTitle();
    }

    public static NotificationChannel g(String str, CharSequence charSequence, int i10) {
        return new NotificationChannel(str, charSequence, i10);
    }

    public static CharSequence g0(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    public static void h(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static long[] h0(NotificationChannel notificationChannel) {
        return notificationChannel.getVibrationPattern();
    }

    public static NotificationChannelGroup i(CharSequence charSequence, String str) {
        return new NotificationChannelGroup(str, charSequence);
    }

    public static boolean i0(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }

    public static void j(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public static boolean j0(RemoteAction remoteAction) {
        return remoteAction.isEnabled();
    }

    public static void k(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    public static boolean k0(AccessibilityWindowInfo accessibilityWindowInfo) {
        return accessibilityWindowInfo.isInPictureInPictureMode();
    }

    public static void l(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannels(list);
    }

    public static Intent l0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        return ((i10 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, m3.a.obtainAndCheckReceiverPermission(context), handler);
    }

    public static RemoteAction m(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
    }

    public static Intent m0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
    }

    public static Icon n(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static void n0(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void o(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    public static void o0(MenuItem menuItem, char c10, int i10) {
        menuItem.setAlphabeticShortcut(c10, i10);
    }

    public static void p(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }

    public static void p0(TextView textView, int i10, int i11, int i12, int i13) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    public static void q(NotificationChannel notificationChannel, boolean z10) {
        notificationChannel.enableLights(z10);
    }

    public static void q0(TextView textView, int[] iArr, int i10) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    public static void r(NotificationChannel notificationChannel, boolean z10) {
        notificationChannel.enableVibration(z10);
    }

    public static void r0(TextView textView, int i10) {
        textView.setAutoSizeTextTypeWithDefaults(i10);
    }

    public static void s(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i10 = configuration.colorMode & 3;
        int i11 = configuration2.colorMode & 3;
        if (i10 != i11) {
            configuration3.colorMode |= i11;
        }
        int i12 = configuration.colorMode & 12;
        int i13 = configuration2.colorMode & 12;
        if (i12 != i13) {
            configuration3.colorMode |= i13;
        }
    }

    public static void s0(Notification.Builder builder, int i10) {
        builder.setBadgeIconType(i10);
    }

    public static PendingIntent t(RemoteAction remoteAction) {
        return remoteAction.getActionIntent();
    }

    public static void t0(Notification.Builder builder, boolean z10) {
        builder.setColorized(z10);
    }

    public static Set u(RemoteInput remoteInput) {
        return remoteInput.getAllowedDataTypes();
    }

    public static void u0(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static int v(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    public static void v0(NotificationChannel notificationChannel, String str) {
        notificationChannel.setDescription(str);
    }

    public static AudioAttributes w(NotificationChannel notificationChannel) {
        return notificationChannel.getAudioAttributes();
    }

    public static void w0(RemoteAction remoteAction, boolean z10) {
        remoteAction.setEnabled(z10);
    }

    public static int x(TextView textView) {
        return textView.getAutoSizeMaxTextSize();
    }

    public static void x0(NotificationChannel notificationChannel, String str) {
        notificationChannel.setGroup(str);
    }

    public static int y(TextView textView) {
        return textView.getAutoSizeMinTextSize();
    }

    public static void y0(Notification.Builder builder, int i10) {
        builder.setGroupAlertBehavior(i10);
    }

    public static int z(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void z0(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }
}
