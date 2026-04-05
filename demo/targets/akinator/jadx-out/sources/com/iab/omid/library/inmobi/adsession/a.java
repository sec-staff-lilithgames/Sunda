package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import com.iab.omid.library.inmobi.internal.c;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.internal.f;
import com.iab.omid.library.inmobi.internal.i;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.b;
import com.iab.omid.library.inmobi.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f30745a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f30746b;

    /* renamed from: c, reason: collision with root package name */
    private final f f30747c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.weakreference.a f30748d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f30749e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30750f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30751g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30752h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30753i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30754j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f30755k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f30753i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f30754j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f30751g) {
            return;
        }
        this.f30747c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f30752h;
    }

    public AdSessionStatePublisher d() {
        return this.f30749e;
    }

    public View e() {
        return this.f30748d.get();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f30751g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f30747c.a();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void finish() {
        if (this.f30751g) {
            return;
        }
        this.f30748d.clear();
        removeAllFriendlyObstructions();
        this.f30751g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f30749e = null;
        this.f30755k = null;
    }

    public boolean g() {
        return this.f30755k != null;
    }

    public boolean h() {
        return this.f30750f && !this.f30751g;
    }

    public boolean i() {
        return this.f30751g;
    }

    public boolean j() {
        return this.f30746b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f30746b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f30750f;
    }

    public void m() {
        a();
        d().g();
        this.f30753i = true;
    }

    public void n() {
        b();
        d().h();
        this.f30754j = true;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f30751g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f30751g) {
            return;
        }
        this.f30747c.b();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f30751g) {
            return;
        }
        this.f30747c.c(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f30755k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void start() {
        if (this.f30750f || this.f30749e == null) {
            return;
        }
        this.f30750f = true;
        c.c().c(this);
        this.f30749e.a(i.c().b());
        this.f30749e.a(com.iab.omid.library.inmobi.internal.a.a().b());
        this.f30749e.a(this, this.f30745a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f30747c = new f();
        this.f30750f = false;
        this.f30751g = false;
        this.f30746b = adSessionConfiguration;
        this.f30745a = adSessionContext;
        this.f30752h = str;
        b(null);
        this.f30749e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.inmobi.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f30749e.i();
        c.c().a(this);
        this.f30749e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f30748d.clear();
            }
        }
    }

    private void b(View view) {
        this.f30748d = new com.iab.omid.library.inmobi.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.inmobi.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.inmobi.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f30755k.onPossibleObstructionsDetected(this.f30752h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f30754j = true;
    }
}
