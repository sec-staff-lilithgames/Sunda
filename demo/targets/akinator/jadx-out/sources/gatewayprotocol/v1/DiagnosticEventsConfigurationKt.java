package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class DiagnosticEventsConfigurationKt {
    public static final DiagnosticEventsConfigurationKt INSTANCE = new DiagnosticEventsConfigurationKt();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder _builder;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class AllowedEventsProxy extends DslProxy {
            private AllowedEventsProxy() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class BlockedEventsProxy extends DslProxy {
            private BlockedEventsProxy() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
                kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder, kotlin.jvm.internal.u uVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DiagnosticEventsConfiguration _build() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfigurationBuild = this._builder.build();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(diagnosticEventsConfigurationBuild, "_builder.build()");
            return diagnosticEventsConfigurationBuild;
        }

        public final /* synthetic */ void addAllAllowedEvents(DslList dslList, Iterable values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            this._builder.addAllAllowedEvents(values);
        }

        public final /* synthetic */ void addAllBlockedEvents(DslList dslList, Iterable values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            this._builder.addAllBlockedEvents(values);
        }

        public final /* synthetic */ void addAllowedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.addAllowedEvents(value);
        }

        public final /* synthetic */ void addBlockedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.addBlockedEvents(value);
        }

        public final /* synthetic */ void clearAllowedEvents(DslList dslList) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearAllowedEvents();
        }

        public final /* synthetic */ void clearBlockedEvents(DslList dslList) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            this._builder.clearBlockedEvents();
        }

        public final void clearEnabled() {
            this._builder.clearEnabled();
        }

        public final void clearMaxBatchIntervalMs() {
            this._builder.clearMaxBatchIntervalMs();
        }

        public final void clearMaxBatchSize() {
            this._builder.clearMaxBatchSize();
        }

        public final void clearSeverity() {
            this._builder.clearSeverity();
        }

        public final void clearTtmEnabled() {
            this._builder.clearTtmEnabled();
        }

        public final /* synthetic */ DslList getAllowedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = this._builder.getAllowedEventsList();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(allowedEventsList, "_builder.getAllowedEventsList()");
            return new DslList(allowedEventsList);
        }

        public final /* synthetic */ DslList getBlockedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = this._builder.getBlockedEventsList();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(blockedEventsList, "_builder.getBlockedEventsList()");
            return new DslList(blockedEventsList);
        }

        public final boolean getEnabled() {
            return this._builder.getEnabled();
        }

        public final int getMaxBatchIntervalMs() {
            return this._builder.getMaxBatchIntervalMs();
        }

        public final int getMaxBatchSize() {
            return this._builder.getMaxBatchSize();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity severity = this._builder.getSeverity();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(severity, "_builder.getSeverity()");
            return severity;
        }

        public final int getSeverityValue() {
            return this._builder.getSeverityValue();
        }

        public final boolean getTtmEnabled() {
            return this._builder.getTtmEnabled();
        }

        public final /* synthetic */ void plusAssignAllAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            addAllAllowedEvents(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> values) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(values, "values");
            addAllBlockedEvents(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            addAllowedEvents(dslList, value);
        }

        public final /* synthetic */ void plusAssignBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            addBlockedEvents(dslList, value);
        }

        public final /* synthetic */ void setAllowedEvents(DslList dslList, int i10, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setAllowedEvents(i10, value);
        }

        public final /* synthetic */ void setBlockedEvents(DslList dslList, int i10, DiagnosticEventRequestOuterClass.DiagnosticEventType value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(dslList, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setBlockedEvents(i10, value);
        }

        public final void setEnabled(boolean z10) {
            this._builder.setEnabled(z10);
        }

        public final void setMaxBatchIntervalMs(int i10) {
            this._builder.setMaxBatchIntervalMs(i10);
        }

        public final void setMaxBatchSize(int i10) {
            this._builder.setMaxBatchSize(i10);
        }

        public final void setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity value) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            this._builder.setSeverity(value);
        }

        public final void setSeverityValue(int i10) {
            this._builder.setSeverityValue(i10);
        }

        public final void setTtmEnabled(boolean z10) {
            this._builder.setTtmEnabled(z10);
        }

        private Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventsConfigurationKt() {
    }
}
