package kotlinx.coroutines.debug.internal;

import bv.e;
import com.ironsource.C3191e4;
import e3.g;
import f.j0;
import i.f;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import kv.p;
import p0.o2;
import rv.f0;
import sv.d0;
import tu.a0;
import tu.v;
import tu.x0;
import tu.z;
import uu.k0;
import uu.o1;
import uu.q0;
import uu.y0;
import yu.b;
import zu.d;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DebugProbesImpl {
    private static final StackTraceElement ARTIFICIAL_FRAME;
    public static final DebugProbesImpl INSTANCE;
    private static final ConcurrentWeakMap<e, DebugCoroutineInfoImpl> callerInfoCache;
    private static final ConcurrentWeakMap<CoroutineOwner<?>, Boolean> capturedCoroutinesMap;
    private static final SimpleDateFormat dateFormat;
    private static final l dynamicAttach;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static final /* synthetic */ AtomicInteger installations;
    private static boolean sanitizeStackTraces;
    private static final /* synthetic */ AtomicLong sequenceNumber;
    private static Thread weakRefCleanerThread;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class CoroutineOwner<T> implements d<T>, e {
        public final d<T> delegate;
        public final DebugCoroutineInfoImpl info;

        /* JADX WARN: Multi-variable type inference failed */
        public CoroutineOwner(d<? super T> dVar, DebugCoroutineInfoImpl debugCoroutineInfoImpl) {
            this.delegate = dVar;
            this.info = debugCoroutineInfoImpl;
        }

        private final StackTraceFrame getFrame() {
            return this.info.getCreationStackBottom$kotlinx_coroutines_core();
        }

        @Override // bv.e
        public e getCallerFrame() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getCallerFrame();
            }
            return null;
        }

        @Override // zu.d
        public m getContext() {
            return this.delegate.getContext();
        }

        @Override // bv.e
        public StackTraceElement getStackTraceElement() {
            StackTraceFrame frame = getFrame();
            if (frame != null) {
                return frame.getStackTraceElement();
            }
            return null;
        }

        @Override // zu.d
        public void resumeWith(Object obj) {
            DebugProbesImpl.INSTANCE.probeCoroutineCompleted(this);
            this.delegate.resumeWith(obj);
        }

        public String toString() {
            return this.delegate.toString();
        }
    }

    static {
        DebugProbesImpl debugProbesImpl = new DebugProbesImpl();
        INSTANCE = debugProbesImpl;
        ARTIFICIAL_FRAME = new a.a().coroutineCreation();
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        capturedCoroutinesMap = new ConcurrentWeakMap<>(false, 1, null);
        installations = new AtomicInteger(0);
        sequenceNumber = new AtomicLong(0L);
        sanitizeStackTraces = true;
        ignoreCoroutinesWithEmptyContext = true;
        dynamicAttach = debugProbesImpl.getDynamicAttach();
        callerInfoCache = new ConcurrentWeakMap<>(true);
    }

    private DebugProbesImpl() {
    }

    private final void build(Job job, Map<Job, DebugCoroutineInfoImpl> map, StringBuilder sb2, String str) {
        DebugCoroutineInfoImpl debugCoroutineInfoImpl = map.get(job);
        if (debugCoroutineInfoImpl != null) {
            StackTraceElement stackTraceElement = (StackTraceElement) y0.firstOrNull((List) debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core());
            String state$kotlinx_coroutines_core = debugCoroutineInfoImpl.getState$kotlinx_coroutines_core();
            StringBuilder sbU = o2.u(str);
            com.google.android.gms.internal.play_billing.a.B(sbU, getDebugString(job), ", continuation is ", state$kotlinx_coroutines_core, " at line ");
            sbU.append(stackTraceElement);
            sbU.append('\n');
            sb2.append(sbU.toString());
            str = str + '\t';
        } else if (!(job instanceof ScopeCoroutine)) {
            StringBuilder sbU2 = o2.u(str);
            sbU2.append(getDebugString(job));
            sbU2.append('\n');
            sb2.append(sbU2.toString());
            str = str + '\t';
        }
        Iterator<Object> it = job.getChildren().iterator();
        while (it.hasNext()) {
            build((Job) it.next(), map, sb2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> d<T> createOwner(d<? super T> dVar, StackTraceFrame stackTraceFrame) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            return dVar;
        }
        CoroutineOwner<?> coroutineOwner = new CoroutineOwner<>(dVar, new DebugCoroutineInfoImpl(dVar.getContext(), stackTraceFrame, getSequenceNumber().incrementAndGet()));
        ConcurrentWeakMap<CoroutineOwner<?>, Boolean> concurrentWeakMap = capturedCoroutinesMap;
        concurrentWeakMap.put(coroutineOwner, Boolean.TRUE);
        if (!isInstalled$kotlinx_coroutines_debug()) {
            concurrentWeakMap.clear();
        }
        return coroutineOwner;
    }

    private final <R> List<R> dumpCoroutinesInfoImpl(final p pVar) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return f0.toList(f0.mapNotNull(f0.sortedWith(y0.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new l() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl.dumpCoroutinesInfoImpl.3
                /* JADX WARN: Type inference failed for: r3v1, types: [R, java.lang.Object] */
                @Override // kv.l
                public final R invoke(CoroutineOwner<?> coroutineOwner) {
                    m context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return pVar.invoke(coroutineOwner, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    private final void dumpCoroutinesSynchronized(PrintStream printStream) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        printStream.print("Coroutines dump " + dateFormat.format(Long.valueOf(System.currentTimeMillis())));
        for (CoroutineOwner coroutineOwner : f0.sortedWith(f0.filter(y0.asSequence(getCapturedCoroutines()), new j0(3)), new Comparator() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return xu.d.compareValues(Long.valueOf(((DebugProbesImpl.CoroutineOwner) t10).info.sequenceNumber), Long.valueOf(((DebugProbesImpl.CoroutineOwner) t11).info.sequenceNumber));
            }
        })) {
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = coroutineOwner.info;
            List<StackTraceElement> listLastObservedStackTrace$kotlinx_coroutines_core = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
            DebugProbesImpl debugProbesImpl = INSTANCE;
            List<StackTraceElement> listEnhanceStackTraceWithThreadDumpImpl = debugProbesImpl.enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfoImpl.getState$kotlinx_coroutines_core(), debugCoroutineInfoImpl.lastObservedThread, listLastObservedStackTrace$kotlinx_coroutines_core);
            printStream.print("\n\nCoroutine " + coroutineOwner.delegate + ", state: " + ((e0.areEqual(debugCoroutineInfoImpl.getState$kotlinx_coroutines_core(), DebugCoroutineInfoImplKt.RUNNING) && listEnhanceStackTraceWithThreadDumpImpl == listLastObservedStackTrace$kotlinx_coroutines_core) ? debugCoroutineInfoImpl.getState$kotlinx_coroutines_core() + " (Last suspension stacktrace, not an actual stacktrace)" : debugCoroutineInfoImpl.getState$kotlinx_coroutines_core()));
            if (listLastObservedStackTrace$kotlinx_coroutines_core.isEmpty()) {
                printStream.print("\n\tat " + ARTIFICIAL_FRAME);
                debugProbesImpl.printStackTrace(printStream, debugCoroutineInfoImpl.getCreationStackTrace());
            } else {
                debugProbesImpl.printStackTrace(printStream, listEnhanceStackTraceWithThreadDumpImpl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dumpCoroutinesSynchronized$lambda$14(CoroutineOwner coroutineOwner) {
        return !INSTANCE.isFinished(coroutineOwner);
    }

    private final List<StackTraceElement> enhanceStackTraceWithThreadDumpImpl(String str, Thread thread, List<StackTraceElement> list) {
        Object objM7131constructorimpl;
        if (e0.areEqual(str, DebugCoroutineInfoImplKt.RUNNING) && thread != null) {
            try {
                int i10 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(thread.getStackTrace());
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            if (z.m7136isFailureimpl(objM7131constructorimpl)) {
                objM7131constructorimpl = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objM7131constructorimpl;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTraceElementArr[i12];
                    if (e0.areEqual(stackTraceElement.getClassName(), "kotlin.coroutines.jvm.internal.BaseContinuationImpl") && e0.areEqual(stackTraceElement.getMethodName(), "resumeWith") && e0.areEqual(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                        break;
                    }
                    i12++;
                }
                v vVarFindContinuationStartIndex = findContinuationStartIndex(i12, stackTraceElementArr, list);
                int iIntValue = ((Number) vVarFindContinuationStartIndex.component1()).intValue();
                int iIntValue2 = ((Number) vVarFindContinuationStartIndex.component2()).intValue();
                if (iIntValue != -1) {
                    ArrayList arrayList = new ArrayList((((list.size() + i12) - iIntValue) - 1) - iIntValue2);
                    int i13 = i12 - iIntValue2;
                    for (int i14 = 0; i14 < i13; i14++) {
                        arrayList.add(stackTraceElementArr[i14]);
                    }
                    int size = list.size();
                    for (int i15 = iIntValue + 1; i15 < size; i15++) {
                        arrayList.add(list.get(i15));
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    private final v findContinuationStartIndex(int i10, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i11 = 0; i11 < 3; i11++) {
            int iFindIndexOfFrame = INSTANCE.findIndexOfFrame((i10 - 1) - i11, stackTraceElementArr, list);
            if (iFindIndexOfFrame != -1) {
                return tu.e0.to(Integer.valueOf(iFindIndexOfFrame), Integer.valueOf(i11));
            }
        }
        return tu.e0.to(-1, 0);
    }

    private final int findIndexOfFrame(int i10, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) k0.getOrNull(stackTraceElementArr, i10);
        if (stackTraceElement == null) {
            return -1;
        }
        int i11 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (e0.areEqual(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && e0.areEqual(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && e0.areEqual(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private final Set<CoroutineOwner<?>> getCapturedCoroutines() {
        return capturedCoroutinesMap.keySet();
    }

    private final String getDebugString(Job job) {
        return job instanceof JobSupport ? ((JobSupport) job).toDebugString() : job.toString();
    }

    private final l getDynamicAttach() {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            objM7131constructorimpl = z.m7131constructorimpl((l) h1.beforeCheckcastToFunctionOfArity(objNewInstance, 1));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        return (l) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
    }

    private final /* synthetic */ AtomicInteger getInstallations() {
        return installations;
    }

    private final /* synthetic */ AtomicLong getSequenceNumber() {
        return sequenceNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFinished(CoroutineOwner<?> coroutineOwner) {
        Job job;
        m context = coroutineOwner.info.getContext();
        if (context == null || (job = (Job) context.get(Job.Key)) == null || !job.isCompleted()) {
            return false;
        }
        capturedCoroutinesMap.remove(coroutineOwner);
        return true;
    }

    private final boolean isInternalMethod(StackTraceElement stackTraceElement) {
        return sv.k0.startsWith$default(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    private final CoroutineOwner<?> owner(d<?> dVar) {
        e eVar = dVar instanceof e ? (e) dVar : null;
        if (eVar != null) {
            return owner(eVar);
        }
        return null;
    }

    private final void printStackTrace(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void probeCoroutineCompleted(CoroutineOwner<?> coroutineOwner) {
        e eVarRealCaller;
        capturedCoroutinesMap.remove(coroutineOwner);
        e lastObservedFrame$kotlinx_coroutines_core = coroutineOwner.info.getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null || (eVarRealCaller = realCaller(lastObservedFrame$kotlinx_coroutines_core)) == null) {
            return;
        }
        callerInfoCache.remove(eVarRealCaller);
    }

    private final e realCaller(e eVar) {
        do {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return null;
            }
        } while (eVar.getStackTraceElement() == null);
        return eVar;
    }

    private final <T extends Throwable> List<StackTraceElement> sanitizeStackTrace(T t10) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i11 = length2 - 1;
                if (e0.areEqual(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i10 = length2;
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                length2 = i11;
            }
        }
        int i12 = i10 + 1;
        if (!sanitizeStackTraces) {
            int i13 = length - i12;
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList.add(stackTrace[i14 + i12]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i12) + 1);
        while (i12 < length) {
            if (isInternalMethod(stackTrace[i12])) {
                arrayList2.add(stackTrace[i12]);
                int i15 = i12 + 1;
                while (i15 < length && isInternalMethod(stackTrace[i15])) {
                    i15++;
                }
                int i16 = i15 - 1;
                int i17 = i16;
                while (i17 > i12 && stackTrace[i17].getFileName() == null) {
                    i17--;
                }
                if (i17 > i12 && i17 < i16) {
                    arrayList2.add(stackTrace[i17]);
                }
                arrayList2.add(stackTrace[i16]);
                i12 = i15;
            } else {
                arrayList2.add(stackTrace[i12]);
                i12++;
            }
        }
        return arrayList2;
    }

    private final void startWeakRefCleanerThread() {
        weakRefCleanerThread = b.thread$default(false, true, null, "Coroutines Debugger Cleaner", 0, new f(4), 21, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 startWeakRefCleanerThread$lambda$2() {
        callerInfoCache.runWeakRefQueueCleaningLoopUntilInterrupted();
        return x0.f87415a;
    }

    private final void stopWeakRefCleanerThread() throws InterruptedException {
        Thread thread = weakRefCleanerThread;
        if (thread == null) {
            return;
        }
        weakRefCleanerThread = null;
        thread.interrupt();
        thread.join();
    }

    private final StackTraceFrame toStackTraceFrame(List<StackTraceElement> list) {
        StackTraceFrame stackTraceFrame = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                stackTraceFrame = new StackTraceFrame(stackTraceFrame, listIterator.previous());
            }
        }
        return new StackTraceFrame(stackTraceFrame, ARTIFICIAL_FRAME);
    }

    private final String toStringRepr(Object obj) {
        return DebugProbesImplKt.repr(obj.toString());
    }

    private final void updateRunningState(e eVar, String str) {
        boolean z10;
        if (isInstalled$kotlinx_coroutines_debug()) {
            ConcurrentWeakMap<e, DebugCoroutineInfoImpl> concurrentWeakMap = callerInfoCache;
            DebugCoroutineInfoImpl debugCoroutineInfoImplRemove = concurrentWeakMap.remove(eVar);
            if (debugCoroutineInfoImplRemove != null) {
                z10 = false;
            } else {
                CoroutineOwner<?> coroutineOwnerOwner = owner(eVar);
                if (coroutineOwnerOwner == null || (debugCoroutineInfoImplRemove = coroutineOwnerOwner.info) == null) {
                    return;
                }
                e lastObservedFrame$kotlinx_coroutines_core = debugCoroutineInfoImplRemove.getLastObservedFrame$kotlinx_coroutines_core();
                e eVarRealCaller = lastObservedFrame$kotlinx_coroutines_core != null ? realCaller(lastObservedFrame$kotlinx_coroutines_core) : null;
                if (eVarRealCaller != null) {
                    concurrentWeakMap.remove(eVarRealCaller);
                }
                z10 = true;
            }
            e0.checkNotNull(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            debugCoroutineInfoImplRemove.updateState$kotlinx_coroutines_core(str, (d) eVar, z10);
            e eVarRealCaller2 = realCaller(eVar);
            if (eVarRealCaller2 == null) {
                return;
            }
            concurrentWeakMap.put(eVarRealCaller2, debugCoroutineInfoImplRemove);
        }
    }

    private final void updateState(d<?> dVar, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            if (ignoreCoroutinesWithEmptyContext && dVar.getContext() == n.f98854b) {
                return;
            }
            if (e0.areEqual(str, DebugCoroutineInfoImplKt.RUNNING)) {
                e eVar = dVar instanceof e ? (e) dVar : null;
                if (eVar == null) {
                    return;
                }
                updateRunningState(eVar, str);
                return;
            }
            CoroutineOwner<?> coroutineOwnerOwner = owner(dVar);
            if (coroutineOwnerOwner == null) {
                return;
            }
            updateState(coroutineOwnerOwner, dVar, str);
        }
    }

    public final void dumpCoroutines(PrintStream printStream) {
        synchronized (printStream) {
            INSTANCE.dumpCoroutinesSynchronized(printStream);
        }
    }

    public final List<DebugCoroutineInfo> dumpCoroutinesInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return f0.toList(f0.mapNotNull(f0.sortedWith(y0.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new l() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kv.l
                public final DebugCoroutineInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    m context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebugCoroutineInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final Object[] dumpCoroutinesInfoAsJsonAndReferences() {
        String name;
        List<DebugCoroutineInfo> listDumpCoroutinesInfo = dumpCoroutinesInfo();
        int size = listDumpCoroutinesInfo.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (DebugCoroutineInfo debugCoroutineInfo : listDumpCoroutinesInfo) {
            m context = debugCoroutineInfo.getContext();
            CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.Key);
            Long lValueOf = null;
            String stringRepr = (coroutineName == null || (name = coroutineName.getName()) == null) ? null : toStringRepr(name);
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) context.get(CoroutineDispatcher.Key);
            String stringRepr2 = coroutineDispatcher != null ? toStringRepr(coroutineDispatcher) : null;
            StringBuilder sbO = g.o("\n                {\n                    \"name\": ", stringRepr, ",\n                    \"id\": ");
            CoroutineId coroutineId = (CoroutineId) context.get(CoroutineId.Key);
            if (coroutineId != null) {
                lValueOf = Long.valueOf(coroutineId.getId());
            }
            sbO.append(lValueOf);
            sbO.append(",\n                    \"dispatcher\": ");
            sbO.append(stringRepr2);
            sbO.append(",\n                    \"sequenceNumber\": ");
            sbO.append(debugCoroutineInfo.getSequenceNumber());
            sbO.append(",\n                    \"state\": \"");
            sbO.append(debugCoroutineInfo.getState());
            sbO.append("\"\n                } \n                ");
            arrayList3.add(d0.trimIndent(sbO.toString()));
            arrayList2.add(debugCoroutineInfo.getLastObservedFrame());
            arrayList.add(debugCoroutineInfo.getLastObservedThread());
        }
        return new Object[]{o2.q(new StringBuilder(C3191e4.i.f36529d), y0.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null), AbstractJsonLexerKt.END_LIST), arrayList.toArray(new Thread[0]), arrayList2.toArray(new e[0]), listDumpCoroutinesInfo.toArray(new DebugCoroutineInfo[0])};
    }

    public final List<DebuggerInfo> dumpDebuggerInfo() {
        if (isInstalled$kotlinx_coroutines_debug()) {
            return f0.toList(f0.mapNotNull(f0.sortedWith(y0.asSequence(getCapturedCoroutines()), new DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1()), new l() { // from class: kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
                @Override // kv.l
                public final DebuggerInfo invoke(DebugProbesImpl.CoroutineOwner<?> coroutineOwner) {
                    m context;
                    if (DebugProbesImpl.INSTANCE.isFinished(coroutineOwner) || (context = coroutineOwner.info.getContext()) == null) {
                        return null;
                    }
                    return new DebuggerInfo(coroutineOwner.info, context);
                }
            }));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final List<StackTraceElement> enhanceStackTraceWithThreadDump(DebugCoroutineInfo debugCoroutineInfo, List<StackTraceElement> list) {
        return enhanceStackTraceWithThreadDumpImpl(debugCoroutineInfo.getState(), debugCoroutineInfo.getLastObservedThread(), list);
    }

    public final String enhanceStackTraceWithThreadDumpAsJson(DebugCoroutineInfo debugCoroutineInfo) {
        List<StackTraceElement> listEnhanceStackTraceWithThreadDump = enhanceStackTraceWithThreadDump(debugCoroutineInfo, debugCoroutineInfo.lastObservedStackTrace());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : listEnhanceStackTraceWithThreadDump) {
            StringBuilder sb2 = new StringBuilder("\n                {\n                    \"declaringClass\": \"");
            sb2.append(stackTraceElement.getClassName());
            sb2.append("\",\n                    \"methodName\": \"");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            sb2.append(fileName != null ? toStringRepr(fileName) : null);
            sb2.append(",\n                    \"lineNumber\": ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append("\n                }\n                ");
            arrayList.add(d0.trimIndent(sb2.toString()));
        }
        return o2.q(new StringBuilder(C3191e4.i.f36529d), y0.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null), AbstractJsonLexerKt.END_LIST);
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
        return enableCreationStackTraces;
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
        return ignoreCoroutinesWithEmptyContext;
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
        return sanitizeStackTraces;
    }

    public final String hierarchyToString$kotlinx_coroutines_core(Job job) {
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Debug probes are not installed");
        }
        Set<CoroutineOwner<?>> capturedCoroutines = getCapturedCoroutines();
        ArrayList<CoroutineOwner> arrayList = new ArrayList();
        for (Object obj : capturedCoroutines) {
            if (((CoroutineOwner) obj).delegate.getContext().get(Job.Key) != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(arrayList, 10)), 16));
        for (CoroutineOwner coroutineOwner : arrayList) {
            linkedHashMap.put(JobKt.getJob(coroutineOwner.delegate.getContext()), coroutineOwner.info);
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.build(job, linkedHashMap, sb2, "");
        return sb2.toString();
    }

    public final void install$kotlinx_coroutines_core() {
        l lVar;
        if (getInstallations().incrementAndGet() > 1) {
            return;
        }
        startWeakRefCleanerThread();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (lVar = dynamicAttach) == null) {
            return;
        }
        lVar.invoke(Boolean.TRUE);
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
        return getInstallations().get() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> d<T> probeCoroutineCreated$kotlinx_coroutines_core(d<? super T> dVar) {
        if (isInstalled$kotlinx_coroutines_debug() && (!(ignoreCoroutinesWithEmptyContext && dVar.getContext() == n.f98854b) && owner(dVar) == null)) {
            return createOwner(dVar, enableCreationStackTraces ? toStackTraceFrame(sanitizeStackTrace(new Exception())) : null);
        }
        return dVar;
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(d<?> dVar) {
        updateState(dVar, DebugCoroutineInfoImplKt.RUNNING);
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(d<?> dVar) {
        updateState(dVar, DebugCoroutineInfoImplKt.SUSPENDED);
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean z10) {
        enableCreationStackTraces = z10;
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean z10) {
        ignoreCoroutinesWithEmptyContext = z10;
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean z10) {
        sanitizeStackTraces = z10;
    }

    public final void uninstall$kotlinx_coroutines_core() throws InterruptedException {
        l lVar;
        if (!isInstalled$kotlinx_coroutines_debug()) {
            throw new IllegalStateException("Agent was not installed");
        }
        if (getInstallations().decrementAndGet() != 0) {
            return;
        }
        stopWeakRefCleanerThread();
        capturedCoroutinesMap.clear();
        callerInfoCache.clear();
        if (AgentInstallationType.INSTANCE.isInstalledStatically$kotlinx_coroutines_core() || (lVar = dynamicAttach) == null) {
            return;
        }
        lVar.invoke(Boolean.FALSE);
    }

    private final CoroutineOwner<?> owner(e eVar) {
        while (!(eVar instanceof CoroutineOwner)) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return null;
            }
        }
        return (CoroutineOwner) eVar;
    }

    private final void updateState(CoroutineOwner<?> coroutineOwner, d<?> dVar, String str) {
        if (isInstalled$kotlinx_coroutines_debug()) {
            coroutineOwner.info.updateState$kotlinx_coroutines_core(str, dVar, true);
        }
    }

    private static /* synthetic */ void getDebugString$annotations(Job job) {
    }
}
