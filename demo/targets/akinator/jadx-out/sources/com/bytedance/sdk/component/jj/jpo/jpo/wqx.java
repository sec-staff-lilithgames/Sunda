package com.bytedance.sdk.component.jj.jpo.jpo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.qk;
import com.bytedance.sdk.component.jj.jpo.xyk;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements cm {

    /* renamed from: cm, reason: collision with root package name */
    private qk f18727cm;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f70if;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jpo f18728jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.my f18729jj;
    private com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.cm jpo;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18730ju;
    private com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jj my;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18731qk;
    private com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jd wqx;
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18732yd;
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo zz;

    public wqx() {
        Context contextJj = xyk.qk().jj();
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo()) {
            this.f18731qk = xyk.qk().m417if();
            this.jpo = new com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.cm(contextJj, this.f18731qk);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.my()) {
            if (xyk.qk().yd() != null) {
                this.zz = xyk.qk().yd();
            } else {
                this.zz = xyk.qk().au();
            }
            this.wqx = new com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jd(contextJj, this.zz);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jd()) {
            this.xyk = xyk.qk().au();
            this.f18728jd = new com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jpo(contextJj, this.xyk);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx()) {
            this.f18732yd = xyk.qk().au();
            this.f18727cm = new qk(contextJj, this.f18732yd);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.cm()) {
            this.f18730ju = xyk.qk().oya();
            this.my = new com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jj(contextJj, this.f18730ju);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jj()) {
            this.f70if = xyk.qk().prr();
            this.f18729jj = new com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.my(contextJj, this.f70if);
        }
    }

    public List<com.bytedance.sdk.component.jj.jpo.cm.jpo> jd(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, int i10) {
        if (jpoVar.cm() == 0 && jpoVar.my() == 1 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo()) {
            if (this.f18731qk.jd() <= i10) {
                return null;
            }
            List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo = this.jpo.jpo(this.f18731qk.jd() - i10, "_id");
            if (listJpo != null && listJpo.size() != 0) {
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.hx(), 1);
            }
            return listJpo;
        }
        if (jpoVar.cm() == 3 && jpoVar.my() == 2 && com.bytedance.sdk.component.jj.jpo.jd.jpo.my()) {
            if (this.zz.jd() > i10) {
                return this.wqx.jpo(this.zz.jd() - i10, "_id");
            }
        } else if (jpoVar.cm() == 0 && jpoVar.my() == 2 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jd()) {
            if (this.xyk.jd() > i10) {
                List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo2 = this.f18728jd.jpo(this.xyk.jd() - i10, "_id");
                if (listJpo2 != null && listJpo2.size() != 0) {
                    com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.pdm(), 1);
                }
                return listJpo2;
            }
        } else if (jpoVar.cm() == 1 && jpoVar.my() == 2 && com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx()) {
            if (this.f18732yd.jd() > i10) {
                List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo3 = this.f18727cm.jpo(this.f18732yd.jd() - i10, "_id");
                if (listJpo3 != null && listJpo3.size() != 0) {
                    com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.rv(), 1);
                }
                return listJpo3;
            }
        } else if (jpoVar.cm() == 1 && jpoVar.my() == 3 && com.bytedance.sdk.component.jj.jpo.jd.jpo.cm()) {
            if (this.f18730ju.jd() > i10) {
                List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo4 = this.my.jpo(this.f18730ju.jd() - i10, "_id");
                if (listJpo4 != null && listJpo4.size() != 0) {
                    com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.uu(), 1);
                }
                return listJpo4;
            }
        } else if (jpoVar.cm() == 2 && jpoVar.my() == 3 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jj() && this.f70if.jd() > i10) {
            return this.f18729jj.jpo(this.f70if.jd() - i10, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, int i10) {
        if (jpoVar == null) {
            return;
        }
        try {
            jpoVar.jd(System.currentTimeMillis());
            if (jpoVar.cm() == 0 && jpoVar.my() == 1) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo()) {
                    this.jpo.jpo(jpoVar);
                    return;
                }
                return;
            }
            if (jpoVar.cm() == 3 && jpoVar.my() == 2) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.my()) {
                    this.wqx.jpo(jpoVar);
                    return;
                }
                return;
            }
            if (jpoVar.cm() == 0 && jpoVar.my() == 2) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jd()) {
                    this.f18728jd.jpo(jpoVar);
                    return;
                }
                return;
            }
            if (jpoVar.cm() == 1 && jpoVar.my() == 2) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx()) {
                    this.f18727cm.jpo(jpoVar);
                }
            } else if (jpoVar.cm() == 1 && jpoVar.my() == 3) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.cm()) {
                    this.my.jpo(jpoVar);
                }
            } else if (jpoVar.cm() == 2 && jpoVar.my() == 3 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jj()) {
                this.f18729jj.jpo(jpoVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.ef(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public void jpo(int i10, List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar = list.get(0);
        if (i10 == 200 || i10 == -1) {
            com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo jpoVar2 = com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm;
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar2.jkt(), list.size());
            if (i10 != 200) {
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(jpoVar2.hks(), list.size());
            }
            if (jpoVar.cm() == 0 && jpoVar.my() == 1) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo()) {
                    this.jpo.jd(list);
                    return;
                }
                return;
            }
            if (jpoVar.cm() == 3 && jpoVar.my() == 2) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.my()) {
                    this.wqx.jd(list);
                    return;
                }
                return;
            }
            if (jpoVar.cm() == 0 && jpoVar.my() == 2) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jd()) {
                    this.f18728jd.jd(list);
                    return;
                }
                return;
            }
            if (jpoVar.cm() == 1 && jpoVar.my() == 2) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx()) {
                    this.f18727cm.jd(list);
                }
            } else if (jpoVar.cm() == 1 && jpoVar.my() == 3) {
                if (com.bytedance.sdk.component.jj.jpo.jd.jpo.cm()) {
                    this.my.jd(list);
                }
            } else if (jpoVar.cm() == 2 && jpoVar.my() == 3 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jj()) {
                this.f18729jj.jd(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public List<com.bytedance.sdk.component.jj.jpo.cm.jpo> jpo(int i10, int i11, List<String> list) {
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo()) {
            List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo = this.jpo.jpo("_id");
            if (jpo(listJpo, list)) {
                listJpo.size();
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.dt(), 1);
                return listJpo;
            }
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.my()) {
            List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo2 = this.wqx.jpo("_id");
            if (jpo(listJpo2, list)) {
                listJpo2.size();
                return listJpo2;
            }
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jd()) {
            List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo3 = this.f18728jd.jpo("_id");
            if (jpo(listJpo3, list)) {
                listJpo3.size();
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.hmu(), 1);
                return listJpo3;
            }
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx()) {
            List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJd = this.f18727cm.jd("_id");
            if (jpo(listJd, list)) {
                listJd.size();
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.nq(), 1);
                return listJd;
            }
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.cm()) {
            List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJd2 = this.my.jd("_id");
            if (jpo(listJd2, list)) {
                listJd2.size();
                com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.se(), 1);
                return listJd2;
            }
        }
        if (!com.bytedance.sdk.component.jj.jpo.jd.jpo.jj()) {
            return null;
        }
        List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJd3 = this.f18729jj.jd("_id");
        if (!jpo(listJd3, list)) {
            return null;
        }
        listJd3.size();
        return listJd3;
    }

    private boolean jpo(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.jj.jpo.cm.jpo> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.jj.jpo.cm.jpo next = it.next();
                    if (next != null) {
                        String strWqx = next.wqx();
                        if (!TextUtils.isEmpty(strWqx) && list2.contains(strWqx)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public boolean jpo(int i10, boolean z10) {
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.my myVar;
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jj jjVar;
        qk qkVar;
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jpo jpoVar;
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jd jdVar;
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.cm cmVar;
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo() && (cmVar = this.jpo) != null && cmVar.jpo(i10)) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.oya(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.my() && (jdVar = this.wqx) != null && jdVar.jpo(i10)) {
            return true;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jd() && (jpoVar = this.f18728jd) != null && jpoVar.jpo(i10)) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.prr(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx() && (qkVar = this.f18727cm) != null && qkVar.jpo(i10)) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.hna(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.jj.jpo.jd.jpo.cm() || (jjVar = this.my) == null || !jjVar.jpo(i10)) {
            return com.bytedance.sdk.component.jj.jpo.jd.jpo.jj() && (myVar = this.f18729jj) != null && myVar.jpo(i10);
        }
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.sq(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public void jpo(int i10, long j10) {
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.cm cmVar = this.jpo;
        if (cmVar != null) {
            cmVar.jpo(i10, j10);
        }
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jd jdVar = this.wqx;
        if (jdVar != null) {
            jdVar.jpo(i10, j10);
        }
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jpo jpoVar = this.f18728jd;
        if (jpoVar != null) {
            jpoVar.jpo(i10, j10);
        }
        qk qkVar = this.f18727cm;
        if (qkVar != null) {
            qkVar.jpo(i10, j10);
        }
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jj jjVar = this.my;
        if (jjVar != null) {
            jjVar.jpo(i10, j10);
        }
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.my myVar = this.f18729jj;
        if (myVar != null) {
            myVar.jpo(i10, j10);
        }
    }
}
