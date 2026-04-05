package com.bytedance.sdk.component.my.cm.wqx;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.my.au;
import com.bytedance.sdk.component.my.nmd;
import com.bytedance.sdk.component.my.opi;
import com.bytedance.sdk.component.my.rq;
import com.bytedance.sdk.component.my.sq;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: cm, reason: collision with root package name */
    private volatile opi f18812cm;

    /* renamed from: jd, reason: collision with root package name */
    private final au f18813jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.my.cm f18814jj;
    private Map<String, List<wqx>> jpo = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.my.wqx> my = new ConcurrentHashMap();

    /* renamed from: qk, reason: collision with root package name */
    private ExecutorService f18815qk;
    private volatile sq wqx;
    private ExecutorService xyk;
    private Context zz;

    public jj(Context context, au auVar) {
        this.f18813jd = (au) qk.jpo(auVar);
        this.zz = context;
        com.bytedance.sdk.component.my.cm.wqx.jpo.jd.jpo(context, auVar.xyk());
    }

    private com.bytedance.sdk.component.my.wqx cm(com.bytedance.sdk.component.my.jd jdVar) {
        com.bytedance.sdk.component.my.wqx wqxVarQk = this.f18813jd.qk();
        return wqxVarQk != null ? wqxVarQk : new com.bytedance.sdk.component.my.cm.wqx.jpo.jpo.jd(jdVar.xyk(), jdVar.jpo());
    }

    private ExecutorService ju() {
        ExecutorService executorServiceJd = this.f18813jd.jd();
        return executorServiceJd != null ? executorServiceJd : com.bytedance.sdk.component.my.cm.jpo.jd.jpo();
    }

    private com.bytedance.sdk.component.my.cm yd() {
        com.bytedance.sdk.component.my.cm cmVarCm = this.f18813jd.cm();
        return cmVarCm == null ? new com.bytedance.sdk.component.my.jd.jpo() : cmVarCm;
    }

    public opi jd() {
        return this.f18812cm;
    }

    public rq jj() {
        au auVar = this.f18813jd;
        if (auVar != null) {
            return auVar.zz();
        }
        return null;
    }

    public Context jpo() {
        return this.zz;
    }

    public ExecutorService my() {
        ExecutorService executorServiceJpo;
        nmd nmdVarWqx = this.f18813jd.wqx();
        if (nmdVarWqx != null && (executorServiceJpo = nmdVarWqx.jpo()) != null) {
            return executorServiceJpo;
        }
        if (this.f18815qk == null) {
            this.f18815qk = ju();
        }
        return this.f18815qk;
    }

    public boolean qk() {
        au auVar = this.f18813jd;
        if (auVar != null) {
            return auVar.yd();
        }
        return false;
    }

    public Collection<com.bytedance.sdk.component.my.wqx> wqx() {
        return this.my.values();
    }

    public ExecutorService xyk() {
        ExecutorService executorServiceJd;
        nmd nmdVarWqx = this.f18813jd.wqx();
        if (nmdVarWqx != null && (executorServiceJd = nmdVarWqx.jd()) != null) {
            return executorServiceJd;
        }
        if (this.xyk == null) {
            this.xyk = com.bytedance.sdk.component.my.cm.jpo.jd.jpo();
        }
        return this.xyk;
    }

    public Map<String, List<wqx>> zz() {
        return this.jpo;
    }

    public opi jd(com.bytedance.sdk.component.my.jd jdVar) {
        if (jdVar == null) {
            jdVar = com.bytedance.sdk.component.my.cm.wqx.jpo.jd.yd();
        }
        if (this.f18812cm == null) {
            synchronized (com.bytedance.sdk.component.my.cm.wqx.jpo.jd.jd.class) {
                try {
                    if (this.f18812cm == null) {
                        this.f18812cm = new com.bytedance.sdk.component.my.cm.wqx.jpo.jd.jd(jdVar.jd(), jdVar.cm());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f18812cm;
    }

    public sq jpo(com.bytedance.sdk.component.my.jd jdVar) {
        if (jdVar == null) {
            jdVar = com.bytedance.sdk.component.my.cm.wqx.jpo.jd.yd();
        }
        if (this.wqx == null) {
            synchronized (com.bytedance.sdk.component.my.cm.wqx.jpo.jd.wqx.class) {
                try {
                    if (this.wqx == null) {
                        this.wqx = new com.bytedance.sdk.component.my.cm.wqx.jpo.jd.wqx(new com.bytedance.sdk.component.my.cm.wqx.jpo.jd.jpo(jdVar.jd(), jdVar.wqx()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.wqx;
    }

    public com.bytedance.sdk.component.my.wqx wqx(com.bytedance.sdk.component.my.jd jdVar) {
        if (jdVar == null) {
            jdVar = com.bytedance.sdk.component.my.cm.wqx.jpo.jd.yd();
        }
        String string = jdVar.xyk().toString();
        com.bytedance.sdk.component.my.wqx wqxVar = this.my.get(string);
        if (wqxVar != null) {
            return wqxVar;
        }
        com.bytedance.sdk.component.my.wqx wqxVarCm = cm(jdVar);
        this.my.put(string, wqxVarCm);
        return wqxVarCm;
    }

    public com.bytedance.sdk.component.my.cm cm() {
        if (this.f18814jj == null) {
            this.f18814jj = yd();
        }
        return this.f18814jj;
    }

    public com.bytedance.sdk.component.my.wqx jpo(String str) {
        return wqx(com.bytedance.sdk.component.my.cm.wqx.jpo.jd.jpo(new File(str)));
    }

    public com.bytedance.sdk.component.my.cm.wqx.jd.jd jpo(wqx wqxVar) {
        ImageView.ScaleType scaleTypeCm = wqxVar.cm();
        if (scaleTypeCm == null) {
            scaleTypeCm = com.bytedance.sdk.component.my.cm.wqx.jd.jd.jpo;
        }
        ImageView.ScaleType scaleType = scaleTypeCm;
        Bitmap.Config configJu = wqxVar.ju();
        if (configJu == null) {
            configJu = com.bytedance.sdk.component.my.cm.wqx.jd.jd.f18805jd;
        }
        return new com.bytedance.sdk.component.my.cm.wqx.jd.jd(wqxVar.jd(), wqxVar.wqx(), scaleType, configJu, wqxVar.jj(), wqxVar.qk());
    }
}
