package io.ktor.http;

import io.ktor.util.CollectionsKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kv.a;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FileContentTypeKt$contentTypesByExtensions$2 extends f0 implements a {
    public static final FileContentTypeKt$contentTypesByExtensions$2 INSTANCE = new FileContentTypeKt$contentTypesByExtensions$2();

    public FileContentTypeKt$contentTypesByExtensions$2() {
        super(0);
    }

    @Override // kv.a
    public final Map<String, List<ContentType>> invoke() {
        Map<String, List<ContentType>> mapCaseInsensitiveMap = CollectionsKt.caseInsensitiveMap();
        mapCaseInsensitiveMap.putAll(FileContentTypeKt.groupByPairs(y0.asSequence(MimesKt.getMimes())));
        return mapCaseInsensitiveMap;
    }
}
