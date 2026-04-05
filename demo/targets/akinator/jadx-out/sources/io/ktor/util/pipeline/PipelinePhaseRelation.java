package io.ktor.util.pipeline;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class PipelinePhaseRelation {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class After extends PipelinePhaseRelation {
        private final PipelinePhase relativeTo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public After(PipelinePhase relativeTo) {
            super(null);
            e0.checkNotNullParameter(relativeTo, "relativeTo");
            this.relativeTo = relativeTo;
        }

        public final PipelinePhase getRelativeTo() {
            return this.relativeTo;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Before extends PipelinePhaseRelation {
        private final PipelinePhase relativeTo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Before(PipelinePhase relativeTo) {
            super(null);
            e0.checkNotNullParameter(relativeTo, "relativeTo");
            this.relativeTo = relativeTo;
        }

        public final PipelinePhase getRelativeTo() {
            return this.relativeTo;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Last extends PipelinePhaseRelation {
        public static final Last INSTANCE = new Last();

        private Last() {
            super(null);
        }
    }

    public /* synthetic */ PipelinePhaseRelation(u uVar) {
        this();
    }

    private PipelinePhaseRelation() {
    }
}
