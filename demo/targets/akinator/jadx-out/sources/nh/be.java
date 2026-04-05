package nh;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class be implements td {
    @Override // nh.td
    public boolean equals(Object obj) {
        if (obj instanceof td) {
            td tdVar = (td) obj;
            if (getCount() == tdVar.getCount() && Objects.equals(getElement(), tdVar.getElement())) {
                return true;
            }
        }
        return false;
    }

    @Override // nh.td
    public abstract /* synthetic */ int getCount();

    @Override // nh.td
    public abstract /* synthetic */ Object getElement();

    @Override // nh.td
    public int hashCode() {
        Object element = getElement();
        return (element == null ? 0 : element.hashCode()) ^ getCount();
    }

    @Override // nh.td
    public String toString() {
        String strValueOf = String.valueOf(getElement());
        int count = getCount();
        return count == 1 ? strValueOf : j1.o2.g(count, strValueOf, " x ");
    }
}
