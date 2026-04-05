package com.iab.omid.library.unity3d.adsession;

import android.view.View;
import com.iab.omid.library.unity3d.internal.c;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher;
import com.iab.omid.library.unity3d.publisher.b;
import com.iab.omid.library.unity3d.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class a extends AdSession {

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f31268l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final AdSessionContext f31269a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f31270b;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.unity3d.weakreference.a f31272d;

    /* renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f31273e;

    /* renamed from: h, reason: collision with root package name */
    private final String f31276h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f31277i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f31278j;

    /* renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f31279k;

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f31271c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f31274f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31275g = false;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f31270b = adSessionConfiguration;
        this.f31269a = adSessionContext;
        String string = UUID.randomUUID().toString();
        this.f31276h = string;
        d(null);
        this.f31273e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.unity3d.publisher.a(string, adSessionContext.getWebView()) : new b(string, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f31273e.i();
        c.c().a(this);
        this.f31273e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f31277i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private e b(View view) {
        for (e eVar : this.f31271c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f31275g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f31271c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f31272d.get();
    }

    public List<e> d() {
        return this.f31271c;
    }

    public boolean e() {
        return this.f31279k != null;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f31275g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f31274f && !this.f31275g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void finish() {
        if (this.f31275g) {
            return;
        }
        this.f31272d.clear();
        removeAllFriendlyObstructions();
        this.f31275g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f31273e = null;
        this.f31279k = null;
    }

    public boolean g() {
        return this.f31275g;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public String getAdSessionId() {
        return this.f31276h;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f31273e;
    }

    public boolean h() {
        return this.f31270b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f31270b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f31274f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f31277i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f31278j = true;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f31275g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f31275g) {
            return;
        }
        this.f31271c.clear();
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f31275g) {
            return;
        }
        a(view);
        e eVarB = b(view);
        if (eVarB != null) {
            this.f31271c.remove(eVarB);
        }
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f31279k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.unity3d.adsession.AdSession
    public void start() {
        if (this.f31274f) {
            return;
        }
        this.f31274f = true;
        c.c().c(this);
        this.f31273e.a(h.c().b());
        this.f31273e.a(com.iab.omid.library.unity3d.internal.a.a().b());
        this.f31273e.a(this, this.f31269a);
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void b() {
        if (this.f31278j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f31272d.clear();
            }
        }
    }

    private void d(View view) {
        this.f31272d = new com.iab.omid.library.unity3d.weakreference.a(view);
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f31268l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(List<com.iab.omid.library.unity3d.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.unity3d.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f31279k.onPossibleObstructionsDetected(this.f31276h, arrayList);
        }
    }

    public void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f31278j = true;
    }
}
