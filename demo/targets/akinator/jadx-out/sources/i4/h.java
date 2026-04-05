package i4;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = b(r8, r9, r10)
            boolean r1 = b(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = d(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.h.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    public static int d(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    public static int e(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <L, T> T findNextFocusInAbsoluteDirection(L r10, i4.f r11, i4.e r12, T r13, android.graphics.Rect r14, int r15) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r14)
            r1 = 17
            r2 = 0
            if (r15 == r1) goto L3e
            r1 = 33
            if (r15 == r1) goto L34
            r1 = 66
            if (r15 == r1) goto L29
            r1 = 130(0x82, float:1.82E-43)
            if (r15 != r1) goto L21
            int r1 = r14.height()
            int r1 = r1 + 1
            int r1 = -r1
            r0.offset(r2, r1)
            goto L47
        L21:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r10.<init>(r11)
            throw r10
        L29:
            int r1 = r14.width()
            int r1 = r1 + 1
            int r1 = -r1
            r0.offset(r1, r2)
            goto L47
        L34:
            int r1 = r14.height()
            int r1 = r1 + 1
            r0.offset(r2, r1)
            goto L47
        L3e:
            int r1 = r14.width()
            int r1 = r1 + 1
            r0.offset(r1, r2)
        L47:
            i4.b r11 = (i4.b) r11
            int r1 = r11.size(r10)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4 = 0
        L53:
            if (r2 >= r1) goto La1
            java.lang.Object r5 = r11.get(r10, r2)
            if (r5 != r13) goto L5c
            goto L9e
        L5c:
            r6 = r12
            i4.a r6 = (i4.a) r6
            r6.obtainBounds(r5, r3)
            boolean r6 = c(r15, r14, r3)
            if (r6 != 0) goto L69
            goto L9e
        L69:
            boolean r6 = c(r15, r14, r0)
            if (r6 != 0) goto L70
            goto L9a
        L70:
            boolean r6 = a(r15, r14, r3, r0)
            if (r6 == 0) goto L77
            goto L9a
        L77:
            boolean r6 = a(r15, r14, r0, r3)
            if (r6 == 0) goto L7e
            goto L9e
        L7e:
            int r6 = d(r15, r14, r3)
            int r7 = e(r15, r14, r3)
            int r8 = r6 * 13
            int r8 = r8 * r6
            int r7 = r7 * r7
            int r7 = r7 + r8
            int r6 = d(r15, r14, r0)
            int r8 = e(r15, r14, r0)
            int r9 = r6 * 13
            int r9 = r9 * r6
            int r8 = r8 * r8
            int r8 = r8 + r9
            if (r7 >= r8) goto L9e
        L9a:
            r0.set(r3)
            r4 = r5
        L9e:
            int r2 = r2 + 1
            goto L53
        La1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.h.findNextFocusInAbsoluteDirection(java.lang.Object, i4.f, i4.e, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static <L, T> T findNextFocusInRelativeDirection(L l9, f fVar, e eVar, T t10, int i10, boolean z10, boolean z11) {
        b bVar = (b) fVar;
        int size = bVar.size(l9);
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(bVar.get(l9, i11));
        }
        Collections.sort(arrayList, new g(z10, eVar));
        if (i10 == 1) {
            int size2 = arrayList.size();
            int iIndexOf = (t10 == null ? size2 : arrayList.indexOf(t10)) - 1;
            if (iIndexOf >= 0) {
                return (T) arrayList.get(iIndexOf);
            }
            if (!z11 || size2 <= 0) {
                return null;
            }
            return (T) arrayList.get(size2 - 1);
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        int size3 = arrayList.size();
        int iLastIndexOf = (t10 == null ? -1 : arrayList.lastIndexOf(t10)) + 1;
        if (iLastIndexOf < size3) {
            return (T) arrayList.get(iLastIndexOf);
        }
        if (!z11 || size3 <= 0) {
            return null;
        }
        return (T) arrayList.get(0);
    }
}
