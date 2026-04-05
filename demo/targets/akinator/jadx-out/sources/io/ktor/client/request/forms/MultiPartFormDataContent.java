package io.ktor.client.request.forms;

import a.b;
import bv.d;
import bv.f;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.client.request.forms.PreparedPart;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.PartData;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.OutputKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.g;
import sv.k0;
import tu.t;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MultiPartFormDataContent extends OutgoingContent.WriteChannelContent {
    private final int BODY_OVERHEAD_SIZE;
    private final byte[] BOUNDARY_BYTES;
    private final byte[] LAST_BOUNDARY_BYTES;
    private final int PART_OVERHEAD_SIZE;
    private final String boundary;
    private Long contentLength;
    private final ContentType contentType;
    private final List<PreparedPart> rawParts;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6}, l = {116, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 127, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 134}, m = "writeTo", n = {"this", "channel", "part", "this", "channel", "part", "this", "channel", "part", "this", "channel", "$this$use$iv", "closed$iv", "this", "channel", "this", "channel", "channel"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    /* renamed from: io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiPartFormDataContent.this.writeTo(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MultiPartFormDataContent(List list, String str, ContentType contentType, int i10, u uVar) {
        str = (i10 & 2) != 0 ? FormDataContentKt.generateBoundary() : str;
        this(list, str, (i10 & 4) != 0 ? ContentType.MultiPart.INSTANCE.getFormData().withParameter("boundary", str) : contentType);
    }

    public final String getBoundary() {
        return this.boundary;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0143, code lost:
    
        if (io.ktor.client.request.forms.FormDataContentKt.copyTo((io.ktor.utils.io.core.Input) r9, r4, r0) == r1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a8, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelKt.writeFully(r9, r10, r0) == r1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ed, B:53:0x0104, B:79:0x0180, B:83:0x0199, B:43:0x00c3), top: B:96:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104 A[Catch: all -> 0x0035, PHI: r2 r4 r5 r9
      0x0104: PHI (r2v19 java.util.Iterator<io.ktor.client.request.forms.PreparedPart>) = 
      (r2v5 java.util.Iterator<io.ktor.client.request.forms.PreparedPart>)
      (r2v20 java.util.Iterator<io.ktor.client.request.forms.PreparedPart>)
     binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r4v21 io.ktor.client.request.forms.PreparedPart) = (r4v6 io.ktor.client.request.forms.PreparedPart), (r4v23 io.ktor.client.request.forms.PreparedPart) binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r5v12 io.ktor.client.request.forms.MultiPartFormDataContent) = 
      (r5v3 io.ktor.client.request.forms.MultiPartFormDataContent)
      (r5v13 io.ktor.client.request.forms.MultiPartFormDataContent)
     binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r9v37 io.ktor.utils.io.ByteWriteChannel) = (r9v11 io.ktor.utils.io.ByteWriteChannel), (r9v39 io.ktor.utils.io.ByteWriteChannel) binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ed, B:53:0x0104, B:79:0x0180, B:83:0x0199, B:43:0x00c3), top: B:96:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #6 {all -> 0x008e, blocks: (B:57:0x011e, B:59:0x0122, B:63:0x0147, B:72:0x0158, B:74:0x015c, B:71:0x0157, B:32:0x0089, B:37:0x00a2, B:40:0x00b9, B:69:0x0155, B:68:0x0152, B:65:0x014d, B:60:0x012e, B:27:0x0071), top: B:96:0x0021, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158 A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:57:0x011e, B:59:0x0122, B:63:0x0147, B:72:0x0158, B:74:0x015c, B:71:0x0157, B:32:0x0089, B:37:0x00a2, B:40:0x00b9, B:69:0x0155, B:68:0x0152, B:65:0x014d, B:60:0x012e, B:27:0x0071), top: B:96:0x0021, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0199 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ed, B:53:0x0104, B:79:0x0180, B:83:0x0199, B:43:0x00c3), top: B:96:0x0021 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0196 -> B:20:0x0049). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel r9, zu.d<? super tu.x0> r10) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.request.forms.MultiPartFormDataContent.writeTo(io.ktor.utils.io.ByteWriteChannel, zu.d):java.lang.Object");
    }

    public MultiPartFormDataContent(List<? extends PartData> parts, String boundary, ContentType contentType) {
        byte[] bArrEncodeToByteArray;
        byte[] bArrEncodeToByteArray2;
        PreparedPart channelPart;
        MultiPartFormDataContent$rawParts$1$provider$1 multiPartFormDataContent$rawParts$1$provider$1;
        e0.checkNotNullParameter(parts, "parts");
        e0.checkNotNullParameter(boundary, "boundary");
        e0.checkNotNullParameter(contentType, "contentType");
        this.boundary = boundary;
        this.contentType = contentType;
        String strL = b.l("--", boundary, "\r\n");
        Charset charset = g.f86134b;
        if (e0.areEqual(charset, charset)) {
            bArrEncodeToByteArray = k0.encodeToByteArray(strL);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, strL, 0, strL.length());
        }
        this.BOUNDARY_BYTES = bArrEncodeToByteArray;
        String strL2 = b.l("--", boundary, "--\r\n");
        if (e0.areEqual(charset, charset)) {
            bArrEncodeToByteArray2 = k0.encodeToByteArray(strL2);
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            e0.checkNotNullExpressionValue(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrEncodeToByteArray2 = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder2, strL2, 0, strL2.length());
        }
        this.LAST_BOUNDARY_BYTES = bArrEncodeToByteArray2;
        this.BODY_OVERHEAD_SIZE = bArrEncodeToByteArray2.length;
        this.PART_OVERHEAD_SIZE = (FormDataContentKt.RN_BYTES.length * 2) + bArrEncodeToByteArray.length;
        List<? extends PartData> list = parts;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                PartData partData = (PartData) it.next();
                BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
                for (Map.Entry<String, List<String>> entry : partData.getHeaders().entries()) {
                    String key = entry.getKey();
                    List<String> value = entry.getValue();
                    StringBuilder sbT = b.t(key, ": ");
                    sbT.append(y0.joinToString$default(value, "; ", null, null, 0, null, null, 62, null));
                    StringsKt.writeText$default(bytePacketBuilder, sbT.toString(), 0, 0, (Charset) null, 14, (Object) null);
                    OutputKt.writeFully$default((Output) bytePacketBuilder, FormDataContentKt.RN_BYTES, 0, 0, 6, (Object) null);
                }
                Headers headers = partData.getHeaders();
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                String str = headers.get(httpHeaders.getContentLength());
                Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                if (partData instanceof PartData.FileItem) {
                    channelPart = new PreparedPart.InputPart(StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), ((PartData.FileItem) partData).getProvider(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + this.PART_OVERHEAD_SIZE + r5.length) : null);
                } else if (partData instanceof PartData.BinaryItem) {
                    channelPart = new PreparedPart.InputPart(StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), ((PartData.BinaryItem) partData).getProvider(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + this.PART_OVERHEAD_SIZE + r5.length) : null);
                } else if (partData instanceof PartData.FormItem) {
                    BytePacketBuilder bytePacketBuilder2 = new BytePacketBuilder(null, 1, null);
                    try {
                        StringsKt.writeText$default(bytePacketBuilder2, ((PartData.FormItem) partData).getValue(), 0, 0, (Charset) null, 14, (Object) null);
                        byte[] bytes$default = StringsKt.readBytes$default(bytePacketBuilder2.build(), 0, 1, null);
                        MultiPartFormDataContent$rawParts$1$provider$1 multiPartFormDataContent$rawParts$1$provider$12 = new MultiPartFormDataContent$rawParts$1$provider$1(bytes$default);
                        if (lValueOf == null) {
                            multiPartFormDataContent$rawParts$1$provider$1 = multiPartFormDataContent$rawParts$1$provider$12;
                            StringsKt.writeText$default(bytePacketBuilder, httpHeaders.getContentLength() + ": " + bytes$default.length, 0, 0, (Charset) null, 14, (Object) null);
                            OutputKt.writeFully$default((Output) bytePacketBuilder, FormDataContentKt.RN_BYTES, 0, 0, 6, (Object) null);
                        } else {
                            multiPartFormDataContent$rawParts$1$provider$1 = multiPartFormDataContent$rawParts$1$provider$12;
                        }
                        channelPart = new PreparedPart.InputPart(StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), multiPartFormDataContent$rawParts$1$provider$1, Long.valueOf(bytes$default.length + this.PART_OVERHEAD_SIZE + r4.length));
                    } catch (Throwable th2) {
                        bytePacketBuilder2.release();
                        throw th2;
                    }
                } else if (partData instanceof PartData.BinaryChannelItem) {
                    channelPart = new PreparedPart.ChannelPart(StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null), ((PartData.BinaryChannelItem) partData).getProvider(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + this.PART_OVERHEAD_SIZE + r5.length) : null);
                } else {
                    throw new t();
                }
                arrayList.add(channelPart);
            } else {
                this.rawParts = arrayList;
                Long lValueOf2 = 0L;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        l = lValueOf2;
                        break;
                    }
                    Long size = ((PreparedPart) it2.next()).getSize();
                    if (size == null) {
                        break;
                    } else {
                        lValueOf2 = lValueOf2 != null ? Long.valueOf(size.longValue() + lValueOf2.longValue()) : null;
                    }
                }
                this.contentLength = l != null ? Long.valueOf(l.longValue() + this.BODY_OVERHEAD_SIZE) : l;
                return;
            }
        }
    }
}
