package com.iab.omid.library.appodeal.adsession;

import android.view.View;
import com.iab.omid.library.appodeal.internal.c;
import com.iab.omid.library.appodeal.internal.e;
import com.iab.omid.library.appodeal.internal.f;
import com.iab.omid.library.appodeal.internal.i;
import com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher;
import com.iab.omid.library.appodeal.publisher.b;
import com.iab.omid.library.appodeal.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f30344a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f30345b;

    /* renamed from: c, reason: collision with root package name */
    private final f f30346c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.appodeal.weakreference.a f30347d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f30348e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30349f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30350g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30351h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30352i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30353j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f30354k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f30352i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f30353j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f30350g) {
            return;
        }
        this.f30346c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f30351h;
    }

    public AdSessionStatePublisher d() {
        return this.f30348e;
    }

    public View e() {
        return this.f30347d.get();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f30350g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f30346c.a();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void finish() {
        if (this.f30350g) {
            return;
        }
        this.f30347d.clear();
        removeAllFriendlyObstructions();
        this.f30350g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f30348e = null;
        this.f30354k = null;
    }

    public boolean g() {
        return this.f30354k != null;
    }

    public boolean h() {
        return this.f30349f && !this.f30350g;
    }

    public boolean i() {
        return this.f30350g;
    }

    public boolean j() {
        return this.f30345b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f30345b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f30349f;
    }

    public void m() {
        a();
        d().g();
        this.f30352i = true;
    }

    public void n() {
        b();
        d().h();
        this.f30353j = true;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f30350g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f30350g) {
            return;
        }
        this.f30346c.b();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f30350g) {
            return;
        }
        this.f30346c.c(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f30354k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void start() {
        if (this.f30349f || this.f30348e == null) {
            return;
        }
        this.f30349f = true;
        c.c().c(this);
        this.f30348e.a(i.c().b());
        this.f30348e.a(com.iab.omid.library.appodeal.internal.a.a().b());
        this.f30348e.a(this, this.f30344a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f30346c = new f();
        this.f30349f = false;
        this.f30350g = false;
        this.f30345b = adSessionConfiguration;
        this.f30344a = adSessionContext;
        this.f30351h = str;
        b(null);
        this.f30348e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.appodeal.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f30348e.i();
        c.c().a(this);
        this.f30348e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f30347d.clear();
            }
        }
    }

    private void b(View view) {
        this.f30347d = new com.iab.omid.library.appodeal.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.appodeal.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.appodeal.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f30354k.onPossibleObstructionsDetected(this.f30351h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f30353j = true;
    }
}
