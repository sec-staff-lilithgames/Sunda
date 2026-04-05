package v5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.google.android.gms.ads.RequestConfiguration;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import p0.o2;
import qv.v;
import uu.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f89040a;

    public /* synthetic */ b(Bundle bundle) {
        this.f89040a = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b m7434boximpl(Bundle bundle) {
        return new b(bundle);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m7435constructorimpl(Bundle source) {
        e0.checkNotNullParameter(source, "source");
        return source;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m7436containsimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    /* renamed from: contentDeepEquals-impl, reason: not valid java name */
    public static final boolean m7437contentDeepEqualsimpl(Bundle bundle, Bundle other) {
        e0.checkNotNullParameter(other, "other");
        return e.a(bundle, other);
    }

    /* renamed from: contentDeepHashCode-impl, reason: not valid java name */
    public static final int m7438contentDeepHashCodeimpl(Bundle bundle) {
        return e.b(bundle);
    }

    /* renamed from: contentDeepToString-impl, reason: not valid java name */
    public static final String m7439contentDeepToStringimpl(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder((v.coerceAtMost(bundle.size(), 429496729) * 5) + 2);
        e.c(bundle, sb2, new ArrayList());
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7440equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof b) && e0.areEqual(bundle, ((b) obj).m7518unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7441equalsimpl0(Bundle bundle, Bundle bundle2) {
        return e0.areEqual(bundle, bundle2);
    }

    /* renamed from: getBinder-impl, reason: not valid java name */
    public static final IBinder m7442getBinderimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        IBinder binder = bundle.getBinder(key);
        if (binder != null) {
            return binder;
        }
        throw o2.y(key);
    }

    /* renamed from: getBinderOrNull-impl, reason: not valid java name */
    public static final IBinder m7443getBinderOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getBinder(key);
    }

    /* renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m7444getBooleanimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return z10;
        }
        throw o2.y(key);
    }

    /* renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m7445getBooleanArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        throw o2.y(key);
    }

    /* renamed from: getBooleanArrayOrNull-impl, reason: not valid java name */
    public static final boolean[] m7446getBooleanArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getBooleanArray(key);
    }

    /* renamed from: getBooleanOrNull-impl, reason: not valid java name */
    public static final Boolean m7447getBooleanOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return Boolean.valueOf(z10);
        }
        return null;
    }

    /* renamed from: getChar-impl, reason: not valid java name */
    public static final char m7448getCharimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        char c10 = bundle.getChar(key, (char) 0);
        if (c10 == 0 && bundle.getChar(key, (char) 65535) == 65535) {
            throw o2.y(key);
        }
        return c10;
    }

    /* renamed from: getCharArray-impl, reason: not valid java name */
    public static final char[] m7449getCharArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        char[] charArray = bundle.getCharArray(key);
        if (charArray != null) {
            return charArray;
        }
        throw o2.y(key);
    }

    /* renamed from: getCharArrayOrNull-impl, reason: not valid java name */
    public static final char[] m7450getCharArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getCharArray(key);
    }

    /* renamed from: getCharOrNull-impl, reason: not valid java name */
    public static final Character m7451getCharOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        char c10 = bundle.getChar(key, (char) 0);
        if (c10 == 0 && bundle.getChar(key, (char) 65535) == 65535) {
            return null;
        }
        return Character.valueOf(c10);
    }

    /* renamed from: getCharSequenceArray-impl, reason: not valid java name */
    public static final CharSequence[] m7453getCharSequenceArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(key);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        throw o2.y(key);
    }

    /* renamed from: getCharSequenceArrayOrNull-impl, reason: not valid java name */
    public static final CharSequence[] m7454getCharSequenceArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getCharSequenceArray(key);
    }

    /* renamed from: getCharSequenceList-impl, reason: not valid java name */
    public static final List<CharSequence> m7455getCharSequenceListimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(key);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        throw o2.y(key);
    }

    /* renamed from: getCharSequenceListOrNull-impl, reason: not valid java name */
    public static final List<CharSequence> m7456getCharSequenceListOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getCharSequenceArrayList(key);
    }

    /* renamed from: getCharSequenceOrNull-impl, reason: not valid java name */
    public static final CharSequence m7457getCharSequenceOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getCharSequence(key);
    }

    /* renamed from: getDouble-impl, reason: not valid java name */
    public static final double m7458getDoubleimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        double d10 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d10 == Double.MIN_VALUE && bundle.getDouble(key, Double.MAX_VALUE) == Double.MAX_VALUE) {
            throw o2.y(key);
        }
        return d10;
    }

    /* renamed from: getDoubleArray-impl, reason: not valid java name */
    public static final double[] m7459getDoubleArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        double[] doubleArray = bundle.getDoubleArray(key);
        if (doubleArray != null) {
            return doubleArray;
        }
        throw o2.y(key);
    }

    /* renamed from: getDoubleArrayOrNull-impl, reason: not valid java name */
    public static final double[] m7460getDoubleArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getDoubleArray(key);
    }

    /* renamed from: getDoubleOrNull-impl, reason: not valid java name */
    public static final Double m7461getDoubleOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        double d10 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d10 == Double.MIN_VALUE && bundle.getDouble(key, Double.MAX_VALUE) == Double.MAX_VALUE) {
            return null;
        }
        return Double.valueOf(d10);
    }

    /* renamed from: getFloat-impl, reason: not valid java name */
    public static final float m7462getFloatimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
            throw o2.y(key);
        }
        return f10;
    }

    /* renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m7463getFloatArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        float[] floatArray = bundle.getFloatArray(key);
        if (floatArray != null) {
            return floatArray;
        }
        throw o2.y(key);
    }

    /* renamed from: getFloatArrayOrNull-impl, reason: not valid java name */
    public static final float[] m7464getFloatArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getFloatArray(key);
    }

    /* renamed from: getFloatOrNull-impl, reason: not valid java name */
    public static final Float m7465getFloatOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(f10);
    }

    /* renamed from: getInt-impl, reason: not valid java name */
    public static final int m7466getIntimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 == Integer.MIN_VALUE && bundle.getInt(key, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            throw o2.y(key);
        }
        return i10;
    }

    /* renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m7467getIntArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        throw o2.y(key);
    }

    /* renamed from: getIntArrayOrNull-impl, reason: not valid java name */
    public static final int[] m7468getIntArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getIntArray(key);
    }

    /* renamed from: getIntList-impl, reason: not valid java name */
    public static final List<Integer> m7469getIntListimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(key);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        throw o2.y(key);
    }

    /* renamed from: getIntListOrNull-impl, reason: not valid java name */
    public static final List<Integer> m7470getIntListOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getIntegerArrayList(key);
    }

    /* renamed from: getIntOrNull-impl, reason: not valid java name */
    public static final Integer m7471getIntOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 == Integer.MIN_VALUE && bundle.getInt(key, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m7473getJavaSerializableimpl(Bundle bundle, String key, KClass<T> serializableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(serializableClass, "serializableClass");
        T t10 = (T) t3.d.getSerializable(bundle, key, jv.a.getJavaClass((KClass) serializableClass));
        if (t10 != null) {
            return t10;
        }
        throw o2.y(key);
    }

    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m7475getJavaSerializableOrNullimpl(Bundle bundle, String key, KClass<T> serializableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(serializableClass, "serializableClass");
        return (T) t3.d.getSerializable(bundle, key, jv.a.getJavaClass((KClass) serializableClass));
    }

    /* renamed from: getLong-impl, reason: not valid java name */
    public static final long m7476getLongimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 == Long.MIN_VALUE && bundle.getLong(key, Long.MAX_VALUE) == Long.MAX_VALUE) {
            throw o2.y(key);
        }
        return j10;
    }

    /* renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m7477getLongArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        throw o2.y(key);
    }

    /* renamed from: getLongArrayOrNull-impl, reason: not valid java name */
    public static final long[] m7478getLongArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getLongArray(key);
    }

    /* renamed from: getLongOrNull-impl, reason: not valid java name */
    public static final Long m7479getLongOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 == Long.MIN_VALUE && bundle.getLong(key, Long.MAX_VALUE) == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j10);
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m7481getParcelableimpl(Bundle bundle, String key, KClass<T> parcelableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(parcelableClass, "parcelableClass");
        T t10 = (T) t3.d.getParcelable(bundle, key, jv.a.getJavaClass((KClass) parcelableClass));
        if (t10 != null) {
            return t10;
        }
        throw o2.y(key);
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m7483getParcelableArrayimpl(Bundle bundle, String key, KClass<T> parcelableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) m7485getParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (tArr != null) {
            return tArr;
        }
        throw o2.y(key);
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m7485getParcelableArrayOrNullimpl(Bundle bundle, String key, KClass<T> parcelableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) t3.d.getParcelableArray(bundle, key, jv.a.getJavaClass((KClass) parcelableClass));
        if (tArr != null) {
            return tArr;
        }
        return null;
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m7487getParcelableListimpl(Bundle bundle, String key, KClass<T> parcelableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(parcelableClass, "parcelableClass");
        ArrayList parcelableArrayList = t3.d.getParcelableArrayList(bundle, key, jv.a.getJavaClass((KClass) parcelableClass));
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        throw o2.y(key);
    }

    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m7489getParcelableListOrNullimpl(Bundle bundle, String key, KClass<T> parcelableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(parcelableClass, "parcelableClass");
        return t3.d.getParcelableArrayList(bundle, key, jv.a.getJavaClass((KClass) parcelableClass));
    }

    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m7491getParcelableOrNullimpl(Bundle bundle, String key, KClass<T> parcelableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(parcelableClass, "parcelableClass");
        return (T) t3.d.getParcelable(bundle, key, jv.a.getJavaClass((KClass) parcelableClass));
    }

    /* renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m7492getSavedStateimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        throw o2.y(key);
    }

    /* renamed from: getSavedStateArray-impl, reason: not valid java name */
    public static final Bundle[] m7493getSavedStateArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return (Bundle[]) m7483getParcelableArrayimpl(bundle, key, c1.getOrCreateKotlinClass(Bundle.class));
    }

    /* renamed from: getSavedStateArrayOrNull-impl, reason: not valid java name */
    public static final Bundle[] m7494getSavedStateArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return (Bundle[]) m7485getParcelableArrayOrNullimpl(bundle, key, c1.getOrCreateKotlinClass(Bundle.class));
    }

    /* renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final List<Bundle> m7495getSavedStateListimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return m7487getParcelableListimpl(bundle, key, c1.getOrCreateKotlinClass(Bundle.class));
    }

    /* renamed from: getSavedStateListOrNull-impl, reason: not valid java name */
    public static final List<Bundle> m7496getSavedStateListOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return m7489getParcelableListOrNullimpl(bundle, key, c1.getOrCreateKotlinClass(Bundle.class));
    }

    /* renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m7497getSavedStateOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getBundle(key);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final Size m7498getSizeimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        Size size = bundle.getSize(key);
        if (size != null) {
            return size;
        }
        throw o2.y(key);
    }

    /* renamed from: getSizeF-impl, reason: not valid java name */
    public static final SizeF m7499getSizeFimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        SizeF sizeF = bundle.getSizeF(key);
        if (sizeF != null) {
            return sizeF;
        }
        throw o2.y(key);
    }

    /* renamed from: getSizeFOrNull-impl, reason: not valid java name */
    public static final SizeF m7500getSizeFOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getSizeF(key);
    }

    /* renamed from: getSizeOrNull-impl, reason: not valid java name */
    public static final Size m7501getSizeOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getSize(key);
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m7503getSparseParcelableArrayimpl(Bundle bundle, String key, KClass<T> parcelableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(parcelableClass, "parcelableClass");
        SparseArray<T> sparseArrayM7505getSparseParcelableArrayOrNullimpl = m7505getSparseParcelableArrayOrNullimpl(bundle, key, parcelableClass);
        if (sparseArrayM7505getSparseParcelableArrayOrNullimpl != null) {
            return sparseArrayM7505getSparseParcelableArrayOrNullimpl;
        }
        throw o2.y(key);
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m7505getSparseParcelableArrayOrNullimpl(Bundle bundle, String key, KClass<T> parcelableClass) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(parcelableClass, "parcelableClass");
        return t3.d.getSparseParcelableArray(bundle, key, jv.a.getJavaClass((KClass) parcelableClass));
    }

    /* renamed from: getString-impl, reason: not valid java name */
    public static final String m7506getStringimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        throw o2.y(key);
    }

    /* renamed from: getStringArrayOrNull-impl, reason: not valid java name */
    public static final String[] m7508getStringArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getStringArray(key);
    }

    /* renamed from: getStringList-impl, reason: not valid java name */
    public static final List<String> m7509getStringListimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        throw o2.y(key);
    }

    /* renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List<String> m7510getStringListOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getStringArrayList(key);
    }

    /* renamed from: getStringOrNull-impl, reason: not valid java name */
    public static final String m7511getStringOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return bundle.getString(key);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7512hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m7513isEmptyimpl(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m7514isNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        return m7436containsimpl(bundle, key) && bundle.get(key) == null;
    }

    /* renamed from: size-impl, reason: not valid java name */
    public static final int m7515sizeimpl(Bundle bundle) {
        return bundle.size();
    }

    /* renamed from: toMap-impl, reason: not valid java name */
    public static final Map<String, Object> m7516toMapimpl(Bundle bundle) {
        Map mapCreateMapBuilder = o1.createMapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            e0.checkNotNull(str);
            mapCreateMapBuilder.put(str, bundle.get(str));
        }
        return o1.build(mapCreateMapBuilder);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7517toStringimpl(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m7440equalsimpl(this.f89040a, obj);
    }

    public int hashCode() {
        return m7512hashCodeimpl(this.f89040a);
    }

    public String toString() {
        return m7517toStringimpl(this.f89040a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m7518unboximpl() {
        return this.f89040a;
    }

    /* renamed from: getCharSequence-impl, reason: not valid java name */
    public static final CharSequence m7452getCharSequenceimpl(Bundle bundle, String str) {
        e0.checkNotNullParameter(str, KerkSviMAy.mwduh);
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        throw o2.y(str);
    }

    /* renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m7474getJavaSerializableOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) m7475getJavaSerializableOrNullimpl(bundle, key, c1.getOrCreateKotlinClass(Serializable.class));
    }

    /* renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m7484getParcelableArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T[]) m7485getParcelableArrayOrNullimpl(bundle, key, c1.getOrCreateKotlinClass(Parcelable.class));
    }

    /* renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m7488getParcelableListOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return m7489getParcelableListOrNullimpl(bundle, key, c1.getOrCreateKotlinClass(Parcelable.class));
    }

    /* renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m7490getParcelableOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) m7491getParcelableOrNullimpl(bundle, key, c1.getOrCreateKotlinClass(Parcelable.class));
    }

    /* renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m7504getSparseParcelableArrayOrNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return m7505getSparseParcelableArrayOrNullimpl(bundle, key, c1.getOrCreateKotlinClass(Parcelable.class));
    }

    /* renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m7507getStringArrayimpl(Bundle bundle, String str) {
        e0.checkNotNullParameter(str, KerkSviMAy.EMmzjuKPyVac);
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        throw o2.y(str);
    }

    /* renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m7472getJavaSerializableimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) m7473getJavaSerializableimpl(bundle, key, c1.getOrCreateKotlinClass(Serializable.class));
    }

    /* renamed from: getParcelable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m7480getParcelableimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) m7481getParcelableimpl(bundle, key, c1.getOrCreateKotlinClass(Parcelable.class));
    }

    /* renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m7482getParcelableArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T[]) m7483getParcelableArrayimpl(bundle, key, c1.getOrCreateKotlinClass(Parcelable.class));
    }

    /* renamed from: getParcelableList-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m7486getParcelableListimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return m7487getParcelableListimpl(bundle, key, c1.getOrCreateKotlinClass(Parcelable.class));
    }

    /* renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m7502getSparseParcelableArrayimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return m7503getSparseParcelableArrayimpl(bundle, key, c1.getOrCreateKotlinClass(Parcelable.class));
    }
}
