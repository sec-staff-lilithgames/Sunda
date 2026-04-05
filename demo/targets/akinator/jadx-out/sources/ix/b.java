package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import xchange.Cargo$CargoFieldCounter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends GeneratedMessageLite.Builder implements c {
    public b clearCardinality() {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).clearCardinality();
        return this;
    }

    public b clearEmpty() {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).clearEmpty();
        return this;
    }

    public b clearFilled() {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).clearFilled();
        return this;
    }

    public b clearName() {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).clearName();
        return this;
    }

    public b clearTotal() {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).clearTotal();
        return this;
    }

    @Override // ix.c
    public long getCardinality() {
        return ((Cargo$CargoFieldCounter) this.instance).getCardinality();
    }

    @Override // ix.c
    public long getEmpty() {
        return ((Cargo$CargoFieldCounter) this.instance).getEmpty();
    }

    @Override // ix.c
    public long getFilled() {
        return ((Cargo$CargoFieldCounter) this.instance).getFilled();
    }

    @Override // ix.c
    public String getName() {
        return ((Cargo$CargoFieldCounter) this.instance).getName();
    }

    @Override // ix.c
    public ByteString getNameBytes() {
        return ((Cargo$CargoFieldCounter) this.instance).getNameBytes();
    }

    @Override // ix.c
    public long getTotal() {
        return ((Cargo$CargoFieldCounter) this.instance).getTotal();
    }

    public b setCardinality(long j10) {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).setCardinality(j10);
        return this;
    }

    public b setEmpty(long j10) {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).setEmpty(j10);
        return this;
    }

    public b setFilled(long j10) {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).setFilled(j10);
        return this;
    }

    public b setName(String str) {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).setName(str);
        return this;
    }

    public b setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).setNameBytes(byteString);
        return this;
    }

    public b setTotal(long j10) {
        copyOnWrite();
        ((Cargo$CargoFieldCounter) this.instance).setTotal(j10);
        return this;
    }
}
