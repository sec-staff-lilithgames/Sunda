package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Path;
import com.bytedance.adsdk.jd.jpo.jd.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class opi implements jpo.InterfaceC0058jpo, au {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.zz f17348cm;

    /* renamed from: jd, reason: collision with root package name */
    private final String f17349jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f17350jj;
    private final com.bytedance.adsdk.jd.jpo.jd.au my;
    private final boolean wqx;
    private final Path jpo = new Path();

    /* renamed from: qk, reason: collision with root package name */
    private final jd f17351qk = new jd();

    public opi(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.sq sqVar) {
        this.f17349jd = sqVar.jpo();
        this.wqx = sqVar.wqx();
        this.f17348cm = zzVar;
        com.bytedance.adsdk.jd.jpo.jd.au auVarJpo = sqVar.jd().jpo();
        this.my = auVarJpo;
        jpoVar.jpo(auVarJpo);
        auVarJpo.jpo(this);
    }

    private void jd() {
        this.f17350jj = false;
        this.f17348cm.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.au
    public Path cm() {
        if (this.f17350jj) {
            return this.jpo;
        }
        this.jpo.reset();
        if (this.wqx) {
            this.f17350jj = true;
            return this.jpo;
        }
        Path pathQk = this.my.qk();
        if (pathQk == null) {
            return this.jpo;
        }
        this.jpo.set(pathQk);
        this.jpo.setFillType(Path.FillType.EVEN_ODD);
        this.f17351qk.jpo(this.jpo);
        this.f17350jj = true;
        return this.jpo;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        jd();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(java.util.List<com.bytedance.adsdk.jd.jpo.jpo.wqx> r6, java.util.List<com.bytedance.adsdk.jd.jpo.jpo.wqx> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            com.bytedance.adsdk.jd.jpo.jpo.wqx r1 = (com.bytedance.adsdk.jd.jpo.jpo.wqx) r1
            boolean r2 = r1 instanceof com.bytedance.adsdk.jd.jpo.jpo.rq
            if (r2 == 0) goto L26
            r2 = r1
            com.bytedance.adsdk.jd.jpo.jpo.rq r2 = (com.bytedance.adsdk.jd.jpo.jpo.rq) r2
            com.bytedance.adsdk.jd.wqx.jd.jr$jpo r3 = r2.jd()
            com.bytedance.adsdk.jd.wqx.jd.jr$jpo r4 = com.bytedance.adsdk.jd.wqx.jd.jr.jpo.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            com.bytedance.adsdk.jd.jpo.jpo.jd r1 = r5.f17351qk
            r1.jpo(r2)
            r2.jpo(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof com.bytedance.adsdk.jd.jpo.jpo.jr
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            com.bytedance.adsdk.jd.jpo.jpo.jr r1 = (com.bytedance.adsdk.jd.jpo.jpo.jr) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            com.bytedance.adsdk.jd.jpo.jd.au r6 = r5.my
            r6.jpo(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.jpo.jpo.opi.jpo(java.util.List, java.util.List):void");
    }
}
