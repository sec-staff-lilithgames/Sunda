package com.inmobi.ads;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.AbstractC2902n7;
import com.inmobi.media.J1;
import com.inmobi.media.Q1;
import com.inmobi.media.T1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e implements PreloadManager {

    /* renamed from: a, reason: collision with root package name */
    public final Q1 f31587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f31588b;

    public e(InMobiBanner inMobiBanner) {
        this.f31588b = inMobiBanner;
        this.f31587a = new Q1(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            T1 mAdManager$media_release = this.f31588b.getMAdManager$media_release();
            if (mAdManager$media_release != null) {
                mAdManager$media_release.G();
            }
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            e0.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            AbstractC2902n7.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            J1 mPubListener$media_release = this.f31588b.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.a(this.f31588b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f31588b.setEnableAutoRefresh(false);
        this.f31588b.a(this.f31587a, "Preload", false);
    }
}
