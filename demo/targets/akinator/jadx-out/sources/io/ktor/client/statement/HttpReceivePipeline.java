package io.ktor.client.statement;

import io.ktor.util.pipeline.Pipeline;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.jvm.internal.u;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpReceivePipeline extends Pipeline<HttpResponse, x0> {
    private final boolean developmentMode;
    public static final Phases Phases = new Phases(null);
    private static final PipelinePhase Before = new PipelinePhase("Before");
    private static final PipelinePhase State = new PipelinePhase("State");
    private static final PipelinePhase After = new PipelinePhase("After");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Phases {
        public /* synthetic */ Phases(u uVar) {
            this();
        }

        public final PipelinePhase getAfter() {
            return HttpReceivePipeline.After;
        }

        public final PipelinePhase getBefore() {
            return HttpReceivePipeline.Before;
        }

        public final PipelinePhase getState() {
            return HttpReceivePipeline.State;
        }

        private Phases() {
        }
    }

    public HttpReceivePipeline() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.Pipeline
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public /* synthetic */ HttpReceivePipeline(boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public HttpReceivePipeline(boolean z10) {
        super(Before, State, After);
        this.developmentMode = z10;
    }
}
