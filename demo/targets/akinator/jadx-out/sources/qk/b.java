package qk;

import bj.n0;
import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentPayload;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ExperimentalCampaignPayload;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearCampaignEndTimeMillis() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).clearCampaignEndTimeMillis();
        return this;
    }

    public b clearCampaignId() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).clearCampaignId();
        return this;
    }

    public b clearCampaignName() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).clearCampaignName();
        return this;
    }

    public b clearCampaignStartTimeMillis() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).clearCampaignStartTimeMillis();
        return this;
    }

    public b clearExperimentPayload() {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).clearExperimentPayload();
        return this;
    }

    @Override // qk.c
    public long getCampaignEndTimeMillis() {
        return ((CampaignProto$ExperimentalCampaignPayload) this.instance).getCampaignEndTimeMillis();
    }

    @Override // qk.c
    public String getCampaignId() {
        return ((CampaignProto$ExperimentalCampaignPayload) this.instance).getCampaignId();
    }

    @Override // qk.c
    public ByteString getCampaignIdBytes() {
        return ((CampaignProto$ExperimentalCampaignPayload) this.instance).getCampaignIdBytes();
    }

    @Override // qk.c
    public String getCampaignName() {
        return ((CampaignProto$ExperimentalCampaignPayload) this.instance).getCampaignName();
    }

    @Override // qk.c
    public ByteString getCampaignNameBytes() {
        return ((CampaignProto$ExperimentalCampaignPayload) this.instance).getCampaignNameBytes();
    }

    @Override // qk.c
    public long getCampaignStartTimeMillis() {
        return ((CampaignProto$ExperimentalCampaignPayload) this.instance).getCampaignStartTimeMillis();
    }

    @Override // qk.c
    public ExperimentPayloadProto$ExperimentPayload getExperimentPayload() {
        return ((CampaignProto$ExperimentalCampaignPayload) this.instance).getExperimentPayload();
    }

    @Override // qk.c
    public boolean hasExperimentPayload() {
        return ((CampaignProto$ExperimentalCampaignPayload) this.instance).hasExperimentPayload();
    }

    public b mergeExperimentPayload(ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).mergeExperimentPayload(experimentPayloadProto$ExperimentPayload);
        return this;
    }

    public b setCampaignEndTimeMillis(long j10) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).setCampaignEndTimeMillis(j10);
        return this;
    }

    public b setCampaignId(String str) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).setCampaignId(str);
        return this;
    }

    public b setCampaignIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).setCampaignIdBytes(byteString);
        return this;
    }

    public b setCampaignName(String str) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).setCampaignName(str);
        return this;
    }

    public b setCampaignNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).setCampaignNameBytes(byteString);
        return this;
    }

    public b setCampaignStartTimeMillis(long j10) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).setCampaignStartTimeMillis(j10);
        return this;
    }

    public b setExperimentPayload(ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).setExperimentPayload(experimentPayloadProto$ExperimentPayload);
        return this;
    }

    public b setExperimentPayload(n0 n0Var) {
        copyOnWrite();
        ((CampaignProto$ExperimentalCampaignPayload) this.instance).setExperimentPayload((ExperimentPayloadProto$ExperimentPayload) n0Var.build());
        return this;
    }
}
