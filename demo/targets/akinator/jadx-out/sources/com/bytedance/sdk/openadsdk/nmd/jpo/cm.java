package com.bytedance.sdk.openadsdk.nmd.jpo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.nmd.jpo.jpo;
import com.bytedance.sdk.openadsdk.p001if.jj;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile cm f21312jd;
    private final Handler jpo;
    private int wqx = 0;

    /* renamed from: cm, reason: collision with root package name */
    private int f21313cm = 2;
    private int my = 3600000;

    /* renamed from: jj, reason: collision with root package name */
    private final ArrayList<jd> f21314jj = new ArrayList<>();

    private cm() {
        duq.jd(new xyk("pag_pre_render_init") { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.cm.1
            @Override // java.lang.Runnable
            public void run() {
                cm.this.wqx = com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_pre_render_enable", 0);
                cm.this.f21313cm = com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_pre_render_max_count", 2);
                if (cm.this.f21313cm <= 0 || cm.this.f21313cm > 4) {
                    cm.this.f21313cm = 2;
                }
                cm.this.my = com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_pre_render_alive_time", 3600000);
                if (cm.this.my <= 0 || cm.this.my > 3600000) {
                    cm.this.my = 3600000;
                }
            }
        });
        this.jpo = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.cm.2
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (!(message.obj instanceof jd)) {
                    return false;
                }
                cm.this.f21314jj.remove(message.obj);
                ((jd) message.obj).cm();
                return true;
            }
        });
    }

    public static cm jpo() {
        if (f21312jd == null) {
            synchronized (cm.class) {
                try {
                    if (f21312jd == null) {
                        f21312jd = new cm();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21312jd;
    }

    public boolean jd() {
        return this.wqx == 1;
    }

    public void jpo(final dt dtVar) {
        if (jd() && dtVar != null && rv.jj(dtVar)) {
            final String strHbg = dtVar.hbg();
            if (TextUtils.isEmpty(strHbg)) {
                return;
            }
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.cm.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (cm.this.f21314jj.size() >= cm.this.f21313cm) {
                            cm.this.f21314jj.size();
                            jd jdVar = (jd) cm.this.f21314jj.remove(0);
                            if (jdVar != null) {
                                cm.this.jpo.removeMessages(jdVar.zz().hashCode());
                                jdVar.cm();
                            }
                        }
                        dtVar.m466if(true);
                        Context contextJpo = sq.jpo();
                        dt dtVar2 = dtVar;
                        final jd jdVar2 = new jd(contextJpo, dtVar2, dtVar2.ll(), true, new FrameLayout(sq.jpo()), strHbg);
                        cm.this.f21314jj.add(jdVar2);
                        jdVar2.xyk();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = strHbg.hashCode();
                        messageObtain.obj = jdVar2;
                        cm.this.jpo.sendMessageDelayed(messageObtain, cm.this.my);
                        jdVar2.jpo(new jpo.InterfaceC0149jpo() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.cm.3.1
                            @Override // com.bytedance.sdk.openadsdk.nmd.jpo.jpo.InterfaceC0149jpo
                            public void jpo() {
                                cm.this.jpo.removeMessages(strHbg.hashCode());
                                cm.this.f21314jj.remove(jdVar2);
                                jdVar2.cm();
                            }
                        });
                        dt dtVar3 = dtVar;
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar3, tic.wqx(dtVar3.gmx().getDurationSlotType()), "PL_start_pre_render", 1);
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
            });
        }
    }

    public jd jpo(dt dtVar, FrameLayout frameLayout, jj jjVar) {
        jd jdVar;
        if (jd() && dtVar.gmx() != null && !TextUtils.isEmpty(dtVar.gmx().getBidAdm()) && rv.jj(dtVar) && frameLayout != null) {
            String strHbg = dtVar.hbg();
            if (TextUtils.isEmpty(strHbg)) {
                return null;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= this.f21314jj.size()) {
                    i10 = -1;
                    jdVar = null;
                    break;
                }
                jdVar = this.f21314jj.get(i10);
                if (strHbg.equals(jdVar.zz())) {
                    break;
                }
                i10++;
            }
            if (jdVar != null) {
                this.jpo.removeMessages(strHbg.hashCode());
                this.f21314jj.remove(i10);
                this.f21314jj.size();
                dtVar.m466if(true);
                jdVar.jpo(frameLayout, jjVar);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, tic.wqx(dtVar.gmx().getDurationSlotType()), "PL_use_pre_render", 1);
                return jdVar;
            }
        }
        return null;
    }
}
