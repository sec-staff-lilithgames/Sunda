package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.internal.c;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.b;
import com.iab.omid.library.vungle.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f31396a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f31397b;

    /* renamed from: c, reason: collision with root package name */
    private final f f31398c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.weakreference.a f31399d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f31400e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31401f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31402g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31403h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f31404i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f31405j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f31406k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f31404i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f31405j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f31402g) {
            return;
        }
        this.f31398c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f31403h;
    }

    public AdSessionStatePublisher d() {
        return this.f31400e;
    }

    public View e() {
        return this.f31399d.get();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f31402g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f31398c.a();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f31402g) {
            return;
        }
        this.f31399d.clear();
        removeAllFriendlyObstructions();
        this.f31402g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f31400e = null;
        this.f31406k = null;
    }

    public boolean g() {
        return this.f31406k != null;
    }

    public boolean h() {
        return this.f31401f && !this.f31402g;
    }

    public boolean i() {
        return this.f31402g;
    }

    public boolean j() {
        return this.f31397b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f31397b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f31401f;
    }

    public void m() {
        a();
        d().g();
        this.f31404i = true;
    }

    public void n() {
        b();
        d().h();
        this.f31405j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f31402g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f31402g) {
            return;
        }
        this.f31398c.b();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f31402g) {
            return;
        }
        this.f31398c.c(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f31406k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f31401f || this.f31400e == null) {
            return;
        }
        this.f31401f = true;
        c.c().c(this);
        this.f31400e.a(i.c().b());
        this.f31400e.a(com.iab.omid.library.vungle.internal.a.a().b());
        this.f31400e.a(this, this.f31396a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f31398c = new f();
        this.f31401f = false;
        this.f31402g = false;
        this.f31397b = adSessionConfiguration;
        this.f31396a = adSessionContext;
        this.f31403h = str;
        b(null);
        this.f31400e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.vungle.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f31400e.i();
        c.c().a(this);
        this.f31400e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f31399d.clear();
            }
        }
    }

    private void b(View view) {
        this.f31399d = new com.iab.omid.library.vungle.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.vungle.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.vungle.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f31406k.onPossibleObstructionsDetected(this.f31403h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f31405j = true;
    }
}
