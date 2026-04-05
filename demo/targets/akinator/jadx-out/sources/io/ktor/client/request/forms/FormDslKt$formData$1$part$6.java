package io.ktor.client.request.forms;

import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Input;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FormDslKt$formData$1$part$6 extends f0 implements a {
    final /* synthetic */ Object $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormDslKt$formData$1$part$6(Object obj) {
        super(0);
        this.$value = obj;
    }

    @Override // kv.a
    public final Input invoke() {
        return ((ByteReadPacket) this.$value).copy();
    }
}
