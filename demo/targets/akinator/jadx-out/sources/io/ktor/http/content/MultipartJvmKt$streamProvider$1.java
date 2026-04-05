package io.ktor.http.content;

import io.ktor.http.content.PartData;
import io.ktor.util.InputJvmKt;
import io.ktor.utils.io.core.Input;
import java.io.InputStream;
import kotlin.jvm.internal.f0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MultipartJvmKt$streamProvider$1 extends f0 implements a {
    final /* synthetic */ PartData.FileItem $this_streamProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartJvmKt$streamProvider$1(PartData.FileItem fileItem) {
        super(0);
        this.$this_streamProvider = fileItem;
    }

    @Override // kv.a
    public final InputStream invoke() {
        return InputJvmKt.asStream((Input) this.$this_streamProvider.getProvider().invoke());
    }
}
