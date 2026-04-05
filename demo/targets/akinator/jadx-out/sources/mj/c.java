package mj;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public int compare(e eVar, e eVar2) {
        if (eVar.getDesiredHeight() > eVar2.getDesiredHeight()) {
            return -1;
        }
        return eVar.getDesiredHeight() < eVar2.getDesiredHeight() ? 1 : 0;
    }
}
