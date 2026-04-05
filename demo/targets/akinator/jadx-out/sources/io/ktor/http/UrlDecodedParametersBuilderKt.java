package io.ktor.http;

import io.ktor.util.StringValues;
import io.ktor.util.StringValuesBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.p0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UrlDecodedParametersBuilderKt {
    private static final void appendAllDecoded(StringValuesBuilder stringValuesBuilder, StringValuesBuilder stringValuesBuilder2) {
        for (String str : stringValuesBuilder2.names()) {
            List<String> all = stringValuesBuilder2.getAll(str);
            if (all == null) {
                all = p0.emptyList();
            }
            String strDecodeURLQueryComponent$default = CodecsKt.decodeURLQueryComponent$default(str, 0, 0, false, null, 15, null);
            List<String> list = all;
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CodecsKt.decodeURLQueryComponent$default((String) it.next(), 0, 0, true, null, 11, null));
            }
            stringValuesBuilder.appendAll(strDecodeURLQueryComponent$default, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendAllEncoded(StringValuesBuilder stringValuesBuilder, StringValues stringValues) {
        for (String str : stringValues.names()) {
            List<String> all = stringValues.getAll(str);
            if (all == null) {
                all = p0.emptyList();
            }
            String strEncodeURLParameter$default = CodecsKt.encodeURLParameter$default(str, false, 1, null);
            List<String> list = all;
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CodecsKt.encodeURLParameterValue((String) it.next()));
            }
            stringValuesBuilder.appendAll(strEncodeURLParameter$default, arrayList);
        }
    }

    public static final Parameters decodeParameters(StringValuesBuilder parameters) {
        e0.checkNotNullParameter(parameters, "parameters");
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        appendAllDecoded(parametersBuilderParametersBuilder$default, parameters);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static final ParametersBuilder encodeParameters(StringValues parameters) {
        e0.checkNotNullParameter(parameters, "parameters");
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        appendAllEncoded(parametersBuilderParametersBuilder$default, parameters);
        return parametersBuilderParametersBuilder$default;
    }
}
