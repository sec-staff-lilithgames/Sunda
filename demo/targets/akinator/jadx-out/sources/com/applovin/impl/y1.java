package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.a1;
import com.applovin.impl.l7;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class y1 extends z1 {

    /* renamed from: p0, reason: collision with root package name */
    private final l7 f16259p0;

    /* renamed from: q0, reason: collision with root package name */
    private final Set f16260q0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements a1.b {
        public a() {
        }

        @Override // com.applovin.impl.a1.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(y1.this.f16324g0 - (y1.this.P.getDuration() - y1.this.P.getCurrentPosition()));
            int iB = y1.this.B();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(y1.this.f16260q0).iterator();
            while (it.hasNext()) {
                v7 v7Var = (v7) it.next();
                if (v7Var.a(seconds, iB)) {
                    hashSet.add(v7Var);
                    y1.this.f16260q0.remove(v7Var);
                }
            }
            y1.this.a(hashSet);
            if (iB >= 25 && iB < 50) {
                y1.this.f16259p0.getAdEventTracker().x();
                return;
            }
            if (iB >= 50 && iB < 75) {
                y1.this.f16259p0.getAdEventTracker().y();
            } else if (iB >= 75) {
                y1.this.f16259p0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.a1.b
        public boolean b() {
            return !y1.this.f16327j0;
        }
    }

    public y1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f16260q0 = hashSet;
        l7 l7Var = (l7) bVar;
        this.f16259p0 = l7Var;
        if (l7Var.D1()) {
            ImageView imageViewA = r7.a(l7Var.x1().e(), activity, kVar);
            this.X = imageViewA;
            imageViewA.setOnClickListener(new oa(this, activity, kVar, 0));
        }
        l7.d dVar = l7.d.VIDEO;
        hashSet.addAll(l7Var.a(dVar, w7.f16154a));
        a(l7.d.IMPRESSION);
        a(dVar, "creativeView");
        l7Var.getAdEventTracker().g();
    }

    private void V() {
        if (!F() || this.f16260q0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.k("AppLovinFullscreenActivity", "Firing " + this.f16260q0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.f16260q0);
    }

    @Override // com.applovin.impl.z1
    public void C() {
        a(l7.d.VIDEO, "skip");
        this.f16259p0.getAdEventTracker().B();
        super.C();
    }

    @Override // com.applovin.impl.z1
    public void D() {
        super.D();
        l7 l7Var = this.f16259p0;
        if (l7Var != null) {
            l7Var.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.z1
    public void N() {
        long jZ;
        int iS;
        long millis = 0;
        if (this.f16259p0.Y() >= 0 || this.f16259p0.Z() >= 0) {
            if (this.f16259p0.Y() >= 0) {
                jZ = this.f16259p0.Y();
            } else {
                l7 l7Var = this.f16259p0;
                y7 y7VarB1 = l7Var.B1();
                if (y7VarB1 == null || y7VarB1.d() <= 0) {
                    long j10 = this.f16324g0;
                    if (j10 > 0) {
                        millis = j10;
                    }
                } else {
                    millis = TimeUnit.SECONDS.toMillis(y7VarB1.d());
                }
                if (l7Var.j1() && (iS = (int) l7Var.s()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iS);
                }
                jZ = (long) ((this.f16259p0.Z() / 100.0d) * millis);
            }
            c(jZ);
        }
    }

    @Override // com.applovin.impl.z1
    public void Q() {
        super.Q();
        l7 l7Var = this.f16259p0;
        if (l7Var != null) {
            l7Var.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.z1
    public void R() {
        V();
        if (!x7.a(this.f16259p0)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            a("no_valid_companion_ad");
        } else {
            if (this.f16327j0) {
                return;
            }
            a(l7.d.COMPANION, "creativeView");
            this.f16259p0.getAdEventTracker().w();
            super.R();
        }
    }

    @Override // com.applovin.impl.z1
    public void T() {
        super.T();
        a(l7.d.VIDEO, this.f16323f0 ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        this.f16259p0.getAdEventTracker().b(this.f16323f0);
    }

    @Override // com.applovin.impl.z1
    public void d(long j10) {
        super.d(j10);
        this.f16259p0.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(j10), k7.e(this.f15832b));
    }

    @Override // com.applovin.impl.z1
    public void g(String str) {
        a(l7.d.ERROR, q7.MEDIA_FILE_ERROR);
        this.f16259p0.getAdEventTracker().b(str);
        super.g(str);
    }

    @Override // com.applovin.impl.v1
    public void r() {
        super.r();
        a(this.f16327j0 ? l7.d.COMPANION : l7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f16259p0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.v1
    public void s() {
        super.s();
        a(this.f16327j0 ? l7.d.COMPANION : l7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f16259p0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.v1
    public void u() {
        this.f16320c0.c();
        super.u();
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.v1
    public void v() {
        a((ViewGroup) null);
    }

    private boolean U() {
        return this.X != null && this.f16259p0.D1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, com.applovin.impl.sdk.k kVar, View view) {
        Uri uriC = this.f16259p0.x1().c();
        if (uriC != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriC);
            }
            a(l7.d.INDUSTRY_ICON_CLICK);
            h7.a(uriC, activity, kVar);
        }
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.v1
    public void a(String str) {
        if (this.f16259p0 != null) {
            a(l7.d.VIDEO, "close");
            a(l7.d.COMPANION, "close");
        }
        super.a(str);
    }

    @Override // com.applovin.impl.z1, com.applovin.impl.v1
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (U()) {
            a(l7.d.INDUSTRY_ICON_IMPRESSION);
            this.X.setVisibility(0);
        }
        this.f16320c0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            arrayList.add(new e4(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.R;
        if (gVar != null) {
            arrayList.add(new e4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        i0 i0Var = this.S;
        if (i0Var != null) {
            arrayList.add(new e4(i0Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.V;
        if (progressBar != null) {
            arrayList.add(new e4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.W;
        if (progressBar2 != null) {
            arrayList.add(new e4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.T;
        if (imageView != null) {
            arrayList.add(new e4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.U;
        if (lVar != null) {
            arrayList.add(new e4(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f15840j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f15840j;
            arrayList.add(new e4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f16259p0.getAdEventTracker().b(this.P, arrayList);
    }

    @Override // com.applovin.impl.z1
    public void a(MotionEvent motionEvent, Bundle bundle) {
        a(l7.d.VIDEO_CLICK);
        this.f16259p0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, q7.UNSPECIFIED);
    }

    private void a(l7.d dVar) {
        a(dVar, q7.UNSPECIFIED);
    }

    private void a(l7.d dVar, String str) {
        a(dVar, str, q7.UNSPECIFIED);
    }

    private void a(l7.d dVar, q7 q7Var) {
        a(dVar, "", q7Var);
    }

    private void a(l7.d dVar, String str, q7 q7Var) {
        a(this.f16259p0.a(dVar, str), q7Var);
    }

    private void a(Set set, q7 q7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.P.getCurrentPosition());
        z7 z7VarC1 = this.f16259p0.C1();
        Uri uriD = z7VarC1 != null ? z7VarC1.d() : null;
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        x7.a(set, seconds, uriD, q7Var, this.f15832b);
    }
}
