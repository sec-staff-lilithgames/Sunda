package com.bytedance.adsdk.ugeno.zz.jpo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.jd.wqx;
import com.bytedance.adsdk.ugeno.jpo;
import com.bytedance.adsdk.ugeno.my;
import com.bytedance.adsdk.ugeno.qk.cm;
import com.bytedance.adsdk.ugeno.qk.jpo;
import com.bytedance.adsdk.ugeno.qk.xyk;
import com.bytedance.adsdk.ugeno.zz.jj.jd;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends jd {

    /* renamed from: as, reason: collision with root package name */
    private int f18099as;
    private boolean czp;
    private String ez;
    private String jrx;
    private String kgu;

    /* renamed from: lq, reason: collision with root package name */
    private String f18100lq;
    private boolean pzk;
    private int uhu;

    /* renamed from: ww, reason: collision with root package name */
    private jpo.C0066jpo f18101ww;

    public jpo(Context context) {
        super(context);
        this.kgu = "row";
    }

    private void cm() {
        if (TextUtils.isEmpty(this.ez)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setCompoundDrawables(null, null, null, null);
        if (!this.ez.startsWith("local://")) {
            my.jpo().jd().jpo(this.zz, this.ez, new jpo.InterfaceC0064jpo() { // from class: com.bytedance.adsdk.ugeno.zz.jpo.jpo.1
                @Override // com.bytedance.adsdk.ugeno.jpo.InterfaceC0064jpo
                public void jpo(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    xyk.jpo(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.jpo.jpo.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            jpo.this.jd(new BitmapDrawable(((wqx) jpo.this).f17811jd.getResources(), bitmap));
                        }
                    });
                }
            });
            return;
        }
        try {
            String strReplace = this.ez.replace("local://", "");
            Context context = this.f17811jd;
            jd(xyk.jpo(context, cm.jd(context, strReplace)));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zz.jj.jd, com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
        cm();
        ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void pe() {
        super.pe();
        if (this.czp) {
            ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setTextColor(((jd) this).f18088gf);
        }
        if (this.pzk) {
            if (this.f17802eq) {
                jpo(this.f17818np);
            } else {
                cm(this.f17798dm);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void roc() {
        super.roc();
        if (this.czp) {
            ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setTextColor(this.f18099as);
        }
        if (this.pzk) {
            if (this.f17802eq) {
                jpo(this.f18101ww);
            } else {
                cm(this.uhu);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.zz.jj.jd, com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        super.jpo(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.kgu = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.f18099as = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
                this.czp = true;
                break;
            case "image":
                this.ez = str2;
                break;
            case "highlightImage":
                this.jrx = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.qk.jpo.wqx(str2)) {
                    this.f17802eq = true;
                    this.f18101ww = com.bytedance.adsdk.ugeno.qk.jpo.jd(str2);
                } else {
                    this.uhu = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
                    this.f17802eq = false;
                }
                this.pzk = true;
                break;
            case "highlightBackgroundImage":
                this.f18100lq = str2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public void jd(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        String str = this.kgu;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
                    return;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
                    return;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    return;
                }
                break;
            case 113114:
                str.equals("row");
                break;
        }
        ((com.bytedance.adsdk.ugeno.zz.jj.jpo) this.my).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
