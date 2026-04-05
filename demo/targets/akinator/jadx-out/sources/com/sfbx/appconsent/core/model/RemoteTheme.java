package com.sfbx.appconsent.core.model;

import a.b;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import e3.g;
import j1.o2;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import tu.f;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Serializable
/* loaded from: classes8.dex */
public final class RemoteTheme {
    public static final Companion Companion = new Companion(null);
    private final String acceptAllButtonBackground;
    private final String acceptAllButtonBorder;
    private final String acceptAllButtonText;
    private final String actionBarColor;
    private final String actionBarTextColor;
    private final int bannerActions;
    private final String bannerBackgroundColor;
    private final List<TranslatableText> buttonAcceptAll;
    private final String buttonBackgroundColor;
    private final String buttonBorderColor;
    private final List<TranslatableText> buttonClose;
    private final List<TranslatableText> buttonConfigure;
    private final List<TranslatableText> buttonContinueWithoutAccepting;
    private final List<TranslatableText> buttonDenyAll;
    private final List<TranslatableText> buttonKnowMore;
    private final List<TranslatableText> buttonOpposeLegint;
    private final List<TranslatableText> buttonRefineByPartner;
    private final List<TranslatableText> buttonSave;
    private final List<TranslatableText> buttonSeeMandatoryFeature;
    private final List<TranslatableText> buttonSeeMandatoryPurpose;
    private final List<TranslatableText> buttonSeeMore;
    private final String buttonSelectedColor;
    private final String buttonTextColor;
    private final List<TranslatableText> consentablePolicy;
    private final Boolean continueWithoutAccepting;
    private final String copyrightColor;
    private final Boolean displayConfigCloseHeader;
    private final Boolean enableIllustrations;
    private final String fallbackLanguage;
    private final String geoAdvertisingIcon;
    private final String geoNoticeBannerBackgroundColor;
    private final Boolean highlightAcceptAllButton;
    private final String icon;
    private final String illustrationFooterImage;
    private final String illustrationHeaderImage;
    private final String illustrationSuccessImage;
    private final List<TranslatableText> introductionDetailsText;
    private final List<TranslatableText> introductionText;
    private final List<TranslatableText> introductionTitle;
    private final boolean isNeedToDisplayUsageExampleOnLayer1;
    private final List<String> languages;
    private final List<TranslatableText> mandatorySectionVendors;
    private final List<TranslatableText> noticeConsentableDetailLabel1;
    private final List<TranslatableText> noticeFeatureTitle;
    private final List<TranslatableText> noticeMandatoryFeatureDesc;
    private final List<TranslatableText> noticeMandatoryFeatureTitle;
    private final List<TranslatableText> noticeMandatoryPurposeDesc;
    private final List<TranslatableText> noticeMandatoryPurposeTitle;
    private final List<TranslatableText> noticeSubTitle;
    private final String noticeSuccessImage;
    private final List<TranslatableText> noticeTitle;
    private final String onboardingImage;
    private final String refuseAllButtonBackground;
    private final String refuseAllButtonBorder;
    private final String refuseAllButtonText;
    private final String separatorColor;
    private final String setupButtonBackground;
    private final String setupButtonBorder;
    private final String setupButtonText;
    private final String statusBarColor;
    private final List<TranslatableText> successSubTitle;
    private final List<TranslatableText> successText;
    private final List<TranslatableText> successTitle;
    private final String switchOffButtonColor;
    private final String switchOffColor;
    private final String switchOnButtonColor;
    private final String switchOnColor;
    private final String switchUnsetColor;
    private final Boolean tabletModalScreen;
    private final String textColor;
    private final String textColorDark;
    private final Boolean useSuccessScreen;
    private final String vendorBackgroundColorDark;
    private final List<TranslatableText> vendorCompulsory;
    private final List<TranslatableText> vendorFeature;
    private final List<TranslatableText> vendorLegInt;
    private final List<TranslatableText> vendorPolicy;
    private final List<TranslatableText> vendorPurpose;
    private final String vendorSeparatorColor;
    private final List<TranslatableText> vendorSubjectToConsent;
    private final List<TranslatableText> vendorTabIab;
    private final List<TranslatableText> vendorTabOther;
    private final List<TranslatableText> vendorUnderConsent;
    private final List<TranslatableText> vendorUnderLegInt;
    private final List<TranslatableText> vendorsHeader;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final KSerializer<RemoteTheme> serializer() {
            return RemoteTheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RemoteTheme() {
        this((String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 0, (Boolean) null, (Boolean) null, false, -1, -1, 2097151, (u) null);
    }

    public static /* synthetic */ RemoteTheme copy$default(RemoteTheme remoteTheme, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, List list31, List list32, List list33, List list34, List list35, List list36, List list37, List list38, List list39, List list40, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Boolean bool5, Boolean bool6, boolean z10, int i11, int i12, int i13, Object obj) {
        String str38 = (i11 & 1) != 0 ? remoteTheme.fallbackLanguage : str;
        return remoteTheme.copy(str38, (i11 & 2) != 0 ? remoteTheme.languages : list, (i11 & 4) != 0 ? remoteTheme.textColor : str2, (i11 & 8) != 0 ? remoteTheme.bannerBackgroundColor : str3, (i11 & 16) != 0 ? remoteTheme.separatorColor : str4, (i11 & 32) != 0 ? remoteTheme.buttonTextColor : str5, (i11 & 64) != 0 ? remoteTheme.buttonBorderColor : str6, (i11 & 128) != 0 ? remoteTheme.buttonBackgroundColor : str7, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? remoteTheme.statusBarColor : str8, (i11 & 512) != 0 ? remoteTheme.actionBarColor : str9, (i11 & 1024) != 0 ? remoteTheme.actionBarTextColor : str10, (i11 & 2048) != 0 ? remoteTheme.copyrightColor : str11, (i11 & 4096) != 0 ? remoteTheme.geoNoticeBannerBackgroundColor : str12, (i11 & Segment.SIZE) != 0 ? remoteTheme.switchUnsetColor : str13, (i11 & 16384) != 0 ? remoteTheme.switchOnColor : str14, (i11 & 32768) != 0 ? remoteTheme.switchOnButtonColor : str15, (i11 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteTheme.switchOffColor : str16, (i11 & 131072) != 0 ? remoteTheme.switchOffButtonColor : str17, (i11 & 262144) != 0 ? remoteTheme.textColorDark : str18, (i11 & 524288) != 0 ? remoteTheme.buttonSelectedColor : str19, (i11 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? remoteTheme.vendorBackgroundColorDark : str20, (i11 & 2097152) != 0 ? remoteTheme.vendorSeparatorColor : str21, (i11 & 4194304) != 0 ? remoteTheme.acceptAllButtonBackground : str22, (i11 & 8388608) != 0 ? remoteTheme.acceptAllButtonBorder : str23, (i11 & 16777216) != 0 ? remoteTheme.acceptAllButtonText : str24, (i11 & 33554432) != 0 ? remoteTheme.refuseAllButtonBackground : str25, (i11 & 67108864) != 0 ? remoteTheme.refuseAllButtonBorder : str26, (i11 & 134217728) != 0 ? remoteTheme.refuseAllButtonText : str27, (i11 & 268435456) != 0 ? remoteTheme.setupButtonBackground : str28, (i11 & 536870912) != 0 ? remoteTheme.setupButtonBorder : str29, (i11 & 1073741824) != 0 ? remoteTheme.setupButtonText : str30, (i11 & Integer.MIN_VALUE) != 0 ? remoteTheme.onboardingImage : str31, (i12 & 1) != 0 ? remoteTheme.noticeSuccessImage : str32, (i12 & 2) != 0 ? remoteTheme.geoAdvertisingIcon : str33, (i12 & 4) != 0 ? remoteTheme.illustrationFooterImage : str34, (i12 & 8) != 0 ? remoteTheme.illustrationHeaderImage : str35, (i12 & 16) != 0 ? remoteTheme.illustrationSuccessImage : str36, (i12 & 32) != 0 ? remoteTheme.icon : str37, (i12 & 64) != 0 ? remoteTheme.introductionTitle : list2, (i12 & 128) != 0 ? remoteTheme.introductionText : list3, (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? remoteTheme.introductionDetailsText : list4, (i12 & 512) != 0 ? remoteTheme.buttonConfigure : list5, (i12 & 1024) != 0 ? remoteTheme.buttonAcceptAll : list6, (i12 & 2048) != 0 ? remoteTheme.buttonDenyAll : list7, (i12 & 4096) != 0 ? remoteTheme.buttonSeeMandatoryFeature : list8, (i12 & Segment.SIZE) != 0 ? remoteTheme.buttonSave : list9, (i12 & 16384) != 0 ? remoteTheme.buttonRefineByPartner : list10, (i12 & 32768) != 0 ? remoteTheme.buttonClose : list11, (i12 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteTheme.buttonKnowMore : list12, (i12 & 131072) != 0 ? remoteTheme.buttonContinueWithoutAccepting : list13, (i12 & 262144) != 0 ? remoteTheme.buttonSeeMandatoryPurpose : list14, (i12 & 524288) != 0 ? remoteTheme.buttonOpposeLegint : list15, (i12 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? remoteTheme.buttonSeeMore : list16, (i12 & 2097152) != 0 ? remoteTheme.noticeSubTitle : list17, (i12 & 4194304) != 0 ? remoteTheme.noticeFeatureTitle : list18, (i12 & 8388608) != 0 ? remoteTheme.vendorPolicy : list19, (i12 & 16777216) != 0 ? remoteTheme.vendorLegInt : list20, (i12 & 33554432) != 0 ? remoteTheme.noticeTitle : list21, (i12 & 67108864) != 0 ? remoteTheme.noticeMandatoryPurposeTitle : list22, (i12 & 134217728) != 0 ? remoteTheme.noticeMandatoryPurposeDesc : list23, (i12 & 268435456) != 0 ? remoteTheme.noticeMandatoryFeatureTitle : list24, (i12 & 536870912) != 0 ? remoteTheme.noticeMandatoryFeatureDesc : list25, (i12 & 1073741824) != 0 ? remoteTheme.noticeConsentableDetailLabel1 : list26, (i12 & Integer.MIN_VALUE) != 0 ? remoteTheme.mandatorySectionVendors : list27, (i13 & 1) != 0 ? remoteTheme.consentablePolicy : list28, (i13 & 2) != 0 ? remoteTheme.vendorTabIab : list29, (i13 & 4) != 0 ? remoteTheme.vendorTabOther : list30, (i13 & 8) != 0 ? remoteTheme.vendorUnderConsent : list31, (i13 & 16) != 0 ? remoteTheme.vendorUnderLegInt : list32, (i13 & 32) != 0 ? remoteTheme.vendorCompulsory : list33, (i13 & 64) != 0 ? remoteTheme.vendorPurpose : list34, (i13 & 128) != 0 ? remoteTheme.vendorFeature : list35, (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? remoteTheme.vendorsHeader : list36, (i13 & 512) != 0 ? remoteTheme.vendorSubjectToConsent : list37, (i13 & 1024) != 0 ? remoteTheme.successTitle : list38, (i13 & 2048) != 0 ? remoteTheme.successSubTitle : list39, (i13 & 4096) != 0 ? remoteTheme.successText : list40, (i13 & Segment.SIZE) != 0 ? remoteTheme.highlightAcceptAllButton : bool, (i13 & 16384) != 0 ? remoteTheme.displayConfigCloseHeader : bool2, (i13 & 32768) != 0 ? remoteTheme.useSuccessScreen : bool3, (i13 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? remoteTheme.tabletModalScreen : bool4, (i13 & 131072) != 0 ? remoteTheme.bannerActions : i10, (i13 & 262144) != 0 ? remoteTheme.continueWithoutAccepting : bool5, (i13 & 524288) != 0 ? remoteTheme.enableIllustrations : bool6, (i13 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? remoteTheme.isNeedToDisplayUsageExampleOnLayer1 : z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self(com.sfbx.appconsent.core.model.RemoteTheme r4, kotlinx.serialization.encoding.CompositeEncoder r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            Method dump skipped, instructions count: 2064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sfbx.appconsent.core.model.RemoteTheme.write$Self(com.sfbx.appconsent.core.model.RemoteTheme, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final String component1() {
        return this.fallbackLanguage;
    }

    public final String component10() {
        return this.actionBarColor;
    }

    public final String component11() {
        return this.actionBarTextColor;
    }

    public final String component12() {
        return this.copyrightColor;
    }

    public final String component13() {
        return this.geoNoticeBannerBackgroundColor;
    }

    public final String component14() {
        return this.switchUnsetColor;
    }

    public final String component15() {
        return this.switchOnColor;
    }

    public final String component16() {
        return this.switchOnButtonColor;
    }

    public final String component17() {
        return this.switchOffColor;
    }

    public final String component18() {
        return this.switchOffButtonColor;
    }

    public final String component19() {
        return this.textColorDark;
    }

    public final List<String> component2() {
        return this.languages;
    }

    public final String component20() {
        return this.buttonSelectedColor;
    }

    public final String component21() {
        return this.vendorBackgroundColorDark;
    }

    public final String component22() {
        return this.vendorSeparatorColor;
    }

    public final String component23() {
        return this.acceptAllButtonBackground;
    }

    public final String component24() {
        return this.acceptAllButtonBorder;
    }

    public final String component25() {
        return this.acceptAllButtonText;
    }

    public final String component26() {
        return this.refuseAllButtonBackground;
    }

    public final String component27() {
        return this.refuseAllButtonBorder;
    }

    public final String component28() {
        return this.refuseAllButtonText;
    }

    public final String component29() {
        return this.setupButtonBackground;
    }

    public final String component3() {
        return this.textColor;
    }

    public final String component30() {
        return this.setupButtonBorder;
    }

    public final String component31() {
        return this.setupButtonText;
    }

    public final String component32() {
        return this.onboardingImage;
    }

    public final String component33() {
        return this.noticeSuccessImage;
    }

    public final String component34() {
        return this.geoAdvertisingIcon;
    }

    public final String component35() {
        return this.illustrationFooterImage;
    }

    public final String component36() {
        return this.illustrationHeaderImage;
    }

    public final String component37() {
        return this.illustrationSuccessImage;
    }

    public final String component38() {
        return this.icon;
    }

    public final List<TranslatableText> component39() {
        return this.introductionTitle;
    }

    public final String component4() {
        return this.bannerBackgroundColor;
    }

    public final List<TranslatableText> component40() {
        return this.introductionText;
    }

    public final List<TranslatableText> component41() {
        return this.introductionDetailsText;
    }

    public final List<TranslatableText> component42() {
        return this.buttonConfigure;
    }

    public final List<TranslatableText> component43() {
        return this.buttonAcceptAll;
    }

    public final List<TranslatableText> component44() {
        return this.buttonDenyAll;
    }

    public final List<TranslatableText> component45() {
        return this.buttonSeeMandatoryFeature;
    }

    public final List<TranslatableText> component46() {
        return this.buttonSave;
    }

    public final List<TranslatableText> component47() {
        return this.buttonRefineByPartner;
    }

    public final List<TranslatableText> component48() {
        return this.buttonClose;
    }

    public final List<TranslatableText> component49() {
        return this.buttonKnowMore;
    }

    public final String component5() {
        return this.separatorColor;
    }

    public final List<TranslatableText> component50() {
        return this.buttonContinueWithoutAccepting;
    }

    public final List<TranslatableText> component51() {
        return this.buttonSeeMandatoryPurpose;
    }

    public final List<TranslatableText> component52() {
        return this.buttonOpposeLegint;
    }

    public final List<TranslatableText> component53() {
        return this.buttonSeeMore;
    }

    public final List<TranslatableText> component54() {
        return this.noticeSubTitle;
    }

    public final List<TranslatableText> component55() {
        return this.noticeFeatureTitle;
    }

    public final List<TranslatableText> component56() {
        return this.vendorPolicy;
    }

    public final List<TranslatableText> component57() {
        return this.vendorLegInt;
    }

    public final List<TranslatableText> component58() {
        return this.noticeTitle;
    }

    public final List<TranslatableText> component59() {
        return this.noticeMandatoryPurposeTitle;
    }

    public final String component6() {
        return this.buttonTextColor;
    }

    public final List<TranslatableText> component60() {
        return this.noticeMandatoryPurposeDesc;
    }

    public final List<TranslatableText> component61() {
        return this.noticeMandatoryFeatureTitle;
    }

    public final List<TranslatableText> component62() {
        return this.noticeMandatoryFeatureDesc;
    }

    public final List<TranslatableText> component63() {
        return this.noticeConsentableDetailLabel1;
    }

    public final List<TranslatableText> component64() {
        return this.mandatorySectionVendors;
    }

    public final List<TranslatableText> component65() {
        return this.consentablePolicy;
    }

    public final List<TranslatableText> component66() {
        return this.vendorTabIab;
    }

    public final List<TranslatableText> component67() {
        return this.vendorTabOther;
    }

    public final List<TranslatableText> component68() {
        return this.vendorUnderConsent;
    }

    public final List<TranslatableText> component69() {
        return this.vendorUnderLegInt;
    }

    public final String component7() {
        return this.buttonBorderColor;
    }

    public final List<TranslatableText> component70() {
        return this.vendorCompulsory;
    }

    public final List<TranslatableText> component71() {
        return this.vendorPurpose;
    }

    public final List<TranslatableText> component72() {
        return this.vendorFeature;
    }

    public final List<TranslatableText> component73() {
        return this.vendorsHeader;
    }

    public final List<TranslatableText> component74() {
        return this.vendorSubjectToConsent;
    }

    public final List<TranslatableText> component75() {
        return this.successTitle;
    }

    public final List<TranslatableText> component76() {
        return this.successSubTitle;
    }

    public final List<TranslatableText> component77() {
        return this.successText;
    }

    public final Boolean component78() {
        return this.highlightAcceptAllButton;
    }

    public final Boolean component79() {
        return this.displayConfigCloseHeader;
    }

    public final String component8() {
        return this.buttonBackgroundColor;
    }

    public final Boolean component80() {
        return this.useSuccessScreen;
    }

    public final Boolean component81() {
        return this.tabletModalScreen;
    }

    public final int component82() {
        return this.bannerActions;
    }

    public final Boolean component83() {
        return this.continueWithoutAccepting;
    }

    public final Boolean component84() {
        return this.enableIllustrations;
    }

    public final boolean component85() {
        return this.isNeedToDisplayUsageExampleOnLayer1;
    }

    public final String component9() {
        return this.statusBarColor;
    }

    public final RemoteTheme copy(String fallbackLanguage, List<String> languages, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, List<TranslatableText> list, List<TranslatableText> list2, List<TranslatableText> list3, List<TranslatableText> list4, List<TranslatableText> list5, List<TranslatableText> list6, List<TranslatableText> list7, List<TranslatableText> list8, List<TranslatableText> list9, List<TranslatableText> list10, List<TranslatableText> list11, List<TranslatableText> list12, List<TranslatableText> list13, List<TranslatableText> list14, List<TranslatableText> list15, List<TranslatableText> list16, List<TranslatableText> list17, List<TranslatableText> list18, List<TranslatableText> list19, List<TranslatableText> list20, List<TranslatableText> list21, List<TranslatableText> list22, List<TranslatableText> list23, List<TranslatableText> list24, List<TranslatableText> list25, List<TranslatableText> list26, List<TranslatableText> list27, List<TranslatableText> list28, List<TranslatableText> list29, List<TranslatableText> list30, List<TranslatableText> list31, List<TranslatableText> list32, List<TranslatableText> list33, List<TranslatableText> list34, List<TranslatableText> list35, List<TranslatableText> list36, List<TranslatableText> list37, List<TranslatableText> list38, List<TranslatableText> list39, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Boolean bool5, Boolean bool6, boolean z10) {
        e0.checkNotNullParameter(fallbackLanguage, "fallbackLanguage");
        e0.checkNotNullParameter(languages, "languages");
        return new RemoteTheme(fallbackLanguage, languages, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, list19, list20, list21, list22, list23, list24, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list35, list36, list37, list38, list39, bool, bool2, bool3, bool4, i10, bool5, bool6, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteTheme)) {
            return false;
        }
        RemoteTheme remoteTheme = (RemoteTheme) obj;
        return e0.areEqual(this.fallbackLanguage, remoteTheme.fallbackLanguage) && e0.areEqual(this.languages, remoteTheme.languages) && e0.areEqual(this.textColor, remoteTheme.textColor) && e0.areEqual(this.bannerBackgroundColor, remoteTheme.bannerBackgroundColor) && e0.areEqual(this.separatorColor, remoteTheme.separatorColor) && e0.areEqual(this.buttonTextColor, remoteTheme.buttonTextColor) && e0.areEqual(this.buttonBorderColor, remoteTheme.buttonBorderColor) && e0.areEqual(this.buttonBackgroundColor, remoteTheme.buttonBackgroundColor) && e0.areEqual(this.statusBarColor, remoteTheme.statusBarColor) && e0.areEqual(this.actionBarColor, remoteTheme.actionBarColor) && e0.areEqual(this.actionBarTextColor, remoteTheme.actionBarTextColor) && e0.areEqual(this.copyrightColor, remoteTheme.copyrightColor) && e0.areEqual(this.geoNoticeBannerBackgroundColor, remoteTheme.geoNoticeBannerBackgroundColor) && e0.areEqual(this.switchUnsetColor, remoteTheme.switchUnsetColor) && e0.areEqual(this.switchOnColor, remoteTheme.switchOnColor) && e0.areEqual(this.switchOnButtonColor, remoteTheme.switchOnButtonColor) && e0.areEqual(this.switchOffColor, remoteTheme.switchOffColor) && e0.areEqual(this.switchOffButtonColor, remoteTheme.switchOffButtonColor) && e0.areEqual(this.textColorDark, remoteTheme.textColorDark) && e0.areEqual(this.buttonSelectedColor, remoteTheme.buttonSelectedColor) && e0.areEqual(this.vendorBackgroundColorDark, remoteTheme.vendorBackgroundColorDark) && e0.areEqual(this.vendorSeparatorColor, remoteTheme.vendorSeparatorColor) && e0.areEqual(this.acceptAllButtonBackground, remoteTheme.acceptAllButtonBackground) && e0.areEqual(this.acceptAllButtonBorder, remoteTheme.acceptAllButtonBorder) && e0.areEqual(this.acceptAllButtonText, remoteTheme.acceptAllButtonText) && e0.areEqual(this.refuseAllButtonBackground, remoteTheme.refuseAllButtonBackground) && e0.areEqual(this.refuseAllButtonBorder, remoteTheme.refuseAllButtonBorder) && e0.areEqual(this.refuseAllButtonText, remoteTheme.refuseAllButtonText) && e0.areEqual(this.setupButtonBackground, remoteTheme.setupButtonBackground) && e0.areEqual(this.setupButtonBorder, remoteTheme.setupButtonBorder) && e0.areEqual(this.setupButtonText, remoteTheme.setupButtonText) && e0.areEqual(this.onboardingImage, remoteTheme.onboardingImage) && e0.areEqual(this.noticeSuccessImage, remoteTheme.noticeSuccessImage) && e0.areEqual(this.geoAdvertisingIcon, remoteTheme.geoAdvertisingIcon) && e0.areEqual(this.illustrationFooterImage, remoteTheme.illustrationFooterImage) && e0.areEqual(this.illustrationHeaderImage, remoteTheme.illustrationHeaderImage) && e0.areEqual(this.illustrationSuccessImage, remoteTheme.illustrationSuccessImage) && e0.areEqual(this.icon, remoteTheme.icon) && e0.areEqual(this.introductionTitle, remoteTheme.introductionTitle) && e0.areEqual(this.introductionText, remoteTheme.introductionText) && e0.areEqual(this.introductionDetailsText, remoteTheme.introductionDetailsText) && e0.areEqual(this.buttonConfigure, remoteTheme.buttonConfigure) && e0.areEqual(this.buttonAcceptAll, remoteTheme.buttonAcceptAll) && e0.areEqual(this.buttonDenyAll, remoteTheme.buttonDenyAll) && e0.areEqual(this.buttonSeeMandatoryFeature, remoteTheme.buttonSeeMandatoryFeature) && e0.areEqual(this.buttonSave, remoteTheme.buttonSave) && e0.areEqual(this.buttonRefineByPartner, remoteTheme.buttonRefineByPartner) && e0.areEqual(this.buttonClose, remoteTheme.buttonClose) && e0.areEqual(this.buttonKnowMore, remoteTheme.buttonKnowMore) && e0.areEqual(this.buttonContinueWithoutAccepting, remoteTheme.buttonContinueWithoutAccepting) && e0.areEqual(this.buttonSeeMandatoryPurpose, remoteTheme.buttonSeeMandatoryPurpose) && e0.areEqual(this.buttonOpposeLegint, remoteTheme.buttonOpposeLegint) && e0.areEqual(this.buttonSeeMore, remoteTheme.buttonSeeMore) && e0.areEqual(this.noticeSubTitle, remoteTheme.noticeSubTitle) && e0.areEqual(this.noticeFeatureTitle, remoteTheme.noticeFeatureTitle) && e0.areEqual(this.vendorPolicy, remoteTheme.vendorPolicy) && e0.areEqual(this.vendorLegInt, remoteTheme.vendorLegInt) && e0.areEqual(this.noticeTitle, remoteTheme.noticeTitle) && e0.areEqual(this.noticeMandatoryPurposeTitle, remoteTheme.noticeMandatoryPurposeTitle) && e0.areEqual(this.noticeMandatoryPurposeDesc, remoteTheme.noticeMandatoryPurposeDesc) && e0.areEqual(this.noticeMandatoryFeatureTitle, remoteTheme.noticeMandatoryFeatureTitle) && e0.areEqual(this.noticeMandatoryFeatureDesc, remoteTheme.noticeMandatoryFeatureDesc) && e0.areEqual(this.noticeConsentableDetailLabel1, remoteTheme.noticeConsentableDetailLabel1) && e0.areEqual(this.mandatorySectionVendors, remoteTheme.mandatorySectionVendors) && e0.areEqual(this.consentablePolicy, remoteTheme.consentablePolicy) && e0.areEqual(this.vendorTabIab, remoteTheme.vendorTabIab) && e0.areEqual(this.vendorTabOther, remoteTheme.vendorTabOther) && e0.areEqual(this.vendorUnderConsent, remoteTheme.vendorUnderConsent) && e0.areEqual(this.vendorUnderLegInt, remoteTheme.vendorUnderLegInt) && e0.areEqual(this.vendorCompulsory, remoteTheme.vendorCompulsory) && e0.areEqual(this.vendorPurpose, remoteTheme.vendorPurpose) && e0.areEqual(this.vendorFeature, remoteTheme.vendorFeature) && e0.areEqual(this.vendorsHeader, remoteTheme.vendorsHeader) && e0.areEqual(this.vendorSubjectToConsent, remoteTheme.vendorSubjectToConsent) && e0.areEqual(this.successTitle, remoteTheme.successTitle) && e0.areEqual(this.successSubTitle, remoteTheme.successSubTitle) && e0.areEqual(this.successText, remoteTheme.successText) && e0.areEqual(this.highlightAcceptAllButton, remoteTheme.highlightAcceptAllButton) && e0.areEqual(this.displayConfigCloseHeader, remoteTheme.displayConfigCloseHeader) && e0.areEqual(this.useSuccessScreen, remoteTheme.useSuccessScreen) && e0.areEqual(this.tabletModalScreen, remoteTheme.tabletModalScreen) && this.bannerActions == remoteTheme.bannerActions && e0.areEqual(this.continueWithoutAccepting, remoteTheme.continueWithoutAccepting) && e0.areEqual(this.enableIllustrations, remoteTheme.enableIllustrations) && this.isNeedToDisplayUsageExampleOnLayer1 == remoteTheme.isNeedToDisplayUsageExampleOnLayer1;
    }

    public final String getAcceptAllButtonBackground() {
        return this.acceptAllButtonBackground;
    }

    public final String getAcceptAllButtonBorder() {
        return this.acceptAllButtonBorder;
    }

    public final String getAcceptAllButtonText() {
        return this.acceptAllButtonText;
    }

    public final String getActionBarColor() {
        return this.actionBarColor;
    }

    public final String getActionBarTextColor() {
        return this.actionBarTextColor;
    }

    public final int getBannerActions() {
        return this.bannerActions;
    }

    public final String getBannerBackgroundColor() {
        return this.bannerBackgroundColor;
    }

    public final List<TranslatableText> getButtonAcceptAll() {
        return this.buttonAcceptAll;
    }

    public final String getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    public final String getButtonBorderColor() {
        return this.buttonBorderColor;
    }

    public final List<TranslatableText> getButtonClose() {
        return this.buttonClose;
    }

    public final List<TranslatableText> getButtonConfigure() {
        return this.buttonConfigure;
    }

    public final List<TranslatableText> getButtonContinueWithoutAccepting() {
        return this.buttonContinueWithoutAccepting;
    }

    public final List<TranslatableText> getButtonDenyAll() {
        return this.buttonDenyAll;
    }

    public final List<TranslatableText> getButtonKnowMore() {
        return this.buttonKnowMore;
    }

    public final List<TranslatableText> getButtonOpposeLegint() {
        return this.buttonOpposeLegint;
    }

    public final List<TranslatableText> getButtonRefineByPartner() {
        return this.buttonRefineByPartner;
    }

    public final List<TranslatableText> getButtonSave() {
        return this.buttonSave;
    }

    public final List<TranslatableText> getButtonSeeMandatoryFeature() {
        return this.buttonSeeMandatoryFeature;
    }

    public final List<TranslatableText> getButtonSeeMandatoryPurpose() {
        return this.buttonSeeMandatoryPurpose;
    }

    public final List<TranslatableText> getButtonSeeMore() {
        return this.buttonSeeMore;
    }

    public final String getButtonSelectedColor() {
        return this.buttonSelectedColor;
    }

    public final String getButtonTextColor() {
        return this.buttonTextColor;
    }

    public final List<TranslatableText> getConsentablePolicy() {
        return this.consentablePolicy;
    }

    public final Boolean getContinueWithoutAccepting() {
        return this.continueWithoutAccepting;
    }

    public final String getCopyrightColor() {
        return this.copyrightColor;
    }

    public final Boolean getDisplayConfigCloseHeader() {
        return this.displayConfigCloseHeader;
    }

    public final Boolean getEnableIllustrations() {
        return this.enableIllustrations;
    }

    public final String getFallbackLanguage() {
        return this.fallbackLanguage;
    }

    public final String getGeoAdvertisingIcon() {
        return this.geoAdvertisingIcon;
    }

    public final String getGeoNoticeBannerBackgroundColor() {
        return this.geoNoticeBannerBackgroundColor;
    }

    public final Boolean getHighlightAcceptAllButton() {
        return this.highlightAcceptAllButton;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIllustrationFooterImage() {
        return this.illustrationFooterImage;
    }

    public final String getIllustrationHeaderImage() {
        return this.illustrationHeaderImage;
    }

    public final String getIllustrationSuccessImage() {
        return this.illustrationSuccessImage;
    }

    public final List<TranslatableText> getIntroductionDetailsText() {
        return this.introductionDetailsText;
    }

    public final List<TranslatableText> getIntroductionText() {
        return this.introductionText;
    }

    public final List<TranslatableText> getIntroductionTitle() {
        return this.introductionTitle;
    }

    public final List<String> getLanguages() {
        return this.languages;
    }

    public final List<TranslatableText> getMandatorySectionVendors() {
        return this.mandatorySectionVendors;
    }

    public final List<TranslatableText> getNoticeConsentableDetailLabel1() {
        return this.noticeConsentableDetailLabel1;
    }

    public final List<TranslatableText> getNoticeFeatureTitle() {
        return this.noticeFeatureTitle;
    }

    public final List<TranslatableText> getNoticeMandatoryFeatureDesc() {
        return this.noticeMandatoryFeatureDesc;
    }

    public final List<TranslatableText> getNoticeMandatoryFeatureTitle() {
        return this.noticeMandatoryFeatureTitle;
    }

    public final List<TranslatableText> getNoticeMandatoryPurposeDesc() {
        return this.noticeMandatoryPurposeDesc;
    }

    public final List<TranslatableText> getNoticeMandatoryPurposeTitle() {
        return this.noticeMandatoryPurposeTitle;
    }

    public final List<TranslatableText> getNoticeSubTitle() {
        return this.noticeSubTitle;
    }

    public final String getNoticeSuccessImage() {
        return this.noticeSuccessImage;
    }

    public final List<TranslatableText> getNoticeTitle() {
        return this.noticeTitle;
    }

    public final String getOnboardingImage() {
        return this.onboardingImage;
    }

    public final String getRefuseAllButtonBackground() {
        return this.refuseAllButtonBackground;
    }

    public final String getRefuseAllButtonBorder() {
        return this.refuseAllButtonBorder;
    }

    public final String getRefuseAllButtonText() {
        return this.refuseAllButtonText;
    }

    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    public final String getSetupButtonBackground() {
        return this.setupButtonBackground;
    }

    public final String getSetupButtonBorder() {
        return this.setupButtonBorder;
    }

    public final String getSetupButtonText() {
        return this.setupButtonText;
    }

    public final String getStatusBarColor() {
        return this.statusBarColor;
    }

    public final List<TranslatableText> getSuccessSubTitle() {
        return this.successSubTitle;
    }

    public final List<TranslatableText> getSuccessText() {
        return this.successText;
    }

    public final List<TranslatableText> getSuccessTitle() {
        return this.successTitle;
    }

    public final String getSwitchOffButtonColor() {
        return this.switchOffButtonColor;
    }

    public final String getSwitchOffColor() {
        return this.switchOffColor;
    }

    public final String getSwitchOnButtonColor() {
        return this.switchOnButtonColor;
    }

    public final String getSwitchOnColor() {
        return this.switchOnColor;
    }

    public final String getSwitchUnsetColor() {
        return this.switchUnsetColor;
    }

    public final Boolean getTabletModalScreen() {
        return this.tabletModalScreen;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextColorDark() {
        return this.textColorDark;
    }

    public final Boolean getUseSuccessScreen() {
        return this.useSuccessScreen;
    }

    public final String getVendorBackgroundColorDark() {
        return this.vendorBackgroundColorDark;
    }

    public final List<TranslatableText> getVendorCompulsory() {
        return this.vendorCompulsory;
    }

    public final List<TranslatableText> getVendorFeature() {
        return this.vendorFeature;
    }

    public final List<TranslatableText> getVendorLegInt() {
        return this.vendorLegInt;
    }

    public final List<TranslatableText> getVendorPolicy() {
        return this.vendorPolicy;
    }

    public final List<TranslatableText> getVendorPurpose() {
        return this.vendorPurpose;
    }

    public final String getVendorSeparatorColor() {
        return this.vendorSeparatorColor;
    }

    public final List<TranslatableText> getVendorSubjectToConsent() {
        return this.vendorSubjectToConsent;
    }

    public final List<TranslatableText> getVendorTabIab() {
        return this.vendorTabIab;
    }

    public final List<TranslatableText> getVendorTabOther() {
        return this.vendorTabOther;
    }

    public final List<TranslatableText> getVendorUnderConsent() {
        return this.vendorUnderConsent;
    }

    public final List<TranslatableText> getVendorUnderLegInt() {
        return this.vendorUnderLegInt;
    }

    public final List<TranslatableText> getVendorsHeader() {
        return this.vendorsHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iC = o2.c(this.fallbackLanguage.hashCode() * 31, 31, this.languages);
        String str = this.textColor;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bannerBackgroundColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.separatorColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonTextColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonBorderColor;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.buttonBackgroundColor;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.statusBarColor;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.actionBarColor;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.actionBarTextColor;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.copyrightColor;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.geoNoticeBannerBackgroundColor;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.switchUnsetColor;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.switchOnColor;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.switchOnButtonColor;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.switchOffColor;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.switchOffButtonColor;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.textColorDark;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.buttonSelectedColor;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.vendorBackgroundColorDark;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.vendorSeparatorColor;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.acceptAllButtonBackground;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.acceptAllButtonBorder;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.acceptAllButtonText;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.refuseAllButtonBackground;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.refuseAllButtonBorder;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.refuseAllButtonText;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.setupButtonBackground;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.setupButtonBorder;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.setupButtonText;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.onboardingImage;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.noticeSuccessImage;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.geoAdvertisingIcon;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.illustrationFooterImage;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.illustrationHeaderImage;
        int iHashCode34 = (iHashCode33 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.illustrationSuccessImage;
        int iHashCode35 = (iHashCode34 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.icon;
        int iHashCode36 = (iHashCode35 + (str36 == null ? 0 : str36.hashCode())) * 31;
        List<TranslatableText> list = this.introductionTitle;
        int iHashCode37 = (iHashCode36 + (list == null ? 0 : list.hashCode())) * 31;
        List<TranslatableText> list2 = this.introductionText;
        int iHashCode38 = (iHashCode37 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TranslatableText> list3 = this.introductionDetailsText;
        int iHashCode39 = (iHashCode38 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TranslatableText> list4 = this.buttonConfigure;
        int iHashCode40 = (iHashCode39 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TranslatableText> list5 = this.buttonAcceptAll;
        int iHashCode41 = (iHashCode40 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TranslatableText> list6 = this.buttonDenyAll;
        int iHashCode42 = (iHashCode41 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TranslatableText> list7 = this.buttonSeeMandatoryFeature;
        int iHashCode43 = (iHashCode42 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TranslatableText> list8 = this.buttonSave;
        int iHashCode44 = (iHashCode43 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TranslatableText> list9 = this.buttonRefineByPartner;
        int iHashCode45 = (iHashCode44 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TranslatableText> list10 = this.buttonClose;
        int iHashCode46 = (iHashCode45 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TranslatableText> list11 = this.buttonKnowMore;
        int iHashCode47 = (iHashCode46 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TranslatableText> list12 = this.buttonContinueWithoutAccepting;
        int iHashCode48 = (iHashCode47 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TranslatableText> list13 = this.buttonSeeMandatoryPurpose;
        int iHashCode49 = (iHashCode48 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TranslatableText> list14 = this.buttonOpposeLegint;
        int iHashCode50 = (iHashCode49 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TranslatableText> list15 = this.buttonSeeMore;
        int iHashCode51 = (iHashCode50 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TranslatableText> list16 = this.noticeSubTitle;
        int iHashCode52 = (iHashCode51 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TranslatableText> list17 = this.noticeFeatureTitle;
        int iHashCode53 = (iHashCode52 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TranslatableText> list18 = this.vendorPolicy;
        int iHashCode54 = (iHashCode53 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TranslatableText> list19 = this.vendorLegInt;
        int iHashCode55 = (iHashCode54 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TranslatableText> list20 = this.noticeTitle;
        int iHashCode56 = (iHashCode55 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<TranslatableText> list21 = this.noticeMandatoryPurposeTitle;
        int iHashCode57 = (iHashCode56 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<TranslatableText> list22 = this.noticeMandatoryPurposeDesc;
        int iHashCode58 = (iHashCode57 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<TranslatableText> list23 = this.noticeMandatoryFeatureTitle;
        int iHashCode59 = (iHashCode58 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<TranslatableText> list24 = this.noticeMandatoryFeatureDesc;
        int iHashCode60 = (iHashCode59 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<TranslatableText> list25 = this.noticeConsentableDetailLabel1;
        int iHashCode61 = (iHashCode60 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<TranslatableText> list26 = this.mandatorySectionVendors;
        int iHashCode62 = (iHashCode61 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<TranslatableText> list27 = this.consentablePolicy;
        int iHashCode63 = (iHashCode62 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<TranslatableText> list28 = this.vendorTabIab;
        int iHashCode64 = (iHashCode63 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<TranslatableText> list29 = this.vendorTabOther;
        int iHashCode65 = (iHashCode64 + (list29 == null ? 0 : list29.hashCode())) * 31;
        List<TranslatableText> list30 = this.vendorUnderConsent;
        int iHashCode66 = (iHashCode65 + (list30 == null ? 0 : list30.hashCode())) * 31;
        List<TranslatableText> list31 = this.vendorUnderLegInt;
        int iHashCode67 = (iHashCode66 + (list31 == null ? 0 : list31.hashCode())) * 31;
        List<TranslatableText> list32 = this.vendorCompulsory;
        int iHashCode68 = (iHashCode67 + (list32 == null ? 0 : list32.hashCode())) * 31;
        List<TranslatableText> list33 = this.vendorPurpose;
        int iHashCode69 = (iHashCode68 + (list33 == null ? 0 : list33.hashCode())) * 31;
        List<TranslatableText> list34 = this.vendorFeature;
        int iHashCode70 = (iHashCode69 + (list34 == null ? 0 : list34.hashCode())) * 31;
        List<TranslatableText> list35 = this.vendorsHeader;
        int iHashCode71 = (iHashCode70 + (list35 == null ? 0 : list35.hashCode())) * 31;
        List<TranslatableText> list36 = this.vendorSubjectToConsent;
        int iHashCode72 = (iHashCode71 + (list36 == null ? 0 : list36.hashCode())) * 31;
        List<TranslatableText> list37 = this.successTitle;
        int iHashCode73 = (iHashCode72 + (list37 == null ? 0 : list37.hashCode())) * 31;
        List<TranslatableText> list38 = this.successSubTitle;
        int iHashCode74 = (iHashCode73 + (list38 == null ? 0 : list38.hashCode())) * 31;
        List<TranslatableText> list39 = this.successText;
        int iHashCode75 = (iHashCode74 + (list39 == null ? 0 : list39.hashCode())) * 31;
        Boolean bool = this.highlightAcceptAllButton;
        int iHashCode76 = (iHashCode75 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.displayConfigCloseHeader;
        int iHashCode77 = (iHashCode76 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.useSuccessScreen;
        int iHashCode78 = (iHashCode77 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.tabletModalScreen;
        int iD = g.d(this.bannerActions, (iHashCode78 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31);
        Boolean bool5 = this.continueWithoutAccepting;
        int iHashCode79 = (iD + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.enableIllustrations;
        int iHashCode80 = (iHashCode79 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        boolean z10 = this.isNeedToDisplayUsageExampleOnLayer1;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode80 + i10;
    }

    public final boolean isNeedToDisplayUsageExampleOnLayer1() {
        return this.isNeedToDisplayUsageExampleOnLayer1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteTheme(fallbackLanguage=");
        sb2.append(this.fallbackLanguage);
        sb2.append(", languages=");
        sb2.append(this.languages);
        sb2.append(", textColor=");
        sb2.append(this.textColor);
        sb2.append(", bannerBackgroundColor=");
        sb2.append(this.bannerBackgroundColor);
        sb2.append(", separatorColor=");
        sb2.append(this.separatorColor);
        sb2.append(", buttonTextColor=");
        sb2.append(this.buttonTextColor);
        sb2.append(", buttonBorderColor=");
        sb2.append(this.buttonBorderColor);
        sb2.append(", buttonBackgroundColor=");
        sb2.append(this.buttonBackgroundColor);
        sb2.append(", statusBarColor=");
        sb2.append(this.statusBarColor);
        sb2.append(", actionBarColor=");
        sb2.append(this.actionBarColor);
        sb2.append(", actionBarTextColor=");
        sb2.append(this.actionBarTextColor);
        sb2.append(", copyrightColor=");
        sb2.append(this.copyrightColor);
        sb2.append(", geoNoticeBannerBackgroundColor=");
        sb2.append(this.geoNoticeBannerBackgroundColor);
        sb2.append(", switchUnsetColor=");
        sb2.append(this.switchUnsetColor);
        sb2.append(", switchOnColor=");
        sb2.append(this.switchOnColor);
        sb2.append(", switchOnButtonColor=");
        sb2.append(this.switchOnButtonColor);
        sb2.append(", switchOffColor=");
        sb2.append(this.switchOffColor);
        sb2.append(", switchOffButtonColor=");
        sb2.append(this.switchOffButtonColor);
        sb2.append(", textColorDark=");
        sb2.append(this.textColorDark);
        sb2.append(", buttonSelectedColor=");
        sb2.append(this.buttonSelectedColor);
        sb2.append(", vendorBackgroundColorDark=");
        sb2.append(this.vendorBackgroundColorDark);
        sb2.append(", vendorSeparatorColor=");
        sb2.append(this.vendorSeparatorColor);
        sb2.append(", acceptAllButtonBackground=");
        sb2.append(this.acceptAllButtonBackground);
        sb2.append(", acceptAllButtonBorder=");
        sb2.append(this.acceptAllButtonBorder);
        sb2.append(", acceptAllButtonText=");
        sb2.append(this.acceptAllButtonText);
        sb2.append(", refuseAllButtonBackground=");
        sb2.append(this.refuseAllButtonBackground);
        sb2.append(", refuseAllButtonBorder=");
        sb2.append(this.refuseAllButtonBorder);
        sb2.append(", refuseAllButtonText=");
        sb2.append(this.refuseAllButtonText);
        sb2.append(", setupButtonBackground=");
        sb2.append(this.setupButtonBackground);
        sb2.append(", setupButtonBorder=");
        sb2.append(this.setupButtonBorder);
        sb2.append(", setupButtonText=");
        sb2.append(this.setupButtonText);
        sb2.append(", onboardingImage=");
        sb2.append(this.onboardingImage);
        sb2.append(", noticeSuccessImage=");
        sb2.append(this.noticeSuccessImage);
        sb2.append(", geoAdvertisingIcon=");
        sb2.append(this.geoAdvertisingIcon);
        sb2.append(", illustrationFooterImage=");
        sb2.append(this.illustrationFooterImage);
        sb2.append(", illustrationHeaderImage=");
        sb2.append(this.illustrationHeaderImage);
        sb2.append(", illustrationSuccessImage=");
        sb2.append(this.illustrationSuccessImage);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", introductionTitle=");
        sb2.append(this.introductionTitle);
        sb2.append(", introductionText=");
        sb2.append(this.introductionText);
        sb2.append(", introductionDetailsText=");
        sb2.append(this.introductionDetailsText);
        sb2.append(", buttonConfigure=");
        sb2.append(this.buttonConfigure);
        sb2.append(", buttonAcceptAll=");
        sb2.append(this.buttonAcceptAll);
        sb2.append(", buttonDenyAll=");
        sb2.append(this.buttonDenyAll);
        sb2.append(", buttonSeeMandatoryFeature=");
        sb2.append(this.buttonSeeMandatoryFeature);
        sb2.append(", buttonSave=");
        sb2.append(this.buttonSave);
        sb2.append(", buttonRefineByPartner=");
        sb2.append(this.buttonRefineByPartner);
        sb2.append(", buttonClose=");
        sb2.append(this.buttonClose);
        sb2.append(", buttonKnowMore=");
        sb2.append(this.buttonKnowMore);
        sb2.append(", buttonContinueWithoutAccepting=");
        sb2.append(this.buttonContinueWithoutAccepting);
        sb2.append(", buttonSeeMandatoryPurpose=");
        sb2.append(this.buttonSeeMandatoryPurpose);
        sb2.append(", buttonOpposeLegint=");
        sb2.append(this.buttonOpposeLegint);
        sb2.append(", buttonSeeMore=");
        sb2.append(this.buttonSeeMore);
        sb2.append(", noticeSubTitle=");
        sb2.append(this.noticeSubTitle);
        sb2.append(", noticeFeatureTitle=");
        sb2.append(this.noticeFeatureTitle);
        sb2.append(", vendorPolicy=");
        sb2.append(this.vendorPolicy);
        sb2.append(", vendorLegInt=");
        sb2.append(this.vendorLegInt);
        sb2.append(", noticeTitle=");
        sb2.append(this.noticeTitle);
        sb2.append(", noticeMandatoryPurposeTitle=");
        sb2.append(this.noticeMandatoryPurposeTitle);
        sb2.append(", noticeMandatoryPurposeDesc=");
        sb2.append(this.noticeMandatoryPurposeDesc);
        sb2.append(", noticeMandatoryFeatureTitle=");
        sb2.append(this.noticeMandatoryFeatureTitle);
        sb2.append(", noticeMandatoryFeatureDesc=");
        sb2.append(this.noticeMandatoryFeatureDesc);
        sb2.append(", noticeConsentableDetailLabel1=");
        sb2.append(this.noticeConsentableDetailLabel1);
        sb2.append(", mandatorySectionVendors=");
        sb2.append(this.mandatorySectionVendors);
        sb2.append(", consentablePolicy=");
        sb2.append(this.consentablePolicy);
        sb2.append(", vendorTabIab=");
        sb2.append(this.vendorTabIab);
        sb2.append(", vendorTabOther=");
        sb2.append(this.vendorTabOther);
        sb2.append(", vendorUnderConsent=");
        sb2.append(this.vendorUnderConsent);
        sb2.append(", vendorUnderLegInt=");
        sb2.append(this.vendorUnderLegInt);
        sb2.append(", vendorCompulsory=");
        sb2.append(this.vendorCompulsory);
        sb2.append(", vendorPurpose=");
        sb2.append(this.vendorPurpose);
        sb2.append(", vendorFeature=");
        sb2.append(this.vendorFeature);
        sb2.append(", vendorsHeader=");
        sb2.append(this.vendorsHeader);
        sb2.append(", vendorSubjectToConsent=");
        sb2.append(this.vendorSubjectToConsent);
        sb2.append(", successTitle=");
        sb2.append(this.successTitle);
        sb2.append(", successSubTitle=");
        sb2.append(this.successSubTitle);
        sb2.append(", successText=");
        sb2.append(this.successText);
        sb2.append(", highlightAcceptAllButton=");
        sb2.append(this.highlightAcceptAllButton);
        sb2.append(", displayConfigCloseHeader=");
        sb2.append(this.displayConfigCloseHeader);
        sb2.append(", useSuccessScreen=");
        sb2.append(this.useSuccessScreen);
        sb2.append(", tabletModalScreen=");
        sb2.append(this.tabletModalScreen);
        sb2.append(", bannerActions=");
        sb2.append(this.bannerActions);
        sb2.append(", continueWithoutAccepting=");
        sb2.append(this.continueWithoutAccepting);
        sb2.append(", enableIllustrations=");
        sb2.append(this.enableIllustrations);
        sb2.append(", isNeedToDisplayUsageExampleOnLayer1=");
        return b.p(sb2, this.isNeedToDisplayUsageExampleOnLayer1, ')');
    }

    @f
    public /* synthetic */ RemoteTheme(int i10, int i11, int i12, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, List list31, List list32, List list33, List list34, List list35, List list36, List list37, List list38, List list39, List list40, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i13, Boolean bool5, Boolean bool6, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            String language = Locale.ENGLISH.getLanguage();
            e0.checkNotNullExpressionValue(language, "ENGLISH.language");
            str = language.toLowerCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        this.fallbackLanguage = str;
        if ((i10 & 2) == 0) {
            this.languages = o0.listOf(this.fallbackLanguage);
        } else {
            this.languages = list;
        }
        if ((i10 & 4) == 0) {
            this.textColor = null;
        } else {
            this.textColor = str2;
        }
        if ((i10 & 8) == 0) {
            this.bannerBackgroundColor = null;
        } else {
            this.bannerBackgroundColor = str3;
        }
        if ((i10 & 16) == 0) {
            this.separatorColor = null;
        } else {
            this.separatorColor = str4;
        }
        if ((i10 & 32) == 0) {
            this.buttonTextColor = null;
        } else {
            this.buttonTextColor = str5;
        }
        if ((i10 & 64) == 0) {
            this.buttonBorderColor = null;
        } else {
            this.buttonBorderColor = str6;
        }
        if ((i10 & 128) == 0) {
            this.buttonBackgroundColor = null;
        } else {
            this.buttonBackgroundColor = str7;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.statusBarColor = null;
        } else {
            this.statusBarColor = str8;
        }
        if ((i10 & 512) == 0) {
            this.actionBarColor = null;
        } else {
            this.actionBarColor = str9;
        }
        if ((i10 & 1024) == 0) {
            this.actionBarTextColor = null;
        } else {
            this.actionBarTextColor = str10;
        }
        if ((i10 & 2048) == 0) {
            this.copyrightColor = null;
        } else {
            this.copyrightColor = str11;
        }
        if ((i10 & 4096) == 0) {
            this.geoNoticeBannerBackgroundColor = null;
        } else {
            this.geoNoticeBannerBackgroundColor = str12;
        }
        if ((i10 & Segment.SIZE) == 0) {
            this.switchUnsetColor = null;
        } else {
            this.switchUnsetColor = str13;
        }
        if ((i10 & 16384) == 0) {
            this.switchOnColor = null;
        } else {
            this.switchOnColor = str14;
        }
        if ((i10 & 32768) == 0) {
            this.switchOnButtonColor = null;
        } else {
            this.switchOnButtonColor = str15;
        }
        if ((i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            this.switchOffColor = null;
        } else {
            this.switchOffColor = str16;
        }
        if ((i10 & 131072) == 0) {
            this.switchOffButtonColor = null;
        } else {
            this.switchOffButtonColor = str17;
        }
        if ((i10 & 262144) == 0) {
            this.textColorDark = null;
        } else {
            this.textColorDark = str18;
        }
        if ((i10 & 524288) == 0) {
            this.buttonSelectedColor = null;
        } else {
            this.buttonSelectedColor = str19;
        }
        if ((i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            this.vendorBackgroundColorDark = null;
        } else {
            this.vendorBackgroundColorDark = str20;
        }
        if ((2097152 & i10) == 0) {
            this.vendorSeparatorColor = null;
        } else {
            this.vendorSeparatorColor = str21;
        }
        if ((4194304 & i10) == 0) {
            this.acceptAllButtonBackground = null;
        } else {
            this.acceptAllButtonBackground = str22;
        }
        if ((8388608 & i10) == 0) {
            this.acceptAllButtonBorder = null;
        } else {
            this.acceptAllButtonBorder = str23;
        }
        if ((16777216 & i10) == 0) {
            this.acceptAllButtonText = null;
        } else {
            this.acceptAllButtonText = str24;
        }
        if ((33554432 & i10) == 0) {
            this.refuseAllButtonBackground = null;
        } else {
            this.refuseAllButtonBackground = str25;
        }
        if ((67108864 & i10) == 0) {
            this.refuseAllButtonBorder = null;
        } else {
            this.refuseAllButtonBorder = str26;
        }
        if ((134217728 & i10) == 0) {
            this.refuseAllButtonText = null;
        } else {
            this.refuseAllButtonText = str27;
        }
        if ((268435456 & i10) == 0) {
            this.setupButtonBackground = null;
        } else {
            this.setupButtonBackground = str28;
        }
        if ((536870912 & i10) == 0) {
            this.setupButtonBorder = null;
        } else {
            this.setupButtonBorder = str29;
        }
        if ((1073741824 & i10) == 0) {
            this.setupButtonText = null;
        } else {
            this.setupButtonText = str30;
        }
        if ((i10 & Integer.MIN_VALUE) == 0) {
            this.onboardingImage = null;
        } else {
            this.onboardingImage = str31;
        }
        if ((i11 & 1) == 0) {
            this.noticeSuccessImage = null;
        } else {
            this.noticeSuccessImage = str32;
        }
        if ((i11 & 2) == 0) {
            this.geoAdvertisingIcon = null;
        } else {
            this.geoAdvertisingIcon = str33;
        }
        if ((i11 & 4) == 0) {
            this.illustrationFooterImage = null;
        } else {
            this.illustrationFooterImage = str34;
        }
        if ((i11 & 8) == 0) {
            this.illustrationHeaderImage = null;
        } else {
            this.illustrationHeaderImage = str35;
        }
        if ((i11 & 16) == 0) {
            this.illustrationSuccessImage = null;
        } else {
            this.illustrationSuccessImage = str36;
        }
        if ((i11 & 32) == 0) {
            this.icon = null;
        } else {
            this.icon = str37;
        }
        if ((i11 & 64) == 0) {
            this.introductionTitle = null;
        } else {
            this.introductionTitle = list2;
        }
        if ((i11 & 128) == 0) {
            this.introductionText = null;
        } else {
            this.introductionText = list3;
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.introductionDetailsText = null;
        } else {
            this.introductionDetailsText = list4;
        }
        if ((i11 & 512) == 0) {
            this.buttonConfigure = null;
        } else {
            this.buttonConfigure = list5;
        }
        if ((i11 & 1024) == 0) {
            this.buttonAcceptAll = null;
        } else {
            this.buttonAcceptAll = list6;
        }
        if ((i11 & 2048) == 0) {
            this.buttonDenyAll = null;
        } else {
            this.buttonDenyAll = list7;
        }
        if ((i11 & 4096) == 0) {
            this.buttonSeeMandatoryFeature = null;
        } else {
            this.buttonSeeMandatoryFeature = list8;
        }
        if ((i11 & Segment.SIZE) == 0) {
            this.buttonSave = null;
        } else {
            this.buttonSave = list9;
        }
        if ((i11 & 16384) == 0) {
            this.buttonRefineByPartner = null;
        } else {
            this.buttonRefineByPartner = list10;
        }
        if ((i11 & 32768) == 0) {
            this.buttonClose = null;
        } else {
            this.buttonClose = list11;
        }
        if ((i11 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            this.buttonKnowMore = null;
        } else {
            this.buttonKnowMore = list12;
        }
        if ((i11 & 131072) == 0) {
            this.buttonContinueWithoutAccepting = null;
        } else {
            this.buttonContinueWithoutAccepting = list13;
        }
        if ((i11 & 262144) == 0) {
            this.buttonSeeMandatoryPurpose = null;
        } else {
            this.buttonSeeMandatoryPurpose = list14;
        }
        if ((i11 & 524288) == 0) {
            this.buttonOpposeLegint = null;
        } else {
            this.buttonOpposeLegint = list15;
        }
        if ((i11 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            this.buttonSeeMore = null;
        } else {
            this.buttonSeeMore = list16;
        }
        if ((2097152 & i11) == 0) {
            this.noticeSubTitle = null;
        } else {
            this.noticeSubTitle = list17;
        }
        if ((4194304 & i11) == 0) {
            this.noticeFeatureTitle = null;
        } else {
            this.noticeFeatureTitle = list18;
        }
        if ((8388608 & i11) == 0) {
            this.vendorPolicy = null;
        } else {
            this.vendorPolicy = list19;
        }
        if ((16777216 & i11) == 0) {
            this.vendorLegInt = null;
        } else {
            this.vendorLegInt = list20;
        }
        if ((33554432 & i11) == 0) {
            this.noticeTitle = null;
        } else {
            this.noticeTitle = list21;
        }
        if ((67108864 & i11) == 0) {
            this.noticeMandatoryPurposeTitle = null;
        } else {
            this.noticeMandatoryPurposeTitle = list22;
        }
        if ((134217728 & i11) == 0) {
            this.noticeMandatoryPurposeDesc = null;
        } else {
            this.noticeMandatoryPurposeDesc = list23;
        }
        if ((268435456 & i11) == 0) {
            this.noticeMandatoryFeatureTitle = null;
        } else {
            this.noticeMandatoryFeatureTitle = list24;
        }
        if ((536870912 & i11) == 0) {
            this.noticeMandatoryFeatureDesc = null;
        } else {
            this.noticeMandatoryFeatureDesc = list25;
        }
        if ((1073741824 & i11) == 0) {
            this.noticeConsentableDetailLabel1 = null;
        } else {
            this.noticeConsentableDetailLabel1 = list26;
        }
        if ((Integer.MIN_VALUE & i11) == 0) {
            this.mandatorySectionVendors = null;
        } else {
            this.mandatorySectionVendors = list27;
        }
        if ((i12 & 1) == 0) {
            this.consentablePolicy = null;
        } else {
            this.consentablePolicy = list28;
        }
        if ((i12 & 2) == 0) {
            this.vendorTabIab = null;
        } else {
            this.vendorTabIab = list29;
        }
        if ((i12 & 4) == 0) {
            this.vendorTabOther = null;
        } else {
            this.vendorTabOther = list30;
        }
        if ((i12 & 8) == 0) {
            this.vendorUnderConsent = null;
        } else {
            this.vendorUnderConsent = list31;
        }
        if ((i12 & 16) == 0) {
            this.vendorUnderLegInt = null;
        } else {
            this.vendorUnderLegInt = list32;
        }
        if ((i12 & 32) == 0) {
            this.vendorCompulsory = null;
        } else {
            this.vendorCompulsory = list33;
        }
        if ((i12 & 64) == 0) {
            this.vendorPurpose = null;
        } else {
            this.vendorPurpose = list34;
        }
        if ((i12 & 128) == 0) {
            this.vendorFeature = null;
        } else {
            this.vendorFeature = list35;
        }
        if ((i12 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.vendorsHeader = null;
        } else {
            this.vendorsHeader = list36;
        }
        if ((i12 & 512) == 0) {
            this.vendorSubjectToConsent = null;
        } else {
            this.vendorSubjectToConsent = list37;
        }
        if ((i12 & 1024) == 0) {
            this.successTitle = null;
        } else {
            this.successTitle = list38;
        }
        if ((i12 & 2048) == 0) {
            this.successSubTitle = null;
        } else {
            this.successSubTitle = list39;
        }
        if ((i12 & 4096) == 0) {
            this.successText = null;
        } else {
            this.successText = list40;
        }
        if ((i12 & Segment.SIZE) == 0) {
            this.highlightAcceptAllButton = null;
        } else {
            this.highlightAcceptAllButton = bool;
        }
        if ((i12 & 16384) == 0) {
            this.displayConfigCloseHeader = null;
        } else {
            this.displayConfigCloseHeader = bool2;
        }
        if ((i12 & 32768) == 0) {
            this.useSuccessScreen = null;
        } else {
            this.useSuccessScreen = bool3;
        }
        if ((i12 & C.DEFAULT_BUFFER_SEGMENT_SIZE) == 0) {
            this.tabletModalScreen = null;
        } else {
            this.tabletModalScreen = bool4;
        }
        this.bannerActions = (i12 & 131072) == 0 ? 0 : i13;
        if ((i12 & 262144) == 0) {
            this.continueWithoutAccepting = null;
        } else {
            this.continueWithoutAccepting = bool5;
        }
        if ((i12 & 524288) == 0) {
            this.enableIllustrations = null;
        } else {
            this.enableIllustrations = bool6;
        }
        this.isNeedToDisplayUsageExampleOnLayer1 = (i12 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0 ? true : z10;
    }

    public RemoteTheme(String fallbackLanguage, List<String> languages, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, List<TranslatableText> list, List<TranslatableText> list2, List<TranslatableText> list3, List<TranslatableText> list4, List<TranslatableText> list5, List<TranslatableText> list6, List<TranslatableText> list7, List<TranslatableText> list8, List<TranslatableText> list9, List<TranslatableText> list10, List<TranslatableText> list11, List<TranslatableText> list12, List<TranslatableText> list13, List<TranslatableText> list14, List<TranslatableText> list15, List<TranslatableText> list16, List<TranslatableText> list17, List<TranslatableText> list18, List<TranslatableText> list19, List<TranslatableText> list20, List<TranslatableText> list21, List<TranslatableText> list22, List<TranslatableText> list23, List<TranslatableText> list24, List<TranslatableText> list25, List<TranslatableText> list26, List<TranslatableText> list27, List<TranslatableText> list28, List<TranslatableText> list29, List<TranslatableText> list30, List<TranslatableText> list31, List<TranslatableText> list32, List<TranslatableText> list33, List<TranslatableText> list34, List<TranslatableText> list35, List<TranslatableText> list36, List<TranslatableText> list37, List<TranslatableText> list38, List<TranslatableText> list39, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Boolean bool5, Boolean bool6, boolean z10) {
        e0.checkNotNullParameter(fallbackLanguage, "fallbackLanguage");
        e0.checkNotNullParameter(languages, "languages");
        this.fallbackLanguage = fallbackLanguage;
        this.languages = languages;
        this.textColor = str;
        this.bannerBackgroundColor = str2;
        this.separatorColor = str3;
        this.buttonTextColor = str4;
        this.buttonBorderColor = str5;
        this.buttonBackgroundColor = str6;
        this.statusBarColor = str7;
        this.actionBarColor = str8;
        this.actionBarTextColor = str9;
        this.copyrightColor = str10;
        this.geoNoticeBannerBackgroundColor = str11;
        this.switchUnsetColor = str12;
        this.switchOnColor = str13;
        this.switchOnButtonColor = str14;
        this.switchOffColor = str15;
        this.switchOffButtonColor = str16;
        this.textColorDark = str17;
        this.buttonSelectedColor = str18;
        this.vendorBackgroundColorDark = str19;
        this.vendorSeparatorColor = str20;
        this.acceptAllButtonBackground = str21;
        this.acceptAllButtonBorder = str22;
        this.acceptAllButtonText = str23;
        this.refuseAllButtonBackground = str24;
        this.refuseAllButtonBorder = str25;
        this.refuseAllButtonText = str26;
        this.setupButtonBackground = str27;
        this.setupButtonBorder = str28;
        this.setupButtonText = str29;
        this.onboardingImage = str30;
        this.noticeSuccessImage = str31;
        this.geoAdvertisingIcon = str32;
        this.illustrationFooterImage = str33;
        this.illustrationHeaderImage = str34;
        this.illustrationSuccessImage = str35;
        this.icon = str36;
        this.introductionTitle = list;
        this.introductionText = list2;
        this.introductionDetailsText = list3;
        this.buttonConfigure = list4;
        this.buttonAcceptAll = list5;
        this.buttonDenyAll = list6;
        this.buttonSeeMandatoryFeature = list7;
        this.buttonSave = list8;
        this.buttonRefineByPartner = list9;
        this.buttonClose = list10;
        this.buttonKnowMore = list11;
        this.buttonContinueWithoutAccepting = list12;
        this.buttonSeeMandatoryPurpose = list13;
        this.buttonOpposeLegint = list14;
        this.buttonSeeMore = list15;
        this.noticeSubTitle = list16;
        this.noticeFeatureTitle = list17;
        this.vendorPolicy = list18;
        this.vendorLegInt = list19;
        this.noticeTitle = list20;
        this.noticeMandatoryPurposeTitle = list21;
        this.noticeMandatoryPurposeDesc = list22;
        this.noticeMandatoryFeatureTitle = list23;
        this.noticeMandatoryFeatureDesc = list24;
        this.noticeConsentableDetailLabel1 = list25;
        this.mandatorySectionVendors = list26;
        this.consentablePolicy = list27;
        this.vendorTabIab = list28;
        this.vendorTabOther = list29;
        this.vendorUnderConsent = list30;
        this.vendorUnderLegInt = list31;
        this.vendorCompulsory = list32;
        this.vendorPurpose = list33;
        this.vendorFeature = list34;
        this.vendorsHeader = list35;
        this.vendorSubjectToConsent = list36;
        this.successTitle = list37;
        this.successSubTitle = list38;
        this.successText = list39;
        this.highlightAcceptAllButton = bool;
        this.displayConfigCloseHeader = bool2;
        this.useSuccessScreen = bool3;
        this.tabletModalScreen = bool4;
        this.bannerActions = i10;
        this.continueWithoutAccepting = bool5;
        this.enableIllustrations = bool6;
        this.isNeedToDisplayUsageExampleOnLayer1 = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RemoteTheme(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, List list26, List list27, List list28, List list29, List list30, List list31, List list32, List list33, List list34, List list35, List list36, List list37, List list38, List list39, List list40, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i10, Boolean bool5, Boolean bool6, boolean z10, int i11, int i12, int i13, u uVar) {
        String lowerCase;
        if ((i11 & 1) != 0) {
            String language = Locale.ENGLISH.getLanguage();
            e0.checkNotNullExpressionValue(language, "ENGLISH.language");
            lowerCase = language.toLowerCase(Locale.ROOT);
            e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        } else {
            lowerCase = str;
        }
        List listListOf = (i11 & 2) != 0 ? o0.listOf(lowerCase) : list;
        String str38 = (i11 & 4) != 0 ? null : str2;
        String str39 = (i11 & 8) != 0 ? null : str3;
        String str40 = (i11 & 16) != 0 ? null : str4;
        String str41 = (i11 & 32) != 0 ? null : str5;
        String str42 = (i11 & 64) != 0 ? null : str6;
        String str43 = (i11 & 128) != 0 ? null : str7;
        String str44 = (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str8;
        String str45 = (i11 & 512) != 0 ? null : str9;
        String str46 = (i11 & 1024) != 0 ? null : str10;
        String str47 = (i11 & 2048) != 0 ? null : str11;
        String str48 = (i11 & 4096) != 0 ? null : str12;
        String str49 = lowerCase;
        String str50 = (i11 & Segment.SIZE) != 0 ? null : str13;
        String str51 = (i11 & 16384) != 0 ? null : str14;
        String str52 = (i11 & 32768) != 0 ? null : str15;
        String str53 = (i11 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str16;
        String str54 = (i11 & 131072) != 0 ? null : str17;
        String str55 = (i11 & 262144) != 0 ? null : str18;
        String str56 = (i11 & 524288) != 0 ? null : str19;
        String str57 = (i11 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str20;
        String str58 = (i11 & 2097152) != 0 ? null : str21;
        String str59 = (i11 & 4194304) != 0 ? null : str22;
        String str60 = (i11 & 8388608) != 0 ? null : str23;
        String str61 = (i11 & 16777216) != 0 ? null : str24;
        String str62 = (i11 & 33554432) != 0 ? null : str25;
        String str63 = (i11 & 67108864) != 0 ? null : str26;
        String str64 = (i11 & 134217728) != 0 ? null : str27;
        String str65 = (i11 & 268435456) != 0 ? null : str28;
        String str66 = (i11 & 536870912) != 0 ? null : str29;
        String str67 = (i11 & 1073741824) != 0 ? null : str30;
        String str68 = (i11 & Integer.MIN_VALUE) != 0 ? null : str31;
        this(str49, listListOf, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str65, str66, str67, str68, (i12 & 1) != 0 ? null : str32, (i12 & 2) != 0 ? null : str33, (i12 & 4) != 0 ? null : str34, (i12 & 8) != 0 ? null : str35, (i12 & 16) != 0 ? null : str36, (i12 & 32) != 0 ? null : str37, (i12 & 64) != 0 ? null : list2, (i12 & 128) != 0 ? null : list3, (i12 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : list4, (i12 & 512) != 0 ? null : list5, (i12 & 1024) != 0 ? null : list6, (i12 & 2048) != 0 ? null : list7, (i12 & 4096) != 0 ? null : list8, (i12 & Segment.SIZE) != 0 ? null : list9, (i12 & 16384) != 0 ? null : list10, (i12 & 32768) != 0 ? null : list11, (i12 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : list12, (i12 & 131072) != 0 ? null : list13, (i12 & 262144) != 0 ? null : list14, (i12 & 524288) != 0 ? null : list15, (i12 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list16, (i12 & 2097152) != 0 ? null : list17, (i12 & 4194304) != 0 ? null : list18, (i12 & 8388608) != 0 ? null : list19, (i12 & 16777216) != 0 ? null : list20, (i12 & 33554432) != 0 ? null : list21, (i12 & 67108864) != 0 ? null : list22, (i12 & 134217728) != 0 ? null : list23, (i12 & 268435456) != 0 ? null : list24, (i12 & 536870912) != 0 ? null : list25, (i12 & 1073741824) != 0 ? null : list26, (i12 & Integer.MIN_VALUE) != 0 ? null : list27, (i13 & 1) != 0 ? null : list28, (i13 & 2) != 0 ? null : list29, (i13 & 4) != 0 ? null : list30, (i13 & 8) != 0 ? null : list31, (i13 & 16) != 0 ? null : list32, (i13 & 32) != 0 ? null : list33, (i13 & 64) != 0 ? null : list34, (i13 & 128) != 0 ? null : list35, (i13 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : list36, (i13 & 512) != 0 ? null : list37, (i13 & 1024) != 0 ? null : list38, (i13 & 2048) != 0 ? null : list39, (i13 & 4096) != 0 ? null : list40, (i13 & Segment.SIZE) != 0 ? null : bool, (i13 & 16384) != 0 ? null : bool2, (i13 & 32768) != 0 ? null : bool3, (i13 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : bool4, (i13 & 131072) != 0 ? 0 : i10, (i13 & 262144) != 0 ? null : bool5, (i13 & 524288) != 0 ? null : bool6, (i13 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? true : z10);
    }
}
