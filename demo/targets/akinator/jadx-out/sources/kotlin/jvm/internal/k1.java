package kotlin.jvm.internal;

import be.nVUQ.UupKET;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.internal.CollectionDescriptorsKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k1 implements KType {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f71845g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final KClassifier f71846b;

    /* renamed from: c, reason: collision with root package name */
    public final List f71847c;

    /* renamed from: e, reason: collision with root package name */
    public final KType f71848e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71849f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public k1(KClassifier classifier, List<KTypeProjection> arguments, KType kType, int i10) {
        e0.checkNotNullParameter(classifier, "classifier");
        e0.checkNotNullParameter(arguments, "arguments");
        this.f71846b = classifier;
        this.f71847c = arguments;
        this.f71848e = kType;
        this.f71849f = i10;
    }

    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public final String a(boolean z10) {
        String name;
        KClassifier classifier = getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class javaClass = kClass != null ? jv.a.getJavaClass(kClass) : null;
        if (javaClass == null) {
            name = getClassifier().toString();
        } else if ((this.f71849f & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (javaClass.isArray()) {
            name = e0.areEqual(javaClass, boolean[].class) ? "kotlin.BooleanArray" : e0.areEqual(javaClass, char[].class) ? "kotlin.CharArray" : e0.areEqual(javaClass, byte[].class) ? "kotlin.ByteArray" : e0.areEqual(javaClass, short[].class) ? "kotlin.ShortArray" : e0.areEqual(javaClass, int[].class) ? "kotlin.IntArray" : e0.areEqual(javaClass, float[].class) ? "kotlin.FloatArray" : e0.areEqual(javaClass, long[].class) ? "kotlin.LongArray" : e0.areEqual(javaClass, double[].class) ? "kotlin.DoubleArray" : CollectionDescriptorsKt.ARRAY_NAME;
        } else if (z10 && javaClass.isPrimitive()) {
            KClassifier classifier2 = getClassifier();
            e0.checkNotNull(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = jv.a.getJavaObjectType((KClass) classifier2).getName();
        } else {
            name = javaClass.getName();
        }
        String strD = w0.i.d(name, getArguments().isEmpty() ? "" : uu.y0.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new aw.f(this, 16), 24, null), isMarkedNullable() ? "?" : "");
        KType kType = this.f71848e;
        if (!(kType instanceof k1)) {
            return strD;
        }
        String strA = ((k1) kType).a(true);
        if (e0.areEqual(strA, strD)) {
            return strD;
        }
        if (e0.areEqual(strA, strD + '?')) {
            return strD + '!';
        }
        return "(" + strD + ".." + strA + ')';
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return e0.areEqual(getClassifier(), k1Var.getClassifier()) && e0.areEqual(getArguments(), k1Var.getArguments()) && e0.areEqual(this.f71848e, k1Var.f71848e) && this.f71849f == k1Var.f71849f;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return uu.p0.emptyList();
    }

    @Override // kotlin.reflect.KType
    public List<KTypeProjection> getArguments() {
        return this.f71847c;
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.f71846b;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.f71849f;
    }

    public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.f71848e;
    }

    public int hashCode() {
        return Integer.hashCode(this.f71849f) + ((getArguments().hashCode() + (getClassifier().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return (this.f71849f & 1) != 0;
    }

    public String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k1(KClassifier classifier, List<KTypeProjection> list, boolean z10) {
        this(classifier, list, null, z10 ? 1 : 0);
        e0.checkNotNullParameter(classifier, "classifier");
        e0.checkNotNullParameter(list, UupKET.GpgFmazvSz);
    }
}
