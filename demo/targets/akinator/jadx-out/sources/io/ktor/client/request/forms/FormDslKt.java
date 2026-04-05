package io.ktor.client.request.forms;

import io.ktor.http.ContentType;
import io.ktor.http.HeaderValueWithParametersKt;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.PartData;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Input;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.a;
import kv.l;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class FormDslKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.request.forms.FormDslKt$append$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements a {
        final /* synthetic */ l $bodyBuilder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar) {
            super(0);
            this.$bodyBuilder = lVar;
        }

        @Override // kv.a
        public final Input invoke() {
            l lVar = this.$bodyBuilder;
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
            try {
                lVar.invoke(bytePacketBuilder);
                return bytePacketBuilder.build();
            } catch (Throwable th2) {
                bytePacketBuilder.release();
                throw th2;
            }
        }
    }

    public static final void append(FormBuilder formBuilder, String key, Headers headers, Long l9, l bodyBuilder) {
        e0.checkNotNullParameter(formBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        formBuilder.append(new FormPart(key, new InputProvider(l9, new AnonymousClass2(bodyBuilder)), headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String key, Headers headers, Long l9, l bodyBuilder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            headers = Headers.Companion.getEmpty();
        }
        if ((i10 & 4) != 0) {
            l9 = null;
        }
        e0.checkNotNullParameter(formBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(headers, "headers");
        e0.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        formBuilder.append(new FormPart(key, new InputProvider(l9, new AnonymousClass2(bodyBuilder)), headers));
    }

    public static final List<PartData> formData(FormPart<?>... values) {
        PartData binaryChannelItem;
        e0.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList();
        for (FormPart<?> formPart : values) {
            String strComponent1 = formPart.component1();
            Object objComponent2 = formPart.component2();
            Headers headersComponent3 = formPart.component3();
            HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
            HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
            headersBuilder.append(httpHeaders.getContentDisposition(), "form-data; name=" + HeaderValueWithParametersKt.escapeIfNeeded(strComponent1));
            headersBuilder.appendAll(headersComponent3);
            if (objComponent2 instanceof String) {
                binaryChannelItem = new PartData.FormItem((String) objComponent2, FormDslKt$formData$1$part$1.INSTANCE, headersBuilder.build());
            } else if (objComponent2 instanceof Number) {
                binaryChannelItem = new PartData.FormItem(objComponent2.toString(), FormDslKt$formData$1$part$2.INSTANCE, headersBuilder.build());
            } else if (objComponent2 instanceof Boolean) {
                binaryChannelItem = new PartData.FormItem(objComponent2.toString(), FormDslKt$formData$1$part$3.INSTANCE, headersBuilder.build());
            } else if (objComponent2 instanceof byte[]) {
                headersBuilder.append(httpHeaders.getContentLength(), String.valueOf(((byte[]) objComponent2).length));
                binaryChannelItem = new PartData.BinaryItem(new FormDslKt$formData$1$part$4(objComponent2), FormDslKt$formData$1$part$5.INSTANCE, headersBuilder.build());
            } else if (objComponent2 instanceof ByteReadPacket) {
                headersBuilder.append(httpHeaders.getContentLength(), String.valueOf(((ByteReadPacket) objComponent2).getRemaining()));
                binaryChannelItem = new PartData.BinaryItem(new FormDslKt$formData$1$part$6(objComponent2), new FormDslKt$formData$1$part$7(objComponent2), headersBuilder.build());
            } else if (objComponent2 instanceof InputProvider) {
                InputProvider inputProvider = (InputProvider) objComponent2;
                Long size = inputProvider.getSize();
                if (size != null) {
                    headersBuilder.append(httpHeaders.getContentLength(), size.toString());
                }
                binaryChannelItem = new PartData.BinaryItem(inputProvider.getBlock(), FormDslKt$formData$1$part$8.INSTANCE, headersBuilder.build());
            } else {
                if (!(objComponent2 instanceof ChannelProvider)) {
                    if (!(objComponent2 instanceof Input)) {
                        throw new IllegalStateException(o2.o(objComponent2, "Unknown form content type: "));
                    }
                    throw new IllegalStateException(("Can't use [Input] as part of form: " + objComponent2 + ". Consider using [InputProvider] instead.").toString());
                }
                ChannelProvider channelProvider = (ChannelProvider) objComponent2;
                Long size2 = channelProvider.getSize();
                if (size2 != null) {
                    headersBuilder.append(httpHeaders.getContentLength(), size2.toString());
                }
                binaryChannelItem = new PartData.BinaryChannelItem(channelProvider.getBlock(), headersBuilder.build());
            }
            arrayList.add(binaryChannelItem);
        }
        return arrayList;
    }

    public static final void append(FormBuilder formBuilder, String key, String filename, ContentType contentType, Long l9, l bodyBuilder) {
        e0.checkNotNullParameter(formBuilder, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(filename, "filename");
        e0.checkNotNullParameter(bodyBuilder, "bodyBuilder");
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        headersBuilder.set(httpHeaders.getContentDisposition(), "filename=" + HeaderValueWithParametersKt.escapeIfNeeded(filename));
        if (contentType != null) {
            headersBuilder.set(httpHeaders.getContentType(), contentType.toString());
        }
        formBuilder.append(new FormPart(key, new InputProvider(l9, new AnonymousClass2(bodyBuilder)), headersBuilder.build()));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, String str2, ContentType contentType, Long l9, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            contentType = null;
        }
        if ((i10 & 8) != 0) {
            l9 = null;
        }
        append(formBuilder, str, str2, contentType, l9, lVar);
    }

    public static final List<PartData> formData(l block) {
        e0.checkNotNullParameter(block, "block");
        FormBuilder formBuilder = new FormBuilder();
        block.invoke(formBuilder);
        FormPart[] formPartArr = (FormPart[]) formBuilder.build$ktor_client_core().toArray(new FormPart[0]);
        return formData((FormPart<?>[]) Arrays.copyOf(formPartArr, formPartArr.length));
    }
}
