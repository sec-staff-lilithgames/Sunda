package com.sfbx.appconsent.core.model.api.proto;

import a.b;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import e3.g;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p0.o2;
import tu.f;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class Configuration {
    public static final Companion Companion = new Companion(null);
    private final Map<String, Integer> actions;
    private final Map<String, String> colors;
    private final Map<String, Boolean> configs;
    private final boolean continueWithoutAccepting;
    private final int ctaLayout;
    private final boolean enableIllustrations;
    private final boolean enableLegintOnRefuseAll;
    private final boolean highlightAcceptAllButton;
    private final Map<String, String> images;
    private final boolean isNotNeedToDisplayPurposesExampleUsage;
    private final String language;
    private final Map<String, I18NString> texts;
    private final boolean useBanner;
    private final boolean useSuccessScreen;
    private final List<Integer> xchangeVendors;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<Configuration> serializer() {
            return Configuration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Configuration() {
        this((String) null, (List) null, (Map) null, false, 0, false, false, (Map) null, (Map) null, (Map) null, (Map) null, false, false, false, false, 32767, (u) null);
    }

    public static final void write$Self(Configuration self, CompositeEncoder output, SerialDescriptor serialDesc) {
        e0.checkNotNullParameter(self, "self");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !e0.areEqual(self.language, "en")) {
            output.encodeStringElement(serialDesc, 0, self.language);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !e0.areEqual(self.xchangeVendors, p0.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(IntSerializer.INSTANCE), self.xchangeVendors);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !e0.areEqual(self.texts, p1.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 2, new LinkedHashMapSerializer(StringSerializer.INSTANCE, I18NString$$serializer.INSTANCE), self.texts);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.useBanner) {
            output.encodeBooleanElement(serialDesc, 3, self.useBanner);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.ctaLayout != 0) {
            output.encodeIntElement(serialDesc, 4, self.ctaLayout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.highlightAcceptAllButton) {
            output.encodeBooleanElement(serialDesc, 5, self.highlightAcceptAllButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.useSuccessScreen) {
            output.encodeBooleanElement(serialDesc, 6, self.useSuccessScreen);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !e0.areEqual(self.images, p1.emptyMap())) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 7, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.images);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !e0.areEqual(self.actions, p1.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 8, new LinkedHashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE), self.actions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !e0.areEqual(self.colors, p1.emptyMap())) {
            StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 9, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), self.colors);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !e0.areEqual(self.configs, p1.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 10, new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE), self.configs);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.enableLegintOnRefuseAll) {
            output.encodeBooleanElement(serialDesc, 11, self.enableLegintOnRefuseAll);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.continueWithoutAccepting) {
            output.encodeBooleanElement(serialDesc, 12, self.continueWithoutAccepting);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.enableIllustrations) {
            output.encodeBooleanElement(serialDesc, 13, self.enableIllustrations);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.isNotNeedToDisplayPurposesExampleUsage) {
            output.encodeBooleanElement(serialDesc, 14, self.isNotNeedToDisplayPurposesExampleUsage);
        }
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

    public final boolean component15() {
        return this.isNotNeedToDisplayPurposesExampleUsage;
    }

    public final List<Integer> component2() {
        return this.xchangeVendors;
    }

    public final Map<String, I18NString> component3() {
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

    public final Configuration copy(String language, List<Integer> xchangeVendors, Map<String, I18NString> texts, boolean z10, int i10, boolean z11, boolean z12, Map<String, String> images, Map<String, Integer> actions, Map<String, String> colors, Map<String, Boolean> configs, boolean z13, boolean z14, boolean z15, boolean z16) {
        e0.checkNotNullParameter(language, "language");
        e0.checkNotNullParameter(xchangeVendors, "xchangeVendors");
        e0.checkNotNullParameter(texts, "texts");
        e0.checkNotNullParameter(images, "images");
        e0.checkNotNullParameter(actions, "actions");
        e0.checkNotNullParameter(colors, "colors");
        e0.checkNotNullParameter(configs, "configs");
        return new Configuration(language, xchangeVendors, texts, z10, i10, z11, z12, images, actions, colors, configs, z13, z14, z15, z16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return e0.areEqual(this.language, configuration.language) && e0.areEqual(this.xchangeVendors, configuration.xchangeVendors) && e0.areEqual(this.texts, configuration.texts) && this.useBanner == configuration.useBanner && this.ctaLayout == configuration.ctaLayout && this.highlightAcceptAllButton == configuration.highlightAcceptAllButton && this.useSuccessScreen == configuration.useSuccessScreen && e0.areEqual(this.images, configuration.images) && e0.areEqual(this.actions, configuration.actions) && e0.areEqual(this.colors, configuration.colors) && e0.areEqual(this.configs, configuration.configs) && this.enableLegintOnRefuseAll == configuration.enableLegintOnRefuseAll && this.continueWithoutAccepting == configuration.continueWithoutAccepting && this.enableIllustrations == configuration.enableIllustrations && this.isNotNeedToDisplayPurposesExampleUsage == configuration.isNotNeedToDisplayPurposesExampleUsage;
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

    public final Map<String, I18NString> getTexts() {
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
        int i18 = z15;
        if (z15 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z16 = this.isNotNeedToDisplayPurposesExampleUsage;
        return i19 + (z16 ? 1 : z16 ? 1 : 0);
    }

    public final boolean isNotNeedToDisplayPurposesExampleUsage() {
        return this.isNotNeedToDisplayPurposesExampleUsage;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(language=");
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
        sb2.append(this.enableIllustrations);
        sb2.append(", isNotNeedToDisplayPurposesExampleUsage=");
        return b.p(sb2, this.isNotNeedToDisplayPurposesExampleUsage, ')');
    }

    @f
    public /* synthetic */ Configuration(int i10, @SerialName("fallback_language") String str, @SerialName("xchange_vendors") List list, Map map, boolean z10, int i11, boolean z11, boolean z12, Map map2, Map map3, Map map4, Map map5, boolean z13, boolean z14, boolean z15, @SerialName("not_banner_display_purposes_list") boolean z16, SerializationConstructorMarker serializationConstructorMarker) {
        this.language = (i10 & 1) == 0 ? "en" : str;
        if ((i10 & 2) == 0) {
            this.xchangeVendors = p0.emptyList();
        } else {
            this.xchangeVendors = list;
        }
        if ((i10 & 4) == 0) {
            this.texts = p1.emptyMap();
        } else {
            this.texts = map;
        }
        if ((i10 & 8) == 0) {
            this.useBanner = false;
        } else {
            this.useBanner = z10;
        }
        if ((i10 & 16) == 0) {
            this.ctaLayout = 0;
        } else {
            this.ctaLayout = i11;
        }
        if ((i10 & 32) == 0) {
            this.highlightAcceptAllButton = false;
        } else {
            this.highlightAcceptAllButton = z11;
        }
        if ((i10 & 64) == 0) {
            this.useSuccessScreen = false;
        } else {
            this.useSuccessScreen = z12;
        }
        if ((i10 & 128) == 0) {
            this.images = p1.emptyMap();
        } else {
            this.images = map2;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.actions = p1.emptyMap();
        } else {
            this.actions = map3;
        }
        if ((i10 & 512) == 0) {
            this.colors = p1.emptyMap();
        } else {
            this.colors = map4;
        }
        if ((i10 & 1024) == 0) {
            this.configs = p1.emptyMap();
        } else {
            this.configs = map5;
        }
        if ((i10 & 2048) == 0) {
            this.enableLegintOnRefuseAll = false;
        } else {
            this.enableLegintOnRefuseAll = z13;
        }
        if ((i10 & 4096) == 0) {
            this.continueWithoutAccepting = false;
        } else {
            this.continueWithoutAccepting = z14;
        }
        if ((i10 & Segment.SIZE) == 0) {
            this.enableIllustrations = false;
        } else {
            this.enableIllustrations = z15;
        }
        if ((i10 & 16384) == 0) {
            this.isNotNeedToDisplayPurposesExampleUsage = false;
        } else {
            this.isNotNeedToDisplayPurposesExampleUsage = z16;
        }
    }

    public Configuration(String language, List<Integer> xchangeVendors, Map<String, I18NString> texts, boolean z10, int i10, boolean z11, boolean z12, Map<String, String> images, Map<String, Integer> actions, Map<String, String> colors, Map<String, Boolean> configs, boolean z13, boolean z14, boolean z15, boolean z16) {
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
        this.isNotNeedToDisplayPurposesExampleUsage = z16;
    }

    @SerialName("fallback_language")
    public static /* synthetic */ void getLanguage$annotations() {
    }

    @SerialName("xchange_vendors")
    public static /* synthetic */ void getXchangeVendors$annotations() {
    }

    @SerialName("not_banner_display_purposes_list")
    public static /* synthetic */ void isNotNeedToDisplayPurposesExampleUsage$annotations() {
    }

    public /* synthetic */ Configuration(String str, List list, Map map, boolean z10, int i10, boolean z11, boolean z12, Map map2, Map map3, Map map4, Map map5, boolean z13, boolean z14, boolean z15, boolean z16, int i11, u uVar) {
        this((i11 & 1) != 0 ? "en" : str, (i11 & 2) != 0 ? p0.emptyList() : list, (i11 & 4) != 0 ? p1.emptyMap() : map, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? 0 : i10, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? p1.emptyMap() : map2, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? p1.emptyMap() : map3, (i11 & 512) != 0 ? p1.emptyMap() : map4, (i11 & 1024) != 0 ? p1.emptyMap() : map5, (i11 & 2048) != 0 ? false : z13, (i11 & 4096) != 0 ? false : z14, (i11 & Segment.SIZE) != 0 ? false : z15, (i11 & 16384) != 0 ? false : z16);
    }
}
