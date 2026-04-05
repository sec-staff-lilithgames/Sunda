package com.inmobi.ads;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.AbstractC2902n7;
import com.inmobi.media.C2788gb;
import com.inmobi.media.C3002t6;
import com.inmobi.media.C3019u6;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f implements PreloadManager {

    /* renamed from: a, reason: collision with root package name */
    public final C3002t6 f31589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiInterstitial f31590b;

    public f(InMobiInterstitial inMobiInterstitial) {
        this.f31590b = inMobiInterstitial;
        this.f31589a = new C3002t6(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            this.f31590b.getMAdManager$media_release().D();
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            e0.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            AbstractC2902n7.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            this.f31590b.getMPubListener$media_release().a(this.f31590b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f31590b.f31562b = true;
        this.f31590b.f31564d.f32886e = "Preload";
        C3019u6 mAdManager$media_release = this.f31590b.getMAdManager$media_release();
        C2788gb c2788gb = this.f31590b.f31564d;
        Context context = this.f31590b.f31561a;
        if (context == null) {
            e0.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        C3019u6.a(mAdManager$media_release, c2788gb, context, false, null, 12, null);
        this.f31590b.getMAdManager$media_release().c(this.f31589a);
    }
}
