package com.bytedance.sdk.openadsdk.component.jj;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements Handler.Callback {

    /* renamed from: if, reason: not valid java name */
    private boolean f103if;

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.xyk.jpo f19791jd;

    /* renamed from: ju, reason: collision with root package name */
    private long f19793ju;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f19794qk;
    private jpo wqx;

    /* renamed from: yd, reason: collision with root package name */
    private long f19795yd;
    private Handler jpo = new Handler(Looper.myLooper(), this);

    /* renamed from: cm, reason: collision with root package name */
    private int f19790cm = 0;
    private int my = 5;

    /* renamed from: jj, reason: collision with root package name */
    private int f19792jj = 0;
    private final int xyk = 1000;
    private int zz = 1000;

    public jd(com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar) {
        this.f19791jd = jpoVar;
    }

    public void cm() {
        Handler handler = this.jpo;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 100 && this.jpo != null) {
            int i10 = message.arg1;
            jpo(i10);
            if (i10 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 - 1;
                this.jpo.sendMessageDelayed(messageObtain, this.zz);
            }
        }
        return true;
    }

    public void jd(int i10) {
        this.f19792jj = Math.min(i10, this.my);
    }

    public void jpo(int i10) {
        this.f19790cm = i10;
        int i11 = this.my - i10;
        this.f19791jd.jd(i11);
        boolean z10 = true;
        if (i10 <= 0) {
            jpo jpoVar = this.wqx;
            if (jpoVar != null && !this.f19794qk) {
                jpoVar.jd();
                this.f19794qk = true;
            }
            i10 = 0;
        }
        jpo jpoVar2 = this.wqx;
        if (jpoVar2 != null) {
            int i12 = this.f19792jj;
            int i13 = i12 - i11;
            if (i10 != 0 && i11 < i12) {
                z10 = false;
            }
            jpoVar2.jpo(i13, z10);
        }
    }

    public void my() {
        this.jpo.removeCallbacksAndMessages(null);
        this.jpo = null;
    }

    public void wqx() {
        if (this.jpo != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.f19790cm;
            this.jpo.sendMessage(messageObtain);
        }
    }

    public void jd() {
        Handler handler = this.jpo;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.my, 0));
        }
    }

    public void jpo(float f10) {
        int i10 = (int) f10;
        this.my = i10;
        if (i10 <= 0) {
            this.my = 5;
        }
    }

    public void jpo(jpo jpoVar) {
        this.wqx = jpoVar;
    }

    public int jpo() {
        return this.f19792jj;
    }

    public void jpo(int i10, float f10, boolean z10) {
        com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar;
        if ((i10 == 1 || i10 == 2) && this.f103if != z10) {
            this.f103if = z10;
            if (i10 == 1 && (jpoVar = this.f19791jd) != null) {
                jpoVar.jpo(z10);
            }
            if (z10) {
                try {
                    this.zz = (int) (1000.0f / f10);
                    this.f19793ju = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = (System.currentTimeMillis() - this.f19793ju) + this.f19795yd;
                this.f19795yd = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.xyk.jpo jpoVar2 = this.f19791jd;
                if (jpoVar2 != null) {
                    jpoVar2.jpo(jCurrentTimeMillis);
                }
            }
            this.zz = 1000;
        }
    }
}
