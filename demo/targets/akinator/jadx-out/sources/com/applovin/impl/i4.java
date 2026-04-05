package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class i4 extends c4 {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f14131p = true;

    /* renamed from: h, reason: collision with root package name */
    private final l7 f14132h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f14133i;

    /* renamed from: j, reason: collision with root package name */
    private MediaEvents f14134j;

    /* renamed from: k, reason: collision with root package name */
    private final VastProperties f14135k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f14136l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f14137m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f14138n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f14139o;

    public i4(l7 l7Var) {
        super(l7Var);
        this.f14133i = new AtomicBoolean();
        this.f14136l = new AtomicBoolean();
        this.f14137m = new AtomicBoolean();
        this.f14138n = new AtomicBoolean();
        this.f14139o = new AtomicBoolean();
        this.f14132h = l7Var;
        float fY1 = l7Var.y1();
        if (l7Var.y1() == -1) {
            this.f14135k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f14135k = VastProperties.createVastPropertiesForSkippableMedia(fY1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new i9(this, 0));
    }

    public void B() {
        b("track skipped", new i9(this, 8));
    }

    public void C() {
        if (this.f14139o.compareAndSet(false, true)) {
            b("track third quartile", new i9(this, 1));
        }
    }

    @Override // com.applovin.impl.c4
    public AdSessionContext a(WebView webView) {
        if (!f14131p && this.f14132h.r1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (m7 m7Var : this.f14132h.r1().b()) {
            List<s7> listC = m7Var.c();
            if (listC.isEmpty()) {
                x7.a(m7Var.b(), q7.FAILED_TO_LOAD_RESOURCE, this.f13765b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (s7 s7Var : listC) {
                    if (CampaignEx.KEY_OMID.equalsIgnoreCase(s7Var.b())) {
                        arrayList2.add(s7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    x7.a(m7Var.b(), q7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f13765b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((s7) it.next()).c()));
                        } catch (Throwable th2) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f13766c.a(this.f13767d, "Failed to parse JavaScript resource url", th2);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        x7.a(m7Var.b(), q7.FAILED_TO_LOAD_RESOURCE, this.f13765b);
                    } else {
                        String strE = m7Var.e();
                        String strD = m7Var.d();
                        if (!StringUtils.isValidString(strE) || StringUtils.isValidString(strD)) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                URL url = (URL) it2.next();
                                arrayList.add(StringUtils.isValidString(strE) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            x7.a(m7Var.b(), q7.FAILED_TO_LOAD_RESOURCE, this.f13765b);
                        }
                    }
                }
            }
        }
        String strA = this.f13765b.e0().a();
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13766c.b(this.f13767d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f13765b.e0().b(), strA, arrayList, this.f14132h.getOpenMeasurementContentUrl(), this.f14132h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th3) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f13766c.a(this.f13767d, "Failed to create ad session context", th3);
            return null;
        }
    }

    public void b(final float f10, final boolean z10) {
        if (this.f14136l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.j9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14217b.a(f10, z10);
                }
            });
        }
    }

    @Override // com.applovin.impl.c4
    public void h() {
        b("track loaded", new i9(this, 10));
    }

    public void v() {
        b("track clicked", new i9(this, 6));
    }

    public void w() {
        b("track completed", new i9(this, 9));
    }

    public void x() {
        if (this.f14137m.compareAndSet(false, true)) {
            b("track first quartile", new i9(this, 4));
        }
    }

    public void y() {
        if (this.f14138n.compareAndSet(false, true)) {
            b("track midpoint", new i9(this, 2));
        }
    }

    public void z() {
        b("track paused", new i9(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f14134j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f14134j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f14134j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f14134j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f14134j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f13770g.loaded(this.f14135k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f14134j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f14134j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f14134j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f14134j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f14134j.thirdQuartile();
    }

    public void i() {
        if (this.f14133i.compareAndSet(true, false)) {
            b("buffer finished", new i9(this, 7));
        }
    }

    public void j() {
        if (this.f14133i.compareAndSet(false, true)) {
            b("buffer started", new i9(this, 5));
        }
    }

    public void b(boolean z10) {
        b("track volume changed", new k9(this, z10, 0));
    }

    @Override // com.applovin.impl.c4
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f13766c.a(this.f13767d, "Failed to create ad session configuration", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.c4
    public void a(AdSession adSession) {
        try {
            this.f14134j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f13766c.a(this.f13767d, QpyI.QNIlAbAT, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z10) {
        this.f14134j.start(f10, z10 ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) {
        this.f14134j.volumeChange(z10 ? 0.0f : 1.0f);
    }
}
