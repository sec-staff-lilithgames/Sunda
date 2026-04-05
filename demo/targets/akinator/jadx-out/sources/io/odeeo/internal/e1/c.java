package io.odeeo.internal.e1;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e3.g;
import io.odeeo.sdk.AdUnit;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f63828c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public long f63829a;

    @lk.c("action_button_delay")
    private int actionButtonDelaySec;

    @lk.c("action_button_position")
    private String actionButtonPosition;

    @lk.c("action_button_type")
    private String actionButtonType;

    @lk.c("audibility_enforcement_volume")
    private int audibilityEnforcementVolume;

    @lk.c("audio_only_background_color")
    private String audioOnlyBackgroundColor;

    @lk.c("audio_only_wave_color")
    private String audioOnlyWaveColor;

    /* renamed from: b, reason: collision with root package name */
    public String f63830b;

    @lk.c("enforce_audibility")
    private boolean enforceAudibility;

    @lk.c("ad_frequency")
    private int placementAdFrequency;

    @lk.c("progress_bar_color")
    private String progressBarColor;

    @lk.c(CampaignEx.JSON_KEY_REWARD_AMOUNT)
    private double rewardAmount;

    @lk.c("reward_item")
    private String rewardItem;

    @lk.c("reward_type")
    private String rewardType;

    @lk.c("rewarded_pop_up_type")
    private AdUnit.PopUpType rewardedPopUpType;

    @lk.c("skip_coverage_logic")
    private boolean skipCoverageLogic;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public c() {
        this(null, null, null, null, 0, null, null, null, 0.0d, null, 0, false, 0, false, 0L, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public static /* synthetic */ c copy$default(c cVar, String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, double d10, AdUnit.PopUpType popUpType, int i11, boolean z10, int i12, boolean z11, long j10, String str8, int i13, Object obj) {
        String str9;
        long j11;
        String str10 = (i13 & 1) != 0 ? cVar.audioOnlyBackgroundColor : str;
        String str11 = (i13 & 2) != 0 ? cVar.audioOnlyWaveColor : str2;
        String str12 = (i13 & 4) != 0 ? cVar.progressBarColor : str3;
        String str13 = (i13 & 8) != 0 ? cVar.actionButtonType : str4;
        int i14 = (i13 & 16) != 0 ? cVar.actionButtonDelaySec : i10;
        String str14 = (i13 & 32) != 0 ? cVar.actionButtonPosition : str5;
        String str15 = (i13 & 64) != 0 ? cVar.rewardType : str6;
        String str16 = (i13 & 128) != 0 ? cVar.rewardItem : str7;
        double d11 = (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cVar.rewardAmount : d10;
        AdUnit.PopUpType popUpType2 = (i13 & 512) != 0 ? cVar.rewardedPopUpType : popUpType;
        int i15 = (i13 & 1024) != 0 ? cVar.placementAdFrequency : i11;
        boolean z12 = (i13 & 2048) != 0 ? cVar.enforceAudibility : z10;
        int i16 = (i13 & 4096) != 0 ? cVar.audibilityEnforcementVolume : i12;
        String str17 = str10;
        boolean z13 = (i13 & Segment.SIZE) != 0 ? cVar.skipCoverageLogic : z11;
        long j12 = (i13 & 16384) != 0 ? cVar.f63829a : j10;
        if ((i13 & 32768) != 0) {
            j11 = j12;
            str9 = cVar.f63830b;
        } else {
            str9 = str8;
            j11 = j12;
        }
        return cVar.copy(str17, str11, str12, str13, i14, str14, str15, str16, d11, popUpType2, i15, z12, i16, z13, j11, str9);
    }

    public final String component1() {
        return this.audioOnlyBackgroundColor;
    }

    public final AdUnit.PopUpType component10() {
        return this.rewardedPopUpType;
    }

    public final int component11() {
        return this.placementAdFrequency;
    }

    public final boolean component12() {
        return this.enforceAudibility;
    }

    public final int component13() {
        return this.audibilityEnforcementVolume;
    }

    public final boolean component14() {
        return this.skipCoverageLogic;
    }

    public final long component15() {
        return this.f63829a;
    }

    public final String component16() {
        return this.f63830b;
    }

    public final String component2() {
        return this.audioOnlyWaveColor;
    }

    public final String component3() {
        return this.progressBarColor;
    }

    public final String component4() {
        return this.actionButtonType;
    }

    public final int component5() {
        return this.actionButtonDelaySec;
    }

    public final String component6() {
        return this.actionButtonPosition;
    }

    public final String component7() {
        return this.rewardType;
    }

    public final String component8() {
        return this.rewardItem;
    }

    public final double component9() {
        return this.rewardAmount;
    }

    public final c copy(String audioOnlyBackgroundColor, String audioOnlyWaveColor, String progressBarColor, String actionButtonType, int i10, String actionButtonPosition, String rewardType, String rewardItem, double d10, AdUnit.PopUpType popUpType, int i11, boolean z10, int i12, boolean z11, long j10, String transactionId) {
        e0.checkNotNullParameter(audioOnlyBackgroundColor, "audioOnlyBackgroundColor");
        e0.checkNotNullParameter(audioOnlyWaveColor, "audioOnlyWaveColor");
        e0.checkNotNullParameter(progressBarColor, "progressBarColor");
        e0.checkNotNullParameter(actionButtonType, "actionButtonType");
        e0.checkNotNullParameter(actionButtonPosition, "actionButtonPosition");
        e0.checkNotNullParameter(rewardType, "rewardType");
        e0.checkNotNullParameter(rewardItem, "rewardItem");
        e0.checkNotNullParameter(transactionId, "transactionId");
        return new c(audioOnlyBackgroundColor, audioOnlyWaveColor, progressBarColor, actionButtonType, i10, actionButtonPosition, rewardType, rewardItem, d10, popUpType, i11, z10, i12, z11, j10, transactionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e0.areEqual(this.audioOnlyBackgroundColor, cVar.audioOnlyBackgroundColor) && e0.areEqual(this.audioOnlyWaveColor, cVar.audioOnlyWaveColor) && e0.areEqual(this.progressBarColor, cVar.progressBarColor) && e0.areEqual(this.actionButtonType, cVar.actionButtonType) && this.actionButtonDelaySec == cVar.actionButtonDelaySec && e0.areEqual(this.actionButtonPosition, cVar.actionButtonPosition) && e0.areEqual(this.rewardType, cVar.rewardType) && e0.areEqual(this.rewardItem, cVar.rewardItem) && e0.areEqual((Object) Double.valueOf(this.rewardAmount), (Object) Double.valueOf(cVar.rewardAmount)) && this.rewardedPopUpType == cVar.rewardedPopUpType && this.placementAdFrequency == cVar.placementAdFrequency && this.enforceAudibility == cVar.enforceAudibility && this.audibilityEnforcementVolume == cVar.audibilityEnforcementVolume && this.skipCoverageLogic == cVar.skipCoverageLogic && this.f63829a == cVar.f63829a && e0.areEqual(this.f63830b, cVar.f63830b);
    }

    public final int getActionButtonDelaySec() {
        return this.actionButtonDelaySec;
    }

    public final String getActionButtonPosition() {
        return this.actionButtonPosition;
    }

    public final AdUnit.ActionButtonPosition getActionButtonPosition$odeeoSdk_release() {
        String lowerCase = this.actionButtonPosition.toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (e0.areEqual(lowerCase, "top_left")) {
            return AdUnit.ActionButtonPosition.TopLeft;
        }
        if (e0.areEqual(lowerCase, "top_right")) {
            return AdUnit.ActionButtonPosition.TopRight;
        }
        return null;
    }

    public final String getActionButtonType() {
        return this.actionButtonType;
    }

    public final AdUnit.ActionButtonType getActionButtonType$odeeoSdk_release() {
        String lowerCase = this.actionButtonType.toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return e0.areEqual(lowerCase, "close") ? AdUnit.ActionButtonType.Close : e0.areEqual(lowerCase, CampaignEx.JSON_NATIVE_VIDEO_MUTE) ? AdUnit.ActionButtonType.Mute : AdUnit.ActionButtonType.None;
    }

    public final long getActionDelayMs() {
        return this.actionButtonDelaySec * 1000;
    }

    public final int getAudibilityEnforcementVolume() {
        return this.audibilityEnforcementVolume;
    }

    public final String getAudioOnlyBackgroundColor() {
        return this.audioOnlyBackgroundColor;
    }

    public final String getAudioOnlyWaveColor() {
        return this.audioOnlyWaveColor;
    }

    public final boolean getEnforceAudibility() {
        return this.enforceAudibility;
    }

    public final int getPlacementAdFrequency() {
        return this.placementAdFrequency;
    }

    public final long getPlacementAdFrequencyMillis() {
        return this.f63829a;
    }

    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    public final double getRewardAmount() {
        return this.rewardAmount;
    }

    public final String getRewardItem() {
        return this.rewardItem;
    }

    public final float getRewardItem$odeeoSdk_release() {
        if (this.rewardItem.length() <= 0 || !TextUtils.isDigitsOnly(this.rewardItem)) {
            return 0.0f;
        }
        return Float.parseFloat(this.rewardItem);
    }

    public final String getRewardType() {
        return this.rewardType;
    }

    public final AdUnit.RewardType getRewardType$odeeoSdk_release() {
        String lowerCase = this.rewardType.toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return e0.areEqual(lowerCase, "endlevel") ? AdUnit.RewardType.EndLevel : e0.areEqual(lowerCase, "inlevel") ? AdUnit.RewardType.InLevel : AdUnit.RewardType.InLevel;
    }

    public final AdUnit.PopUpType getRewardedPopUpType() {
        return this.rewardedPopUpType;
    }

    public final boolean getSkipCoverageLogic() {
        return this.skipCoverageLogic;
    }

    public final String getTransactionId() {
        return this.f63830b;
    }

    public final boolean hasAudioOnlyWaveColor$odeeoSdk_release() {
        return this.audioOnlyWaveColor.length() > 0;
    }

    public final boolean hasDefaultBackgroundColor$odeeoSdk_release() {
        return this.audioOnlyBackgroundColor.length() > 0;
    }

    public final boolean hasProgressBarColor$odeeoSdk_release() {
        return this.progressBarColor.length() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (Double.hashCode(this.rewardAmount) + o2.e(o2.e(o2.e(g.d(this.actionButtonDelaySec, o2.e(o2.e(o2.e(this.audioOnlyBackgroundColor.hashCode() * 31, 31, this.audioOnlyWaveColor), 31, this.progressBarColor), 31, this.actionButtonType), 31), 31, this.actionButtonPosition), 31, this.rewardType), 31, this.rewardItem)) * 31;
        AdUnit.PopUpType popUpType = this.rewardedPopUpType;
        int iD = g.d(this.placementAdFrequency, (iHashCode + (popUpType == null ? 0 : popUpType.hashCode())) * 31, 31);
        boolean z10 = this.enforceAudibility;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iD2 = g.d(this.audibilityEnforcementVolume, (iD + i10) * 31, 31);
        boolean z11 = this.skipCoverageLogic;
        return this.f63830b.hashCode() + o2.d((iD2 + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31, this.f63829a);
    }

    public final void setActionButtonDelaySec(int i10) {
        this.actionButtonDelaySec = i10;
    }

    public final void setActionButtonPosition(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.actionButtonPosition = str;
    }

    public final void setActionButtonType(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.actionButtonType = str;
    }

    public final void setAudibilityEnforcementVolume(int i10) {
        this.audibilityEnforcementVolume = i10;
    }

    public final void setAudioOnlyBackgroundColor(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.audioOnlyBackgroundColor = str;
    }

    public final void setAudioOnlyWaveColor(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.audioOnlyWaveColor = str;
    }

    public final void setEnforceAudibility(boolean z10) {
        this.enforceAudibility = z10;
    }

    public final void setPlacementAdFrequency(int i10) {
        this.placementAdFrequency = i10;
    }

    public final void setPlacementAdFrequencyMillis(long j10) {
        this.f63829a = j10;
    }

    public final void setProgressBarColor(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.progressBarColor = str;
    }

    public final void setRewardAmount(double d10) {
        this.rewardAmount = d10;
    }

    public final void setRewardItem(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.rewardItem = str;
    }

    public final void setRewardType(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.rewardType = str;
    }

    public final void setRewardedPopUpType(AdUnit.PopUpType popUpType) {
        this.rewardedPopUpType = popUpType;
    }

    public final void setSkipCoverageLogic(boolean z10) {
        this.skipCoverageLogic = z10;
    }

    public final void setTransactionId(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.f63830b = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlacementConfig(audioOnlyBackgroundColor=");
        sb2.append(this.audioOnlyBackgroundColor);
        sb2.append(", audioOnlyWaveColor=");
        sb2.append(this.audioOnlyWaveColor);
        sb2.append(", progressBarColor=");
        sb2.append(this.progressBarColor);
        sb2.append(", actionButtonType=");
        sb2.append(this.actionButtonType);
        sb2.append(", actionButtonDelaySec=");
        sb2.append(this.actionButtonDelaySec);
        sb2.append(", actionButtonPosition=");
        sb2.append(this.actionButtonPosition);
        sb2.append(", rewardType=");
        sb2.append(this.rewardType);
        sb2.append(", rewardItem=");
        sb2.append(this.rewardItem);
        sb2.append(", rewardAmount=");
        sb2.append(this.rewardAmount);
        sb2.append(", rewardedPopUpType=");
        sb2.append(this.rewardedPopUpType);
        sb2.append(", placementAdFrequency=");
        sb2.append(this.placementAdFrequency);
        sb2.append(", enforceAudibility=");
        sb2.append(this.enforceAudibility);
        sb2.append(", audibilityEnforcementVolume=");
        sb2.append(this.audibilityEnforcementVolume);
        sb2.append(", skipCoverageLogic=");
        sb2.append(this.skipCoverageLogic);
        sb2.append(", placementAdFrequencyMillis=");
        sb2.append(this.f63829a);
        sb2.append(", transactionId=");
        return o2.q(sb2, this.f63830b, ')');
    }

    public c(String audioOnlyBackgroundColor, String audioOnlyWaveColor, String progressBarColor, String actionButtonType, int i10, String actionButtonPosition, String rewardType, String rewardItem, double d10, AdUnit.PopUpType popUpType, int i11, boolean z10, int i12, boolean z11, long j10, String transactionId) {
        e0.checkNotNullParameter(audioOnlyBackgroundColor, "audioOnlyBackgroundColor");
        e0.checkNotNullParameter(audioOnlyWaveColor, "audioOnlyWaveColor");
        e0.checkNotNullParameter(progressBarColor, "progressBarColor");
        e0.checkNotNullParameter(actionButtonType, "actionButtonType");
        e0.checkNotNullParameter(actionButtonPosition, "actionButtonPosition");
        e0.checkNotNullParameter(rewardType, "rewardType");
        e0.checkNotNullParameter(rewardItem, "rewardItem");
        e0.checkNotNullParameter(transactionId, "transactionId");
        this.audioOnlyBackgroundColor = audioOnlyBackgroundColor;
        this.audioOnlyWaveColor = audioOnlyWaveColor;
        this.progressBarColor = progressBarColor;
        this.actionButtonType = actionButtonType;
        this.actionButtonDelaySec = i10;
        this.actionButtonPosition = actionButtonPosition;
        this.rewardType = rewardType;
        this.rewardItem = rewardItem;
        this.rewardAmount = d10;
        this.rewardedPopUpType = popUpType;
        this.placementAdFrequency = i11;
        this.enforceAudibility = z10;
        this.audibilityEnforcementVolume = i12;
        this.skipCoverageLogic = z11;
        this.f63829a = j10;
        this.f63830b = transactionId;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, double d10, AdUnit.PopUpType popUpType, int i11, boolean z10, int i12, boolean z11, long j10, String str8, int i13, u uVar) {
        this((i13 & 1) != 0 ? "#9E10FD" : str, (i13 & 2) != 0 ? "#FFFFFF" : str2, (i13 & 4) == 0 ? str3 : "#FFFFFF", (i13 & 8) != 0 ? "Mute" : str4, (i13 & 16) != 0 ? 10 : i10, (i13 & 32) != 0 ? "Top_Right" : str5, (i13 & 64) != 0 ? "inlevel" : str6, (i13 & 128) != 0 ? "None" : str7, (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0.0d : d10, (i13 & 512) != 0 ? null : popUpType, (i13 & 1024) != 0 ? 0 : i11, (i13 & 2048) != 0 ? false : z10, (i13 & 4096) != 0 ? 10 : i12, (i13 & Segment.SIZE) != 0 ? false : z11, (i13 & 16384) != 0 ? 0L : j10, (i13 & 32768) != 0 ? "" : str8);
    }
}
