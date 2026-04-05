package com.bytedance.sdk.openadsdk.cm.my.jd;

import com.bytedance.sdk.openadsdk.core.model.dt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr {

    /* renamed from: cm, reason: collision with root package name */
    private com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx f19592cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f19593jd;
    private long jpo;
    private dt my;
    private int wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: if, reason: not valid java name */
        private com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo f100if;

        /* renamed from: jj, reason: collision with root package name */
        private int f19596jj;

        /* renamed from: qk, reason: collision with root package name */
        private int f19598qk;
        private int xyk;

        /* renamed from: yd, reason: collision with root package name */
        private int f19599yd;
        private int zz;
        private long jpo = 0;

        /* renamed from: jd, reason: collision with root package name */
        private long f19595jd = 0;
        private long wqx = 0;

        /* renamed from: cm, reason: collision with root package name */
        private long f19594cm = 0;
        private boolean my = false;

        /* renamed from: ju, reason: collision with root package name */
        private boolean f19597ju = false;

        private void oya() {
            long j10 = this.wqx;
            if (j10 > 0) {
                long j11 = this.jpo;
                if (j11 > j10) {
                    long j12 = j11 % j10;
                    this.jpo = j12;
                    if (j12 == 0) {
                        this.jpo = j10;
                    }
                }
            }
        }

        public com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo au() {
            return this.f100if;
        }

        public long cm() {
            return this.wqx;
        }

        /* renamed from: if, reason: not valid java name */
        public boolean m437if() {
            return this.my;
        }

        public long jd() {
            return this.jpo;
        }

        public int jj() {
            return this.f19598qk;
        }

        public long jpo() {
            return this.f19594cm;
        }

        public boolean ju() {
            return this.f19597ju;
        }

        public int my() {
            return this.f19596jj;
        }

        public int qk() {
            long j10 = this.wqx;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.jpo * 100) / j10), 100);
        }

        public long wqx() {
            return this.f19595jd;
        }

        public int xyk() {
            return this.xyk;
        }

        public int yd() {
            return this.f19599yd;
        }

        public int zz() {
            return this.zz;
        }

        public void cm(long j10) {
            this.wqx = j10;
            oya();
        }

        public void jd(long j10) {
            this.jpo = j10;
            oya();
        }

        public void jpo(long j10) {
            this.f19594cm = j10;
        }

        public void wqx(long j10) {
            this.f19595jd = j10;
        }

        public void jpo(int i10) {
            this.f19596jj = i10;
        }

        public void wqx(int i10) {
            this.xyk = i10;
        }

        public void cm(int i10) {
            this.f19599yd = i10;
        }

        public void jd(int i10) {
            this.f19598qk = i10;
        }

        public void jpo(boolean z10) {
            this.my = z10;
        }

        public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo jpoVar) {
            this.f100if = jpoVar;
        }
    }

    public prr(long j10, String str, int i10, com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, dt dtVar) {
        this.jpo = j10;
        this.f19593jd = str;
        this.wqx = i10;
        this.f19592cm = wqxVar;
        this.my = dtVar;
    }

    public com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx cm() {
        return this.f19592cm;
    }

    public String jd() {
        return this.f19593jd;
    }

    public long jpo() {
        return this.jpo;
    }

    public dt my() {
        return this.my;
    }

    public int wqx() {
        return this.wqx;
    }
}
