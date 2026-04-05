package e4;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.Person;
import android.app.RemoteAction;
import android.app.RemoteInput;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Network;
import android.net.Uri;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;
import java.util.concurrent.Executor;
import k3.b1;
import k3.c1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    public static void A(Intent intent, int i10) {
        RemoteInput.setResultsSource(intent, i10);
    }

    public static void B(Notification.Action.Builder builder, int i10) {
        builder.setSemanticAction(i10);
    }

    public static void C(RemoteAction remoteAction, boolean z10) {
        remoteAction.setShouldShowIcon(z10);
    }

    public static boolean D(RemoteAction remoteAction) {
        return remoteAction.shouldShowIcon();
    }

    public static boolean E(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static Person F(c1 c1Var) {
        return new Person.Builder().setName(c1Var.getName()).setIcon(c1Var.getIcon() != null ? c1Var.getIcon().toIcon() : null).setUri(c1Var.getUri()).setKey(c1Var.getKey()).setBot(c1Var.isBot()).setImportant(c1Var.isImportant()).build();
    }

    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static DisplayCutout b(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    public static c1 c(Person person) {
        return new b1().setName(person.getName()).setIcon(person.getIcon() != null ? IconCompat.createFromIcon(person.getIcon()) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
    }

    public static List d(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String e(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getDescription();
    }

    public static String[] f(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor g(Context context) {
        return context.getMainExecutor();
    }

    public static Network h(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }

    public static NotificationChannelGroup i(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannelGroup(str);
    }

    public static int j(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String k(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int l(Intent intent) {
        return RemoteInput.getResultsSource(intent);
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int p(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int q(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static int r(Notification.Action action) {
        return action.getSemanticAction();
    }

    public static PrecomputedText.Params s(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static int t(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri u(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static boolean v(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.isBlocked();
    }

    public static View w(Activity activity, int i10) {
        return activity.requireViewById(i10);
    }

    public static View x(Window window, int i10) {
        return window.requireViewById(i10);
    }

    public static void y(NotificationChannelGroup notificationChannelGroup, String str) {
        notificationChannelGroup.setDescription(str);
    }

    public static void z(TextView textView, int i10) {
        textView.setFirstBaselineToTopHeight(i10);
    }
}
