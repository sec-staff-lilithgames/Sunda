package com.bytedance.sdk.component.jpo;

import android.webkit.WebView;
import com.bytedance.sdk.component.jpo.wqx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr {

    /* renamed from: cm, reason: collision with root package name */
    private final List<Cif> f18779cm;

    /* renamed from: jd, reason: collision with root package name */
    private final WebView f18780jd;
    private final jpo jpo;
    private volatile boolean my;
    private final zz wqx;

    public prr(zz zzVar) {
        ArrayList arrayList = new ArrayList();
        this.f18779cm = arrayList;
        this.my = false;
        this.wqx = zzVar;
        if (zzVar.jpo != null) {
            jpo jpoVar = zzVar.f18787jd;
            if (jpoVar == null) {
                this.jpo = new nmd();
            } else {
                this.jpo = jpoVar;
            }
        } else {
            this.jpo = zzVar.f18787jd;
        }
        this.jpo.wqx(zzVar);
        this.f18780jd = zzVar.jpo;
        arrayList.add(zzVar.zz);
        jr.jpo(zzVar.f18790qk);
    }

    private void jd() {
        if (this.my) {
            xyk.jpo(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public static zz jpo(WebView webView) {
        return new zz(webView);
    }

    public prr jpo(String str, cm<?, ?> cmVar) {
        return jpo(str, (String) null, cmVar);
    }

    public prr jpo(Set<String> set, opi<?, ?> opiVar) {
        return jpo(set, (String) null, opiVar);
    }

    public prr jpo(String str, String str2, cm<?, ?> cmVar) {
        jd();
        this.jpo.f18766qk.jpo(str, cmVar);
        return this;
    }

    public prr jpo(Set<String> set, String str, opi<?, ?> opiVar) {
        jd();
        this.jpo.f18766qk.jpo(set, opiVar);
        return this;
    }

    public prr jpo(String str, wqx.jd jdVar) {
        return jpo(str, (String) null, jdVar);
    }

    public prr jpo(String str, String str2, wqx.jd jdVar) {
        jd();
        this.jpo.f18766qk.jpo(str, jdVar);
        return this;
    }

    public void jpo() {
        if (this.my) {
            return;
        }
        this.jpo.jd();
        this.my = true;
        Iterator<Cif> it = this.f18779cm.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
