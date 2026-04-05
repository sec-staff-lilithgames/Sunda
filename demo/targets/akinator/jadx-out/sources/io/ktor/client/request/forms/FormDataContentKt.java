package io.ktor.client.request.forms;

import bv.d;
import bv.f;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.e0;
import sv.e;
import sv.g;
import sv.k0;
import sv.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FormDataContentKt {
    private static final byte[] RN_BYTES;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.request.forms.FormDataContentKt", f = "FormDataContent.kt", i = {1, 1, 1, 2, 2}, l = {162, 177, 184, 184}, m = "copyTo", n = {"$this$copyTo", "channel", "$this$write_u24default$iv", "$this$copyTo", "channel"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: io.ktor.client.request.forms.FormDataContentKt$copyTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FormDataContentKt.copyTo(null, null, this);
        }
    }

    static {
        byte[] bArrEncodeToByteArray;
        Charset charset = g.f86134b;
        if (e0.areEqual(charset, charset)) {
            bArrEncodeToByteArray = k0.encodeToByteArray("\r\n");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, "\r\n", 0, 2);
        }
        RN_BYTES = bArrEncodeToByteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Path cross not found for [B:10:0x002c, B:20:0x0071], limit reached: 54 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00d6 -> B:27:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.core.Input r18, io.ktor.utils.io.ByteWriteChannel r19, zu.d<? super tu.x0> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.request.forms.FormDataContentKt.copyTo(io.ktor.utils.io.core.Input, io.ktor.utils.io.ByteWriteChannel, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String generateBoundary() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 32; i10++) {
            String string = Integer.toString(ov.g.f79860b.nextInt(), e.checkRadix(16));
            e0.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
        }
        String string2 = sb2.toString();
        e0.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        return p0.take(string2, 70);
    }
}
