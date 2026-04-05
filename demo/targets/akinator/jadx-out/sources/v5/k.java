package v5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import hr.kNq.ikJMrW;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f89046a;

    public /* synthetic */ k(Bundle bundle) {
        this.f89046a = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ k m7519boximpl(Bundle bundle) {
        return new k(bundle);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m7520clearimpl(Bundle bundle) {
        bundle.clear();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m7521constructorimpl(Bundle source) {
        e0.checkNotNullParameter(source, "source");
        return source;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7522equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof k) && e0.areEqual(bundle, ((k) obj).m7559unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7523equalsimpl0(Bundle bundle, Bundle bundle2) {
        return e0.areEqual(bundle, bundle2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7524hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: putAll-impl, reason: not valid java name */
    public static final void m7525putAllimpl(Bundle bundle, Bundle from) {
        e0.checkNotNullParameter(from, "from");
        bundle.putAll(from);
    }

    /* renamed from: putBinder-impl, reason: not valid java name */
    public static final void m7526putBinderimpl(Bundle bundle, String key, IBinder value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putBinder(key, value);
    }

    /* renamed from: putBoolean-impl, reason: not valid java name */
    public static final void m7527putBooleanimpl(Bundle bundle, String key, boolean z10) {
        e0.checkNotNullParameter(key, "key");
        bundle.putBoolean(key, z10);
    }

    /* renamed from: putBooleanArray-impl, reason: not valid java name */
    public static final void m7528putBooleanArrayimpl(Bundle bundle, String key, boolean[] value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putBooleanArray(key, value);
    }

    /* renamed from: putChar-impl, reason: not valid java name */
    public static final void m7529putCharimpl(Bundle bundle, String key, char c10) {
        e0.checkNotNullParameter(key, "key");
        bundle.putChar(key, c10);
    }

    /* renamed from: putCharArray-impl, reason: not valid java name */
    public static final void m7530putCharArrayimpl(Bundle bundle, String key, char[] value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putCharArray(key, value);
    }

    /* renamed from: putCharSequence-impl, reason: not valid java name */
    public static final void m7531putCharSequenceimpl(Bundle bundle, String key, CharSequence value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putCharSequence(key, value);
    }

    /* renamed from: putCharSequenceArray-impl, reason: not valid java name */
    public static final void m7532putCharSequenceArrayimpl(Bundle bundle, String key, CharSequence[] value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putCharSequenceArray(key, value);
    }

    /* renamed from: putCharSequenceList-impl, reason: not valid java name */
    public static final void m7533putCharSequenceListimpl(Bundle bundle, String key, List<? extends CharSequence> value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putCharSequenceArrayList(key, l.toArrayListUnsafe(value));
    }

    /* renamed from: putDouble-impl, reason: not valid java name */
    public static final void m7534putDoubleimpl(Bundle bundle, String key, double d10) {
        e0.checkNotNullParameter(key, "key");
        bundle.putDouble(key, d10);
    }

    /* renamed from: putDoubleArray-impl, reason: not valid java name */
    public static final void m7535putDoubleArrayimpl(Bundle bundle, String key, double[] value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putDoubleArray(key, value);
    }

    /* renamed from: putFloat-impl, reason: not valid java name */
    public static final void m7536putFloatimpl(Bundle bundle, String key, float f10) {
        e0.checkNotNullParameter(key, "key");
        bundle.putFloat(key, f10);
    }

    /* renamed from: putFloatArray-impl, reason: not valid java name */
    public static final void m7537putFloatArrayimpl(Bundle bundle, String key, float[] value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putFloatArray(key, value);
    }

    /* renamed from: putInt-impl, reason: not valid java name */
    public static final void m7538putIntimpl(Bundle bundle, String key, int i10) {
        e0.checkNotNullParameter(key, "key");
        bundle.putInt(key, i10);
    }

    /* renamed from: putIntArray-impl, reason: not valid java name */
    public static final void m7539putIntArrayimpl(Bundle bundle, String key, int[] value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putIntArray(key, value);
    }

    /* renamed from: putIntList-impl, reason: not valid java name */
    public static final void m7540putIntListimpl(Bundle bundle, String key, List<Integer> value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putIntegerArrayList(key, l.toArrayListUnsafe(value));
    }

    /* renamed from: putJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> void m7541putJavaSerializableimpl(Bundle bundle, String key, T value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putSerializable(key, value);
    }

    /* renamed from: putLong-impl, reason: not valid java name */
    public static final void m7542putLongimpl(Bundle bundle, String key, long j10) {
        e0.checkNotNullParameter(key, "key");
        bundle.putLong(key, j10);
    }

    /* renamed from: putLongArray-impl, reason: not valid java name */
    public static final void m7543putLongArrayimpl(Bundle bundle, String key, long[] value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putLongArray(key, value);
    }

    /* renamed from: putNull-impl, reason: not valid java name */
    public static final void m7544putNullimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        bundle.putString(key, null);
    }

    /* renamed from: putParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m7545putParcelableimpl(Bundle bundle, String key, T value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putParcelable(key, value);
    }

    /* renamed from: putParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m7546putParcelableArrayimpl(Bundle bundle, String key, T[] value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putParcelableArray(key, value);
    }

    /* renamed from: putParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m7547putParcelableListimpl(Bundle bundle, String key, List<? extends T> value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putParcelableArrayList(key, l.toArrayListUnsafe(value));
    }

    /* renamed from: putSavedState-impl, reason: not valid java name */
    public static final void m7548putSavedStateimpl(Bundle bundle, String key, Bundle value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putBundle(key, value);
    }

    /* renamed from: putSavedStateArray-impl, reason: not valid java name */
    public static final void m7549putSavedStateArrayimpl(Bundle bundle, String key, Bundle[] value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        m7546putParcelableArrayimpl(bundle, key, value);
    }

    /* renamed from: putSavedStateList-impl, reason: not valid java name */
    public static final void m7550putSavedStateListimpl(Bundle bundle, String key, List<Bundle> value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        m7547putParcelableListimpl(bundle, key, value);
    }

    /* renamed from: putSize-impl, reason: not valid java name */
    public static final void m7551putSizeimpl(Bundle bundle, String key, Size value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putSize(key, value);
    }

    /* renamed from: putSizeF-impl, reason: not valid java name */
    public static final void m7552putSizeFimpl(Bundle bundle, String key, SizeF value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putSizeF(key, value);
    }

    /* renamed from: putSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m7553putSparseParcelableArrayimpl(Bundle bundle, String key, SparseArray<T> value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putSparseParcelableArray(key, value);
    }

    /* renamed from: putString-impl, reason: not valid java name */
    public static final void m7554putStringimpl(Bundle bundle, String key, String value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putString(key, value);
    }

    /* renamed from: putStringList-impl, reason: not valid java name */
    public static final void m7556putStringListimpl(Bundle bundle, String key, List<String> value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        bundle.putStringArrayList(key, l.toArrayListUnsafe(value));
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final void m7557removeimpl(Bundle bundle, String key) {
        e0.checkNotNullParameter(key, "key");
        bundle.remove(key);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7558toStringimpl(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m7522equalsimpl(this.f89046a, obj);
    }

    public int hashCode() {
        return m7524hashCodeimpl(this.f89046a);
    }

    public String toString() {
        return m7558toStringimpl(this.f89046a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m7559unboximpl() {
        return this.f89046a;
    }

    /* renamed from: putStringArray-impl, reason: not valid java name */
    public static final void m7555putStringArrayimpl(Bundle bundle, String str, String[] value) {
        e0.checkNotNullParameter(str, ikJMrW.yYmBWYGbCLD);
        e0.checkNotNullParameter(value, "value");
        bundle.putStringArray(str, value);
    }
}
