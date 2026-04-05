package ad;

import bd.z0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import jc.t0;
import jc.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class z extends bd.a {

    /* renamed from: h, reason: collision with root package name */
    public static final jc.o f4311h = cd.s.defaultInstance().uncheckedSimpleType(String.class);

    /* renamed from: i, reason: collision with root package name */
    public static final z f4312i = new z();

    /* renamed from: g, reason: collision with root package name */
    public final jc.w f4313g;

    public z() {
        super(String[].class);
        this.f4313g = null;
    }

    @Override // bd.a
    public jc.w _withResolved(jc.g gVar, Boolean bool) {
        return new z(this, gVar, this.f4313g, bool);
    }

    @Override // bd.z0, jc.w, uc.e
    public void acceptJsonFormatVisitor(uc.h hVar, jc.o oVar) throws jc.r {
        HashMap map = uc.d.f88404b;
        hVar.expectArrayFormat(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // bd.a, zc.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc.w createContextual(jc.u0 r5, jc.g r6) throws jc.r {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L18
            jc.c r1 = r5.getAnnotationIntrospector()
            rc.l r2 = r6.getMember()
            if (r2 == 0) goto L18
            java.lang.Object r1 = r1.findContentSerializer(r2)
            if (r1 == 0) goto L18
            jc.w r1 = r5.serializerInstance(r2, r1)
            goto L19
        L18:
            r1 = r0
        L19:
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            tb.t r2 = bd.z0.c(r2, r5, r6)
            if (r2 == 0) goto L28
            tb.q r3 = tb.q.f86758g
            java.lang.Boolean r2 = r2.getFeature(r3)
            goto L29
        L28:
            r2 = r0
        L29:
            jc.w r3 = r4.f4313g
            if (r1 != 0) goto L2e
            r1 = r3
        L2e:
            jc.w r1 = bd.z0.b(r5, r6, r1)
            if (r1 != 0) goto L3a
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            jc.w r1 = r5.findContentValueSerializer(r1, r6)
        L3a:
            boolean r5 = dd.i.isJacksonStdImpl(r1)
            if (r5 == 0) goto L41
            goto L42
        L41:
            r0 = r1
        L42:
            if (r0 != r3) goto L4d
            java.lang.Boolean r5 = r4.f9052f
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L4d
            return r4
        L4d:
            ad.z r5 = new ad.z
            r5.<init>(r4, r6, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.z.createContextual(jc.u0, jc.g):jc.w");
    }

    @Override // zc.i
    public jc.w getContentSerializer() {
        return this.f4313g;
    }

    @Override // zc.i
    public jc.o getContentType() {
        return f4311h;
    }

    @Override // bd.z0, vc.c
    @Deprecated
    public jc.t getSchema(u0 u0Var, Type type) {
        return z0.a("array").set("items", z0.a("string"));
    }

    @Override // zc.i
    public boolean hasSingleElement(String[] strArr) {
        return strArr.length == 1;
    }

    @Override // jc.w
    public boolean isEmpty(u0 u0Var, String[] strArr) {
        return strArr.length == 0;
    }

    @Override // bd.a, bd.z0, jc.w
    public final void serialize(String[] strArr, ub.o oVar, u0 u0Var) throws IOException {
        Boolean bool;
        int length = strArr.length;
        if (length == 1 && (((bool = this.f9052f) == null && u0Var.isEnabled(t0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || bool == Boolean.TRUE)) {
            serializeContents(strArr, oVar, u0Var);
            return;
        }
        oVar.writeStartArray(strArr, length);
        serializeContents(strArr, oVar, u0Var);
        oVar.writeEndArray();
    }

    @Override // bd.a
    public void serializeContents(String[] strArr, ub.o oVar, u0 u0Var) throws IOException {
        int length = strArr.length;
        if (length == 0) {
            return;
        }
        int i10 = 0;
        jc.w wVar = this.f4313g;
        if (wVar == null) {
            while (i10 < length) {
                String str = strArr[i10];
                if (str == null) {
                    oVar.writeNull();
                } else {
                    oVar.writeString(str);
                }
                i10++;
            }
            return;
        }
        int length2 = strArr.length;
        while (i10 < length2) {
            String str2 = strArr[i10];
            if (str2 == null) {
                u0Var.defaultSerializeNull(oVar);
            } else {
                wVar.serialize(str2, oVar, u0Var);
            }
            i10++;
        }
    }

    public z(z zVar, jc.g gVar, jc.w wVar, Boolean bool) {
        super(zVar, gVar, bool);
        this.f4313g = wVar;
    }

    @Override // zc.i
    public zc.i _withValueTypeSerializer(wc.j jVar) {
        return this;
    }
}
