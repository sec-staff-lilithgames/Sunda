package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.appcompat.app.j0;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import k3.b0;
import k3.c1;
import k3.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5743a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f5744b;

    /* renamed from: c, reason: collision with root package name */
    public final NotificationCompat.d f5745c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f5746d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5747e;

    public z(NotificationCompat.d dVar) {
        int i10;
        ArrayList arrayList;
        new ArrayList();
        this.f5746d = new Bundle();
        this.f5745c = dVar;
        Context context = dVar.f5662a;
        ArrayList arrayList2 = dVar.Y;
        ArrayList arrayList3 = dVar.f5664c;
        ArrayList arrayList4 = dVar.f5665d;
        this.f5743a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5744b = j0.f(context, dVar.M);
        } else {
            this.f5744b = new Notification.Builder(context);
        }
        Notification notification = dVar.V;
        this.f5744b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f5671j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f5666e).setContentText(dVar.f5667f).setContentInfo(dVar.f5673l).setContentIntent(dVar.f5669h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f5670i, (notification.flags & 128) != 0).setNumber(dVar.f5674m).setProgress(dVar.f5683v, dVar.f5684w, dVar.f5685x);
        Notification.Builder builder = this.f5744b;
        IconCompat iconCompat = dVar.f5672k;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.toIcon(context));
        this.f5744b.setSubText(dVar.f5680s).setUsesChronometer(dVar.f5677p).setPriority(dVar.f5675n);
        NotificationCompat.j jVar = dVar.f5679r;
        if (jVar instanceof NotificationCompat.e) {
            Iterator<NotificationCompat.a> it = ((NotificationCompat.e) jVar).getActionsListWithSystemActions().iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        } else {
            Iterator it2 = dVar.f5663b.iterator();
            while (it2.hasNext()) {
                a((NotificationCompat.a) it2.next());
            }
        }
        Bundle bundle = dVar.F;
        if (bundle != null) {
            this.f5746d.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f5744b.setShowWhen(dVar.f5676o);
        this.f5744b.setLocalOnly(dVar.B);
        this.f5744b.setGroup(dVar.f5686y);
        this.f5744b.setSortKey(dVar.A);
        this.f5744b.setGroupSummary(dVar.f5687z);
        this.f5747e = dVar.R;
        this.f5744b.setCategory(dVar.E);
        this.f5744b.setColor(dVar.G);
        this.f5744b.setVisibility(dVar.H);
        this.f5744b.setPublicVersion(dVar.I);
        this.f5744b.setSound(notification.sound, notification.audioAttributes);
        if (i11 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((c1) it3.next()).resolveToLegacyUri());
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    z.g gVar = new z.g(arrayList2.size() + arrayList.size());
                    gVar.addAll(arrayList);
                    gVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                this.f5744b.addPerson((String) it4.next());
            }
        }
        if (arrayList4.size() > 0) {
            Bundle bundle2 = dVar.getExtras().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                String string = Integer.toString(i12);
                NotificationCompat.a aVar = (NotificationCompat.a) arrayList4.get(i12);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompat2 = aVar.getIconCompat();
                bundle5.putInt("icon", iconCompat2 != null ? iconCompat2.getResId() : 0);
                bundle5.putCharSequence("title", aVar.getTitle());
                bundle5.putParcelable("actionIntent", aVar.getActionIntent());
                Bundle bundle6 = aVar.getExtras() != null ? new Bundle(aVar.getExtras()) : new Bundle();
                bundle6.putBoolean("android.support.allowGeneratedReplies", aVar.getAllowGeneratedReplies());
                bundle5.putBundle("extras", bundle6);
                bundle5.putParcelableArray("remoteInputs", a0.e(aVar.getRemoteInputs()));
                bundle5.putBoolean("showsUserInterface", aVar.getShowsUserInterface());
                bundle5.putInt("semanticAction", aVar.getSemanticAction());
                bundle4.putBundle(string, bundle5);
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.getExtras().putBundle("android.car.EXTENSIONS", bundle2);
            this.f5746d.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Icon icon = dVar.X;
        if (icon != null) {
            this.f5744b.setSmallIcon(icon);
        }
        this.f5744b.setExtras(dVar.F);
        this.f5744b.setRemoteInputHistory(dVar.f5682u);
        RemoteViews remoteViews = dVar.J;
        if (remoteViews != null) {
            this.f5744b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = dVar.K;
        if (remoteViews2 != null) {
            this.f5744b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = dVar.L;
        if (remoteViews3 != null) {
            this.f5744b.setCustomHeadsUpContentView(remoteViews3);
        }
        if (i13 >= 26) {
            j0.s0(this.f5744b, dVar.N);
            j0.D0(this.f5744b, dVar.f5681t);
            j0.F0(this.f5744b, dVar.O);
            j0.I0(this.f5744b, dVar.Q);
            j0.y0(this.f5744b, dVar.R);
            if (dVar.D) {
                j0.t0(this.f5744b, dVar.C);
            }
            if (!TextUtils.isEmpty(dVar.M)) {
                this.f5744b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                e4.q.a(this.f5744b, ((c1) it5.next()).toAndroidPerson());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            com.google.firebase.messaging.b0.t(this.f5744b, dVar.T);
            com.google.firebase.messaging.b0.v(this.f5744b, k3.j0.toPlatform(dVar.U));
            m3.e eVar = dVar.P;
            if (eVar != null) {
                com.google.firebase.messaging.b0.z(this.f5744b, eVar.toLocusId());
            }
        }
        if (i14 >= 31 && (i10 = dVar.S) != 0) {
            k3.a.f(this.f5744b, i10);
        }
        if (i14 >= 36) {
            androidx.browser.customtabs.x.d(this.f5744b, dVar.f5668g);
        }
        if (dVar.W) {
            if (this.f5745c.f5687z) {
                this.f5747e = 2;
            } else {
                this.f5747e = 1;
            }
            this.f5744b.setVibrate(null);
            this.f5744b.setSound(null);
            int i15 = notification.defaults & (-4);
            notification.defaults = i15;
            this.f5744b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f5745c.f5686y)) {
                    this.f5744b.setGroup(NotificationCompat.GROUP_KEY_SILENT);
                }
                j0.y0(this.f5744b, this.f5747e);
            }
        }
    }

    public final void a(NotificationCompat.a aVar) {
        IconCompat iconCompat = aVar.getIconCompat();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.toIcon() : null, aVar.getTitle(), aVar.getActionIntent());
        if (aVar.getRemoteInputs() != null) {
            for (RemoteInput remoteInput : g1.a(aVar.getRemoteInputs())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.getExtras() != null ? new Bundle(aVar.getExtras()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.getAllowGeneratedReplies());
        int i10 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(aVar.getAllowGeneratedReplies());
        bundle.putInt("android.support.action.semanticAction", aVar.getSemanticAction());
        if (i10 >= 28) {
            e4.q.B(builder, aVar.getSemanticAction());
        }
        if (i10 >= 29) {
            com.google.firebase.messaging.b0.w(builder, aVar.isContextual());
        }
        if (i10 >= 31) {
            k3.a.e(builder, aVar.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.getShowsUserInterface());
        builder.addExtras(bundle);
        this.f5744b.addAction(builder.build());
    }

    public Notification build() {
        Notification notificationBuild;
        Bundle extras;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        NotificationCompat.d dVar = this.f5745c;
        NotificationCompat.j jVar = dVar.f5679r;
        if (jVar != null) {
            jVar.apply(this);
        }
        RemoteViews remoteViewsMakeContentView = jVar != null ? jVar.makeContentView(this) : null;
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = this.f5744b;
        if (i10 >= 26) {
            notificationBuild = builder.build();
        } else {
            Notification notificationBuild2 = builder.build();
            int i11 = this.f5747e;
            if (i11 != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && i11 == 2) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && i11 == 1) {
                    notificationBuild2.sound = null;
                    notificationBuild2.vibrate = null;
                    notificationBuild2.defaults &= -4;
                }
            }
            notificationBuild = notificationBuild2;
        }
        if (remoteViewsMakeContentView != null) {
            notificationBuild.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = dVar.J;
            if (remoteViews != null) {
                notificationBuild.contentView = remoteViews;
            }
        }
        if (jVar != null && (remoteViewsMakeBigContentView = jVar.makeBigContentView(this)) != null) {
            notificationBuild.bigContentView = remoteViewsMakeBigContentView;
        }
        if (jVar != null && (remoteViewsMakeHeadsUpContentView = dVar.f5679r.makeHeadsUpContentView(this)) != null) {
            notificationBuild.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (jVar != null && (extras = NotificationCompat.getExtras(notificationBuild)) != null) {
            jVar.addCompatExtras(extras);
        }
        return notificationBuild;
    }

    @Override // k3.b0
    public Notification.Builder getBuilder() {
        return this.f5744b;
    }
}
