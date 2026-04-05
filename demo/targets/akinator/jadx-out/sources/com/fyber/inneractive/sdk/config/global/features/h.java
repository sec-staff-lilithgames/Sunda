package com.fyber.inneractive.sdk.config.global.features;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h extends com.fyber.inneractive.sdk.config.global.p {

    /* renamed from: b, reason: collision with root package name */
    public String f23290b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f23291c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashMap f23292d = new HashMap();

    public h(String str) {
        this.f23290b = str;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final String a(String str, String str2) {
        String strB;
        Iterator it = this.f23292d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                strB = null;
                break;
            }
            strB = ((com.fyber.inneractive.sdk.config.global.k) this.f23292d.get((String) it.next())).b(str);
            if (strB != null) {
                break;
            }
        }
        if (strB != null) {
            return strB;
        }
        com.fyber.inneractive.sdk.config.global.n nVar = this.f23305a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    public abstract h b();

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final String b(String str) {
        return a(str, null);
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final Boolean c(String str) {
        Boolean boolC;
        Iterator it = this.f23292d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                boolC = null;
                break;
            }
            boolC = ((com.fyber.inneractive.sdk.config.global.k) this.f23292d.get((String) it.next())).c(str);
            if (boolC != null) {
                break;
            }
        }
        return boolC == null ? super.c(str) : boolC;
    }

    public final String toString() {
        return String.format("id: %s, params: %s exp: %s", this.f23290b, this.f23305a, this.f23291c);
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public final Integer a(String str) {
        Integer numA;
        Iterator it = this.f23292d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                numA = null;
                break;
            }
            numA = ((com.fyber.inneractive.sdk.config.global.k) this.f23292d.get((String) it.next())).a(str);
            if (numA != null) {
                break;
            }
        }
        return numA == null ? super.a(str) : numA;
    }

    public final void a(h hVar) {
        hVar.f23290b = this.f23290b;
        hVar.f23305a = this.f23305a;
        hVar.f23291c = new HashMap(this.f23291c);
        hVar.f23292d = new HashMap(this.f23292d);
    }
}
