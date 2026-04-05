package com.bytedance.sdk.openadsdk.core.p000if;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends qk {

    /* renamed from: jj, reason: collision with root package name */
    private boolean f20450jj;
    private final MediaEvents my;

    public zz(AdSession adSession, AdEvents adEvents, View view, MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.my = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p000if.qk
    public void jd(int i10) throws JSONException {
        if (jpo()) {
            switch (i10) {
                case 0:
                    this.my.pause();
                    break;
                case 1:
                    this.my.resume();
                    break;
                case 2:
                case 14:
                    this.my.skipped();
                    break;
                case 4:
                    this.my.bufferStart();
                    break;
                case 5:
                    this.my.bufferFinish();
                    break;
                case 6:
                    this.my.firstQuartile();
                    break;
                case 7:
                    this.my.midpoint();
                    break;
                case 8:
                    this.my.thirdQuartile();
                    break;
                case 9:
                    this.my.complete();
                    break;
                case 10:
                    this.my.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.my.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.my.volumeChange(this.f20450jj ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.my.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p000if.qk
    public void jpo(boolean z10, float f10) {
        if (z10) {
            this.f20418cm = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.f20418cm = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        jpo(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p000if.qk
    public void jpo(float f10, boolean z10) throws JSONException {
        if (jpo()) {
            this.my.start(f10, z10 ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p000if.qk
    public void jpo(boolean z10) throws JSONException {
        this.f20450jj = z10;
        jd(12);
    }
}
