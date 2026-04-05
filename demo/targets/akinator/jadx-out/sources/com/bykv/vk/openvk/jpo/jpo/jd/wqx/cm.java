package com.bykv.vk.openvk.jpo.jpo.jd.wqx;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx;
import com.bykv.vk.openvk.jpo.jpo.jpo.jpo;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.zz;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements wqx.cm, wqx.jd, wqx.jj, wqx.jpo, wqx.my, wqx.qk, wqx.InterfaceC0051wqx, com.bykv.vk.openvk.jpo.jpo.jpo.jpo, hx.jpo {
    private static final SparseIntArray jpo = new SparseIntArray();

    /* renamed from: au, reason: collision with root package name */
    private boolean f16702au;

    /* renamed from: dt, reason: collision with root package name */
    private boolean f16705dt;
    private ArrayList<Runnable> hmu;
    private hx hna;

    /* renamed from: hx, reason: collision with root package name */
    private boolean f16707hx;

    /* renamed from: if, reason: not valid java name */
    private boolean f1if;

    /* renamed from: jj, reason: collision with root package name */
    private SurfaceHolder f16709jj;
    private SurfaceTexture my;
    private volatile boolean nzb;

    /* renamed from: jd, reason: collision with root package name */
    private final boolean f16708jd = false;
    private final List<WeakReference<jpo.InterfaceC0053jpo>> wqx = new CopyOnWriteArrayList();

    /* renamed from: cm, reason: collision with root package name */
    private final jpo f16703cm = new jpo();

    /* renamed from: qk, reason: collision with root package name */
    private int f16713qk = 0;
    private int xyk = 3;
    private boolean zz = false;

    /* renamed from: yd, reason: collision with root package name */
    private volatile wqx f16721yd = null;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f16711ju = false;
    private volatile int oya = 201;
    private long prr = -1;

    /* renamed from: sq, reason: collision with root package name */
    private boolean f16717sq = false;
    private long opi = 0;

    /* renamed from: jr, reason: collision with root package name */
    private long f16710jr = Long.MIN_VALUE;
    private long nmd = 0;

    /* renamed from: rq, reason: collision with root package name */
    private long f16714rq = 0;

    /* renamed from: tu, reason: collision with root package name */
    private long f16718tu = 0;

    /* renamed from: nq, reason: collision with root package name */
    private int f16712nq = 0;

    /* renamed from: se, reason: collision with root package name */
    private String f16716se = "0";
    private com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx pdm = null;

    /* renamed from: rv, reason: collision with root package name */
    private boolean f16715rv = false;

    /* renamed from: uu, reason: collision with root package name */
    private CountDownLatch f16719uu = new CountDownLatch(1);
    private volatile int sz = 200;
    private AtomicBoolean kln = new AtomicBoolean(false);

    /* renamed from: ef, reason: collision with root package name */
    private Surface f16706ef = null;
    private long duq = 0;

    /* renamed from: dm, reason: collision with root package name */
    private long f16704dm = 0;
    private boolean tic = false;

    /* renamed from: va, reason: collision with root package name */
    private final Runnable f16720va = new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.1
        @Override // java.lang.Runnable
        public void run() {
            if (cm.this.f16721yd == null) {
                return;
            }
            long jSq = cm.this.sq();
            if (jSq > 0 && cm.this.jj() && cm.this.f16710jr != Long.MIN_VALUE) {
                try {
                    if (cm.this.f16710jr == jSq) {
                        if (!cm.this.f16717sq && cm.this.nmd >= 400) {
                            cm.this.jd(701, 800);
                            cm.this.f16717sq = true;
                        }
                        cm.this.nmd += cm.this.sz;
                    } else {
                        if (cm.this.f16717sq) {
                            cm.this.opi += cm.this.nmd;
                            cm.this.jd(702, 800);
                            long unused = cm.this.opi;
                            int unused2 = cm.this.f16713qk;
                        }
                        cm.this.nmd = 0L;
                        cm.this.f16717sq = false;
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
            if (cm.this.hna() > 0) {
                if (cm.this.f16710jr != jSq) {
                    if (com.bykv.vk.openvk.jpo.jpo.jpo.wqx.my()) {
                        long unused3 = cm.this.f16710jr;
                    }
                    cm cmVar = cm.this;
                    cmVar.jpo(jSq, cmVar.hna());
                }
                cm.this.f16710jr = jSq;
            }
            if (cm.this.jd()) {
                cm cmVar2 = cm.this;
                cmVar2.jpo(cmVar2.hna(), cm.this.hna());
            } else if (cm.this.hna != null) {
                cm.this.hna.postDelayed(this, cm.this.sz);
            }
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo implements Runnable {

        /* renamed from: jd, reason: collision with root package name */
        private long f16728jd;
        private boolean wqx;

        public jpo() {
        }

        public void jpo(boolean z10) {
            this.wqx = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (cm.this.f16721yd != null) {
                try {
                    if (!this.wqx) {
                        long jYd = cm.this.f16721yd.yd();
                        cm.this.prr = Math.max(this.f16728jd, jYd);
                    }
                    long unused = cm.this.prr;
                } catch (Throwable th2) {
                    th2.toString();
                }
            }
            if (cm.this.hna != null) {
                cm.this.hna.sendEmptyMessageDelayed(100, 0L);
            }
        }

        public void jpo(long j10) {
            this.f16728jd = j10;
        }
    }

    public cm() {
        jpo("SSMediaPlayerWrapper");
    }

    private void dt() {
        if (this.f16721yd == null) {
            return;
        }
        try {
            this.f16721yd.au();
        } catch (Throwable unused) {
        }
        this.f16721yd.jpo((wqx.jd) null);
        this.f16721yd.jpo((wqx.qk) null);
        this.f16721yd.jpo((wqx.jpo) null);
        this.f16721yd.jpo((wqx.cm) null);
        this.f16721yd.jpo((wqx.InterfaceC0051wqx) null);
        this.f16721yd.jpo((wqx.my) null);
        this.f16721yd.jpo((wqx.jj) null);
        try {
            this.f16721yd.mo373if();
        } catch (Throwable unused2) {
        }
    }

    private void hmu() {
        hx hxVar = this.hna;
        if (hxVar == null || hxVar.getLooper() == null) {
            return;
        }
        try {
            this.hna.post(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.6
                @Override // java.lang.Runnable
                public void run() {
                    if (cm.this.hna == null || cm.this.hna.getLooper() == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.component.xyk.jpo.jpo.jpo().jpo(cm.this.hna);
                        cm.this.hna = null;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void hx() {
        hx hxVar = this.hna;
        if (hxVar != null) {
            hxVar.post(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        cm.this.f16721yd.xyk();
                        cm.this.oya = 207;
                        cm.this.nzb = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private boolean jpo(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    private void nmd() {
        this.opi = 0L;
        this.f16713qk = 0;
        this.nmd = 0L;
        this.f16717sq = false;
        this.f16710jr = Long.MIN_VALUE;
    }

    private void nq() {
        SparseIntArray sparseIntArray = jpo;
        sparseIntArray.put(this.f16712nq, sparseIntArray.get(this.f16712nq) + 1);
    }

    private void pdm() {
        if (this.f1if) {
            return;
        }
        this.f1if = true;
        Iterator it = new ArrayList(this.hmu).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.hmu.clear();
        this.f1if = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rq() {
        hx hxVar = this.hna;
        if (hxVar != null) {
            hxVar.post(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.10
                @Override // java.lang.Runnable
                public void run() {
                    if (cm.this.f16721yd == null) {
                        try {
                            cm.this.f16721yd = new jd();
                        } catch (Throwable th2) {
                            th2.getMessage();
                        }
                        if (cm.this.f16721yd == null) {
                            return;
                        }
                        wqx unused = cm.this.f16721yd;
                        cm.this.f16716se = "0";
                        cm.this.f16721yd.jpo((wqx.my) cm.this);
                        cm.this.f16721yd.jpo((wqx.jd) cm.this);
                        cm.this.f16721yd.jpo((wqx.InterfaceC0051wqx) cm.this);
                        cm.this.f16721yd.jpo((wqx.jpo) cm.this);
                        cm.this.f16721yd.jpo((wqx.jj) cm.this);
                        cm.this.f16721yd.jpo((wqx.cm) cm.this);
                        cm.this.f16721yd.jpo((wqx.qk) cm.this);
                        try {
                            cm.this.f16721yd.wqx(false);
                        } catch (Throwable unused2) {
                        }
                        cm.this.f16711ju = false;
                    }
                }
            });
        }
    }

    private void rv() {
        ArrayList<Runnable> arrayList = this.hmu;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        pdm();
    }

    private void se() {
        this.zz = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f16718tu;
        for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().jpo(this, jElapsedRealtime);
            }
        }
    }

    private void tu() {
        jd(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.14
            @Override // java.lang.Runnable
            public void run() {
                if (cm.this.hna != null) {
                    cm.this.hna.sendEmptyMessage(104);
                }
            }
        });
    }

    private void uu() {
        ArrayList<Runnable> arrayList = this.hmu;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.hmu.clear();
    }

    public boolean au() {
        return this.oya == 205;
    }

    public long hna() {
        long j10 = this.f16714rq;
        if (j10 != 0) {
            return j10;
        }
        if (this.oya == 206 || this.oya == 207) {
            try {
                this.f16714rq = this.f16721yd.ju();
            } catch (Throwable unused) {
            }
        }
        return this.f16714rq;
    }

    /* renamed from: if, reason: not valid java name */
    public void m372if() {
        if (xyk()) {
            return;
        }
        this.f16702au = true;
        uu();
        hx hxVar = this.hna;
        if (hxVar != null) {
            try {
                hxVar.removeCallbacksAndMessages(null);
                if (this.f16721yd != null) {
                    this.hna.sendEmptyMessage(103);
                }
                hmu();
            } catch (Throwable unused) {
                hmu();
            }
        }
    }

    public SurfaceTexture jr() {
        return this.my;
    }

    public SurfaceHolder opi() {
        return this.f16709jj;
    }

    public long oya() {
        if (this.f16717sq) {
            long j10 = this.nmd;
            if (j10 > 0) {
                return this.opi + j10;
            }
        }
        return this.opi;
    }

    public int prr() {
        return this.f16713qk;
    }

    public long sq() {
        if (xyk()) {
            return 0L;
        }
        if (this.oya == 206 || this.oya == 207) {
            try {
                return this.f16721yd.yd();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
    public boolean jj() {
        hx hxVar;
        return (this.oya == 206 || ((hxVar = this.hna) != null && hxVar.hasMessages(100))) && !this.nzb;
    }

    public void ju() {
        hx hxVar;
        if (xyk() || (hxVar = this.hna) == null) {
            return;
        }
        hxVar.removeMessages(100);
        this.nzb = true;
        if (this.tic) {
            if (!this.zz && !jd(this.pdm)) {
                jpo(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (cm.this.hna != null) {
                            cm.this.hna.sendEmptyMessage(101);
                        }
                    }
                });
                return;
            }
            hx hxVar2 = this.hna;
            if (hxVar2 != null) {
                hxVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.f16705dt && !jd(this.pdm)) {
            jpo(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.12
                @Override // java.lang.Runnable
                public void run() {
                    if (cm.this.hna != null) {
                        cm.this.hna.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        hx hxVar3 = this.hna;
        if (hxVar3 != null) {
            hxVar3.sendEmptyMessage(101);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
    public int my() {
        if (this.f16721yd == null || xyk()) {
            return 0;
        }
        return this.f16721yd.prr();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
    public boolean qk() {
        hx hxVar;
        return ((this.oya != 207 && !this.nzb) || (hxVar = this.hna) == null || hxVar.hasMessages(100)) ? false : true;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
    public boolean xyk() {
        return this.f16702au;
    }

    public void yd() {
        if (xyk() || this.hna == null) {
            return;
        }
        this.kln.set(true);
        this.hna.post(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.11
            @Override // java.lang.Runnable
            public void run() {
                if (!cm.this.qk() || cm.this.f16721yd == null) {
                    return;
                }
                try {
                    cm.this.f16721yd.jj();
                    for (WeakReference weakReference : cm.this.wqx) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((jpo.InterfaceC0053jpo) weakReference.get()).my(cm.this);
                        }
                    }
                    cm.this.oya = 206;
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        });
    }

    public void zz() {
        if (xyk() || this.f16721yd == null) {
            return;
        }
        this.kln.set(true);
        if (this.oya != 206) {
            nmd();
            this.nzb = false;
            this.f16703cm.jpo(true);
            jd(0L);
            hx hxVar = this.hna;
            if (hxVar != null) {
                hxVar.removeCallbacks(this.f16720va);
                this.hna.postDelayed(this.f16720va, this.sz);
            }
        }
        this.f16719uu.countDown();
    }

    private void jd(long j10) {
        this.f16703cm.jpo(j10);
        if (this.f16707hx) {
            jd(this.f16703cm);
        } else if (jd(this.pdm)) {
            jd(this.f16703cm);
        } else {
            jpo(this.f16703cm);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
    public int cm() {
        if (this.f16721yd == null || xyk()) {
            return 0;
        }
        return this.f16721yd.oya();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
    public boolean wqx() {
        return au() || jj() || qk();
    }

    private void wqx(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) throws Throwable {
        wqxVar.hna();
        this.f16721yd.jpo(wqxVar);
        wqxVar.hna();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx.jj
    public void wqx(wqx wqxVar) {
        for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().jpo((com.bykv.vk.openvk.jpo.jpo.jpo.jpo) this, true);
            }
        }
    }

    private boolean jd(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        return wqxVar != null && wqxVar.qk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(long j10, long j11) {
        long j12;
        long j13;
        for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
            if (weakReference == null || weakReference.get() == null) {
                j12 = j10;
                j13 = j11;
            } else {
                j12 = j10;
                j13 = j11;
                weakReference.get().jpo(this, j12, j13);
            }
            j10 = j12;
            j11 = j13;
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
    public boolean jd() {
        return this.oya == 209;
    }

    private void jd(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, File file) {
        try {
            String strJpo = com.bykv.vk.openvk.jpo.jpo.jpo.qk.jpo.jpo(file);
            if (wqxVar.sq().equals(strJpo)) {
                jpo(file);
                return;
            }
            JSONObject jSONObjectWqx = wqxVar.wqx();
            boolean zJd = wqxVar.jd();
            if (jSONObjectWqx != null) {
                jSONObjectWqx.put("file_hash", wqxVar.sq());
                jSONObjectWqx.put("file_real_hash", strJpo);
                jSONObjectWqx.put("is_change_play_type", zJd ? 1 : 0);
                jSONObjectWqx.put("error_real_code", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);
                jSONObjectWqx.put("error_real_msg", "md5_not_match");
            }
            if (zJd) {
                boolean zDelete = file.delete();
                if (jSONObjectWqx != null) {
                    jSONObjectWqx.put("delete_cache_file", zDelete ? 1 : 0);
                }
                if (zDelete) {
                    wqx(wqxVar);
                    return;
                }
            }
            jpo(file);
        } catch (Throwable unused) {
        }
    }

    private void jpo(String str) {
        this.f16712nq = 0;
        this.hna = com.bytedance.sdk.component.xyk.jpo.jpo.jpo().jpo(this, zz.THREAD_NAME_PRE.concat(String.valueOf(str)));
        this.tic = true;
        rq();
    }

    public void jpo(final boolean z10) {
        if (xyk()) {
            return;
        }
        this.f16707hx = z10;
        if (this.f16721yd != null) {
            this.f16721yd.jpo(z10);
            return;
        }
        hx hxVar = this.hna;
        if (hxVar != null) {
            hxVar.post(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.9
                @Override // java.lang.Runnable
                public void run() {
                    if (cm.this.f16721yd != null) {
                        cm.this.f16721yd.jpo(z10);
                    }
                }
            });
        }
    }

    public void jpo(boolean z10, long j10, boolean z11) {
        if (xyk()) {
            return;
        }
        rq();
        this.f16715rv = z11;
        this.kln.set(true);
        this.nzb = false;
        jd(z11);
        if (z10) {
            this.prr = j10;
            tu();
        } else {
            jd(j10);
        }
        hx hxVar = this.hna;
        if (hxVar != null) {
            hxVar.removeCallbacks(this.f16720va);
            this.hna.postDelayed(this.f16720va, this.sz);
        }
        this.f16719uu.countDown();
    }

    private void jd(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.f16721yd.jpo(fileInputStream.getFD());
        fileInputStream.close();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx.cm
    public boolean jd(wqx wqxVar, int i10, int i11) {
        if (this.f16721yd != wqxVar) {
            return false;
        }
        if (i11 == -1004) {
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo jpoVar = new com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(i10, i11);
            for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().jpo(this, jpoVar);
                }
            }
        }
        jd(i10, i11);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(int i10, int i11) {
        if (i10 == 701) {
            this.duq = SystemClock.elapsedRealtime();
            this.f16713qk++;
            for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().jpo(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i10 == 702) {
            if (this.duq > 0) {
                this.f16704dm = (SystemClock.elapsedRealtime() - this.duq) + this.f16704dm;
                this.duq = 0L;
            }
            for (WeakReference<jpo.InterfaceC0053jpo> weakReference2 : this.wqx) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().jpo((com.bykv.vk.openvk.jpo.jpo.jpo.jpo) this, Integer.MAX_VALUE);
                }
            }
            return;
        }
        if (this.tic && i10 == 3) {
            rv();
            se();
            jd(this.f16715rv);
        }
    }

    public void jpo(final long j10) {
        if (xyk()) {
            return;
        }
        if (this.oya == 207 || this.oya == 206 || this.oya == 209) {
            jd(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.2
                @Override // java.lang.Runnable
                public void run() {
                    if (cm.this.hna != null) {
                        cm.this.hna.obtainMessage(106, Long.valueOf(j10)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
    public boolean jpo() {
        return this.zz;
    }

    public void jpo(final SurfaceTexture surfaceTexture) {
        if (xyk()) {
            return;
        }
        this.my = surfaceTexture;
        jpo(true);
        jd(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.3
            @Override // java.lang.Runnable
            public void run() {
                cm.this.rq();
                if (cm.this.hna != null) {
                    cm.this.hna.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void jpo(final SurfaceHolder surfaceHolder) {
        if (xyk()) {
            return;
        }
        this.f16709jj = surfaceHolder;
        jpo(true);
        jd(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.4
            @Override // java.lang.Runnable
            public void run() {
                cm.this.rq();
                if (cm.this.hna != null) {
                    cm.this.hna.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    public void jpo(final com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        if (xyk()) {
            return;
        }
        this.pdm = wqxVar;
        if (wqxVar != null) {
            this.tic = this.tic && !wqxVar.qk();
        }
        jd(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.5
            @Override // java.lang.Runnable
            public void run() {
                cm.this.rq();
                if (cm.this.hna != null) {
                    cm.this.hna.obtainMessage(107, wqxVar).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx.my
    public void jd(wqx wqxVar) {
        if (xyk()) {
            return;
        }
        this.oya = 205;
        try {
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar2 = this.pdm;
            if (wqxVar2 != null) {
                float fPrr = wqxVar2.prr();
                if (fPrr > 0.0f) {
                    com.bykv.vk.openvk.jpo.jpo.jpo.jd jdVar = new com.bykv.vk.openvk.jpo.jpo.jpo.jd();
                    jdVar.jpo(fPrr);
                    this.f16721yd.jpo(jdVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.hna != null) {
            if (this.nzb) {
                hx();
            } else {
                hx hxVar = this.hna;
                hxVar.sendMessage(hxVar.obtainMessage(100, -1, -1));
            }
        }
        jpo.delete(this.f16712nq);
        boolean z10 = this.tic;
        boolean z11 = this.f16705dt;
        if (!z10 && !z11) {
            se();
            this.f16705dt = true;
        }
        for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().jd(this);
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        int i10 = this.oya;
        int i11 = message.what;
        if (this.f16721yd != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.oya == 205 || this.oya == 207 || this.oya == 209) {
                            this.f16721yd.jj();
                            this.f16718tu = SystemClock.elapsedRealtime();
                            this.oya = 206;
                            if (this.prr > 0) {
                                this.f16721yd.jpo(this.prr, this.xyk);
                                this.prr = -1L;
                            }
                            if (this.pdm != null) {
                                jd(this.f16715rv);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.f16717sq) {
                            this.opi += this.nmd;
                        }
                        this.f16717sq = false;
                        this.nmd = 0L;
                        this.f16710jr = Long.MIN_VALUE;
                        if (this.oya == 206 || this.oya == 207 || this.oya == 209) {
                            this.f16721yd.xyk();
                            this.oya = 207;
                            this.nzb = false;
                            for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().cm(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.f16721yd.au();
                        this.oya = 201;
                        return;
                    case 103:
                        try {
                            dt();
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<jpo.InterfaceC0053jpo> weakReference2 : this.wqx) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().wqx(this);
                            }
                        }
                        this.oya = 203;
                        return;
                    case 104:
                        if (this.oya == 202 || this.oya == 208) {
                            this.f16721yd.zz();
                            return;
                        }
                        break;
                    case 105:
                        if (this.oya == 205 || this.oya == 206 || this.oya == 208 || this.oya == 207 || this.oya == 209) {
                            this.f16721yd.qk();
                            this.oya = 208;
                            return;
                        }
                        break;
                    case 106:
                        if (this.oya == 206 || this.oya == 207 || this.oya == 209) {
                            this.f16721yd.jpo(((Long) message.obj).longValue(), this.xyk);
                            return;
                        }
                        break;
                    case 107:
                        nmd();
                        if (this.oya == 201 || this.oya == 203) {
                            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar = (com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx) message.obj;
                            if (TextUtils.isEmpty(wqxVar.my())) {
                                wqxVar.jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd());
                            }
                            if (wqxVar.nq()) {
                                this.f16721yd.jpo(wqxVar.hna());
                                wqxVar.hna();
                            } else {
                                File file = new File(wqxVar.my(), wqxVar.sq());
                                if (file.exists()) {
                                    jpo(wqxVar, file);
                                } else {
                                    wqx(wqxVar);
                                }
                            }
                            this.oya = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.f16721yd.jpo((SurfaceHolder) message.obj);
                        this.f16721yd.jd(true);
                        this.f16719uu.await(1L, TimeUnit.SECONDS);
                        rv();
                        return;
                    case 111:
                        this.f16706ef = new Surface((SurfaceTexture) message.obj);
                        this.f16721yd.jpo(this.f16706ef);
                        this.f16721yd.jd(true);
                        this.f16719uu.await(1L, TimeUnit.SECONDS);
                        rv();
                        return;
                }
                this.oya = 200;
                if (this.f16711ju) {
                    return;
                }
                com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo jpoVar = new com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(308, i11);
                jpoVar.jpo(i10 + "," + i11);
                for (WeakReference<jpo.InterfaceC0053jpo> weakReference3 : this.wqx) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().jpo(this, jpoVar);
                    }
                }
                this.f16711ju = true;
            } catch (Throwable unused2) {
            }
        }
    }

    private void jd(Runnable runnable) {
        if (runnable == null || xyk()) {
            return;
        }
        if (!this.f16702au) {
            runnable.run();
        } else {
            jpo(runnable);
        }
    }

    public void jd(final boolean z10) {
        hx hxVar;
        if (xyk() || (hxVar = this.hna) == null) {
            return;
        }
        hxVar.post(new Runnable() { // from class: com.bykv.vk.openvk.jpo.jpo.jd.wqx.cm.8
            @Override // java.lang.Runnable
            public void run() {
                if (cm.this.xyk() || cm.this.f16721yd == null) {
                    return;
                }
                try {
                    cm.this.f16715rv = z10;
                    cm.this.f16721yd.cm(z10);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void jd(int i10) {
        this.xyk = i10;
    }

    private void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, File file) {
        if (wqxVar.jpo()) {
            jd(wqxVar, file);
        } else {
            jpo(file);
        }
    }

    private void jpo(File file) {
        file.getAbsolutePath();
        try {
            if (com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx()) {
                jd(file.getAbsolutePath());
            } else {
                this.f16721yd.jpo(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx.jpo
    public void jpo(wqx wqxVar, int i10) {
        if (this.f16721yd != wqxVar) {
            return;
        }
        for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().jd(this, i10);
            }
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx.jd
    public void jpo(wqx wqxVar) {
        this.oya = 209;
        jpo.delete(this.f16712nq);
        hx hxVar = this.hna;
        if (hxVar != null) {
            hxVar.removeCallbacks(this.f16720va);
        }
        for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().jpo(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx.InterfaceC0051wqx
    public boolean jpo(wqx wqxVar, int i10, int i11) {
        nq();
        this.oya = 200;
        hx hxVar = this.hna;
        if (hxVar != null) {
            hxVar.removeCallbacks(this.f16720va);
        }
        if (jpo(i10, i11)) {
            hmu();
        }
        if (!this.kln.get()) {
            return true;
        }
        this.kln.set(false);
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo jpoVar = new com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(i10, i11);
        for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().jpo(this, jpoVar);
            }
        }
        return true;
    }

    private void jpo(Runnable runnable) {
        try {
            if (this.hmu == null) {
                this.hmu = new ArrayList<>();
            }
            this.hmu.add(runnable);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx.qk
    public void jpo(wqx wqxVar, int i10, int i11, int i12, int i13) {
        for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().jpo((com.bykv.vk.openvk.jpo.jpo.jpo.jpo) this, i10, i11);
            }
        }
    }

    public void jpo(jpo.InterfaceC0053jpo interfaceC0053jpo) {
        if (interfaceC0053jpo == null) {
            return;
        }
        for (WeakReference<jpo.InterfaceC0053jpo> weakReference : this.wqx) {
            if (weakReference != null && weakReference.get() == interfaceC0053jpo) {
                return;
            }
        }
        this.wqx.add(new WeakReference<>(interfaceC0053jpo));
    }

    public void jpo(int i10) {
        if (xyk()) {
            return;
        }
        this.sz = i10;
    }

    public boolean jpo(float f10) {
        PlaybackParams playbackParamsMy;
        if (f10 <= 0.0f) {
            return false;
        }
        try {
            if (this.f16721yd == null || !wqx()) {
                return false;
            }
            try {
                playbackParamsMy = this.f16721yd.my();
            } catch (Throwable th2) {
                nmd.wqx("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th2.getMessage());
                playbackParamsMy = null;
            }
            if ((playbackParamsMy != null ? playbackParamsMy.getSpeed() : 0.0f) == f10) {
                return true;
            }
            com.bykv.vk.openvk.jpo.jpo.jpo.jd jdVar = new com.bykv.vk.openvk.jpo.jpo.jpo.jd();
            jdVar.jpo(f10);
            this.f16721yd.jpo(jdVar);
            return true;
        } catch (Throwable th3) {
            nmd.jpo("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th3);
            return false;
        }
    }
}
