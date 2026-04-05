package com.bytedance.sdk.openadsdk.core.wqx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz.xyk;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends jd {
    private int duq;

    /* renamed from: ef, reason: collision with root package name */
    private WeakReference<InterfaceC0135jpo> f21001ef;

    /* renamed from: jd, reason: collision with root package name */
    private boolean f21002jd;
    private boolean jpo;
    private boolean nzb;
    private boolean wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.wqx.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0135jpo {
        long getVideoProgress();
    }

    public jpo(Context context, dt dtVar, String str, int i10) {
        super(context, dtVar, str, i10);
        this.jpo = true;
        this.f21002jd = false;
        this.wqx = false;
        this.nzb = false;
    }

    private boolean qk() {
        dt dtVar = ((jd) this).f20986jj;
        return dt.my(dtVar) && dtVar.aix() == 1;
    }

    private boolean xyk() {
        return this instanceof xyk;
    }

    private boolean zz() {
        dt dtVar = ((jd) this).f20986jj;
        if (dtVar == null || xyk()) {
            return false;
        }
        if (dtVar.iqh() != 5 && dtVar.iqh() != 15) {
            return false;
        }
        if (this.duq == 0) {
            this.duq = dtVar.cxb();
        }
        jd();
        jpo();
        wqx();
        if (this.duq == 5 && qk() && jpo() && !jd() && !wqx()) {
            return false;
        }
        int i10 = this.duq;
        return i10 == 1 || i10 == 2 || i10 == 5;
    }

    public void cm(boolean z10) {
        this.nzb = z10;
    }

    public boolean jd() {
        return false;
    }

    public void jpo(boolean z10) {
        this.jpo = z10;
    }

    public boolean wqx() {
        return false;
    }

    private boolean wqx(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof com.bytedance.sdk.openadsdk.core.au.jd.jj) || view.getId() == hna.f21559ww || view.getId() == hna.f21555va || view.getId() == hna.vrc || view.getId() == hna.roc || view.getId() == hna.f21543pe || view.getId() == 520093726 || view.getId() == hna.fgt) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                if (wqx(viewGroup.getChildAt(i10))) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public void jd(boolean z10) {
        this.f21002jd = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.content.Context] */
    @Override // com.bytedance.sdk.openadsdk.core.wqx.jd, com.bytedance.sdk.openadsdk.core.wqx.wqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(android.view.View r27, float r28, float r29, float r30, float r31, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.wqx.wqx.jpo> r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.wqx.jpo.jpo(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    private String jd(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    public void wqx(boolean z10) {
        this.wqx = z10;
    }

    public boolean jpo() {
        dt dtVar = ((jd) this).f20986jj;
        if (dtVar == null) {
            return true;
        }
        int iJd = sq.cm().jd(dtVar.jl());
        int iWqx = opi.wqx(sq.jpo());
        if (iJd == 1) {
            return tic.cm(iWqx);
        }
        if (iJd == 2) {
            return tic.my(iWqx) || tic.cm(iWqx) || tic.jj(iWqx);
        }
        if (iJd != 3) {
            return iJd != 5 || tic.cm(iWqx) || tic.jj(iWqx);
        }
        return false;
    }

    public void jpo(InterfaceC0135jpo interfaceC0135jpo) {
        this.f21001ef = new WeakReference<>(interfaceC0135jpo);
    }
}
