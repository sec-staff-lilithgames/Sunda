package nc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final jc.o f75926a;

    /* renamed from: b, reason: collision with root package name */
    public final i[] f75927b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f75928c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f75929d;

    /* renamed from: e, reason: collision with root package name */
    public final dd.k0[] f75930e;

    public j(jc.o oVar, i[] iVarArr, HashMap map) {
        this.f75926a = oVar;
        this.f75927b = iVarArr;
        this.f75928c = map;
        this.f75929d = null;
        this.f75930e = null;
    }

    public static h builder(jc.o oVar) {
        return new h(oVar);
    }

    public final void a(ub.u uVar, jc.k kVar, Object obj, int i10, String str) throws IOException {
        if (str == null) {
            kVar.reportInputMismatch(this.f75926a, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        ub.u uVarAsParser = this.f75930e[i10].asParser(uVar);
        ub.z zVarNextToken = uVarAsParser.nextToken();
        ub.z zVar = ub.z.VALUE_NULL;
        i[] iVarArr = this.f75927b;
        if (zVarNextToken == zVar) {
            iVarArr[i10].getProperty().set(obj, null);
            return;
        }
        dd.k0 k0VarBufferForInputBuffering = kVar.bufferForInputBuffering(uVar);
        k0VarBufferForInputBuffering.writeStartArray();
        k0VarBufferForInputBuffering.writeString(str);
        k0VarBufferForInputBuffering.copyCurrentStructure(uVarAsParser);
        k0VarBufferForInputBuffering.writeEndArray();
        ub.u uVarAsParser2 = k0VarBufferForInputBuffering.asParser(uVar);
        uVarAsParser2.nextToken();
        iVarArr[i10].getProperty().deserializeAndSet(uVarAsParser2, kVar, obj);
    }

    public final boolean b(ub.u uVar, jc.k kVar, String str, Object obj, String str2, int i10) throws IOException {
        if (!this.f75927b[i10].hasTypePropertyName(str)) {
            return false;
        }
        if (obj != null) {
            dd.k0[] k0VarArr = this.f75930e;
            if (k0VarArr[i10] != null) {
                a(uVar, kVar, obj, i10, str2);
                k0VarArr[i10] = null;
                return true;
            }
        }
        this.f75929d[i10] = str2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object complete(ub.u r10, jc.k r11, java.lang.Object r12) throws java.io.IOException {
        /*
            r9 = this;
            nc.i[] r0 = r9.f75927b
            int r1 = r0.length
            r2 = 0
            r7 = r2
        L5:
            if (r7 >= r1) goto L93
            java.lang.String[] r2 = r9.f75929d
            r2 = r2[r7]
            r3 = r0[r7]
            dd.k0[] r4 = r9.f75930e
            if (r2 != 0) goto L7c
            r4 = r4[r7]
            if (r4 != 0) goto L1a
        L15:
            r4 = r10
            r5 = r11
            r6 = r12
            goto Lb2
        L1a:
            ub.z r5 = r4.firstToken()
            boolean r5 = r5.isScalarValue()
            if (r5 == 0) goto L3d
            ub.u r4 = r4.asParser(r10)
            r4.nextToken()
            mc.z r5 = r3.getProperty()
            jc.o r6 = r5.getType()
            java.lang.Object r4 = wc.g.deserializeIfNatural(r4, r11, r6)
            if (r4 == 0) goto L3d
            r5.set(r12, r4)
            goto L15
        L3d:
            boolean r4 = r3.hasDefaultType()
            jc.o r5 = r9.f75926a
            if (r4 != 0) goto L5b
            mc.z r4 = r3.getProperty()
            java.lang.String r4 = r4.getName()
            java.lang.String r3 = r3.getTypePropertyName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r6 = "Missing external type id property '%s' (and no 'defaultImpl' specified)"
            r11.reportPropertyInputMismatch(r5, r4, r6, r3)
            goto L76
        L5b:
            java.lang.String r2 = r3.getDefaultTypeId()
            if (r2 != 0) goto L76
            mc.z r4 = r3.getProperty()
            java.lang.String r4 = r4.getName()
            java.lang.String r3 = r3.getTypePropertyName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r6 = "Invalid default type id for property '%s': `null` returned by TypeIdResolver"
            r11.reportPropertyInputMismatch(r5, r4, r6, r3)
        L76:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r2
            goto Laf
        L7c:
            r4 = r4[r7]
            if (r4 != 0) goto L76
            mc.z r10 = r3.getProperty()
            boolean r0 = r10.isRequired()
            if (r0 != 0) goto L95
            jc.l r0 = jc.l.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r0 = r11.isEnabled(r0)
            if (r0 == 0) goto L93
            goto L95
        L93:
            r6 = r12
            goto Lb9
        L95:
            java.lang.Class r0 = r12.getClass()
            java.lang.String r1 = r10.getName()
            java.lang.String r10 = r10.getName()
            java.lang.String r2 = r3.getTypePropertyName()
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r2}
            java.lang.String r2 = "Missing property '%s' for external type id '%s'"
            r11.reportPropertyInputMismatch(r0, r1, r2, r10)
            return r12
        Laf:
            r3.a(r4, r5, r6, r7, r8)
        Lb2:
            int r7 = r7 + 1
            r10 = r4
            r11 = r5
            r12 = r6
            goto L5
        Lb9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.j.complete(ub.u, jc.k, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handlePropertyValue(ub.u r12, jc.k r13, java.lang.String r14, java.lang.Object r15) throws java.io.IOException {
        /*
            r11 = this;
            java.util.Map r4 = r11.f75928c
            java.lang.Object r4 = r4.get(r14)
            if (r4 != 0) goto La
            r1 = 0
            return r1
        La:
            boolean r5 = r4 instanceof java.util.List
            r6 = 1
            nc.i[] r7 = r11.f75927b
            dd.k0[] r8 = r11.f75930e
            java.lang.String[] r9 = r11.f75929d
            if (r5 == 0) goto L6b
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r10 = r5.intValue()
            r7 = r7[r10]
            boolean r3 = r7.hasTypePropertyName(r14)
            if (r3 == 0) goto L4d
            java.lang.String r2 = r12.getText()
            r12.skipChildren()
            int r1 = r5.intValue()
            r9[r1] = r2
        L3a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r4.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9[r1] = r2
            goto L3a
        L4d:
            dd.k0 r1 = r13.bufferAsCopyOfValue(r12)
            int r2 = r5.intValue()
            r8[r2] = r1
        L57:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r4.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8[r2] = r1
            goto L57
        L6a:
            return r6
        L6b:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = r7[r4]
            boolean r3 = r5.hasTypePropertyName(r14)
            if (r3 == 0) goto L89
            java.lang.String r3 = r12.getValueAsString()
            r9[r4] = r3
            r12.skipChildren()
            if (r15 == 0) goto La3
            r3 = r8[r4]
            if (r3 == 0) goto La3
            goto L95
        L89:
            dd.k0 r3 = r13.bufferAsCopyOfValue(r12)
            r8[r4] = r3
            if (r15 == 0) goto La3
            r3 = r9[r4]
            if (r3 == 0) goto La3
        L95:
            r5 = r9[r4]
            r7 = 0
            r9[r4] = r7
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r0.a(r1, r2, r3, r4, r5)
            r8[r4] = r7
        La3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.j.handlePropertyValue(ub.u, jc.k, java.lang.String, java.lang.Object):boolean");
    }

    public boolean handleTypePropertyValue(ub.u uVar, jc.k kVar, String str, Object obj) throws IOException {
        Object obj2 = this.f75928c.get(str);
        boolean z10 = false;
        if (obj2 == null) {
            return false;
        }
        String text = uVar.getText();
        if (!(obj2 instanceof List)) {
            return b(uVar, kVar, str, obj, text, ((Integer) obj2).intValue());
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            ub.u uVar2 = uVar;
            jc.k kVar2 = kVar;
            String str2 = str;
            Object obj3 = obj;
            if (b(uVar2, kVar2, str2, obj3, text, ((Integer) it.next()).intValue())) {
                z10 = true;
            }
            uVar = uVar2;
            kVar = kVar2;
            str = str2;
            obj = obj3;
        }
        return z10;
    }

    public j start() {
        return new j(this);
    }

    public j(j jVar) {
        this.f75926a = jVar.f75926a;
        i[] iVarArr = jVar.f75927b;
        this.f75927b = iVarArr;
        this.f75928c = jVar.f75928c;
        int length = iVarArr.length;
        this.f75929d = new String[length];
        this.f75930e = new dd.k0[length];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object complete(ub.u r17, jc.k r18, nc.h0 r19, nc.a0 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.j.complete(ub.u, jc.k, nc.h0, nc.a0):java.lang.Object");
    }
}
