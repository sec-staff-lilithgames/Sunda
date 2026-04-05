package wv;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import metric.Metric$Event;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearName() {
        copyOnWrite();
        ((Metric$Event) this.instance).clearName();
        return this;
    }

    public b clearTimestamp() {
        copyOnWrite();
        ((Metric$Event) this.instance).clearTimestamp();
        return this;
    }

    @Override // wv.c
    public String getName() {
        return ((Metric$Event) this.instance).getName();
    }

    @Override // wv.c
    public ByteString getNameBytes() {
        return ((Metric$Event) this.instance).getNameBytes();
    }

    @Override // wv.c
    public Timestamp getTimestamp() {
        return ((Metric$Event) this.instance).getTimestamp();
    }

    @Override // wv.c
    public boolean hasTimestamp() {
        return ((Metric$Event) this.instance).hasTimestamp();
    }

    public b mergeTimestamp(Timestamp timestamp) {
        copyOnWrite();
        ((Metric$Event) this.instance).mergeTimestamp(timestamp);
        return this;
    }

    public b setName(String str) {
        copyOnWrite();
        ((Metric$Event) this.instance).setName(str);
        return this;
    }

    public b setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Metric$Event) this.instance).setNameBytes(byteString);
        return this;
    }

    public b setTimestamp(Timestamp timestamp) {
        copyOnWrite();
        ((Metric$Event) this.instance).setTimestamp(timestamp);
        return this;
    }

    public b setTimestamp(Timestamp.Builder builder) {
        copyOnWrite();
        ((Metric$Event) this.instance).setTimestamp(builder.build());
        return this;
    }
}
