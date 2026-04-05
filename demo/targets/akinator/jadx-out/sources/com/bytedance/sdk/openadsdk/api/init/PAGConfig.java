package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.qk.wqx.wqx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.prr;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.core.sz;
import com.bytedance.sdk.openadsdk.utils.tic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class PAGConfig implements InitConfig {

    /* renamed from: yd, reason: collision with root package name */
    private static String f19447yd;

    /* renamed from: jd, reason: collision with root package name */
    private boolean f19449jd;
    private String jpo;

    /* renamed from: ju, reason: collision with root package name */
    private String f19451ju;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f19452qk;
    private int wqx;
    private String xyk;
    private String zz;

    /* renamed from: cm, reason: collision with root package name */
    private int f19448cm = -1;
    private int my = -1;

    /* renamed from: jj, reason: collision with root package name */
    private int f19450jj = 0;

    public static void debugLog(boolean z10) {
        if (sz.jpo() != null) {
            if (z10) {
                sz.jpo().wqx(1);
                sz.jpo().jpo();
                return;
            }
            sz.jpo().wqx(0);
            wqx.jpo(wqx.jpo.OFF);
            prr.wqx();
            com.bykv.vk.openvk.jpo.jpo.jpo.qk.wqx.jd();
            nmd.jd();
        }
    }

    public static int getGDPRConsent() {
        if (!tic.zz("getGdpr")) {
            return -1;
        }
        int iJd = sz.jpo().jd();
        if (iJd == 1) {
            return 0;
        }
        if (iJd == 0) {
            return 1;
        }
        return iJd;
    }

    public static int getPAConsent() {
        if (tic.zz("getPAConsent")) {
            return sz.jpo().my();
        }
        return -1;
    }

    public static void setAppIconId(int i10) {
        if (sz.jpo() != null) {
            sz.jpo().cm(i10);
        }
    }

    public static void setGDPRConsent(int i10) {
        tic.zz("setGdpr");
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        sz.jpo().jd(i10);
    }

    public static void setPAConsent(int i10) {
        if (tic.zz("setPAConsent")) {
            if (i10 == 1 || i10 == 0) {
                sz.jpo().my(i10);
            } else {
                sz.jpo().my(-2);
            }
        }
    }

    public static void setPackageName(String str) {
        f19447yd = str;
    }

    public static void setUserData(String str) {
        if (sz.jpo() != null) {
            sz.jpo().jd(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAdxId() {
        return this.f19451ju;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.wqx;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.zz;
    }

    public boolean getDebugLog() {
        return this.f19449jd;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.f19448cm;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getPA() {
        return this.my;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.xyk) ? f19447yd : this.xyk;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.f19450jj;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.f19452qk;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm(int i10) {
        this.f19450jj = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx(int i10) {
        this.my = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm(String str) {
        this.f19451ju = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(String str) {
        this.jpo = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(String str) {
        this.zz = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx(String str) {
        this.xyk = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(int i10) {
        if (i10 < -1 || i10 > 1) {
            i10 = -1;
        }
        this.f19448cm = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(boolean z10) {
        this.f19449jd = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(boolean z10) {
        this.f19452qk = z10;
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10) {
        this.wqx = i10;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Builder {

        /* renamed from: jd, reason: collision with root package name */
        private boolean f19454jd;
        private String jpo;
        private int wqx;
        private String[] xyk;

        /* renamed from: yd, reason: collision with root package name */
        private String f19458yd;
        private String zz;

        /* renamed from: cm, reason: collision with root package name */
        private int f19453cm = -1;
        private int my = -1;

        /* renamed from: jj, reason: collision with root package name */
        private int f19455jj = 0;

        /* renamed from: qk, reason: collision with root package name */
        private boolean f19457qk = false;

        /* renamed from: ju, reason: collision with root package name */
        private String f19456ju = "";

        public Builder appIcon(int i10) {
            this.wqx = i10;
            return this;
        }

        public Builder appId(String str) {
            this.jpo = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.jd(this.jpo);
            pAGConfig.jpo(this.wqx);
            pAGConfig.cm(this.f19455jj);
            pAGConfig.jd(this.f19457qk);
            pAGConfig.jd(this.f19453cm);
            pAGConfig.wqx(this.my);
            pAGConfig.jpo(this.f19454jd);
            pAGConfig.wqx(this.zz);
            pAGConfig.jpo(this.f19458yd);
            pAGConfig.cm(this.f19456ju);
            return pAGConfig;
        }

        public Builder debugLog(boolean z10) {
            this.f19454jd = z10;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.xyk = strArr;
            return this;
        }

        public Builder setAdxId(String str) {
            this.f19456ju = str;
            return this;
        }

        public Builder setGDPRConsent(int i10) {
            this.f19453cm = i10;
            return this;
        }

        public Builder setPAConsent(int i10) {
            if (i10 == 0 || i10 == 1) {
                this.my = i10;
                return this;
            }
            this.my = -2;
            return this;
        }

        public Builder setPackageName(String str) {
            this.zz = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.f19458yd = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z10) {
            this.f19457qk = z10;
            return this;
        }

        public Builder titleBarTheme(int i10) {
            this.f19455jj = i10;
            return this;
        }

        public Builder useTextureView(boolean z10) {
            return this;
        }
    }
}
