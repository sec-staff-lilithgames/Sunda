package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$CampaignTime;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.type.Date;
import com.google.type.TimeOfDay;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i extends GeneratedMessageLite.Builder implements j {
    public i clearDate() {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).clearDate();
        return this;
    }

    public i clearTime() {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).clearTime();
        return this;
    }

    public i clearTimeZone() {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).clearTimeZone();
        return this;
    }

    @Override // bj.j
    public Date getDate() {
        return ((CommonTypesProto$CampaignTime) this.instance).getDate();
    }

    @Override // bj.j
    public TimeOfDay getTime() {
        return ((CommonTypesProto$CampaignTime) this.instance).getTime();
    }

    @Override // bj.j
    public String getTimeZone() {
        return ((CommonTypesProto$CampaignTime) this.instance).getTimeZone();
    }

    @Override // bj.j
    public ByteString getTimeZoneBytes() {
        return ((CommonTypesProto$CampaignTime) this.instance).getTimeZoneBytes();
    }

    @Override // bj.j
    public boolean hasDate() {
        return ((CommonTypesProto$CampaignTime) this.instance).hasDate();
    }

    @Override // bj.j
    public boolean hasTime() {
        return ((CommonTypesProto$CampaignTime) this.instance).hasTime();
    }

    public i mergeDate(Date date) {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).mergeDate(date);
        return this;
    }

    public i mergeTime(TimeOfDay timeOfDay) {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).mergeTime(timeOfDay);
        return this;
    }

    public i setDate(Date date) {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).setDate(date);
        return this;
    }

    public i setTime(TimeOfDay timeOfDay) {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).setTime(timeOfDay);
        return this;
    }

    public i setTimeZone(String str) {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).setTimeZone(str);
        return this;
    }

    public i setTimeZoneBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).setTimeZoneBytes(byteString);
        return this;
    }

    public i setDate(wk.e eVar) {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).setDate((Date) eVar.build());
        return this;
    }

    public i setTime(wk.d0 d0Var) {
        copyOnWrite();
        ((CommonTypesProto$CampaignTime) this.instance).setTime((TimeOfDay) d0Var.build());
        return this;
    }
}
