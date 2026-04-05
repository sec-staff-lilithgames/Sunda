package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;
import xchange.Cargo$CargoFieldCounter;
import xchange.Cargo$CargoPOCounter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends GeneratedMessageLite.Builder implements e {
    public d addAllFields(Iterable<? extends Cargo$CargoFieldCounter> iterable) {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).addAllFields(iterable);
        return this;
    }

    public d addFields(Cargo$CargoFieldCounter cargo$CargoFieldCounter) {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).addFields(cargo$CargoFieldCounter);
        return this;
    }

    public d clearFields() {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).clearFields();
        return this;
    }

    public d clearPurcharseOrder() {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).clearPurcharseOrder();
        return this;
    }

    @Override // ix.e
    public Cargo$CargoFieldCounter getFields(int i10) {
        return ((Cargo$CargoPOCounter) this.instance).getFields(i10);
    }

    @Override // ix.e
    public int getFieldsCount() {
        return ((Cargo$CargoPOCounter) this.instance).getFieldsCount();
    }

    @Override // ix.e
    public List<Cargo$CargoFieldCounter> getFieldsList() {
        return Collections.unmodifiableList(((Cargo$CargoPOCounter) this.instance).getFieldsList());
    }

    @Override // ix.e
    public String getPurcharseOrder() {
        return ((Cargo$CargoPOCounter) this.instance).getPurcharseOrder();
    }

    @Override // ix.e
    public ByteString getPurcharseOrderBytes() {
        return ((Cargo$CargoPOCounter) this.instance).getPurcharseOrderBytes();
    }

    public d removeFields(int i10) {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).removeFields(i10);
        return this;
    }

    public d setFields(int i10, Cargo$CargoFieldCounter cargo$CargoFieldCounter) {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).setFields(i10, cargo$CargoFieldCounter);
        return this;
    }

    public d setPurcharseOrder(String str) {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).setPurcharseOrder(str);
        return this;
    }

    public d setPurcharseOrderBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).setPurcharseOrderBytes(byteString);
        return this;
    }

    public d addFields(int i10, Cargo$CargoFieldCounter cargo$CargoFieldCounter) {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).addFields(i10, cargo$CargoFieldCounter);
        return this;
    }

    public d setFields(int i10, b bVar) {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).setFields(i10, (Cargo$CargoFieldCounter) bVar.build());
        return this;
    }

    public d addFields(b bVar) {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).addFields((Cargo$CargoFieldCounter) bVar.build());
        return this;
    }

    public d addFields(int i10, b bVar) {
        copyOnWrite();
        ((Cargo$CargoPOCounter) this.instance).addFields(i10, (Cargo$CargoFieldCounter) bVar.build());
        return this;
    }
}
