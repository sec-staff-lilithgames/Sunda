package br;

import androidx.core.app.NotificationCompat;
import com.ironsource.C3352n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum l0 implements ir.i {
    Track("track"),
    Open("open"),
    NotifyOpen("notify_open"),
    Skip("skip"),
    Close("close"),
    Mute(CampaignEx.JSON_NATIVE_VIDEO_MUTE),
    UnMute(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE),
    Repeat("repeat"),
    Show(C3352n2.f37928v),
    Hide("hide"),
    Progress(NotificationCompat.CATEGORY_PROGRESS),
    Schedule("schedule"),
    Start("start"),
    LockVisibility("lock_visibility"),
    UnlockVisibility("unlock_visibility"),
    SimulateClick("simulate_click"),
    OpenPrivacySheet("open_privacy_sheet"),
    ToggleStateGroups("toggle_state_groups");


    /* renamed from: c, reason: collision with root package name */
    public static final k0 f9897c = new k0(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9917b;

    l0(String str) {
        this.f9917b = str;
    }

    public static final l0 get(String str) {
        return f9897c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9917b;
    }
}
