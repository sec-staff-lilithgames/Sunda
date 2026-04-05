package com.google.firebase.messaging;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29773a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29774b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f29775c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29776d;

    /* renamed from: e, reason: collision with root package name */
    public final String f29777e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f29778f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29779g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29780h;

    /* renamed from: i, reason: collision with root package name */
    public final String f29781i;

    /* renamed from: j, reason: collision with root package name */
    public final String f29782j;

    /* renamed from: k, reason: collision with root package name */
    public final String f29783k;

    /* renamed from: l, reason: collision with root package name */
    public final String f29784l;

    /* renamed from: m, reason: collision with root package name */
    public final String f29785m;

    /* renamed from: n, reason: collision with root package name */
    public final Uri f29786n;

    /* renamed from: o, reason: collision with root package name */
    public final String f29787o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f29788p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f29789q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f29790r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f29791s;

    /* renamed from: t, reason: collision with root package name */
    public final Long f29792t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f29793u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f29794v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f29795w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f29796x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f29797y;

    /* renamed from: z, reason: collision with root package name */
    public final long[] f29798z;

    public d0(z zVar) {
        String[] strArr;
        this.f29773a = zVar.getString("gcm.n.title");
        this.f29774b = zVar.getLocalizationResourceForKey("gcm.n.title");
        Object[] localizationArgsForKey = zVar.getLocalizationArgsForKey("gcm.n.title");
        String[] strArr2 = null;
        if (localizationArgsForKey == null) {
            strArr = null;
        } else {
            strArr = new String[localizationArgsForKey.length];
            for (int i10 = 0; i10 < localizationArgsForKey.length; i10++) {
                strArr[i10] = String.valueOf(localizationArgsForKey[i10]);
            }
        }
        this.f29775c = strArr;
        this.f29776d = zVar.getString("gcm.n.body");
        this.f29777e = zVar.getLocalizationResourceForKey("gcm.n.body");
        Object[] localizationArgsForKey2 = zVar.getLocalizationArgsForKey("gcm.n.body");
        if (localizationArgsForKey2 != null) {
            strArr2 = new String[localizationArgsForKey2.length];
            for (int i11 = 0; i11 < localizationArgsForKey2.length; i11++) {
                strArr2[i11] = String.valueOf(localizationArgsForKey2[i11]);
            }
        }
        this.f29778f = strArr2;
        this.f29779g = zVar.getString("gcm.n.icon");
        this.f29781i = zVar.getSoundResourceName();
        this.f29782j = zVar.getString("gcm.n.tag");
        this.f29783k = zVar.getString("gcm.n.color");
        this.f29784l = zVar.getString("gcm.n.click_action");
        this.f29785m = zVar.getString("gcm.n.android_channel_id");
        this.f29786n = zVar.getLink();
        this.f29780h = zVar.getString("gcm.n.image");
        this.f29787o = zVar.getString("gcm.n.ticker");
        this.f29788p = zVar.getInteger("gcm.n.notification_priority");
        this.f29789q = zVar.getInteger("gcm.n.visibility");
        this.f29790r = zVar.getInteger("gcm.n.notification_count");
        this.f29793u = zVar.getBoolean("gcm.n.sticky");
        this.f29794v = zVar.getBoolean("gcm.n.local_only");
        this.f29795w = zVar.getBoolean("gcm.n.default_sound");
        this.f29796x = zVar.getBoolean("gcm.n.default_vibrate_timings");
        this.f29797y = zVar.getBoolean("gcm.n.default_light_settings");
        this.f29792t = zVar.getLong("gcm.n.event_time");
        this.f29791s = zVar.a();
        this.f29798z = zVar.getVibrateTimings();
    }

    public String getBody() {
        return this.f29776d;
    }

    public String[] getBodyLocalizationArgs() {
        return this.f29778f;
    }

    public String getBodyLocalizationKey() {
        return this.f29777e;
    }

    public String getChannelId() {
        return this.f29785m;
    }

    public String getClickAction() {
        return this.f29784l;
    }

    public String getColor() {
        return this.f29783k;
    }

    public boolean getDefaultLightSettings() {
        return this.f29797y;
    }

    public boolean getDefaultSound() {
        return this.f29795w;
    }

    public boolean getDefaultVibrateSettings() {
        return this.f29796x;
    }

    public Long getEventTime() {
        return this.f29792t;
    }

    public String getIcon() {
        return this.f29779g;
    }

    public Uri getImageUrl() {
        String str = this.f29780h;
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }

    public int[] getLightSettings() {
        return this.f29791s;
    }

    public Uri getLink() {
        return this.f29786n;
    }

    public boolean getLocalOnly() {
        return this.f29794v;
    }

    public Integer getNotificationCount() {
        return this.f29790r;
    }

    public Integer getNotificationPriority() {
        return this.f29788p;
    }

    public String getSound() {
        return this.f29781i;
    }

    public boolean getSticky() {
        return this.f29793u;
    }

    public String getTag() {
        return this.f29782j;
    }

    public String getTicker() {
        return this.f29787o;
    }

    public String getTitle() {
        return this.f29773a;
    }

    public String[] getTitleLocalizationArgs() {
        return this.f29775c;
    }

    public String getTitleLocalizationKey() {
        return this.f29774b;
    }

    public long[] getVibrateTimings() {
        return this.f29798z;
    }

    public Integer getVisibility() {
        return this.f29789q;
    }
}
