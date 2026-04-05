package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f30480a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f30481b;

    /* renamed from: c, reason: collision with root package name */
    private final f f30482c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f30483d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f30484e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30485f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30486g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30487h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30488i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30489j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f30490k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f30488i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f30489j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f30486g) {
            return;
        }
        this.f30482c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f30483d.get();
    }

    public List<e> d() {
        return this.f30482c.a();
    }

    public boolean e() {
        return this.f30490k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f30486g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f30485f && !this.f30486g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f30486g) {
            return;
        }
        this.f30483d.clear();
        removeAllFriendlyObstructions();
        this.f30486g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f30484e = null;
        this.f30490k = null;
    }

    public boolean g() {
        return this.f30486g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f30487h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f30484e;
    }

    public boolean h() {
        return this.f30481b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f30481b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f30485f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f30488i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f30489j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f30486g) {
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

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f30486g) {
            return;
        }
        this.f30482c.b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f30486g) {
            return;
        }
        this.f30482c.c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f30490k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f30485f) {
            return;
        }
        this.f30485f = true;
        c.c().c(this);
        this.f30484e.a(i.c().b());
        this.f30484e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f30484e.a(this, this.f30480a);
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f30482c = new f();
        this.f30485f = false;
        this.f30486g = false;
        this.f30481b = adSessionConfiguration;
        this.f30480a = adSessionContext;
        this.f30487h = str;
        b(null);
        this.f30484e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f30484e.i();
        c.c().a(this);
        this.f30484e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f30483d.clear();
            }
        }
    }

    private void b(View view) {
        this.f30483d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.bytedance2.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f30490k.onPossibleObstructionsDetected(this.f30487h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f30489j = true;
    }
}
