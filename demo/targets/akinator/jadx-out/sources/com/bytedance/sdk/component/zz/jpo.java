package com.bytedance.sdk.component.zz;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.pdm;
import com.bytedance.sdk.component.utils.zz;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends wqx implements hx.jpo {

    /* renamed from: au, reason: collision with root package name */
    private int f19086au;

    /* renamed from: cm, reason: collision with root package name */
    private final List<Integer> f19087cm;
    private boolean hna;

    /* renamed from: if, reason: not valid java name */
    private long f81if;

    /* renamed from: jd, reason: collision with root package name */
    private final int f19088jd;

    /* renamed from: jj, reason: collision with root package name */
    private final Context f19089jj;

    /* renamed from: jr, reason: collision with root package name */
    private String f19090jr;

    /* renamed from: ju, reason: collision with root package name */
    private long f19091ju;
    private final int my;
    private View.OnTouchListener nmd;
    private float opi;

    /* renamed from: qk, reason: collision with root package name */
    private volatile float f19092qk;

    /* renamed from: sq, reason: collision with root package name */
    private float f19094sq;
    private final int wqx;
    private volatile float xyk;
    private float zz = -1.0f;

    /* renamed from: yd, reason: collision with root package name */
    private float f19095yd = -1.0f;
    private final Handler prr = new hx(zz.jpo().getLooper(), this);
    InterfaceC0096jpo jpo = new InterfaceC0096jpo() { // from class: com.bytedance.sdk.component.zz.jpo.1
        @Override // com.bytedance.sdk.component.zz.jpo.InterfaceC0096jpo
        public void jpo() {
            if (jpo.this.zz == -1.0f && jpo.this.f19095yd == -1.0f && jpo.this.f81if == -1) {
                float unused = jpo.this.zz;
                float unused2 = jpo.this.f19095yd;
                jpo jpoVar = jpo.this;
                jpoVar.zz = jpoVar.f19092qk;
                jpo jpoVar2 = jpo.this;
                jpoVar2.f19095yd = jpoVar2.xyk;
                jpo jpoVar3 = jpo.this;
                jpoVar3.f81if = jpoVar3.f19091ju;
                jpo.this.hna = true;
            }
            float unused3 = jpo.this.zz;
            float unused4 = jpo.this.f19095yd;
        }

        @Override // com.bytedance.sdk.component.zz.jpo.InterfaceC0096jpo
        public void jpo(int i10) {
            jpo.this.f19086au = i10;
            jpo.this.jd();
        }
    };

    /* renamed from: rq, reason: collision with root package name */
    private int f19093rq = -1;
    private final List<Integer> oya = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.zz.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0096jpo {
        void jpo();

        void jpo(int i10);
    }

    public jpo(Context context, int i10, int i11, List<Integer> list, int i12) {
        this.f19089jj = context;
        if (i10 == -1) {
            this.f19088jd = pdm.jpo(context);
        } else {
            this.f19088jd = pdm.jpo(context, i10);
        }
        this.wqx = pdm.jpo(context, i11);
        this.f19087cm = list;
        this.my = i12;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        jpo jpoVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.f19091ju = SystemClock.elapsedRealtime();
        this.f19092qk = x10;
        this.xyk = y10;
        if (action == 0) {
            jpoVar = this;
            jpoVar.f19094sq = x10;
            jpoVar.opi = y10;
        } else if (action != 1) {
            jpoVar = this;
        } else {
            jpoVar = this;
            if (jpoVar.jpo(x10, y10, this.f19094sq, this.opi, this.f19089jj)) {
                int iJpo = jpo(jpoVar.f19092qk, jpoVar.xyk, jpoVar.f19091ju);
                boolean zContains = jpoVar.oya.contains(Integer.valueOf(jpoVar.f19086au));
                jpo(view, motionEvent, iJpo, !zContains);
                if (!zContains) {
                    jpoVar.oya.add(Integer.valueOf(jpoVar.f19086au));
                }
                if (iJpo == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = jpoVar.nmd;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd() {
        this.zz = -1.0f;
        this.f19095yd = -1.0f;
        this.f81if = -1L;
    }

    @Override // com.bytedance.sdk.component.zz.wqx
    public void jpo(View.OnTouchListener onTouchListener) {
        this.nmd = onTouchListener;
    }

    public InterfaceC0096jpo jpo() {
        return this.jpo;
    }

    private void jpo(View view, MotionEvent motionEvent, int i10, boolean z10) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i10 == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z10 ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i10);
        jSONObject.put("current_url_index", this.f19086au);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.prr.sendMessageDelayed(messageObtain, 200L);
    }

    public void jpo(String str) {
        this.f19090jr = str;
    }

    private int jpo(float f10, float f11, long j10) {
        if (this.zz == -1.0f && this.f19095yd == -1.0f && this.f81if == -1) {
            return 1;
        }
        if (!this.f19087cm.contains(Integer.valueOf(this.f19086au))) {
            return 2;
        }
        if (j10 - this.f81if > this.my) {
            jd();
            return 3;
        }
        float fAbs = Math.abs(f10 - this.zz);
        float fAbs2 = Math.abs(f11 - this.f19095yd);
        if (fAbs <= this.f19088jd / 2.0f && fAbs2 <= this.wqx / 2.0f) {
            return 0;
        }
        jd();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        int i10 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i10 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.hna ? 1 : 0);
                    this.hna = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.zz.jpo.jpo.jpo().jd() != null) {
                com.bytedance.sdk.component.zz.jpo.jpo.jpo().jd().jpo(this.f19090jr, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
