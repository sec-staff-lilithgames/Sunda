package io.ktor.util.pipeline;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlin.jvm.internal.u;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class PhaseContent<TSubject, Call> {
    public static final Companion Companion = new Companion(null);
    private static final List<Object> SharedArrayList = new ArrayList();
    private List<q> interceptors;
    private final PipelinePhase phase;
    private final PipelinePhaseRelation relation;
    private boolean shared;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final List<Object> getSharedArrayList() {
            return PhaseContent.SharedArrayList;
        }

        private Companion() {
        }

        public static /* synthetic */ void getSharedArrayList$annotations() {
        }
    }

    public PhaseContent(PipelinePhase phase, PipelinePhaseRelation relation, List<q> interceptors) {
        e0.checkNotNullParameter(phase, "phase");
        e0.checkNotNullParameter(relation, "relation");
        e0.checkNotNullParameter(interceptors, "interceptors");
        this.phase = phase;
        this.relation = relation;
        this.interceptors = interceptors;
        this.shared = true;
    }

    private final void copyInterceptors() {
        this.interceptors = copiedInterceptors();
        this.shared = false;
    }

    public final void addInterceptor(q interceptor) {
        e0.checkNotNullParameter(interceptor, "interceptor");
        if (this.shared) {
            copyInterceptors();
        }
        this.interceptors.add(interceptor);
    }

    public final void addTo(List<q> destination) {
        e0.checkNotNullParameter(destination, "destination");
        List<q> list = this.interceptors;
        if (destination instanceof ArrayList) {
            ((ArrayList) destination).ensureCapacity(list.size() + destination.size());
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            destination.add(list.get(i10));
        }
    }

    public final List<q> copiedInterceptors() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.interceptors);
        return arrayList;
    }

    public final PipelinePhase getPhase() {
        return this.phase;
    }

    public final PipelinePhaseRelation getRelation() {
        return this.relation;
    }

    public final boolean getShared() {
        return this.shared;
    }

    public final int getSize() {
        return this.interceptors.size();
    }

    public final boolean isEmpty() {
        return this.interceptors.isEmpty();
    }

    public final void setShared(boolean z10) {
        this.shared = z10;
    }

    public final List<q> sharedInterceptors() {
        this.shared = true;
        return this.interceptors;
    }

    public String toString() {
        return "Phase `" + this.phase.getName() + "`, " + getSize() + " handlers";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhaseContent(PipelinePhase phase, PipelinePhaseRelation relation) {
        e0.checkNotNullParameter(phase, "phase");
        e0.checkNotNullParameter(relation, "relation");
        List<Object> list = SharedArrayList;
        e0.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        this(phase, relation, h1.asMutableList(list));
        if (!list.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final void addTo(PhaseContent<TSubject, Call> destination) {
        e0.checkNotNullParameter(destination, "destination");
        if (isEmpty()) {
            return;
        }
        if (destination.isEmpty()) {
            destination.interceptors = sharedInterceptors();
            destination.shared = true;
        } else {
            if (destination.shared) {
                destination.copyInterceptors();
            }
            addTo(destination.interceptors);
        }
    }
}
