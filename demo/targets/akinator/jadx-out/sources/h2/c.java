package h2;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final w f58630a;

    /* renamed from: b, reason: collision with root package name */
    public int f58631b;

    /* renamed from: c, reason: collision with root package name */
    public float f58632c;

    public c(w layout) {
        e0.checkNotNullParameter(layout, "layout");
        this.f58630a = layout;
        this.f58631b = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(boolean r6, boolean r7, boolean r8, int r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            h2.w r2 = r5.f58630a
            if (r6 == 0) goto L1b
            android.text.Layout r3 = r2.getLayout()
            int r3 = h2.e.getLineForOffset(r3, r9, r6)
            int r4 = r2.getLineStart(r3)
            int r3 = r2.getLineEnd(r3)
            if (r9 == r4) goto L1d
            if (r9 != r3) goto L1b
            goto L1d
        L1b:
            r3 = r1
            goto L1e
        L1d:
            r3 = r0
        L1e:
            int r4 = r9 * 4
            if (r8 == 0) goto L26
            if (r3 == 0) goto L2b
            r0 = r1
            goto L2b
        L26:
            if (r3 == 0) goto L2a
            r0 = 2
            goto L2b
        L2a:
            r0 = 3
        L2b:
            int r4 = r4 + r0
            int r0 = r5.f58631b
            if (r0 != r4) goto L33
            float r6 = r5.f58632c
            return r6
        L33:
            if (r8 == 0) goto L3a
            float r6 = r2.getPrimaryHorizontal(r9, r6)
            goto L3e
        L3a:
            float r6 = r2.getSecondaryHorizontal(r9, r6)
        L3e:
            if (r7 == 0) goto L44
            r5.f58631b = r4
            r5.f58632c = r6
        L44:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.c.a(boolean, boolean, boolean, int):float");
    }

    public final w getLayout() {
        return this.f58630a;
    }

    public final float getPrimaryDownstream(int i10) {
        return a(false, false, true, i10);
    }

    public final float getPrimaryUpstream(int i10) {
        return a(true, true, true, i10);
    }

    public final float getSecondaryDownstream(int i10) {
        return a(false, false, false, i10);
    }

    public final float getSecondaryUpstream(int i10) {
        return a(true, true, false, i10);
    }
}
