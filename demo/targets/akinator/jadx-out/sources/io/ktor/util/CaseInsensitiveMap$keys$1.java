package io.ktor.util;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CaseInsensitiveMap$keys$1 extends f0 implements l {
    public static final CaseInsensitiveMap$keys$1 INSTANCE = new CaseInsensitiveMap$keys$1();

    public CaseInsensitiveMap$keys$1() {
        super(1);
    }

    @Override // kv.l
    public final String invoke(CaseInsensitiveString $receiver) {
        e0.checkNotNullParameter($receiver, "$this$$receiver");
        return $receiver.getContent();
    }
}
