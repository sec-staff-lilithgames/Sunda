package io.ktor.client.statement;

import io.ktor.client.call.HttpClientCall;
import io.ktor.util.pipeline.Pipeline;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpResponsePipeline extends Pipeline<HttpResponseContainer, HttpClientCall> {
    private final boolean developmentMode;
    public static final Phases Phases = new Phases(null);
    private static final PipelinePhase Receive = new PipelinePhase("Receive");
    private static final PipelinePhase Parse = new PipelinePhase("Parse");
    private static final PipelinePhase Transform = new PipelinePhase("Transform");
    private static final PipelinePhase State = new PipelinePhase("State");
    private static final PipelinePhase After = new PipelinePhase("After");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Phases {
        public /* synthetic */ Phases(u uVar) {
            this();
        }

        public final PipelinePhase getAfter() {
            return HttpResponsePipeline.After;
        }

        public final PipelinePhase getParse() {
            return HttpResponsePipeline.Parse;
        }

        public final PipelinePhase getReceive() {
            return HttpResponsePipeline.Receive;
        }

        public final PipelinePhase getState() {
            return HttpResponsePipeline.State;
        }

        public final PipelinePhase getTransform() {
            return HttpResponsePipeline.Transform;
        }

        private Phases() {
        }
    }

    public HttpResponsePipeline() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.Pipeline
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public /* synthetic */ HttpResponsePipeline(boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public HttpResponsePipeline(boolean z10) {
        super(Receive, Parse, Transform, State, After);
        this.developmentMode = z10;
    }
}
