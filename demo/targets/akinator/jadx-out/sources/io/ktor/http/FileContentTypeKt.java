package io.ktor.http;

import a.b;
import e3.g;
import io.ktor.http.ContentType;
import io.ktor.util.CharsetKt;
import io.ktor.util.TextKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import rv.t;
import sv.n0;
import tu.o;
import tu.q;
import tu.v;
import uu.o1;
import uu.p0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FileContentTypeKt {
    private static final o contentTypesByExtensions$delegate = q.lazy(FileContentTypeKt$contentTypesByExtensions$2.INSTANCE);
    private static final o extensionsByContentType$delegate = q.lazy(FileContentTypeKt$extensionsByContentType$2.INSTANCE);

    public static final ContentType defaultForFileExtension(ContentType.Companion companion, String extension) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(extension, "extension");
        return selectDefault(fromFileExtension(ContentType.Companion, extension));
    }

    public static final ContentType defaultForFilePath(ContentType.Companion companion, String path) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(path, "path");
        return selectDefault(fromFilePath(ContentType.Companion, path));
    }

    public static final List<String> fileExtensions(ContentType contentType) {
        e0.checkNotNullParameter(contentType, "<this>");
        List<String> list = getExtensionsByContentType().get(contentType);
        if (list != null) {
            return list;
        }
        List<String> list2 = getExtensionsByContentType().get(contentType.withoutParameters());
        return list2 == null ? p0.emptyList() : list2;
    }

    public static final List<ContentType> fromFileExtension(ContentType.Companion companion, String ext) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(ext, "ext");
        for (String lowerCasePreservingASCIIRules = TextKt.toLowerCasePreservingASCIIRules(n0.removePrefix(ext, (CharSequence) ".")); lowerCasePreservingASCIIRules.length() > 0; lowerCasePreservingASCIIRules = n0.substringAfter(lowerCasePreservingASCIIRules, ".", "")) {
            List<ContentType> list = getContentTypesByExtensions().get(lowerCasePreservingASCIIRules);
            if (list != null) {
                return list;
            }
        }
        return p0.emptyList();
    }

    public static final List<ContentType> fromFilePath(ContentType.Companion companion, String path) {
        e0.checkNotNullParameter(companion, "<this>");
        e0.checkNotNullParameter(path, "path");
        int iIndexOf$default = n0.indexOf$default((CharSequence) path, '.', n0.lastIndexOfAny$default((CharSequence) path, CharsetKt.toCharArray("/\\"), 0, false, 6, (Object) null) + 1, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            return p0.emptyList();
        }
        String strSubstring = path.substring(iIndexOf$default + 1);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return fromFileExtension(companion, strSubstring);
    }

    private static final Map<String, List<ContentType>> getContentTypesByExtensions() {
        return (Map) contentTypesByExtensions$delegate.getValue();
    }

    private static final Map<ContentType, List<String>> getExtensionsByContentType() {
        return (Map) extensionsByContentType$delegate.getValue();
    }

    public static final <A, B> Map<A, List<B>> groupByPairs(t tVar) {
        e0.checkNotNullParameter(tVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : tVar) {
            Object first = ((v) obj).getFirst();
            Object objP = linkedHashMap.get(first);
            if (objP == null) {
                objP = g.p(linkedHashMap, first);
            }
            ((List) objP).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(o1.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((v) it.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }

    private static final boolean matchApplicationTypeWithCharset(ContentType contentType) {
        ContentType.Application application = ContentType.Application.INSTANCE;
        if (contentType.match(application.getAny())) {
            return contentType.match(application.getAtom()) || contentType.match(application.getJavaScript()) || contentType.match(application.getRss()) || contentType.match(application.getXml()) || contentType.match(application.getXml_Dtd());
        }
        return false;
    }

    public static final ContentType selectDefault(List<ContentType> list) {
        e0.checkNotNullParameter(list, "<this>");
        ContentType octetStream = (ContentType) y0.firstOrNull((List) list);
        if (octetStream == null) {
            octetStream = ContentType.Application.INSTANCE.getOctetStream();
        }
        return octetStream.match(ContentType.Text.INSTANCE.getAny()) ? withCharsetUTF8IfNeeded(octetStream) : octetStream.match(ContentType.Image.INSTANCE.getSVG()) ? withCharsetUTF8IfNeeded(octetStream) : matchApplicationTypeWithCharset(octetStream) ? withCharsetUTF8IfNeeded(octetStream) : octetStream;
    }

    public static final ContentType toContentType(String str) {
        e0.checkNotNullParameter(str, "<this>");
        try {
            return ContentType.Companion.parse(str);
        } catch (Throwable th2) {
            throw new IllegalArgumentException(b.k("Failed to parse ", str), th2);
        }
    }

    private static final ContentType withCharsetUTF8IfNeeded(ContentType contentType) {
        return ContentTypesKt.charset(contentType) != null ? contentType : ContentTypesKt.withCharset(contentType, sv.g.f86134b);
    }
}
