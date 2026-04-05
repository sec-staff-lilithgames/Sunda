package com.bytedance.sdk.openadsdk.core.widget.jpo;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.prr.jpo.jpo;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj implements hx.jpo {

    /* renamed from: au, reason: collision with root package name */
    float f20904au;

    /* renamed from: cm, reason: collision with root package name */
    WebView f20905cm;
    long hna;

    /* renamed from: hx, reason: collision with root package name */
    private final boolean f20907hx;

    /* renamed from: if, reason: not valid java name */
    float f142if;

    /* renamed from: jd, reason: collision with root package name */
    dt f20908jd;
    Context jpo;

    /* renamed from: jr, reason: collision with root package name */
    long f20910jr;

    /* renamed from: ju, reason: collision with root package name */
    float f20911ju;
    boolean opi;
    float oya;
    float prr;

    /* renamed from: qk, reason: collision with root package name */
    boolean f20913qk;

    /* renamed from: sq, reason: collision with root package name */
    boolean f20917sq;
    private boolean sz;

    /* renamed from: uu, reason: collision with root package name */
    private long f20919uu;
    boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    int f20920yd;
    String zz;

    /* renamed from: se, reason: collision with root package name */
    private final Handler f20916se = new hx(oya.jd().getLooper(), this);
    String wqx = "landingpage";

    /* renamed from: jj, reason: collision with root package name */
    int f20909jj = 0;
    private final String pdm = ".*\\/serp\\?sc=.*&clkt=\\d+$";

    /* renamed from: rv, reason: collision with root package name */
    private final String f20915rv = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    jpo hmu = new jpo() { // from class: com.bytedance.sdk.openadsdk.core.widget.jpo.jj.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.jj.jpo
        public void jpo() {
            jj jjVar = jj.this;
            jjVar.xyk = true;
            jjVar.jj();
            jj jjVar2 = jj.this;
            jjVar2.jpo(2, jjVar2.zz, jjVar2.f20920yd);
        }
    };

    /* renamed from: nq, reason: collision with root package name */
    GestureDetector f20912nq = new GestureDetector(sq.jpo(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.jpo.jj.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            jj.this.f20917sq = true;
            return false;
        }
    });
    int my = sq.cm().voc();
    Map<Integer, Long> nmd = new HashMap();

    /* renamed from: rq, reason: collision with root package name */
    Map<Integer, Float> f20914rq = new HashMap();

    /* renamed from: tu, reason: collision with root package name */
    Map<Integer, Long> f20918tu = new HashMap();

    /* renamed from: dt, reason: collision with root package name */
    List<Integer> f20906dt = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo();
    }

    public jj(WebView webView, dt dtVar, Context context, boolean z10) {
        this.f20908jd = dtVar;
        this.f20905cm = webView;
        this.jpo = context;
        this.f20907hx = z10;
    }

    private void cm(String str) {
        if (qk()) {
            return;
        }
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.f20908jd, new jpo.C0152jpo().jpo(this.zz).jd(Uri.decode(str)).jpo(), this.wqx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jj() {
        if (this.f20914rq.get(Integer.valueOf(this.f20920yd)) != null) {
            return;
        }
        float height = this.f20905cm.getHeight() / va.jd(this.jpo, this.f20905cm.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        this.f20914rq.put(Integer.valueOf(this.f20920yd), Float.valueOf(height));
    }

    private boolean my() {
        try {
            int i10 = this.f20920yd;
            if (i10 != 2 && i10 != 3) {
                return false;
            }
            if (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.zz)) {
                return true;
            }
            return Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.zz);
        } catch (Throwable th2) {
            nmd.wqx("WebArbitrageBehavior", th2.toString());
            return false;
        }
    }

    private boolean qk() {
        int i10 = this.f20909jj + 1;
        this.f20909jj = i10;
        if (i10 > this.my) {
            return true;
        }
        return ("landingpage".equals(this.wqx) || "landingpage_endcard".equals(this.wqx) || "landingpage_split_screen".equals(this.wqx) || "landingpage_direct".equals(this.wqx) || "landingpage_split_ceiling".equals(this.wqx)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xyk() {
        WebBackForwardList webBackForwardListCopyBackForwardList = this.f20905cm.copyBackForwardList();
        if (webBackForwardListCopyBackForwardList != null) {
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            this.f20920yd = currentIndex + 1;
            if (this.f20907hx) {
                this.f20920yd = currentIndex + 2;
            }
        }
    }

    public void jd(String str) {
        this.zz = str;
        xyk();
        this.nmd.put(Integer.valueOf(this.f20920yd), Long.valueOf(SystemClock.elapsedRealtime()));
        this.f20918tu.put(Integer.valueOf(this.f20920yd), Long.valueOf(SystemClock.elapsedRealtime()));
        this.sz = my();
    }

    public void wqx(String str) {
        if (this.f20913qk) {
            this.opi = true;
        }
        if (this.f20920yd == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int iIndexOf = str.indexOf("query=") + 6;
            int iIndexOf2 = str.indexOf(C3191e4.i.f36527c, iIndexOf);
            if (iIndexOf < 0 || iIndexOf2 >= str.length() || iIndexOf2 <= iIndexOf) {
                return;
            }
            cm(str.substring(iIndexOf, iIndexOf2));
        }
    }

    public void jpo(String str) {
        this.wqx = str;
    }

    public void jpo() {
        jd(this.f20920yd);
    }

    public void jpo(int i10) {
        float height = (this.f20905cm.getHeight() + i10) / va.jd(this.jpo, this.f20905cm.getContentHeight());
        Float f10 = this.f20914rq.get(Integer.valueOf(this.f20920yd));
        if (height > (f10 == null ? 0.0f : f10.floatValue())) {
            this.f20914rq.put(Integer.valueOf(this.f20920yd), Float.valueOf(height));
        }
    }

    public void jd() {
        this.f20905cm.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.jpo.jj.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z10) {
                if (!z10) {
                    jj jjVar = jj.this;
                    if (!jjVar.xyk) {
                        jjVar.jj();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (jElapsedRealtime - jj.this.f20919uu >= 50) {
                            jj jjVar2 = jj.this;
                            jjVar2.jpo(3, jjVar2.zz, jjVar2.f20920yd);
                            jj.this.f20919uu = jElapsedRealtime;
                            return;
                        }
                        return;
                    }
                    jjVar.xyk = false;
                }
                if (z10) {
                    jj.this.xyk();
                    jj jjVar3 = jj.this;
                    jjVar3.nmd.put(Integer.valueOf(jjVar3.f20920yd), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    private void cm() {
        if (qk()) {
            return;
        }
        com.bytedance.sdk.openadsdk.prr.jpo.jpo jpoVarJpo = new jpo.C0152jpo().jpo(this.zz).jpo(this.f20920yd).cm(this.f20911ju).my(this.f142if).jj(this.prr).qk(this.f20910jr).jpo();
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jpoVarJpo;
        this.f20916se.sendMessageDelayed(messageObtain, 20L);
    }

    private void jd(int i10) {
        if (qk() || this.f20906dt.contains(Integer.valueOf(i10))) {
            return;
        }
        this.f20906dt.add(Integer.valueOf(i10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f20908jd, new jpo.C0152jpo().jpo(this.zz).jpo(this.f20920yd).yd(jElapsedRealtime - (this.f20918tu.get(Integer.valueOf(i10)) != null ? r6.longValue() : jElapsedRealtime)).jpo(), this.wqx);
    }

    public jpo wqx() {
        return this.hmu;
    }

    private void wqx(int i10) {
        if (qk()) {
            return;
        }
        jj();
        this.f20913qk = true;
        com.bytedance.sdk.openadsdk.prr.jpo.jpo jpoVarJpo = new jpo.C0152jpo().jpo(this.zz).jpo(this.f20920yd).jpo(this.f20911ju).jd(this.f142if).wqx(this.f20910jr).wqx(i10).jpo();
        try {
            if (this.sz) {
                WebView.HitTestResult hitTestResult = this.f20905cm.getHitTestResult();
                jpoVarJpo.jpo(hitTestResult.getExtra());
                jpoVarJpo.jpo(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 200;
        messageObtain.obj = jpoVarJpo;
        this.f20916se.sendMessageDelayed(messageObtain, 100L);
    }

    public void jpo(MotionEvent motionEvent) {
        this.f20912nq.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f20911ju = motionEvent.getX();
            this.f142if = motionEvent.getY();
            this.hna = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            wqx(2);
        } else {
            this.f20910jr = SystemClock.elapsedRealtime() - this.hna;
            if (jd(motionEvent)) {
                cm();
            } else {
                wqx(1);
            }
        }
    }

    private boolean jd(MotionEvent motionEvent) {
        this.f20904au = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.oya = y10;
        float f10 = this.f142if;
        if (y10 - f10 == 0.0f) {
            return false;
        }
        this.prr = y10 - f10;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10, String str, int i11) {
        if (qk()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l9 = this.nmd.get(Integer.valueOf(i11));
        long jLongValue = l9 != null ? l9.longValue() : jElapsedRealtime;
        Float f10 = this.f20914rq.get(Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.cm.wqx.wqx(this.f20908jd, new jpo.C0152jpo().jpo(str).jpo(i11).xyk(jElapsedRealtime - jLongValue).zz(f10 == null ? 0.0f : f10.floatValue()).jd(i10).jpo(), this.wqx);
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        int i10 = message.what;
        com.bytedance.sdk.openadsdk.prr.jpo.jpo jpoVar = (com.bytedance.sdk.openadsdk.prr.jpo.jpo) message.obj;
        if (i10 == 100) {
            jpoVar.cm(this.f20917sq ? 2 : 1);
            com.bytedance.sdk.openadsdk.cm.wqx.cm(this.f20908jd, jpoVar, this.wqx);
            this.f20917sq = false;
        } else if (i10 == 200) {
            if (this.opi) {
                jpo(1, jpoVar.wqx(), jpoVar.cm());
            }
            jpoVar.wqx(this.opi ? 1 : 0);
            com.bytedance.sdk.openadsdk.cm.wqx.my(this.f20908jd, jpoVar, this.wqx);
            this.f20913qk = false;
            this.opi = false;
        }
    }
}
