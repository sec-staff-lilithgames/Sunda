package com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.xyk;
import com.bytedance.sdk.component.utils.nmd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class wqx {
    private static int wqx = 20;
    private final Context jpo;
    private boolean my;
    private boolean xyk;

    /* renamed from: jd, reason: collision with root package name */
    protected final List<com.bytedance.sdk.component.jj.jpo.cm.jpo> f18722jd = new ArrayList();

    /* renamed from: cm, reason: collision with root package name */
    private final List<com.bytedance.sdk.component.jj.jpo.cm.jpo> f18721cm = new ArrayList();

    /* renamed from: jj, reason: collision with root package name */
    private boolean f18723jj = false;

    /* renamed from: qk, reason: collision with root package name */
    private volatile boolean f18724qk = false;
    private final Runnable zz = new Runnable() { // from class: com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.wqx.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (wqx.this) {
                try {
                    wqx.this.f18724qk = false;
                    if (wqx.this.f18722jd.isEmpty()) {
                        wqx.this.f18723jj = false;
                        return;
                    }
                    if (wqx.this.my) {
                        Iterator<com.bytedance.sdk.component.jj.jpo.cm.jpo> it = wqx.this.f18722jd.iterator();
                        while (it.hasNext()) {
                            wqx.this.f18721cm.add(it.next());
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(wqx.this.f18722jd);
                    }
                    wqx.this.f18722jd.clear();
                    wqx.this.f18723jj = false;
                    if (arrayList != null) {
                        wqx.this.cm(arrayList);
                        return;
                    }
                    wqx wqxVar = wqx.this;
                    wqxVar.cm(wqxVar.f18721cm);
                    wqx.this.f18721cm.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    public wqx(Context context) {
        this.xyk = true;
        this.jpo = context;
        try {
            com.bytedance.sdk.component.jj.jpo.my myVarHna = xyk.qk().hna();
            if (myVarHna != null) {
                this.xyk = myVarHna.hna();
                this.my = myVarHna.sq();
                wqx = myVarHna.opi();
            }
            nmd.jpo("DBInsertMemRepo", "enableOpt:" + this.xyk + ",BATCH_SIZE:" + wqx, Boolean.valueOf(this.my));
        } catch (Throwable unused) {
        }
    }

    public void cm(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), jd(), list);
    }

    public abstract String jd();

    public long jj() {
        return 10000L;
    }

    public Context my() {
        return this.jpo;
    }

    public synchronized void wqx(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.jj.jpo.cm.jpo> it = this.f18722jd.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.jj.jpo.cm.jpo next = it.next();
                        if (next != null) {
                            String strWqx = next.wqx();
                            if (!TextUtils.isEmpty(strWqx) && list.contains(strWqx)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    jd();
                    th2.getMessage();
                }
            }
        }
    }

    private void jpo() {
        if (!this.f18723jj) {
            com.bytedance.sdk.component.jj.jpo.qk.jpo.jpo().postDelayed(this.zz, this.my ? jj() : com.bytedance.sdk.component.jj.jpo.qk.jpo.jd());
            this.f18723jj = true;
        }
        if (this.xyk && this.f18722jd.size() >= wqx && !this.f18724qk) {
            com.bytedance.sdk.component.jj.jpo.qk.jpo.jpo().removeCallbacks(this.zz);
            com.bytedance.sdk.component.jj.jpo.qk.jpo.jpo().post(this.zz);
            this.f18723jj = true;
            this.f18724qk = true;
        }
    }

    public synchronized void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar) {
        if (jpoVar.qk() != null && !TextUtils.isEmpty(jpoVar.wqx())) {
            this.f18722jd.add(jpoVar);
            jpo();
        }
    }
}
