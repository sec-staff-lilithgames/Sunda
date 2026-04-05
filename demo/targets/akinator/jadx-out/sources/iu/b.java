package iu;

import mt.i0;
import ut.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f68400a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f68401b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f68402c;

    /* renamed from: d, reason: collision with root package name */
    public int f68403d;

    public b(int i10) {
        this.f68400a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f68401b = objArr;
        this.f68402c = objArr;
    }

    public <U> boolean accept(tw.c cVar) {
        int i10;
        Object[] objArr;
        Object[] objArr2 = this.f68401b;
        while (true) {
            int i11 = 0;
            if (objArr2 == null) {
                return false;
            }
            while (true) {
                i10 = this.f68400a;
                if (i11 >= i10 || (objArr = objArr2[i11]) == null) {
                    break;
                }
                if (u.acceptFull(objArr, cVar)) {
                    return true;
                }
                i11++;
            }
            objArr2 = objArr2[i10];
        }
    }

    public void add(Object obj) {
        int i10 = this.f68403d;
        int i11 = this.f68400a;
        if (i10 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.f68402c[i11] = objArr;
            this.f68402c = objArr;
            i10 = 0;
        }
        this.f68402c[i10] = obj;
        this.f68403d = i10 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        r0 = r0[r2];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void forEachWhile(iu.a r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f68401b
        L2:
            if (r0 == 0) goto L1d
            r1 = 0
        L5:
            int r2 = r4.f68400a
            if (r1 >= r2) goto L18
            r3 = r0[r1]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r2 = r5.test(r3)
            if (r2 == 0) goto L15
            goto L1d
        L15:
            int r1 = r1 + 1
            goto L5
        L18:
            r0 = r0[r2]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L2
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.b.forEachWhile(iu.a):void");
    }

    public void setFirst(Object obj) {
        this.f68401b[0] = obj;
    }

    public <U> boolean accept(i0 i0Var) {
        int i10;
        Object[] objArr;
        Object[] objArr2 = this.f68401b;
        while (true) {
            int i11 = 0;
            if (objArr2 == null) {
                return false;
            }
            while (true) {
                i10 = this.f68400a;
                if (i11 >= i10 || (objArr = objArr2[i11]) == null) {
                    break;
                }
                if (u.acceptFull(objArr, i0Var)) {
                    return true;
                }
                i11++;
            }
            objArr2 = objArr2[i10];
        }
    }

    public <S> void forEachWhile(S s10, st.d dVar) throws Exception {
        int i10;
        Object[] objArr = this.f68401b;
        while (true) {
            int i11 = 0;
            while (true) {
                i10 = this.f68400a;
                if (i11 < i10) {
                    Object[] objArr2 = objArr[i11];
                    if (objArr2 == null || ((n0) dVar).test(s10, objArr2)) {
                        return;
                    } else {
                        i11++;
                    }
                }
            }
            objArr = objArr[i10];
        }
    }
}
