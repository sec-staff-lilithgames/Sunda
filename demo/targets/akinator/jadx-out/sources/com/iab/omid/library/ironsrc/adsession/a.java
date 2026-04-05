package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.f;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f30881a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f30882b;

    /* renamed from: c, reason: collision with root package name */
    private final f f30883c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f30884d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f30885e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30886f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30887g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30888h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30889i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30890j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f30891k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f30889i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f30890j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f30887g) {
            return;
        }
        this.f30883c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f30884d.get();
    }

    public List<e> d() {
        return this.f30883c.a();
    }

    public boolean e() {
        return this.f30891k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f30887g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f30886f && !this.f30887g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f30887g) {
            return;
        }
        this.f30884d.clear();
        removeAllFriendlyObstructions();
        this.f30887g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f30885e = null;
        this.f30891k = null;
    }

    public boolean g() {
        return this.f30887g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f30888h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f30885e;
    }

    public boolean h() {
        return this.f30882b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f30882b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f30886f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f30889i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f30890j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f30887g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f30887g) {
            return;
        }
        this.f30883c.b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f30887g) {
            return;
        }
        this.f30883c.c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f30891k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f30886f || this.f30885e == null) {
            return;
        }
        this.f30886f = true;
        c.c().c(this);
        this.f30885e.a(i.c().b());
        this.f30885e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.f30885e.a(this, this.f30881a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f30883c = new f();
        this.f30886f = false;
        this.f30887g = false;
        this.f30882b = adSessionConfiguration;
        this.f30881a = adSessionContext;
        this.f30888h = str;
        b(null);
        this.f30885e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f30885e.i();
        c.c().a(this);
        this.f30885e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f30884d.clear();
            }
        }
    }

    private void b(View view) {
        this.f30884d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.ironsrc.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f30891k.onPossibleObstructionsDetected(this.f30888h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f30890j = true;
    }
}
