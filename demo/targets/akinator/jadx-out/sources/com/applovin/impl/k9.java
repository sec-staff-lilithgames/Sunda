package com.applovin.impl;

import android.content.Context;
import android.view.View;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.inmobi.media.AbstractC3024ub;
import com.inmobi.media.C2769f9;
import com.inmobi.media.C3102z4;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import io.odeeo.internal.d.g;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class k9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14260c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14261e;

    public /* synthetic */ k9(Object obj, boolean z10, int i10) {
        this.f14259b = i10;
        this.f14261e = obj;
        this.f14260c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i10 = this.f14259b;
        boolean z10 = this.f14260c;
        Object obj = this.f14261e;
        switch (i10) {
            case 0:
                ((i4) obj).a(z10);
                break;
            case 1:
                ((com.google.android.exoplayer2.p0) ((com.google.android.exoplayer2.audio.b0) com.google.android.exoplayer2.util.n1.castNonNull(((com.google.android.exoplayer2.audio.a0) obj).f27047b))).onSkipSilenceEnabledChanged(z10);
                break;
            case 2:
                AppConsentActivity.displaySpinner$lambda$1(z10, (AppConsentActivity) obj);
                break;
            case 3:
                VungleWebClient.m3654notifyPropertiesChange$lambda25(z10, (VungleWebClient) obj);
                break;
            case 4:
                ((io.bidmachine.media3.exoplayer.k2) obj).f61323a.updateWakeLock(true, z10);
                break;
            case 5:
                ((io.bidmachine.media3.exoplayer.l2) obj).f61394a.updateWifiLock(true, z10);
                break;
            case 6:
                ((io.bidmachine.media3.exoplayer.j0) ((io.bidmachine.media3.exoplayer.audio.o) io.bidmachine.media3.common.util.a1.castNonNull(((io.bidmachine.media3.exoplayer.audio.n) obj).f60991b))).onSkipSilenceEnabledChanged(z10);
                break;
            case 7:
                ir.d dVar = (ir.d) obj;
                if (dVar != null) {
                    dVar.execute(Boolean.valueOf(z10));
                    break;
                }
                break;
            case 8:
                ((g.a) obj).a(z10);
                break;
            case 9:
                HomeActivity homeActivity = (HomeActivity) obj;
                int i11 = HomeActivity.U;
                if (!z10) {
                    homeActivity.r();
                    break;
                } else {
                    z9.e.getInstance().requestInappDetailsUpdate(new o9.s1(homeActivity));
                    break;
                }
            case 10:
                qg.t0.showKeyboard((View) obj, z10);
                break;
            case 11:
                InputStream inputStream = (InputStream) obj;
                if (z10) {
                    e8.n.closeQuietly(inputStream);
                    break;
                }
                break;
            case 12:
                C2769f9.a((C2769f9) obj, z10);
                break;
            case 13:
                AbstractC3024ub.a((Context) obj, z10);
                break;
            default:
                C3102z4.a((C3102z4) obj, null, z10);
                break;
        }
    }

    public /* synthetic */ k9(boolean z10, Object obj, int i10) {
        this.f14259b = i10;
        this.f14260c = z10;
        this.f14261e = obj;
    }
}
