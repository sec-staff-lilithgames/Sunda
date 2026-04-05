package com.sfbx.appconsentv3.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.sfbx.appconsent.core.model.RemoteTheme;
import com.sfbx.appconsent.core.model.TranslatableText;
import com.sfbx.appconsentv3.ui.util.ExtensionKt;
import io.sfbx.appconsent.logger.ACLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import m3.a;
import sv.k0;
import tu.f;
import tu.o;
import tu.q;
import uu.o0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AppConsentTheme {
    public static final Companion Companion = new Companion(null);
    private Context _contextLocalized;
    private int acceptAllButtonBackground;
    private int acceptAllButtonBorder;
    private int acceptAllButtonText;
    private int actionBarColor;
    private int actionBarTextColor;
    private int bannerActions;
    private int bannerBackgroundColor;
    private final Builder builder;
    private String buttonAcceptAllText;
    private int buttonBackgroundColor;
    private int buttonBorderColor;
    private String buttonClose;
    private String buttonConfigureText;
    private String buttonContinueWithoutAcceptingText;
    private String buttonDenyAllText;
    private String buttonDisplayAllPartners;
    private String buttonLearnMoreText;
    private String buttonOpposeLegint;
    private String buttonRefineByPartner;
    private String buttonSaveText;
    private String buttonSeeMandatoryFeature;
    private String buttonSeeMandatoryPurpose;
    private String buttonSeeMoreLegalText;
    private int buttonTextColor;
    private String consentablePolicy;
    private boolean continueWithoutAccepting;
    private int copyrightColor;
    private boolean displayConfigCloseHeader;
    private boolean displaySuccessScreen;
    private boolean enableIllustrations;
    private String fallbackLanguageAsLowercase;
    private String finishDescriptionText;
    private String finishSubtitleText;
    private String finishTitleText;
    private String geoAdvertisingIconUrl;
    private int geoNoticeBannerBackgroundColor;
    private boolean highlightAcceptAllButton;
    private String illustrationFooterImageUrl;
    private String illustrationHeaderImageUrl;
    private String illustrationSuccessImageUrl;
    private String introductionDetailsText;
    private String introductionText;
    private String introductionTitleText;
    private boolean isNeedToDisplayUsageExampleOnLayer1;
    private List<String> languagesAsLowercase;
    private String mandatorySectionVendors;
    private String noticeActionBarTitle;
    private String noticeConsentableDetailLabel1;
    private String noticeInformationListTitleText;
    private String noticeLabelDataCollectionText;
    private String noticeLabelExtraUsageText;
    private String noticeLabelOtherUsageText;
    private String noticeMandatoryFeatureDesc;
    private String noticeMandatoryFeatureTitle;
    private String noticeMandatoryPurposeDesc;
    private String noticeMandatoryPurposeTitle;
    private Drawable noticeSuccessImage;
    private String noticeSuccessImageUrl;
    private String onboardingImageUrl;
    private int refuseAllButtonBackground;
    private int refuseAllButtonBorder;
    private int refuseAllButtonText;
    private int separatorColor;
    private int setupButtonBackground;
    private int setupButtonBorder;
    private int setupButtonText;
    private int statusBarColor;
    private int switchOffButtonColor;
    private int switchOffColor;
    private int switchOnButtonColor;
    private int switchOnColor;
    private int switchUnsetColor;
    private boolean tabletModalScreen;
    private int textColor;
    private final int theme;
    private String vendorCompulsory;
    private String vendorFeature;
    private String vendorGlobalTitle;
    private String vendorLegInt;
    private String vendorPolicy;
    private String vendorPurpose;
    private String vendorTabIabText;
    private String vendorTabOtherText;
    private String vendorUnderConsent;
    private String vendorUnderLegInt;
    private String vendorsHeader;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getSafeColorValue(String str) {
            try {
                return Color.parseColor(str);
            } catch (IllegalArgumentException e10) {
                try {
                    if (isColorWith3Digits(str)) {
                        return Color.parseColor(toColorWith6Digits(str));
                    }
                    ACLogger aCLogger = ACLogger.INSTANCE;
                    String simpleName = Companion.class.getSimpleName();
                    e0.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
                    aCLogger.e(simpleName, e10);
                    return 0;
                } catch (Exception unused) {
                    return 0;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTextValue(List<TranslatableText> list, String str) {
            for (TranslatableText translatableText : list) {
                String strComponent1 = translatableText.component1();
                String strComponent2 = translatableText.component2();
                if (k0.equals(str, strComponent1, true)) {
                    return strComponent2;
                }
            }
            if (list.isEmpty()) {
                return null;
            }
            return ((TranslatableText) y0.first((List) list)).getValue();
        }

        private final void initLocalize(Context context, AppConsentTheme appConsentTheme, RemoteTheme remoteTheme) {
            String lowerCase = remoteTheme.getFallbackLanguage().toLowerCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            appConsentTheme.setFallbackLanguageAsLowercase$appconsent_ui_v3_prodXchangeRelease(lowerCase);
            List<String> languages = remoteTheme.getLanguages();
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(languages, 10));
            Iterator<T> it = languages.iterator();
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ROOT);
                e0.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                arrayList.add(lowerCase2);
            }
            appConsentTheme.setLanguagesAsLowercase$appconsent_ui_v3_prodXchangeRelease(arrayList);
            loadNewContext(context, appConsentTheme.getLanguage$appconsent_ui_v3_prodXchangeRelease(), appConsentTheme);
        }

        private final boolean isColorWith3Digits(String str) {
            Pattern patternCompile = Pattern.compile("#[0-9a-fA-F]{3}");
            if (str == null) {
                str = "";
            }
            return patternCompile.matcher(str).matches();
        }

        private final void loadColors(RemoteTheme remoteTheme, AppConsentTheme appConsentTheme) {
            ExtensionKt.notNullOrEmpty(remoteTheme.getTextColor(), new AppConsentTheme$Companion$loadColors$1$1(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getCopyrightColor(), new AppConsentTheme$Companion$loadColors$1$2(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getBannerBackgroundColor(), new AppConsentTheme$Companion$loadColors$1$3(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getSeparatorColor(), new AppConsentTheme$Companion$loadColors$1$4(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonBorderColor(), new AppConsentTheme$Companion$loadColors$1$5(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonTextColor(), new AppConsentTheme$Companion$loadColors$1$6(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonBackgroundColor(), new AppConsentTheme$Companion$loadColors$1$7(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getGeoNoticeBannerBackgroundColor(), new AppConsentTheme$Companion$loadColors$1$8(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getSwitchUnsetColor(), new AppConsentTheme$Companion$loadColors$1$9(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getSwitchOnColor(), new AppConsentTheme$Companion$loadColors$1$10(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getSwitchOnButtonColor(), new AppConsentTheme$Companion$loadColors$1$11(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getSwitchOffColor(), new AppConsentTheme$Companion$loadColors$1$12(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getSwitchOffButtonColor(), new AppConsentTheme$Companion$loadColors$1$13(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getStatusBarColor(), new AppConsentTheme$Companion$loadColors$1$14(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getActionBarColor(), new AppConsentTheme$Companion$loadColors$1$15(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getActionBarTextColor(), new AppConsentTheme$Companion$loadColors$1$16(appConsentTheme));
            String acceptAllButtonBackground = remoteTheme.getAcceptAllButtonBackground();
            if (acceptAllButtonBackground == null || acceptAllButtonBackground.length() == 0) {
                appConsentTheme.acceptAllButtonBackground = appConsentTheme.getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease();
            } else {
                ExtensionKt.notNullOrEmpty(remoteTheme.getAcceptAllButtonBackground(), new AppConsentTheme$Companion$loadColors$1$17(appConsentTheme));
            }
            String acceptAllButtonBorder = remoteTheme.getAcceptAllButtonBorder();
            if (acceptAllButtonBorder == null || acceptAllButtonBorder.length() == 0) {
                appConsentTheme.acceptAllButtonBorder = appConsentTheme.getButtonBorderColor$appconsent_ui_v3_prodXchangeRelease();
            } else {
                ExtensionKt.notNullOrEmpty(remoteTheme.getAcceptAllButtonBorder(), new AppConsentTheme$Companion$loadColors$1$18(appConsentTheme));
            }
            String acceptAllButtonText = remoteTheme.getAcceptAllButtonText();
            if (acceptAllButtonText == null || acceptAllButtonText.length() == 0) {
                appConsentTheme.acceptAllButtonText = appConsentTheme.getButtonTextColor$appconsent_ui_v3_prodXchangeRelease();
            } else {
                ExtensionKt.notNullOrEmpty(remoteTheme.getAcceptAllButtonText(), new AppConsentTheme$Companion$loadColors$1$19(appConsentTheme));
            }
            String refuseAllButtonBackground = remoteTheme.getRefuseAllButtonBackground();
            if (refuseAllButtonBackground == null || refuseAllButtonBackground.length() == 0) {
                appConsentTheme.refuseAllButtonBackground = appConsentTheme.getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease();
            } else {
                ExtensionKt.notNullOrEmpty(remoteTheme.getRefuseAllButtonBackground(), new AppConsentTheme$Companion$loadColors$1$20(appConsentTheme));
            }
            String refuseAllButtonBorder = remoteTheme.getRefuseAllButtonBorder();
            if (refuseAllButtonBorder == null || refuseAllButtonBorder.length() == 0) {
                appConsentTheme.refuseAllButtonBorder = appConsentTheme.getButtonBorderColor$appconsent_ui_v3_prodXchangeRelease();
            } else {
                ExtensionKt.notNullOrEmpty(remoteTheme.getRefuseAllButtonBorder(), new AppConsentTheme$Companion$loadColors$1$21(appConsentTheme));
            }
            String refuseAllButtonText = remoteTheme.getRefuseAllButtonText();
            if (refuseAllButtonText == null || refuseAllButtonText.length() == 0) {
                appConsentTheme.refuseAllButtonText = appConsentTheme.getButtonTextColor$appconsent_ui_v3_prodXchangeRelease();
            } else {
                ExtensionKt.notNullOrEmpty(remoteTheme.getRefuseAllButtonText(), new AppConsentTheme$Companion$loadColors$1$22(appConsentTheme));
            }
            String setupButtonBackground = remoteTheme.getSetupButtonBackground();
            if (setupButtonBackground == null || setupButtonBackground.length() == 0) {
                appConsentTheme.setupButtonBackground = appConsentTheme.getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease();
            } else {
                ExtensionKt.notNullOrEmpty(remoteTheme.getSetupButtonBackground(), new AppConsentTheme$Companion$loadColors$1$23(appConsentTheme));
            }
            String setupButtonBorder = remoteTheme.getSetupButtonBorder();
            if (setupButtonBorder == null || setupButtonBorder.length() == 0) {
                appConsentTheme.setupButtonBorder = appConsentTheme.getButtonBorderColor$appconsent_ui_v3_prodXchangeRelease();
            } else {
                ExtensionKt.notNullOrEmpty(remoteTheme.getSetupButtonBorder(), new AppConsentTheme$Companion$loadColors$1$24(appConsentTheme));
            }
            String setupButtonText = remoteTheme.getSetupButtonText();
            if (setupButtonText == null || setupButtonText.length() == 0) {
                appConsentTheme.setupButtonText = appConsentTheme.getButtonTextColor$appconsent_ui_v3_prodXchangeRelease();
            } else {
                ExtensionKt.notNullOrEmpty(remoteTheme.getSetupButtonText(), new AppConsentTheme$Companion$loadColors$1$25(appConsentTheme));
            }
        }

        private final void loadDrawables(RemoteTheme remoteTheme, AppConsentTheme appConsentTheme) {
            ExtensionKt.notNullOrEmpty(remoteTheme.getOnboardingImage(), new AppConsentTheme$Companion$loadDrawables$1$1(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getNoticeSuccessImage(), new AppConsentTheme$Companion$loadDrawables$1$2(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getGeoAdvertisingIcon(), new AppConsentTheme$Companion$loadDrawables$1$3(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getIllustrationFooterImage(), new AppConsentTheme$Companion$loadDrawables$1$4(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getIllustrationHeaderImage(), new AppConsentTheme$Companion$loadDrawables$1$5(appConsentTheme));
            ExtensionKt.notNullOrEmpty(remoteTheme.getIllustrationSuccessImage(), new AppConsentTheme$Companion$loadDrawables$1$6(appConsentTheme));
        }

        private static final AppConsentTheme loadFromRemote$lambda$0(o oVar) {
            return (AppConsentTheme) oVar.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void loadNewContext(Context context, String str, AppConsentTheme appConsentTheme) {
            if (!e0.areEqual(str, Locale.getDefault().getLanguage())) {
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                configuration.setLocale(new Locale(str));
                context = context.createConfigurationContext(configuration);
            }
            appConsentTheme._contextLocalized = context;
        }

        private final void loadTexts(RemoteTheme remoteTheme, AppConsentTheme appConsentTheme) {
            String language$appconsent_ui_v3_prodXchangeRelease = appConsentTheme.getLanguage$appconsent_ui_v3_prodXchangeRelease();
            appConsentTheme.loadDefaultString(appConsentTheme.getContextLocalized$appconsent_ui_v3_prodXchangeRelease());
            ExtensionKt.notNullOrEmpty(remoteTheme.getIntroductionText(), new AppConsentTheme$Companion$loadTexts$1$1(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getIntroductionTitle(), new AppConsentTheme$Companion$loadTexts$1$2(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getIntroductionDetailsText(), new AppConsentTheme$Companion$loadTexts$1$3(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonConfigure(), new AppConsentTheme$Companion$loadTexts$1$4(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonAcceptAll(), new AppConsentTheme$Companion$loadTexts$1$5(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonDenyAll(), new AppConsentTheme$Companion$loadTexts$1$6(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonKnowMore(), new AppConsentTheme$Companion$loadTexts$1$7(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonSeeMandatoryPurpose(), new AppConsentTheme$Companion$loadTexts$1$8(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonSeeMandatoryFeature(), new AppConsentTheme$Companion$loadTexts$1$9(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonSave(), new AppConsentTheme$Companion$loadTexts$1$10(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonClose(), new AppConsentTheme$Companion$loadTexts$1$11(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonRefineByPartner(), new AppConsentTheme$Companion$loadTexts$1$12(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorPolicy(), new AppConsentTheme$Companion$loadTexts$1$13(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getConsentablePolicy(), new AppConsentTheme$Companion$loadTexts$1$14(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getNoticeTitle(), new AppConsentTheme$Companion$loadTexts$1$15(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getNoticeSubTitle(), new AppConsentTheme$Companion$loadTexts$1$16(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getNoticeFeatureTitle(), new AppConsentTheme$Companion$loadTexts$1$17(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getNoticeMandatoryFeatureDesc(), new AppConsentTheme$Companion$loadTexts$1$18(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getNoticeMandatoryFeatureTitle(), new AppConsentTheme$Companion$loadTexts$1$19(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getNoticeMandatoryPurposeDesc(), new AppConsentTheme$Companion$loadTexts$1$20(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getNoticeMandatoryPurposeTitle(), new AppConsentTheme$Companion$loadTexts$1$21(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getNoticeConsentableDetailLabel1(), new AppConsentTheme$Companion$loadTexts$1$22(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getMandatorySectionVendors(), new AppConsentTheme$Companion$loadTexts$1$23(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonOpposeLegint(), new AppConsentTheme$Companion$loadTexts$1$24(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorTabIab(), new AppConsentTheme$Companion$loadTexts$1$25(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorTabOther(), new AppConsentTheme$Companion$loadTexts$1$26(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorLegInt(), new AppConsentTheme$Companion$loadTexts$1$27(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorUnderConsent(), new AppConsentTheme$Companion$loadTexts$1$28(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorUnderLegInt(), new AppConsentTheme$Companion$loadTexts$1$29(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorCompulsory(), new AppConsentTheme$Companion$loadTexts$1$30(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorPurpose(), new AppConsentTheme$Companion$loadTexts$1$31(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorFeature(), new AppConsentTheme$Companion$loadTexts$1$32(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getVendorsHeader(), new AppConsentTheme$Companion$loadTexts$1$33(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getSuccessTitle(), new AppConsentTheme$Companion$loadTexts$1$34(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getSuccessSubTitle(), new AppConsentTheme$Companion$loadTexts$1$35(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getSuccessText(), new AppConsentTheme$Companion$loadTexts$1$36(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
            ExtensionKt.notNullOrEmpty(remoteTheme.getButtonContinueWithoutAccepting(), new AppConsentTheme$Companion$loadTexts$1$37(appConsentTheme, language$appconsent_ui_v3_prodXchangeRelease));
        }

        private final String toColorWith6Digits(String str) {
            if (!isColorWith3Digits(str)) {
                throw new IllegalArgumentException("Color must be 3 digits color");
            }
            StringBuilder sb2 = new StringBuilder("#");
            e0.checkNotNull(str);
            sb2.append(str.charAt(1));
            sb2.append(str.charAt(1));
            sb2.append(str.charAt(2));
            sb2.append(str.charAt(2));
            sb2.append(str.charAt(3));
            sb2.append(str.charAt(3));
            return sb2.toString();
        }

        public final void loadConfigurations$appconsent_ui_v3_prodXchangeRelease(RemoteTheme remoteTheme, AppConsentTheme instance) {
            e0.checkNotNullParameter(remoteTheme, "remoteTheme");
            e0.checkNotNullParameter(instance, "instance");
            Boolean highlightAcceptAllButton = remoteTheme.getHighlightAcceptAllButton();
            instance.highlightAcceptAllButton = highlightAcceptAllButton != null ? highlightAcceptAllButton.booleanValue() : false;
            Boolean displayConfigCloseHeader = remoteTheme.getDisplayConfigCloseHeader();
            instance.displayConfigCloseHeader = displayConfigCloseHeader != null ? displayConfigCloseHeader.booleanValue() : true;
            Boolean useSuccessScreen = remoteTheme.getUseSuccessScreen();
            instance.setDisplaySuccessScreen$appconsent_ui_v3_prodXchangeRelease(useSuccessScreen != null ? useSuccessScreen.booleanValue() : true);
            Boolean tabletModalScreen = remoteTheme.getTabletModalScreen();
            instance.tabletModalScreen = tabletModalScreen != null ? tabletModalScreen.booleanValue() : false;
            instance.bannerActions = remoteTheme.getBannerActions();
            Boolean continueWithoutAccepting = remoteTheme.getContinueWithoutAccepting();
            instance.continueWithoutAccepting = continueWithoutAccepting != null ? continueWithoutAccepting.booleanValue() : false;
            Boolean enableIllustrations = remoteTheme.getEnableIllustrations();
            instance.enableIllustrations = enableIllustrations != null ? enableIllustrations.booleanValue() : false;
            instance.setNeedToDisplayUsageExampleOnLayer1$appconsent_ui_v3_prodXchangeRelease(remoteTheme.isNeedToDisplayUsageExampleOnLayer1());
        }

        public final void loadFromRemote$appconsent_ui_v3_prodXchangeRelease(Context context, RemoteTheme remoteTheme) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(remoteTheme, "remoteTheme");
            o oVarLazy = q.lazy(AppConsentTheme$Companion$loadFromRemote$appConsentTheme$2.INSTANCE);
            initLocalize(context, loadFromRemote$lambda$0(oVarLazy), remoteTheme);
            loadColors(remoteTheme, loadFromRemote$lambda$0(oVarLazy));
            loadDrawables(remoteTheme, loadFromRemote$lambda$0(oVarLazy));
            loadTexts(remoteTheme, loadFromRemote$lambda$0(oVarLazy));
            loadConfigurations$appconsent_ui_v3_prodXchangeRelease(remoteTheme, loadFromRemote$lambda$0(oVarLazy));
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppConsentTheme(Builder builder, u uVar) {
        this(builder);
    }

    private final Locale getDeviceLocale() {
        Locale locale = Locale.getDefault();
        e0.checkNotNullExpressionValue(locale, "getDefault()");
        return locale;
    }

    private final String getLocaleLanguageAsLowercase() {
        String language = getDeviceLocale().getLanguage();
        e0.checkNotNullExpressionValue(language, "getDeviceLocale().language");
        String lowerCase = language.toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDefaultString(Context context) {
        String string = context.getString(R.string.appconsent_consentable_list_bar_title);
        e0.checkNotNullExpressionValue(string, "aContext.getString(R.str…nsentable_list_bar_title)");
        this.noticeActionBarTitle = string;
        String string2 = context.getString(R.string.appconsent_consentable_list_label_purpose);
        e0.checkNotNullExpressionValue(string2, "aContext.getString(R.str…table_list_label_purpose)");
        this.noticeLabelDataCollectionText = string2;
        String string3 = context.getString(R.string.appconsent_consentable_list_label_extra);
        e0.checkNotNullExpressionValue(string3, "aContext.getString(R.str…entable_list_label_extra)");
        this.noticeLabelExtraUsageText = string3;
        String string4 = context.getString(R.string.appconsent_consentable_list_label_feature);
        e0.checkNotNullExpressionValue(string4, "aContext.getString(R.str…table_list_label_feature)");
        this.noticeLabelOtherUsageText = string4;
        String string5 = context.getString(R.string.appconsent_introduction_description);
        e0.checkNotNullExpressionValue(string5, "aContext.getString(R.str…introduction_description)");
        this.noticeInformationListTitleText = string5;
        String string6 = context.getString(R.string.appconsent_mandatory_feature_header);
        e0.checkNotNullExpressionValue(string6, "aContext.getString(R.str…mandatory_feature_header)");
        this.noticeMandatoryFeatureDesc = string6;
        String string7 = context.getString(R.string.appconsent_mandatory_feature_bar_title);
        e0.checkNotNullExpressionValue(string7, "aContext.getString(R.str…datory_feature_bar_title)");
        this.noticeMandatoryFeatureTitle = string7;
        String string8 = context.getString(R.string.appconsent_mandatory_purpose_header);
        e0.checkNotNullExpressionValue(string8, "aContext.getString(R.str…mandatory_purpose_header)");
        this.noticeMandatoryPurposeDesc = string8;
        String string9 = context.getString(R.string.appconsent_mandatory_purpose_bar_title);
        e0.checkNotNullExpressionValue(string9, "aContext.getString(R.str…datory_purpose_bar_title)");
        this.noticeMandatoryPurposeTitle = string9;
        String string10 = context.getString(R.string.appconsent_consentable_details_label_1);
        e0.checkNotNullExpressionValue(string10, "aContext.getString(R.str…sentable_details_label_1)");
        this.noticeConsentableDetailLabel1 = string10;
        String string11 = context.getString(R.string.appconsent_consentable_details_label_3);
        e0.checkNotNullExpressionValue(string11, "aContext.getString(R.str…sentable_details_label_3)");
        this.mandatorySectionVendors = string11;
        String string12 = context.getString(R.string.appconsent_introduction_description);
        e0.checkNotNullExpressionValue(string12, "aContext.getString(R.str…introduction_description)");
        this.introductionText = string12;
        String string13 = context.getString(R.string.appconsent_introduction_title);
        e0.checkNotNullExpressionValue(string13, "aContext.getString(R.str…nsent_introduction_title)");
        this.introductionTitleText = string13;
        this.introductionDetailsText = context.getString(R.string.appconsent_introduction_detail);
        String string14 = context.getString(R.string.appconsent_display_by_vendor_iab_tab);
        e0.checkNotNullExpressionValue(string14, "aContext.getString(R.str…isplay_by_vendor_iab_tab)");
        this.vendorTabIabText = string14;
        String string15 = context.getString(R.string.appconsent_display_by_vendor_other_tab);
        e0.checkNotNullExpressionValue(string15, "aContext.getString(R.str…play_by_vendor_other_tab)");
        this.vendorTabOtherText = string15;
        String string16 = context.getString(R.string.appconsent_vendor_list_global);
        e0.checkNotNullExpressionValue(string16, "aContext.getString(R.str…nsent_vendor_list_global)");
        this.vendorGlobalTitle = string16;
        String string17 = context.getString(R.string.appconsent_vendor_list_legitimate);
        e0.checkNotNullExpressionValue(string17, "aContext.getString(R.str…t_vendor_list_legitimate)");
        this.vendorLegInt = string17;
        String string18 = context.getString(R.string.appconsent_vendor_details_label_1);
        e0.checkNotNullExpressionValue(string18, "aContext.getString(R.str…t_vendor_details_label_1)");
        this.vendorUnderConsent = string18;
        String string19 = context.getString(R.string.appconsent_vendor_details_label_2);
        e0.checkNotNullExpressionValue(string19, "aContext.getString(R.str…t_vendor_details_label_2)");
        this.vendorUnderLegInt = string19;
        String string20 = context.getString(R.string.appconsent_vendor_details_label_3);
        e0.checkNotNullExpressionValue(string20, "aContext.getString(R.str…t_vendor_details_label_3)");
        this.vendorCompulsory = string20;
        String string21 = context.getString(R.string.appconsent_vendor_details_type_purpose);
        e0.checkNotNullExpressionValue(string21, "aContext.getString(R.str…dor_details_type_purpose)");
        this.vendorPurpose = string21;
        String string22 = context.getString(R.string.appconsent_vendor_details_type_feature);
        e0.checkNotNullExpressionValue(string22, "aContext.getString(R.str…dor_details_type_feature)");
        this.vendorFeature = string22;
        String string23 = context.getString(R.string.appconsent_vendors_refine_header);
        e0.checkNotNullExpressionValue(string23, "aContext.getString(R.str…nt_vendors_refine_header)");
        this.vendorsHeader = string23;
        String string24 = context.getString(R.string.appconsent_introduction_configure_button);
        e0.checkNotNullExpressionValue(string24, "aContext.getString(R.str…duction_configure_button)");
        this.buttonConfigureText = string24;
        String string25 = context.getString(R.string.appconsent_accept_all_button);
        e0.checkNotNullExpressionValue(string25, "aContext.getString(R.str…onsent_accept_all_button)");
        this.buttonAcceptAllText = string25;
        String string26 = context.getString(R.string.appconsent_deny_all_button);
        e0.checkNotNullExpressionValue(string26, "aContext.getString(R.str…pconsent_deny_all_button)");
        this.buttonDenyAllText = string26;
        String string27 = context.getString(R.string.appconsent_learn_more_button);
        e0.checkNotNullExpressionValue(string27, "aContext.getString(R.str…onsent_learn_more_button)");
        this.buttonLearnMoreText = string27;
        String string28 = context.getString(R.string.appconsent_configuration_display_all_partners);
        e0.checkNotNullExpressionValue(string28, "aContext.getString(R.str…ion_display_all_partners)");
        this.buttonDisplayAllPartners = string28;
        String string29 = context.getString(R.string.appconsent_application_examples);
        e0.checkNotNullExpressionValue(string29, "aContext.getString(R.str…ent_application_examples)");
        this.buttonSeeMoreLegalText = string29;
        this.buttonSeeMandatoryPurpose = null;
        this.buttonSeeMandatoryFeature = null;
        String string30 = context.getString(R.string.appconsent_save_button);
        e0.checkNotNullExpressionValue(string30, "aContext.getString(R.str…g.appconsent_save_button)");
        this.buttonSaveText = string30;
        String string31 = context.getString(R.string.appconsent_success_button_close);
        e0.checkNotNullExpressionValue(string31, "aContext.getString(R.str…ent_success_button_close)");
        this.buttonClose = string31;
        String string32 = context.getString(R.string.appconsent_consentable_list_refine_vendor);
        e0.checkNotNullExpressionValue(string32, "aContext.getString(R.str…table_list_refine_vendor)");
        this.buttonRefineByPartner = string32;
        String string33 = context.getString(R.string.appconsent_consentable_details_privacy);
        e0.checkNotNullExpressionValue(string33, "aContext.getString(R.str…sentable_details_privacy)");
        this.vendorPolicy = string33;
        String string34 = context.getString(R.string.appconsent_consentable_details_privacy);
        e0.checkNotNullExpressionValue(string34, "aContext.getString(R.str…sentable_details_privacy)");
        this.consentablePolicy = string34;
        String string35 = context.getString(R.string.appconsent_vendor_details_object);
        e0.checkNotNullExpressionValue(string35, "aContext.getString(R.str…nt_vendor_details_object)");
        this.buttonOpposeLegint = string35;
        String string36 = context.getString(R.string.appconsent_continue_without_accepting_button);
        e0.checkNotNullExpressionValue(string36, "aContext.getString(R.str…without_accepting_button)");
        this.buttonContinueWithoutAcceptingText = string36;
        String string37 = context.getString(R.string.appconsent_success_title);
        e0.checkNotNullExpressionValue(string37, "aContext.getString(R.str…appconsent_success_title)");
        this.finishTitleText = string37;
        String string38 = context.getString(R.string.appconsent_success_subtitle);
        e0.checkNotNullExpressionValue(string38, "aContext.getString(R.str…consent_success_subtitle)");
        this.finishSubtitleText = string38;
        String string39 = context.getString(R.string.appconsent_success_text);
        e0.checkNotNullExpressionValue(string39, "aContext.getString(R.str….appconsent_success_text)");
        this.finishDescriptionText = string39;
    }

    public final int getAcceptAllButtonBackground$appconsent_ui_v3_prodXchangeRelease() {
        return this.acceptAllButtonBackground;
    }

    public final int getAcceptAllButtonBorder$appconsent_ui_v3_prodXchangeRelease() {
        return this.acceptAllButtonBorder;
    }

    public final int getAcceptAllButtonText$appconsent_ui_v3_prodXchangeRelease() {
        return this.acceptAllButtonText;
    }

    public final int getActionBarColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.actionBarColor;
    }

    public final int getActionBarTextColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.actionBarTextColor;
    }

    public final int getBannerActions$appconsent_ui_v3_prodXchangeRelease() {
        return this.bannerActions;
    }

    public final int getBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.bannerBackgroundColor;
    }

    public final String getButtonAcceptAllText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonAcceptAllText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonAcceptAllText");
        return null;
    }

    public final int getButtonBackgroundColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.buttonBackgroundColor;
    }

    public final int getButtonBorderColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.buttonBorderColor;
    }

    public final String getButtonClose$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonClose;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonClose");
        return null;
    }

    public final String getButtonConfigureText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonConfigureText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonConfigureText");
        return null;
    }

    public final String getButtonContinueWithoutAcceptingText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonContinueWithoutAcceptingText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonContinueWithoutAcceptingText");
        return null;
    }

    public final String getButtonDenyAllText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonDenyAllText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonDenyAllText");
        return null;
    }

    public final String getButtonDisplayAllPartners$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonDisplayAllPartners;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonDisplayAllPartners");
        return null;
    }

    public final String getButtonLearnMoreText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonLearnMoreText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonLearnMoreText");
        return null;
    }

    public final String getButtonOpposeLegint$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonOpposeLegint;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonOpposeLegint");
        return null;
    }

    public final String getButtonRefineByPartner$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonRefineByPartner;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonRefineByPartner");
        return null;
    }

    public final String getButtonSaveText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonSaveText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonSaveText");
        return null;
    }

    public final String getButtonSeeMandatoryFeature$appconsent_ui_v3_prodXchangeRelease() {
        return this.buttonSeeMandatoryFeature;
    }

    public final String getButtonSeeMandatoryPurpose$appconsent_ui_v3_prodXchangeRelease() {
        return this.buttonSeeMandatoryPurpose;
    }

    public final String getButtonSeeMoreLegalText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.buttonSeeMoreLegalText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("buttonSeeMoreLegalText");
        return null;
    }

    public final int getButtonTextColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.buttonTextColor;
    }

    public final String getConsentablePolicy$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.consentablePolicy;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("consentablePolicy");
        return null;
    }

    public final Context getContextLocalized$appconsent_ui_v3_prodXchangeRelease() {
        Context context = this._contextLocalized;
        return context == null ? this.builder.getContext$appconsent_ui_v3_prodXchangeRelease() : context;
    }

    public final boolean getContinueWithoutAccepting$appconsent_ui_v3_prodXchangeRelease() {
        return this.continueWithoutAccepting;
    }

    public final int getCopyrightColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.copyrightColor;
    }

    public final boolean getDisplayConfigCloseHeader$appconsent_ui_v3_prodXchangeRelease() {
        return this.displayConfigCloseHeader;
    }

    public final boolean getDisplaySuccessScreen$appconsent_ui_v3_prodXchangeRelease() {
        return this.displaySuccessScreen;
    }

    public final boolean getEnableIllustrations$appconsent_ui_v3_prodXchangeRelease() {
        return this.enableIllustrations;
    }

    public final String getFallbackLanguageAsLowercase$appconsent_ui_v3_prodXchangeRelease() {
        return this.fallbackLanguageAsLowercase;
    }

    public final String getFinishDescriptionText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.finishDescriptionText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("finishDescriptionText");
        return null;
    }

    public final String getFinishSubtitleText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.finishSubtitleText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("finishSubtitleText");
        return null;
    }

    public final String getFinishTitleText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.finishTitleText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("finishTitleText");
        return null;
    }

    public final String getGeoAdvertisingIconUrl$appconsent_ui_v3_prodXchangeRelease() {
        return this.geoAdvertisingIconUrl;
    }

    public final int getGeoNoticeBannerBackgroundColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.geoNoticeBannerBackgroundColor;
    }

    public final boolean getHighlightAcceptAllButton$appconsent_ui_v3_prodXchangeRelease() {
        return this.highlightAcceptAllButton;
    }

    public final String getIllustrationFooterImageUrl$appconsent_ui_v3_prodXchangeRelease() {
        return this.illustrationFooterImageUrl;
    }

    public final String getIllustrationHeaderImageUrl$appconsent_ui_v3_prodXchangeRelease() {
        return this.illustrationHeaderImageUrl;
    }

    public final String getIllustrationSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease() {
        return this.illustrationSuccessImageUrl;
    }

    public final String getIntroductionDetailsText$appconsent_ui_v3_prodXchangeRelease() {
        return this.introductionDetailsText;
    }

    public final String getIntroductionText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.introductionText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("introductionText");
        return null;
    }

    public final String getIntroductionTitleText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.introductionTitleText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("introductionTitleText");
        return null;
    }

    public final String getLanguage$appconsent_ui_v3_prodXchangeRelease() {
        String localeLanguageAsLowercase = getLocaleLanguageAsLowercase();
        if (!this.languagesAsLowercase.contains(localeLanguageAsLowercase)) {
            localeLanguageAsLowercase = this.fallbackLanguageAsLowercase.length() > 0 ? this.fallbackLanguageAsLowercase : Locale.ENGLISH.getLanguage();
        }
        e0.checkNotNull(localeLanguageAsLowercase);
        return localeLanguageAsLowercase;
    }

    public final List<String> getLanguagesAsLowercase$appconsent_ui_v3_prodXchangeRelease() {
        return this.languagesAsLowercase;
    }

    public final String getMandatorySectionVendors$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.mandatorySectionVendors;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("mandatorySectionVendors");
        return null;
    }

    public final String getNoticeActionBarTitle$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeActionBarTitle;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeActionBarTitle");
        return null;
    }

    public final String getNoticeConsentableDetailLabel1$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeConsentableDetailLabel1;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeConsentableDetailLabel1");
        return null;
    }

    public final String getNoticeInformationListTitleText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeInformationListTitleText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeInformationListTitleText");
        return null;
    }

    public final String getNoticeLabelDataCollectionText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeLabelDataCollectionText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeLabelDataCollectionText");
        return null;
    }

    public final String getNoticeLabelExtraUsageText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeLabelExtraUsageText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeLabelExtraUsageText");
        return null;
    }

    public final String getNoticeLabelOtherUsageText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeLabelOtherUsageText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeLabelOtherUsageText");
        return null;
    }

    public final String getNoticeMandatoryFeatureDesc$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeMandatoryFeatureDesc;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeMandatoryFeatureDesc");
        return null;
    }

    public final String getNoticeMandatoryFeatureTitle$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeMandatoryFeatureTitle;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeMandatoryFeatureTitle");
        return null;
    }

    public final String getNoticeMandatoryPurposeDesc$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeMandatoryPurposeDesc;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeMandatoryPurposeDesc");
        return null;
    }

    public final String getNoticeMandatoryPurposeTitle$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.noticeMandatoryPurposeTitle;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("noticeMandatoryPurposeTitle");
        return null;
    }

    public final Drawable getNoticeSuccessImage$appconsent_ui_v3_prodXchangeRelease() {
        return this.noticeSuccessImage;
    }

    public final String getNoticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease() {
        return this.noticeSuccessImageUrl;
    }

    public final String getOnboardingImageUrl$appconsent_ui_v3_prodXchangeRelease() {
        return this.onboardingImageUrl;
    }

    public final int getRefuseAllButtonBackground$appconsent_ui_v3_prodXchangeRelease() {
        return this.refuseAllButtonBackground;
    }

    public final int getRefuseAllButtonBorder$appconsent_ui_v3_prodXchangeRelease() {
        return this.refuseAllButtonBorder;
    }

    public final int getRefuseAllButtonText$appconsent_ui_v3_prodXchangeRelease() {
        return this.refuseAllButtonText;
    }

    public final int getSeparatorColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.separatorColor;
    }

    public final int getSetupButtonBackground$appconsent_ui_v3_prodXchangeRelease() {
        return this.setupButtonBackground;
    }

    public final int getSetupButtonBorder$appconsent_ui_v3_prodXchangeRelease() {
        return this.setupButtonBorder;
    }

    public final int getSetupButtonText$appconsent_ui_v3_prodXchangeRelease() {
        return this.setupButtonText;
    }

    public final int getStatusBarColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.statusBarColor;
    }

    public final int getSwitchOffButtonColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.switchOffButtonColor;
    }

    public final int getSwitchOffColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.switchOffColor;
    }

    public final int getSwitchOnButtonColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.switchOnButtonColor;
    }

    public final int getSwitchOnColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.switchOnColor;
    }

    public final int getSwitchUnsetColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.switchUnsetColor;
    }

    public final boolean getTabletModalScreen$appconsent_ui_v3_prodXchangeRelease() {
        return this.tabletModalScreen;
    }

    public final int getTextColor$appconsent_ui_v3_prodXchangeRelease() {
        return this.textColor;
    }

    public final int getTheme$appconsent_ui_v3_prodXchangeRelease() {
        return this.theme;
    }

    public final String getVendorCompulsory$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorCompulsory;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorCompulsory");
        return null;
    }

    public final String getVendorFeature$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorFeature;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorFeature");
        return null;
    }

    public final String getVendorGlobalTitle$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorGlobalTitle;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorGlobalTitle");
        return null;
    }

    public final String getVendorLegInt$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorLegInt;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorLegInt");
        return null;
    }

    public final String getVendorPolicy$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorPolicy;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorPolicy");
        return null;
    }

    public final String getVendorPurpose$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorPurpose;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorPurpose");
        return null;
    }

    public final String getVendorTabIabText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorTabIabText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorTabIabText");
        return null;
    }

    public final String getVendorTabOtherText$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorTabOtherText;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorTabOtherText");
        return null;
    }

    public final String getVendorUnderConsent$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorUnderConsent;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorUnderConsent");
        return null;
    }

    public final String getVendorUnderLegInt$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorUnderLegInt;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorUnderLegInt");
        return null;
    }

    public final String getVendorsHeader$appconsent_ui_v3_prodXchangeRelease() {
        String str = this.vendorsHeader;
        if (str != null) {
            return str;
        }
        e0.throwUninitializedPropertyAccessException("vendorsHeader");
        return null;
    }

    public final boolean isNeedToDisplayUsageExampleOnLayer1$appconsent_ui_v3_prodXchangeRelease() {
        return this.isNeedToDisplayUsageExampleOnLayer1;
    }

    public final void setDisplaySuccessScreen$appconsent_ui_v3_prodXchangeRelease(boolean z10) {
        this.displaySuccessScreen = z10;
    }

    public final void setFallbackLanguageAsLowercase$appconsent_ui_v3_prodXchangeRelease(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.fallbackLanguageAsLowercase = str;
    }

    public final void setIllustrationFooterImageUrl$appconsent_ui_v3_prodXchangeRelease(String str) {
        this.illustrationFooterImageUrl = str;
    }

    public final void setIllustrationHeaderImageUrl$appconsent_ui_v3_prodXchangeRelease(String str) {
        this.illustrationHeaderImageUrl = str;
    }

    public final void setIllustrationSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease(String str) {
        this.illustrationSuccessImageUrl = str;
    }

    public final void setLanguagesAsLowercase$appconsent_ui_v3_prodXchangeRelease(List<String> list) {
        e0.checkNotNullParameter(list, "<set-?>");
        this.languagesAsLowercase = list;
    }

    public final void setNeedToDisplayUsageExampleOnLayer1$appconsent_ui_v3_prodXchangeRelease(boolean z10) {
        this.isNeedToDisplayUsageExampleOnLayer1 = z10;
    }

    private AppConsentTheme(Builder builder) {
        Drawable noticeSuccessImage$appconsent_ui_v3_prodXchangeRelease;
        this.builder = builder;
        String language = Locale.ENGLISH.getLanguage();
        e0.checkNotNullExpressionValue(language, "ENGLISH.language");
        String lowerCase = language.toLowerCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        this.fallbackLanguageAsLowercase = lowerCase;
        this.languagesAsLowercase = o0.listOf(lowerCase);
        this.isNeedToDisplayUsageExampleOnLayer1 = true;
        this.geoAdvertisingIconUrl = "";
        this.displayConfigCloseHeader = true;
        this.continueWithoutAccepting = true;
        Context context$appconsent_ui_v3_prodXchangeRelease = builder.getContext$appconsent_ui_v3_prodXchangeRelease();
        Companion companion = Companion;
        String language2 = Locale.getDefault().getLanguage();
        e0.checkNotNullExpressionValue(language2, "getDefault().language");
        companion.loadNewContext(context$appconsent_ui_v3_prodXchangeRelease, language2, this);
        this.theme = builder.getTheme$appconsent_ui_v3_prodXchangeRelease() != 0 ? builder.getTheme$appconsent_ui_v3_prodXchangeRelease() : R.style.AppConsentV3Theme;
        this.actionBarColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_white);
        this.textColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_dark_blue);
        this.copyrightColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_copyright);
        this.bannerBackgroundColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_white);
        this.separatorColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_light_grey);
        this.buttonTextColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_white);
        this.buttonBorderColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_blue);
        this.buttonBackgroundColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_blue);
        this.geoNoticeBannerBackgroundColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_white);
        this.switchUnsetColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_light_grey);
        this.switchOnColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_switch_on);
        this.switchOnButtonColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_white);
        this.switchOffColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_switch_off);
        this.switchOffButtonColor = a.getColor(context$appconsent_ui_v3_prodXchangeRelease, R.color.appconsent_v3_white);
        int i10 = this.buttonBackgroundColor;
        this.acceptAllButtonBackground = i10;
        int i11 = this.buttonBorderColor;
        this.acceptAllButtonBorder = i11;
        int i12 = this.buttonTextColor;
        this.acceptAllButtonText = i12;
        this.refuseAllButtonBackground = i10;
        this.refuseAllButtonBorder = i11;
        this.refuseAllButtonText = i12;
        this.setupButtonBackground = i10;
        this.setupButtonBorder = i11;
        this.setupButtonText = i12;
        try {
            noticeSuccessImage$appconsent_ui_v3_prodXchangeRelease = builder.getNoticeSuccessImage$appconsent_ui_v3_prodXchangeRelease();
            if (noticeSuccessImage$appconsent_ui_v3_prodXchangeRelease == null) {
                noticeSuccessImage$appconsent_ui_v3_prodXchangeRelease = l.a.getDrawable(context$appconsent_ui_v3_prodXchangeRelease, R.drawable.appconsent_v3_ic_finish_success);
            }
        } catch (Throwable unused) {
            noticeSuccessImage$appconsent_ui_v3_prodXchangeRelease = null;
        }
        this.noticeSuccessImage = noticeSuccessImage$appconsent_ui_v3_prodXchangeRelease;
        loadDefaultString(context$appconsent_ui_v3_prodXchangeRelease);
        this.onboardingImageUrl = this.builder.getOnboardingImageUrl$appconsent_ui_v3_prodXchangeRelease();
        String noticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease = this.builder.getNoticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease();
        this.noticeSuccessImageUrl = noticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease != null ? noticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease : "";
        this.illustrationFooterImageUrl = null;
        this.illustrationHeaderImageUrl = null;
        this.illustrationSuccessImageUrl = null;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private final Context context;
        private Drawable noticeSuccessImage;
        private String noticeSuccessImageUrl;
        private String onboardingImageUrl;
        private int theme;

        public Builder(Context context) {
            e0.checkNotNullParameter(context, "context");
            this.context = context;
            this.theme = R.style.AppConsentV3Theme;
        }

        public final AppConsentTheme build() {
            return new AppConsentTheme(this, null);
        }

        public final Context getContext$appconsent_ui_v3_prodXchangeRelease() {
            return this.context;
        }

        public final Drawable getNoticeSuccessImage$appconsent_ui_v3_prodXchangeRelease() {
            return this.noticeSuccessImage;
        }

        public final String getNoticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease() {
            return this.noticeSuccessImageUrl;
        }

        public final String getOnboardingImageUrl$appconsent_ui_v3_prodXchangeRelease() {
            return this.onboardingImageUrl;
        }

        public final int getTheme$appconsent_ui_v3_prodXchangeRelease() {
            return this.theme;
        }

        @f
        public final Builder iconUrl(String iconUrl) {
            e0.checkNotNullParameter(iconUrl, "iconUrl");
            return this;
        }

        public final Builder noticeSuccessImage(Drawable drawable) {
            this.noticeSuccessImage = drawable;
            return this;
        }

        public final Builder noticeSuccessImageUrl(String noticeSuccessImageUrl) {
            e0.checkNotNullParameter(noticeSuccessImageUrl, "noticeSuccessImageUrl");
            this.noticeSuccessImageUrl = noticeSuccessImageUrl;
            return this;
        }

        public final Builder onboardingImageUrl(String onboardingImageUrl) {
            e0.checkNotNullParameter(onboardingImageUrl, "onboardingImageUrl");
            this.onboardingImageUrl = onboardingImageUrl;
            return this;
        }

        public final void setNoticeSuccessImage$appconsent_ui_v3_prodXchangeRelease(Drawable drawable) {
            this.noticeSuccessImage = drawable;
        }

        public final void setNoticeSuccessImageUrl$appconsent_ui_v3_prodXchangeRelease(String str) {
            this.noticeSuccessImageUrl = str;
        }

        public final void setOnboardingImageUrl$appconsent_ui_v3_prodXchangeRelease(String str) {
            this.onboardingImageUrl = str;
        }

        public final void setTheme$appconsent_ui_v3_prodXchangeRelease(int i10) {
            this.theme = i10;
        }

        public final Builder theme(int i10) {
            this.theme = i10;
            return this;
        }

        @f
        public final Builder iconDrawable(Drawable drawable) {
            return this;
        }

        @f
        public final Builder onboardingImage(Drawable drawable) {
            return this;
        }
    }
}
