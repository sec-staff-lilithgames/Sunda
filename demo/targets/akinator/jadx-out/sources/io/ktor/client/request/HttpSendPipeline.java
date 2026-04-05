package io.ktor.client.request;

import io.ktor.util.pipeline.Pipeline;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpSendPipeline extends Pipeline<Object, HttpRequestBuilder> {
    private final boolean developmentMode;
    public static final Phases Phases = new Phases(null);
    private static final PipelinePhase Before = new PipelinePhase("Before");
    private static final PipelinePhase State = new PipelinePhase("State");
    private static final PipelinePhase Monitoring = new PipelinePhase("Monitoring");
    private static final PipelinePhase Engine = new PipelinePhase("Engine");
    private static final PipelinePhase Receive = new PipelinePhase("Receive");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Phases {
        public /* synthetic */ Phases(u uVar) {
            this();
        }

        public final PipelinePhase getBefore() {
            return HttpSendPipeline.Before;
        }

        public final PipelinePhase getEngine() {
            return HttpSendPipeline.Engine;
        }

        public final PipelinePhase getMonitoring() {
            return HttpSendPipeline.Monitoring;
        }

        public final PipelinePhase getReceive() {
            return HttpSendPipeline.Receive;
        }

        public final PipelinePhase getState() {
            return HttpSendPipeline.State;
        }

        private Phases() {
        }
    }

    public HttpSendPipeline() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.Pipeline
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public /* synthetic */ HttpSendPipeline(boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public HttpSendPipeline(boolean z10) {
        super(Before, State, Monitoring, Engine, Receive);
        this.developmentMode = z10;
    }
}
