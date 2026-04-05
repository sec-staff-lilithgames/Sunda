package qk;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$VanillaCampaignPayload;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j extends GeneratedMessageLite.Builder implements k {
    public j clearCampaignEndTimeMillis() {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).clearCampaignEndTimeMillis();
        return this;
    }

    public j clearCampaignId() {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).clearCampaignId();
        return this;
    }

    public j clearCampaignName() {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).clearCampaignName();
        return this;
    }

    public j clearCampaignStartTimeMillis() {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).clearCampaignStartTimeMillis();
        return this;
    }

    public j clearExperimentalCampaignId() {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).clearExperimentalCampaignId();
        return this;
    }

    @Override // qk.k
    public long getCampaignEndTimeMillis() {
        return ((CampaignProto$VanillaCampaignPayload) this.instance).getCampaignEndTimeMillis();
    }

    @Override // qk.k
    public String getCampaignId() {
        return ((CampaignProto$VanillaCampaignPayload) this.instance).getCampaignId();
    }

    @Override // qk.k
    public ByteString getCampaignIdBytes() {
        return ((CampaignProto$VanillaCampaignPayload) this.instance).getCampaignIdBytes();
    }

    @Override // qk.k
    public String getCampaignName() {
        return ((CampaignProto$VanillaCampaignPayload) this.instance).getCampaignName();
    }

    @Override // qk.k
    public ByteString getCampaignNameBytes() {
        return ((CampaignProto$VanillaCampaignPayload) this.instance).getCampaignNameBytes();
    }

    @Override // qk.k
    public long getCampaignStartTimeMillis() {
        return ((CampaignProto$VanillaCampaignPayload) this.instance).getCampaignStartTimeMillis();
    }

    @Override // qk.k
    public String getExperimentalCampaignId() {
        return ((CampaignProto$VanillaCampaignPayload) this.instance).getExperimentalCampaignId();
    }

    @Override // qk.k
    public ByteString getExperimentalCampaignIdBytes() {
        return ((CampaignProto$VanillaCampaignPayload) this.instance).getExperimentalCampaignIdBytes();
    }

    public j setCampaignEndTimeMillis(long j10) {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).setCampaignEndTimeMillis(j10);
        return this;
    }

    public j setCampaignId(String str) {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).setCampaignId(str);
        return this;
    }

    public j setCampaignIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).setCampaignIdBytes(byteString);
        return this;
    }

    public j setCampaignName(String str) {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).setCampaignName(str);
        return this;
    }

    public j setCampaignNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).setCampaignNameBytes(byteString);
        return this;
    }

    public j setCampaignStartTimeMillis(long j10) {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).setCampaignStartTimeMillis(j10);
        return this;
    }

    public j setExperimentalCampaignId(String str) {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).setExperimentalCampaignId(str);
        return this;
    }

    public j setExperimentalCampaignIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CampaignProto$VanillaCampaignPayload) this.instance).setExperimentalCampaignIdBytes(byteString);
        return this;
    }
}
