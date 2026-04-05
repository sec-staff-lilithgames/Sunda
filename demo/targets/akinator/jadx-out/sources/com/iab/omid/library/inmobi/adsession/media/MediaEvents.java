package com.iab.omid.library.inmobi.adsession.media;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.a;
import com.iab.omid.library.inmobi.internal.i;
import com.iab.omid.library.inmobi.utils.c;
import com.iab.omid.library.inmobi.utils.g;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class MediaEvents {
    private final a adSession;

    private MediaEvents(a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        a aVar = (a) adSession;
        g.a(adSession, "AdSession is null");
        g.f(aVar);
        g.c(aVar);
        g.b(aVar);
        g.h(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.d().a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) throws JSONException {
        g.a(interactionType, "InteractionType is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "interactionType", interactionType);
        this.adSession.d().a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        g.a(this.adSession);
        this.adSession.d().a("bufferFinish");
    }

    public void bufferStart() {
        g.a(this.adSession);
        this.adSession.d().a("bufferStart");
    }

    public void complete() {
        g.a(this.adSession);
        this.adSession.d().a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        g.a(this.adSession);
        this.adSession.d().a("firstQuartile");
    }

    public void pause() {
        g.a(this.adSession);
        this.adSession.d().a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) throws JSONException {
        g.a(playerState, "PlayerState is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "state", playerState);
        this.adSession.d().a("playerStateChange", jSONObject);
    }

    public void resume() {
        g.a(this.adSession);
        this.adSession.d().a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        g.a(this.adSession);
        this.adSession.d().a("skipped");
    }

    public void start(float f10, float f11) throws JSONException {
        confirmValidDuration(f10);
        confirmValidVolume(f11);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f10));
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        c.a(jSONObject, C3191e4.i.P, Float.valueOf(i.c().b()));
        this.adSession.d().a("start", jSONObject);
    }

    public void thirdQuartile() {
        g.a(this.adSession);
        this.adSession.d().a("thirdQuartile");
    }

    public void volumeChange(float f10) throws JSONException {
        confirmValidVolume(f10);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        c.a(jSONObject, C3191e4.i.P, Float.valueOf(i.c().b()));
        this.adSession.d().a("volumeChange", jSONObject);
    }

    public void midpoint() {
        g.a(this.adSession);
        this.adSession.d().a(OcvDtWCQ.hAlNCB);
    }
}
