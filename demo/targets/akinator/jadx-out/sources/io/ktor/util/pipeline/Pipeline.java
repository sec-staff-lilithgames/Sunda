package io.ktor.util.pipeline;

import io.ktor.util.Attributes;
import io.ktor.util.AttributesJvmKt;
import io.ktor.util.pipeline.PipelinePhaseRelation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kv.q;
import uu.p0;
import uu.q0;
import uu.y0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class Pipeline<TSubject, TContext> {
    private volatile /* synthetic */ Object _interceptors;
    private final Attributes attributes;
    private final boolean developmentMode;
    private boolean interceptorsListShared;
    private PipelinePhase interceptorsListSharedPhase;
    private int interceptorsQuantity;
    private final List<Object> phasesRaw;

    public Pipeline(PipelinePhase... phases) {
        e0.checkNotNullParameter(phases, "phases");
        this.attributes = AttributesJvmKt.Attributes(true);
        this.phasesRaw = p0.mutableListOf(Arrays.copyOf(phases, phases.length));
        this._interceptors = null;
    }

    private final List<q> cacheInterceptors() {
        int lastIndex;
        int i10 = this.interceptorsQuantity;
        if (i10 == 0) {
            notSharedInterceptorsList(p0.emptyList());
            return p0.emptyList();
        }
        List<Object> list = this.phasesRaw;
        int i11 = 0;
        if (i10 == 1 && (lastIndex = p0.getLastIndex(list)) >= 0) {
            int i12 = 0;
            while (true) {
                Object obj = list.get(i12);
                PhaseContent<TSubject, TContext> phaseContent = obj instanceof PhaseContent ? (PhaseContent) obj : null;
                if (phaseContent != null && !phaseContent.isEmpty()) {
                    List<q> listSharedInterceptors = phaseContent.sharedInterceptors();
                    setInterceptorsListFromPhase(phaseContent);
                    return listSharedInterceptors;
                }
                if (i12 == lastIndex) {
                    break;
                }
                i12++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int lastIndex2 = p0.getLastIndex(list);
        if (lastIndex2 >= 0) {
            while (true) {
                Object obj2 = list.get(i11);
                PhaseContent phaseContent2 = obj2 instanceof PhaseContent ? (PhaseContent) obj2 : null;
                if (phaseContent2 != null) {
                    phaseContent2.addTo(arrayList);
                }
                if (i11 == lastIndex2) {
                    break;
                }
                i11++;
            }
        }
        notSharedInterceptorsList(arrayList);
        return arrayList;
    }

    private final PipelineContext<TSubject, TContext> createContext(TContext tcontext, TSubject tsubject, m mVar) {
        return PipelineContextKt.pipelineContextFor(tcontext, sharedInterceptorsList(), tsubject, mVar, getDevelopmentMode());
    }

    private final boolean fastPathMerge(Pipeline<TSubject, TContext> pipeline) {
        if (pipeline.phasesRaw.isEmpty()) {
            return true;
        }
        int i10 = 0;
        if (!this.phasesRaw.isEmpty()) {
            return false;
        }
        List<Object> list = pipeline.phasesRaw;
        int lastIndex = p0.getLastIndex(list);
        if (lastIndex >= 0) {
            while (true) {
                Object obj = list.get(i10);
                if (obj instanceof PipelinePhase) {
                    this.phasesRaw.add(obj);
                } else if (obj instanceof PhaseContent) {
                    PhaseContent phaseContent = (PhaseContent) obj;
                    this.phasesRaw.add(new PhaseContent(phaseContent.getPhase(), phaseContent.getRelation(), phaseContent.sharedInterceptors()));
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        this.interceptorsQuantity += pipeline.interceptorsQuantity;
        setInterceptorsListFromAnotherPipeline(pipeline);
        return true;
    }

    private final PhaseContent<TSubject, TContext> findPhase(PipelinePhase pipelinePhase) {
        List<Object> list = this.phasesRaw;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == pipelinePhase) {
                PhaseContent<TSubject, TContext> phaseContent = new PhaseContent<>(pipelinePhase, PipelinePhaseRelation.Last.INSTANCE);
                list.set(i10, phaseContent);
                return phaseContent;
            }
            if (obj instanceof PhaseContent) {
                PhaseContent<TSubject, TContext> phaseContent2 = (PhaseContent) obj;
                if (phaseContent2.getPhase() == pipelinePhase) {
                    return phaseContent2;
                }
            }
        }
        return null;
    }

    private final int findPhaseIndex(PipelinePhase pipelinePhase) {
        List<Object> list = this.phasesRaw;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == pipelinePhase || ((obj instanceof PhaseContent) && ((PhaseContent) obj).getPhase() == pipelinePhase)) {
                return i10;
            }
        }
        return -1;
    }

    private final List<q> getInterceptors() {
        return (List) this._interceptors;
    }

    private final boolean hasPhase(PipelinePhase pipelinePhase) {
        List<Object> list = this.phasesRaw;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj == pipelinePhase) {
                return true;
            }
            if ((obj instanceof PhaseContent) && ((PhaseContent) obj).getPhase() == pipelinePhase) {
                return true;
            }
        }
        return false;
    }

    private final boolean insertRelativePhase(Object obj, PipelinePhase pipelinePhase) throws InvalidPhaseException {
        PipelinePhaseRelation relation;
        if (obj == pipelinePhase) {
            relation = PipelinePhaseRelation.Last.INSTANCE;
        } else {
            e0.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
            relation = ((PhaseContent) obj).getRelation();
        }
        if (relation instanceof PipelinePhaseRelation.Last) {
            addPhase(pipelinePhase);
            return true;
        }
        if (relation instanceof PipelinePhaseRelation.Before) {
            PipelinePhaseRelation.Before before = (PipelinePhaseRelation.Before) relation;
            if (hasPhase(before.getRelativeTo())) {
                insertPhaseBefore(before.getRelativeTo(), pipelinePhase);
                return true;
            }
        }
        if (!(relation instanceof PipelinePhaseRelation.After)) {
            return false;
        }
        insertPhaseAfter(((PipelinePhaseRelation.After) relation).getRelativeTo(), pipelinePhase);
        return true;
    }

    private final void mergeInterceptors(Pipeline<TSubject, TContext> pipeline) {
        if (this.interceptorsQuantity == 0) {
            setInterceptorsListFromAnotherPipeline(pipeline);
        } else {
            resetInterceptorsList();
        }
        for (Object obj : pipeline.phasesRaw) {
            PipelinePhase phase = obj instanceof PipelinePhase ? (PipelinePhase) obj : null;
            if (phase == null) {
                e0.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                phase = ((PhaseContent) obj).getPhase();
            }
            if (obj instanceof PhaseContent) {
                PhaseContent phaseContent = (PhaseContent) obj;
                if (!phaseContent.isEmpty()) {
                    PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
                    e0.checkNotNull(phaseContentFindPhase);
                    phaseContent.addTo(phaseContentFindPhase);
                    this.interceptorsQuantity = phaseContent.getSize() + this.interceptorsQuantity;
                }
            }
        }
    }

    private final void notSharedInterceptorsList(List<? extends q> list) {
        setInterceptors(list);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    private final void resetInterceptorsList() {
        setInterceptors(null);
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = null;
    }

    private final void setInterceptors(List<? extends q> list) {
        this._interceptors = list;
    }

    private final void setInterceptorsListFromAnotherPipeline(Pipeline<TSubject, TContext> pipeline) {
        setInterceptors(pipeline.sharedInterceptorsList());
        this.interceptorsListShared = true;
        this.interceptorsListSharedPhase = null;
    }

    private final void setInterceptorsListFromPhase(PhaseContent<TSubject, TContext> phaseContent) {
        setInterceptors(phaseContent.sharedInterceptors());
        this.interceptorsListShared = false;
        this.interceptorsListSharedPhase = phaseContent.getPhase();
    }

    private final List<q> sharedInterceptorsList() {
        if (getInterceptors() == null) {
            cacheInterceptors();
        }
        this.interceptorsListShared = true;
        List<q> interceptors = getInterceptors();
        e0.checkNotNull(interceptors);
        return interceptors;
    }

    private final boolean tryAddToPhaseFastPath(PipelinePhase pipelinePhase, q qVar) {
        List<q> interceptors = getInterceptors();
        if (this.phasesRaw.isEmpty() || interceptors == null || this.interceptorsListShared || !h1.isMutableList(interceptors)) {
            return false;
        }
        if (e0.areEqual(this.interceptorsListSharedPhase, pipelinePhase)) {
            interceptors.add(qVar);
            return true;
        }
        if (!e0.areEqual(pipelinePhase, y0.last((List) this.phasesRaw)) && findPhaseIndex(pipelinePhase) != p0.getLastIndex(this.phasesRaw)) {
            return false;
        }
        PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(pipelinePhase);
        e0.checkNotNull(phaseContentFindPhase);
        phaseContentFindPhase.addInterceptor(qVar);
        interceptors.add(qVar);
        return true;
    }

    public final void addPhase(PipelinePhase phase) {
        e0.checkNotNullParameter(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        this.phasesRaw.add(phase);
    }

    public final Object execute(TContext tcontext, TSubject tsubject, d<? super TSubject> dVar) {
        return createContext(tcontext, tsubject, dVar.getContext()).execute$ktor_utils(tsubject, dVar);
    }

    public final Attributes getAttributes() {
        return this.attributes;
    }

    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public final List<PipelinePhase> getItems() {
        List<Object> list = this.phasesRaw;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            PipelinePhase pipelinePhase = obj instanceof PipelinePhase ? (PipelinePhase) obj : null;
            if (pipelinePhase == null) {
                PhaseContent phaseContent = obj instanceof PhaseContent ? (PhaseContent) obj : null;
                PipelinePhase phase = phaseContent != null ? phaseContent.getPhase() : null;
                e0.checkNotNull(phase);
                pipelinePhase = phase;
            }
            arrayList.add(pipelinePhase);
        }
        return arrayList;
    }

    public final void insertPhaseAfter(PipelinePhase reference, PipelinePhase phase) throws InvalidPhaseException {
        PipelinePhaseRelation relation;
        PipelinePhase relativeTo;
        e0.checkNotNullParameter(reference, "reference");
        e0.checkNotNullParameter(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        int iFindPhaseIndex = findPhaseIndex(reference);
        if (iFindPhaseIndex == -1) {
            throw new InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
        }
        int i10 = iFindPhaseIndex + 1;
        int lastIndex = p0.getLastIndex(this.phasesRaw);
        if (i10 <= lastIndex) {
            while (true) {
                Object obj = this.phasesRaw.get(i10);
                PhaseContent phaseContent = obj instanceof PhaseContent ? (PhaseContent) obj : null;
                if (phaseContent != null && (relation = phaseContent.getRelation()) != null) {
                    PipelinePhaseRelation.After after = relation instanceof PipelinePhaseRelation.After ? (PipelinePhaseRelation.After) relation : null;
                    if (after != null && (relativeTo = after.getRelativeTo()) != null && e0.areEqual(relativeTo, reference)) {
                        iFindPhaseIndex = i10;
                    }
                    if (i10 == lastIndex) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    break;
                }
            }
        }
        this.phasesRaw.add(iFindPhaseIndex + 1, new PhaseContent(phase, new PipelinePhaseRelation.After(reference)));
    }

    public final void insertPhaseBefore(PipelinePhase reference, PipelinePhase phase) throws InvalidPhaseException {
        e0.checkNotNullParameter(reference, "reference");
        e0.checkNotNullParameter(phase, "phase");
        if (hasPhase(phase)) {
            return;
        }
        int iFindPhaseIndex = findPhaseIndex(reference);
        if (iFindPhaseIndex != -1) {
            this.phasesRaw.add(iFindPhaseIndex, new PhaseContent(phase, new PipelinePhaseRelation.Before(reference)));
            return;
        }
        throw new InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
    }

    public final void intercept(PipelinePhase phase, q block) {
        e0.checkNotNullParameter(phase, "phase");
        e0.checkNotNullParameter(block, "block");
        PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
        if (phaseContentFindPhase == null) {
            throw new InvalidPhaseException("Phase " + phase + " was not registered for this pipeline");
        }
        if (tryAddToPhaseFastPath(phase, block)) {
            this.interceptorsQuantity++;
            return;
        }
        phaseContentFindPhase.addInterceptor(block);
        this.interceptorsQuantity++;
        resetInterceptorsList();
        afterIntercepted();
    }

    public final List<q> interceptorsForPhase(PipelinePhase phase) {
        Object next;
        e0.checkNotNullParameter(phase, "phase");
        List<Object> list = this.phasesRaw;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof PhaseContent) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e0.areEqual(((PhaseContent) next).getPhase(), phase)) {
                break;
            }
        }
        PhaseContent phaseContent = (PhaseContent) next;
        List<q> listSharedInterceptors = phaseContent != null ? phaseContent.sharedInterceptors() : null;
        return listSharedInterceptors == null ? p0.emptyList() : listSharedInterceptors;
    }

    public final List<q> interceptorsForTests$ktor_utils() {
        List<q> interceptors = getInterceptors();
        return interceptors == null ? cacheInterceptors() : interceptors;
    }

    public final boolean isEmpty() {
        return this.interceptorsQuantity == 0;
    }

    public final void merge(Pipeline<TSubject, TContext> from) {
        e0.checkNotNullParameter(from, "from");
        if (fastPathMerge(from)) {
            return;
        }
        mergePhases(from);
        mergeInterceptors(from);
    }

    public final void mergePhases(Pipeline<TSubject, TContext> from) {
        e0.checkNotNullParameter(from, "from");
        List mutableList = y0.toMutableList((Collection) from.phasesRaw);
        while (!mutableList.isEmpty()) {
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                PipelinePhase phase = next instanceof PipelinePhase ? (PipelinePhase) next : null;
                if (phase == null) {
                    e0.checkNotNull(next, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                    phase = ((PhaseContent) next).getPhase();
                }
                if (hasPhase(phase)) {
                    it.remove();
                } else if (insertRelativePhase(next, phase)) {
                    it.remove();
                }
            }
        }
    }

    public final List<q> phaseInterceptors$ktor_utils(PipelinePhase phase) {
        List<q> listSharedInterceptors;
        e0.checkNotNullParameter(phase, "phase");
        PhaseContent<TSubject, TContext> phaseContentFindPhase = findPhase(phase);
        return (phaseContentFindPhase == null || (listSharedInterceptors = phaseContentFindPhase.sharedInterceptors()) == null) ? p0.emptyList() : listSharedInterceptors;
    }

    public final void resetFrom(Pipeline<TSubject, TContext> from) {
        e0.checkNotNullParameter(from, "from");
        this.phasesRaw.clear();
        if (this.interceptorsQuantity != 0) {
            throw new IllegalStateException("Check failed.");
        }
        fastPathMerge(from);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pipeline(PipelinePhase phase, List<? extends q> interceptors) {
        this(phase);
        e0.checkNotNullParameter(phase, "phase");
        e0.checkNotNullParameter(interceptors, "interceptors");
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            intercept(phase, (q) it.next());
        }
    }

    public void afterIntercepted() {
    }
}
