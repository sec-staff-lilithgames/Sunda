package io.bidmachine;

import io.bidmachine.analytics.MonitorConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.protobuf.sdk.Monitor;
import io.bidmachine.protobuf.sdk.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c1 {
    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Monitor.Configuration configuration = (Monitor.Configuration) it.next();
            arrayList.add(new MonitorConfig(configuration.getName().getValue(), configuration.getUrl().getValue(), configuration.getBatchSize().getValue(), configuration.getInterval().getValue(), configuration.hasShouldReport() ? configuration.getShouldReport().getValue() : false));
        }
        return arrayList;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reader.Configuration configuration = (Reader.Configuration) it.next();
            boolean value = configuration.hasUniqueOnly() ? configuration.getUniqueOnly().getValue() : true;
            String value2 = configuration.getName().getValue();
            String value3 = configuration.getUrl().getValue();
            long value4 = configuration.getUpdateInterval().getValue();
            List<Reader.Rule> rulesList = configuration.getRulesList();
            ArrayList arrayList2 = new ArrayList();
            for (Reader.Rule rule : rulesList) {
                if (rule.hasGeneralRule()) {
                    Reader.Rule.GeneralRule generalRule = rule.getGeneralRule();
                    arrayList2.add(new ReaderConfig.Rule(generalRule.getTag().getValue(), generalRule.getPath().getValue()));
                }
            }
            arrayList.add(new ReaderConfig(value2, value3, value4, value, arrayList2));
        }
        return arrayList;
    }
}
