package com.bytedance.sdk.component.my.wqx;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.my.Cif;
import com.bytedance.sdk.component.my.au;
import com.bytedance.sdk.component.my.nmd;
import com.bytedance.sdk.component.my.opi;
import com.bytedance.sdk.component.my.rq;
import com.bytedance.sdk.component.my.sq;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: jd, reason: collision with root package name */
    private final au f18898jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.my.cm f18899jj;

    /* renamed from: qk, reason: collision with root package name */
    private Cif f18900qk;
    private ExecutorService xyk;
    private Map<String, List<wqx>> jpo = new ConcurrentHashMap();
    private Map<String, sq> wqx = new HashMap();

    /* renamed from: cm, reason: collision with root package name */
    private Map<String, opi> f18897cm = new HashMap();
    private Map<String, com.bytedance.sdk.component.my.wqx> my = new HashMap();

    public jj(Context context, au auVar) {
        this.f18898jd = (au) qk.jpo(auVar);
        com.bytedance.sdk.component.my.wqx.jpo.jpo.jpo(context, auVar.xyk());
    }

    private sq cm(com.bytedance.sdk.component.my.jd jdVar) {
        sq sqVarMy = this.f18898jd.my();
        return sqVarMy != null ? com.bytedance.sdk.component.my.wqx.jpo.jd.jpo.jpo(sqVarMy) : com.bytedance.sdk.component.my.wqx.jpo.jd.jpo.jpo(jdVar.jd());
    }

    private com.bytedance.sdk.component.my.wqx jj(com.bytedance.sdk.component.my.jd jdVar) {
        com.bytedance.sdk.component.my.wqx wqxVarQk = this.f18898jd.qk();
        return wqxVarQk != null ? wqxVarQk : new com.bytedance.sdk.component.my.wqx.jpo.jpo.jd(jdVar.xyk(), jdVar.jpo(), qk());
    }

    private ExecutorService ju() {
        ExecutorService executorServiceJd = this.f18898jd.jd();
        return executorServiceJd != null ? executorServiceJd : com.bytedance.sdk.component.my.jpo.wqx.jpo();
    }

    private opi my(com.bytedance.sdk.component.my.jd jdVar) {
        opi opiVarJj = this.f18898jd.jj();
        return opiVarJj != null ? opiVarJj : com.bytedance.sdk.component.my.wqx.jpo.jd.my.jpo(jdVar.jd());
    }

    private Cif yd() {
        Cif cifJpo = this.f18898jd.jpo();
        return cifJpo != null ? cifJpo : com.bytedance.sdk.component.my.jpo.jd.jpo();
    }

    private com.bytedance.sdk.component.my.cm zz() {
        com.bytedance.sdk.component.my.cm cmVarCm = this.f18898jd.cm();
        return cmVarCm == null ? new com.bytedance.sdk.component.my.jd.jpo() : cmVarCm;
    }

    public Collection<opi> jd() {
        return this.f18897cm.values();
    }

    public Collection<sq> jpo() {
        return this.wqx.values();
    }

    public ExecutorService qk() {
        ExecutorService executorServiceJpo;
        nmd nmdVarWqx = this.f18898jd.wqx();
        if (nmdVarWqx != null && (executorServiceJpo = nmdVarWqx.jpo()) != null) {
            return executorServiceJpo;
        }
        if (this.xyk == null) {
            this.xyk = ju();
        }
        return this.xyk;
    }

    public Collection<com.bytedance.sdk.component.my.wqx> wqx() {
        return this.my.values();
    }

    public Map<String, List<wqx>> xyk() {
        return this.jpo;
    }

    public opi jd(com.bytedance.sdk.component.my.jd jdVar) {
        if (jdVar == null) {
            jdVar = com.bytedance.sdk.component.my.wqx.jpo.jpo.yd();
        }
        String string = jdVar.xyk().toString();
        opi opiVar = this.f18897cm.get(string);
        if (opiVar != null) {
            return opiVar;
        }
        opi opiVarMy = my(jdVar);
        this.f18897cm.put(string, opiVarMy);
        return opiVarMy;
    }

    public sq jpo(com.bytedance.sdk.component.my.jd jdVar) {
        if (jdVar == null) {
            jdVar = com.bytedance.sdk.component.my.wqx.jpo.jpo.yd();
        }
        String string = jdVar.xyk().toString();
        sq sqVar = this.wqx.get(string);
        if (sqVar != null) {
            return sqVar;
        }
        sq sqVarCm = cm(jdVar);
        this.wqx.put(string, sqVarCm);
        return sqVarCm;
    }

    public com.bytedance.sdk.component.my.wqx wqx(com.bytedance.sdk.component.my.jd jdVar) {
        if (jdVar == null) {
            jdVar = com.bytedance.sdk.component.my.wqx.jpo.jpo.yd();
        }
        String string = jdVar.xyk().toString();
        com.bytedance.sdk.component.my.wqx wqxVar = this.my.get(string);
        if (wqxVar != null) {
            return wqxVar;
        }
        com.bytedance.sdk.component.my.wqx wqxVarJj = jj(jdVar);
        this.my.put(string, wqxVarJj);
        return wqxVarJj;
    }

    public Cif jj() {
        if (this.f18900qk == null) {
            this.f18900qk = yd();
        }
        return this.f18900qk;
    }

    public rq my() {
        au auVar = this.f18898jd;
        if (auVar != null) {
            return auVar.zz();
        }
        return null;
    }

    public com.bytedance.sdk.component.my.cm cm() {
        if (this.f18899jj == null) {
            this.f18899jj = zz();
        }
        return this.f18899jj;
    }

    public com.bytedance.sdk.component.my.wqx jpo(String str) {
        return wqx(com.bytedance.sdk.component.my.wqx.jpo.jpo.jpo(new File(str)));
    }

    public com.bytedance.sdk.component.my.wqx.jd.jpo jpo(wqx wqxVar) {
        ImageView.ScaleType scaleTypeCm = wqxVar.cm();
        if (scaleTypeCm == null) {
            scaleTypeCm = com.bytedance.sdk.component.my.wqx.jd.jpo.jpo;
        }
        ImageView.ScaleType scaleType = scaleTypeCm;
        Bitmap.Config configJu = wqxVar.ju();
        if (configJu == null) {
            configJu = com.bytedance.sdk.component.my.wqx.jd.jpo.f18892jd;
        }
        return new com.bytedance.sdk.component.my.wqx.jd.jpo(wqxVar.jd(), wqxVar.wqx(), scaleType, configJu, wqxVar.jj(), wqxVar.qk());
    }
}
