package wk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.type.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e extends GeneratedMessageLite.Builder implements f {
    public e clearDay() {
        copyOnWrite();
        ((Date) this.instance).clearDay();
        return this;
    }

    public e clearMonth() {
        copyOnWrite();
        ((Date) this.instance).clearMonth();
        return this;
    }

    public e clearYear() {
        copyOnWrite();
        ((Date) this.instance).clearYear();
        return this;
    }

    @Override // wk.f
    public int getDay() {
        return ((Date) this.instance).getDay();
    }

    @Override // wk.f
    public int getMonth() {
        return ((Date) this.instance).getMonth();
    }

    @Override // wk.f
    public int getYear() {
        return ((Date) this.instance).getYear();
    }

    public e setDay(int i10) {
        copyOnWrite();
        ((Date) this.instance).setDay(i10);
        return this;
    }

    public e setMonth(int i10) {
        copyOnWrite();
        ((Date) this.instance).setMonth(i10);
        return this;
    }

    public e setYear(int i10) {
        copyOnWrite();
        ((Date) this.instance).setYear(i10);
        return this;
    }
}
