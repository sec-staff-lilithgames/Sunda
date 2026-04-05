package nh;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class yh {
    public static void a(BaseStream[] baseStreamArr) {
        Exception exc = null;
        for (BaseStream baseStream : baseStreamArr) {
            try {
                baseStream.close();
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                } else {
                    exc.addSuppressed(e10);
                }
            }
        }
        if (exc != null) {
            throw exc;
        }
    }

    @SafeVarargs
    public static <T> Stream<T> concat(Stream<? extends T>... streamArr) {
        x4 x4Var = new x4(streamArr.length);
        int iCharacteristics = 336;
        long jSaturatedAdd = 0;
        boolean zIsParallel = false;
        for (Stream<? extends T> stream : streamArr) {
            zIsParallel |= stream.isParallel();
            Spliterator<? extends T> spliterator = stream.spliterator();
            x4Var.add((Object) spliterator);
            iCharacteristics &= spliterator.characteristics();
            jSaturatedAdd = qh.h.saturatedAdd(jSaturatedAdd, spliterator.estimateSize());
        }
        Spliterator<Object> spliterator2 = x4Var.build().spliterator();
        w0 w0Var = new w0(20);
        mh.p1.checkArgument(true, "flatMap does not support SUBSIZED characteristic");
        mh.p1.checkArgument(true, "flatMap does not support SORTED characteristic");
        mh.p1.checkNotNull(spliterator2);
        mh.p1.checkNotNull(w0Var);
        return (Stream) StreamSupport.stream(new q1(null, spliterator2, w0Var, iCharacteristics, jSaturatedAdd), zIsParallel).onClose(new ji.t(streamArr, 15));
    }

    public static <T> Optional<T> findLast(Stream<T> stream) {
        jh jhVar = new jh();
        jhVar.f76405a = false;
        jhVar.f76406b = null;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(stream.spliterator());
        while (!arrayDeque.isEmpty()) {
            Spliterator<T> spliterator = (Spliterator) arrayDeque.removeLast();
            if (spliterator.getExactSizeIfKnown() != 0) {
                if (spliterator.hasCharacteristics(16384)) {
                    while (true) {
                        Spliterator<T> spliteratorTrySplit = spliterator.trySplit();
                        if (spliteratorTrySplit == null || spliteratorTrySplit.getExactSizeIfKnown() == 0) {
                            break;
                        }
                        if (spliterator.getExactSizeIfKnown() == 0) {
                            spliterator = spliteratorTrySplit;
                            break;
                        }
                    }
                    spliterator.forEachRemaining(new ca.p(jhVar, 6));
                    Object obj = jhVar.f76406b;
                    Objects.requireNonNull(obj);
                    return Optional.of(obj);
                }
                Spliterator<T> spliteratorTrySplit2 = spliterator.trySplit();
                if (spliteratorTrySplit2 == null || spliteratorTrySplit2.getExactSizeIfKnown() == 0) {
                    spliterator.forEachRemaining(new ca.p(jhVar, 6));
                    if (jhVar.f76405a) {
                        Object obj2 = jhVar.f76406b;
                        Objects.requireNonNull(obj2);
                        return Optional.of(obj2);
                    }
                } else {
                    arrayDeque.addLast(spliteratorTrySplit2);
                    arrayDeque.addLast(spliterator);
                }
            }
        }
        return Optional.empty();
    }

    public static <A, B> void forEachPair(Stream<A> stream, Stream<B> stream2, BiConsumer<? super A, ? super B> biConsumer) {
        mh.p1.checkNotNull(biConsumer);
        if (stream.isParallel() || stream2.isParallel()) {
            zip(stream, stream2, new hh()).forEach(new ca.p(biConsumer, 5));
            return;
        }
        Iterator<A> it = stream.iterator();
        Iterator<B> it2 = stream2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            biConsumer.accept(it.next(), it2.next());
        }
    }

    public static <T, R> Stream<R> mapWithIndex(Stream<T> stream, th thVar) {
        mh.p1.checkNotNull(stream);
        mh.p1.checkNotNull(thVar);
        boolean zIsParallel = stream.isParallel();
        Spliterator<T> spliterator = stream.spliterator();
        if (spliterator.hasCharacteristics(16384)) {
            return (Stream) StreamSupport.stream(new kh(spliterator, 0L), zIsParallel).onClose(new ji.t(stream, 14));
        }
        return (Stream) StreamSupport.stream(new lh(spliterator.estimateSize(), spliterator.characteristics() & 80, Spliterators.iterator(spliterator)), zIsParallel).onClose(new ji.t(stream, 14));
    }

    public static <T> Stream<T> stream(Iterable<T> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).stream() : StreamSupport.stream(iterable.spliterator(), false);
    }

    public static <A, B, R> Stream<R> zip(Stream<A> stream, Stream<B> stream2, BiFunction<? super A, ? super B, R> biFunction) {
        mh.p1.checkNotNull(stream);
        mh.p1.checkNotNull(stream2);
        mh.p1.checkNotNull(biFunction);
        boolean z10 = stream.isParallel() || stream2.isParallel();
        Spliterator<A> spliterator = stream.spliterator();
        Spliterator<B> spliterator2 = stream2.spliterator();
        return (Stream) ((Stream) StreamSupport.stream(new ih(Math.min(spliterator.estimateSize(), spliterator2.estimateSize()), spliterator.characteristics() & spliterator2.characteristics() & 80, Spliterators.iterator(spliterator), Spliterators.iterator(spliterator2), biFunction), z10).onClose(new ji.t(stream, 14))).onClose(new ji.t(stream2, 14));
    }

    @Deprecated
    public static <T> Stream<T> stream(Collection<T> collection) {
        return collection.stream();
    }

    public static <T> Stream<T> stream(Iterator<T> it) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
    }

    public static <T> Stream<T> stream(mh.k1 k1Var) {
        return k1Var.isPresent() ? Stream.of(k1Var.get()) : Stream.empty();
    }

    public static <T> Stream<T> stream(Optional<T> optional) {
        return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
    }

    public static IntStream stream(OptionalInt optionalInt) {
        return optionalInt.isPresent() ? IntStream.of(optionalInt.getAsInt()) : IntStream.empty();
    }

    public static LongStream stream(OptionalLong optionalLong) {
        return optionalLong.isPresent() ? LongStream.of(optionalLong.getAsLong()) : LongStream.empty();
    }

    public static DoubleStream stream(OptionalDouble optionalDouble) {
        return optionalDouble.isPresent() ? DoubleStream.of(optionalDouble.getAsDouble()) : DoubleStream.empty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Spliterator, java.util.Spliterator$OfInt] */
    public static <R> Stream<R> mapWithIndex(IntStream intStream, uh uhVar) {
        mh.p1.checkNotNull(intStream);
        mh.p1.checkNotNull(uhVar);
        boolean zIsParallel = intStream.isParallel();
        ?? Spliterator = intStream.spliterator();
        if (!Spliterator.hasCharacteristics(16384)) {
            return (Stream) StreamSupport.stream(new nh(Spliterator.estimateSize(), Spliterator.characteristics() & 80, Spliterators.iterator((Spliterator.OfInt) Spliterator)), zIsParallel).onClose(new ji.t(intStream, 9));
        }
        return (Stream) StreamSupport.stream(new mh(Spliterator, 0L), zIsParallel).onClose(new ji.t(intStream, 9));
    }

    public static IntStream concat(IntStream... intStreamArr) {
        x4 x4Var = new x4(intStreamArr.length);
        int iCharacteristics = 336;
        long jSaturatedAdd = 0;
        boolean zIsParallel = false;
        for (IntStream intStream : intStreamArr) {
            zIsParallel |= intStream.isParallel();
            Spliterator<Integer> spliterator = intStream.spliterator();
            x4Var.add((Object) spliterator);
            iCharacteristics &= spliterator.characteristics();
            jSaturatedAdd = qh.h.saturatedAdd(jSaturatedAdd, spliterator.estimateSize());
        }
        Spliterator<Object> spliterator2 = x4Var.build().spliterator();
        w0 w0Var = new w0(22);
        mh.p1.checkArgument(true, "flatMap does not support SUBSIZED characteristic");
        mh.p1.checkArgument(true, "flatMap does not support SORTED characteristic");
        mh.p1.checkNotNull(spliterator2);
        mh.p1.checkNotNull(w0Var);
        return (IntStream) StreamSupport.intStream(new o1(null, spliterator2, w0Var, iCharacteristics, jSaturatedAdd), zIsParallel).onClose(new ji.t(intStreamArr, 8));
    }

    public static OptionalInt findLast(IntStream intStream) {
        return (OptionalInt) findLast(intStream.boxed()).map(new w0(16)).orElse(OptionalInt.empty());
    }

    public static OptionalLong findLast(LongStream longStream) {
        return (OptionalLong) findLast(longStream.boxed()).map(new w0(21)).orElse(OptionalLong.empty());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Spliterator, java.util.Spliterator$OfLong] */
    public static <R> Stream<R> mapWithIndex(LongStream longStream, vh vhVar) {
        mh.p1.checkNotNull(longStream);
        mh.p1.checkNotNull(vhVar);
        boolean zIsParallel = longStream.isParallel();
        ?? Spliterator = longStream.spliterator();
        if (!Spliterator.hasCharacteristics(16384)) {
            return (Stream) StreamSupport.stream(new ph(Spliterator.estimateSize(), Spliterator.characteristics() & 80, Spliterators.iterator((Spliterator.OfLong) Spliterator)), zIsParallel).onClose(new ji.t(longStream, 11));
        }
        return (Stream) StreamSupport.stream(new oh(Spliterator, 0L), zIsParallel).onClose(new ji.t(longStream, 11));
    }

    public static OptionalDouble findLast(DoubleStream doubleStream) {
        return (OptionalDouble) findLast(doubleStream.boxed()).map(new w0(17)).orElse(OptionalDouble.empty());
    }

    public static LongStream concat(LongStream... longStreamArr) {
        x4 x4Var = new x4(longStreamArr.length);
        int iCharacteristics = 336;
        long jSaturatedAdd = 0;
        boolean zIsParallel = false;
        for (LongStream longStream : longStreamArr) {
            zIsParallel |= longStream.isParallel();
            Spliterator<Long> spliterator = longStream.spliterator();
            x4Var.add((Object) spliterator);
            iCharacteristics &= spliterator.characteristics();
            jSaturatedAdd = qh.h.saturatedAdd(jSaturatedAdd, spliterator.estimateSize());
        }
        Spliterator<Object> spliterator2 = x4Var.build().spliterator();
        w0 w0Var = new w0(19);
        mh.p1.checkArgument(true, "flatMap does not support SUBSIZED characteristic");
        mh.p1.checkArgument(true, "flatMap does not support SORTED characteristic");
        mh.p1.checkNotNull(spliterator2);
        mh.p1.checkNotNull(w0Var);
        return (LongStream) StreamSupport.longStream(new p1(null, spliterator2, w0Var, iCharacteristics, jSaturatedAdd), zIsParallel).onClose(new ji.t(longStreamArr, 13));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Spliterator, java.util.Spliterator$OfDouble] */
    public static <R> Stream<R> mapWithIndex(DoubleStream doubleStream, sh shVar) {
        mh.p1.checkNotNull(doubleStream);
        mh.p1.checkNotNull(shVar);
        boolean zIsParallel = doubleStream.isParallel();
        ?? Spliterator = doubleStream.spliterator();
        if (!Spliterator.hasCharacteristics(16384)) {
            return (Stream) StreamSupport.stream(new rh(Spliterator.estimateSize(), Spliterator.characteristics() & 80, Spliterators.iterator((Spliterator.OfDouble) Spliterator)), zIsParallel).onClose(new ji.t(doubleStream, 10));
        }
        return (Stream) StreamSupport.stream(new qh(Spliterator, 0L), zIsParallel).onClose(new ji.t(doubleStream, 10));
    }

    public static DoubleStream concat(DoubleStream... doubleStreamArr) {
        x4 x4Var = new x4(doubleStreamArr.length);
        int iCharacteristics = 336;
        long jSaturatedAdd = 0;
        boolean zIsParallel = false;
        for (DoubleStream doubleStream : doubleStreamArr) {
            zIsParallel |= doubleStream.isParallel();
            Spliterator<Double> spliterator = doubleStream.spliterator();
            x4Var.add((Object) spliterator);
            iCharacteristics &= spliterator.characteristics();
            jSaturatedAdd = qh.h.saturatedAdd(jSaturatedAdd, spliterator.estimateSize());
        }
        Spliterator<Object> spliterator2 = x4Var.build().spliterator();
        w0 w0Var = new w0(18);
        mh.p1.checkArgument(true, "flatMap does not support SUBSIZED characteristic");
        mh.p1.checkArgument(true, "flatMap does not support SORTED characteristic");
        mh.p1.checkNotNull(spliterator2);
        mh.p1.checkNotNull(w0Var);
        return (DoubleStream) StreamSupport.doubleStream(new m1(null, spliterator2, w0Var, iCharacteristics, jSaturatedAdd), zIsParallel).onClose(new ji.t(doubleStreamArr, 12));
    }
}
