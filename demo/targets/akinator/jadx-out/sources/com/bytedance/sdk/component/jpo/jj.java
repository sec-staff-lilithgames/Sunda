package com.bytedance.sdk.component.jpo;

import com.bytedance.sdk.component.jpo.wqx;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class jj {
    private final qk jpo;

    /* renamed from: qk, reason: collision with root package name */
    private final ju f18760qk;
    private final com.bytedance.sdk.component.jpo.jpo xyk;

    /* renamed from: jd, reason: collision with root package name */
    private final Map<String, jd> f18758jd = new HashMap();
    private final sq<String, opi> wqx = new sq<>();

    /* renamed from: cm, reason: collision with root package name */
    private final Map<String, wqx.jd> f18757cm = new HashMap();
    private final List<oya> my = new ArrayList();

    /* renamed from: jj, reason: collision with root package name */
    private final Set<wqx> f18759jj = new HashSet();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jpo {

        /* renamed from: jd, reason: collision with root package name */
        String f18762jd;
        boolean jpo;

        private jpo(boolean z10, String str) {
            this.jpo = z10;
            this.f18762jd = str;
        }
    }

    public jj(zz zzVar, com.bytedance.sdk.component.jpo.jpo jpoVar) {
        this.xyk = jpoVar;
        this.jpo = zzVar.f18786cm;
        this.f18760qk = zzVar.xyk;
    }

    public jpo jpo(oya oyaVar, my myVar) throws Exception {
        jd jdVar = this.f18758jd.get(oyaVar.f18771cm);
        if (jdVar != null) {
            try {
                if (jdVar instanceof cm) {
                    oyaVar.toString();
                    return jpo(oyaVar, (cm) jdVar, myVar);
                }
            } catch (IllegalStateException unused) {
                oyaVar.toString();
                this.my.add(oyaVar);
                return new jpo(false, jr.jpo());
            }
        }
        opi opiVarJpo = this.wqx.jpo(oyaVar.f18771cm);
        if (opiVarJpo != null) {
            oyaVar.toString();
            return jpo(oyaVar, opiVarJpo, myVar);
        }
        wqx.jd jdVar2 = this.f18757cm.get(oyaVar.f18771cm);
        if (jdVar2 == null) {
            oyaVar.toString();
            return null;
        }
        wqx wqxVarJpo = jdVar2.jpo();
        wqxVarJpo.jpo(oyaVar.f18771cm);
        oyaVar.toString();
        return jpo(oyaVar, wqxVarJpo, myVar);
    }

    public void jpo(String str, cm<?, ?> cmVar) {
        cmVar.jpo(str);
        this.f18758jd.put(str, cmVar);
    }

    public void jpo(Set<String> set, opi<?, ?> opiVar) {
        opiVar.jpo(set);
        this.wqx.jpo(set, opiVar);
        Objects.toString(set);
    }

    public void jpo(String str, wqx.jd jdVar) {
        this.f18757cm.put(str, jdVar);
    }

    public void jpo() {
        Iterator<wqx> it = this.f18759jj.iterator();
        while (it.hasNext()) {
            it.next().my();
        }
        this.f18759jj.clear();
        this.f18758jd.clear();
        this.f18757cm.clear();
        this.wqx.jpo();
    }

    private jpo jpo(oya oyaVar, cm cmVar, my myVar) throws Exception {
        return new jpo(true, jr.jpo(this.jpo.jpo((qk) cmVar.jpo(oyaVar.f18771cm, jpo(oyaVar.my, (jd) cmVar), myVar)), cmVar.jd()));
    }

    private jpo jpo(final oya oyaVar, final wqx wqxVar, my myVar) throws Exception {
        this.f18759jj.add(wqxVar);
        wqxVar.jpo(jpo(oyaVar.my, wqxVar), myVar, new wqx.jpo() { // from class: com.bytedance.sdk.component.jpo.jj.1
            @Override // com.bytedance.sdk.component.jpo.wqx.jpo
            public void jpo(Object obj) {
                if (jj.this.xyk == null) {
                    return;
                }
                jj.this.xyk.jd(jr.jpo(jj.this.jpo.jpo((qk) obj), wqxVar.jd()), oyaVar);
                jj.this.f18759jj.remove(wqxVar);
            }

            @Override // com.bytedance.sdk.component.jpo.wqx.jpo
            public void jpo(Throwable th2) {
                if (jj.this.xyk == null) {
                    return;
                }
                jj.this.xyk.jd(jr.jpo(th2), oyaVar);
                jj.this.f18759jj.remove(wqxVar);
            }
        });
        return new jpo(false, jr.jpo());
    }

    private Object jpo(String str, jd jdVar) throws JSONException {
        return this.jpo.jpo(str, jpo(jdVar)[0]);
    }

    private static Type[] jpo(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
