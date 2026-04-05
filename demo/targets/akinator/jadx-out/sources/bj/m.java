package bj;

import com.google.firebase.inappmessaging.CommonTypesProto$DailyConversionSummary;
import com.google.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m extends GeneratedMessageLite.Builder implements n {
    public m clearConversions() {
        copyOnWrite();
        ((CommonTypesProto$DailyConversionSummary) this.instance).clearConversions();
        return this;
    }

    public m clearStartOfDayMillis() {
        copyOnWrite();
        ((CommonTypesProto$DailyConversionSummary) this.instance).clearStartOfDayMillis();
        return this;
    }

    @Override // bj.n
    public int getConversions() {
        return ((CommonTypesProto$DailyConversionSummary) this.instance).getConversions();
    }

    @Override // bj.n
    public long getStartOfDayMillis() {
        return ((CommonTypesProto$DailyConversionSummary) this.instance).getStartOfDayMillis();
    }

    public m setConversions(int i10) {
        copyOnWrite();
        ((CommonTypesProto$DailyConversionSummary) this.instance).setConversions(i10);
        return this;
    }

    public m setStartOfDayMillis(long j10) {
        copyOnWrite();
        ((CommonTypesProto$DailyConversionSummary) this.instance).setStartOfDayMillis(j10);
        return this;
    }
}
