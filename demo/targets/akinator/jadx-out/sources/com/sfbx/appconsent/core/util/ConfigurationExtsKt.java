package com.sfbx.appconsent.core.util;

import ac.Models;
import com.sfbx.appconsent.core.api.AppConsentService;
import com.sfbx.appconsent.core.model.RemoteTheme;
import com.sfbx.appconsent.core.model.TranslatableText;
import com.sfbx.appconsent.core.model.api.proto.Configuration;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.o0;
import uu.o1;
import uu.p1;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigurationExtsKt {
    private static final List<TranslatableText> getText(I18NString i18NString) {
        Map<String, String> values;
        Set<String> setKeySet;
        if (i18NString == null || (values = i18NString.getValues()) == null || (setKeySet = values.keySet()) == null) {
            return null;
        }
        Set<String> set = setKeySet;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(set, 10));
        for (String str : set) {
            arrayList.add(new TranslatableText(str, (String) p1.getValue(i18NString.getValues(), str)));
        }
        return arrayList;
    }

    public static final Models.Configuration toProtoModel(Configuration configuration) {
        e0.checkNotNullParameter(configuration, "<this>");
        Models.Configuration.Builder builderAddAllXchangeVendors = Models.Configuration.newBuilder().setFallbackLanguage(configuration.getLanguage()).addAllXchangeVendors(configuration.getXchangeVendors());
        Map<String, I18NString> texts = configuration.getTexts();
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(texts.size()));
        Iterator<T> it = texts.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), HelloReplyExtsKt.toProtoModel((I18NString) entry.getValue()));
        }
        return builderAddAllXchangeVendors.putAllTexts(linkedHashMap).setUseBanner(configuration.getUseBanner()).setCtaLayout(configuration.getCtaLayout()).setUseSuccessScreen(configuration.getUseSuccessScreen()).putAllImages(configuration.getImages()).putAllActions(configuration.getActions()).putAllColors(configuration.getColors()).putAllConfigs(configuration.getConfigs()).setEnableLegintOnRefuseAll(configuration.getEnableLegintOnRefuseAll()).setContinueWithoutAccepting(configuration.getContinueWithoutAccepting()).setNotBannerDisplayPurposesList(configuration.isNotNeedToDisplayPurposesExampleUsage()).build();
    }

    public static final RemoteTheme toRemoteTheme(Configuration configuration) {
        List listListOf;
        Map<String, String> values;
        Set<String> setKeySet;
        Map<String, String> values2;
        Set<String> setKeySet2;
        if (configuration == null) {
            return new RemoteTheme((String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 0, (Boolean) null, (Boolean) null, false, -1, -1, 2097151, (u) null);
        }
        String language = configuration.getLanguage();
        I18NString i18NString = configuration.getTexts().get("fcode");
        if (i18NString == null || (values2 = i18NString.getValues()) == null || (setKeySet2 = values2.keySet()) == null || (listListOf = y0.toList(setKeySet2)) == null) {
            I18NString i18NString2 = configuration.getTexts().get("lcode");
            listListOf = (i18NString2 == null || (values = i18NString2.getValues()) == null || (setKeySet = values.keySet()) == null) ? o0.listOf(configuration.getLanguage()) : y0.toList(setKeySet);
        }
        List list = listListOf;
        List<TranslatableText> text = getText(configuration.getTexts().get("banner_title"));
        List<TranslatableText> text2 = getText(configuration.getTexts().get("banner_paragraphs_inner"));
        List<TranslatableText> text3 = getText(configuration.getTexts().get("banner_moreDetails_paragraphs"));
        List<TranslatableText> text4 = getText(configuration.getTexts().get("continue_without_accepting"));
        List<TranslatableText> text5 = getText(configuration.getTexts().get("buttons_openPrivacyCenter"));
        List<TranslatableText> text6 = getText(configuration.getTexts().get("buttons_acceptAll"));
        List<TranslatableText> text7 = getText(configuration.getTexts().get("buttons_refuseAll"));
        List<TranslatableText> text8 = getText(configuration.getTexts().get("knowmore"));
        List<TranslatableText> text9 = getText(configuration.getTexts().get("seemore"));
        List<TranslatableText> text10 = getText(configuration.getTexts().get("privacy_purpose_more"));
        List<TranslatableText> text11 = getText(configuration.getTexts().get("privacy_feature_more"));
        List<TranslatableText> text12 = getText(configuration.getTexts().get("save"));
        List<TranslatableText> text13 = getText(configuration.getTexts().get("privacy_vendors_link"));
        List<TranslatableText> text14 = getText(configuration.getTexts().get("close"));
        List<TranslatableText> text15 = getText(configuration.getTexts().get("consentable_legint_oppose"));
        List<TranslatableText> text16 = getText(configuration.getTexts().get("privacy_header"));
        List<TranslatableText> text17 = getText(configuration.getTexts().get("privacy_sections_purpose"));
        List<TranslatableText> text18 = getText(configuration.getTexts().get("privacy_sections_feature"));
        List<TranslatableText> text19 = getText(configuration.getTexts().get("mandatories_feature_title"));
        List<TranslatableText> text20 = getText(configuration.getTexts().get("mandatories_feature_desc"));
        List<TranslatableText> text21 = getText(configuration.getTexts().get("mandatories_purpose_title"));
        List<TranslatableText> text22 = getText(configuration.getTexts().get("mandatories_purpose_desc"));
        List<TranslatableText> text23 = getText(configuration.getTexts().get("consentable_purpose_vendors"));
        List<TranslatableText> text24 = getText(configuration.getTexts().get("mandatory_section_vendors"));
        List<TranslatableText> text25 = getText(configuration.getTexts().get("consentable_privacy_policy"));
        List<TranslatableText> text26 = getText(configuration.getTexts().get("vendor_privacy_policy"));
        List<TranslatableText> text27 = getText(configuration.getTexts().get("consentable_purpose_vendors"));
        List<TranslatableText> text28 = getText(configuration.getTexts().get("consentable_legints"));
        List<TranslatableText> text29 = getText(configuration.getTexts().get("vendors_tabs_iab"));
        List<TranslatableText> text30 = getText(configuration.getTexts().get("vendors_tabs_other"));
        List<TranslatableText> text31 = getText(configuration.getTexts().get("vendor_under_consent"));
        List<TranslatableText> text32 = getText(configuration.getTexts().get("vendor_under_legitimate_interest"));
        List<TranslatableText> text33 = getText(configuration.getTexts().get("vendor_compulsory"));
        List<TranslatableText> text34 = getText(configuration.getTexts().get("vendor_purpose"));
        List<TranslatableText> text35 = getText(configuration.getTexts().get("vendor_feature"));
        List<TranslatableText> text36 = getText(configuration.getTexts().get("vendors_header"));
        List<TranslatableText> text37 = getText(configuration.getTexts().get("success_title"));
        List<TranslatableText> text38 = getText(configuration.getTexts().get("success_saved"));
        List<TranslatableText> text39 = getText(configuration.getTexts().get("success_modify"));
        String str = configuration.getColors().get("actionBarColor");
        String str2 = configuration.getColors().get("actionBarTextColor");
        String str3 = configuration.getColors().get("bannerBackgroundColor");
        String str4 = configuration.getColors().get("buttonBackgroundColor");
        String str5 = configuration.getColors().get("buttonEnabledColor");
        String str6 = configuration.getColors().get("buttonSelectedColor");
        String str7 = configuration.getColors().get("buttonTextColor");
        String str8 = configuration.getColors().get("copyrightColor");
        String str9 = configuration.getColors().get("geoNoticeBannerBackgroundColor");
        String str10 = configuration.getColors().get("separatorColor");
        String str11 = configuration.getColors().get("statusBarColor");
        String str12 = configuration.getColors().get("switchOffButtonColor");
        String str13 = configuration.getColors().get("switchOffColor");
        String str14 = configuration.getColors().get("switchOnButtonColor");
        String str15 = configuration.getColors().get("switchOnColor");
        String str16 = configuration.getColors().get("switchUnsetColor");
        String str17 = configuration.getColors().get("textColor");
        String str18 = configuration.getColors().get("textColorDark");
        String str19 = configuration.getColors().get("vendorSeparatorColor");
        String str20 = configuration.getColors().get("vendorBackgroundColorDark");
        String str21 = configuration.getColors().get("acceptAllButtonBackground");
        String str22 = configuration.getColors().get("acceptAllButtonBorder");
        String str23 = configuration.getColors().get("acceptAllButtonText");
        String str24 = configuration.getColors().get("refuseAllButtonBackground");
        String str25 = configuration.getColors().get("refuseAllButtonBorder");
        String str26 = configuration.getColors().get("refuseAllButtonText");
        String str27 = configuration.getColors().get("setupButtonBackground");
        String str28 = configuration.getColors().get("setupButtonBorder");
        String str29 = configuration.getColors().get("setupButtonText");
        String str30 = configuration.getImages().get("geoAdvertizingIcon");
        String str31 = configuration.getImages().get("icon");
        String str32 = configuration.getImages().get("noticeSuccessImage");
        String str33 = configuration.getImages().get("onboardingImage");
        StringBuilder sb2 = new StringBuilder();
        AppConsentService.Companion companion = AppConsentService.Companion;
        sb2.append(companion.provideIllustrationBaseUrl());
        sb2.append("illustration-footer.webp");
        return new RemoteTheme(language, list, str17, str3, str10, str7, str5, str4, str11, str, str2, str8, str9, str16, str15, str14, str13, str12, str18, str6, str20, str19, str21, str22, str23, str24, str25, str26, str27, str28, str29, str33, str32, str30, sb2.toString(), companion.provideIllustrationBaseUrl() + "illustration-header.webp", companion.provideIllustrationBaseUrl() + "illustration-success.webp", str31, text, text2, text3, text5, text6, text7, text11, text12, text13, text14, text8, text4, text10, text15, text9, text17, text18, text26, text28, text16, text21, text22, text19, text20, text23, text24, text25, text29, text30, text31, text32, text33, text34, text35, text36, text27, text37, text38, text39, Boolean.valueOf(configuration.getHighlightAcceptAllButton()), (Boolean) null, Boolean.valueOf(configuration.getUseSuccessScreen()), configuration.getConfigs().get("tabletModalScreen"), configuration.getCtaLayout(), Boolean.valueOf(configuration.getContinueWithoutAccepting()), Boolean.valueOf(configuration.getEnableIllustrations()), !configuration.isNotNeedToDisplayPurposesExampleUsage(), 0, 0, 16384, (u) null);
    }
}
