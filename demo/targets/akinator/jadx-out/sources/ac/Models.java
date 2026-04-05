package ac;

import com.fyber.inneractive.sdk.player.exoplayer2.text.Ir.NyKZx;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class Models {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ac.Models$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Configuration extends GeneratedMessageLite<Configuration, Builder> implements ConfigurationOrBuilder {
        public static final int ACTIONS_FIELD_NUMBER = 13;
        public static final int BANNERMODE_FIELD_NUMBER = 18;
        public static final int CMP_DISPLAY_MODE_FIELD_NUMBER = 23;
        public static final int COLORS_FIELD_NUMBER = 14;
        public static final int CONFIGS_FIELD_NUMBER = 15;
        public static final int CONSENT_EXPIRATIONS_FIELD_NUMBER = 24;
        public static final int CONTINUE_WITHOUT_ACCEPTING_FIELD_NUMBER = 19;
        public static final int CTALAYOUT_FIELD_NUMBER = 10;
        public static final int CUSTOM_CSS_AMP_FIELD_NUMBER = 22;
        public static final int CUSTOM_CSS_FIELD_NUMBER = 4;
        public static final int CUSTOM_JS_FIELD_NUMBER = 16;
        private static final Configuration DEFAULT_INSTANCE;
        public static final int ENABLELEGINTONREFUSEALL_FIELD_NUMBER = 21;
        public static final int ENABLE_ILLUSTRATIONS_FIELD_NUMBER = 26;
        public static final int FALLBACK_LANGUAGE_FIELD_NUMBER = 1;
        public static final int GCM_ADS_DATA_REDACTION_FIELD_NUMBER = 28;
        public static final int GCM_URL_PASSTHROUGH_FIELD_NUMBER = 27;
        public static final int HIGHLIGHT_ACCEPT_ALL_BUTTON_FIELD_NUMBER = 25;
        public static final int IMAGES_FIELD_NUMBER = 12;
        public static final int NOT_BANNER_DISPLAY_PURPOSES_LIST_FIELD_NUMBER = 29;
        private static volatile Parser<Configuration> PARSER = null;
        public static final int TEXTS_FIELD_NUMBER = 3;
        public static final int USEBANNER_FIELD_NUMBER = 9;
        public static final int USESUCCESSSCREEN_FIELD_NUMBER = 11;
        public static final int USE_IOS_ATT_FIELD_NUMBER = 20;
        public static final int XCHANGE_FIELD_NUMBER = 17;
        public static final int XCHANGE_VENDORS_FIELD_NUMBER = 2;
        private int bannerMode_;
        private int cmpDisplayMode_;
        private ConsentExpirations consentExpirations_;
        private boolean continueWithoutAccepting_;
        private int ctaLayout_;
        private boolean enableIllustrations_;
        private boolean enableLegintOnRefuseAll_;
        private boolean gcmAdsDataRedaction_;
        private boolean gcmUrlPassthrough_;
        private boolean highlightAcceptAllButton_;
        private boolean notBannerDisplayPurposesList_;
        private boolean useBanner_;
        private boolean useIosAtt_;
        private boolean useSuccessScreen_;
        private boolean xchange_;
        private MapFieldLite<String, I18NString> texts_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, String> images_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, Integer> actions_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, String> colors_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, Boolean> configs_ = MapFieldLite.emptyMapField();
        private String fallbackLanguage_ = "";
        private Internal.IntList xchangeVendors_ = GeneratedMessageLite.emptyIntList();
        private String customCss_ = "";
        private String customJs_ = "";
        private String customCssAmp_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ActionsDefaultEntryHolder {
            static final MapEntryLite<String, Integer> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.INT32, 0);

            private ActionsDefaultEntryHolder() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<Configuration, Builder> implements ConfigurationOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllXchangeVendors(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Configuration) this.instance).addAllXchangeVendors(iterable);
                return this;
            }

            public Builder addXchangeVendors(int i10) {
                copyOnWrite();
                ((Configuration) this.instance).addXchangeVendors(i10);
                return this;
            }

            public Builder clearActions() {
                copyOnWrite();
                ((Configuration) this.instance).getMutableActionsMap().clear();
                return this;
            }

            public Builder clearBannerMode() {
                copyOnWrite();
                ((Configuration) this.instance).clearBannerMode();
                return this;
            }

            public Builder clearCmpDisplayMode() {
                copyOnWrite();
                ((Configuration) this.instance).clearCmpDisplayMode();
                return this;
            }

            public Builder clearColors() {
                copyOnWrite();
                ((Configuration) this.instance).getMutableColorsMap().clear();
                return this;
            }

            public Builder clearConfigs() {
                copyOnWrite();
                ((Configuration) this.instance).getMutableConfigsMap().clear();
                return this;
            }

            public Builder clearConsentExpirations() {
                copyOnWrite();
                ((Configuration) this.instance).clearConsentExpirations();
                return this;
            }

            public Builder clearContinueWithoutAccepting() {
                copyOnWrite();
                ((Configuration) this.instance).clearContinueWithoutAccepting();
                return this;
            }

            public Builder clearCtaLayout() {
                copyOnWrite();
                ((Configuration) this.instance).clearCtaLayout();
                return this;
            }

            public Builder clearCustomCss() {
                copyOnWrite();
                ((Configuration) this.instance).clearCustomCss();
                return this;
            }

            public Builder clearCustomCssAmp() {
                copyOnWrite();
                ((Configuration) this.instance).clearCustomCssAmp();
                return this;
            }

            public Builder clearCustomJs() {
                copyOnWrite();
                ((Configuration) this.instance).clearCustomJs();
                return this;
            }

            public Builder clearEnableIllustrations() {
                copyOnWrite();
                ((Configuration) this.instance).clearEnableIllustrations();
                return this;
            }

            public Builder clearEnableLegintOnRefuseAll() {
                copyOnWrite();
                ((Configuration) this.instance).clearEnableLegintOnRefuseAll();
                return this;
            }

            public Builder clearFallbackLanguage() {
                copyOnWrite();
                ((Configuration) this.instance).clearFallbackLanguage();
                return this;
            }

            public Builder clearGcmAdsDataRedaction() {
                copyOnWrite();
                ((Configuration) this.instance).clearGcmAdsDataRedaction();
                return this;
            }

            public Builder clearGcmUrlPassthrough() {
                copyOnWrite();
                ((Configuration) this.instance).clearGcmUrlPassthrough();
                return this;
            }

            public Builder clearHighlightAcceptAllButton() {
                copyOnWrite();
                ((Configuration) this.instance).clearHighlightAcceptAllButton();
                return this;
            }

            public Builder clearImages() {
                copyOnWrite();
                ((Configuration) this.instance).getMutableImagesMap().clear();
                return this;
            }

            public Builder clearNotBannerDisplayPurposesList() {
                copyOnWrite();
                ((Configuration) this.instance).clearNotBannerDisplayPurposesList();
                return this;
            }

            public Builder clearTexts() {
                copyOnWrite();
                ((Configuration) this.instance).getMutableTextsMap().clear();
                return this;
            }

            public Builder clearUseBanner() {
                copyOnWrite();
                ((Configuration) this.instance).clearUseBanner();
                return this;
            }

            public Builder clearUseIosAtt() {
                copyOnWrite();
                ((Configuration) this.instance).clearUseIosAtt();
                return this;
            }

            public Builder clearUseSuccessScreen() {
                copyOnWrite();
                ((Configuration) this.instance).clearUseSuccessScreen();
                return this;
            }

            public Builder clearXchange() {
                copyOnWrite();
                ((Configuration) this.instance).clearXchange();
                return this;
            }

            public Builder clearXchangeVendors() {
                copyOnWrite();
                ((Configuration) this.instance).clearXchangeVendors();
                return this;
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean containsActions(String str) {
                str.getClass();
                return ((Configuration) this.instance).getActionsMap().containsKey(str);
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean containsColors(String str) {
                str.getClass();
                return ((Configuration) this.instance).getColorsMap().containsKey(str);
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean containsConfigs(String str) {
                str.getClass();
                return ((Configuration) this.instance).getConfigsMap().containsKey(str);
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean containsImages(String str) {
                str.getClass();
                return ((Configuration) this.instance).getImagesMap().containsKey(str);
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean containsTexts(String str) {
                str.getClass();
                return ((Configuration) this.instance).getTextsMap().containsKey(str);
            }

            @Override // ac.Models.ConfigurationOrBuilder
            @Deprecated
            public Map<String, Integer> getActions() {
                return getActionsMap();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getActionsCount() {
                return ((Configuration) this.instance).getActionsMap().size();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public Map<String, Integer> getActionsMap() {
                return Collections.unmodifiableMap(((Configuration) this.instance).getActionsMap());
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getActionsOrDefault(String str, int i10) {
                str.getClass();
                Map<String, Integer> actionsMap = ((Configuration) this.instance).getActionsMap();
                return actionsMap.containsKey(str) ? actionsMap.get(str).intValue() : i10;
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getActionsOrThrow(String str) {
                str.getClass();
                Map<String, Integer> actionsMap = ((Configuration) this.instance).getActionsMap();
                if (actionsMap.containsKey(str)) {
                    return actionsMap.get(str).intValue();
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public EnumBannerMode getBannerMode() {
                return ((Configuration) this.instance).getBannerMode();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getBannerModeValue() {
                return ((Configuration) this.instance).getBannerModeValue();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public CmpDisplayMode getCmpDisplayMode() {
                return ((Configuration) this.instance).getCmpDisplayMode();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getCmpDisplayModeValue() {
                return ((Configuration) this.instance).getCmpDisplayModeValue();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            @Deprecated
            public Map<String, String> getColors() {
                return getColorsMap();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getColorsCount() {
                return ((Configuration) this.instance).getColorsMap().size();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public Map<String, String> getColorsMap() {
                return Collections.unmodifiableMap(((Configuration) this.instance).getColorsMap());
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public String getColorsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> colorsMap = ((Configuration) this.instance).getColorsMap();
                return colorsMap.containsKey(str) ? colorsMap.get(str) : str2;
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public String getColorsOrThrow(String str) {
                str.getClass();
                Map<String, String> colorsMap = ((Configuration) this.instance).getColorsMap();
                if (colorsMap.containsKey(str)) {
                    return colorsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            @Deprecated
            public Map<String, Boolean> getConfigs() {
                return getConfigsMap();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getConfigsCount() {
                return ((Configuration) this.instance).getConfigsMap().size();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public Map<String, Boolean> getConfigsMap() {
                return Collections.unmodifiableMap(((Configuration) this.instance).getConfigsMap());
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getConfigsOrDefault(String str, boolean z10) {
                str.getClass();
                Map<String, Boolean> configsMap = ((Configuration) this.instance).getConfigsMap();
                return configsMap.containsKey(str) ? configsMap.get(str).booleanValue() : z10;
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getConfigsOrThrow(String str) {
                str.getClass();
                Map<String, Boolean> configsMap = ((Configuration) this.instance).getConfigsMap();
                if (configsMap.containsKey(str)) {
                    return configsMap.get(str).booleanValue();
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public ConsentExpirations getConsentExpirations() {
                return ((Configuration) this.instance).getConsentExpirations();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getContinueWithoutAccepting() {
                return ((Configuration) this.instance).getContinueWithoutAccepting();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getCtaLayout() {
                return ((Configuration) this.instance).getCtaLayout();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public String getCustomCss() {
                return ((Configuration) this.instance).getCustomCss();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public String getCustomCssAmp() {
                return ((Configuration) this.instance).getCustomCssAmp();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public ByteString getCustomCssAmpBytes() {
                return ((Configuration) this.instance).getCustomCssAmpBytes();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public ByteString getCustomCssBytes() {
                return ((Configuration) this.instance).getCustomCssBytes();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public String getCustomJs() {
                return ((Configuration) this.instance).getCustomJs();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public ByteString getCustomJsBytes() {
                return ((Configuration) this.instance).getCustomJsBytes();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getEnableIllustrations() {
                return ((Configuration) this.instance).getEnableIllustrations();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getEnableLegintOnRefuseAll() {
                return ((Configuration) this.instance).getEnableLegintOnRefuseAll();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public String getFallbackLanguage() {
                return ((Configuration) this.instance).getFallbackLanguage();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public ByteString getFallbackLanguageBytes() {
                return ((Configuration) this.instance).getFallbackLanguageBytes();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getGcmAdsDataRedaction() {
                return ((Configuration) this.instance).getGcmAdsDataRedaction();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getGcmUrlPassthrough() {
                return ((Configuration) this.instance).getGcmUrlPassthrough();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getHighlightAcceptAllButton() {
                return ((Configuration) this.instance).getHighlightAcceptAllButton();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            @Deprecated
            public Map<String, String> getImages() {
                return getImagesMap();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getImagesCount() {
                return ((Configuration) this.instance).getImagesMap().size();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public Map<String, String> getImagesMap() {
                return Collections.unmodifiableMap(((Configuration) this.instance).getImagesMap());
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public String getImagesOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> imagesMap = ((Configuration) this.instance).getImagesMap();
                return imagesMap.containsKey(str) ? imagesMap.get(str) : str2;
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public String getImagesOrThrow(String str) {
                str.getClass();
                Map<String, String> imagesMap = ((Configuration) this.instance).getImagesMap();
                if (imagesMap.containsKey(str)) {
                    return imagesMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getNotBannerDisplayPurposesList() {
                return ((Configuration) this.instance).getNotBannerDisplayPurposesList();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            @Deprecated
            public Map<String, I18NString> getTexts() {
                return getTextsMap();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getTextsCount() {
                return ((Configuration) this.instance).getTextsMap().size();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public Map<String, I18NString> getTextsMap() {
                return Collections.unmodifiableMap(((Configuration) this.instance).getTextsMap());
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public I18NString getTextsOrDefault(String str, I18NString i18NString) {
                str.getClass();
                Map<String, I18NString> textsMap = ((Configuration) this.instance).getTextsMap();
                return textsMap.containsKey(str) ? textsMap.get(str) : i18NString;
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public I18NString getTextsOrThrow(String str) {
                str.getClass();
                Map<String, I18NString> textsMap = ((Configuration) this.instance).getTextsMap();
                if (textsMap.containsKey(str)) {
                    return textsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getUseBanner() {
                return ((Configuration) this.instance).getUseBanner();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getUseIosAtt() {
                return ((Configuration) this.instance).getUseIosAtt();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getUseSuccessScreen() {
                return ((Configuration) this.instance).getUseSuccessScreen();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean getXchange() {
                return ((Configuration) this.instance).getXchange();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getXchangeVendors(int i10) {
                return ((Configuration) this.instance).getXchangeVendors(i10);
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public int getXchangeVendorsCount() {
                return ((Configuration) this.instance).getXchangeVendorsCount();
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public List<Integer> getXchangeVendorsList() {
                return Collections.unmodifiableList(((Configuration) this.instance).getXchangeVendorsList());
            }

            @Override // ac.Models.ConfigurationOrBuilder
            public boolean hasConsentExpirations() {
                return ((Configuration) this.instance).hasConsentExpirations();
            }

            public Builder mergeConsentExpirations(ConsentExpirations consentExpirations) {
                copyOnWrite();
                ((Configuration) this.instance).mergeConsentExpirations(consentExpirations);
                return this;
            }

            public Builder putActions(String str, int i10) {
                str.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableActionsMap().put(str, Integer.valueOf(i10));
                return this;
            }

            public Builder putAllActions(Map<String, Integer> map) {
                copyOnWrite();
                ((Configuration) this.instance).getMutableActionsMap().putAll(map);
                return this;
            }

            public Builder putAllColors(Map<String, String> map) {
                copyOnWrite();
                ((Configuration) this.instance).getMutableColorsMap().putAll(map);
                return this;
            }

            public Builder putAllConfigs(Map<String, Boolean> map) {
                copyOnWrite();
                ((Configuration) this.instance).getMutableConfigsMap().putAll(map);
                return this;
            }

            public Builder putAllImages(Map<String, String> map) {
                copyOnWrite();
                ((Configuration) this.instance).getMutableImagesMap().putAll(map);
                return this;
            }

            public Builder putAllTexts(Map<String, I18NString> map) {
                copyOnWrite();
                ((Configuration) this.instance).getMutableTextsMap().putAll(map);
                return this;
            }

            public Builder putColors(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableColorsMap().put(str, str2);
                return this;
            }

            public Builder putConfigs(String str, boolean z10) {
                str.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableConfigsMap().put(str, Boolean.valueOf(z10));
                return this;
            }

            public Builder putImages(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableImagesMap().put(str, str2);
                return this;
            }

            public Builder putTexts(String str, I18NString i18NString) {
                str.getClass();
                i18NString.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableTextsMap().put(str, i18NString);
                return this;
            }

            public Builder removeActions(String str) {
                str.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableActionsMap().remove(str);
                return this;
            }

            public Builder removeColors(String str) {
                str.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableColorsMap().remove(str);
                return this;
            }

            public Builder removeConfigs(String str) {
                str.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableConfigsMap().remove(str);
                return this;
            }

            public Builder removeImages(String str) {
                str.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableImagesMap().remove(str);
                return this;
            }

            public Builder removeTexts(String str) {
                str.getClass();
                copyOnWrite();
                ((Configuration) this.instance).getMutableTextsMap().remove(str);
                return this;
            }

            public Builder setBannerMode(EnumBannerMode enumBannerMode) {
                copyOnWrite();
                ((Configuration) this.instance).setBannerMode(enumBannerMode);
                return this;
            }

            public Builder setBannerModeValue(int i10) {
                copyOnWrite();
                ((Configuration) this.instance).setBannerModeValue(i10);
                return this;
            }

            public Builder setCmpDisplayMode(CmpDisplayMode cmpDisplayMode) {
                copyOnWrite();
                ((Configuration) this.instance).setCmpDisplayMode(cmpDisplayMode);
                return this;
            }

            public Builder setCmpDisplayModeValue(int i10) {
                copyOnWrite();
                ((Configuration) this.instance).setCmpDisplayModeValue(i10);
                return this;
            }

            public Builder setConsentExpirations(ConsentExpirations consentExpirations) {
                copyOnWrite();
                ((Configuration) this.instance).setConsentExpirations(consentExpirations);
                return this;
            }

            public Builder setContinueWithoutAccepting(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setContinueWithoutAccepting(z10);
                return this;
            }

            public Builder setCtaLayout(int i10) {
                copyOnWrite();
                ((Configuration) this.instance).setCtaLayout(i10);
                return this;
            }

            public Builder setCustomCss(String str) {
                copyOnWrite();
                ((Configuration) this.instance).setCustomCss(str);
                return this;
            }

            public Builder setCustomCssAmp(String str) {
                copyOnWrite();
                ((Configuration) this.instance).setCustomCssAmp(str);
                return this;
            }

            public Builder setCustomCssAmpBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Configuration) this.instance).setCustomCssAmpBytes(byteString);
                return this;
            }

            public Builder setCustomCssBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Configuration) this.instance).setCustomCssBytes(byteString);
                return this;
            }

            public Builder setCustomJs(String str) {
                copyOnWrite();
                ((Configuration) this.instance).setCustomJs(str);
                return this;
            }

            public Builder setCustomJsBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Configuration) this.instance).setCustomJsBytes(byteString);
                return this;
            }

            public Builder setEnableIllustrations(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setEnableIllustrations(z10);
                return this;
            }

            public Builder setEnableLegintOnRefuseAll(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setEnableLegintOnRefuseAll(z10);
                return this;
            }

            public Builder setFallbackLanguage(String str) {
                copyOnWrite();
                ((Configuration) this.instance).setFallbackLanguage(str);
                return this;
            }

            public Builder setFallbackLanguageBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Configuration) this.instance).setFallbackLanguageBytes(byteString);
                return this;
            }

            public Builder setGcmAdsDataRedaction(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setGcmAdsDataRedaction(z10);
                return this;
            }

            public Builder setGcmUrlPassthrough(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setGcmUrlPassthrough(z10);
                return this;
            }

            public Builder setHighlightAcceptAllButton(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setHighlightAcceptAllButton(z10);
                return this;
            }

            public Builder setNotBannerDisplayPurposesList(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setNotBannerDisplayPurposesList(z10);
                return this;
            }

            public Builder setUseBanner(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setUseBanner(z10);
                return this;
            }

            public Builder setUseIosAtt(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setUseIosAtt(z10);
                return this;
            }

            public Builder setUseSuccessScreen(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setUseSuccessScreen(z10);
                return this;
            }

            public Builder setXchange(boolean z10) {
                copyOnWrite();
                ((Configuration) this.instance).setXchange(z10);
                return this;
            }

            public Builder setXchangeVendors(int i10, int i11) {
                copyOnWrite();
                ((Configuration) this.instance).setXchangeVendors(i10, i11);
                return this;
            }

            private Builder() {
                super(Configuration.DEFAULT_INSTANCE);
            }

            public Builder setConsentExpirations(ConsentExpirations.Builder builder) {
                copyOnWrite();
                ((Configuration) this.instance).setConsentExpirations(builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum CmpDisplayMode implements Internal.EnumLite {
            NEW_VISITOR(0),
            ALL_VISITOR(1),
            UNRECOGNIZED(-1);

            public static final int ALL_VISITOR_VALUE = 1;
            public static final int NEW_VISITOR_VALUE = 0;
            private static final Internal.EnumLiteMap<CmpDisplayMode> internalValueMap = new Internal.EnumLiteMap<CmpDisplayMode>() { // from class: ac.Models.Configuration.CmpDisplayMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CmpDisplayMode findValueByNumber(int i10) {
                    return CmpDisplayMode.forNumber(i10);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class CmpDisplayModeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new CmpDisplayModeVerifier();

                private CmpDisplayModeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return CmpDisplayMode.forNumber(i10) != null;
                }
            }

            CmpDisplayMode(int i10) {
                this.value = i10;
            }

            public static CmpDisplayMode forNumber(int i10) {
                if (i10 == 0) {
                    return NEW_VISITOR;
                }
                if (i10 != 1) {
                    return null;
                }
                return ALL_VISITOR;
            }

            public static Internal.EnumLiteMap<CmpDisplayMode> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return CmpDisplayModeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static CmpDisplayMode valueOf(int i10) {
                return forNumber(i10);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ColorsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private ColorsDefaultEntryHolder() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ConfigsDefaultEntryHolder {
            static final MapEntryLite<String, Boolean> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BOOL, Boolean.FALSE);

            private ConfigsDefaultEntryHolder() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum EnumBannerMode implements Internal.EnumLite {
            BANNER(0),
            MODAL(1),
            UNRECOGNIZED(-1);

            public static final int BANNER_VALUE = 0;
            public static final int MODAL_VALUE = 1;
            private static final Internal.EnumLiteMap<EnumBannerMode> internalValueMap = new Internal.EnumLiteMap<EnumBannerMode>() { // from class: ac.Models.Configuration.EnumBannerMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public EnumBannerMode findValueByNumber(int i10) {
                    return EnumBannerMode.forNumber(i10);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class EnumBannerModeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new EnumBannerModeVerifier();

                private EnumBannerModeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return EnumBannerMode.forNumber(i10) != null;
                }
            }

            EnumBannerMode(int i10) {
                this.value = i10;
            }

            public static EnumBannerMode forNumber(int i10) {
                if (i10 == 0) {
                    return BANNER;
                }
                if (i10 != 1) {
                    return null;
                }
                return MODAL;
            }

            public static Internal.EnumLiteMap<EnumBannerMode> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return EnumBannerModeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumBannerMode valueOf(int i10) {
                return forNumber(i10);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ImagesDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private ImagesDefaultEntryHolder() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class TextsDefaultEntryHolder {
            static final MapEntryLite<String, I18NString> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, I18NString.getDefaultInstance());

            private TextsDefaultEntryHolder() {
            }
        }

        static {
            Configuration configuration = new Configuration();
            DEFAULT_INSTANCE = configuration;
            GeneratedMessageLite.registerDefaultInstance(Configuration.class, configuration);
        }

        private Configuration() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllXchangeVendors(Iterable<? extends Integer> iterable) {
            ensureXchangeVendorsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.xchangeVendors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addXchangeVendors(int i10) {
            ensureXchangeVendorsIsMutable();
            this.xchangeVendors_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBannerMode() {
            this.bannerMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmpDisplayMode() {
            this.cmpDisplayMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsentExpirations() {
            this.consentExpirations_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContinueWithoutAccepting() {
            this.continueWithoutAccepting_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCtaLayout() {
            this.ctaLayout_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomCss() {
            this.customCss_ = getDefaultInstance().getCustomCss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomCssAmp() {
            this.customCssAmp_ = getDefaultInstance().getCustomCssAmp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomJs() {
            this.customJs_ = getDefaultInstance().getCustomJs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableIllustrations() {
            this.enableIllustrations_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnableLegintOnRefuseAll() {
            this.enableLegintOnRefuseAll_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFallbackLanguage() {
            this.fallbackLanguage_ = getDefaultInstance().getFallbackLanguage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGcmAdsDataRedaction() {
            this.gcmAdsDataRedaction_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGcmUrlPassthrough() {
            this.gcmUrlPassthrough_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHighlightAcceptAllButton() {
            this.highlightAcceptAllButton_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotBannerDisplayPurposesList() {
            this.notBannerDisplayPurposesList_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseBanner() {
            this.useBanner_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseIosAtt() {
            this.useIosAtt_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseSuccessScreen() {
            this.useSuccessScreen_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXchange() {
            this.xchange_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearXchangeVendors() {
            this.xchangeVendors_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureXchangeVendorsIsMutable() {
            Internal.IntList intList = this.xchangeVendors_;
            if (intList.isModifiable()) {
                return;
            }
            this.xchangeVendors_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static Configuration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Integer> getMutableActionsMap() {
            return internalGetMutableActions();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableColorsMap() {
            return internalGetMutableColors();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Boolean> getMutableConfigsMap() {
            return internalGetMutableConfigs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableImagesMap() {
            return internalGetMutableImages();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, I18NString> getMutableTextsMap() {
            return internalGetMutableTexts();
        }

        private MapFieldLite<String, Integer> internalGetActions() {
            return this.actions_;
        }

        private MapFieldLite<String, String> internalGetColors() {
            return this.colors_;
        }

        private MapFieldLite<String, Boolean> internalGetConfigs() {
            return this.configs_;
        }

        private MapFieldLite<String, String> internalGetImages() {
            return this.images_;
        }

        private MapFieldLite<String, Integer> internalGetMutableActions() {
            if (!this.actions_.isMutable()) {
                this.actions_ = this.actions_.mutableCopy();
            }
            return this.actions_;
        }

        private MapFieldLite<String, String> internalGetMutableColors() {
            if (!this.colors_.isMutable()) {
                this.colors_ = this.colors_.mutableCopy();
            }
            return this.colors_;
        }

        private MapFieldLite<String, Boolean> internalGetMutableConfigs() {
            if (!this.configs_.isMutable()) {
                this.configs_ = this.configs_.mutableCopy();
            }
            return this.configs_;
        }

        private MapFieldLite<String, String> internalGetMutableImages() {
            if (!this.images_.isMutable()) {
                this.images_ = this.images_.mutableCopy();
            }
            return this.images_;
        }

        private MapFieldLite<String, I18NString> internalGetMutableTexts() {
            if (!this.texts_.isMutable()) {
                this.texts_ = this.texts_.mutableCopy();
            }
            return this.texts_;
        }

        private MapFieldLite<String, I18NString> internalGetTexts() {
            return this.texts_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConsentExpirations(ConsentExpirations consentExpirations) {
            consentExpirations.getClass();
            ConsentExpirations consentExpirations2 = this.consentExpirations_;
            if (consentExpirations2 == null || consentExpirations2 == ConsentExpirations.getDefaultInstance()) {
                this.consentExpirations_ = consentExpirations;
            } else {
                this.consentExpirations_ = ConsentExpirations.newBuilder(this.consentExpirations_).mergeFrom((ConsentExpirations.Builder) consentExpirations).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Configuration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Configuration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerMode(EnumBannerMode enumBannerMode) {
            this.bannerMode_ = enumBannerMode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBannerModeValue(int i10) {
            this.bannerMode_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpDisplayMode(CmpDisplayMode cmpDisplayMode) {
            this.cmpDisplayMode_ = cmpDisplayMode.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpDisplayModeValue(int i10) {
            this.cmpDisplayMode_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentExpirations(ConsentExpirations consentExpirations) {
            consentExpirations.getClass();
            this.consentExpirations_ = consentExpirations;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContinueWithoutAccepting(boolean z10) {
            this.continueWithoutAccepting_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCtaLayout(int i10) {
            this.ctaLayout_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomCss(String str) {
            str.getClass();
            this.customCss_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomCssAmp(String str) {
            str.getClass();
            this.customCssAmp_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomCssAmpBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customCssAmp_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomCssBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customCss_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomJs(String str) {
            str.getClass();
            this.customJs_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomJsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customJs_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableIllustrations(boolean z10) {
            this.enableIllustrations_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnableLegintOnRefuseAll(boolean z10) {
            this.enableLegintOnRefuseAll_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallbackLanguage(String str) {
            str.getClass();
            this.fallbackLanguage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallbackLanguageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fallbackLanguage_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGcmAdsDataRedaction(boolean z10) {
            this.gcmAdsDataRedaction_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGcmUrlPassthrough(boolean z10) {
            this.gcmUrlPassthrough_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighlightAcceptAllButton(boolean z10) {
            this.highlightAcceptAllButton_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotBannerDisplayPurposesList(boolean z10) {
            this.notBannerDisplayPurposesList_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseBanner(boolean z10) {
            this.useBanner_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseIosAtt(boolean z10) {
            this.useIosAtt_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseSuccessScreen(boolean z10) {
            this.useSuccessScreen_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXchange(boolean z10) {
            this.xchange_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setXchangeVendors(int i10, int i11) {
            ensureXchangeVendorsIsMutable();
            this.xchangeVendors_.setInt(i10, i11);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean containsActions(String str) {
            str.getClass();
            return internalGetActions().containsKey(str);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean containsColors(String str) {
            str.getClass();
            return internalGetColors().containsKey(str);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean containsConfigs(String str) {
            str.getClass();
            return internalGetConfigs().containsKey(str);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean containsImages(String str) {
            str.getClass();
            return internalGetImages().containsKey(str);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean containsTexts(String str) {
            str.getClass();
            return internalGetTexts().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Configuration();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0000\u0001\u001d\u0019\u0005\u0001\u0000\u0001Ȉ\u0002\u001d\u00032\u0004Ȉ\t\u0007\n\u000b\u000b\u0007\f2\r2\u000e2\u000f2\u0010Ȉ\u0011\u0007\u0012\f\u0013\u0007\u0014\u0007\u0015\u0007\u0016Ȉ\u0017\f\u0018\t\u0019\u0007\u001a\u0007\u001b\u0007\u001c\u0007\u001d\u0007", new Object[]{"fallbackLanguage_", "xchangeVendors_", "texts_", TextsDefaultEntryHolder.defaultEntry, "customCss_", "useBanner_", "ctaLayout_", "useSuccessScreen_", "images_", ImagesDefaultEntryHolder.defaultEntry, "actions_", ActionsDefaultEntryHolder.defaultEntry, "colors_", ColorsDefaultEntryHolder.defaultEntry, "configs_", ConfigsDefaultEntryHolder.defaultEntry, "customJs_", "xchange_", "bannerMode_", "continueWithoutAccepting_", "useIosAtt_", "enableLegintOnRefuseAll_", "customCssAmp_", "cmpDisplayMode_", "consentExpirations_", "highlightAcceptAllButton_", "enableIllustrations_", "gcmUrlPassthrough_", "gcmAdsDataRedaction_", "notBannerDisplayPurposesList_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Configuration> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Configuration.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // ac.Models.ConfigurationOrBuilder
        @Deprecated
        public Map<String, Integer> getActions() {
            return getActionsMap();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getActionsCount() {
            return internalGetActions().size();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public Map<String, Integer> getActionsMap() {
            return Collections.unmodifiableMap(internalGetActions());
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getActionsOrDefault(String str, int i10) {
            str.getClass();
            MapFieldLite<String, Integer> mapFieldLiteInternalGetActions = internalGetActions();
            return mapFieldLiteInternalGetActions.containsKey(str) ? mapFieldLiteInternalGetActions.get(str).intValue() : i10;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getActionsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, Integer> mapFieldLiteInternalGetActions = internalGetActions();
            if (mapFieldLiteInternalGetActions.containsKey(str)) {
                return mapFieldLiteInternalGetActions.get(str).intValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public EnumBannerMode getBannerMode() {
            EnumBannerMode enumBannerModeForNumber = EnumBannerMode.forNumber(this.bannerMode_);
            return enumBannerModeForNumber == null ? EnumBannerMode.UNRECOGNIZED : enumBannerModeForNumber;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getBannerModeValue() {
            return this.bannerMode_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public CmpDisplayMode getCmpDisplayMode() {
            CmpDisplayMode cmpDisplayModeForNumber = CmpDisplayMode.forNumber(this.cmpDisplayMode_);
            return cmpDisplayModeForNumber == null ? CmpDisplayMode.UNRECOGNIZED : cmpDisplayModeForNumber;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getCmpDisplayModeValue() {
            return this.cmpDisplayMode_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        @Deprecated
        public Map<String, String> getColors() {
            return getColorsMap();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getColorsCount() {
            return internalGetColors().size();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public Map<String, String> getColorsMap() {
            return Collections.unmodifiableMap(internalGetColors());
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public String getColorsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetColors = internalGetColors();
            return mapFieldLiteInternalGetColors.containsKey(str) ? mapFieldLiteInternalGetColors.get(str) : str2;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public String getColorsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetColors = internalGetColors();
            if (mapFieldLiteInternalGetColors.containsKey(str)) {
                return mapFieldLiteInternalGetColors.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        @Deprecated
        public Map<String, Boolean> getConfigs() {
            return getConfigsMap();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getConfigsCount() {
            return internalGetConfigs().size();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public Map<String, Boolean> getConfigsMap() {
            return Collections.unmodifiableMap(internalGetConfigs());
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getConfigsOrDefault(String str, boolean z10) {
            str.getClass();
            MapFieldLite<String, Boolean> mapFieldLiteInternalGetConfigs = internalGetConfigs();
            return mapFieldLiteInternalGetConfigs.containsKey(str) ? mapFieldLiteInternalGetConfigs.get(str).booleanValue() : z10;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getConfigsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, Boolean> mapFieldLiteInternalGetConfigs = internalGetConfigs();
            if (mapFieldLiteInternalGetConfigs.containsKey(str)) {
                return mapFieldLiteInternalGetConfigs.get(str).booleanValue();
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public ConsentExpirations getConsentExpirations() {
            ConsentExpirations consentExpirations = this.consentExpirations_;
            return consentExpirations == null ? ConsentExpirations.getDefaultInstance() : consentExpirations;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getContinueWithoutAccepting() {
            return this.continueWithoutAccepting_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getCtaLayout() {
            return this.ctaLayout_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public String getCustomCss() {
            return this.customCss_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public String getCustomCssAmp() {
            return this.customCssAmp_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public ByteString getCustomCssAmpBytes() {
            return ByteString.copyFromUtf8(this.customCssAmp_);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public ByteString getCustomCssBytes() {
            return ByteString.copyFromUtf8(this.customCss_);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public String getCustomJs() {
            return this.customJs_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public ByteString getCustomJsBytes() {
            return ByteString.copyFromUtf8(this.customJs_);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getEnableIllustrations() {
            return this.enableIllustrations_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getEnableLegintOnRefuseAll() {
            return this.enableLegintOnRefuseAll_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public String getFallbackLanguage() {
            return this.fallbackLanguage_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public ByteString getFallbackLanguageBytes() {
            return ByteString.copyFromUtf8(this.fallbackLanguage_);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getGcmAdsDataRedaction() {
            return this.gcmAdsDataRedaction_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getGcmUrlPassthrough() {
            return this.gcmUrlPassthrough_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getHighlightAcceptAllButton() {
            return this.highlightAcceptAllButton_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        @Deprecated
        public Map<String, String> getImages() {
            return getImagesMap();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getImagesCount() {
            return internalGetImages().size();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public Map<String, String> getImagesMap() {
            return Collections.unmodifiableMap(internalGetImages());
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public String getImagesOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetImages = internalGetImages();
            return mapFieldLiteInternalGetImages.containsKey(str) ? mapFieldLiteInternalGetImages.get(str) : str2;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public String getImagesOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetImages = internalGetImages();
            if (mapFieldLiteInternalGetImages.containsKey(str)) {
                return mapFieldLiteInternalGetImages.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getNotBannerDisplayPurposesList() {
            return this.notBannerDisplayPurposesList_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        @Deprecated
        public Map<String, I18NString> getTexts() {
            return getTextsMap();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getTextsCount() {
            return internalGetTexts().size();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public Map<String, I18NString> getTextsMap() {
            return Collections.unmodifiableMap(internalGetTexts());
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public I18NString getTextsOrDefault(String str, I18NString i18NString) {
            str.getClass();
            MapFieldLite<String, I18NString> mapFieldLiteInternalGetTexts = internalGetTexts();
            return mapFieldLiteInternalGetTexts.containsKey(str) ? mapFieldLiteInternalGetTexts.get(str) : i18NString;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public I18NString getTextsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, I18NString> mapFieldLiteInternalGetTexts = internalGetTexts();
            if (mapFieldLiteInternalGetTexts.containsKey(str)) {
                return mapFieldLiteInternalGetTexts.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getUseBanner() {
            return this.useBanner_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getUseIosAtt() {
            return this.useIosAtt_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getUseSuccessScreen() {
            return this.useSuccessScreen_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean getXchange() {
            return this.xchange_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getXchangeVendors(int i10) {
            return this.xchangeVendors_.getInt(i10);
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public int getXchangeVendorsCount() {
            return this.xchangeVendors_.size();
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public List<Integer> getXchangeVendorsList() {
            return this.xchangeVendors_;
        }

        @Override // ac.Models.ConfigurationOrBuilder
        public boolean hasConsentExpirations() {
            return this.consentExpirations_ != null;
        }

        public static Builder newBuilder(Configuration configuration) {
            return DEFAULT_INSTANCE.createBuilder(configuration);
        }

        public static Configuration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Configuration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Configuration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Configuration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Configuration parseFrom(InputStream inputStream) throws IOException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Configuration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Configuration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Configuration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ConfigurationOrBuilder extends MessageLiteOrBuilder {
        boolean containsActions(String str);

        boolean containsColors(String str);

        boolean containsConfigs(String str);

        boolean containsImages(String str);

        boolean containsTexts(String str);

        @Deprecated
        Map<String, Integer> getActions();

        int getActionsCount();

        Map<String, Integer> getActionsMap();

        int getActionsOrDefault(String str, int i10);

        int getActionsOrThrow(String str);

        Configuration.EnumBannerMode getBannerMode();

        int getBannerModeValue();

        Configuration.CmpDisplayMode getCmpDisplayMode();

        int getCmpDisplayModeValue();

        @Deprecated
        Map<String, String> getColors();

        int getColorsCount();

        Map<String, String> getColorsMap();

        String getColorsOrDefault(String str, String str2);

        String getColorsOrThrow(String str);

        @Deprecated
        Map<String, Boolean> getConfigs();

        int getConfigsCount();

        Map<String, Boolean> getConfigsMap();

        boolean getConfigsOrDefault(String str, boolean z10);

        boolean getConfigsOrThrow(String str);

        ConsentExpirations getConsentExpirations();

        boolean getContinueWithoutAccepting();

        int getCtaLayout();

        String getCustomCss();

        String getCustomCssAmp();

        ByteString getCustomCssAmpBytes();

        ByteString getCustomCssBytes();

        String getCustomJs();

        ByteString getCustomJsBytes();

        boolean getEnableIllustrations();

        boolean getEnableLegintOnRefuseAll();

        String getFallbackLanguage();

        ByteString getFallbackLanguageBytes();

        boolean getGcmAdsDataRedaction();

        boolean getGcmUrlPassthrough();

        boolean getHighlightAcceptAllButton();

        @Deprecated
        Map<String, String> getImages();

        int getImagesCount();

        Map<String, String> getImagesMap();

        String getImagesOrDefault(String str, String str2);

        String getImagesOrThrow(String str);

        boolean getNotBannerDisplayPurposesList();

        @Deprecated
        Map<String, I18NString> getTexts();

        int getTextsCount();

        Map<String, I18NString> getTextsMap();

        I18NString getTextsOrDefault(String str, I18NString i18NString);

        I18NString getTextsOrThrow(String str);

        boolean getUseBanner();

        boolean getUseIosAtt();

        boolean getUseSuccessScreen();

        boolean getXchange();

        int getXchangeVendors(int i10);

        int getXchangeVendorsCount();

        List<Integer> getXchangeVendorsList();

        boolean hasConsentExpirations();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Consent extends GeneratedMessageLite<Consent, Builder> implements ConsentOrBuilder {
        public static final int BLOCK_ID_FIELD_NUMBER = 18;
        public static final int CMP_HASH_FIELD_NUMBER = 14;
        public static final int CMP_HASH_VERSION_FIELD_NUMBER = 15;
        public static final int CMP_VERSION_FIELD_NUMBER = 10;
        public static final int CONSENT_EXPIRATION_FIELD_NUMBER = 21;
        private static final Consent DEFAULT_INSTANCE;
        public static final int EXTERNAL_IDS_FIELD_NUMBER = 16;
        public static final int GIVEN_AT_FIELD_NUMBER = 12;
        public static final int IAB_CS_FIELD_NUMBER = 1;
        public static final int ORIGIN_FIELD_NUMBER = 20;
        private static volatile Parser<Consent> PARSER = null;
        public static final int PURPOSES_DENIED_FIELD_NUMBER = 23;
        public static final int PURPOSES_FIELD_NUMBER = 3;
        public static final int PURPOSES_LEGINT_FIELD_NUMBER = 4;
        public static final int PURPOSES_LISTED_FIELD_NUMBER = 24;
        public static final int PURPOSES_MANDATORY_FIELD_NUMBER = 25;
        public static final int PURPOSES_NAMES_FIELD_NUMBER = 22;
        public static final int SPECIAL_FEATURES_FIELD_NUMBER = 2;
        public static final int TRANSACTION_ID_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 13;
        public static final int UUID_FIELD_NUMBER = 11;
        public static final int VENDORS_FIELD_NUMBER = 5;
        public static final int VENDORS_LEGINT_FIELD_NUMBER = 6;
        private int cmpHashVersion_;
        private int cmpVersion_;
        private Duration consentExpiration_;
        private Timestamp givenAt_;
        private int type_;
        private MapFieldLite<Integer, I18NString> purposesNames_ = MapFieldLite.emptyMapField();
        private MapFieldLite<String, String> externalIds_ = MapFieldLite.emptyMapField();
        private String iabCs_ = "";
        private Internal.IntList specialFeatures_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList purposes_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList purposesLegint_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList purposesDenied_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList purposesListed_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList purposesMandatory_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList vendors_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList vendorsLegint_ = GeneratedMessageLite.emptyIntList();
        private String uuid_ = "";
        private String cmpHash_ = "";
        private String transactionId_ = "";
        private String blockId_ = "";
        private String origin_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<Consent, Builder> implements ConsentOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllPurposes(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Consent) this.instance).addAllPurposes(iterable);
                return this;
            }

            public Builder addAllPurposesDenied(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Consent) this.instance).addAllPurposesDenied(iterable);
                return this;
            }

            public Builder addAllPurposesLegint(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Consent) this.instance).addAllPurposesLegint(iterable);
                return this;
            }

            public Builder addAllPurposesListed(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Consent) this.instance).addAllPurposesListed(iterable);
                return this;
            }

            public Builder addAllPurposesMandatory(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Consent) this.instance).addAllPurposesMandatory(iterable);
                return this;
            }

            public Builder addAllSpecialFeatures(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Consent) this.instance).addAllSpecialFeatures(iterable);
                return this;
            }

            public Builder addAllVendors(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Consent) this.instance).addAllVendors(iterable);
                return this;
            }

            public Builder addAllVendorsLegint(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Consent) this.instance).addAllVendorsLegint(iterable);
                return this;
            }

            public Builder addPurposes(int i10) {
                copyOnWrite();
                ((Consent) this.instance).addPurposes(i10);
                return this;
            }

            public Builder addPurposesDenied(int i10) {
                copyOnWrite();
                ((Consent) this.instance).addPurposesDenied(i10);
                return this;
            }

            public Builder addPurposesLegint(int i10) {
                copyOnWrite();
                ((Consent) this.instance).addPurposesLegint(i10);
                return this;
            }

            public Builder addPurposesListed(int i10) {
                copyOnWrite();
                ((Consent) this.instance).addPurposesListed(i10);
                return this;
            }

            public Builder addPurposesMandatory(int i10) {
                copyOnWrite();
                ((Consent) this.instance).addPurposesMandatory(i10);
                return this;
            }

            public Builder addSpecialFeatures(int i10) {
                copyOnWrite();
                ((Consent) this.instance).addSpecialFeatures(i10);
                return this;
            }

            public Builder addVendors(int i10) {
                copyOnWrite();
                ((Consent) this.instance).addVendors(i10);
                return this;
            }

            public Builder addVendorsLegint(int i10) {
                copyOnWrite();
                ((Consent) this.instance).addVendorsLegint(i10);
                return this;
            }

            public Builder clearBlockId() {
                copyOnWrite();
                ((Consent) this.instance).clearBlockId();
                return this;
            }

            public Builder clearCmpHash() {
                copyOnWrite();
                ((Consent) this.instance).clearCmpHash();
                return this;
            }

            public Builder clearCmpHashVersion() {
                copyOnWrite();
                ((Consent) this.instance).clearCmpHashVersion();
                return this;
            }

            public Builder clearCmpVersion() {
                copyOnWrite();
                ((Consent) this.instance).clearCmpVersion();
                return this;
            }

            public Builder clearConsentExpiration() {
                copyOnWrite();
                ((Consent) this.instance).clearConsentExpiration();
                return this;
            }

            public Builder clearExternalIds() {
                copyOnWrite();
                ((Consent) this.instance).getMutableExternalIdsMap().clear();
                return this;
            }

            public Builder clearGivenAt() {
                copyOnWrite();
                ((Consent) this.instance).clearGivenAt();
                return this;
            }

            public Builder clearIabCs() {
                copyOnWrite();
                ((Consent) this.instance).clearIabCs();
                return this;
            }

            public Builder clearOrigin() {
                copyOnWrite();
                ((Consent) this.instance).clearOrigin();
                return this;
            }

            public Builder clearPurposes() {
                copyOnWrite();
                ((Consent) this.instance).clearPurposes();
                return this;
            }

            public Builder clearPurposesDenied() {
                copyOnWrite();
                ((Consent) this.instance).clearPurposesDenied();
                return this;
            }

            public Builder clearPurposesLegint() {
                copyOnWrite();
                ((Consent) this.instance).clearPurposesLegint();
                return this;
            }

            public Builder clearPurposesListed() {
                copyOnWrite();
                ((Consent) this.instance).clearPurposesListed();
                return this;
            }

            public Builder clearPurposesMandatory() {
                copyOnWrite();
                ((Consent) this.instance).clearPurposesMandatory();
                return this;
            }

            public Builder clearPurposesNames() {
                copyOnWrite();
                ((Consent) this.instance).getMutablePurposesNamesMap().clear();
                return this;
            }

            public Builder clearSpecialFeatures() {
                copyOnWrite();
                ((Consent) this.instance).clearSpecialFeatures();
                return this;
            }

            public Builder clearTransactionId() {
                copyOnWrite();
                ((Consent) this.instance).clearTransactionId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Consent) this.instance).clearType();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((Consent) this.instance).clearUuid();
                return this;
            }

            public Builder clearVendors() {
                copyOnWrite();
                ((Consent) this.instance).clearVendors();
                return this;
            }

            public Builder clearVendorsLegint() {
                copyOnWrite();
                ((Consent) this.instance).clearVendorsLegint();
                return this;
            }

            @Override // ac.Models.ConsentOrBuilder
            public boolean containsExternalIds(String str) {
                str.getClass();
                return ((Consent) this.instance).getExternalIdsMap().containsKey(str);
            }

            @Override // ac.Models.ConsentOrBuilder
            public boolean containsPurposesNames(int i10) {
                return ((Consent) this.instance).getPurposesNamesMap().containsKey(Integer.valueOf(i10));
            }

            @Override // ac.Models.ConsentOrBuilder
            public String getBlockId() {
                return ((Consent) this.instance).getBlockId();
            }

            @Override // ac.Models.ConsentOrBuilder
            public ByteString getBlockIdBytes() {
                return ((Consent) this.instance).getBlockIdBytes();
            }

            @Override // ac.Models.ConsentOrBuilder
            public String getCmpHash() {
                return ((Consent) this.instance).getCmpHash();
            }

            @Override // ac.Models.ConsentOrBuilder
            public ByteString getCmpHashBytes() {
                return ((Consent) this.instance).getCmpHashBytes();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getCmpHashVersion() {
                return ((Consent) this.instance).getCmpHashVersion();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getCmpVersion() {
                return ((Consent) this.instance).getCmpVersion();
            }

            @Override // ac.Models.ConsentOrBuilder
            public Duration getConsentExpiration() {
                return ((Consent) this.instance).getConsentExpiration();
            }

            @Override // ac.Models.ConsentOrBuilder
            @Deprecated
            public Map<String, String> getExternalIds() {
                return getExternalIdsMap();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getExternalIdsCount() {
                return ((Consent) this.instance).getExternalIdsMap().size();
            }

            @Override // ac.Models.ConsentOrBuilder
            public Map<String, String> getExternalIdsMap() {
                return Collections.unmodifiableMap(((Consent) this.instance).getExternalIdsMap());
            }

            @Override // ac.Models.ConsentOrBuilder
            public String getExternalIdsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> externalIdsMap = ((Consent) this.instance).getExternalIdsMap();
                return externalIdsMap.containsKey(str) ? externalIdsMap.get(str) : str2;
            }

            @Override // ac.Models.ConsentOrBuilder
            public String getExternalIdsOrThrow(String str) {
                str.getClass();
                Map<String, String> externalIdsMap = ((Consent) this.instance).getExternalIdsMap();
                if (externalIdsMap.containsKey(str)) {
                    return externalIdsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.ConsentOrBuilder
            public Timestamp getGivenAt() {
                return ((Consent) this.instance).getGivenAt();
            }

            @Override // ac.Models.ConsentOrBuilder
            public String getIabCs() {
                return ((Consent) this.instance).getIabCs();
            }

            @Override // ac.Models.ConsentOrBuilder
            public ByteString getIabCsBytes() {
                return ((Consent) this.instance).getIabCsBytes();
            }

            @Override // ac.Models.ConsentOrBuilder
            public String getOrigin() {
                return ((Consent) this.instance).getOrigin();
            }

            @Override // ac.Models.ConsentOrBuilder
            public ByteString getOriginBytes() {
                return ((Consent) this.instance).getOriginBytes();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposes(int i10) {
                return ((Consent) this.instance).getPurposes(i10);
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesCount() {
                return ((Consent) this.instance).getPurposesCount();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesDenied(int i10) {
                return ((Consent) this.instance).getPurposesDenied(i10);
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesDeniedCount() {
                return ((Consent) this.instance).getPurposesDeniedCount();
            }

            @Override // ac.Models.ConsentOrBuilder
            public List<Integer> getPurposesDeniedList() {
                return Collections.unmodifiableList(((Consent) this.instance).getPurposesDeniedList());
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesLegint(int i10) {
                return ((Consent) this.instance).getPurposesLegint(i10);
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesLegintCount() {
                return ((Consent) this.instance).getPurposesLegintCount();
            }

            @Override // ac.Models.ConsentOrBuilder
            public List<Integer> getPurposesLegintList() {
                return Collections.unmodifiableList(((Consent) this.instance).getPurposesLegintList());
            }

            @Override // ac.Models.ConsentOrBuilder
            public List<Integer> getPurposesList() {
                return Collections.unmodifiableList(((Consent) this.instance).getPurposesList());
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesListed(int i10) {
                return ((Consent) this.instance).getPurposesListed(i10);
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesListedCount() {
                return ((Consent) this.instance).getPurposesListedCount();
            }

            @Override // ac.Models.ConsentOrBuilder
            public List<Integer> getPurposesListedList() {
                return Collections.unmodifiableList(((Consent) this.instance).getPurposesListedList());
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesMandatory(int i10) {
                return ((Consent) this.instance).getPurposesMandatory(i10);
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesMandatoryCount() {
                return ((Consent) this.instance).getPurposesMandatoryCount();
            }

            @Override // ac.Models.ConsentOrBuilder
            public List<Integer> getPurposesMandatoryList() {
                return Collections.unmodifiableList(((Consent) this.instance).getPurposesMandatoryList());
            }

            @Override // ac.Models.ConsentOrBuilder
            @Deprecated
            public Map<Integer, I18NString> getPurposesNames() {
                return getPurposesNamesMap();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getPurposesNamesCount() {
                return ((Consent) this.instance).getPurposesNamesMap().size();
            }

            @Override // ac.Models.ConsentOrBuilder
            public Map<Integer, I18NString> getPurposesNamesMap() {
                return Collections.unmodifiableMap(((Consent) this.instance).getPurposesNamesMap());
            }

            @Override // ac.Models.ConsentOrBuilder
            public I18NString getPurposesNamesOrDefault(int i10, I18NString i18NString) {
                Map<Integer, I18NString> purposesNamesMap = ((Consent) this.instance).getPurposesNamesMap();
                return purposesNamesMap.containsKey(Integer.valueOf(i10)) ? purposesNamesMap.get(Integer.valueOf(i10)) : i18NString;
            }

            @Override // ac.Models.ConsentOrBuilder
            public I18NString getPurposesNamesOrThrow(int i10) {
                Map<Integer, I18NString> purposesNamesMap = ((Consent) this.instance).getPurposesNamesMap();
                if (purposesNamesMap.containsKey(Integer.valueOf(i10))) {
                    return purposesNamesMap.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getSpecialFeatures(int i10) {
                return ((Consent) this.instance).getSpecialFeatures(i10);
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getSpecialFeaturesCount() {
                return ((Consent) this.instance).getSpecialFeaturesCount();
            }

            @Override // ac.Models.ConsentOrBuilder
            public List<Integer> getSpecialFeaturesList() {
                return Collections.unmodifiableList(((Consent) this.instance).getSpecialFeaturesList());
            }

            @Override // ac.Models.ConsentOrBuilder
            public String getTransactionId() {
                return ((Consent) this.instance).getTransactionId();
            }

            @Override // ac.Models.ConsentOrBuilder
            public ByteString getTransactionIdBytes() {
                return ((Consent) this.instance).getTransactionIdBytes();
            }

            @Override // ac.Models.ConsentOrBuilder
            public EnumConsentType getType() {
                return ((Consent) this.instance).getType();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getTypeValue() {
                return ((Consent) this.instance).getTypeValue();
            }

            @Override // ac.Models.ConsentOrBuilder
            public String getUuid() {
                return ((Consent) this.instance).getUuid();
            }

            @Override // ac.Models.ConsentOrBuilder
            public ByteString getUuidBytes() {
                return ((Consent) this.instance).getUuidBytes();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getVendors(int i10) {
                return ((Consent) this.instance).getVendors(i10);
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getVendorsCount() {
                return ((Consent) this.instance).getVendorsCount();
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getVendorsLegint(int i10) {
                return ((Consent) this.instance).getVendorsLegint(i10);
            }

            @Override // ac.Models.ConsentOrBuilder
            public int getVendorsLegintCount() {
                return ((Consent) this.instance).getVendorsLegintCount();
            }

            @Override // ac.Models.ConsentOrBuilder
            public List<Integer> getVendorsLegintList() {
                return Collections.unmodifiableList(((Consent) this.instance).getVendorsLegintList());
            }

            @Override // ac.Models.ConsentOrBuilder
            public List<Integer> getVendorsList() {
                return Collections.unmodifiableList(((Consent) this.instance).getVendorsList());
            }

            @Override // ac.Models.ConsentOrBuilder
            public boolean hasConsentExpiration() {
                return ((Consent) this.instance).hasConsentExpiration();
            }

            @Override // ac.Models.ConsentOrBuilder
            public boolean hasGivenAt() {
                return ((Consent) this.instance).hasGivenAt();
            }

            public Builder mergeConsentExpiration(Duration duration) {
                copyOnWrite();
                ((Consent) this.instance).mergeConsentExpiration(duration);
                return this;
            }

            public Builder mergeGivenAt(Timestamp timestamp) {
                copyOnWrite();
                ((Consent) this.instance).mergeGivenAt(timestamp);
                return this;
            }

            public Builder putAllExternalIds(Map<String, String> map) {
                copyOnWrite();
                ((Consent) this.instance).getMutableExternalIdsMap().putAll(map);
                return this;
            }

            public Builder putAllPurposesNames(Map<Integer, I18NString> map) {
                copyOnWrite();
                ((Consent) this.instance).getMutablePurposesNamesMap().putAll(map);
                return this;
            }

            public Builder putExternalIds(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Consent) this.instance).getMutableExternalIdsMap().put(str, str2);
                return this;
            }

            public Builder putPurposesNames(int i10, I18NString i18NString) {
                i18NString.getClass();
                copyOnWrite();
                ((Consent) this.instance).getMutablePurposesNamesMap().put(Integer.valueOf(i10), i18NString);
                return this;
            }

            public Builder removeExternalIds(String str) {
                str.getClass();
                copyOnWrite();
                ((Consent) this.instance).getMutableExternalIdsMap().remove(str);
                return this;
            }

            public Builder removePurposesNames(int i10) {
                copyOnWrite();
                ((Consent) this.instance).getMutablePurposesNamesMap().remove(Integer.valueOf(i10));
                return this;
            }

            public Builder setBlockId(String str) {
                copyOnWrite();
                ((Consent) this.instance).setBlockId(str);
                return this;
            }

            public Builder setBlockIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Consent) this.instance).setBlockIdBytes(byteString);
                return this;
            }

            public Builder setCmpHash(String str) {
                copyOnWrite();
                ((Consent) this.instance).setCmpHash(str);
                return this;
            }

            public Builder setCmpHashBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Consent) this.instance).setCmpHashBytes(byteString);
                return this;
            }

            public Builder setCmpHashVersion(int i10) {
                copyOnWrite();
                ((Consent) this.instance).setCmpHashVersion(i10);
                return this;
            }

            public Builder setCmpVersion(int i10) {
                copyOnWrite();
                ((Consent) this.instance).setCmpVersion(i10);
                return this;
            }

            public Builder setConsentExpiration(Duration duration) {
                copyOnWrite();
                ((Consent) this.instance).setConsentExpiration(duration);
                return this;
            }

            public Builder setGivenAt(Timestamp timestamp) {
                copyOnWrite();
                ((Consent) this.instance).setGivenAt(timestamp);
                return this;
            }

            public Builder setIabCs(String str) {
                copyOnWrite();
                ((Consent) this.instance).setIabCs(str);
                return this;
            }

            public Builder setIabCsBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Consent) this.instance).setIabCsBytes(byteString);
                return this;
            }

            public Builder setOrigin(String str) {
                copyOnWrite();
                ((Consent) this.instance).setOrigin(str);
                return this;
            }

            public Builder setOriginBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Consent) this.instance).setOriginBytes(byteString);
                return this;
            }

            public Builder setPurposes(int i10, int i11) {
                copyOnWrite();
                ((Consent) this.instance).setPurposes(i10, i11);
                return this;
            }

            public Builder setPurposesDenied(int i10, int i11) {
                copyOnWrite();
                ((Consent) this.instance).setPurposesDenied(i10, i11);
                return this;
            }

            public Builder setPurposesLegint(int i10, int i11) {
                copyOnWrite();
                ((Consent) this.instance).setPurposesLegint(i10, i11);
                return this;
            }

            public Builder setPurposesListed(int i10, int i11) {
                copyOnWrite();
                ((Consent) this.instance).setPurposesListed(i10, i11);
                return this;
            }

            public Builder setPurposesMandatory(int i10, int i11) {
                copyOnWrite();
                ((Consent) this.instance).setPurposesMandatory(i10, i11);
                return this;
            }

            public Builder setSpecialFeatures(int i10, int i11) {
                copyOnWrite();
                ((Consent) this.instance).setSpecialFeatures(i10, i11);
                return this;
            }

            public Builder setTransactionId(String str) {
                copyOnWrite();
                ((Consent) this.instance).setTransactionId(str);
                return this;
            }

            public Builder setTransactionIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Consent) this.instance).setTransactionIdBytes(byteString);
                return this;
            }

            public Builder setType(EnumConsentType enumConsentType) {
                copyOnWrite();
                ((Consent) this.instance).setType(enumConsentType);
                return this;
            }

            public Builder setTypeValue(int i10) {
                copyOnWrite();
                ((Consent) this.instance).setTypeValue(i10);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((Consent) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Consent) this.instance).setUuidBytes(byteString);
                return this;
            }

            public Builder setVendors(int i10, int i11) {
                copyOnWrite();
                ((Consent) this.instance).setVendors(i10, i11);
                return this;
            }

            public Builder setVendorsLegint(int i10, int i11) {
                copyOnWrite();
                ((Consent) this.instance).setVendorsLegint(i10, i11);
                return this;
            }

            private Builder() {
                super(Consent.DEFAULT_INSTANCE);
            }

            public Builder setConsentExpiration(Duration.Builder builder) {
                copyOnWrite();
                ((Consent) this.instance).setConsentExpiration(builder.build());
                return this;
            }

            public Builder setGivenAt(Timestamp.Builder builder) {
                copyOnWrite();
                ((Consent) this.instance).setGivenAt(builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public enum EnumConsentType implements Internal.EnumLite {
            ACCEPT_ALL(0),
            DENY_ALL(1),
            MIXED(2),
            CONTINUE_WITHOUT_ACCEPTING(3),
            UNRECOGNIZED(-1);

            public static final int ACCEPT_ALL_VALUE = 0;
            public static final int CONTINUE_WITHOUT_ACCEPTING_VALUE = 3;
            public static final int DENY_ALL_VALUE = 1;
            public static final int MIXED_VALUE = 2;
            private static final Internal.EnumLiteMap<EnumConsentType> internalValueMap = new Internal.EnumLiteMap<EnumConsentType>() { // from class: ac.Models.Consent.EnumConsentType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public EnumConsentType findValueByNumber(int i10) {
                    return EnumConsentType.forNumber(i10);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class EnumConsentTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new EnumConsentTypeVerifier();

                private EnumConsentTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return EnumConsentType.forNumber(i10) != null;
                }
            }

            EnumConsentType(int i10) {
                this.value = i10;
            }

            public static EnumConsentType forNumber(int i10) {
                if (i10 == 0) {
                    return ACCEPT_ALL;
                }
                if (i10 == 1) {
                    return DENY_ALL;
                }
                if (i10 == 2) {
                    return MIXED;
                }
                if (i10 != 3) {
                    return null;
                }
                return CONTINUE_WITHOUT_ACCEPTING;
            }

            public static Internal.EnumLiteMap<EnumConsentType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return EnumConsentTypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumConsentType valueOf(int i10) {
                return forNumber(i10);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ExternalIdsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private ExternalIdsDefaultEntryHolder() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class PurposesNamesDefaultEntryHolder {
            static final MapEntryLite<Integer, I18NString> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, I18NString.getDefaultInstance());

            private PurposesNamesDefaultEntryHolder() {
            }
        }

        static {
            Consent consent = new Consent();
            DEFAULT_INSTANCE = consent;
            GeneratedMessageLite.registerDefaultInstance(Consent.class, consent);
        }

        private Consent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPurposes(Iterable<? extends Integer> iterable) {
            ensurePurposesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.purposes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPurposesDenied(Iterable<? extends Integer> iterable) {
            ensurePurposesDeniedIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.purposesDenied_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPurposesLegint(Iterable<? extends Integer> iterable) {
            ensurePurposesLegintIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.purposesLegint_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPurposesListed(Iterable<? extends Integer> iterable) {
            ensurePurposesListedIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.purposesListed_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPurposesMandatory(Iterable<? extends Integer> iterable) {
            ensurePurposesMandatoryIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.purposesMandatory_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSpecialFeatures(Iterable<? extends Integer> iterable) {
            ensureSpecialFeaturesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.specialFeatures_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVendors(Iterable<? extends Integer> iterable) {
            ensureVendorsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.vendors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVendorsLegint(Iterable<? extends Integer> iterable) {
            ensureVendorsLegintIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.vendorsLegint_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPurposes(int i10) {
            ensurePurposesIsMutable();
            this.purposes_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPurposesDenied(int i10) {
            ensurePurposesDeniedIsMutable();
            this.purposesDenied_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPurposesLegint(int i10) {
            ensurePurposesLegintIsMutable();
            this.purposesLegint_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPurposesListed(int i10) {
            ensurePurposesListedIsMutable();
            this.purposesListed_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPurposesMandatory(int i10) {
            ensurePurposesMandatoryIsMutable();
            this.purposesMandatory_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpecialFeatures(int i10) {
            ensureSpecialFeaturesIsMutable();
            this.specialFeatures_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVendors(int i10) {
            ensureVendorsIsMutable();
            this.vendors_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVendorsLegint(int i10) {
            ensureVendorsLegintIsMutable();
            this.vendorsLegint_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlockId() {
            this.blockId_ = getDefaultInstance().getBlockId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmpHash() {
            this.cmpHash_ = getDefaultInstance().getCmpHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmpHashVersion() {
            this.cmpHashVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCmpVersion() {
            this.cmpVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsentExpiration() {
            this.consentExpiration_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGivenAt() {
            this.givenAt_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIabCs() {
            this.iabCs_ = getDefaultInstance().getIabCs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOrigin() {
            this.origin_ = getDefaultInstance().getOrigin();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPurposes() {
            this.purposes_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPurposesDenied() {
            this.purposesDenied_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPurposesLegint() {
            this.purposesLegint_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPurposesListed() {
            this.purposesListed_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPurposesMandatory() {
            this.purposesMandatory_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpecialFeatures() {
            this.specialFeatures_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTransactionId() {
            this.transactionId_ = getDefaultInstance().getTransactionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendors() {
            this.vendors_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendorsLegint() {
            this.vendorsLegint_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensurePurposesDeniedIsMutable() {
            Internal.IntList intList = this.purposesDenied_;
            if (intList.isModifiable()) {
                return;
            }
            this.purposesDenied_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensurePurposesIsMutable() {
            Internal.IntList intList = this.purposes_;
            if (intList.isModifiable()) {
                return;
            }
            this.purposes_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensurePurposesLegintIsMutable() {
            Internal.IntList intList = this.purposesLegint_;
            if (intList.isModifiable()) {
                return;
            }
            this.purposesLegint_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensurePurposesListedIsMutable() {
            Internal.IntList intList = this.purposesListed_;
            if (intList.isModifiable()) {
                return;
            }
            this.purposesListed_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensurePurposesMandatoryIsMutable() {
            Internal.IntList intList = this.purposesMandatory_;
            if (intList.isModifiable()) {
                return;
            }
            this.purposesMandatory_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureSpecialFeaturesIsMutable() {
            Internal.IntList intList = this.specialFeatures_;
            if (intList.isModifiable()) {
                return;
            }
            this.specialFeatures_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureVendorsIsMutable() {
            Internal.IntList intList = this.vendors_;
            if (intList.isModifiable()) {
                return;
            }
            this.vendors_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureVendorsLegintIsMutable() {
            Internal.IntList intList = this.vendorsLegint_;
            if (intList.isModifiable()) {
                return;
            }
            this.vendorsLegint_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static Consent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableExternalIdsMap() {
            return internalGetMutableExternalIds();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, I18NString> getMutablePurposesNamesMap() {
            return internalGetMutablePurposesNames();
        }

        private MapFieldLite<String, String> internalGetExternalIds() {
            return this.externalIds_;
        }

        private MapFieldLite<String, String> internalGetMutableExternalIds() {
            if (!this.externalIds_.isMutable()) {
                this.externalIds_ = this.externalIds_.mutableCopy();
            }
            return this.externalIds_;
        }

        private MapFieldLite<Integer, I18NString> internalGetMutablePurposesNames() {
            if (!this.purposesNames_.isMutable()) {
                this.purposesNames_ = this.purposesNames_.mutableCopy();
            }
            return this.purposesNames_;
        }

        private MapFieldLite<Integer, I18NString> internalGetPurposesNames() {
            return this.purposesNames_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConsentExpiration(Duration duration) {
            duration.getClass();
            Duration duration2 = this.consentExpiration_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.consentExpiration_ = duration;
            } else {
                this.consentExpiration_ = Duration.newBuilder(this.consentExpiration_).mergeFrom((Duration.Builder) duration).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGivenAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.givenAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.givenAt_ = timestamp;
            } else {
                this.givenAt_ = Timestamp.newBuilder(this.givenAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Consent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Consent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Consent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Consent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockId(String str) {
            str.getClass();
            this.blockId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.blockId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpHash(String str) {
            str.getClass();
            this.cmpHash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpHashBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cmpHash_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpHashVersion(int i10) {
            this.cmpHashVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCmpVersion(int i10) {
            this.cmpVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentExpiration(Duration duration) {
            duration.getClass();
            this.consentExpiration_ = duration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGivenAt(Timestamp timestamp) {
            timestamp.getClass();
            this.givenAt_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIabCs(String str) {
            str.getClass();
            this.iabCs_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIabCsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.iabCs_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOrigin(String str) {
            str.getClass();
            this.origin_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOriginBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.origin_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPurposes(int i10, int i11) {
            ensurePurposesIsMutable();
            this.purposes_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPurposesDenied(int i10, int i11) {
            ensurePurposesDeniedIsMutable();
            this.purposesDenied_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPurposesLegint(int i10, int i11) {
            ensurePurposesLegintIsMutable();
            this.purposesLegint_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPurposesListed(int i10, int i11) {
            ensurePurposesListedIsMutable();
            this.purposesListed_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPurposesMandatory(int i10, int i11) {
            ensurePurposesMandatoryIsMutable();
            this.purposesMandatory_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpecialFeatures(int i10, int i11) {
            ensureSpecialFeaturesIsMutable();
            this.specialFeatures_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionId(String str) {
            str.getClass();
            this.transactionId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTransactionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.transactionId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(EnumConsentType enumConsentType) {
            this.type_ = enumConsentType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.type_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendors(int i10, int i11) {
            ensureVendorsIsMutable();
            this.vendors_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendorsLegint(int i10, int i11) {
            ensureVendorsLegintIsMutable();
            this.vendorsLegint_.setInt(i10, i11);
        }

        @Override // ac.Models.ConsentOrBuilder
        public boolean containsExternalIds(String str) {
            str.getClass();
            return internalGetExternalIds().containsKey(str);
        }

        @Override // ac.Models.ConsentOrBuilder
        public boolean containsPurposesNames(int i10) {
            return internalGetPurposesNames().containsKey(Integer.valueOf(i10));
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Consent();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0000\u0001\u0019\u0015\u0002\b\u0000\u0001Ȉ\u0002\u001d\u0003\u001d\u0004\u001d\u0005\u001d\u0006\u001d\n\u000b\u000bȈ\f\t\r\f\u000eȈ\u000f\u000b\u00102\u0011Ȉ\u0012Ȉ\u0014Ȉ\u0015\t\u00162\u0017\u001d\u0018\u001d\u0019\u001d", new Object[]{"iabCs_", "specialFeatures_", "purposes_", "purposesLegint_", "vendors_", "vendorsLegint_", "cmpVersion_", "uuid_", "givenAt_", "type_", "cmpHash_", "cmpHashVersion_", "externalIds_", ExternalIdsDefaultEntryHolder.defaultEntry, "transactionId_", "blockId_", "origin_", "consentExpiration_", "purposesNames_", PurposesNamesDefaultEntryHolder.defaultEntry, "purposesDenied_", "purposesListed_", "purposesMandatory_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Consent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Consent.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // ac.Models.ConsentOrBuilder
        public String getBlockId() {
            return this.blockId_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public ByteString getBlockIdBytes() {
            return ByteString.copyFromUtf8(this.blockId_);
        }

        @Override // ac.Models.ConsentOrBuilder
        public String getCmpHash() {
            return this.cmpHash_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public ByteString getCmpHashBytes() {
            return ByteString.copyFromUtf8(this.cmpHash_);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getCmpHashVersion() {
            return this.cmpHashVersion_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getCmpVersion() {
            return this.cmpVersion_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public Duration getConsentExpiration() {
            Duration duration = this.consentExpiration_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // ac.Models.ConsentOrBuilder
        @Deprecated
        public Map<String, String> getExternalIds() {
            return getExternalIdsMap();
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getExternalIdsCount() {
            return internalGetExternalIds().size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public Map<String, String> getExternalIdsMap() {
            return Collections.unmodifiableMap(internalGetExternalIds());
        }

        @Override // ac.Models.ConsentOrBuilder
        public String getExternalIdsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            return mapFieldLiteInternalGetExternalIds.containsKey(str) ? mapFieldLiteInternalGetExternalIds.get(str) : str2;
        }

        @Override // ac.Models.ConsentOrBuilder
        public String getExternalIdsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            if (mapFieldLiteInternalGetExternalIds.containsKey(str)) {
                return mapFieldLiteInternalGetExternalIds.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Models.ConsentOrBuilder
        public Timestamp getGivenAt() {
            Timestamp timestamp = this.givenAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // ac.Models.ConsentOrBuilder
        public String getIabCs() {
            return this.iabCs_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public ByteString getIabCsBytes() {
            return ByteString.copyFromUtf8(this.iabCs_);
        }

        @Override // ac.Models.ConsentOrBuilder
        public String getOrigin() {
            return this.origin_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public ByteString getOriginBytes() {
            return ByteString.copyFromUtf8(this.origin_);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposes(int i10) {
            return this.purposes_.getInt(i10);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesCount() {
            return this.purposes_.size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesDenied(int i10) {
            return this.purposesDenied_.getInt(i10);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesDeniedCount() {
            return this.purposesDenied_.size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public List<Integer> getPurposesDeniedList() {
            return this.purposesDenied_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesLegint(int i10) {
            return this.purposesLegint_.getInt(i10);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesLegintCount() {
            return this.purposesLegint_.size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public List<Integer> getPurposesLegintList() {
            return this.purposesLegint_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public List<Integer> getPurposesList() {
            return this.purposes_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesListed(int i10) {
            return this.purposesListed_.getInt(i10);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesListedCount() {
            return this.purposesListed_.size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public List<Integer> getPurposesListedList() {
            return this.purposesListed_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesMandatory(int i10) {
            return this.purposesMandatory_.getInt(i10);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesMandatoryCount() {
            return this.purposesMandatory_.size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public List<Integer> getPurposesMandatoryList() {
            return this.purposesMandatory_;
        }

        @Override // ac.Models.ConsentOrBuilder
        @Deprecated
        public Map<Integer, I18NString> getPurposesNames() {
            return getPurposesNamesMap();
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getPurposesNamesCount() {
            return internalGetPurposesNames().size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public Map<Integer, I18NString> getPurposesNamesMap() {
            return Collections.unmodifiableMap(internalGetPurposesNames());
        }

        @Override // ac.Models.ConsentOrBuilder
        public I18NString getPurposesNamesOrDefault(int i10, I18NString i18NString) {
            MapFieldLite<Integer, I18NString> mapFieldLiteInternalGetPurposesNames = internalGetPurposesNames();
            return mapFieldLiteInternalGetPurposesNames.containsKey(Integer.valueOf(i10)) ? mapFieldLiteInternalGetPurposesNames.get(Integer.valueOf(i10)) : i18NString;
        }

        @Override // ac.Models.ConsentOrBuilder
        public I18NString getPurposesNamesOrThrow(int i10) {
            MapFieldLite<Integer, I18NString> mapFieldLiteInternalGetPurposesNames = internalGetPurposesNames();
            if (mapFieldLiteInternalGetPurposesNames.containsKey(Integer.valueOf(i10))) {
                return mapFieldLiteInternalGetPurposesNames.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getSpecialFeatures(int i10) {
            return this.specialFeatures_.getInt(i10);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getSpecialFeaturesCount() {
            return this.specialFeatures_.size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public List<Integer> getSpecialFeaturesList() {
            return this.specialFeatures_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public String getTransactionId() {
            return this.transactionId_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public ByteString getTransactionIdBytes() {
            return ByteString.copyFromUtf8(this.transactionId_);
        }

        @Override // ac.Models.ConsentOrBuilder
        public EnumConsentType getType() {
            EnumConsentType enumConsentTypeForNumber = EnumConsentType.forNumber(this.type_);
            return enumConsentTypeForNumber == null ? EnumConsentType.UNRECOGNIZED : enumConsentTypeForNumber;
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getVendors(int i10) {
            return this.vendors_.getInt(i10);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getVendorsCount() {
            return this.vendors_.size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getVendorsLegint(int i10) {
            return this.vendorsLegint_.getInt(i10);
        }

        @Override // ac.Models.ConsentOrBuilder
        public int getVendorsLegintCount() {
            return this.vendorsLegint_.size();
        }

        @Override // ac.Models.ConsentOrBuilder
        public List<Integer> getVendorsLegintList() {
            return this.vendorsLegint_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public List<Integer> getVendorsList() {
            return this.vendors_;
        }

        @Override // ac.Models.ConsentOrBuilder
        public boolean hasConsentExpiration() {
            return this.consentExpiration_ != null;
        }

        @Override // ac.Models.ConsentOrBuilder
        public boolean hasGivenAt() {
            return this.givenAt_ != null;
        }

        public static Builder newBuilder(Consent consent) {
            return DEFAULT_INSTANCE.createBuilder(consent);
        }

        public static Consent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Consent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Consent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Consent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Consent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Consent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Consent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Consent parseFrom(InputStream inputStream) throws IOException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Consent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Consent parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Consent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Consent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ConsentExpirations extends GeneratedMessageLite<ConsentExpirations, Builder> implements ConsentExpirationsOrBuilder {
        private static final ConsentExpirations DEFAULT_INSTANCE;
        public static final int EXPIRATION_ACCEPT_ALL_FIELD_NUMBER = 1;
        public static final int EXPIRATION_CONTINUE_WITHOUT_ACCEPTING_FIELD_NUMBER = 4;
        public static final int EXPIRATION_MIXED_FIELD_NUMBER = 3;
        public static final int EXPIRATION_REFUSE_ALL_FIELD_NUMBER = 2;
        private static volatile Parser<ConsentExpirations> PARSER;
        private Duration expirationAcceptAll_;
        private Duration expirationContinueWithoutAccepting_;
        private Duration expirationMixed_;
        private Duration expirationRefuseAll_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ConsentExpirations, Builder> implements ConsentExpirationsOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearExpirationAcceptAll() {
                copyOnWrite();
                ((ConsentExpirations) this.instance).clearExpirationAcceptAll();
                return this;
            }

            public Builder clearExpirationContinueWithoutAccepting() {
                copyOnWrite();
                ((ConsentExpirations) this.instance).clearExpirationContinueWithoutAccepting();
                return this;
            }

            public Builder clearExpirationMixed() {
                copyOnWrite();
                ((ConsentExpirations) this.instance).clearExpirationMixed();
                return this;
            }

            public Builder clearExpirationRefuseAll() {
                copyOnWrite();
                ((ConsentExpirations) this.instance).clearExpirationRefuseAll();
                return this;
            }

            @Override // ac.Models.ConsentExpirationsOrBuilder
            public Duration getExpirationAcceptAll() {
                return ((ConsentExpirations) this.instance).getExpirationAcceptAll();
            }

            @Override // ac.Models.ConsentExpirationsOrBuilder
            public Duration getExpirationContinueWithoutAccepting() {
                return ((ConsentExpirations) this.instance).getExpirationContinueWithoutAccepting();
            }

            @Override // ac.Models.ConsentExpirationsOrBuilder
            public Duration getExpirationMixed() {
                return ((ConsentExpirations) this.instance).getExpirationMixed();
            }

            @Override // ac.Models.ConsentExpirationsOrBuilder
            public Duration getExpirationRefuseAll() {
                return ((ConsentExpirations) this.instance).getExpirationRefuseAll();
            }

            @Override // ac.Models.ConsentExpirationsOrBuilder
            public boolean hasExpirationAcceptAll() {
                return ((ConsentExpirations) this.instance).hasExpirationAcceptAll();
            }

            @Override // ac.Models.ConsentExpirationsOrBuilder
            public boolean hasExpirationContinueWithoutAccepting() {
                return ((ConsentExpirations) this.instance).hasExpirationContinueWithoutAccepting();
            }

            @Override // ac.Models.ConsentExpirationsOrBuilder
            public boolean hasExpirationMixed() {
                return ((ConsentExpirations) this.instance).hasExpirationMixed();
            }

            @Override // ac.Models.ConsentExpirationsOrBuilder
            public boolean hasExpirationRefuseAll() {
                return ((ConsentExpirations) this.instance).hasExpirationRefuseAll();
            }

            public Builder mergeExpirationAcceptAll(Duration duration) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).mergeExpirationAcceptAll(duration);
                return this;
            }

            public Builder mergeExpirationContinueWithoutAccepting(Duration duration) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).mergeExpirationContinueWithoutAccepting(duration);
                return this;
            }

            public Builder mergeExpirationMixed(Duration duration) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).mergeExpirationMixed(duration);
                return this;
            }

            public Builder mergeExpirationRefuseAll(Duration duration) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).mergeExpirationRefuseAll(duration);
                return this;
            }

            public Builder setExpirationAcceptAll(Duration duration) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).setExpirationAcceptAll(duration);
                return this;
            }

            public Builder setExpirationContinueWithoutAccepting(Duration duration) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).setExpirationContinueWithoutAccepting(duration);
                return this;
            }

            public Builder setExpirationMixed(Duration duration) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).setExpirationMixed(duration);
                return this;
            }

            public Builder setExpirationRefuseAll(Duration duration) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).setExpirationRefuseAll(duration);
                return this;
            }

            private Builder() {
                super(ConsentExpirations.DEFAULT_INSTANCE);
            }

            public Builder setExpirationAcceptAll(Duration.Builder builder) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).setExpirationAcceptAll(builder.build());
                return this;
            }

            public Builder setExpirationContinueWithoutAccepting(Duration.Builder builder) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).setExpirationContinueWithoutAccepting(builder.build());
                return this;
            }

            public Builder setExpirationMixed(Duration.Builder builder) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).setExpirationMixed(builder.build());
                return this;
            }

            public Builder setExpirationRefuseAll(Duration.Builder builder) {
                copyOnWrite();
                ((ConsentExpirations) this.instance).setExpirationRefuseAll(builder.build());
                return this;
            }
        }

        static {
            ConsentExpirations consentExpirations = new ConsentExpirations();
            DEFAULT_INSTANCE = consentExpirations;
            GeneratedMessageLite.registerDefaultInstance(ConsentExpirations.class, consentExpirations);
        }

        private ConsentExpirations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpirationAcceptAll() {
            this.expirationAcceptAll_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpirationContinueWithoutAccepting() {
            this.expirationContinueWithoutAccepting_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpirationMixed() {
            this.expirationMixed_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpirationRefuseAll() {
            this.expirationRefuseAll_ = null;
        }

        public static ConsentExpirations getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExpirationAcceptAll(Duration duration) {
            duration.getClass();
            Duration duration2 = this.expirationAcceptAll_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.expirationAcceptAll_ = duration;
            } else {
                this.expirationAcceptAll_ = Duration.newBuilder(this.expirationAcceptAll_).mergeFrom((Duration.Builder) duration).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExpirationContinueWithoutAccepting(Duration duration) {
            duration.getClass();
            Duration duration2 = this.expirationContinueWithoutAccepting_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.expirationContinueWithoutAccepting_ = duration;
            } else {
                this.expirationContinueWithoutAccepting_ = Duration.newBuilder(this.expirationContinueWithoutAccepting_).mergeFrom((Duration.Builder) duration).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExpirationMixed(Duration duration) {
            duration.getClass();
            Duration duration2 = this.expirationMixed_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.expirationMixed_ = duration;
            } else {
                this.expirationMixed_ = Duration.newBuilder(this.expirationMixed_).mergeFrom((Duration.Builder) duration).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeExpirationRefuseAll(Duration duration) {
            duration.getClass();
            Duration duration2 = this.expirationRefuseAll_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.expirationRefuseAll_ = duration;
            } else {
                this.expirationRefuseAll_ = Duration.newBuilder(this.expirationRefuseAll_).mergeFrom((Duration.Builder) duration).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ConsentExpirations parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ConsentExpirations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConsentExpirations parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ConsentExpirations> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpirationAcceptAll(Duration duration) {
            duration.getClass();
            this.expirationAcceptAll_ = duration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpirationContinueWithoutAccepting(Duration duration) {
            duration.getClass();
            this.expirationContinueWithoutAccepting_ = duration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpirationMixed(Duration duration) {
            duration.getClass();
            this.expirationMixed_ = duration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpirationRefuseAll(Duration duration) {
            duration.getClass();
            this.expirationRefuseAll_ = duration;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ConsentExpirations();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"expirationAcceptAll_", "expirationRefuseAll_", "expirationMixed_", "expirationContinueWithoutAccepting_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ConsentExpirations> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ConsentExpirations.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // ac.Models.ConsentExpirationsOrBuilder
        public Duration getExpirationAcceptAll() {
            Duration duration = this.expirationAcceptAll_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // ac.Models.ConsentExpirationsOrBuilder
        public Duration getExpirationContinueWithoutAccepting() {
            Duration duration = this.expirationContinueWithoutAccepting_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // ac.Models.ConsentExpirationsOrBuilder
        public Duration getExpirationMixed() {
            Duration duration = this.expirationMixed_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // ac.Models.ConsentExpirationsOrBuilder
        public Duration getExpirationRefuseAll() {
            Duration duration = this.expirationRefuseAll_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // ac.Models.ConsentExpirationsOrBuilder
        public boolean hasExpirationAcceptAll() {
            return this.expirationAcceptAll_ != null;
        }

        @Override // ac.Models.ConsentExpirationsOrBuilder
        public boolean hasExpirationContinueWithoutAccepting() {
            return this.expirationContinueWithoutAccepting_ != null;
        }

        @Override // ac.Models.ConsentExpirationsOrBuilder
        public boolean hasExpirationMixed() {
            return this.expirationMixed_ != null;
        }

        @Override // ac.Models.ConsentExpirationsOrBuilder
        public boolean hasExpirationRefuseAll() {
            return this.expirationRefuseAll_ != null;
        }

        public static Builder newBuilder(ConsentExpirations consentExpirations) {
            return DEFAULT_INSTANCE.createBuilder(consentExpirations);
        }

        public static ConsentExpirations parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConsentExpirations) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ConsentExpirations parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ConsentExpirations parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ConsentExpirations parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ConsentExpirations parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ConsentExpirations parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ConsentExpirations parseFrom(InputStream inputStream) throws IOException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConsentExpirations parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ConsentExpirations parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ConsentExpirations parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConsentExpirations) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ConsentExpirationsOrBuilder extends MessageLiteOrBuilder {
        Duration getExpirationAcceptAll();

        Duration getExpirationContinueWithoutAccepting();

        Duration getExpirationMixed();

        Duration getExpirationRefuseAll();

        boolean hasExpirationAcceptAll();

        boolean hasExpirationContinueWithoutAccepting();

        boolean hasExpirationMixed();

        boolean hasExpirationRefuseAll();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ConsentFloatingExtraPurpose extends GeneratedMessageLite<ConsentFloatingExtraPurpose, Builder> implements ConsentFloatingExtraPurposeOrBuilder {
        private static final ConsentFloatingExtraPurpose DEFAULT_INSTANCE;
        public static final int EXTERNAL_IDS_FIELD_NUMBER = 3;
        public static final int EXTRA_ID_FIELD_NUMBER = 1;
        public static final int GIVEN_AT_FIELD_NUMBER = 6;
        private static volatile Parser<ConsentFloatingExtraPurpose> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int UUID_FIELD_NUMBER = 7;
        public static final int VERSION_FIELD_NUMBER = 4;
        private Timestamp givenAt_;
        private int type_;
        private int version_;
        private MapFieldLite<String, String> externalIds_ = MapFieldLite.emptyMapField();
        private String extraId_ = "";
        private String uuid_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<ConsentFloatingExtraPurpose, Builder> implements ConsentFloatingExtraPurposeOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearExternalIds() {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).getMutableExternalIdsMap().clear();
                return this;
            }

            public Builder clearExtraId() {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).clearExtraId();
                return this;
            }

            public Builder clearGivenAt() {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).clearGivenAt();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).clearType();
                return this;
            }

            public Builder clearUuid() {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).clearUuid();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).clearVersion();
                return this;
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public boolean containsExternalIds(String str) {
                str.getClass();
                return ((ConsentFloatingExtraPurpose) this.instance).getExternalIdsMap().containsKey(str);
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            @Deprecated
            public Map<String, String> getExternalIds() {
                return getExternalIdsMap();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public int getExternalIdsCount() {
                return ((ConsentFloatingExtraPurpose) this.instance).getExternalIdsMap().size();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public Map<String, String> getExternalIdsMap() {
                return Collections.unmodifiableMap(((ConsentFloatingExtraPurpose) this.instance).getExternalIdsMap());
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public String getExternalIdsOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> externalIdsMap = ((ConsentFloatingExtraPurpose) this.instance).getExternalIdsMap();
                return externalIdsMap.containsKey(str) ? externalIdsMap.get(str) : str2;
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public String getExternalIdsOrThrow(String str) {
                str.getClass();
                Map<String, String> externalIdsMap = ((ConsentFloatingExtraPurpose) this.instance).getExternalIdsMap();
                if (externalIdsMap.containsKey(str)) {
                    return externalIdsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public String getExtraId() {
                return ((ConsentFloatingExtraPurpose) this.instance).getExtraId();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public ByteString getExtraIdBytes() {
                return ((ConsentFloatingExtraPurpose) this.instance).getExtraIdBytes();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public Timestamp getGivenAt() {
                return ((ConsentFloatingExtraPurpose) this.instance).getGivenAt();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public ConsentFloatingExtraPurposeType getType() {
                return ((ConsentFloatingExtraPurpose) this.instance).getType();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public int getTypeValue() {
                return ((ConsentFloatingExtraPurpose) this.instance).getTypeValue();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public String getUuid() {
                return ((ConsentFloatingExtraPurpose) this.instance).getUuid();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public ByteString getUuidBytes() {
                return ((ConsentFloatingExtraPurpose) this.instance).getUuidBytes();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public int getVersion() {
                return ((ConsentFloatingExtraPurpose) this.instance).getVersion();
            }

            @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
            public boolean hasGivenAt() {
                return ((ConsentFloatingExtraPurpose) this.instance).hasGivenAt();
            }

            public Builder mergeGivenAt(Timestamp timestamp) {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).mergeGivenAt(timestamp);
                return this;
            }

            public Builder putAllExternalIds(Map<String, String> map) {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).getMutableExternalIdsMap().putAll(map);
                return this;
            }

            public Builder putExternalIds(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).getMutableExternalIdsMap().put(str, str2);
                return this;
            }

            public Builder removeExternalIds(String str) {
                str.getClass();
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).getMutableExternalIdsMap().remove(str);
                return this;
            }

            public Builder setExtraId(String str) {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).setExtraId(str);
                return this;
            }

            public Builder setExtraIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).setExtraIdBytes(byteString);
                return this;
            }

            public Builder setGivenAt(Timestamp timestamp) {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).setGivenAt(timestamp);
                return this;
            }

            public Builder setType(ConsentFloatingExtraPurposeType consentFloatingExtraPurposeType) {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).setType(consentFloatingExtraPurposeType);
                return this;
            }

            public Builder setTypeValue(int i10) {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).setTypeValue(i10);
                return this;
            }

            public Builder setUuid(String str) {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).setUuid(str);
                return this;
            }

            public Builder setUuidBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).setUuidBytes(byteString);
                return this;
            }

            public Builder setVersion(int i10) {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).setVersion(i10);
                return this;
            }

            private Builder() {
                super(ConsentFloatingExtraPurpose.DEFAULT_INSTANCE);
            }

            public Builder setGivenAt(Timestamp.Builder builder) {
                copyOnWrite();
                ((ConsentFloatingExtraPurpose) this.instance).setGivenAt(builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ExternalIdsDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private ExternalIdsDefaultEntryHolder() {
            }
        }

        static {
            ConsentFloatingExtraPurpose consentFloatingExtraPurpose = new ConsentFloatingExtraPurpose();
            DEFAULT_INSTANCE = consentFloatingExtraPurpose;
            GeneratedMessageLite.registerDefaultInstance(ConsentFloatingExtraPurpose.class, consentFloatingExtraPurpose);
        }

        private ConsentFloatingExtraPurpose() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtraId() {
            this.extraId_ = getDefaultInstance().getExtraId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGivenAt() {
            this.givenAt_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.uuid_ = getDefaultInstance().getUuid();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static ConsentFloatingExtraPurpose getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableExternalIdsMap() {
            return internalGetMutableExternalIds();
        }

        private MapFieldLite<String, String> internalGetExternalIds() {
            return this.externalIds_;
        }

        private MapFieldLite<String, String> internalGetMutableExternalIds() {
            if (!this.externalIds_.isMutable()) {
                this.externalIds_ = this.externalIds_.mutableCopy();
            }
            return this.externalIds_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeGivenAt(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.givenAt_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.givenAt_ = timestamp;
            } else {
                this.givenAt_ = Timestamp.newBuilder(this.givenAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ConsentFloatingExtraPurpose parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConsentFloatingExtraPurpose parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ConsentFloatingExtraPurpose> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtraId(String str) {
            str.getClass();
            this.extraId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtraIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.extraId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGivenAt(Timestamp timestamp) {
            timestamp.getClass();
            this.givenAt_ = timestamp;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(ConsentFloatingExtraPurposeType consentFloatingExtraPurposeType) {
            this.type_ = consentFloatingExtraPurposeType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeValue(int i10) {
            this.type_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.uuid_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i10) {
            this.version_ = i10;
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public boolean containsExternalIds(String str) {
            str.getClass();
            return internalGetExternalIds().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ConsentFloatingExtraPurpose();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0001\u0000\u0000\u0001Ȉ\u0002\f\u00032\u0004\u000b\u0006\t\u0007Ȉ", new Object[]{"extraId_", "type_", "externalIds_", ExternalIdsDefaultEntryHolder.defaultEntry, "version_", "givenAt_", "uuid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ConsentFloatingExtraPurpose> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ConsentFloatingExtraPurpose.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        @Deprecated
        public Map<String, String> getExternalIds() {
            return getExternalIdsMap();
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public int getExternalIdsCount() {
            return internalGetExternalIds().size();
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public Map<String, String> getExternalIdsMap() {
            return Collections.unmodifiableMap(internalGetExternalIds());
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public String getExternalIdsOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            return mapFieldLiteInternalGetExternalIds.containsKey(str) ? mapFieldLiteInternalGetExternalIds.get(str) : str2;
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public String getExternalIdsOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetExternalIds = internalGetExternalIds();
            if (mapFieldLiteInternalGetExternalIds.containsKey(str)) {
                return mapFieldLiteInternalGetExternalIds.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public String getExtraId() {
            return this.extraId_;
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public ByteString getExtraIdBytes() {
            return ByteString.copyFromUtf8(this.extraId_);
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public Timestamp getGivenAt() {
            Timestamp timestamp = this.givenAt_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public ConsentFloatingExtraPurposeType getType() {
            ConsentFloatingExtraPurposeType consentFloatingExtraPurposeTypeForNumber = ConsentFloatingExtraPurposeType.forNumber(this.type_);
            return consentFloatingExtraPurposeTypeForNumber == null ? ConsentFloatingExtraPurposeType.UNRECOGNIZED : consentFloatingExtraPurposeTypeForNumber;
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public String getUuid() {
            return this.uuid_;
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public ByteString getUuidBytes() {
            return ByteString.copyFromUtf8(this.uuid_);
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // ac.Models.ConsentFloatingExtraPurposeOrBuilder
        public boolean hasGivenAt() {
            return this.givenAt_ != null;
        }

        public static Builder newBuilder(ConsentFloatingExtraPurpose consentFloatingExtraPurpose) {
            return DEFAULT_INSTANCE.createBuilder(consentFloatingExtraPurpose);
        }

        public static ConsentFloatingExtraPurpose parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ConsentFloatingExtraPurpose parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ConsentFloatingExtraPurpose parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ConsentFloatingExtraPurpose parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ConsentFloatingExtraPurpose parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ConsentFloatingExtraPurpose parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ConsentFloatingExtraPurpose parseFrom(InputStream inputStream) throws IOException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ConsentFloatingExtraPurpose parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ConsentFloatingExtraPurpose parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ConsentFloatingExtraPurpose parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ConsentFloatingExtraPurpose) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ConsentFloatingExtraPurposeOrBuilder extends MessageLiteOrBuilder {
        boolean containsExternalIds(String str);

        @Deprecated
        Map<String, String> getExternalIds();

        int getExternalIdsCount();

        Map<String, String> getExternalIdsMap();

        String getExternalIdsOrDefault(String str, String str2);

        String getExternalIdsOrThrow(String str);

        String getExtraId();

        ByteString getExtraIdBytes();

        Timestamp getGivenAt();

        ConsentFloatingExtraPurposeType getType();

        int getTypeValue();

        String getUuid();

        ByteString getUuidBytes();

        int getVersion();

        boolean hasGivenAt();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum ConsentFloatingExtraPurposeType implements Internal.EnumLite {
        ConsentFloatingExtraPurposeType_UNKNOWN(0),
        ConsentFloatingExtraPurposeType_ACCEPT(1),
        ConsentFloatingExtraPurposeType_DENY(2),
        UNRECOGNIZED(-1);

        public static final int ConsentFloatingExtraPurposeType_ACCEPT_VALUE = 1;
        public static final int ConsentFloatingExtraPurposeType_DENY_VALUE = 2;
        public static final int ConsentFloatingExtraPurposeType_UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<ConsentFloatingExtraPurposeType> internalValueMap = new Internal.EnumLiteMap<ConsentFloatingExtraPurposeType>() { // from class: ac.Models.ConsentFloatingExtraPurposeType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ConsentFloatingExtraPurposeType findValueByNumber(int i10) {
                return ConsentFloatingExtraPurposeType.forNumber(i10);
            }
        };
        private final int value;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ConsentFloatingExtraPurposeTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new ConsentFloatingExtraPurposeTypeVerifier();

            private ConsentFloatingExtraPurposeTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i10) {
                return ConsentFloatingExtraPurposeType.forNumber(i10) != null;
            }
        }

        ConsentFloatingExtraPurposeType(int i10) {
            this.value = i10;
        }

        public static ConsentFloatingExtraPurposeType forNumber(int i10) {
            if (i10 == 0) {
                return ConsentFloatingExtraPurposeType_UNKNOWN;
            }
            if (i10 == 1) {
                return ConsentFloatingExtraPurposeType_ACCEPT;
            }
            if (i10 != 2) {
                return null;
            }
            return ConsentFloatingExtraPurposeType_DENY;
        }

        public static Internal.EnumLiteMap<ConsentFloatingExtraPurposeType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return ConsentFloatingExtraPurposeTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ConsentFloatingExtraPurposeType valueOf(int i10) {
            return forNumber(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ConsentOrBuilder extends MessageLiteOrBuilder {
        boolean containsExternalIds(String str);

        boolean containsPurposesNames(int i10);

        String getBlockId();

        ByteString getBlockIdBytes();

        String getCmpHash();

        ByteString getCmpHashBytes();

        int getCmpHashVersion();

        int getCmpVersion();

        Duration getConsentExpiration();

        @Deprecated
        Map<String, String> getExternalIds();

        int getExternalIdsCount();

        Map<String, String> getExternalIdsMap();

        String getExternalIdsOrDefault(String str, String str2);

        String getExternalIdsOrThrow(String str);

        Timestamp getGivenAt();

        String getIabCs();

        ByteString getIabCsBytes();

        String getOrigin();

        ByteString getOriginBytes();

        int getPurposes(int i10);

        int getPurposesCount();

        int getPurposesDenied(int i10);

        int getPurposesDeniedCount();

        List<Integer> getPurposesDeniedList();

        int getPurposesLegint(int i10);

        int getPurposesLegintCount();

        List<Integer> getPurposesLegintList();

        List<Integer> getPurposesList();

        int getPurposesListed(int i10);

        int getPurposesListedCount();

        List<Integer> getPurposesListedList();

        int getPurposesMandatory(int i10);

        int getPurposesMandatoryCount();

        List<Integer> getPurposesMandatoryList();

        @Deprecated
        Map<Integer, I18NString> getPurposesNames();

        int getPurposesNamesCount();

        Map<Integer, I18NString> getPurposesNamesMap();

        I18NString getPurposesNamesOrDefault(int i10, I18NString i18NString);

        I18NString getPurposesNamesOrThrow(int i10);

        int getSpecialFeatures(int i10);

        int getSpecialFeaturesCount();

        List<Integer> getSpecialFeaturesList();

        String getTransactionId();

        ByteString getTransactionIdBytes();

        Consent.EnumConsentType getType();

        int getTypeValue();

        String getUuid();

        ByteString getUuidBytes();

        int getVendors(int i10);

        int getVendorsCount();

        int getVendorsLegint(int i10);

        int getVendorsLegintCount();

        List<Integer> getVendorsLegintList();

        List<Integer> getVendorsList();

        boolean hasConsentExpiration();

        boolean hasGivenAt();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Country extends GeneratedMessageLite<Country, Builder> implements CountryOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final Country DEFAULT_INSTANCE;
        public static final int GDPR_FIELD_NUMBER = 2;
        private static volatile Parser<Country> PARSER;
        private String code_ = "";
        private boolean gdpr_;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<Country, Builder> implements CountryOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Country) this.instance).clearCode();
                return this;
            }

            public Builder clearGdpr() {
                copyOnWrite();
                ((Country) this.instance).clearGdpr();
                return this;
            }

            @Override // ac.Models.CountryOrBuilder
            public String getCode() {
                return ((Country) this.instance).getCode();
            }

            @Override // ac.Models.CountryOrBuilder
            public ByteString getCodeBytes() {
                return ((Country) this.instance).getCodeBytes();
            }

            @Override // ac.Models.CountryOrBuilder
            public boolean getGdpr() {
                return ((Country) this.instance).getGdpr();
            }

            public Builder setCode(String str) {
                copyOnWrite();
                ((Country) this.instance).setCode(str);
                return this;
            }

            public Builder setCodeBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Country) this.instance).setCodeBytes(byteString);
                return this;
            }

            public Builder setGdpr(boolean z10) {
                copyOnWrite();
                ((Country) this.instance).setGdpr(z10);
                return this;
            }

            private Builder() {
                super(Country.DEFAULT_INSTANCE);
            }
        }

        static {
            Country country = new Country();
            DEFAULT_INSTANCE = country;
            GeneratedMessageLite.registerDefaultInstance(Country.class, country);
        }

        private Country() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = getDefaultInstance().getCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGdpr() {
            this.gdpr_ = false;
        }

        public static Country getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Country parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Country) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Country parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Country> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(String str) {
            str.getClass();
            this.code_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.code_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGdpr(boolean z10) {
            this.gdpr_ = z10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Country();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"code_", "gdpr_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Country> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Country.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // ac.Models.CountryOrBuilder
        public String getCode() {
            return this.code_;
        }

        @Override // ac.Models.CountryOrBuilder
        public ByteString getCodeBytes() {
            return ByteString.copyFromUtf8(this.code_);
        }

        @Override // ac.Models.CountryOrBuilder
        public boolean getGdpr() {
            return this.gdpr_;
        }

        public static Builder newBuilder(Country country) {
            return DEFAULT_INSTANCE.createBuilder(country);
        }

        public static Country parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Country) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Country parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Country parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Country parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Country parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Country parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Country parseFrom(InputStream inputStream) throws IOException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Country parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Country parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Country parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Country) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface CountryOrBuilder extends MessageLiteOrBuilder {
        String getCode();

        ByteString getCodeBytes();

        boolean getGdpr();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class I18NString extends GeneratedMessageLite<I18NString, Builder> implements I18NStringOrBuilder {
        private static final I18NString DEFAULT_INSTANCE;
        private static volatile Parser<I18NString> PARSER = null;
        public static final int VALUES_FIELD_NUMBER = 1;
        private MapFieldLite<String, String> values_ = MapFieldLite.emptyMapField();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<I18NString, Builder> implements I18NStringOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearValues() {
                copyOnWrite();
                ((I18NString) this.instance).getMutableValuesMap().clear();
                return this;
            }

            @Override // ac.Models.I18NStringOrBuilder
            public boolean containsValues(String str) {
                str.getClass();
                return ((I18NString) this.instance).getValuesMap().containsKey(str);
            }

            @Override // ac.Models.I18NStringOrBuilder
            @Deprecated
            public Map<String, String> getValues() {
                return getValuesMap();
            }

            @Override // ac.Models.I18NStringOrBuilder
            public int getValuesCount() {
                return ((I18NString) this.instance).getValuesMap().size();
            }

            @Override // ac.Models.I18NStringOrBuilder
            public Map<String, String> getValuesMap() {
                return Collections.unmodifiableMap(((I18NString) this.instance).getValuesMap());
            }

            @Override // ac.Models.I18NStringOrBuilder
            public String getValuesOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> valuesMap = ((I18NString) this.instance).getValuesMap();
                return valuesMap.containsKey(str) ? valuesMap.get(str) : str2;
            }

            @Override // ac.Models.I18NStringOrBuilder
            public String getValuesOrThrow(String str) {
                str.getClass();
                Map<String, String> valuesMap = ((I18NString) this.instance).getValuesMap();
                if (valuesMap.containsKey(str)) {
                    return valuesMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllValues(Map<String, String> map) {
                copyOnWrite();
                ((I18NString) this.instance).getMutableValuesMap().putAll(map);
                return this;
            }

            public Builder putValues(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((I18NString) this.instance).getMutableValuesMap().put(str, str2);
                return this;
            }

            public Builder removeValues(String str) {
                str.getClass();
                copyOnWrite();
                ((I18NString) this.instance).getMutableValuesMap().remove(str);
                return this;
            }

            private Builder() {
                super(I18NString.DEFAULT_INSTANCE);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class ValuesDefaultEntryHolder {
            static final MapEntryLite<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }

            private ValuesDefaultEntryHolder() {
            }
        }

        static {
            I18NString i18NString = new I18NString();
            DEFAULT_INSTANCE = i18NString;
            GeneratedMessageLite.registerDefaultInstance(I18NString.class, i18NString);
        }

        private I18NString() {
        }

        public static I18NString getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableValuesMap() {
            return internalGetMutableValues();
        }

        private MapFieldLite<String, String> internalGetMutableValues() {
            if (!this.values_.isMutable()) {
                this.values_ = this.values_.mutableCopy();
            }
            return this.values_;
        }

        private MapFieldLite<String, String> internalGetValues() {
            return this.values_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static I18NString parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (I18NString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static I18NString parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<I18NString> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // ac.Models.I18NStringOrBuilder
        public boolean containsValues(String str) {
            str.getClass();
            return internalGetValues().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new I18NString();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", ValuesDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<I18NString> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (I18NString.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // ac.Models.I18NStringOrBuilder
        @Deprecated
        public Map<String, String> getValues() {
            return getValuesMap();
        }

        @Override // ac.Models.I18NStringOrBuilder
        public int getValuesCount() {
            return internalGetValues().size();
        }

        @Override // ac.Models.I18NStringOrBuilder
        public Map<String, String> getValuesMap() {
            return Collections.unmodifiableMap(internalGetValues());
        }

        @Override // ac.Models.I18NStringOrBuilder
        public String getValuesOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetValues = internalGetValues();
            return mapFieldLiteInternalGetValues.containsKey(str) ? mapFieldLiteInternalGetValues.get(str) : str2;
        }

        @Override // ac.Models.I18NStringOrBuilder
        public String getValuesOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetValues = internalGetValues();
            if (mapFieldLiteInternalGetValues.containsKey(str)) {
                return mapFieldLiteInternalGetValues.get(str);
            }
            throw new IllegalArgumentException();
        }

        public static Builder newBuilder(I18NString i18NString) {
            return DEFAULT_INSTANCE.createBuilder(i18NString);
        }

        public static I18NString parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (I18NString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static I18NString parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static I18NString parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static I18NString parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static I18NString parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static I18NString parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static I18NString parseFrom(InputStream inputStream) throws IOException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static I18NString parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static I18NString parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static I18NString parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (I18NString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface I18NStringOrBuilder extends MessageLiteOrBuilder {
        boolean containsValues(String str);

        @Deprecated
        Map<String, String> getValues();

        int getValuesCount();

        Map<String, String> getValuesMap();

        String getValuesOrDefault(String str, String str2);

        String getValuesOrThrow(String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Vendorlist extends GeneratedMessageLite<Vendorlist, Builder> implements VendorlistOrBuilder {
        public static final int CONSENTABLES_FIELD_NUMBER = 2;
        public static final int CONSENT_LIFETIME_FIELD_NUMBER = 17;
        public static final int DATA_CATEGORIES_FIELD_NUMBER = 19;
        private static final Vendorlist DEFAULT_INSTANCE;
        public static final int GEOLOC_AD_FIELD_NUMBER = 14;
        public static final int GEOLOC_MARKET_FIELD_NUMBER = 15;
        public static final int GOOGLE_PROVIDERS_FIELD_NUMBER = 16;
        public static final int IAB_GVL_FIELD_NUMBER = 1;
        private static volatile Parser<Vendorlist> PARSER = null;
        public static final int PUBLISHER_CC_FIELD_NUMBER = 12;
        public static final int PUBLISHER_RESTRICTIONS_FIELD_NUMBER = 13;
        public static final int REMOVE_LEGINTABLES_FIELD_NUMBER = 18;
        public static final int STACKS_FIELD_NUMBER = 6;
        public static final int TCF_POLICY_VERSION_FIELD_NUMBER = 11;
        public static final int VENDORS_FIELD_NUMBER = 3;
        private int consentLifetime_;
        private int iabGvl_;
        private boolean removeLegintables_;
        private int tcfPolicyVersion_;
        private MapFieldLite<Integer, DataCategory> dataCategories_ = MapFieldLite.emptyMapField();
        private Internal.ProtobufList<Consentable> consentables_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Vendor> vendors_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Stack> stacks_ = GeneratedMessageLite.emptyProtobufList();
        private String publisherCc_ = "";
        private String publisherRestrictions_ = "";
        private Internal.IntList geolocAd_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList geolocMarket_ = GeneratedMessageLite.emptyIntList();
        private String googleProviders_ = "";

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Builder extends GeneratedMessageLite.Builder<Vendorlist, Builder> implements VendorlistOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllConsentables(Iterable<? extends Consentable> iterable) {
                copyOnWrite();
                ((Vendorlist) this.instance).addAllConsentables(iterable);
                return this;
            }

            public Builder addAllGeolocAd(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Vendorlist) this.instance).addAllGeolocAd(iterable);
                return this;
            }

            public Builder addAllGeolocMarket(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Vendorlist) this.instance).addAllGeolocMarket(iterable);
                return this;
            }

            public Builder addAllStacks(Iterable<? extends Stack> iterable) {
                copyOnWrite();
                ((Vendorlist) this.instance).addAllStacks(iterable);
                return this;
            }

            public Builder addAllVendors(Iterable<? extends Vendor> iterable) {
                copyOnWrite();
                ((Vendorlist) this.instance).addAllVendors(iterable);
                return this;
            }

            public Builder addConsentables(Consentable consentable) {
                copyOnWrite();
                ((Vendorlist) this.instance).addConsentables(consentable);
                return this;
            }

            public Builder addGeolocAd(int i10) {
                copyOnWrite();
                ((Vendorlist) this.instance).addGeolocAd(i10);
                return this;
            }

            public Builder addGeolocMarket(int i10) {
                copyOnWrite();
                ((Vendorlist) this.instance).addGeolocMarket(i10);
                return this;
            }

            public Builder addStacks(Stack stack) {
                copyOnWrite();
                ((Vendorlist) this.instance).addStacks(stack);
                return this;
            }

            public Builder addVendors(Vendor vendor) {
                copyOnWrite();
                ((Vendorlist) this.instance).addVendors(vendor);
                return this;
            }

            public Builder clearConsentLifetime() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearConsentLifetime();
                return this;
            }

            public Builder clearConsentables() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearConsentables();
                return this;
            }

            public Builder clearDataCategories() {
                copyOnWrite();
                ((Vendorlist) this.instance).getMutableDataCategoriesMap().clear();
                return this;
            }

            public Builder clearGeolocAd() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearGeolocAd();
                return this;
            }

            public Builder clearGeolocMarket() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearGeolocMarket();
                return this;
            }

            public Builder clearGoogleProviders() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearGoogleProviders();
                return this;
            }

            public Builder clearIabGvl() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearIabGvl();
                return this;
            }

            public Builder clearPublisherCc() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearPublisherCc();
                return this;
            }

            public Builder clearPublisherRestrictions() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearPublisherRestrictions();
                return this;
            }

            public Builder clearRemoveLegintables() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearRemoveLegintables();
                return this;
            }

            public Builder clearStacks() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearStacks();
                return this;
            }

            public Builder clearTcfPolicyVersion() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearTcfPolicyVersion();
                return this;
            }

            public Builder clearVendors() {
                copyOnWrite();
                ((Vendorlist) this.instance).clearVendors();
                return this;
            }

            @Override // ac.Models.VendorlistOrBuilder
            public boolean containsDataCategories(int i10) {
                return ((Vendorlist) this.instance).getDataCategoriesMap().containsKey(Integer.valueOf(i10));
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getConsentLifetime() {
                return ((Vendorlist) this.instance).getConsentLifetime();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public Consentable getConsentables(int i10) {
                return ((Vendorlist) this.instance).getConsentables(i10);
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getConsentablesCount() {
                return ((Vendorlist) this.instance).getConsentablesCount();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public List<Consentable> getConsentablesList() {
                return Collections.unmodifiableList(((Vendorlist) this.instance).getConsentablesList());
            }

            @Override // ac.Models.VendorlistOrBuilder
            @Deprecated
            public Map<Integer, DataCategory> getDataCategories() {
                return getDataCategoriesMap();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getDataCategoriesCount() {
                return ((Vendorlist) this.instance).getDataCategoriesMap().size();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public Map<Integer, DataCategory> getDataCategoriesMap() {
                return Collections.unmodifiableMap(((Vendorlist) this.instance).getDataCategoriesMap());
            }

            @Override // ac.Models.VendorlistOrBuilder
            public DataCategory getDataCategoriesOrDefault(int i10, DataCategory dataCategory) {
                Map<Integer, DataCategory> dataCategoriesMap = ((Vendorlist) this.instance).getDataCategoriesMap();
                return dataCategoriesMap.containsKey(Integer.valueOf(i10)) ? dataCategoriesMap.get(Integer.valueOf(i10)) : dataCategory;
            }

            @Override // ac.Models.VendorlistOrBuilder
            public DataCategory getDataCategoriesOrThrow(int i10) {
                Map<Integer, DataCategory> dataCategoriesMap = ((Vendorlist) this.instance).getDataCategoriesMap();
                if (dataCategoriesMap.containsKey(Integer.valueOf(i10))) {
                    return dataCategoriesMap.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getGeolocAd(int i10) {
                return ((Vendorlist) this.instance).getGeolocAd(i10);
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getGeolocAdCount() {
                return ((Vendorlist) this.instance).getGeolocAdCount();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public List<Integer> getGeolocAdList() {
                return Collections.unmodifiableList(((Vendorlist) this.instance).getGeolocAdList());
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getGeolocMarket(int i10) {
                return ((Vendorlist) this.instance).getGeolocMarket(i10);
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getGeolocMarketCount() {
                return ((Vendorlist) this.instance).getGeolocMarketCount();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public List<Integer> getGeolocMarketList() {
                return Collections.unmodifiableList(((Vendorlist) this.instance).getGeolocMarketList());
            }

            @Override // ac.Models.VendorlistOrBuilder
            public String getGoogleProviders() {
                return ((Vendorlist) this.instance).getGoogleProviders();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public ByteString getGoogleProvidersBytes() {
                return ((Vendorlist) this.instance).getGoogleProvidersBytes();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getIabGvl() {
                return ((Vendorlist) this.instance).getIabGvl();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public String getPublisherCc() {
                return ((Vendorlist) this.instance).getPublisherCc();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public ByteString getPublisherCcBytes() {
                return ((Vendorlist) this.instance).getPublisherCcBytes();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public String getPublisherRestrictions() {
                return ((Vendorlist) this.instance).getPublisherRestrictions();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public ByteString getPublisherRestrictionsBytes() {
                return ((Vendorlist) this.instance).getPublisherRestrictionsBytes();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public boolean getRemoveLegintables() {
                return ((Vendorlist) this.instance).getRemoveLegintables();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public Stack getStacks(int i10) {
                return ((Vendorlist) this.instance).getStacks(i10);
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getStacksCount() {
                return ((Vendorlist) this.instance).getStacksCount();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public List<Stack> getStacksList() {
                return Collections.unmodifiableList(((Vendorlist) this.instance).getStacksList());
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getTcfPolicyVersion() {
                return ((Vendorlist) this.instance).getTcfPolicyVersion();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public Vendor getVendors(int i10) {
                return ((Vendorlist) this.instance).getVendors(i10);
            }

            @Override // ac.Models.VendorlistOrBuilder
            public int getVendorsCount() {
                return ((Vendorlist) this.instance).getVendorsCount();
            }

            @Override // ac.Models.VendorlistOrBuilder
            public List<Vendor> getVendorsList() {
                return Collections.unmodifiableList(((Vendorlist) this.instance).getVendorsList());
            }

            public Builder putAllDataCategories(Map<Integer, DataCategory> map) {
                copyOnWrite();
                ((Vendorlist) this.instance).getMutableDataCategoriesMap().putAll(map);
                return this;
            }

            public Builder putDataCategories(int i10, DataCategory dataCategory) {
                dataCategory.getClass();
                copyOnWrite();
                ((Vendorlist) this.instance).getMutableDataCategoriesMap().put(Integer.valueOf(i10), dataCategory);
                return this;
            }

            public Builder removeConsentables(int i10) {
                copyOnWrite();
                ((Vendorlist) this.instance).removeConsentables(i10);
                return this;
            }

            public Builder removeDataCategories(int i10) {
                copyOnWrite();
                ((Vendorlist) this.instance).getMutableDataCategoriesMap().remove(Integer.valueOf(i10));
                return this;
            }

            public Builder removeStacks(int i10) {
                copyOnWrite();
                ((Vendorlist) this.instance).removeStacks(i10);
                return this;
            }

            public Builder removeVendors(int i10) {
                copyOnWrite();
                ((Vendorlist) this.instance).removeVendors(i10);
                return this;
            }

            public Builder setConsentLifetime(int i10) {
                copyOnWrite();
                ((Vendorlist) this.instance).setConsentLifetime(i10);
                return this;
            }

            public Builder setConsentables(int i10, Consentable consentable) {
                copyOnWrite();
                ((Vendorlist) this.instance).setConsentables(i10, consentable);
                return this;
            }

            public Builder setGeolocAd(int i10, int i11) {
                copyOnWrite();
                ((Vendorlist) this.instance).setGeolocAd(i10, i11);
                return this;
            }

            public Builder setGeolocMarket(int i10, int i11) {
                copyOnWrite();
                ((Vendorlist) this.instance).setGeolocMarket(i10, i11);
                return this;
            }

            public Builder setGoogleProviders(String str) {
                copyOnWrite();
                ((Vendorlist) this.instance).setGoogleProviders(str);
                return this;
            }

            public Builder setGoogleProvidersBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Vendorlist) this.instance).setGoogleProvidersBytes(byteString);
                return this;
            }

            public Builder setIabGvl(int i10) {
                copyOnWrite();
                ((Vendorlist) this.instance).setIabGvl(i10);
                return this;
            }

            public Builder setPublisherCc(String str) {
                copyOnWrite();
                ((Vendorlist) this.instance).setPublisherCc(str);
                return this;
            }

            public Builder setPublisherCcBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Vendorlist) this.instance).setPublisherCcBytes(byteString);
                return this;
            }

            public Builder setPublisherRestrictions(String str) {
                copyOnWrite();
                ((Vendorlist) this.instance).setPublisherRestrictions(str);
                return this;
            }

            public Builder setPublisherRestrictionsBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((Vendorlist) this.instance).setPublisherRestrictionsBytes(byteString);
                return this;
            }

            public Builder setRemoveLegintables(boolean z10) {
                copyOnWrite();
                ((Vendorlist) this.instance).setRemoveLegintables(z10);
                return this;
            }

            public Builder setStacks(int i10, Stack stack) {
                copyOnWrite();
                ((Vendorlist) this.instance).setStacks(i10, stack);
                return this;
            }

            public Builder setTcfPolicyVersion(int i10) {
                copyOnWrite();
                ((Vendorlist) this.instance).setTcfPolicyVersion(i10);
                return this;
            }

            public Builder setVendors(int i10, Vendor vendor) {
                copyOnWrite();
                ((Vendorlist) this.instance).setVendors(i10, vendor);
                return this;
            }

            private Builder() {
                super(Vendorlist.DEFAULT_INSTANCE);
            }

            public Builder addConsentables(int i10, Consentable consentable) {
                copyOnWrite();
                ((Vendorlist) this.instance).addConsentables(i10, consentable);
                return this;
            }

            public Builder addStacks(int i10, Stack stack) {
                copyOnWrite();
                ((Vendorlist) this.instance).addStacks(i10, stack);
                return this;
            }

            public Builder addVendors(int i10, Vendor vendor) {
                copyOnWrite();
                ((Vendorlist) this.instance).addVendors(i10, vendor);
                return this;
            }

            public Builder setConsentables(int i10, Consentable.Builder builder) {
                copyOnWrite();
                ((Vendorlist) this.instance).setConsentables(i10, builder.build());
                return this;
            }

            public Builder setStacks(int i10, Stack.Builder builder) {
                copyOnWrite();
                ((Vendorlist) this.instance).setStacks(i10, builder.build());
                return this;
            }

            public Builder setVendors(int i10, Vendor.Builder builder) {
                copyOnWrite();
                ((Vendorlist) this.instance).setVendors(i10, builder.build());
                return this;
            }

            public Builder addConsentables(Consentable.Builder builder) {
                copyOnWrite();
                ((Vendorlist) this.instance).addConsentables(builder.build());
                return this;
            }

            public Builder addStacks(Stack.Builder builder) {
                copyOnWrite();
                ((Vendorlist) this.instance).addStacks(builder.build());
                return this;
            }

            public Builder addVendors(Vendor.Builder builder) {
                copyOnWrite();
                ((Vendorlist) this.instance).addVendors(builder.build());
                return this;
            }

            public Builder addConsentables(int i10, Consentable.Builder builder) {
                copyOnWrite();
                ((Vendorlist) this.instance).addConsentables(i10, builder.build());
                return this;
            }

            public Builder addStacks(int i10, Stack.Builder builder) {
                copyOnWrite();
                ((Vendorlist) this.instance).addStacks(i10, builder.build());
                return this;
            }

            public Builder addVendors(int i10, Vendor.Builder builder) {
                copyOnWrite();
                ((Vendorlist) this.instance).addVendors(i10, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Consentable extends GeneratedMessageLite<Consentable, Builder> implements ConsentableOrBuilder {
            private static final Consentable DEFAULT_INSTANCE;
            public static final int DESCRIPTION_FIELD_NUMBER = 4;
            public static final int DESCRIPTION_LEGAL_FIELD_NUMBER = 5;
            public static final int EXTRA_ID_FIELD_NUMBER = 7;
            public static final int IAB_ID_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int ILLUSTRATIONS_FIELD_NUMBER = 8;
            public static final int NAME_FIELD_NUMBER = 3;
            private static volatile Parser<Consentable> PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 6;
            public static final int VENDORS_NUMBER_FIELD_NUMBER = 9;
            private I18NString descriptionLegal_;
            private I18NString description_;
            private String extraId_ = "";
            private int iabId_;
            private int id_;
            private I18NString illustrations_;
            private I18NString name_;
            private int type_;
            private int vendorsNumber_;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<Consentable, Builder> implements ConsentableOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder clearDescription() {
                    copyOnWrite();
                    ((Consentable) this.instance).clearDescription();
                    return this;
                }

                public Builder clearDescriptionLegal() {
                    copyOnWrite();
                    ((Consentable) this.instance).clearDescriptionLegal();
                    return this;
                }

                public Builder clearExtraId() {
                    copyOnWrite();
                    ((Consentable) this.instance).clearExtraId();
                    return this;
                }

                public Builder clearIabId() {
                    copyOnWrite();
                    ((Consentable) this.instance).clearIabId();
                    return this;
                }

                public Builder clearId() {
                    copyOnWrite();
                    ((Consentable) this.instance).clearId();
                    return this;
                }

                public Builder clearIllustrations() {
                    copyOnWrite();
                    ((Consentable) this.instance).clearIllustrations();
                    return this;
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((Consentable) this.instance).clearName();
                    return this;
                }

                public Builder clearType() {
                    copyOnWrite();
                    ((Consentable) this.instance).clearType();
                    return this;
                }

                public Builder clearVendorsNumber() {
                    copyOnWrite();
                    ((Consentable) this.instance).clearVendorsNumber();
                    return this;
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public I18NString getDescription() {
                    return ((Consentable) this.instance).getDescription();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public I18NString getDescriptionLegal() {
                    return ((Consentable) this.instance).getDescriptionLegal();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public String getExtraId() {
                    return ((Consentable) this.instance).getExtraId();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public ByteString getExtraIdBytes() {
                    return ((Consentable) this.instance).getExtraIdBytes();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public int getIabId() {
                    return ((Consentable) this.instance).getIabId();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public int getId() {
                    return ((Consentable) this.instance).getId();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public I18NString getIllustrations() {
                    return ((Consentable) this.instance).getIllustrations();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public I18NString getName() {
                    return ((Consentable) this.instance).getName();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public EnumConsentableType getType() {
                    return ((Consentable) this.instance).getType();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public int getTypeValue() {
                    return ((Consentable) this.instance).getTypeValue();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public int getVendorsNumber() {
                    return ((Consentable) this.instance).getVendorsNumber();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public boolean hasDescription() {
                    return ((Consentable) this.instance).hasDescription();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public boolean hasDescriptionLegal() {
                    return ((Consentable) this.instance).hasDescriptionLegal();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public boolean hasIllustrations() {
                    return ((Consentable) this.instance).hasIllustrations();
                }

                @Override // ac.Models.Vendorlist.ConsentableOrBuilder
                public boolean hasName() {
                    return ((Consentable) this.instance).hasName();
                }

                public Builder mergeDescription(I18NString i18NString) {
                    copyOnWrite();
                    ((Consentable) this.instance).mergeDescription(i18NString);
                    return this;
                }

                public Builder mergeDescriptionLegal(I18NString i18NString) {
                    copyOnWrite();
                    ((Consentable) this.instance).mergeDescriptionLegal(i18NString);
                    return this;
                }

                public Builder mergeIllustrations(I18NString i18NString) {
                    copyOnWrite();
                    ((Consentable) this.instance).mergeIllustrations(i18NString);
                    return this;
                }

                public Builder mergeName(I18NString i18NString) {
                    copyOnWrite();
                    ((Consentable) this.instance).mergeName(i18NString);
                    return this;
                }

                public Builder setDescription(I18NString i18NString) {
                    copyOnWrite();
                    ((Consentable) this.instance).setDescription(i18NString);
                    return this;
                }

                public Builder setDescriptionLegal(I18NString i18NString) {
                    copyOnWrite();
                    ((Consentable) this.instance).setDescriptionLegal(i18NString);
                    return this;
                }

                public Builder setExtraId(String str) {
                    copyOnWrite();
                    ((Consentable) this.instance).setExtraId(str);
                    return this;
                }

                public Builder setExtraIdBytes(ByteString byteString) throws IllegalArgumentException {
                    copyOnWrite();
                    ((Consentable) this.instance).setExtraIdBytes(byteString);
                    return this;
                }

                public Builder setIabId(int i10) {
                    copyOnWrite();
                    ((Consentable) this.instance).setIabId(i10);
                    return this;
                }

                public Builder setId(int i10) {
                    copyOnWrite();
                    ((Consentable) this.instance).setId(i10);
                    return this;
                }

                public Builder setIllustrations(I18NString i18NString) {
                    copyOnWrite();
                    ((Consentable) this.instance).setIllustrations(i18NString);
                    return this;
                }

                public Builder setName(I18NString i18NString) {
                    copyOnWrite();
                    ((Consentable) this.instance).setName(i18NString);
                    return this;
                }

                public Builder setType(EnumConsentableType enumConsentableType) {
                    copyOnWrite();
                    ((Consentable) this.instance).setType(enumConsentableType);
                    return this;
                }

                public Builder setTypeValue(int i10) {
                    copyOnWrite();
                    ((Consentable) this.instance).setTypeValue(i10);
                    return this;
                }

                public Builder setVendorsNumber(int i10) {
                    copyOnWrite();
                    ((Consentable) this.instance).setVendorsNumber(i10);
                    return this;
                }

                private Builder() {
                    super(Consentable.DEFAULT_INSTANCE);
                }

                public Builder setDescription(I18NString.Builder builder) {
                    copyOnWrite();
                    ((Consentable) this.instance).setDescription(builder.build());
                    return this;
                }

                public Builder setDescriptionLegal(I18NString.Builder builder) {
                    copyOnWrite();
                    ((Consentable) this.instance).setDescriptionLegal(builder.build());
                    return this;
                }

                public Builder setIllustrations(I18NString.Builder builder) {
                    copyOnWrite();
                    ((Consentable) this.instance).setIllustrations(builder.build());
                    return this;
                }

                public Builder setName(I18NString.Builder builder) {
                    copyOnWrite();
                    ((Consentable) this.instance).setName(builder.build());
                    return this;
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public enum EnumConsentableType implements Internal.EnumLite {
                PURPOSE(0),
                FEATURE(1),
                SPECIAL_FEATURE(2),
                SPECIAL_PURPOSE(3),
                UNRECOGNIZED(-1);

                public static final int FEATURE_VALUE = 1;
                public static final int PURPOSE_VALUE = 0;
                public static final int SPECIAL_FEATURE_VALUE = 2;
                public static final int SPECIAL_PURPOSE_VALUE = 3;
                private static final Internal.EnumLiteMap<EnumConsentableType> internalValueMap = new Internal.EnumLiteMap<EnumConsentableType>() { // from class: ac.Models.Vendorlist.Consentable.EnumConsentableType.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public EnumConsentableType findValueByNumber(int i10) {
                        return EnumConsentableType.forNumber(i10);
                    }
                };
                private final int value;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class EnumConsentableTypeVerifier implements Internal.EnumVerifier {
                    static final Internal.EnumVerifier INSTANCE = new EnumConsentableTypeVerifier();

                    private EnumConsentableTypeVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i10) {
                        return EnumConsentableType.forNumber(i10) != null;
                    }
                }

                EnumConsentableType(int i10) {
                    this.value = i10;
                }

                public static EnumConsentableType forNumber(int i10) {
                    if (i10 == 0) {
                        return PURPOSE;
                    }
                    if (i10 == 1) {
                        return FEATURE;
                    }
                    if (i10 == 2) {
                        return SPECIAL_FEATURE;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return SPECIAL_PURPOSE;
                }

                public static Internal.EnumLiteMap<EnumConsentableType> internalGetValueMap() {
                    return internalValueMap;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return EnumConsentableTypeVerifier.INSTANCE;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    if (this != UNRECOGNIZED) {
                        return this.value;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }

                @Deprecated
                public static EnumConsentableType valueOf(int i10) {
                    return forNumber(i10);
                }
            }

            static {
                Consentable consentable = new Consentable();
                DEFAULT_INSTANCE = consentable;
                GeneratedMessageLite.registerDefaultInstance(Consentable.class, consentable);
            }

            private Consentable() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDescription() {
                this.description_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDescriptionLegal() {
                this.descriptionLegal_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearExtraId() {
                this.extraId_ = getDefaultInstance().getExtraId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIabId() {
                this.iabId_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIllustrations() {
                this.illustrations_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.type_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVendorsNumber() {
                this.vendorsNumber_ = 0;
            }

            public static Consentable getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeDescription(I18NString i18NString) {
                i18NString.getClass();
                I18NString i18NString2 = this.description_;
                if (i18NString2 == null || i18NString2 == I18NString.getDefaultInstance()) {
                    this.description_ = i18NString;
                } else {
                    this.description_ = I18NString.newBuilder(this.description_).mergeFrom((I18NString.Builder) i18NString).buildPartial();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeDescriptionLegal(I18NString i18NString) {
                i18NString.getClass();
                I18NString i18NString2 = this.descriptionLegal_;
                if (i18NString2 == null || i18NString2 == I18NString.getDefaultInstance()) {
                    this.descriptionLegal_ = i18NString;
                } else {
                    this.descriptionLegal_ = I18NString.newBuilder(this.descriptionLegal_).mergeFrom((I18NString.Builder) i18NString).buildPartial();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeIllustrations(I18NString i18NString) {
                i18NString.getClass();
                I18NString i18NString2 = this.illustrations_;
                if (i18NString2 == null || i18NString2 == I18NString.getDefaultInstance()) {
                    this.illustrations_ = i18NString;
                } else {
                    this.illustrations_ = I18NString.newBuilder(this.illustrations_).mergeFrom((I18NString.Builder) i18NString).buildPartial();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeName(I18NString i18NString) {
                i18NString.getClass();
                I18NString i18NString2 = this.name_;
                if (i18NString2 == null || i18NString2 == I18NString.getDefaultInstance()) {
                    this.name_ = i18NString;
                } else {
                    this.name_ = I18NString.newBuilder(this.name_).mergeFrom((I18NString.Builder) i18NString).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Consentable parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Consentable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Consentable parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Consentable> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDescription(I18NString i18NString) {
                i18NString.getClass();
                this.description_ = i18NString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDescriptionLegal(I18NString i18NString) {
                i18NString.getClass();
                this.descriptionLegal_ = i18NString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setExtraId(String str) {
                str.getClass();
                this.extraId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setExtraIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.extraId_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIabId(int i10) {
                this.iabId_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(int i10) {
                this.id_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIllustrations(I18NString i18NString) {
                i18NString.getClass();
                this.illustrations_ = i18NString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(I18NString i18NString) {
                i18NString.getClass();
                this.name_ = i18NString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(EnumConsentableType enumConsentableType) {
                this.type_ = enumConsentableType.getNumber();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTypeValue(int i10) {
                this.type_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVendorsNumber(int i10) {
                this.vendorsNumber_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Consentable();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\t\u0004\t\u0005\t\u0006\f\u0007Ȉ\b\t\t\u000b", new Object[]{"id_", "iabId_", "name_", "description_", "descriptionLegal_", "type_", "extraId_", "illustrations_", "vendorsNumber_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Consentable> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Consentable.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public I18NString getDescription() {
                I18NString i18NString = this.description_;
                return i18NString == null ? I18NString.getDefaultInstance() : i18NString;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public I18NString getDescriptionLegal() {
                I18NString i18NString = this.descriptionLegal_;
                return i18NString == null ? I18NString.getDefaultInstance() : i18NString;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public String getExtraId() {
                return this.extraId_;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public ByteString getExtraIdBytes() {
                return ByteString.copyFromUtf8(this.extraId_);
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public int getIabId() {
                return this.iabId_;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public I18NString getIllustrations() {
                I18NString i18NString = this.illustrations_;
                return i18NString == null ? I18NString.getDefaultInstance() : i18NString;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public I18NString getName() {
                I18NString i18NString = this.name_;
                return i18NString == null ? I18NString.getDefaultInstance() : i18NString;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public EnumConsentableType getType() {
                EnumConsentableType enumConsentableTypeForNumber = EnumConsentableType.forNumber(this.type_);
                return enumConsentableTypeForNumber == null ? EnumConsentableType.UNRECOGNIZED : enumConsentableTypeForNumber;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public int getVendorsNumber() {
                return this.vendorsNumber_;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public boolean hasDescription() {
                return this.description_ != null;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public boolean hasDescriptionLegal() {
                return this.descriptionLegal_ != null;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public boolean hasIllustrations() {
                return this.illustrations_ != null;
            }

            @Override // ac.Models.Vendorlist.ConsentableOrBuilder
            public boolean hasName() {
                return this.name_ != null;
            }

            public static Builder newBuilder(Consentable consentable) {
                return DEFAULT_INSTANCE.createBuilder(consentable);
            }

            public static Consentable parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Consentable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Consentable parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Consentable parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Consentable parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Consentable parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Consentable parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Consentable parseFrom(InputStream inputStream) throws IOException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Consentable parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Consentable parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Consentable parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Consentable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface ConsentableOrBuilder extends MessageLiteOrBuilder {
            I18NString getDescription();

            I18NString getDescriptionLegal();

            String getExtraId();

            ByteString getExtraIdBytes();

            int getIabId();

            int getId();

            I18NString getIllustrations();

            I18NString getName();

            Consentable.EnumConsentableType getType();

            int getTypeValue();

            int getVendorsNumber();

            boolean hasDescription();

            boolean hasDescriptionLegal();

            boolean hasIllustrations();

            boolean hasName();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DataCategoriesDefaultEntryHolder {
            static final MapEntryLite<Integer, DataCategory> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, DataCategory.getDefaultInstance());

            private DataCategoriesDefaultEntryHolder() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class DataCategory extends GeneratedMessageLite<DataCategory, Builder> implements DataCategoryOrBuilder {
            private static final DataCategory DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 2;
            private static volatile Parser<DataCategory> PARSER;
            private int id_;
            private I18NString name_;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<DataCategory, Builder> implements DataCategoryOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder clearId() {
                    copyOnWrite();
                    ((DataCategory) this.instance).clearId();
                    return this;
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((DataCategory) this.instance).clearName();
                    return this;
                }

                @Override // ac.Models.Vendorlist.DataCategoryOrBuilder
                public int getId() {
                    return ((DataCategory) this.instance).getId();
                }

                @Override // ac.Models.Vendorlist.DataCategoryOrBuilder
                public I18NString getName() {
                    return ((DataCategory) this.instance).getName();
                }

                @Override // ac.Models.Vendorlist.DataCategoryOrBuilder
                public boolean hasName() {
                    return ((DataCategory) this.instance).hasName();
                }

                public Builder mergeName(I18NString i18NString) {
                    copyOnWrite();
                    ((DataCategory) this.instance).mergeName(i18NString);
                    return this;
                }

                public Builder setId(int i10) {
                    copyOnWrite();
                    ((DataCategory) this.instance).setId(i10);
                    return this;
                }

                public Builder setName(I18NString i18NString) {
                    copyOnWrite();
                    ((DataCategory) this.instance).setName(i18NString);
                    return this;
                }

                private Builder() {
                    super(DataCategory.DEFAULT_INSTANCE);
                }

                public Builder setName(I18NString.Builder builder) {
                    copyOnWrite();
                    ((DataCategory) this.instance).setName(builder.build());
                    return this;
                }
            }

            static {
                DataCategory dataCategory = new DataCategory();
                DEFAULT_INSTANCE = dataCategory;
                GeneratedMessageLite.registerDefaultInstance(DataCategory.class, dataCategory);
            }

            private DataCategory() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = null;
            }

            public static DataCategory getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeName(I18NString i18NString) {
                i18NString.getClass();
                I18NString i18NString2 = this.name_;
                if (i18NString2 == null || i18NString2 == I18NString.getDefaultInstance()) {
                    this.name_ = i18NString;
                } else {
                    this.name_ = I18NString.newBuilder(this.name_).mergeFrom((I18NString.Builder) i18NString).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static DataCategory parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DataCategory) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DataCategory parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<DataCategory> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(int i10) {
                this.id_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(I18NString i18NString) {
                i18NString.getClass();
                this.name_ = i18NString;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new DataCategory();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"id_", "name_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<DataCategory> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (DataCategory.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // ac.Models.Vendorlist.DataCategoryOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // ac.Models.Vendorlist.DataCategoryOrBuilder
            public I18NString getName() {
                I18NString i18NString = this.name_;
                return i18NString == null ? I18NString.getDefaultInstance() : i18NString;
            }

            @Override // ac.Models.Vendorlist.DataCategoryOrBuilder
            public boolean hasName() {
                return this.name_ != null;
            }

            public static Builder newBuilder(DataCategory dataCategory) {
                return DEFAULT_INSTANCE.createBuilder(dataCategory);
            }

            public static DataCategory parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DataCategory) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DataCategory parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static DataCategory parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static DataCategory parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static DataCategory parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DataCategory parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static DataCategory parseFrom(InputStream inputStream) throws IOException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DataCategory parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static DataCategory parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static DataCategory parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DataCategory) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface DataCategoryOrBuilder extends MessageLiteOrBuilder {
            int getId();

            I18NString getName();

            boolean hasName();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Stack extends GeneratedMessageLite<Stack, Builder> implements StackOrBuilder {
            public static final int CONSENTABLES_FIELD_NUMBER = 5;
            private static final Stack DEFAULT_INSTANCE;
            public static final int DESCRIPTION_FIELD_NUMBER = 4;
            public static final int IAB_ID_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int NAME_FIELD_NUMBER = 3;
            private static volatile Parser<Stack> PARSER = null;
            public static final int VENDORS_NUMBER_FIELD_NUMBER = 6;
            private Internal.IntList consentables_ = GeneratedMessageLite.emptyIntList();
            private I18NString description_;
            private int iabId_;
            private int id_;
            private I18NString name_;
            private int vendorsNumber_;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class Builder extends GeneratedMessageLite.Builder<Stack, Builder> implements StackOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder addAllConsentables(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Stack) this.instance).addAllConsentables(iterable);
                    return this;
                }

                public Builder addConsentables(int i10) {
                    copyOnWrite();
                    ((Stack) this.instance).addConsentables(i10);
                    return this;
                }

                public Builder clearConsentables() {
                    copyOnWrite();
                    ((Stack) this.instance).clearConsentables();
                    return this;
                }

                public Builder clearDescription() {
                    copyOnWrite();
                    ((Stack) this.instance).clearDescription();
                    return this;
                }

                public Builder clearIabId() {
                    copyOnWrite();
                    ((Stack) this.instance).clearIabId();
                    return this;
                }

                public Builder clearId() {
                    copyOnWrite();
                    ((Stack) this.instance).clearId();
                    return this;
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((Stack) this.instance).clearName();
                    return this;
                }

                public Builder clearVendorsNumber() {
                    copyOnWrite();
                    ((Stack) this.instance).clearVendorsNumber();
                    return this;
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public int getConsentables(int i10) {
                    return ((Stack) this.instance).getConsentables(i10);
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public int getConsentablesCount() {
                    return ((Stack) this.instance).getConsentablesCount();
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public List<Integer> getConsentablesList() {
                    return Collections.unmodifiableList(((Stack) this.instance).getConsentablesList());
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public I18NString getDescription() {
                    return ((Stack) this.instance).getDescription();
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public int getIabId() {
                    return ((Stack) this.instance).getIabId();
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public int getId() {
                    return ((Stack) this.instance).getId();
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public I18NString getName() {
                    return ((Stack) this.instance).getName();
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public int getVendorsNumber() {
                    return ((Stack) this.instance).getVendorsNumber();
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public boolean hasDescription() {
                    return ((Stack) this.instance).hasDescription();
                }

                @Override // ac.Models.Vendorlist.StackOrBuilder
                public boolean hasName() {
                    return ((Stack) this.instance).hasName();
                }

                public Builder mergeDescription(I18NString i18NString) {
                    copyOnWrite();
                    ((Stack) this.instance).mergeDescription(i18NString);
                    return this;
                }

                public Builder mergeName(I18NString i18NString) {
                    copyOnWrite();
                    ((Stack) this.instance).mergeName(i18NString);
                    return this;
                }

                public Builder setConsentables(int i10, int i11) {
                    copyOnWrite();
                    ((Stack) this.instance).setConsentables(i10, i11);
                    return this;
                }

                public Builder setDescription(I18NString i18NString) {
                    copyOnWrite();
                    ((Stack) this.instance).setDescription(i18NString);
                    return this;
                }

                public Builder setIabId(int i10) {
                    copyOnWrite();
                    ((Stack) this.instance).setIabId(i10);
                    return this;
                }

                public Builder setId(int i10) {
                    copyOnWrite();
                    ((Stack) this.instance).setId(i10);
                    return this;
                }

                public Builder setName(I18NString i18NString) {
                    copyOnWrite();
                    ((Stack) this.instance).setName(i18NString);
                    return this;
                }

                public Builder setVendorsNumber(int i10) {
                    copyOnWrite();
                    ((Stack) this.instance).setVendorsNumber(i10);
                    return this;
                }

                private Builder() {
                    super(Stack.DEFAULT_INSTANCE);
                }

                public Builder setDescription(I18NString.Builder builder) {
                    copyOnWrite();
                    ((Stack) this.instance).setDescription(builder.build());
                    return this;
                }

                public Builder setName(I18NString.Builder builder) {
                    copyOnWrite();
                    ((Stack) this.instance).setName(builder.build());
                    return this;
                }
            }

            static {
                Stack stack = new Stack();
                DEFAULT_INSTANCE = stack;
                GeneratedMessageLite.registerDefaultInstance(Stack.class, stack);
            }

            private Stack() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllConsentables(Iterable<? extends Integer> iterable) {
                ensureConsentablesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.consentables_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addConsentables(int i10) {
                ensureConsentablesIsMutable();
                this.consentables_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearConsentables() {
                this.consentables_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDescription() {
                this.description_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIabId() {
                this.iabId_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVendorsNumber() {
                this.vendorsNumber_ = 0;
            }

            private void ensureConsentablesIsMutable() {
                Internal.IntList intList = this.consentables_;
                if (intList.isModifiable()) {
                    return;
                }
                this.consentables_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Stack getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeDescription(I18NString i18NString) {
                i18NString.getClass();
                I18NString i18NString2 = this.description_;
                if (i18NString2 == null || i18NString2 == I18NString.getDefaultInstance()) {
                    this.description_ = i18NString;
                } else {
                    this.description_ = I18NString.newBuilder(this.description_).mergeFrom((I18NString.Builder) i18NString).buildPartial();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeName(I18NString i18NString) {
                i18NString.getClass();
                I18NString i18NString2 = this.name_;
                if (i18NString2 == null || i18NString2 == I18NString.getDefaultInstance()) {
                    this.name_ = i18NString;
                } else {
                    this.name_ = I18NString.newBuilder(this.name_).mergeFrom((I18NString.Builder) i18NString).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Stack parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Stack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Stack parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Stack> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setConsentables(int i10, int i11) {
                ensureConsentablesIsMutable();
                this.consentables_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDescription(I18NString i18NString) {
                i18NString.getClass();
                this.description_ = i18NString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIabId(int i10) {
                this.iabId_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(int i10) {
                this.id_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(I18NString i18NString) {
                i18NString.getClass();
                this.name_ = i18NString;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVendorsNumber(int i10) {
                this.vendorsNumber_ = i10;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Stack();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\t\u0004\t\u0005\u001d\u0006\u000b", new Object[]{"id_", "iabId_", "name_", "description_", "consentables_", "vendorsNumber_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Stack> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Stack.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public int getConsentables(int i10) {
                return this.consentables_.getInt(i10);
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public int getConsentablesCount() {
                return this.consentables_.size();
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public List<Integer> getConsentablesList() {
                return this.consentables_;
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public I18NString getDescription() {
                I18NString i18NString = this.description_;
                return i18NString == null ? I18NString.getDefaultInstance() : i18NString;
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public int getIabId() {
                return this.iabId_;
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public I18NString getName() {
                I18NString i18NString = this.name_;
                return i18NString == null ? I18NString.getDefaultInstance() : i18NString;
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public int getVendorsNumber() {
                return this.vendorsNumber_;
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public boolean hasDescription() {
                return this.description_ != null;
            }

            @Override // ac.Models.Vendorlist.StackOrBuilder
            public boolean hasName() {
                return this.name_ != null;
            }

            public static Builder newBuilder(Stack stack) {
                return DEFAULT_INSTANCE.createBuilder(stack);
            }

            public static Stack parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Stack) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Stack parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Stack parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Stack parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Stack parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Stack parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Stack parseFrom(InputStream inputStream) throws IOException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Stack parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Stack parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Stack parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Stack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface StackOrBuilder extends MessageLiteOrBuilder {
            int getConsentables(int i10);

            int getConsentablesCount();

            List<Integer> getConsentablesList();

            I18NString getDescription();

            int getIabId();

            int getId();

            I18NString getName();

            int getVendorsNumber();

            boolean hasDescription();

            boolean hasName();
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* loaded from: classes2.dex */
        public static final class Vendor extends GeneratedMessageLite<Vendor, Builder> implements VendorOrBuilder {
            public static final int CONSENTABLES_FIELD_NUMBER = 5;
            public static final int COOKIE_MAX_AGE_SECONDS_FIELD_NUMBER = 10;
            public static final int COOKIE_REFRESH_FIELD_NUMBER = 17;
            public static final int DATA_CATEGORIES_FIELD_NUMBER = 15;
            public static final int DATA_DECLARATION_FIELD_NUMBER = 16;
            public static final int DATA_RETENTION_FIELD_NUMBER = 14;
            private static final Vendor DEFAULT_INSTANCE;
            public static final int EXTRA_ID_FIELD_NUMBER = 7;
            public static final int FLEXIBLES_FIELD_NUMBER = 11;
            public static final int GOOGLE_ATP_ID_FIELD_NUMBER = 12;
            public static final int IAB_ID_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int LEGINTABLES_FIELD_NUMBER = 6;
            public static final int NAME_FIELD_NUMBER = 3;
            private static volatile Parser<Vendor> PARSER = null;
            public static final int POLICY_URL_FIELD_NUMBER = 4;
            public static final int URLS_FIELD_NUMBER = 13;
            public static final int USES_NON_COOKIE_ACCESS_FIELD_NUMBER = 9;
            private long cookieMaxAgeSeconds_;
            private boolean cookieRefresh_;
            private DataRetention dataRetention_;
            private int googleAtpId_;
            private int iabId_;
            private int id_;
            private boolean usesNonCookieAccess_;
            private MapFieldLite<String, VendorUrl> urls_ = MapFieldLite.emptyMapField();
            private int dataDeclarationMemoizedSerializedSize = -1;
            private String name_ = "";
            private String policyUrl_ = "";
            private String extraId_ = "";
            private Internal.IntList consentables_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList legintables_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList flexibles_ = GeneratedMessageLite.emptyIntList();
            private Internal.ProtobufList<DataCategory> dataCategories_ = GeneratedMessageLite.emptyProtobufList();
            private Internal.IntList dataDeclaration_ = GeneratedMessageLite.emptyIntList();

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Vendor, Builder> implements VendorOrBuilder {
                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder addAllConsentables(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Vendor) this.instance).addAllConsentables(iterable);
                    return this;
                }

                public Builder addAllDataCategories(Iterable<? extends DataCategory> iterable) {
                    copyOnWrite();
                    ((Vendor) this.instance).addAllDataCategories(iterable);
                    return this;
                }

                public Builder addAllDataDeclaration(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Vendor) this.instance).addAllDataDeclaration(iterable);
                    return this;
                }

                public Builder addAllFlexibles(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Vendor) this.instance).addAllFlexibles(iterable);
                    return this;
                }

                public Builder addAllLegintables(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Vendor) this.instance).addAllLegintables(iterable);
                    return this;
                }

                public Builder addConsentables(int i10) {
                    copyOnWrite();
                    ((Vendor) this.instance).addConsentables(i10);
                    return this;
                }

                public Builder addDataCategories(DataCategory dataCategory) {
                    copyOnWrite();
                    ((Vendor) this.instance).addDataCategories(dataCategory);
                    return this;
                }

                public Builder addDataDeclaration(int i10) {
                    copyOnWrite();
                    ((Vendor) this.instance).addDataDeclaration(i10);
                    return this;
                }

                public Builder addFlexibles(int i10) {
                    copyOnWrite();
                    ((Vendor) this.instance).addFlexibles(i10);
                    return this;
                }

                public Builder addLegintables(int i10) {
                    copyOnWrite();
                    ((Vendor) this.instance).addLegintables(i10);
                    return this;
                }

                public Builder clearConsentables() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearConsentables();
                    return this;
                }

                public Builder clearCookieMaxAgeSeconds() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearCookieMaxAgeSeconds();
                    return this;
                }

                public Builder clearCookieRefresh() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearCookieRefresh();
                    return this;
                }

                public Builder clearDataCategories() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearDataCategories();
                    return this;
                }

                public Builder clearDataDeclaration() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearDataDeclaration();
                    return this;
                }

                public Builder clearDataRetention() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearDataRetention();
                    return this;
                }

                public Builder clearExtraId() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearExtraId();
                    return this;
                }

                public Builder clearFlexibles() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearFlexibles();
                    return this;
                }

                public Builder clearGoogleAtpId() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearGoogleAtpId();
                    return this;
                }

                public Builder clearIabId() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearIabId();
                    return this;
                }

                public Builder clearId() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearId();
                    return this;
                }

                public Builder clearLegintables() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearLegintables();
                    return this;
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearName();
                    return this;
                }

                public Builder clearPolicyUrl() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearPolicyUrl();
                    return this;
                }

                public Builder clearUrls() {
                    copyOnWrite();
                    ((Vendor) this.instance).getMutableUrlsMap().clear();
                    return this;
                }

                public Builder clearUsesNonCookieAccess() {
                    copyOnWrite();
                    ((Vendor) this.instance).clearUsesNonCookieAccess();
                    return this;
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public boolean containsUrls(String str) {
                    str.getClass();
                    return ((Vendor) this.instance).getUrlsMap().containsKey(str);
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getConsentables(int i10) {
                    return ((Vendor) this.instance).getConsentables(i10);
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getConsentablesCount() {
                    return ((Vendor) this.instance).getConsentablesCount();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public List<Integer> getConsentablesList() {
                    return Collections.unmodifiableList(((Vendor) this.instance).getConsentablesList());
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public long getCookieMaxAgeSeconds() {
                    return ((Vendor) this.instance).getCookieMaxAgeSeconds();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public boolean getCookieRefresh() {
                    return ((Vendor) this.instance).getCookieRefresh();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public DataCategory getDataCategories(int i10) {
                    return ((Vendor) this.instance).getDataCategories(i10);
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getDataCategoriesCount() {
                    return ((Vendor) this.instance).getDataCategoriesCount();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public List<DataCategory> getDataCategoriesList() {
                    return Collections.unmodifiableList(((Vendor) this.instance).getDataCategoriesList());
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getDataDeclaration(int i10) {
                    return ((Vendor) this.instance).getDataDeclaration(i10);
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getDataDeclarationCount() {
                    return ((Vendor) this.instance).getDataDeclarationCount();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public List<Integer> getDataDeclarationList() {
                    return Collections.unmodifiableList(((Vendor) this.instance).getDataDeclarationList());
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public DataRetention getDataRetention() {
                    return ((Vendor) this.instance).getDataRetention();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public String getExtraId() {
                    return ((Vendor) this.instance).getExtraId();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public ByteString getExtraIdBytes() {
                    return ((Vendor) this.instance).getExtraIdBytes();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getFlexibles(int i10) {
                    return ((Vendor) this.instance).getFlexibles(i10);
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getFlexiblesCount() {
                    return ((Vendor) this.instance).getFlexiblesCount();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public List<Integer> getFlexiblesList() {
                    return Collections.unmodifiableList(((Vendor) this.instance).getFlexiblesList());
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getGoogleAtpId() {
                    return ((Vendor) this.instance).getGoogleAtpId();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getIabId() {
                    return ((Vendor) this.instance).getIabId();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getId() {
                    return ((Vendor) this.instance).getId();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getLegintables(int i10) {
                    return ((Vendor) this.instance).getLegintables(i10);
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getLegintablesCount() {
                    return ((Vendor) this.instance).getLegintablesCount();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public List<Integer> getLegintablesList() {
                    return Collections.unmodifiableList(((Vendor) this.instance).getLegintablesList());
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public String getName() {
                    return ((Vendor) this.instance).getName();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public ByteString getNameBytes() {
                    return ((Vendor) this.instance).getNameBytes();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public String getPolicyUrl() {
                    return ((Vendor) this.instance).getPolicyUrl();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public ByteString getPolicyUrlBytes() {
                    return ((Vendor) this.instance).getPolicyUrlBytes();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                @Deprecated
                public Map<String, VendorUrl> getUrls() {
                    return getUrlsMap();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public int getUrlsCount() {
                    return ((Vendor) this.instance).getUrlsMap().size();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public Map<String, VendorUrl> getUrlsMap() {
                    return Collections.unmodifiableMap(((Vendor) this.instance).getUrlsMap());
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public VendorUrl getUrlsOrDefault(String str, VendorUrl vendorUrl) {
                    str.getClass();
                    Map<String, VendorUrl> urlsMap = ((Vendor) this.instance).getUrlsMap();
                    return urlsMap.containsKey(str) ? urlsMap.get(str) : vendorUrl;
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public VendorUrl getUrlsOrThrow(String str) {
                    str.getClass();
                    Map<String, VendorUrl> urlsMap = ((Vendor) this.instance).getUrlsMap();
                    if (urlsMap.containsKey(str)) {
                        return urlsMap.get(str);
                    }
                    throw new IllegalArgumentException();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public boolean getUsesNonCookieAccess() {
                    return ((Vendor) this.instance).getUsesNonCookieAccess();
                }

                @Override // ac.Models.Vendorlist.VendorOrBuilder
                public boolean hasDataRetention() {
                    return ((Vendor) this.instance).hasDataRetention();
                }

                public Builder mergeDataRetention(DataRetention dataRetention) {
                    copyOnWrite();
                    ((Vendor) this.instance).mergeDataRetention(dataRetention);
                    return this;
                }

                public Builder putAllUrls(Map<String, VendorUrl> map) {
                    copyOnWrite();
                    ((Vendor) this.instance).getMutableUrlsMap().putAll(map);
                    return this;
                }

                public Builder putUrls(String str, VendorUrl vendorUrl) {
                    str.getClass();
                    vendorUrl.getClass();
                    copyOnWrite();
                    ((Vendor) this.instance).getMutableUrlsMap().put(str, vendorUrl);
                    return this;
                }

                public Builder removeDataCategories(int i10) {
                    copyOnWrite();
                    ((Vendor) this.instance).removeDataCategories(i10);
                    return this;
                }

                public Builder removeUrls(String str) {
                    str.getClass();
                    copyOnWrite();
                    ((Vendor) this.instance).getMutableUrlsMap().remove(str);
                    return this;
                }

                public Builder setConsentables(int i10, int i11) {
                    copyOnWrite();
                    ((Vendor) this.instance).setConsentables(i10, i11);
                    return this;
                }

                public Builder setCookieMaxAgeSeconds(long j10) {
                    copyOnWrite();
                    ((Vendor) this.instance).setCookieMaxAgeSeconds(j10);
                    return this;
                }

                public Builder setCookieRefresh(boolean z10) {
                    copyOnWrite();
                    ((Vendor) this.instance).setCookieRefresh(z10);
                    return this;
                }

                public Builder setDataCategories(int i10, DataCategory dataCategory) {
                    copyOnWrite();
                    ((Vendor) this.instance).setDataCategories(i10, dataCategory);
                    return this;
                }

                public Builder setDataDeclaration(int i10, int i11) {
                    copyOnWrite();
                    ((Vendor) this.instance).setDataDeclaration(i10, i11);
                    return this;
                }

                public Builder setDataRetention(DataRetention dataRetention) {
                    copyOnWrite();
                    ((Vendor) this.instance).setDataRetention(dataRetention);
                    return this;
                }

                public Builder setExtraId(String str) {
                    copyOnWrite();
                    ((Vendor) this.instance).setExtraId(str);
                    return this;
                }

                public Builder setExtraIdBytes(ByteString byteString) throws IllegalArgumentException {
                    copyOnWrite();
                    ((Vendor) this.instance).setExtraIdBytes(byteString);
                    return this;
                }

                public Builder setFlexibles(int i10, int i11) {
                    copyOnWrite();
                    ((Vendor) this.instance).setFlexibles(i10, i11);
                    return this;
                }

                public Builder setGoogleAtpId(int i10) {
                    copyOnWrite();
                    ((Vendor) this.instance).setGoogleAtpId(i10);
                    return this;
                }

                public Builder setIabId(int i10) {
                    copyOnWrite();
                    ((Vendor) this.instance).setIabId(i10);
                    return this;
                }

                public Builder setId(int i10) {
                    copyOnWrite();
                    ((Vendor) this.instance).setId(i10);
                    return this;
                }

                public Builder setLegintables(int i10, int i11) {
                    copyOnWrite();
                    ((Vendor) this.instance).setLegintables(i10, i11);
                    return this;
                }

                public Builder setName(String str) {
                    copyOnWrite();
                    ((Vendor) this.instance).setName(str);
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) throws IllegalArgumentException {
                    copyOnWrite();
                    ((Vendor) this.instance).setNameBytes(byteString);
                    return this;
                }

                public Builder setPolicyUrl(String str) {
                    copyOnWrite();
                    ((Vendor) this.instance).setPolicyUrl(str);
                    return this;
                }

                public Builder setPolicyUrlBytes(ByteString byteString) throws IllegalArgumentException {
                    copyOnWrite();
                    ((Vendor) this.instance).setPolicyUrlBytes(byteString);
                    return this;
                }

                public Builder setUsesNonCookieAccess(boolean z10) {
                    copyOnWrite();
                    ((Vendor) this.instance).setUsesNonCookieAccess(z10);
                    return this;
                }

                private Builder() {
                    super(Vendor.DEFAULT_INSTANCE);
                }

                public Builder addDataCategories(int i10, DataCategory dataCategory) {
                    copyOnWrite();
                    ((Vendor) this.instance).addDataCategories(i10, dataCategory);
                    return this;
                }

                public Builder setDataCategories(int i10, DataCategory.Builder builder) {
                    copyOnWrite();
                    ((Vendor) this.instance).setDataCategories(i10, builder.build());
                    return this;
                }

                public Builder setDataRetention(DataRetention.Builder builder) {
                    copyOnWrite();
                    ((Vendor) this.instance).setDataRetention(builder.build());
                    return this;
                }

                public Builder addDataCategories(DataCategory.Builder builder) {
                    copyOnWrite();
                    ((Vendor) this.instance).addDataCategories(builder.build());
                    return this;
                }

                public Builder addDataCategories(int i10, DataCategory.Builder builder) {
                    copyOnWrite();
                    ((Vendor) this.instance).addDataCategories(i10, builder.build());
                    return this;
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* loaded from: classes.dex */
            public static final class DataRetention extends GeneratedMessageLite<DataRetention, Builder> implements DataRetentionOrBuilder {
                private static final DataRetention DEFAULT_INSTANCE;
                private static volatile Parser<DataRetention> PARSER = null;
                public static final int PURPOSES_FIELD_NUMBER = 2;
                public static final int SPECIAL_PURPOSES_FIELD_NUMBER = 3;
                public static final int STD_RETENTION_FIELD_NUMBER = 1;
                private MapFieldLite<String, Integer> purposes_ = MapFieldLite.emptyMapField();
                private MapFieldLite<String, Integer> specialPurposes_ = MapFieldLite.emptyMapField();
                private int stdRetention_;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends GeneratedMessageLite.Builder<DataRetention, Builder> implements DataRetentionOrBuilder {
                    public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                        this();
                    }

                    public Builder clearPurposes() {
                        copyOnWrite();
                        ((DataRetention) this.instance).getMutablePurposesMap().clear();
                        return this;
                    }

                    public Builder clearSpecialPurposes() {
                        copyOnWrite();
                        ((DataRetention) this.instance).getMutableSpecialPurposesMap().clear();
                        return this;
                    }

                    public Builder clearStdRetention() {
                        copyOnWrite();
                        ((DataRetention) this.instance).clearStdRetention();
                        return this;
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public boolean containsPurposes(String str) {
                        str.getClass();
                        return ((DataRetention) this.instance).getPurposesMap().containsKey(str);
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public boolean containsSpecialPurposes(String str) {
                        str.getClass();
                        return ((DataRetention) this.instance).getSpecialPurposesMap().containsKey(str);
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    @Deprecated
                    public Map<String, Integer> getPurposes() {
                        return getPurposesMap();
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public int getPurposesCount() {
                        return ((DataRetention) this.instance).getPurposesMap().size();
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public Map<String, Integer> getPurposesMap() {
                        return Collections.unmodifiableMap(((DataRetention) this.instance).getPurposesMap());
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public int getPurposesOrDefault(String str, int i10) {
                        str.getClass();
                        Map<String, Integer> purposesMap = ((DataRetention) this.instance).getPurposesMap();
                        return purposesMap.containsKey(str) ? purposesMap.get(str).intValue() : i10;
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public int getPurposesOrThrow(String str) {
                        str.getClass();
                        Map<String, Integer> purposesMap = ((DataRetention) this.instance).getPurposesMap();
                        if (purposesMap.containsKey(str)) {
                            return purposesMap.get(str).intValue();
                        }
                        throw new IllegalArgumentException();
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    @Deprecated
                    public Map<String, Integer> getSpecialPurposes() {
                        return getSpecialPurposesMap();
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public int getSpecialPurposesCount() {
                        return ((DataRetention) this.instance).getSpecialPurposesMap().size();
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public Map<String, Integer> getSpecialPurposesMap() {
                        return Collections.unmodifiableMap(((DataRetention) this.instance).getSpecialPurposesMap());
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public int getSpecialPurposesOrDefault(String str, int i10) {
                        str.getClass();
                        Map<String, Integer> specialPurposesMap = ((DataRetention) this.instance).getSpecialPurposesMap();
                        return specialPurposesMap.containsKey(str) ? specialPurposesMap.get(str).intValue() : i10;
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public int getSpecialPurposesOrThrow(String str) {
                        str.getClass();
                        Map<String, Integer> specialPurposesMap = ((DataRetention) this.instance).getSpecialPurposesMap();
                        if (specialPurposesMap.containsKey(str)) {
                            return specialPurposesMap.get(str).intValue();
                        }
                        throw new IllegalArgumentException();
                    }

                    @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                    public int getStdRetention() {
                        return ((DataRetention) this.instance).getStdRetention();
                    }

                    public Builder putAllPurposes(Map<String, Integer> map) {
                        copyOnWrite();
                        ((DataRetention) this.instance).getMutablePurposesMap().putAll(map);
                        return this;
                    }

                    public Builder putAllSpecialPurposes(Map<String, Integer> map) {
                        copyOnWrite();
                        ((DataRetention) this.instance).getMutableSpecialPurposesMap().putAll(map);
                        return this;
                    }

                    public Builder putPurposes(String str, int i10) {
                        str.getClass();
                        copyOnWrite();
                        ((DataRetention) this.instance).getMutablePurposesMap().put(str, Integer.valueOf(i10));
                        return this;
                    }

                    public Builder putSpecialPurposes(String str, int i10) {
                        str.getClass();
                        copyOnWrite();
                        ((DataRetention) this.instance).getMutableSpecialPurposesMap().put(str, Integer.valueOf(i10));
                        return this;
                    }

                    public Builder removePurposes(String str) {
                        str.getClass();
                        copyOnWrite();
                        ((DataRetention) this.instance).getMutablePurposesMap().remove(str);
                        return this;
                    }

                    public Builder removeSpecialPurposes(String str) {
                        str.getClass();
                        copyOnWrite();
                        ((DataRetention) this.instance).getMutableSpecialPurposesMap().remove(str);
                        return this;
                    }

                    public Builder setStdRetention(int i10) {
                        copyOnWrite();
                        ((DataRetention) this.instance).setStdRetention(i10);
                        return this;
                    }

                    private Builder() {
                        super(DataRetention.DEFAULT_INSTANCE);
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class PurposesDefaultEntryHolder {
                    static final MapEntryLite<String, Integer> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.UINT32, 0);

                    private PurposesDefaultEntryHolder() {
                    }
                }

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class SpecialPurposesDefaultEntryHolder {
                    static final MapEntryLite<String, Integer> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.UINT32, 0);

                    private SpecialPurposesDefaultEntryHolder() {
                    }
                }

                static {
                    DataRetention dataRetention = new DataRetention();
                    DEFAULT_INSTANCE = dataRetention;
                    GeneratedMessageLite.registerDefaultInstance(DataRetention.class, dataRetention);
                }

                private DataRetention() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearStdRetention() {
                    this.stdRetention_ = 0;
                }

                public static DataRetention getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public Map<String, Integer> getMutablePurposesMap() {
                    return internalGetMutablePurposes();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public Map<String, Integer> getMutableSpecialPurposesMap() {
                    return internalGetMutableSpecialPurposes();
                }

                private MapFieldLite<String, Integer> internalGetMutablePurposes() {
                    if (!this.purposes_.isMutable()) {
                        this.purposes_ = this.purposes_.mutableCopy();
                    }
                    return this.purposes_;
                }

                private MapFieldLite<String, Integer> internalGetMutableSpecialPurposes() {
                    if (!this.specialPurposes_.isMutable()) {
                        this.specialPurposes_ = this.specialPurposes_.mutableCopy();
                    }
                    return this.specialPurposes_;
                }

                private MapFieldLite<String, Integer> internalGetPurposes() {
                    return this.purposes_;
                }

                private MapFieldLite<String, Integer> internalGetSpecialPurposes() {
                    return this.specialPurposes_;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static DataRetention parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (DataRetention) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static DataRetention parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<DataRetention> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setStdRetention(int i10) {
                    this.stdRetention_ = i10;
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public boolean containsPurposes(String str) {
                    str.getClass();
                    return internalGetPurposes().containsKey(str);
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public boolean containsSpecialPurposes(String str) {
                    str.getClass();
                    return internalGetSpecialPurposes().containsKey(str);
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    AnonymousClass1 anonymousClass1 = null;
                    switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                        case 1:
                            return new DataRetention();
                        case 2:
                            return new Builder(anonymousClass1);
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0000\u0000\u0001\u000b\u00022\u00032", new Object[]{"stdRetention_", "purposes_", PurposesDefaultEntryHolder.defaultEntry, "specialPurposes_", SpecialPurposesDefaultEntryHolder.defaultEntry});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<DataRetention> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (DataRetention.class) {
                                try {
                                    defaultInstanceBasedParser = PARSER;
                                    if (defaultInstanceBasedParser == null) {
                                        defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = defaultInstanceBasedParser;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return defaultInstanceBasedParser;
                        case 6:
                            return (byte) 1;
                        case 7:
                            return null;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                @Deprecated
                public Map<String, Integer> getPurposes() {
                    return getPurposesMap();
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public int getPurposesCount() {
                    return internalGetPurposes().size();
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public Map<String, Integer> getPurposesMap() {
                    return Collections.unmodifiableMap(internalGetPurposes());
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public int getPurposesOrDefault(String str, int i10) {
                    str.getClass();
                    MapFieldLite<String, Integer> mapFieldLiteInternalGetPurposes = internalGetPurposes();
                    return mapFieldLiteInternalGetPurposes.containsKey(str) ? mapFieldLiteInternalGetPurposes.get(str).intValue() : i10;
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public int getPurposesOrThrow(String str) {
                    str.getClass();
                    MapFieldLite<String, Integer> mapFieldLiteInternalGetPurposes = internalGetPurposes();
                    if (mapFieldLiteInternalGetPurposes.containsKey(str)) {
                        return mapFieldLiteInternalGetPurposes.get(str).intValue();
                    }
                    throw new IllegalArgumentException();
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                @Deprecated
                public Map<String, Integer> getSpecialPurposes() {
                    return getSpecialPurposesMap();
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public int getSpecialPurposesCount() {
                    return internalGetSpecialPurposes().size();
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public Map<String, Integer> getSpecialPurposesMap() {
                    return Collections.unmodifiableMap(internalGetSpecialPurposes());
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public int getSpecialPurposesOrDefault(String str, int i10) {
                    str.getClass();
                    MapFieldLite<String, Integer> mapFieldLiteInternalGetSpecialPurposes = internalGetSpecialPurposes();
                    return mapFieldLiteInternalGetSpecialPurposes.containsKey(str) ? mapFieldLiteInternalGetSpecialPurposes.get(str).intValue() : i10;
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public int getSpecialPurposesOrThrow(String str) {
                    str.getClass();
                    MapFieldLite<String, Integer> mapFieldLiteInternalGetSpecialPurposes = internalGetSpecialPurposes();
                    if (mapFieldLiteInternalGetSpecialPurposes.containsKey(str)) {
                        return mapFieldLiteInternalGetSpecialPurposes.get(str).intValue();
                    }
                    throw new IllegalArgumentException();
                }

                @Override // ac.Models.Vendorlist.Vendor.DataRetentionOrBuilder
                public int getStdRetention() {
                    return this.stdRetention_;
                }

                public static Builder newBuilder(DataRetention dataRetention) {
                    return DEFAULT_INSTANCE.createBuilder(dataRetention);
                }

                public static DataRetention parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (DataRetention) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static DataRetention parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static DataRetention parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static DataRetention parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static DataRetention parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static DataRetention parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static DataRetention parseFrom(InputStream inputStream) throws IOException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static DataRetention parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static DataRetention parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static DataRetention parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (DataRetention) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* loaded from: classes.dex */
            public interface DataRetentionOrBuilder extends MessageLiteOrBuilder {
                boolean containsPurposes(String str);

                boolean containsSpecialPurposes(String str);

                @Deprecated
                Map<String, Integer> getPurposes();

                int getPurposesCount();

                Map<String, Integer> getPurposesMap();

                int getPurposesOrDefault(String str, int i10);

                int getPurposesOrThrow(String str);

                @Deprecated
                Map<String, Integer> getSpecialPurposes();

                int getSpecialPurposesCount();

                Map<String, Integer> getSpecialPurposesMap();

                int getSpecialPurposesOrDefault(String str, int i10);

                int getSpecialPurposesOrThrow(String str);

                int getStdRetention();
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* loaded from: classes.dex */
            public static final class UrlsDefaultEntryHolder {
                static final MapEntryLite<String, VendorUrl> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, VendorUrl.getDefaultInstance());

                private UrlsDefaultEntryHolder() {
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* loaded from: classes.dex */
            public static final class VendorUrl extends GeneratedMessageLite<VendorUrl, Builder> implements VendorUrlOrBuilder {
                private static final VendorUrl DEFAULT_INSTANCE;
                public static final int LEGINT_CLAIM_FIELD_NUMBER = 2;
                private static volatile Parser<VendorUrl> PARSER = null;
                public static final int PRIVACY_FIELD_NUMBER = 1;
                private String privacy_ = "";
                private String legintClaim_ = "";

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                public static final class Builder extends GeneratedMessageLite.Builder<VendorUrl, Builder> implements VendorUrlOrBuilder {
                    public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                        this();
                    }

                    public Builder clearLegintClaim() {
                        copyOnWrite();
                        ((VendorUrl) this.instance).clearLegintClaim();
                        return this;
                    }

                    public Builder clearPrivacy() {
                        copyOnWrite();
                        ((VendorUrl) this.instance).clearPrivacy();
                        return this;
                    }

                    @Override // ac.Models.Vendorlist.Vendor.VendorUrlOrBuilder
                    public String getLegintClaim() {
                        return ((VendorUrl) this.instance).getLegintClaim();
                    }

                    @Override // ac.Models.Vendorlist.Vendor.VendorUrlOrBuilder
                    public ByteString getLegintClaimBytes() {
                        return ((VendorUrl) this.instance).getLegintClaimBytes();
                    }

                    @Override // ac.Models.Vendorlist.Vendor.VendorUrlOrBuilder
                    public String getPrivacy() {
                        return ((VendorUrl) this.instance).getPrivacy();
                    }

                    @Override // ac.Models.Vendorlist.Vendor.VendorUrlOrBuilder
                    public ByteString getPrivacyBytes() {
                        return ((VendorUrl) this.instance).getPrivacyBytes();
                    }

                    public Builder setLegintClaim(String str) {
                        copyOnWrite();
                        ((VendorUrl) this.instance).setLegintClaim(str);
                        return this;
                    }

                    public Builder setLegintClaimBytes(ByteString byteString) throws IllegalArgumentException {
                        copyOnWrite();
                        ((VendorUrl) this.instance).setLegintClaimBytes(byteString);
                        return this;
                    }

                    public Builder setPrivacy(String str) {
                        copyOnWrite();
                        ((VendorUrl) this.instance).setPrivacy(str);
                        return this;
                    }

                    public Builder setPrivacyBytes(ByteString byteString) throws IllegalArgumentException {
                        copyOnWrite();
                        ((VendorUrl) this.instance).setPrivacyBytes(byteString);
                        return this;
                    }

                    private Builder() {
                        super(VendorUrl.DEFAULT_INSTANCE);
                    }
                }

                static {
                    VendorUrl vendorUrl = new VendorUrl();
                    DEFAULT_INSTANCE = vendorUrl;
                    GeneratedMessageLite.registerDefaultInstance(VendorUrl.class, vendorUrl);
                }

                private VendorUrl() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearLegintClaim() {
                    this.legintClaim_ = getDefaultInstance().getLegintClaim();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearPrivacy() {
                    this.privacy_ = getDefaultInstance().getPrivacy();
                }

                public static VendorUrl getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static VendorUrl parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (VendorUrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static VendorUrl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static Parser<VendorUrl> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setLegintClaim(String str) {
                    str.getClass();
                    this.legintClaim_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setLegintClaimBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.legintClaim_ = byteString.toStringUtf8();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setPrivacy(String str) {
                    str.getClass();
                    this.privacy_ = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setPrivacyBytes(ByteString byteString) throws IllegalArgumentException {
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.privacy_ = byteString.toStringUtf8();
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                    Parser defaultInstanceBasedParser;
                    AnonymousClass1 anonymousClass1 = null;
                    switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                        case 1:
                            return new VendorUrl();
                        case 2:
                            return new Builder(anonymousClass1);
                        case 3:
                            return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"privacy_", "legintClaim_"});
                        case 4:
                            return DEFAULT_INSTANCE;
                        case 5:
                            Parser<VendorUrl> parser = PARSER;
                            if (parser != null) {
                                return parser;
                            }
                            synchronized (VendorUrl.class) {
                                try {
                                    defaultInstanceBasedParser = PARSER;
                                    if (defaultInstanceBasedParser == null) {
                                        defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = defaultInstanceBasedParser;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return defaultInstanceBasedParser;
                        case 6:
                            return (byte) 1;
                        case 7:
                            return null;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                @Override // ac.Models.Vendorlist.Vendor.VendorUrlOrBuilder
                public String getLegintClaim() {
                    return this.legintClaim_;
                }

                @Override // ac.Models.Vendorlist.Vendor.VendorUrlOrBuilder
                public ByteString getLegintClaimBytes() {
                    return ByteString.copyFromUtf8(this.legintClaim_);
                }

                @Override // ac.Models.Vendorlist.Vendor.VendorUrlOrBuilder
                public String getPrivacy() {
                    return this.privacy_;
                }

                @Override // ac.Models.Vendorlist.Vendor.VendorUrlOrBuilder
                public ByteString getPrivacyBytes() {
                    return ByteString.copyFromUtf8(this.privacy_);
                }

                public static Builder newBuilder(VendorUrl vendorUrl) {
                    return DEFAULT_INSTANCE.createBuilder(vendorUrl);
                }

                public static VendorUrl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (VendorUrl) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static VendorUrl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
                }

                public static VendorUrl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
                }

                public static VendorUrl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
                }

                public static VendorUrl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static VendorUrl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
                }

                public static VendorUrl parseFrom(InputStream inputStream) throws IOException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static VendorUrl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
                }

                public static VendorUrl parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
                }

                public static VendorUrl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (VendorUrl) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* loaded from: classes.dex */
            public interface VendorUrlOrBuilder extends MessageLiteOrBuilder {
                String getLegintClaim();

                ByteString getLegintClaimBytes();

                String getPrivacy();

                ByteString getPrivacyBytes();
            }

            static {
                Vendor vendor = new Vendor();
                DEFAULT_INSTANCE = vendor;
                GeneratedMessageLite.registerDefaultInstance(Vendor.class, vendor);
            }

            private Vendor() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllConsentables(Iterable<? extends Integer> iterable) {
                ensureConsentablesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.consentables_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllDataCategories(Iterable<? extends DataCategory> iterable) {
                ensureDataCategoriesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataCategories_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllDataDeclaration(Iterable<? extends Integer> iterable) {
                ensureDataDeclarationIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataDeclaration_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllFlexibles(Iterable<? extends Integer> iterable) {
                ensureFlexiblesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.flexibles_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllLegintables(Iterable<? extends Integer> iterable) {
                ensureLegintablesIsMutable();
                AbstractMessageLite.addAll((Iterable) iterable, (List) this.legintables_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addConsentables(int i10) {
                ensureConsentablesIsMutable();
                this.consentables_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addDataCategories(DataCategory dataCategory) {
                dataCategory.getClass();
                ensureDataCategoriesIsMutable();
                this.dataCategories_.add(dataCategory);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addDataDeclaration(int i10) {
                ensureDataDeclarationIsMutable();
                this.dataDeclaration_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addFlexibles(int i10) {
                ensureFlexiblesIsMutable();
                this.flexibles_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLegintables(int i10) {
                ensureLegintablesIsMutable();
                this.legintables_.addInt(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearConsentables() {
                this.consentables_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCookieMaxAgeSeconds() {
                this.cookieMaxAgeSeconds_ = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCookieRefresh() {
                this.cookieRefresh_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDataCategories() {
                this.dataCategories_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDataDeclaration() {
                this.dataDeclaration_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDataRetention() {
                this.dataRetention_ = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearExtraId() {
                this.extraId_ = getDefaultInstance().getExtraId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFlexibles() {
                this.flexibles_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGoogleAtpId() {
                this.googleAtpId_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIabId() {
                this.iabId_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLegintables() {
                this.legintables_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPolicyUrl() {
                this.policyUrl_ = getDefaultInstance().getPolicyUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUsesNonCookieAccess() {
                this.usesNonCookieAccess_ = false;
            }

            private void ensureConsentablesIsMutable() {
                Internal.IntList intList = this.consentables_;
                if (intList.isModifiable()) {
                    return;
                }
                this.consentables_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureDataCategoriesIsMutable() {
                Internal.ProtobufList<DataCategory> protobufList = this.dataCategories_;
                if (protobufList.isModifiable()) {
                    return;
                }
                this.dataCategories_ = GeneratedMessageLite.mutableCopy(protobufList);
            }

            private void ensureDataDeclarationIsMutable() {
                Internal.IntList intList = this.dataDeclaration_;
                if (intList.isModifiable()) {
                    return;
                }
                this.dataDeclaration_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureFlexiblesIsMutable() {
                Internal.IntList intList = this.flexibles_;
                if (intList.isModifiable()) {
                    return;
                }
                this.flexibles_ = GeneratedMessageLite.mutableCopy(intList);
            }

            private void ensureLegintablesIsMutable() {
                Internal.IntList intList = this.legintables_;
                if (intList.isModifiable()) {
                    return;
                }
                this.legintables_ = GeneratedMessageLite.mutableCopy(intList);
            }

            public static Vendor getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public Map<String, VendorUrl> getMutableUrlsMap() {
                return internalGetMutableUrls();
            }

            private MapFieldLite<String, VendorUrl> internalGetMutableUrls() {
                if (!this.urls_.isMutable()) {
                    this.urls_ = this.urls_.mutableCopy();
                }
                return this.urls_;
            }

            private MapFieldLite<String, VendorUrl> internalGetUrls() {
                return this.urls_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeDataRetention(DataRetention dataRetention) {
                dataRetention.getClass();
                DataRetention dataRetention2 = this.dataRetention_;
                if (dataRetention2 == null || dataRetention2 == DataRetention.getDefaultInstance()) {
                    this.dataRetention_ = dataRetention;
                } else {
                    this.dataRetention_ = DataRetention.newBuilder(this.dataRetention_).mergeFrom((DataRetention.Builder) dataRetention).buildPartial();
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Vendor parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Vendor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Vendor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Vendor> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeDataCategories(int i10) {
                ensureDataCategoriesIsMutable();
                this.dataCategories_.remove(i10);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setConsentables(int i10, int i11) {
                ensureConsentablesIsMutable();
                this.consentables_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCookieMaxAgeSeconds(long j10) {
                this.cookieMaxAgeSeconds_ = j10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCookieRefresh(boolean z10) {
                this.cookieRefresh_ = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDataCategories(int i10, DataCategory dataCategory) {
                dataCategory.getClass();
                ensureDataCategoriesIsMutable();
                this.dataCategories_.set(i10, dataCategory);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDataDeclaration(int i10, int i11) {
                ensureDataDeclarationIsMutable();
                this.dataDeclaration_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDataRetention(DataRetention dataRetention) {
                dataRetention.getClass();
                this.dataRetention_ = dataRetention;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setExtraId(String str) {
                str.getClass();
                this.extraId_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setExtraIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.extraId_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFlexibles(int i10, int i11) {
                ensureFlexiblesIsMutable();
                this.flexibles_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGoogleAtpId(int i10) {
                this.googleAtpId_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIabId(int i10) {
                this.iabId_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(int i10) {
                this.id_ = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLegintables(int i10, int i11) {
                ensureLegintablesIsMutable();
                this.legintables_.setInt(i10, i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(String str) {
                str.getClass();
                this.name_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNameBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPolicyUrl(String str) {
                str.getClass();
                this.policyUrl_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPolicyUrlBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.policyUrl_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUsesNonCookieAccess(boolean z10) {
                this.usesNonCookieAccess_ = z10;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public boolean containsUrls(String str) {
                str.getClass();
                return internalGetUrls().containsKey(str);
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getConsentables(int i10) {
                return this.consentables_.getInt(i10);
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getConsentablesCount() {
                return this.consentables_.size();
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public List<Integer> getConsentablesList() {
                return this.consentables_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public long getCookieMaxAgeSeconds() {
                return this.cookieMaxAgeSeconds_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public boolean getCookieRefresh() {
                return this.cookieRefresh_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public DataCategory getDataCategories(int i10) {
                return this.dataCategories_.get(i10);
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getDataCategoriesCount() {
                return this.dataCategories_.size();
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public List<DataCategory> getDataCategoriesList() {
                return this.dataCategories_;
            }

            public DataCategoryOrBuilder getDataCategoriesOrBuilder(int i10) {
                return this.dataCategories_.get(i10);
            }

            public List<? extends DataCategoryOrBuilder> getDataCategoriesOrBuilderList() {
                return this.dataCategories_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getDataDeclaration(int i10) {
                return this.dataDeclaration_.getInt(i10);
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getDataDeclarationCount() {
                return this.dataDeclaration_.size();
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public List<Integer> getDataDeclarationList() {
                return this.dataDeclaration_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public DataRetention getDataRetention() {
                DataRetention dataRetention = this.dataRetention_;
                return dataRetention == null ? DataRetention.getDefaultInstance() : dataRetention;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public String getExtraId() {
                return this.extraId_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public ByteString getExtraIdBytes() {
                return ByteString.copyFromUtf8(this.extraId_);
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getFlexibles(int i10) {
                return this.flexibles_.getInt(i10);
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getFlexiblesCount() {
                return this.flexibles_.size();
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public List<Integer> getFlexiblesList() {
                return this.flexibles_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getGoogleAtpId() {
                return this.googleAtpId_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getIabId() {
                return this.iabId_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getLegintables(int i10) {
                return this.legintables_.getInt(i10);
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getLegintablesCount() {
                return this.legintables_.size();
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public List<Integer> getLegintablesList() {
                return this.legintables_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public String getName() {
                return this.name_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public ByteString getNameBytes() {
                return ByteString.copyFromUtf8(this.name_);
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public String getPolicyUrl() {
                return this.policyUrl_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public ByteString getPolicyUrlBytes() {
                return ByteString.copyFromUtf8(this.policyUrl_);
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            @Deprecated
            public Map<String, VendorUrl> getUrls() {
                return getUrlsMap();
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public int getUrlsCount() {
                return internalGetUrls().size();
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public Map<String, VendorUrl> getUrlsMap() {
                return Collections.unmodifiableMap(internalGetUrls());
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public VendorUrl getUrlsOrDefault(String str, VendorUrl vendorUrl) {
                str.getClass();
                MapFieldLite<String, VendorUrl> mapFieldLiteInternalGetUrls = internalGetUrls();
                return mapFieldLiteInternalGetUrls.containsKey(str) ? mapFieldLiteInternalGetUrls.get(str) : vendorUrl;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public VendorUrl getUrlsOrThrow(String str) {
                str.getClass();
                MapFieldLite<String, VendorUrl> mapFieldLiteInternalGetUrls = internalGetUrls();
                if (mapFieldLiteInternalGetUrls.containsKey(str)) {
                    return mapFieldLiteInternalGetUrls.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public boolean getUsesNonCookieAccess() {
                return this.usesNonCookieAccess_;
            }

            @Override // ac.Models.Vendorlist.VendorOrBuilder
            public boolean hasDataRetention() {
                return this.dataRetention_ != null;
            }

            public static Builder newBuilder(Vendor vendor) {
                return DEFAULT_INSTANCE.createBuilder(vendor);
            }

            public static Vendor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Vendor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Vendor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Vendor();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0011\u0010\u0001\u0005\u0000\u0001\u000b\u0002\u000b\u0003Ȉ\u0004Ȉ\u0005\u001d\u0006\u001d\u0007Ȉ\t\u0007\n\u0002\u000b\u001d\f\u000b\r2\u000e\t\u000f\u001b\u0010+\u0011\u0007", new Object[]{"id_", "iabId_", "name_", "policyUrl_", "consentables_", "legintables_", "extraId_", "usesNonCookieAccess_", NyKZx.WQe, "flexibles_", "googleAtpId_", "urls_", UrlsDefaultEntryHolder.defaultEntry, "dataRetention_", "dataCategories_", DataCategory.class, "dataDeclaration_", "cookieRefresh_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Vendor> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Vendor.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public static Vendor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addDataCategories(int i10, DataCategory dataCategory) {
                dataCategory.getClass();
                ensureDataCategoriesIsMutable();
                this.dataCategories_.add(i10, dataCategory);
            }

            public static Vendor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Vendor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Vendor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Vendor parseFrom(InputStream inputStream) throws IOException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Vendor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Vendor parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Vendor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Vendor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public interface VendorOrBuilder extends MessageLiteOrBuilder {
            boolean containsUrls(String str);

            int getConsentables(int i10);

            int getConsentablesCount();

            List<Integer> getConsentablesList();

            long getCookieMaxAgeSeconds();

            boolean getCookieRefresh();

            DataCategory getDataCategories(int i10);

            int getDataCategoriesCount();

            List<DataCategory> getDataCategoriesList();

            int getDataDeclaration(int i10);

            int getDataDeclarationCount();

            List<Integer> getDataDeclarationList();

            Vendor.DataRetention getDataRetention();

            String getExtraId();

            ByteString getExtraIdBytes();

            int getFlexibles(int i10);

            int getFlexiblesCount();

            List<Integer> getFlexiblesList();

            int getGoogleAtpId();

            int getIabId();

            int getId();

            int getLegintables(int i10);

            int getLegintablesCount();

            List<Integer> getLegintablesList();

            String getName();

            ByteString getNameBytes();

            String getPolicyUrl();

            ByteString getPolicyUrlBytes();

            @Deprecated
            Map<String, Vendor.VendorUrl> getUrls();

            int getUrlsCount();

            Map<String, Vendor.VendorUrl> getUrlsMap();

            Vendor.VendorUrl getUrlsOrDefault(String str, Vendor.VendorUrl vendorUrl);

            Vendor.VendorUrl getUrlsOrThrow(String str);

            boolean getUsesNonCookieAccess();

            boolean hasDataRetention();
        }

        static {
            Vendorlist vendorlist = new Vendorlist();
            DEFAULT_INSTANCE = vendorlist;
            GeneratedMessageLite.registerDefaultInstance(Vendorlist.class, vendorlist);
        }

        private Vendorlist() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllConsentables(Iterable<? extends Consentable> iterable) {
            ensureConsentablesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.consentables_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGeolocAd(Iterable<? extends Integer> iterable) {
            ensureGeolocAdIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.geolocAd_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGeolocMarket(Iterable<? extends Integer> iterable) {
            ensureGeolocMarketIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.geolocMarket_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllStacks(Iterable<? extends Stack> iterable) {
            ensureStacksIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.stacks_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllVendors(Iterable<? extends Vendor> iterable) {
            ensureVendorsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.vendors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConsentables(Consentable consentable) {
            consentable.getClass();
            ensureConsentablesIsMutable();
            this.consentables_.add(consentable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeolocAd(int i10) {
            ensureGeolocAdIsMutable();
            this.geolocAd_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGeolocMarket(int i10) {
            ensureGeolocMarketIsMutable();
            this.geolocMarket_.addInt(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStacks(Stack stack) {
            stack.getClass();
            ensureStacksIsMutable();
            this.stacks_.add(stack);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVendors(Vendor vendor) {
            vendor.getClass();
            ensureVendorsIsMutable();
            this.vendors_.add(vendor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsentLifetime() {
            this.consentLifetime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsentables() {
            this.consentables_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeolocAd() {
            this.geolocAd_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGeolocMarket() {
            this.geolocMarket_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoogleProviders() {
            this.googleProviders_ = getDefaultInstance().getGoogleProviders();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIabGvl() {
            this.iabGvl_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublisherCc() {
            this.publisherCc_ = getDefaultInstance().getPublisherCc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublisherRestrictions() {
            this.publisherRestrictions_ = getDefaultInstance().getPublisherRestrictions();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemoveLegintables() {
            this.removeLegintables_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStacks() {
            this.stacks_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTcfPolicyVersion() {
            this.tcfPolicyVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendors() {
            this.vendors_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureConsentablesIsMutable() {
            Internal.ProtobufList<Consentable> protobufList = this.consentables_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.consentables_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureGeolocAdIsMutable() {
            Internal.IntList intList = this.geolocAd_;
            if (intList.isModifiable()) {
                return;
            }
            this.geolocAd_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureGeolocMarketIsMutable() {
            Internal.IntList intList = this.geolocMarket_;
            if (intList.isModifiable()) {
                return;
            }
            this.geolocMarket_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureStacksIsMutable() {
            Internal.ProtobufList<Stack> protobufList = this.stacks_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.stacks_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureVendorsIsMutable() {
            Internal.ProtobufList<Vendor> protobufList = this.vendors_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.vendors_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Vendorlist getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<Integer, DataCategory> getMutableDataCategoriesMap() {
            return internalGetMutableDataCategories();
        }

        private MapFieldLite<Integer, DataCategory> internalGetDataCategories() {
            return this.dataCategories_;
        }

        private MapFieldLite<Integer, DataCategory> internalGetMutableDataCategories() {
            if (!this.dataCategories_.isMutable()) {
                this.dataCategories_ = this.dataCategories_.mutableCopy();
            }
            return this.dataCategories_;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Vendorlist parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Vendorlist) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Vendorlist parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Vendorlist> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeConsentables(int i10) {
            ensureConsentablesIsMutable();
            this.consentables_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeStacks(int i10) {
            ensureStacksIsMutable();
            this.stacks_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeVendors(int i10) {
            ensureVendorsIsMutable();
            this.vendors_.remove(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentLifetime(int i10) {
            this.consentLifetime_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConsentables(int i10, Consentable consentable) {
            consentable.getClass();
            ensureConsentablesIsMutable();
            this.consentables_.set(i10, consentable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeolocAd(int i10, int i11) {
            ensureGeolocAdIsMutable();
            this.geolocAd_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGeolocMarket(int i10, int i11) {
            ensureGeolocMarketIsMutable();
            this.geolocMarket_.setInt(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoogleProviders(String str) {
            str.getClass();
            this.googleProviders_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoogleProvidersBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.googleProviders_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIabGvl(int i10) {
            this.iabGvl_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherCc(String str) {
            str.getClass();
            this.publisherCc_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherCcBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.publisherCc_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherRestrictions(String str) {
            str.getClass();
            this.publisherRestrictions_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublisherRestrictionsBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.publisherRestrictions_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemoveLegintables(boolean z10) {
            this.removeLegintables_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStacks(int i10, Stack stack) {
            stack.getClass();
            ensureStacksIsMutable();
            this.stacks_.set(i10, stack);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTcfPolicyVersion(int i10) {
            this.tcfPolicyVersion_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVendors(int i10, Vendor vendor) {
            vendor.getClass();
            ensureVendorsIsMutable();
            this.vendors_.set(i10, vendor);
        }

        @Override // ac.Models.VendorlistOrBuilder
        public boolean containsDataCategories(int i10) {
            return internalGetDataCategories().containsKey(Integer.valueOf(i10));
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Vendorlist();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\u0013\r\u0001\u0005\u0000\u0001\u000b\u0002\u001b\u0003\u001b\u0006\u001b\u000b\u000b\fȈ\rȈ\u000e\u001d\u000f\u001d\u0010Ȉ\u0011\u000b\u0012\u0007\u00132", new Object[]{"iabGvl_", "consentables_", Consentable.class, "vendors_", Vendor.class, "stacks_", Stack.class, "tcfPolicyVersion_", "publisherCc_", "publisherRestrictions_", "geolocAd_", "geolocMarket_", "googleProviders_", "consentLifetime_", "removeLegintables_", "dataCategories_", DataCategoriesDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Vendorlist> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Vendorlist.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getConsentLifetime() {
            return this.consentLifetime_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public Consentable getConsentables(int i10) {
            return this.consentables_.get(i10);
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getConsentablesCount() {
            return this.consentables_.size();
        }

        @Override // ac.Models.VendorlistOrBuilder
        public List<Consentable> getConsentablesList() {
            return this.consentables_;
        }

        public ConsentableOrBuilder getConsentablesOrBuilder(int i10) {
            return this.consentables_.get(i10);
        }

        public List<? extends ConsentableOrBuilder> getConsentablesOrBuilderList() {
            return this.consentables_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        @Deprecated
        public Map<Integer, DataCategory> getDataCategories() {
            return getDataCategoriesMap();
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getDataCategoriesCount() {
            return internalGetDataCategories().size();
        }

        @Override // ac.Models.VendorlistOrBuilder
        public Map<Integer, DataCategory> getDataCategoriesMap() {
            return Collections.unmodifiableMap(internalGetDataCategories());
        }

        @Override // ac.Models.VendorlistOrBuilder
        public DataCategory getDataCategoriesOrDefault(int i10, DataCategory dataCategory) {
            MapFieldLite<Integer, DataCategory> mapFieldLiteInternalGetDataCategories = internalGetDataCategories();
            return mapFieldLiteInternalGetDataCategories.containsKey(Integer.valueOf(i10)) ? mapFieldLiteInternalGetDataCategories.get(Integer.valueOf(i10)) : dataCategory;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public DataCategory getDataCategoriesOrThrow(int i10) {
            MapFieldLite<Integer, DataCategory> mapFieldLiteInternalGetDataCategories = internalGetDataCategories();
            if (mapFieldLiteInternalGetDataCategories.containsKey(Integer.valueOf(i10))) {
                return mapFieldLiteInternalGetDataCategories.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getGeolocAd(int i10) {
            return this.geolocAd_.getInt(i10);
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getGeolocAdCount() {
            return this.geolocAd_.size();
        }

        @Override // ac.Models.VendorlistOrBuilder
        public List<Integer> getGeolocAdList() {
            return this.geolocAd_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getGeolocMarket(int i10) {
            return this.geolocMarket_.getInt(i10);
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getGeolocMarketCount() {
            return this.geolocMarket_.size();
        }

        @Override // ac.Models.VendorlistOrBuilder
        public List<Integer> getGeolocMarketList() {
            return this.geolocMarket_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public String getGoogleProviders() {
            return this.googleProviders_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public ByteString getGoogleProvidersBytes() {
            return ByteString.copyFromUtf8(this.googleProviders_);
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getIabGvl() {
            return this.iabGvl_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public String getPublisherCc() {
            return this.publisherCc_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public ByteString getPublisherCcBytes() {
            return ByteString.copyFromUtf8(this.publisherCc_);
        }

        @Override // ac.Models.VendorlistOrBuilder
        public String getPublisherRestrictions() {
            return this.publisherRestrictions_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public ByteString getPublisherRestrictionsBytes() {
            return ByteString.copyFromUtf8(this.publisherRestrictions_);
        }

        @Override // ac.Models.VendorlistOrBuilder
        public boolean getRemoveLegintables() {
            return this.removeLegintables_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public Stack getStacks(int i10) {
            return this.stacks_.get(i10);
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getStacksCount() {
            return this.stacks_.size();
        }

        @Override // ac.Models.VendorlistOrBuilder
        public List<Stack> getStacksList() {
            return this.stacks_;
        }

        public StackOrBuilder getStacksOrBuilder(int i10) {
            return this.stacks_.get(i10);
        }

        public List<? extends StackOrBuilder> getStacksOrBuilderList() {
            return this.stacks_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getTcfPolicyVersion() {
            return this.tcfPolicyVersion_;
        }

        @Override // ac.Models.VendorlistOrBuilder
        public Vendor getVendors(int i10) {
            return this.vendors_.get(i10);
        }

        @Override // ac.Models.VendorlistOrBuilder
        public int getVendorsCount() {
            return this.vendors_.size();
        }

        @Override // ac.Models.VendorlistOrBuilder
        public List<Vendor> getVendorsList() {
            return this.vendors_;
        }

        public VendorOrBuilder getVendorsOrBuilder(int i10) {
            return this.vendors_.get(i10);
        }

        public List<? extends VendorOrBuilder> getVendorsOrBuilderList() {
            return this.vendors_;
        }

        public static Builder newBuilder(Vendorlist vendorlist) {
            return DEFAULT_INSTANCE.createBuilder(vendorlist);
        }

        public static Vendorlist parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Vendorlist) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Vendorlist parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Vendorlist parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConsentables(int i10, Consentable consentable) {
            consentable.getClass();
            ensureConsentablesIsMutable();
            this.consentables_.add(i10, consentable);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addStacks(int i10, Stack stack) {
            stack.getClass();
            ensureStacksIsMutable();
            this.stacks_.add(i10, stack);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVendors(int i10, Vendor vendor) {
            vendor.getClass();
            ensureVendorsIsMutable();
            this.vendors_.add(i10, vendor);
        }

        public static Vendorlist parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Vendorlist parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Vendorlist parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Vendorlist parseFrom(InputStream inputStream) throws IOException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Vendorlist parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Vendorlist parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Vendorlist parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Vendorlist) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface VendorlistOrBuilder extends MessageLiteOrBuilder {
        boolean containsDataCategories(int i10);

        int getConsentLifetime();

        Vendorlist.Consentable getConsentables(int i10);

        int getConsentablesCount();

        List<Vendorlist.Consentable> getConsentablesList();

        @Deprecated
        Map<Integer, Vendorlist.DataCategory> getDataCategories();

        int getDataCategoriesCount();

        Map<Integer, Vendorlist.DataCategory> getDataCategoriesMap();

        Vendorlist.DataCategory getDataCategoriesOrDefault(int i10, Vendorlist.DataCategory dataCategory);

        Vendorlist.DataCategory getDataCategoriesOrThrow(int i10);

        int getGeolocAd(int i10);

        int getGeolocAdCount();

        List<Integer> getGeolocAdList();

        int getGeolocMarket(int i10);

        int getGeolocMarketCount();

        List<Integer> getGeolocMarketList();

        String getGoogleProviders();

        ByteString getGoogleProvidersBytes();

        int getIabGvl();

        String getPublisherCc();

        ByteString getPublisherCcBytes();

        String getPublisherRestrictions();

        ByteString getPublisherRestrictionsBytes();

        boolean getRemoveLegintables();

        Vendorlist.Stack getStacks(int i10);

        int getStacksCount();

        List<Vendorlist.Stack> getStacksList();

        int getTcfPolicyVersion();

        Vendorlist.Vendor getVendors(int i10);

        int getVendorsCount();

        List<Vendorlist.Vendor> getVendorsList();
    }

    private Models() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
