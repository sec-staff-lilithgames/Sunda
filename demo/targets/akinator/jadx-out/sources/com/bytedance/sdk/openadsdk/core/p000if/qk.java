package com.bytedance.sdk.openadsdk.core.p000if;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* renamed from: cm, reason: collision with root package name */
    protected VastProperties f20418cm;

    /* renamed from: jj, reason: collision with root package name */
    private final AdEvents f20420jj;
    private final AdSession my;
    protected String wqx;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f20421qk = false;
    protected boolean jpo = false;

    /* renamed from: jd, reason: collision with root package name */
    protected int f20419jd = 0;

    public qk(AdSession adSession, AdEvents adEvents, View view) {
        this.my = adSession;
        this.f20420jj = adEvents;
        this.wqx = adSession.getAdSessionId();
        jpo(view);
    }

    public void cm() {
        jpo(3);
    }

    public void jd(int i10) {
    }

    public void jpo(float f10, boolean z10) {
    }

    public void wqx() {
        jpo(4);
    }

    public void jd() {
        jpo(1);
    }

    public void jpo(boolean z10) {
    }

    public void jpo(boolean z10, float f10) {
    }

    public void jpo(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.my) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void jpo(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.my;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean jpo() {
        return this.jpo;
    }

    public void jpo(int i10) {
        int i11;
        if (this.my == null || this.f20420jj == null || !my.wqx()) {
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 || (i11 = this.f20419jd) == 0 || i11 == 4) {
                        return;
                    }
                    this.my.finish();
                    this.jpo = false;
                } else {
                    if (this.f20421qk) {
                        return;
                    }
                    int i12 = this.f20419jd;
                    if (i12 != 1 && i12 != 2) {
                        return;
                    }
                    this.f20420jj.impressionOccurred();
                    this.f20421qk = true;
                }
            } else {
                if (this.f20419jd != 0) {
                    return;
                }
                this.my.start();
                if (this.f20418cm == null) {
                    this.f20418cm = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.f20420jj.loaded(this.f20418cm);
                this.jpo = true;
                this.f20418cm = null;
            }
        } else {
            if (this.f20419jd != 0) {
                return;
            }
            this.my.start();
            this.f20420jj.loaded();
            this.jpo = true;
        }
        this.f20419jd = i10;
    }

    public void jpo(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            jpo((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
