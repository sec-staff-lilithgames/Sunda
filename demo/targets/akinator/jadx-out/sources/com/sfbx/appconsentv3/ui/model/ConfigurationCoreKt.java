package com.sfbx.appconsentv3.ui.model;

import com.sfbx.appconsent.core.model.api.proto.Configuration;
import com.sfbx.appconsent.core.model.api.proto.I18NString;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.o1;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ConfigurationCoreKt {
    public static final ConfigurationCore convertTo(Configuration configuration) {
        e0.checkNotNullParameter(configuration, "<this>");
        String language = configuration.getLanguage();
        List list = y0.toList(configuration.getXchangeVendors());
        Map<String, I18NString> texts = configuration.getTexts();
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(texts.size()));
        Iterator<T> it = texts.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new I18NStringCore(((I18NString) entry.getValue()).getValues()));
        }
        return new ConfigurationCore(language, list, p1.toMap(linkedHashMap), configuration.getUseBanner(), configuration.getCtaLayout(), configuration.getHighlightAcceptAllButton(), configuration.getUseSuccessScreen(), p1.toMap(configuration.getImages()), p1.toMap(configuration.getActions()), p1.toMap(configuration.getColors()), p1.toMap(configuration.getConfigs()), configuration.getEnableLegintOnRefuseAll(), configuration.getContinueWithoutAccepting(), configuration.getEnableIllustrations());
    }
}
