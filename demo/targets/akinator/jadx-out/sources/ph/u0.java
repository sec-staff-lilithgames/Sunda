package ph;

import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Readable f81351a;

    /* renamed from: b, reason: collision with root package name */
    public final Reader f81352b;

    /* renamed from: c, reason: collision with root package name */
    public final CharBuffer f81353c;

    /* renamed from: d, reason: collision with root package name */
    public final char[] f81354d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f81355e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.manager.d0 f81356f;

    public u0(Readable readable) {
        CharBuffer charBufferAllocate = CharBuffer.allocate(2048);
        this.f81353c = charBufferAllocate;
        this.f81354d = charBufferAllocate.array();
        this.f81355e = new ArrayDeque();
        com.bumptech.glide.manager.d0 d0Var = new com.bumptech.glide.manager.d0();
        d0Var.f16631c = this;
        d0Var.f16630b = new StringBuilder();
        this.f81356f = d0Var;
        this.f81351a = (Readable) p1.checkNotNull(readable);
        this.f81352b = readable instanceof Reader ? (Reader) readable : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readLine() throws java.io.IOException {
        /*
            r10 = this;
        L0:
            java.util.ArrayDeque r0 = r10.f81355e
            java.lang.Object r1 = r0.peek()
            if (r1 != 0) goto L94
            java.nio.CharBuffer r1 = r10.f81353c
            r1.clear()
            char[] r2 = r10.f81354d
            r3 = 0
            java.io.Reader r4 = r10.f81352b
            if (r4 == 0) goto L1a
            int r1 = r2.length
            int r1 = r4.read(r2, r3, r1)
            goto L20
        L1a:
            java.lang.Readable r4 = r10.f81351a
            int r1 = r4.read(r1)
        L20:
            r4 = -1
            com.bumptech.glide.manager.d0 r5 = r10.f81356f
            if (r1 != r4) goto L38
            boolean r1 = r5.f16629a
            if (r1 != 0) goto L33
            java.lang.Object r1 = r5.f16630b
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L94
        L33:
            r5.a(r3)
            goto L94
        L38:
            boolean r0 = r5.f16629a
            r4 = 1
            r6 = 10
            if (r0 == 0) goto L4f
            if (r1 <= 0) goto L4f
            char r0 = r2[r3]
            if (r0 != r6) goto L47
            r0 = r4
            goto L48
        L47:
            r0 = r3
        L48:
            r5.a(r0)
            if (r0 == 0) goto L4f
            r0 = r4
            goto L50
        L4f:
            r0 = r3
        L50:
            r7 = r0
        L51:
            if (r0 >= r1) goto L8a
            char r8 = r2[r0]
            if (r8 == r6) goto L7b
            r9 = 13
            if (r8 == r9) goto L5c
            goto L88
        L5c:
            java.lang.Object r8 = r5.f16630b
            java.lang.StringBuilder r8 = (java.lang.StringBuilder) r8
            int r9 = r0 - r7
            r8.append(r2, r7, r9)
            r5.f16629a = r4
            int r7 = r0 + 1
            if (r7 >= r1) goto L78
            char r8 = r2[r7]
            if (r8 != r6) goto L71
            r8 = r4
            goto L72
        L71:
            r8 = r3
        L72:
            r5.a(r8)
            if (r8 == 0) goto L78
            r0 = r7
        L78:
            int r7 = r0 + 1
            goto L88
        L7b:
            java.lang.Object r8 = r5.f16630b
            java.lang.StringBuilder r8 = (java.lang.StringBuilder) r8
            int r9 = r0 - r7
            r8.append(r2, r7, r9)
            r5.a(r4)
            goto L78
        L88:
            int r0 = r0 + r4
            goto L51
        L8a:
            java.lang.Object r0 = r5.f16630b
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            int r1 = r1 - r7
            r0.append(r2, r7, r1)
            goto L0
        L94:
            java.lang.Object r0 = r0.poll()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.u0.readLine():java.lang.String");
    }
}
