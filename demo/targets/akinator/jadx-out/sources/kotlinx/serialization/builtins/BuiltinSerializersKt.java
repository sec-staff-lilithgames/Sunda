package kotlinx.serialization.builtins;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.w;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NothingSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.UByteArraySerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntArraySerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongArraySerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortArraySerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
import kotlinx.serialization.internal.UuidSerializer;
import tu.d0;
import tu.f0;
import tu.i0;
import tu.j0;
import tu.k0;
import tu.m0;
import tu.n0;
import tu.o0;
import tu.q0;
import tu.s0;
import tu.t0;
import tu.v;
import tu.v0;
import tu.x0;
import tv.e;
import tv.f;
import vv.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BuiltinSerializersKt {
    @ExperimentalSerializationApi
    public static final /* synthetic */ <T, E extends T> KSerializer<E[]> ArraySerializer(KSerializer<E> elementSerializer) {
        e0.checkNotNullParameter(elementSerializer, "elementSerializer");
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return ArraySerializer(c1.getOrCreateKotlinClass(Object.class), elementSerializer);
    }

    public static final KSerializer<boolean[]> BooleanArraySerializer() {
        return BooleanArraySerializer.INSTANCE;
    }

    public static final KSerializer<byte[]> ByteArraySerializer() {
        return ByteArraySerializer.INSTANCE;
    }

    public static final KSerializer<char[]> CharArraySerializer() {
        return CharArraySerializer.INSTANCE;
    }

    public static final KSerializer<double[]> DoubleArraySerializer() {
        return DoubleArraySerializer.INSTANCE;
    }

    public static final KSerializer<float[]> FloatArraySerializer() {
        return FloatArraySerializer.INSTANCE;
    }

    public static final KSerializer<int[]> IntArraySerializer() {
        return IntArraySerializer.INSTANCE;
    }

    public static final <T> KSerializer<List<T>> ListSerializer(KSerializer<T> elementSerializer) {
        e0.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ArrayListSerializer(elementSerializer);
    }

    public static final KSerializer<long[]> LongArraySerializer() {
        return LongArraySerializer.INSTANCE;
    }

    public static final <K, V> KSerializer<Map.Entry<K, V>> MapEntrySerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        e0.checkNotNullParameter(keySerializer, "keySerializer");
        e0.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new MapEntrySerializer(keySerializer, valueSerializer);
    }

    public static final <K, V> KSerializer<Map<K, V>> MapSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        e0.checkNotNullParameter(keySerializer, "keySerializer");
        e0.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new LinkedHashMapSerializer(keySerializer, valueSerializer);
    }

    @ExperimentalSerializationApi
    public static final KSerializer NothingSerializer() {
        return NothingSerializer.INSTANCE;
    }

    public static final <K, V> KSerializer<v> PairSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        e0.checkNotNullParameter(keySerializer, "keySerializer");
        e0.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new PairSerializer(keySerializer, valueSerializer);
    }

    public static final <T> KSerializer<Set<T>> SetSerializer(KSerializer<T> elementSerializer) {
        e0.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new LinkedHashSetSerializer(elementSerializer);
    }

    public static final KSerializer<short[]> ShortArraySerializer() {
        return ShortArraySerializer.INSTANCE;
    }

    public static final <A, B, C> KSerializer<d0> TripleSerializer(KSerializer<A> aSerializer, KSerializer<B> bSerializer, KSerializer<C> cSerializer) {
        e0.checkNotNullParameter(aSerializer, "aSerializer");
        e0.checkNotNullParameter(bSerializer, "bSerializer");
        e0.checkNotNullParameter(cSerializer, "cSerializer");
        return new TripleSerializer(aSerializer, bSerializer, cSerializer);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<i0> UByteArraySerializer() {
        return UByteArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<m0> UIntArraySerializer() {
        return UIntArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<q0> ULongArraySerializer() {
        return ULongArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<v0> UShortArraySerializer() {
        return UShortArraySerializer.INSTANCE;
    }

    public static final <T> KSerializer<T> getNullable(KSerializer<T> kSerializer) {
        e0.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer.getDescriptor().isNullable() ? kSerializer : new NullableSerializer(kSerializer);
    }

    public static final KSerializer<Character> serializer(q qVar) {
        e0.checkNotNullParameter(qVar, "<this>");
        return CharSerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final <T, E extends T> KSerializer<E[]> ArraySerializer(KClass<T> kClass, KSerializer<E> elementSerializer) {
        e0.checkNotNullParameter(kClass, "kClass");
        e0.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ReferenceArraySerializer(kClass, elementSerializer);
    }

    public static final KSerializer<Byte> serializer(n nVar) {
        e0.checkNotNullParameter(nVar, "<this>");
        return ByteSerializer.INSTANCE;
    }

    public static final KSerializer<Short> serializer(e1 e1Var) {
        e0.checkNotNullParameter(e1Var, "<this>");
        return ShortSerializer.INSTANCE;
    }

    public static final KSerializer<Integer> serializer(c0 c0Var) {
        e0.checkNotNullParameter(c0Var, "<this>");
        return IntSerializer.INSTANCE;
    }

    public static final KSerializer<Long> serializer(g0 g0Var) {
        e0.checkNotNullParameter(g0Var, "<this>");
        return LongSerializer.INSTANCE;
    }

    public static final KSerializer<Float> serializer(w wVar) {
        e0.checkNotNullParameter(wVar, "<this>");
        return FloatSerializer.INSTANCE;
    }

    public static final KSerializer<Double> serializer(kotlin.jvm.internal.v vVar) {
        e0.checkNotNullParameter(vVar, "<this>");
        return DoubleSerializer.INSTANCE;
    }

    public static final KSerializer<Boolean> serializer(m mVar) {
        e0.checkNotNullParameter(mVar, "<this>");
        return BooleanSerializer.INSTANCE;
    }

    public static final KSerializer<x0> serializer(x0 x0Var) {
        e0.checkNotNullParameter(x0Var, "<this>");
        return UnitSerializer.INSTANCE;
    }

    public static final KSerializer<String> serializer(g1 g1Var) {
        e0.checkNotNullParameter(g1Var, "<this>");
        return StringSerializer.INSTANCE;
    }

    public static final KSerializer<k0> serializer(j0 j0Var) {
        e0.checkNotNullParameter(j0Var, "<this>");
        return UIntSerializer.INSTANCE;
    }

    public static final KSerializer<o0> serializer(n0 n0Var) {
        e0.checkNotNullParameter(n0Var, "<this>");
        return ULongSerializer.INSTANCE;
    }

    public static final KSerializer<tu.g0> serializer(f0 f0Var) {
        e0.checkNotNullParameter(f0Var, "<this>");
        return UByteSerializer.INSTANCE;
    }

    public static final KSerializer<t0> serializer(s0 s0Var) {
        e0.checkNotNullParameter(s0Var, "<this>");
        return UShortSerializer.INSTANCE;
    }

    public static final KSerializer<f> serializer(e eVar) {
        e0.checkNotNullParameter(eVar, "<this>");
        return DurationSerializer.INSTANCE;
    }

    public static final KSerializer<b> serializer(b.a aVar) {
        e0.checkNotNullParameter(aVar, "<this>");
        return UuidSerializer.INSTANCE;
    }

    public static /* synthetic */ void getNullable$annotations(KSerializer kSerializer) {
    }
}
