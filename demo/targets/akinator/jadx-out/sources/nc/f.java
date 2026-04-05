package nc;

import com.unity3d.ads.BuildConfig;
import java.lang.reflect.Member;
import java.util.HashMap;
import oc.d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f75888j = {BuildConfig.FLAVOR, "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};

    /* renamed from: a, reason: collision with root package name */
    public final jc.d f75889a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75890b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f75891c;

    /* renamed from: d, reason: collision with root package name */
    public final rc.r[] f75892d = new rc.r[11];

    /* renamed from: e, reason: collision with root package name */
    public int f75893e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f75894f = false;

    /* renamed from: g, reason: collision with root package name */
    public mc.z[] f75895g;

    /* renamed from: h, reason: collision with root package name */
    public mc.z[] f75896h;

    /* renamed from: i, reason: collision with root package name */
    public mc.z[] f75897i;

    public f(jc.d dVar, lc.z zVar) {
        this.f75889a = dVar;
        this.f75890b = zVar.canOverrideAccessModifiers();
        this.f75891c = zVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public final jc.o a(jc.k kVar, rc.r rVar, mc.z[] zVarArr) {
        if (!this.f75894f || rVar == null) {
            return null;
        }
        int i10 = 0;
        if (zVarArr != null) {
            int length = zVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (zVarArr[i11] == null) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        jc.j config = kVar.getConfig();
        jc.o parameterType = rVar.getParameterType(i10);
        jc.c annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        rc.q parameter = rVar.getParameter(i10);
        Object objFindDeserializer = annotationIntrospector.findDeserializer(parameter);
        return objFindDeserializer != null ? parameterType.withValueHandler(kVar.deserializerInstance(parameter, objFindDeserializer)) : annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    public void addBigDecimalCreator(rc.r rVar, boolean z10) {
        b(rVar, 6, z10);
    }

    public void addBigIntegerCreator(rc.r rVar, boolean z10) {
        b(rVar, 4, z10);
    }

    public void addBooleanCreator(rc.r rVar, boolean z10) {
        b(rVar, 7, z10);
    }

    public void addDelegatingCreator(rc.r rVar, boolean z10, mc.z[] zVarArr, int i10) {
        if (rVar.getParameterType(i10).isCollectionLikeType()) {
            if (b(rVar, 10, z10)) {
                this.f75896h = zVarArr;
            }
        } else if (b(rVar, 8, z10)) {
            this.f75895g = zVarArr;
        }
    }

    public void addDoubleCreator(rc.r rVar, boolean z10) {
        b(rVar, 5, z10);
    }

    public void addIntCreator(rc.r rVar, boolean z10) {
        b(rVar, 2, z10);
    }

    public void addLongCreator(rc.r rVar, boolean z10) {
        b(rVar, 3, z10);
    }

    public void addPropertyCreator(rc.r rVar, boolean z10, mc.z[] zVarArr) {
        Integer num;
        if (b(rVar, 9, z10)) {
            if (zVarArr.length > 1) {
                HashMap map = new HashMap();
                int length = zVarArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String name = zVarArr[i10].getName();
                    if ((!name.isEmpty() || zVarArr[i10].getInjectableValueId() == null) && (num = (Integer) map.put(name, Integer.valueOf(i10))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, Integer.valueOf(i10), dd.i.nameOf(this.f75889a.getBeanClass())));
                    }
                }
            }
            this.f75897i = zVarArr;
        }
    }

    public void addStringCreator(rc.r rVar, boolean z10) {
        b(rVar, 1, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
    
        if (r4.isPrimitive() != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(rc.r r13, int r14, boolean r15) {
        /*
            r12 = this;
            r0 = 1
            int r1 = r0 << r14
            r12.f75894f = r0
            rc.r[] r2 = r12.f75892d
            r3 = r2[r14]
            if (r3 == 0) goto Lb0
            int r4 = r12.f75893e
            r4 = r4 & r1
            r5 = 0
            if (r4 == 0) goto L17
            if (r15 != 0) goto L15
            goto L9c
        L15:
            r4 = r0
            goto L19
        L17:
            r4 = r15 ^ 1
        L19:
            if (r4 == 0) goto Lb0
            java.lang.Class r4 = r3.getClass()
            java.lang.Class r6 = r13.getClass()
            if (r4 != r6) goto Lb0
            java.lang.Class r4 = r3.getRawParameterType(r5)
            java.lang.Class r6 = r13.getRawParameterType(r5)
            java.lang.String r7 = "implicitly discovered"
            java.lang.String r8 = "explicitly marked"
            java.lang.String[] r9 = nc.f.f75888j
            java.lang.String r10 = "Conflicting %s creators: already had %s creator %s, encountered another: %s"
            if (r4 != r6) goto L7e
            java.lang.Class r4 = r13.getDeclaringClass()
            boolean r4 = dd.i.isEnumType(r4)
            java.lang.String r6 = "valueOf"
            if (r4 == 0) goto L4f
            java.lang.String r4 = r13.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L4f
            r4 = r0
            goto L50
        L4f:
            r4 = r5
        L50:
            if (r4 == 0) goto L53
            goto L9c
        L53:
            java.lang.Class r4 = r3.getDeclaringClass()
            boolean r4 = dd.i.isEnumType(r4)
            if (r4 == 0) goto L68
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L68
            r5 = r0
        L68:
            if (r5 == 0) goto L6b
            goto Lb0
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r14 = r9[r14]
            if (r15 == 0) goto L72
            r7 = r8
        L72:
            java.lang.Object[] r13 = new java.lang.Object[]{r14, r7, r3, r13}
            java.lang.String r13 = java.lang.String.format(r10, r13)
            r0.<init>(r13)
            throw r0
        L7e:
            boolean r11 = r6.isAssignableFrom(r4)
            if (r11 == 0) goto L85
            goto L9c
        L85:
            boolean r11 = r4.isAssignableFrom(r6)
            if (r11 == 0) goto L8c
            goto Lb0
        L8c:
            boolean r11 = r4.isPrimitive()
            boolean r6 = r6.isPrimitive()
            if (r11 == r6) goto L9d
            boolean r3 = r4.isPrimitive()
            if (r3 == 0) goto Lb0
        L9c:
            return r5
        L9d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r14 = r9[r14]
            if (r15 == 0) goto La4
            r7 = r8
        La4:
            java.lang.Object[] r13 = new java.lang.Object[]{r14, r7, r3, r13}
            java.lang.String r13 = java.lang.String.format(r10, r13)
            r0.<init>(r13)
            throw r0
        Lb0:
            if (r15 == 0) goto Lb7
            int r15 = r12.f75893e
            r15 = r15 | r1
            r12.f75893e = r15
        Lb7:
            if (r13 == 0) goto Lc8
            boolean r15 = r12.f75890b
            if (r15 == 0) goto Lc8
            java.lang.reflect.AnnotatedElement r15 = r13.getAnnotated()
            java.lang.reflect.Member r15 = (java.lang.reflect.Member) r15
            boolean r1 = r12.f75891c
            dd.i.checkAndFixAccess(r15, r1)
        Lc8:
            r2[r14] = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.f.b(rc.r, int, boolean):boolean");
    }

    public mc.c0 constructValueInstantiator(jc.k kVar) throws jc.r {
        jc.j config = kVar.getConfig();
        rc.r[] rVarArr = this.f75892d;
        jc.o oVarA = a(kVar, rVarArr[8], this.f75895g);
        jc.o oVarA2 = a(kVar, rVarArr[10], this.f75896h);
        d1 d1Var = new d1(config, this.f75889a.getType());
        d1Var.configureFromObjectSettings(rVarArr[0], rVarArr[8], oVarA, this.f75895g, rVarArr[9], this.f75897i);
        d1Var.configureFromArraySettings(rVarArr[10], oVarA2, this.f75896h);
        d1Var.configureFromStringCreator(rVarArr[1]);
        d1Var.configureFromIntCreator(rVarArr[2]);
        d1Var.configureFromLongCreator(rVarArr[3]);
        d1Var.configureFromBigIntegerCreator(rVarArr[4]);
        d1Var.configureFromDoubleCreator(rVarArr[5]);
        d1Var.configureFromBigDecimalCreator(rVarArr[6]);
        d1Var.configureFromBooleanCreator(rVarArr[7]);
        return d1Var;
    }

    public boolean hasDefaultCreator() {
        return this.f75892d[0] != null;
    }

    public boolean hasDelegatingCreator() {
        return this.f75892d[8] != null;
    }

    public boolean hasPropertyBasedCreator() {
        return this.f75892d[9] != null;
    }

    public void setDefaultCreator(rc.r rVar) {
        if (rVar != null && this.f75890b) {
            dd.i.checkAndFixAccess((Member) rVar.getAnnotated(), this.f75891c);
        }
        this.f75892d[0] = rVar;
    }
}
