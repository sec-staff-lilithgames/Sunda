package com.iab.omid.library.odeeoio.adsession;

import android.view.View;
import com.iab.omid.library.odeeoio.b.c;
import com.iab.omid.library.odeeoio.b.f;
import com.iab.omid.library.odeeoio.d.e;
import com.iab.omid.library.odeeoio.publisher.AdSessionStatePublisher;
import com.iab.omid.library.odeeoio.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f31156a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionContext f31157b;

    /* renamed from: c, reason: collision with root package name */
    private final AdSessionConfiguration f31158c;

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.odeeoio.e.a f31160e;

    /* renamed from: f, reason: collision with root package name */
    private AdSessionStatePublisher f31161f;

    /* renamed from: j, reason: collision with root package name */
    private boolean f31165j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f31166k;

    /* renamed from: l, reason: collision with root package name */
    private PossibleObstructionListener f31167l;

    /* renamed from: d, reason: collision with root package name */
    private final List<c> f31159d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private boolean f31162g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f31163h = false;

    /* renamed from: i, reason: collision with root package name */
    private final String f31164i = UUID.randomUUID().toString();

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f31158c = adSessionConfiguration;
        this.f31157b = adSessionContext;
        c(null);
        this.f31161f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.odeeoio.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f31161f.a();
        com.iab.omid.library.odeeoio.b.a.a().a(this);
        this.f31161f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f31159d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void k() {
        if (this.f31165j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void l() {
        if (this.f31166k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f31163h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f31159d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    public void c() {
        k();
        getAdSessionStatePublisher().g();
        this.f31165j = true;
    }

    public void d() {
        l();
        getAdSessionStatePublisher().h();
        this.f31166k = true;
    }

    public View e() {
        return this.f31160e.get();
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f31163h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f31162g && !this.f31163h;
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public void finish() {
        if (this.f31163h) {
            return;
        }
        this.f31160e.clear();
        removeAllFriendlyObstructions();
        this.f31163h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.odeeoio.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f31161f = null;
        this.f31167l = null;
    }

    public boolean g() {
        return this.f31162g;
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public String getAdSessionId() {
        return this.f31164i;
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f31161f;
    }

    public boolean h() {
        return this.f31163h;
    }

    public boolean i() {
        return this.f31158c.isNativeImpressionOwner();
    }

    public boolean j() {
        return this.f31158c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f31163h) {
            return;
        }
        e.a(view, "AdView is null");
        if (e() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f31163h) {
            return;
        }
        this.f31159d.clear();
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f31163h) {
            return;
        }
        b(view);
        c cVarA = a(view);
        if (cVarA != null) {
            this.f31159d.remove(cVarA);
        }
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f31167l = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.odeeoio.adsession.AdSession
    public void start() {
        if (this.f31162g) {
            return;
        }
        this.f31162g = true;
        com.iab.omid.library.odeeoio.b.a.a().b(this);
        this.f31161f.a(f.a().d());
        this.f31161f.a(this, this.f31157b);
    }

    private void c(View view) {
        this.f31160e = new com.iab.omid.library.odeeoio.e.a(view);
    }

    private void d(View view) {
        Collection<a> collectionB = com.iab.omid.library.odeeoio.b.a.a().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f31160e.clear();
            }
        }
    }

    public List<c> a() {
        return this.f31159d;
    }

    public boolean b() {
        return this.f31167l != null;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f31156a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(List<com.iab.omid.library.odeeoio.e.a> list) {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.odeeoio.e.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f31167l.onPossibleObstructionsDetected(this.f31164i, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        l();
        getAdSessionStatePublisher().a(jSONObject);
        this.f31166k = true;
    }
}
