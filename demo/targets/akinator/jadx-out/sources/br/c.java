package br;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum c implements ir.i {
    Mraid(CampaignEx.JSON_KEY_MRAID),
    Video("video"),
    Image("image"),
    Label("label"),
    Countdown("countdown"),
    Progress(NotificationCompat.CATEGORY_PROGRESS);


    /* renamed from: c, reason: collision with root package name */
    public static final b f9767c = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9775b;

    c(String str) {
        this.f9775b = str;
    }

    public static final c get(String str) {
        return f9767c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9775b;
    }
}
