package zc;

import bd.t0;
import jc.s0;
import jc.u0;
import jc.w;
import jc.y;
import lc.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final g f97785f = new g(null);

    @Override // zc.b, zc.s
    public w createSerializer(u0 u0Var, jc.o oVar) throws jc.r {
        jc.o oVarRefineSerializationType;
        s0 config = u0Var.getConfig();
        jc.d dVarIntrospect = config.introspect(oVar);
        w wVarC = b.c(u0Var, dVarIntrospect.getClassInfo());
        if (wVarC != null) {
            return wVarC;
        }
        jc.c annotationIntrospector = config.getAnnotationIntrospector();
        boolean z10 = false;
        if (annotationIntrospector == null) {
            oVarRefineSerializationType = oVar;
        } else {
            try {
                oVarRefineSerializationType = annotationIntrospector.refineSerializationType(config, dVarIntrospect.getClassInfo(), oVar);
            } catch (jc.r e10) {
                return (w) u0Var.reportBadTypeDefinition(dVarIntrospect, e10.getMessage(), new Object[0]);
            }
        }
        if (oVarRefineSerializationType != oVar) {
            if (!oVarRefineSerializationType.hasRawClass(oVar.getRawClass())) {
                dVarIntrospect = config.introspect(oVarRefineSerializationType);
            }
            z10 = true;
        }
        dd.m mVarFindSerializationConverter = dVarIntrospect.findSerializationConverter();
        if (mVarFindSerializationConverter == null) {
            return e(u0Var, oVarRefineSerializationType, dVarIntrospect, z10);
        }
        jc.o outputType = ((nc.o) mVarFindSerializationConverter).getOutputType(u0Var.getTypeFactory());
        if (!outputType.hasRawClass(oVarRefineSerializationType.getRawClass())) {
            dVarIntrospect = config.introspect(outputType);
            wVarC = b.c(u0Var, dVarIntrospect.getClassInfo());
        }
        if (wVarC == null && !outputType.isJavaLangObject()) {
            wVarC = e(u0Var, outputType, dVarIntrospect, true);
        }
        return new t0(mVarFindSerializationConverter, outputType, wVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zc.d d(jc.u0 r19, rc.d0 r20, zc.n r21, boolean r22, rc.l r23) throws jc.r {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.g.d(jc.u0, rc.d0, zc.n, boolean, rc.l):zc.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0138  */
    /* JADX WARN: Type inference failed for: r32v0, types: [zc.b, zc.g] */
    /* JADX WARN: Type inference failed for: r4v11, types: [bd.d1] */
    /* JADX WARN: Type inference failed for: r4v12, types: [bd.w] */
    /* JADX WARN: Type inference failed for: r4v13, types: [bd.d1] */
    /* JADX WARN: Type inference failed for: r4v14, types: [bd.b1] */
    /* JADX WARN: Type inference failed for: r4v15, types: [bd.q] */
    /* JADX WARN: Type inference failed for: r4v16, types: [bd.p] */
    /* JADX WARN: Type inference failed for: r4v17, types: [bd.g] */
    /* JADX WARN: Type inference failed for: r4v20, types: [ad.k] */
    /* JADX WARN: Type inference failed for: r4v21, types: [ad.k] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v6, types: [bd.c1] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jc.w e(jc.u0 r33, jc.o r34, jc.d r35, boolean r36) throws jc.r {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.g.e(jc.u0, jc.o, jc.d, boolean):jc.w");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x050b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.w findBeanOrAddOnSerializer(jc.u0 r25, jc.o r26, jc.d r27, boolean r28) throws jc.r {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.g.findBeanOrAddOnSerializer(jc.u0, jc.o, jc.d, boolean):jc.w");
    }

    @Deprecated
    public w findBeanSerializer(u0 u0Var, jc.o oVar, jc.d dVar) throws jc.r {
        return findBeanOrAddOnSerializer(u0Var, oVar, dVar, u0Var.isEnabled(y.USE_STATIC_TYPING));
    }

    public wc.j findPropertyContentTypeSerializer(jc.o oVar, s0 s0Var, rc.l lVar) throws jc.r {
        jc.o contentType = oVar.getContentType();
        wc.i iVarFindPropertyContentTypeResolver = s0Var.getAnnotationIntrospector().findPropertyContentTypeResolver(s0Var, lVar, oVar);
        return iVarFindPropertyContentTypeResolver == null ? createTypeSerializer(s0Var, contentType) : iVarFindPropertyContentTypeResolver.buildTypeSerializer(s0Var, contentType, s0Var.getSubtypeResolver().collectAndResolveSubtypesByClass(s0Var, lVar, contentType));
    }

    public wc.j findPropertyTypeSerializer(jc.o oVar, s0 s0Var, rc.l lVar) throws jc.r {
        wc.i iVarFindPropertyTypeResolver = s0Var.getAnnotationIntrospector().findPropertyTypeResolver(s0Var, lVar, oVar);
        return iVarFindPropertyTypeResolver == null ? createTypeSerializer(s0Var, oVar) : iVarFindPropertyTypeResolver.buildTypeSerializer(s0Var, oVar, s0Var.getSubtypeResolver().collectAndResolveSubtypesByClass(s0Var, lVar, oVar));
    }

    @Override // zc.b
    public s withConfig(e0 e0Var) {
        return this.f97758b == e0Var ? this : new g(e0Var);
    }
}
