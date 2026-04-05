package k3;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f70142a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f70143b;

    /* renamed from: c, reason: collision with root package name */
    public int f70144c;

    /* renamed from: d, reason: collision with root package name */
    public String f70145d;

    /* renamed from: e, reason: collision with root package name */
    public String f70146e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f70147f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f70148g;

    /* renamed from: h, reason: collision with root package name */
    public AudioAttributes f70149h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f70150i;

    /* renamed from: j, reason: collision with root package name */
    public int f70151j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f70152k;

    /* renamed from: l, reason: collision with root package name */
    public long[] f70153l;

    /* renamed from: m, reason: collision with root package name */
    public String f70154m;

    /* renamed from: n, reason: collision with root package name */
    public String f70155n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f70156o;

    /* renamed from: p, reason: collision with root package name */
    public final int f70157p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f70158q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f70159r;

    public d0(String str, int i10) {
        this.f70147f = true;
        this.f70148g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f70151j = 0;
        this.f70142a = (String) w3.i.checkNotNull(str);
        this.f70144c = i10;
        this.f70149h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public final NotificationChannel a() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannel notificationChannelG = androidx.appcompat.app.j0.g(this.f70142a, this.f70143b, this.f70144c);
        androidx.appcompat.app.j0.v0(notificationChannelG, this.f70145d);
        androidx.appcompat.app.j0.x0(notificationChannelG, this.f70146e);
        androidx.appcompat.app.j0.G0(notificationChannelG, this.f70147f);
        androidx.appcompat.app.j0.H0(notificationChannelG, this.f70148g, this.f70149h);
        androidx.appcompat.app.j0.q(notificationChannelG, this.f70150i);
        androidx.appcompat.app.j0.B0(notificationChannelG, this.f70151j);
        androidx.appcompat.app.j0.K0(notificationChannelG, this.f70153l);
        androidx.appcompat.app.j0.r(notificationChannelG, this.f70152k);
        if (i10 >= 30 && (str = this.f70154m) != null && (str2 = this.f70155n) != null) {
            c4.a.r(notificationChannelG, str, str2);
        }
        return notificationChannelG;
    }

    public boolean canBubble() {
        return this.f70158q;
    }

    public boolean canBypassDnd() {
        return this.f70156o;
    }

    public boolean canShowBadge() {
        return this.f70147f;
    }

    public AudioAttributes getAudioAttributes() {
        return this.f70149h;
    }

    public String getConversationId() {
        return this.f70155n;
    }

    public String getDescription() {
        return this.f70145d;
    }

    public String getGroup() {
        return this.f70146e;
    }

    public String getId() {
        return this.f70142a;
    }

    public int getImportance() {
        return this.f70144c;
    }

    public int getLightColor() {
        return this.f70151j;
    }

    public int getLockscreenVisibility() {
        return this.f70157p;
    }

    public CharSequence getName() {
        return this.f70143b;
    }

    public String getParentChannelId() {
        return this.f70154m;
    }

    public Uri getSound() {
        return this.f70148g;
    }

    public long[] getVibrationPattern() {
        return this.f70153l;
    }

    public boolean isImportantConversation() {
        return this.f70159r;
    }

    public boolean shouldShowLights() {
        return this.f70150i;
    }

    public boolean shouldVibrate() {
        return this.f70152k;
    }

    public c0 toBuilder() {
        return new c0(this.f70142a, this.f70144c).setName(this.f70143b).setDescription(this.f70145d).setGroup(this.f70146e).setShowBadge(this.f70147f).setSound(this.f70148g, this.f70149h).setLightsEnabled(this.f70150i).setLightColor(this.f70151j).setVibrationEnabled(this.f70152k).setVibrationPattern(this.f70153l).setConversationId(this.f70154m, this.f70155n);
    }

    public d0(NotificationChannel notificationChannel) {
        this(androidx.appcompat.app.j0.O(notificationChannel), androidx.appcompat.app.j0.Q(notificationChannel));
        this.f70143b = androidx.appcompat.app.j0.T(notificationChannel);
        this.f70145d = androidx.appcompat.app.j0.I(notificationChannel);
        this.f70146e = androidx.appcompat.app.j0.J(notificationChannel);
        this.f70147f = androidx.appcompat.app.j0.c(notificationChannel);
        this.f70148g = androidx.appcompat.app.j0.d0(notificationChannel);
        this.f70149h = androidx.appcompat.app.j0.w(notificationChannel);
        this.f70150i = androidx.appcompat.app.j0.L0(notificationChannel);
        this.f70151j = androidx.appcompat.app.j0.R(notificationChannel);
        this.f70152k = androidx.appcompat.app.j0.M0(notificationChannel);
        this.f70153l = androidx.appcompat.app.j0.h0(notificationChannel);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f70154m = c4.a.m(notificationChannel);
            this.f70155n = c4.a.f(notificationChannel);
        }
        this.f70156o = androidx.appcompat.app.j0.b(notificationChannel);
        this.f70157p = androidx.appcompat.app.j0.S(notificationChannel);
        if (i10 >= 29) {
            this.f70158q = com.google.firebase.messaging.b0.c(notificationChannel);
        }
        if (i10 >= 30) {
            this.f70159r = c4.a.q(notificationChannel);
        }
    }
}
