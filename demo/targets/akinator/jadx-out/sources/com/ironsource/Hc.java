package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Hc {

    /* renamed from: d, reason: collision with root package name */
    public static final String f34587d = "Ironsrc";

    /* renamed from: e, reason: collision with root package name */
    public static final String f34588e = "7";

    /* renamed from: f, reason: collision with root package name */
    public static final String f34589f = Omid.getVersion();

    /* renamed from: g, reason: collision with root package name */
    public static final String f34590g = "omidVersion";

    /* renamed from: h, reason: collision with root package name */
    public static final String f34591h = "omidPartnerName";

    /* renamed from: i, reason: collision with root package name */
    public static final String f34592i = "omidPartnerVersion";

    /* renamed from: j, reason: collision with root package name */
    public static final String f34593j = "omidActiveAdSessions";

    /* renamed from: k, reason: collision with root package name */
    private static final String f34594k = "Invalid OMID impressionOwner";

    /* renamed from: l, reason: collision with root package name */
    private static final String f34595l = "Invalid OMID videoEventsOwner";

    /* renamed from: m, reason: collision with root package name */
    private static final String f34596m = "Missing OMID impressionOwner";

    /* renamed from: n, reason: collision with root package name */
    private static final String f34597n = "Missing OMID videoEventsOwner";

    /* renamed from: o, reason: collision with root package name */
    private static final String f34598o = "OMID has not been activated";

    /* renamed from: p, reason: collision with root package name */
    private static final String f34599p = "Missing OMID creativeType";

    /* renamed from: q, reason: collision with root package name */
    private static final String f34600q = "Missing adview id in OMID params";

    /* renamed from: r, reason: collision with root package name */
    private static final String f34601r = "No adview found with the provided adViewId";

    /* renamed from: s, reason: collision with root package name */
    private static final String f34602s = "OMID Session has already started";

    /* renamed from: t, reason: collision with root package name */
    private static final String f34603t = "OMID Session has not started";

    /* renamed from: a, reason: collision with root package name */
    private final Partner f34604a = Partner.createPartner(f34587d, f34588e);

    /* renamed from: c, reason: collision with root package name */
    private boolean f34606c = false;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, AdSession> f34605b = new HashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: i, reason: collision with root package name */
        private static final String f34607i = "isolateVerificationScripts";

        /* renamed from: j, reason: collision with root package name */
        private static final String f34608j = "impressionOwner";

        /* renamed from: k, reason: collision with root package name */
        private static final String f34609k = "videoEventsOwner";

        /* renamed from: l, reason: collision with root package name */
        private static final String f34610l = "customReferenceData";

        /* renamed from: m, reason: collision with root package name */
        private static final String f34611m = "creativeType";

        /* renamed from: n, reason: collision with root package name */
        private static final String f34612n = "impressionType";

        /* renamed from: o, reason: collision with root package name */
        public static final String f34613o = "adViewId";

        /* renamed from: a, reason: collision with root package name */
        public boolean f34614a;

        /* renamed from: b, reason: collision with root package name */
        public Owner f34615b;

        /* renamed from: c, reason: collision with root package name */
        public Owner f34616c;

        /* renamed from: d, reason: collision with root package name */
        public String f34617d;

        /* renamed from: e, reason: collision with root package name */
        public ImpressionType f34618e;

        /* renamed from: f, reason: collision with root package name */
        public CreativeType f34619f;

        /* renamed from: g, reason: collision with root package name */
        public String f34620g;

        /* renamed from: h, reason: collision with root package name */
        public Owner f34621h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.f34614a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String strOptString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Hc.f34596m);
            }
            try {
                aVar.f34615b = Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
                String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(strOptString)) {
                    throw new IllegalArgumentException(Hc.f34597n);
                }
                try {
                    aVar.f34616c = Owner.valueOf(strOptString2.toUpperCase(Locale.getDefault()));
                    aVar.f34617d = jSONObject.optString("customReferenceData", "");
                    aVar.f34619f = b(jSONObject);
                    aVar.f34618e = c(jSONObject);
                    aVar.f34620g = e(jSONObject);
                    aVar.f34621h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e10) {
                    C3422r4.d().a(e10);
                    throw new IllegalArgumentException(a.b.k("Invalid OMID videoEventsOwner ", strOptString2));
                }
            } catch (IllegalArgumentException e11) {
                C3422r4.d().a(e11);
                throw new IllegalArgumentException(a.b.k("Invalid OMID impressionOwner ", strOptString));
            }
        }

        private static CreativeType b(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(a.b.k(Hc.f34599p, strOptString));
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(a.b.k(Hc.f34599p, strOptString));
        }

        private static ImpressionType c(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(a.b.k(Hc.f34599p, strOptString));
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(a.b.k(Hc.f34599p, strOptString));
        }

        private static Owner d(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e10) {
                C3422r4.d().a(e10);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("adViewId", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(a.b.k(Hc.f34600q, strOptString));
            }
            return strOptString;
        }
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.f34606c) {
            return;
        }
        Omid.activate(context);
        this.f34606c = true;
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String strOptString = jSONObject.optString("adViewId");
        AdSession adSession = this.f34605b.get(strOptString);
        if (adSession == null) {
            throw new IllegalStateException(f34603t);
        }
        adSession.finish();
        this.f34605b.remove(strOptString);
    }

    public void c(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(jSONObject);
        AdSession adSession = this.f34605b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(f34603t);
        }
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            adEventsCreateAdEvents.loaded();
        }
        adEventsCreateAdEvents.impressionOccurred();
    }

    public void d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(a.a(jSONObject));
    }

    public C3237ge a() throws JSONException {
        C3237ge c3237ge = new C3237ge();
        c3237ge.b(f34590g, SDKUtils.encodeString(f34589f));
        c3237ge.b("omidPartnerName", SDKUtils.encodeString(f34587d));
        c3237ge.b("omidPartnerVersion", SDKUtils.encodeString(f34588e));
        c3237ge.b(f34593j, SDKUtils.encodeString(Arrays.toString(this.f34605b.keySet().toArray())));
        return c3237ge;
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (this.f34606c) {
            if (!TextUtils.isEmpty(aVar.f34620g)) {
                String str = aVar.f34620g;
                if (!this.f34605b.containsKey(str)) {
                    K8 k8A = C3410q8.a().a(str);
                    if (k8A != null) {
                        AdSession adSessionA = a(aVar, k8A);
                        adSessionA.start();
                        this.f34605b.put(str, adSessionA);
                        return;
                    }
                    throw new IllegalStateException(f34601r);
                }
                throw new IllegalStateException(f34602s);
            }
            throw new IllegalStateException(f34600q);
        }
        throw new IllegalStateException(f34598o);
    }

    private AdSession a(a aVar, K8 k82) throws IllegalArgumentException {
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f34619f, aVar.f34618e, aVar.f34615b, aVar.f34616c, aVar.f34614a), AdSessionContext.createHtmlAdSessionContext(this.f34604a, k82.getPresentingView(), null, aVar.f34617d));
        adSessionCreateAdSession.registerAdView(k82.getPresentingView());
        return adSessionCreateAdSession;
    }

    private void a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f34606c) {
            throw new IllegalStateException(f34598o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f34603t);
        }
    }
}
