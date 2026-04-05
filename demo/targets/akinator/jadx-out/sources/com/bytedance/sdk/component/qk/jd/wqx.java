package com.bytedance.sdk.component.qk.jd;

import android.text.TextUtils;
import com.bytedance.sdk.component.jd.jpo.Cif;
import com.bytedance.sdk.component.jd.jpo.ju;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class wqx {

    /* renamed from: jj, reason: collision with root package name */
    int f18990jj;
    String my;
    protected ju wqx;

    /* renamed from: cm, reason: collision with root package name */
    protected String f18989cm = null;

    /* renamed from: qk, reason: collision with root package name */
    protected final Map<String, String> f18991qk = new HashMap();
    protected String xyk = null;
    protected boolean zz = false;

    public wqx(ju juVar) {
        this.wqx = juVar;
        try {
            wqx(UUID.randomUUID().toString());
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void cm(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f18991qk.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void jd(String str) {
        this.xyk = str;
    }

    public void jpo(String str) {
        this.my = str;
    }

    public void wqx(String str) {
        this.f18989cm = str;
    }

    public void jd(String str, String str2) {
        this.f18991qk.put(str, str2);
    }

    public void jpo(int i10) {
        this.f18990jj = i10;
    }

    public String wqx() {
        return this.f18989cm;
    }

    public String cm() {
        return this.xyk;
    }

    public void jd() {
        ju juVar;
        if (this.f18989cm == null || (juVar = this.wqx) == null) {
            return;
        }
        com.bytedance.sdk.component.jd.jpo.cm cmVarJpo = juVar.jpo();
        synchronized (cmVarJpo) {
            try {
                for (com.bytedance.sdk.component.jd.jpo.jd jdVar : cmVarJpo.wqx()) {
                    if (this.f18989cm.equals(jdVar.jpo().jpo())) {
                        jdVar.wqx();
                    }
                }
                for (com.bytedance.sdk.component.jd.jpo.jd jdVar2 : cmVarJpo.cm()) {
                    if (this.f18989cm.equals(jdVar2.jpo().jpo())) {
                        jdVar2.wqx();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void jpo(Cif.jpo jpoVar) {
        if (jpoVar != null && this.f18991qk.size() > 0) {
            for (Map.Entry<String, String> entry : this.f18991qk.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    jpoVar.jd(key, value);
                }
            }
        }
    }
}
