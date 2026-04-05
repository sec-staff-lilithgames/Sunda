package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class f6 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final AppLovinAdLoadListener f13962g;

    /* renamed from: h, reason: collision with root package name */
    private final a f13963h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends p7 {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
            super(jSONObject, jSONObject2, kVar);
        }

        public void a(m8 m8Var) {
            if (m8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f15046b.add(m8Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f6 {

        /* renamed from: i, reason: collision with root package name */
        private final String f13964i;

        public b(String str, p7 p7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(p7Var, appLovinAdLoadListener, kVar);
            this.f13964i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            m8 m8VarB = b(this.f13964i);
            if (m8VarB != null) {
                a(m8VarB);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Unable to process XML: " + this.f13964i);
            }
            c(this.f13964i);
            a(q7.XML_PARSING);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends f6 {

        /* renamed from: i, reason: collision with root package name */
        private final JSONObject f13965i;

        public c(p7 p7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(p7Var, appLovinAdLoadListener, kVar);
            this.f13965i = p7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f13965i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "No VAST response received.");
                }
                a(q7.NO_WRAPPER_RESPONSE);
            } else {
                if (string.length() >= ((Integer) this.f14003a.a(v4.F4)).intValue()) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f14005c.b(this.f14004b, "VAST response is over max length");
                    }
                    a(q7.XML_PARSING);
                    return;
                }
                m8 m8VarB = b(string);
                if (m8VarB != null) {
                    a(m8VarB);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.b(this.f14004b, "Unable to process XML: ".concat(string));
                }
                c(string);
                a(q7.XML_PARSING);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends f6 {

        /* renamed from: i, reason: collision with root package name */
        private final m8 f13966i;

        public d(m8 m8Var, p7 p7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
            super(p7Var, appLovinAdLoadListener, kVar);
            if (m8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (p7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f13966i = m8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Processing VAST Wrapper response...");
            }
            a(this.f13966i);
        }
    }

    public f6(p7 p7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessVastResponse", kVar);
        if (p7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f13962g = appLovinAdLoadListener;
        this.f13963h = (a) p7Var;
    }

    public static f6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new c(new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public m8 b(String str) {
        try {
            return n8.a(str, this.f14003a);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Failed to process VAST response", th2);
            }
            a(q7.XML_PARSING);
            this.f14003a.E().a(this.f14004b, th2);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f14003a.a(v4.Y4)), 1).iterator();
        while (it.hasNext()) {
            m8 m8VarB = b("<VAST>" + it.next() + "</VAST>");
            if (m8VarB != null) {
                this.f13963h.a(m8VarB);
            }
        }
    }

    public static f6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new b(str, new a(jSONObject, jSONObject2, kVar), appLovinAdLoadListener, kVar);
    }

    public static f6 a(m8 m8Var, p7 p7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        return new d(m8Var, p7Var, appLovinAdLoadListener, kVar);
    }

    public void a(m8 m8Var) {
        int iD = this.f13963h.d();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Finished parsing XML at depth " + iD);
        }
        this.f13963h.a(m8Var);
        if (x7.b(m8Var)) {
            int iIntValue = ((Integer) this.f14003a.a(v4.G4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f14005c.a(this.f14004b, "VAST response is wrapper. Resolving...");
                }
                this.f14003a.r0().a(new n6(this.f13963h, this.f13962g, this.f14003a));
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(q7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (x7.a(m8Var)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "VAST response is inline. Rendering ad...");
            }
            this.f14003a.r0().a(new i6(this.f13963h, this.f13962g, this.f14003a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "VAST response is an error");
        }
        a(q7.NO_WRAPPER_RESPONSE);
    }

    public void a(q7 q7Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "Failed to process VAST response due to VAST error code " + q7Var);
        }
        x7.a(this.f13963h, this.f13962g, q7Var, -6, this.f14003a);
    }
}
