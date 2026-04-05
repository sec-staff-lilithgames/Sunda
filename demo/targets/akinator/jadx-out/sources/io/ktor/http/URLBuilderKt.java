package io.ktor.http;

import com.ironsource.C3191e4;
import h2.rl.UeklptUrP;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import sv.n0;
import tu.f;
import tu.x0;
import uu.k0;
import uu.p0;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class URLBuilderKt {
    public static final int DEFAULT_PORT = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.URLBuilderKt$set$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(URLBuilder uRLBuilder) {
            e0.checkNotNullParameter(uRLBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((URLBuilder) obj);
            return x0.f87415a;
        }
    }

    public static final URLBuilder appendEncodedPathSegments(URLBuilder uRLBuilder, List<String> segments) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(segments, "segments");
        boolean z10 = false;
        boolean z11 = uRLBuilder.getEncodedPathSegments().size() > 1 && ((CharSequence) y0.last((List) uRLBuilder.getEncodedPathSegments())).length() == 0 && !segments.isEmpty();
        if (segments.size() > 1 && ((CharSequence) y0.first((List) segments)).length() == 0 && !uRLBuilder.getEncodedPathSegments().isEmpty()) {
            z10 = true;
        }
        uRLBuilder.setEncodedPathSegments((z11 && z10) ? y0.plus((Collection) y0.dropLast(uRLBuilder.getEncodedPathSegments(), 1), (Iterable) y0.drop(segments, 1)) : z11 ? y0.plus((Collection) y0.dropLast(uRLBuilder.getEncodedPathSegments(), 1), (Iterable) segments) : z10 ? y0.plus((Collection) uRLBuilder.getEncodedPathSegments(), (Iterable) y0.drop(segments, 1)) : y0.plus((Collection) uRLBuilder.getEncodedPathSegments(), (Iterable) segments));
        return uRLBuilder;
    }

    private static final void appendFile(Appendable appendable, String str, String str2) throws IOException {
        appendable.append("://");
        appendable.append(str);
        if (!n0.startsWith$default((CharSequence) str2, '/', false, 2, (Object) null)) {
            appendable.append('/');
        }
        appendable.append(str2);
    }

    private static final void appendMailto(Appendable appendable, String str, String str2) throws IOException {
        appendable.append(":");
        appendable.append(str);
        appendable.append(str2);
    }

    public static final URLBuilder appendPathSegments(URLBuilder uRLBuilder, List<String> segments, boolean z10) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(segments, "segments");
        if (!z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = segments.iterator();
            while (it.hasNext()) {
                v0.addAll(arrayList, n0.split$default((CharSequence) it.next(), new char[]{'/'}, false, 0, 6, (Object) null));
            }
            segments = arrayList;
        }
        List<String> list = segments;
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(CodecsKt.encodeURLPathPart((String) it2.next()));
        }
        appendEncodedPathSegments(uRLBuilder, arrayList2);
        return uRLBuilder;
    }

    public static /* synthetic */ URLBuilder appendPathSegments$default(URLBuilder uRLBuilder, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return appendPathSegments(uRLBuilder, (List<String>) list, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <A extends Appendable> A appendTo(URLBuilder uRLBuilder, A a10) throws IOException {
        a10.append(uRLBuilder.getProtocol().getName());
        String name = uRLBuilder.getProtocol().getName();
        if (e0.areEqual(name, C3191e4.h.f36473b)) {
            appendFile(a10, uRLBuilder.getHost(), getEncodedPath(uRLBuilder));
            return a10;
        }
        if (e0.areEqual(name, "mailto")) {
            appendMailto(a10, getEncodedUserAndPassword(uRLBuilder), uRLBuilder.getHost());
            return a10;
        }
        a10.append("://");
        a10.append(getAuthority(uRLBuilder));
        URLUtilsKt.appendUrlFullPath(a10, getEncodedPath(uRLBuilder), uRLBuilder.getEncodedParameters(), uRLBuilder.getTrailingQuery());
        if (uRLBuilder.getEncodedFragment().length() > 0) {
            a10.append('#');
            a10.append(uRLBuilder.getEncodedFragment());
        }
        return a10;
    }

    public static final URLBuilder clone(URLBuilder uRLBuilder) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        return URLUtilsKt.takeFrom(new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null), uRLBuilder);
    }

    public static final String getAuthority(URLBuilder uRLBuilder) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getEncodedUserAndPassword(uRLBuilder));
        sb2.append(uRLBuilder.getHost());
        if (uRLBuilder.getPort() != 0 && uRLBuilder.getPort() != uRLBuilder.getProtocol().getDefaultPort()) {
            sb2.append(":");
            sb2.append(String.valueOf(uRLBuilder.getPort()));
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String getEncodedPath(URLBuilder uRLBuilder) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        return joinPath(uRLBuilder.getEncodedPathSegments());
    }

    public static final String getEncodedUserAndPassword(URLBuilder uRLBuilder) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        StringBuilder sb2 = new StringBuilder();
        URLUtilsKt.appendUserAndPassword(sb2, uRLBuilder.getEncodedUser(), uRLBuilder.getEncodedPassword());
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final String joinPath(List<String> list) {
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) y0.first((List) list)).length() == 0 ? "/" : (String) y0.first((List) list) : y0.joinToString$default(list, "/", null, null, 0, null, null, 62, null);
    }

    public static final void path(URLBuilder uRLBuilder, String... path) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(path, "path");
        ArrayList arrayList = new ArrayList(path.length);
        for (String str : path) {
            arrayList.add(CodecsKt.encodeURLPath(str));
        }
        uRLBuilder.setEncodedPathSegments(arrayList);
    }

    @f
    public static final URLBuilder pathComponents(URLBuilder uRLBuilder, String... strArr) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(strArr, UeklptUrP.rMane);
        return appendPathSegments$default(uRLBuilder, k0.toList(strArr), false, 2, (Object) null);
    }

    public static final void set(URLBuilder uRLBuilder, String str, String str2, Integer num, String str3, l block) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(block, "block");
        if (str != null) {
            uRLBuilder.setProtocol(URLProtocol.Companion.createOrDefault(str));
        }
        if (str2 != null) {
            uRLBuilder.setHost(str2);
        }
        if (num != null) {
            uRLBuilder.setPort(num.intValue());
        }
        if (str3 != null) {
            setEncodedPath(uRLBuilder, str3);
        }
        block.invoke(uRLBuilder);
    }

    public static /* synthetic */ void set$default(URLBuilder uRLBuilder, String str, String str2, Integer num, String str3, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        if ((i10 & 16) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        set(uRLBuilder, str, str2, num, str3, lVar);
    }

    public static final void setEncodedPath(URLBuilder uRLBuilder, String value) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(value, "value");
        uRLBuilder.setEncodedPathSegments(n0.isBlank(value) ? p0.emptyList() : e0.areEqual(value, "/") ? URLParserKt.getROOT_PATH() : y0.toMutableList((Collection) n0.split$default((CharSequence) value, new char[]{'/'}, false, 0, 6, (Object) null)));
    }

    public static /* synthetic */ URLBuilder appendPathSegments$default(URLBuilder uRLBuilder, String[] strArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return appendPathSegments(uRLBuilder, strArr, z10);
    }

    @f
    public static final URLBuilder pathComponents(URLBuilder uRLBuilder, List<String> components) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(components, "components");
        return appendPathSegments$default(uRLBuilder, (List) components, false, 2, (Object) null);
    }

    public static final URLBuilder appendEncodedPathSegments(URLBuilder uRLBuilder, String... components) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(components, "components");
        return appendEncodedPathSegments(uRLBuilder, (List<String>) k0.toList(components));
    }

    public static final URLBuilder appendPathSegments(URLBuilder uRLBuilder, String[] components, boolean z10) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(components, "components");
        return appendPathSegments(uRLBuilder, (List<String>) k0.toList(components), z10);
    }

    @f
    public static final /* synthetic */ URLBuilder appendPathSegments(URLBuilder uRLBuilder, List segments) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(segments, "segments");
        return appendPathSegments(uRLBuilder, (List<String>) segments, false);
    }

    @f
    public static final /* synthetic */ URLBuilder appendPathSegments(URLBuilder uRLBuilder, String... components) {
        e0.checkNotNullParameter(uRLBuilder, "<this>");
        e0.checkNotNullParameter(components, "components");
        return appendPathSegments(uRLBuilder, (List<String>) k0.toList(components), false);
    }
}
