package com.sfbx.appconsentv3.ui.model;

import a.b;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import e3.g;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigurationCore {
    private final Map<String, Integer> actions;
    private final Map<String, String> colors;
    private final Map<String, Boolean> configs;
    private final boolean continueWithoutAccepting;
    private final int ctaLayout;
    private final boolean enableIllustrations;
    private final boolean enableLegintOnRefuseAll;
    private final boolean highlightAcceptAllButton;
    private final Map<String, String> images;
    private final String language;
    private final Map<String, I18NStringCore> texts;
    private final boolean useBanner;
    private final boolean useSuccessScreen;
    private final List<Integer> xchangeVendors;

    public ConfigurationCore() {
        this(null, null, null, false, 0, false, false, null, null, null, null, false, false, false, 16383, null);
    }

    public final String component1() {
        return this.language;
    }

    public final Map<String, String> component10() {
        return this.colors;
    }

    public final Map<String, Boolean> component11() {
        return this.configs;
    }

    public final boolean component12() {
        return this.enableLegintOnRefuseAll;
    }

    public final boolean component13() {
        return this.continueWithoutAccepting;
    }

    public final boolean component14() {
        return this.enableIllustrations;
    }

    public final List<Integer> component2() {
        return this.xchangeVendors;
    }

    public final Map<String, I18NStringCore> component3() {
        return this.texts;
    }

    public final boolean component4() {
        return this.useBanner;
    }

    public final int component5() {
        return this.ctaLayout;
    }

    public final boolean component6() {
        return this.highlightAcceptAllButton;
    }

    public final boolean component7() {
        return this.useSuccessScreen;
    }

    public final Map<String, String> component8() {
        return this.images;
    }

    public final Map<String, Integer> component9() {
        return this.actions;
    }

    public final ConfigurationCore copy(String language, List<Integer> xchangeVendors, Map<String, I18NStringCore> texts, boolean z10, int i10, boolean z11, boolean z12, Map<String, String> images, Map<String, Integer> actions, Map<String, String> colors, Map<String, Boolean> configs, boolean z13, boolean z14, boolean z15) {
        e0.checkNotNullParameter(language, "language");
        e0.checkNotNullParameter(xchangeVendors, "xchangeVendors");
        e0.checkNotNullParameter(texts, "texts");
        e0.checkNotNullParameter(images, "images");
        e0.checkNotNullParameter(actions, "actions");
        e0.checkNotNullParameter(colors, "colors");
        e0.checkNotNullParameter(configs, "configs");
        return new ConfigurationCore(language, xchangeVendors, texts, z10, i10, z11, z12, images, actions, colors, configs, z13, z14, z15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigurationCore)) {
            return false;
        }
        ConfigurationCore configurationCore = (ConfigurationCore) obj;
        return e0.areEqual(this.language, configurationCore.language) && e0.areEqual(this.xchangeVendors, configurationCore.xchangeVendors) && e0.areEqual(this.texts, configurationCore.texts) && this.useBanner == configurationCore.useBanner && this.ctaLayout == configurationCore.ctaLayout && this.highlightAcceptAllButton == configurationCore.highlightAcceptAllButton && this.useSuccessScreen == configurationCore.useSuccessScreen && e0.areEqual(this.images, configurationCore.images) && e0.areEqual(this.actions, configurationCore.actions) && e0.areEqual(this.colors, configurationCore.colors) && e0.areEqual(this.configs, configurationCore.configs) && this.enableLegintOnRefuseAll == configurationCore.enableLegintOnRefuseAll && this.continueWithoutAccepting == configurationCore.continueWithoutAccepting && this.enableIllustrations == configurationCore.enableIllustrations;
    }

    public final Map<String, Integer> getActions() {
        return this.actions;
    }

    public final Map<String, String> getColors() {
        return this.colors;
    }

    public final Map<String, Boolean> getConfigs() {
        return this.configs;
    }

    public final boolean getContinueWithoutAccepting() {
        return this.continueWithoutAccepting;
    }

    public final int getCtaLayout() {
        return this.ctaLayout;
    }

    public final boolean getEnableIllustrations() {
        return this.enableIllustrations;
    }

    public final boolean getEnableLegintOnRefuseAll() {
        return this.enableLegintOnRefuseAll;
    }

    public final boolean getHighlightAcceptAllButton() {
        return this.highlightAcceptAllButton;
    }

    public final Map<String, String> getImages() {
        return this.images;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Map<String, I18NStringCore> getTexts() {
        return this.texts;
    }

    public final boolean getUseBanner() {
        return this.useBanner;
    }

    public final boolean getUseSuccessScreen() {
        return this.useSuccessScreen;
    }

    public final List<Integer> getXchangeVendors() {
        return this.xchangeVendors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iF = o2.f(this.texts, j1.o2.c(this.language.hashCode() * 31, 31, this.xchangeVendors), 31);
        boolean z10 = this.useBanner;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iD = g.d(this.ctaLayout, (iF + i10) * 31, 31);
        boolean z11 = this.highlightAcceptAllButton;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (iD + i11) * 31;
        boolean z12 = this.useSuccessScreen;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int iF2 = o2.f(this.configs, o2.f(this.colors, o2.f(this.actions, o2.f(this.images, (i12 + i13) * 31, 31), 31), 31), 31);
        boolean z13 = this.enableLegintOnRefuseAll;
        int i14 = z13;
        if (z13 != 0) {
            i14 = 1;
        }
        int i15 = (iF2 + i14) * 31;
        boolean z14 = this.continueWithoutAccepting;
        int i16 = z14;
        if (z14 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z15 = this.enableIllustrations;
        return i17 + (z15 ? 1 : z15 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigurationCore(language=");
        sb2.append(this.language);
        sb2.append(", xchangeVendors=");
        sb2.append(this.xchangeVendors);
        sb2.append(", texts=");
        sb2.append(this.texts);
        sb2.append(", useBanner=");
        sb2.append(this.useBanner);
        sb2.append(", ctaLayout=");
        sb2.append(this.ctaLayout);
        sb2.append(", highlightAcceptAllButton=");
        sb2.append(this.highlightAcceptAllButton);
        sb2.append(", useSuccessScreen=");
        sb2.append(this.useSuccessScreen);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", colors=");
        sb2.append(this.colors);
        sb2.append(", configs=");
        sb2.append(this.configs);
        sb2.append(", enableLegintOnRefuseAll=");
        sb2.append(this.enableLegintOnRefuseAll);
        sb2.append(", continueWithoutAccepting=");
        sb2.append(this.continueWithoutAccepting);
        sb2.append(", enableIllustrations=");
        return b.p(sb2, this.enableIllustrations, ')');
    }

    public ConfigurationCore(String language, List<Integer> xchangeVendors, Map<String, I18NStringCore> texts, boolean z10, int i10, boolean z11, boolean z12, Map<String, String> images, Map<String, Integer> actions, Map<String, String> colors, Map<String, Boolean> configs, boolean z13, boolean z14, boolean z15) {
        e0.checkNotNullParameter(language, "language");
        e0.checkNotNullParameter(xchangeVendors, "xchangeVendors");
        e0.checkNotNullParameter(texts, "texts");
        e0.checkNotNullParameter(images, "images");
        e0.checkNotNullParameter(actions, "actions");
        e0.checkNotNullParameter(colors, "colors");
        e0.checkNotNullParameter(configs, "configs");
        this.language = language;
        this.xchangeVendors = xchangeVendors;
        this.texts = texts;
        this.useBanner = z10;
        this.ctaLayout = i10;
        this.highlightAcceptAllButton = z11;
        this.useSuccessScreen = z12;
        this.images = images;
        this.actions = actions;
        this.colors = colors;
        this.configs = configs;
        this.enableLegintOnRefuseAll = z13;
        this.continueWithoutAccepting = z14;
        this.enableIllustrations = z15;
    }

    public /* synthetic */ ConfigurationCore(String str, List list, Map map, boolean z10, int i10, boolean z11, boolean z12, Map map2, Map map3, Map map4, Map map5, boolean z13, boolean z14, boolean z15, int i11, u uVar) {
        this((i11 & 1) != 0 ? "en" : str, (i11 & 2) != 0 ? p0.emptyList() : list, (i11 & 4) != 0 ? p1.emptyMap() : map, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? 0 : i10, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? p1.emptyMap() : map2, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? p1.emptyMap() : map3, (i11 & 512) != 0 ? p1.emptyMap() : map4, (i11 & 1024) != 0 ? p1.emptyMap() : map5, (i11 & 2048) != 0 ? false : z13, (i11 & 4096) != 0 ? false : z14, (i11 & Segment.SIZE) != 0 ? false : z15);
    }
}
