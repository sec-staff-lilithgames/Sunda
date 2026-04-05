package io.ktor.http;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.l;
import tu.v;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FileContentTypeKt$extensionsByContentType$2 extends f0 implements a {
    public static final FileContentTypeKt$extensionsByContentType$2 INSTANCE = new FileContentTypeKt$extensionsByContentType$2();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.http.FileContentTypeKt$extensionsByContentType$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public final v invoke(v vVar) {
            e0.checkNotNullParameter(vVar, "<name for destructuring parameter 0>");
            return tu.e0.to((ContentType) vVar.component2(), (String) vVar.component1());
        }
    }

    public FileContentTypeKt$extensionsByContentType$2() {
        super(0);
    }

    @Override // kv.a
    public final Map<ContentType, List<String>> invoke() {
        return FileContentTypeKt.groupByPairs(rv.f0.map(y0.asSequence(MimesKt.getMimes()), AnonymousClass1.INSTANCE));
    }
}
