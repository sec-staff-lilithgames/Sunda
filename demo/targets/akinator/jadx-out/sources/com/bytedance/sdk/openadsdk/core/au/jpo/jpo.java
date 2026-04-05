package com.bytedance.sdk.openadsdk.core.au.jpo;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bykv.vk.openvk.jpo.jpo.jpo.jj.cm;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.cm.qk;
import com.bytedance.sdk.openadsdk.core.au.jd.my;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.p000if.jj;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.nmd;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo implements wqx, hx.jpo, com.bytedance.sdk.openadsdk.core.au.jd.jpo {

    /* renamed from: cm, reason: collision with root package name */
    protected SurfaceHolder f20207cm;
    protected jd hmu;
    protected boolean hna;

    /* renamed from: hx, reason: collision with root package name */
    protected WeakReference<wqx.jd> f20211hx;

    /* renamed from: jj, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.au.cm.wqx f20213jj;

    /* renamed from: ju, reason: collision with root package name */
    protected final Context f20215ju;
    protected long kln;
    protected SurfaceTexture my;

    /* renamed from: nq, reason: collision with root package name */
    protected boolean f20216nq;
    private long nzb;
    protected wqx.jpo pdm;

    /* renamed from: qk, reason: collision with root package name */
    protected my f20217qk;

    /* renamed from: rv, reason: collision with root package name */
    protected jj f20219rv;

    /* renamed from: se, reason: collision with root package name */
    protected final ViewGroup f20220se;

    /* renamed from: tu, reason: collision with root package name */
    protected boolean f20222tu;

    /* renamed from: uu, reason: collision with root package name */
    protected long f20223uu;
    protected final dt xyk;
    protected String jpo = "TTAD.VideoController";

    /* renamed from: jd, reason: collision with root package name */
    protected final int f20212jd = 100;
    protected final hx wqx = new hx(Looper.getMainLooper(), this);
    protected long zz = 0;

    /* renamed from: yd, reason: collision with root package name */
    protected long f20225yd = 0;

    /* renamed from: if, reason: not valid java name */
    protected final List<Runnable> f115if = new ArrayList();

    /* renamed from: au, reason: collision with root package name */
    protected boolean f20206au = false;
    protected boolean oya = false;
    protected boolean prr = true;

    /* renamed from: sq, reason: collision with root package name */
    protected boolean f20221sq = false;
    protected boolean opi = false;

    /* renamed from: jr, reason: collision with root package name */
    protected boolean f20214jr = false;
    protected AtomicBoolean nmd = new AtomicBoolean(false);

    /* renamed from: rq, reason: collision with root package name */
    protected AtomicBoolean f20218rq = new AtomicBoolean(false);

    /* renamed from: dt, reason: collision with root package name */
    protected boolean f20209dt = true;
    protected boolean sz = false;

    /* renamed from: ef, reason: collision with root package name */
    protected Runnable f20210ef = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jpo.jpo.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z10 = jpo.this.f20206au;
            jpo.this.nmd();
        }
    };
    private long duq = 0;

    /* renamed from: dm, reason: collision with root package name */
    private boolean f20208dm = true;
    private int tic = 1;

    /* renamed from: va, reason: collision with root package name */
    private final AtomicBoolean f20224va = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.au.jpo.jpo$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] jpo;

        static {
            int[] iArr = new int[nmd.jpo.values().length];
            jpo = iArr;
            try {
                iArr[nmd.jpo.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jpo[nmd.jpo.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                jpo[nmd.jpo.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public jpo(Context context, dt dtVar, ViewGroup viewGroup) {
        this.xyk = dtVar;
        this.f20215ju = context;
        this.f20220se = viewGroup;
        this.jpo += hashCode();
    }

    private void duq() {
        my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.cm(0);
            this.f20217qk.jpo(false, false);
            this.f20217qk.wqx(false);
            this.f20217qk.my();
            this.f20217qk.qk();
        }
    }

    private boolean hna() {
        my myVar = this.f20217qk;
        if (myVar != null) {
            return myVar.au() instanceof cm;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean au() {
        return this.oya;
    }

    public void cm(long j10) {
        this.kln = j10;
    }

    public boolean dt() {
        return this.f20221sq;
    }

    public final long ef() {
        return qk() + jj();
    }

    public boolean hmu() {
        return this.hna;
    }

    public final boolean hx() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        return wqxVar != null && wqxVar.jj();
    }

    public void jd(long j10) {
        this.zz = j10;
        this.f20225yd = Math.max(this.f20225yd, j10);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public long jj() {
        return this.zz;
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
    }

    public void jr() {
        if (this.f115if.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.f115if).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f115if.clear();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public com.bykv.vk.openvk.jpo.jpo.jpo.jpo ju() {
        return this.f20213jj;
    }

    public int kln() {
        return this.tic;
    }

    public void my(boolean z10) {
        this.f20209dt = z10;
    }

    public void nmd() {
        this.wqx.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jpo.jpo.3
            @Override // java.lang.Runnable
            public void run() {
                jpo jpoVar = jpo.this;
                if (jpoVar.f20213jj != null) {
                    boolean z10 = jpoVar.f20206au;
                    jpo.this.f20213jj.yd();
                }
            }
        });
    }

    public boolean nq() {
        return this.f20208dm;
    }

    public final void nzb() {
        com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(com.bytedance.sdk.openadsdk.hmu.jpo.jpo(this.xyk.ted(), true, this.xyk), 5, this.xyk.fc());
    }

    public void opi() {
        if (this.f20213jj == null) {
            return;
        }
        if (hna()) {
            SurfaceTexture surfaceTexture = this.my;
            if (surfaceTexture == null || surfaceTexture == this.f20213jj.jr()) {
                return;
            }
            this.f20213jj.jpo(this.my);
            return;
        }
        SurfaceHolder surfaceHolder = this.f20207cm;
        if (surfaceHolder == null || surfaceHolder == this.f20213jj.opi()) {
            return;
        }
        this.f20213jj.jpo(this.f20207cm);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public final boolean oya() {
        return this.f20216nq;
    }

    public final void pdm() {
        if (dt.jj(this.xyk) && this.f20218rq.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.au.jpo.jpo.5
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                    try {
                        jpoVar.jd("video_player");
                        jpoVar.cm(tic.jpo(jpo.this.xyk));
                        jpoVar.jpo(BuildConfig.VERSION_NAME);
                    } catch (Throwable unused) {
                    }
                    return jpoVar;
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean prr() {
        return true;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public final long qk() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar == null) {
            return 0L;
        }
        return wqxVar.oya();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    /* renamed from: rq, reason: merged with bridge method [inline-methods] */
    public final my mo374if() {
        return this.f20217qk;
    }

    public final void rv() {
        this.sz = true;
        prr.jpo jpoVar = new prr.jpo();
        jpoVar.jd(jj());
        jpoVar.cm(zz() / kln());
        jpoVar.wqx(qk());
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jd(mo374if(), jpoVar);
    }

    public final boolean se() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        return wqxVar == null || wqxVar.jd();
    }

    public long sq() {
        return this.f20223uu;
    }

    public final void sz() {
        this.sz = true;
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(this.xyk, this.f20217qk, this.hmu);
    }

    public boolean tu() {
        return this.prr;
    }

    public final void uu() {
        this.sz = true;
        prr.jpo jpoVar = new prr.jpo();
        jpoVar.jd(jj());
        jpoVar.cm(zz() / kln());
        jpoVar.wqx(qk());
        jpoVar.jpo(sq());
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(this.f20217qk, jpoVar);
    }

    public void wqx(long j10) {
        this.duq = j10;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public final int xyk() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar == null) {
            return 0;
        }
        return wqxVar.prr();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public final int yd() {
        return com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(this.f20225yd, this.kln);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public final long zz() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar == null) {
            return 0L;
        }
        return wqxVar.hna();
    }

    public final void cm(boolean z10) {
        this.f20208dm = z10;
    }

    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view, boolean z10) {
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public final void my(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view) {
        jpo(jdVar, view, false);
    }

    public void wqx(boolean z10) {
        this.f20214jr = z10;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public final void cm(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view) {
        if (this.f20214jr) {
            wqx(false);
            my myVar = this.f20217qk;
            if (myVar != null) {
                myVar.jd(this.f20220se);
            }
            jpo(1);
            return;
        }
        jpo(true, 3);
    }

    public void jd(Runnable runnable) {
        this.f115if.add(runnable);
    }

    public void jpo(wqx.cm cmVar) {
    }

    public final void my(long j10) {
        this.zz = j10;
        this.f20225yd = Math.max(this.f20225yd, j10);
        my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.jpo();
        }
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            wqxVar.jpo(true, this.zz, this.hna);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public final void wqx(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view) {
        my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.zz();
        }
        jpo(true, 3);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, SurfaceHolder surfaceHolder) {
        this.f20206au = false;
        this.f20207cm = null;
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            wqxVar.jpo(false);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        if (!dt.jj(this.xyk)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.core.au.jpo.jpo.2
            @Override // com.bytedance.sdk.openadsdk.sq.cm
            public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                try {
                    jpoVar.jd("video_player");
                    jpoVar.cm(tic.jpo(jpo.this.xyk));
                    jpoVar.jpo(BuildConfig.VERSION_NAME);
                } catch (Throwable unused) {
                }
                return jpoVar;
            }
        });
        return false;
    }

    private boolean wqx(int i10) {
        return this.f20217qk.jd(i10);
    }

    public void jpo(Runnable runnable) {
        if (this.f20217qk.tu() && this.f20206au) {
            runnable.run();
        } else {
            jd(runnable);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, SurfaceTexture surfaceTexture) {
        this.f20206au = false;
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            wqxVar.jpo(false);
        }
        this.my = null;
        jr();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, SurfaceHolder surfaceHolder) {
        this.f20206au = true;
        this.f20207cm = surfaceHolder;
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar == null) {
            return;
        }
        wqxVar.jpo(surfaceHolder);
        jr();
    }

    public final void jd(boolean z10) {
        this.oya = z10;
    }

    public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        jd jdVar = (jd) wqxVar;
        this.hmu = jdVar;
        this.hna = jdVar.ju();
        wqxVar.cm(String.valueOf(this.xyk.jl()));
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, SurfaceTexture surfaceTexture) {
        this.f20206au = true;
        this.my = surfaceTexture;
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            wqxVar.jpo(surfaceTexture);
            this.f20213jj.jpo(this.f20206au);
        }
        jr();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public final void jd(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view) {
        jd(jdVar, view, false, false);
    }

    public final void jd(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view, boolean z10, boolean z11) {
        wqx(!this.f20214jr);
        Context context = this.f20215ju;
        if (context != null && (context instanceof Activity)) {
            if (this.f20214jr) {
                jpo(z10 ? 8 : 0);
                my myVar = this.f20217qk;
                if (myVar != null) {
                    myVar.jpo(this.f20220se);
                    this.f20217qk.wqx(false);
                }
            } else {
                jpo(1);
                my myVar2 = this.f20217qk;
                if (myVar2 != null) {
                    myVar2.jd(this.f20220se);
                    this.f20217qk.wqx(false);
                }
            }
            WeakReference<wqx.jd> weakReference = this.f20211hx;
            wqx.jd jdVar2 = weakReference != null ? weakReference.get() : null;
            if (jdVar2 != null) {
                jdVar2.jpo(this.f20214jr);
            }
        }
    }

    public void jpo(boolean z10) {
        this.prr = z10;
        my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.cm(z10);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public final void jpo(final boolean z10, String str) throws JSONException {
        this.hna = z10;
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            wqxVar.jd(z10);
            com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(this.f20217qk, z10, str);
        }
        if (this.f20219rv != null) {
            if (com.bykv.vk.openvk.jpo.jpo.jd.jd.jpo.jpo()) {
                this.f20219rv.jpo(z10);
            } else {
                this.wqx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.au.jpo.jpo.4
                    @Override // java.lang.Runnable
                    public void run() {
                        jpo.this.f20219rv.jpo(z10);
                    }
                });
            }
        }
    }

    public final void jpo(wqx.jd jdVar) {
        this.f20211hx = new WeakReference<>(jdVar);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public final void jd(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, int i10) {
        my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.jj();
        }
    }

    public final void jpo(int i10) {
        Context context = this.f20215ju;
        if (context == null) {
            return;
        }
        boolean z10 = i10 == 0 || i10 == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
            if (!z10) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    public final void jd(qk qkVar) {
        this.sz = true;
        prr.jpo jpoVar = new prr.jpo();
        jpoVar.jd(jj());
        jpoVar.cm(zz() / kln());
        jpoVar.wqx(qk());
        jpoVar.cm(xyk());
        jpoVar.jpo(sq());
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jd(this.f20217qk, jpoVar, qkVar);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public final void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, View view, boolean z10, boolean z11) {
        if (this.prr) {
            jd();
        }
        if (z10 && !this.prr && !se()) {
            this.f20217qk.jd(!hx(), false);
            this.f20217qk.jpo(z11, true, false);
        }
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null && wqxVar.jj()) {
            this.f20217qk.jj();
            this.f20217qk.my();
        } else {
            this.f20217qk.jj();
        }
    }

    public void jd(int i10) {
        this.tic = i10;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public final void jd() {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            wqxVar.ju();
        }
        if (this.f20222tu || !this.nmd.get()) {
            return;
        }
        uu();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public final void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, int i10, boolean z10) {
        if (this.f20215ju == null) {
            return;
        }
        long j10 = (long) (((i10 * r0) * 1.0f) / 100.0f);
        if (this.kln > 0) {
            this.nzb = (int) j10;
        } else {
            this.nzb = 0L;
        }
        my myVar = this.f20217qk;
        if (myVar != null) {
            myVar.jpo(this.nzb);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.jpo
    public final void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd jdVar, int i10) {
        if (this.f20213jj == null) {
            return;
        }
        jpo(this.nzb, wqx(i10));
    }

    private void jpo(long j10, boolean z10) {
        if (this.f20213jj == null) {
            return;
        }
        if (z10) {
            duq();
        }
        this.f20213jj.jpo(j10);
    }

    public final void jpo(qk qkVar) {
        if (this.nmd.compareAndSet(false, true)) {
            this.sz = true;
            jj jjVar = this.f20219rv;
            if (jjVar != null) {
                jjVar.jpo(zz(), hmu());
            }
            prr.jpo jpoVar = new prr.jpo();
            jpoVar.jpo(nq());
            jpoVar.cm(zz());
            com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(sq.jpo(), this.f20217qk, jpoVar, qkVar);
        }
    }

    public final void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo jpoVar) {
        this.sz = true;
        prr.jpo jpoVar2 = new prr.jpo();
        jpoVar2.wqx(qk());
        jpoVar2.cm(zz() / kln());
        jpoVar2.jd(jj());
        jpoVar2.jpo(jpoVar);
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.wqx(mo374if(), jpoVar2);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public final void jpo(wqx.jpo jpoVar) {
        this.pdm = jpoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.jpo
    public final void jpo(nmd.jpo jpoVar, String str) {
        int i10 = AnonymousClass6.jpo[jpoVar.ordinal()];
        if (i10 == 1) {
            jd();
            return;
        }
        if (i10 == 2) {
            cm();
        } else {
            if (i10 != 3) {
                return;
            }
            wqx();
            this.f20221sq = false;
            this.opi = true;
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo(long j10) {
        this.f20223uu = j10;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean jpo(float f10) {
        com.bytedance.sdk.openadsdk.core.au.cm.wqx wqxVar = this.f20213jj;
        if (wqxVar != null) {
            return wqxVar.jpo(f10);
        }
        return false;
    }

    public void jpo(long j10, long j11) {
        if (!this.f20224va.get() && com.bytedance.sdk.openadsdk.jj.jpo.jpo().wqx() && (j10 * 1.0d) / j11 > 0.3d) {
            this.f20224va.set(true);
            if (this.xyk != null) {
                com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("videoPercent30", this.xyk);
            }
        }
    }
}
