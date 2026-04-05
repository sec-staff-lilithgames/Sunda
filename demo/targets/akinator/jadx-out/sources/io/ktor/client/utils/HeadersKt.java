package io.ktor.client.utils;

import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HeadersKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.utils.HeadersKt$buildHeaders$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(HeadersBuilder headersBuilder) {
            e0.checkNotNullParameter(headersBuilder, "$this$null");
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HeadersBuilder) obj);
            return x0.f87415a;
        }
    }

    public static final Headers buildHeaders(l block) {
        e0.checkNotNullParameter(block, "block");
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        block.invoke(headersBuilder);
        return headersBuilder.build();
    }

    public static /* synthetic */ Headers buildHeaders$default(l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        return buildHeaders(lVar);
    }
}
