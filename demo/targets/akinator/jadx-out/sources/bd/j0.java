package bd;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j0 extends z0 implements zc.j {

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f9091e;

    public j0(Class cls) {
        super(cls, 0);
        this.f9091e = null;
    }

    public abstract jc.w _withResolved(jc.g gVar, Boolean bool);

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        hVar.expectArrayFormat(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // zc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.w createContextual(jc.u0 r6, jc.g r7) throws jc.r {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L18
            jc.c r1 = r6.getAnnotationIntrospector()
            rc.l r2 = r7.getMember()
            if (r2 == 0) goto L18
            java.lang.Object r1 = r1.findContentSerializer(r2)
            if (r1 == 0) goto L18
            jc.w r1 = r6.serializerInstance(r2, r1)
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.Class r2 = r5.handledType()
            tb.t r2 = bd.z0.c(r2, r6, r7)
            if (r2 == 0) goto L2a
            tb.q r3 = tb.q.f86758g
            java.lang.Boolean r2 = r2.getFeature(r3)
            goto L2b
        L2a:
            r2 = r0
        L2b:
            jc.w r1 = bd.z0.b(r6, r7, r1)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != 0) goto L37
            jc.w r1 = r6.findContentValueSerializer(r3, r7)
        L37:
            boolean r4 = dd.i.isJacksonStdImpl(r1)
            if (r4 == 0) goto L4b
            java.lang.Boolean r6 = r5.f9091e
            boolean r6 = java.util.Objects.equals(r2, r6)
            if (r6 == 0) goto L46
            return r5
        L46:
            jc.w r6 = r5._withResolved(r7, r2)
            return r6
        L4b:
            bd.j r7 = new bd.j
            jc.o r6 = r6.constructType(r3)
            r2 = 1
            r7.<init>(r6, r2, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.j0.createContextual(jc.u0, jc.g):jc.w");
    }

    public abstract yc.v e();

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(jc.u0 u0Var, Type type) {
        return z0.a("array").set("items", e());
    }

    @Override // jc.w
    public abstract void serializeWithType(Collection<?> collection, ub.o oVar, jc.u0 u0Var, wc.j jVar) throws IOException;

    @Override // jc.w
    public boolean isEmpty(jc.u0 u0Var, Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public j0(j0 j0Var, Boolean bool) {
        super(j0Var);
        this.f9091e = bool;
    }
}
