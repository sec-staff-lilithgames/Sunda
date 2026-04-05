package io.ktor.http.content;

import bv.d;
import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MultipartKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", i = {0, 0, 1, 1}, l = {128, 129}, m = "forEachPart", n = {"$this$forEachPart", "partHandler", "$this$forEachPart", "partHandler"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.http.content.MultipartKt$forEachPart$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultipartKt.forEachPart(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", i = {0, 1, 1}, l = {138, 143}, m = "readAllParts", n = {"$this$readAllParts", "$this$readAllParts", "parts"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: io.ktor.http.content.MultipartKt$readAllParts$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39861 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39861(zu.d<? super C39861> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultipartKt.readAllParts(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r6.invoke(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006f -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachPart(io.ktor.http.content.MultiPartData r6, kv.p r7, zu.d<? super tu.x0> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.http.content.MultipartKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.http.content.MultipartKt$forEachPart$1 r0 = (io.ktor.http.content.MultipartKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.content.MultipartKt$forEachPart$1 r0 = new io.ktor.http.content.MultipartKt$forEachPart$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.L$1
            kv.p r6 = (kv.p) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.http.content.MultiPartData r7 = (io.ktor.http.content.MultiPartData) r7
            tu.a0.throwOnFailure(r8)
        L33:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4e
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            java.lang.Object r6 = r0.L$1
            kv.p r6 = (kv.p) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.http.content.MultiPartData r7 = (io.ktor.http.content.MultiPartData) r7
            tu.a0.throwOnFailure(r8)
            goto L5e
        L4b:
            tu.a0.throwOnFailure(r8)
        L4e:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.readPart(r0)
            if (r8 != r1) goto L5b
            goto L71
        L5b:
            r5 = r7
            r7 = r6
            r6 = r5
        L5e:
            io.ktor.http.content.PartData r8 = (io.ktor.http.content.PartData) r8
            if (r8 != 0) goto L65
            tu.x0 r6 = tu.x0.f87415a
            return r6
        L65:
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r6.invoke(r8, r0)
            if (r8 != r1) goto L33
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt.forEachPart(io.ktor.http.content.MultiPartData, kv.p, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0070 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readAllParts(io.ktor.http.content.MultiPartData r6, zu.d<? super java.util.List<? extends io.ktor.http.content.PartData>> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.http.content.MultipartKt.C39861
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.http.content.MultipartKt$readAllParts$1 r0 = (io.ktor.http.content.MultipartKt.C39861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.content.MultipartKt$readAllParts$1 r0 = new io.ktor.http.content.MultipartKt$readAllParts$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.http.content.MultiPartData r2 = (io.ktor.http.content.MultiPartData) r2
            tu.a0.throwOnFailure(r7)
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.L$0
            io.ktor.http.content.MultiPartData r6 = (io.ktor.http.content.MultiPartData) r6
            tu.a0.throwOnFailure(r7)
            goto L52
        L44:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r6.readPart(r0)
            if (r7 != r1) goto L52
            goto L72
        L52:
            io.ktor.http.content.PartData r7 = (io.ktor.http.content.PartData) r7
            if (r7 != 0) goto L5b
            java.util.List r6 = uu.p0.emptyList()
            return r6
        L5b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r7)
            r5 = r2
            r2 = r6
            r6 = r5
        L66:
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r2.readPart(r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            io.ktor.http.content.PartData r7 = (io.ktor.http.content.PartData) r7
            if (r7 != 0) goto L78
            return r6
        L78:
            r6.add(r7)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.content.MultipartKt.readAllParts(io.ktor.http.content.MultiPartData, zu.d):java.lang.Object");
    }
}
