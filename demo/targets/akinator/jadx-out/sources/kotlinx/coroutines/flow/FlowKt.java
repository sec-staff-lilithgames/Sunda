package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kv.l;
import kv.p;
import kv.q;
import kv.r;
import kv.s;
import kv.t;
import kv.u;
import tu.f;
import tu.x0;
import uu.g1;
import zu.m;

/* loaded from: classes10.dex */
public final class FlowKt {
    public static final String DEFAULT_CONCURRENCY_PROPERTY_NAME = "kotlinx.coroutines.flow.defaultConcurrency";

    public static final <T> Object all(Flow<? extends T> flow, p pVar, zu.d<? super Boolean> dVar) {
        return FlowKt__LogicKt.all(flow, pVar, dVar);
    }

    public static final <T> Object any(Flow<? extends T> flow, p pVar, zu.d<? super Boolean> dVar) {
        return FlowKt__LogicKt.any(flow, pVar, dVar);
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.asFlow(iterable);
    }

    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> mutableSharedFlow) {
        return FlowKt__ShareKt.asSharedFlow(mutableSharedFlow);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> mutableStateFlow) {
        return FlowKt__ShareKt.asStateFlow(mutableStateFlow);
    }

    @f
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.cache(flow);
    }

    public static final <T> Flow<T> callbackFlow(p pVar) {
        return FlowKt__BuildersKt.callbackFlow(pVar);
    }

    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return FlowKt__ContextKt.cancellable(flow);
    }

    /* renamed from: catch, reason: not valid java name */
    public static final <T> Flow<T> m5171catch(Flow<? extends T> flow, q qVar) {
        return FlowKt__ErrorsKt.m5182catch(flow, qVar);
    }

    public static final <T> Object catchImpl(Flow<? extends T> flow, FlowCollector<? super T> flowCollector, zu.d<? super Throwable> dVar) {
        return FlowKt__ErrorsKt.catchImpl(flow, flowCollector, dVar);
    }

    public static final <T> Flow<T> channelFlow(p pVar) {
        return FlowKt__BuildersKt.channelFlow(pVar);
    }

    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i10) {
        return FlowKt__TransformKt.chunked(flow, i10);
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, q qVar, zu.d<? super x0> dVar) {
        return FlowKt__CollectKt.collectIndexed(flow, qVar, dVar);
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, p pVar, zu.d<? super x0> dVar) {
        return FlowKt__CollectKt.collectLatest(flow, pVar, dVar);
    }

    public static final <T> Object collectWhile(Flow<? extends T> flow, p pVar, zu.d<? super x0> dVar) {
        return FlowKt__LimitKt.collectWhile(flow, pVar, dVar);
    }

    @f
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, t tVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, flow5, tVar);
    }

    @f
    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, l lVar) {
        return FlowKt__MigrationKt.compose(flow, lVar);
    }

    @f
    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, l lVar) {
        return FlowKt__MigrationKt.concatMap(flow, lVar);
    }

    @f
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t10) {
        return FlowKt__MigrationKt.concatWith(flow, t10);
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return FlowKt__ContextKt.conflate(flow);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.consumeAsFlow(receiveChannel);
    }

    public static final <T> Object count(Flow<? extends T> flow, p pVar, zu.d<? super Integer> dVar) {
        return FlowKt__CountKt.count(flow, pVar, dVar);
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.debounce(flow, j10);
    }

    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m5172debounceHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.m5175debounceHG0u8IE(flow, j10);
    }

    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, l lVar) {
        return FlowKt__DelayKt.debounceDuration(flow, lVar);
    }

    @f
    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j10) {
        return FlowKt__MigrationKt.delayEach(flow, j10);
    }

    @f
    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j10) {
        return FlowKt__MigrationKt.delayFlow(flow, j10);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, l lVar) {
        return FlowKt__DistinctKt.distinctUntilChangedBy(flow, lVar);
    }

    public static final <T> Flow<T> drop(Flow<? extends T> flow, int i10) {
        return FlowKt__LimitKt.drop(flow, i10);
    }

    public static final <T> Flow<T> dropWhile(Flow<? extends T> flow, p pVar) {
        return FlowKt__LimitKt.dropWhile(flow, pVar);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, zu.d<? super x0> dVar) {
        return FlowKt__ChannelsKt.emitAll(flowCollector, receiveChannel, dVar);
    }

    public static final <T> Flow<T> emptyFlow() {
        return FlowKt__BuildersKt.emptyFlow();
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        FlowKt__EmittersKt.ensureActive(flowCollector);
    }

    public static final <T> Flow<T> filter(Flow<? extends T> flow, p pVar) {
        return FlowKt__TransformKt.filter(flow, pVar);
    }

    public static final <T> Flow<T> filterNot(Flow<? extends T> flow, p pVar) {
        return FlowKt__TransformKt.filterNot(flow, pVar);
    }

    public static final <T> Flow<T> filterNotNull(Flow<? extends T> flow) {
        return FlowKt__TransformKt.filterNotNull(flow);
    }

    public static final <T> Object first(Flow<? extends T> flow, p pVar, zu.d<? super T> dVar) {
        return FlowKt__ReduceKt.first(flow, pVar, dVar);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, p pVar, zu.d<? super T> dVar) {
        return FlowKt__ReduceKt.firstOrNull(flow, pVar, dVar);
    }

    public static final ReceiveChannel<x0> fixedPeriodTicker(CoroutineScope coroutineScope, long j10) {
        return FlowKt__DelayKt.fixedPeriodTicker(coroutineScope, j10);
    }

    @f
    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, p pVar) {
        return FlowKt__MigrationKt.flatMap(flow, pVar);
    }

    public static final <T, R> Flow<R> flatMapConcat(Flow<? extends T> flow, p pVar) {
        return FlowKt__MergeKt.flatMapConcat(flow, pVar);
    }

    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> flow, p pVar) {
        return FlowKt__MergeKt.flatMapLatest(flow, pVar);
    }

    public static final <T, R> Flow<R> flatMapMerge(Flow<? extends T> flow, int i10, p pVar) {
        return FlowKt__MergeKt.flatMapMerge(flow, i10, pVar);
    }

    @f
    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.flatten(flow);
    }

    public static final <T> Flow<T> flattenConcat(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MergeKt.flattenConcat(flow);
    }

    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i10) {
        return FlowKt__MergeKt.flattenMerge(flow, i10);
    }

    public static final <T> Flow<T> flow(p pVar) {
        return FlowKt__BuildersKt.flow(pVar);
    }

    public static final <T1, T2, R> Flow<R> flowCombine(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return FlowKt__ZipKt.flowCombine(flow, flow2, qVar);
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, r rVar) {
        return FlowKt__ZipKt.flowCombineTransform(flow, flow2, rVar);
    }

    public static final <T> Flow<T> flowOf(T t10) {
        return FlowKt__BuildersKt.flowOf(t10);
    }

    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, m mVar) {
        return FlowKt__ContextKt.flowOn(flow, mVar);
    }

    public static final <T, R> Object fold(Flow<? extends T> flow, R r10, q qVar, zu.d<? super R> dVar) {
        return FlowKt__ReduceKt.fold(flow, r10, qVar, dVar);
    }

    @f
    public static final <T> void forEach(Flow<? extends T> flow, p pVar) {
        FlowKt__MigrationKt.forEach(flow, pVar);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return FlowKt__MergeKt.getDEFAULT_CONCURRENCY();
    }

    public static final <T> Object last(Flow<? extends T> flow, zu.d<? super T> dVar) {
        return FlowKt__ReduceKt.last(flow, dVar);
    }

    public static final <T> Object lastOrNull(Flow<? extends T> flow, zu.d<? super T> dVar) {
        return FlowKt__ReduceKt.lastOrNull(flow, dVar);
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__CollectKt.launchIn(flow, coroutineScope);
    }

    public static final <T, R> Flow<R> map(Flow<? extends T> flow, p pVar) {
        return FlowKt__TransformKt.map(flow, pVar);
    }

    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, p pVar) {
        return FlowKt__MergeKt.mapLatest(flow, pVar);
    }

    public static final <T, R> Flow<R> mapNotNull(Flow<? extends T> flow, p pVar) {
        return FlowKt__TransformKt.mapNotNull(flow, pVar);
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return FlowKt__MergeKt.merge(iterable);
    }

    public static final Void noImpl() {
        return FlowKt__MigrationKt.noImpl();
    }

    public static final <T> Object none(Flow<? extends T> flow, p pVar, zu.d<? super Boolean> dVar) {
        return FlowKt__LogicKt.none(flow, pVar, dVar);
    }

    @f
    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, m mVar) {
        return FlowKt__MigrationKt.observeOn(flow, mVar);
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, q qVar) {
        return FlowKt__EmittersKt.onCompletion(flow, qVar);
    }

    public static final <T> Flow<T> onEach(Flow<? extends T> flow, p pVar) {
        return FlowKt__TransformKt.onEach(flow, pVar);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, p pVar) {
        return FlowKt__EmittersKt.onEmpty(flow, pVar);
    }

    @f
    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResume(flow, flow2);
    }

    @f
    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.onErrorResumeNext(flow, flow2);
    }

    @f
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t10) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t10);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, p pVar) {
        return FlowKt__EmittersKt.onStart(flow, pVar);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> sharedFlow, p pVar) {
        return FlowKt__ShareKt.onSubscription(sharedFlow, pVar);
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return FlowKt__ChannelsKt.produceIn(flow, coroutineScope);
    }

    @f
    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.publish(flow);
    }

    @f
    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, m mVar) {
        return FlowKt__MigrationKt.publishOn(flow, mVar);
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.receiveAsFlow(receiveChannel);
    }

    public static final <S, T extends S> Object reduce(Flow<? extends T> flow, q qVar, zu.d<? super S> dVar) {
        return FlowKt__ReduceKt.reduce(flow, qVar, dVar);
    }

    @f
    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        return FlowKt__MigrationKt.replay(flow);
    }

    public static final <T> Flow<T> retry(Flow<? extends T> flow, long j10, p pVar) {
        return FlowKt__ErrorsKt.retry(flow, j10, pVar);
    }

    public static final <T> Flow<T> retryWhen(Flow<? extends T> flow, r rVar) {
        return FlowKt__ErrorsKt.retryWhen(flow, rVar);
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r10, q qVar) {
        return FlowKt__TransformKt.runningFold(flow, r10, qVar);
    }

    public static final <T> Flow<T> runningReduce(Flow<? extends T> flow, q qVar) {
        return FlowKt__TransformKt.runningReduce(flow, qVar);
    }

    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.sample(flow, j10);
    }

    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m5173sampleHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.m5176sampleHG0u8IE(flow, j10);
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r10, q qVar) {
        return FlowKt__TransformKt.scan(flow, r10, qVar);
    }

    @f
    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r10, q qVar) {
        return FlowKt__MigrationKt.scanFold(flow, r10, qVar);
    }

    @f
    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, q qVar) {
        return FlowKt__MigrationKt.scanReduce(flow, qVar);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i10) {
        return FlowKt__ShareKt.shareIn(flow, coroutineScope, sharingStarted, i10);
    }

    public static final <T> Object single(Flow<? extends T> flow, zu.d<? super T> dVar) {
        return FlowKt__ReduceKt.single(flow, dVar);
    }

    public static final <T> Object singleOrNull(Flow<? extends T> flow, zu.d<? super T> dVar) {
        return FlowKt__ReduceKt.singleOrNull(flow, dVar);
    }

    @f
    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i10) {
        return FlowKt__MigrationKt.skip(flow, i10);
    }

    @f
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t10) {
        return FlowKt__MigrationKt.startWith(flow, t10);
    }

    public static final <T> Object stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, zu.d<? super StateFlow<? extends T>> dVar) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, dVar);
    }

    @f
    public static final <T> void subscribe(Flow<? extends T> flow) {
        FlowKt__MigrationKt.subscribe(flow);
    }

    @f
    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, m mVar) {
        return FlowKt__MigrationKt.subscribeOn(flow, mVar);
    }

    @f
    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, p pVar) {
        return FlowKt__MigrationKt.switchMap(flow, pVar);
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i10) {
        return FlowKt__LimitKt.take(flow, i10);
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, p pVar) {
        return FlowKt__LimitKt.takeWhile(flow, pVar);
    }

    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m5174timeoutHG0u8IE(Flow<? extends T> flow, long j10) {
        return FlowKt__DelayKt.m5177timeoutHG0u8IE(flow, j10);
    }

    public static final <T, C extends Collection<? super T>> Object toCollection(Flow<? extends T> flow, C c10, zu.d<? super C> dVar) {
        return FlowKt__CollectionKt.toCollection(flow, c10, dVar);
    }

    public static final <T> Object toList(Flow<? extends T> flow, List<T> list, zu.d<? super List<? extends T>> dVar) {
        return FlowKt__CollectionKt.toList(flow, list, dVar);
    }

    public static final <T> Object toSet(Flow<? extends T> flow, Set<T> set, zu.d<? super Set<? extends T>> dVar) {
        return FlowKt__CollectionKt.toSet(flow, set, dVar);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, q qVar) {
        return FlowKt__EmittersKt.transform(flow, qVar);
    }

    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, q qVar) {
        return FlowKt__MergeKt.transformLatest(flow, qVar);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, q qVar) {
        return FlowKt__LimitKt.transformWhile(flow, qVar);
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, q qVar) {
        return FlowKt__EmittersKt.unsafeTransform(flow, qVar);
    }

    public static final <T> Flow<g1> withIndex(Flow<? extends T> flow) {
        return FlowKt__TransformKt.withIndex(flow);
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return FlowKt__ZipKt.zip(flow, flow2, qVar);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it) {
        return FlowKt__BuildersKt.asFlow(it);
    }

    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i10, BufferOverflow bufferOverflow) {
        return FlowKt__ContextKt.buffer(flow, i10, bufferOverflow);
    }

    public static final Object collect(Flow<?> flow, zu.d<? super x0> dVar) {
        return FlowKt__CollectKt.collect(flow, dVar);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, t tVar) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, flow5, tVar);
    }

    @f
    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s sVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, flow4, sVar);
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, u uVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, flow5, uVar);
    }

    @f
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.concatWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> Object count(Flow<? extends T> flow, zu.d<? super Integer> dVar) {
        return FlowKt__CountKt.count(flow, dVar);
    }

    public static final <T> Flow<T> debounce(Flow<? extends T> flow, l lVar) {
        return FlowKt__DelayKt.debounce(flow, lVar);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, p pVar) {
        return FlowKt__DistinctKt.distinctUntilChanged(flow, pVar);
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, zu.d<? super x0> dVar) {
        return FlowKt__CollectKt.emitAll(flowCollector, flow, dVar);
    }

    public static final <R> Flow<R> filterIsInstance(Flow<?> flow, KClass<R> kClass) {
        return FlowKt__TransformKt.filterIsInstance(flow, kClass);
    }

    public static final <T> Object first(Flow<? extends T> flow, zu.d<? super T> dVar) {
        return FlowKt__ReduceKt.first(flow, dVar);
    }

    public static final <T> Object firstOrNull(Flow<? extends T> flow, zu.d<? super T> dVar) {
        return FlowKt__ReduceKt.firstOrNull(flow, dVar);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return FlowKt__BuildersKt.flowOf((Object[]) tArr);
    }

    @f
    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        return FlowKt__MigrationKt.merge(flow);
    }

    @f
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t10, l lVar) {
        return FlowKt__MigrationKt.onErrorReturn(flow, t10, lVar);
    }

    @f
    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i10) {
        return FlowKt__MigrationKt.publish(flow, i10);
    }

    @f
    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i10) {
        return FlowKt__MigrationKt.replay(flow, i10);
    }

    @f
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        return FlowKt__MigrationKt.startWith((Flow) flow, (Flow) flow2);
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t10) {
        return FlowKt__ShareKt.stateIn(flow, coroutineScope, sharingStarted, t10);
    }

    @f
    public static final <T> void subscribe(Flow<? extends T> flow, p pVar) {
        FlowKt__MigrationKt.subscribe(flow, pVar);
    }

    public static final <T> Flow<T> asFlow(kv.a aVar) {
        return FlowKt__BuildersKt.asFlow(aVar);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s sVar) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, flow4, sVar);
    }

    @f
    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, r rVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, flow3, rVar);
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, t tVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, flow4, tVar);
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        return FlowKt__MergeKt.merge(flowArr);
    }

    @f
    public static final <T> void subscribe(Flow<? extends T> flow, p pVar, p pVar2) {
        FlowKt__MigrationKt.subscribe(flow, pVar, pVar2);
    }

    public static final <T> Flow<T> asFlow(l lVar) {
        return FlowKt__BuildersKt.asFlow(lVar);
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, r rVar) {
        return FlowKt__ZipKt.combine(flow, flow2, flow3, rVar);
    }

    @f
    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return FlowKt__MigrationKt.combineLatest(flow, flow2, qVar);
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, s sVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, flow3, sVar);
    }

    public static final Flow<Integer> asFlow(qv.m mVar) {
        return FlowKt__BuildersKt.asFlow(mVar);
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return FlowKt__ZipKt.combine(flow, flow2, qVar);
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, r rVar) {
        return FlowKt__ZipKt.combineTransform(flow, flow2, rVar);
    }

    public static final Flow<Long> asFlow(qv.p pVar) {
        return FlowKt__BuildersKt.asFlow(pVar);
    }

    public static final <T> Flow<T> asFlow(rv.t tVar) {
        return FlowKt__BuildersKt.asFlow(tVar);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return FlowKt__BuildersKt.asFlow(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return FlowKt__BuildersKt.asFlow(jArr);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return FlowKt__BuildersKt.asFlow(tArr);
    }
}
