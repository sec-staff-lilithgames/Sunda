package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f30209a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f30210b;

    /* renamed from: c, reason: collision with root package name */
    private final f f30211c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f30212d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f30213e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30214f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30215g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30216h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30217i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30218j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f30219k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f30217i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f30218j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f30215g) {
            return;
        }
        this.f30211c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f30216h;
    }

    public AdSessionStatePublisher d() {
        return this.f30213e;
    }

    public View e() {
        return this.f30212d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f30215g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f30211c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f30215g) {
            return;
        }
        this.f30212d.clear();
        removeAllFriendlyObstructions();
        this.f30215g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f30213e = null;
        this.f30219k = null;
    }

    public boolean g() {
        return this.f30219k != null;
    }

    public boolean h() {
        return this.f30214f && !this.f30215g;
    }

    public boolean i() {
        return this.f30215g;
    }

    public boolean j() {
        return this.f30210b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f30210b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f30214f;
    }

    public void m() {
        a();
        d().g();
        this.f30217i = true;
    }

    public void n() {
        b();
        d().h();
        this.f30218j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f30215g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f30215g) {
            return;
        }
        this.f30211c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f30215g) {
            return;
        }
        this.f30211c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f30219k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f30214f || this.f30213e == null) {
            return;
        }
        this.f30214f = true;
        c.c().c(this);
        this.f30213e.a(i.c().b());
        this.f30213e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f30213e.a(this, this.f30209a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f30211c = new f();
        this.f30214f = false;
        this.f30215g = false;
        this.f30210b = adSessionConfiguration;
        this.f30209a = adSessionContext;
        this.f30216h = str;
        b(null);
        this.f30213e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f30213e.i();
        c.c().a(this);
        this.f30213e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f30212d.clear();
            }
        }
    }

    private void b(View view) {
        this.f30212d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f30219k.onPossibleObstructionsDetected(this.f30216h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f30218j = true;
    }
}
