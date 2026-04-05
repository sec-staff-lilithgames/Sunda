package io.ktor.http;

import be.nVUQ.UupKET;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.Parameters;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import sv.g;
import sv.n0;
import tu.v;
import uu.o0;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpUrlEncodedKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.HttpUrlEncodedKt$formUrlEncodeTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public final CharSequence invoke(v it) throws Throwable {
            e0.checkNotNullParameter(it, "it");
            String strEncodeURLParameter = CodecsKt.encodeURLParameter((String) it.getFirst(), true);
            if (it.getSecond() == null) {
                return strEncodeURLParameter;
            }
            return strEncodeURLParameter + G5.T + CodecsKt.encodeURLParameterValue(String.valueOf(it.getSecond()));
        }
    }

    public static final String formUrlEncode(List<v> list) throws IOException {
        e0.checkNotNullParameter(list, "<this>");
        StringBuilder sb2 = new StringBuilder();
        formUrlEncodeTo(list, sb2);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void formUrlEncodeTo(List<v> list, Appendable out) throws IOException {
        e0.checkNotNullParameter(list, "<this>");
        e0.checkNotNullParameter(out, "out");
        y0.joinTo(list, out, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 2) != 0 ? ", " : C3191e4.i.f36527c, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 4) != 0 ? "" : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 8) == 0 ? null : "", (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 16) != 0 ? -1 : 0, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 32) != 0 ? APSSharedUtil.TRUNCATE_SEPARATOR : null, (Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE & 64) != 0 ? null : AnonymousClass1.INSTANCE);
    }

    public static /* synthetic */ Parameters parseUrlEncodedParameters$default(String str, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = g.f86134b;
        }
        if ((i11 & 2) != 0) {
            i10 = 1000;
        }
        return parseUrlEncodedParameters(str, charset, i10);
    }

    public static final String formUrlEncode(Parameters parameters) {
        e0.checkNotNullParameter(parameters, "<this>");
        Set<Map.Entry<String, List<String>>> setEntries = parameters.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(tu.e0.to(entry.getKey(), (String) it2.next()));
            }
            v0.addAll(arrayList, arrayList2);
        }
        return formUrlEncode(arrayList);
    }

    public static final void formUrlEncodeTo(Parameters parameters, Appendable out) throws IOException {
        e0.checkNotNullParameter(parameters, "<this>");
        e0.checkNotNullParameter(out, "out");
        formUrlEncodeTo(parameters.entries(), out);
    }

    public static final Parameters parseUrlEncodedParameters(String str, Charset defaultEncoding, int i10) {
        Object next;
        String name;
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(defaultEncoding, "defaultEncoding");
        List<String> listSplit$default = n0.split$default((CharSequence) str, new String[]{C3191e4.i.f36527c}, false, i10, 2, (Object) null);
        ArrayList<v> arrayList = new ArrayList(q0.collectionSizeOrDefault(listSplit$default, 10));
        for (String str2 : listSplit$default) {
            arrayList.add(tu.e0.to(n0.substringBefore$default(str2, C3191e4.i.f36525b, (String) null, 2, (Object) null), n0.substringAfter(str2, C3191e4.i.f36525b, UupKET.jQnBZzfFvkwiCO)));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e0.areEqual(((v) next).getFirst(), "_charset_")) {
                break;
            }
        }
        v vVar = (v) next;
        if (vVar == null || (name = (String) vVar.getSecond()) == null) {
            name = CharsetJVMKt.getName(defaultEncoding);
        }
        Charset charset = Charset.forName(name);
        Parameters.Companion companion = Parameters.Companion;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        for (v vVar2 : arrayList) {
            String str3 = (String) vVar2.component1();
            String str4 = (String) vVar2.component2();
            e0.checkNotNullExpressionValue(charset, "charset");
            parametersBuilderParametersBuilder$default.append(CodecsKt.decodeURLQueryComponent$default(str3, 0, 0, false, charset, 7, null), CodecsKt.decodeURLQueryComponent$default(str4, 0, 0, false, charset, 7, null));
        }
        return parametersBuilderParametersBuilder$default.build();
    }

    public static final void formUrlEncodeTo(ParametersBuilder parametersBuilder, Appendable out) throws IOException {
        e0.checkNotNullParameter(parametersBuilder, "<this>");
        e0.checkNotNullParameter(out, "out");
        formUrlEncodeTo(parametersBuilder.entries(), out);
    }

    public static final void formUrlEncodeTo(Set<? extends Map.Entry<String, ? extends List<String>>> set, Appendable out) throws IOException {
        List listListOf;
        e0.checkNotNullParameter(set, "<this>");
        e0.checkNotNullParameter(out, "out");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listListOf = o0.listOf(tu.e0.to(str, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(tu.e0.to(str, (String) it2.next()));
                }
                listListOf = arrayList2;
            }
            v0.addAll(arrayList, listListOf);
        }
        formUrlEncodeTo(arrayList, out);
    }
}
