package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$DailyAnalyticsSummary;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k extends GeneratedMessageLite.Builder implements l {
    public k clearClicks() {
        copyOnWrite();
        ((CommonTypesProto$DailyAnalyticsSummary) this.instance).clearClicks();
        return this;
    }

    public k clearErrors() {
        copyOnWrite();
        ((CommonTypesProto$DailyAnalyticsSummary) this.instance).clearErrors();
        return this;
    }

    public k clearImpressions() {
        copyOnWrite();
        ((CommonTypesProto$DailyAnalyticsSummary) this.instance).clearImpressions();
        return this;
    }

    public k clearStartOfDayMillis() {
        copyOnWrite();
        ((CommonTypesProto$DailyAnalyticsSummary) this.instance).clearStartOfDayMillis();
        return this;
    }

    @Override // bj.l
    public int getClicks() {
        return ((CommonTypesProto$DailyAnalyticsSummary) this.instance).getClicks();
    }

    @Override // bj.l
    public int getErrors() {
        return ((CommonTypesProto$DailyAnalyticsSummary) this.instance).getErrors();
    }

    @Override // bj.l
    public int getImpressions() {
        return ((CommonTypesProto$DailyAnalyticsSummary) this.instance).getImpressions();
    }

    @Override // bj.l
    public long getStartOfDayMillis() {
        return ((CommonTypesProto$DailyAnalyticsSummary) this.instance).getStartOfDayMillis();
    }

    public k setClicks(int i10) {
        copyOnWrite();
        ((CommonTypesProto$DailyAnalyticsSummary) this.instance).setClicks(i10);
        return this;
    }

    public k setErrors(int i10) {
        copyOnWrite();
        ((CommonTypesProto$DailyAnalyticsSummary) this.instance).setErrors(i10);
        return this;
    }

    public k setImpressions(int i10) {
        copyOnWrite();
        ((CommonTypesProto$DailyAnalyticsSummary) this.instance).setImpressions(i10);
        return this;
    }

    public k setStartOfDayMillis(long j10) {
        copyOnWrite();
        ((CommonTypesProto$DailyAnalyticsSummary) this.instance).setStartOfDayMillis(j10);
        return this;
    }
}
