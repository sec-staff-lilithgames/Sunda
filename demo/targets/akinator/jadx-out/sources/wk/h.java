package wk;

import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.type.DateTime;
import com.google.type.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h extends GeneratedMessageLite.Builder implements j {
    public h clearDay() {
        copyOnWrite();
        ((DateTime) this.instance).clearDay();
        return this;
    }

    public h clearHours() {
        copyOnWrite();
        ((DateTime) this.instance).clearHours();
        return this;
    }

    public h clearMinutes() {
        copyOnWrite();
        ((DateTime) this.instance).clearMinutes();
        return this;
    }

    public h clearMonth() {
        copyOnWrite();
        ((DateTime) this.instance).clearMonth();
        return this;
    }

    public h clearNanos() {
        copyOnWrite();
        ((DateTime) this.instance).clearNanos();
        return this;
    }

    public h clearSeconds() {
        copyOnWrite();
        ((DateTime) this.instance).clearSeconds();
        return this;
    }

    public h clearTimeOffset() {
        copyOnWrite();
        ((DateTime) this.instance).clearTimeOffset();
        return this;
    }

    public h clearTimeZone() {
        copyOnWrite();
        ((DateTime) this.instance).clearTimeZone();
        return this;
    }

    public h clearUtcOffset() {
        copyOnWrite();
        ((DateTime) this.instance).clearUtcOffset();
        return this;
    }

    public h clearYear() {
        copyOnWrite();
        ((DateTime) this.instance).clearYear();
        return this;
    }

    @Override // wk.j
    public int getDay() {
        return ((DateTime) this.instance).getDay();
    }

    @Override // wk.j
    public int getHours() {
        return ((DateTime) this.instance).getHours();
    }

    @Override // wk.j
    public int getMinutes() {
        return ((DateTime) this.instance).getMinutes();
    }

    @Override // wk.j
    public int getMonth() {
        return ((DateTime) this.instance).getMonth();
    }

    @Override // wk.j
    public int getNanos() {
        return ((DateTime) this.instance).getNanos();
    }

    @Override // wk.j
    public int getSeconds() {
        return ((DateTime) this.instance).getSeconds();
    }

    @Override // wk.j
    public i getTimeOffsetCase() {
        return ((DateTime) this.instance).getTimeOffsetCase();
    }

    @Override // wk.j
    public TimeZone getTimeZone() {
        return ((DateTime) this.instance).getTimeZone();
    }

    @Override // wk.j
    public Duration getUtcOffset() {
        return ((DateTime) this.instance).getUtcOffset();
    }

    @Override // wk.j
    public int getYear() {
        return ((DateTime) this.instance).getYear();
    }

    @Override // wk.j
    public boolean hasTimeZone() {
        return ((DateTime) this.instance).hasTimeZone();
    }

    @Override // wk.j
    public boolean hasUtcOffset() {
        return ((DateTime) this.instance).hasUtcOffset();
    }

    public h mergeTimeZone(TimeZone timeZone) {
        copyOnWrite();
        ((DateTime) this.instance).mergeTimeZone(timeZone);
        return this;
    }

    public h mergeUtcOffset(Duration duration) {
        copyOnWrite();
        ((DateTime) this.instance).mergeUtcOffset(duration);
        return this;
    }

    public h setDay(int i10) {
        copyOnWrite();
        ((DateTime) this.instance).setDay(i10);
        return this;
    }

    public h setHours(int i10) {
        copyOnWrite();
        ((DateTime) this.instance).setHours(i10);
        return this;
    }

    public h setMinutes(int i10) {
        copyOnWrite();
        ((DateTime) this.instance).setMinutes(i10);
        return this;
    }

    public h setMonth(int i10) {
        copyOnWrite();
        ((DateTime) this.instance).setMonth(i10);
        return this;
    }

    public h setNanos(int i10) {
        copyOnWrite();
        ((DateTime) this.instance).setNanos(i10);
        return this;
    }

    public h setSeconds(int i10) {
        copyOnWrite();
        ((DateTime) this.instance).setSeconds(i10);
        return this;
    }

    public h setTimeZone(TimeZone timeZone) {
        copyOnWrite();
        ((DateTime) this.instance).setTimeZone(timeZone);
        return this;
    }

    public h setUtcOffset(Duration duration) {
        copyOnWrite();
        ((DateTime) this.instance).setUtcOffset(duration);
        return this;
    }

    public h setYear(int i10) {
        copyOnWrite();
        ((DateTime) this.instance).setYear(i10);
        return this;
    }

    public h setTimeZone(g0 g0Var) {
        copyOnWrite();
        ((DateTime) this.instance).setTimeZone((TimeZone) g0Var.build());
        return this;
    }

    public h setUtcOffset(Duration.Builder builder) {
        copyOnWrite();
        ((DateTime) this.instance).setUtcOffset(builder.build());
        return this;
    }
}
