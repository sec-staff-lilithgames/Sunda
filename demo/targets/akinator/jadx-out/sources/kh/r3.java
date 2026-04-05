package kh;

import com.google.api.ProjectProperties;
import com.google.api.Property;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r3 extends GeneratedMessageLite.Builder implements s3 {
    public r3 addAllProperties(Iterable<? extends Property> iterable) {
        copyOnWrite();
        ((ProjectProperties) this.instance).addAllProperties(iterable);
        return this;
    }

    public r3 addProperties(Property property) {
        copyOnWrite();
        ((ProjectProperties) this.instance).addProperties(property);
        return this;
    }

    public r3 clearProperties() {
        copyOnWrite();
        ((ProjectProperties) this.instance).clearProperties();
        return this;
    }

    @Override // kh.s3
    public Property getProperties(int i10) {
        return ((ProjectProperties) this.instance).getProperties(i10);
    }

    @Override // kh.s3
    public int getPropertiesCount() {
        return ((ProjectProperties) this.instance).getPropertiesCount();
    }

    @Override // kh.s3
    public List<Property> getPropertiesList() {
        return Collections.unmodifiableList(((ProjectProperties) this.instance).getPropertiesList());
    }

    public r3 removeProperties(int i10) {
        copyOnWrite();
        ((ProjectProperties) this.instance).removeProperties(i10);
        return this;
    }

    public r3 setProperties(int i10, Property property) {
        copyOnWrite();
        ((ProjectProperties) this.instance).setProperties(i10, property);
        return this;
    }

    public r3 addProperties(int i10, Property property) {
        copyOnWrite();
        ((ProjectProperties) this.instance).addProperties(i10, property);
        return this;
    }

    public r3 setProperties(int i10, u3 u3Var) {
        copyOnWrite();
        ((ProjectProperties) this.instance).setProperties(i10, (Property) u3Var.build());
        return this;
    }

    public r3 addProperties(u3 u3Var) {
        copyOnWrite();
        ((ProjectProperties) this.instance).addProperties((Property) u3Var.build());
        return this;
    }

    public r3 addProperties(int i10, u3 u3Var) {
        copyOnWrite();
        ((ProjectProperties) this.instance).addProperties(i10, (Property) u3Var.build());
        return this;
    }
}
