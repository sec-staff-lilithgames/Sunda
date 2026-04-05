package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$Event;
import com.google.firebase.inappmessaging.CommonTypesProto$TriggerParam;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o extends GeneratedMessageLite.Builder implements p {
    public o addAllTriggerParams(Iterable<? extends CommonTypesProto$TriggerParam> iterable) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).addAllTriggerParams(iterable);
        return this;
    }

    public o addTriggerParams(CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).addTriggerParams(commonTypesProto$TriggerParam);
        return this;
    }

    public o clearCount() {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).clearCount();
        return this;
    }

    public o clearName() {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).clearName();
        return this;
    }

    public o clearPreviousTimestampMillis() {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).clearPreviousTimestampMillis();
        return this;
    }

    public o clearTimestampMillis() {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).clearTimestampMillis();
        return this;
    }

    public o clearTriggerParams() {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).clearTriggerParams();
        return this;
    }

    @Override // bj.p
    public int getCount() {
        return ((CommonTypesProto$Event) this.instance).getCount();
    }

    @Override // bj.p
    public String getName() {
        return ((CommonTypesProto$Event) this.instance).getName();
    }

    @Override // bj.p
    public ByteString getNameBytes() {
        return ((CommonTypesProto$Event) this.instance).getNameBytes();
    }

    @Override // bj.p
    public long getPreviousTimestampMillis() {
        return ((CommonTypesProto$Event) this.instance).getPreviousTimestampMillis();
    }

    @Override // bj.p
    public long getTimestampMillis() {
        return ((CommonTypesProto$Event) this.instance).getTimestampMillis();
    }

    @Override // bj.p
    public CommonTypesProto$TriggerParam getTriggerParams(int i10) {
        return ((CommonTypesProto$Event) this.instance).getTriggerParams(i10);
    }

    @Override // bj.p
    public int getTriggerParamsCount() {
        return ((CommonTypesProto$Event) this.instance).getTriggerParamsCount();
    }

    @Override // bj.p
    public List<CommonTypesProto$TriggerParam> getTriggerParamsList() {
        return Collections.unmodifiableList(((CommonTypesProto$Event) this.instance).getTriggerParamsList());
    }

    public o removeTriggerParams(int i10) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).removeTriggerParams(i10);
        return this;
    }

    public o setCount(int i10) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).setCount(i10);
        return this;
    }

    public o setName(String str) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).setName(str);
        return this;
    }

    public o setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).setNameBytes(byteString);
        return this;
    }

    public o setPreviousTimestampMillis(long j10) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).setPreviousTimestampMillis(j10);
        return this;
    }

    public o setTimestampMillis(long j10) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).setTimestampMillis(j10);
        return this;
    }

    public o setTriggerParams(int i10, CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).setTriggerParams(i10, commonTypesProto$TriggerParam);
        return this;
    }

    public o addTriggerParams(int i10, CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).addTriggerParams(i10, commonTypesProto$TriggerParam);
        return this;
    }

    public o setTriggerParams(int i10, z zVar) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).setTriggerParams(i10, (CommonTypesProto$TriggerParam) zVar.build());
        return this;
    }

    public o addTriggerParams(z zVar) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).addTriggerParams((CommonTypesProto$TriggerParam) zVar.build());
        return this;
    }

    public o addTriggerParams(int i10, z zVar) {
        copyOnWrite();
        ((CommonTypesProto$Event) this.instance).addTriggerParams(i10, (CommonTypesProto$TriggerParam) zVar.build());
        return this;
    }
}
