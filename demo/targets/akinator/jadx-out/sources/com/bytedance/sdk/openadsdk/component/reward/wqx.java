package com.bytedance.sdk.openadsdk.component.reward;

import android.os.CountDownTimer;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.openadsdk.cm.my.jd.prr;
import com.bytedance.sdk.openadsdk.core.au.cm.jpo;
import com.bytedance.sdk.openadsdk.core.model.dt;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx {

    /* renamed from: jd, reason: collision with root package name */
    private final dt f20060jd;
    private final jpo jpo;

    /* renamed from: qk, reason: collision with root package name */
    private long f20062qk;
    private final com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo wqx;
    private jpo.InterfaceC0111jpo xyk;

    /* renamed from: cm, reason: collision with root package name */
    private boolean f20059cm = true;
    private long my = 0;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f20061jj = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements com.bykv.vk.openvk.jpo.jpo.jpo.jpo {

        /* renamed from: cm, reason: collision with root package name */
        private long f20063cm;

        /* renamed from: jd, reason: collision with root package name */
        private final com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo f20064jd;

        /* renamed from: jj, reason: collision with root package name */
        private CountDownTimer f20065jj;
        private final long jpo;
        private int my = 0;

        /* renamed from: qk, reason: collision with root package name */
        private wqx.jpo f20066qk;
        private final com.bytedance.sdk.openadsdk.cm.qk wqx;
        private long xyk;
        private long zz;

        public jpo(long j10, com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar, com.bytedance.sdk.openadsdk.cm.qk qkVar) {
            this.jpo = j10;
            this.f20064jd = jpoVar;
            this.wqx = qkVar;
        }

        public void au() {
            this.my = 0;
            CountDownTimer countDownTimer = this.f20065jj;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.f20065jj = null;
            }
            if (this.f20066qk != null) {
                this.f20066qk = null;
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
        public int cm() {
            return 0;
        }

        public long hna() {
            return this.jpo;
        }

        /* renamed from: if, reason: not valid java name */
        public void m449if() {
            this.my = 2;
            this.f20063cm = this.xyk;
            CountDownTimer countDownTimer = this.f20065jj;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.f20065jj = null;
            }
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
        public boolean jpo() {
            return false;
        }

        public void ju() {
            if (this.my == 1) {
                return;
            }
            this.my = 1;
            final long jHna = hna();
            if (this.f20063cm >= jHna) {
                this.f20063cm = 0L;
            }
            final long j10 = jHna - this.f20063cm;
            CountDownTimer countDownTimer = new CountDownTimer(j10, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.wqx.jpo.1
                @Override // android.os.CountDownTimer
                public void onFinish() throws JSONException {
                    if (jpo.this.f20066qk != null) {
                        wqx.jpo jpoVar = jpo.this.f20066qk;
                        long j11 = jHna;
                        jpoVar.jpo(j11, j11);
                    }
                    jpo.this.my = 4;
                    jpo.this.xyk = jHna;
                    jpo.this.f20063cm = jHna;
                    if (jpo.this.f20066qk != null) {
                        jpo.this.f20066qk.jpo(jpo.this.sq(), 100);
                    }
                    prr.jpo jpoVar2 = new prr.jpo();
                    jpoVar2.jd(jHna);
                    jpoVar2.cm(jHna);
                    jpoVar2.wqx(jpo.this.oya());
                    jpoVar2.cm(jpo.this.prr());
                    jpoVar2.jpo(jpo.this.zz());
                    com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jd(jpo.this.f20064jd, jpoVar2, jpo.this.wqx);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j11) {
                    long j12 = (j10 - j11) + jpo.this.f20063cm;
                    jpo.this.xyk = j12;
                    if (jpo.this.f20066qk != null) {
                        jpo.this.f20066qk.jpo(j12, jHna);
                    }
                }
            };
            this.f20065jj = countDownTimer;
            countDownTimer.start();
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
        public int my() {
            return 0;
        }

        public long oya() {
            return 0L;
        }

        public int prr() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
        public boolean qk() {
            return this.my == 2;
        }

        public long sq() {
            return this.xyk;
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
        public boolean wqx() {
            return false;
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
        public boolean xyk() {
            return this.my == 0;
        }

        public void yd() {
            this.xyk = 0L;
            ju();
        }

        public long zz() {
            return this.zz;
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
        public boolean jj() {
            return this.my == 1;
        }

        @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jpo
        public boolean jd() {
            return this.my == 4;
        }

        public void jd(long j10) {
            this.f20063cm = j10;
        }

        public void jpo(long j10) {
            this.zz = j10;
        }

        public void jpo(wqx.jpo jpoVar) {
            this.f20066qk = jpoVar;
        }
    }

    public wqx(dt dtVar, com.bytedance.sdk.openadsdk.cm.qk qkVar) {
        com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo jpoVar = new com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.wqx.1
        };
        this.wqx = jpoVar;
        this.f20060jd = dtVar;
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = dtVar.ww();
        long j10 = 10;
        long jJj = jdVarWw != null ? (long) jdVarWw.jj() : 10L;
        if (jJj <= 0) {
            jdVarWw.jpo(10.0d);
        } else {
            j10 = jJj;
        }
        this.jpo = new jpo(j10 * 1000, jpoVar, qkVar);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean au() {
        return this.jpo.jd();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void cm() {
        this.jpo.au();
    }

    public long hna() {
        return this.f20062qk;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    /* renamed from: if */
    public com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd mo374if() {
        return null;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jd() throws JSONException {
        this.jpo.m449if();
        prr.jpo jpoVar = new prr.jpo();
        jpoVar.jd(jj());
        jpoVar.cm(zz());
        jpoVar.wqx(qk());
        jpoVar.jpo(hna());
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(this.wqx, jpoVar);
        jpo.InterfaceC0111jpo interfaceC0111jpo = this.xyk;
        if (interfaceC0111jpo != null) {
            interfaceC0111jpo.jpo(2);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public long jj() {
        return this.jpo.sq();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean jpo(float f10) {
        return false;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public com.bykv.vk.openvk.jpo.jpo.jpo.jpo ju() {
        return this.jpo;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void my() {
        cm();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean oya() {
        return false;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean prr() {
        return false;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public long qk() {
        return 0L;
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.jd.jpo sq() {
        return this.wqx;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void wqx() throws JSONException {
        this.jpo.ju();
        prr.jpo jpoVar = new prr.jpo();
        jpoVar.jd(jj());
        jpoVar.cm(zz());
        jpoVar.wqx(qk());
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jd(this.wqx, jpoVar);
        jpo.InterfaceC0111jpo interfaceC0111jpo = this.xyk;
        if (interfaceC0111jpo != null) {
            interfaceC0111jpo.jpo(1);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public int xyk() {
        return 0;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public int yd() {
        return com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(this.jpo.xyk, this.jpo.jpo);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public long zz() {
        return this.jpo.hna();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo(long j10) {
        this.f20062qk = j10;
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.jpo(j10);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo(boolean z10, int i10) {
        cm();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public boolean jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) throws JSONException {
        this.f20061jj = wqxVar.ju();
        if (wqxVar.yd() > 0) {
            this.jpo.jd(wqxVar.yd());
        }
        wqxVar.jd(com.bytedance.sdk.openadsdk.rq.jpo.jpo("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.cm.my.jpo.jpo.jpo(this.f20060jd, this.wqx, wqxVar);
        this.jpo.ju();
        jpo.InterfaceC0111jpo interfaceC0111jpo = this.xyk;
        if (interfaceC0111jpo != null) {
            interfaceC0111jpo.jpo(1);
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo(boolean z10, String str) {
        this.f20061jj = z10;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo(wqx.jpo jpoVar) {
        this.jpo.jpo(jpoVar);
    }

    public void jpo(jpo.InterfaceC0111jpo interfaceC0111jpo) {
        this.xyk = interfaceC0111jpo;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx
    public void jpo() {
        this.jpo.yd();
    }
}
