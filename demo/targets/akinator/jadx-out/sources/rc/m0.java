package rc;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f84225a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84226b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84227c;

    /* renamed from: d, reason: collision with root package name */
    public final String f84228d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84229e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84230f;

    public m0(lc.z zVar, String str, String str2, String str3, i0 i0Var) {
        this.f84226b = zVar.isEnabled(jc.y.USE_STD_BEAN_NAMING);
        this.f84227c = zVar.isEnabled(jc.y.ALLOW_IS_GETTERS_FOR_NON_BOOLEAN);
        this.f84230f = str;
        this.f84228d = str2;
        this.f84229e = str3;
        this.f84225a = i0Var;
    }

    public final String a(int i10, String str) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char cCharAt = str.charAt(i10);
        i0 i0Var = this.f84225a;
        if (i0Var != null && !((j0) i0Var).accept(cCharAt, str, i10)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        while (true) {
            i10++;
            if (i10 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i10);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb2.append((CharSequence) str, i10, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    public final String b(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return null;
        }
        char cCharAt = str.charAt(i10);
        i0 i0Var = this.f84225a;
        if (i0Var != null && !((j0) i0Var).accept(cCharAt, str, i10)) {
            return null;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i10);
        }
        int i11 = i10 + 1;
        if (i11 < length && Character.isUpperCase(str.charAt(i11))) {
            return str.substring(i10);
        }
        StringBuilder sb2 = new StringBuilder(length - i10);
        sb2.append(lowerCase);
        sb2.append((CharSequence) str, i11, length);
        return sb2.toString();
    }

    @Override // rc.a
    public String findNameForIsGetter(m mVar, String str) {
        String str2 = this.f84229e;
        if (str2 == null) {
            return null;
        }
        if (!this.f84227c) {
            jc.o type = mVar.getType();
            if (type.isReferenceType()) {
                type = type.getReferencedType();
            }
            if (!type.hasRawClass(Boolean.TYPE) && !type.hasRawClass(Boolean.class) && !type.hasRawClass(AtomicBoolean.class)) {
                return null;
            }
        }
        if (str.startsWith(str2)) {
            return this.f84226b ? b(str, str2.length()) : a(str2.length(), str);
        }
        return null;
    }

    @Override // rc.a
    public String findNameForMutator(m mVar, String str) {
        String str2 = this.f84230f;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this.f84226b ? b(str, str2.length()) : a(str2.length(), str);
    }

    @Override // rc.a
    public String findNameForRegularGetter(m mVar, String str) {
        String str2 = this.f84228d;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        if ("getCallbacks".equals(str)) {
            Class<?> rawType = mVar.getRawType();
            if (rawType.isArray()) {
                String name = rawType.getComponentType().getName();
                if (name.contains(".cglib") && (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib"))) {
                    return null;
                }
            }
        } else if ("getMetaClass".equals(str) && mVar.getRawType().getName().startsWith("groovy.lang")) {
            return null;
        }
        return this.f84226b ? b(str, str2.length()) : a(str2.length(), str);
    }

    @Override // rc.a
    public String modifyFieldName(i iVar, String str) {
        return str;
    }
}
