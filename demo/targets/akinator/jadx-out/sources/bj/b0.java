package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$Event;
import com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b0 extends GeneratedMessageLite.Builder implements d0 {
    public b0 clearCondition() {
        copyOnWrite();
        ((CommonTypesProto$TriggeringCondition) this.instance).clearCondition();
        return this;
    }

    public b0 clearEvent() {
        copyOnWrite();
        ((CommonTypesProto$TriggeringCondition) this.instance).clearEvent();
        return this;
    }

    public b0 clearFiamTrigger() {
        copyOnWrite();
        ((CommonTypesProto$TriggeringCondition) this.instance).clearFiamTrigger();
        return this;
    }

    @Override // bj.d0
    public c0 getConditionCase() {
        return ((CommonTypesProto$TriggeringCondition) this.instance).getConditionCase();
    }

    @Override // bj.d0
    public CommonTypesProto$Event getEvent() {
        return ((CommonTypesProto$TriggeringCondition) this.instance).getEvent();
    }

    @Override // bj.d0
    public y getFiamTrigger() {
        return ((CommonTypesProto$TriggeringCondition) this.instance).getFiamTrigger();
    }

    @Override // bj.d0
    public int getFiamTriggerValue() {
        return ((CommonTypesProto$TriggeringCondition) this.instance).getFiamTriggerValue();
    }

    @Override // bj.d0
    public boolean hasEvent() {
        return ((CommonTypesProto$TriggeringCondition) this.instance).hasEvent();
    }

    @Override // bj.d0
    public boolean hasFiamTrigger() {
        return ((CommonTypesProto$TriggeringCondition) this.instance).hasFiamTrigger();
    }

    public b0 mergeEvent(CommonTypesProto$Event commonTypesProto$Event) {
        copyOnWrite();
        ((CommonTypesProto$TriggeringCondition) this.instance).mergeEvent(commonTypesProto$Event);
        return this;
    }

    public b0 setEvent(CommonTypesProto$Event commonTypesProto$Event) {
        copyOnWrite();
        ((CommonTypesProto$TriggeringCondition) this.instance).setEvent(commonTypesProto$Event);
        return this;
    }

    public b0 setFiamTrigger(y yVar) {
        copyOnWrite();
        ((CommonTypesProto$TriggeringCondition) this.instance).setFiamTrigger(yVar);
        return this;
    }

    public b0 setFiamTriggerValue(int i10) {
        copyOnWrite();
        ((CommonTypesProto$TriggeringCondition) this.instance).setFiamTriggerValue(i10);
        return this;
    }

    public b0 setEvent(o oVar) {
        copyOnWrite();
        ((CommonTypesProto$TriggeringCondition) this.instance).setEvent((CommonTypesProto$Event) oVar.build());
        return this;
    }
}
