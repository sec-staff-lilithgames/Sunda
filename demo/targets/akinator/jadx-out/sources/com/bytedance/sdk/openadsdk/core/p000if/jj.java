package com.bytedance.sdk.openadsdk.core.p000if;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bykv.vk.openvk.jpo.jpo.jd.jd.jpo;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.zz;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.core.model.cm;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {

    /* renamed from: jd, reason: collision with root package name */
    private qk f20389jd;
    final Set<Pair<View, FriendlyObstructionPurpose>> jpo = new HashSet();

    private jj() {
        my.jpo(sq.jpo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jj() {
        if (this.f20389jd != null) {
            try {
                jpo((View) null, (FriendlyObstructionPurpose) null);
                this.f20389jd.jd();
            } catch (Throwable unused) {
            }
        }
    }

    private Handler my() {
        return zz.jd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qk() {
        qk qkVar = this.f20389jd;
        if (qkVar != null) {
            try {
                qkVar.cm();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xyk() {
        qk qkVar = this.f20389jd;
        if (qkVar != null) {
            try {
                qkVar.wqx();
            } catch (Throwable unused) {
            }
        }
    }

    public void cm() {
        if (jpo.jpo()) {
            xyk();
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.7
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.xyk();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(WebView webView) {
        try {
            if (this.f20389jd == null) {
                this.f20389jd = xyk.jpo(webView);
            }
        } catch (Throwable th2) {
            nmd.wqx("createWebViewSession failed : ".concat(String.valueOf(th2)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            my.jpo(map);
        }
    }

    public void wqx() {
        if (jpo.jpo()) {
            qk();
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.6
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.qk();
                }
            });
        }
    }

    public static jj jpo() {
        return new jj();
    }

    public void jd() {
        if (jpo.jpo()) {
            jj();
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.4
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.jj();
                }
            });
        }
    }

    public void jpo(final WebView webView) {
        if (webView == null || this.f20389jd != null) {
            return;
        }
        if (jpo.jpo()) {
            jd(webView);
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.1
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.jd(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(boolean z10, float f10) {
        if (this.f20389jd != null) {
            try {
                jpo((View) null, (FriendlyObstructionPurpose) null);
                this.f20389jd.jpo(z10, f10);
            } catch (Throwable unused) {
            }
        }
    }

    public void jpo(final View view, final dt dtVar) {
        if (this.f20389jd != null) {
            return;
        }
        cm cmVarKc = dtVar.kc();
        final Set<yd> setJd = cmVarKc != null ? cmVarKc.jd() : null;
        if (view == null || setJd == null) {
            return;
        }
        if (jpo.jpo()) {
            jpo(view, setJd, dtVar);
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.3
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.jpo(view, (Set<yd>) setJd, dtVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        qk qkVar = this.f20389jd;
        try {
            if (qkVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.jpo.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                qkVar.jpo(view, friendlyObstructionPurpose);
            }
            if (this.jpo.size() > 0) {
                qkVar.jpo(this.jpo);
                this.jpo.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(View view, Set<yd> set, dt dtVar) {
        try {
            if (this.f20389jd == null) {
                this.f20389jd = xyk.jpo(view, set);
                if (dtVar.ig()) {
                    return;
                }
                wqx.jd(dtVar, dtVar.my(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th2) {
            nmd.wqx("createVideoSession failed : ".concat(String.valueOf(th2)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            my.jpo(map);
        }
    }

    public void jd(long j10, boolean z10) {
        qk qkVar = this.f20389jd;
        if (qkVar != null) {
            try {
                qkVar.jpo(j10 / 1000.0f, z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(boolean z10) {
        qk qkVar = this.f20389jd;
        if (qkVar != null) {
            try {
                qkVar.jpo(z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(int i10) {
        qk qkVar = this.f20389jd;
        if (qkVar != null) {
            try {
                qkVar.jd(i10);
            } catch (Throwable unused) {
            }
        }
    }

    public void jpo(final boolean z10, final float f10) {
        if (jpo.jpo()) {
            jd(z10, f10);
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.5
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.jd(z10, f10);
                }
            });
        }
    }

    public void jpo(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (jpo.jpo()) {
            jd(view, friendlyObstructionPurpose);
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.8
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.jd(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    public void jpo(final long j10, final boolean z10) {
        if (jpo.jpo()) {
            jd(j10, z10);
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.9
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.jd(j10, z10);
                }
            });
        }
    }

    public void jpo(final boolean z10) {
        if (jpo.jpo()) {
            jd(z10);
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.10
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.jd(z10);
                }
            });
        }
    }

    public void jpo(final int i10) {
        if (jpo.jpo()) {
            jd(i10);
        } else {
            my().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.if.jj.2
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.jd(i10);
                }
            });
        }
    }
}
