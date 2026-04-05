package kh;

import com.google.api.Advice;
import com.google.api.ConfigChange;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f0 extends GeneratedMessageLite.Builder implements g0 {
    public f0 addAdvices(Advice advice) {
        copyOnWrite();
        ((ConfigChange) this.instance).addAdvices(advice);
        return this;
    }

    public f0 addAllAdvices(Iterable<? extends Advice> iterable) {
        copyOnWrite();
        ((ConfigChange) this.instance).addAllAdvices(iterable);
        return this;
    }

    public f0 clearAdvices() {
        copyOnWrite();
        ((ConfigChange) this.instance).clearAdvices();
        return this;
    }

    public f0 clearChangeType() {
        copyOnWrite();
        ((ConfigChange) this.instance).clearChangeType();
        return this;
    }

    public f0 clearElement() {
        copyOnWrite();
        ((ConfigChange) this.instance).clearElement();
        return this;
    }

    public f0 clearNewValue() {
        copyOnWrite();
        ((ConfigChange) this.instance).clearNewValue();
        return this;
    }

    public f0 clearOldValue() {
        copyOnWrite();
        ((ConfigChange) this.instance).clearOldValue();
        return this;
    }

    @Override // kh.g0
    public Advice getAdvices(int i10) {
        return ((ConfigChange) this.instance).getAdvices(i10);
    }

    @Override // kh.g0
    public int getAdvicesCount() {
        return ((ConfigChange) this.instance).getAdvicesCount();
    }

    @Override // kh.g0
    public List<Advice> getAdvicesList() {
        return Collections.unmodifiableList(((ConfigChange) this.instance).getAdvicesList());
    }

    @Override // kh.g0
    public d0 getChangeType() {
        return ((ConfigChange) this.instance).getChangeType();
    }

    @Override // kh.g0
    public int getChangeTypeValue() {
        return ((ConfigChange) this.instance).getChangeTypeValue();
    }

    @Override // kh.g0
    public String getElement() {
        return ((ConfigChange) this.instance).getElement();
    }

    @Override // kh.g0
    public ByteString getElementBytes() {
        return ((ConfigChange) this.instance).getElementBytes();
    }

    @Override // kh.g0
    public String getNewValue() {
        return ((ConfigChange) this.instance).getNewValue();
    }

    @Override // kh.g0
    public ByteString getNewValueBytes() {
        return ((ConfigChange) this.instance).getNewValueBytes();
    }

    @Override // kh.g0
    public String getOldValue() {
        return ((ConfigChange) this.instance).getOldValue();
    }

    @Override // kh.g0
    public ByteString getOldValueBytes() {
        return ((ConfigChange) this.instance).getOldValueBytes();
    }

    public f0 removeAdvices(int i10) {
        copyOnWrite();
        ((ConfigChange) this.instance).removeAdvices(i10);
        return this;
    }

    public f0 setAdvices(int i10, Advice advice) {
        copyOnWrite();
        ((ConfigChange) this.instance).setAdvices(i10, advice);
        return this;
    }

    public f0 setChangeType(d0 d0Var) {
        copyOnWrite();
        ((ConfigChange) this.instance).setChangeType(d0Var);
        return this;
    }

    public f0 setChangeTypeValue(int i10) {
        copyOnWrite();
        ((ConfigChange) this.instance).setChangeTypeValue(i10);
        return this;
    }

    public f0 setElement(String str) {
        copyOnWrite();
        ((ConfigChange) this.instance).setElement(str);
        return this;
    }

    public f0 setElementBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ConfigChange) this.instance).setElementBytes(byteString);
        return this;
    }

    public f0 setNewValue(String str) {
        copyOnWrite();
        ((ConfigChange) this.instance).setNewValue(str);
        return this;
    }

    public f0 setNewValueBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ConfigChange) this.instance).setNewValueBytes(byteString);
        return this;
    }

    public f0 setOldValue(String str) {
        copyOnWrite();
        ((ConfigChange) this.instance).setOldValue(str);
        return this;
    }

    public f0 setOldValueBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ConfigChange) this.instance).setOldValueBytes(byteString);
        return this;
    }

    public f0 addAdvices(int i10, Advice advice) {
        copyOnWrite();
        ((ConfigChange) this.instance).addAdvices(i10, advice);
        return this;
    }

    public f0 setAdvices(int i10, b bVar) {
        copyOnWrite();
        ((ConfigChange) this.instance).setAdvices(i10, (Advice) bVar.build());
        return this;
    }

    public f0 addAdvices(b bVar) {
        copyOnWrite();
        ((ConfigChange) this.instance).addAdvices((Advice) bVar.build());
        return this;
    }

    public f0 addAdvices(int i10, b bVar) {
        copyOnWrite();
        ((ConfigChange) this.instance).addAdvices(i10, (Advice) bVar.build());
        return this;
    }
}
