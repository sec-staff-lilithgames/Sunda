package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsentv3.ui.AppConsentTheme;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACConfiguration {
    private final AppConsentTheme appConsentTheme;
    private final boolean forceApplyGDPR;
    private final boolean fullScreenMode;
    private final boolean isNeedToDisplayButtonsAtVertical;
    private final boolean isNeedToReplaceUrlViewerByQrCode;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private AppConsentTheme appConsentTheme;
        private boolean forceApplyGDPR;
        private boolean fullScreenMode;
        private boolean isNeedToDisplayButtonsAtVertical;
        private boolean isNeedToReplaceUrlViewerByQrCode;

        public final ACConfiguration build() {
            return new ACConfiguration(this, null);
        }

        public final Builder defineAppConsentTheme(AppConsentTheme appConsentTheme) {
            e0.checkNotNullParameter(appConsentTheme, "appConsentTheme");
            this.appConsentTheme = appConsentTheme;
            return this;
        }

        public final AppConsentTheme getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease() {
            return this.appConsentTheme;
        }

        public final boolean getForceApplyGDPR$appconsent_ui_v3_prodXchangeRelease() {
            return this.forceApplyGDPR;
        }

        public final boolean getFullScreenMode$appconsent_ui_v3_prodXchangeRelease() {
            return this.fullScreenMode;
        }

        public final boolean isNeedToDisplayButtonsAtVertical$appconsent_ui_v3_prodXchangeRelease() {
            return this.isNeedToDisplayButtonsAtVertical;
        }

        public final boolean isNeedToReplaceUrlViewerByQrCode$appconsent_ui_v3_prodXchangeRelease() {
            return this.isNeedToReplaceUrlViewerByQrCode;
        }

        public final void setAppConsentTheme$appconsent_ui_v3_prodXchangeRelease(AppConsentTheme appConsentTheme) {
            this.appConsentTheme = appConsentTheme;
        }

        public final Builder setForceApplyGDPR(boolean z10) {
            this.forceApplyGDPR = z10;
            return this;
        }

        public final void setForceApplyGDPR$appconsent_ui_v3_prodXchangeRelease(boolean z10) {
            this.forceApplyGDPR = z10;
        }

        public final Builder setFullScreenMode(boolean z10) {
            this.fullScreenMode = z10;
            return this;
        }

        public final void setFullScreenMode$appconsent_ui_v3_prodXchangeRelease(boolean z10) {
            this.fullScreenMode = z10;
        }

        public final void setNeedToDisplayButtonsAtVertical$appconsent_ui_v3_prodXchangeRelease(boolean z10) {
            this.isNeedToDisplayButtonsAtVertical = z10;
        }

        public final Builder setNeedToDisplayValidationButtonsVertically(boolean z10) {
            this.isNeedToDisplayButtonsAtVertical = z10;
            return this;
        }

        public final Builder setNeedToReplaceUrlViewerByQrCode(boolean z10) {
            this.isNeedToReplaceUrlViewerByQrCode = z10;
            return this;
        }

        public final void setNeedToReplaceUrlViewerByQrCode$appconsent_ui_v3_prodXchangeRelease(boolean z10) {
            this.isNeedToReplaceUrlViewerByQrCode = z10;
        }
    }

    public /* synthetic */ ACConfiguration(Builder builder, u uVar) {
        this(builder);
    }

    public final AppConsentTheme getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease() {
        return this.appConsentTheme;
    }

    public final boolean getForceApplyGDPR$appconsent_ui_v3_prodXchangeRelease() {
        return this.forceApplyGDPR;
    }

    public final boolean getFullScreenMode$appconsent_ui_v3_prodXchangeRelease() {
        return this.fullScreenMode;
    }

    public final boolean isNeedToDisplayButtonsAtVertical$appconsent_ui_v3_prodXchangeRelease() {
        return this.isNeedToDisplayButtonsAtVertical;
    }

    public final boolean isNeedToReplaceUrlViewerByQrCode$appconsent_ui_v3_prodXchangeRelease() {
        return this.isNeedToReplaceUrlViewerByQrCode;
    }

    private ACConfiguration(Builder builder) {
        this.appConsentTheme = builder.getAppConsentTheme$appconsent_ui_v3_prodXchangeRelease();
        this.forceApplyGDPR = builder.getForceApplyGDPR$appconsent_ui_v3_prodXchangeRelease();
        this.fullScreenMode = builder.getFullScreenMode$appconsent_ui_v3_prodXchangeRelease();
        this.isNeedToDisplayButtonsAtVertical = builder.isNeedToDisplayButtonsAtVertical$appconsent_ui_v3_prodXchangeRelease();
        this.isNeedToReplaceUrlViewerByQrCode = builder.isNeedToReplaceUrlViewerByQrCode$appconsent_ui_v3_prodXchangeRelease();
    }
}
