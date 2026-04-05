package jk;

import bi.c;
import bi.j;
import bk.g;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a implements j {
    @Override // bi.j
    public List<c> processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (c cVarWithFactory : componentRegistrar.getComponents()) {
            String name = cVarWithFactory.getName();
            if (name != null) {
                cVarWithFactory = cVarWithFactory.withFactory(new g(name, cVarWithFactory, 1));
            }
            arrayList.add(cVarWithFactory);
        }
        return arrayList;
    }
}
