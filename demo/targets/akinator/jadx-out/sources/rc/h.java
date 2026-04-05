package rc;

import dd.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends g0 {

    /* renamed from: d, reason: collision with root package name */
    public final g1 f84191d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84192e;

    /* renamed from: f, reason: collision with root package name */
    public g f84193f;

    public h(jc.c cVar, g1 g1Var, boolean z10) {
        super(cVar);
        this.f84191d = g1Var;
        this.f84192e = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static rc.d collectCreators(jc.c r20, cd.s r21, rc.g1 r22, jc.o r23, java.lang.Class<?> r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.h.collectCreators(jc.c, cd.s, rc.g1, jc.o, java.lang.Class, boolean):rc.d");
    }

    public final a0 e(i.a aVar, i.a aVar2) {
        if (!this.f84192e) {
            return new a0();
        }
        y yVarB = b(aVar.getDeclaredAnnotations());
        if (aVar2 != null) {
            yVarB = a(yVarB, aVar2.getDeclaredAnnotations());
        }
        return yVarB.asAnnotationMap();
    }

    public final a0[] f(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.f84192e) {
            return g0.f84188b;
        }
        int length = annotationArr.length;
        a0[] a0VarArr = new a0[length];
        for (int i10 = 0; i10 < length; i10++) {
            y yVarA = a(y.emptyCollector(), annotationArr[i10]);
            if (annotationArr2 != null) {
                yVarA = a(yVarA, annotationArr2[i10]);
            }
            a0VarArr[i10] = yVarA.asAnnotationMap();
        }
        return a0VarArr;
    }

    public final m g(Method method, g1 g1Var, Method method2) {
        int length = method.getParameterTypes().length;
        jc.c cVar = this.f84190a;
        a0[] a0VarArr = g0.f84188b;
        if (cVar == null) {
            a0 a0Var = new a0();
            if (length != 0) {
                a0VarArr = new a0[length];
                for (int i10 = 0; i10 < length; i10++) {
                    a0VarArr[i10] = new a0();
                }
            }
            return new m(g1Var, method, a0Var, a0VarArr);
        }
        if (length == 0) {
            y yVarB = b(method.getDeclaredAnnotations());
            if (method2 != null) {
                yVarB = a(yVarB, method2.getDeclaredAnnotations());
            }
            return new m(g1Var, method, yVarB.asAnnotationMap(), a0VarArr);
        }
        y yVarB2 = b(method.getDeclaredAnnotations());
        if (method2 != null) {
            yVarB2 = a(yVarB2, method2.getDeclaredAnnotations());
        }
        return new m(g1Var, method, yVarB2.asAnnotationMap(), f(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rc.g h(dd.i.a r9, dd.i.a r10) {
        /*
            r8 = this;
            int r0 = r9.getParamCount()
            jc.c r1 = r8.f84190a
            rc.a0[] r2 = rc.g0.f84188b
            r3 = 0
            rc.g1 r4 = r8.f84191d
            if (r1 != 0) goto L2d
            rc.g r10 = new rc.g
            java.lang.reflect.Constructor r9 = r9.getConstructor()
            rc.a0 r1 = new rc.a0
            r1.<init>()
            if (r0 != 0) goto L1b
            goto L29
        L1b:
            rc.a0[] r2 = new rc.a0[r0]
        L1d:
            if (r3 >= r0) goto L29
            rc.a0 r5 = new rc.a0
            r5.<init>()
            r2[r3] = r5
            int r3 = r3 + 1
            goto L1d
        L29:
            r10.<init>(r4, r9, r1, r2)
            return r10
        L2d:
            if (r0 != 0) goto L3d
            rc.g r0 = new rc.g
            java.lang.reflect.Constructor r1 = r9.getConstructor()
            rc.a0 r9 = r8.e(r9, r10)
            r0.<init>(r4, r1, r9, r2)
            return r0
        L3d:
            java.lang.annotation.Annotation[][] r1 = r9.getParameterAnnotations()
            int r2 = r1.length
            r5 = 0
            if (r0 == r2) goto La2
            java.lang.Class r2 = r9.getDeclaringClass()
            boolean r6 = dd.i.isEnumType(r2)
            if (r6 == 0) goto L62
            int r6 = r1.length
            r7 = 2
            int r6 = r6 + r7
            if (r0 != r6) goto L62
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r6 = r1.length
            java.lang.System.arraycopy(r1, r3, r2, r7, r6)
            rc.a0[] r5 = r8.f(r2, r5)
        L60:
            r1 = r2
            goto L7e
        L62:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L7e
            int r2 = r1.length
            r6 = 1
            int r2 = r2 + r6
            if (r0 != r2) goto L7e
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r7 = r1.length
            java.lang.System.arraycopy(r1, r3, r2, r6, r7)
            java.lang.annotation.Annotation[] r1 = rc.g0.f84189c
            r2[r3] = r1
            rc.a0[] r5 = r8.f(r2, r5)
            goto L60
        L7e:
            if (r5 == 0) goto L81
            goto Lad
        L81:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r0, r1}
            java.lang.String r0 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r0, r9)
            r10.<init>(r9)
            throw r10
        La2:
            if (r10 != 0) goto La5
            goto La9
        La5:
            java.lang.annotation.Annotation[][] r5 = r10.getParameterAnnotations()
        La9:
            rc.a0[] r5 = r8.f(r1, r5)
        Lad:
            rc.g r0 = new rc.g
            java.lang.reflect.Constructor r1 = r9.getConstructor()
            rc.a0 r9 = r8.e(r9, r10)
            r0.<init>(r4, r1, r9, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.h.h(dd.i$a, dd.i$a):rc.g");
    }
}
