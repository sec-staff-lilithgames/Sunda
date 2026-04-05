package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import com.iab.omid.library.mmadbridge.internal.c;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.internal.f;
import com.iab.omid.library.mmadbridge.internal.i;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.b;
import com.iab.omid.library.mmadbridge.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f31016a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f31017b;

    /* renamed from: c, reason: collision with root package name */
    private final f f31018c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.weakreference.a f31019d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f31020e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31021f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31022g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31023h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f31024i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f31025j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f31026k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f31024i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f31025j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f31022g) {
            return;
        }
        this.f31018c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f31019d.get();
    }

    public List<e> d() {
        return this.f31018c.a();
    }

    public boolean e() {
        return this.f31026k != null;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f31022g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f31021f && !this.f31022g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void finish() {
        if (this.f31022g) {
            return;
        }
        this.f31019d.clear();
        removeAllFriendlyObstructions();
        this.f31022g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f31020e = null;
        this.f31026k = null;
    }

    public boolean g() {
        return this.f31022g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public String getAdSessionId() {
        return this.f31023h;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f31020e;
    }

    public boolean h() {
        return this.f31017b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f31017b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f31021f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f31024i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f31025j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f31022g) {
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

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f31022g) {
            return;
        }
        this.f31018c.b();
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f31022g) {
            return;
        }
        this.f31018c.c(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f31026k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void start() {
        if (this.f31021f) {
            return;
        }
        this.f31021f = true;
        c.c().c(this);
        this.f31020e.a(i.c().b());
        this.f31020e.a(com.iab.omid.library.mmadbridge.internal.a.a().b());
        this.f31020e.a(this, this.f31016a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f31018c = new f();
        this.f31021f = false;
        this.f31022g = false;
        this.f31017b = adSessionConfiguration;
        this.f31016a = adSessionContext;
        this.f31023h = str;
        b(null);
        this.f31020e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.mmadbridge.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f31020e.i();
        c.c().a(this);
        this.f31020e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f31019d.clear();
            }
        }
    }

    private void b(View view) {
        this.f31019d = new com.iab.omid.library.mmadbridge.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.mmadbridge.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.mmadbridge.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f31026k.onPossibleObstructionsDetected(this.f31023h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f31025j = true;
    }
}
