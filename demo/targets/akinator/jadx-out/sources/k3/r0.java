package k3;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: d, reason: collision with root package name */
    public static String f70245d;

    /* renamed from: g, reason: collision with root package name */
    public static p0 f70248g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f70249a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f70250b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f70244c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f70246e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f70247f = new Object();

    public r0(Context context) {
        this.f70249a = context;
        this.f70250b = (NotificationManager) context.getSystemService("notification");
    }

    public static r0 from(Context context) {
        return new r0(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f70244c) {
            if (string != null) {
                try {
                    if (!string.equals(f70245d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f70246e = hashSet2;
                        f70245d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            hashSet = f70246e;
        }
        return hashSet;
    }

    public boolean areNotificationsEnabled() {
        return this.f70250b.areNotificationsEnabled();
    }

    public boolean canPostPromotedNotifications() {
        if (Build.VERSION.SDK_INT >= 36) {
            return androidx.browser.customtabs.x.a(this.f70250b);
        }
        return false;
    }

    public boolean canUseFullScreenIntent() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29) {
            return true;
        }
        return i10 < 34 ? this.f70249a.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : androidx.browser.customtabs.w.a(this.f70250b);
    }

    public void cancel(int i10) {
        cancel(null, i10);
    }

    public void cancelAll() {
        this.f70250b.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.h(this.f70250b, notificationChannel);
        }
    }

    public void createNotificationChannelGroup(f0 f0Var) {
        NotificationChannelGroup notificationChannelGroup;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            f0Var.getClass();
            notificationChannelGroup = null;
        } else {
            NotificationChannelGroup notificationChannelGroupI = androidx.appcompat.app.j0.i(f0Var.f70165b, f0Var.f70164a);
            if (i10 >= 28) {
                e4.q.y(notificationChannelGroupI, f0Var.f70166c);
            }
            notificationChannelGroup = notificationChannelGroupI;
        }
        createNotificationChannelGroup(notificationChannelGroup);
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.k(this.f70250b, list);
        }
    }

    public void createNotificationChannelGroupsCompat(List<f0> list) {
        NotificationChannelGroup notificationChannelGroup;
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (f0 f0Var : list) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 26) {
                f0Var.getClass();
                notificationChannelGroup = null;
            } else {
                NotificationChannelGroup notificationChannelGroupI = androidx.appcompat.app.j0.i(f0Var.f70165b, f0Var.f70164a);
                if (i10 >= 28) {
                    e4.q.y(notificationChannelGroupI, f0Var.f70166c);
                }
                notificationChannelGroup = notificationChannelGroupI;
            }
            arrayList.add(notificationChannelGroup);
        }
        androidx.appcompat.app.j0.k(this.f70250b, arrayList);
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.l(this.f70250b, list);
        }
    }

    public void createNotificationChannelsCompat(List<d0> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<d0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        androidx.appcompat.app.j0.l(this.f70250b, arrayList);
    }

    public void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.o(this.f70250b, str);
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.p(this.f70250b, str);
        }
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = this.f70250b;
            Iterator<NotificationChannel> it = notificationManager.getNotificationChannels().iterator();
            while (it.hasNext()) {
                NotificationChannel notificationChannelC = j1.u.c(it.next());
                if (!collection.contains(notificationChannelC.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(c4.a.n(notificationChannelC)))) {
                    notificationManager.deleteNotificationChannel(notificationChannelC.getId());
                }
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        StatusBarNotification[] activeNotifications = this.f70250b.getActiveNotifications();
        return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
    }

    public int getCurrentInterruptionFilter() {
        return this.f70250b.getCurrentInterruptionFilter();
    }

    public int getImportance() {
        return this.f70250b.getImportance();
    }

    public NotificationChannel getNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.appcompat.app.j0.V(this.f70250b, str);
        }
        return null;
    }

    public d0 getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new d0(notificationChannel);
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return e4.q.i(this.f70250b, str);
        }
        if (i10 < 26) {
            return null;
        }
        Iterator<NotificationChannelGroup> it = getNotificationChannelGroups().iterator();
        while (it.hasNext()) {
            NotificationChannelGroup notificationChannelGroupD = j1.u.d(it.next());
            if (notificationChannelGroupD.getId().equals(str)) {
                return notificationChannelGroupD;
            }
        }
        return null;
    }

    public f0 getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new f0(notificationChannelGroup2);
            }
            return null;
        }
        if (i10 < 26 || (notificationChannelGroup = getNotificationChannelGroup(str)) == null) {
            return null;
        }
        return new f0(notificationChannelGroup, getNotificationChannels());
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return Build.VERSION.SDK_INT >= 26 ? androidx.appcompat.app.j0.W(this.f70250b) : Collections.EMPTY_LIST;
    }

    public List<f0> getNotificationChannelGroupsCompat() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                List<NotificationChannel> notificationChannels = i10 >= 28 ? Collections.EMPTY_LIST : getNotificationChannels();
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                Iterator<NotificationChannelGroup> it = notificationChannelGroups.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup notificationChannelGroupD = j1.u.d(it.next());
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new f0(notificationChannelGroupD));
                    } else {
                        arrayList.add(new f0(notificationChannelGroupD, notificationChannels));
                    }
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public List<NotificationChannel> getNotificationChannels() {
        return Build.VERSION.SDK_INT >= 26 ? androidx.appcompat.app.j0.X(this.f70250b) : Collections.EMPTY_LIST;
    }

    public List<d0> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                Iterator<NotificationChannel> it = notificationChannels.iterator();
                while (it.hasNext()) {
                    arrayList.add(new d0(j1.u.c(it.next())));
                }
                return arrayList;
            }
        }
        return Collections.EMPTY_LIST;
    }

    public void notify(int i10, Notification notification) {
        notify(null, i10, notification);
    }

    public void cancel(String str, int i10) {
        this.f70250b.cancel(str, i10);
    }

    public void notify(String str, int i10, Notification notification) {
        NotificationManager notificationManager = this.f70250b;
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras == null || !extras.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i10, notification);
            return;
        }
        m0 m0Var = new m0(this.f70249a.getPackageName(), i10, notification, str);
        synchronized (f70247f) {
            try {
                if (f70248g == null) {
                    f70248g = new p0(this.f70249a.getApplicationContext());
                }
                f70248g.queueTask(m0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notificationManager.cancel(str, i10);
    }

    public void createNotificationChannel(d0 d0Var) {
        createNotificationChannel(d0Var.a());
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c4.a.l(this.f70250b, str, str2);
        }
        return getNotificationChannel(str);
    }

    public d0 getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new d0(notificationChannel);
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.j(this.f70250b, notificationChannelGroup);
        }
    }

    public void notify(List<l0> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l0 l0Var = list.get(i10);
            notify(l0Var.f70213a, l0Var.f70214b, l0Var.f70215c);
        }
    }
}
