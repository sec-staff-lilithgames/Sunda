package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.au.cm.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sz implements Handler.Callback, jpo.InterfaceC0111jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.dt f21594cm;

    /* renamed from: if, reason: not valid java name */
    private int f166if;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f21596jj;
    private final com.bytedance.sdk.openadsdk.component.reward.jpo.jpo my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f21598qk;
    private boolean xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f21599yd;
    private boolean zz;
    private float jpo = 1.0f;

    /* renamed from: jd, reason: collision with root package name */
    private int f21595jd = 1000;
    private final Handler wqx = new Handler(Looper.getMainLooper(), this);

    /* renamed from: ju, reason: collision with root package name */
    private int f21597ju = 0;

    public sz(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        this.f21599yd = 0;
        this.f166if = 0;
        this.my = jpoVar;
        this.f21594cm = dtVar;
        if (dtVar.jw()) {
            if (dtVar.hf() >= 0) {
                this.f166if = dtVar.hf();
            } else {
                this.f166if = com.bytedance.sdk.openadsdk.core.sq.cm().zz(String.valueOf(dtVar.jl()));
            }
        } else if (dtVar.zhp()) {
            if (dtVar.rc() >= 0) {
                this.f166if = dtVar.rc();
            } else {
                this.f166if = com.bytedance.sdk.openadsdk.core.sq.cm().opi(String.valueOf(dtVar.jl()));
            }
        }
        this.f21599yd = (int) jpoVar.hmu.duq();
        com.bytedance.sdk.component.utils.nmd.jpo("TTAD.TopLayoutHelper", "totalTime: " + this.f21599yd + ", skipTime=" + this.f166if);
    }

    public void cm() {
        if (!this.f21596jj || this.f21598qk) {
            return;
        }
        this.wqx.removeMessages(1024);
        this.f21598qk = true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws NumberFormatException {
        if (message.what == 1024) {
            int i10 = this.f21599yd;
            int i11 = this.f21597ju;
            int i12 = i10 - i11;
            this.my.hmu.jpo(i11 * 1000);
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.f21597ju + ", mRemainTimeInSeconds=" + i12);
            if (i12 > 0) {
                Activity activity = this.my.vrc;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).wqx(this.f21597ju * 1000, this.f21599yd);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.yd ydVar = this.my.f19911hx;
                boolean z10 = false;
                if (ydVar != null && ydVar.jpo() != null) {
                    this.my.f19911hx.jpo().setTime(String.valueOf(i12), this.f21597ju, 0, false);
                }
                if (this.f21594cm.jw()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.yd ydVar2 = this.my.f19911hx;
                    if (ydVar2 != null) {
                        if (ydVar2.zz() && this.f166if > 0) {
                            z10 = true;
                        }
                        this.zz = z10;
                    }
                    if (!this.zz || this.f21597ju < this.f166if || this.my.f19914jd.jkt() == 5 || this.my.f19914jd.jkt() == 33) {
                        this.my.duq.jpo(String.valueOf(i12), null);
                    } else {
                        this.my.jpo(true);
                        this.my.duq.jpo(String.valueOf(i12), TTAdDislikeToast.getSkipText());
                        this.my.duq.my(true);
                    }
                } else if (this.f21594cm.zhp() && (this.my.f19911hx.zz() || this.my.f19914jd.aul())) {
                    Activity activity2 = this.my.vrc;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).wqx(this.f21597ju);
                    }
                    this.my.duq.cm(true);
                    this.my.duq.jpo(String.valueOf(i12), null);
                }
                this.f21597ju++;
                if (this.my.hmu.wqx()) {
                    com.bytedance.sdk.openadsdk.core.model.uu uuVarFmg = this.my.f19914jd.fmg();
                    if (uuVarFmg != null) {
                        float fJpo = uuVarFmg.jpo();
                        this.jpo = fJpo;
                        if (fJpo <= 0.0f) {
                            this.jpo = 1.0f;
                        }
                    }
                } else {
                    this.jpo = 1.0f;
                }
                int i13 = (int) (1000.0f / this.jpo);
                com.bytedance.sdk.component.utils.nmd.jpo("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i13)));
                this.wqx.sendEmptyMessageDelayed(message.what, i13);
            }
        }
        return true;
    }

    public void jd() {
        this.wqx.sendEmptyMessage(1024);
        this.f21598qk = false;
    }

    public boolean jpo() {
        return this.f21596jj;
    }

    public void my() {
        this.wqx.removeMessages(1024);
        this.f21596jj = false;
        this.xyk = true;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.my;
        if (jpoVar != null) {
            jpoVar.hmu.uu();
        }
    }

    public void wqx() {
        if (this.f21596jj) {
            this.wqx.removeMessages(1024);
            this.wqx.sendEmptyMessage(1024);
            this.f21598qk = false;
        }
    }

    public void jpo(long j10) {
        int iCeil = (int) Math.ceil(j10 / 1000.0d);
        if (this.f21598qk && !this.xyk) {
            this.f21597ju = iCeil;
            wqx();
        } else {
            if (this.f21596jj || this.xyk) {
                return;
            }
            this.f21597ju = iCeil;
            this.f21596jj = true;
            jd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jpo.InterfaceC0111jpo
    public void jpo(int i10) {
        com.bytedance.sdk.component.utils.nmd.jpo("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i10)));
        if (i10 == 1) {
            wqx();
            return;
        }
        if (i10 == 2) {
            cm();
        } else if (i10 == 3 || i10 == 4) {
            my();
        }
    }
}
