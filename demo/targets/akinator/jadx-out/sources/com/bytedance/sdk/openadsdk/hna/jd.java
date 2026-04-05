package com.bytedance.sdk.openadsdk.hna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: cm, reason: collision with root package name */
    public static int f21174cm = 2;

    /* renamed from: jd, reason: collision with root package name */
    public static int f21175jd = 0;
    public static int jpo = -1;
    public static int my = 3;
    public static int wqx = 1;

    /* renamed from: jj, reason: collision with root package name */
    private int f21176jj = jpo;

    /* renamed from: qk, reason: collision with root package name */
    private long f21177qk = 0;
    private long xyk = 0;
    private final List<wqx> zz = new ArrayList();

    /* renamed from: yd, reason: collision with root package name */
    private long f21178yd = 0;

    public void cm(long j10) {
        int i10 = this.f21176jj;
        if (i10 == jpo || i10 != f21174cm) {
            return;
        }
        this.f21176jj = wqx;
        this.zz.add(new wqx(this.f21178yd, j10));
        this.f21178yd = 0L;
    }

    public void jd(long j10) {
        int i10;
        int i11 = this.f21176jj;
        if (i11 == jpo || i11 == (i10 = my)) {
            return;
        }
        this.f21176jj = i10;
        this.xyk = j10;
    }

    public void jpo(long j10) {
        this.f21176jj = f21175jd;
        this.f21177qk = j10;
    }

    public void wqx(long j10) {
        int i10;
        int i11 = this.f21176jj;
        if (i11 == jpo || i11 == (i10 = f21174cm) || i11 == my) {
            return;
        }
        this.f21176jj = i10;
        this.f21178yd = j10;
    }

    public long jpo(long j10, long j11) {
        long j12;
        long j13;
        long jJd;
        long j14 = this.xyk;
        if (j14 != 0 && j10 > j14) {
            return 0L;
        }
        int i10 = 0;
        for (wqx wqxVar : this.zz) {
            if (wqxVar.jd() > j10) {
                if (j10 < wqxVar.jpo()) {
                    j13 = i10;
                    jJd = wqxVar.jd() - wqxVar.jpo();
                } else {
                    j13 = i10;
                    jJd = wqxVar.jd() - j10;
                }
                i10 = (int) (jJd + j13);
            }
        }
        long j15 = this.f21177qk;
        if (j15 < j10) {
            long j16 = this.f21178yd;
            if (j16 == 0) {
                j16 = this.xyk;
                if (j16 == 0) {
                    j12 = j11 - j10;
                }
            } else if (j16 <= j10) {
                return 0L;
            }
            return (j16 - j10) - i10;
        }
        long j17 = this.f21178yd;
        if (j17 == 0) {
            j17 = this.xyk;
            if (j17 == 0) {
                j12 = j11 - j15;
            }
        } else if (j17 <= j15) {
            return 0L;
        }
        return (j17 - j15) - i10;
        return j12 - i10;
    }

    public int jpo() {
        return this.f21176jj;
    }
}
