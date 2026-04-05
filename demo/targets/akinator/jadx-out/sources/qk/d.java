package qk;

import bj.s;
import com.google.firebase.inappmessaging.CommonTypesProto$CampaignTime;
import com.google.firebase.inappmessaging.CommonTypesProto$Priority;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ExperimentalCampaignRollout;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d extends GeneratedMessageLite.Builder implements e {
    public d clearEndTime() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).clearEndTime();
        return this;
    }

    public d clearExperimentId() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).clearExperimentId();
        return this;
    }

    public d clearPriority() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).clearPriority();
        return this;
    }

    public d clearSelectedVariantIndex() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).clearSelectedVariantIndex();
        return this;
    }

    public d clearStartTime() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).clearStartTime();
        return this;
    }

    @Override // qk.e
    public CommonTypesProto$CampaignTime getEndTime() {
        return ((CampaignProto$ExperimentalCampaignRollout) this.instance).getEndTime();
    }

    @Override // qk.e
    public String getExperimentId() {
        return ((CampaignProto$ExperimentalCampaignRollout) this.instance).getExperimentId();
    }

    @Override // qk.e
    public ByteString getExperimentIdBytes() {
        return ((CampaignProto$ExperimentalCampaignRollout) this.instance).getExperimentIdBytes();
    }

    @Override // qk.e
    public CommonTypesProto$Priority getPriority() {
        return ((CampaignProto$ExperimentalCampaignRollout) this.instance).getPriority();
    }

    @Override // qk.e
    public int getSelectedVariantIndex() {
        return ((CampaignProto$ExperimentalCampaignRollout) this.instance).getSelectedVariantIndex();
    }

    @Override // qk.e
    public CommonTypesProto$CampaignTime getStartTime() {
        return ((CampaignProto$ExperimentalCampaignRollout) this.instance).getStartTime();
    }

    @Override // qk.e
    public boolean hasEndTime() {
        return ((CampaignProto$ExperimentalCampaignRollout) this.instance).hasEndTime();
    }

    @Override // qk.e
    public boolean hasPriority() {
        return ((CampaignProto$ExperimentalCampaignRollout) this.instance).hasPriority();
    }

    @Override // qk.e
    public boolean hasStartTime() {
        return ((CampaignProto$ExperimentalCampaignRollout) this.instance).hasStartTime();
    }

    public d mergeEndTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).mergeEndTime(commonTypesProto$CampaignTime);
        return this;
    }

    public d mergePriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).mergePriority(commonTypesProto$Priority);
        return this;
    }

    public d mergeStartTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).mergeStartTime(commonTypesProto$CampaignTime);
        return this;
    }

    public d setEndTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).setEndTime(commonTypesProto$CampaignTime);
        return this;
    }

    public d setExperimentId(String str) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).setExperimentId(str);
        return this;
    }

    public d setExperimentIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).setExperimentIdBytes(byteString);
        return this;
    }

    public d setPriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).setPriority(commonTypesProto$Priority);
        return this;
    }

    public d setSelectedVariantIndex(int i10) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).setSelectedVariantIndex(i10);
        return this;
    }

    public d setStartTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).setStartTime(commonTypesProto$CampaignTime);
        return this;
    }

    public d setEndTime(bj.i iVar) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).setEndTime((CommonTypesProto$CampaignTime) iVar.build());
        return this;
    }

    public d setPriority(s sVar) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).setPriority((CommonTypesProto$Priority) sVar.build());
        return this;
    }

    public d setStartTime(bj.i iVar) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignRollout) this.instance).setStartTime((CommonTypesProto$CampaignTime) iVar.build());
        return this;
    }
}
