package com.bytedance.sdk.component.my.cm.wqx;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.adsdk.ugeno.zz.cm.a;
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
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements zz {

    /* renamed from: au, reason: collision with root package name */
    private volatile boolean f18840au;

    /* renamed from: cm, reason: collision with root package name */
    private String f18841cm;

    /* renamed from: dt, reason: collision with root package name */
    private com.bytedance.sdk.component.my.jd f18842dt;
    private int hmu;
    private jr hna;

    /* renamed from: hx, reason: collision with root package name */
    private boolean f18843hx;

    /* renamed from: if, reason: not valid java name */
    private WeakReference<ImageView> f74if;

    /* renamed from: jd, reason: collision with root package name */
    private String f18844jd;

    /* renamed from: jj, reason: collision with root package name */
    private ImageView.ScaleType f18845jj;
    Future<?> jpo;

    /* renamed from: jr, reason: collision with root package name */
    private boolean f18846jr;

    /* renamed from: ju, reason: collision with root package name */
    private int f18847ju;
    private hna my;
    private com.bytedance.sdk.component.my.qk nmd;

    /* renamed from: nq, reason: collision with root package name */
    private int f18848nq;
    private final Handler opi;
    private boolean oya;
    private oya pdm;
    private boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private Bitmap.Config f18849qk;

    /* renamed from: rq, reason: collision with root package name */
    private int f18850rq;

    /* renamed from: rv, reason: collision with root package name */
    private byte[] f18851rv;

    /* renamed from: se, reason: collision with root package name */
    private ExecutorService f18852se;

    /* renamed from: sq, reason: collision with root package name */
    private int f18853sq;

    /* renamed from: tu, reason: collision with root package name */
    private jj f18854tu;
    private String wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private xyk f18855yd;
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements yd {

        /* renamed from: au, reason: collision with root package name */
        private boolean f18856au;

        /* renamed from: cm, reason: collision with root package name */
        private String f18857cm;
        private jj hna;

        /* renamed from: if, reason: not valid java name */
        private boolean f75if;

        /* renamed from: jd, reason: collision with root package name */
        private ImageView f18858jd;

        /* renamed from: jj, reason: collision with root package name */
        private Bitmap.Config f18859jj;
        private hna jpo;

        /* renamed from: jr, reason: collision with root package name */
        private int f18860jr;

        /* renamed from: ju, reason: collision with root package name */
        private jr f18861ju;
        private ImageView.ScaleType my;
        private ExecutorService nmd;
        private int opi;
        private String oya;
        private com.bytedance.sdk.component.my.jd prr;

        /* renamed from: qk, reason: collision with root package name */
        private int f18862qk;

        /* renamed from: rq, reason: collision with root package name */
        private boolean f18863rq;

        /* renamed from: sq, reason: collision with root package name */
        private xyk f18864sq;

        /* renamed from: tu, reason: collision with root package name */
        private oya f18865tu;
        private String wqx;
        private int xyk;
        private int zz = 1;

        /* renamed from: yd, reason: collision with root package name */
        private int f18866yd = 5;

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
            this.f18860jr = i10;
            return this;
        }

        public yd wqx(String str) {
            this.f18857cm = str;
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
            this.f18859jj = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(int i10) {
            this.f18862qk = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(jr jrVar) {
            this.f18861ju = jrVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(boolean z10) {
            this.f18856au = z10;
            return this;
        }

        @Override // com.bytedance.sdk.component.my.yd
        public zz jpo(hna hnaVar, int i10) {
            this.f18866yd = i10;
            return jpo(hnaVar);
        }

        @Override // com.bytedance.sdk.component.my.yd
        public zz jpo(hna hnaVar) {
            this.jpo = hnaVar;
            return new wqx(this).rq();
        }

        @Override // com.bytedance.sdk.component.my.yd
        public zz jpo(ImageView imageView) {
            this.f18858jd = imageView;
            return new wqx(this).rq();
        }

        @Override // com.bytedance.sdk.component.my.yd
        public yd jpo(xyk xykVar) {
            this.f18864sq = xykVar;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo implements hna {

        /* renamed from: jd, reason: collision with root package name */
        private hna f18867jd;

        public jpo(hna hnaVar) {
            this.f18867jd = hnaVar;
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(final ju juVar) {
            Bitmap bitmapJpo;
            final ImageView imageView = (ImageView) wqx.this.f74if.get();
            if (imageView != null && wqx.this.f18847ju != 3 && jpo(imageView)) {
                Object objJd = juVar.jd();
                if (objJd instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) juVar.jd();
                    wqx.this.opi.post(new Runnable() { // from class: com.bytedance.sdk.component.my.cm.wqx.wqx.jpo.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objJd instanceof Drawable) {
                    final Drawable drawable = (Drawable) juVar.jd();
                    wqx.this.opi.post(new Runnable() { // from class: com.bytedance.sdk.component.my.cm.wqx.wqx.jpo.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Drawable drawable2 = drawable;
                                if (a.d(drawable2)) {
                                    a.b(drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (wqx.this.f18855yd != null && (juVar.jd() instanceof Bitmap) && (bitmapJpo = wqx.this.f18855yd.jpo((Bitmap) juVar.jd())) != null) {
                    juVar.jpo(bitmapJpo);
                }
            } catch (Throwable unused) {
            }
            if (wqx.this.f18853sq == 5) {
                wqx.this.opi.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.my.cm.wqx.wqx.jpo.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (jpo.this.f18867jd != null) {
                            jpo.this.f18867jd.jpo(juVar);
                        }
                    }
                });
                return;
            }
            hna hnaVar = this.f18867jd;
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
            if (wqx.this.f18853sq == 5) {
                wqx.this.opi.post(new Runnable() { // from class: com.bytedance.sdk.component.my.cm.wqx.wqx.jpo.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (jpo.this.f18867jd != null) {
                            jpo.this.f18867jd.jpo(i10, str, th2);
                        }
                    }
                });
                return;
            }
            hna hnaVar = this.f18867jd;
            if (hnaVar != null) {
                hnaVar.jpo(i10, str, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zz rq() {
        try {
            if (this.f18854tu == null) {
                hna hnaVar = this.my;
                if (hnaVar != null) {
                    hnaVar.jpo(1005, "not init !", null);
                    return this;
                }
            } else {
                String strJpo = jpo();
                if (TextUtils.isEmpty(strJpo)) {
                    this.my.jpo(2000, "url is empty", null);
                    return this;
                }
                rq rqVarJj = this.f18854tu.jj();
                if (!strJpo.startsWith(DtbConstants.HTTP) && !strJpo.startsWith(DtbConstants.HTTPS) && rqVarJj != null) {
                    rqVarJj.jpo(1006, "url is not validate ".concat(strJpo));
                }
                ExecutorService executorServiceMy = this.f18852se == null ? this.f18854tu.my() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.my.cm.wqx.wqx.1
                    @Override // java.lang.Runnable
                    public void run() {
                        wqx wqxVar = wqx.this;
                        com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar = new com.bytedance.sdk.component.my.cm.wqx.jpo(wqxVar, wqxVar.hna);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.my.cm.jd.jd());
                            arrayList.add(new com.bytedance.sdk.component.my.cm.jd.my());
                            arrayList.add(new com.bytedance.sdk.component.my.cm.jd.jpo());
                            arrayList.add(new com.bytedance.sdk.component.my.cm.jd.wqx());
                            arrayList.add(new com.bytedance.sdk.component.my.cm.jd.cm());
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (wqx.this.f18840au) {
                                    jpoVar.jpo(IronSourceError.AUCTION_ERROR_DECRYPTION, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.my.cm.jd.jj jjVar = (com.bytedance.sdk.component.my.cm.jd.jj) arrayList.get(i10);
                                if (wqx.this.hna != null && jjVar != null && !"data_intercept".equals(jjVar.jpo())) {
                                    wqx.this.hna.jpo(jjVar.jpo(), wqx.this);
                                }
                                wqx wqxVar2 = wqx.this;
                                boolean zJpo = jjVar.jpo(wqxVar2, wqxVar2.hna, jpoVar);
                                if (wqx.this.hna != null && !"data_intercept".equals(jjVar.jpo())) {
                                    wqx.this.hna.jd(jjVar.jpo(), wqx.this);
                                }
                                if (!zJpo) {
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            jpoVar.jpo(2000, th2.getMessage(), th2);
                        }
                    }
                };
                if (this.f18843hx) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.f18852se;
                if (executorService != null) {
                    this.jpo = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceMy != null) {
                    this.jpo = executorServiceMy.submit(runnable);
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public boolean au() {
        return this.f18846jr;
    }

    public int hna() {
        return this.f18850rq;
    }

    /* renamed from: if, reason: not valid java name */
    public int m418if() {
        return this.f18847ju;
    }

    public oya jr() {
        return this.pdm;
    }

    public Bitmap.Config ju() {
        return this.f18849qk;
    }

    public String nmd() {
        return yd() + m418if();
    }

    public com.bytedance.sdk.component.my.jd opi() {
        return this.f18842dt;
    }

    public byte[] oya() {
        return this.f18851rv;
    }

    public com.bytedance.sdk.component.my.qk prr() {
        return this.nmd;
    }

    public jj sq() {
        return this.f18854tu;
    }

    public String yd() {
        return this.wqx;
    }

    private wqx(jd jdVar) {
        this.opi = new Handler(Looper.getMainLooper());
        this.f18846jr = true;
        this.f18851rv = null;
        this.f18844jd = jdVar.f18857cm;
        this.my = new jpo(jdVar.jpo);
        this.f74if = new WeakReference<>(jdVar.f18858jd);
        this.f18845jj = jdVar.my;
        this.f18849qk = jdVar.f18859jj;
        this.xyk = jdVar.f18862qk;
        this.zz = jdVar.xyk;
        this.f18847ju = jdVar.zz;
        this.f18853sq = jdVar.f18866yd;
        this.hna = jdVar.f18861ju;
        this.f18842dt = jpo(jdVar);
        if (!TextUtils.isEmpty(jdVar.wqx)) {
            jd(jdVar.wqx);
            jpo(jdVar.wqx);
        }
        this.oya = jdVar.f75if;
        this.prr = jdVar.f18856au;
        this.f18854tu = jdVar.hna;
        this.f18855yd = jdVar.f18864sq;
        this.f18848nq = jdVar.f18860jr;
        this.hmu = jdVar.opi;
        this.f18852se = jdVar.nmd;
        this.f18843hx = jdVar.f18863rq;
        this.pdm = jdVar.f18865tu;
    }

    private com.bytedance.sdk.component.my.jd jpo(jd jdVar) {
        return jdVar.prr != null ? jdVar.prr : !TextUtils.isEmpty(jdVar.oya) ? com.bytedance.sdk.component.my.cm.wqx.jpo.jd.jpo(new File(jdVar.oya)) : com.bytedance.sdk.component.my.cm.wqx.jpo.jd.yd();
    }

    @Override // com.bytedance.sdk.component.my.zz
    public ImageView.ScaleType cm() {
        return this.f18845jj;
    }

    public void jd(String str) {
        WeakReference<ImageView> weakReference = this.f74if;
        if (weakReference != null && weakReference.get() != null) {
            this.f74if.get().setTag(1094453505, str);
        }
        this.wqx = str;
    }

    public int jj() {
        return this.hmu;
    }

    @Override // com.bytedance.sdk.component.my.zz
    public Bitmap.Config my() {
        return this.f18849qk;
    }

    public int qk() {
        return this.f18848nq;
    }

    @Override // com.bytedance.sdk.component.my.zz
    public int wqx() {
        return this.zz;
    }

    public hna xyk() {
        return this.my;
    }

    public String zz() {
        return this.f18841cm;
    }

    @Override // com.bytedance.sdk.component.my.zz
    public int jd() {
        return this.xyk;
    }

    @Override // com.bytedance.sdk.component.my.zz
    public String jpo() {
        return this.f18844jd;
    }

    public void jpo(String str) {
        this.f18841cm = str;
    }

    public void jpo(boolean z10) {
        this.f18846jr = z10;
    }

    public void jpo(byte[] bArr) {
        this.f18851rv = bArr;
    }

    public void jpo(int i10) {
        this.f18850rq = i10;
    }
}
