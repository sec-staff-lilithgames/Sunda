package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$PostMetricsRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k9 extends GeneratedMessageLite.Builder implements p9 {
    public k9 addAllCounts(Iterable<? extends MetricsRequest$PostMetricsRequest.CountEvent> iterable) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addAllCounts(iterable);
        return this;
    }

    public k9 addAllDurations(Iterable<? extends MetricsRequest$PostMetricsRequest.TimerEvent> iterable) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addAllDurations(iterable);
        return this;
    }

    public k9 addCounts(MetricsRequest$PostMetricsRequest.CountEvent countEvent) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addCounts(countEvent);
        return this;
    }

    public k9 addDurations(MetricsRequest$PostMetricsRequest.TimerEvent timerEvent) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addDurations(timerEvent);
        return this;
    }

    public k9 clearCounts() {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).clearCounts();
        return this;
    }

    public k9 clearDurations() {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).clearDurations();
        return this;
    }

    @Override // com.moloco.sdk.p9
    public MetricsRequest$PostMetricsRequest.CountEvent getCounts(int i10) {
        return ((MetricsRequest$PostMetricsRequest) this.instance).getCounts(i10);
    }

    @Override // com.moloco.sdk.p9
    public int getCountsCount() {
        return ((MetricsRequest$PostMetricsRequest) this.instance).getCountsCount();
    }

    @Override // com.moloco.sdk.p9
    public List<MetricsRequest$PostMetricsRequest.CountEvent> getCountsList() {
        return Collections.unmodifiableList(((MetricsRequest$PostMetricsRequest) this.instance).getCountsList());
    }

    @Override // com.moloco.sdk.p9
    public MetricsRequest$PostMetricsRequest.TimerEvent getDurations(int i10) {
        return ((MetricsRequest$PostMetricsRequest) this.instance).getDurations(i10);
    }

    @Override // com.moloco.sdk.p9
    public int getDurationsCount() {
        return ((MetricsRequest$PostMetricsRequest) this.instance).getDurationsCount();
    }

    @Override // com.moloco.sdk.p9
    public List<MetricsRequest$PostMetricsRequest.TimerEvent> getDurationsList() {
        return Collections.unmodifiableList(((MetricsRequest$PostMetricsRequest) this.instance).getDurationsList());
    }

    public k9 removeCounts(int i10) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).removeCounts(i10);
        return this;
    }

    public k9 removeDurations(int i10) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).removeDurations(i10);
        return this;
    }

    public k9 setCounts(int i10, MetricsRequest$PostMetricsRequest.CountEvent countEvent) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).setCounts(i10, countEvent);
        return this;
    }

    public k9 setDurations(int i10, MetricsRequest$PostMetricsRequest.TimerEvent timerEvent) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).setDurations(i10, timerEvent);
        return this;
    }

    public k9 addCounts(int i10, MetricsRequest$PostMetricsRequest.CountEvent countEvent) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addCounts(i10, countEvent);
        return this;
    }

    public k9 addDurations(int i10, MetricsRequest$PostMetricsRequest.TimerEvent timerEvent) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addDurations(i10, timerEvent);
        return this;
    }

    public k9 setCounts(int i10, l9 l9Var) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).setCounts(i10, (MetricsRequest$PostMetricsRequest.CountEvent) l9Var.build());
        return this;
    }

    public k9 setDurations(int i10, n9 n9Var) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).setDurations(i10, (MetricsRequest$PostMetricsRequest.TimerEvent) n9Var.build());
        return this;
    }

    public k9 addCounts(l9 l9Var) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addCounts((MetricsRequest$PostMetricsRequest.CountEvent) l9Var.build());
        return this;
    }

    public k9 addDurations(n9 n9Var) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addDurations((MetricsRequest$PostMetricsRequest.TimerEvent) n9Var.build());
        return this;
    }

    public k9 addCounts(int i10, l9 l9Var) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addCounts(i10, (MetricsRequest$PostMetricsRequest.CountEvent) l9Var.build());
        return this;
    }

    public k9 addDurations(int i10, n9 n9Var) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest) this.instance).addDurations(i10, (MetricsRequest$PostMetricsRequest.TimerEvent) n9Var.build());
        return this;
    }
}
