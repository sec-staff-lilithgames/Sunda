package bj;

import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentLite;
import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentPayload;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n0 extends GeneratedMessageLite.Builder implements r0 {
    public n0 addAllOngoingExperiments(Iterable<? extends ExperimentPayloadProto$ExperimentLite> iterable) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).addAllOngoingExperiments(iterable);
        return this;
    }

    public n0 addOngoingExperiments(ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).addOngoingExperiments(experimentPayloadProto$ExperimentLite);
        return this;
    }

    public n0 clearActivateEventToLog() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearActivateEventToLog();
        return this;
    }

    public n0 clearClearEventToLog() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearClearEventToLog();
        return this;
    }

    public n0 clearExperimentId() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearExperimentId();
        return this;
    }

    public n0 clearExperimentStartTimeMillis() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearExperimentStartTimeMillis();
        return this;
    }

    public n0 clearOngoingExperiments() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearOngoingExperiments();
        return this;
    }

    public n0 clearOverflowPolicy() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearOverflowPolicy();
        return this;
    }

    public n0 clearSetEventToLog() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearSetEventToLog();
        return this;
    }

    public n0 clearTimeToLiveMillis() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearTimeToLiveMillis();
        return this;
    }

    public n0 clearTimeoutEventToLog() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearTimeoutEventToLog();
        return this;
    }

    public n0 clearTriggerEvent() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearTriggerEvent();
        return this;
    }

    public n0 clearTriggerTimeoutMillis() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearTriggerTimeoutMillis();
        return this;
    }

    public n0 clearTtlExpiryEventToLog() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearTtlExpiryEventToLog();
        return this;
    }

    public n0 clearVariantId() {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).clearVariantId();
        return this;
    }

    @Override // bj.r0
    public String getActivateEventToLog() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getActivateEventToLog();
    }

    @Override // bj.r0
    public ByteString getActivateEventToLogBytes() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getActivateEventToLogBytes();
    }

    @Override // bj.r0
    public String getClearEventToLog() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getClearEventToLog();
    }

    @Override // bj.r0
    public ByteString getClearEventToLogBytes() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getClearEventToLogBytes();
    }

    @Override // bj.r0
    public String getExperimentId() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getExperimentId();
    }

    @Override // bj.r0
    public ByteString getExperimentIdBytes() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getExperimentIdBytes();
    }

    @Override // bj.r0
    public long getExperimentStartTimeMillis() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getExperimentStartTimeMillis();
    }

    @Override // bj.r0
    public ExperimentPayloadProto$ExperimentLite getOngoingExperiments(int i10) {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getOngoingExperiments(i10);
    }

    @Override // bj.r0
    public int getOngoingExperimentsCount() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getOngoingExperimentsCount();
    }

    @Override // bj.r0
    public List<ExperimentPayloadProto$ExperimentLite> getOngoingExperimentsList() {
        return Collections.unmodifiableList(((ExperimentPayloadProto$ExperimentPayload) this.instance).getOngoingExperimentsList());
    }

    @Override // bj.r0
    public q0 getOverflowPolicy() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getOverflowPolicy();
    }

    @Override // bj.r0
    public int getOverflowPolicyValue() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getOverflowPolicyValue();
    }

    @Override // bj.r0
    public String getSetEventToLog() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getSetEventToLog();
    }

    @Override // bj.r0
    public ByteString getSetEventToLogBytes() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getSetEventToLogBytes();
    }

    @Override // bj.r0
    public long getTimeToLiveMillis() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getTimeToLiveMillis();
    }

    @Override // bj.r0
    public String getTimeoutEventToLog() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getTimeoutEventToLog();
    }

    @Override // bj.r0
    public ByteString getTimeoutEventToLogBytes() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getTimeoutEventToLogBytes();
    }

    @Override // bj.r0
    public String getTriggerEvent() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getTriggerEvent();
    }

    @Override // bj.r0
    public ByteString getTriggerEventBytes() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getTriggerEventBytes();
    }

    @Override // bj.r0
    public long getTriggerTimeoutMillis() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getTriggerTimeoutMillis();
    }

    @Override // bj.r0
    public String getTtlExpiryEventToLog() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getTtlExpiryEventToLog();
    }

    @Override // bj.r0
    public ByteString getTtlExpiryEventToLogBytes() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getTtlExpiryEventToLogBytes();
    }

    @Override // bj.r0
    public String getVariantId() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getVariantId();
    }

    @Override // bj.r0
    public ByteString getVariantIdBytes() {
        return ((ExperimentPayloadProto$ExperimentPayload) this.instance).getVariantIdBytes();
    }

    public n0 removeOngoingExperiments(int i10) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).removeOngoingExperiments(i10);
        return this;
    }

    public n0 setActivateEventToLog(String str) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setActivateEventToLog(str);
        return this;
    }

    public n0 setActivateEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setActivateEventToLogBytes(byteString);
        return this;
    }

    public n0 setClearEventToLog(String str) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setClearEventToLog(str);
        return this;
    }

    public n0 setClearEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setClearEventToLogBytes(byteString);
        return this;
    }

    public n0 setExperimentId(String str) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setExperimentId(str);
        return this;
    }

    public n0 setExperimentIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setExperimentIdBytes(byteString);
        return this;
    }

    public n0 setExperimentStartTimeMillis(long j10) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setExperimentStartTimeMillis(j10);
        return this;
    }

    public n0 setOngoingExperiments(int i10, ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setOngoingExperiments(i10, experimentPayloadProto$ExperimentLite);
        return this;
    }

    public n0 setOverflowPolicy(q0 q0Var) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setOverflowPolicy(q0Var);
        return this;
    }

    public n0 setOverflowPolicyValue(int i10) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setOverflowPolicyValue(i10);
        return this;
    }

    public n0 setSetEventToLog(String str) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setSetEventToLog(str);
        return this;
    }

    public n0 setSetEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setSetEventToLogBytes(byteString);
        return this;
    }

    public n0 setTimeToLiveMillis(long j10) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setTimeToLiveMillis(j10);
        return this;
    }

    public n0 setTimeoutEventToLog(String str) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setTimeoutEventToLog(str);
        return this;
    }

    public n0 setTimeoutEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setTimeoutEventToLogBytes(byteString);
        return this;
    }

    public n0 setTriggerEvent(String str) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setTriggerEvent(str);
        return this;
    }

    public n0 setTriggerEventBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setTriggerEventBytes(byteString);
        return this;
    }

    public n0 setTriggerTimeoutMillis(long j10) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setTriggerTimeoutMillis(j10);
        return this;
    }

    public n0 setTtlExpiryEventToLog(String str) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setTtlExpiryEventToLog(str);
        return this;
    }

    public n0 setTtlExpiryEventToLogBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setTtlExpiryEventToLogBytes(byteString);
        return this;
    }

    public n0 setVariantId(String str) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setVariantId(str);
        return this;
    }

    public n0 setVariantIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setVariantIdBytes(byteString);
        return this;
    }

    public n0 addOngoingExperiments(int i10, ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).addOngoingExperiments(i10, experimentPayloadProto$ExperimentLite);
        return this;
    }

    public n0 setOngoingExperiments(int i10, l0 l0Var) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).setOngoingExperiments(i10, (ExperimentPayloadProto$ExperimentLite) l0Var.build());
        return this;
    }

    public n0 addOngoingExperiments(l0 l0Var) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).addOngoingExperiments((ExperimentPayloadProto$ExperimentLite) l0Var.build());
        return this;
    }

    public n0 addOngoingExperiments(int i10, l0 l0Var) {
        copyOnWrite();
        ((ExperimentPayloadProto$ExperimentPayload) this.instance).addOngoingExperiments(i10, (ExperimentPayloadProto$ExperimentLite) l0Var.build());
        return this;
    }
}
