package com.bytedance.sdk.component.my.wqx;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.component.my.hna;
import com.bytedance.sdk.component.my.jr;
import com.bytedance.sdk.component.my.ju;
import com.bytedance.sdk.component.my.oya;
import com.bytedance.sdk.component.my.rq;
import com.bytedance.sdk.component.my.xyk;
import com.bytedance.sdk.component.my.yd;
import com.bytedance.sdk.component.my.zz;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements zz {

    /* renamed from: au, reason: collision with root package name */
    private volatile boolean f18941au;

    /* renamed from: cm, reason: collision with root package name */
    private String f18942cm;

    /* renamed from: dt, reason: collision with root package name */
    private jj f18943dt;
    private com.bytedance.sdk.component.my.wqx.jpo hmu;
    private jr hna;

    /* renamed from: hx, reason: collision with root package name */
    private int f18944hx;

    /* renamed from: if, reason: not valid java name */
    private WeakReference<ImageView> f77if;

    /* renamed from: jd, reason: collision with root package name */
    private String f18945jd;

    /* renamed from: jj, reason: collision with root package name */
    private ImageView.ScaleType f18946jj;
    Future<?> jpo;

    /* renamed from: jr, reason: collision with root package name */
    private final Handler f18947jr;

    /* renamed from: ju, reason: collision with root package name */
    private int f18948ju;
    private hna my;
    private boolean nmd;

    /* renamed from: nq, reason: collision with root package name */
    private com.bytedance.sdk.component.my.jd f18949nq;
    private Queue<com.bytedance.sdk.component.my.my.zz> opi;
    private boolean oya;
    private boolean pdm;
    private boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private Bitmap.Config f18950qk;

    /* renamed from: rq, reason: collision with root package name */
    private com.bytedance.sdk.component.my.qk f18951rq;

    /* renamed from: rv, reason: collision with root package name */
    private ExecutorService f18952rv;

    /* renamed from: se, reason: collision with root package name */
    private int f18953se;

    /* renamed from: sq, reason: collision with root package name */
    private int f18954sq;
    private oya sz;

    /* renamed from: tu, reason: collision with root package name */
    private int f18955tu;

    /* renamed from: uu, reason: collision with root package name */
    private boolean f18956uu;
    private String wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private xyk f18957yd;
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements yd {

        /* renamed from: au, reason: collision with root package name */
        private boolean f18958au;

        /* renamed from: cm, reason: collision with root package name */
        private String f18959cm;

        /* renamed from: dt, reason: collision with root package name */
        private oya f18960dt;
        private jj hna;

        /* renamed from: if, reason: not valid java name */
        private boolean f78if;

        /* renamed from: jd, reason: collision with root package name */
        private ImageView f18961jd;

        /* renamed from: jj, reason: collision with root package name */
        private Bitmap.Config f18962jj;
        private hna jpo;

        /* renamed from: jr, reason: collision with root package name */
        private int f18963jr;

        /* renamed from: ju, reason: collision with root package name */
        private jr f18964ju;
        private ImageView.ScaleType my;
        private boolean nmd;
        private int opi;
        private String oya;
        private com.bytedance.sdk.component.my.jd prr;

        /* renamed from: qk, reason: collision with root package name */
        private int f18965qk;

        /* renamed from: rq, reason: collision with root package name */
        private ExecutorService f18966rq;

        /* renamed from: sq, reason: collision with root package name */
        private xyk f18967sq;

        /* renamed from: tu, reason: collision with root package name */
        private boolean f18968tu;
        private String wqx;
        private int xyk;
        private int zz = 1;

        /* renamed from: yd, reason: collision with root package name */
        private int f18969yd = 5;

        public jd(jj jjVar) {
            this.hna = jjVar;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd cm(int i10) {
            this.opi = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jd(int i10) {
            this.xyk = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(String str) {
            this.wqx = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd my(int i10) {
            this.f18963jr = i10;
            return this;
        }

        public yd wqx(String str) {
            this.f18959cm = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jd(String str) {
            this.oya = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(ImageView.ScaleType scaleType) {
            this.my = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd wqx(int i10) {
            this.zz = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(Bitmap.Config config) {
            this.f18962jj = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(int i10) {
            this.f18965qk = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(jr jrVar) {
            this.f18964ju = jrVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(boolean z10) {
            this.f18958au = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public zz jpo(hna hnaVar, int i10) {
            this.f18969yd = i10;
            return jpo(hnaVar);
        }

        @Override // com.bytedance.sdk.component.my.yd
        public zz jpo(hna hnaVar) {
            this.jpo = hnaVar;
            return new wqx(this).dt();
        }

        @Override // com.bytedance.sdk.component.my.yd
        public zz jpo(ImageView imageView) {
            this.f18961jd = imageView;
            return new wqx(this).dt();
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(xyk xykVar) {
            this.f18967sq = xykVar;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo implements hna {

        /* renamed from: jd, reason: collision with root package name */
        private hna f18970jd;

        public jpo(hna hnaVar) {
            this.f18970jd = hnaVar;
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(final ju juVar) {
            Bitmap bitmapJpo;
            final ImageView imageView = (ImageView) wqx.this.f77if.get();
            if (imageView != null && wqx.this.f18948ju != 3 && jpo(imageView) && (juVar.jd() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) juVar.jd();
                wqx.this.f18947jr.post(new Runnable() { // from class: com.bytedance.sdk.component.my.wqx.wqx.jpo.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (wqx.this.f18957yd != null && (juVar.jd() instanceof Bitmap) && (bitmapJpo = wqx.this.f18957yd.jpo((Bitmap) juVar.jd())) != null) {
                    juVar.jpo(bitmapJpo);
                }
            } catch (Throwable unused) {
            }
            if (wqx.this.f18954sq == 5) {
                wqx.this.f18947jr.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.my.wqx.wqx.jpo.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (jpo.this.f18970jd != null) {
                            jpo.this.f18970jd.jpo(juVar);
                        }
                    }
                });
                return;
            }
            hna hnaVar = this.f18970jd;
            if (hnaVar != null) {
                hnaVar.jpo(juVar);
            }
        }

        private boolean jpo(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(wqx.this.wqx)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(final int i10, final String str, final Throwable th2) {
            if (wqx.this.f18954sq == 5) {
                wqx.this.f18947jr.post(new Runnable() { // from class: com.bytedance.sdk.component.my.wqx.wqx.jpo.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (jpo.this.f18970jd != null) {
                            jpo.this.f18970jd.jpo(i10, str, th2);
                        }
                    }
                });
                return;
            }
            hna hnaVar = this.f18970jd;
            if (hnaVar != null) {
                hnaVar.jpo(i10, str, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zz dt() {
        try {
            if (this.f18943dt == null) {
                hna hnaVar = this.my;
                if (hnaVar != null) {
                    hnaVar.jpo(1005, "not init !", null);
                    return this;
                }
            } else {
                String strJpo = jpo();
                if (TextUtils.isEmpty(strJpo)) {
                    hna hnaVar2 = this.my;
                    if (hnaVar2 != null) {
                        hnaVar2.jpo(2000, "url is empty", null);
                        return this;
                    }
                } else {
                    rq rqVarMy = this.f18943dt.my();
                    if (!strJpo.startsWith(DtbConstants.HTTP) && !strJpo.startsWith(DtbConstants.HTTPS) && rqVarMy != null) {
                        rqVarMy.jpo(1006, "url is not validate ".concat(strJpo));
                    }
                    ExecutorService executorServiceQk = this.f18952rv == null ? this.f18943dt.qk() : null;
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.my.wqx.wqx.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.my.my.zz zzVar;
                            while (!wqx.this.f18941au && (zzVar = (com.bytedance.sdk.component.my.my.zz) wqx.this.opi.poll()) != null) {
                                try {
                                    if (wqx.this.hna != null) {
                                        wqx.this.hna.jpo(zzVar.jpo(), wqx.this);
                                    }
                                    zzVar.jpo(wqx.this);
                                    if (wqx.this.hna != null) {
                                        wqx.this.hna.jd(zzVar.jpo(), wqx.this);
                                    }
                                } catch (Throwable th2) {
                                    wqx.this.jpo(2000, th2.getMessage(), th2);
                                    if (wqx.this.hna != null) {
                                        wqx.this.hna.jd("exception", wqx.this);
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (wqx.this.f18941au) {
                                wqx.this.jpo(IronSourceError.AUCTION_ERROR_DECRYPTION, "canceled", null);
                            }
                        }
                    };
                    if (this.f18956uu) {
                        runnable.run();
                        return this;
                    }
                    ExecutorService executorService = this.f18952rv;
                    if (executorService != null) {
                        this.jpo = executorService.submit(runnable);
                        return this;
                    }
                    if (executorServiceQk != null) {
                        this.jpo = executorServiceQk.submit(runnable);
                    }
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public boolean au() {
        return this.oya;
    }

    public com.bytedance.sdk.component.my.qk hna() {
        return this.f18951rq;
    }

    /* renamed from: if, reason: not valid java name */
    public int m420if() {
        return this.f18948ju;
    }

    public com.bytedance.sdk.component.my.jd jr() {
        return this.f18949nq;
    }

    public Bitmap.Config ju() {
        return this.f18950qk;
    }

    public boolean nmd() {
        return this.pdm;
    }

    public jj opi() {
        return this.f18943dt;
    }

    public boolean oya() {
        return this.prr;
    }

    public boolean prr() {
        return this.nmd;
    }

    public oya rq() {
        return this.sz;
    }

    public int sq() {
        return this.f18955tu;
    }

    public String tu() {
        return yd() + m420if();
    }

    private wqx(jd jdVar) {
        this.opi = new LinkedBlockingQueue();
        this.f18947jr = new Handler(Looper.getMainLooper());
        this.nmd = true;
        this.f18945jd = jdVar.f18959cm;
        this.my = new jpo(jdVar.jpo);
        this.f77if = new WeakReference<>(jdVar.f18961jd);
        this.f18946jj = jdVar.my;
        this.f18950qk = jdVar.f18962jj;
        this.xyk = jdVar.f18965qk;
        this.zz = jdVar.xyk;
        this.f18948ju = jdVar.zz;
        this.f18954sq = jdVar.f18969yd;
        this.hna = jdVar.f18964ju;
        this.f18949nq = jpo(jdVar);
        if (!TextUtils.isEmpty(jdVar.wqx)) {
            jd(jdVar.wqx);
            jpo(jdVar.wqx);
        }
        this.oya = jdVar.f78if;
        this.prr = jdVar.f18958au;
        this.f18943dt = jdVar.hna;
        this.f18957yd = jdVar.f18967sq;
        this.f18944hx = jdVar.f18963jr;
        this.f18953se = jdVar.opi;
        this.f18952rv = jdVar.f18966rq;
        this.pdm = jdVar.nmd;
        this.f18956uu = jdVar.f18968tu;
        this.sz = jdVar.f18960dt;
        this.opi.add(new com.bytedance.sdk.component.my.my.wqx());
    }

    @Override // com.bytedance.sdk.component.my.zz
    public ImageView.ScaleType cm() {
        return this.f18946jj;
    }

    public void jd(String str) {
        WeakReference<ImageView> weakReference = this.f77if;
        if (weakReference != null && weakReference.get() != null) {
            this.f77if.get().setTag(1094453505, str);
        }
        this.wqx = str;
    }

    public int jj() {
        return this.f18953se;
    }

    @Override // com.bytedance.sdk.component.my.zz
    public Bitmap.Config my() {
        return this.f18950qk;
    }

    public int qk() {
        return this.f18944hx;
    }

    @Override // com.bytedance.sdk.component.my.zz
    public int wqx() {
        return this.zz;
    }

    public hna xyk() {
        return this.my;
    }

    public String yd() {
        return this.wqx;
    }

    public String zz() {
        return this.f18942cm;
    }

    private com.bytedance.sdk.component.my.jd jpo(jd jdVar) {
        if (jdVar.prr != null) {
            return jdVar.prr;
        }
        if (!TextUtils.isEmpty(jdVar.oya)) {
            return com.bytedance.sdk.component.my.wqx.jpo.jpo.jpo(new File(jdVar.oya));
        }
        return com.bytedance.sdk.component.my.wqx.jpo.jpo.yd();
    }

    @Override // com.bytedance.sdk.component.my.zz
    public int jd() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.component.my.zz
    public String jpo() {
        return this.f18945jd;
    }

    public void jpo(String str) {
        this.f18942cm = str;
    }

    public void jpo(boolean z10) {
        this.nmd = z10;
    }

    public void jpo(com.bytedance.sdk.component.my.qk qkVar) {
        this.f18951rq = qkVar;
    }

    public void jpo(int i10) {
        this.f18955tu = i10;
    }

    public void jpo(com.bytedance.sdk.component.my.wqx.jpo jpoVar) {
        this.hmu = jpoVar;
    }

    public boolean jpo(com.bytedance.sdk.component.my.my.zz zzVar) {
        if (this.f18941au) {
            return false;
        }
        return this.opi.add(zzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10, String str, Throwable th2) {
        new com.bytedance.sdk.component.my.my.xyk(i10, str, th2).jpo(this);
        this.opi.clear();
    }
}
