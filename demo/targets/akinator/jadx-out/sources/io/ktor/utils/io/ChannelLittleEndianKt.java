package io.ktor.utils.io;

import av.e;
import bv.d;
import bv.f;
import io.ktor.utils.io.core.ByteOrder;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChannelLittleEndianKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ByteOrder.values().length];
            try {
                iArr[ByteOrder.BIG_ENDIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {0}, l = {23}, m = "readDouble", n = {"byteOrder"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readDouble$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readDouble(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {}, l = {43}, m = "readDoubleLittleEndian", n = {}, s = {})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readDoubleLittleEndian$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40801 extends d {
        int label;
        /* synthetic */ Object result;

        public C40801(zu.d<? super C40801> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readDoubleLittleEndian(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {0}, l = {19}, m = "readFloat", n = {"byteOrder"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readFloat$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40811 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40811(zu.d<? super C40811> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readFloat(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {}, l = {39}, m = "readFloatLittleEndian", n = {}, s = {})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readFloatLittleEndian$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40821 extends d {
        int label;
        /* synthetic */ Object result;

        public C40821(zu.d<? super C40821> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readFloatLittleEndian(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {0}, l = {11}, m = "readInt", n = {"byteOrder"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readInt$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40831 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40831(zu.d<? super C40831> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readInt(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {}, l = {31}, m = "readIntLittleEndian", n = {}, s = {})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readIntLittleEndian$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40841 extends d {
        int label;
        /* synthetic */ Object result;

        public C40841(zu.d<? super C40841> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readIntLittleEndian(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {0}, l = {15}, m = "readLong", n = {"byteOrder"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readLong$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40851 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40851(zu.d<? super C40851> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readLong(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {}, l = {35}, m = "readLongLittleEndian", n = {}, s = {})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readLongLittleEndian$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40861 extends d {
        int label;
        /* synthetic */ Object result;

        public C40861(zu.d<? super C40861> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readLongLittleEndian(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {0}, l = {7}, m = "readShort", n = {"byteOrder"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readShort$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40871 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40871(zu.d<? super C40871> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readShort(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ChannelLittleEndianKt", f = "ChannelLittleEndian.kt", i = {}, l = {27}, m = "readShortLittleEndian", n = {}, s = {})
    /* renamed from: io.ktor.utils.io.ChannelLittleEndianKt$readShortLittleEndian$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40881 extends d {
        int label;
        /* synthetic */ Object result;

        public C40881(zu.d<? super C40881> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLittleEndianKt.readShortLittleEndian(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readDouble(io.ktor.utils.io.ByteReadChannel r4, io.ktor.utils.io.core.ByteOrder r5, zu.d<? super java.lang.Double> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ChannelLittleEndianKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ChannelLittleEndianKt$readDouble$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readDouble$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readDouble$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            io.ktor.utils.io.core.ByteOrder r5 = (io.ktor.utils.io.core.ByteOrder) r5
            tu.a0.throwOnFailure(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.readDouble(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            int[] r4 = io.ktor.utils.io.ChannelLittleEndianKt.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 != r3) goto L4f
            return r6
        L4f:
            java.lang.Number r6 = (java.lang.Number) r6
            double r4 = r6.doubleValue()
            long r4 = java.lang.Double.doubleToRawLongBits(r4)
            long r4 = java.lang.Long.reverseBytes(r4)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = bv.b.boxDouble(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readDouble(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.core.ByteOrder, zu.d):java.lang.Object");
    }

    private static final Object readDouble$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, zu.d<? super Double> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readDouble(dVar);
        b0.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Double.valueOf(Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(((Number) obj).doubleValue()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readDoubleLittleEndian(io.ktor.utils.io.ByteReadChannel r4, zu.d<? super java.lang.Double> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ChannelLittleEndianKt.C40801
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ChannelLittleEndianKt$readDoubleLittleEndian$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.C40801) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readDoubleLittleEndian$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readDoubleLittleEndian$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r5)
            r0.label = r3
            java.lang.Object r5 = r4.readDouble(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Number r5 = (java.lang.Number) r5
            double r4 = r5.doubleValue()
            long r4 = java.lang.Double.doubleToRawLongBits(r4)
            long r4 = java.lang.Long.reverseBytes(r4)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = bv.b.boxDouble(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readDoubleLittleEndian(io.ktor.utils.io.ByteReadChannel, zu.d):java.lang.Object");
    }

    private static final Object readDoubleLittleEndian$$forInline(ByteReadChannel byteReadChannel, zu.d<? super Double> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readDouble(dVar);
        b0.mark(1);
        return Double.valueOf(Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(((Number) obj).doubleValue()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFloat(io.ktor.utils.io.ByteReadChannel r4, io.ktor.utils.io.core.ByteOrder r5, zu.d<? super java.lang.Float> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ChannelLittleEndianKt.C40811
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ChannelLittleEndianKt$readFloat$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.C40811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readFloat$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readFloat$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            io.ktor.utils.io.core.ByteOrder r5 = (io.ktor.utils.io.core.ByteOrder) r5
            tu.a0.throwOnFailure(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.readFloat(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            int[] r4 = io.ktor.utils.io.ChannelLittleEndianKt.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 != r3) goto L4f
            return r6
        L4f:
            java.lang.Number r6 = (java.lang.Number) r6
            float r4 = r6.floatValue()
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            int r4 = java.lang.Integer.reverseBytes(r4)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = bv.b.boxFloat(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readFloat(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.core.ByteOrder, zu.d):java.lang.Object");
    }

    private static final Object readFloat$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, zu.d<? super Float> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readFloat(dVar);
        b0.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Float.valueOf(Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(((Number) obj).floatValue()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readFloatLittleEndian(io.ktor.utils.io.ByteReadChannel r4, zu.d<? super java.lang.Float> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ChannelLittleEndianKt.C40821
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ChannelLittleEndianKt$readFloatLittleEndian$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.C40821) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readFloatLittleEndian$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readFloatLittleEndian$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r5)
            r0.label = r3
            java.lang.Object r5 = r4.readFloat(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Number r5 = (java.lang.Number) r5
            float r4 = r5.floatValue()
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            int r4 = java.lang.Integer.reverseBytes(r4)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = bv.b.boxFloat(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readFloatLittleEndian(io.ktor.utils.io.ByteReadChannel, zu.d):java.lang.Object");
    }

    private static final Object readFloatLittleEndian$$forInline(ByteReadChannel byteReadChannel, zu.d<? super Float> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readFloat(dVar);
        b0.mark(1);
        return Float.valueOf(Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(((Number) obj).floatValue()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readInt(io.ktor.utils.io.ByteReadChannel r4, io.ktor.utils.io.core.ByteOrder r5, zu.d<? super java.lang.Integer> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ChannelLittleEndianKt.C40831
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ChannelLittleEndianKt$readInt$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.C40831) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readInt$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readInt$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            io.ktor.utils.io.core.ByteOrder r5 = (io.ktor.utils.io.core.ByteOrder) r5
            tu.a0.throwOnFailure(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.readInt(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            int[] r4 = io.ktor.utils.io.ChannelLittleEndianKt.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 != r3) goto L4f
            return r6
        L4f:
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            int r4 = java.lang.Integer.reverseBytes(r4)
            java.lang.Integer r4 = bv.b.boxInt(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readInt(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.core.ByteOrder, zu.d):java.lang.Object");
    }

    private static final Object readInt$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, zu.d<? super Integer> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readInt(dVar);
        b0.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Integer.valueOf(Integer.reverseBytes(((Number) obj).intValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readIntLittleEndian(io.ktor.utils.io.ByteReadChannel r4, zu.d<? super java.lang.Integer> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ChannelLittleEndianKt.C40841
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ChannelLittleEndianKt$readIntLittleEndian$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.C40841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readIntLittleEndian$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readIntLittleEndian$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r5)
            r0.label = r3
            java.lang.Object r5 = r4.readInt(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r5.intValue()
            int r4 = java.lang.Integer.reverseBytes(r4)
            java.lang.Integer r4 = bv.b.boxInt(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readIntLittleEndian(io.ktor.utils.io.ByteReadChannel, zu.d):java.lang.Object");
    }

    private static final Object readIntLittleEndian$$forInline(ByteReadChannel byteReadChannel, zu.d<? super Integer> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readInt(dVar);
        b0.mark(1);
        return Integer.valueOf(Integer.reverseBytes(((Number) obj).intValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readLong(io.ktor.utils.io.ByteReadChannel r4, io.ktor.utils.io.core.ByteOrder r5, zu.d<? super java.lang.Long> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ChannelLittleEndianKt.C40851
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ChannelLittleEndianKt$readLong$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.C40851) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readLong$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readLong$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            io.ktor.utils.io.core.ByteOrder r5 = (io.ktor.utils.io.core.ByteOrder) r5
            tu.a0.throwOnFailure(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.readLong(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            int[] r4 = io.ktor.utils.io.ChannelLittleEndianKt.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 != r3) goto L4f
            return r6
        L4f:
            java.lang.Number r6 = (java.lang.Number) r6
            long r4 = r6.longValue()
            long r4 = java.lang.Long.reverseBytes(r4)
            java.lang.Long r4 = bv.b.boxLong(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readLong(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.core.ByteOrder, zu.d):java.lang.Object");
    }

    private static final Object readLong$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, zu.d<? super Long> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readLong(dVar);
        b0.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Long.valueOf(Long.reverseBytes(((Number) obj).longValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readLongLittleEndian(io.ktor.utils.io.ByteReadChannel r4, zu.d<? super java.lang.Long> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ChannelLittleEndianKt.C40861
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ChannelLittleEndianKt$readLongLittleEndian$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.C40861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readLongLittleEndian$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readLongLittleEndian$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r5)
            r0.label = r3
            java.lang.Object r5 = r4.readLong(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Number r5 = (java.lang.Number) r5
            long r4 = r5.longValue()
            long r4 = java.lang.Long.reverseBytes(r4)
            java.lang.Long r4 = bv.b.boxLong(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readLongLittleEndian(io.ktor.utils.io.ByteReadChannel, zu.d):java.lang.Object");
    }

    private static final Object readLongLittleEndian$$forInline(ByteReadChannel byteReadChannel, zu.d<? super Long> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readLong(dVar);
        b0.mark(1);
        return Long.valueOf(Long.reverseBytes(((Number) obj).longValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readShort(io.ktor.utils.io.ByteReadChannel r4, io.ktor.utils.io.core.ByteOrder r5, zu.d<? super java.lang.Short> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ChannelLittleEndianKt.C40871
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ChannelLittleEndianKt$readShort$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.C40871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readShort$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readShort$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            io.ktor.utils.io.core.ByteOrder r5 = (io.ktor.utils.io.core.ByteOrder) r5
            tu.a0.throwOnFailure(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.readShort(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            int[] r4 = io.ktor.utils.io.ChannelLittleEndianKt.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 != r3) goto L4f
            return r6
        L4f:
            java.lang.Number r6 = (java.lang.Number) r6
            short r4 = r6.shortValue()
            short r4 = (short) r4
            short r4 = java.lang.Short.reverseBytes(r4)
            java.lang.Short r4 = bv.b.boxShort(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readShort(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.core.ByteOrder, zu.d):java.lang.Object");
    }

    private static final Object readShort$$forInline(ByteReadChannel byteReadChannel, ByteOrder byteOrder, zu.d<? super Short> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readShort(dVar);
        b0.mark(1);
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? obj : Short.valueOf(Short.reverseBytes(((Number) obj).shortValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object readShortLittleEndian(io.ktor.utils.io.ByteReadChannel r4, zu.d<? super java.lang.Short> r5) {
        /*
            boolean r0 = r5 instanceof io.ktor.utils.io.ChannelLittleEndianKt.C40881
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.ChannelLittleEndianKt$readShortLittleEndian$1 r0 = (io.ktor.utils.io.ChannelLittleEndianKt.C40881) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ChannelLittleEndianKt$readShortLittleEndian$1 r0 = new io.ktor.utils.io.ChannelLittleEndianKt$readShortLittleEndian$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            tu.a0.throwOnFailure(r5)
            r0.label = r3
            java.lang.Object r5 = r4.readShort(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Number r5 = (java.lang.Number) r5
            short r4 = r5.shortValue()
            short r4 = (short) r4
            short r4 = java.lang.Short.reverseBytes(r4)
            java.lang.Short r4 = bv.b.boxShort(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ChannelLittleEndianKt.readShortLittleEndian(io.ktor.utils.io.ByteReadChannel, zu.d):java.lang.Object");
    }

    private static final Object readShortLittleEndian$$forInline(ByteReadChannel byteReadChannel, zu.d<? super Short> dVar) {
        b0.mark(0);
        Object obj = byteReadChannel.readShort(dVar);
        b0.mark(1);
        return Short.valueOf(Short.reverseBytes(((Number) obj).shortValue()));
    }

    public static final <T> T reverseIfNeeded(T t10, ByteOrder byteOrder, l reverseBlock) {
        e0.checkNotNullParameter(byteOrder, "byteOrder");
        e0.checkNotNullParameter(reverseBlock, "reverseBlock");
        return WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] == 1 ? t10 : (T) reverseBlock.invoke(t10);
    }

    public static final <T> T toLittleEndian(ByteReadChannel byteReadChannel, T t10, l reverseBlock) {
        e0.checkNotNullParameter(byteReadChannel, "<this>");
        e0.checkNotNullParameter(reverseBlock, "reverseBlock");
        return (T) reverseBlock.invoke(t10);
    }

    public static final Object writeDouble(ByteWriteChannel byteWriteChannel, double d10, ByteOrder byteOrder, zu.d<? super x0> dVar) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            d10 = Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d10)));
        }
        Object objWriteDouble = byteWriteChannel.writeDouble(d10, dVar);
        return objWriteDouble == e.getCOROUTINE_SUSPENDED() ? objWriteDouble : x0.f87415a;
    }

    public static final Object writeDoubleLittleEndian(ByteWriteChannel byteWriteChannel, double d10, zu.d<? super x0> dVar) {
        Object objWriteDouble = byteWriteChannel.writeDouble(Double.longBitsToDouble(Long.reverseBytes(Double.doubleToRawLongBits(d10))), dVar);
        return objWriteDouble == e.getCOROUTINE_SUSPENDED() ? objWriteDouble : x0.f87415a;
    }

    public static final Object writeFloat(ByteWriteChannel byteWriteChannel, float f10, ByteOrder byteOrder, zu.d<? super x0> dVar) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            f10 = Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f10)));
        }
        Object objWriteFloat = byteWriteChannel.writeFloat(f10, dVar);
        return objWriteFloat == e.getCOROUTINE_SUSPENDED() ? objWriteFloat : x0.f87415a;
    }

    public static final Object writeFloatLittleEndian(ByteWriteChannel byteWriteChannel, float f10, zu.d<? super x0> dVar) {
        Object objWriteFloat = byteWriteChannel.writeFloat(Float.intBitsToFloat(Integer.reverseBytes(Float.floatToRawIntBits(f10))), dVar);
        return objWriteFloat == e.getCOROUTINE_SUSPENDED() ? objWriteFloat : x0.f87415a;
    }

    public static final Object writeInt(ByteWriteChannel byteWriteChannel, int i10, ByteOrder byteOrder, zu.d<? super x0> dVar) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            i10 = Integer.reverseBytes(i10);
        }
        Object objWriteInt = byteWriteChannel.writeInt(i10, dVar);
        return objWriteInt == e.getCOROUTINE_SUSPENDED() ? objWriteInt : x0.f87415a;
    }

    public static final Object writeIntLittleEndian(ByteWriteChannel byteWriteChannel, int i10, zu.d<? super x0> dVar) {
        Object objWriteInt = byteWriteChannel.writeInt(Integer.reverseBytes(i10), dVar);
        return objWriteInt == e.getCOROUTINE_SUSPENDED() ? objWriteInt : x0.f87415a;
    }

    public static final Object writeLong(ByteWriteChannel byteWriteChannel, long j10, ByteOrder byteOrder, zu.d<? super x0> dVar) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            j10 = Long.reverseBytes(j10);
        }
        Object objWriteLong = byteWriteChannel.writeLong(j10, dVar);
        return objWriteLong == e.getCOROUTINE_SUSPENDED() ? objWriteLong : x0.f87415a;
    }

    public static final Object writeLongLittleEndian(ByteWriteChannel byteWriteChannel, long j10, zu.d<? super x0> dVar) {
        Object objWriteLong = byteWriteChannel.writeLong(Long.reverseBytes(j10), dVar);
        return objWriteLong == e.getCOROUTINE_SUSPENDED() ? objWriteLong : x0.f87415a;
    }

    public static final Object writeShort(ByteWriteChannel byteWriteChannel, short s10, ByteOrder byteOrder, zu.d<? super x0> dVar) {
        if (WhenMappings.$EnumSwitchMapping$0[byteOrder.ordinal()] != 1) {
            s10 = Short.reverseBytes(s10);
        }
        Object objWriteShort = byteWriteChannel.writeShort(s10, dVar);
        return objWriteShort == e.getCOROUTINE_SUSPENDED() ? objWriteShort : x0.f87415a;
    }

    public static final Object writeShortLittleEndian(ByteWriteChannel byteWriteChannel, short s10, zu.d<? super x0> dVar) {
        Object objWriteShort = byteWriteChannel.writeShort(Short.reverseBytes(s10), dVar);
        return objWriteShort == e.getCOROUTINE_SUSPENDED() ? objWriteShort : x0.f87415a;
    }

    private static final <T> T toLittleEndian(ByteWriteChannel byteWriteChannel, T t10, l lVar) {
        return (T) lVar.invoke(t10);
    }
}
