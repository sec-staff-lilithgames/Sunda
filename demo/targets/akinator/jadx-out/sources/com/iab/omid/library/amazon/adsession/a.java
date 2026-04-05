package com.iab.omid.library.amazon.adsession;

import android.view.View;
import com.iab.omid.library.amazon.internal.c;
import com.iab.omid.library.amazon.internal.e;
import com.iab.omid.library.amazon.internal.f;
import com.iab.omid.library.amazon.internal.i;
import com.iab.omid.library.amazon.publisher.AdSessionStatePublisher;
import com.iab.omid.library.amazon.publisher.b;
import com.iab.omid.library.amazon.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f30080a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f30081b;

    /* renamed from: c, reason: collision with root package name */
    private final f f30082c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.amazon.weakreference.a f30083d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f30084e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30085f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30086g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30087h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30088i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30089j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f30090k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f30088i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f30089j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f30086g) {
            return;
        }
        this.f30082c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f30083d.get();
    }

    public List<e> d() {
        return this.f30082c.a();
    }

    public boolean e() {
        return this.f30090k != null;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f30086g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f30085f && !this.f30086g;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void finish() {
        if (this.f30086g) {
            return;
        }
        this.f30083d.clear();
        removeAllFriendlyObstructions();
        this.f30086g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f30084e = null;
        this.f30090k = null;
    }

    public boolean g() {
        return this.f30086g;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public String getAdSessionId() {
        return this.f30087h;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f30084e;
    }

    public boolean h() {
        return this.f30081b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f30081b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f30085f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f30088i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f30089j = true;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f30086g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f30086g) {
            return;
        }
        this.f30082c.b();
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f30086g) {
            return;
        }
        this.f30082c.c(view);
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f30090k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.amazon.adsession.AdSession
    public void start() {
        if (this.f30085f) {
            return;
        }
        this.f30085f = true;
        c.c().c(this);
        this.f30084e.a(i.c().b());
        this.f30084e.a(com.iab.omid.library.amazon.internal.a.a().b());
        this.f30084e.a(this, this.f30080a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f30082c = new f();
        this.f30085f = false;
        this.f30086g = false;
        this.f30081b = adSessionConfiguration;
        this.f30080a = adSessionContext;
        this.f30087h = str;
        b(null);
        this.f30084e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.amazon.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f30084e.i();
        c.c().a(this);
        this.f30084e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f30083d.clear();
            }
        }
    }

    private void b(View view) {
        this.f30083d = new com.iab.omid.library.amazon.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.amazon.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.amazon.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f30090k.onPossibleObstructionsDetected(this.f30087h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f30089j = true;
    }
}
