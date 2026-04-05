package io.ktor.http;

import kotlin.jvm.internal.f0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CodecsKt$encodeURLPath$1$1 extends f0 implements l {
    final /* synthetic */ StringBuilder $this_buildString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodecsKt$encodeURLPath$1$1(StringBuilder sb2) {
        super(1);
        this.$this_buildString = sb2;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).byteValue());
        return x0.f87415a;
    }

    public final void invoke(byte b10) {
        this.$this_buildString.append(CodecsKt.percentEncode(b10));
    }
}
