package com.iab.omid.library.fyber.adsession;

import android.view.View;
import com.iab.omid.library.fyber.internal.c;
import com.iab.omid.library.fyber.internal.e;
import com.iab.omid.library.fyber.internal.f;
import com.iab.omid.library.fyber.internal.i;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import com.iab.omid.library.fyber.publisher.b;
import com.iab.omid.library.fyber.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f30610a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f30611b;

    /* renamed from: c, reason: collision with root package name */
    private final f f30612c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.fyber.weakreference.a f30613d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f30614e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30615f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30616g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30617h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30618i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30619j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f30620k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f30618i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f30619j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f30616g) {
            return;
        }
        this.f30612c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f30617h;
    }

    public AdSessionStatePublisher d() {
        return this.f30614e;
    }

    public View e() {
        return this.f30613d.get();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f30616g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f30612c.a();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void finish() {
        if (this.f30616g) {
            return;
        }
        this.f30613d.clear();
        removeAllFriendlyObstructions();
        this.f30616g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f30614e = null;
        this.f30620k = null;
    }

    public boolean g() {
        return this.f30620k != null;
    }

    public boolean h() {
        return this.f30615f && !this.f30616g;
    }

    public boolean i() {
        return this.f30616g;
    }

    public boolean j() {
        return this.f30611b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f30611b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f30615f;
    }

    public void m() {
        a();
        d().g();
        this.f30618i = true;
    }

    public void n() {
        b();
        d().h();
        this.f30619j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f30616g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f30616g) {
            return;
        }
        this.f30612c.b();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f30616g) {
            return;
        }
        this.f30612c.c(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f30620k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void start() {
        if (this.f30615f || this.f30614e == null) {
            return;
        }
        this.f30615f = true;
        c.c().c(this);
        this.f30614e.a(i.c().b());
        this.f30614e.a(com.iab.omid.library.fyber.internal.a.a().b());
        this.f30614e.a(this, this.f30610a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f30612c = new f();
        this.f30615f = false;
        this.f30616g = false;
        this.f30611b = adSessionConfiguration;
        this.f30610a = adSessionContext;
        this.f30617h = str;
        b(null);
        this.f30614e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.fyber.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f30614e.i();
        c.c().a(this);
        this.f30614e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f30613d.clear();
            }
        }
    }

    private void b(View view) {
        this.f30613d = new com.iab.omid.library.fyber.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.fyber.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.fyber.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f30620k.onPossibleObstructionsDetected(this.f30617h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f30619j = true;
    }
}
